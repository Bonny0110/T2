package sv.edu.udb.tallernumero2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import sv.edu.udb.tallernumero2.datos.datosComidas;

public class historialAdaptador extends ArrayAdapter<datosComidas> {

    List<datosComidas> comidas;
    private Activity context;

    public historialAdaptador(@NonNull Activity context, @NonNull List<datosComidas> comidas) {
        super(context, R.layout.activity_historial_adaptador, comidas);
        this.context = context;
        this.comidas = comidas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowview=null;
        if (view == null)
            rowview = layoutInflater.inflate(R.layout.activity_historial_adaptador,null);
        else rowview = view;

        TextView tvFecha = rowview.findViewById(R.id.tvFecha);
        TextView tvTotal = rowview.findViewById(R.id.tvTotal);

        tvFecha.setText("Fecha : " + comidas.get(position).getFecha());
        tvTotal.setText("Total pagado : " + comidas.get(position).getTotal());

        return rowview;
    }
}