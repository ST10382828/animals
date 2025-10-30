package student.projects.animalsindistress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import student.projects.animalsindistress.ui.theme.AnimalsInDistressTheme
import student.projects.animalsindistress.navigation.AppNavHost
import student.projects.animalsindistress.ui.components.Footer
import student.projects.animalsindistress.ui.components.Header

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnimalsInDistressTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        Header { route ->
                            navController.navigate(route)
                        }
                    },
                    bottomBar = { Footer() }
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        AppNavHost(navController = navController)
                    }
                }
            }
        }
    }
}