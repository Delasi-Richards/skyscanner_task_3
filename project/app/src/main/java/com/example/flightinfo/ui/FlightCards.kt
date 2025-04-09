package com.example.flightinfo.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.skyscanner.backpack.compose.card.BpkCard
import net.skyscanner.backpack.compose.text.BpkText
import net.skyscanner.backpack.compose.theme.BpkTheme
import net.skyscanner.backpack.compose.tokens.BpkSpacing

@Composable
fun FlightCards(
    flightNumber: String,
    departureAirport: String,
    departureTime: String,
    arrivalAirport: String,
    arrivalTime: String
) {
    Column(
        modifier = Modifier
            .padding(BpkSpacing.Base)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(BpkSpacing.Base)
    ) {
        FlightInfoCard(flightNumber)
        DepartureCard(departureAirport, departureTime)
        ArrivalCard(arrivalAirport, arrivalTime)
    }
}

@Composable
private fun FlightInfoCard(flightNumber: String) {
    BpkCard(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(BpkSpacing.Base)
        ) {
            BpkText(
                text = "Flight Number",
                style = BpkTheme.typography.label,
                color = BpkTheme.colors.textSecondary
            )
            BpkText(
                text = flightNumber,
                style = BpkTheme.typography.heading3,
                modifier = Modifier.padding(top = BpkSpacing.Sm)
            )
        }
    }
}

@Composable
private fun DepartureCard(airportCode: String, time: String) {
    AirportCard(
        title = "Departure",
        airportCode = airportCode,
        time = time,
        color = BpkTheme.colors.statusSuccess
    )
}

@Composable
private fun ArrivalCard(airportCode: String, time: String) {
    AirportCard(
        title = "Arrival",
        airportCode = airportCode,
        time = time,
        color = BpkTheme.colors.statusWarning
    )
}

@Composable
private fun AirportCard(title: String, airportCode: String, time: String, color: Long) {
    BpkCard(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .padding(BpkSpacing.Base)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                BpkText(
                    text = title,
                    style = BpkTheme.typography.label,
                    color = BpkTheme.colors.textSecondary
                )
                BpkText(
                    text = airportCode,
                    style = BpkTheme.typography.heading3,
                    color = color,
                    modifier = Modifier.padding(top = BpkSpacing.Sm)
                )
            }
            BpkText(
                text = time,
                style = BpkTheme.typography.heading2,
                color = BpkTheme.colors.textPrimary
            )
        }
    }
}