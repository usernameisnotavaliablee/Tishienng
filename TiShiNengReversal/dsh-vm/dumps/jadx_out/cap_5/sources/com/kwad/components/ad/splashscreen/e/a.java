package com.kwad.components.ad.splashscreen.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends com.kwad.sdk.core.download.a.a {
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public a(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.<init>()
            r0.mAdTemplate = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            r0.mAdInfo = r1
            return
    }

    private void j(int r3, int r4) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            java.lang.String r4 = com.kwad.components.ad.splashscreen.d.a(r0, r1, r3, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L11
            r2.j(r3, r4)
        L11:
            return
    }

    protected abstract void j(int r1, java.lang.String r2);

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFailed() {
            r2 = this;
            r0 = 7
            r1 = 0
            r2.j(r0, r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFinished() {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.j(r0, r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onIdle() {
            r1 = this;
            r0 = 0
            r1.j(r0, r0)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onInstalled() {
            r2 = this;
            r0 = 12
            r1 = 0
            r2.j(r0, r1)
            return
    }

    @Override // com.kwad.sdk.core.download.a.a
    public final void onPaused(int r2) {
            r1 = this;
            r0 = 4
            r1.j(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onProgressUpdate(int r2) {
            r1 = this;
            r0 = 2
            r1.j(r0, r2)
            return
    }

    public final void setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }
}
