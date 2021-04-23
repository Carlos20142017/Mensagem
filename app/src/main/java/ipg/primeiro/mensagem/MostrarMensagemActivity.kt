package ipg.primeiro.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_mensagem)

        val mensagem = intent.getStringExtra("Mensagem")
        val textViewMensagem = findViewById<TextView>(R.id.textViewSaida)
        textViewMensagem.text = mensagem
    }
}