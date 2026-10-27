package com.kwad.components.core.m;

import com.kwad.sdk.mvp.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class c<T extends com.kwad.sdk.mvp.a> extends com.kwad.sdk.widget.KSFrameLayout {
    public T Rv;
    public com.kwad.sdk.mvp.Presenter mPresenter;
    protected android.view.ViewGroup nY;

    public c(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private c(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            boolean r1 = r0.ai()
            if (r1 != 0) goto Ld
            r0.qs()
        Ld:
            return
    }

    private void initMVP() {
            r2 = this;
            com.kwad.sdk.mvp.a r0 = r2.al()
            r2.Rv = r0
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            if (r0 != 0) goto L15
            com.kwad.sdk.mvp.Presenter r0 = r2.onCreatePresenter()
            r2.mPresenter = r0
            android.view.ViewGroup r1 = r2.nY
            r0.K(r1)
        L15:
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            T extends com.kwad.sdk.mvp.a r1 = r2.Rv
            r0.n(r1)
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void aa() {
            r0 = this;
            super.aa()
            r0.initMVP()
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void ab() {
            r1 = this;
            super.ab()
            T extends com.kwad.sdk.mvp.a r0 = r1.Rv
            if (r0 == 0) goto La
            r0.release()
        La:
            com.kwad.sdk.mvp.Presenter r0 = r1.mPresenter
            if (r0 == 0) goto L11
            r0.destroy()
        L11:
            return
    }

    protected boolean ai() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected abstract void ak();

    protected abstract T al();

    @androidx.annotation.LayoutRes
    protected abstract int getLayoutId();

    protected abstract void initData();

    @androidx.annotation.NonNull
    public abstract com.kwad.sdk.mvp.Presenter onCreatePresenter();

    protected final void qs() {
            r2 = this;
            r2.initData()
            android.content.Context r0 = r2.getContext()
            int r1 = r2.getLayoutId()
            android.view.View r0 = com.kwad.sdk.o.m.inflate(r0, r1, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.nY = r0
            r2.ak()
            return
    }
}
