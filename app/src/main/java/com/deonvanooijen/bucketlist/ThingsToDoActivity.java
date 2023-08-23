package com.deonvanooijen.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Parasail", "Preferably over a beautiful clear ocean.", R.drawable.parasail, 4.5f),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle.", R.drawable.northernlights, 4),
                new BucketListEntry("Survival", "Somewhere in a forest with fresh drinkable water like Norway.", R.drawable.survival, 4F),
                new BucketListEntry("Scuba Dive", "In Koh Tao, Thailand.", R.drawable.scubadive, 4),
                new BucketListEntry("Safari", "In Kenya, Tanzania or Zimbabwe.", R.drawable.safari, 3.5f),
                new BucketListEntry("Hot Air Balloon", "Preferably at night.", R.drawable.hotairballoon, 4),
                new BucketListEntry("Zipline", "Somewhere through a jungle.", R.drawable.zipline, 4.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);

    }
}