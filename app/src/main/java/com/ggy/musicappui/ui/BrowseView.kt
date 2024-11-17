package com.ggy.musicappui.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ggy.musicappui.R

@Composable
fun BrowseView() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories) { cat ->
            BrowserItem(cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}

@Preview
@Composable
fun BrowseViewPreview() {
    BrowseView()
}