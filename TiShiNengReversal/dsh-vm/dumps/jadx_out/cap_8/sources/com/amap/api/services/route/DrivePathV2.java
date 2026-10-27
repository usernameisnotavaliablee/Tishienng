package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DrivePathV2 extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePathV2> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.DriveStepV2> f5387b;

    /* renamed from: c, reason: collision with root package name */
    private int f5388c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.route.Cost f5389d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.route.ElecConsumeInfo f5390e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.route.ChargeStationInfo> f5391f;


    static {
            com.amap.api.services.route.DrivePathV2$1 r0 = new com.amap.api.services.route.DrivePathV2$1
            r0.<init>()
            com.amap.api.services.route.DrivePathV2.CREATOR = r0
            return
    }

    public DrivePathV2() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5387b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5391f = r0
            return
    }

    public DrivePathV2(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5387b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5391f = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.DriveStepV2> r0 = com.amap.api.services.route.DriveStepV2.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f5387b = r2
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.ChargeStationInfo> getChargeStationInfo() {
            r1 = this;
            java.util.List<com.amap.api.services.route.ChargeStationInfo> r0 = r1.f5391f
            return r0
    }

    public com.amap.api.services.route.Cost getCost() {
            r1 = this;
            com.amap.api.services.route.Cost r0 = r1.f5389d
            return r0
    }

    public com.amap.api.services.route.ElecConsumeInfo getElecConsumeInfo() {
            r1 = this;
            com.amap.api.services.route.ElecConsumeInfo r0 = r1.f5390e
            return r0
    }

    public int getRestriction() {
            r1 = this;
            int r0 = r1.f5388c
            return r0
    }

    public java.util.List<com.amap.api.services.route.DriveStepV2> getSteps() {
            r1 = this;
            java.util.List<com.amap.api.services.route.DriveStepV2> r0 = r1.f5387b
            return r0
    }

    public java.lang.String getStrategy() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setChargeStationInfo(java.util.List<com.amap.api.services.route.ChargeStationInfo> r1) {
            r0 = this;
            r0.f5391f = r1
            return
    }

    public void setCost(com.amap.api.services.route.Cost r1) {
            r0 = this;
            r0.f5389d = r1
            return
    }

    public void setElecConsumeInfo(com.amap.api.services.route.ElecConsumeInfo r1) {
            r0 = this;
            r0.f5390e = r1
            return
    }

    public void setRestriction(int r1) {
            r0 = this;
            r0.f5388c = r1
            return
    }

    public void setSteps(java.util.List<com.amap.api.services.route.DriveStepV2> r1) {
            r0 = this;
            r0.f5387b = r1
            return
    }

    public void setStrategy(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.util.List<com.amap.api.services.route.DriveStepV2> r2 = r0.f5387b
            r1.writeTypedList(r2)
            return
    }
}
