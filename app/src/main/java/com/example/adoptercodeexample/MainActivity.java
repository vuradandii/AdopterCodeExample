package com.example.adoptercodeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adoptercodeexample.adapter.MyCustomAdapter;
import com.example.adoptercodeexample.model.CarModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<CarModel> carModelArrayList;

    private static MyCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        carModelArrayList = new ArrayList<>();

        CarModel carModel = new CarModel("Lamborghini","20000",R.drawable.a,"BSVI");
        CarModel carModel1 = new CarModel("BMW","80000",R.drawable.b,"BSIV");
        CarModel carModel2 = new CarModel("Luxury","30000",R.drawable.c,"BSVI");
        CarModel carModel3 = new CarModel("Mustang","45000",R.drawable.d,"BSIV");
        CarModel carModel4 = new CarModel("Audi","50000",R.drawable.e,"BSVI");
        CarModel carModel5 = new CarModel("Lamborghini","65000",R.drawable.a,"BSIV");
        CarModel carModel6 = new CarModel("BMW","35000",R.drawable.b,"BSVI");
        CarModel carModel7 = new CarModel("Luxury","40000",R.drawable.c,"BSIV");
        CarModel carModel8 = new CarModel("Mustang","70000",R.drawable.d,"BSVI");
        CarModel carModel9 = new CarModel("Audi","25000",R.drawable.e,"BSIV");

        carModelArrayList.add(carModel);
        carModelArrayList.add(carModel1);
        carModelArrayList.add(carModel2);
        carModelArrayList.add(carModel3);
        carModelArrayList.add(carModel4);
        carModelArrayList.add(carModel5);
        carModelArrayList.add(carModel6);
        carModelArrayList.add(carModel7);
        carModelArrayList.add(carModel8);
        carModelArrayList.add(carModel9);

        adapter = new MyCustomAdapter(carModelArrayList,getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you select car" + adapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}