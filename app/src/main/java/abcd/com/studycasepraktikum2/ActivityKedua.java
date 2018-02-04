package abcd.com.studycasepraktikum2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class ActivityKedua extends AppCompatActivity {

    int uang = 65000;
    int biaya, total , totalHarga;
    TextView restaurant , menu , qty, Total;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eatbus);

        TextView restaurant = (TextView) findViewById(R.id.lokasi);
        TextView menu = (TextView) findViewById(R.id.menuMakan);
        TextView qty = (TextView) findViewById(R.id.porsi);
        TextView Total = (TextView) findViewById(R.id.harga);

        Intent totalHarga = getIntent();

        String menuMakan  = totalHarga.getStringExtra("makanan");
        String Lokasi = totalHarga.getStringExtra("tempat");
        String harga = totalHarga.getStringExtra("qty");

        menu.setText(menuMakan);
        qty.setText(porsi);
        restaurant.setText(Lokasi);

        switch (Lokasi){
            case "Eatbus";
            biaya = 50000;
            break;

            case "Apnormal";
            biaya = 30000;
            break;
        }

        total = parseInt(qty) * biaya;
        String totalHarga = Integer.toString(total);
        if (uang < total) {
            Total.setText("Rp" + totalHarga);
            Toast.makeText(this, "Jangan makan disini, uang tidak cukup", Toast.LENGTH_SHORT().show();

        } else {
            Total.setText("Rp" + totalHarga);
            Toast.makeText(this, "Disni aja makan malamnya", Toast.LENGTH_SHORT).show();
        }

    }


}
+