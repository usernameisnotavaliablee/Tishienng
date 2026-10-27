package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class HomeFragment$initUiData$1 extends com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, ? extends java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> {
    final /* synthetic */ com.bxkj.student.v2.ui.main.HomeFragment f;

    HomeFragment$initUiData$1(com.bxkj.student.v2.ui.main.HomeFragment r1, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r0 = this;
            r0.f = r1
            r0.<init>(r2)
            return
    }

    public static /* synthetic */ void m(com.bxkj.student.v2.ui.main.HomeFragment r0, java.util.Map r1, android.view.View r2) {
            o(r0, r1, r2)
            return
    }

    private static final void o(com.bxkj.student.v2.ui.main.HomeFragment r1, java.util.Map r2, android.view.View r3) {
            com.bxkj.student.v2.common.utils.k$a r3 = com.bxkj.student.v2.common.utils.k.a
            androidx.fragment.app.FragmentActivity r1 = r1.q()
            java.lang.String r0 = "1"
            r3.d(r1, r2, r0)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseAdapter
    public /* bridge */ /* synthetic */ void f(com.bxkj.student.databinding.V2ItemForHomeMenuBinding r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2, int r3) {
            r0 = this;
            com.bxkj.student.databinding.V2ItemForHomeMenuBinding r1 = (com.bxkj.student.databinding.V2ItemForHomeMenuBinding) r1
            java.util.Map r2 = (java.util.Map) r2
            r0.n(r1, r2, r3)
            return
    }

    public void n(com.bxkj.student.databinding.V2ItemForHomeMenuBinding r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3, int r4) {
            r1 = this;
            java.lang.String r4 = "itemBinding"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "bean"
            kotlin.jvm.internal.g0.p(r3, r4)
            r2.setMap(r3)
            com.bxkj.base.v2.data.b$a r4 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r4 = r4.a()
            r2.setLoggedInUser(r4)
            android.view.View r2 = r2.getRoot()
            com.bxkj.student.v2.ui.main.HomeFragment r4 = r1.f
            com.bxkj.student.v2.ui.main.i r0 = new com.bxkj.student.v2.ui.main.i
            r0.<init>(r4, r3)
            r2.setOnClickListener(r0)
            return
    }
}
