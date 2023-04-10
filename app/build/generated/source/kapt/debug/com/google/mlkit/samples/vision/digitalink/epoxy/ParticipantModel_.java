package com.google.mlkit.samples.vision.digitalink.epoxy;

import android.view.ViewParent;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.sendbird.calls.Participant;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Generated file. Do not modify!
 */
public class ParticipantModel_ extends ParticipantModel implements GeneratedModel<ParticipantModel.Holder>, ParticipantModelBuilder {
  private OnModelBoundListener<ParticipantModel_, ParticipantModel.Holder> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<ParticipantModel_, ParticipantModel.Holder> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<ParticipantModel_, ParticipantModel.Holder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<ParticipantModel_, ParticipantModel.Holder> onModelVisibilityChangedListener_epoxyGeneratedModel;

  public ParticipantModel_() {
    super();
  }

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final ParticipantModel.Holder object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void handlePostBind(final ParticipantModel.Holder object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public ParticipantModel_ onBind(
      OnModelBoundListener<ParticipantModel_, ParticipantModel.Holder> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(ParticipantModel.Holder object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public ParticipantModel_ onUnbind(
      OnModelUnboundListener<ParticipantModel_, ParticipantModel.Holder> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final ParticipantModel.Holder object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public ParticipantModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ParticipantModel_, ParticipantModel.Holder> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final ParticipantModel.Holder object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public ParticipantModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<ParticipantModel_, ParticipantModel.Holder> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public ParticipantModel_ participant(Participant participant) {
    onMutation();
    super.participant = participant;
    return this;
  }

  public Participant participant() {
    return participant;
  }

  public ParticipantModel_ height(int height) {
    onMutation();
    super.setHeight(height);
    return this;
  }

  public int height() {
    return super.getHeight();
  }

  public ParticipantModel_ width(int width) {
    onMutation();
    super.setWidth(width);
    return this;
  }

  public int width() {
    return super.getWidth();
  }

  @Override
  public ParticipantModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public ParticipantModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public ParticipantModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public ParticipantModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public ParticipantModel_ id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public ParticipantModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public ParticipantModel_ layout(@LayoutRes int layoutRes) {
    super.layout(layoutRes);
    return this;
  }

  @Override
  public ParticipantModel_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public ParticipantModel_ show() {
    super.show();
    return this;
  }

  @Override
  public ParticipantModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public ParticipantModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  protected ParticipantModel.Holder createNewHolder(ViewParent parent) {
    return new ParticipantModel.Holder();
  }

  @Override
  public ParticipantModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    super.participant = null;
    super.setHeight(0);
    super.setWidth(0);
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ParticipantModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ParticipantModel_ that = (ParticipantModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((participant != null ? !participant.equals(that.participant) : that.participant != null)) {
      return false;
    }
    if ((getHeight() != that.getHeight())) {
      return false;
    }
    if ((getWidth() != that.getWidth())) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (participant != null ? participant.hashCode() : 0);
    _result = 31 * _result + getHeight();
    _result = 31 * _result + getWidth();
    return _result;
  }

  @Override
  public String toString() {
    return "ParticipantModel_{" +
        "participant=" + participant +
        ", height=" + getHeight() +
        ", width=" + getWidth() +
        "}" + super.toString();
  }
}
