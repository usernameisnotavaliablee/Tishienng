package com.amap.api.trace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TraceOverlay {
    public static final int TRACE_STATUS_FAILURE = 3;
    public static final int TRACE_STATUS_FINISH = 2;
    public static final int TRACE_STATUS_PREPARE = 4;
    public static final int TRACE_STATUS_PROCESSING = 1;
    private com.amap.api.maps.model.Polyline a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.model.PolylineOptions f5653b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.maps.AMap f5654c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.model.LatLng> f5655d;

    /* renamed from: e, reason: collision with root package name */
    private int f5656e;

    /* renamed from: f, reason: collision with root package name */
    private int f5657f;

    /* renamed from: g, reason: collision with root package name */
    private int f5658g;

    public TraceOverlay(com.amap.api.maps.AMap r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5655d = r0
            r0 = 4
            r1.f5656e = r0
            r1.f5654c = r2
            r1.a()
            return
    }

    public TraceOverlay(com.amap.api.maps.AMap r2, java.util.List<com.amap.api.maps.model.LatLng> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5655d = r0
            r0 = 4
            r1.f5656e = r0
            r1.f5654c = r2
            r1.a()
            r1.f5655d = r3
            com.amap.api.maps.model.PolylineOptions r0 = r1.f5653b
            r0.addAll(r3)
            com.amap.api.maps.model.PolylineOptions r3 = r1.f5653b
            com.amap.api.maps.model.Polyline r2 = r2.addPolyline(r3)
            r1.a = r2
            return
    }

    private com.amap.api.maps.model.PolylineOptions a() {
            r2 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r2.f5653b
            if (r0 != 0) goto L1b
            com.amap.api.maps.model.PolylineOptions r0 = new com.amap.api.maps.model.PolylineOptions
            r0.<init>()
            r2.f5653b = r0
            java.lang.String r1 = "tracelinetexture.png"
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r1)
            r0.setCustomTexture(r1)
            com.amap.api.maps.model.PolylineOptions r0 = r2.f5653b
            r1 = 1109393408(0x42200000, float:40.0)
            r0.width(r1)
        L1b:
            com.amap.api.maps.model.PolylineOptions r0 = r2.f5653b
            return r0
    }

    public void add(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            if (r2 == 0) goto L28
            int r0 = r2.size()
            if (r0 != 0) goto L9
            goto L28
        L9:
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.f5655d
            r0.addAll(r2)
            r1.a()
            com.amap.api.maps.model.Polyline r2 = r1.a
            if (r2 != 0) goto L1f
            com.amap.api.maps.AMap r2 = r1.f5654c
            com.amap.api.maps.model.PolylineOptions r0 = r1.f5653b
            com.amap.api.maps.model.Polyline r2 = r2.addPolyline(r0)
            r1.a = r2
        L1f:
            com.amap.api.maps.model.Polyline r2 = r1.a
            if (r2 == 0) goto L28
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.f5655d
            r2.setPoints(r0)
        L28:
            return
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.f5657f
            return r0
    }

    public int getTraceStatus() {
            r1 = this;
            int r0 = r1.f5656e
            return r0
    }

    public int getWaitTime() {
            r1 = this;
            int r0 = r1.f5658g
            return r0
    }

    public void remove() {
            r1 = this;
            com.amap.api.maps.model.Polyline r0 = r1.a
            if (r0 == 0) goto L7
            r0.remove()
        L7:
            return
    }

    public void setDistance(int r1) {
            r0 = this;
            r0.f5657f = r1
            return
    }

    public void setProperCamera(java.util.List<com.amap.api.maps.model.LatLng> r3) {
            r2 = this;
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            if (r3 == 0) goto L30
            int r1 = r3.size()
            if (r1 != 0) goto Ld
            goto L30
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            r0.include(r1)
            goto L11
        L21:
            com.amap.api.maps.model.LatLngBounds r3 = r0.build()     // Catch: java.lang.Throwable -> L30
            com.amap.api.maps.AMap r0 = r2.f5654c     // Catch: java.lang.Throwable -> L30
            r1 = 20
            com.amap.api.maps.CameraUpdate r3 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r3, r1)     // Catch: java.lang.Throwable -> L30
            r0.moveCamera(r3)     // Catch: java.lang.Throwable -> L30
        L30:
            return
    }

    public void setTraceStatus(int r1) {
            r0 = this;
            r0.f5656e = r1
            return
    }

    public void setWaitTime(int r1) {
            r0 = this;
            r0.f5658g = r1
            return
    }

    public void zoopToSpan() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions r0 = r1.f5653b
            java.util.List r0 = r0.getPoints()
            r1.setProperCamera(r0)
            return
    }
}
