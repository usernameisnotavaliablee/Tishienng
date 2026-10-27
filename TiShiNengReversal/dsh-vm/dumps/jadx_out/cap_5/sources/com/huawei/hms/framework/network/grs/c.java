package com.huawei.hms.framework.network.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final java.lang.String i = "c";
    private static final java.util.concurrent.ExecutorService j = null;
    private static long k;
    private com.huawei.hms.framework.network.grs.GrsBaseInfo a;
    private android.content.Context b;
    private com.huawei.hms.framework.network.grs.g.g c;
    private n1.a d;
    private n1.c e;
    private n1.c f;
    private com.huawei.hms.framework.network.grs.a g;
    private java.util.concurrent.FutureTask<java.lang.Boolean> h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.concurrent.Callable<java.lang.Boolean> {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.huawei.hms.framework.network.grs.GrsBaseInfo b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.c c;

        a(com.huawei.hms.framework.network.grs.c r1, android.content.Context r2, com.huawei.hms.framework.network.grs.GrsBaseInfo r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() {
                r7 = this;
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                com.huawei.hms.framework.network.grs.g.g r1 = new com.huawei.hms.framework.network.grs.g.g
                r1.<init>()
                com.huawei.hms.framework.network.grs.c.d(r0, r1)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                n1.c r1 = new n1.c
                android.content.Context r2 = r7.a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.huawei.hms.framework.network.grs.GrsApp r4 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
                java.lang.String r5 = "_"
                java.lang.String r4 = r4.getBrand(r5)
                r3.append(r4)
                java.lang.String r4 = "share_pre_grs_conf_"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.<init>(r2, r3)
                com.huawei.hms.framework.network.grs.c.h(r0, r1)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                n1.c r1 = new n1.c
                android.content.Context r2 = r7.a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.huawei.hms.framework.network.grs.GrsApp r4 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
                java.lang.String r4 = r4.getBrand(r5)
                r3.append(r4)
                java.lang.String r4 = "share_pre_grs_services_"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.<init>(r2, r3)
                com.huawei.hms.framework.network.grs.c.q(r0, r1)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                n1.a r1 = new n1.a
                n1.c r2 = com.huawei.hms.framework.network.grs.c.p(r0)
                com.huawei.hms.framework.network.grs.c r3 = r7.c
                n1.c r3 = com.huawei.hms.framework.network.grs.c.u(r3)
                com.huawei.hms.framework.network.grs.c r4 = r7.c
                com.huawei.hms.framework.network.grs.g.g r4 = com.huawei.hms.framework.network.grs.c.c(r4)
                r1.<init>(r2, r3, r4)
                com.huawei.hms.framework.network.grs.c.g(r0, r1)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                com.huawei.hms.framework.network.grs.a r1 = new com.huawei.hms.framework.network.grs.a
                com.huawei.hms.framework.network.grs.GrsBaseInfo r2 = com.huawei.hms.framework.network.grs.c.x(r0)
                com.huawei.hms.framework.network.grs.c r3 = r7.c
                n1.a r3 = com.huawei.hms.framework.network.grs.c.w(r3)
                com.huawei.hms.framework.network.grs.c r4 = r7.c
                com.huawei.hms.framework.network.grs.g.g r4 = com.huawei.hms.framework.network.grs.c.c(r4)
                com.huawei.hms.framework.network.grs.c r5 = r7.c
                n1.c r5 = com.huawei.hms.framework.network.grs.c.u(r5)
                r1.<init>(r2, r3, r4, r5)
                com.huawei.hms.framework.network.grs.c.b(r0, r1)
                android.content.Context r0 = r7.a
                java.lang.String r0 = r0.getPackageName()
                com.huawei.hms.framework.network.grs.f.b r0 = com.huawei.hms.framework.network.grs.f.b.a(r0)
                r1 = 1
                if (r0 != 0) goto La4
                com.huawei.hms.framework.network.grs.f.b r0 = new com.huawei.hms.framework.network.grs.f.b
                android.content.Context r2 = r7.a
                r0.<init>(r2, r1)
            La4:
                p1.c r0 = new p1.c
                com.huawei.hms.framework.network.grs.GrsBaseInfo r2 = r7.b
                android.content.Context r3 = r7.a
                r0.<init>(r2, r3)
                java.lang.String r0 = r0.d()
                java.lang.String r2 = com.huawei.hms.framework.network.grs.c.t()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "scan serviceSet is: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                com.huawei.hms.framework.common.Logger.v(r2, r3)
                com.huawei.hms.framework.network.grs.c r2 = r7.c
                n1.c r2 = com.huawei.hms.framework.network.grs.c.u(r2)
                java.lang.String r3 = ""
                java.lang.String r4 = "services"
                java.lang.String r2 = r2.a(r4, r3)
                java.lang.String r0 = com.huawei.hms.framework.network.grs.g.h.a(r2, r0)
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                if (r3 != 0) goto L161
                com.huawei.hms.framework.network.grs.c r3 = r7.c
                n1.c r3 = com.huawei.hms.framework.network.grs.c.u(r3)
                r3.f(r4, r0)
                java.lang.String r3 = com.huawei.hms.framework.network.grs.c.t()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "postList is:"
                r4.append(r5)
                java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.huawei.hms.framework.common.Logger.i(r3, r4)
                java.lang.String r3 = com.huawei.hms.framework.network.grs.c.t()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "currentServices:"
                r4.append(r5)
                java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r2)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.huawei.hms.framework.common.Logger.d(r3, r4)
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L161
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = com.huawei.hms.framework.network.grs.c.x(r0)
                android.content.Context r2 = r7.a
                java.lang.String r0 = r0.getGrsParasKey(r1, r1, r2)
                com.huawei.hms.framework.network.grs.c r1 = r7.c
                com.huawei.hms.framework.network.grs.g.g r1 = com.huawei.hms.framework.network.grs.c.c(r1)
                r1.f(r0)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                com.huawei.hms.framework.network.grs.g.g r1 = com.huawei.hms.framework.network.grs.c.c(r0)
                p1.c r2 = new p1.c
                com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r7.b
                android.content.Context r3 = r7.a
                r2.<init>(r0, r3)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                n1.c r5 = com.huawei.hms.framework.network.grs.c.u(r0)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = com.huawei.hms.framework.network.grs.c.x(r0)
                int r6 = r0.getQueryTimeout()
                r3 = 0
                r4 = 0
                r1.h(r2, r3, r4, r5, r6)
            L161:
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r2 = com.huawei.hms.framework.network.grs.c.v()
                long r0 = r0 - r2
                long r2 = com.huawei.hms.framework.network.grs.c.v()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L180
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r2.toHours(r0)
                r2 = 24
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L19d
            L180:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.c.t()
                java.lang.String r1 = "Try to clear unUsed sp data."
                com.huawei.hms.framework.common.Logger.i(r0, r1)
                long r0 = android.os.SystemClock.elapsedRealtime()
                com.huawei.hms.framework.network.grs.c.a(r0)
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                n1.c r1 = com.huawei.hms.framework.network.grs.c.p(r0)
                java.util.Map r1 = r1.b()
                com.huawei.hms.framework.network.grs.c.k(r0, r1)
            L19d:
                com.huawei.hms.framework.network.grs.c r0 = r7.c
                n1.a r0 = com.huawei.hms.framework.network.grs.c.w(r0)
                com.huawei.hms.framework.network.grs.GrsBaseInfo r1 = r7.b
                android.content.Context r2 = r7.a
                r0.h(r1, r2)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    static {
            java.lang.String r0 = "GRS_GrsClient-Init"
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.common.ExecutorsUtils.newSingleThreadExecutor(r0)
            com.huawei.hms.framework.network.grs.c.j = r0
            r0 = 0
            com.huawei.hms.framework.network.grs.c.k = r0
            return
    }

    c(android.content.Context r8, com.huawei.hms.framework.network.grs.GrsBaseInfo r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.h = r0
            android.content.Context r0 = r8.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto L11
            goto L19
        L11:
            android.content.Context r8 = r8.getApplicationContext()
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)
        L19:
            r7.b = r8
            r7.j(r9)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r8 = r7.a
            android.content.Context r0 = r7.b
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask
            com.huawei.hms.framework.network.grs.c$a r2 = new com.huawei.hms.framework.network.grs.c$a
            r2.<init>(r7, r0, r8)
            r1.<init>(r2)
            r7.h = r1
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.network.grs.c.j
            r0.execute(r1)
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r1 = q1.a.a()
            java.lang.String r8 = r8.getAppName()
            java.lang.String r2 = r9.getRegCountry()
            java.lang.String r3 = r9.getSerCountry()
            java.lang.String r4 = r9.getIssueCountry()
            int r9 = r9.getQueryTimeout()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r8
            r8 = 2
            r5[r8] = r2
            r8 = 3
            r5[r8] = r3
            r8 = 4
            r5[r8] = r4
            r8 = 5
            r5[r8] = r9
            java.lang.String r8 = "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d"
            com.huawei.hms.framework.common.Logger.i(r0, r8, r5)
            return
    }

    c(com.huawei.hms.framework.network.grs.GrsBaseInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.h = r0
            r1.j(r2)
            return
    }

    static /* synthetic */ long a(long r0) {
            com.huawei.hms.framework.network.grs.c.k = r0
            return r0
    }

    static /* synthetic */ com.huawei.hms.framework.network.grs.a b(com.huawei.hms.framework.network.grs.c r0, com.huawei.hms.framework.network.grs.a r1) {
            r0.g = r1
            return r1
    }

    static /* synthetic */ com.huawei.hms.framework.network.grs.g.g c(com.huawei.hms.framework.network.grs.c r0) {
            com.huawei.hms.framework.network.grs.g.g r0 = r0.c
            return r0
    }

    static /* synthetic */ com.huawei.hms.framework.network.grs.g.g d(com.huawei.hms.framework.network.grs.c r0, com.huawei.hms.framework.network.grs.g.g r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ n1.a g(com.huawei.hms.framework.network.grs.c r0, n1.a r1) {
            r0.d = r1
            return r1
    }

    static /* synthetic */ n1.c h(com.huawei.hms.framework.network.grs.c r0, n1.c r1) {
            r0.e = r1
            return r1
    }

    private void j(com.huawei.hms.framework.network.grs.GrsBaseInfo r4) {
            r3 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r4.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            r3.a = r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return
        L7:
            r0 = move-exception
            java.lang.String r1 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r2 = "GrsClient catch CloneNotSupportedException"
            com.huawei.hms.framework.common.Logger.w(r1, r2, r0)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r4 = r4.copy()
            r3.a = r4
            return
    }

    static /* synthetic */ void k(com.huawei.hms.framework.network.grs.c r0, java.util.Map r1) {
            r0.n(r1)
            return
    }

    private void n(java.util.Map<java.lang.String, ?> r8) {
            r7 = this;
            if (r8 == 0) goto Lb6
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto La
            goto Lb6
        La:
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r0 = r8.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = r7.b
            java.lang.String r3 = r3.getPackageName()
            r2.append(r3)
            java.lang.String r3 = "time"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L12
            n1.c r2 = r7.e
            java.lang.String r3 = ""
            java.lang.String r2 = r2.a(r1, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.String r3 = "\\d+"
            boolean r3 = r2.matches(r3)
            if (r3 == 0) goto L60
            long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L58
            goto L60
        L58:
            r2 = move-exception
            java.lang.String r3 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r6 = "convert expire time from String to Long catch NumberFormatException."
            com.huawei.hms.framework.common.Logger.w(r3, r6, r2)
        L60:
            int r2 = r1.length()
            int r2 = r2 + (-4)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r6 = "ETag"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            boolean r4 = r7.s(r4)
            if (r4 == 0) goto L8e
            boolean r4 = r8.contains(r2)
            if (r4 == 0) goto L8e
            boolean r4 = r8.contains(r3)
            if (r4 != 0) goto L12
        L8e:
            java.lang.String r4 = com.huawei.hms.framework.network.grs.c.i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "init interface auto clear some invalid sp's data: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.framework.common.Logger.i(r4, r5)
            n1.c r4 = r7.e
            r4.d(r2)
            n1.c r2 = r7.e
            r2.d(r1)
            n1.c r1 = r7.e
            r1.d(r3)
            goto L12
        Lb5:
            return
        Lb6:
            java.lang.String r8 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r0 = "sp's content is empty."
            com.huawei.hms.framework.common.Logger.v(r8, r0)
            return
    }

    static /* synthetic */ n1.c p(com.huawei.hms.framework.network.grs.c r0) {
            n1.c r0 = r0.e
            return r0
    }

    static /* synthetic */ n1.c q(com.huawei.hms.framework.network.grs.c r0, n1.c r1) {
            r0.f = r1
            return r1
    }

    private boolean s(long r4) {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            r4 = 604800000(0x240c8400, double:2.988109026E-315)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto Le
            r4 = 1
            return r4
        Le:
            r4 = 0
            return r4
    }

    static /* synthetic */ java.lang.String t() {
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.i
            return r0
    }

    static /* synthetic */ n1.c u(com.huawei.hms.framework.network.grs.c r0) {
            n1.c r0 = r0.f
            return r0
    }

    static /* synthetic */ long v() {
            long r0 = com.huawei.hms.framework.network.grs.c.k
            return r0
    }

    static /* synthetic */ n1.a w(com.huawei.hms.framework.network.grs.c r0) {
            n1.a r0 = r0.d
            return r0
    }

    static /* synthetic */ com.huawei.hms.framework.network.grs.GrsBaseInfo x(com.huawei.hms.framework.network.grs.c r0) {
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r0.a
            return r0
    }

    private boolean y() {
            r5 = this;
            java.util.concurrent.FutureTask<java.lang.Boolean> r0 = r5.h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L15 java.lang.InterruptedException -> L17 java.util.concurrent.ExecutionException -> L19 java.util.concurrent.TimeoutException -> L23 java.util.concurrent.CancellationException -> L35
            r3 = 8
            java.lang.Object r0 = r0.get(r3, r2)     // Catch: java.lang.Exception -> L15 java.lang.InterruptedException -> L17 java.util.concurrent.ExecutionException -> L19 java.util.concurrent.TimeoutException -> L23 java.util.concurrent.CancellationException -> L35
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L15 java.lang.InterruptedException -> L17 java.util.concurrent.ExecutionException -> L19 java.util.concurrent.TimeoutException -> L23 java.util.concurrent.CancellationException -> L35
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L15 java.lang.InterruptedException -> L17 java.util.concurrent.ExecutionException -> L19 java.util.concurrent.TimeoutException -> L23 java.util.concurrent.CancellationException -> L35
            return r0
        L15:
            r0 = move-exception
            goto L1b
        L17:
            r0 = move-exception
            goto L2b
        L19:
            r0 = move-exception
            goto L30
        L1b:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r3 = "init compute task occur unknown Exception"
        L1f:
            com.huawei.hms.framework.common.Logger.w(r2, r3, r0)
            goto L3c
        L23:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r2 = "init compute task timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            goto L3c
        L2b:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r3 = "init compute task interrupted."
            goto L1f
        L30:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r3 = "init compute task failed."
            goto L1f
        L35:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r2 = "init compute task canceled."
            com.huawei.hms.framework.common.Logger.i(r0, r2)
        L3c:
            return r1
    }

    java.lang.String e(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r2.a
            r1 = 0
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L1a
            if (r4 != 0) goto La
            goto L1a
        La:
            boolean r0 = r2.y()
            if (r0 == 0) goto L19
            com.huawei.hms.framework.network.grs.a r0 = r2.g
            android.content.Context r1 = r2.b
            java.lang.String r3 = r0.d(r3, r4, r1, r5)
            return r3
        L19:
            return r1
        L1a:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r4 = "invalid para!"
            com.huawei.hms.framework.common.Logger.w(r3, r4)
            return r1
    }

    java.util.Map<java.lang.String, java.lang.String> f(java.lang.String r3, int r4) {
            r2 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r2.a
            if (r0 == 0) goto L1c
            if (r3 != 0) goto L7
            goto L1c
        L7:
            boolean r0 = r2.y()
            if (r0 == 0) goto L16
            com.huawei.hms.framework.network.grs.a r0 = r2.g
            android.content.Context r1 = r2.b
            java.util.Map r3 = r0.f(r3, r1, r4)
            return r3
        L16:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            return r3
        L1c:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r4 = "invalid para!"
            com.huawei.hms.framework.common.Logger.w(r3, r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            return r3
    }

    void i() {
            r4 = this;
            boolean r0 = r4.y()
            if (r0 != 0) goto L7
            return
        L7:
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r4.a
            android.content.Context r1 = r4.b
            r2 = 1
            java.lang.String r0 = r0.getGrsParasKey(r2, r2, r1)
            n1.c r1 = r4.e
            r1.d(r0)
            n1.c r1 = r4.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = "time"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.d(r2)
            n1.c r1 = r4.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = "ETag"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.d(r2)
            com.huawei.hms.framework.network.grs.g.g r1 = r4.c
            r1.f(r0)
            return
    }

    void l(java.lang.String r3, com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r4, int r5) {
            r2 = this;
            if (r4 != 0) goto La
            java.lang.String r3 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r4 = "IQueryUrlsCallBack is must not null for process continue."
            com.huawei.hms.framework.common.Logger.w(r3, r4)
            return
        La:
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r2.a
            if (r0 == 0) goto L2b
            if (r3 != 0) goto L11
            goto L2b
        L11:
            boolean r0 = r2.y()
            if (r0 == 0) goto L1f
            com.huawei.hms.framework.network.grs.a r0 = r2.g
            android.content.Context r1 = r2.b
            r0.j(r3, r4, r1, r5)
            return
        L1f:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r5 = "grs init task has not completed."
            com.huawei.hms.framework.common.Logger.i(r3, r5)
            r3 = -7
            r4.onCallBackFail(r3)
            return
        L2b:
            r3 = -6
            r4.onCallBackFail(r3)
            return
    }

    void m(java.lang.String r8, java.lang.String r9, com.huawei.hms.framework.network.grs.IQueryUrlCallBack r10, int r11) {
            r7 = this;
            if (r10 != 0) goto La
            java.lang.String r8 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r9 = "IQueryUrlCallBack is must not null for process continue."
            com.huawei.hms.framework.common.Logger.w(r8, r9)
            return
        La:
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r7.a
            if (r0 == 0) goto L12
            if (r8 == 0) goto L12
            if (r9 != 0) goto L14
        L12:
            r4 = r10
            goto L33
        L14:
            boolean r0 = r7.y()
            if (r0 == 0) goto L26
            com.huawei.hms.framework.network.grs.a r1 = r7.g
            android.content.Context r5 = r7.b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r1.k(r2, r3, r4, r5, r6)
            return
        L26:
            r4 = r10
            java.lang.String r8 = com.huawei.hms.framework.network.grs.c.i
            java.lang.String r9 = "grs init task has not completed."
            com.huawei.hms.framework.common.Logger.i(r8, r9)
            r8 = -7
            r4.onCallBackFail(r8)
            return
        L33:
            r8 = -6
            r4.onCallBackFail(r8)
            return
    }

    boolean o(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L1f
            java.lang.Class r1 = r4.getClass()
            java.lang.Class<com.huawei.hms.framework.network.grs.c> r2 = com.huawei.hms.framework.network.grs.c.class
            if (r2 == r1) goto L10
            goto L1f
        L10:
            boolean r1 = r4 instanceof com.huawei.hms.framework.network.grs.c
            if (r1 == 0) goto L1f
            com.huawei.hms.framework.network.grs.c r4 = (com.huawei.hms.framework.network.grs.c) r4
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r3.a
            com.huawei.hms.framework.network.grs.GrsBaseInfo r4 = r4.a
            boolean r4 = r0.compare(r4)
            return r4
        L1f:
            return r0
    }

    boolean r() {
            r3 = this;
            boolean r0 = r3.y()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r3.a
            if (r0 == 0) goto L18
            android.content.Context r2 = r3.b
            if (r2 != 0) goto L11
            goto L18
        L11:
            n1.a r1 = r3.d
            r1.c(r0, r2)
            r0 = 1
            return r0
        L18:
            return r1
    }
}
