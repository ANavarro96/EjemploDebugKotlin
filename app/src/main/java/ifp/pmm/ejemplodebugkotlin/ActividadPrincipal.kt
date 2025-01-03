package ifp.pmm.ejemplodebugkotlin

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ifp.pmm.ejemplodebugkotlin.ui.theme.EjemploDebugKotlinTheme

class ActividadPrincipal : ComponentActivity() {

    val respuesta = 23
    val respuesta_correcta = 27

    lateinit var stringRespuesta : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploDebugKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    if(haAcertado()) stringRespuesta = respuesta_correcta.toString()
                    else stringRespuesta = getString(R.string.fan_falso)

                    Column( modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = CenterHorizontally) {


                        Box(modifier = Modifier.height(50.dp).weight(1f)) {
                            Text(
                                getString(R.string.question_string)
                            )
                        }


                        Box(modifier = Modifier.fillMaxSize()
                            .weight(6f),
                            contentAlignment = Center) {
                            Text(stringRespuesta, fontSize = 50.sp,
                                fontWeight = FontWeight.ExtraBold ,
                                textAlign = TextAlign.Center)
                        }

                    }

                }
            }
        }
    }

    fun haAcertado() = respuesta_correcta == respuesta
}




