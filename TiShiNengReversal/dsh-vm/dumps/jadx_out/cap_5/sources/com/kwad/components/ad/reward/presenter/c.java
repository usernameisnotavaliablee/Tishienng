package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends com.kwad.components.ad.reward.presenter.b {
    private android.widget.ImageView vy;
    private com.kwad.sdk.core.response.model.AdInfo vz;


    public c(com.kwad.sdk.core.response.model.AdInfo r1) {
            r0 = this;
            r0.<init>()
            r0.vz = r1
            return
    }

    private static void a(android.widget.ImageView r2, java.lang.String r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r0 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r0.<init>()
            r1 = 50
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r0 = r0.setBlurRadius(r1)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r0 = r0.build()
            com.kwad.components.ad.reward.presenter.c$1 r1 = new com.kwad.components.ad.reward.presenter.c$1
            r1.<init>()
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r2, r3, r4, r0, r1)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r1 = r4.iA()
            if (r1 != 0) goto L35
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r1 = r0.adInfoList
            int r1 = r1.size()
            if (r1 <= 0) goto L35
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r1 = r0.adInfoList
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.kwad.sdk.core.response.model.AdInfo r1 = (com.kwad.sdk.core.response.model.AdInfo) r1
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.X(r1)
            android.widget.ImageView r2 = r4.vy
            int r3 = r4.iC()
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r4.vy     // Catch: java.lang.Throwable -> L31
            a(r2, r1, r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
        L35:
            return
    }

    protected int iB() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_blur_video_cover
            return r0
    }

    protected int iC() {
            r2 = this;
            r2.getContext()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.O(r0)
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L15
            return r1
        L15:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.N(r0)
            if (r0 == 0) goto L26
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L26
            return r1
        L26:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.ex(r0)
            if (r0 == 0) goto L37
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L37
            return r1
        L37:
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.vz
            boolean r0 = com.kwad.components.ad.reward.g.g(r0)
            if (r0 == 0) goto L40
            return r1
        L40:
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.vz
            boolean r0 = com.kwad.sdk.core.response.b.a.cJ(r0)
            if (r0 == 0) goto L55
            boolean r0 = com.kwad.components.ad.reward.a.b.hM()
            if (r0 == 0) goto L55
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L55
            return r1
        L55:
            r0 = 8
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = r1.iB()
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.vy = r0
            return
    }
}
