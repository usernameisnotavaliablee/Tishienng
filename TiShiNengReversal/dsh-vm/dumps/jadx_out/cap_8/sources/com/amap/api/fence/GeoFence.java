package com.amap.api.fence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GeoFence implements android.os.Parcelable {
    public static final int ADDGEOFENCE_SUCCESS = 0;
    public static final java.lang.String BUNDLE_KEY_CUSTOMID = "customId";
    public static final java.lang.String BUNDLE_KEY_FENCE = "fence";
    public static final java.lang.String BUNDLE_KEY_FENCEID = "fenceid";
    public static final java.lang.String BUNDLE_KEY_FENCESTATUS = "event";
    public static final java.lang.String BUNDLE_KEY_LOCERRORCODE = "location_errorcode";
    public static final android.os.Parcelable.Creator<com.amap.api.fence.GeoFence> CREATOR = null;
    public static final int ERROR_CODE_EXISTS = 17;
    public static final int ERROR_CODE_FAILURE_AUTH = 7;
    public static final int ERROR_CODE_FAILURE_CONNECTION = 4;
    public static final int ERROR_CODE_FAILURE_PARSER = 5;
    public static final int ERROR_CODE_INVALID_PARAMETER = 1;
    public static final int ERROR_CODE_UNKNOWN = 8;
    public static final int ERROR_NO_VALIDFENCE = 16;
    public static final int STATUS_IN = 1;
    public static final int STATUS_LOCFAIL = 4;
    public static final int STATUS_OUT = 2;
    public static final int STATUS_STAYED = 3;
    public static final int STATUS_UNKNOWN = 0;
    public static final int TYPE_AMAPPOI = 2;
    public static final int TYPE_DISTRICT = 3;
    public static final int TYPE_POLYGON = 1;
    public static final int TYPE_ROUND = 0;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4903b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f4904c;

    /* renamed from: d, reason: collision with root package name */
    private android.app.PendingIntent f4905d;

    /* renamed from: e, reason: collision with root package name */
    private int f4906e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.fence.PoiItem f4907f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.List<com.amap.api.fence.DistrictItem> f4908g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List<java.util.List<com.amap.api.location.DPoint>> f4909h;

    /* renamed from: i, reason: collision with root package name */
    private float f4910i;

    /* renamed from: j, reason: collision with root package name */
    private long f4911j;

    /* renamed from: k, reason: collision with root package name */
    private int f4912k;
    private float l;
    private float m;
    private com.amap.api.location.DPoint n;
    private int o;
    private long p;
    private boolean q;
    private com.amap.api.location.AMapLocation r;


    static {
            com.amap.api.fence.GeoFence$1 r0 = new com.amap.api.fence.GeoFence$1
            r0.<init>()
            com.amap.api.fence.GeoFence.CREATOR = r0
            return
    }

    public GeoFence() {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f4905d = r0
            r1 = 0
            r6.f4906e = r1
            r6.f4907f = r0
            r6.f4908g = r0
            r2 = 0
            r6.f4910i = r2
            r3 = -1
            r6.f4911j = r3
            r5 = 1
            r6.f4912k = r5
            r6.l = r2
            r6.m = r2
            r6.n = r0
            r6.o = r1
            r6.p = r3
            r6.q = r5
            r6.r = r0
            return
    }

    protected GeoFence(android.os.Parcel r7) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f4905d = r0
            r1 = 0
            r6.f4906e = r1
            r6.f4907f = r0
            r6.f4908g = r0
            r2 = 0
            r6.f4910i = r2
            r3 = -1
            r6.f4911j = r3
            r5 = 1
            r6.f4912k = r5
            r6.l = r2
            r6.m = r2
            r6.n = r0
            r6.o = r1
            r6.p = r3
            r6.q = r5
            r6.r = r0
            java.lang.String r0 = r7.readString()
            r6.a = r0
            java.lang.String r0 = r7.readString()
            r6.f4903b = r0
            java.lang.String r0 = r7.readString()
            r6.f4904c = r0
            java.lang.Class<android.app.PendingIntent> r0 = android.app.PendingIntent.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r7.readParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r6.f4905d = r0
            int r0 = r7.readInt()
            r6.f4906e = r0
            java.lang.Class<com.amap.api.fence.PoiItem> r0 = com.amap.api.fence.PoiItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r7.readParcelable(r0)
            com.amap.api.fence.PoiItem r0 = (com.amap.api.fence.PoiItem) r0
            r6.f4907f = r0
            android.os.Parcelable$Creator<com.amap.api.fence.DistrictItem> r0 = com.amap.api.fence.DistrictItem.CREATOR
            java.util.ArrayList r0 = r7.createTypedArrayList(r0)
            r6.f4908g = r0
            float r0 = r7.readFloat()
            r6.f4910i = r0
            long r2 = r7.readLong()
            r6.f4911j = r2
            int r0 = r7.readInt()
            r6.f4912k = r0
            float r0 = r7.readFloat()
            r6.l = r0
            float r0 = r7.readFloat()
            r6.m = r0
            java.lang.Class<com.amap.api.location.DPoint> r0 = com.amap.api.location.DPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r7.readParcelable(r0)
            com.amap.api.location.DPoint r0 = (com.amap.api.location.DPoint) r0
            r6.n = r0
            int r0 = r7.readInt()
            r6.o = r0
            long r2 = r7.readLong()
            r6.p = r2
            int r0 = r7.readInt()
            if (r0 == 0) goto Lb7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.f4909h = r2
            r2 = 0
        La7:
            if (r2 >= r0) goto Lb7
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r3 = r6.f4909h
            android.os.Parcelable$Creator<com.amap.api.location.DPoint> r4 = com.amap.api.location.DPoint.CREATOR
            java.util.ArrayList r4 = r7.createTypedArrayList(r4)
            r3.add(r4)
            int r2 = r2 + 1
            goto La7
        Lb7:
            byte r0 = r7.readByte()
            if (r0 == 0) goto Lbe
            r1 = 1
        Lbe:
            r6.q = r1
            java.lang.Class<com.amap.api.location.AMapLocation> r0 = com.amap.api.location.AMapLocation.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r7 = r7.readParcelable(r0)
            com.amap.api.location.AMapLocation r7 = (com.amap.api.location.AMapLocation) r7
            r6.r = r7
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.amap.api.fence.GeoFence
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.amap.api.fence.GeoFence r4 = (com.amap.api.fence.GeoFence) r4
            java.lang.String r0 = r3.f4903b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = r4.f4903b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L24
            return r1
        L19:
            java.lang.String r0 = r3.f4903b
            java.lang.String r2 = r4.f4903b
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L24
            return r1
        L24:
            com.amap.api.location.DPoint r0 = r3.n
            if (r0 != 0) goto L2d
            com.amap.api.location.DPoint r0 = r4.n
            if (r0 == 0) goto L36
            return r1
        L2d:
            com.amap.api.location.DPoint r2 = r4.n
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L36
            return r1
        L36:
            float r0 = r3.f4910i
            float r2 = r4.f4910i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            return r1
        L3f:
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r0 = r3.f4909h
            if (r0 != 0) goto L48
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r4 = r4.f4909h
            if (r4 == 0) goto L51
            return r1
        L48:
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r4 = r4.f4909h
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L51
            return r1
        L51:
            r4 = 1
            return r4
    }

    public int getActivatesAction() {
            r1 = this;
            int r0 = r1.f4912k
            return r0
    }

    public com.amap.api.location.DPoint getCenter() {
            r1 = this;
            com.amap.api.location.DPoint r0 = r1.n
            return r0
    }

    public com.amap.api.location.AMapLocation getCurrentLocation() {
            r1 = this;
            com.amap.api.location.AMapLocation r0 = r1.r
            return r0
    }

    public java.lang.String getCustomId() {
            r1 = this;
            java.lang.String r0 = r1.f4903b
            return r0
    }

    public java.util.List<com.amap.api.fence.DistrictItem> getDistrictItemList() {
            r1 = this;
            java.util.List<com.amap.api.fence.DistrictItem> r0 = r1.f4908g
            return r0
    }

    public long getEnterTime() {
            r2 = this;
            long r0 = r2.p
            return r0
    }

    public long getExpiration() {
            r2 = this;
            long r0 = r2.f4911j
            return r0
    }

    public java.lang.String getFenceId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public float getMaxDis2Center() {
            r1 = this;
            float r0 = r1.m
            return r0
    }

    public float getMinDis2Center() {
            r1 = this;
            float r0 = r1.l
            return r0
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.f4905d
            return r0
    }

    public java.lang.String getPendingIntentAction() {
            r1 = this;
            java.lang.String r0 = r1.f4904c
            return r0
    }

    public com.amap.api.fence.PoiItem getPoiItem() {
            r1 = this;
            com.amap.api.fence.PoiItem r0 = r1.f4907f
            return r0
    }

    public java.util.List<java.util.List<com.amap.api.location.DPoint>> getPointList() {
            r1 = this;
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r0 = r1.f4909h
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.f4910i
            return r0
    }

    public int getStatus() {
            r1 = this;
            int r0 = r1.o
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f4906e
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4903b
            int r0 = r0.hashCode()
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r1 = r3.f4909h
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            com.amap.api.location.DPoint r1 = r3.n
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r3.f4910i
            float r2 = r2 * r1
            int r1 = (int) r2
            int r0 = r0 + r1
            return r0
    }

    public boolean isAble() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    public void setAble(boolean r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void setActivatesAction(int r1) {
            r0 = this;
            r0.f4912k = r1
            return
    }

    public void setCenter(com.amap.api.location.DPoint r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setCurrentLocation(com.amap.api.location.AMapLocation r1) {
            r0 = this;
            com.amap.api.location.AMapLocation r1 = r1.clone()
            r0.r = r1
            return
    }

    public void setCustomId(java.lang.String r1) {
            r0 = this;
            r0.f4903b = r1
            return
    }

    public void setDistrictItemList(java.util.List<com.amap.api.fence.DistrictItem> r1) {
            r0 = this;
            r0.f4908g = r1
            return
    }

    public void setEnterTime(long r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setExpiration(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb
            r4 = -1
            r3.f4911j = r4
            return
        Lb:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r4 = r4 + r0
            r3.f4911j = r4
            return
    }

    public void setFenceId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setMaxDis2Center(float r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setMinDis2Center(float r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setPendingIntent(android.app.PendingIntent r1) {
            r0 = this;
            r0.f4905d = r1
            return
    }

    public void setPendingIntentAction(java.lang.String r1) {
            r0 = this;
            r0.f4904c = r1
            return
    }

    public void setPoiItem(com.amap.api.fence.PoiItem r1) {
            r0 = this;
            r0.f4907f = r1
            return
    }

    public void setPointList(java.util.List<java.util.List<com.amap.api.location.DPoint>> r1) {
            r0 = this;
            r0.f4909h = r1
            return
    }

    public void setRadius(float r1) {
            r0 = this;
            r0.f4910i = r1
            return
    }

    public void setStatus(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.f4906e = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r0 = r2.a
            r3.writeString(r0)
            java.lang.String r0 = r2.f4903b
            r3.writeString(r0)
            java.lang.String r0 = r2.f4904c
            r3.writeString(r0)
            android.app.PendingIntent r0 = r2.f4905d
            r3.writeParcelable(r0, r4)
            int r0 = r2.f4906e
            r3.writeInt(r0)
            com.amap.api.fence.PoiItem r0 = r2.f4907f
            r3.writeParcelable(r0, r4)
            java.util.List<com.amap.api.fence.DistrictItem> r0 = r2.f4908g
            r3.writeTypedList(r0)
            float r0 = r2.f4910i
            r3.writeFloat(r0)
            long r0 = r2.f4911j
            r3.writeLong(r0)
            int r0 = r2.f4912k
            r3.writeInt(r0)
            float r0 = r2.l
            r3.writeFloat(r0)
            float r0 = r2.m
            r3.writeFloat(r0)
            com.amap.api.location.DPoint r0 = r2.n
            r3.writeParcelable(r0, r4)
            int r0 = r2.o
            r3.writeInt(r0)
            long r0 = r2.p
            r3.writeLong(r0)
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r0 = r2.f4909h
            if (r0 == 0) goto L74
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L74
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r0 = r2.f4909h
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.List<java.util.List<com.amap.api.location.DPoint>> r0 = r2.f4909h
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            r3.writeTypedList(r1)
            goto L64
        L74:
            boolean r0 = r2.q
            r3.writeByte(r0)
            com.amap.api.location.AMapLocation r0 = r2.r
            r3.writeParcelable(r0, r4)
            return
    }
}
