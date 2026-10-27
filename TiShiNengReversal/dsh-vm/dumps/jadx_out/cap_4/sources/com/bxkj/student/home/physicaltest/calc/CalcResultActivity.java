package com.bxkj.student.home.physicaltest.calc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CalcResultActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView Y;
    private android.widget.LinearLayout Z;
    private android.widget.LinearLayout a0;
    private android.widget.LinearLayout b0;
    private android.widget.LinearLayout c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f784k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f785p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.calc.CalcResultActivity k;

        a(com.bxkj.student.home.physicaltest.calc.CalcResultActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "result"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299181(0x7f090b6d, float:1.8216356E38)
                r3.J(r1, r0)
                java.lang.String r0 = "standard"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299092(0x7f090b14, float:1.8216176E38)
                r3.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299111(0x7f090b27, float:1.8216214E38)
                r3.J(r1, r0)
                java.lang.String r0 = "level"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131298957(0x7f090a8d, float:1.8215902E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.umeng.socialize.UMShareListener {
        final /* synthetic */ com.bxkj.student.home.physicaltest.calc.CalcResultActivity a;

        b(com.bxkj.student.home.physicaltest.calc.CalcResultActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.calc.CalcResultActivity r3 = r2.a
                android.content.Context r3 = com.bxkj.student.home.physicaltest.calc.CalcResultActivity.i0(r3)
                java.lang.String r0 = " 分享取消了"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                r1 = this;
                r3.getClass()
                com.bxkj.student.home.physicaltest.calc.CalcResultActivity r2 = r1.a
                android.content.Context r2 = com.bxkj.student.home.physicaltest.calc.CalcResultActivity.h0(r2)
                java.lang.String r3 = " 分享失败啦"
                r0 = 0
                android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                r2.show()
                return
        }

        public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.calc.CalcResultActivity r3 = r2.a
                android.content.Context r3 = com.bxkj.student.home.physicaltest.calc.CalcResultActivity.g0(r3)
                java.lang.String r0 = " 分享成功啦"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                r0 = this;
                return
        }
    }

    public CalcResultActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f784k0 = r0
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.student.home.physicaltest.calc.CalcResultActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.home.physicaltest.calc.CalcResultActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.home.physicaltest.calc.CalcResultActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private android.graphics.Bitmap k0(android.graphics.Bitmap r10, android.graphics.Bitmap r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getWidth()
            int r2 = r10.getHeight()
            int r3 = r11.getWidth()
            int r4 = r2 + r3
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r4, r5)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            r6 = 255(0xff, float:3.57E-43)
            r5.drawRGB(r6, r6, r6)
            r6 = 0
            r5.drawBitmap(r10, r6, r6, r0)
            int r10 = r1 - r3
            float r3 = (float) r10
            float r6 = (float) r2
            r5.drawBitmap(r11, r3, r6, r0)
            android.content.res.Resources r11 = r9.getResources()
            r3 = 2131689908(0x7f0f01b4, float:1.9008845E38)
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeResource(r11, r3)
            int r1 = r1 / 5
            int r1 = r1 * 2
            int r3 = r11.getWidth()
            int r3 = r3 / 2
            int r1 = r1 - r3
            float r1 = (float) r1
            int r3 = r11.getHeight()
            int r3 = r2 - r3
            float r3 = (float) r3
            r5.drawBitmap(r11, r1, r3, r0)
            android.graphics.Paint r11 = new android.graphics.Paint
            r0 = 1
            r11.<init>(r0)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r11.setColor(r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            android.content.Context r1 = r9.V
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r0, r1)
            float r0 = (float) r0
            r11.setTextSize(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1 = 7
            java.lang.String r3 = "扫描右侧二维码"
            r6 = 0
            r11.getTextBounds(r3, r6, r1, r0)
            int r10 = r10 / 2
            int r10 = r10 + 10
            int r1 = r0.width()
            int r1 = r1 / 2
            int r1 = r10 - r1
            float r1 = (float) r1
            int r2 = r2 + 175
            int r7 = r0.height()
            int r7 = r7 / 2
            int r7 = r2 - r7
            int r8 = r0.height()
            int r7 = r7 - r8
            float r7 = (float) r7
            r5.drawText(r3, r1, r7, r11)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3 = 9
            java.lang.String r7 = "下载体测成绩计算器"
            r11.getTextBounds(r7, r6, r3, r1)
            int r3 = r1.width()
            int r3 = r3 / 2
            int r10 = r10 - r3
            float r10 = (float) r10
            int r1 = r1.height()
            int r1 = r1 / 2
            int r2 = r2 - r1
            int r0 = r0.height()
            int r2 = r2 + r0
            int r2 = r2 + 10
            float r0 = (float) r2
            r5.drawText(r7, r10, r0, r11)
            r5.save()
            r5.restore()
            return r4
    }

    private void l0(com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.Y
            android.graphics.Bitmap r0 = r3.j0(r0)
            android.content.res.Resources r1 = r3.getResources()
            r2 = 2131690127(0x7f0f028f, float:1.9009289E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)
            android.graphics.Bitmap r0 = r3.k0(r0, r1)
            com.umeng.socialize.media.UMImage r1 = new com.umeng.socialize.media.UMImage
            android.content.Context r2 = r3.V
            r1.<init>(r2, r0)
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            r0.<init>(r3)
            com.umeng.socialize.ShareAction r4 = r0.setPlatform(r4)
            com.bxkj.student.home.physicaltest.calc.CalcResultActivity$b r0 = new com.bxkj.student.home.physicaltest.calc.CalcResultActivity$b
            r0.<init>(r3)
            com.umeng.socialize.ShareAction r4 = r4.setCallback(r0)
            com.umeng.socialize.ShareAction r4 = r4.withMedia(r1)
            r4.share()
            return
    }

    public void L() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.a0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.b0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.c0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492912(0x7f0c0030, float:1.860929E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "sm"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L22
            android.content.Intent r0 = r4.getIntent()
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            cn.bluemobi.dylan.base.utils.SeralizableMap r0 = (cn.bluemobi.dylan.base.utils.SeralizableMap) r0
            java.util.Map r0 = r0.getMap()
            java.lang.String r1 = "data"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1)
            r4.f784k0 = r0
        L22:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 5
            r0.<init>(r1)
            java.lang.String r1 = "name"
            java.lang.String r2 = "项目"
            r0.put(r1, r2)
            java.lang.String r1 = "result"
            java.lang.String r2 = "成绩"
            r0.put(r1, r2)
            java.lang.String r1 = "standard"
            java.lang.String r2 = "分数"
            r0.put(r1, r2)
            java.lang.String r1 = "score"
            java.lang.String r2 = "比例分"
            r0.put(r1, r2)
            java.lang.String r1 = "level"
            java.lang.String r2 = "等级"
            r0.put(r1, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.f784k0
            r2 = 0
            r1.add(r2, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.physicaltest.calc.CalcResultActivity$a r0 = new com.bxkj.student.home.physicaltest.calc.CalcResultActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493233(0x7f0c0171, float:1.860994E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f784k0
            r0.<init>(r4, r1, r2, r3)
            r4.f785p0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测成绩"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            r1 = 2131298085(0x7f090725, float:1.8214133E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Z = r1
            r1 = 2131298053(0x7f090705, float:1.8214068E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            r1 = 2131298063(0x7f09070f, float:1.8214089E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.b0 = r1
            r1 = 2131298066(0x7f090712, float:1.8214095E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.c0 = r1
            return
    }

    public android.graphics.Bitmap j0(android.view.View r4) {
            r3 = this;
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r4.measure(r1, r2)
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r4.layout(r0, r0, r1, r2)
            r4.buildDrawingCache()
            android.graphics.Bitmap r4 = r4.getDrawingCache()
            return r4
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r1.getId()
            switch(r1) {
                case 2131298053: goto L1a;
                case 2131298063: goto L14;
                case 2131298066: goto Le;
                case 2131298085: goto L8;
                default: goto L7;
            }
        L7:
            return
        L8:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r0.l0(r1)
            return
        Le:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r0.l0(r1)
            return
        L14:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r0.l0(r1)
            return
        L1a:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r0.l0(r1)
            return
    }
}
