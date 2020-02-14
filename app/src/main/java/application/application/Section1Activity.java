package application.application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Section1Activity extends AppCompatActivity {

    Spinner gender;

    String gender_option[] = {"นาย","นาง","นางสาว"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section1);

        final Button nextBtn = (Button) findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent section3 = new Intent(getApplicationContext(), Section3Activity.class);
                startActivity(section3);
            }
        });


        gender = (Spinner) findViewById(R.id.editNameTitle);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,gender_option);

        gender.setAdapter(adapter);

        gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
