package com.amap.api.services.routepoisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoutePOISearchQuery implements java.lang.Cloneable {
    private com.amap.api.services.core.LatLonPoint a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5610b;

    /* renamed from: c, reason: collision with root package name */
    private int f5611c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType f5612d;

    /* renamed from: e, reason: collision with root package name */
    private int f5613e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.core.LatLonPoint> f5614f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5615g;

    public RoutePOISearchQuery(com.amap.api.services.core.LatLonPoint r1, com.amap.api.services.core.LatLonPoint r2, int r3, com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5610b = r2
            r0.f5611c = r3
            r0.f5612d = r4
            r0.f5613e = r5
            return
    }

    public RoutePOISearchQuery(java.util.List<com.amap.api.services.core.LatLonPoint> r1, com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5614f = r1
            r0.f5612d = r2
            r0.f5613e = r3
            return
    }

    public com.amap.api.services.routepoisearch.RoutePOISearchQuery clone() {
            r8 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
            goto Lc
        L4:
            r0 = move-exception
            java.lang.String r1 = "RoutePOISearchQuery"
            java.lang.String r2 = "RoutePOISearchQueryclone"
            com.amap.api.col.s.j4.i(r0, r1, r2)
        Lc:
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r8.f5614f
            if (r0 == 0) goto L27
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = new com.amap.api.services.routepoisearch.RoutePOISearchQuery
            java.util.List<com.amap.api.services.core.LatLonPoint> r1 = r8.f5614f
            com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r2 = r8.f5612d
            int r3 = r8.f5613e
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = r8.f5615g
            r0.setChannel(r1)
            return r0
        L27:
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r2 = new com.amap.api.services.routepoisearch.RoutePOISearchQuery
            com.amap.api.services.core.LatLonPoint r3 = r8.a
            com.amap.api.services.core.LatLonPoint r4 = r8.f5610b
            int r5 = r8.f5611c
            com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r6 = r8.f5612d
            int r7 = r8.f5613e
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r0 = r8.f5615g
            r2.setChannel(r0)
            return r2
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m41clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r1.clone()
            return r0
    }

    public java.lang.String getChannel() {
            r1 = this;
            java.lang.String r0 = r1.f5615g
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getFrom() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.a
            return r0
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.f5611c
            return r0
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolylines() {
            r1 = this;
            java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5614f
            return r0
    }

    public int getRange() {
            r1 = this;
            int r0 = r1.f5613e
            return r0
    }

    public com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType getSearchType() {
            r1 = this;
            com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r0 = r1.f5612d
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getTo() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5610b
            return r0
    }

    public void setChannel(java.lang.String r1) {
            r0 = this;
            r0.f5615g = r1
            return
    }
}
