package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ClassifyFragment$initUiData$1 extends com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
    final /* synthetic */ com.bxkj.student.v2.ui.main.ClassifyFragment g;

    ClassifyFragment$initUiData$1(com.bxkj.student.v2.ui.main.ClassifyFragment r1, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r0 = this;
            r0.g = r1
            r0.<init>(r2)
            return
    }

    public static /* synthetic */ void q(java.util.Map r0, com.bxkj.student.v2.ui.main.ClassifyFragment r1, android.view.View r2) {
            s(r0, r1, r2)
            return
    }

    private static final void s(java.util.Map r1, com.bxkj.student.v2.ui.main.ClassifyFragment r2, android.view.View r3) {
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r0 = "type"
            java.lang.String r3 = r3.t(r1, r0)
            java.lang.String r0 = "0"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L11
            return
        L11:
            com.bxkj.student.v2.common.utils.k$a r3 = com.bxkj.student.v2.common.utils.k.a
            androidx.fragment.app.FragmentActivity r2 = r2.q()
            java.lang.String r0 = "2"
            r3.d(r2, r1, r0)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseMultiItemAdapter
    public /* bridge */ /* synthetic */ void g(androidx.databinding.ViewDataBinding r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2, int r3) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            r0.r(r1, r2, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseMultiItemAdapter
    public int getItemViewType(int r4) {
            r3 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.Object r4 = r3.i(r4)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r1 = "type"
            r2 = -1
            int r4 = r0.l(r4, r1, r2)
            return r4
    }

    @Override // com.bxkj.base.v2.base.BaseMultiItemAdapter
    public int j(int r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r1 = 2131493709(0x7f0c034d, float:1.8610906E38)
            return r1
        L6:
            r1 = 2131493708(0x7f0c034c, float:1.8610904E38)
            return r1
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.g0.p(r2, r0)
            super.onAttachedToRecyclerView(r2)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r0 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L1a
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            com.bxkj.student.v2.ui.main.ClassifyFragment$initUiData$1$onAttachedToRecyclerView$1 r0 = new com.bxkj.student.v2.ui.main.ClassifyFragment$initUiData$1$onAttachedToRecyclerView$1
            r0.<init>(r1)
            r2.setSpanSizeLookup(r0)
        L1a:
            return
    }

    public void r(androidx.databinding.ViewDataBinding r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6, int r7) {
            r4 = this;
            java.lang.String r0 = "itemBinding"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "bean"
            kotlin.jvm.internal.g0.p(r6, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "name"
            java.lang.String r0 = r0.t(r6, r1)
            android.view.View r1 = r5.getRoot()
            com.bxkj.student.v2.ui.main.ClassifyFragment r2 = r4.g
            com.bxkj.student.v2.ui.main.c r3 = new com.bxkj.student.v2.ui.main.c
            r3.<init>(r6, r2)
            r1.setOnClickListener(r3)
            int r7 = r4.getItemViewType(r7)
            if (r7 != 0) goto L2e
            com.bxkj.student.databinding.V2ItemForClassifyTitleBinding r5 = (com.bxkj.student.databinding.V2ItemForClassifyTitleBinding) r5
            android.widget.TextView r5 = r5.tvName
            r5.setText(r0)
            return
        L2e:
            com.bxkj.student.databinding.V2ItemForClassifyMenuBinding r5 = (com.bxkj.student.databinding.V2ItemForClassifyMenuBinding) r5
            r5.setMap(r6)
            return
    }
}
