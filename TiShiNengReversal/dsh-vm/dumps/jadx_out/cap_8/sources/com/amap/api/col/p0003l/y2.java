package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class y2 {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4259b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4260c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4261d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4262e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f4263f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4264g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f4265h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f4266i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f4267j;

    /* renamed from: k, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.Boolean> f4268k;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> l;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> m;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.amap.api.col.p0003l.y2.f4268k = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.amap.api.col.p0003l.y2.l = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.amap.api.col.p0003l.y2.m = r0
            return
    }

    public y2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static <T> java.lang.String a(java.util.Map<java.lang.String, T> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "{"
            r0.append(r1)     // Catch: java.lang.Throwable -> L5a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L5a
        L12:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L47
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L5a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "\""
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5a
            r2.append(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "\":"
            r2.append(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5a
            r0.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L5a
            r0.append(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = ","
            r0.append(r1)     // Catch: java.lang.Throwable -> L5a
            goto L12
        L47:
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L5a
            int r4 = r4 + (-1)
            r0.deleteCharAt(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "}"
            r0.append(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L5a
            return r4
        L5a:
            r4 = 0
            return r4
    }

    private static java.lang.String b(boolean r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "{\"Quest\":"
            r0.append(r1)     // Catch: java.lang.Throwable -> L17
            r0.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "}"
            r0.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            r2 = 0
            return r2
    }

    public static void c(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4260c
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_heatmap"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O009"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4260c = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void d(android.content.Context r2, int r3) {
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "amap_3dmap_draw_fail"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L17
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = a(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "O023"
            i(r2, r0, r3)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public static void e(android.content.Context r3, int r4, int r5, java.lang.String r6) {
            if (r3 != 0) goto L4
            goto L84
        L4:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r0 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L84
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r1 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r1 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L28
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L28
            r2 = 2
            if (r1 < r2) goto L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r3 = move-exception
            goto L82
        L2a:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "amap_3dmap_map_request_type"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L28
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "amap_3dmap_map_request_info"
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = a(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "O019"
            i(r3, r6, r5)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            boolean r3 = r3.containsKey(r5)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L61
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L28
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L28
            goto L80
        L61:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r5 = com.amap.api.col.p0003l.y2.l     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L28
            int r3 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            r5.put(r4, r3)     // Catch: java.lang.Throwable -> L28
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L84
        L84:
            return
    }

    public static void f(android.content.Context r3, int r4, long r5, long r7) {
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r0 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L84
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r1 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r1 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L24
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L24
            r2 = 2
            if (r1 < r2) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r3 = move-exception
            goto L82
        L26:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "amap_3dmap_map_request_rendertime"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L24
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = "amap_3dmap_map_request_size"
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L24
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = a(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = "O020"
            i(r3, r6, r5)     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            boolean r3 = r3.containsKey(r5)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L61
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L24
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L24
            goto L80
        L61:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r3 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r5 = com.amap.api.col.p0003l.y2.m     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L24
            r5.put(r4, r3)     // Catch: java.lang.Throwable -> L24
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L84
        L84:
            return
    }

    public static void g(android.content.Context r3, long r4) {
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "amap_3dmap_rendertime"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L22
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "amap_3dmap_render_background"
            r1 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L22
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = a(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "O005"
            i(r3, r5, r4)     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public static synchronized void h(android.content.Context r3, java.lang.String r4) {
            java.lang.Class<com.amap.api.col.3l.y2> r0 = com.amap.api.col.p0003l.y2.class
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.amap.api.col.p0003l.y2.f4268k     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L4a
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto Le
            goto L4a
        Le:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.amap.api.col.p0003l.y2.f4268k     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L26
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.amap.api.col.p0003l.y2.f4268k     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L26
            monitor-exit(r0)
            return
        L26:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "amap_3dmap_coordinate"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "O008"
            i(r3, r2, r1)     // Catch: java.lang.Throwable -> L4c
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = com.amap.api.col.p0003l.y2.f4268k     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L48
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = com.amap.api.col.p0003l.y2.f4268k     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4c
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L4c
        L48:
            monitor-exit(r0)
            return
        L4a:
            monitor-exit(r0)
            return
        L4c:
            monitor-exit(r0)
            return
    }

    private static void i(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            if (r3 != 0) goto L3
            goto L12
        L3:
            com.amap.api.col.3l.i7 r0 = new com.amap.api.col.3l.i7     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "3dmap"
            java.lang.String r2 = "10.0.600"
            r0.<init>(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L12
            r0.a(r5)     // Catch: java.lang.Throwable -> L12
            com.amap.api.col.p0003l.j7.d(r0, r3)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static void j(android.content.Context r4, boolean r5) {
            java.lang.String r5 = b(r5)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.i7 r0 = new com.amap.api.col.3l.i7     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "3dmap"
            java.lang.String r2 = "10.0.600"
            java.lang.String r3 = "O001"
            r0.<init>(r4, r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            r0.a(r5)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.p0003l.j7.d(r0, r4)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public static void k(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4261d
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_offlinemap"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O010"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4261d = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void l(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "amap_3dmap_engine_init_fail"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = a(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "O021"
            i(r2, r0, r3)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public static void m(android.content.Context r2, boolean r3) {
            boolean r0 = com.amap.api.col.p0003l.y2.a
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_stylemap"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "O006"
            i(r2, r0, r3)     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            com.amap.api.col.p0003l.y2.a = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void n(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4262e
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_particleoverlay"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O011"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4262e = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void o(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "amap_3dmap_res_load_fail"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = a(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "O022"
            i(r2, r0, r3)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public static void p(android.content.Context r2, boolean r3) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4259b
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_indoormap"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "O007"
            i(r2, r0, r3)     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            com.amap.api.col.p0003l.y2.f4259b = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void q(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4264g
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_bzmapreview"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O012"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4264g = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void r(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4265h
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_wxmapreview"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O013"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4265h = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void s(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4266i
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_dxmapreview"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "0016"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4266i = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void t(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4263f
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_renderfps"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O014"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4263f = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static void u(android.content.Context r4) {
            boolean r0 = com.amap.api.col.p0003l.y2.f4267j
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "amap_3dmap_buildingoverlay"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "O015"
            i(r4, r1, r0)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.y2.f4267j = r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }
}
