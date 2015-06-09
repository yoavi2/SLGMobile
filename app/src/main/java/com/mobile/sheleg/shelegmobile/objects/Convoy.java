package com.mobile.sheleg.shelegmobile.objects;

import android.provider.BaseColumns;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Table(name = "Convoys", id = BaseColumns._ID)
public class Convoy extends Model {

    public static final String OBJECT_ID = "objectId";
    public static final String CONVOY_NUMBER = "convoy_number";
    public static final String HEAD_ID = "head_id";
    public static final String TAIL_ID = "tail_id";
    public static final String ZAKAH_ID = "zakah_id";

    @Expose
    @SerializedName("objectId")
    @Column(name = OBJECT_ID, notNull = true,
            unique = true,
            onNullConflict = Column.ConflictAction.FAIL,
            onUniqueConflict = Column.ConflictAction.REPLACE)
    private String objectId;

    @Expose
    @SerializedName("convoyNumber")
    @Column(name = CONVOY_NUMBER, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private String convoyNumber;

    @Expose
    @SerializedName("headId")
    @Column(name = HEAD_ID, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private String headId;

    @Expose
    @SerializedName("tailId")
    @Column(name = TAIL_ID, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private String tailId;

    @Expose
    @SerializedName("zakahId")
    @Column(name = ZAKAH_ID, notNull = true,
            onNullConflict = Column.ConflictAction.FAIL)
    private String zakahId;

    // Ctor
    public Convoy() {
        super();
    }

    public Convoy(String objectId, String convoyNumber, String headId, String tailId, String zakahId) {
        this.objectId = objectId;
        this.convoyNumber = convoyNumber;
        this.headId = headId;
        this.tailId = tailId;
        this.zakahId = zakahId;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getConvoyNumber() {
        return convoyNumber;
    }

    public String getHeadId() {
        return headId;
    }

    public String getTailId() {
        return tailId;
    }

    public String getZakahId() {
        return zakahId;
    }
}
