package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n extends com.kwad.components.core.webview.tachikoma.b.w {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int status;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void aa(boolean r2) {
            r1 = this;
            com.kwad.components.ad.reward.k.n$a r0 = new com.kwad.components.ad.reward.k.n$a
            r0.<init>()
            r0.status = r2
            r1.b(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerNeoStatusListener"
            return r0
    }
}
