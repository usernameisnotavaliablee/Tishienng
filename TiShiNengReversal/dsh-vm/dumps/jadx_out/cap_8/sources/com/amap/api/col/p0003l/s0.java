package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.amap.api.col.p0003l.s0 f3939b;

    /* renamed from: c, reason: collision with root package name */
    private static com.amap.api.col.p0003l.f6 f3940c;
    private android.content.Context a;

    private s0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            com.amap.api.col.3l.f6 r1 = i(r1)
            com.amap.api.col.p0003l.s0.f3940c = r1
            return
    }

    public static com.amap.api.col.p0003l.s0 b(android.content.Context r2) {
            com.amap.api.col.3l.s0 r0 = com.amap.api.col.p0003l.s0.f3939b
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.3l.s0> r0 = com.amap.api.col.p0003l.s0.class
            monitor-enter(r0)
            com.amap.api.col.3l.s0 r1 = com.amap.api.col.p0003l.s0.f3939b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.s0 r1 = new com.amap.api.col.3l.s0     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.s0.f3939b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.amap.api.col.3l.s0 r2 = com.amap.api.col.p0003l.s0.f3939b
            return r2
    }

    private static java.util.List<java.lang.String> d(java.util.List<com.amap.api.col.p0003l.p0> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r2.size()
            if (r1 <= 0) goto L23
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            com.amap.api.col.3l.p0 r1 = (com.amap.api.col.p0003l.p0) r1
            java.lang.String r1 = r1.a()
            r0.add(r1)
            goto Lf
        L23:
            return r0
    }

    private synchronized void g(java.lang.String r11, int r12, long r13, long[] r15, long[] r16) {
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.l()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            com.amap.api.col.3l.o0 r1 = new com.amap.api.col.3l.o0     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r6 = r15[r0]     // Catch: java.lang.Throwable -> L21
            r8 = r16[r0]     // Catch: java.lang.Throwable -> L21
            r2 = r11
            r5 = r12
            r3 = r13
            r1.<init>(r2, r3, r5, r6, r8)     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = com.amap.api.col.p0003l.o0.a(r11)     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.f6 r12 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L21
            r12.h(r1, r11)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r10)
            return
        L21:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L21
            throw r11
    }

    private static void h(java.lang.String r5, java.lang.String r6) {
            if (r6 == 0) goto L40
            int r0 = r6.length()
            if (r0 <= 0) goto L40
            java.lang.String r0 = com.amap.api.col.p0003l.p0.b(r5)
            com.amap.api.col.3l.f6 r1 = com.amap.api.col.p0003l.s0.f3940c
            java.lang.Class<com.amap.api.col.3l.p0> r2 = com.amap.api.col.p0003l.p0.class
            java.util.List r1 = r1.p(r0, r2)
            int r1 = r1.size()
            if (r1 <= 0) goto L1f
            com.amap.api.col.3l.f6 r1 = com.amap.api.col.p0003l.s0.f3940c
            r1.j(r0, r2)
        L1f:
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r6.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L2c:
            if (r2 >= r1) goto L3b
            r3 = r6[r2]
            com.amap.api.col.3l.p0 r4 = new com.amap.api.col.3l.p0
            r4.<init>(r5, r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L2c
        L3b:
            com.amap.api.col.3l.f6 r5 = com.amap.api.col.p0003l.s0.f3940c
            r5.l(r0)
        L40:
            return
    }

    private static com.amap.api.col.p0003l.f6 i(android.content.Context r2) {
            com.amap.api.col.3l.f6 r0 = new com.amap.api.col.3l.f6     // Catch: java.lang.Throwable -> La
            com.amap.api.col.3l.r0 r1 = com.amap.api.col.p0003l.r0.a()     // Catch: java.lang.Throwable -> La
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r2 = move-exception
            java.lang.String r0 = "OfflineDB"
            java.lang.String r1 = "getDB"
            com.amap.api.col.p0003l.w5.p(r2, r0, r1)
            r2 = 0
            return r2
    }

    private boolean l() {
            r1 = this;
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.a
            com.amap.api.col.3l.f6 r0 = i(r0)
            com.amap.api.col.p0003l.s0.f3940c = r0
        Lc:
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = 1
            return r0
    }

    public final synchronized com.amap.api.col.p0003l.n0 a(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.l()     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            java.lang.String r4 = com.amap.api.col.p0003l.q0.f(r4)     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L25
            java.lang.Class<com.amap.api.col.3l.n0> r2 = com.amap.api.col.p0003l.n0.class
            java.util.List r4 = r0.p(r4, r2)     // Catch: java.lang.Throwable -> L25
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L27
            r0 = 0
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.n0 r4 = (com.amap.api.col.p0003l.n0) r4     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return r4
        L25:
            r4 = move-exception
            goto L29
        L27:
            monitor-exit(r3)
            return r1
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    public final java.util.ArrayList<com.amap.api.col.p0003l.n0> c() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4.l()
            if (r1 != 0) goto Lc
            goto L2a
        Lc:
            com.amap.api.col.3l.f6 r1 = com.amap.api.col.p0003l.s0.f3940c
            java.lang.Class<com.amap.api.col.3l.n0> r2 = com.amap.api.col.p0003l.n0.class
            java.lang.String r3 = ""
            java.util.List r1 = r1.p(r3, r2)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            com.amap.api.col.3l.n0 r2 = (com.amap.api.col.p0003l.n0) r2
            r0.add(r2)
            goto L1a
        L2a:
            return r0
    }

    public final synchronized void e(com.amap.api.col.p0003l.n0 r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.l()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.lang.String r0 = r3.j()     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = com.amap.api.col.p0003l.q0.h(r0)     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.f6 r1 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L23
            r1.h(r3, r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r3.k()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r3.e()     // Catch: java.lang.Throwable -> L23
            h(r3, r0)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L23:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public final void f(java.lang.String r8, int r9, long r10, long r12, long r14) {
            r7 = this;
            boolean r0 = r7.l()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 5
            r1 = r12
            long[] r13 = new long[r0]
            r12 = 0
            r13[r12] = r1
            r1 = 1
            r2 = 0
            r13[r1] = r2
            r4 = 2
            r13[r4] = r2
            r5 = 3
            r13[r5] = r2
            r6 = 4
            r13[r6] = r2
            long[] r0 = new long[r0]
            r0[r12] = r14
            r0[r1] = r2
            r0[r4] = r2
            r0[r5] = r2
            r0[r6] = r2
            r11 = r10
            r14 = r0
            r10 = r9
            r9 = r8
            r8 = r7
            r8.g(r9, r10, r11, r13, r14)
            return
    }

    public final synchronized java.util.List<java.lang.String> j(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            boolean r1 = r3.l()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto Le
            monitor-exit(r3)
            return r0
        Le:
            java.lang.String r4 = com.amap.api.col.p0003l.p0.b(r4)     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.f6 r1 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L23
            java.lang.Class<com.amap.api.col.3l.p0> r2 = com.amap.api.col.p0003l.p0.class
            java.util.List r4 = r1.p(r4, r2)     // Catch: java.lang.Throwable -> L23
            java.util.List r4 = d(r4)     // Catch: java.lang.Throwable -> L23
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return r0
        L23:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public final synchronized void k(com.amap.api.col.p0003l.n0 r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.l()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L9
            monitor-exit(r3)
            return
        L9:
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r4.j()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = com.amap.api.col.p0003l.q0.h(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Class<com.amap.api.col.3l.q0> r2 = com.amap.api.col.p0003l.q0.class
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r4.e()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = com.amap.api.col.p0003l.p0.b(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Class<com.amap.api.col.3l.p0> r2 = com.amap.api.col.p0003l.p0.class
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.e()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = com.amap.api.col.p0003l.o0.a(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Class<com.amap.api.col.3l.o0> r1 = com.amap.api.col.p0003l.o0.class
            r0.j(r4, r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L38:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    public final synchronized void m(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.l()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L9
            monitor-exit(r3)
            return
        L9:
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = com.amap.api.col.p0003l.q0.f(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<com.amap.api.col.3l.q0> r2 = com.amap.api.col.p0003l.q0.class
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = com.amap.api.col.p0003l.p0.b(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<com.amap.api.col.3l.p0> r2 = com.amap.api.col.p0003l.p0.class
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = com.amap.api.col.p0003l.o0.a(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<com.amap.api.col.3l.o0> r1 = com.amap.api.col.p0003l.o0.class
            r0.j(r4, r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    public final synchronized java.lang.String n(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.l()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            java.lang.String r4 = com.amap.api.col.p0003l.q0.h(r4)     // Catch: java.lang.Throwable -> L28
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.s0.f3940c     // Catch: java.lang.Throwable -> L28
            java.lang.Class<com.amap.api.col.3l.q0> r2 = com.amap.api.col.p0003l.q0.class
            java.util.List r4 = r0.p(r4, r2)     // Catch: java.lang.Throwable -> L28
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L28
            if (r0 <= 0) goto L2a
            r0 = 0
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L28
            com.amap.api.col.3l.q0 r4 = (com.amap.api.col.p0003l.q0) r4     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r4.c()     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r4 = move-exception
            goto L2c
        L2a:
            monitor-exit(r3)
            return r1
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }
}
