package com.example.josvlaar.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friends = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Friend friend = new Friend("Arya",
                "Played part in the dissapointing ending of Littlefinger",
                getResources().getIdentifier("arya.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Cersei",
                "Miss my baby boys </3",
                getResources().getIdentifier("cersei.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Daenerys",
                "Daenerys Stormborn, Queen of the Andals and first of men, breaker of chains",
                getResources().getIdentifier("daenerys.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Jaime",
                "Kingslayer",
                getResources().getIdentifier("jaime.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Jon",
                "I know nothing",
                getResources().getIdentifier("jon.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("jorah",
                "Shoutouts to my girl Danny!",
                getResources().getIdentifier("jorah.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Margaery",
                "I won miss seven kingdoms once",
                getResources().getIdentifier("margaery.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Melisandre",
                "The night is dark and full of terror",
                getResources().getIdentifier("melisandre.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Sansa",
                "I had no real proof for killing Littlefinger",
                getResources().getIdentifier("sansa.png", "drawable", getPackageName()));
        friends.add(friend);

        friend = new Friend("Tyrion",
                "I'm guilty of a far more monstrous crime: I'm guilty of being a dwarf!",
                getResources().getIdentifier("tyrion.png", "drawable", getPackageName()));
        friends.add(friend);
    }
}
