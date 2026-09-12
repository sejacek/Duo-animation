package com.example.duofold.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.duofold.R

/**
 * Shows one full-screen image (your own photo/screenshot)
 * instead of the fake demo dashboard.
 */
@Composable
fun DemoContentView(
    modifier: Modifier = Modifier,
    onCalibrateClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.my_screen),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}
