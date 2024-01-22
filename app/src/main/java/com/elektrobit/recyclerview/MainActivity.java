package com.elektrobit.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EmployeeAdapter adapter;
    RecyclerView recyclerView;
    ClickListener listener;
    Button button;
    EditText name, id, dept;
    String nameT, idT, deptT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<EmployeeData> list = new ArrayList<>();
//        list = getData("Ayush",
//                "123456",
//                "COS");


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                name = findViewById(R.id.nameTV);
//                id = findViewById(R.id.idTV);
//                dept = findViewById(R.id.deptTV);
//                nameT = name.getText().toString();
//                idT = id.getText().toString();
//                deptT = dept.getText().toString();
//
//                List<EmployeeData> temp_list = new ArrayList<>();
//                for (EmployeeData e :
//                        list) {
//                    temp_list.add(e);
//                }
//                list = getData(nameT,idT,deptT);
//
//                adapter
//                        = new EmployeeAdapter(
//                        temp_list, getApplication(),listener);
//                recyclerView.setAdapter(adapter);
//                recyclerView.setLayoutManager(
//                        new LinearLayoutManager(MainActivity.this));
//
////                recyclerView.setVisibility(View.VISIBLE);


                list.add(getDataFromUser());
                adapter.notifyItemInserted(list.size() - 1);


            }
        });



        recyclerView
                = (RecyclerView) findViewById(
                R.id.recyclerView);
        listener = new ClickListener() {
            @Override
            public void click(int index) {
                Toast.makeText(getApplicationContext(), "Clicked item index is " + index, Toast.LENGTH_SHORT).show();
            }
        };
        adapter = new EmployeeAdapter(list, getApplication(), listener);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(MainActivity.this));


    }


    private EmployeeData getDataFromUser() {
        name = findViewById(R.id.nameTV);
        id = findViewById(R.id.idTV);
        dept = findViewById(R.id.deptTV);
        nameT = name.getText().toString();
        idT = id.getText().toString();
        deptT = dept.getText().toString();
        return new EmployeeData(nameT, idT, deptT);
    }
}


//
//    private List<EmployeeData> getData(String nameText,String idText,String deptText)
//    {
//        List<EmployeeData> new_list = new ArrayList<>();
//
//
//        new_list.add(new EmployeeData(nameText,idText,deptText));
//        Toast.makeText(this, "Contact Added!", Toast.LENGTH_SHORT).show();



//        list.add(new EmployeeData("Ayush",
//                "123456",
//                "COS"));
//        list.add(new EmployeeData("Vivek",
//                "923456",
//                "COS"));
//        list.add(new EmployeeData("Akshay",
//                "823456",
//                "COS"));
//        list.add(new EmployeeData("Ayush",
//                "123456",
//                "COS"));
//        list.add(new EmployeeData("Vivek",
//                "923456",
//                "COS"));
//        list.add(new EmployeeData("Akshay",
//                "823456",
//                "COS"));
//        list.add(new EmployeeData("Ayush",
//                "123456",
//                "COS"));
//        list.add(new EmployeeData("Vivek",
//                "923456",
//                "COS"));
//        list.add(new EmployeeData("Akshay",
//                "823456",
//                "COS"));
//        list.add(new EmployeeData("Ayush",
//                "123456",
//                "COS"));
//        list.add(new EmployeeData("Vivek",
//                "923456",
//                "COS"));
//        list.add(new EmployeeData("Akshay",
//                "823456",
//                "COS"));
//
//        return new_list;
//    }
//}