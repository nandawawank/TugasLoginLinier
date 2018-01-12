package com.example.root.tugasloginlinier;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.root.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLogin(View view) {
        Intent main = new Intent(this, Second_Activity.class);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        String namauser = username.getText().toString();
        String passuser = password.getText().toString();

        if (namauser.equals("nandawk") && passuser.equals("1147050123")) {

            main.putExtra(EXTRA_MESSAGE, namauser);
            startActivity(main);
        } else{

            AlertDialog gagal = new AlertDialog.Builder(MainActivity.this).create();
            gagal.setTitle("Login Gagal");
            gagal.setMessage("Silahkan Masukan Kembali Username dan Password dengan Benar");
            gagal.show();
        }
    }
}
