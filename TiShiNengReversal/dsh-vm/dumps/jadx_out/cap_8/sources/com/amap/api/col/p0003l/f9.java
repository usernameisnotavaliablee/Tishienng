package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f9 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile com.amap.api.col.p0003l.f9 f3297g;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.Object f3298h;
    private android.util.LongSparseArray<com.amap.api.col.3l.f9.a> a;

    /* renamed from: b, reason: collision with root package name */
    private android.util.LongSparseArray<com.amap.api.col.3l.f9.a> f3299b;

    /* renamed from: c, reason: collision with root package name */
    private android.util.LongSparseArray<com.amap.api.col.3l.f9.a> f3300c;

    /* renamed from: d, reason: collision with root package name */
    private android.util.LongSparseArray<com.amap.api.col.3l.f9.a> f3301d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Object f3302e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.Object f3303f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        long f3304b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3305c;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.amap.api.col.p0003l.f9.f3298h = r0
            return
    }

    private f9() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f3302e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f3303f = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r1.a = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r1.f3299b = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r1.f3300c = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r1.f3301d = r0
            return
    }

    public static com.amap.api.col.p0003l.f9 a() {
            com.amap.api.col.3l.f9 r0 = com.amap.api.col.p0003l.f9.f3297g
            if (r0 != 0) goto L19
            java.lang.Object r0 = com.amap.api.col.p0003l.f9.f3298h
            monitor-enter(r0)
            com.amap.api.col.3l.f9 r1 = com.amap.api.col.p0003l.f9.f3297g     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.f9 r1 = new com.amap.api.col.3l.f9     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.f9.f3297g = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.3l.f9 r0 = com.amap.api.col.p0003l.f9.f3297g
            return r0
    }

    private static short c(android.util.LongSparseArray<com.amap.api.col.3l.f9.a> r4, long r5) {
            monitor-enter(r4)
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.3l.f9$a r5 = (com.amap.api.col.3l.f9.a) r5     // Catch: java.lang.Throwable -> Lc
            if (r5 != 0) goto Le
            r5 = 0
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
            return r5
        Lc:
            r5 = move-exception
            goto L2f
        Le:
            long r0 = f()     // Catch: java.lang.Throwable -> Lc
            long r2 = r5.f3304b     // Catch: java.lang.Throwable -> Lc
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 32767(0x7fff, double:1.6189E-319)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            long r0 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> Lc
            int r6 = (int) r0     // Catch: java.lang.Throwable -> Lc
            short r6 = (short) r6     // Catch: java.lang.Throwable -> Lc
            boolean r5 = r5.f3305c     // Catch: java.lang.Throwable -> Lc
            if (r5 == 0) goto L2b
            goto L2d
        L2b:
            int r5 = -r6
            short r6 = (short) r5     // Catch: java.lang.Throwable -> Lc
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
            return r6
        L2f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
            throw r5
    }

    private static void e(java.util.List<com.amap.api.col.p0003l.e9> r10, android.util.LongSparseArray<com.amap.api.col.3l.f9.a> r11, android.util.LongSparseArray<com.amap.api.col.3l.f9.a> r12) {
            long r0 = f()
            int r2 = r11.size()
            r3 = 0
            if (r2 != 0) goto L32
            java.util.Iterator r10 = r10.iterator()
        Lf:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L75
            java.lang.Object r11 = r10.next()
            com.amap.api.col.3l.e9 r11 = (com.amap.api.col.p0003l.e9) r11
            com.amap.api.col.3l.f9$a r2 = new com.amap.api.col.3l.f9$a
            r2.<init>(r3)
            int r4 = r11.b()
            r2.a = r4
            r2.f3304b = r0
            r2.f3305c = r3
            long r4 = r11.a()
            r12.put(r4, r2)
            goto Lf
        L32:
            java.util.Iterator r10 = r10.iterator()
        L36:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r10.next()
            com.amap.api.col.3l.e9 r2 = (com.amap.api.col.p0003l.e9) r2
            long r4 = r2.a()
            java.lang.Object r6 = r11.get(r4)
            com.amap.api.col.3l.f9$a r6 = (com.amap.api.col.3l.f9.a) r6
            r7 = 1
            if (r6 != 0) goto L5f
            com.amap.api.col.3l.f9$a r6 = new com.amap.api.col.3l.f9$a
            r6.<init>(r3)
            int r2 = r2.b()
            r6.a = r2
            r6.f3304b = r0
            r6.f3305c = r7
            goto L71
        L5f:
            int r8 = r6.a
            int r9 = r2.b()
            if (r8 == r9) goto L71
            int r2 = r2.b()
            r6.a = r2
            r6.f3304b = r0
            r6.f3305c = r7
        L71:
            r12.put(r4, r6)
            goto L36
        L75:
            return
    }

    private static long f() {
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }

    final short b(long r2) {
            r1 = this;
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r0 = r1.a
            short r2 = c(r0, r2)
            return r2
    }

    final void d(java.util.List<com.amap.api.col.p0003l.e9> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r3.f3302e
            monitor-enter(r0)
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r1 = r3.a     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r2 = r3.f3299b     // Catch: java.lang.Throwable -> L1e
            e(r4, r1, r2)     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r4 = r3.a     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r1 = r3.f3299b     // Catch: java.lang.Throwable -> L1e
            r3.a = r1     // Catch: java.lang.Throwable -> L1e
            r3.f3299b = r4     // Catch: java.lang.Throwable -> L1e
            r4.clear()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    final short g(long r2) {
            r1 = this;
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r0 = r1.f3300c
            short r2 = c(r0, r2)
            return r2
    }

    final void h(java.util.List<com.amap.api.col.p0003l.e9> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r3.f3303f
            monitor-enter(r0)
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r1 = r3.f3300c     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r2 = r3.f3301d     // Catch: java.lang.Throwable -> L1e
            e(r4, r1, r2)     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r4 = r3.f3300c     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray<com.amap.api.col.3l.f9$a> r1 = r3.f3301d     // Catch: java.lang.Throwable -> L1e
            r3.f3300c = r1     // Catch: java.lang.Throwable -> L1e
            r3.f3301d = r4     // Catch: java.lang.Throwable -> L1e
            r4.clear()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }
}
