package com.deonvanooijen.bucketlist;

import androidx.annotation.DrawableRes;

public class BucketListEntry {

    String heading;
    String description;
    int image;
    float rating;

    // Constructor

    public BucketListEntry(String heading, String description, @DrawableRes int image, float rating) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
