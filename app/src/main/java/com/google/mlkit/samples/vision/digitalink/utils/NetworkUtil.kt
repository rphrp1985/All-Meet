//package com.google.mlkit.samples.vision.digitalink.utils
//
//import android.R
//import android.widget.TextView
////import com.android.volley.RequestQueue
//import com.sendbird.android.constant.StringSet.url
//
//
//class NetworkUtil {
//    fun postaudio(){
//        val headers: MutableMap<String, String> = HashMap()
//        headers["Content-Type"] = "application/json"
//        val queue: RequestQueue = Volley.newRequestQueue(this)
//
//        val gsonRequest: GsonRequest<Array<Routine>> =
//            GsonRequest<Array<Routine>>(Request.Method.POST, url,
//                Array<Routine>::class.java, headers, object : Listener<Array<Routine?>?>() {
//                    fun onResponse(routineData: Array<Routine>) {
//                        val serverData = findViewById(R.id.serverData) as TextView
//                        var complete = ""
//                        var repeat = ""
//                        var hold = ""
//                        var perform = ""
//                        var txtData = ""
//                        for (i in routineData.indices) {
//                            complete =
//                                if (routineData[i].instructions.complete != null) "Complete: " + routineData[i].instructions.complete else ""
//                            repeat =
//                                if (routineData[i].instructions.repeat != null) "Repeat: " + routineData[i].instructions.repeat else ""
//                            hold =
//                                if (routineData[i].instructions.hold != null) "Hold: " + routineData[i].instructions.hold else ""
//                            perform =
//                                if (routineData[i].instructions.perform != null) "Perform: " + routineData[i].instructions.perform else ""
//                            txtData += "DESCRIPTION: " + routineData[i].description.get(0) + ": " + routineData[i].description.get(
//                                1
//                            ) + ", " + complete + ", " + repeat + ", " + hold + ", " + perform + " "
//                        }
//                        serverData.text = "Response: $txtData"
//                    }
//                }, object : ErrorListener() {
//                    fun onErrorResponse(volleyError: VolleyError) {
//                        val serverData = findViewById(R.id.serverData) as TextView
//                        serverData.text = "Response: " + volleyError.toString()
//                    }
//                }, jsonBody
//            )
//        queue.add(gsonRequest)
//    }
//}