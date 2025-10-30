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
fun DancingDonkeyScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "The Dancing Donkey",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(8.dp))
        Text(text = "Our farm party venue is all about fun, laughter, and a little animal magic!", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(12.dp))
        Text(text = "What's Included (R5000)", style = MaterialTheme.typography.titleMedium)
        Bullet("Venue hire (3 hours)")
        Bullet("A stick waffle, hotdog, and slush puppy for each child")
        Bullet("Access to a jumping castle, jungle gym, and friendly farm animals")
        Bullet("Maximum of 15 kids per party")
        Spacer(Modifier.height(12.dp))
        Text(text = "Party Times", style = MaterialTheme.typography.titleMedium)
        Bullet("Saturdays and Sundays")
        Bullet("Morning slot: 10:00 – 13:00")
        Bullet("Afternoon slot: 14:00 – 17:00")
        Spacer(Modifier.height(12.dp))
        Text(text = "Extras for Guests", style = MaterialTheme.typography.titleMedium)
        Bullet("Tuck Shop with sweet treats for sale")
        Bullet("Freshly brewed coffee available for parents and adults")
        Spacer(Modifier.height(12.dp))
        Text(text = "Booking Information", style = MaterialTheme.typography.titleMedium)
        Bullet("Booking is essential")
        Bullet("50% deposit secures your spot")
        Bullet("Balance due before the party date")
    }
}

@Composable private fun Bullet(text: String) {
    Text(text = "• $text", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(top = 2.dp))
}


