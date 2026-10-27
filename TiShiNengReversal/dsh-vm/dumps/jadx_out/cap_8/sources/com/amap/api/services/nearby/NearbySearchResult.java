package com.amap.api.services.nearby;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NearbySearchResult {
    private java.util.List<com.amap.api.services.nearby.NearbyInfo> a;

    /* renamed from: b, reason: collision with root package name */
    private int f5248b;

    public NearbySearchResult() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.f5248b = r0
            return
    }

    public java.util.List<com.amap.api.services.nearby.NearbyInfo> getNearbyInfoList() {
            r1 = this;
            java.util.List<com.amap.api.services.nearby.NearbyInfo> r0 = r1.a
            return r0
    }

    public int getTotalNum() {
            r1 = this;
            int r0 = r1.f5248b
            return r0
    }

    public void setNearbyInfoList(java.util.List<com.amap.api.services.nearby.NearbyInfo> r1) {
            r0 = this;
            r0.a = r1
            int r1 = r1.size()
            r0.f5248b = r1
            return
    }
}
