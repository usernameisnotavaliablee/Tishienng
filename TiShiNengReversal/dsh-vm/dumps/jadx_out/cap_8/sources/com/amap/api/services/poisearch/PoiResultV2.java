package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiResultV2 {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.core.PoiItemV2> f5276b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearchV2.Query f5277c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearchV2.SearchBound f5278d;

    private PoiResultV2(com.amap.api.services.poisearch.PoiSearchV2.Query r2, com.amap.api.services.poisearch.PoiSearchV2.SearchBound r3, int r4, java.util.ArrayList<com.amap.api.services.core.PoiItemV2> r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5277c = r2
            r1.f5278d = r3
            r1.a = r4
            r1.f5276b = r5
            return
    }

    public static com.amap.api.services.poisearch.PoiResultV2 createPagedResult(com.amap.api.services.poisearch.PoiSearchV2.Query r1, com.amap.api.services.poisearch.PoiSearchV2.SearchBound r2, int r3, java.util.ArrayList<com.amap.api.services.core.PoiItemV2> r4) {
            com.amap.api.services.poisearch.PoiResultV2 r0 = new com.amap.api.services.poisearch.PoiResultV2
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound() {
            r1 = this;
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r1.f5278d
            return r0
    }

    public int getCount() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.util.ArrayList<com.amap.api.services.core.PoiItemV2> getPois() {
            r1 = this;
            java.util.ArrayList<com.amap.api.services.core.PoiItemV2> r0 = r1.f5276b
            return r0
    }

    public com.amap.api.services.poisearch.PoiSearchV2.Query getQuery() {
            r1 = this;
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r1.f5277c
            return r0
    }
}
