package com.example.flightinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.flightinfo.ui.FlightCards
import net.skyscanner.backpack.compose.theme.BpkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BpkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    FlightCards(
                        flightNumber = "BA 249",
                        departureAirport = "LHR",
                        departureTime = "09:45",
                        arrivalAirport = "JFK",
                        arrivalTime = "12:15"
                    )
                }
            }
        }
    }
}