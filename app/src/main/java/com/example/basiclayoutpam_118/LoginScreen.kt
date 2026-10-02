package com.example.basiclayoutpam_118

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayoutpam_118.ui.theme.BasicLayoutPAM_118Theme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    // 1. Background Layar Penuh dengan Efek Scrim Gelap Halus agar Teks Tidak Kebanting
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // Foto Kampus UMY
        Image(
            painter = painterResource(id = R.drawable.background_umy),
            contentDescription = "Background Kampus UMY",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Lapisan gelap tipis di atas foto agar warna teks 'pop-out'
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = 0.50f), // Atas agak gelap agar tulisan login jelas
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.35f)  // Bawah adem
                        )
                    )
                )
        )

        // 2. Lapisan Konten
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 36.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header Text Login
            Text(
                text = "Login",
                fontSize = 34.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF60A5FA) // Biru terang agar kontras
            )
            Text(
                text = "Ini adalah halaman login.",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(18.dp))

            // Logo UMY Asli
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo UMY",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(115.dp)
            )

            Spacer(modifier = Modifier.height(14.dp))

            // 3. Kapsul Bersih Ramping Khusus Nama & NIM
            Surface(
                shape = RoundedCornerShape(20.dp),
                color = Color.White.copy(alpha = 0.92f), // Putih susu elegan
                shadowElevation = 8.dp,
                modifier = Modifier.wrapContentSize()
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 32.dp, vertical = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Nama",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFDC2626) // Merah
                    )
                    Text(
                        text = "Ilham Saputra",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1E40AF) // Biru
                    )
                    Text(
                        text = "20240140118",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF0F172A) // Hitam tegas
                    )
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            // 4. Lingkaran Foto Mahli dengan Border Putih Bersih
            Box(
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape)
                    .border(BorderStroke(5.dp, Color.White), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profil_login_screen),
                    contentDescription = "Foto Ilham Saputra",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(CircleShape)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    BasicLayoutPAM_118Theme {
        LoginScreen()
    }
}

// UI: Pengaturan tipografi judul halaman login
