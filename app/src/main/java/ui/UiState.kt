package com.example.lab.ui

import com.example.lab.data.User

sealed class UiState {
    data object Loading : UiState()
    data class Success(val user: User) : UiState()
    data class Error(val message: String) : UiState()
    data object Empty : UiState()
}