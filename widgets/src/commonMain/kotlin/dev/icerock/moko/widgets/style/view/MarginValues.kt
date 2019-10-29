/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.widgets.style.view

/**
 * Margin values
 */
data class MarginValues(
    val start: Float = 0.0F,
    val top: Float = 0.0F,
    val end: Float = 0.0F,
    val bottom: Float = 0.0F
) {
    constructor(marginAll: Float) : this(marginAll, marginAll, marginAll, marginAll)
}