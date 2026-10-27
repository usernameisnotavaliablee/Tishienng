package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d3 {
    private static java.util.Map<java.lang.String, com.amap.api.col.p0003l.f3> a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f3134b;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.amap.api.col.p0003l.d3.a = r0
            java.lang.String r0 = ""
            com.amap.api.col.p0003l.d3.f3134b = r0
            return
    }

    public d3() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a() {
            boolean r0 = com.amap.api.col.p0003l.c3.a     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L5
            goto L25
        L5:
            java.util.Map<java.lang.String, com.amap.api.col.3l.f3> r0 = com.amap.api.col.p0003l.d3.a     // Catch: java.lang.Throwable -> L25
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L25
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L25
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.f3 r1 = (com.amap.api.col.p0003l.f3) r1     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            goto Lf
        L25:
            return
    }

    private static void b(int r0, java.lang.String r1, java.lang.String r2) {
            return
    }

    private static void c(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            r0.append(r4)     // Catch: java.lang.Throwable -> L2b
            r0.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            boolean r5 = com.amap.api.col.p0003l.c3.f3063b     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L16
            b(r1, r3, r4)     // Catch: java.lang.Throwable -> L2b
        L16:
            boolean r5 = com.amap.api.col.p0003l.c3.a     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L1b
            goto L2b
        L1b:
            java.util.Map<java.lang.String, com.amap.api.col.3l.f3> r5 = com.amap.api.col.p0003l.d3.a     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L20
            goto L2b
        L20:
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.f3 r2 = (com.amap.api.col.p0003l.f3) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2b
            r2.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L2b
        L2b:
            return
    }

    public static void d(android.content.Context r1) {
            if (r1 != 0) goto L3
            goto L19
        L3:
            k()     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.b5 r0 = com.amap.api.col.p0003l.b5.c(r0)     // Catch: java.lang.Throwable -> L19
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L19
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L19
            r0.g(r1)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public static void e(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "normal"
            java.lang.String r1 = com.amap.api.col.p0003l.d3.f3134b
            r2 = 0
            c(r2, r0, r1, r3, r4)
            return
    }

    public static void f(java.lang.String r2, java.lang.String r3, com.amap.api.maps.model.MarkerOptions r4) {
            if (r4 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            com.amap.api.maps.model.LatLng r1 = r4.getPosition()
            r0.append(r1)
            r0.append(r3)
            java.util.ArrayList r3 = r4.getIcons()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            n(r2, r3)
            return
        L28:
            n(r2, r3)
            return
    }

    public static void g(java.lang.String r3, java.lang.String r4, com.amap.api.maps.model.PolygonOptions r5) {
            if (r5 == 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r1 = r5.getPoints()
            if (r1 == 0) goto L19
            java.lang.String r2 = "points size ="
            r0.append(r2)
            int r1 = r1.size()
            r0.append(r1)
        L19:
            java.lang.String r1 = ";width="
            r0.append(r1)
            float r1 = r5.getStrokeWidth()
            r0.append(r1)
            java.lang.String r1 = ";fillColor="
            r0.append(r1)
            int r1 = r5.getFillColor()
            r0.append(r1)
            java.lang.String r1 = ";strokeColor="
            r0.append(r1)
            int r1 = r5.getStrokeColor()
            r0.append(r1)
            java.lang.String r1 = ";visible="
            r0.append(r1)
            boolean r5 = r5.isVisible()
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " "
            r5.append(r4)
            java.lang.String r4 = r0.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            n(r3, r4)
            return
        L65:
            n(r3, r4)
            return
    }

    public static void h(java.lang.String r3, java.lang.String r4, com.amap.api.maps.model.PolylineOptions r5) {
            if (r5 == 0) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r1 = r5.getPoints()
            if (r1 == 0) goto L19
            java.lang.String r2 = "points size ="
            r0.append(r2)
            int r1 = r1.size()
            r0.append(r1)
        L19:
            java.lang.String r1 = ";width="
            r0.append(r1)
            float r1 = r5.getWidth()
            r0.append(r1)
            java.lang.String r1 = ";color="
            r0.append(r1)
            int r1 = r5.getColor()
            r0.append(r1)
            java.lang.String r1 = ";visible="
            r0.append(r1)
            boolean r5 = r5.isVisible()
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " "
            r5.append(r4)
            java.lang.String r4 = r0.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            n(r3, r4)
            return
        L59:
            n(r3, r4)
            return
    }

    public static void i(java.lang.String r1, java.lang.String r2, java.util.List<com.amap.api.maps.model.MarkerOptions> r3) {
            if (r3 == 0) goto L16
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r3.next()
            com.amap.api.maps.model.MarkerOptions r0 = (com.amap.api.maps.model.MarkerOptions) r0
            f(r1, r2, r0)
            goto L6
        L16:
            return
    }

    public static void j(org.json.JSONObject r9) {
            java.lang.String r0 = ""
            if (r9 != 0) goto L5
            goto L7b
        L5:
            java.lang.String r1 = "able"
            java.lang.String r1 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            boolean r4 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "mobile"
            java.lang.String r1 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> L7b
            boolean r5 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debugupload"
            java.lang.String r1 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> L7b
            boolean r7 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debugwrite"
            java.lang.String r1 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> L7b
            boolean r6 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "forcedUpload"
            java.lang.String r1 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> L7b
            boolean r1 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.p0003l.c3.a = r4     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "di"
            java.lang.String r3 = r9.optString(r3, r0)     // Catch: java.lang.Throwable -> L7b
            boolean r2 = com.amap.api.col.p0003l.g4.x(r3, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "dis"
            java.lang.String r3 = r9.optString(r3, r0)     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L53
            boolean r2 = com.amap.api.col.p0003l.q4.B(r3)     // Catch: java.lang.Throwable -> L7b
            if (r2 != 0) goto L53
            goto L7b
        L53:
            java.lang.String r2 = "filter"
            java.lang.String r9 = r9.optString(r2, r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "&"
            java.lang.String[] r9 = r9.split(r0)     // Catch: java.lang.Throwable -> L7b
            java.util.List r8 = java.util.Arrays.asList(r9)     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.3l.p4 r9 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.3l.b5 r3 = com.amap.api.col.p0003l.b5.c(r9)     // Catch: java.lang.Throwable -> L7b
            r3.k(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L7b
            com.amap.api.col.3l.p4 r9 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.3l.b5 r9 = com.amap.api.col.p0003l.b5.c(r9)     // Catch: java.lang.Throwable -> L7b
            r9.j(r1)     // Catch: java.lang.Throwable -> L7b
        L7b:
            return
    }

    private static void k() {
            java.util.Map<java.lang.String, com.amap.api.col.3l.f3> r0 = com.amap.api.col.p0003l.d3.a     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "overlay"
            com.amap.api.col.3l.h3 r2 = new com.amap.api.col.3l.h3     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L18
            java.util.Map<java.lang.String, com.amap.api.col.3l.f3> r0 = com.amap.api.col.p0003l.d3.a     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "normal"
            com.amap.api.col.3l.g3 r2 = new com.amap.api.col.3l.g3     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L18
        L18:
            return
    }

    public static void l(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "normal"
            java.lang.String r1 = com.amap.api.col.p0003l.d3.f3134b
            r2 = 1
            c(r2, r0, r1, r3, r4)
            return
    }

    public static void m(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "overlay"
            java.lang.String r1 = com.amap.api.col.p0003l.d3.f3134b
            r2 = 0
            c(r2, r0, r1, r3, r4)
            return
    }

    private static void n(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "overlay"
            java.lang.String r1 = com.amap.api.col.p0003l.d3.f3134b
            r2 = 1
            c(r2, r0, r1, r3, r4)
            return
    }
}
