package com.kwad.components.ad.reward.k.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.webview.tachikoma.d.e {
    private static java.lang.ref.WeakReference<com.kwad.components.ad.reward.k.a.b> AP;
    private com.kwad.components.ad.reward.g AM;
    private long AO;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.k.a.b a(com.kwad.components.ad.reward.g r2, android.app.Activity r3, long r4, android.content.DialogInterface.OnDismissListener r6, com.kwad.components.core.webview.tachikoma.f.c r7) {
            r0 = 0
            if (r3 == 0) goto L41
            boolean r1 = r3.isFinishing()
            if (r1 == 0) goto La
            goto L41
        La:
            boolean r1 = kt()
            if (r1 == 0) goto L11
            return r0
        L11:
            com.kwad.components.core.webview.tachikoma.d.e$b r0 = new com.kwad.components.core.webview.tachikoma.d.e$b
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.dP(r1)
            r0.bg(r1)
            com.kwad.components.ad.reward.k.a.b r2 = a(r2, r0)
            r2.Yd = r7
            r2.d(r6)
            r2.q(r4)
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r4 = "tkExtraReward"
            r2.show(r3, r4)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            com.kwad.components.ad.reward.k.a.b.AP = r3
            return r2
        L41:
            return r0
    }

    public static com.kwad.components.ad.reward.k.a.b a(com.kwad.components.ad.reward.g r2, com.kwad.components.core.webview.tachikoma.d.e.b r3) {
            com.kwad.components.ad.reward.k.a.b r0 = new com.kwad.components.ad.reward.k.a.b
            r0.<init>()
            r0.AM = r2
            com.kwad.sdk.core.response.model.AdResultData r2 = r3.iu()
            r0.mAdResultData = r2
            java.lang.String r2 = r3.getTemplateId()
            r0.AI = r2
            boolean r2 = r3.ln()
            r0.aht = r2
            boolean r2 = r3.vH()
            r0.ahD = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "templateId"
            java.lang.String r3 = r3.getTemplateId()
            r2.putString(r1, r3)
            r0.setArguments(r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.k.a.b a(com.kwad.components.ad.reward.k.a.b r2, android.app.Activity r3, long r4, com.kwad.components.core.webview.tachikoma.f.c r6, com.kwad.components.core.webview.tachikoma.d.e.a r7) {
            r0 = 0
            if (r3 == 0) goto L2f
            boolean r1 = r3.isFinishing()
            if (r1 == 0) goto La
            goto L2f
        La:
            boolean r1 = kt()
            if (r1 == 0) goto L11
            return r0
        L11:
            r2.Yd = r6
            r2.ahu = r7
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r6 = "tkCloseDialog"
            r2.show(r3, r6)
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L27
            r2.q(r4)
        L27:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            com.kwad.components.ad.reward.k.a.b.AP = r3
            return r2
        L2f:
            return r0
    }

    private static boolean kt() {
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.k.a.b> r0 = com.kwad.components.ad.reward.k.a.b.AP
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private void q(long r2) {
            r1 = this;
            r1.AO = r2
            com.kwad.components.core.webview.tachikoma.d.b r0 = r1.ahp
            if (r0 == 0) goto L8
            r0.AO = r2
        L8:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e
    public final com.kwad.components.core.webview.tachikoma.d.b ku() {
            r2 = this;
            com.kwad.components.ad.reward.k.a.a r0 = new com.kwad.components.ad.reward.k.a.a
            com.kwad.components.ad.reward.g r1 = r2.AM
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e
    public final com.kwad.components.core.webview.tachikoma.d.c kv() {
            r1 = this;
            com.kwad.components.ad.reward.k.a.c r0 = new com.kwad.components.ad.reward.k.a.c
            r0.<init>()
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e
    public final void kw() {
            r3 = this;
            super.kw()
            com.kwad.components.core.webview.tachikoma.d.b r0 = r3.ahp
            long r1 = r3.AO
            r0.AO = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.d.e, android.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            r1.AM = r0
            com.kwad.components.ad.reward.k.a.b.AP = r0
            return
    }
}
