package com.example.lenovo.musica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
private Button importb;
    private ListView listView;
    private LinearLayout ll;
    private RelativeLayout rl;
    private SongListAdapter mAdapterListFile;
    private String[] star = {"*"};
    private ArrayList<Song> mList;
    private MusicService servicemusic;
    private Intent playIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        importb = (Button) findViewById(R.id.importbtn);
        listView = (ListView) findViewById(R.id.listsongs);
        ll = (LinearLayout) findViewById(R.id.displaylist);
        rl = (RelativeLayout) findViewById(R.id.relativeimport);
        importb.setOnClickListener(this);
        listView.setOnItemSelectedListener(this);
        mList = new ArrayList<Song>();
        mAdapterListFile = new SongListAdapter(MainActivity.this,mList);
        mList.setAdaptor;

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
