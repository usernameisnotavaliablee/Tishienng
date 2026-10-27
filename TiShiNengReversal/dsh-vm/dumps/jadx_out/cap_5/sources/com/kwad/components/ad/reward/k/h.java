package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.ad.reward.k.h.a AF;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void af(int r1);
    }

    public h(com.kwad.components.ad.reward.k.h.a r1) {
            r0 = this;
            r0.<init>()
            r0.AF = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            com.kwad.components.ad.reward.k.h$a r2 = r0.AF
            if (r2 == 0) goto L16
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            r2.<init>(r1)     // Catch: org.json.JSONException -> L10
            java.lang.String r1 = "severCheckResult"
            int r1 = r2.optInt(r1)     // Catch: org.json.JSONException -> L10
            goto L11
        L10:
            r1 = 0
        L11:
            com.kwad.components.ad.reward.k.h$a r2 = r0.AF
            r2.af(r1)
        L16:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "hasReward"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.AF = r0
            return
    }
}
