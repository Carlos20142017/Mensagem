package ipg.primeiro.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MostrarMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_mensagem)

        val mensagem = intent.getStringExtra("Mensagem")
       val data = Date()

        val textViewMensagem = findViewById<TextView>(R.id.textViewSaida)
        textViewMensagem.text = mensagem

        val textViewDataHora = findViewById<TextView>(R.id.textViewData)

        val df = SimpleDateFormat("HH:mm:ss")
        textViewDataHora.setText(df.format(data))
    }
}