package com.kwad.components.ad.nativead.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.mvp.a {

    @androidx.annotation.Nullable
    public com.kwad.components.core.e.d.c mApkDownloadHelper;

    @androidx.annotation.NonNull
    public com.kwad.sdk.api.KsNativeAd.VideoPlayListener oQ;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.nativead.d.a oW;

    @androidx.annotation.NonNull
    public com.kwad.sdk.core.view.AdBasePvFrameLayout pl;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.nativead.c.a pr;
    public boolean pw;
    public boolean px;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.pw = r0
            r1.px = r0
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r1 = this;
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            com.kwad.components.ad.nativead.c.a r0 = r1.pr
            r0.release()
            return
    }
}
