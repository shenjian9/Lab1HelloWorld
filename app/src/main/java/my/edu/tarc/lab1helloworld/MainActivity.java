package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextName, editTextAge;
    TextView textViewMessage;

    @Override

    //onCreate() = main () function in java
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView()= Show the UI
        //R = resources class
        setContentView(R.layout.activity_main);

        // Link UI to Program
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void displayMessage (View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());

        textViewMessage.setText("HI " + name + " , you will be " + age + " in 2018");


    }
    public void ResetMessage (View view){

        editTextName.clearComposingText();
        editTextAge.clearComposingText();

        textViewMessage.setText("HI ");


    }
}
