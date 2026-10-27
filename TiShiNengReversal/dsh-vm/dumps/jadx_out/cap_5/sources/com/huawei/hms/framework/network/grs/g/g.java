package com.huawei.hms.framework.network.grs.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private static final java.util.concurrent.ExecutorService b = null;
    private static final java.util.Map<java.lang.String, p1.b> c = null;
    private static final java.lang.Object d = null;
    private n1.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.concurrent.Callable<com.huawei.hms.framework.network.grs.g.d> {
        final /* synthetic */ p1.c a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ n1.c c;
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.g d;

        a(com.huawei.hms.framework.network.grs.g.g r1, p1.c r2, java.lang.String r3, n1.c r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public com.huawei.hms.framework.network.grs.g.d call() {
                r4 = this;
                com.huawei.hms.framework.network.grs.g.c r0 = new com.huawei.hms.framework.network.grs.g.c
                p1.c r1 = r4.a
                com.huawei.hms.framework.network.grs.g.g r2 = r4.d
                n1.a r2 = com.huawei.hms.framework.network.grs.g.g.c(r2)
                r0.<init>(r1, r2)
                java.util.concurrent.ExecutorService r1 = com.huawei.hms.framework.network.grs.g.g.b()
                java.lang.String r2 = r4.b
                n1.c r3 = r4.c
                com.huawei.hms.framework.network.grs.g.d r0 = r0.a(r1, r2, r3)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ com.huawei.hms.framework.network.grs.g.d call() {
                r1 = this;
                com.huawei.hms.framework.network.grs.g.d r0 = r1.call()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ p1.c a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ n1.c c;
        final /* synthetic */ int d;
        final /* synthetic */ com.huawei.hms.framework.network.grs.b e;
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.g f;

        b(com.huawei.hms.framework.network.grs.g.g r1, p1.c r2, java.lang.String r3, n1.c r4, int r5, com.huawei.hms.framework.network.grs.b r6) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.huawei.hms.framework.network.grs.g.g r0 = r5.f
                p1.c r1 = r5.a
                java.lang.String r2 = r5.b
                n1.c r3 = r5.c
                int r4 = r5.d
                com.huawei.hms.framework.network.grs.g.d r1 = r0.a(r1, r2, r3, r4)
                com.huawei.hms.framework.network.grs.b r2 = r5.e
                com.huawei.hms.framework.network.grs.g.g.e(r0, r1, r2)
                return
        }
    }

    static {
            java.lang.String r0 = "GRS_RequestController-Task"
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.common.ExecutorsUtils.newCachedThreadPool(r0)
            com.huawei.hms.framework.network.grs.g.g.b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            com.huawei.hms.framework.network.grs.g.g.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.hms.framework.network.grs.g.g.d = r0
            return
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.concurrent.ExecutorService b() {
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.network.grs.g.g.b
            return r0
    }

    static /* synthetic */ n1.a c(com.huawei.hms.framework.network.grs.g.g r0) {
            n1.a r0 = r0.a
            return r0
    }

    private void d(com.huawei.hms.framework.network.grs.g.d r3, com.huawei.hms.framework.network.grs.b r4) {
            r2 = this;
            if (r4 == 0) goto L17
            java.lang.String r0 = "RequestController"
            if (r3 != 0) goto Lf
            java.lang.String r3 = "GrsResponse is null"
            com.huawei.hms.framework.common.Logger.v(r0, r3)
            r4.a()
            return
        Lf:
            java.lang.String r1 = "GrsResponse is not null"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            r4.a(r3)
        L17:
            return
    }

    static /* synthetic */ void e(com.huawei.hms.framework.network.grs.g.g r0, com.huawei.hms.framework.network.grs.g.d r1, com.huawei.hms.framework.network.grs.b r2) {
            r0.d(r1, r2)
            return
    }

    public com.huawei.hms.framework.network.grs.g.d a(p1.c r9, java.lang.String r10, n1.c r11, int r12) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "request to server with service name is: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RequestController"
            com.huawei.hms.framework.common.Logger.d(r1, r0)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r9.c()
            android.content.Context r1 = r9.a()
            r2 = 1
            java.lang.String r0 = r0.getGrsParasKey(r2, r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "request spUrlKey: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "RequestController"
            com.huawei.hms.framework.common.Logger.v(r3, r1)
            java.lang.Object r1 = com.huawei.hms.framework.network.grs.g.g.d
            monitor-enter(r1)
            android.content.Context r3 = r9.a()     // Catch: java.lang.Throwable -> L49
            boolean r3 = com.huawei.hms.framework.common.NetworkUtil.isNetworkAvailable(r3)     // Catch: java.lang.Throwable -> L49
            r4 = 0
            if (r3 != 0) goto L4c
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            r9 = move-exception
            goto Ldf
        L4c:
            q1.d$a r3 = q1.d.a(r0)     // Catch: java.lang.Throwable -> L49
            java.util.Map<java.lang.String, p1.b> r5 = com.huawei.hms.framework.network.grs.g.g.c     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Throwable -> L49
            p1.b r6 = (p1.b) r6     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L66
            boolean r7 = r6.b()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L61
            goto L66
        L61:
            java.util.concurrent.Future r10 = r6.a()     // Catch: java.lang.Throwable -> L49
            goto L88
        L66:
            if (r3 == 0) goto L6e
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L47
        L6e:
            java.lang.String r3 = "RequestController"
            java.lang.String r6 = "hitGrsRequestBean == null or request block is released."
            com.huawei.hms.framework.common.Logger.d(r3, r6)     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.ExecutorService r3 = com.huawei.hms.framework.network.grs.g.g.b     // Catch: java.lang.Throwable -> L49
            com.huawei.hms.framework.network.grs.g.g$a r6 = new com.huawei.hms.framework.network.grs.g.g$a     // Catch: java.lang.Throwable -> L49
            r6.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.Future r10 = r3.submit(r6)     // Catch: java.lang.Throwable -> L49
            p1.b r11 = new p1.b     // Catch: java.lang.Throwable -> L49
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L49
            r5.put(r0, r11)     // Catch: java.lang.Throwable -> L49
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            r11 = -1
            if (r12 == r11) goto L8d
            goto L9e
        L8d:
            android.content.Context r9 = r9.a()
            p1.d r9 = o1.a.a(r9)
            if (r9 == 0) goto L9c
            int r12 = r9.f()
            goto L9e
        L9c:
            r12 = 10
        L9e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r0 = 0
            r11[r0] = r9
            java.lang.String r9 = "RequestController"
            java.lang.String r0 = "use grsQueryTimeout %d"
            com.huawei.hms.framework.common.Logger.i(r9, r0, r11)
            long r11 = (long) r12
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.TimeoutException -> Lba java.lang.InterruptedException -> Lbc java.util.concurrent.ExecutionException -> Lbe java.util.concurrent.CancellationException -> Lc0
            java.lang.Object r9 = r10.get(r11, r9)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.TimeoutException -> Lba java.lang.InterruptedException -> Lbc java.util.concurrent.ExecutionException -> Lbe java.util.concurrent.CancellationException -> Lc0
            com.huawei.hms.framework.network.grs.g.d r9 = (com.huawei.hms.framework.network.grs.g.d) r9     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.TimeoutException -> Lba java.lang.InterruptedException -> Lbc java.util.concurrent.ExecutionException -> Lbe java.util.concurrent.CancellationException -> Lc0
            return r9
        Lb8:
            r9 = move-exception
            goto Lc2
        Lba:
            r9 = move-exception
            goto Lca
        Lbc:
            r9 = move-exception
            goto Lcf
        Lbe:
            r9 = move-exception
            goto Ld4
        Lc0:
            r9 = move-exception
            goto Ld9
        Lc2:
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find Other Exception, check others"
        Lc6:
            com.huawei.hms.framework.common.Logger.w(r10, r11, r9)
            goto Lde
        Lca:
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find TimeoutException, check others"
            goto Lc6
        Lcf:
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find InterruptedException, check others"
            goto Lc6
        Ld4:
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find ExecutionException, check others"
            goto Lc6
        Ld9:
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find CancellationException, check others"
            goto Lc6
        Lde:
            return r4
        Ldf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r9
    }

    public void f(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = com.huawei.hms.framework.network.grs.g.g.d
            monitor-enter(r0)
            java.util.Map<java.lang.String, p1.b> r1 = com.huawei.hms.framework.network.grs.g.g.c     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public void g(n1.a r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void h(p1.c r9, com.huawei.hms.framework.network.grs.b r10, java.lang.String r11, n1.c r12, int r13) {
            r8 = this;
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.network.grs.g.g.b
            com.huawei.hms.framework.network.grs.g.g$b r1 = new com.huawei.hms.framework.network.grs.g.g$b
            r2 = r8
            r3 = r9
            r7 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.execute(r1)
            return
    }
}
