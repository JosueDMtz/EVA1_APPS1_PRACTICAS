package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Weather[] weathers = {
            new Weather("Chihuahua", 20, "Lluvia ligera", R.drawable.light_rain),
            new Weather("Cd. Juárez", 25, "Nublado", R.drawable.cloudy),
            new Weather("Camargo", 23.2, "Vientos moderados", R.drawable.atmospher),
            new Weather("Parral", 15, "Lluvia ligera", R.drawable.light_rain),
            new Weather("Jimenez", 30, "Soleado", R.drawable.sunny),
            new Weather("Cuauhtemoc", 12.5, "Nevadas intensas", R.drawable.snow),
            new Weather("Aldama", 24, "Lluvias intensas", R.drawable.thunderstorm),
            new Weather("Casas Grandes", 30, "Lluvioso", R.drawable.rainy),
            new Weather("Ojinaga", 32, "Nublado", R.drawable.cloudy),
            new Weather("Creel", 18, "Tornados", R.drawable.tornado),
            new Weather("Batopilas", 17.2, "Lluvias intensas", R.drawable.thunderstorm),
    };
    ListView lstVwWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwWeather = findViewById(R.id.lstVwWeather);
        lstVwWeather.setAdapter(new WeatherAdapter(
                this,
                R.layout.layout_weather,
                weathers
        ));
    }
}