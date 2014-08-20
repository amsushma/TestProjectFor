package main.altimetrik.com.altimetriktest.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import main.altimetrik.com.altimetriktest.R;
import main.altimetrik.com.altimetriktest.common.AltimetrikUtils;


public class LoginActivity extends Activity {
private EditText mUserName;
private EditText mUserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserName= (EditText) findViewById(R.id.usernameED);
        mUserPassword= (EditText) findViewById(R.id.passwordED);
    }

    /**
     * Function which validates and does the login.
     * @param v - View instance.
     */
    public void login(View v) {
       String userName =  mUserName.getText().toString();
       String password = mUserPassword.getText().toString();
        if(!AltimetrikUtils.isNotValidFormField(userName)) {
            Toast.makeText(this,"Pleas enter valid user name",Toast.LENGTH_SHORT).show();
        }
        else if(!AltimetrikUtils.isNotValidFormField(password)) {
            Toast.makeText(this,"Pleas enter valid password",Toast.LENGTH_SHORT).show();
        }
        else {
            startActivity(new Intent(this,HomeActivity.class).putExtra("username",userName));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
