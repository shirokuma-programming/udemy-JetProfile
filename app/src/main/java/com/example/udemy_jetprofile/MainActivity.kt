package com.example.udemy_jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.udemy_jetprofile.ui.theme.UdemyJetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UdemyJetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        // プロフィール画像
                        Image(
                            painter = painterResource(id = R.drawable.img_profile),
                            contentDescription = "プロフィール画像",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        
                        // 名前
                        Text(
                            text = "白井 熊子",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        // 職業
                        Text(
                            text = "職業：会社員",
                            color = Color.Gray,
                            fontSize = 16.sp
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            // 会社名
                            Text(
                                text = "しろくま社",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            //部署
                            Text(
                                text = "IT部 しろくま調査チーム",
                                color = Color.Gray,
                                fontSize = 16.sp
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            // メールアドレス
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "メールアドレス"
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "Email",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "shiroikumako@email.com",
                                fontSize = 16.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))

                            Divider(
                                thickness = 2.dp,
                                modifier = Modifier.clip(RoundedCornerShape(1000.dp))
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        // 詳細表示ボタン
                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF638E9B)),
                            onClick = { /*TODO*/ }
                        ) {
                            Text(
                                text = "詳細を表示",
                                color = Color.White,
                            )
                        }
                    }
                }
            }
        }
    }
}