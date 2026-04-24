package com.radiantbyte.novaclient.ui.theme

import android.os.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object NovaColors {
    val Primary = Color(0xFFFFFFFF)           // was purple #8B5CF6
    val PrimaryLight = Color(0xFFE0E0E0)      // was #A78BFA
    val PrimaryDark = Color(0xFFCCCCCC)       // was #7C3AED
    val OnPrimary = Color.Black               // was White

    val Secondary = Color(0xFFAAAAAA)         // was cyan #06B6D4
    val SecondaryVariant = Color(0xFF888888)  // was #0891B2
    val SecondaryLight = Color(0xFFCCCCCC)    // was #22D3EE
    val OnSecondary = Color.Black             // was White

    val Accent = Color(0xFFFFFFFF)            // was pink #EC4899
    val AccentLight = Color(0xFFDDDDDD)       // was #F472B6
    val AccentDark = Color(0xFFBBBBBB)        // was #DB2777

    val Background = Color(0xFF000000)        // was #0C0A1A
    val Surface = Color(0xFF0F0F0F)           // was #1A1625
    val SurfaceVariant = Color(0xFF1A1A1A)    // was #2D2438
    val SurfaceContainer = Color(0xFF141414)  // was #252030

    val OnBackground = Color(0xFFFFFFFF)      // unchanged
    val OnSurface = Color(0xFFFFFFFF)         // was #E2E8F0
    val OnSurfaceVariant = Color(0xFF999999)  // was #94A3B8

    val Error = Color(0xFFEF4444)             // unchanged
    val ErrorLight = Color(0xFFF87171)        // unchanged

    val Border = Color(0xFF333333)            // was #3D3349
    val BorderLight = Color(0xFF555555)       // was #4C4A5A

    val Overlay = Color(0x80000000)           // unchanged

    // Minimap colors
    val MinimapBackground = Color(0xFF1A1A1A) // Dark background for minimap
    val MinimapGrid = Color(0xFF444444)       // Grid lines color
    val MinimapCrosshair = Color(0xFF00FF00)  // Crosshair color (green)
    val MinimapPlayerMarker = Color(0xFFFFFFFF) // Player marker color (white)
    val MinimapEntityClose = Color(0xFF00FF00) // Close entity color (green)
    val MinimapEntityFar = Color(0xFFFFFF00)   // Far entity color (yellow)
}

object ClickGUIColors {
    val PrimaryBackground = Color(0xFF000000)     // was #0A0A0F
    val SecondaryBackground = Color(0xFF111111)   // was #1A1A2E

    val AccentColor = Color(0xFFFFFFFF)           // was purple #A020F0
    val AccentColorVariant = Color(0xFFCCCCCC)    // was #BF5AF2

    val PrimaryText = Color(0xFFFFFFFF)           // unchanged
    val SecondaryText = Color(0xFF888888)         // unchanged

    val PanelBackground = Color(0xF0101010)       // was #F0161629
    val PanelBorder = Color(0x60FFFFFF)           // was purple border

    val ModuleEnabled = AccentColor               // now White
    val ModuleDisabled = Color(0xFF2A2A2A)        // was #2A2A3E

    val SliderTrack = Color(0xFF333333)           // was #3C3C4E
    val SliderThumb = AccentColor                 // now White
    val SliderFill = AccentColor                  // now White

    val CheckboxBorder = AccentColor              // now White
    val CheckboxFill = AccentColor                // now White
}

private val NovaDarkColorScheme = darkColorScheme(
    primary = NovaColors.Primary,
    onPrimary = NovaColors.OnPrimary,
    primaryContainer = NovaColors.PrimaryDark,
    onPrimaryContainer = NovaColors.PrimaryLight,
    secondary = NovaColors.Secondary,
    onSecondary = NovaColors.OnSecondary,
    secondaryContainer = NovaColors.SecondaryVariant,
    onSecondaryContainer = NovaColors.SecondaryLight,
    tertiary = NovaColors.Accent,
    onTertiary = Color.White,
    tertiaryContainer = NovaColors.AccentDark.copy(alpha = 0.2f),
    onTertiaryContainer = NovaColors.AccentLight,
    background = NovaColors.Background,
    onBackground = NovaColors.OnBackground,
    surface = NovaColors.Surface,
    onSurface = NovaColors.OnSurface,
    surfaceVariant = NovaColors.SurfaceVariant,
    onSurfaceVariant = NovaColors.OnSurfaceVariant,
    surfaceContainer = NovaColors.SurfaceContainer,
    error = NovaColors.Error,
    onError = Color.White,
    errorContainer = NovaColors.Error.copy(alpha = 0.2f),
    onErrorContainer = NovaColors.ErrorLight,
    outline = NovaColors.Border,
    outlineVariant = NovaColors.BorderLight.copy(alpha = 0.5f),
    scrim = NovaColors.Overlay,
    inverseSurface = NovaColors.OnSurface,
    inverseOnSurface = NovaColors.Surface,
    inversePrimary = NovaColors.PrimaryDark
)

private val NovaLightColorScheme = lightColorScheme(
    primary = NovaColors.Primary,
    onPrimary = NovaColors.OnPrimary,
    primaryContainer = NovaColors.Primary.copy(alpha = 0.1f),
    onPrimaryContainer = NovaColors.Primary,
    secondary = NovaColors.Secondary,
    onSecondary = NovaColors.OnSecondary,
    secondaryContainer = NovaColors.Secondary.copy(alpha = 0.1f),
    onSecondaryContainer = NovaColors.Secondary,
    tertiary = NovaColors.Accent,
    onTertiary = NovaColors.OnPrimary,
    tertiaryContainer = NovaColors.Accent.copy(alpha = 0.1f),
    onTertiaryContainer = NovaColors.Accent,
    background = Color(0xFFFAFAFA),
    onBackground = Color(0xFF1A1A1A),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF1A1A1A),
    surfaceVariant = Color(0xFFF5F5F5),
    onSurfaceVariant = Color(0xFF666666),
    surfaceContainer = Color(0xFFE5E5E5),
    error = NovaColors.Error,
    onError = NovaColors.OnPrimary,
    outline = Color(0xFFE0E0E0),
    outlineVariant = Color(0xFFF0F0F0)
)

val NovaTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.sp
    )
)

@Composable
fun NovaClientTheme(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> NovaDarkColorScheme
        else -> NovaLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = NovaTypography,
        content = content
    )
}
