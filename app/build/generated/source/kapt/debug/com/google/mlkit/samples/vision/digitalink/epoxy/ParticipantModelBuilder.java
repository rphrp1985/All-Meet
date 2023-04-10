package com.google.mlkit.samples.vision.digitalink.epoxy;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyBuildScope;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.sendbird.calls.Participant;
import java.lang.CharSequence;
import java.lang.Number;

@EpoxyBuildScope
public interface ParticipantModelBuilder {
  ParticipantModelBuilder onBind(
      OnModelBoundListener<ParticipantModel_, ParticipantModel.Holder> listener);

  ParticipantModelBuilder onUnbind(
      OnModelUnboundListener<ParticipantModel_, ParticipantModel.Holder> listener);

  ParticipantModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ParticipantModel_, ParticipantModel.Holder> listener);

  ParticipantModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ParticipantModel_, ParticipantModel.Holder> listener);

  ParticipantModelBuilder participant(Participant participant);

  ParticipantModelBuilder height(int height);

  ParticipantModelBuilder width(int width);

  ParticipantModelBuilder id(long id);

  ParticipantModelBuilder id(@Nullable Number... ids);

  ParticipantModelBuilder id(long id1, long id2);

  ParticipantModelBuilder id(@Nullable CharSequence key);

  ParticipantModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  ParticipantModelBuilder id(@Nullable CharSequence key, long id);

  ParticipantModelBuilder layout(@LayoutRes int layoutRes);

  ParticipantModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
