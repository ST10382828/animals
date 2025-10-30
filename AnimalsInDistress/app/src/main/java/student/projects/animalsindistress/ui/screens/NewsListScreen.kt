package student.projects.animalsindistress.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class NewsItem(val slug: String, val title: String, val date: String)

@Composable
fun NewsListScreen(onOpen: (String) -> Unit) {
    val items = sampleNews
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "News",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(16.dp)
        )
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(items) { item ->
                Column(
                    modifier = Modifier
                        .clickable { onOpen(item.slug) }
                        .padding(horizontal = 16.dp, vertical = 12.dp)
                ) {
                    Text(text = item.title, style = MaterialTheme.typography.titleMedium)
                    Text(text = item.date, style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}

private val sampleNews = listOf(
    NewsItem(slug = "2021-07-21", title = "Three dogs killed, others rescued", date = "21 July 2021"),
    NewsItem(slug = "2021-06-29", title = "Appointment of new general manager", date = "29 June 2021")
)



