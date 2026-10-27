package com.bxkj.base.v2.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBaseUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseUI.kt\ncom/bxkj/base/v2/base/BaseUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1869#2,2:166\n*S KotlinDebug\n*F\n+ 1 BaseUI.kt\ncom/bxkj/base/v2/base/BaseUIKt\n*L\n159#1:166,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ <VB extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel, F extends androidx.fragment.app.Fragment> F a(com.bxkj.base.v2.base.j<VB, VM> r1, androidx.navigation.fragment.NavHostFragment r2, java.lang.Class<F> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "navHostFragment"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "fragmentClass"
            kotlin.jvm.internal.g0.p(r3, r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            java.util.List r1 = r1.getFragments()
            java.lang.String r2 = "getFragments(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L22
            r1 = 1
            java.lang.String r3 = "F"
            kotlin.jvm.internal.g0.y(r1, r3)
            return r2
        L3f:
            r1 = 0
            return r1
    }
}
