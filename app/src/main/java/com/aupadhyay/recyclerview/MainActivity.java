package com.aupadhyay.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;
    private ArrayList<ImageDetails> imageList;
    private ImageAdapter imageAdapter;

    private LinearLayoutManager llm;
    private GridLayoutManager glm;
    private boolean flag = true;
    private Button switchButton;

    public void initViews()
    {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        imageList = new ArrayList<>();

        ImageDetails id1 = new ImageDetails(R.drawable.p1, "Image 1");
        ImageDetails id2 = new ImageDetails(R.drawable.p2, "Image 2");
        ImageDetails id3 = new ImageDetails(R.drawable.p3, "Image 3");
        ImageDetails id4 = new ImageDetails(R.drawable.p4, "Image 4");
        ImageDetails id5 = new ImageDetails(R.drawable.p5, "Image 5");
        ImageDetails id6 = new ImageDetails(R.drawable.p6, "Image 6");
        ImageDetails id7 = new ImageDetails(R.drawable.p7, "Image 7");

        imageList.add(id1);
        imageList.add(id2);
        imageList.add(id3);
        imageList.add(id4);
        imageList.add(id5);
        imageList.add(id6);
        imageList.add(id7);

        imageAdapter = new ImageAdapter(this, R.layout.recycler_row, imageList);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        llm = new LinearLayoutManager(this);
        glm = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(glm); // display in Grid view.
        flag = false;
        recyclerView.setAdapter(imageAdapter);


    }

    public void initButtons()
    {
        switchButton = (Button) findViewById(R.id.switchButton);
        switchButton.setText("Change to ListView");
        switchButton.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initButtons();
    }

    @Override
    public void onClick(View view) {
        if(!flag)
        {
            recyclerView.setLayoutManager(llm);
            flag = true;
            switchButton.setText("Change to GridView");
        }
        else
        {
            recyclerView.setLayoutManager(glm);
            flag = false;
            switchButton.setText("Change to ListView");
        }
    }
}
