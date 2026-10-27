package com.kwad.components.core.webview.tachikoma.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class g implements com.kwad.sdk.components.m {


    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract void a(com.kwad.components.core.webview.tachikoma.c.y r1);

    protected abstract void bP();

    protected abstract void bQ();

    protected abstract void bR();

    protected abstract void bS();

    @Override // com.kwad.sdk.components.m
    public final java.lang.Object call(@androidx.annotation.Nullable java.lang.Object... r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L28
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L28
        L7:
            com.kwad.components.core.webview.tachikoma.c.y r1 = new com.kwad.components.core.webview.tachikoma.c.y     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L28
            boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L28
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L28
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L28
            r1.parseJson(r3)     // Catch: java.lang.Throwable -> L28
            com.kwad.components.core.webview.tachikoma.a.g$1 r5 = new com.kwad.components.core.webview.tachikoma.a.g$1     // Catch: java.lang.Throwable -> L28
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> L28
            com.kwad.sdk.utils.bw.runOnUiThread(r5)     // Catch: java.lang.Throwable -> L28
        L28:
            return r0
    }
}
