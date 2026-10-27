package com.amap.api.services.routepoisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoutePOISearchResult {
    private java.util.List<com.amap.api.services.routepoisearch.RoutePOIItem> a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.routepoisearch.RoutePOISearchQuery f5616b;

    public RoutePOISearchResult(java.util.ArrayList<com.amap.api.services.routepoisearch.RoutePOIItem> r2, com.amap.api.services.routepoisearch.RoutePOISearchQuery r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r2
            r1.f5616b = r3
            return
    }

    public com.amap.api.services.routepoisearch.RoutePOISearchQuery getQuery() {
            r1 = this;
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r1.f5616b
            return r0
    }

    public java.util.List<com.amap.api.services.routepoisearch.RoutePOIItem> getRoutePois() {
            r1 = this;
            java.util.List<com.amap.api.services.routepoisearch.RoutePOIItem> r0 = r1.a
            return r0
    }
}
