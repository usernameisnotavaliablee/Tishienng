package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LatLonSharePoint extends com.amap.api.services.core.LatLonPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.LatLonSharePoint> CREATOR = null;
    private java.lang.String a;


    static {
            com.amap.api.services.core.LatLonSharePoint$1 r0 = new com.amap.api.services.core.LatLonSharePoint$1
            r0.<init>()
            com.amap.api.services.core.LatLonSharePoint.CREATOR = r0
            return
    }

    public LatLonSharePoint(double r1, double r3, java.lang.String r5) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.a = r5
            return
    }

    protected LatLonSharePoint(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = r1.readString()
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = super.equals(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r1 == r3) goto L17
            return r2
        L17:
            com.amap.api.services.core.LatLonSharePoint r5 = (com.amap.api.services.core.LatLonSharePoint) r5
            java.lang.String r1 = r4.a
            if (r1 != 0) goto L22
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L2b
            return r2
        L22:
            java.lang.String r5 = r5.a
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public java.lang.String getSharePointName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.a
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            int r1 = r1.hashCode()
        L10:
            int r0 = r0 + r1
            return r0
    }

    public void setSharePointName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            return
    }
}
