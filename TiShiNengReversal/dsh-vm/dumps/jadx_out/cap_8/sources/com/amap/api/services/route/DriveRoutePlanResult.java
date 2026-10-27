package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DriveRoutePlanResult extends com.amap.api.services.route.RoutePlanResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DriveRoutePlanResult> CREATOR = null;
    private java.util.List<com.amap.api.services.route.DrivePlanPath> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.TimeInfo> f5398b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.route.RouteSearch.DrivePlanQuery f5399c;


    static {
            com.amap.api.services.route.DriveRoutePlanResult$1 r0 = new com.amap.api.services.route.DriveRoutePlanResult$1
            r0.<init>()
            com.amap.api.services.route.DriveRoutePlanResult.CREATOR = r0
            return
    }

    public DriveRoutePlanResult() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5398b = r0
            return
    }

    public DriveRoutePlanResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5398b = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.DrivePlanPath> r0 = com.amap.api.services.route.DrivePlanPath.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.TimeInfo> r0 = com.amap.api.services.route.TimeInfo.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f5398b = r0
            java.lang.Class<com.amap.api.services.route.RouteSearch$DrivePlanQuery> r0 = com.amap.api.services.route.RouteSearch.DrivePlanQuery.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            r1.f5399c = r2
            return
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.DrivePlanPath> getPaths() {
            r1 = this;
            java.util.List<com.amap.api.services.route.DrivePlanPath> r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.services.route.TimeInfo> getTimeInfos() {
            r1 = this;
            java.util.List<com.amap.api.services.route.TimeInfo> r0 = r1.f5398b
            return r0
    }

    public void setDrivePlanQuery(com.amap.api.services.route.RouteSearch.DrivePlanQuery r2) {
            r1 = this;
            r1.f5399c = r2
            com.amap.api.services.route.RouteSearch$FromAndTo r2 = r2.getFromAndTo()
            if (r2 == 0) goto L16
            com.amap.api.services.core.LatLonPoint r0 = r2.getFrom()
            r1.setStartPos(r0)
            com.amap.api.services.core.LatLonPoint r2 = r2.getTo()
            r1.setTargetPos(r2)
        L16:
            return
    }

    public void setPaths(java.util.List<com.amap.api.services.route.DrivePlanPath> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setTimeInfos(java.util.List<com.amap.api.services.route.TimeInfo> r1) {
            r0 = this;
            r0.f5398b = r1
            return
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            java.util.List<com.amap.api.services.route.DrivePlanPath> r0 = r1.a
            r2.writeTypedList(r0)
            java.util.List<com.amap.api.services.route.TimeInfo> r0 = r1.f5398b
            r2.writeTypedList(r0)
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r0 = r1.f5399c
            r2.writeParcelable(r0, r3)
            return
    }
}
