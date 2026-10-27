package com.kwad.components.core.webview.tachikoma.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b implements com.kwad.sdk.components.m {
    private android.os.Handler acR;


    public b() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.acR = r0
            return
    }

    public abstract void c(com.kwad.sdk.commercial.model.WebCloseStatus r1);

    @Override // com.kwad.sdk.components.m
    public final java.lang.Object call(@androidx.annotation.Nullable java.lang.Object... r3) {
            r2 = this;
            com.kwad.sdk.commercial.model.WebCloseStatus r0 = new com.kwad.sdk.commercial.model.WebCloseStatus     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1c
            if (r1 <= 0) goto L1e
            r1 = 0
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L29
        L1e:
            android.os.Handler r3 = r2.acR     // Catch: java.lang.Throwable -> L1c
            com.kwad.components.core.webview.tachikoma.a.b$1 r1 = new com.kwad.components.core.webview.tachikoma.a.b$1     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1c
            r3.post(r1)     // Catch: java.lang.Throwable -> L1c
            goto L2c
        L29:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L2c:
            r3 = 0
            return r3
    }
}
