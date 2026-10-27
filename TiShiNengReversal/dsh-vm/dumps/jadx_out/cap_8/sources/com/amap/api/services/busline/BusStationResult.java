package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BusStationResult {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.busline.BusStationItem> f5108b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.busline.BusStationQuery f5109c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<java.lang.String> f5110d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.SuggestionCity> f5111e;

    private BusStationResult(com.amap.api.services.busline.BusStationQuery r2, int r3, java.util.List<com.amap.api.services.core.SuggestionCity> r4, java.util.List<java.lang.String> r5, java.util.ArrayList<com.amap.api.services.busline.BusStationItem> r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5108b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5110d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5111e = r0
            r1.f5109c = r2
            int r2 = r1.a(r3)
            r1.a = r2
            r1.f5111e = r4
            r1.f5110d = r5
            r1.f5108b = r6
            return
    }

    private int a(int r2) {
            r1 = this;
            com.amap.api.services.busline.BusStationQuery r0 = r1.f5109c
            int r0 = r0.getPageSize()
            int r2 = r2 + r0
            int r2 = r2 + (-1)
            int r2 = r2 / r0
            r0 = 30
            if (r2 <= r0) goto Lf
            return r0
        Lf:
            return r2
    }

    public static com.amap.api.services.busline.BusStationResult createPagedResult(com.amap.api.services.busline.BusStationQuery r6, int r7, java.util.List<com.amap.api.services.core.SuggestionCity> r8, java.util.List<java.lang.String> r9, java.util.ArrayList<com.amap.api.services.busline.BusStationItem> r10) {
            com.amap.api.services.busline.BusStationResult r0 = new com.amap.api.services.busline.BusStationResult
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final java.util.List<com.amap.api.services.busline.BusStationItem> getBusStations() {
            r1 = this;
            java.util.ArrayList<com.amap.api.services.busline.BusStationItem> r0 = r1.f5108b
            return r0
    }

    public final int getPageCount() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final com.amap.api.services.busline.BusStationQuery getQuery() {
            r1 = this;
            com.amap.api.services.busline.BusStationQuery r0 = r1.f5109c
            return r0
    }

    public final java.util.List<com.amap.api.services.core.SuggestionCity> getSearchSuggestionCities() {
            r1 = this;
            java.util.List<com.amap.api.services.core.SuggestionCity> r0 = r1.f5111e
            return r0
    }

    public final java.util.List<java.lang.String> getSearchSuggestionKeywords() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f5110d
            return r0
    }
}
