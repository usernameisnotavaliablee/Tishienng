package com.bxkj.base.v2.base;

import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBaseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAdapter.kt\ncom/bxkj/base/v2/base/BaseAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,145:1\n4225#2,11:146\n*S KotlinDebug\n*F\n+ 1 BaseAdapter.kt\ncom/bxkj/base/v2/base/BaseAdapter\n*L\n42#1:146,11\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class BaseAdapter<T, VB extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bxkj.base.v2.base.BaseAdapter.BaseViewHolder<VB>> {

    @org.jetbrains.annotations.Nullable
    private java.util.List<? extends T> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class BaseViewHolder<VB extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        @org.jetbrains.annotations.NotNull
        private VB d;

        public BaseViewHolder(@org.jetbrains.annotations.NotNull VB r2) {
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r2, r0)
                android.view.View r0 = r2.getRoot()
                r1.<init>(r0)
                r1.d = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final VB a() {
                r1 = this;
                VB extends androidx.databinding.ViewDataBinding r0 = r1.d
                return r0
        }

        public final void b(@org.jetbrains.annotations.NotNull VB r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.d = r2
                return
        }
    }

    public BaseAdapter() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public BaseAdapter(@org.jetbrains.annotations.Nullable java.util.List<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            return
    }

    public /* synthetic */ BaseAdapter(java.util.List r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ java.util.List a(com.bxkj.base.v2.base.BaseAdapter r0) {
            java.util.List<? extends T> r0 = r0.e
            return r0
    }

    public static /* synthetic */ void c(com.bxkj.base.v2.base.BaseAdapter r0, java.util.List r1, java.lang.Integer r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.b(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: addData"
            r0.<init>(r1)
            throw r0
    }

    private final <VB extends androidx.viewbinding.ViewBinding> VB h(java.lang.Object r11, android.view.LayoutInflater r12, android.view.ViewGroup r13, int r14) {
            r10 = this;
            java.lang.Class r11 = r11.getClass()
            java.lang.reflect.Type r11 = r11.getGenericSuperclass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.reflect.ParameterizedType"
            kotlin.jvm.internal.g0.n(r11, r0)
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type[] r11 = r11.getActualTypeArguments()
            java.lang.String r0 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L20:
            if (r3 >= r1) goto L2e
            r4 = r11[r3]
            boolean r5 = r4 instanceof java.lang.Class
            if (r5 == 0) goto L2b
            r0.add(r4)
        L2b:
            int r3 = r3 + 1
            goto L20
        L2e:
            java.lang.Object r11 = r0.get(r2)
            java.lang.Class r11 = (java.lang.Class) r11
            java.lang.Class r11 = r11.getSuperclass()
            r1 = 0
            if (r11 == 0) goto L40
            java.lang.String r11 = r11.getSimpleName()
            goto L41
        L40:
            r11 = r1
        L41:
            java.lang.Class<androidx.databinding.ViewDataBinding> r3 = androidx.databinding.ViewDataBinding.class
            kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
            java.lang.String r3 = r3.D()
            boolean r11 = kotlin.jvm.internal.g0.g(r11, r3)
            r3 = 2
            r4 = 3
            java.lang.Class r5 = java.lang.Boolean.TYPE
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.Class<android.view.LayoutInflater> r7 = android.view.LayoutInflater.class
            java.lang.String r8 = "inflate"
            r9 = 1
            if (r11 == 0) goto L72
            java.lang.Object r11 = r0.get(r14)
            java.lang.Class r11 = (java.lang.Class) r11
            java.lang.Class[] r14 = new java.lang.Class[r4]
            r14[r2] = r7
            r14[r9] = r6
            r14[r3] = r5
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r8, r14)
            kotlin.jvm.internal.g0.m(r11)
            goto L87
        L72:
            java.lang.Object r11 = r0.get(r9)
            java.lang.Class r11 = (java.lang.Class) r11
            java.lang.Class[] r14 = new java.lang.Class[r4]
            r14[r2] = r7
            r14[r9] = r6
            r14[r3] = r5
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r8, r14)
            kotlin.jvm.internal.g0.m(r11)
        L87:
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r2] = r12
            r14[r9] = r13
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r14[r3] = r12
            java.lang.Object r11 = r11.invoke(r1, r14)
            java.lang.String r12 = "null cannot be cast to non-null type VB of com.bxkj.base.v2.base.BaseAdapter.getViewBinding"
            kotlin.jvm.internal.g0.n(r11, r12)
            androidx.viewbinding.ViewBinding r11 = (androidx.viewbinding.ViewBinding) r11
            return r11
    }

    static /* synthetic */ androidx.viewbinding.ViewBinding i(com.bxkj.base.v2.base.BaseAdapter r0, java.lang.Object r1, android.view.LayoutInflater r2, android.view.ViewGroup r3, int r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto Lc
            r5 = r5 & 4
            if (r5 == 0) goto L7
            r4 = 0
        L7:
            androidx.viewbinding.ViewBinding r0 = r0.h(r1, r2, r3, r4)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getViewBinding"
            r0.<init>(r1)
            throw r0
    }

    public final void b(@org.jetbrains.annotations.Nullable java.util.List<? extends T> r3, @org.jetbrains.annotations.Nullable java.lang.Integer r4) {
            r2 = this;
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L32
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.util.LinkedList r0 = new java.util.LinkedList
            java.util.List<? extends T> r1 = r2.e
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            if (r4 == 0) goto L2c
            int r4 = r4.intValue()
            if (r4 >= 0) goto L1e
            r4 = 0
            goto L28
        L1e:
            int r1 = r0.size()
            if (r4 < r1) goto L28
            int r4 = r0.size()
        L28:
            r0.addAll(r4, r3)
            goto L2f
        L2c:
            r0.addAll(r3)
        L2f:
            r2.l(r0)
        L32:
            return
    }

    protected boolean d(T r1, T r2, int r3, int r4) {
            r0 = this;
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            return r1
    }

    protected boolean e(T r1, T r2) {
            r0 = this;
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            return r1
    }

    public abstract void f(@org.jetbrains.annotations.NotNull VB r1, T r2, int r3);

    @org.jetbrains.annotations.Nullable
    public final java.util.List<T> g() {
            r1 = this;
            java.util.List<? extends T> r0 = r1.e
            return r0
    }

    public int getItemCount() {
            r1 = this;
            java.util.List<? extends T> r0 = r1.e
            if (r0 == 0) goto L9
            int r0 = r0.size()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void j(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.base.BaseAdapter.BaseViewHolder<VB> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.databinding.ViewDataBinding r0 = r3.a()
            java.util.List<? extends T> r1 = r2.e
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Object r1 = r1.get(r4)
            r2.f(r0, r1, r4)
            androidx.databinding.ViewDataBinding r3 = r3.a()
            r3.executePendingBindings()
            return
    }

    @org.jetbrains.annotations.NotNull
    public com.bxkj.base.v2.base.BaseAdapter.BaseViewHolder<VB> k(@org.jetbrains.annotations.NotNull android.view.ViewGroup r2, int r3) {
            r1 = this;
            java.lang.String r3 = "parent"
            kotlin.jvm.internal.g0.p(r2, r3)
            android.content.Context r3 = r2.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            java.lang.String r0 = "from(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r0 = 0
            androidx.viewbinding.ViewBinding r2 = r1.h(r1, r3, r2, r0)
            androidx.databinding.ViewDataBinding r2 = (androidx.databinding.ViewDataBinding) r2
            com.bxkj.base.v2.base.BaseAdapter$BaseViewHolder r3 = new com.bxkj.base.v2.base.BaseAdapter$BaseViewHolder
            r3.<init>(r2)
            return r3
    }

    public final void l(@org.jetbrains.annotations.Nullable java.util.List<? extends T> r3) {
            r2 = this;
            if (r3 == 0) goto L16
            com.bxkj.base.v2.base.BaseAdapter$setData$1$result$1 r0 = new com.bxkj.base.v2.base.BaseAdapter$setData$1$result$1
            r0.<init>(r2, r3)
            androidx.recyclerview.widget.DiffUtil$DiffResult r0 = androidx.recyclerview.widget.DiffUtil.calculateDiff(r0)
            java.lang.String r1 = "calculateDiff(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.e = r3
            r0.dispatchUpdatesTo(r2)
            return
        L16:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.e = r3
            r3 = 0
            int r0 = r2.getItemCount()
            r2.notifyItemRangeChanged(r3, r0)
            return
    }

    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.bxkj.base.v2.base.BaseAdapter$BaseViewHolder r1 = (com.bxkj.base.v2.base.BaseAdapter.BaseViewHolder) r1
            r0.j(r1, r2)
            return
    }

    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.bxkj.base.v2.base.BaseAdapter$BaseViewHolder r1 = r0.k(r1, r2)
            return r1
    }
}
