package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends com.kwad.components.core.widget.b<com.kwad.sdk.core.response.model.AdResultData, com.kwad.sdk.core.response.model.AdTemplate> {
    private boolean hs;
    protected long ht;
    private float hu;
    private float hv;
    private int hw;
    private android.view.MotionEvent hx;
    protected com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener hy;


    public a(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.hw = r1
            com.kwad.components.ad.feed.widget.a$1 r1 = new com.kwad.components.ad.feed.widget.a$1
            r1.<init>(r0)
            r0.hy = r1
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.feed.widget.a r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private boolean a(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == r1) goto L1d
            r2 = 3
            if (r0 != r2) goto L3e
            float r0 = r4.getX()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3e
            float r0 = r4.getY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3e
        L1d:
            float r0 = r4.getX()
            float r2 = r3.hu
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            r2 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L40
            float r4 = r4.getY()
            float r0 = r3.hv
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3e
            goto L40
        L3e:
            r4 = 0
            return r4
        L40:
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.ad.feed.widget.a r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    public final void cj() {
            r4 = this;
            boolean r0 = r4.hs
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.hs = r0
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            long r2 = r4.getStayTime()
            com.kwad.components.ad.feed.monitor.b.a(r1, r0, r2)
            return
    }

    protected final void ck() {
            r2 = this;
            int r0 = com.kwad.sdk.R.id.ksad_compliance_view
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.ComplianceTextView r0 = (com.kwad.components.core.widget.ComplianceTextView) r0
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aP(r1)
            if (r1 == 0) goto L1a
            r1 = 0
            r0.setVisibility(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.setAdTemplate(r1)
            return
        L1a:
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L1d
            float r1 = r4.getX()
            r3.hu = r1
            float r1 = r4.getY()
            r3.hv = r1
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4)
            r3.hx = r1
            r1 = 0
            r3.hw = r1
        L1d:
            boolean r1 = r3.a(r4)
            if (r1 == 0) goto L3b
            android.view.MotionEvent r1 = r3.hx
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            boolean r1 = com.kwad.sdk.utils.b.a(r1, r4, r2)
            r2 = 1
            if (r1 != 0) goto L2f
            return r2
        L2f:
            r1 = 3
            if (r0 != r1) goto L3b
            int r0 = r3.hw
            if (r0 != 0) goto L3b
            r4.setAction(r2)
            r3.hw = r2
        L3b:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
    }
}
