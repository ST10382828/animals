package student.projects.animalsindistress.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TeamScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Meet The Team",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(12.dp))
        Text(text = "Meg Harvey — CEO/Board Member", style = MaterialTheme.typography.titleMedium)
        Text(text = "Meg has been involved in animal welfare for over a decade with an undeniable passion for animals.", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(8.dp))
        Text(text = "Dr Isabel Meyer — Board Member", style = MaterialTheme.typography.titleMedium)
        Text(text = "Systems researcher and veterinarian; creates opportunities for student research on animal health and welfare systems.", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(8.dp))
        Text(text = "Andrew Fairlie — Board Member", style = MaterialTheme.typography.titleMedium)
        Text(text = "Treasurer since 2019; Associate Member of CIMA and Professional Accountant (SA) with strategy and financial management expertise.", style = MaterialTheme.typography.bodyMedium)
    }
}


