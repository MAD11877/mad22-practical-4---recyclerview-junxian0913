package sg.edu.np.mad.newprojectfile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<user> list = new ArrayList<>();

        for (int i = 0; i<20; i++){
            Random rand = new Random();
            int ow = rand.nextInt(1000000000);
            int jun = rand.nextInt(1000000000);
            int xian = rand.nextInt(1000000000);
            String name, description;
            boolean followed;


            name = "Name " +   ow ;
            description = "Description  "+ jun;
            followed = rand.nextBoolean();
            user royce = new user(name, description, xian,followed);
            list.add(royce);



        }
        RecyclerView justin = findViewById(R.id.picture);

        Messageadapter ks = new Messageadapter(list);

        LinearLayoutManager vic = new LinearLayoutManager(this);
        justin.setLayoutManager(vic);
        justin.setItemAnimator(new DefaultItemAnimator());
        justin.setAdapter(ks);

        ImageView picture = findViewById(R.id.imageView4);
        ListActivity obj = new ListActivity();

        user chengann = new user("junxian","royce",1,false);








    }
}