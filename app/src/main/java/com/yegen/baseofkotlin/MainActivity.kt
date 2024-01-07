package com.yegen.baseofkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------------arrayOf---------------")
        val myArray= arrayOf("Hüseyin",3,true)
        println(myArray.get(2))

        println("-------------arrayListOf---------------")

        val myArrayList= arrayListOf<Any>("Mahmut","Murat",300)
        myArrayList.forEach{
            println(it)
        }
        println("-------------HashMap---------------")

        val myHashMap= hashMapOf<String,Int>()
        myHashMap.put("Hüseyin",23)
        myHashMap.put("Ali",30)
        myHashMap.put("Mehmet",19)

        println(myHashMap.get("Hüseyin"))

        val myNewHashMap= hashMapOf<String,Int>("Hüseyin" to 23,"Tolga" to 50)
        myNewHashMap.forEach {
            println(it)
        }
        println("-------------set---------------")

        val exampleOfSet= arrayOf("Hüseyin","Mehmet","Mahmut")
        val exampleOfSetNum = arrayOf(1, 2, 3)
        println("${exampleOfSet[0]}'s değeri: "+ exampleOfSetNum.get(0))
    }
}