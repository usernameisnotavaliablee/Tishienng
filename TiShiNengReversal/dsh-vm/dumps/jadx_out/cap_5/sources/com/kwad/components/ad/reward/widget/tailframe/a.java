package com.kwad.components.ad.reward.widget.tailframe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a implements com.kwad.sdk.widget.d {
    protected android.view.View EA;
    protected android.widget.ImageView EB;
    private com.kwad.components.ad.widget.tailframe.appbar.a ED;
    private com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View EE;
    private com.kwad.components.ad.reward.widget.tailframe.b EF;
    private com.kwad.components.core.page.widget.TextProgressBar EG;
    private android.view.View EH;
    private int EI;
    private android.widget.TextView gD;
    protected com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    protected com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected com.kwad.components.core.widget.KsLogoView mLogoView;
    private org.json.JSONObject mReportExtData;
    private com.kwad.components.ad.reward.g tm;



    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.EI = r1
            return
    }

    static /* synthetic */ com.kwad.components.ad.widget.tailframe.appbar.a a(com.kwad.components.ad.reward.widget.tailframe.a r0) {
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r0.ED
            return r0
    }

    static /* synthetic */ com.kwad.components.core.page.widget.TextProgressBar b(com.kwad.components.ad.reward.widget.tailframe.a r0) {
            com.kwad.components.core.page.widget.TextProgressBar r0 = r0.EG
            return r0
    }

    private void bindDownloadListener() {
            r4 = this;
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            org.json.JSONObject r2 = r4.mReportExtData
            com.kwad.components.ad.reward.widget.tailframe.a$1 r3 = new com.kwad.components.ad.reward.widget.tailframe.a$1
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            r4.mApkDownloadHelper = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.widget.tailframe.b c(com.kwad.components.ad.reward.widget.tailframe.a r0) {
            com.kwad.components.ad.reward.widget.tailframe.b r0 = r0.EF
            return r0
    }

    private void d(android.view.View r6, boolean r7) {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r7 == 0) goto Le
            r7 = 1
            goto L10
        Le:
            r7 = 153(0x99, float:2.14E-43)
        L10:
            com.kwad.components.ad.reward.g r0 = r5.tm
            android.view.View r3 = r5.EA
            android.content.Context r3 = r3.getContext()
            android.view.View r4 = r5.EH
            if (r6 != r4) goto L1d
            r1 = 1
        L1d:
            r0.a(r2, r3, r7, r1)
            return
        L21:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L2f
            com.kwad.components.core.page.widget.TextProgressBar r0 = r5.EG
            if (r6 != r0) goto L34
        L2d:
            r1 = 1
            goto L34
        L2f:
            android.widget.TextView r0 = r5.gD
            if (r6 != r0) goto L34
            goto L2d
        L34:
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r6.getContext()
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r3)
            com.kwad.components.core.e.d.c r3 = r5.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r0 = r0.b(r3)
            r3 = 0
            if (r1 != r2) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = 0
        L4f:
            com.kwad.components.core.e.d.a$a r0 = r0.aA(r4)
            com.kwad.components.core.e.d.a$a r0 = r0.az(r2)
            com.kwad.components.core.page.widget.TextProgressBar r4 = r5.EG
            if (r6 != r4) goto L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            com.kwad.components.core.e.d.a$a r6 = r0.aq(r2)
            com.kwad.components.core.e.d.a$a r6 = r6.aB(r1)
            com.kwad.components.ad.reward.widget.tailframe.a$2 r0 = new com.kwad.components.ad.reward.widget.tailframe.a$2
            r0.<init>(r5, r7)
            com.kwad.components.core.e.d.a$a r6 = r6.a(r0)
            com.kwad.components.core.e.d.a.a(r6)
            return
    }

    private void lr() {
            r2 = this;
            android.view.View r0 = r2.EA
            r1 = 0
            r0.setOnClickListener(r1)
            r2.mApkDownloadHelper = r1
            return
    }

    private void lt() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L32
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            if (r0 == 0) goto L13
            goto L32
        L13:
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r4.EE
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            r0.j(r3)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r4.EE
            android.widget.TextView r0 = r0.getH5OpenBtn()
            r4.gD = r0
            r0.setClickable(r2)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r4.EE
            r0.setVisibility(r1)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.widget.TextView r1 = r4.gD
            r0.<init>(r1, r4)
            return
        L32:
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r4.ED
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            r0.j(r3)
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r4.ED
            r0.setVisibility(r1)
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r4.ED
            com.kwad.components.core.page.widget.TextProgressBar r0 = r0.getTextProgressBar()
            r4.EG = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            if (r0 != 0) goto L5e
            com.kwad.components.core.page.widget.TextProgressBar r0 = r4.EG
            r0.setClickable(r2)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            com.kwad.components.core.page.widget.TextProgressBar r1 = r4.EG
            r0.<init>(r1, r4)
            r4.bindDownloadListener()
            return
        L5e:
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r4.ED
            android.view.View r0 = r0.getBtnInstallContainer()
            r4.EH = r0
            r0.setClickable(r2)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.View r1 = r4.EH
            r0.<init>(r1, r4)
            return
    }

    public void B(android.content.Context r4) {
            r3 = this;
            int r0 = r3.EI
            r1 = 0
            r2 = 0
            android.view.View r4 = com.kwad.sdk.o.m.a(r4, r0, r1, r2)
            r3.EA = r4
            int r0 = com.kwad.sdk.R.id.ksad_video_thumb_img
            android.view.View r4 = r4.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.EB = r4
            android.view.View r4 = r3.EA
            int r0 = com.kwad.sdk.R.id.ksad_video_tf_logo
            android.view.View r4 = r4.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r4 = (com.kwad.components.core.widget.KsLogoView) r4
            r3.mLogoView = r4
            android.view.View r4 = r3.EA
            int r0 = com.kwad.sdk.R.id.ksad_video_app_tail_frame
            android.view.View r4 = r4.findViewById(r0)
            com.kwad.components.ad.widget.tailframe.appbar.a r4 = (com.kwad.components.ad.widget.tailframe.appbar.a) r4
            r3.ED = r4
            android.view.View r4 = r3.EA
            int r0 = com.kwad.sdk.R.id.ksad_video_h5_tail_frame
            android.view.View r4 = r4.findViewById(r0)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r4 = (com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View) r4
            r3.EE = r4
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.d(r2, r0)
            return
    }

    public void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, org.json.JSONObject r2, com.kwad.components.ad.reward.widget.tailframe.b r3) {
            r0 = this;
            r0.mAdTemplate = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            r0.mAdInfo = r1
            r0.mReportExtData = r2
            r0.EF = r3
            com.kwad.components.core.widget.KsLogoView r1 = r0.mLogoView
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.mAdTemplate
            r1.aP(r2)
            r0.lt()
            android.view.View r1 = r0.EA
            r2 = 1
            r1.setClickable(r2)
            com.kwad.sdk.widget.h r1 = new com.kwad.sdk.widget.h
            android.view.View r2 = r0.EA
            r1.<init>(r2, r0)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            r1.d(r2, r0)
        Lc:
            return
    }

    public final void destroy() {
            r2 = this;
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r2.ED
            r1 = 8
            if (r0 == 0) goto Le
            r0.lv()
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r2.ED
            r0.setVisibility(r1)
        Le:
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r2.EE
            if (r0 == 0) goto L1a
            r0.lv()
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r2.EE
            r0.setVisibility(r1)
        L1a:
            r2.lr()
            return
    }

    public final void f(boolean r2, boolean r3) {
            r1 = this;
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r1.EE
            r0.g(r2, r3)
            return
    }

    public final void la() {
            r1 = this;
            com.kwad.components.ad.widget.tailframe.appbar.a r0 = r1.ED
            if (r0 == 0) goto L7
            r0.lv()
        L7:
            com.kwad.components.ad.reward.widget.tailframe.TailFrameBarH5View r0 = r1.EE
            if (r0 == 0) goto Le
            r0.lv()
        Le:
            return
    }

    public final android.view.View ls() {
            r1 = this;
            android.view.View r0 = r1.EA
            return r0
    }

    public final void setCallerContext(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.tm = r1
            return
    }
}
