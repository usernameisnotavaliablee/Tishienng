package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RideStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RideStep> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5439b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5440c;

    /* renamed from: d, reason: collision with root package name */
    private float f5441d;

    /* renamed from: e, reason: collision with root package name */
    private float f5442e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5443f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5444g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5445h;

    /* renamed from: i, reason: collision with root package name */
    private int f5446i;


    static {
            com.amap.api.services.route.RideStep$1 r0 = new com.amap.api.services.route.RideStep$1
            r0.<init>()
            com.amap.api.services.route.RideStep.CREATOR = r0
            return
    }

    public RideStep() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5443f = r0
            return
    }

    protected RideStep(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5443f = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5439b = r0
            java.lang.String r0 = r2.readString()
            r1.f5440c = r0
            float r0 = r2.readFloat()
            r1.f5441d = r0
            float r0 = r2.readFloat()
            r1.f5442e = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5443f = r0
            java.lang.String r0 = r2.readString()
            r1.f5444g = r0
            java.lang.String r2 = r2.readString()
            r1.f5445h = r2
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
            java.lang.String r0 = r1.f5444g
            return r0
    }

    public java.lang.String getAssistantAction() {
            r1 = this;
            java.lang.String r0 = r1.f5445h
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5441d
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5442e
            return r0
    }

    public java.lang.String getInstruction() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getOrientation() {
            r1 = this;
            java.lang.String r0 = r1.f5439b
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5443f
            return r0
    }

    public java.lang.String getRoad() {
            r1 = this;
            java.lang.String r0 = r1.f5440c
            return r0
    }

    public int getRoadType() {
            r1 = this;
            int r0 = r1.f5446i
            return r0
    }

    public void setAction(java.lang.String r1) {
            r0 = this;
            r0.f5444g = r1
            return
    }

    public void setAssistantAction(java.lang.String r1) {
            r0 = this;
            r0.f5445h = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5441d = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5442e = r1
            return
    }

    public void setInstruction(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setOrientation(java.lang.String r1) {
            r0 = this;
            r0.f5439b = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5443f = r1
            return
    }

    public void setRoad(java.lang.String r1) {
            r0 = this;
            r0.f5440c = r1
            return
    }

    public void setRoadType(int r1) {
            r0 = this;
            r0.f5446i = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5439b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5440c
            r1.writeString(r2)
            float r2 = r0.f5441d
            r1.writeFloat(r2)
            float r2 = r0.f5442e
            r1.writeFloat(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5443f
            r1.writeTypedList(r2)
            java.lang.String r2 = r0.f5444g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5445h
            r1.writeString(r2)
            return
    }
}
