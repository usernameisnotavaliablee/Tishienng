package com.bxkj.student.personal.bind;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBindWechatQQActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindWechatQQActivity.kt\ncom/bxkj/student/personal/bind/BindWechatQQActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BindWechatQQActivity extends cn.bluemobi.dylan.base.BaseActivity {

    @org.jetbrains.annotations.Nullable
    private android.widget.ImageView Y;

    @org.jetbrains.annotations.Nullable
    private android.widget.TextView Z;

    @org.jetbrains.annotations.Nullable
    private android.widget.TextView a0;

    @org.jetbrains.annotations.Nullable
    private android.widget.Button b0;

    @org.jetbrains.annotations.Nullable
    private android.widget.Button c0;

    /* renamed from: k0, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private com.umeng.socialize.UMAuthListener f1131k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.bind.BindWechatQQActivity a;

        a(com.bxkj.student.personal.bind.BindWechatQQActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.personal.bind.BindWechatQQActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public BindWechatQQActivity() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.personal.bind.BindWechatQQActivity$umAuthListener$1 r0 = new com.bxkj.student.personal.bind.BindWechatQQActivity$umAuthListener$1
            r0.<init>(r1)
            r1.f1131k0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.personal.bind.BindWechatQQActivity r0, android.view.View r1) {
            n0(r0, r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.personal.bind.BindWechatQQActivity r0) {
            q0(r0)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.personal.bind.BindWechatQQActivity r0, android.view.View r1) {
            o0(r0, r1)
            return
    }

    public static final /* synthetic */ android.widget.Button j0(com.bxkj.student.personal.bind.BindWechatQQActivity r0) {
            android.widget.Button r0 = r0.c0
            return r0
    }

    public static final /* synthetic */ android.widget.Button k0(com.bxkj.student.personal.bind.BindWechatQQActivity r0) {
            android.widget.Button r0 = r0.b0
            return r0
    }

    public static final /* synthetic */ android.content.Context l0(com.bxkj.student.personal.bind.BindWechatQQActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static final /* synthetic */ void m0(com.bxkj.student.personal.bind.BindWechatQQActivity r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.s0(r1, r2, r3, r4)
            return
    }

    private static final void n0(com.bxkj.student.personal.bind.BindWechatQQActivity r2, android.view.View r3) {
            android.content.Context r3 = r2.V
            com.umeng.socialize.UMShareAPI r3 = com.umeng.socialize.UMShareAPI.get(r3)
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            boolean r3 = r3.isInstall(r0, r1)
            if (r3 != 0) goto L16
            java.lang.String r3 = "您还未安装微信或微信版本过低"
            r2.f0(r3)
            return
        L16:
            android.widget.Button r3 = r2.b0
            if (r3 == 0) goto L1e
            r0 = 0
            r3.setEnabled(r0)
        L1e:
            android.content.Context r3 = r2.V
            com.umeng.socialize.UMShareAPI r3 = com.umeng.socialize.UMShareAPI.get(r3)
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.umeng.socialize.UMAuthListener r2 = r2.f1131k0
            r3.getPlatformInfo(r0, r1, r2)
            return
    }

    private static final void o0(com.bxkj.student.personal.bind.BindWechatQQActivity r2, android.view.View r3) {
            android.content.Context r3 = r2.V
            com.umeng.socialize.UMShareAPI r3 = com.umeng.socialize.UMShareAPI.get(r3)
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            boolean r3 = r3.isInstall(r0, r1)
            if (r3 != 0) goto L16
            java.lang.String r3 = "您还未安装QQ或QQ版本过低"
            r2.f0(r3)
            return
        L16:
            android.widget.Button r3 = r2.c0
            if (r3 == 0) goto L1e
            r0 = 0
            r3.setEnabled(r0)
        L1e:
            android.content.Context r3 = r2.V
            com.umeng.socialize.UMShareAPI r3 = com.umeng.socialize.UMShareAPI.get(r3)
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.umeng.socialize.UMAuthListener r2 = r2.f1131k0
            r3.getPlatformInfo(r0, r1, r2)
            return
    }

    private static final void q0(com.bxkj.student.personal.bind.BindWechatQQActivity r0) {
            r0.finish()
            return
    }

    private final void s0(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            android.content.Context r0 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            d0.a r2 = (d0.a) r2
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r1.getUserId()
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            rx.e r9 = r2.g1(r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r9 = r0.setObservable(r9)
            com.bxkj.student.personal.bind.BindWechatQQActivity$a r10 = new com.bxkj.student.personal.bind.BindWechatQQActivity$a
            r10.<init>(r8)
            r9.setDataListener(r10)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.b0
            if (r0 == 0) goto Lc
            com.bxkj.student.personal.bind.a r1 = new com.bxkj.student.personal.bind.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        Lc:
            android.widget.Button r0 = r2.c0
            if (r0 == 0) goto L18
            com.bxkj.student.personal.bind.b r1 = new com.bxkj.student.personal.bind.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L18:
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492909(0x7f0c002d, float:1.8609283E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.widget.TextView r0 = r3.Z
            if (r0 == 0) goto Lf
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getRealName()
            r0.setText(r1)
        Lf:
            android.widget.TextView r0 = r3.a0
            if (r0 == 0) goto L1e
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            r0.setText(r1)
        L1e:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getHeadImageUrl()
            if (r0 == 0) goto L39
            android.widget.ImageView r1 = r3.Y
            if (r1 == 0) goto L39
            android.content.Context r2 = r3.V
            com.bumptech.glide.i r2 = com.bumptech.glide.b.D(r2)
            com.bumptech.glide.h r0 = r2.M(r0)
            r0.m1(r1)
        L39:
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "请绑定微信或QQ"
            r2.setTitle(r0)
            com.bxkj.student.personal.bind.c r0 = new com.bxkj.student.personal.bind.c
            r0.<init>(r2)
            java.lang.String r1 = "跳过"
            r2.b0(r1, r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Y = r1
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299179(0x7f090b6b, float:1.8216352E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131296655(0x7f09018f, float:1.8211233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            r1 = 2131296630(0x7f090176, float:1.8211182E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.c0 = r1
            return
    }

    protected void onActivityResult(int r2, int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r1)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.umeng.socialize.UMAuthListener p0() {
            r1 = this;
            com.umeng.socialize.UMAuthListener r0 = r1.f1131k0
            return r0
    }

    public final void r0(@org.jetbrains.annotations.NotNull com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f1131k0 = r2
            return
    }
}
