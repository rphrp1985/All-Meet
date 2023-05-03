# python -m flask --app speechapi run --host=0.0.0.0
import os
import io
from flask import Flask, flash, request, redirect, url_for
from flask_restful import Resource, Api
from werkzeug.utils import secure_filename
import speech_recognition as sr
import subprocess
import os
import requests
import random
# from pydub import AudioSegment
from pydub import AudioSegment
# from flask_socketio import SocketIO, send, emit

UPLOAD_FOLDER = '/files'
ALLOWED_EXTENSIONS = {'txt', 'pdf', 'png', 'jpg', 'jpeg', 'gif', 'ogg', 'mp3', 'wav'}

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER

api = Api(app)


class FileHandler(Resource):

    def recognize(file_name):
        r = sr.Recognizer()
        with sr.AudioFile(file_name) as source:
   
          audio_data = r.record(source)
   
          text = r.recognize_google(audio_data)
          print(text)
          return text

    def allowed_file(self, filename):
        return '.' in filename and \
            filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

    def post(self):
        print('inside post')

        file_ext = request.headers.get('Content-Type').rsplit('/', 1)[1].lower()

        x=request.form.get("file")
        print(x)   
        url = x
        r_name = str(random.randint(100,100000000))
        r= requests.get(url, allow_redirects=True)
        temp=  r_name+'.ogg'
        open(temp, 'wb').write(r.content)
    
        wav_audio = AudioSegment.from_file(temp, format="ogg")
        wav_audio.export(r_name+".wav", format="wav")
        temp2= str(r_name +".wav")
        try:
         r = sr.Recognizer()
         with sr.AudioFile(temp2) as source:
   
           audio_data = r.record(source)
   
           text = r.recognize_google(audio_data)
        #    print(text)
           
        except:
            text = ""
        
        print(text)
        # Remove the asudio file
        os.remove(r_name+".wav")
        os.remove(temp)

        return text
    
class Talks(Resource):
   room_dict = {}
   def post(self):
      print("inside talks post")
      user=request.form.get("user_name")
      text = request.form.get("text")
      text = str(text)

    #   text.replace("\""," ")
    #   text.trim()
      room = request.form.get("room")
      print(room)
      # print(user+": "+text)
      
      text2= ""

      try:
         text2 = self.room_dict[room]
      except:
         text2 = ""

      if len(str(text))>2:
         text2+=(str(user+" : "+text+" ~ "))

      print(text2)
      
      self.room_dict[room] = text2
      return text2




api.add_resource(FileHandler, "/speech")
api.add_resource(Talks, "/talks")


app.run()

