package com.example.businesscard

import android.content.res.Configuration
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

/**
 * Business Card Application
 * النشاط الأول - التطبيق الخامس: بطاقة الأعمال الشخصية
 *
 * إعداد الطالب: يوسف مهدي (Yousef Mahdi)
 * التخصص: Web Developer
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
