package com.bxkj.student.v2.common.utils.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.safe.e a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.utils.safe.EnvironmentCheck$initMySafeCheckEnvironmentCheck$1", f = "EnvironmentCheck.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"mySafe"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;

        a(kotlin.coroutines.e<? super com.bxkj.student.v2.common.utils.safe.e.a> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.v2.common.utils.safe.e$a r1 = new com.bxkj.student.v2.common.utils.safe.e$a
                r1.<init>(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.common.utils.safe.e$a r1 = (com.bxkj.student.v2.common.utils.safe.e.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.b
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.a
                java.util.Map r0 = (java.util.Map) r0
                kotlin.g0.n(r5)
                goto Lba
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.g0.n(r5)
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>()
                b0.b r1 = b0.b.a
                com.bxkj.student.App$a r3 = com.bxkj.student.App.d
                com.bxkj.student.App r3 = r3.a()
                boolean r1 = r1.c(r3)
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                java.lang.String r3 = "sign"
                r5.put(r3, r1)
                com.bxkj.student.v2.common.utils.safe.g r1 = com.bxkj.student.v2.common.utils.safe.g.a
                boolean r1 = r1.d()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                java.lang.String r3 = "root"
                r5.put(r3, r1)
                com.bxkj.student.v2.common.utils.safe.d r1 = com.bxkj.student.v2.common.utils.safe.d.a
                boolean r1 = r1.a()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                java.lang.String r3 = "emulator"
                r5.put(r3, r1)
                com.bxkj.student.v2.common.utils.safe.f r1 = com.bxkj.student.v2.common.utils.safe.f.a
                boolean r1 = r1.c()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                java.lang.String r3 = "hook"
                r5.put(r3, r1)
                com.bxkj.student.v2.common.utils.safe.c r1 = com.bxkj.student.v2.common.utils.safe.c.a
                boolean r1 = r1.d()
                if (r1 != 0) goto L77
                boolean r1 = android.os.Debug.isDebuggerConnected()
                if (r1 == 0) goto L75
                goto L77
            L75:
                r1 = 0
                goto L78
            L77:
                r1 = 1
            L78:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                java.lang.String r3 = "debug"
                r5.put(r3, r1)
                com.bxkj.student.v2.common.utils.safe.h r1 = com.bxkj.student.v2.common.utils.safe.h.a
                boolean r1 = r1.a()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
                java.lang.String r3 = "breakpoint"
                r5.put(r3, r1)
                java.lang.String r1 = "supported_abis"
                java.lang.String[] r3 = android.os.Build.SUPPORTED_ABIS
                r5.put(r1, r3)
                com.bxkj.student.v2.common.db.AppDatabase$a r1 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r1 = r1.a()
                com.bxkj.student.v2.common.db.dao.b r1 = r1.w()
                if (r1 == 0) goto Lba
                java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r5)
                java.lang.String r3 = r3.toString()
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.j.a(r5)
                r4.a = r5
                r4.b = r2
                java.lang.Object r5 = r1.e(r3, r4)
                if (r5 != r0) goto Lba
                return r0
            Lba:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements com.oplus.omes.stdsco.probe.a {
        final /* synthetic */ androidx.fragment.app.FragmentActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.utils.safe.EnvironmentCheck$initOppoSavedEnvironmentCheck$1$onSuccess$1$1", f = "EnvironmentCheck.kt", i = {}, l = {52, 53}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ java.lang.String b;

            a(java.lang.String r1, kotlin.coroutines.e<? super com.bxkj.student.v2.common.utils.safe.e.b.a> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.student.v2.common.utils.safe.e$b$a r2 = new com.bxkj.student.v2.common.utils.safe.e$b$a
                    java.lang.String r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.common.utils.safe.e$b$a r1 = (com.bxkj.student.v2.common.utils.safe.e.b.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r4.a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.g0.n(r5)
                    goto L4d
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    kotlin.g0.n(r5)
                    goto L38
                L1e:
                    kotlin.g0.n(r5)
                    com.bxkj.student.v2.common.db.AppDatabase$a r5 = com.bxkj.student.v2.common.db.AppDatabase.a
                    com.bxkj.student.v2.common.db.AppDatabase r5 = r5.a()
                    com.bxkj.student.v2.common.db.dao.b r5 = r5.w()
                    if (r5 == 0) goto L38
                    java.lang.String r1 = r4.b
                    r4.a = r3
                    java.lang.Object r5 = r5.a(r1, r4)
                    if (r5 != r0) goto L38
                    goto L4c
                L38:
                    com.bxkj.student.v2.common.db.AppDatabase$a r5 = com.bxkj.student.v2.common.db.AppDatabase.a
                    com.bxkj.student.v2.common.db.AppDatabase r5 = r5.a()
                    com.bxkj.student.v2.common.db.dao.b r5 = r5.w()
                    if (r5 == 0) goto L50
                    r4.a = r2
                    java.lang.Object r5 = r5.f(r4)
                    if (r5 != r0) goto L4d
                L4c:
                    return r0
                L4d:
                    l0.a r5 = (l0.a) r5
                    goto L51
                L50:
                    r5 = 0
                L51:
                    com.orhanobut.logger.j.c(r5)
                    kotlin.n1 r5 = kotlin.n1.a
                    return r5
            }
        }

        b(androidx.fragment.app.FragmentActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onError(java.lang.String r1) {
                r0 = this;
                return
        }

        public void onSuccess(java.lang.String r8) {
                r7 = this;
                com.orhanobut.logger.j.h(r8)
                if (r8 == 0) goto L1b
                androidx.fragment.app.FragmentActivity r0 = r7.a
                androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
                kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
                com.bxkj.student.v2.common.utils.safe.e$b$a r4 = new com.bxkj.student.v2.common.utils.safe.e$b$a
                r0 = 0
                r4.<init>(r8, r0)
                r5 = 2
                r6 = 0
                r3 = 0
                kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            L1b:
                return
        }
    }

    static {
            com.bxkj.student.v2.common.utils.safe.e r0 = new com.bxkj.student.v2.common.utils.safe.e
            r0.<init>()
            com.bxkj.student.v2.common.utils.safe.e.a = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void b(androidx.fragment.app.FragmentActivity r7) {
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.common.utils.safe.e$a r3 = new com.bxkj.student.v2.common.utils.safe.e$a
            r7 = 0
            r3.<init>(r7)
            r4 = 2
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    private final void c(androidx.fragment.app.FragmentActivity r3) {
            r2 = this;
            com.bxkj.base.BaseApp r0 = com.bxkj.base.BaseApp.c()
            com.bxkj.student.v2.common.utils.safe.e$b r1 = new com.bxkj.student.v2.common.utils.safe.e$b
            r1.<init>(r3)
            com.oplus.omes.stdsco.probe.ProbeClient.a(r0, r1)
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b(r2)
            r1.c(r2)
            return
    }
}
