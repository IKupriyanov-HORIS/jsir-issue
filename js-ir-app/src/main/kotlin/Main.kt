/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLButtonElement
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    window.onload = { createContent() }
}

fun createContent() {
    val contentDiv = document.getElementById("content")
    contentDiv?.appendChild(document.createTextNode(me.ikupriyanov.corelib.Hello.say()))
}

