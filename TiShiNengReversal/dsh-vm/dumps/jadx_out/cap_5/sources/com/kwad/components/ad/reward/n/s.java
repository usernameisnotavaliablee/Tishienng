package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class s extends com.kwad.components.ad.reward.n.d {
    protected android.view.ViewGroup vV;

    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(android.view.ViewGroup r2, @androidx.annotation.IdRes int r3, @androidx.annotation.IdRes int r4) {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            if (r0 == 0) goto L5
            return
        L5:
            android.view.View r3 = r2.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            if (r3 == 0) goto L16
            android.view.View r2 = r3.inflate()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.vV = r2
            return
        L16:
            android.view.View r2 = r2.findViewById(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.vV = r2
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            return r0
    }
}
