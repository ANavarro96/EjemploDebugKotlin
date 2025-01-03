package ifp.pmm.ejemplodebugkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val respuesta = 23;
    val respuesta_correcta = 27;


    lateinit var stringRespuesta: String;
    lateinit var textoRespuesta : TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textoRespuesta = findViewById(R.id.answer_view)
        if(haAcertado()) stringRespuesta = respuesta_correcta.toString()
        else stringRespuesta = getString(R.string.fan_falso)

        textoRespuesta.setText(stringRespuesta)
    }


    fun haAcertado() = respuesta_correcta == respuesta
}