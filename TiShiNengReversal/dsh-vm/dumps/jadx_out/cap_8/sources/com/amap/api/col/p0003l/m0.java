package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    private static com.amap.api.col.p0003l.m0 f3677d;
    private com.amap.api.col.p0003l.b8 a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.LinkedHashMap<java.lang.String, com.amap.api.col.p0003l.c8> f3678b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3679c;

    private m0() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f3678b = r0
            r0 = 1
            r1.f3679c = r0
            com.amap.api.col.3l.b8 r0 = r1.a     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L17
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.k()     // Catch: java.lang.Throwable -> L17
            r1.a = r0     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public static com.amap.api.col.p0003l.m0 a() {
            com.amap.api.col.3l.m0 r0 = f()
            return r0
    }

    private static synchronized com.amap.api.col.p0003l.m0 f() {
            java.lang.Class<com.amap.api.col.3l.m0> r0 = com.amap.api.col.p0003l.m0.class
            monitor-enter(r0)
            com.amap.api.col.3l.m0 r1 = com.amap.api.col.p0003l.m0.f3677d     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Lf
            com.amap.api.col.3l.m0 r1 = new com.amap.api.col.3l.m0     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.p0003l.m0.f3677d = r1     // Catch: java.lang.Throwable -> L19
            goto L19
        Lf:
            com.amap.api.col.3l.b8 r2 = r1.a     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L19
            com.amap.api.col.3l.b8 r2 = com.amap.api.col.p0003l.b8.j()     // Catch: java.lang.Throwable -> L19
            r1.a = r2     // Catch: java.lang.Throwable -> L19
        L19:
            com.amap.api.col.3l.m0 r1 = com.amap.api.col.p0003l.m0.f3677d     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    private void g() {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r3.f3678b
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r3.f3678b     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
            if (r1 > 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L39
        Lf:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r3.f3678b     // Catch: java.lang.Throwable -> Ld
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld
        L19:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Ld
            r2.getKey()     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.3l.i0 r2 = (com.amap.api.col.p0003l.i0) r2     // Catch: java.lang.Throwable -> Ld
            r2.a()     // Catch: java.lang.Throwable -> Ld
            goto L19
        L32:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r3.f3678b     // Catch: java.lang.Throwable -> Ld
            r1.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    private static void h() {
            r0 = 0
            com.amap.api.col.p0003l.m0.f3677d = r0
            return
    }

    public final void b(com.amap.api.col.p0003l.l0 r4) {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r3.f3678b
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r3.f3678b     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r4.b()     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.3l.i0 r1 = (com.amap.api.col.p0003l.i0) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r4 = move-exception
            goto L23
        L15:
            r1.a()     // Catch: java.lang.Throwable -> L13
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r3.f3678b     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L13
            r1.remove(r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    public final void c(com.amap.api.col.p0003l.l0 r4, android.content.Context r5) throws com.amap.api.col.p0003l.fk {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r3.f3678b
            java.lang.String r1 = r4.b()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L2e
            com.amap.api.col.3l.i0 r0 = new com.amap.api.col.3l.i0
            r1 = r4
            com.amap.api.col.3l.c1 r1 = (com.amap.api.col.p0003l.c1) r1
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r5 = r3.f3678b
            monitor-enter(r5)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r3.f3678b     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r4.b()     // Catch: java.lang.Throwable -> L2b
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            throw r4
        L2e:
            com.amap.api.col.3l.b8 r5 = r3.a
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r3.f3678b
            java.lang.String r4 = r4.b()
            java.lang.Object r4 = r0.get(r4)
            com.amap.api.col.3l.c8 r4 = (com.amap.api.col.p0003l.c8) r4
            r5.b(r4)
            return
    }

    public final void d() {
            r1 = this;
            r1.g()
            com.amap.api.col.3l.b8 r0 = r1.a
            r0.g()
            r0 = 0
            r1.a = r0
            h()
            return
    }

    public final void e(com.amap.api.col.p0003l.l0 r3) {
            r2 = this;
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r2.f3678b
            java.lang.String r1 = r3.b()
            java.lang.Object r0 = r0.get(r1)
            com.amap.api.col.3l.i0 r0 = (com.amap.api.col.p0003l.i0) r0
            if (r0 == 0) goto L22
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r1 = r2.f3678b
            monitor-enter(r1)
            r0.b()     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r2.f3678b     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L22:
            return
    }
}
