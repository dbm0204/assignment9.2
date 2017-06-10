package com.example.dbm0204.assignment91;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static TextView text;
    private static Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
        text=(TextView) findViewById(R.id.text);

    }

    public void initToolBar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("My Custom Toolbar");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "clicking the toolbar!", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.red:
                text.setTextColor(Color.parseColor("red"));
                Toast.makeText(getApplicationContext(),"Red Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.blue:
                text.setTextColor(Color.parseColor("blue"));
                Toast.makeText(getApplicationContext(),"Blue Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.green:
                text.setTextColor(Color.parseColor("green"));
                Toast.makeText(getApplicationContext(),"Green Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onClick(View view) {

    }
}
