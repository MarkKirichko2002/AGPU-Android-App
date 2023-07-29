package com.example.agpu
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        SetUpWebView()
    }

    fun SetUpWebView() {
        val webView = findViewById<WebView>(R.id.WebView)
        webView.webViewClient = WebViewClient()
        val url = "http://test.agpu.net/news.php"
        webView.loadUrl(url)
    }
}