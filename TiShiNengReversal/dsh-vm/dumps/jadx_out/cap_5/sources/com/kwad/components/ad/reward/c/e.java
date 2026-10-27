package com.kwad.components.ad.reward.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.sdk.core.webview.c.a {
    private java.lang.String TAG;
    private com.kwad.sdk.core.webview.c.c qn;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String uo;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public e() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExtraDialogListener"
            r0.<init>(r1)
            int r1 = r2.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.TAG = r0
            java.lang.String r1 = "create: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            return
    }

    private void L(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L17
        L7:
            com.kwad.sdk.core.webview.c.c r0 = r1.qn
            if (r0 == 0) goto L17
            com.kwad.components.ad.reward.c.e$a r0 = new com.kwad.components.ad.reward.c.e$a
            r0.<init>()
            r0.uo = r2
            com.kwad.sdk.core.webview.c.c r2 = r1.qn
            r2.a(r0)
        L17:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            java.lang.String r3 = r2.TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleJsCall: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r3, r0)
            r2.qn = r4
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerExtraDialogListener"
            return r0
    }

    public final void ia() {
            r2 = this;
            java.lang.String r0 = r2.TAG
            java.lang.String r1 = "notifyDialogClose: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            java.lang.String r0 = "close"
            r2.L(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            java.lang.String r0 = r2.TAG
            java.lang.String r1 = "onDestroy: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            r0 = 0
            r2.qn = r0
            return
    }
}
