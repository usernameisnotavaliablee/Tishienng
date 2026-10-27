package com.kwad.components.core.page.recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class d extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kwad.components.core.page.recycle.c> {
    private java.util.List<com.kwad.sdk.mvp.Presenter> Va;

    public d() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Va = r0
            return
    }

    private void a(com.kwad.components.core.page.recycle.c r1) {
            r0 = this;
            super.onViewRecycled(r1)
            com.kwad.sdk.mvp.Presenter r1 = r1.mPresenter
            r1.ny()
            return
    }

    private com.kwad.components.core.page.recycle.c d(android.view.ViewGroup r2, int r3) {
            r1 = this;
            com.kwad.components.core.page.recycle.c r2 = r1.c(r2, r3)
            java.util.List<com.kwad.sdk.mvp.Presenter> r3 = r1.Va
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            r3.add(r0)
            return r2
    }

    public void a(com.kwad.components.core.page.recycle.c r1, int r2) {
            r0 = this;
            com.kwad.sdk.mvp.Presenter r2 = r1.mPresenter
            com.kwad.components.core.page.recycle.e r1 = r1.Th
            r2.n(r1)
            return
    }

    protected abstract com.kwad.components.core.page.recycle.c c(android.view.ViewGroup r1, int r2);

    public /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.kwad.components.core.page.recycle.c r1 = (com.kwad.components.core.page.recycle.c) r1
            r0.a(r1, r2)
            return
    }

    public /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.kwad.components.core.page.recycle.c r1 = r0.d(r1, r2)
            return r1
    }

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            super.onDetachedFromRecyclerView(r1)
            r0.rG()
            return
    }

    public /* synthetic */ void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            com.kwad.components.core.page.recycle.c r1 = (com.kwad.components.core.page.recycle.c) r1
            r0.a(r1)
            return
    }

    public final void rG() {
            r2 = this;
            java.util.List<com.kwad.sdk.mvp.Presenter> r0 = r2.Va
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.sdk.mvp.Presenter r1 = (com.kwad.sdk.mvp.Presenter) r1
            r1.destroy()
            goto L6
        L16:
            return
    }
}
