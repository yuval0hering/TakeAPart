package com.example.takeapart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> projects;
    private ArrayAdapter<String> projectsAdapter;
    private RecyclerView projectList;
    private Button newProjectButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        projectList = (RecyclerView) findViewById(R.id.project_list);
        projects = new ArrayList<String>();
        projectsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, projects);
        //projectList.setAdapter(projectsAdapter);

        newProjectButton = (Button) findViewById(R.id.btnAddProject);
        newProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AddProjectPopup.class));
            }
        });

    }
}
