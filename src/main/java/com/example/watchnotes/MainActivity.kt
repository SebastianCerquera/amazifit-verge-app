package com.example.watchnotes

import android.os.Bundle
//import android.support.wearable.activity.WearableActivity
import android.app.Activity;
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : Activity() {
    private lateinit var microImage : ImageView;
    private lateinit var actionRecordButton : Button;
    private var isRecording:Boolean = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        //setAmbientEnabled()
        microImage=findViewById(R.id.microImage);
        actionRecordButton= findViewById(R.id.actionRecordButton);
    }

    fun start_record(view: View) {
        if (isRecording){
            microImage.setImageResource(R.drawable.ic_round_mic_24);
            actionRecordButton.setText(R.string.start);
            isRecording=false;
        }else{
            microImage.setImageResource(R.drawable.ic_active_round_mic_24);
            actionRecordButton.setText(R.string.stop);
            isRecording=true;
        }
    }
}
