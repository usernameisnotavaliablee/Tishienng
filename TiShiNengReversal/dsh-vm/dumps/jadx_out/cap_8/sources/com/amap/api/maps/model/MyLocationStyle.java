package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MyLocationStyle implements android.os.Parcelable {
    public static final com.amap.api.maps.model.MyLocationStyleCreator CREATOR = null;
    public static final java.lang.String ERROR_CODE = "errorCode";
    public static final java.lang.String ERROR_INFO = "errorInfo";
    public static final java.lang.String LOCATION_TYPE = "locationType";
    public static final int LOCATION_TYPE_FOLLOW = 2;
    public static final int LOCATION_TYPE_FOLLOW_NO_CENTER = 6;
    public static final int LOCATION_TYPE_LOCATE = 1;
    public static final int LOCATION_TYPE_LOCATION_ROTATE = 4;
    public static final int LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER = 5;
    public static final int LOCATION_TYPE_MAP_ROTATE = 3;
    public static final int LOCATION_TYPE_MAP_ROTATE_NO_CENTER = 7;
    public static final int LOCATION_TYPE_SHOW = 0;
    private long interval;
    private float mAnchorU;
    private float mAnchorV;
    private int mLocationType;
    private com.amap.api.maps.model.BitmapDescriptor mMyLocationIcon;
    private int mRadiusFillColor;
    private int mStrokeColor;
    private float mStrokeWidth;
    private boolean myLocationVisible;

    static {
            com.amap.api.maps.model.MyLocationStyleCreator r0 = new com.amap.api.maps.model.MyLocationStyleCreator
            r0.<init>()
            com.amap.api.maps.model.MyLocationStyle.CREATOR = r0
            return
    }

    public MyLocationStyle() {
            r3 = this;
            r3.<init>()
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.mAnchorU = r0
            r3.mAnchorV = r0
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 100
            r2 = 0
            int r0 = android.graphics.Color.argb(r1, r2, r2, r0)
            r3.mRadiusFillColor = r0
            r0 = 255(0xff, float:3.57E-43)
            r1 = 220(0xdc, float:3.08E-43)
            int r0 = android.graphics.Color.argb(r0, r2, r2, r1)
            r3.mStrokeColor = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mStrokeWidth = r0
            r0 = 4
            r3.mLocationType = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.interval = r0
            r0 = 1
            r3.myLocationVisible = r0
            return
    }

    public com.amap.api.maps.model.MyLocationStyle anchor(float r1, float r2) {
            r0 = this;
            r0.mAnchorU = r1
            r0.mAnchorV = r2
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getAnchorU() {
            r1 = this;
            float r0 = r1.mAnchorU
            return r0
    }

    public float getAnchorV() {
            r1 = this;
            float r0 = r1.mAnchorV
            return r0
    }

    public long getInterval() {
            r2 = this;
            long r0 = r2.interval
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getMyLocationIcon() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.mMyLocationIcon
            return r0
    }

    public int getMyLocationType() {
            r1 = this;
            int r0 = r1.mLocationType
            return r0
    }

    public int getRadiusFillColor() {
            r1 = this;
            int r0 = r1.mRadiusFillColor
            return r0
    }

    public int getStrokeColor() {
            r1 = this;
            int r0 = r1.mStrokeColor
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            float r0 = r1.mStrokeWidth
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle interval(long r1) {
            r0 = this;
            r0.interval = r1
            return r0
    }

    public boolean isMyLocationShowing() {
            r1 = this;
            boolean r0 = r1.myLocationVisible
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle myLocationIcon(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.mMyLocationIcon = r1
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle myLocationType(int r1) {
            r0 = this;
            r0.mLocationType = r1
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle radiusFillColor(int r1) {
            r0 = this;
            r0.mRadiusFillColor = r1
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle showMyLocation(boolean r1) {
            r0 = this;
            r0.myLocationVisible = r1
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle strokeColor(int r1) {
            r0 = this;
            r0.mStrokeColor = r1
            return r0
    }

    public com.amap.api.maps.model.MyLocationStyle strokeWidth(float r1) {
            r0 = this;
            r0.mStrokeWidth = r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r2.mMyLocationIcon
            r3.writeParcelable(r0, r4)
            float r4 = r2.mAnchorU
            r3.writeFloat(r4)
            float r4 = r2.mAnchorV
            r3.writeFloat(r4)
            int r4 = r2.mRadiusFillColor
            r3.writeInt(r4)
            int r4 = r2.mStrokeColor
            r3.writeInt(r4)
            float r4 = r2.mStrokeWidth
            r3.writeFloat(r4)
            int r4 = r2.mLocationType
            r3.writeInt(r4)
            long r0 = r2.interval
            r3.writeLong(r0)
            boolean r4 = r2.myLocationVisible
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r4
            r3.writeBooleanArray(r0)
            return
    }
}
