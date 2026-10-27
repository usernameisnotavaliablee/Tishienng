package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ac implements com.kwad.sdk.core.webview.c.a {
    private boolean acJ;
    private android.os.Handler acR;
    private boolean acV;
    private boolean acW;
    private final com.kwad.sdk.core.webview.b acw;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.d.a.a eT;

    @androidx.annotation.Nullable
    private final com.kwad.components.core.e.d.c mApkDownloadHelper;



    public ac(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r8, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r9, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r10) {
            r7 = this;
            r5 = 0
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ac(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r8, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r9, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r10, byte r11) {
            r7 = this;
            r5 = 0
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ac(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r2, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r3, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r4, boolean r5, boolean r6, boolean r7) {
            r1 = this;
            r1.<init>()
            r6 = 0
            r1.acV = r6
            r1.acW = r6
            r1.acJ = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r1.acR = r5
            r1.acw = r2
            r1.mApkDownloadHelper = r3
            r1.acV = r6
            if (r3 == 0) goto L21
            r2 = 1
            r3.aG(r2)
        L21:
            r1.eT = r4
            r1.acW = r7
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.b a(com.kwad.components.core.webview.jshandler.ac r0) {
            com.kwad.sdk.core.webview.b r0 = r0.acw
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.d.a.a b(com.kwad.components.core.webview.jshandler.ac r0) {
            com.kwad.sdk.core.webview.d.a.a r0 = r0.eT
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.c c(com.kwad.components.core.webview.jshandler.ac r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.core.webview.jshandler.ac r0) {
            boolean r0 = r0.acJ
            return r0
    }

    static /* synthetic */ boolean e(com.kwad.components.core.webview.jshandler.ac r0) {
            boolean r0 = r0.acV
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.core.webview.jshandler.ac r0) {
            boolean r0 = r0.acW
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.sdk.core.webview.b r0 = r2.acw
            boolean r0 = r0.KJ()
            if (r0 == 0) goto Lf
            r3 = -1
            java.lang.String r0 = "native adTemplate is null"
            r4.onError(r3, r0)
            return
        Lf:
            com.kwad.sdk.core.webview.d.b.a r0 = new com.kwad.sdk.core.webview.d.b.a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L20
            r1.<init>(r3)     // Catch: org.json.JSONException -> L20
            r0.parseJson(r1)     // Catch: org.json.JSONException -> L20
            r3 = 1
            r0.OU = r3     // Catch: org.json.JSONException -> L20
            goto L24
        L20:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r3)
        L24:
            com.kwad.sdk.core.webview.b r3 = r2.acw
            boolean r3 = r3.aMP
            if (r3 == 0) goto L35
            android.os.Handler r3 = r2.acR
            com.kwad.components.core.webview.jshandler.ac$1 r1 = new com.kwad.components.core.webview.jshandler.ac$1
            r1.<init>(r2, r0)
            r3.post(r1)
            goto L43
        L35:
            com.kwad.sdk.core.webview.d.a.a r3 = r2.eT
            if (r3 == 0) goto L43
            android.os.Handler r3 = r2.acR
            com.kwad.components.core.webview.jshandler.ac$2 r1 = new com.kwad.components.core.webview.jshandler.ac$2
            r1.<init>(r2, r0)
            r3.post(r1)
        L43:
            r3 = 0
            r4.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "convert"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            android.os.Handler r0 = r2.acR
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.eT = r1
            return
    }
}
