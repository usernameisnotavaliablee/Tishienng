package com.kwad.components.core.webview.tachikoma.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class c implements com.kwad.sdk.components.m {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void b(com.kwad.components.core.webview.jshandler.a.C0094a r1);

    @Override // com.kwad.sdk.components.m
    public final java.lang.Object call(@androidx.annotation.Nullable java.lang.Object... r3) {
            r2 = this;
            java.lang.String r0 = " "
            if (r3 == 0) goto L14
            int r1 = r3.length     // Catch: java.lang.Throwable -> L12
            if (r1 <= 0) goto L14
            r1 = 0
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L12
            boolean r1 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L25
        L14:
            com.kwad.components.core.webview.jshandler.a$a r3 = new com.kwad.components.core.webview.jshandler.a$a     // Catch: java.lang.Throwable -> L12
            r3.<init>()     // Catch: java.lang.Throwable -> L12
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            r3.parseJson(r1)     // Catch: java.lang.Throwable -> L12
            r2.b(r3)     // Catch: java.lang.Throwable -> L12
            goto L28
        L25:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L28:
            r3 = 0
            return r3
    }
}
