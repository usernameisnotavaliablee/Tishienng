package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class c extends com.kwad.sdk.widget.KSFrameLayout {
    private android.animation.Animator qc;
    private boolean qd;


    public c(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public c(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public c(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.qd = r0
            r1.a(r2, r3, r4)
            r1.nu()
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.widget.c r0) {
            boolean r0 = r0.qd
            return r0
    }

    static /* synthetic */ android.animation.Animator b(com.kwad.components.ad.splashscreen.widget.c r0) {
            android.animation.Animator r0 = r0.qc
            return r0
    }

    protected void a(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r1 = this;
            super.ab()
            android.animation.Animator r0 = r1.qc
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }

    @androidx.annotation.MainThread
    public final void fM() {
            r2 = this;
            android.animation.Animator r0 = r2.qc
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r2.qc = r0
        La:
            android.animation.Animator r0 = r2.fN()
            r2.qc = r0
            if (r0 == 0) goto L1f
            com.kwad.components.ad.splashscreen.widget.c$1 r1 = new com.kwad.components.ad.splashscreen.widget.c$1
            r1.<init>(r2)
            r0.addListener(r1)
            android.animation.Animator r0 = r2.qc
            r0.start()
        L1f:
            return
    }

    protected abstract android.animation.Animator fN();

    protected abstract int getAnimationDelayTime();

    protected abstract android.view.View getInteractionView();

    protected abstract void nu();

    protected abstract void nv();

    public final void nw() {
            r1 = this;
            r0 = 1
            r1.qd = r0
            android.animation.Animator r0 = r1.qc
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }
}
