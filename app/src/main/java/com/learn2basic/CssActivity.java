package com.learn2basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CssActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);
    }
}

//public class PaginaUnu extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.pagina_unu);
//
//
//        Button butonBackToMainMenu = (Button) findViewById(R.id.backToMainMenu);
//        butonBackToMainMenu.setOnClickListener(new View.OnClickListener()
//
//        {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(PaginaUnu.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//}