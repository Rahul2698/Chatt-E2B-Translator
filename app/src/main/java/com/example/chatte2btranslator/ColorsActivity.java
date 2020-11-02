package com.example.chatte2btranslator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Red","লাল",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("Green","সবুজ",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("Brown","বাদামি",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("Gray","ধূসর",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("Black","কালো",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("White","সাদা",R.drawable.color_white,R.raw.color_white));
        words.add(new Word("Dusty Yellow","ধূলাভ হলুদ",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("Mustard Yellow","সরিষে হলুদ",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listView=(ListView)findViewById(R.id.colors_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
