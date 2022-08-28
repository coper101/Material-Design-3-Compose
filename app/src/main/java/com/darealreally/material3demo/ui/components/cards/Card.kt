package com.darealreally.material3demo.ui.components.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darealreally.material3demo.ui.theme.Material3DemoTheme

// Not yet available in Material 3
@Composable
fun Cards() {

    // UI
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        // TODO:
    }

}

/**
 * Preview Section
 */
@Preview
@Composable
fun CardsPreview() {
    Material3DemoTheme {
        Cards()
    }
}

@Preview
@Composable
fun CardsDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        Cards()
    }
}