package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hotel extends AppCompatActivity {

    private Button btnNukkad;
    private Button btnSagar;
    private Button btnYaadgaar;
    private Button btnSalwa;
    private Button btnSahil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        Intent intent = getIntent();
        Bundle b = getIntent().getExtras();
        final String message = b.getString("msg");

        btnNukkad = (Button) findViewById(R.id.btnNukkad);
        btnSagar = (Button) findViewById(R.id.btnSagar);
        btnYaadgaar = (Button) findViewById(R.id.btnYaadgaar);
        btnSahil = (Button) findViewById(R.id.btnSahil);
        btnSalwa = (Button) findViewById(R.id.btnSalwa);

        btnNukkad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hotel.this,Order_page.class);
                intent.putExtra("hotel","Nukkad");
                intent.putExtra("dish",message);


                switch(message) {
                    //BREAKFAST
                    case "CholeBature":
                        intent.putExtra("price","30");
                        break;
                    case "Dhokla":
                        intent.putExtra("price","8");
                        break;
                    case "PavBhaji":
                        intent.putExtra("price","25");
                        break;
                    case "MasalaDosa":
                        intent.putExtra("price","20");
                        break;
                    case "KeemaPav":
                        intent.putExtra("price","25");
                        break;
                        //DINNER
                    case "SchewanFriedRice":
                        intent.putExtra("price","60");
                        break;
                    case "Biryani":
                        intent.putExtra("price","40");
                        break;
                    case "MatarPaneer":
                        intent.putExtra("price","25");
                        break;
                    case "ChickenTandoori":
                        intent.putExtra("price","60");
                        break;
                    case "ButterChicken":
                        intent.putExtra("price","80");
                        break;
                        //LUNCH
                    case "DalChawal":
                        intent.putExtra("price","30");
                        break;
                    case "DalFry":
                        intent.putExtra("price","20");
                        break;
                    case "ChikenSalan":
                        intent.putExtra("price","25");
                        break;
                    case "KeemaGhotala":
                        intent.putExtra("price","20");
                        break;
                    case "MalaiKhofta":
                        intent.putExtra("price","25");
                        break;
                        //SNACKS
                    case "Samosa":
                        intent.putExtra("price","9");
                        break;
                    case "ChickenRoll":
                        intent.putExtra("price","20");
                        break;
                    case "VadaPav":
                        intent.putExtra("price","10");
                        break;
                    case "Frankie":
                        intent.putExtra("price","20");
                        break;
                    case "Sandwitch":
                        intent.putExtra("price","25");
                        break;
                        //DESSERT
                    case "BreadPudding":
                        intent.putExtra("price","30");
                        break;
                    case "LemonTart":
                        intent.putExtra("price","25");
                        break;
                    case "CremeBrulee":
                        intent.putExtra("price","40");
                        break;
                    case "Frangipane":
                        intent.putExtra("price","30");
                        break;
                    case "Panama":
                        intent.putExtra("price","30");
                        break;



                }

                startActivity(intent);
            }
        });

        btnSagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hotel.this,Order_page.class);
                intent.putExtra("hotel","Sagar");
                intent.putExtra("dish",message);
                switch(message) {
                    //BREAKFAST
                    case "CholeBature":
                        intent.putExtra("price","30");
                        break;
                    case "Dhokla":
                        intent.putExtra("price","8");
                        break;
                    case "PavBhaji":
                        intent.putExtra("price","25");
                        break;
                    case "MasalaDosa":
                        intent.putExtra("price","20");
                        break;
                    case "KeemaPav":
                        intent.putExtra("price","25");
                        break;
                    //DINNER
                    case "SchewanFriedRice":
                        intent.putExtra("price","60");
                        break;
                    case "Biryani":
                        intent.putExtra("price","40");
                        break;
                    case "MatarPaneer":
                        intent.putExtra("price","25");
                        break;
                    case "ChickenTandoori":
                        intent.putExtra("price","60");
                        break;
                    case "ButterChicken":
                        intent.putExtra("price","80");
                        break;
                    //LUNCH
                    case "DalChawal":
                        intent.putExtra("price","30");
                        break;
                    case "DalFry":
                        intent.putExtra("price","20");
                        break;
                    case "ChikenSalan":
                        intent.putExtra("price","25");
                        break;
                    case "KeemaGhotala":
                        intent.putExtra("price","20");
                        break;
                    case "MalaiKhofta":
                        intent.putExtra("price","25");
                        break;
                    //SNACKS
                    case "Samosa":
                        intent.putExtra("price","9");
                        break;
                    case "ChickenRoll":
                        intent.putExtra("price","20");
                        break;
                    case "VadaPav":
                        intent.putExtra("price","10");
                        break;
                    case "Frankie":
                        intent.putExtra("price","20");
                        break;
                    case "Sandwitch":
                        intent.putExtra("price","25");
                        break;
                    //DESSERT
                    case "BreadPudding":
                        intent.putExtra("price","30");
                        break;
                    case "LemonTart":
                        intent.putExtra("price","25");
                        break;
                    case "CremeBrulee":
                        intent.putExtra("price","40");
                        break;
                    case "Frangipane":
                        intent.putExtra("price","30");
                        break;
                    case "Panama":
                        intent.putExtra("price","30");
                        break;

                }

                startActivity(intent);
            }
        });


        btnYaadgaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hotel.this,Order_page.class);
                intent.putExtra("hotel","Yaadgaar");
                intent.putExtra("dish",message);

                switch(message) {
                    //BREAKFAST
                    case "CholeBature":
                        intent.putExtra("price","30");
                        break;
                    case "Dhokla":
                        intent.putExtra("price","8");
                        break;
                    case "PavBhaji":
                        intent.putExtra("price","25");
                        break;
                    case "MasalaDosa":
                        intent.putExtra("price","20");
                        break;
                    case "KeemaPav":
                        intent.putExtra("price","25");
                        break;
                    //DINNER
                    case "SchewanFriedRice":
                        intent.putExtra("price","60");
                        break;
                    case "Biryani":
                        intent.putExtra("price","40");
                        break;
                    case "MatarPaneer":
                        intent.putExtra("price","25");
                        break;
                    case "ChickenTandoori":
                        intent.putExtra("price","60");
                        break;
                    case "ButterChicken":
                        intent.putExtra("price","80");
                        break;
                    //LUNCH
                    case "DalChawal":
                        intent.putExtra("price","30");
                        break;
                    case "DalFry":
                        intent.putExtra("price","20");
                        break;
                    case "ChikenSalan":
                        intent.putExtra("price","25");
                        break;
                    case "KeemaGhotala":
                        intent.putExtra("price","20");
                        break;
                    case "MalaiKhofta":
                        intent.putExtra("price","25");
                        break;
                    //SNACKS
                    case "Samosa":
                        intent.putExtra("price","9");
                        break;
                    case "ChickenRoll":
                        intent.putExtra("price","20");
                        break;
                    case "VadaPav":
                        intent.putExtra("price","10");
                        break;
                    case "Frankie":
                        intent.putExtra("price","20");
                        break;
                    case "Sandwitch":
                        intent.putExtra("price","25");
                        break;
                    //DESSERT
                    case "BreadPudding":
                        intent.putExtra("price","30");
                        break;
                    case "LemonTart":
                        intent.putExtra("price","25");
                        break;
                    case "CremeBrulee":
                        intent.putExtra("price","40");
                        break;
                    case "Frangipane":
                        intent.putExtra("price","30");
                        break;
                    case "Panama":
                        intent.putExtra("price","30");
                        break;



                }

                startActivity(intent);
            }
        });


        btnSalwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hotel.this,Order_page.class);
                intent.putExtra("hotel","Salwa");
                intent.putExtra("dish",message);

                switch(message) {
                    //BREAKFAST
                    case "CholeBature":
                        intent.putExtra("price","30");
                        break;
                    case "Dhokla":
                        intent.putExtra("price","8");
                        break;
                    case "PavBhaji":
                        intent.putExtra("price","25");
                        break;
                    case "MasalaDosa":
                        intent.putExtra("price","20");
                        break;
                    case "KeemaPav":
                        intent.putExtra("price","25");
                        break;
                    //DINNER
                    case "SchewanFriedRice":
                        intent.putExtra("price","60");
                        break;
                    case "Biryani":
                        intent.putExtra("price","40");
                        break;
                    case "MatarPaneer":
                        intent.putExtra("price","25");
                        break;
                    case "ChickenTandoori":
                        intent.putExtra("price","60");
                        break;
                    case "ButterChicken":
                        intent.putExtra("price","80");
                        break;
                    //LUNCH
                    case "DalChawal":
                        intent.putExtra("price","30");
                        break;
                    case "DalFry":
                        intent.putExtra("price","20");
                        break;
                    case "ChikenSalan":
                        intent.putExtra("price","25");
                        break;
                    case "KeemaGhotala":
                        intent.putExtra("price","20");
                        break;
                    case "MalaiKhofta":
                        intent.putExtra("price","25");
                        break;
                    //SNACKS
                    case "Samosa":
                        intent.putExtra("price","9");
                        break;
                    case "ChickenRoll":
                        intent.putExtra("price","20");
                        break;
                    case "VadaPav":
                        intent.putExtra("price","10");
                        break;
                    case "Frankie":
                        intent.putExtra("price","20");
                        break;
                    case "Sandwitch":
                        intent.putExtra("price","25");
                        break;
                    //DESSERT
                    case "BreadPudding":
                        intent.putExtra("price","30");
                        break;
                    case "LemonTart":
                        intent.putExtra("price","25");
                        break;
                    case "CremeBrulee":
                        intent.putExtra("price","40");
                        break;
                    case "Frangipane":
                        intent.putExtra("price","30");
                        break;
                    case "Panama":
                        intent.putExtra("price","30");
                        break;

                }

                startActivity(intent);
            }
        });


        btnSahil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hotel.this,Order_page.class);
                intent.putExtra("hotel","Sahil");
                intent.putExtra("dish",message);

                switch(message) {
                    //BREAKFAST
                    case "CholeBature":
                        intent.putExtra("price", "30");
                        break;
                    case "Dhokla":
                        intent.putExtra("price", "8");
                        break;
                    case "PavBhaji":
                        intent.putExtra("price", "25");
                        break;
                    case "MasalaDosa":
                        intent.putExtra("price", "20");
                        break;
                    case "KeemaPav":
                        intent.putExtra("price", "25");
                        break;
                    //DINNER
                    case "SchewanFriedRice":
                        intent.putExtra("price", "60");
                        break;
                    case "Biryani":
                        intent.putExtra("price", "40");
                        break;
                    case "MatarPaneer":
                        intent.putExtra("price", "25");
                        break;
                    case "ChickenTandoori":
                        intent.putExtra("price", "60");
                        break;
                    case "ButterChicken":
                        intent.putExtra("price", "80");
                        break;
                    //LUNCH
                    case "DalChawal":
                        intent.putExtra("price", "30");
                        break;
                    case "DalFry":
                        intent.putExtra("price", "20");
                        break;
                    case "ChikenSalan":
                        intent.putExtra("price", "25");
                        break;
                    case "KeemaGhotala":
                        intent.putExtra("price", "20");
                        break;
                    case "MalaiKhofta":
                        intent.putExtra("price", "25");
                        break;
                    //SNACKS
                    case "Samosa":
                        intent.putExtra("price", "9");
                        break;
                    case "ChickenRoll":
                        intent.putExtra("price", "20");
                        break;
                    case "VadaPav":
                        intent.putExtra("price", "10");
                        break;
                    case "Frankie":
                        intent.putExtra("price", "20");
                        break;
                    case "Sandwitch":
                        intent.putExtra("price", "25");
                        break;
                    //DESSERT
                    case "BreadPudding":
                        intent.putExtra("price", "30");
                        break;
                    case "LemonTart":
                        intent.putExtra("price", "25");
                        break;
                    case "CremeBrulee":
                        intent.putExtra("price", "40");
                        break;
                    case "Frangipane":
                        intent.putExtra("price", "30");
                        break;
                    case "Panama":
                        intent.putExtra("price", "30");
                        break;
                }

                startActivity(intent);
            }
        });
    }
}
