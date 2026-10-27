package com.bxkj.student.personal.bind;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWechatQQBindAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WechatQQBindAccountActivity.kt\ncom/bxkj/student/personal/bind/WechatQQBindAccountActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class WechatQQBindAccountActivity extends cn.bluemobi.dylan.base.BaseActivity {

    @org.jetbrains.annotations.Nullable
    private android.widget.ImageView Y;

    @org.jetbrains.annotations.Nullable
    private android.widget.TextView Z;

    @org.jetbrains.annotations.Nullable
    private android.widget.TextView a0;

    @org.jetbrains.annotations.Nullable
    private android.widget.TextView b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.bind.WechatQQBindAccountActivity a;

        a(com.bxkj.student.personal.bind.WechatQQBindAccountActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "ex"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public void netOnOtherStatus(int r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = "msg"
                kotlin.jvm.internal.g0.p(r2, r1)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.personal.bind.WechatQQBindAccountActivity r0 = r1.a
                androidx.fragment.app.FragmentActivity r0 = com.bxkj.student.personal.bind.WechatQQBindAccountActivity.h0(r0)
                com.bxkj.student.personal.login.c.b(r0, r2)
                return
        }
    }

    public WechatQQBindAccountActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.personal.bind.WechatQQBindAccountActivity r0, android.view.View r1) {
            i0(r0, r1)
            return
    }

    public static final /* synthetic */ androidx.fragment.app.FragmentActivity h0(com.bxkj.student.personal.bind.WechatQQBindAccountActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    private static final void i0(com.bxkj.student.personal.bind.WechatQQBindAccountActivity r0, android.view.View r1) {
            r0.j0()
            return
    }

    private final void j0() {
            r9 = this;
            android.widget.TextView r0 = r9.a0
            java.lang.String r1 = ""
            if (r0 == 0) goto L18
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = kotlin.text.u.Z5(r0)
            java.lang.String r0 = r0.toString()
            r4 = r0
            goto L19
        L18:
            r4 = r1
        L19:
            android.widget.TextView r0 = r9.b0
            if (r0 == 0) goto L2d
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = kotlin.text.u.Z5(r0)
            java.lang.String r1 = r0.toString()
        L2d:
            r3 = r1
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L37
            r0 = r9
            goto L38
        L37:
            r0 = r1
        L38:
            java.lang.String r2 = "mContext"
            if (r0 == 0) goto L47
            android.content.Context r0 = r9.V
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.String r1 = "请输入姓名！"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r1)
            return
        L47:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L4e
            r1 = r9
        L4e:
            if (r1 == 0) goto L5b
            android.content.Context r0 = r9.V
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.String r1 = "请输入学号！"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r1)
            return
        L5b:
            android.content.Context r0 = r9.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            d0.a r2 = (d0.a) r2
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r5 = "login_type"
            java.lang.String r5 = r1.getStringExtra(r5)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r6 = "openid"
            java.lang.String r6 = r1.getStringExtra(r6)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r7 = "name"
            java.lang.String r7 = r1.getStringExtra(r7)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r8 = "iconurl"
            java.lang.String r8 = r1.getStringExtra(r8)
            rx.e r1 = r2.I1(r3, r4, r5, r6, r7, r8)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.bind.WechatQQBindAccountActivity$a r1 = new com.bxkj.student.personal.bind.WechatQQBindAccountActivity$a
            r1.<init>(r9)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            r0 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            com.bxkj.student.personal.bind.d r1 = new com.bxkj.student.personal.bind.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492908(0x7f0c002c, float:1.8609281E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "iconurl"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto Lf
            r0 = r5
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L2b
            android.widget.ImageView r0 = r5.Y
            if (r0 == 0) goto L2b
            android.content.Context r3 = r5.V
            com.bumptech.glide.i r3 = com.bumptech.glide.b.D(r3)
            android.content.Intent r4 = r5.getIntent()
            java.lang.String r1 = r4.getStringExtra(r1)
            com.bumptech.glide.h r1 = r3.M(r1)
            r1.m1(r0)
        L2b:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L38
            r2 = r5
        L38:
            if (r2 == 0) goto L49
            android.widget.TextView r0 = r5.Z
            if (r0 == 0) goto L49
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.setText(r1)
        L49:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "绑定账号"
            r1.setTitle(r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Y = r1
            r1 = 2131298990(0x7f090aae, float:1.8215969E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131296935(0x7f0902a7, float:1.82118E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131296925(0x7f09029d, float:1.821178E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            return
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }
}
