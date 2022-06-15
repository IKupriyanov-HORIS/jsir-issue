import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    window.onload = { createContent() }
}

fun createContent() {
    val contentDiv = document.getElementById("content")
    contentDiv?.appendChild(document.createTextNode(me.ikupriyanov.corelib.Hello.say()))
}

