package com.example.randomnum

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun generarRND (view: View){//funcion para el boton
        var res = findViewById(R.id.resultado) as TextView //declaro el textview para poder usarlo en el codigo
        var sum = 0 //sumatoria para el promedio
        var arrayRND = arrayOf<Int>() //creo un arrat vacio de tipo int
        for (i in 0 until 10) //ciclo for para llenar el array
        {
            arrayRND += Random.nextInt(until = 100) //genero un numero random, utilizo until para especifica hasta donde quiero llegar
        }
        arrayRND.sort(); //organizo el array de menor a menor
        var min = arrayRND.first() //tomo la primera posicion del array como mi minimo
        var max = arrayRND.last() //tomo la ultima posicion del array como maximo
        for (num in arrayRND) { //sumo todos los elementos del array
            sum += num
        }
        var avg = sum / 10 // operacion para obtener el promediio
        for (i in arrayRND) {
            res.text = "${arrayRND.joinToString(" , ")} el numero menor es $min, el numero mayor es $max y el promedio es $avg" //se imprime el mensaje, uso join to string para poder mostrar el array completo y con comas

        }

    }
}