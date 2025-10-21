package com.project.basicsretrofit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.basicsretrofit.ui.theme.BasicsRetrofitTheme

@Composable
fun MainScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(0.dp, 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "오늘 날씨",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "29℃",
            fontSize = 44.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun MainPreview() {
    BasicsRetrofitTheme {
        MainScreen()
    }
}