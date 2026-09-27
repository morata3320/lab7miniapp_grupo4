package com.example.lab

fun clasificarIMC(peso: Double, altura: Double): String {
    if (peso <= 0.0 || altura <= 0.0) {
        return "Valores inválidos"
    }
    val imc = peso / (altura * altura)
    return when {
        imc < 18.5 -> "Bajo peso"
        imc in 18.5..24.99 -> "Peso normal"
        imc in 25.0..29.99 -> "Sobrepeso"
        else -> "Obesidad"
    }
}
