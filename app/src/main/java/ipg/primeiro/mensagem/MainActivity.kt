package ipg.primeiro.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

}

    fun enviarMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextTextNome)
        val mensagem = editTextMensagem.text.toString()

        val intent = Intent(this,MostrarMensagemActivity::class.java)
        intent.putExtra("Mensagem", mensagem)
        startActivity(intent)
    }

}