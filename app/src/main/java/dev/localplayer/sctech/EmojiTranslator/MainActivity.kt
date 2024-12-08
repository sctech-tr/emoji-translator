package dev.localplayer.sctech.EmojiTranslator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.vdurmont.emoji.EmojiParser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emojiInput: EditText = findViewById(R.id.emojiInput)
        val translateButton: Button = findViewById(R.id.translateButton)
        val resultText: TextView = findViewById(R.id.resultText)

        translateButton.setOnClickListener {
            val inputText = emojiInput.text.toString()
            val translatedText = translateEmojis(inputText)
            resultText.text = translatedText
        }
    }

    private fun translateEmojis(input: String): String {
        return EmojiParser.parseToAliases(input)
    }
}