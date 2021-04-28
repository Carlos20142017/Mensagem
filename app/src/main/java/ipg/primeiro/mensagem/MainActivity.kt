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

    private val Export_Messagem = "Mensagem"
    private val Export_Data = "Data"


    fun enviarMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextTextNome)
        val mensagem = editTextMensagem.text.toString()


        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }
        val intent = Intent(this,MostrarMensagemActivity::class.java)
        intent.putExtra(Export_Messagem, mensagem)

        startActivity(intent)
    }


}