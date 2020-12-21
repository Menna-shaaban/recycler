package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private Adapter itemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ItemList> itemList = new ArrayList<>();
        Data(itemList);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        itemAdapter = new Adapter(itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(itemAdapter);
    }
    private void Data(ArrayList<ItemList> itemNames) {
        ItemList person1= new ItemList();
        person1.setName("we ber bears");
        person1.setDiscreption("Animation film ");
        person1.setProfilePhotoLocation(R.drawable.bears);
        itemNames.add(person1);

        ItemList person2= new ItemList();
        person2.setName("Tom&jerry");
        person2.setProfilePhotoLocation(R.drawable.tom);
        person2.setDiscreption("cartoon");
        itemNames.add(person2);

        ItemList person3= new ItemList();
        person3.setName("Tinker Bell");
        person3.setDiscreption("Animation film");
        person3.setProfilePhotoLocation(R.drawable.tink);
        itemNames.add(person3);

        ItemList person4= new ItemList();
        person4.setName("Tinker Bell 2");
        person4.setDiscreption("Animation Film");
        person4.setProfilePhotoLocation(R.drawable.tinker);
        itemNames.add(person4);

    }
}