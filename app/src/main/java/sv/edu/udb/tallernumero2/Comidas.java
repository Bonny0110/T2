package sv.edu.udb.tallernumero2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import sv.edu.udb.tallernumero2.datos.datosComidas;

public class Comidas extends AppCompatActivity {
    private Button btnFactura;
    TextView tv1, tv2,tv3,tv4, tv5, tv6,tv7,tv8,tv9, tv10, textView7;
    TextView tvs1,tvs2, tvs3, tvs4, tvs5, tvs6, tvs7, tvs8, tvs9, tvs10;
    double tacos = 0;
    double burrito = 0;
    double chilaquilas = 0;
    double chilesnogada = 0;
    double manchamantel = 0;
    double mole = 0;
    double pozole = 0;
    double horchata = 0;
    double tequila = 0;
    double jamaica = 0;
    double total = 0;
    datosComidas datos;
    Intent i = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidas);
        i = new Intent(getBaseContext(), Factura.class);

        btnFactura = findViewById(R.id.mbtnFactura);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tv10 = (TextView) findViewById(R.id.tv10);
        textView7 = (TextView) findViewById(R.id.textView7);

        btnFactura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double costo;
                costo = (tacos * 2.00) + (burrito * 2.30) + (chilaquilas * 2.50) + (chilesnogada * 2.40) + (manchamantel * 2.50) + (mole * 2.40) + (pozole * 2.30) + (horchata * 1.50) + (tequila * 1.40) + (jamaica * 1.50);
                textView7.setText(Double.toString(costo));
                i.putExtra("total", costo);
                if(costo == 0){
                    Toast.makeText(Comidas.this,
                            "¡Seleccione algún platillo primero!", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(i);
                }
            }
        });
    }

    public void tacos (View view){
        tacos++;
        double total = (2*tacos);
        int val = (int) tacos;
        tv1.setText(Integer.toString(val));
        i.putExtra("cant1", val);
        i.putExtra("total1", total);
    }
    public void burrito (View view){
        burrito++;
        double total = (2.30*burrito);
        int val = (int) burrito;
        tv2.setText(Integer.toString(val));
        i.putExtra("cant2", val);
        i.putExtra("total2", total);
    }
    public void chilaquilas (View view){
        chilaquilas++;
        double total = (2.50*chilaquilas);
        int val = (int) chilaquilas;
        tv3.setText(Integer.toString(val));
        i.putExtra("cant3", val);
        i.putExtra("total3", total);
    }
    public void chilesnogada (View view){
        chilesnogada++;
        double total = (2.40*chilesnogada);
        int val = (int) chilesnogada;
        tv4.setText(Integer.toString(val));
        i.putExtra("cant4", val);
        i.putExtra("total4", total);
    }
    public void manchamantel (View view){
        manchamantel++;
        int val = (int) manchamantel;
        double total = (2.50*manchamantel);
        tv5.setText(Integer.toString(val));
        i.putExtra("cant5", val);
        i.putExtra("total5", total);
    }
    public void mole (View view){
        mole++;
        int val = (int) mole;
        double total = (2.40*mole);
        tv6.setText(Integer.toString(val));
        i.putExtra("cant6", val);
        i.putExtra("total6", total);
    }
    public void pozole (View view){
        pozole++;
        int val = (int) pozole;
        double total = (2.30*pozole);
        tv7.setText(Integer.toString(val));
        i.putExtra("cant7", val);
        i.putExtra("total7", total);
    }
    public void horchata (View view){
        horchata++;
        int val = (int) horchata;
        double total = (1.50*horchata);
        tv8.setText(Integer.toString(val));
        i.putExtra("cant8", val);
        i.putExtra("total8", total);
    }
    public void tequila (View view){
        tequila++;
        int val = (int) tequila;
        double total = (1.40*tequila);
        tv9.setText(Integer.toString(val));
        i.putExtra("cant9", val);
        i.putExtra("total9", total);
    }
    public void jamaica (View view){
        jamaica++;
        int val = (int) jamaica;
        double total = (1.50*jamaica);
        tv10.setText(Integer.toString(val));
        i.putExtra("cant10", val);
        i.putExtra("total10", total);
    }
}