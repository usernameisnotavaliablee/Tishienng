package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TMC implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TMC> CREATOR = null;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5556b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5557c;


    static {
            com.amap.api.services.route.TMC$1 r0 = new com.amap.api.services.route.TMC$1
            r0.<init>()
            com.amap.api.services.route.TMC.CREATOR = r0
            return
    }

    public TMC() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5557c = r0
            return
    }

    public TMC(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5557c = r0
            int r0 = r2.readInt()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5556b = r0
            android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5557c = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5557c
            return r0
    }

    public java.lang.String getStatus() {
            r1 = this;
            java.lang.String r0 = r1.f5556b
            return r0
    }

    public void setDistance(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            r0 = this;
            r0.f5557c = r1
            return
    }

    public void setStatus(java.lang.String r1) {
            r0 = this;
            r0.f5556b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            java.lang.String r2 = r0.f5556b
            r1.writeString(r2)
            java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r0.f5557c
            r1.writeTypedList(r2)
            return
    }
}
