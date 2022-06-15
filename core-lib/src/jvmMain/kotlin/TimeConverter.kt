package me.ikupriyanov.corelib

actual object TimeConverter {
    actual fun asEpochMillis(v: Any): Long? {
        return if (v.javaClass.name.startsWith("kotlinx.datetime.")) {
            when (v) {
                //is kotlinx.datetime.Instant -> v.toEpochMilliseconds()
                else -> null
            }
        } else {
            null
        }
    }
}