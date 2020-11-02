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

public class NumbersActivity extends AppCompatActivity {

    //use to play audio_file
    private MediaPlayer mMediaPlayer;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("One","এক",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Two","দুই",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Three","তিন",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Four","চার",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Five","পাঁচ",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Six","ছয়",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("Seven","সাত",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("Eight","আট",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("Nine","নয়",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("Ten","দশ",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listview=(ListView)findViewById(R.id.numbers_list);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}