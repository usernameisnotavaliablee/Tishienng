package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends android.widget.FrameLayout {
    private boolean ajm;
    protected com.kwad.components.core.widget.g kR;
    protected boolean lj;

    @androidx.annotation.NonNull
    protected android.content.Context mContext;

    public f(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mContext = r1
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            r0.lj = r1
            return
    }

    private void wg() {
            r2 = this;
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            boolean r1 = r2.ajm
            if (r1 == 0) goto L17
            boolean r1 = r2.lj
            if (r0 == r1) goto L17
            r2.lj = r0
            com.kwad.components.core.widget.g r1 = r2.kR
            if (r1 == 0) goto L17
            r0 = r0 ^ 1
            r1.k(r0)
        L17:
            return
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0.wg()
            return
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            if (r1 != 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            r0.ajm = r1
            r0.wg()
            return
    }

    public final void setOrientationChangeListener(com.kwad.components.core.widget.g r1) {
            r0 = this;
            r0.kR = r1
            return
    }
}
