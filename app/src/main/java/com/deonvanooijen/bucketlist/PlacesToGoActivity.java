package com.deonvanooijen.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Vietnam", "Con Dao Islands, Hanoi, Halong Bay, Hoi an, Lang co.", R.drawable.vietnam, 4),
                new BucketListEntry("New Zealand", "Hiking through the nature in Whangarei, Rotorua and Dunedin.", R.drawable.newzealand, 4),
                new BucketListEntry("Japan", "Go back and explore other islands like Hokkaido and Okinawa.", R.drawable.japan, 5),
                new BucketListEntry("Iceland", "Dynjandi Waterfall, nature reserves and perhaps the Northern Lights too!", R.drawable.iceland, 4.5f),
                new BucketListEntry("South Korea", "Explore Seoul, Busan and Daegu.", R.drawable.southkorea, 4.5f),
                new BucketListEntry("Canada", "Vancouver, Ottawa and Montréal.", R.drawable.canada, 4),
                new BucketListEntry("United States", "Visit friends in Los Angeles.", R.drawable.losangeles, 4)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);

    }
}