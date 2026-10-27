package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class d8 {
    protected java.util.concurrent.ThreadPoolExecutor a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<com.amap.api.col.p0003l.c8, java.util.concurrent.Future<?>> f3155b;

    /* renamed from: c, reason: collision with root package name */
    protected com.amap.api.col.3l.c8.a f3156c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements com.amap.api.col.3l.c8.a {
        final /* synthetic */ com.amap.api.col.p0003l.d8 a;

        a(com.amap.api.col.p0003l.d8 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.3l.c8.a
        public final void a(com.amap.api.col.p0003l.c8 r3) {
                r2 = this;
                com.amap.api.col.3l.d8 r0 = r2.a
                r1 = 1
                r0.d(r3, r1)
                return
        }

        @Override // com.amap.api.col.3l.c8.a
        public final void b(com.amap.api.col.p0003l.c8 r3) {
                r2 = this;
                com.amap.api.col.3l.d8 r0 = r2.a
                r1 = 0
                r0.d(r3, r1)
                return
        }
    }

    public d8() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f3155b = r0
            com.amap.api.col.3l.d8$a r0 = new com.amap.api.col.3l.d8$a
            r0.<init>(r1)
            r1.f3156c = r0
            return
    }

    private synchronized void c(com.amap.api.col.p0003l.c8 r2, java.util.concurrent.Future<?> r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.3l.c8, java.util.concurrent.Future<?>> r0 = r1.f3155b     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            java.lang.String r3 = "TPool"
            java.lang.String r0 = "addQueue"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private synchronized boolean e(com.amap.api.col.p0003l.c8 r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.3l.c8, java.util.concurrent.Future<?>> r0 = r2.f3155b     // Catch: java.lang.Throwable -> L8
            boolean r3 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L8
            goto L11
        L8:
            r3 = move-exception
            java.lang.String r0 = "TPool"
            java.lang.String r1 = "contain"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)     // Catch: java.lang.Throwable -> L13
            r3 = 0
        L11:
            monitor-exit(r2)
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public final void a(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.a     // Catch: java.lang.InterruptedException -> L7
            if (r0 == 0) goto L7
            r0.awaitTermination(r2, r4)     // Catch: java.lang.InterruptedException -> L7
        L7:
            return
    }

    public final void b(com.amap.api.col.p0003l.c8 r3) {
            r2 = this;
            boolean r0 = r2.e(r3)
            if (r0 == 0) goto L7
            goto L2b
        L7:
            java.util.concurrent.ThreadPoolExecutor r0 = r2.a
            if (r0 == 0) goto L2b
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L12
            goto L2b
        L12:
            com.amap.api.col.3l.c8$a r0 = r2.f3156c
            r3.f3102f = r0
            java.util.concurrent.ThreadPoolExecutor r0 = r2.a     // Catch: java.util.concurrent.RejectedExecutionException -> L23
            java.util.concurrent.Future r0 = r0.submit(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
            if (r0 != 0) goto L1f
            goto L2b
        L1f:
            r2.c(r3, r0)
            return
        L23:
            r3 = move-exception
            java.lang.String r0 = "TPool"
            java.lang.String r1 = "addTask"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
        L2b:
            return
    }

    protected final synchronized void d(com.amap.api.col.p0003l.c8 r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.3l.c8, java.util.concurrent.Future<?>> r0 = r1.f3155b     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L14
            if (r2 == 0) goto L14
            r3 = 1
            r2.cancel(r3)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L16
        L14:
            monitor-exit(r1)
            return
        L16:
            java.lang.String r3 = "TPool"
            java.lang.String r0 = "removeQueue"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            return
        L1f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    public final java.util.concurrent.Executor f() {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.a
            return r0
    }

    public final void g() {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.3l.c8, java.util.concurrent.Future<?>> r0 = r3.f3155b     // Catch: java.lang.Throwable -> L2b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2b
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2b
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.c8 r1 = (com.amap.api.col.p0003l.c8) r1     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.3l.c8, java.util.concurrent.Future<?>> r2 = r3.f3155b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto La
            r2 = 1
            r1.cancel(r2)     // Catch: java.lang.Exception -> La java.lang.Throwable -> L2b
            goto La
        L2b:
            r0 = move-exception
            goto L33
        L2d:
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.3l.c8, java.util.concurrent.Future<?>> r0 = r3.f3155b     // Catch: java.lang.Throwable -> L2b
            r0.clear()     // Catch: java.lang.Throwable -> L2b
            goto L3a
        L33:
            java.lang.String r1 = "TPool"
            java.lang.String r2 = "destroy"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L3a:
            java.util.concurrent.ThreadPoolExecutor r0 = r3.a
            if (r0 == 0) goto L41
            r0.shutdown()
        L41:
            return
    }
}
