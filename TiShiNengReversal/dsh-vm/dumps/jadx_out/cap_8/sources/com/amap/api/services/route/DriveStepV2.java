package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DriveStepV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DriveStepV2> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5414b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5415c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5416d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.RouteSearchCity> f5417e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.TMC> f5418f;

    /* renamed from: g, reason: collision with root package name */
    private int f5419g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.services.route.Cost f5420h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.services.route.Navi f5421i;


    static {
            com.amap.api.services.route.DriveStepV2$1 r0 = new com.amap.api.services.route.DriveStepV2$1
            r0.<init>()
            com.amap.api.services.route.DriveStepV2.CREATOR = r0
            return
    }

    public DriveStepV2() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5416d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5417e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5418f = r0
            r0 = -1
            r1.f5419g = r0
            return
    }

    public DriveStepV2(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5416d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5417e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5418f = r0
            r0 = -1
            r1.f5419g = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5414b = r0
            java.lang.String r0 = r2.readString()
            r1.f5415c = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5416d = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.RouteSearchCity> r0 = com.amap.api.services.route.RouteSearchCity.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5417e = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.TMC> r0 = com.amap.api.services.route.TMC.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5418f = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.route.Cost getCostDetail() {
            r1 = this;
            com.amap.api.services.route.Cost r0 = r1.f5420h
            return r0
    }

    public java.lang.String getInstruction() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.route.Navi getNavi() {
            r1 = this;
            com.amap.api.services.route.Navi r0 = r1.f5421i
            return r0
    }

    public java.lang.String getOrientation() {
            r1 = this;
            java.lang.String r0 = r1.f5414b
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5416d
            return r0
    }

    public java.lang.String getRoad() {
            r1 = this;
            java.lang.String r0 = r1.f5415c
            return r0
    }

    public java.util.List<com.amap.api.services.route.RouteSearchCity> getRouteSearchCityList() {
            r1 = this;
            java.util.List<com.amap.api.services.route.RouteSearchCity> r0 = r1.f5417e
            return r0
    }

    public int getStepDistance() {
            r1 = this;
            int r0 = r1.f5419g
            return r0
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
            r1 = this;
            java.util.List<com.amap.api.services.route.TMC> r0 = r1.f5418f
            return r0
    }

    public void setCostDetail(com.amap.api.services.route.Cost r1) {
            r0 = this;
            r0.f5420h = r1
            return
    }

    public void setInstruction(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setNavi(com.amap.api.services.route.Navi r1) {
            r0 = this;
            r0.f5421i = r1
            return
    }

    public void setOrientation(java.lang.String r1) {
            r0 = this;
            r0.f5414b = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5416d = r1
            return
    }

    public void setRoad(java.lang.String r1) {
            r0 = this;
            r0.f5415c = r1
            return
    }

    public void setRouteSearchCityList(java.util.List<com.amap.api.services.route.RouteSearchCity> r1) {
            r0 = this;
            r0.f5417e = r1
            return
    }

    public void setStepDistance(int r1) {
            r0 = this;
            r0.f5419g = r1
            return
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> r1) {
            r0 = this;
            r0.f5418f = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5414b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5415c
            r1.writeString(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5416d
            r1.writeTypedList(r2)
            java.util.List<com.amap.api.services.route.RouteSearchCity> r2 = r0.f5417e
            r1.writeTypedList(r2)
            java.util.List<com.amap.api.services.route.TMC> r2 = r0.f5418f
            r1.writeTypedList(r2)
            return
    }
}
