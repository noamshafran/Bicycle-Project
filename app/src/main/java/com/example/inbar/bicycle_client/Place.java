package com.example.inbar.bicycle_client;

import android.support.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;

public class Place implements Comparable<Place> {

    String category;
    String name;
    double lat;
    double lng;
    String Strlat;
    String Strlng ;
    double rating;
    boolean isInWayPoint=false;
    @Override
    public int compareTo(@NonNull Place o) {
        return Double.compare(o.rating, this.rating);

    }
    public String toStringForSaveInFile(){
        String data;
        if(isInWayPoint)
            data=category+"!"+name+"!"+Strlat+"!"+Strlng+"!"+rating+"!"+"true";
        else
            data=category+"!"+name+"!"+Strlat+"!"+Strlng+"!"+rating+"!"+"false";
        return data;

    }
    @Override
    public String toString() {
        String data;
        if(isInWayPoint)
          data=category+","+name+","+Strlat+","+Strlng+","+rating+","+"true";
        else
            data=category+","+name+","+Strlat+","+Strlng+","+rating+","+"false";
        return data;

    }

    public LatLng getPosition(){
        return new LatLng(this.lat,this.lng);
    }
}
