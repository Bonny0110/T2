package sv.edu.udb.tallernumero2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import sv.edu.udb.tallernumero2.datos.datosComidas;

public class Historial extends AppCompatActivity {

    ListView myListView;
    List<datosComidas> listHistorial;
    public static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference refHistorial = database.getReference("historial");
    FirebaseAuth firebaseAuth;
    boolean bandera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        Query ordenada = refHistorial.orderByChild("fecha");

        myListView = (ListView) findViewById(R.id.listview1);

        listHistorial = new ArrayList<>();

        ordenada.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                firebaseAuth = FirebaseAuth.getInstance();
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                listHistorial.removeAll(listHistorial);
                for (DataSnapshot dato : dataSnapshot.getChildren()) {
                    datosComidas hist = dato.getValue(datosComidas.class);

                }

                historialAdaptador adapter = new historialAdaptador(Historial.this, listHistorial );
                myListView.setAdapter(adapter);

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}