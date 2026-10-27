package com.bxkj.student.home.teaching.learning.ready;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SelectLessonActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private androidx.recyclerview.widget.RecyclerView c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f963k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f964p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity k;

        a(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                android.view.View r1 = r6.h(r0)
                android.widget.TextView r1 = (android.widget.TextView) r1
                android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
                r3 = -1
                r4 = -2
                r2.<init>(r3, r4)
                r1.setLayoutParams(r2)
                java.lang.String r1 = "typeName"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
                r6.J(r0, r7)
                int r7 = r6.f()
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r5.k
                int r0 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.j0(r0)
                if (r7 != r0) goto L36
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r7 = r5.k
                android.content.res.Resources r7 = r7.getResources()
                r0 = 2131231950(0x7f0804ce, float:1.8079995E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r0)
                goto L37
            L36:
                r7 = 0
            L37:
                r0 = 2131297091(0x7f090343, float:1.8212117E38)
                r6.q(r0, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity k;

        b(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.b r0, java.util.Map r1, android.view.View r2) {
                r0.o(r1, r2)
                return
        }

        private /* synthetic */ void o(java.util.Map r2, android.view.View r3) {
                r1 = this;
                java.lang.String r3 = "id"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                java.lang.String r0 = "typeName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r1.k
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.s0(r0, r3, r2)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "typeName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.learning.ready.c r0 = new com.bxkj.student.home.teaching.learning.ready.c
                r0.<init>(r2, r4)
                r4 = 2131296688(0x7f0901b0, float:1.82113E38)
                r3.w(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity a;

        c(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.q0(r0, r3)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.m0(r3)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.l0(r0)
                r3.g(r0)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.l0(r3)
                if (r3 == 0) goto L6f
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.l0(r3)
                int r3 = r3.size()
                if (r3 <= 0) goto L6f
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.l0(r3)
                r0 = 0
                java.lang.Object r3 = r3.get(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r1 = "isCurriculum"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                if (r1 != 0) goto L51
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                java.lang.String r1 = "id"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.r0(r0, r3)
                return
            L51:
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                androidx.recyclerview.widget.RecyclerView r3 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.n0(r3)
                r1 = 8
                r3.setVisibility(r1)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r1 = -1
                r3.<init>(r0, r1)
                r0 = 1084227584(0x40a00000, float:5.0)
                r3.weight = r0
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.o0(r0)
                r0.setLayoutParams(r3)
            L6f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity a;

        d(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.p0(r0, r3)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.i0(r3)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.k0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity a;

        e(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.t0(r0)
                java.lang.Class<com.bxkj.student.home.teaching.learning.LearnHomeListActivity> r1 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.class
                r3.<init>(r0, r1)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0 = r2.a
                r0.startActivity(r3)
                com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r3 = r2.a
                r3.finish()
                return
        }
    }

    public SelectLessonActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.F0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0, java.lang.String r1) {
            r0.y0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.x0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter i0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f963k0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List k0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter m0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView n0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView o0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0, java.util.List r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0, java.util.List r1) {
            r0.Y = r1
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0, java.lang.String r1) {
            r0.w0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void s0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0, java.lang.String r1, java.lang.String r2) {
            r0.z0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void u0() {
            r1 = this;
            r0 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.c0 = r0
            r0 = 2131298429(0x7f09087d, float:1.821483E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.Z = r0
            r0 = 2131299006(0x7f090abe, float:1.8216001E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f964p0 = r0
            return
    }

    private void v0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r1 = r1.n()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$c r1 = new com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void w0(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r3 = r1.e(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r0.setObservable(r3)
            com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$d r0 = new com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$d
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
    }

    private /* synthetic */ void x0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.F0 = r4
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.a0
            r1.notifyDataSetChanged()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.b0
            r1.clear()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.f963k0
            r1.notifyDataSetChanged()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.a0
            java.lang.Object r1 = r1.getItem(r4)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            java.lang.String r3 = "typeName"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            java.lang.String r4 = "isCurriculum"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r4)
            if (r1 != 0) goto L31
            r0.w0(r2)
            return
        L31:
            r0.z0(r2, r3)
            return
    }

    private /* synthetic */ void y0(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r3 = r1.u(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r0.setObservable(r3)
            com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$e r0 = new com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$e
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
    }

    private void z0(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "确定您要选择"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "吗?"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5 = r0.setMessage(r5)
            com.bxkj.student.home.teaching.learning.ready.b r0 = new com.bxkj.student.home.teaching.learning.ready.b
            r0.<init>(r3, r4)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r5.setRightButtonOnClickListener(r0)
            r4.show()
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.a0
            com.bxkj.student.home.teaching.learning.ready.a r1 = new com.bxkj.student.home.teaching.learning.ready.a
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493027(0x7f0c00a3, float:1.8609523E38)
            return r0
    }

    public void R() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.Y = r0
            androidx.recyclerview.widget.RecyclerView r0 = r6.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r6.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r6, r1)
            r0.<init>(r2)
            r2 = 0
            r0.setOrder(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r6.Z
            r3.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.Z
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r3 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r4 = r6.V
            r5 = 1
            r3.<init>(r4, r5)
            r0.addItemDecoration(r3)
            com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$a r0 = new com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$a
            android.content.Context r3 = r6.V
            r4 = 2131493320(0x7f0c01c8, float:1.8610117E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r6.Y
            r0.<init>(r6, r3, r4, r5)
            r6.a0 = r0
            androidx.recyclerview.widget.RecyclerView r3 = r6.Z
            r3.setAdapter(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.b0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r6.c0
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r6.V
            r3.<init>(r4)
            r0.setLayoutManager(r3)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r3 = r6.V
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r3, r1)
            r0.<init>(r1)
            r0.setOrder(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r6.c0
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$b r0 = new com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity$b
            android.content.Context r1 = r6.V
            r2 = 2131493316(0x7f0c01c4, float:1.8610109E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.b0
            r0.<init>(r6, r1, r2, r3)
            r6.f963k0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.c0
            r1.setAdapter(r0)
            r6.v0()
            return
    }

    public void S() {
            r1 = this;
            r0 = 0
            r1.Y(r0)
            java.lang.String r0 = "选择课程"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r0.u0()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }
}
