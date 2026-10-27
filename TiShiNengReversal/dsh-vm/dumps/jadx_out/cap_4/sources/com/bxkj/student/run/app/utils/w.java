package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w {
    private android.app.Activity a;
    private android.graphics.Bitmap b;
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.umeng.socialize.UMShareListener {
        final /* synthetic */ com.bxkj.student.run.app.utils.w a;

        a(com.bxkj.student.run.app.utils.w r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.run.app.utils.w r3 = r2.a
                android.app.Activity r3 = com.bxkj.student.run.app.utils.w.f(r3)
                java.lang.String r0 = " 分享取消了"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r3, java.lang.Throwable r4) {
                r2 = this;
                r4.getClass()
                com.bxkj.student.run.app.utils.w r3 = r2.a
                android.app.Activity r3 = com.bxkj.student.run.app.utils.w.f(r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = " 分享失败啦,"
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r0)
                r3.show()
                return
        }

        public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.run.app.utils.w r3 = r2.a
                android.app.Activity r3 = com.bxkj.student.run.app.utils.w.f(r3)
                java.lang.String r0 = " 分享成功啦"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                com.bxkj.student.run.app.utils.w r3 = r2.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.student.run.app.utils.w.e(r3)
                r3.dismiss()
                return
        }

        public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                r0 = this;
                return
        }
    }

    public w(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.run.app.utils.w r0, android.view.View r1) {
            r0.g(r1)
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.run.app.utils.w r0, android.view.View r1) {
            r0.h(r1)
            return
    }

    public static /* synthetic */ void c(com.bxkj.student.run.app.utils.w r0, android.view.View r1) {
            r0.j(r1)
            return
    }

    public static /* synthetic */ void d(com.bxkj.student.run.app.utils.w r0, android.view.View r1) {
            r0.i(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog e(com.bxkj.student.run.app.utils.w r0) {
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ android.app.Activity f(com.bxkj.student.run.app.utils.w r0) {
            android.app.Activity r0 = r0.a
            return r0
    }

    private /* synthetic */ void g(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r0.l(r1)
            return
    }

    private /* synthetic */ void h(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r0.l(r1)
            return
    }

    private /* synthetic */ void i(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r0.l(r1)
            return
    }

    private /* synthetic */ void j(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r0.l(r1)
            return
    }

    private void l(com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r3 = this;
            com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
            android.app.Activity r1 = r3.a
            android.graphics.Bitmap r2 = r3.b
            r0.<init>(r1, r2)
            com.umeng.socialize.ShareAction r1 = new com.umeng.socialize.ShareAction
            android.app.Activity r2 = r3.a
            r1.<init>(r2)
            com.umeng.socialize.ShareAction r4 = r1.setPlatform(r4)
            com.bxkj.student.run.app.utils.w$a r1 = new com.bxkj.student.run.app.utils.w$a
            r1.<init>(r3)
            com.umeng.socialize.ShareAction r4 = r4.setCallback(r1)
            com.umeng.socialize.ShareAction r4 = r4.withMedia(r0)
            r4.share()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r3.c
            r4.dismiss()
            return
    }

    public void k(android.graphics.Bitmap r5) {
            r4 = this;
            r4.b = r5
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.app.Activity r0 = r4.a
            r5.<init>(r0)
            r4.c = r5
            java.lang.String r0 = "分享到"
            r5.setTitle(r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.c
            r0 = 0
            r5.setTitleLineVisiBility(r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.c
            r0 = 2131493160(0x7f0c0128, float:1.8609792E38)
            r5.setCenterCustomView(r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.c
            r0 = 17
            r5.setMessageGrivity(r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.c
            java.lang.String r0 = "关闭"
            r5.setOneButtonText(r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.c
            r5.show()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.c
            r0 = 2131298085(0x7f090725, float:1.8214133E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r4.c
            r1 = 2131298053(0x7f090705, float:1.8214068E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r4.c
            r2 = 2131298063(0x7f09070f, float:1.8214089E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r4.c
            r3 = 2131298066(0x7f090712, float:1.8214095E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            com.bxkj.student.run.app.utils.s r3 = new com.bxkj.student.run.app.utils.s
            r3.<init>(r4)
            r5.setOnClickListener(r3)
            com.bxkj.student.run.app.utils.t r5 = new com.bxkj.student.run.app.utils.t
            r5.<init>(r4)
            r0.setOnClickListener(r5)
            com.bxkj.student.run.app.utils.u r5 = new com.bxkj.student.run.app.utils.u
            r5.<init>(r4)
            r1.setOnClickListener(r5)
            com.bxkj.student.run.app.utils.v r5 = new com.bxkj.student.run.app.utils.v
            r5.<init>(r4)
            r2.setOnClickListener(r5)
            return
    }
}
