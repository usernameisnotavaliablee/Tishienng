package com.kwad.components.core.page.recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends com.kwad.components.core.proxy.h {
    private androidx.recyclerview.widget.RecyclerView Uv;
    private com.kwad.components.core.page.recycle.d Uw;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int rA() {
            int r0 = com.kwad.sdk.R.id.ksad_recycler_view
            return r0
    }

    private void rw() {
            r2 = this;
            int r0 = rA()
            android.view.View r0 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r2.Uv = r0
            r1 = 0
            r0.setItemAnimator(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.Uv
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r2.rz()
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.Uv
            com.kwad.components.core.page.recycle.d r0 = r2.a(r0)
            r2.Uw = r0
            return
    }

    private void rx() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.Uv
            com.kwad.components.core.page.recycle.d r1 = r2.Uw
            r0.setAdapter(r1)
            return
    }

    private androidx.recyclerview.widget.RecyclerView.LayoutManager rz() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            return r0
    }

    protected abstract com.kwad.components.core.page.recycle.d a(androidx.recyclerview.widget.RecyclerView r1);

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.core.proxy.h, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onDestroyView() {
            r1 = this;
            super.onDestroyView()
            androidx.recyclerview.widget.RecyclerView r0 = r1.Uv
            r0.clearOnChildAttachStateChangeListeners()
            return
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onPause() {
            r0 = this;
            super.onPause()
            return
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onResume() {
            r0 = this;
            super.onResume()
            return
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            r0.rw()
            r0.rx()
            return
    }

    public final androidx.recyclerview.widget.RecyclerView ry() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.Uv
            return r0
    }
}
