package com.bxkj.student.home.teaching.learning.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LearnDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private boolean F0;
    private android.widget.FrameLayout Y;
    private android.widget.FrameLayout Z;
    private android.widget.FrameLayout a0;
    private java.lang.String b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.BottomFragment f885k0;

    /* renamed from: p0, reason: collision with root package name */
    private androidx.fragment.app.Fragment f886p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity a;

        a(com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0 = r2.a
                com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity.k0(r0, r3)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
                r0 = this;
                super.netOnSuccess(r1, r2)
                return
        }
    }

    public LearnDetailActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.F0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0, java.util.Map r1) {
            r0.q0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0) {
            r0.t0()
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0) {
            r0.s0()
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0) {
            r0.r0()
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0, java.util.Map r1) {
            r0.n0(r1)
            return
    }

    private void l0(java.util.Map<java.lang.String, java.lang.Object> r15) {
            r14 = this;
            java.lang.String r0 = "content"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r15, r0)
            com.umeng.socialize.media.UMWeb r13 = new com.umeng.socialize.media.UMWeb
            r13.<init>(r0)
            java.lang.String r0 = r14.b0
            r13.setTitle(r0)
            java.lang.String r0 = "indexImg"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r15, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1e
            java.lang.String r0 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
        L1e:
            com.umeng.socialize.media.UMImage r1 = new com.umeng.socialize.media.UMImage
            android.content.Context r2 = r14.V
            r1.<init>(r2, r0)
            r13.setThumb(r1)
            java.lang.String r0 = "synopsis"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r15, r0)
            r13.setDescription(r0)
            java.lang.String r0 = "detailId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r15, r0)
            java.lang.String r0 = "isLike"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "isCollection"
            int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "duration"
            int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "popTime"
            int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "hasQuestion"
            int r7 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "isComplete"
            int r8 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "isOk"
            int r9 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "opreateFlag"
            int r10 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "valType"
            int r11 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            java.lang.String r0 = "integral"
            int r12 = cn.bluemobi.dylan.http.JsonParse.getInt(r15, r0)
            r1 = r14
            r1.m0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    private void m0(java.lang.String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, com.umeng.socialize.media.BaseMediaObject r16) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r1 = new com.bxkj.student.home.teaching.learning.detail.BottomFragment
            r1.<init>()
            r4.f885k0 = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "id"
            java.lang.String r3 = r4.c0
            r1.putString(r2, r3)
            java.lang.String r2 = "detailId"
            r1.putString(r2, r5)
            java.lang.String r5 = "isLike"
            r1.putInt(r5, r6)
            java.lang.String r5 = "isCollection"
            r1.putInt(r5, r7)
            java.lang.String r5 = "duration"
            r1.putInt(r5, r8)
            java.lang.String r5 = "popTime"
            r1.putInt(r5, r9)
            java.lang.String r5 = "hasQuestion"
            r1.putInt(r5, r10)
            java.lang.String r5 = "isComplete"
            r1.putInt(r5, r11)
            java.lang.String r5 = "isOk"
            r1.putInt(r5, r12)
            java.lang.String r5 = "opreateFlag"
            r1.putInt(r5, r13)
            java.lang.String r5 = "valType"
            r1.putInt(r5, r14)
            java.lang.String r5 = "integral"
            r1.putInt(r5, r15)
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r5 = r4.f885k0
            r5.setArguments(r1)
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r5 = r4.f885k0
            r6 = r16
            r5.v0(r6)
            r5 = 2131296988(0x7f0902dc, float:1.8211908E38)
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r6 = r4.f885k0
            r0.add(r5, r6)
            r0.commitAllowingStateLoss()
            return
    }

    private void n0(java.util.Map<java.lang.String, java.lang.Object> r10) {
            r9 = this;
            r9.o0(r10)
            java.lang.String r0 = "type"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r0)
            androidx.fragment.app.FragmentManager r1 = r9.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r9.c0
            r2.putString(r3, r4)
            r3 = 1
            java.lang.String r4 = "url"
            java.lang.String r5 = "content"
            if (r0 != r3) goto L33
            com.bxkj.student.home.teaching.learning.detail.type.H5Fragment r0 = new com.bxkj.student.home.teaching.learning.detail.type.H5Fragment
            r0.<init>()
            r9.f886p0 = r0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r5)
            r2.putString(r4, r0)
            goto L8e
        L33:
            r3 = 2
            java.lang.String r6 = "title"
            java.lang.String r7 = "videoPath"
            java.lang.String r8 = "pv"
            if (r0 != r3) goto L57
            com.bxkj.student.home.teaching.learning.detail.type.VideoPlayFragment r0 = new com.bxkj.student.home.teaching.learning.detail.type.VideoPlayFragment
            r0.<init>()
            r9.f886p0 = r0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r5)
            r2.putString(r7, r0)
            java.lang.String r0 = r9.b0
            r2.putString(r6, r0)
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r8)
            r2.putString(r8, r0)
            goto L8e
        L57:
            r3 = 3
            if (r0 != r3) goto L69
            com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0 = new com.bxkj.student.home.teaching.learning.detail.type.PdfFragment
            r0.<init>()
            r9.f886p0 = r0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r5)
            r2.putString(r4, r0)
            goto L8e
        L69:
            r3 = 4
            if (r0 != r3) goto L87
            com.bxkj.student.home.teaching.learning.detail.type.MusicPlayFragment r0 = new com.bxkj.student.home.teaching.learning.detail.type.MusicPlayFragment
            r0.<init>()
            r9.f886p0 = r0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r5)
            r2.putString(r7, r0)
            java.lang.String r0 = r9.b0
            r2.putString(r6, r0)
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r8)
            r2.putString(r8, r0)
            goto L8e
        L87:
            com.bxkj.student.home.teaching.learning.detail.type.H5Fragment r0 = new com.bxkj.student.home.teaching.learning.detail.type.H5Fragment
            r0.<init>()
            r9.f886p0 = r0
        L8e:
            androidx.fragment.app.Fragment r0 = r9.f886p0
            r0.setArguments(r2)
            r0 = 2131296991(0x7f0902df, float:1.8211914E38)
            androidx.fragment.app.Fragment r2 = r9.f886p0
            r1.add(r0, r2)
            r1.commitAllowingStateLoss()
            androidx.fragment.app.Fragment r0 = r9.f886p0
            boolean r1 = r0 instanceof com.bxkj.student.home.teaching.learning.detail.type.PdfFragment
            if (r1 == 0) goto Laf
            com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0 = (com.bxkj.student.home.teaching.learning.detail.type.PdfFragment) r0
            com.bxkj.student.home.teaching.learning.detail.w r1 = new com.bxkj.student.home.teaching.learning.detail.w
            r1.<init>(r9, r10)
            r0.a0(r1)
            return
        Laf:
            r9.l0(r10)
            return
    }

    private void o0(java.util.Map<java.lang.String, java.lang.Object> r6) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            com.bxkj.student.home.teaching.learning.detail.TopTipsFragment r1 = new com.bxkj.student.home.teaching.learning.detail.TopTipsFragment
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "duration"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
            r2.putString(r3, r4)
            java.lang.String r3 = "integral"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
            r2.putString(r3, r6)
            r1.setArguments(r2)
            r6 = 2131296995(0x7f0902e3, float:1.8211922E38)
            r0.add(r6, r1)
            r0.commitAllowingStateLoss()
            return
    }

    private /* synthetic */ void q0(java.util.Map r1) {
            r0 = this;
            r0.l0(r1)
            return
    }

    private /* synthetic */ void r0() {
            r0 = this;
            r0.onBackPressed()
            return
    }

    private /* synthetic */ void s0() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r0 = r2.f885k0
            if (r0 == 0) goto L8
            r1 = 0
            r0.u0(r1)
        L8:
            return
    }

    private /* synthetic */ void t0() {
            r0 = this;
            r0.finish()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492959(0x7f0c005f, float:1.8609385E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.c0 = r0
        L1f:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L35
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.b0 = r0
        L35:
            r2.p0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "在线学习详情"
            r1.setTitle(r0)
            com.bxkj.student.home.teaching.learning.detail.z r0 = new com.bxkj.student.home.teaching.learning.detail.z
            r0.<init>(r1)
            r1.X(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296995(0x7f0902e3, float:1.8211922E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.Y = r1
            r1 = 2131296991(0x7f0902df, float:1.8211914E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.Z = r1
            r1 = 2131296988(0x7f0902dc, float:1.8211908E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.a0 = r1
            return
    }

    public void onBackPressed() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L1b
            androidx.fragment.app.Fragment r0 = r2.f886p0
            if (r0 == 0) goto L1b
            boolean r1 = r0 instanceof com.bxkj.student.home.teaching.learning.detail.type.VideoPlayFragment
            if (r1 == 0) goto L1b
            com.bxkj.student.home.teaching.learning.detail.type.VideoPlayFragment r0 = (com.bxkj.student.home.teaching.learning.detail.type.VideoPlayFragment) r0
            r0.N()
            return
        L1b:
            boolean r0 = r2.F0
            if (r0 == 0) goto L56
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r0 = r2.f885k0
            if (r0 == 0) goto L27
            r1 = 1
            r0.u0(r1)
        L27:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "正在学习,如果离开将不积分,确定离开？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            java.lang.String r1 = "继续学习"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "确定离开"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            com.bxkj.student.home.teaching.learning.detail.x r1 = new com.bxkj.student.home.teaching.learning.detail.x
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonOnClickListener(r1)
            com.bxkj.student.home.teaching.learning.detail.y r1 = new com.bxkj.student.home.teaching.learning.detail.y
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
        L56:
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void p0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.c0
            rx.e r1 = r1.k(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity$a r1 = new com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void u0(boolean r1) {
            r0 = this;
            r0.F0 = r1
            return
    }
}
