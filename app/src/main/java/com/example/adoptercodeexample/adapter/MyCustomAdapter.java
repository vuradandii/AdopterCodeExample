package com.example.adoptercodeexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.adoptercodeexample.R;
import com.example.adoptercodeexample.model.CarModel;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<CarModel> {
    ArrayList<CarModel> carModelArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<CarModel> carModelArrayList, Context context) {
        super(context, R.layout.list_item,carModelArrayList);
        this.carModelArrayList = carModelArrayList;

    }
    private static class CarViewHolder{
        TextView name,price,description;
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CarModel carModel = getItem(position);

        CarViewHolder myviewHolder;
        final View result;

        if (convertView == null){
            myviewHolder = new CarViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item,parent,false);

            myviewHolder.name = (TextView) convertView.findViewById(R.id.name);
            myviewHolder.price = (TextView) convertView.findViewById(R.id.price);
            myviewHolder.description = (TextView) convertView.findViewById(R.id.description);
            myviewHolder.imageView = (ImageView) convertView.findViewById(R.id.image);

            result = convertView;
            convertView.setTag(myviewHolder);

        } else {

            myviewHolder = (CarViewHolder) convertView.getTag();
            result = convertView;

        }
        myviewHolder.name.setText(carModel.getName());
        myviewHolder.price.setText(carModel.getPrice());
        myviewHolder.description.setText(carModel.getDescription());
        myviewHolder.imageView.setImageResource(carModel.getImage());

        return convertView;

    }

}
