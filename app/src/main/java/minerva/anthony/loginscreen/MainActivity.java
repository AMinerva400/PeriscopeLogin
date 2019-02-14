package minerva.anthony.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTwitter, btnPhoneNumber;
        btnTwitter = findViewById(R.id.btnTwitter);
        btnPhoneNumber = findViewById(R.id.btnPhoneNumber);
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Signing in with Twitter", Toast.LENGTH_SHORT).show();
            }
        });
        btnPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Signing in with Phone Number", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
