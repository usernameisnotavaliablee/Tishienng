package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q extends com.kwad.components.core.webview.jshandler.z {
    private java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> AK;
    private long yU;

    public q(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r1, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r2, @androidx.annotation.Nullable com.kwad.components.ad.reward.g r3, long r4, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r6, @androidx.annotation.Nullable android.content.DialogInterface.OnDismissListener r7) {
            r0 = this;
            r0.<init>(r1, r2, r6, r7)
            r0.yU = r4
            if (r3 == 0) goto Le
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.AK = r1
        Le:
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.z
    public final com.kwad.components.core.e.d.a.C0073a a(com.kwad.components.core.e.d.a.C0073a r6, com.kwad.sdk.core.webview.d.b.a r7, com.kwad.sdk.core.response.model.AdTemplate r8) {
            r5 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r5.AK
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L19
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r0 = r5.AK
            java.lang.Object r0 = r0.get()
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            long r0 = r0.getPlayDuration()
            goto L23
        L19:
            long r0 = r5.yU
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            goto L23
        L22:
            r0 = r2
        L23:
            com.kwad.components.core.e.d.a$a r6 = super.a(r6, r7, r8)
            com.kwad.components.core.e.d.a$a r6 = r6.B(r0)
            return r6
    }

    @Override // com.kwad.components.core.webview.jshandler.z
    public final void kr() {
            r3 = this;
            super.kr()
            com.kwad.sdk.core.webview.b r0 = r3.acw
            if (r0 == 0) goto L16
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.hV()
            com.kwad.sdk.core.webview.b r1 = r3.acw
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            int r2 = com.kwad.components.ad.reward.c.b.STATUS_NONE
            r0.c(r1, r2)
        L16:
            return
    }
}
