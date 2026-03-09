package com.msaitodev.socialworker.humanmed.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.msaitodev.core.common.ui.LocalAppColors
import com.msaitodev.core.common.ui.AppColors

private val LightColorScheme = lightColorScheme(
    primary = BluePrimary,
    secondary = Color(0xFFD1E4FF),
    tertiary = BlueTertiary,
    background = LightBlueBackground,
    surface = LightBlueBackground,
    onPrimary = Color.White,
    onSecondary = Color(0xFF0D47A1),
    onTertiary = Color.Black,
    onBackground = Color(0xFF0D47A1),
    onSurface = Color(0xFF0D47A1),
)

private val DarkColorScheme = darkColorScheme(
    primary = BluePrimaryDark,
    secondary = Color(0xFF00497D),
    tertiary = BlueTertiaryDark,
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onPrimary = Color.White,
    onSecondary = Color(0xFFD1E4FF),
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
)

// アプリケーション用のセマンティックカラー定義（ライトモード用）
private val LightAppColors = AppColors(
    correctBorder = Color(0xFF1976D2),
    correctBackground = Color(0xFFE3F2FD),
    wrongBorder = Color(0xFFC53030),
    wrongBackground = Color(0xFFFFE0E0),
    selectedBackground = Color(0xFFD1E4FF)
)

// アプリケーション用のセマンティックカラー定義（ダークモード用）
private val DarkAppColors = AppColors(
    correctBorder = Color(0xFF42A5F5),
    correctBackground = Color(0xFF0D47A1),
    wrongBorder = Color(0xFFF56565),
    wrongBackground = Color(0xFF652B19),
    selectedBackground = Color(0xFF00497D)
)

@Composable
fun SocialworkerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val appColors = if (darkTheme) DarkAppColors else LightAppColors

    CompositionLocalProvider(
        LocalAppColors provides appColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}
