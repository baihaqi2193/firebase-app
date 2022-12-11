package id.baihaqi.firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View v) {
        switch (v.getId()){
            case R.id.add_mhs:
                Intent addMhsIntent = new Intent(MainActivity.this, TambahMhsActivity.class);
                startActivity(addMhsIntent);
                break;
            case R.id.list_mhs:
                Intent listMhsIntent = new Intent(MainActivity.this, ListMhsActivity.class);
                startActivity(listMhsIntent);
                break;
        }
    }
}