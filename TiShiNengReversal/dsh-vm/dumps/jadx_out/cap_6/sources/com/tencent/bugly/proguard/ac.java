package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ac {
    public static int a = 1000;
    public static long b = 259200000;
    private static com.tencent.bugly.proguard.ac d;
    private static java.lang.String i;
    public final com.tencent.bugly.proguard.ak c;
    private final java.util.List<com.tencent.bugly.proguard.o> e;
    private final com.tencent.bugly.crashreport.common.strategy.StrategyBean f;
    private com.tencent.bugly.crashreport.common.strategy.StrategyBean g;
    private android.content.Context h;


    static {
            return
    }

    private ac(android.content.Context r2, java.util.List<com.tencent.bugly.proguard.o> r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            r1.h = r2
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r2)
            if (r0 == 0) goto L31
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            java.lang.String r2 = r2.H
            java.lang.String r0 = "oversea"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L23
            java.lang.String r2 = "https://astat.bugly.qcloud.com/rqd/async"
            com.tencent.bugly.crashreport.common.strategy.StrategyBean.a = r2
            com.tencent.bugly.crashreport.common.strategy.StrategyBean.b = r2
            goto L31
        L23:
            java.lang.String r0 = "na_https"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L31
            java.lang.String r2 = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async"
            com.tencent.bugly.crashreport.common.strategy.StrategyBean.a = r2
            com.tencent.bugly.crashreport.common.strategy.StrategyBean.b = r2
        L31:
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r2 = new com.tencent.bugly.crashreport.common.strategy.StrategyBean
            r2.<init>()
            r1.f = r2
            r1.e = r3
            com.tencent.bugly.proguard.ak r2 = com.tencent.bugly.proguard.ak.a()
            r1.c = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.tencent.bugly.proguard.ac r0) {
            android.content.Context r0 = r0.h
            return r0
    }

    static /* synthetic */ com.tencent.bugly.crashreport.common.strategy.StrategyBean a(com.tencent.bugly.proguard.ac r0, com.tencent.bugly.crashreport.common.strategy.StrategyBean r1) {
            r0.g = r1
            return r1
    }

    public static synchronized com.tencent.bugly.proguard.ac a() {
            java.lang.Class<com.tencent.bugly.proguard.ac> r0 = com.tencent.bugly.proguard.ac.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.ac r1 = com.tencent.bugly.proguard.ac.d     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized com.tencent.bugly.proguard.ac a(android.content.Context r2, java.util.List<com.tencent.bugly.proguard.o> r3) {
            java.lang.Class<com.tencent.bugly.proguard.ac> r0 = com.tencent.bugly.proguard.ac.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.ac r1 = com.tencent.bugly.proguard.ac.d     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.bugly.proguard.ac r1 = new com.tencent.bugly.proguard.ac     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.ac.d = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.tencent.bugly.proguard.ac r2 = com.tencent.bugly.proguard.ac.d     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public static void a(java.lang.String r1) {
            boolean r0 = com.tencent.bugly.proguard.ap.b(r1)
            if (r0 != 0) goto L10
            boolean r0 = com.tencent.bugly.proguard.ap.d(r1)
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            com.tencent.bugly.proguard.ac.i = r1
            return
        L10:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "URL user set is invalid."
            com.tencent.bugly.proguard.al.d(r0, r1)
            return
    }

    static /* synthetic */ com.tencent.bugly.crashreport.common.strategy.StrategyBean b(com.tencent.bugly.proguard.ac r0) {
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r0.g
            return r0
    }

    public static com.tencent.bugly.crashreport.common.strategy.StrategyBean d() {
            com.tencent.bugly.proguard.w r0 = com.tencent.bugly.proguard.w.a()
            r1 = 2
            java.util.List r0 = r0.a(r1)
            if (r0 == 0) goto L25
            int r1 = r0.size()
            if (r1 <= 0) goto L25
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.tencent.bugly.proguard.y r0 = (com.tencent.bugly.proguard.y) r0
            byte[] r0 = r0.g
            if (r0 == 0) goto L25
            android.os.Parcelable$Creator<com.tencent.bugly.crashreport.common.strategy.StrategyBean> r1 = com.tencent.bugly.crashreport.common.strategy.StrategyBean.CREATOR
            java.lang.Object r0 = com.tencent.bugly.proguard.ap.a(r0, r1)
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = (com.tencent.bugly.crashreport.common.strategy.StrategyBean) r0
            return r0
        L25:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.lang.String e() {
            java.lang.String r0 = com.tencent.bugly.proguard.ac.i
            return r0
    }

    protected final void a(com.tencent.bugly.crashreport.common.strategy.StrategyBean r7, boolean r8) {
            r6 = this;
            java.lang.Class<com.tencent.bugly.proguard.s> r0 = com.tencent.bugly.proguard.s.class
            java.lang.String r0 = r0.getName()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "[Strategy] Notify %s"
            com.tencent.bugly.proguard.al.c(r0, r2)
            com.tencent.bugly.proguard.s.a(r7, r8)
            java.util.List<com.tencent.bugly.proguard.o> r8 = r6.e
            java.util.Iterator r8 = r8.iterator()
        L1a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r8.next()
            com.tencent.bugly.proguard.o r2 = (com.tencent.bugly.proguard.o) r2
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L39
            r5[r3] = r4     // Catch: java.lang.Throwable -> L39
            com.tencent.bugly.proguard.al.c(r0, r5)     // Catch: java.lang.Throwable -> L39
            r2.onServerStrategyChanged(r7)     // Catch: java.lang.Throwable -> L39
            goto L1a
        L39:
            r2 = move-exception
            com.tencent.bugly.proguard.al.a(r2)
            goto L1a
        L3e:
            return
    }

    public final void a(com.tencent.bugly.proguard.bt r15) {
            r14 = this;
            if (r15 != 0) goto L3
            goto Lf
        L3:
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r14.g
            if (r0 == 0) goto L10
            long r1 = r15.h
            long r3 = r0.o
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = new com.tencent.bugly.crashreport.common.strategy.StrategyBean
            r0.<init>()
            boolean r1 = r15.a
            r0.f = r1
            boolean r1 = r15.c
            r0.h = r1
            boolean r1 = r15.b
            r0.g = r1
            java.lang.String r1 = com.tencent.bugly.proguard.ac.i
            boolean r1 = com.tencent.bugly.proguard.ap.b(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L33
            java.lang.String r1 = com.tencent.bugly.proguard.ac.i
            boolean r1 = com.tencent.bugly.proguard.ap.d(r1)
            if (r1 != 0) goto L61
        L33:
            java.lang.String r1 = r15.d
            boolean r1 = com.tencent.bugly.proguard.ap.d(r1)
            if (r1 == 0) goto L4a
            java.lang.String r1 = r15.d
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r1
            java.lang.String r1 = "[Strategy] Upload url changes to %s"
            com.tencent.bugly.proguard.al.c(r1, r4)
            java.lang.String r1 = r15.d
            r0.f9q = r1
        L4a:
            java.lang.String r1 = r15.e
            boolean r1 = com.tencent.bugly.proguard.ap.d(r1)
            if (r1 == 0) goto L61
            java.lang.String r1 = r15.e
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r1
            java.lang.String r1 = "[Strategy] Exception upload url changes to %s"
            com.tencent.bugly.proguard.al.c(r1, r4)
            java.lang.String r1 = r15.e
            r0.r = r1
        L61:
            com.tencent.bugly.proguard.bs r1 = r15.f
            if (r1 == 0) goto L73
            java.lang.String r1 = r1.a
            boolean r1 = com.tencent.bugly.proguard.ap.b(r1)
            if (r1 != 0) goto L73
            com.tencent.bugly.proguard.bs r1 = r15.f
            java.lang.String r1 = r1.a
            r0.s = r1
        L73:
            long r4 = r15.h
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L7d
            r0.o = r4
        L7d:
            java.util.Map<java.lang.String, java.lang.String> r1 = r15.g
            if (r1 == 0) goto Lf3
            int r1 = r1.size()
            if (r1 > 0) goto L88
            goto Lf3
        L88:
            java.util.Map<java.lang.String, java.lang.String> r1 = r15.g
            r0.t = r1
            java.lang.String r4 = "B11"
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "1"
            if (r1 == 0) goto La0
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto La0
            r1 = 1
            goto La1
        La0:
            r1 = 0
        La1:
            r0.i = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r15.g
            java.lang.String r5 = "B3"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb5
            long r5 = java.lang.Long.parseLong(r1)
            r0.w = r5
        Lb5:
            int r1 = r15.l
            long r5 = (long) r1
            r0.p = r5
            long r5 = (long) r1
            r0.v = r5
            java.util.Map<java.lang.String, java.lang.String> r1 = r15.g
            java.lang.String r5 = "B27"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ldc
            int r5 = r1.length()
            if (r5 <= 0) goto Ldc
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Ld8
            if (r1 <= 0) goto Ldc
            r0.u = r1     // Catch: java.lang.Exception -> Ld8
            goto Ldc
        Ld8:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
        Ldc:
            java.util.Map<java.lang.String, java.lang.String> r1 = r15.g
            java.lang.String r5 = "B25"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lf0
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lf0
            r1 = 1
            goto Lf1
        Lf0:
            r1 = 0
        Lf1:
            r0.k = r1
        Lf3:
            boolean r1 = r0.f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r4 = r0.h
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r0.g
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r0.i
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r7 = r0.j
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r8 = r0.m
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r9 = r0.n
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            long r10 = r0.p
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r11 = r0.k
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            long r12 = r0.o
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 10
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r3] = r1
            r13[r2] = r4
            r1 = 2
            r13[r1] = r5
            r4 = 3
            r13[r4] = r6
            r4 = 4
            r13[r4] = r7
            r4 = 5
            r13[r4] = r8
            r4 = 6
            r13[r4] = r9
            r4 = 7
            r13[r4] = r10
            r4 = 8
            r13[r4] = r11
            r4 = 9
            r13[r4] = r12
            java.lang.String r4 = "[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d"
            com.tencent.bugly.proguard.al.a(r4, r13)
            r14.g = r0
            java.lang.String r4 = r15.d
            boolean r4 = com.tencent.bugly.proguard.ap.d(r4)
            java.lang.String r5 = ""
            if (r4 != 0) goto L16d
            java.lang.String r4 = "[Strategy] download url is null"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.c(r4, r6)
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r4 = r14.g
            r4.f9q = r5
        L16d:
            java.lang.String r15 = r15.e
            boolean r15 = com.tencent.bugly.proguard.ap.d(r15)
            if (r15 != 0) goto L180
            java.lang.String r15 = "[Strategy] download crashurl is null"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.c(r15, r3)
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r15 = r14.g
            r15.r = r5
        L180:
            com.tencent.bugly.proguard.w r15 = com.tencent.bugly.proguard.w.a()
            r15.b(r1)
            com.tencent.bugly.proguard.y r15 = new com.tencent.bugly.proguard.y
            r15.<init>()
            r15.b = r1
            long r3 = r0.d
            r15.a = r3
            long r3 = r0.e
            r15.e = r3
            byte[] r1 = com.tencent.bugly.proguard.ap.a(r0)
            r15.g = r1
            com.tencent.bugly.proguard.w r1 = com.tencent.bugly.proguard.w.a()
            r1.a(r15)
            r14.a(r0, r2)
            return
    }

    public final synchronized boolean b() {
            r1 = this;
            monitor-enter(r1)
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r1.g     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public final com.tencent.bugly.crashreport.common.strategy.StrategyBean c() {
            r2 = this;
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.g
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.f9q
            boolean r0 = com.tencent.bugly.proguard.ap.d(r0)
            if (r0 != 0) goto L12
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.g
            java.lang.String r1 = com.tencent.bugly.crashreport.common.strategy.StrategyBean.a
            r0.f9q = r1
        L12:
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.g
            java.lang.String r0 = r0.r
            boolean r0 = com.tencent.bugly.proguard.ap.d(r0)
            if (r0 != 0) goto L22
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.g
            java.lang.String r1 = com.tencent.bugly.crashreport.common.strategy.StrategyBean.b
            r0.r = r1
        L22:
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.g
            return r0
        L25:
            java.lang.String r0 = com.tencent.bugly.proguard.ac.i
            boolean r0 = com.tencent.bugly.proguard.ap.b(r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = com.tencent.bugly.proguard.ac.i
            boolean r0 = com.tencent.bugly.proguard.ap.d(r0)
            if (r0 == 0) goto L3d
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.f
            java.lang.String r1 = com.tencent.bugly.proguard.ac.i
            r0.f9q = r1
            r0.r = r1
        L3d:
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r2.f
            return r0
    }
}
