package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l {
    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.kwad.components.ad.reward.g r4) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            android.content.Context r1 = r4.mContext
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r3 = com.kwad.sdk.core.response.b.a.bK(r2)
            if (r3 == 0) goto L19
            com.kwad.components.core.playable.a r3 = r4.rF
            if (r3 == 0) goto L19
            boolean r3 = r3.rS()
            if (r3 == 0) goto L19
            goto L3d
        L19:
            boolean r3 = com.kwad.components.ad.reward.a.b.k(r2)
            if (r3 == 0) goto L20
            goto L3d
        L20:
            boolean r3 = r0.mXiaomiAppStoreDetailViewOpen
            if (r3 == 0) goto L25
            goto L3d
        L25:
            boolean r3 = com.kwad.sdk.core.response.b.a.aF(r2)
            if (r3 == 0) goto L3d
            boolean r2 = com.kwad.sdk.core.response.b.a.at(r2)
            if (r2 == 0) goto L3d
            boolean r2 = r0.hasEnterAdWebViewLandPageActivity
            if (r2 != 0) goto L3d
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            r2 = 1
            r4.hasEnterAdWebViewLandPageActivity = r2
            com.kwad.components.core.page.DownloadLandPageActivity.launch(r1, r0, r2)
        L3d:
            return
    }
}
