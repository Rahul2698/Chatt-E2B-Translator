package com.example.chatte2btranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words=new ArrayList<>();

        words.add(new Word("Where are you going?","তুমি কোথায় যাচ্ছ ?",R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?","তোমার নাম কি ?",R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...","আমার নাম হয়...",R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?","তুমি কেমন অনুভব করছো ?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.","আমি ভালো অনুভব করছি |",R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?","তুমি কি আসছো ?",R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.","হ্যাঁ, আমি আসছি |",R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.","আমি আসছি |",R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.","চলো যাই |",R.raw.phrase_lets_go));
        words.add(new Word("Come here.","এখানে এসো |",R.raw.phrase_come_here));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listView=(ListView)findViewById(R.id.phrases_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                mMediaPlayer=MediaPlayer.create(PhrasesActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}