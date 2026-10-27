package com.bxkj.student.home.teaching.evaluateteacher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EvaluateActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<androidx.fragment.app.Fragment> F0;
    private androidx.viewpager.widget.ViewPager Y;
    private android.widget.Button Z;
    private android.widget.Button a0;
    private android.widget.Button b0;
    private android.widget.RelativeLayout c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> f804k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f805p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.PopupWindow.OnDismissListener {
        final /* synthetic */ android.widget.FrameLayout a;
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity b;

        a(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1, android.widget.FrameLayout r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r3 = this;
                android.widget.FrameLayout r0 = r3.a
                if (r0 == 0) goto Ld
                android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
                r2 = 0
                r1.<init>(r2)
                r0.setForeground(r1)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity a;

        b(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r1 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.a
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.n0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity a;

        c(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r1 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.a
                r0.onBackPressed()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity a;

        d(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r1 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.a
                r0.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity e;

        e(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r3 = this;
                int r0 = r4.f()
                int r0 = r0 + 1
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1 = 2131298997(0x7f090ab5, float:1.8215983E38)
                r4.J(r1, r0)
                java.lang.String r0 = "checkScore"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L20
                r2 = 2131231636(0x7f080394, float:1.8079359E38)
                goto L23
            L20:
                r2 = 2131231119(0x7f08018f, float:1.807831E38)
            L23:
                r4.l(r1, r2)
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L3e
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r5 = r3.e
                android.content.res.Resources r5 = r5.getResources()
                r0 = 2131099731(0x7f060053, float:1.7811823E38)
            L39:
                int r5 = r5.getColor(r0)
                goto L48
            L3e:
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r5 = r3.e
                android.content.res.Resources r5 = r5.getResources()
                r0 = 2131099737(0x7f060059, float:1.7811836E38)
                goto L39
            L48:
                r4.K(r1, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity a;

        f(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.o0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r2.a
                android.widget.RelativeLayout r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.j0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.l0(r0, r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r3 = r2.a
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.m0(r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r3 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.g0(r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.h0(r0)
                r3.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends androidx.fragment.app.FragmentPagerAdapter {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity f;

        g(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        public int getCount() {
                r1 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.i0(r0)
                int r0 = r0.size()
                return r0
        }

        public androidx.fragment.app.Fragment getItem(int r2) {
                r1 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.i0(r0)
                java.lang.Object r2 = r0.get(r2)
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.h a;

            a(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.h r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h r1 = r0.a
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1 = r1.a
                    r1.finish()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.h a;

            b(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.h r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h r1 = r0.a
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1 = r1.a
                    r1.finish()
                    return
            }
        }

        h(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.q0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h$b r3 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h$b
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.p0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "评价成功"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h$a r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h$a
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                r2.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int a;
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity b;

        i(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void onPageScrolled(int r2, float r3, int r4) {
                r1 = this;
                int r3 = r1.a
                r0 = 1
                if (r3 != r0) goto L29
                if (r4 != 0) goto L29
                if (r2 != 0) goto L11
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r2 = r1.b
                java.lang.String r3 = "已经是第一条了"
                r2.f0(r3)
                return
            L11:
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r3 = r1.b
                androidx.viewpager.widget.ViewPager r3 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.k0(r3)
                androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
                int r3 = r3.getCount()
                int r3 = r3 - r0
                if (r2 != r3) goto L29
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r2 = r1.b
                java.lang.String r3 = "已经是最后一条了"
                r2.f0(r3)
            L29:
                return
        }

        public void onPageSelected(int r3) {
                r2 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = r2.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r3 = r3 + 1
                r1.append(r3)
                java.lang.String r3 = "/"
                r1.append(r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r3 = r2.b
                androidx.viewpager.widget.ViewPager r3 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.k0(r3)
                androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
                int r3 = r3.getCount()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.setTitle(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements android.widget.AdapterView.OnItemClickListener {
        final /* synthetic */ android.widget.PopupWindow a;
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity b;

        j(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1, android.widget.PopupWindow r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r1 = r0.b
                androidx.viewpager.widget.ViewPager r1 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity.k0(r1)
                r1.setCurrentItem(r3)
                android.widget.PopupWindow r1 = r0.a
                r1.dismiss()
                return
        }
    }

    public EvaluateActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f805p0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a g0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f804k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f805p0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            java.util.List<androidx.fragment.app.Fragment> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RelativeLayout j0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            android.widget.RelativeLayout r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.viewpager.widget.ViewPager k0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            androidx.viewpager.widget.ViewPager r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0, java.util.List r1) {
            r0.f805p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            r0.v0()
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            r0.x0()
            return
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void r0() {
            r2 = this;
            androidx.viewpager.widget.ViewPager r0 = r2.Y
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$i r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$i
            r1.<init>(r2)
            r0.addOnPageChangeListener(r1)
            return
    }

    private void s0() {
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "stuTeacherCurriculumId"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L10:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r7.f805p0
            int r3 = r3.size()
            if (r2 >= r3) goto L63
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r7.f805p0
            java.lang.Object r3 = r3.get(r2)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "checkScore"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "您第"
            r0.append(r1)
            int r2 = r2 + 1
            r0.append(r2)
            java.lang.String r1 = "条还未评价"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f0(r0)
            return
        L48:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.lang.String r6 = "id"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r6)
            java.lang.String r6 = "contentId"
            r5.put(r6, r3)
            java.lang.String r3 = "score"
            r5.put(r3, r4)
            r1.add(r5)
            int r2 = r2 + 1
            goto L10
        L63:
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            android.content.Context r2 = r7.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideOtherStatusMessage()
            java.lang.Class<d0.a> r3 = d0.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            d0.a r3 = (d0.a) r3
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getUserId()
            rx.e r0 = r3.N(r0, r4, r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r2.setObservable(r0)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$h
            r1.<init>(r7)
            r0.setDataListener(r1)
            return
    }

    private void t0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.X0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$f r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$f
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void v0() {
            r4 = this;
            r0 = 0
        L1:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.f805p0
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "index"
            r2.putInt(r3, r0)
            r1.setArguments(r2)
            java.util.List<androidx.fragment.app.Fragment> r2 = r4.F0
            r2.add(r1)
            int r0 = r0 + 1
            goto L1
        L23:
            androidx.viewpager.widget.ViewPager r0 = r4.Y
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$g r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$g
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()
            r1.<init>(r4, r2)
            r0.setAdapter(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "1/"
            r0.append(r1)
            androidx.viewpager.widget.ViewPager r1 = r4.Y
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setTitle(r0)
            return
    }

    private void w0() {
            r2 = this;
            androidx.viewpager.widget.ViewPager r0 = r2.Y
            int r0 = r0.getCurrentItem()
            androidx.viewpager.widget.ViewPager r1 = r2.Y
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L1a
            java.lang.String r0 = "已经是最后一条了"
            r2.f0(r0)
            return
        L1a:
            androidx.viewpager.widget.ViewPager r0 = r2.Y
            int r1 = r0.getCurrentItem()
            int r1 = r1 + 1
            r0.setCurrentItem(r1)
            return
    }

    private void x0() {
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.content.Context r1 = r4.V
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131493630(0x7f0c02fe, float:1.8610746E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r2 = 2131297028(0x7f090304, float:1.821199E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.GridView r2 = (android.widget.GridView) r2
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f804k0
            r2.setAdapter(r3)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$j r3 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$j
            r3.<init>(r4, r0)
            r2.setOnItemClickListener(r3)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>()
            r0.setBackgroundDrawable(r2)
            r2 = 1
            r0.setOutsideTouchable(r2)
            r0.setFocusable(r2)
            r2 = 2131299265(0x7f090bc1, float:1.8216527E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$a r3 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$a
            r3.<init>(r4, r2)
            r0.setOnDismissListener(r3)
            r0.setContentView(r1)
            r1 = 2131298702(0x7f09098e, float:1.8215385E38)
            android.view.View r1 = r4.findViewById(r1)
            r0.showAsDropDown(r1)
            if (r2 == 0) goto L68
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            java.lang.String r1 = "#7F4c4c4c"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.<init>(r1)
            r2.setForeground(r0)
        L68:
            return
    }

    private void y0() {
            r2 = this;
            androidx.viewpager.widget.ViewPager r0 = r2.Y
            int r0 = r0.getCurrentItem()
            if (r0 != 0) goto Le
            java.lang.String r0 = "已经是第一条了"
            r2.f0(r0)
            return
        Le:
            androidx.viewpager.widget.ViewPager r0 = r2.Y
            int r1 = r0.getCurrentItem()
            int r1 = r1 + (-1)
            r0.setCurrentItem(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.a0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.b0
            r0.setOnClickListener(r1)
            r1.r0()
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492930(0x7f0c0042, float:1.8609326E38)
            return r0
    }

    public void R() {
            r4 = this;
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$e r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$e
            android.content.Context r1 = r4.V
            r2 = 2131493290(0x7f0c01aa, float:1.8610056E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f805p0
            r0.<init>(r4, r1, r2, r3)
            r4.f804k0 = r0
            r4.t0()
            return
    }

    public void S() {
            r2 = this;
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$b r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$b
            r0.<init>(r2)
            r1 = 2131689921(0x7f0f01c1, float:1.9008871E38)
            r2.Z(r1, r0)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$c r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$c
            r0.<init>(r2)
            r2.X(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131299286(0x7f090bd6, float:1.821657E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.viewpager.widget.ViewPager r2 = (androidx.viewpager.widget.ViewPager) r2
            r1.Y = r2
            r2 = 2131296628(0x7f090174, float:1.8211178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.Z = r2
            r2 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.a0 = r2
            r2 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.b0 = r2
            r2 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.c0 = r2
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onBackPressed() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "正在评价，是否放弃评价？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$d r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity$d
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r1.getId()
            switch(r1) {
                case 2131296622: goto L10;
                case 2131296623: goto Lc;
                case 2131296628: goto L8;
                default: goto L7;
            }
        L7:
            return
        L8:
            r0.y0()
            return
        Lc:
            r0.s0()
            return
        L10:
            r0.w0()
            return
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> u0() {
            r1 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.f805p0
            return r0
    }
}
