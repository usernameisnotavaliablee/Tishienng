package com.kwad.components.core.e.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.sdk.mvp.a {

    @androidx.annotation.Nullable
    public com.kwad.components.core.e.c.b OG;
    public com.kwad.components.core.e.c.b.C0072b OH;
    public com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r1 = this;
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }
}
