package com.darealreally.material3demo.ui.components.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darealreally.material3demo.R
import com.darealreally.material3demo.ui.theme.Material3DemoTheme

@Composable
fun TopAppBars() {

    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        // Centered Title
        CenterAlignedTopAppBar(
            title = { Text("Product") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu"
                    )
                }
            },
            actions = {
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_account_circle),
                        contentDescription = "Profile"
                    )
                }
            }
        )

        // Small
        SmallTopAppBar(
            title = { Text("Title") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_attach_file),
                        contentDescription = "Attach File"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_today),
                        contentDescription = "Today"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "More Options"
                    )
                }
            }
        )

        // Medium
        MediumTopAppBar(
            title = { Text("Title") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_attach_file),
                        contentDescription = "Attach File"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_today),
                        contentDescription = "Today"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "More Options"
                    )
                }
            }
        )

        // Large
        LargeTopAppBar(
            title = { Text("Title") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_attach_file),
                        contentDescription = "Attach File"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.ic_today),
                        contentDescription = "Today"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "More Options"
                    )
                }
            }
        )
    }

}

/**
 * Preview Section
 */
@Preview(name = "Light")
@Composable
fun TopAppBarsPreview() {
    Material3DemoTheme {
        TopAppBars()
    }
}

@Preview(name = "Dark")
@Composable
fun TopAppBarsDarkPreview() {
    Material3DemoTheme(darkTheme = true) {
        TopAppBars()
    }
}