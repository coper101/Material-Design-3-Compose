package com.darealreally.material3demo.ui.components.buttons

import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darealreally.material3demo.ui.theme.Material3DemoTheme
import kotlinx.coroutines.flow.collect

/**
 * Material Design Buttons
 */
@Composable
fun Buttons(
) {
    // State
    val interactionSource = MutableInteractionSource()
    var title by remember { mutableStateOf("Enabled") }

    // Side Effect
    LaunchedEffect(Unit) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> {
                    title = "Pressed"
                }
                is PressInteraction.Release -> {
                    title = "Enabled"
                }
            }
        }
    }

    // UI
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        // Filled Button
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            ButtonLabel("Filled button")

            Button(
                interactionSource = interactionSource,
                onClick = { /*TODO*/ }
            ) {
                Text(title)
            }
        }

        // Outlined Button
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            ButtonLabel("Outlined button")

            OutlinedButton(
                interactionSource = interactionSource,
                onClick = { /*TODO*/ }
            ) {
                Text(title)
            }
        }

        // Text Button
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            ButtonLabel("Text button")

            TextButton(
                interactionSource = interactionSource,
                onClick = { /*TODO*/ }
            ) {
                Text(title)
            }
        }

        // Elevated Button
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            ButtonLabel("Elevated button")

            ElevatedButton(
                interactionSource = interactionSource,
                onClick = { /*TODO*/ }
            ) {
                Text(title)
            }
        }
    }
}

@Composable
fun ButtonLabel(
    title: String
) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelMedium,
        color = contentColorFor(backgroundColor = MaterialTheme.colorScheme.background)
    )
}

/**
 * Preview Section
 */
@Preview
@Composable
fun ButtonsPreview() {
    Material3DemoTheme {
        Buttons()
    }
}

@Preview
@Composable
fun ButtonsDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        Buttons()
    }
}