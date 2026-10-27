package com.bxkj.base.v2.base;

import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSpinnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpinnerAdapter.kt\ncom/bxkj/base/v2/base/SpinnerAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,61:1\n4225#2,11:62\n*S KotlinDebug\n*F\n+ 1 SpinnerAdapter.kt\ncom/bxkj/base/v2/base/SpinnerAdapter\n*L\n34#1:62,11\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class SpinnerAdapter<T, VB extends androidx.databinding.ViewDataBinding> extends android.widget.BaseAdapter {

    @org.jetbrains.annotations.Nullable
    private java.util.List<? extends T> a;

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

    public SpinnerAdapter() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public SpinnerAdapter(@org.jetbrains.annotations.Nullable java.util.List<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* synthetic */ SpinnerAdapter(java.util.List r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            r0.<init>(r1)
            return
    }

    private final <VB extends androidx.viewbinding.ViewBinding> VB b(java.lang.Object r7, android.view.LayoutInflater r8, android.view.ViewGroup r9, int r10) {
            r6 = this;
            java.lang.Class r7 = r7.getClass()
            java.lang.reflect.Type r7 = r7.getGenericSuperclass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.reflect.ParameterizedType"
            kotlin.jvm.internal.g0.n(r7, r0)
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            java.lang.String r0 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L20:
            if (r3 >= r1) goto L2e
            r4 = r7[r3]
            boolean r5 = r4 instanceof java.lang.Class
            if (r5 == 0) goto L2b
            r0.add(r4)
        L2b:
            int r3 = r3 + 1
            goto L20
        L2e:
            java.lang.Object r7 = r0.get(r10)
            java.lang.Class r7 = (java.lang.Class) r7
            r10 = 3
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            r0[r2] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r3 = 1
            r0[r3] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "inflate"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r1, r0)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r2] = r8
            r10[r3] = r9
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r10[r4] = r8
            r8 = 0
            java.lang.Object r7 = r7.invoke(r8, r10)
            java.lang.String r8 = "null cannot be cast to non-null type VB of com.bxkj.base.v2.base.SpinnerAdapter.getViewBinding"
            kotlin.jvm.internal.g0.n(r7, r8)
            androidx.viewbinding.ViewBinding r7 = (androidx.viewbinding.ViewBinding) r7
            return r7
    }

    static /* synthetic */ androidx.viewbinding.ViewBinding c(com.bxkj.base.v2.base.SpinnerAdapter r0, java.lang.Object r1, android.view.LayoutInflater r2, android.view.ViewGroup r3, int r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto Lc
            r5 = r5 & 4
            if (r5 == 0) goto L7
            r4 = 0
        L7:
            androidx.viewbinding.ViewBinding r0 = r0.b(r1, r2, r3, r4)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getViewBinding"
            r0.<init>(r1)
            throw r0
    }

    public abstract void a(@org.jetbrains.annotations.NotNull VB r1, T r2, int r3);

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<? extends T> r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.size()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    @org.jetbrains.annotations.Nullable
    public T getItem(int r2) {
            r1 = this;
            java.util.List<? extends T> r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.get(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    @org.jetbrains.annotations.NotNull
    public android.view.View getView(int r2, @org.jetbrains.annotations.Nullable android.view.View r3, @org.jetbrains.annotations.Nullable android.view.ViewGroup r4) {
            r1 = this;
            if (r4 == 0) goto L7
            android.content.Context r3 = r4.getContext()
            goto L8
        L7:
            r3 = 0
        L8:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            java.lang.String r0 = "from(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r0 = 0
            androidx.viewbinding.ViewBinding r3 = r1.b(r1, r3, r4, r0)
            androidx.databinding.ViewDataBinding r3 = (androidx.databinding.ViewDataBinding) r3
            com.bxkj.base.v2.base.SpinnerAdapter$BaseViewHolder r4 = new com.bxkj.base.v2.base.SpinnerAdapter$BaseViewHolder
            r4.<init>(r3)
            java.util.List<? extends T> r3 = r1.a
            kotlin.jvm.internal.g0.m(r3)
            java.lang.Object r3 = r3.get(r2)
            androidx.databinding.ViewDataBinding r0 = r4.a()
            r1.a(r0, r3, r2)
            android.view.View r2 = r4.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }
}
