package com.example.appkotlinmultipatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform