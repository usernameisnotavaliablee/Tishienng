package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MyFragment$initUiData$1 extends com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
    final /* synthetic */ com.bxkj.student.v2.ui.main.MyFragment g;

    MyFragment$initUiData$1(com.bxkj.student.v2.ui.main.MyFragment r1, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r0 = this;
            r0.g = r1
            r0.<init>(r2)
            return
    }

    public static /* synthetic */ void q(com.bxkj.student.v2.ui.main.MyFragment r0, java.util.Map r1, android.view.View r2) {
            s(r0, r1, r2)
            return
    }

    private static final void s(com.bxkj.student.v2.ui.main.MyFragment r1, java.util.Map r2, android.view.View r3) {
            com.bxkj.student.v2.common.utils.k$a r3 = com.bxkj.student.v2.common.utils.k.a
            androidx.fragment.app.FragmentActivity r1 = r1.q()
            java.lang.String r0 = "5"
            r3.d(r1, r2, r0)
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
            r1 = 2131493711(0x7f0c034f, float:1.861091E38)
            return r1
    }

    public void r(androidx.databinding.ViewDataBinding r4, java.util.Map<java.lang.String, ? extends java.lang.Object> r5, int r6) {
            r3 = this;
            java.lang.String r0 = "itemBinding"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "bean"
            kotlin.jvm.internal.g0.p(r5, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "name"
            java.lang.String r1 = r0.t(r5, r1)
            java.lang.String r2 = "mkey"
            r0.t(r5, r2)
            int r6 = r3.getItemViewType(r6)
            if (r6 != 0) goto L25
            com.bxkj.student.databinding.V2ItemForClassifyTitleBinding r4 = (com.bxkj.student.databinding.V2ItemForClassifyTitleBinding) r4
            android.widget.TextView r4 = r4.tvName
            r4.setText(r1)
            return
        L25:
            com.bxkj.student.databinding.V2ItemForMyMenuBinding r4 = (com.bxkj.student.databinding.V2ItemForMyMenuBinding) r4
            r4.setMap(r5)
            android.view.View r4 = r4.getRoot()
            com.bxkj.student.v2.ui.main.MyFragment r6 = r3.g
            com.bxkj.student.v2.ui.main.m r0 = new com.bxkj.student.v2.ui.main.m
            r0.<init>(r6, r5)
            r4.setOnClickListener(r0)
            return
    }
}
