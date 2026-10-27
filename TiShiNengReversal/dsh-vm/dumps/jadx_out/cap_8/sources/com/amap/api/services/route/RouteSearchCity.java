package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteSearchCity extends com.amap.api.services.route.SearchCity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchCity> CREATOR = null;
    java.util.List<com.amap.api.services.route.District> a;


    static {
            com.amap.api.services.route.RouteSearchCity$1 r0 = new com.amap.api.services.route.RouteSearchCity$1
            r0.<init>()
            com.amap.api.services.route.RouteSearchCity.CREATOR = r0
            return
    }

    public RouteSearchCity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public RouteSearchCity(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.District> r0 = com.amap.api.services.route.District.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.a = r2
            return
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.District> getDistricts() {
            r1 = this;
            java.util.List<com.amap.api.services.route.District> r0 = r1.a
            return r0
    }

    public void setDistricts(java.util.List<com.amap.api.services.route.District> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.util.List<com.amap.api.services.route.District> r2 = r0.a
            r1.writeTypedList(r2)
            return
    }
}
