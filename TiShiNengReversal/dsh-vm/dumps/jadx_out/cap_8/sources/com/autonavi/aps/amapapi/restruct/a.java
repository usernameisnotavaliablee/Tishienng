package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a<T> {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.io.File f5716b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5717c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a.C0092a> f5718d;

    /* renamed from: e, reason: collision with root package name */
    private android.os.Handler f5719e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5720f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5721g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.Runnable f5722h;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.autonavi.aps.amapapi.restruct.a$a, reason: collision with other inner class name */
    static class C0092a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        long f5723b;

        /* renamed from: c, reason: collision with root package name */
        long f5724c;

        public C0092a(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5723b = r2
                r0.f5724c = r4
                return
        }
    }

    public a(android.content.Context r2, java.lang.String r3, android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5717c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f5718d = r0
            r0 = 0
            r1.f5720f = r0
            com.autonavi.aps.amapapi.restruct.a$2 r0 = new com.autonavi.aps.amapapi.restruct.a$2
            r0.<init>(r1)
            r1.f5722h = r0
            if (r2 != 0) goto L1a
            return
        L1a:
            r1.f5719e = r4
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L24
            java.lang.String r3 = "unknow"
        L24:
            r1.a = r3
            java.lang.String r3 = com.autonavi.aps.amapapi.utils.j.l(r2)
            r1.f5720f = r3
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getPath()
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r1.a     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L3d
            r1.f5716b = r3     // Catch: java.lang.Throwable -> L3d
        L3d:
            r1.d()
            return
    }

    public static int a(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    static /* synthetic */ java.util.Map a(com.autonavi.aps.amapapi.restruct.a r0) {
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r0 = r0.f5718d
            return r0
    }

    private void b(T r10, long r11) {
            r9 = this;
            if (r10 == 0) goto L57
            long r0 = r9.d(r10)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            goto L57
        Ld:
            java.lang.String r0 = r9.b(r10)
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r1 = r9.f5718d
            java.lang.Object r1 = r1.get(r0)
            com.autonavi.aps.amapapi.restruct.a$a r1 = (com.autonavi.aps.amapapi.restruct.a.C0092a) r1
            r2 = 1
            if (r1 != 0) goto L35
            r9.a(r10, r11)
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r1 = r9.f5718d
            com.autonavi.aps.amapapi.restruct.a$a r3 = new com.autonavi.aps.amapapi.restruct.a$a
            int r4 = r9.c(r10)
            long r5 = r9.d(r10)
            r7 = r11
            r3.<init>(r4, r5, r7)
            r1.put(r0, r3)
            r9.f5721g = r2
            return
        L35:
            r7 = r11
            r1.f5724c = r7
            int r11 = r1.a
            int r12 = r9.c(r10)
            if (r11 == r12) goto L52
            r9.a(r10, r7)
            int r11 = r9.c(r10)
            r1.a = r11
            long r10 = r9.d(r10)
            r1.f5723b = r10
            r9.f5721g = r2
            return
        L52:
            long r11 = r1.f5723b
            r9.a(r10, r11)
        L57:
            return
    }

    static /* synthetic */ boolean b(com.autonavi.aps.amapapi.restruct.a r0) {
            boolean r0 = r0.f5717c
            return r0
    }

    static /* synthetic */ boolean c(com.autonavi.aps.amapapi.restruct.a r0) {
            boolean r0 = r0.f5721g
            return r0
    }

    private void d() {
            r10 = this;
            java.io.File r0 = r10.f5716b     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            byte[] r1 = com.amap.api.col.p0003l.j4.g(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r10.f5720f     // Catch: java.lang.Throwable -> L5b
            byte[] r1 = com.autonavi.aps.amapapi.security.a.b(r1, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = ","
            java.lang.String[] r1 = r2.split(r1)     // Catch: java.lang.Throwable -> L5b
            int r2 = r1.length     // Catch: java.lang.Throwable -> L5b
            r3 = 4
            if (r2 < r3) goto L3a
            r2 = 3
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L5b
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L5b
        L38:
            r8 = r2
            goto L3f
        L3a:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L5b
            goto L38
        L3f:
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r2 = r10.f5718d     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L5b
            com.autonavi.aps.amapapi.restruct.a$a r4 = new com.autonavi.aps.amapapi.restruct.a$a     // Catch: java.lang.Throwable -> L5b
            r5 = 1
            r5 = r1[r5]     // Catch: java.lang.Throwable -> L5b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L5b
            r6 = 2
            r1 = r1[r6]     // Catch: java.lang.Throwable -> L5b
            long r6 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r5, r6, r8)     // Catch: java.lang.Throwable -> L5b
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L5b
            goto La
        L5b:
            java.io.File r1 = r10.f5716b     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La
            java.io.File r1 = r10.f5716b     // Catch: java.lang.Throwable -> L69
            r1.delete()     // Catch: java.lang.Throwable -> L69
            goto La
        L69:
            return
    }

    static /* synthetic */ void d(com.autonavi.aps.amapapi.restruct.a r0) {
            r0.e()
            return
    }

    private void e() {
            r8 = this;
            long r0 = r8.c()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L86
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r0 = r8.f5718d
            r0.size()
            long r0 = r8.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4d
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r2 = r8.f5718d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r4 = r8.f5718d
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r4.get(r3)
            com.autonavi.aps.amapapi.restruct.a$a r3 = (com.autonavi.aps.amapapi.restruct.a.C0092a) r3
            long r3 = r3.f5724c
            long r3 = r0 - r3
            long r5 = r8.b()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L25
            r2.remove()
            goto L25
        L4d:
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r0 = r8.f5718d
            int r0 = r0.size()
            long r0 = (long) r0
            long r2 = r8.c()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L86
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r1 = r8.f5718d
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            com.autonavi.aps.amapapi.restruct.a$1 r1 = new com.autonavi.aps.amapapi.restruct.a$1
            r1.<init>(r8)
            java.util.Collections.sort(r0, r1)
            long r1 = r8.c()
            int r2 = (int) r1
        L74:
            int r1 = r0.size()
            if (r2 >= r1) goto L86
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r1 = r8.f5718d
            java.lang.Object r3 = r0.get(r2)
            r1.remove(r3)
            int r2 = r2 + 1
            goto L74
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r1 = r8.f5718d
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L95:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L106
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = ","
            r3.append(r4)
            java.lang.Object r5 = r2.getValue()
            com.autonavi.aps.amapapi.restruct.a$a r5 = (com.autonavi.aps.amapapi.restruct.a.C0092a) r5
            int r5 = r5.a
            r3.append(r5)
            r3.append(r4)
            java.lang.Object r5 = r2.getValue()
            com.autonavi.aps.amapapi.restruct.a$a r5 = (com.autonavi.aps.amapapi.restruct.a.C0092a) r5
            long r5 = r5.f5723b
            r3.append(r5)
            r3.append(r4)
            java.lang.Object r2 = r2.getValue()
            com.autonavi.aps.amapapi.restruct.a$a r2 = (com.autonavi.aps.amapapi.restruct.a.C0092a) r2
            long r4 = r2.f5724c
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L104
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> L104
            java.lang.String r4 = "UTF-8"
            byte[] r2 = r2.getBytes(r4)     // Catch: java.io.UnsupportedEncodingException -> L104
            java.lang.String r4 = r8.f5720f     // Catch: java.io.UnsupportedEncodingException -> L104
            byte[] r2 = com.autonavi.aps.amapapi.security.a.a(r2, r4)     // Catch: java.io.UnsupportedEncodingException -> L104
            java.lang.String r2 = com.amap.api.col.p0003l.j4.f(r2)     // Catch: java.io.UnsupportedEncodingException -> L104
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L104
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L104
            java.lang.String r2 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L104
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L104
            goto L95
        L104:
            goto L95
        L106:
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L115
            java.io.File r1 = r8.f5716b
            com.autonavi.aps.amapapi.utils.j.a(r1, r0)
        L115:
            return
    }

    static /* synthetic */ boolean e(com.autonavi.aps.amapapi.restruct.a r1) {
            r0 = 0
            r1.f5721g = r0
            return r0
    }

    static /* synthetic */ android.os.Handler f(com.autonavi.aps.amapapi.restruct.a r0) {
            android.os.Handler r0 = r0.f5719e
            return r0
    }

    static /* synthetic */ java.lang.Runnable g(com.autonavi.aps.amapapi.restruct.a r0) {
            java.lang.Runnable r0 = r0.f5722h
            return r0
    }

    public final void a() {
            r4 = this;
            boolean r0 = r4.f5717c
            if (r0 != 0) goto L17
            android.os.Handler r0 = r4.f5719e
            if (r0 == 0) goto L17
            java.lang.Runnable r1 = r4.f5722h
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r4.f5719e
            java.lang.Runnable r1 = r4.f5722h
            r2 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r2)
        L17:
            r0 = 1
            r4.f5717c = r0
            return
    }

    public final void a(T r3) {
            r2 = this;
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            r2.b(r3, r0)
            return
    }

    abstract void a(T r1, long r2);

    public final void a(java.util.List<T> r9) {
            r8 = this;
            long r4 = com.autonavi.aps.amapapi.utils.j.b()
            java.util.Iterator r0 = r9.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            r8.b(r1, r4)
            goto L8
        L16:
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r0 = r8.f5718d
            int r0 = r0.size()
            int r1 = r9.size()
            if (r0 < r1) goto L25
            r0 = 1
            r8.f5721g = r0
        L25:
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r0 = r8.f5718d
            int r0 = r0.size()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r1) goto L39
            long r0 = r8.c()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L65
        L39:
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r0 = r8.f5718d
            r0.clear()
            java.util.Iterator r9 = r9.iterator()
        L42:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r9.next()
            java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a$a> r6 = r8.f5718d
            java.lang.String r7 = r8.b(r0)
            r1 = r0
            com.autonavi.aps.amapapi.restruct.a$a r0 = new com.autonavi.aps.amapapi.restruct.a$a
            r2 = r1
            int r1 = r8.c(r2)
            long r2 = r8.d(r2)
            r0.<init>(r1, r2, r4)
            r6.put(r7, r0)
            goto L42
        L65:
            return
    }

    public final void a(boolean r3) {
            r2 = this;
            android.os.Handler r0 = r2.f5719e
            if (r0 == 0) goto L9
            java.lang.Runnable r1 = r2.f5722h
            r0.removeCallbacks(r1)
        L9:
            if (r3 != 0) goto L10
            java.lang.Runnable r3 = r2.f5722h
            r3.run()
        L10:
            r3 = 0
            r2.f5717c = r3
            return
    }

    abstract long b();

    public abstract java.lang.String b(T r1);

    abstract int c(T r1);

    abstract long c();

    abstract long d(T r1);

    public final long e(T r5) {
            r4 = this;
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r4.d(r5)
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            return r0
    }
}
