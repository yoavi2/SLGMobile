package com.mobile.sheleg.shelegmobile.objects;

import com.mobile.sheleg.shelegmobile.R;

// TODO: Figure out how to use context in this enum in order to get typeName from Strings.xml
// TODO: We also need to get VehicleType by index. This is the primary goal as we will be saving this index in the internal DB
public enum VehicleTypes {
                TANK(1, new VehicleType("Tank", R.mipmap.ic_launcher)),
                CAR(2, new VehicleType("Car", R.mipmap.ic_launcher)),
                BUS(3, new VehicleType("Bus", R.mipmap.ic_launcher));


    private int typeId;
    private VehicleType type;
    private VehicleTypes(int typeId,VehicleType type) {
        this.typeId = typeId;
        this.type = type;
    }
    public VehicleType getVehicleType(){
            return type;
    }

    public static class VehicleType {
        private String typeName;
        private int pictureResId;

        public VehicleType(String typeName, int pictureResId) {
            this.typeName = typeName;
            this.pictureResId = pictureResId;
        }

        public String getTypeName() {
            return typeName;
        }

        public int getPictureResId() {
            return pictureResId;
        }
    }
}


