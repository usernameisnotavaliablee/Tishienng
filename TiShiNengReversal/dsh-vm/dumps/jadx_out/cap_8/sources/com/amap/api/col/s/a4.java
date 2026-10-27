package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a4 {
    protected java.util.concurrent.ThreadPoolExecutor a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<com.amap.api.col.s.z3, java.util.concurrent.Future<?>> f4313b;

    /* renamed from: c, reason: collision with root package name */
    protected com.amap.api.col.s.z3.a f4314c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements com.amap.api.col.s.z3.a {
        final /* synthetic */ com.amap.api.col.s.a4 a;

        a(com.amap.api.col.s.a4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.s.z3.a
        public final void a(com.amap.api.col.s.z3 r2) {
                r1 = this;
                com.amap.api.col.s.a4 r0 = r1.a
                r0.a(r2)
                return
        }
    }

    public a4() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f4313b = r0
            com.amap.api.col.s.a4$a r0 = new com.amap.api.col.s.a4$a
            r0.<init>(r1)
            r1.f4314c = r0
            return
    }

    private synchronized void b(com.amap.api.col.s.z3 r2, java.util.concurrent.Future<?> r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.s.z3, java.util.concurrent.Future<?>> r0 = r1.f4313b     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            java.lang.String r3 = "TPool"
            java.lang.String r0 = "addQueue"
            com.amap.api.col.s.g2.o(r2, r3, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private synchronized boolean d(com.amap.api.col.s.z3 r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.s.z3, java.util.concurrent.Future<?>> r0 = r2.f4313b     // Catch: java.lang.Throwable -> L8
            boolean r3 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L8
            goto L11
        L8:
            r3 = move-exception
            java.lang.String r0 = "TPool"
            java.lang.String r1 = "contain"
            com.amap.api.col.s.g2.o(r3, r0, r1)     // Catch: java.lang.Throwable -> L13
            r3 = 0
        L11:
            monitor-exit(r2)
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    protected final synchronized void a(com.amap.api.col.s.z3 r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<com.amap.api.col.s.z3, java.util.concurrent.Future<?>> r0 = r2.f4313b     // Catch: java.lang.Throwable -> L8
            r0.remove(r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            java.lang.String r0 = "TPool"
            java.lang.String r1 = "removeQueue"
            com.amap.api.col.s.g2.o(r3, r0, r1)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final void c(com.amap.api.col.s.z3 r3) {
            r2 = this;
            boolean r0 = r2.d(r3)
            if (r0 == 0) goto L7
            goto L2b
        L7:
            java.util.concurrent.ThreadPoolExecutor r0 = r2.a
            if (r0 == 0) goto L2b
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L12
            goto L2b
        L12:
            com.amap.api.col.s.z3$a r0 = r2.f4314c
            r3.a = r0
            java.util.concurrent.ThreadPoolExecutor r0 = r2.a     // Catch: java.util.concurrent.RejectedExecutionException -> L23
            java.util.concurrent.Future r0 = r0.submit(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
            if (r0 != 0) goto L1f
            goto L2b
        L1f:
            r2.b(r3, r0)
            return
        L23:
            r3 = move-exception
            java.lang.String r0 = "TPool"
            java.lang.String r1 = "addTask"
            com.amap.api.col.s.g2.o(r3, r0, r1)
        L2b:
            return
    }
}
