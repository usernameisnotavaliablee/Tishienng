package com.amap.api.services.road;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Crossroad extends com.amap.api.services.road.Road implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.road.Crossroad> CREATOR = null;
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5323b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5324c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5325d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5326e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5327f;


    static {
            com.amap.api.services.road.Crossroad$1 r0 = new com.amap.api.services.road.Crossroad$1
            r0.<init>()
            com.amap.api.services.road.Crossroad.CREATOR = r0
            return
    }

    public Crossroad() {
            r0 = this;
            r0.<init>()
            return
    }

    private Crossroad(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            float r0 = r2.readFloat()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5323b = r0
            java.lang.String r0 = r2.readString()
            r1.f5324c = r0
            java.lang.String r0 = r2.readString()
            r1.f5325d = r0
            java.lang.String r0 = r2.readString()
            r1.f5326e = r0
            java.lang.String r2 = r2.readString()
            r1.f5327f = r2
            return
    }

    /* synthetic */ Crossroad(android.os.Parcel r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String getDirection() {
            r1 = this;
            java.lang.String r0 = r1.f5323b
            return r0
    }

    public final float getDistance() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public final java.lang.String getFirstRoadId() {
            r1 = this;
            java.lang.String r0 = r1.f5324c
            return r0
    }

    public final java.lang.String getFirstRoadName() {
            r1 = this;
            java.lang.String r0 = r1.f5325d
            return r0
    }

    public final java.lang.String getSecondRoadId() {
            r1 = this;
            java.lang.String r0 = r1.f5326e
            return r0
    }

    public final java.lang.String getSecondRoadName() {
            r1 = this;
            java.lang.String r0 = r1.f5327f
            return r0
    }

    public final void setDirection(java.lang.String r1) {
            r0 = this;
            r0.f5323b = r1
            return
    }

    public final void setDistance(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void setFirstRoadId(java.lang.String r1) {
            r0 = this;
            r0.f5324c = r1
            return
    }

    public final void setFirstRoadName(java.lang.String r1) {
            r0 = this;
            r0.f5325d = r1
            return
    }

    public final void setSecondRoadId(java.lang.String r1) {
            r0 = this;
            r0.f5326e = r1
            return
    }

    public final void setSecondRoadName(java.lang.String r1) {
            r0 = this;
            r0.f5327f = r1
            return
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            float r2 = r0.a
            r1.writeFloat(r2)
            java.lang.String r2 = r0.f5323b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5324c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5325d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5326e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5327f
            r1.writeString(r2)
            return
    }
}
