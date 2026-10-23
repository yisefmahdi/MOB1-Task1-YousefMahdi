package com.example.article

import android.content.res.Configuration
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

/**
 * Article Screen Application
 * النشاط الأول - التطبيق الرابع: شاشة المقال التوضيحي
 *
 * إعداد الطالب: يوسف مهدي (Yousef Mahdi)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // زر تبديل الوضع الليلي / النهاري للاختبار والتقييم السريع
        val btnThemeToggle: ImageButton = findViewById(R.id.btnThemeToggle)
        btnThemeToggle.setOnClickListener {
            toggleNightMode()
        }
    }

    /**
     * التبديل بين الوضع الليلي (Dark Mode) والنهاري (Light Mode)
     */
    private fun toggleNightMode() {
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        if (currentNightMode == Configuration.UI_MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }
}
