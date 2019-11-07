package edu.cnm.deepdive.temp_converter_android;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  public EditText fahrenheit;
  public EditText celsius;
  public EditText kelvin;

  public RadioButton farToCel;
  public RadioButton farToKel;
  public RadioButton celToFar;
  public RadioButton celToKel;
  public RadioButton kelToFar;
  public RadioButton kelToCel;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fahrenheit= findViewById(R.id.fahrenheit);
    celsius= findViewById(R.id.celsius);
    kelvin= findViewById(R.id.kelvin);
    farToCel= findViewById(R.id.fahrenheit_to_celsius);
    farToKel= findViewById(R.id.fahrenheit_to_kelvin);
    celToFar= findViewById(R.id.celsius_to_fahrenheit);
    celToKel= findViewById(R.id.celsius_to_kelvin);
    kelToFar= findViewById(R.id.kelvin_to_fahrenheit);
    kelToCel= findViewById(R.id.kelvin_to_celsius);

  }

  public void convert1(View view){
    double value=new Double(fahrenheit.getText().toString());
    if(farToCel.isChecked()) {
     value= TempConverter.fahrenheitToCelsius(value);
    }else{
      value= TempConverter.faharenheitToKelvin(value);
    }
     fahrenheit.setText(new Double(value).toString());
  }

  




}
