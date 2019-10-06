package com.example.writeinstorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.EditText;
import java.io.FileOutputStream;
import java.io.File;

public class MainActivity extends AppCompatActivity {

    EditText el;
    Button bl;
    ImageView il;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        el= findViewById(R.id.editText2);
        bl= findViewById(R.id.button);
        il= findViewById(R.id.imagelogo);

        il.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Welcome",Toast.LENGTH_LONG).show();
            }
        });
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = el.getText().toString();
                try{
                    File f = new File(  "/sdcard/WriteInStorage.txt");
                    f.createNewFile();
                    FileOutputStream fout = new FileOutputStream(f);
                    fout.write(message.getBytes());
                    fout.close();
                    Toast.makeText(getApplicationContext(),"Data written",Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getBaseContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
