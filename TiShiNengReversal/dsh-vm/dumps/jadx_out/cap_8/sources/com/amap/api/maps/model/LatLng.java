package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class LatLng implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.LatLngCreator CREATOR = null;
    public final double latitude;
    public final double longitude;

    static {
            com.amap.api.maps.model.LatLngCreator r0 = new com.amap.api.maps.model.LatLngCreator
            r0.<init>()
            com.amap.api.maps.model.LatLng.CREATOR = r0
            return
    }

    public LatLng(double r7, double r9) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r3, r5)
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public LatLng(double r5, double r7, boolean r9) {
            r4 = this;
            r4.<init>()
            if (r9 == 0) goto L4c
            r0 = -4582834833314545664(0xc066800000000000, double:-180.0)
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 > 0) goto L1a
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L1a
            r4.longitude = r7
            goto L26
        L1a:
            double r7 = r7 - r2
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r7 = r7 % r0
            double r7 = r7 + r0
            double r7 = r7 % r0
            double r7 = r7 - r2
            r4.longitude = r7
        L26:
            r7 = 4636033603912859648(0x4056800000000000, double:90.0)
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 < 0) goto L39
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L39
            goto L41
        L39:
            com.amap.api.maps.AMapException r9 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L41
            java.lang.String r2 = "非法坐标值"
            r9.<init>(r2)     // Catch: com.amap.api.maps.AMapException -> L41
            throw r9     // Catch: com.amap.api.maps.AMapException -> L41
        L41:
            double r5 = java.lang.Math.min(r7, r5)
            double r5 = java.lang.Math.max(r0, r5)
            r4.latitude = r5
            return
        L4c:
            r4.latitude = r5
            r4.longitude = r7
            return
    }

    public final com.amap.api.maps.model.LatLng clone() {
            r5 = this;
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            double r1 = r5.latitude
            double r3 = r5.longitude
            r0.<init>(r1, r3)
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m11clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.amap.api.maps.model.LatLng
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.amap.api.maps.model.LatLng r8 = (com.amap.api.maps.model.LatLng) r8
            double r3 = r7.latitude
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.latitude
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2d
            double r3 = r7.longitude
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.longitude
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2d
            return r0
        L2d:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            double r0 = r7.latitude
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 + 31
            double r3 = r7.longitude
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lat/lng: ("
            r0.<init>(r1)
            double r1 = r3.latitude
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            double r1 = r3.longitude
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            double r0 = r2.longitude
            r3.writeDouble(r0)
            double r0 = r2.latitude
            r3.writeDouble(r0)
            return
    }
}
