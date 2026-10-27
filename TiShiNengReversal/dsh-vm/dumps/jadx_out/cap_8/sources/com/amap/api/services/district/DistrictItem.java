package com.amap.api.services.district;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DistrictItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.district.DistrictItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5170b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5171c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5172d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5173e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.district.DistrictItem> f5174f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String[] f5175g;


    static {
            com.amap.api.services.district.DistrictItem$1 r0 = new com.amap.api.services.district.DistrictItem$1
            r0.<init>()
            com.amap.api.services.district.DistrictItem.CREATOR = r0
            return
    }

    public DistrictItem() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5174f = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f5175g = r0
            return
    }

    public DistrictItem(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5174f = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f5175g = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5170b = r0
            java.lang.String r0 = r2.readString()
            r1.f5171c = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r1.f5172d = r0
            java.lang.String r0 = r2.readString()
            r1.f5173e = r0
            android.os.Parcelable$Creator<com.amap.api.services.district.DistrictItem> r0 = com.amap.api.services.district.DistrictItem.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5174f = r0
            int r0 = r2.readInt()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f5175g = r0
            r2.readStringArray(r0)
            return
    }

    public DistrictItem(java.lang.String r2, java.lang.String r3, java.lang.String r4, com.amap.api.services.core.LatLonPoint r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5174f = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f5175g = r0
            r1.f5171c = r2
            r1.a = r3
            r1.f5170b = r4
            r1.f5172d = r5
            r1.f5173e = r6
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String[] districtBoundary() {
            r1 = this;
            java.lang.String[] r0 = r1.f5175g
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<com.amap.api.services.district.DistrictItem> r2 = com.amap.api.services.district.DistrictItem.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            com.amap.api.services.district.DistrictItem r5 = (com.amap.api.services.district.DistrictItem) r5
            java.lang.String r2 = r4.f5170b
            if (r2 != 0) goto L1c
            java.lang.String r2 = r5.f5170b
            if (r2 == 0) goto L25
            return r1
        L1c:
            java.lang.String r3 = r5.f5170b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25
            return r1
        L25:
            com.amap.api.services.core.LatLonPoint r2 = r4.f5172d
            if (r2 != 0) goto L2e
            com.amap.api.services.core.LatLonPoint r2 = r5.f5172d
            if (r2 == 0) goto L37
            return r1
        L2e:
            com.amap.api.services.core.LatLonPoint r3 = r5.f5172d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            return r1
        L37:
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L40
            java.lang.String r2 = r5.a
            if (r2 == 0) goto L49
            return r1
        L40:
            java.lang.String r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
            return r1
        L49:
            java.lang.String[] r2 = r4.f5175g
            java.lang.String[] r3 = r5.f5175g
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L54
            return r1
        L54:
            java.util.List<com.amap.api.services.district.DistrictItem> r2 = r4.f5174f
            if (r2 != 0) goto L5d
            java.util.List<com.amap.api.services.district.DistrictItem> r2 = r5.f5174f
            if (r2 == 0) goto L66
            return r1
        L5d:
            java.util.List<com.amap.api.services.district.DistrictItem> r3 = r5.f5174f
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L66
            return r1
        L66:
            java.lang.String r2 = r4.f5173e
            if (r2 != 0) goto L6f
            java.lang.String r2 = r5.f5173e
            if (r2 == 0) goto L78
            return r1
        L6f:
            java.lang.String r3 = r5.f5173e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            return r1
        L78:
            java.lang.String r2 = r4.f5171c
            if (r2 != 0) goto L81
            java.lang.String r5 = r5.f5171c
            if (r5 == 0) goto L8a
            return r1
        L81:
            java.lang.String r5 = r5.f5171c
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L8a
            return r1
        L8a:
            return r0
    }

    public final java.lang.String getAdcode() {
            r1 = this;
            java.lang.String r0 = r1.f5170b
            return r0
    }

    public final com.amap.api.services.core.LatLonPoint getCenter() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5172d
            return r0
    }

    public final java.lang.String getCitycode() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final java.lang.String getLevel() {
            r1 = this;
            java.lang.String r0 = r1.f5173e
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f5171c
            return r0
    }

    public final java.util.List<com.amap.api.services.district.DistrictItem> getSubDistrict() {
            r1 = this;
            java.util.List<com.amap.api.services.district.DistrictItem> r0 = r1.f5174f
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5170b
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            com.amap.api.services.core.LatLonPoint r2 = r3.f5172d
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.a
            if (r2 != 0) goto L22
            r2 = 0
            goto L26
        L22:
            int r2 = r2.hashCode()
        L26:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String[] r2 = r3.f5175g
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List<com.amap.api.services.district.DistrictItem> r2 = r3.f5174f
            if (r2 != 0) goto L38
            r2 = 0
            goto L3c
        L38:
            int r2 = r2.hashCode()
        L3c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f5173e
            if (r2 != 0) goto L45
            r2 = 0
            goto L49
        L45:
            int r2 = r2.hashCode()
        L49:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f5171c
            if (r2 != 0) goto L51
            goto L55
        L51:
            int r1 = r2.hashCode()
        L55:
            int r0 = r0 + r1
            return r0
    }

    public final void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f5170b = r1
            return
    }

    public final void setCenter(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5172d = r1
            return
    }

    public final void setCitycode(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void setDistrictBoundary(java.lang.String[] r1) {
            r0 = this;
            r0.f5175g = r1
            return
    }

    public final void setLevel(java.lang.String r1) {
            r0 = this;
            r0.f5173e = r1
            return
    }

    public final void setName(java.lang.String r1) {
            r0 = this;
            r0.f5171c = r1
            return
    }

    public final void setSubDistrict(java.util.ArrayList<com.amap.api.services.district.DistrictItem> r1) {
            r0 = this;
            r0.f5174f = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DistrictItem [mCitycode="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mAdcode="
            r0.append(r1)
            java.lang.String r1 = r2.f5170b
            r0.append(r1)
            java.lang.String r1 = ", mName="
            r0.append(r1)
            java.lang.String r1 = r2.f5171c
            r0.append(r1)
            java.lang.String r1 = ", mCenter="
            r0.append(r1)
            com.amap.api.services.core.LatLonPoint r1 = r2.f5172d
            r0.append(r1)
            java.lang.String r1 = ", mLevel="
            r0.append(r1)
            java.lang.String r1 = r2.f5173e
            r0.append(r1)
            java.lang.String r1 = ", mDistricts="
            r0.append(r1)
            java.util.List<com.amap.api.services.district.DistrictItem> r1 = r2.f5174f
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.a
            r2.writeString(r0)
            java.lang.String r0 = r1.f5170b
            r2.writeString(r0)
            java.lang.String r0 = r1.f5171c
            r2.writeString(r0)
            com.amap.api.services.core.LatLonPoint r0 = r1.f5172d
            r2.writeParcelable(r0, r3)
            java.lang.String r3 = r1.f5173e
            r2.writeString(r3)
            java.util.List<com.amap.api.services.district.DistrictItem> r3 = r1.f5174f
            r2.writeTypedList(r3)
            java.lang.String[] r3 = r1.f5175g
            int r3 = r3.length
            r2.writeInt(r3)
            java.lang.String[] r3 = r1.f5175g
            r2.writeStringArray(r3)
            return
    }
}
