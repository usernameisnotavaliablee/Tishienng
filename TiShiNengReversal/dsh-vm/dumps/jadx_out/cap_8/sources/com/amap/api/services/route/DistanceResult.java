package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DistanceResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DistanceResult> CREATOR = null;
    private com.amap.api.services.route.DistanceSearch.DistanceQuery a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.DistanceItem> f5375b;


    static {
            com.amap.api.services.route.DistanceResult$1 r0 = new com.amap.api.services.route.DistanceResult$1
            r0.<init>()
            com.amap.api.services.route.DistanceResult.CREATOR = r0
            return
    }

    public DistanceResult() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5375b = r0
            return
    }

    protected DistanceResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5375b = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.DistanceItem> r0 = com.amap.api.services.route.DistanceItem.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5375b = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.amap.api.services.route.DistanceSearch.DistanceQuery getDistanceQuery() {
            r1 = this;
            com.amap.api.services.route.DistanceSearch$DistanceQuery r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.services.route.DistanceItem> getDistanceResults() {
            r1 = this;
            java.util.List<com.amap.api.services.route.DistanceItem> r0 = r1.f5375b
            return r0
    }

    public void setDistanceQuery(com.amap.api.services.route.DistanceSearch.DistanceQuery r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setDistanceResults(java.util.List<com.amap.api.services.route.DistanceItem> r1) {
            r0 = this;
            r0.f5375b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.amap.api.services.route.DistanceItem> r2 = r0.f5375b
            r1.writeTypedList(r2)
            return
    }
}
