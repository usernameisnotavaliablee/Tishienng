package com.bxkj.student.common.jpush;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.common.jpush.a a = null;
    private static int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.common.jpush.JPushManger$setAlias$1", f = "JPushManger.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.bxkj.student.common.jpush.a$a, reason: collision with other inner class name */
    static final class C0068a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ java.lang.String b;

        C0068a(java.lang.String r1, kotlin.coroutines.e<? super com.bxkj.student.common.jpush.a.C0068a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.common.jpush.a$a r2 = new com.bxkj.student.common.jpush.a$a
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
                com.bxkj.student.common.jpush.a$a r1 = (com.bxkj.student.common.jpush.a.C0068a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r10.a
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                kotlin.g0.n(r11)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L14
                r7 = r10
                goto L39
            L10:
                r0 = move-exception
                r11 = r0
                r7 = r10
                goto L63
            L14:
                r0 = move-exception
                r11 = r0
                r7 = r10
                goto L55
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.g0.n(r11)
                com.bxkj.student.v2.retrofit.e r11 = com.bxkj.student.v2.retrofit.e.a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                com.bxkj.student.v2.retrofit.b r3 = r11.c()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                java.lang.String r4 = r10.b     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                r10.a = r2     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                r7 = r10
                java.lang.Object r11 = com.bxkj.student.v2.retrofit.a.c(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
                if (r11 != r0) goto L39
                return r0
            L39:
                com.bxkj.student.App$a r11 = com.bxkj.student.App.d
                com.bxkj.student.App r11 = r11.a()
                int r0 = com.bxkj.student.common.jpush.a.a()
                java.lang.String r1 = r7.b
                cn.jpush.android.api.JPushInterface.setAlias(r11, r0, r1)
                goto L60
            L49:
                r0 = move-exception
            L4a:
                r11 = r0
                goto L63
            L4c:
                r0 = move-exception
            L4d:
                r11 = r0
                goto L55
            L4f:
                r0 = move-exception
                r7 = r10
                goto L4a
            L52:
                r0 = move-exception
                r7 = r10
                goto L4d
            L55:
                java.lang.String r11 = com.bxkj.base.v2.common.ext.e.a(r11)     // Catch: java.lang.Throwable -> L49
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L49
                com.orhanobut.logger.j.e(r11, r0)     // Catch: java.lang.Throwable -> L49
                goto L39
            L60:
                kotlin.n1 r11 = kotlin.n1.a
                return r11
            L63:
                com.bxkj.student.App$a r0 = com.bxkj.student.App.d
                com.bxkj.student.App r0 = r0.a()
                int r1 = com.bxkj.student.common.jpush.a.a()
                java.lang.String r2 = r7.b
                cn.jpush.android.api.JPushInterface.setAlias(r0, r1, r2)
                throw r11
        }
    }

    static {
            com.bxkj.student.common.jpush.a r0 = new com.bxkj.student.common.jpush.a
            r0.<init>()
            com.bxkj.student.common.jpush.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int a() {
            int r0 = com.bxkj.student.common.jpush.a.b
            return r0
    }

    private final void b() {
            r2 = this;
            int r0 = com.bxkj.student.common.jpush.a.b
            int r0 = r0 + 1
            com.bxkj.student.common.jpush.a.b = r0
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            int r1 = com.bxkj.student.common.jpush.a.b
            cn.jpush.android.api.JPushInterface.deleteAlias(r0, r1)
            return
    }

    private final void c(java.lang.String r8) {
            r7 = this;
            int r0 = com.bxkj.student.common.jpush.a.b
            int r0 = r0 + 1
            com.bxkj.student.common.jpush.a.b = r0
            kotlinx.coroutines.w1 r1 = kotlinx.coroutines.w1.a
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.common.jpush.a$a r4 = new com.bxkj.student.common.jpush.a$a
            r0 = 0
            r4.<init>(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void d(@org.jetbrains.annotations.NotNull java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "alias"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            int r0 = r0.d0()
            r1 = 1
            if (r0 == r1) goto L1c
            com.bxkj.student.App$a r3 = com.bxkj.student.App.d
            com.bxkj.student.App r3 = r3.a()
            cn.jpush.android.api.JPushInterface.stopPush(r3)
            return
        L1c:
            if (r4 == 0) goto L22
            r2.c(r3)
            return
        L22:
            r2.b()
            return
    }

    public final void e() {
            r3 = this;
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            int r1 = r1.d0()
            r2 = 1
            if (r1 == r2) goto L17
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            cn.jpush.android.api.JPushInterface.stopPush(r0)
            return
        L17:
            int r1 = com.bxkj.student.common.jpush.a.b
            int r1 = r1 + r2
            com.bxkj.student.common.jpush.a.b = r1
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            int r2 = com.bxkj.student.common.jpush.a.b
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r0 = r0.L()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.Set r0 = kotlin.collections.u1.q(r0)
            cn.jpush.android.api.JPushInterface.setTags(r1, r2, r0)
            return
    }
}
