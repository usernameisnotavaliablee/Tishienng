package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TruckStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TruckStep> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5585b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5586c;

    /* renamed from: d, reason: collision with root package name */
    private float f5587d;

    /* renamed from: e, reason: collision with root package name */
    private float f5588e;

    /* renamed from: f, reason: collision with root package name */
    private float f5589f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5590g;

    /* renamed from: h, reason: collision with root package name */
    private float f5591h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5592i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5593j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5594k;
    private java.util.List<com.amap.api.services.route.RouteSearchCity> l;
    private java.util.List<com.amap.api.services.route.TMC> m;


    static {
            com.amap.api.services.route.TruckStep$1 r0 = new com.amap.api.services.route.TruckStep$1
            r0.<init>()
            com.amap.api.services.route.TruckStep.CREATOR = r0
            return
    }

    public TruckStep() {
            r0 = this;
            r0.<init>()
            return
    }

    protected TruckStep(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5585b = r0
            java.lang.String r0 = r2.readString()
            r1.f5586c = r0
            float r0 = r2.readFloat()
            r1.f5587d = r0
            float r0 = r2.readFloat()
            r1.f5588e = r0
            float r0 = r2.readFloat()
            r1.f5589f = r0
            java.lang.String r0 = r2.readString()
            r1.f5590g = r0
            float r0 = r2.readFloat()
            r1.f5591h = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5592i = r0
            java.lang.String r0 = r2.readString()
            r1.f5593j = r0
            java.lang.String r0 = r2.readString()
            r1.f5594k = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.RouteSearchCity> r0 = com.amap.api.services.route.RouteSearchCity.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.l = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.TMC> r0 = com.amap.api.services.route.TMC.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.m = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAction() {
            r1 = this;
            java.lang.String r0 = r1.f5593j
            return r0
    }

    public java.lang.String getAssistantAction() {
            r1 = this;
            java.lang.String r0 = r1.f5594k
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5588e
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5591h
            return r0
    }

    public java.lang.String getInstruction() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getOrientation() {
            r1 = this;
            java.lang.String r0 = r1.f5585b
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5592i
            return r0
    }

    public java.lang.String getRoad() {
            r1 = this;
            java.lang.String r0 = r1.f5586c
            return r0
    }

    public java.util.List<com.amap.api.services.route.RouteSearchCity> getRouteSearchCityList() {
            r1 = this;
            java.util.List<com.amap.api.services.route.RouteSearchCity> r0 = r1.l
            return r0
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
            r1 = this;
            java.util.List<com.amap.api.services.route.TMC> r0 = r1.m
            return r0
    }

    public float getTollDistance() {
            r1 = this;
            float r0 = r1.f5589f
            return r0
    }

    public java.lang.String getTollRoad() {
            r1 = this;
            java.lang.String r0 = r1.f5590g
            return r0
    }

    public float getTolls() {
            r1 = this;
            float r0 = r1.f5587d
            return r0
    }

    public void setAction(java.lang.String r1) {
            r0 = this;
            r0.f5593j = r1
            return
    }

    public void setAssistantAction(java.lang.String r1) {
            r0 = this;
            r0.f5594k = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5588e = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5591h = r1
            return
    }

    public void setInstruction(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setOrientation(java.lang.String r1) {
            r0 = this;
            r0.f5585b = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5592i = r1
            return
    }

    public void setRoad(java.lang.String r1) {
            r0 = this;
            r0.f5586c = r1
            return
    }

    public void setRouteSearchCityList(java.util.List<com.amap.api.services.route.RouteSearchCity> r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setTollDistance(float r1) {
            r0 = this;
            r0.f5589f = r1
            return
    }

    public void setTollRoad(java.lang.String r1) {
            r0 = this;
            r0.f5590g = r1
            return
    }

    public void setTolls(float r1) {
            r0 = this;
            r0.f5587d = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5585b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5586c
            r1.writeString(r2)
            float r2 = r0.f5587d
            r1.writeFloat(r2)
            float r2 = r0.f5588e
            r1.writeFloat(r2)
            float r2 = r0.f5589f
            r1.writeFloat(r2)
            java.lang.String r2 = r0.f5590g
            r1.writeString(r2)
            float r2 = r0.f5591h
            r1.writeFloat(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5592i
            r1.writeTypedList(r2)
            java.lang.String r2 = r0.f5593j
            r1.writeString(r2)
            java.lang.String r2 = r0.f5594k
            r1.writeString(r2)
            java.util.List<com.amap.api.services.route.RouteSearchCity> r2 = r0.l
            r1.writeTypedList(r2)
            java.util.List<com.amap.api.services.route.TMC> r2 = r0.m
            r1.writeTypedList(r2)
            return
    }
}
