package com.bxkj.base.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmptyRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyRecyclerView.kt\ncom/bxkj/base/v2/common/view/EmptyRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class EmptyRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    @org.jetbrains.annotations.Nullable
    private android.view.View f;
    private int g;

    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver h;

    public EmptyRecyclerView(@org.jetbrains.annotations.Nullable android.content.Context r1) {
            r0 = this;
            kotlin.jvm.internal.g0.m(r1)
            r0.<init>(r1)
            r1 = -1
            r0.g = r1
            com.bxkj.base.v2.common.view.EmptyRecyclerView$observer$1 r1 = new com.bxkj.base.v2.common.view.EmptyRecyclerView$observer$1
            r1.<init>(r0)
            r0.h = r1
            return
    }

    public EmptyRecyclerView(@org.jetbrains.annotations.Nullable android.content.Context r2, @org.jetbrains.annotations.Nullable android.util.AttributeSet r3) {
            r1 = this;
            kotlin.jvm.internal.g0.m(r2)
            r1.<init>(r2, r3)
            r0 = -1
            r1.g = r0
            com.bxkj.base.v2.common.view.EmptyRecyclerView$observer$1 r0 = new com.bxkj.base.v2.common.view.EmptyRecyclerView$observer$1
            r0.<init>(r1)
            r1.h = r0
            r1.b(r2, r3)
            return
    }

    public EmptyRecyclerView(@org.jetbrains.annotations.Nullable android.content.Context r1, @org.jetbrains.annotations.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            kotlin.jvm.internal.g0.m(r1)
            r0.<init>(r1, r2, r3)
            r3 = -1
            r0.g = r3
            com.bxkj.base.v2.common.view.EmptyRecyclerView$observer$1 r3 = new com.bxkj.base.v2.common.view.EmptyRecyclerView$observer$1
            r3.<init>(r0)
            r0.h = r3
            r0.b(r1, r2)
            return
    }

    private final void b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = com.bxkj.base.R.styleable.EmptyRecyclerView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            java.lang.String r3 = "obtainStyledAttributes(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            int r3 = com.bxkj.base.R.styleable.EmptyRecyclerView_emptyId
            r0 = -1
            int r2 = r2.getResourceId(r3, r0)
            r1.g = r2
            return
    }

    public final void a() {
            r2 = this;
            android.view.View r0 = r2.f
            if (r0 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.getAdapter()
            if (r1 == 0) goto L17
            int r1 = r1.getItemCount()
            if (r1 <= 0) goto L13
            r1 = 8
            goto L14
        L13:
            r1 = 0
        L14:
            r0.setVisibility(r1)
        L17:
            return
    }

    protected void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L4b
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L4b
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = r0 instanceof com.scwang.smartrefresh.layout.SmartRefreshLayout
            if (r1 == 0) goto L2d
            r1 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            android.view.ViewParent r2 = r1.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2d
            android.view.ViewParent r0 = r1.getParent()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L2d:
            int r1 = r4.g
            r2 = -1
            if (r1 != r2) goto L45
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.bxkj.base.R.layout.v2_pub_empty
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            r0.addView(r1)
            goto L49
        L45:
            android.view.View r1 = r0.findViewById(r1)
        L49:
            r4.f = r1
        L4b:
            r4.a()
            return
    }

    public void setAdapter(@org.jetbrains.annotations.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.getAdapter()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = r2.h
            r0.unregisterAdapterDataObserver(r1)
        Lb:
            super.setAdapter(r3)
            if (r3 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r2.h
            r3.registerAdapterDataObserver(r0)
        L15:
            return
    }

    public final void setEmptyView(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            r0.f = r1
            r0.a()
            return
    }

    public void swapAdapter(@org.jetbrains.annotations.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.getAdapter()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = r2.h
            r0.unregisterAdapterDataObserver(r1)
        Lb:
            if (r3 == 0) goto L12
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r2.h
            r3.registerAdapterDataObserver(r0)
        L12:
            super.swapAdapter(r3, r4)
            r2.a()
            return
    }
}
