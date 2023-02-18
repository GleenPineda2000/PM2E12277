package com.example.pm1e10177;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button llamar;
EditText txtnumero;
AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

llamar =  findViewById(R.id.alertaboton);
txtnumero =  findViewById(R.id.txtnumero);
builder = new AlertDialog.Builder(this);










llamar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        builder.setTitle("¿DESEA HACER UNA LLAMADA?")
                .setCancelable(true)
                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent = new Intent(Intent.ACTION_DIAL,
                                Uri.parse("tel:"+txtnumero.getText().toString()));
                        startActivity(intent);




                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }).show();





    }
});








    }
}