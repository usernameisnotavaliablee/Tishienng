package com.bxkj.competition.score.teacher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AddScoreMenuActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.score.teacher.AddScoreMenuActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.competition.score.teacher.AddScoreMenuActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0062a implements android.view.View.OnClickListener {
            final /* synthetic */ java.lang.String a;
            final /* synthetic */ int b;
            final /* synthetic */ com.bxkj.competition.score.teacher.AddScoreMenuActivity.a c;

            ViewOnClickListenerC0062a(com.bxkj.competition.score.teacher.AddScoreMenuActivity.a r1, java.lang.String r2, int r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.competition.score.teacher.AddScoreMenuActivity$a r4 = r3.c
                    com.bxkj.competition.score.teacher.AddScoreMenuActivity r4 = r4.k
                    android.content.Intent r0 = r4.getIntent()
                    com.bxkj.competition.score.teacher.AddScoreMenuActivity$a r1 = r3.c
                    android.content.Context r1 = com.bxkj.competition.score.teacher.AddScoreMenuActivity.a.m(r1)
                    java.lang.Class<com.bxkj.competition.score.teacher.TrackScoreListActivity> r2 = com.bxkj.competition.score.teacher.TrackScoreListActivity.class
                    android.content.Intent r0 = r0.setClass(r1, r2)
                    java.lang.String r1 = "menu"
                    java.lang.String r2 = r3.a
                    android.content.Intent r0 = r0.putExtra(r1, r2)
                    java.lang.String r1 = "type"
                    int r2 = r3.b
                    android.content.Intent r0 = r0.putExtra(r1, r2)
                    r4.startActivity(r0)
                    return
            }
        }

        a(com.bxkj.competition.score.teacher.AddScoreMenuActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.competition.score.teacher.AddScoreMenuActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r3 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.lang.String r1 = "type"
                int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r1)
                int r1 = com.bxkj.competition.R.id.bt_name
                r4.J(r1, r0)
                com.bxkj.competition.score.teacher.AddScoreMenuActivity$a$a r2 = new com.bxkj.competition.score.teacher.AddScoreMenuActivity$a$a
                r2.<init>(r3, r0, r5)
                r4.w(r1, r2)
                return
        }
    }

    public AddScoreMenuActivity() {
            r0 = this;
            r0.<init>()
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
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.Y = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            java.lang.String r3 = "起点"
            java.lang.String r4 = "name"
            r0.put(r4, r3)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.Y
            r3.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r0.put(r2, r1)
            java.lang.String r1 = "检查"
            r0.put(r4, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.Y
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r3)
            java.lang.String r5 = "名次"
            r0.put(r4, r5)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r6.Y
            r5.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r0.put(r2, r3)
            java.lang.String r2 = "时间"
            r0.put(r4, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.Y
            r2.add(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.Z
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r3 = r6.V
            r4 = 3
            r2.<init>(r3, r4)
            r0.setLayoutManager(r2)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r2 = r6.V
            int r3 = com.bxkj.competition.R.anim.zoom_in
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3)
            r0.<init>(r2)
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.competition.score.teacher.AddScoreMenuActivity$a r0 = new com.bxkj.competition.score.teacher.AddScoreMenuActivity$a
            android.content.Context r1 = r6.V
            int r2 = com.bxkj.competition.R.layout.item_for_menu_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.Y
            r0.<init>(r6, r1, r2, r3)
            r6.a0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.Z
            r1.setAdapter(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "选择要录入的内容"
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
