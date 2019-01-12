package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Signup extends AppCompatActivity {

    private Button btnGoLogin;
    private FirebaseAuth mAuth;
    private EditText edtEmail,edtPass,edtConformPass,edtName,edtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();

        edtConformPass = (EditText) findViewById(R.id.edtConformPass);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPass = (EditText) findViewById(R.id.edtPass);
        edtName = (EditText) findViewById(R.id.edtName);
        edtNumber = (EditText) findViewById(R.id.edtNumber);


        btnGoLogin = (Button) findViewById(R.id.btnGoLogin);

        btnGoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getEmail = edtEmail.getText().toString().trim();
                String getpass = edtPass.getText().toString().trim();
                String getConfpass = edtConformPass.getText().toString().trim();
                if (getEmail != null && getpass != null && getConfpass !=null &&
                        edtName.getText().toString() != null
                        && edtNumber.getText().toString() != null) {
                    if(getpass.equals(getConfpass)&& getpass.length()> 6){
                        Callsignup(getEmail, getpass);

                    }
                    else{
                      Toast.makeText(Signup.this,"Weak Password or Password do not Match.",Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(Signup.this,"Please fill the detail",Toast.LENGTH_SHORT).show();

                }
            }
        });



    }

    private void Callsignup(String Email,String Pass) {
        mAuth.createUserWithEmailAndPassword(Email, Pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("Frostyy", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(Signup.this, "Signup Sucessfull.",
                                    Toast.LENGTH_SHORT).show();
                            Intent ll = new Intent(Signup.this, login.class);
                            startActivity(ll);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("Frostyy", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(Signup.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });
    }
}
