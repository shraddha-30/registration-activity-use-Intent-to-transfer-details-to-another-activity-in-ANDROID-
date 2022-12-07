package com.example.intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
TextView t1;
EditText pass,user;
Button b1;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
user=(EditText)findViewById(R.id.user);
pass=(EditText)findViewById(R.id.pass);
b1=(Button)findViewById(R.id.b1);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
String username = user.getText().toString();
String password = pass.getText().toString();
if (username.equals(&quot;Admin&quot;) &amp;&amp; password.equals(&quot;123&quot;)) {
Intent i = new Intent(getApplicationContext(), MainActivity2.class);
startActivity(i);

Name:- Shraddha vilas Dabade
TYCS 8218
Android programming

} else {
Intent i = new Intent(getApplicationContext(), MainActivity.class);
startActivity(i);
}
}
});
}
}
