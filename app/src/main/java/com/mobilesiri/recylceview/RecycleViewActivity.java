package com.mobilesiri.recylceview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    List<PersonalInfo> listOfPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        RecyclerView recycleList = (RecyclerView) findViewById(R.id.reList);
        recycleList.setHasFixedSize(true);
        populatedList();
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycleList.setLayoutManager(myLayoutManager);

        PersonalAdapter pAdapter =new PersonalAdapter(listOfPerson);
        recycleList.setAdapter(pAdapter);
    }


    private void populatedList() {
        listOfPerson = new ArrayList<PersonalInfo>();
        for(int i=0;i<20;i++)
        {
            PersonalInfo pi = new PersonalInfo();
            pi.setName("Name "+i);
            pi.setFname("FName " + i);
            pi.setEmail("Email_" + i + "@mobilesiri.com");
            listOfPerson.add(pi);

        }
    }


}
