package com.bxkj.base.v2.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h {

    @org.jetbrains.annotations.NotNull
    private androidx.fragment.app.FragmentActivity a;

    @org.jetbrains.annotations.NotNull
    private android.webkit.WebView b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.h5.GPSJS$getLocation$1", f = "GPSJS.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.base.v2.h5.h b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.v2.h5.h$a$a, reason: collision with other inner class name */
        public static final class C0058a implements com.bxkj.base.v2.common.utils.y {
            final /* synthetic */ com.bxkj.base.v2.h5.h a;
            final /* synthetic */ com.bxkj.base.v2.base.ProgressDialogFragment b;

            C0058a(com.bxkj.base.v2.h5.h r1, com.bxkj.base.v2.base.ProgressDialogFragment r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.v2.common.utils.y
            public void a(double r6, double r8) {
                    r5 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "getLocationCallBack('"
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = "','"
                    r0.append(r1)
                    r0.append(r8)
                    java.lang.String r2 = "')"
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    r3 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    com.orhanobut.logger.j.d(r0, r3)
                    com.bxkj.base.v2.h5.h r0 = r5.a
                    android.webkit.WebView r0 = r0.b()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "javascript:stuSignStatus('"
                    r3.append(r4)
                    r3.append(r6)
                    r3.append(r1)
                    r3.append(r8)
                    r3.append(r2)
                    java.lang.String r3 = r3.toString()
                    r0.loadUrl(r3)
                    com.bxkj.base.v2.h5.h r0 = r5.a
                    android.webkit.WebView r0 = r0.b()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "javascript:getLocationCallBack('"
                    r3.append(r4)
                    r3.append(r6)
                    r3.append(r1)
                    r3.append(r8)
                    r3.append(r2)
                    java.lang.String r6 = r3.toString()
                    r0.loadUrl(r6)
                    com.bxkj.base.v2.base.ProgressDialogFragment r6 = r5.b
                    r6.dismiss()
                    return
            }

            @Override // com.bxkj.base.v2.common.utils.y
            public void b(java.lang.Integer r4, java.lang.String r5) {
                    r3 = this;
                    com.bxkj.base.v2.base.ProgressDialogFragment r0 = r3.b
                    r0.dismiss()
                    com.bxkj.base.v2.h5.h r0 = r3.a
                    androidx.fragment.app.FragmentActivity r0 = r0.a()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "获取定位失败，错误码【"
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = "】错误信息【"
                    r1.append(r4)
                    r1.append(r5)
                    java.lang.String r4 = "】"
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    com.bxkj.base.v2.common.ext.ContextExtKt.q(r0, r4)
                    return
            }
        }

        a(com.bxkj.base.v2.h5.h r1, kotlin.coroutines.e<? super com.bxkj.base.v2.h5.h.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ kotlin.n1 f(com.bxkj.base.v2.h5.h r0) {
                kotlin.n1 r0 = i(r0)
                return r0
        }

        private static final kotlin.n1 i(com.bxkj.base.v2.h5.h r4) {
                com.bxkj.base.v2.base.ProgressDialogFragment r0 = new com.bxkj.base.v2.base.ProgressDialogFragment
                r1 = 0
                r2 = 1
                r0.<init>(r1, r2, r1)
                androidx.fragment.app.FragmentActivity r1 = r4.a()
                androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
                java.lang.String r3 = "getSupportFragmentManager(...)"
                kotlin.jvm.internal.g0.o(r1, r3)
                java.lang.String r3 = "正在获取定位"
                r0.e(r1, r3, r2)
                com.bxkj.base.v2.common.utils.c r1 = com.bxkj.base.v2.common.utils.c.a
                com.bxkj.base.v2.h5.h$a$a r2 = new com.bxkj.base.v2.h5.h$a$a
                r2.<init>(r4, r0)
                r1.b(r2)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.base.v2.h5.h$a r2 = new com.bxkj.base.v2.h5.h$a
                com.bxkj.base.v2.h5.h r0 = r1.b
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
                com.bxkj.base.v2.h5.h$a r1 = (com.bxkj.base.v2.h5.h.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r2.a
                if (r0 != 0) goto L1d
                kotlin.g0.n(r3)
                com.bxkj.base.v2.h5.h r3 = r2.b
                androidx.fragment.app.FragmentActivity r3 = r3.a()
                com.bxkj.base.v2.h5.h r0 = r2.b
                com.bxkj.base.v2.h5.g r1 = new com.bxkj.base.v2.h5.g
                r1.<init>(r0)
                com.bxkj.base.v2.common.ext.t.v(r3, r1)
                kotlin.n1 r3 = kotlin.n1.a
                return r3
            L1d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    public h(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull android.webkit.WebView r3) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mWebView"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.FragmentActivity a() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public android.webkit.WebView b() {
            r1 = this;
            android.webkit.WebView r0 = r1.b
            return r0
    }

    public void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    public void d(@org.jetbrains.annotations.NotNull android.webkit.WebView r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    @android.webkit.JavascriptInterface
    public final void getLocation() {
            r7 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "开始获取GPS点名位置"
            com.orhanobut.logger.j.d(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r7.a()
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.base.v2.h5.h$a r4 = new com.bxkj.base.v2.h5.h$a
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }
}
