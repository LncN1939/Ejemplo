package ni.edu.uca.ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ni.edu.uca.ejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciar()
    }

    private fun iniciar() {
        binding.button2.setOnClickListener {
            var nom = binding.name.text.toString()
            var sal = saludar(nom)
            Toast.makeText(this, sal, Toast.LENGTH_SHORT).show()
        }
    }

    fun saludar(nombre: String ):String{
        return "Hola ${nombre}, mucho gusto"
    }

}