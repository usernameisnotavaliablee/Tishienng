package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bj implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.bj.a aeG;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    protected android.content.Context mContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean eM();
    }

    public bj(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            r0.mContext = r1
            r0.mAdTemplate = r2
            return
    }

    public final void a(com.kwad.components.core.webview.jshandler.bj.a r1) {
            r0 = this;
            r0.aeG = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.bj$a r2 = r1.aeG
            if (r2 == 0) goto L9
            boolean r2 = r2.eM()
            goto La
        L9:
            r2 = 1
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "handleJsCall launch AdPlayableActivityProxy : "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "WebShowPlayableHandler"
            com.kwad.sdk.core.d.c.d(r0, r3)
            if (r2 == 0) goto L26
            android.content.Context r2 = r1.mContext
            com.kwad.sdk.core.response.model.AdTemplate r3 = r1.mAdTemplate
            com.kwad.components.core.page.a.launch(r2, r3)
        L26:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "showPlayable"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
