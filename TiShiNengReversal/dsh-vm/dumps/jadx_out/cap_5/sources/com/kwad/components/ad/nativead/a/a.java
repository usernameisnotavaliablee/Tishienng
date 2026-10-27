package com.kwad.components.ad.nativead.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.mvp.Presenter {
    public com.kwad.components.core.video.l mVideoPlayStateListener;
    public com.kwad.components.ad.nativead.a.b pq;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static void a(android.view.View r2, java.lang.String r3) {
            if (r2 != 0) goto L18
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " findViewById failed "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
        L18:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void at() {
            r1 = this;
            super.at()
            java.lang.Object r0 = r1.NN()
            com.kwad.components.ad.nativead.a.b r0 = (com.kwad.components.ad.nativead.a.b) r0
            r1.pq = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            com.kwad.components.ad.nativead.c.a r0 = r0.pr
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
            return
    }
}
