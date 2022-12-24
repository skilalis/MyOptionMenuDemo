package com.example.myoptionmenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.settingId) {
            Toast.makeText(this, "setting is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.shearId) {
            Toast.makeText(this, "shear is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.feedbackId) {
            Toast.makeText(this, "Feedback is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.aboutusId) {
            Toast.makeText(this, "About us is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}