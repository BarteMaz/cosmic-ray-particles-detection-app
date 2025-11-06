package pl.agh.cosmicray.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pl.agh.cosmicray.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO: poprosić o uprawnienia kamery i wystartować pipeline
    }
}