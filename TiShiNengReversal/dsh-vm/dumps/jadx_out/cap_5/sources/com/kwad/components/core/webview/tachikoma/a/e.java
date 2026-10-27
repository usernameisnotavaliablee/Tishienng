package com.kwad.components.core.webview.tachikoma.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private com.kwad.sdk.api.KsAppDownloadListener abU;

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsAppDownloadListener aen;

    @androidx.annotation.NonNull
    private com.kwad.sdk.components.o afJ;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;


    public e(com.kwad.components.core.e.d.c r1, com.kwad.sdk.core.webview.b r2, @androidx.annotation.NonNull com.kwad.sdk.components.o r3) {
            r0 = this;
            r0.<init>()
            r0.eQ = r2
            r0.mApkDownloadHelper = r1
            r0.afJ = r3
            if (r1 == 0) goto L1e
            com.kwad.sdk.api.KsAppDownloadListener r2 = r0.abU
            if (r2 != 0) goto L1b
            com.kwad.sdk.api.KsAppDownloadListener r1 = r0.uz()
            r0.abU = r1
            com.kwad.components.core.e.d.c r2 = r0.mApkDownloadHelper
            r2.b(r1)
            return
        L1b:
            r1.d(r2)
        L1e:
            return
    }

    static /* synthetic */ com.kwad.sdk.api.KsAppDownloadListener a(com.kwad.components.core.webview.tachikoma.a.e r0) {
            com.kwad.sdk.api.KsAppDownloadListener r0 = r0.aen
            return r0
    }

    private void a(int r7, float r8) {
            r6 = this;
            com.kwad.components.core.webview.jshandler.bc$a r0 = new com.kwad.components.core.webview.jshandler.bc$a
            r0.<init>()
            r0.aep = r8
            r0.status = r7
            com.kwad.sdk.core.webview.b r7 = r6.eQ
            com.kwad.sdk.core.response.model.AdTemplate r7 = r7.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.totalBytes
            r0.totalBytes = r7
            com.kwad.sdk.core.webview.b r7 = r6.eQ
            com.kwad.sdk.core.response.model.AdTemplate r7 = r7.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.soFarBytes
            r0.soFarBytes = r7
            long r1 = r0.totalBytes
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L37
            float r7 = (float) r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r8
            float r8 = (float) r1
            float r7 = r7 / r8
            r0.aeq = r7
            goto L3a
        L37:
            r7 = 0
            r0.aeq = r7
        L3a:
            com.kwad.sdk.components.o r7 = r6.afJ
            org.json.JSONObject r8 = r0.toJson()
            java.lang.String r8 = r8.toString()
            r7.setDownloadProgress(r8)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.a.e r0, int r1, float r2) {
            r0.a(r1, r2)
            return
    }

    private com.kwad.sdk.api.KsAppDownloadListener uz() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.a.e$1 r0 = new com.kwad.components.core.webview.tachikoma.a.e$1
            r0.<init>(r1)
            return r0
    }
}
