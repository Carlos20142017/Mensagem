package ipg.primeiro.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var botao: Button
    lateinit var editTextEntrada: EditText
    lateinit var textViewSaida: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao= findViewById(R.id.buttonEnviar)
        editTextEntrada= findViewById(R.id.editTextTextNome)
        textViewSaida= findViewById(R.id.textViewSaida)

        botao.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                mostrar()
            }

        })


}
    fun mostrar(){
        val texto = editTextEntrada.toString()
        textViewSaida.setText(texto)
    }
}