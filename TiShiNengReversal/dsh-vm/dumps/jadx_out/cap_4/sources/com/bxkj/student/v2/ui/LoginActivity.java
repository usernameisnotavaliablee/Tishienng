package com.bxkj.student.v2.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/bxkj/student/v2/ui/LoginActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LoginActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2AcLoginBinding, com.bxkj.student.v2.vm.LoginViewModel> {

    @org.jetbrains.annotations.NotNull
    private com.bxkj.base.v2.data.UserType W;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends android.text.style.ClickableSpan {
        final /* synthetic */ com.bxkj.student.v2.ui.LoginActivity a;

        a(com.bxkj.student.v2.ui.LoginActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View r3) {
                r2 = this;
                java.lang.String r0 = "widget"
                kotlin.jvm.internal.g0.p(r3, r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.v2.ui.LoginActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                r3.<init>(r0)
                java.lang.String r0 = "隐私政策"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setTitle(r0)
                r0 = 2131492946(0x7f0c0052, float:1.8609358E38)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setCenterCustomView(r0)
                r0 = 2131298538(0x7f0908ea, float:1.8215052E38)
                android.view.View r0 = r3.findViewById(r0)
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r0
                com.bxkj.student.v2.retrofit.b$a r1 = com.bxkj.student.v2.retrofit.b.a
                java.lang.String r1 = r1.b()
                r0.j(r1)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends android.text.style.ClickableSpan {
        final /* synthetic */ com.bxkj.student.v2.ui.LoginActivity a;

        b(com.bxkj.student.v2.ui.LoginActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View r3) {
                r2 = this;
                java.lang.String r0 = "widget"
                kotlin.jvm.internal.g0.p(r3, r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.v2.ui.LoginActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                r3.<init>(r0)
                java.lang.String r0 = "用户协议"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setTitle(r0)
                r0 = 2131492946(0x7f0c0052, float:1.8609358E38)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setCenterCustomView(r0)
                r0 = 2131298538(0x7f0908ea, float:1.8215052E38)
                android.view.View r0 = r3.findViewById(r0)
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r0
                com.bxkj.student.v2.retrofit.b$a r1 = com.bxkj.student.v2.retrofit.b.a
                java.lang.String r1 = r1.c()
                r0.j(r1)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.LoginActivity$observerData$1$1", f = "LoginActivity.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"intent"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ com.bxkj.student.v2.ui.LoginActivity c;

        c(com.bxkj.student.v2.ui.LoginActivity r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.LoginActivity.c> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.LoginActivity$c r2 = new com.bxkj.student.v2.ui.LoginActivity$c
                com.bxkj.student.v2.ui.LoginActivity r0 = r1.c
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
                com.bxkj.student.v2.ui.LoginActivity$c r1 = (com.bxkj.student.v2.ui.LoginActivity.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.b
                java.lang.Class<com.bxkj.student.v2.ui.MainActivity> r2 = com.bxkj.student.v2.ui.MainActivity.class
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 != r3) goto L15
                java.lang.Object r0 = r5.a
                android.content.Intent r0 = (android.content.Intent) r0
                kotlin.g0.n(r6)
                goto L67
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.g0.n(r6)
                com.bxkj.base.v2.data.b$a r6 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r1 = r6.a()
                r1.e()
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.v2.ui.LoginActivity r4 = r5.c
                android.content.Context r4 = r4.G()
                r1.<init>(r4, r2)
                java.lang.String r4 = "LoginSuccess"
                android.content.Intent r1 = r1.putExtra(r4, r3)
                java.lang.String r4 = "putExtra(...)"
                kotlin.jvm.internal.g0.o(r1, r4)
                com.bxkj.student.v2.ui.LoginActivity r4 = r5.c
                com.bxkj.base.v2.data.UserType r4 = com.bxkj.student.v2.ui.LoginActivity.L(r4)
                com.bxkj.base.v2.data.b r6 = r6.a()
                com.bxkj.base.v2.data.UserType r6 = r6.T()
                if (r4 == r6) goto L86
                com.bxkj.student.v2.common.db.AppDatabase$a r6 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r6 = r6.a()
                com.bxkj.student.v2.common.db.dao.l r6 = r6.y()
                if (r6 == 0) goto L68
                r5.a = r1
                r5.b = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L66
                return r0
            L66:
                r0 = r1
            L67:
                r1 = r0
            L68:
                com.bxkj.base.v2.data.b$a r6 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r0 = r6.a()
                r3 = 0
                r0.u0(r3)
                com.bxkj.base.v2.data.b r6 = r6.a()
                r6.t0(r3)
                cn.bluemobi.dylan.base.utils.a r6 = cn.bluemobi.dylan.base.utils.a.n()
                r6.i(r2)
                r6 = 335544320(0x14000000, float:6.4623485E-27)
                r1.setFlags(r6)
            L86:
                com.bxkj.student.v2.ui.LoginActivity r6 = r5.c
                r6.startActivity(r1)
                com.bxkj.student.v2.ui.LoginActivity r6 = r5.c
                r6.finish()
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        d(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    public LoginActivity() {
            r1 = this;
            r1.<init>()
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            com.bxkj.base.v2.data.UserType r0 = r0.T()
            r1.W = r0
            return
    }

    public static final /* synthetic */ com.bxkj.base.v2.data.UserType L(com.bxkj.student.v2.ui.LoginActivity r0) {
            com.bxkj.base.v2.data.UserType r0 = r0.W
            return r0
    }

    private static final kotlin.n1 N(com.bxkj.student.v2.ui.LoginActivity r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r1 = "linkUrl"
            kotlin.jvm.internal.g0.p(r6, r1)
            com.bxkj.student.v2.common.utils.h r2 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r4 = r4.q()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r3.put(r0, r5)
            r3.put(r1, r6)
            kotlin.n1 r5 = kotlin.n1.a
            r2.b(r4, r3)
            return r5
    }

    private static final kotlin.n1 P(com.bxkj.student.v2.ui.LoginActivity r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r1 = "linkUrl"
            kotlin.jvm.internal.g0.p(r6, r1)
            com.bxkj.student.v2.common.utils.h r2 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r4 = r4.q()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r3.put(r0, r5)
            r3.put(r1, r6)
            kotlin.n1 r5 = kotlin.n1.a
            r2.b(r4, r3)
            return r5
    }

    private final void Q() {
            r7 = this;
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "阅读并接受"
            r1.append(r2)
            java.lang.String r2 = "《用户隐私政策》"
            r1.append(r2)
            java.lang.String r2 = "和"
            r1.append(r2)
            java.lang.String r2 = "《软件许可协议》"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            com.bxkj.student.v2.ui.LoginActivity$a r1 = new com.bxkj.student.v2.ui.LoginActivity$a
            r1.<init>(r7)
            r2 = 5
            r3 = 13
            r4 = 33
            r0.setSpan(r1, r2, r3, r4)
            com.bxkj.student.v2.ui.LoginActivity$b r1 = new com.bxkj.student.v2.ui.LoginActivity$b
            r1.<init>(r7)
            int r5 = r0.length()
            r6 = 14
            r0.setSpan(r1, r6, r5, r4)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r5 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r1.<init>(r5)
            r0.setSpan(r1, r2, r3, r4)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r5)
            int r2 = r0.length()
            r0.setSpan(r1, r6, r2, r4)
            androidx.databinding.ViewDataBinding r1 = r7.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            android.widget.TextView r1 = r1.tvAgree
            r2 = 0
            r1.setHighlightColor(r2)
            androidx.databinding.ViewDataBinding r1 = r7.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            android.widget.TextView r1 = r1.tvAgree
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            androidx.databinding.ViewDataBinding r1 = r7.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            android.widget.TextView r1 = r1.tvAgree
            r1.setText(r0)
            return
    }

    private static final kotlin.n1 R(com.bxkj.student.v2.ui.LoginActivity r5, java.lang.String r6) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length()
            r1 = 0
            if (r0 <= 0) goto Ld
            goto Le
        Ld:
            r6 = r1
        Le:
            if (r6 == 0) goto Le9
            boolean r0 = kotlin.text.u.M3(r6)
            if (r0 != 0) goto L17
            goto L18
        L17:
            r6 = r1
        L18:
            if (r6 == 0) goto Le9
            java.lang.String r0 = "1"
            r2 = 0
            r3 = 2
            boolean r0 = kotlin.text.u.l3(r6, r0, r2, r3, r1)
            r4 = 8
            if (r0 == 0) goto L53
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.TextView r0 = r0.tvLoginHint
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.LinearLayout r0 = r0.llAccount
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.LinearLayout r0 = r0.llPassword
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            com.google.android.material.button.MaterialButton r0 = r0.btLogin
            r0.setVisibility(r2)
            goto L7f
        L53:
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.TextView r0 = r0.tvLoginHint
            r0.setVisibility(r4)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.LinearLayout r0 = r0.llAccount
            r0.setVisibility(r4)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.LinearLayout r0 = r0.llPassword
            r0.setVisibility(r4)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            com.google.android.material.button.MaterialButton r0 = r0.btLogin
            r0.setVisibility(r4)
        L7f:
            java.lang.String r0 = "2"
            boolean r0 = kotlin.text.u.l3(r6, r0, r2, r3, r1)
            if (r0 == 0) goto L9e
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.ImageView r0 = r0.ivWechat
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.ImageView r0 = r0.ivQq
            r0.setVisibility(r2)
            goto Lb4
        L9e:
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.ImageView r0 = r0.ivWechat
            r0.setVisibility(r4)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.ImageView r0 = r0.ivQq
            r0.setVisibility(r4)
        Lb4:
            java.lang.String r0 = "3"
            boolean r6 = kotlin.text.u.l3(r6, r0, r2, r3, r1)
            if (r6 == 0) goto Ld3
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r6 = (com.bxkj.student.databinding.V2AcLoginBinding) r6
            com.google.android.material.button.MaterialButton r6 = r6.btAuthCenter
            r6.setVisibility(r2)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r5 = (com.bxkj.student.databinding.V2AcLoginBinding) r5
            com.google.android.material.button.MaterialButton r5 = r5.btAuthCenter
            r5.setVisibility(r2)
            goto Le9
        Ld3:
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r6 = (com.bxkj.student.databinding.V2AcLoginBinding) r6
            com.google.android.material.button.MaterialButton r6 = r6.btAuthCenter
            r6.setVisibility(r4)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.V2AcLoginBinding r5 = (com.bxkj.student.databinding.V2AcLoginBinding) r5
            com.google.android.material.button.MaterialButton r5 = r5.btAuthCenter
            r5.setVisibility(r4)
        Le9:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final kotlin.n1 V(com.bxkj.student.v2.ui.LoginActivity r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r1 = "linkUrl"
            kotlin.jvm.internal.g0.p(r6, r1)
            com.bxkj.student.v2.common.utils.h r2 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r4 = r4.q()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r3.put(r0, r5)
            r3.put(r1, r6)
            kotlin.n1 r5 = kotlin.n1.a
            r2.b(r4, r3)
            return r5
    }

    private static final kotlin.n1 Y(com.bxkj.student.v2.ui.LoginActivity r9, java.util.Map r10) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r10, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "uid"
            java.lang.String r4 = r0.t(r10, r1)
            com.bxkj.base.v2.base.BaseViewModel r1 = r9.C()
            r2 = r1
            com.bxkj.student.v2.vm.LoginViewModel r2 = (com.bxkj.student.v2.vm.LoginViewModel) r2
            androidx.fragment.app.FragmentActivity r3 = r9.q()
            java.lang.String r1 = "name"
            java.lang.String r6 = r0.t(r10, r1)
            java.lang.String r1 = "iconurl"
            java.lang.String r7 = r0.t(r10, r1)
            com.bxkj.student.v2.ui.f r8 = new com.bxkj.student.v2.ui.f
            r8.<init>(r9, r4)
            java.lang.String r5 = "2"
            r2.N(r3, r4, r5, r6, r7, r8)
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    private static final kotlin.n1 Z(com.bxkj.student.v2.ui.LoginActivity r1, java.lang.String r2) {
            com.bxkj.base.v2.base.BaseViewModel r1 = r1.C()
            com.bxkj.student.v2.vm.LoginViewModel r1 = (com.bxkj.student.v2.vm.LoginViewModel) r1
            java.lang.String r0 = "qqlogin "
            r1.M(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 b0(com.bxkj.student.v2.ui.LoginActivity r9, java.util.Map r10) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r10, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "uid"
            java.lang.String r4 = r0.t(r10, r1)
            com.bxkj.base.v2.base.BaseViewModel r1 = r9.C()
            r2 = r1
            com.bxkj.student.v2.vm.LoginViewModel r2 = (com.bxkj.student.v2.vm.LoginViewModel) r2
            androidx.fragment.app.FragmentActivity r3 = r9.q()
            java.lang.String r1 = "name"
            java.lang.String r6 = r0.t(r10, r1)
            java.lang.String r1 = "iconurl"
            java.lang.String r7 = r0.t(r10, r1)
            com.bxkj.student.v2.ui.c r8 = new com.bxkj.student.v2.ui.c
            r8.<init>(r9, r4)
            java.lang.String r5 = "1"
            r2.N(r3, r4, r5, r6, r7, r8)
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    private static final kotlin.n1 c0(com.bxkj.student.v2.ui.LoginActivity r1, java.lang.String r2) {
            com.bxkj.base.v2.base.BaseViewModel r1 = r1.C()
            com.bxkj.student.v2.vm.LoginViewModel r1 = (com.bxkj.student.v2.vm.LoginViewModel) r1
            java.lang.String r0 = "wechatlogin"
            r1.M(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 d0(com.bxkj.student.v2.ui.LoginActivity r6, java.util.Map r7) {
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.ui.LoginActivity$c r3 = new com.bxkj.student.v2.ui.LoginActivity$c
            r7 = 0
            r3.<init>(r6, r7)
            r4 = 2
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.LoginActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = b0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.LoginActivity r0, java.lang.String r1, java.lang.String r2) {
            kotlin.n1 r0 = V(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.LoginActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = Z(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.LoginActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = R(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 i(com.bxkj.student.v2.ui.LoginActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = d0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(com.bxkj.student.v2.ui.LoginActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = c0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 k(com.bxkj.student.v2.ui.LoginActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = Y(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 l(com.bxkj.student.v2.ui.LoginActivity r0, java.lang.String r1, java.lang.String r2) {
            kotlin.n1 r0 = P(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.v2.ui.LoginActivity r0, java.lang.String r1, java.lang.String r2) {
            kotlin.n1 r0 = N(r0, r1, r2)
            return r0
    }

    public final void M() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            com.bxkj.student.v2.ui.h r1 = new com.bxkj.student.v2.ui.h
            r1.<init>(r2)
            r0.z(r1)
            return
    }

    public final void O() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            com.bxkj.student.v2.ui.i r1 = new com.bxkj.student.v2.ui.i
            r1.<init>(r2)
            r0.B(r1)
            return
    }

    public final void S() {
            r3 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            androidx.databinding.ObservableField r0 = r0.I()
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L15
            r0 = r1
        L15:
            com.bxkj.base.v2.base.BaseViewModel r2 = r3.C()
            com.bxkj.student.v2.vm.LoginViewModel r2 = (com.bxkj.student.v2.vm.LoginViewModel) r2
            androidx.databinding.ObservableField r2 = r2.G()
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L28
            goto L29
        L28:
            r1 = r2
        L29:
            int r0 = r0.length()
            if (r0 != 0) goto L42
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.G()
            r0.<init>(r1)
            java.lang.String r1 = "请输入账号"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L42:
            int r0 = r1.length()
            if (r0 != 0) goto L5b
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.G()
            r0.<init>(r1)
            java.lang.String r1 = "请输入密码"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L5b:
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.CheckBox r0 = r0.cbAgree
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L7c
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.G()
            r0.<init>(r1)
            java.lang.String r1 = "请阅读并同意《用户隐私政策》和《软件许可协议》"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L7c:
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            r0.K()
            return
    }

    public final void T() {
            r6 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.base.v2.base.BaseViewModel r1 = r6.C()
            com.bxkj.student.v2.vm.LoginViewModel r1 = (com.bxkj.student.v2.vm.LoginViewModel) r1
            androidx.lifecycle.MutableLiveData r1 = r1.C()
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "h5url"
            java.lang.String r0 = r0.t(r1, r2)
            com.bxkj.student.v2.common.utils.h r1 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r2 = r6.q()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r5 = "统一身份认证"
            r3.put(r4, r5)
            java.lang.String r4 = "linkUrl"
            r3.put(r4, r0)
            kotlin.n1 r0 = kotlin.n1.a
            r1.b(r2, r3)
            return
    }

    public final void U() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            com.bxkj.student.v2.ui.e r1 = new com.bxkj.student.v2.ui.e
            r1.<init>(r2)
            r0.H(r1)
            return
    }

    public final void W(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "resultDataMap"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            r0.L(r2)
            return
    }

    public final void X() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.CheckBox r0 = r0.cbAgree
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L20
            com.bxkj.student.v2.common.utils.ThirdLogin r0 = new com.bxkj.student.v2.common.utils.ThirdLogin
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.<init>(r1)
            com.bxkj.student.v2.ui.b r1 = new com.bxkj.student.v2.ui.b
            r1.<init>(r2)
            r0.b(r1)
            return
        L20:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r2.G()
            r0.<init>(r1)
            java.lang.String r1 = "请阅读并同意《用户隐私政策》和《软件许可协议》"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    public final void a0() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.CheckBox r0 = r0.cbAgree
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L20
            com.bxkj.student.v2.common.utils.ThirdLogin r0 = new com.bxkj.student.v2.common.utils.ThirdLogin
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.<init>(r1)
            com.bxkj.student.v2.ui.a r1 = new com.bxkj.student.v2.ui.a
            r1.<init>(r2)
            r0.c(r1)
            return
        L20:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r2.G()
            r0.<init>(r1)
            java.lang.String r1 = "请阅读并同意《用户隐私政策》和《软件许可协议》"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    public final void e0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.splash.SelectSchoolV2Activity> r2 = com.bxkj.student.splash.SelectSchoolV2Activity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.D()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.g r2 = new com.bxkj.student.v2.ui.g
            r2.<init>(r4)
            com.bxkj.student.v2.ui.LoginActivity$d r3 = new com.bxkj.student.v2.ui.LoginActivity$d
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    protected void onActivityResult(int r2, int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r1)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r4 = this;
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.TextView r0 = r0.tvAgree
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = r0 instanceof android.text.SpannableString
            if (r0 == 0) goto L44
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.TextView r0 = r0.tvAgree
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = "null cannot be cast to non-null type android.text.SpannableString"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            int r1 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            r3 = 0
            java.lang.Object[] r1 = r0.getSpans(r3, r1, r2)
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            java.util.Iterator r1 = kotlin.jvm.internal.h.a(r1)
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            android.text.style.ClickableSpan r2 = (android.text.style.ClickableSpan) r2
            r0.removeSpan(r2)
            goto L34
        L44:
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.TextView r0 = r0.tvAgree
            r1 = 0
            r0.setText(r1)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r0 = (com.bxkj.student.databinding.V2AcLoginBinding) r0
            android.widget.TextView r0 = r0.tvAgree
            r0.setMovementMethod(r1)
            super.onDestroy()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            r2 = 0
            r1.z0(r2)
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            com.bxkj.base.v2.base.BaseViewModel r3 = r4.C()
            com.bxkj.student.v2.vm.LoginViewModel r3 = (com.bxkj.student.v2.vm.LoginViewModel) r3
            r1.setLoginViewModel(r3)
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            r1.setActivity(r4)
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            com.bxkj.base.v2.data.b r3 = r0.a()
            r1.setLoginInUser(r3)
            com.bxkj.base.v2.base.BaseViewModel r1 = r4.C()
            com.bxkj.student.v2.vm.LoginViewModel r1 = (com.bxkj.student.v2.vm.LoginViewModel) r1
            androidx.databinding.ObservableField r1 = r1.I()
            com.bxkj.base.v2.data.b r3 = r0.a()
            java.lang.String r3 = r3.S()
            r1.set(r3)
            com.bxkj.base.v2.data.b r1 = r0.a()
            r1.z0(r2)
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            android.widget.ImageView r1 = r1.ivPhone
            com.bxkj.base.v2.data.b r0 = r0.a()
            int r0 = r0.G()
            r3 = 1
            if (r0 != r3) goto L5f
            goto L61
        L5f:
            r2 = 8
        L61:
            r1.setVisibility(r2)
            r4.Q()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.LoginViewModel r0 = (com.bxkj.student.v2.vm.LoginViewModel) r0
            com.bxkj.student.v2.ui.d r1 = new com.bxkj.student.v2.ui.d
            r1.<init>(r4)
            r0.E(r1)
            return
    }
}
