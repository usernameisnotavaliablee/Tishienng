package com.bxkj.base.v2.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final /* synthetic */ class i {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements android.content.DialogInterface.OnKeyListener {
        final /* synthetic */ com.bxkj.base.v2.base.j<java.lang.Object, java.lang.Object> a;

        a(com.bxkj.base.v2.base.j<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                r1 = 4
                if (r2 != r1) goto L24
                com.bxkj.base.v2.base.j<java.lang.Object, java.lang.Object> r1 = r0.a
                com.bxkj.base.v2.base.p r1 = r1.x()
                if (r1 == 0) goto Le
                r1.b()
            Le:
                com.bxkj.base.v2.base.j<java.lang.Object, java.lang.Object> r1 = r0.a
                com.bxkj.base.v2.base.BaseViewModel r1 = r1.C()
                kotlinx.coroutines.e2 r1 = r1.b()
                if (r1 == 0) goto L22
                java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
                r2.<init>()
                r1.b(r2)
            L22:
                r1 = 1
                return r1
            L24:
                r1 = 0
                return r1
        }
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.bxkj.base.v2.base.j r4) {
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            androidx.lifecycle.MutableLiveData r1 = r0.c()
            androidx.lifecycle.LifecycleOwner r2 = r4.F()
            com.bxkj.base.v2.base.d r3 = new com.bxkj.base.v2.base.d
            r3.<init>(r4)
            r1.observe(r2, r3)
            androidx.lifecycle.MutableLiveData r1 = r0.e()
            androidx.lifecycle.LifecycleOwner r2 = r4.F()
            com.bxkj.base.v2.base.e r3 = new com.bxkj.base.v2.base.e
            r3.<init>(r4)
            r1.observe(r2, r3)
            androidx.lifecycle.MutableLiveData r1 = r0.f()
            androidx.lifecycle.LifecycleOwner r2 = r4.F()
            com.bxkj.base.v2.base.f r3 = new com.bxkj.base.v2.base.f
            r3.<init>(r4)
            r1.observe(r2, r3)
            androidx.lifecycle.MutableLiveData r1 = r0.h()
            androidx.lifecycle.LifecycleOwner r2 = r4.F()
            com.bxkj.base.v2.base.g r3 = new com.bxkj.base.v2.base.g
            r3.<init>(r4)
            r1.observe(r2, r3)
            androidx.lifecycle.MutableLiveData r0 = r0.g()
            androidx.lifecycle.LifecycleOwner r1 = r4.F()
            com.bxkj.base.v2.base.h r2 = new com.bxkj.base.v2.base.h
            r2.<init>(r4)
            r0.observe(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static androidx.viewbinding.ViewBinding b(com.bxkj.base.v2.base.j r5, @org.jetbrains.annotations.NotNull java.lang.Object r6, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r7) {
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r5)
            java.lang.String r5 = "inflater"
            kotlin.jvm.internal.g0.p(r7, r5)
            java.lang.Class r5 = r6.getClass()
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.reflect.ParameterizedType"
            kotlin.jvm.internal.g0.n(r5, r6)
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            java.lang.String r6 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L2a:
            if (r2 >= r0) goto L38
            r3 = r5[r2]
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 == 0) goto L35
            r6.add(r3)
        L35:
            int r2 = r2 + 1
            goto L2a
        L38:
            java.lang.Object r5 = r6.get(r1)
            java.lang.Class r5 = (java.lang.Class) r5
            r6 = 1
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<android.view.LayoutInflater> r2 = android.view.LayoutInflater.class
            r0[r1] = r2
            java.lang.String r2 = "inflate"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r2, r0)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r7
            r7 = 0
            java.lang.Object r5 = r5.invoke(r7, r6)
            java.lang.String r6 = "null cannot be cast to non-null type VB of com.bxkj.base.v2.base.BaseUI.getActivityViewBinding"
            kotlin.jvm.internal.g0.n(r5, r6)
            androidx.viewbinding.ViewBinding r5 = (androidx.viewbinding.ViewBinding) r5
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static androidx.viewbinding.ViewBinding c(com.bxkj.base.v2.base.j r5, @org.jetbrains.annotations.NotNull java.lang.Object r6, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r7, @org.jetbrains.annotations.Nullable android.view.ViewGroup r8) {
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r5)
            java.lang.String r5 = "inflater"
            kotlin.jvm.internal.g0.p(r7, r5)
            java.lang.Class r5 = r6.getClass()
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.reflect.ParameterizedType"
            kotlin.jvm.internal.g0.n(r5, r6)
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            java.lang.String r6 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L2a:
            if (r2 >= r0) goto L38
            r3 = r5[r2]
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 == 0) goto L35
            r6.add(r3)
        L35:
            int r2 = r2 + 1
            goto L2a
        L38:
            java.lang.Object r5 = r6.get(r1)
            java.lang.Class r5 = (java.lang.Class) r5
            r6 = 3
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<android.view.LayoutInflater> r2 = android.view.LayoutInflater.class
            r0[r1] = r2
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r3 = 1
            r0[r3] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r4 = 2
            r0[r4] = r2
            java.lang.String r2 = "inflate"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r2, r0)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r7
            r6[r3] = r8
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6[r4] = r7
            r7 = 0
            java.lang.Object r5 = r5.invoke(r7, r6)
            java.lang.String r6 = "null cannot be cast to non-null type VB of com.bxkj.base.v2.base.BaseUI.getFragmentViewBinding"
            kotlin.jvm.internal.g0.n(r5, r6)
            androidx.viewbinding.ViewBinding r5 = (androidx.viewbinding.ViewBinding) r5
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static androidx.lifecycle.ViewModel d(com.bxkj.base.v2.base.j r4, @org.jetbrains.annotations.NotNull java.lang.Object r5, @androidx.annotation.NonNull @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r6) {
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r4)
            java.lang.String r4 = "owner"
            kotlin.jvm.internal.g0.p(r6, r4)
            java.lang.Class r4 = r5.getClass()
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.reflect.ParameterizedType"
            kotlin.jvm.internal.g0.n(r4, r5)
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.String r5 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r0 = r4.length
            r1 = 0
        L29:
            if (r1 >= r0) goto L37
            r2 = r4[r1]
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L34
            r5.add(r2)
        L34:
            int r1 = r1 + 1
            goto L29
        L37:
            r4 = 1
            java.lang.Object r4 = r5.get(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            androidx.lifecycle.ViewModelProvider r5 = new androidx.lifecycle.ViewModelProvider
            r5.<init>(r6)
            androidx.lifecycle.ViewModel r4 = r5.get(r4)
            return r4
    }

    public static void e(com.bxkj.base.v2.base.j r0) {
            com.bxkj.base.v2.base.p r0 = r0.x()
            if (r0 == 0) goto L9
            r0.b()
        L9:
            return
    }

    public static void f(com.bxkj.base.v2.base.j r2, java.lang.String r3) {
            com.bxkj.base.v2.base.p r0 = r2.x()
            if (r0 != 0) goto L20
            com.bxkj.base.v2.base.p r0 = new com.bxkj.base.v2.base.p
            android.content.Context r1 = r2.G()
            r0.<init>(r1)
            r2.B(r0)
            com.bxkj.base.v2.base.p r0 = r2.x()
            if (r0 == 0) goto L20
            com.bxkj.base.v2.base.i$a r1 = new com.bxkj.base.v2.base.i$a
            r1.<init>(r2)
            r0.g(r1)
        L20:
            com.bxkj.base.v2.base.p r2 = r2.x()
            if (r2 == 0) goto L29
            r2.i(r3)
        L29:
            return
    }

    public static /* synthetic */ void g(com.bxkj.base.v2.base.j r0) {
            a(r0)
            return
    }

    public static /* synthetic */ androidx.viewbinding.ViewBinding h(com.bxkj.base.v2.base.j r0, java.lang.Object r1, android.view.LayoutInflater r2) {
            androidx.viewbinding.ViewBinding r0 = b(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ androidx.viewbinding.ViewBinding i(com.bxkj.base.v2.base.j r0, java.lang.Object r1, android.view.LayoutInflater r2, android.view.ViewGroup r3) {
            androidx.viewbinding.ViewBinding r0 = c(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ androidx.lifecycle.ViewModel j(com.bxkj.base.v2.base.j r0, java.lang.Object r1, androidx.lifecycle.ViewModelStoreOwner r2) {
            androidx.lifecycle.ViewModel r0 = d(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void k(com.bxkj.base.v2.base.j r0) {
            e(r0)
            return
    }

    public static void l(com.bxkj.base.v2.base.j r0, java.lang.Integer r1) {
            int r1 = r1.intValue()
            if (r1 <= 0) goto L18
            com.bxkj.base.v2.base.BaseViewModel r1 = r0.C()
            androidx.lifecycle.MutableLiveData r1 = r1.d()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            f(r0, r1)
            return
        L18:
            r0.t()
            return
    }

    public static void m(com.bxkj.base.v2.base.j r0, java.lang.String r1) {
            if (r1 == 0) goto L9
            android.content.Context r0 = r0.G()
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r0, r1)
        L9:
            return
    }

    public static void n(com.bxkj.base.v2.base.j r2, java.lang.String r3) {
            if (r3 == 0) goto L13
            android.content.Context r0 = r2.G()
            com.bxkj.base.v2.base.c r1 = new com.bxkj.base.v2.base.c
            r1.<init>(r3, r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            r3 = 0
            r2.setCancelable(r3)
        L13:
            return
    }

    public static kotlin.n1 o(java.lang.String r3, com.bxkj.base.v2.base.j r4, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r5, r0)
            r5 = 2
            r0 = 0
            java.lang.String r1 = "登录失效"
            r2 = 0
            boolean r3 = kotlin.text.u.l3(r3, r1, r2, r5, r0)
            if (r3 == 0) goto L49
            com.bxkj.base.v2.data.b$a r3 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r3 = r3.a()
            r3.d()
            android.content.Context r3 = r4.G()
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r5 = "com.bxkj.student"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r5)
            if (r3 == 0) goto L2c
            java.lang.String r3 = "com.bxkj.student.v2.ui.LoginActivity"
            goto L2e
        L2c:
            java.lang.String r3 = "com.bxkj.teacher.v2.ui.LoginActivity"
        L2e:
            androidx.fragment.app.FragmentActivity r5 = r4.q()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r4 = r4.G()
            android.content.Intent r3 = r0.setClassName(r4, r3)
            r4 = 268468224(0x10008000, float:2.5342157E-29)
            android.content.Intent r3 = r3.setFlags(r4)
            r5.startActivity(r3)
        L49:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    public static void p(com.bxkj.base.v2.base.j r0, java.lang.String r1) {
            if (r1 == 0) goto L9
            android.content.Context r0 = r0.G()
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r1)
        L9:
            return
    }

    public static void q(com.bxkj.base.v2.base.j r3, java.lang.String r4) {
            if (r4 == 0) goto Lc
            android.content.Context r3 = r3.G()
            r0 = 2
            r1 = 0
            r2 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r3, r4, r2, r0, r1)
        Lc:
            return
    }

    public static /* synthetic */ void r(com.bxkj.base.v2.base.j r0, java.lang.String r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lc
            r2 = r2 & 1
            if (r2 == 0) goto L8
            java.lang.String r1 = "loading..."
        L8:
            f(r0, r1)
            return
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: showProgressDialog"
            r0.<init>(r1)
            throw r0
    }
}
