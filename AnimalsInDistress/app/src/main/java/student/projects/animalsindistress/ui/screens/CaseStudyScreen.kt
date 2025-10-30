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
fun CaseStudyScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Case Study",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = "Breaking Barriers For Animals In Diepsloot Extensions",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(Modifier.height(12.dp))
        SectionTitle("About Diepsloot")
        Paragraph("A densely populated township in Gauteng, South Africa with a conservatively estimated population of between 350,000 and 400,000 people, living in a district divided into \"12 extensions\".")
        Paragraph("The Society has been serving the population of Diepsloot for 17 years.")
        Paragraph("It is made up of brick houses built by landowners, a mix of public housing blocks, and shacks made of corrugated iron and plastic lining. Residents reliant on outbuildings for sanitation.")

        Spacer(Modifier.height(12.dp))
        SectionTitle("Community Structure")
        Bullet("45.5% of residents rent their property from a landowner who has subdivided their land")
        Bullet("While the main road is paved, the side streets are gravel, ditches, and stagnant waste. The informal streets are a maze")
        Bullet("The township is surrounded by open fields and farms, while the closest neighbourhoods are wealthy gated communities")

        Spacer(Modifier.height(12.dp))
        SectionTitle("The Problem")
        Paragraph("The problem in Diepsloot was the critical need for veterinary care at the outset, confirmed by veterinary intervention needs assessments conducted by SAID veterinary professionals, engaged potential collaborators, and connected community actors to evaluate approaches.")
        Paragraph("Maintaining dog population size and demography in balance with human ideals with aims including reducing the number of unwanted dogs, keeping wanted dogs in a good state of health and welfare, and minimising risks presented by dogs to public health and other animals.")
        Bullet("Findings exposed thin, free-roaming, and hungry dogs and cats with ticks, uncontrolled breeding, unhealthy and unsafe environments, untreated injuries, prevalence of infectious diseases, most not immunised by vaccination. High numbers of free-roaming dogs a concern.")

        Spacer(Modifier.height(12.dp))
        SectionTitle("Targets and Guidance")
        Bullet("70% vaccination coverage is feasible but challenging (OIE guidance)")
        Bullet("Female sterilisation target often cited at 70%–83% for population reduction")

        Spacer(Modifier.height(12.dp))
        SectionTitle("Success Indicators")
        Bullet("Increased improved ownership and collaboration")
        Bullet("Owner engagement in the intervention")
        Bullet("Increase in voluntary hospital visits and responsibility donations")
        Bullet("Improved perceptions of veterinary interventions and collaboration")

        Spacer(Modifier.height(12.dp))
        SectionTitle("Conclusion")
        Paragraph("The Society for Animals in Distress programmes have demonstrated that strategically targeted animal health, social interventions and partner funding can make a big impact. The programme is part of a continuing process promoting best practices, transparency, and capacity of Veterinary Services to address animal health, welfare and public health problems.")
    }
}

@Composable private fun SectionTitle(text: String) {
    Text(text = text, style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(bottom = 4.dp))
}

@Composable private fun Paragraph(text: String) {
    Text(text = text, style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(top = 4.dp))
}

@Composable private fun Bullet(text: String) {
    Text(text = "• $text", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(top = 2.dp))
}


