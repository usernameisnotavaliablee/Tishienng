package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WalkStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.WalkStep> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5597b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5598c;

    /* renamed from: d, reason: collision with root package name */
    private float f5599d;

    /* renamed from: e, reason: collision with root package name */
    private float f5600e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5601f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5602g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5603h;

    /* renamed from: i, reason: collision with root package name */
    private int f5604i;


    static {
            com.amap.api.services.route.WalkStep$1 r0 = new com.amap.api.services.route.WalkStep$1
            r0.<init>()
            com.amap.api.services.route.WalkStep.CREATOR = r0
            return
    }

    public WalkStep() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5601f = r0
            return
    }

    public WalkStep(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5601f = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5597b = r0
            java.lang.String r0 = r2.readString()
            r1.f5598c = r0
            float r0 = r2.readFloat()
            r1.f5599d = r0
            float r0 = r2.readFloat()
            r1.f5600e = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5601f = r0
            java.lang.String r0 = r2.readString()
            r1.f5602g = r0
            java.lang.String r0 = r2.readString()
            r1.f5603h = r0
            int r2 = r2.readInt()
            r1.f5604i = r2
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
            java.lang.String r0 = r1.f5602g
            return r0
    }

    public java.lang.String getAssistantAction() {
            r1 = this;
            java.lang.String r0 = r1.f5603h
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.f5599d
            return r0
    }

    public float getDuration() {
            r1 = this;
            float r0 = r1.f5600e
            return r0
    }

    public java.lang.String getInstruction() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getOrientation() {
            r1 = this;
            java.lang.String r0 = r1.f5597b
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5601f
            return r0
    }

    public java.lang.String getRoad() {
            r1 = this;
            java.lang.String r0 = r1.f5598c
            return r0
    }

    public int getRoadType() {
            r1 = this;
            int r0 = r1.f5604i
            return r0
    }

    public void setAction(java.lang.String r1) {
            r0 = this;
            r0.f5602g = r1
            return
    }

    public void setAssistantAction(java.lang.String r1) {
            r0 = this;
            r0.f5603h = r1
            return
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.f5599d = r1
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.f5600e = r1
            return
    }

    public void setInstruction(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setOrientation(java.lang.String r1) {
            r0 = this;
            r0.f5597b = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5601f = r1
            return
    }

    public void setRoad(java.lang.String r1) {
            r0 = this;
            r0.f5598c = r1
            return
    }

    public void setRoadType(int r1) {
            r0 = this;
            r0.f5604i = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5597b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5598c
            r1.writeString(r2)
            float r2 = r0.f5599d
            r1.writeFloat(r2)
            float r2 = r0.f5600e
            r1.writeFloat(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5601f
            r1.writeTypedList(r2)
            java.lang.String r2 = r0.f5602g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5603h
            r1.writeString(r2)
            int r2 = r0.f5604i
            r1.writeInt(r2)
            return
    }
}
