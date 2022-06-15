package me.ikupriyanov.corelib

expect object TimeConverter {
    fun asEpochMillis(v: Any): Long?
}