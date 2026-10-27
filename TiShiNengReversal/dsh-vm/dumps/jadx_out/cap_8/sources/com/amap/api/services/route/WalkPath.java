package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WalkPath extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.WalkPath> CREATOR = null;
    private java.util.List<com.amap.api.services.route.WalkStep> a;


    static {
            com.amap.api.services.route.WalkPath$1 r0 = new com.amap.api.services.route.WalkPath$1
            r0.<init>()
            com.amap.api.services.route.WalkPath.CREATOR = r0
            return
    }

    public WalkPath() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public WalkPath(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            android.os.Parcelable$Creator<com.amap.api.services.route.WalkStep> r0 = com.amap.api.services.route.WalkStep.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.a = r2
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<com.amap.api.services.route.WalkStep> getSteps() {
            r1 = this;
            java.util.List<com.amap.api.services.route.WalkStep> r0 = r1.a
            return r0
    }

    public void setSteps(java.util.List<com.amap.api.services.route.WalkStep> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.util.List<com.amap.api.services.route.WalkStep> r2 = r0.a
            r1.writeTypedList(r2)
            return
    }
}
