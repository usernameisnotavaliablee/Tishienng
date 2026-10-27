package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsConvertButton extends com.kwad.components.core.widget.KSCornerButton implements com.kwad.sdk.api.KsAppDownloadListener {

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    public KsConvertButton(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsConvertButton(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsConvertButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public KsConvertButton(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private void bj(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.setText(r1)
        L5:
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String getAdActionDesc() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.core.e.d.c r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = this;
            r0.mApkDownloadHelper = r1
            r0.mAdTemplate = r2
            if (r1 == 0) goto L9
            r1.b(r0)
        L9:
            java.lang.String r1 = r0.getAdActionDesc()
            r0.bj(r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFailed() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即下载"
        Lf:
            r1.bj(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFinished() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadStarted() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onIdle() {
            r1 = this;
            java.lang.String r0 = r1.getAdActionDesc()
            r1.bj(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onInstalled() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ac(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即打开"
        Lf:
            r1.bj(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onProgressUpdate(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "下载中..."
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "%"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.bj(r3)
            return
    }
}
