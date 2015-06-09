package com.mobile.sheleg.shelegmobile.objects;

import android.provider.BaseColumns;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Table(name = "Locations", id = BaseColumns._ID)
public class Location extends Model {

    public static final String OBJECT_ID = "objectId";
    public static final String NAME = "name";
    public static final String LOCATION_X = "locationX";
    public static final String LOCATION_Y = "locationY";

    @Expose
    @SerializedName("objectId")
    @Column(name = OBJECT_ID, notNull = true,
            unique = true,
            onNullConflict = Column.ConflictAction.FAIL,
            onUniqueConflict = Column.ConflictAction.REPLACE)
    private String objectId;

    @Expose
    @SerializedName("name")
    @Column(name = NAME, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private String name;

    @Expose
    @SerializedName("locationX")
    @Column(name = LOCATION_X, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private double locationX;

    @Expose
    @SerializedName("locationY")
    @Column(name = LOCATION_Y, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private double locationY;

    // Ctor
    public Location() {
        super();
    }

    public Location(String objectId, String name, double locationX, double locationY) {
        this.objectId = objectId;
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getName() {
        return name;
    }

    public double getLocationX() {
        return locationX;
    }

    public double getLocationY() {
        return locationY;
    }
}
