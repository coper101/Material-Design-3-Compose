package com.darealreally.material3demo.ui.components.buttons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darealreally.material3demo.ui.theme.Material3DemoTheme
import kotlinx.coroutines.flow.collect

// FABs
@Composable
fun FloatingActionButtons() {

    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Surface
        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Primary
        FloatingActionButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Secondary
        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Tertiary
        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }
    }
}

// Large  FABs
@Composable
fun LargeFloatingActionButtons() {

    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Surface
        LargeFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Primary
        LargeFloatingActionButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Secondary
        LargeFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Tertiary
        LargeFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }
    }
}

// Small FABs
@Composable
fun SmallFloatingActionButtons() {

    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Surface
        SmallFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Primary
        SmallFloatingActionButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Secondary
        SmallFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }

        // Tertiary
        SmallFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit"
            )
        }
    }
}

// Extended FABs
@Composable
fun ExtendedFloatingActionButtons() {
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
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Surface
        ExtendedFloatingActionButton(
            interactionSource = interactionSource,
            text = { Text(title) },
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.surface,
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "Edit"
                )
            }
        )

        // Primary
        ExtendedFloatingActionButton(
            interactionSource = interactionSource,
            text = { Text(title) },
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "Edit"
                )
            }
        )

        // Secondary
        ExtendedFloatingActionButton(
            interactionSource = interactionSource,
            text = { Text(title) },
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "Edit"
                )
            }
        )

        // Tertiary
        ExtendedFloatingActionButton(
            interactionSource = interactionSource,
            text = { Text(title) },
            onClick = { /*TODO*/ },
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "Edit"
                )
            }
        )
    }
}

/**
 * Preview Section
 */
// FABs
@Preview(name = "Medium")
@Composable
fun FABPreview() {
    Material3DemoTheme {
        FloatingActionButtons()
    }
}

@Preview(name = "Medium (Dark)")
@Preview
@Composable
fun FABDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        FloatingActionButtons()
    }
}

@Preview(name = "Large)")
@Composable
fun FABLargePreview() {
    Material3DemoTheme {
        FloatingActionButtons()
    }
}

@Preview(name = "Large (Dark)")
@Composable
fun FABLargeDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        FloatingActionButtons()
    }
}

@Preview(name = "Small")
@Composable
fun FABSmallPreview() {
    Material3DemoTheme {
        FloatingActionButtons()
    }
}

@Preview(name = "Small (Dark)")
@Preview
@Composable
fun FABSmallDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        FloatingActionButtons()
    }
}

// Extended FABs
@Preview(name = "Extended FAB")
@Composable
fun ExtendedFABsPreview() {
    Material3DemoTheme {
        ExtendedFloatingActionButtons()
    }
}

@Preview(name = "Extended FAB (Dark)")
@Composable
fun ExtendedFABsDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        ExtendedFloatingActionButtons()
    }
}