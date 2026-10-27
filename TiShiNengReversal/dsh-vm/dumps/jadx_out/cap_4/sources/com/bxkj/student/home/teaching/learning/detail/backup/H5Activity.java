package com.bxkj.student.home.teaching.learning.detail.backup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class H5Activity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String Y;
    private java.lang.String Z;
    private cn.bluemobi.dylan.smartwebview.SmartWebView a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.H5Activity a;

        a(com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r0 = r4.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                java.lang.String r0 = "content"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getToken()
                java.lang.String r3 = "token"
                r1.put(r3, r2)
                java.lang.String r2 = "Android"
                java.lang.String r3 = "channel"
                r1.put(r3, r2)
                com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r2 = r4.a
                int r2 = com.bxkj.student.home.teaching.learning.detail.backup.H5Activity.i0(r2)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r3 = "version"
                r1.put(r3, r2)
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                int r2 = r2.getUserType()
                r3 = 2
                if (r2 != r3) goto L46
                java.lang.String r2 = "1"
                goto L48
            L46:
                java.lang.String r2 = "0"
            L48:
                java.lang.String r3 = "type"
                r1.put(r3, r2)
                com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r2 = r4.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r2 = com.bxkj.student.home.teaching.learning.detail.backup.H5Activity.g0(r2)
                android.webkit.WebView r2 = r2.getWebView()
                r2.loadUrl(r0, r1)
                com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r1 = r4.a
                com.bxkj.student.home.teaching.learning.detail.backup.H5Activity.h0(r1, r5, r0)
                return
        }
    }

    public H5Activity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView g0(com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r0, java.util.Map r1, java.lang.String r2) {
            r0.k0(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r0) {
            int r0 = r0.m0()
            return r0
    }

    private void j0(java.lang.String r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, com.umeng.socialize.media.BaseMediaObject r16) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1 = new com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r5.Z
            r2.putString(r3, r4)
            java.lang.String r3 = "detailId"
            r2.putString(r3, r6)
            java.lang.String r6 = "isLike"
            r2.putInt(r6, r7)
            java.lang.String r6 = "isCollection"
            r2.putInt(r6, r8)
            java.lang.String r6 = "duration"
            r2.putInt(r6, r9)
            java.lang.String r6 = "popTime"
            r2.putInt(r6, r10)
            java.lang.String r6 = "hasQuestion"
            r2.putInt(r6, r11)
            java.lang.String r6 = "isComplete"
            r2.putInt(r6, r12)
            java.lang.String r6 = "isOk"
            r2.putInt(r6, r13)
            java.lang.String r6 = "opreateFlag"
            r2.putInt(r6, r14)
            java.lang.String r6 = "valType"
            r2.putInt(r6, r15)
            r1.setArguments(r2)
            r6 = r16
            r1.s0(r6)
            r6 = 2131296988(0x7f0902dc, float:1.8211908E38)
            r0.add(r6, r1)
            r0.commit()
            return
    }

    private void k0(java.util.Map<java.lang.String, java.lang.Object> r13, java.lang.String r14) {
            r12 = this;
            com.umeng.socialize.media.UMWeb r11 = new com.umeng.socialize.media.UMWeb
            r11.<init>(r14)
            java.lang.String r14 = r12.Y
            r11.setTitle(r14)
            java.lang.String r14 = "indexImg"
            java.lang.String r14 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r14)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L18
            java.lang.String r14 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
        L18:
            com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
            android.content.Context r1 = r12.V
            r0.<init>(r1, r14)
            r11.setThumb(r0)
            java.lang.String r14 = "synopsis"
            java.lang.String r14 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r14)
            r11.setDescription(r14)
            java.lang.String r14 = "detailId"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r13, r14)
            java.lang.String r14 = "isLike"
            int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "isCollection"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "duration"
            int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "popTime"
            int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "hasQuestion"
            int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "isComplete"
            int r7 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "isOk"
            int r8 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "opreateFlag"
            int r9 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            java.lang.String r14 = "valType"
            int r10 = cn.bluemobi.dylan.http.JsonParse.getInt(r13, r14)
            r0 = r12
            r0.j0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    private int m0() {
            r3 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Exception -> Lf
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> Lf
            int r0 = r1.versionCode     // Catch: java.lang.Exception -> Lf
        Lf:
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492960(0x7f0c0060, float:1.8609387E38)
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
            r2.Z = r0
        L1f:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L35
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.Y = r0
        L35:
            r2.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "在线学习"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.a0 = r1
            return
    }

    public void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.Z
            rx.e r1 = r1.k(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.H5Activity$a r1 = new com.bxkj.student.home.teaching.learning.detail.backup.H5Activity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            return
    }
}
