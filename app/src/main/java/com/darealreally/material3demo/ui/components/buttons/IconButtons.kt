package com.darealreally.material3demo.ui.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darealreally.material3demo.ui.theme.Material3DemoTheme

@Composable
fun IconButtons() {

    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        // Icon
        IconButton(
            modifier = Modifier.clip(CircleShape),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = "Settings",
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Filled
        IconButton(
            modifier = Modifier
                .background(
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.primary,
                )
                .clip(CircleShape),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = "Settings",
                tint = contentColorFor(
                    backgroundColor = MaterialTheme.colorScheme.primary
                )
            )
        }

        // Tonal
        IconButton(
            modifier = Modifier
                .background(
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.secondaryContainer,
                )
                .clip(CircleShape),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = "Settings",
                tint = contentColorFor(
                    backgroundColor = MaterialTheme.colorScheme.secondaryContainer
                )
            )
        }

        // Outlined
        IconButton(
            modifier = Modifier
                .border(
                    shape = CircleShape,
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline
                )
                .clip(CircleShape),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = "Settings",
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

    }

}

/**
 * Preview Section
 */
@Preview
@Composable
fun IconButtonsPreview() {
    Material3DemoTheme {
        IconButtons()
    }
}

@Preview
@Composable
fun IconButtonsDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        IconButtons()
    }
}