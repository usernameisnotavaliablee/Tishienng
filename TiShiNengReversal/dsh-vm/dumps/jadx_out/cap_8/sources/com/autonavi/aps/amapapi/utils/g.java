package com.autonavi.aps.amapapi.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    private static com.autonavi.aps.amapapi.utils.g f5858f;

    /* renamed from: i, reason: collision with root package name */
    private static long f5859i;
    java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f5860b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.LinkedHashMap<java.lang.String, java.lang.Long> f5861c;

    /* renamed from: d, reason: collision with root package name */
    private java.io.File f5862d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5863e;

    /* renamed from: g, reason: collision with root package name */
    private android.content.Context f5864g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5865h;

    static {
            return
    }

    private g(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f5861c = r0
            r0 = 0
            r2.f5863e = r0
            java.lang.String r1 = ""
            r2.a = r1
            r2.f5860b = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.f5864g = r3
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r3 = r3.getPath()
            java.lang.String r0 = r2.f5863e
            if (r0 != 0) goto L31
            android.content.Context r0 = r2.f5864g
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.j.l(r0)
            r2.f5863e = r0
        L31:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "reportRecorder"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3b
            r2.f5862d = r0     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r3 = move-exception
            com.amap.api.col.p0003l.p9.a(r3)
        L3f:
            r2.c()
            return
    }

    public static synchronized com.autonavi.aps.amapapi.utils.g a(android.content.Context r2) {
            java.lang.Class<com.autonavi.aps.amapapi.utils.g> r0 = com.autonavi.aps.amapapi.utils.g.class
            monitor-enter(r0)
            com.autonavi.aps.amapapi.utils.g r1 = com.autonavi.aps.amapapi.utils.g.f5858f     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.autonavi.aps.amapapi.utils.g r1 = new com.autonavi.aps.amapapi.utils.g     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.autonavi.aps.amapapi.utils.g.f5858f = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.autonavi.aps.amapapi.utils.g r2 = com.autonavi.aps.amapapi.utils.g.f5858f     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private boolean b(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = r4.f5860b
            java.lang.String r1 = "lastavedate"
            java.lang.String r2 = "pref"
            if (r0 != 0) goto L10
            java.lang.String r0 = "0"
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.i.a(r5, r2, r1, r0)
            r4.f5860b = r0
        L10:
            java.lang.String r0 = r4.f5860b
            java.lang.String r3 = r4.a
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            r5 = 0
            return r5
        L1c:
            android.content.SharedPreferences$Editor r5 = com.autonavi.aps.amapapi.utils.i.a(r5, r2)
            java.lang.String r0 = r4.a
            com.autonavi.aps.amapapi.utils.i.a(r5, r1, r0)
            com.autonavi.aps.amapapi.utils.i.a(r5)
            java.lang.String r5 = r4.a
            r4.f5860b = r5
            r5 = 1
            return r5
    }

    private synchronized void c() {
            r7 = this;
            monitor-enter(r7)
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r0 = r7.f5861c     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            if (r0 <= 0) goto Lf
            monitor-exit(r7)
            return
        Ld:
            r0 = move-exception
            goto L6f
        Lf:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "yyyyMMdd"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L6d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.format(r1)     // Catch: java.lang.Throwable -> L6d
            r7.a = r0     // Catch: java.lang.Throwable -> L6d
            java.io.File r0 = r7.f5862d     // Catch: java.lang.Throwable -> L6d
            java.util.List r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L2f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = com.amap.api.col.p0003l.j4.g(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r7.f5863e     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = com.autonavi.aps.amapapi.security.a.b(r1, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = ","
            java.lang.String[] r1 = r2.split(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            if (r2 <= r3) goto L2f
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r2 = r7.f5861c     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L2f
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2f
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L2f
            goto L2f
        L6b:
            monitor-exit(r7)
            return
        L6d:
            monitor-exit(r7)
            return
        L6f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    private void d() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r1 = r5.f5861c     // Catch: java.lang.Throwable -> L6d
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6d
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.Object r4 = r2.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r4 = ","
            r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r2 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r4 = "UTF-8"
            byte[] r2 = r2.getBytes(r4)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r4 = r5.f5863e     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            byte[] r2 = com.autonavi.aps.amapapi.security.a.a(r2, r4)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r2 = com.amap.api.col.p0003l.j4.f(r2)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            java.lang.String r2 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> Lf java.lang.Throwable -> L6d
            goto Lf
        L5e:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L6d
            java.io.File r1 = r5.f5862d     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.j.a(r1, r0)     // Catch: java.lang.Throwable -> L6d
        L6d:
            return
    }

    public final synchronized void a() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f5865h     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r1.d()     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r1.f5865h = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L10
        Le:
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public final synchronized void a(com.amap.api.location.AMapLocation r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r0 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r6.a     // Catch: java.lang.Throwable -> Ld5
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> Ld5
            if (r0 != 0) goto L15
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r0 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld5
            r1 = 8
            if (r0 >= r1) goto L29
        L15:
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r0 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r6.a     // Catch: java.lang.Throwable -> Ld5
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto L6f
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r0 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld5
            r1 = 9
            if (r0 < r1) goto L6f
        L29:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld5
            r0.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r1 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Ld5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld5
        L38:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld5
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L38
            r0.add(r2)     // Catch: java.lang.Throwable -> L38
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r3 = r6.f5861c     // Catch: java.lang.Throwable -> L38
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L38
            int r3 = r3 + (-7)
            if (r2 != r3) goto L38
        L59:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld5
        L5d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld5
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r2 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            r2.remove(r1)     // Catch: java.lang.Throwable -> Ld5
            goto L5d
        L6f:
            int r0 = r7.getErrorCode()     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto L77
            monitor-exit(r6)
            return
        L77:
            int r0 = r7.getLocationType()     // Catch: java.lang.Throwable -> Ld5
            r1 = 6
            if (r0 == r1) goto Ld3
            int r7 = r7.getLocationType()     // Catch: java.lang.Throwable -> Ld5
            r0 = 5
            if (r7 != r0) goto L86
            goto Ld3
        L86:
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r7 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r6.a     // Catch: java.lang.Throwable -> Ld5
            boolean r7 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> Ld5
            r0 = 1
            if (r7 == 0) goto Laf
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r7 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r6.a     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Ld5
            long r2 = r7.longValue()     // Catch: java.lang.Throwable -> Ld5
            long r2 = r2 + r0
            com.autonavi.aps.amapapi.utils.g.f5859i = r2     // Catch: java.lang.Throwable -> Ld5
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r7 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r6.a     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Ld5
            r7.put(r0, r1)     // Catch: java.lang.Throwable -> Ld5
            goto Lbc
        Laf:
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r7 = r6.f5861c     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r6.a     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Ld5
            r7.put(r2, r3)     // Catch: java.lang.Throwable -> Ld5
            com.autonavi.aps.amapapi.utils.g.f5859i = r0     // Catch: java.lang.Throwable -> Ld5
        Lbc:
            long r0 = com.autonavi.aps.amapapi.utils.g.f5859i     // Catch: java.lang.Throwable -> Ld5
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto Lce
            r4 = 100
            long r0 = r0 % r4
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto Lce
            r6.a()     // Catch: java.lang.Throwable -> Ld5
        Lce:
            r7 = 1
            r6.f5865h = r7     // Catch: java.lang.Throwable -> Ld5
            monitor-exit(r6)
            return
        Ld3:
            monitor-exit(r6)
            return
        Ld5:
            monitor-exit(r6)
            return
    }

    public final synchronized void b() {
            r5 = this;
            monitor-enter(r5)
            android.content.Context r0 = r5.f5864g     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r5.b(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r0 = r5.f5861c     // Catch: java.lang.Throwable -> L4f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4f
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4f
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L2e
            goto L15
        L2e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "param_long_first"
            java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "param_long_second"
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L15
            android.content.Context r1 = r5.f5864g     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "O023"
            com.autonavi.aps.amapapi.utils.h.a(r1, r3, r2)     // Catch: java.lang.Throwable -> L15
            goto L15
        L4d:
            monitor-exit(r5)
            return
        L4f:
            monitor-exit(r5)
            return
    }
}
