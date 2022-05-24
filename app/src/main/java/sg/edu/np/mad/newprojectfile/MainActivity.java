package sg.edu.np.mad.newprojectfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent next = getIntent();
        String v = next.getStringExtra("randval");
        String d = next.getStringExtra("des");
        TextView textview = findViewById(R.id.textView4);
        TextView textview1 = findViewById(R.id.textView5);
        //user chengann = new user("royce","owg",1,false);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent owen = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(owen);
            }
        });
        int pos = next.getIntExtra("pos1",0);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ListActivity.list2.get(pos).followed  ){
                    ListActivity.list2.get(pos).followed = false;
                    btn.setText("follow");
                    Toast.makeText(getApplicationContext(),"follow",Toast.LENGTH_LONG).show();

                }
                else{
                    btn.setText("unfollow");
                    ListActivity.list2.get(pos).followed = true;
                    Toast.makeText(MainActivity.this, "unfollow",Toast.LENGTH_LONG).show();
                }

            }
        });

        textview.setText(v);
        textview1.setText(d);

        if(ListActivity.list2.get(pos).followed){
            btn.setText("Unfollow");
        }
        else{
            btn.setText("follow");
        }
    }
}