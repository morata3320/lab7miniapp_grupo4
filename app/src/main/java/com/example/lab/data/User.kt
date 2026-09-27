package com.example.lab.data

data class User private constructor(
    val id: String,
    val email: String
) {
    companion object {
        fun fromEmail(email: String): User {
            require(email.contains("@")) { "Email inválido" }
            val normalized = email.trim().lowercase()

            return User(
                id = "user_${System.currentTimeMillis()}",
                email = normalized
            )
        }
    }
}
