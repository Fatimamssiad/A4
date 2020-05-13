package terminal1.a4.tarjeta_embarque;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import terminal1.a4.listanegocios.ListaNegocios;
import terminal1.a4.listanegocios.Perfil;
import terminal1.a4.loginui.R;
import terminal1.a4.loginui.mapa;
import terminal1.a4.loginui.mis_vuelos;
import terminal1.a4.loginui.servicios;

public class Tembarque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarjeta_embarque);
        botndevuelos();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_vuelos:
                        break;
                    case R.id.ic_mapa:
                        Intent intent1 = new Intent(Tembarque.this, mapa.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_servicios:
                        Intent intent2 = new Intent(Tembarque.this, servicios.class);
                        startActivity(intent2);
                        break;
                    case R.id.ic_tiendas:
                        Intent intent3 = new Intent(Tembarque.this, ListaNegocios.class);
                        startActivity(intent3);
                        break;
                    case R.id.ic_perfil:
                        Intent intent4 = new Intent(Tembarque.this, Perfil.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }
    private void botndevuelos(){
        Button misvuelos = (Button) findViewById(R.id.buttonotrosvuelo);
        misvuelos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tembarque.this, mis_vuelos.class));
            }
        });
    }
}


