package com.example.josvlaar.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friends = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Friend friend = new Friend("Arya",
                "Played part in the dissapointing ending of Littlefinger",
                getResources().getIdentifier("arya", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Cersei",
                "Miss my baby boys </3",
                getResources().getIdentifier("cersei", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Daenerys",
                "Daenerys Stormborn, Queen of the Andals and first of men, breaker of chains",
                getResources().getIdentifier("daenerys", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Jaime",
                "Kingslayer",
                getResources().getIdentifier("jaime", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Jon",
                "I know nothing",
                getResources().getIdentifier("jon", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("jorah",
                "Shoutouts to my girl Danny!",
                getResources().getIdentifier("jorah", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Margaery",
                "I won miss seven kingdoms once",
                getResources().getIdentifier("margaery", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Melisandre",
                "The night is dark and full of terror",
                getResources().getIdentifier("melisandre", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Sansa",
                "I had no real proof for killing Littlefinger",
                getResources().getIdentifier("sansa", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Tyrion",
                "I'm guilty of a far more monstrous crime: I'm guilty of being a dwarf!",
                getResources().getIdentifier("tyrion", "drawable", getPackageName()));
        friends.add(friend);

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        GridView grid = findViewById(R.id.grid);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new GridItemClickListener());
    }

    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Friend friend = (Friend) parent.getItemAtPosition(position);
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("friend", friend);
            startActivity(intent);
        }
    }
}
