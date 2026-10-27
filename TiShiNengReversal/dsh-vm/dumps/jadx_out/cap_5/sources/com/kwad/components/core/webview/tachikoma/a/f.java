package com.kwad.components.core.webview.tachikoma.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class f implements com.kwad.sdk.components.m {
    private android.os.Handler acR;


    public f() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.acR = r0
            return
    }

    protected abstract void a(com.kwad.components.core.webview.jshandler.al.a r1);

    @Override // com.kwad.sdk.components.m
    public final java.lang.Object call(java.lang.Object... r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L31
            int r1 = r5.length     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L7
            goto L31
        L7:
            com.kwad.components.core.webview.jshandler.al$a r1 = new com.kwad.components.core.webview.jshandler.al$a     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r5 = move-exception
            goto L2e
        L1f:
            r3 = r0
        L20:
            r1.parseJson(r3)     // Catch: java.lang.Throwable -> L1d
            android.os.Handler r5 = r4.acR     // Catch: java.lang.Throwable -> L1d
            com.kwad.components.core.webview.tachikoma.a.f$1 r2 = new com.kwad.components.core.webview.tachikoma.a.f$1     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1d
            r5.post(r2)     // Catch: java.lang.Throwable -> L1d
            goto L31
        L2e:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r5)
        L31:
            return r0
    }
}
