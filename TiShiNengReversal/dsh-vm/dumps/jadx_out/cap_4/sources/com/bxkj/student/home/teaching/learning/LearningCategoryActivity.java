package com.bxkj.student.home.teaching.learning;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LearningCategoryActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView a0;
    private android.widget.TextView b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.LearningCategoryActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0089a implements android.view.View.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ com.bxkj.student.home.teaching.learning.LearningCategoryActivity.a b;

            ViewOnClickListenerC0089a(com.bxkj.student.home.teaching.learning.LearningCategoryActivity.a r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    android.content.Intent r3 = new android.content.Intent
                    r3.<init>()
                    com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a r0 = r2.b
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r2.a
                    int r0 = com.bxkj.student.home.teaching.learning.LearningCategoryActivity.a.m(r0, r1)
                    java.lang.String r1 = "index"
                    r3.putExtra(r1, r0)
                    com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a r0 = r2.b
                    com.bxkj.student.home.teaching.learning.LearningCategoryActivity r0 = r0.k
                    r1 = -1
                    r0.setResult(r1, r3)
                    com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a r3 = r2.b
                    com.bxkj.student.home.teaching.learning.LearningCategoryActivity r3 = r3.k
                    r3.finish()
                    return
            }
        }

        a(com.bxkj.student.home.teaching.learning.LearningCategoryActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ int m(com.bxkj.student.home.teaching.learning.LearningCategoryActivity.a r0, androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                int r0 = r0.e(r1)
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "typeName"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a$a r3 = new com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a$a
                r3.<init>(r1, r2)
                r0 = 2131296688(0x7f0901b0, float:1.82113E38)
                r2.w(r0, r3)
                return
        }
    }

    public LearningCategoryActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.LearningCategoryActivity r0) {
            r0.h0()
            return
    }

    private /* synthetic */ void h0() {
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
            r0 = 2131493641(0x7f0c0309, float:1.8610768E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "list"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L18
            android.content.Intent r0 = r4.getIntent()
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r4.Y = r0
        L18:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.a0
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
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.a0
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a r0 = new com.bxkj.student.home.teaching.learning.LearningCategoryActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493316(0x7f0c01c4, float:1.8610109E38)
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Y
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.a0
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.a0
            android.widget.TextView r1 = r4.b0
            r0.setEmptyView(r1)
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "全部频道"
            r2.setTitle(r0)
            r0 = 0
            r2.Y(r0)
            com.bxkj.student.home.teaching.learning.n r0 = new com.bxkj.student.home.teaching.learning.n
            r0.<init>(r2)
            r1 = 2131689673(0x7f0f00c9, float:1.9008368E38)
            r2.Z(r1, r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Z = r2
            r2 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.a0 = r2
            r2 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Z
            r0 = 0
            r2.X0(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Z
            r2.S0(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
