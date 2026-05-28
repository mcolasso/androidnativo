package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // A Column já garante o alinhamento à direita (End) e no meio (Center)
            Column(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {
                // Estado compartilhado (iniciando vazio para ficar melhor na tela)
                var vlrDoTextField by remember { mutableStateOf("") }

                // Nomes importantes na história do computador (incluindo mulheres)
                Text("Radia Perlman")
                Text("Vint Cerf")
                Text("Hedy Lamarr")
                Text("Tim Berners-Lee")
                Text("Evelyn Boyd Granville")

                // Campos de texto replicados
                TextField(vlrDoTextField, {
                    vlrDoTextField = it
                })

                OutlinedTextField(vlrDoTextField, {
                    Log.i("###", it) // Mantive o seu Log!
                    vlrDoTextField = it
                })
            }
        }
    }
}
