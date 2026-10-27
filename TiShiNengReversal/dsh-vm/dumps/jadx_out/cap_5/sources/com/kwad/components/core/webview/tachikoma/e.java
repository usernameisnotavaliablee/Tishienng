package com.kwad.components.core.webview.tachikoma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c qn;


    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.tachikoma.e r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.qn
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.qn = r2
            return
    }

    public final void b(com.kwad.sdk.core.response.a.a r2) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.qn
            if (r0 == 0) goto Lc
            com.kwad.components.core.webview.tachikoma.e$1 r0 = new com.kwad.components.core.webview.tachikoma.e$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
        Lc:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerConvertStatusListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.qn = r0
            return
    }
}
