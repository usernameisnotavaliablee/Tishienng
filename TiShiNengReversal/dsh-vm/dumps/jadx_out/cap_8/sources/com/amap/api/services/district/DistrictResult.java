package com.amap.api.services.district;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DistrictResult implements android.os.Parcelable {
    public android.os.Parcelable.Creator<com.amap.api.services.district.DistrictResult> CREATOR;
    private com.amap.api.services.district.DistrictSearchQuery a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.district.DistrictItem> f5176b;

    /* renamed from: c, reason: collision with root package name */
    private int f5177c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.core.AMapException f5178d;


    public DistrictResult() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5176b = r0
            com.amap.api.services.district.DistrictResult$1 r0 = new com.amap.api.services.district.DistrictResult$1
            r0.<init>(r1)
            r1.CREATOR = r0
            return
    }

    protected DistrictResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5176b = r0
            com.amap.api.services.district.DistrictResult$1 r0 = new com.amap.api.services.district.DistrictResult$1
            r0.<init>(r1)
            r1.CREATOR = r0
            java.lang.Class<com.amap.api.services.district.DistrictSearchQuery> r0 = com.amap.api.services.district.DistrictSearchQuery.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.district.DistrictSearchQuery r0 = (com.amap.api.services.district.DistrictSearchQuery) r0
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.district.DistrictItem> r0 = com.amap.api.services.district.DistrictItem.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5176b = r2
            return
    }

    public DistrictResult(com.amap.api.services.district.DistrictSearchQuery r2, java.util.ArrayList<com.amap.api.services.district.DistrictItem> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5176b = r0
            com.amap.api.services.district.DistrictResult$1 r0 = new com.amap.api.services.district.DistrictResult$1
            r0.<init>(r1)
            r1.CREATOR = r0
            r1.a = r2
            r1.f5176b = r3
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
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
            java.lang.Class<com.amap.api.services.district.DistrictResult> r2 = com.amap.api.services.district.DistrictResult.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            com.amap.api.services.district.DistrictResult r5 = (com.amap.api.services.district.DistrictResult) r5
            com.amap.api.services.district.DistrictSearchQuery r2 = r4.a
            if (r2 != 0) goto L1c
            com.amap.api.services.district.DistrictSearchQuery r2 = r5.a
            if (r2 == 0) goto L25
            return r1
        L1c:
            com.amap.api.services.district.DistrictSearchQuery r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25
            return r1
        L25:
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r2 = r4.f5176b
            if (r2 != 0) goto L2e
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r5 = r5.f5176b
            if (r5 == 0) goto L37
            return r1
        L2e:
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r5 = r5.f5176b
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L37
            return r1
        L37:
            return r0
    }

    public final com.amap.api.services.core.AMapException getAMapException() {
            r1 = this;
            com.amap.api.services.core.AMapException r0 = r1.f5178d
            return r0
    }

    public final java.util.ArrayList<com.amap.api.services.district.DistrictItem> getDistrict() {
            r1 = this;
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r0 = r1.f5176b
            return r0
    }

    public final int getPageCount() {
            r1 = this;
            int r0 = r1.f5177c
            return r0
    }

    public final com.amap.api.services.district.DistrictSearchQuery getQuery() {
            r1 = this;
            com.amap.api.services.district.DistrictSearchQuery r0 = r1.a
            return r0
    }

    public final int hashCode() {
            r3 = this;
            com.amap.api.services.district.DistrictSearchQuery r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r2 = r3.f5176b
            if (r2 != 0) goto L14
            goto L18
        L14:
            int r1 = r2.hashCode()
        L18:
            int r0 = r0 + r1
            return r0
    }

    public final void setAMapException(com.amap.api.services.core.AMapException r1) {
            r0 = this;
            r0.f5178d = r1
            return
    }

    public final void setDistrict(java.util.ArrayList<com.amap.api.services.district.DistrictItem> r1) {
            r0 = this;
            r0.f5176b = r1
            return
    }

    public final void setPageCount(int r1) {
            r0 = this;
            r0.f5177c = r1
            return
    }

    public final void setQuery(com.amap.api.services.district.DistrictSearchQuery r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DistrictResult [mDisQuery="
            r0.<init>(r1)
            com.amap.api.services.district.DistrictSearchQuery r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mDistricts="
            r0.append(r1)
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r1 = r2.f5176b
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.amap.api.services.district.DistrictSearchQuery r0 = r1.a
            r2.writeParcelable(r0, r3)
            java.util.ArrayList<com.amap.api.services.district.DistrictItem> r3 = r1.f5176b
            r2.writeTypedList(r3)
            return
    }
}
