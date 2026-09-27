package com.example.lab.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab.data.User

@Composable
fun UserScreen(state: UiState) {
    when (state) {
        is UiState.Loading -> LoadingView()
        is UiState.Success -> UserView(state.user)
        is UiState.Error -> ErrorView(state.message)
        is UiState.Empty -> EmptyView()
    }
}

@Composable
fun LoadingView() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun UserView(user: User) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Usuario cargado:")
        Spacer(Modifier.height(8.dp))
        Text("ID: ${user.id}")
        Text("Email: ${user.email}")
    }
}

@Composable
fun ErrorView(message: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Error: $message")
    }
}

@Composable
fun EmptyView() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("No hay usuario disponible (invitado)")
    }
}
