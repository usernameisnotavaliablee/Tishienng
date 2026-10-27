package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ar implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;

    public ar(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mAdTemplate = r2
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r7, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r8) {
            r6 = this;
            com.kwad.components.core.webview.a.c r0 = new com.kwad.components.core.webview.a.c
            r0.<init>()
            android.content.Context r1 = r6.mContext
            r2 = 2
            r3 = -1
            if (r1 != 0) goto L16
            com.kwad.sdk.core.response.model.AdTemplate r7 = r6.mAdTemplate
            com.kwad.sdk.core.adlog.c.j(r7, r2)
            java.lang.String r7 = "context为空"
            r8.onError(r3, r7)
            return
        L16:
            r1 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6f
            r4.<init>(r7)     // Catch: java.lang.Exception -> L6f
            r0.parseJson(r4)     // Catch: java.lang.Exception -> L6f
            com.kwad.sdk.core.response.model.AdTemplate r7 = r6.mAdTemplate     // Catch: java.lang.Exception -> L6f
            int r4 = r0.acb     // Catch: java.lang.Exception -> L30
            if (r4 <= 0) goto L33
            com.kwad.sdk.core.response.model.AdResultData r4 = com.kwad.components.core.o.a.e.a.a.aI(r4)     // Catch: java.lang.Exception -> L30
            java.lang.String r5 = r0.NN     // Catch: java.lang.Exception -> L30
            com.kwad.sdk.core.response.model.AdTemplate r7 = com.kwad.sdk.core.response.b.c.a(r4, r5)     // Catch: java.lang.Exception -> L30
            goto L33
        L30:
            r0 = move-exception
            r1 = r7
            goto L70
        L33:
            if (r7 != 0) goto L4e
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate     // Catch: java.lang.Exception -> L30
            com.kwad.sdk.core.adlog.c.j(r1, r2)     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = "adTemplate为空："
            r1.<init>(r4)     // Catch: java.lang.Exception -> L30
            int r0 = r0.acb     // Catch: java.lang.Exception -> L30
            r1.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L30
            r8.onError(r3, r0)     // Catch: java.lang.Exception -> L30
            return
        L4e:
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.dm(r4)     // Catch: java.lang.Exception -> L30
            com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo r0 = r0.aR(r4)     // Catch: java.lang.Exception -> L30
            android.content.Context r4 = r6.mContext     // Catch: java.lang.Exception -> L30
            com.kwad.sdk.commercial.smallApp.JumpFrom r5 = com.kwad.sdk.commercial.smallApp.JumpFrom.H5     // Catch: java.lang.Exception -> L30
            int r0 = com.kwad.components.core.e.d.e.a(r4, r0, r5, r7)     // Catch: java.lang.Exception -> L30
            r4 = 1
            if (r0 != r4) goto L69
            r8.a(r1)     // Catch: java.lang.Exception -> L30
            return
        L69:
            java.lang.String r0 = "跳转失败"
            r8.onError(r3, r0)     // Catch: java.lang.Exception -> L30
            return
        L6f:
            r0 = move-exception
        L70:
            com.kwad.sdk.core.adlog.c.j(r1, r2)
            java.lang.String r7 = "解析失败"
            r8.onError(r3, r7)
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "openWechatMiniProgram"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
