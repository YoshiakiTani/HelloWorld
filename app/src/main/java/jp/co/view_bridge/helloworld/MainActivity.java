package jp.co.view_bridge.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final TextView name_input = findViewById(R.id.txt_name_input);
         final TextView output = findViewById(R.id.txt_output);
         Button say_hello = findViewById(R.id.btn_say_hello);
         Button clear = findViewById(R.id.btn_clear);

        say_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("Hello "+name_input.getText());
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
            }
        });
    }
}
