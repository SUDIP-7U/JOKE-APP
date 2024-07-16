package com.example.jokingapplication

data class ResponseJokes(
    val category: String?,
    val delivery: String?,
    val error: Boolean?,
    val flags: Flags?,
    val id: Int?,
    val lang: String?,
    val safe: Boolean?,
    val setup: String?,
    val type: String?
)