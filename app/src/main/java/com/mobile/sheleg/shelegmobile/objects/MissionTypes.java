package com.mobile.sheleg.shelegmobile.objects;

import android.provider.BaseColumns;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Table(name = "MissionTypes", id = BaseColumns._ID)
public class MissionTypes extends Model {

    public static final String OBJECT_ID = "objectId";
    public static final String TYPE_NAME = "type_name";
    public static final String PICTURE_ID = "picture_id";

    @Expose
    @SerializedName("objectId")
    @Column(name = OBJECT_ID, notNull = true,
            unique = true,
            onNullConflict = Column.ConflictAction.FAIL,
            onUniqueConflict = Column.ConflictAction.REPLACE)
    private String objectId;

    @Expose
    @SerializedName("typeName")
    @Column(name = TYPE_NAME, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private String typeName;

    @Expose
    @SerializedName("pictureId")
    @Column(name = PICTURE_ID, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private int pictureId;

    // Ctor
    public MissionTypes() {
        super();
    }

    public MissionTypes(String objectId, String typeName, int pictureId) {
        this.objectId = objectId;
        this.typeName = typeName;
        this.pictureId = pictureId;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getPictureId() {
        return pictureId;
    }
}
