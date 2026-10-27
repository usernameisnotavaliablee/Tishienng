package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.feed.widget.c {
    public g(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.setmIsShowComplianceView(r1)
            r1 = 4
            r0.setRadiusDp(r1)
            return
    }

    @Override // com.kwad.components.ad.feed.widget.c, com.kwad.components.core.widget.b
    public final void bw() {
            r2 = this;
            super.bw()
            int r0 = com.kwad.sdk.R.id.ksad_feed_biserial_video
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            r0.setClipToOutline(r1)
        Lf:
            return
    }

    @Override // com.kwad.components.ad.feed.widget.c
    protected final void cr() {
            r2 = this;
            com.kwad.sdk.widget.KSRelativeLayout r0 = r2.hL
            r1 = 1071944265(0x3fe49249, float:1.7857143)
            r0.setRatio(r1)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_biserial_video
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
