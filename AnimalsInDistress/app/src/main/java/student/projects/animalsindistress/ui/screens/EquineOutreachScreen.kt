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
fun EquineOutreachScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Hope for Horses",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = "Transforming Lives in Tembisa's Coal Yards",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(Modifier.height(12.dp))
        Text(text = "How We Make a Difference", style = MaterialTheme.typography.titleMedium)
        Text(text = "• Shelter for coal yard horses", style = MaterialTheme.typography.bodyMedium)
        Text(text = "• Healthcare: farrier, dental, deworming, vaccinations", style = MaterialTheme.typography.bodyMedium)
        Text(text = "• Rehabilitation at SAID facility", style = MaterialTheme.typography.bodyMedium)
        Text(text = "• Education on humane tack and basic care", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(12.dp))
        Text(text = "How You Can Help", style = MaterialTheme.typography.titleMedium)
        Text(text = "• Donate to enable care and shelter", style = MaterialTheme.typography.bodyMedium)
        Text(text = "• Volunteer your time", style = MaterialTheme.typography.bodyMedium)
        Text(text = "• Spread the word", style = MaterialTheme.typography.bodyMedium)
    }
}


