package com.bxkj.competition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MenuActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.MenuActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.competition.MenuActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0061a implements android.view.View.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ com.bxkj.competition.MenuActivity.a b;

            ViewOnClickListenerC0061a(com.bxkj.competition.MenuActivity.a r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    com.bxkj.competition.MenuActivity$a r3 = r2.b
                    com.bxkj.competition.MenuActivity r3 = r3.k
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r2.a
                    int r1 = com.bxkj.competition.R.id.bt_name
                    java.lang.String r0 = r0.g(r1)
                    com.bxkj.competition.MenuActivity.g0(r3, r0)
                    return
            }
        }

        a(com.bxkj.competition.MenuActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                int r0 = com.bxkj.competition.R.id.bt_name
                java.lang.String r1 = "name"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                r3.J(r0, r4)
                com.bxkj.competition.MenuActivity$a$a r4 = new com.bxkj.competition.MenuActivity$a$a
                r4.<init>(r2, r3)
                r3.w(r0, r4)
                return
        }
    }

    public MenuActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void g0(com.bxkj.competition.MenuActivity r0, java.lang.String r1) {
            r0.h0(r1)
            return
    }

    private void h0(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "竞赛报名"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L18
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.competition.signup.CompetitionDetailActivity> r1 = com.bxkj.competition.signup.CompetitionDetailActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            r2.startActivity(r3)
            return
        L18:
            java.lang.String r0 = "录入成绩"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L30
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.competition.score.CompetitionProjectListActivity> r1 = com.bxkj.competition.score.CompetitionProjectListActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            r2.startActivity(r3)
            return
        L30:
            java.lang.String r0 = "签到"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L47
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "com.bxkj.teacher"
            java.lang.String r1 = "com.bxkj.teacher.completion.signin.ProjectActivity"
            android.content.Intent r3 = r3.setClassName(r0, r1)
            r2.startActivity(r3)
        L47:
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.pub_recycleview
            return r0
    }

    public void R() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.Y = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "竞赛报名"
            java.lang.String r2 = "name"
            r0.put(r2, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.Y
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "录入成绩"
            r0.put(r2, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.Y
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "签到"
            r0.put(r2, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.Y
            r1.add(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r4.V
            r3 = 3
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.anim.zoom_in
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.competition.MenuActivity$a r0 = new com.bxkj.competition.MenuActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.layout.item_for_menu_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Y
            r0.<init>(r4, r1, r2, r3)
            r4.a0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "竞赛"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.rv
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
