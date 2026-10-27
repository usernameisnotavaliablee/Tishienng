package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h3 implements com.amap.api.col.p0003l.f3 {
    private static java.util.Map<java.lang.String, com.amap.api.col.3l.h3.a> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f3445b;

        /* renamed from: c, reason: collision with root package name */
        int f3446c;

        /* renamed from: d, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicInteger f3447d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.h3 f3448e;

        public a(com.amap.api.col.p0003l.h3 r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.f3448e = r1
                r0.<init>()
                r0.a = r3
                r0.f3445b = r4
                r0.f3446c = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 0
                r1.<init>(r2)
                r0.f3447d = r1
                return
        }

        public final int a() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f3447d
                int r0 = r0.incrementAndGet()
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.amap.api.col.p0003l.h3.a = r0
            return
    }

    public h3() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void b(int r3, java.lang.String r4, java.lang.String r5, int r6) {
            java.lang.String r0 = " counter "
            if (r3 != 0) goto L26
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.b5 r1 = com.amap.api.col.p0003l.b5.c(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.amap.api.col.3l.a5 r2 = com.amap.api.col.p0003l.a5.b(r4, r2)
            r1.h(r2)
            goto L47
        L26:
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.b5 r1 = com.amap.api.col.p0003l.b5.c(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.amap.api.col.3l.a5 r2 = com.amap.api.col.p0003l.a5.b(r4, r2)
            r1.h(r2)
        L47:
            boolean r1 = com.amap.api.col.p0003l.c3.f3063b
            if (r1 == 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            d(r3, r4, r5)
        L60:
            return
    }

    private static java.lang.String c(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ""
            if (r2 != 0) goto Ld
            r2 = r1
        Ld:
            r0.append(r2)
            if (r3 != 0) goto L13
            r3 = r1
        L13:
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static void d(int r0, java.lang.String r1, java.lang.String r2) {
            return
    }

    @Override // com.amap.api.col.p0003l.f3
    public final void a() {
            r5 = this;
            java.util.Map<java.lang.String, com.amap.api.col.3l.h3$a> r0 = com.amap.api.col.p0003l.h3.a     // Catch: java.lang.Throwable -> L3e
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L3e
            com.amap.api.col.3l.h3$a r1 = (com.amap.api.col.3l.h3.a) r1     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto La
            int r2 = r1.f3446c     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r1.a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r1.f3445b     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f3447d     // Catch: java.lang.Throwable -> L3e
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L3e
            b(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L3e
            goto La
        L2e:
            java.util.Map<java.lang.String, com.amap.api.col.3l.h3$a> r0 = com.amap.api.col.p0003l.h3.a     // Catch: java.lang.Throwable -> L3e
            r0.clear()     // Catch: java.lang.Throwable -> L3e
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L3e
            com.amap.api.col.3l.b5 r0 = com.amap.api.col.p0003l.b5.c(r0)     // Catch: java.lang.Throwable -> L3e
            r0.e()     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    @Override // com.amap.api.col.p0003l.f3
    public final void a(int r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = c(r3, r4, r5)     // Catch: java.lang.Throwable -> L34
            java.util.Map<java.lang.String, com.amap.api.col.3l.h3$a> r1 = com.amap.api.col.p0003l.h3.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.3l.h3$a r1 = (com.amap.api.col.3l.h3.a) r1     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L18
            com.amap.api.col.3l.h3$a r1 = new com.amap.api.col.3l.h3$a     // Catch: java.lang.Throwable -> L34
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L34
            java.util.Map<java.lang.String, com.amap.api.col.3l.h3$a> r3 = com.amap.api.col.p0003l.h3.a     // Catch: java.lang.Throwable -> L34
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L34
        L18:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L34
            r4 = 100
            if (r3 <= r4) goto L34
            int r3 = r1.f3446c     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r1.a     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r1.f3445b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f3447d     // Catch: java.lang.Throwable -> L34
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L34
            b(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L34
            java.util.Map<java.lang.String, com.amap.api.col.3l.h3$a> r3 = com.amap.api.col.p0003l.h3.a     // Catch: java.lang.Throwable -> L34
            r3.remove(r0)     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }
}
