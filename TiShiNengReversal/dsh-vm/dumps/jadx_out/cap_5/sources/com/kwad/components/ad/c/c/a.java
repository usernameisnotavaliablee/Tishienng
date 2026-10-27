package com.kwad.components.ad.c.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.mvp.Presenter {
    public com.kwad.components.ad.c.b cD;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void at() {
            r2 = this;
            super.at()
            java.lang.Object r0 = r2.NN()
            boolean r1 = r0 instanceof com.kwad.components.ad.c.b
            if (r1 == 0) goto Lf
            com.kwad.components.ad.c.b r0 = (com.kwad.components.ad.c.b) r0
            r2.cD = r0
        Lf:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
