package com.example.lab.data

import kotlinx.coroutines.delay

object ApiClient {
    suspend fun fetchUser(): User {
        delay(1500)
        return User.fromEmail("guest@system.local")
    }
}
