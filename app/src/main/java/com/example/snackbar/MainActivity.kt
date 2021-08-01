package com.example.snackbar

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button
    lateinit var buttonFechar: Button
    lateinit var snackBar: Snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonAbrir = findViewById(R.id.buttomAbrir)
        buttonFechar = findViewById(R.id.buttonFechar)

        buttonAbrir.setOnClickListener { view ->
            //it recebido, foi renomeado como view

            //SnackBar normal
//            Snackbar.make(view, "Botão Pressionado", Snackbar.LENGTH_LONG).show()

//            //SnackBar com ação
//            Snackbar.make(
//                view,
//                "Botão Pressionado",
//                Snackbar.LENGTH_INDEFINITE
//            ).setAction(
//                "Confirmar",
//                View.OnClickListener {
//                    button.setText("Snack bar pressionada")
//                }).show()

            //Outra maneira de utilizar a snackBar
            snackBar = Snackbar.make(
                view,
                "Botão Pressionado",
                Snackbar.LENGTH_INDEFINITE
            ).setActionTextColor(resources.getColor(R.color.white))
                .setAction(
                "Confirmar",
                View.OnClickListener {
                    buttonAbrir.setText("Snack bar pressionada")
                })
            snackBar.show()

        }
        buttonFechar.setOnClickListener {
            //Fechando a snackBar
            snackBar.dismiss()
        }
    }

    fun abrirSnackBar(view: View) {
    }

    fun fecharSnackBar(view: View) {
    }
}