package abcd.com.studycasepraktikum2.;



import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import abcd.com.studycasepraktikum2.ActivityKedua;
import abcd.com.studycasepraktikum2.R;

public class MainActivity extends AppCompatActivity {

    EditText makanan, porsi;
    Button Eatbus, Apnormal ;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makanan = (EditText) findViewById(R.id.editMakanan);
        porsi = (EditText) findViewById(R.id.editPorsi);
        Eatbus = (Button) findViewById(R.id.buttonEatbus);
        Apnormal= (Button) findViewById(R.id.buttonApnormal);

        Apnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,ActivityKedua.class);
                String restaurant = Apnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", restaurant);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);

            }
        });

        //untuk eatbus
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,ActivityKedua.class);
                String restaurant = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", restaurant);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });


        );

}