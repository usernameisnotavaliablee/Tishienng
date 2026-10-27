package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;
    private xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel d;
    private xyz.adscope.common.f e;
    private xyz.adscope.common.f.b<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> f;
    private xyz.adscope.common.f.c g;
    private final xyz.adscope.common.f.d<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.f.d<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> {
        final /* synthetic */ xyz.adscope.common.f a;

        a(xyz.adscope.common.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // xyz.adscope.common.f.d
        public void a(java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r5) {
                r4 = this;
                xyz.adscope.common.f r0 = r4.a
                xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r1 = xyz.adscope.common.f.a(r0)
                xyz.adscope.common.f r2 = r4.a
                java.lang.String r2 = xyz.adscope.common.f.b(r2)
                xyz.adscope.common.f r3 = r4.a
                java.lang.String r3 = xyz.adscope.common.f.c(r3)
                xyz.adscope.common.f.a(r0, r5, r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<E> extends java.util.concurrent.CopyOnWriteArrayList<E> {
        private final int a;
        private final xyz.adscope.common.f.b<E>.a b;
        private xyz.adscope.common.f.d c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class a extends xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask {
            final /* synthetic */ xyz.adscope.common.f.b a;

            public a(xyz.adscope.common.f.b r1, long r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
            protected void onScheduleTimeout() {
                    r2 = this;
                    xyz.adscope.common.f$b r0 = r2.a
                    monitor-enter(r0)
                    xyz.adscope.common.f$b r1 = r2.a     // Catch: java.lang.Throwable -> La
                    xyz.adscope.common.f.b.a(r1)     // Catch: java.lang.Throwable -> La
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                    return
                La:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                    throw r1
            }
        }

        b(int r1, long r2) {
                r0 = this;
                r0.<init>()
                if (r1 <= 0) goto L6
                goto L7
            L6:
                r1 = 1
            L7:
                r0.a = r1
                xyz.adscope.common.f$b$a r1 = new xyz.adscope.common.f$b$a
                r1.<init>(r0, r2)
                r0.b = r1
                return
        }

        private java.util.List<E> a() {
                r1 = this;
                monitor-enter(r1)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
                r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
                r1.clear()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                return r0
            Lb:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0
        }

        private void a(java.util.List<E> r2) {
                r1 = this;
                xyz.adscope.common.f$d r0 = r1.c
                if (r0 == 0) goto L7
                r0.a(r2)
            L7:
                return
        }

        static /* synthetic */ void a(xyz.adscope.common.f.b r0) {
                r0.b()
                return
        }

        private void b() {
                r1 = this;
                xyz.adscope.common.f$b<E>$a r0 = r1.b
                r0.cancelCountDown()
                java.util.List r0 = r1.a()
                r1.a(r0)
                return
        }

        void a(xyz.adscope.common.f.d r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public boolean add(E r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r3 = super.add(r3)     // Catch: java.lang.Throwable -> L14
                if (r3 == 0) goto L16
                int r0 = r2.size()     // Catch: java.lang.Throwable -> L14
                r1 = 1
                if (r0 != r1) goto L16
                xyz.adscope.common.f$b<E>$a r0 = r2.b     // Catch: java.lang.Throwable -> L14
                r0.startCountDown()     // Catch: java.lang.Throwable -> L14
                goto L16
            L14:
                r3 = move-exception
                goto L25
            L16:
                if (r3 == 0) goto L23
                int r0 = r2.size()     // Catch: java.lang.Throwable -> L14
                int r1 = r2.a     // Catch: java.lang.Throwable -> L14
                if (r0 != r1) goto L23
                r2.b()     // Catch: java.lang.Throwable -> L14
            L23:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                return r3
            L25:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface c {
        void a(java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r1, xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r2, java.lang.String r3, java.lang.String r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface d<E> {
        void a(java.util.List<E> r1);
    }

    f(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            xyz.adscope.common.f$a r1 = new xyz.adscope.common.f$a
            r1.<init>(r0)
            r0.h = r1
            return
    }

    static /* synthetic */ xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel a(xyz.adscope.common.f r0) {
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r0 = r0.d
            return r0
    }

    private void a(java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r2, xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            xyz.adscope.common.f$c r0 = r1.g
            if (r0 == 0) goto L7
            r0.a(r2, r3, r4, r5)
        L7:
            return
    }

    static /* synthetic */ void a(xyz.adscope.common.f r0, java.util.List r1, xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r2, java.lang.String r3, java.lang.String r4) {
            r0.a(r1, r2, r3, r4)
            return
    }

    private boolean a(xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog r4) {
            r3 = this;
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r0 = r3.d
            if (r0 == 0) goto L43
            java.util.List r0 = r0.d()
            if (r0 == 0) goto L43
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r0 = r3.d
            java.util.List r0 = r0.d()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r0 = r3.d
            java.util.List r0 = r0.d()
            java.lang.String r1 = r4.b()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L43
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r0 = r3.d
            int r0 = r0.e()
            java.lang.String r1 = r3.c
            boolean r2 = r4 instanceof xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog
            if (r2 == 0) goto L3e
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog r4 = (xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog) r4
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon r4 = r4.c()
            if (r4 == 0) goto L3e
            java.lang.String r1 = r4.b()
        L3e:
            boolean r4 = xyz.adscope.common.v2.tool.roll.RandomProbability.rollByCRCString(r0, r1)
            return r4
        L43:
            r4 = 0
            return r4
    }

    static /* synthetic */ java.lang.String b(xyz.adscope.common.f r0) {
            java.lang.String r0 = r0.a
            return r0
    }

    private void b(xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog r2) {
            r1 = this;
            xyz.adscope.common.f r0 = r1.e
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            return
    }

    static /* synthetic */ java.lang.String c(xyz.adscope.common.f r0) {
            java.lang.String r0 = r0.b
            return r0
    }

    void a(xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r4) {
            r3 = this;
            r3.d = r4
            java.lang.String r0 = r4.f()
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lb
            goto Ld
        Lb:
            r0 = 0
        Ld:
            xyz.adscope.common.f$b r2 = new xyz.adscope.common.f$b
            int r4 = r4.b()
            r2.<init>(r4, r0)
            r3.f = r2
            return
    }

    void a(xyz.adscope.common.f.c r1) {
            r0 = this;
            r0.g = r1
            return
    }

    void c(xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog r3) {
            r2 = this;
            xyz.adscope.common.f$b<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r0 = r2.f
            xyz.adscope.common.f$d<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r1 = r2.h
            r0.a(r1)
            boolean r0 = r2.a(r3)
            if (r0 == 0) goto L2f
            if (r3 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r1 = r2.d
            int r1 = r1.e()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.a(r0)
        L29:
            xyz.adscope.common.f$b<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r0 = r2.f
            r0.add(r3)
            return
        L2f:
            r2.b(r3)
            return
    }

    void d(xyz.adscope.common.f r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
