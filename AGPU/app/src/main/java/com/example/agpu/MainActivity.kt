package com.example.agpu
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GoToApp()
    }

    fun GoToApp() {
        Timer().schedule(object : TimerTask() {
            override fun run() {
                // Создаем интент для перехода на другой экран
                val intent = Intent(this@MainActivity, NewsActivity::class.java)
                startActivity(intent)
                finish() // закрываем текущую активность, чтобы пользователь не мог вернуться к ней
            }
        }, 2000)
    }
}