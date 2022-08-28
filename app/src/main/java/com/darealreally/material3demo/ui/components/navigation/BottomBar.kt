package com.darealreally.material3demo.ui.components.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darealreally.material3demo.ui.theme.Material3DemoTheme

val TriangleShape =
    GenericShape { (width, height), _ ->
        moveTo(x = width * 0.5F, 0F)
        lineTo(x = width, height)
        lineTo(x = 0F, height)
    }

val PentagonShape =
    GenericShape { (width, height), _ ->
        moveTo(x = 0F, height * 0.43F)
        lineTo(x = width * 0.5F, 0F)
        lineTo(x = width, height * 0.43F)
        lineTo(x = width * 0.8F, height)
        lineTo(x = width * 0.2F, height)
        lineTo(x = 0F, height * 0.43F)
    }

@Composable
fun BottomAppBar() {
    NavigationBar {
        NavigationBarItem(
            icon = {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .background(color = MaterialTheme.colorScheme.onSurfaceVariant)
                )
            },
            selected = false,
            onClick = { /*TODO*/ }
        )

        NavigationBarItem(
            icon = {
                Box(
                    modifier = Modifier
                        .size(width = 14.dp, height = 12.dp)
                        .clip(TriangleShape)
                        .background(color = MaterialTheme.colorScheme.onSurfaceVariant)
                )
            },
            selected = false,
            onClick = { /*TODO*/ }
        )

        NavigationBarItem(
            icon = {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(RectangleShape)
                        .background(color = MaterialTheme.colorScheme.onSurfaceVariant)
                )
            },
            selected = false,
            onClick = { /*TODO*/ }
        )

        NavigationBarItem(
            icon = {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(PentagonShape)
                        .background(color = MaterialTheme.colorScheme.onSurfaceVariant)
                )
            },
            selected = false,
            onClick = { /*TODO*/ }
        )

        Spacer(modifier = Modifier.width(40.dp))

        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(end = 16.dp),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "Add"
            )
        }
    }
}

/**
 * Preview Section
 */
@Preview(name = "Light")
@Composable
fun BottomAppBarsPreview() {
    Material3DemoTheme {
        BottomAppBar()
    }
}

@Preview(name = "Dark")
@Composable
fun BottomAppBarsDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        BottomAppBar()
    }
}