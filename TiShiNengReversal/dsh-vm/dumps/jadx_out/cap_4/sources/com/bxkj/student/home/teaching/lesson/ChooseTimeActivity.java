package com.bxkj.student.home.teaching.lesson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChooseTimeActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.lang.String b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ChooseTimeActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0096a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.a b;

            ViewOnClickListenerC0096a(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r6) {
                    r5 = this;
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r6 = r5.b
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r6 = r6.k
                    java.lang.String r6 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.i0(r6)
                    boolean r6 = android.text.TextUtils.isEmpty(r6)
                    java.lang.String r0 = "id"
                    java.lang.String r1 = "timeId"
                    if (r6 == 0) goto L31
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r6 = r5.b
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r6 = r6.k
                    android.content.Intent r2 = new android.content.Intent
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r3 = r5.b
                    android.content.Context r3 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.a.m(r3)
                    java.lang.Class<com.bxkj.student.home.teaching.lesson.ChooseLessonActivity> r4 = com.bxkj.student.home.teaching.lesson.ChooseLessonActivity.class
                    r2.<init>(r3, r4)
                    java.util.Map r3 = r5.a
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                    android.content.Intent r0 = r2.putExtra(r1, r0)
                    r6.startActivity(r0)
                    return
                L31:
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r6 = r5.b
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r6 = r6.k
                    android.content.Intent r2 = new android.content.Intent
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r3 = r5.b
                    android.content.Context r3 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.a.n(r3)
                    java.lang.Class<com.bxkj.student.home.teaching.lesson.OnLineLessonActivity> r4 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.class
                    r2.<init>(r3, r4)
                    java.util.Map r3 = r5.a
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                    android.content.Intent r0 = r2.putExtra(r1, r0)
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r1 = r5.b
                    com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r1 = r1.k
                    java.lang.String r1 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.i0(r1)
                    java.lang.String r2 = "teachingId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r6.startActivity(r0)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a$a r0 = new com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a$a
                r0.<init>(r2, r4)
                r3.w(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ChooseTimeActivity a;

        b(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.j0(r0, r3)
                com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.g0(r3)
                com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public ChooseTimeActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Y = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String i0(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r0) {
            java.lang.String r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.lesson.ChooseTimeActivity r0, java.util.List r1) {
            r0.Y = r1
            return
    }

    private void k0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.b0
            rx.e r1 = r1.U0(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$b r1 = new com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493638(0x7f0c0306, float:1.8610762E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "teachingId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.b0 = r0
        L16:
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r4.V
            r3 = 3
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a r0 = new com.bxkj.student.home.teaching.lesson.ChooseTimeActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493236(0x7f0c0174, float:1.8609946E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Y
            r0.<init>(r4, r1, r2, r3)
            r4.a0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            r4.k0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "选择上课时间"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
