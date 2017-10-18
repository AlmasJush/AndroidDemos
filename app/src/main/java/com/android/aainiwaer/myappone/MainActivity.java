package com.android.aainiwaer.myappone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          EditText num1 = (EditText)findViewById(R.id.firstNumEditText);
                                          EditText num2 = (EditText)findViewById(R.id.secondNumEditText);
                                          TextView rest = (TextView)findViewById(R.id.resultTextView);

                                          int n1 = Integer.parseInt(num1.getText().toString());
                                          int n2 = Integer.parseInt(num2.getText().toString());
                                          int result = n1 + n2;

                                          rest.setText(result+"");

                                      }
                                  }
            );
    }
}
