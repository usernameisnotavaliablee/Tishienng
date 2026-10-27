package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class PoiResult {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.core.PoiItem> f5270b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearch.Query f5271c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearch.SearchBound f5272d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<java.lang.String> f5273e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.SuggestionCity> f5274f;

    /* renamed from: g, reason: collision with root package name */
    private int f5275g;

    private PoiResult(com.amap.api.services.poisearch.PoiSearch.Query r2, com.amap.api.services.poisearch.PoiSearch.SearchBound r3, java.util.List<java.lang.String> r4, java.util.List<com.amap.api.services.core.SuggestionCity> r5, int r6, int r7, java.util.ArrayList<com.amap.api.services.core.PoiItem> r8) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5270b = r0
            r1.f5271c = r2
            r1.f5272d = r3
            r1.f5273e = r4
            r1.f5274f = r5
            r1.f5275g = r6
            int r2 = r1.a(r7)
            r1.a = r2
            r1.f5270b = r8
            return
    }

    private int a(int r2) {
            r1 = this;
            int r0 = r1.f5275g
            int r2 = r2 + r0
            int r2 = r2 + (-1)
            int r2 = r2 / r0
            return r2
    }

    public static com.amap.api.services.poisearch.PoiResult createPagedResult(com.amap.api.services.poisearch.PoiSearch.Query r8, com.amap.api.services.poisearch.PoiSearch.SearchBound r9, java.util.List<java.lang.String> r10, java.util.List<com.amap.api.services.core.SuggestionCity> r11, int r12, int r13, java.util.ArrayList<com.amap.api.services.core.PoiItem> r14) {
            com.amap.api.services.poisearch.PoiResult r0 = new com.amap.api.services.poisearch.PoiResult
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final com.amap.api.services.poisearch.PoiSearch.SearchBound getBound() {
            r1 = this;
            com.amap.api.services.poisearch.PoiSearch$SearchBound r0 = r1.f5272d
            return r0
    }

    public final int getPageCount() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final java.util.ArrayList<com.amap.api.services.core.PoiItem> getPois() {
            r1 = this;
            java.util.ArrayList<com.amap.api.services.core.PoiItem> r0 = r1.f5270b
            return r0
    }

    public final com.amap.api.services.poisearch.PoiSearch.Query getQuery() {
            r1 = this;
            com.amap.api.services.poisearch.PoiSearch$Query r0 = r1.f5271c
            return r0
    }

    public final java.util.List<com.amap.api.services.core.SuggestionCity> getSearchSuggestionCitys() {
            r1 = this;
            java.util.List<com.amap.api.services.core.SuggestionCity> r0 = r1.f5274f
            return r0
    }

    public final java.util.List<java.lang.String> getSearchSuggestionKeywords() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f5273e
            return r0
    }
}
