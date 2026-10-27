package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.ad.feed.widget.b {


    public f(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.setmIsShowComplianceView(r1)
            r1 = 4
            r0.setRadiusDp(r1)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.feed.widget.f r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.ad.feed.widget.f r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    @Override // com.kwad.components.ad.feed.widget.b, com.kwad.components.core.widget.b
    public final void bw() {
            r2 = this;
            super.bw()
            int r0 = com.kwad.sdk.R.id.ksad_feed_biserial_image
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            r0.setClipToOutline(r1)
        Lf:
            return
    }

    @Override // com.kwad.components.ad.feed.widget.b
    public final void cl() {
            r2 = this;
            android.widget.ImageView r0 = r2.hB
            com.kwad.components.ad.feed.widget.f$1 r1 = new com.kwad.components.ad.feed.widget.f$1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_biserial_image
            return r0
    }

    @Override // com.kwad.components.core.widget.b
    public final void setMargin(int r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.core.config.e.Gh()
            if (r1 != 0) goto La
            r1 = -1
            r0.setBackgroundColor(r1)
        La:
            return
    }
}
