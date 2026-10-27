package com.kwad.components.ad.draw;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.widget.a.b {
    private android.view.View mRootView;

    public b(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            int r0 = aG()
            r1.<init>(r2, r0)
            r1.mRootView = r2
            return
    }

    private static int aG() {
            r0 = 70
            float r1 = com.kwad.sdk.core.config.e.FI()     // Catch: java.lang.Throwable -> L11
            int r1 = (int) r1
            r2 = 100
            int r1 = r1 * 100
            if (r1 < 0) goto L11
            if (r1 <= r2) goto L10
            goto L11
        L10:
            return r1
        L11:
            return r0
    }

    @Override // com.kwad.components.core.widget.a.b, com.kwad.components.core.widget.a.a
    public final boolean ae() {
            r3 = this;
            android.view.View r0 = r3.mRootView
            r1 = 70
            r2 = 1
            boolean r0 = com.kwad.sdk.utils.bz.a(r0, r1, r2)
            return r0
    }
}
