@file:Suppress("DEPRECATION")

package com.google.mlkit.samples.vision.digitalink.epoxy

import com.airbnb.epoxy.ModelCollector
import kotlin.Suppress
import kotlin.Unit

public inline fun ModelCollector.participant(modelInitializer: ParticipantModelBuilder.() -> Unit):
    Unit {
  add(
  ParticipantModel_().apply {
    modelInitializer()
  }
  )
}
