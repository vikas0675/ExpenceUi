package com.example.expense_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expense_ui.adapter_class.RecyclerMainAdapter
import com.example.expense_ui.databinding.ActivityMainBinding
import com.example.expense_ui.model_class.MainModel
import com.example.expense_ui.model_class.SecondaryModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)






        var dataItem = ArrayList<MainModel>().apply {

            var secondaryData = ArrayList<SecondaryModel>().apply {

                add(SecondaryModel(R.drawable.happy, "Pets", "$3.5", "Treat", "$383"))
                add(SecondaryModel(R.drawable.airplane, "Travel", "$24.5", "Kushinagar Airport", "$33"))
                add(SecondaryModel(R.drawable.biscuit, "Food", "$13.5", "Shopkeer", "$356"))
                add(SecondaryModel(R.drawable.shirt, "Fashion", "$34.5", "Shoping Moll", "$286"))
            }
            add(MainModel("Today", "$70", secondaryData))



            var secondaryData2 = ArrayList<SecondaryModel>().apply {

                add(SecondaryModel(R.drawable.happy, "Pets", "$3.5", "Treat", "$383"))
                add(SecondaryModel(R.drawable.airplane, "Travel", "$24.5", "Kushinagar Airport", "$33"))
                add(SecondaryModel(R.drawable.biscuit, "Food", "$13.5", "Shopkeer", "$356"))
                add(SecondaryModel(R.drawable.shirt, "Fashion", "$34.5", "Shoping Moll", "$286"))
                add(SecondaryModel(R.drawable.airplane, "Fashion", "$34.5", "Shoping Moll", "$286"))
                add(SecondaryModel(R.drawable.happy, "Fashion", "$34.5", "Shoping Moll", "$286"))
            }
            add(MainModel("Yesterday", "$350", secondaryData2))




            var secondaryData3 = ArrayList<SecondaryModel>().apply {

                add(SecondaryModel(R.drawable.happy, "Pets", "$3.5", "Treat", "$383"))
                add(SecondaryModel(R.drawable.airplane, "Travel", "$24.5", "Kushinagar Airport", "$33"))
                add(SecondaryModel(R.drawable.biscuit, "Food", "$13.5", "Shopkeer", "$356"))
                add(SecondaryModel(R.drawable.happy, "Pets", "$3.5", "Treat", "$383"))
                add(SecondaryModel(R.drawable.airplane, "Travel", "$24.5", "Kushinagar Airport", "$33"))
                add(SecondaryModel(R.drawable.biscuit, "Food", "$13.5", "Shopkeer", "$356"))
                add(SecondaryModel(R.drawable.shirt, "Fashion", "$34.5", "Shoping Moll", "$286"))
                add(SecondaryModel(R.drawable.happy, "Pets", "$3.5", "Treat", "$383"))
                add(SecondaryModel(R.drawable.airplane, "Travel", "$24.5", "Kushinagar Airport", "$33"))
                add(SecondaryModel(R.drawable.biscuit, "Food", "$13.5", "Shopkeer", "$356"))
                add(SecondaryModel(R.drawable.shirt, "Fashion", "$34.5", "Shoping Moll", "$286"))

            }
            add(MainModel("23 Aug 2023", "$700", secondaryData3))


        }


        binding.recylerMainView.layoutManager = LinearLayoutManager(this)
        binding.recylerMainView.adapter = RecyclerMainAdapter(this, dataItem)

    }
}