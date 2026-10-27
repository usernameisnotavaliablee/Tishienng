package com.kwad.components.ad.reward.widget.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ActionBarAppPortrait extends android.widget.LinearLayout implements com.kwad.sdk.widget.d {
    private com.kwad.components.ad.widget.AppScoreView Ep;
    private com.kwad.components.core.page.widget.TextProgressBar Eq;
    private android.view.View Er;
    private com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait.a Eu;
    private com.kwad.sdk.api.KsAppDownloadListener dW;
    private android.widget.TextView ee;
    private android.widget.ImageView gw;
    private android.widget.TextView gy;
    private android.widget.TextView hE;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void O(boolean r1);
    }

    public ActionBarAppPortrait(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarAppPortrait(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarAppPortrait(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.initView()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.core.page.widget.TextProgressBar b(com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0) {
            com.kwad.components.core.page.widget.TextProgressBar r0 = r0.Eq
            return r0
    }

    static /* synthetic */ android.view.View c(com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0) {
            android.view.View r0 = r0.Er
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void d(android.view.View r5, boolean r6) {
            r4 = this;
            android.view.View r0 = r4.Er
            r1 = 1
            if (r5 != r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 2
        L8:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r3)
            com.kwad.components.core.e.d.c r3 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r3)
            com.kwad.components.core.e.d.a$a r2 = r2.az(r1)
            com.kwad.components.core.e.d.a$a r2 = r2.aA(r0)
            com.kwad.components.core.page.widget.TextProgressBar r3 = r4.Eq
            if (r5 != r3) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            com.kwad.components.core.e.d.a$a r5 = r2.aq(r1)
            com.kwad.components.core.e.d.a$a r5 = r5.aB(r0)
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait$2 r0 = new com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait$2
            r0.<init>(r4, r6)
            com.kwad.components.core.e.d.a$a r5 = r5.a(r0)
            com.kwad.components.core.e.d.a.a(r5)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait.a e(com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0) {
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait$a r0 = r0.Eu
            return r0
    }

    private com.kwad.sdk.api.KsAppDownloadListener getAppDownloadListener() {
            r1 = this;
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            if (r0 != 0) goto Lb
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait$1 r0 = new com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait$1
            r0.<init>(r1)
            r1.dW = r0
        Lb:
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            return r0
    }

    private void initView() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_video_actionbar_app_portrait
            com.kwad.sdk.o.m.inflate(r0, r1, r3)
            int r0 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.gw = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.ee = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hE = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_score
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.widget.AppScoreView r0 = (com.kwad.components.ad.widget.AppScoreView) r0
            r3.Ep = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_count
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.gy = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_btn
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.page.widget.TextProgressBar r0 = (com.kwad.components.core.page.widget.TextProgressBar) r0
            r3.Eq = r0
            android.content.Context r1 = r3.getContext()
            r2 = 1098907648(0x41800000, float:16.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            float r1 = (float) r1
            r0.setTextDimen(r1)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.Eq
            r1 = -1
            r0.setTextColor(r1)
            int r0 = com.kwad.sdk.R.id.ksad_download_bar_cover
            android.view.View r0 = r3.findViewById(r0)
            r3.Er = r0
            return
    }

    private void lq() {
            r7 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r7.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.az(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            com.kwad.sdk.core.response.model.AdInfo r2 = r7.mAdInfo
            float r2 = com.kwad.sdk.core.response.b.a.aA(r2)
            r3 = 1077936128(0x40400000, float:3.0)
            r4 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            r5 = 8
            if (r1 != 0) goto L60
            if (r3 == 0) goto L60
            android.widget.TextView r1 = r7.ee
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            android.content.Context r3 = r7.getContext()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r6)
            r1.bottomMargin = r3
            com.kwad.components.ad.widget.AppScoreView r1 = r7.Ep
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            android.content.Context r3 = r7.getContext()
            int r3 = com.kwad.sdk.c.a.a.a(r3, r6)
            r1.bottomMargin = r3
            android.widget.TextView r1 = r7.gy
            r1.setText(r0)
            android.widget.TextView r0 = r7.gy
            r0.setVisibility(r4)
            com.kwad.components.ad.widget.AppScoreView r0 = r7.Ep
            r0.setVisibility(r4)
            com.kwad.components.ad.widget.AppScoreView r0 = r7.Ep
            r0.setScore(r2)
            android.widget.TextView r0 = r7.hE
            r0.setVisibility(r5)
            return
        L60:
            if (r1 != 0) goto L77
            android.widget.TextView r1 = r7.gy
            r1.setText(r0)
            android.widget.TextView r0 = r7.gy
            r0.setVisibility(r4)
            com.kwad.components.ad.widget.AppScoreView r0 = r7.Ep
            r0.setVisibility(r5)
            android.widget.TextView r0 = r7.hE
            r0.setVisibility(r5)
            return
        L77:
            if (r3 == 0) goto L8e
            android.widget.TextView r0 = r7.gy
            r0.setVisibility(r5)
            com.kwad.components.ad.widget.AppScoreView r0 = r7.Ep
            r0.setScore(r2)
            com.kwad.components.ad.widget.AppScoreView r0 = r7.Ep
            r0.setVisibility(r4)
            android.widget.TextView r0 = r7.hE
            r0.setVisibility(r5)
            return
        L8e:
            android.widget.TextView r0 = r7.hE
            com.kwad.sdk.core.response.model.AdInfo r1 = r7.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.gy
            r0.setVisibility(r5)
            com.kwad.components.ad.widget.AppScoreView r0 = r7.Ep
            r0.setVisibility(r5)
            android.widget.TextView r0 = r7.hE
            r0.setVisibility(r4)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.d(r2, r0)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r3, com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait.a r4) {
            r1 = this;
            r1.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r2)
            r1.mAdInfo = r0
            r1.Eu = r4
            r1.mApkDownloadHelper = r3
            android.widget.ImageView r3 = r1.gw
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.co(r0)
            r0 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r3, r4, r2, r0)
            android.widget.TextView r2 = r1.ee
            com.kwad.sdk.core.response.model.AdInfo r3 = r1.mAdInfo
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.cl(r3)
            r2.setText(r3)
            r1.lq()
            com.kwad.components.core.page.widget.TextProgressBar r2 = r1.Eq
            com.kwad.sdk.core.response.model.AdInfo r3 = r1.mAdInfo
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.aE(r3)
            r4 = 0
            r2.e(r3, r4)
            com.kwad.components.core.e.d.c r2 = r1.mApkDownloadHelper
            if (r2 == 0) goto L3c
            com.kwad.sdk.api.KsAppDownloadListener r3 = r1.getAppDownloadListener()
            r2.b(r3)
        L3c:
            r2 = 1
            r1.setClickable(r2)
            com.kwad.sdk.widget.h r2 = new com.kwad.sdk.widget.h
            r2.<init>(r1, r1)
            com.kwad.sdk.widget.h r2 = new com.kwad.sdk.widget.h
            android.view.View r3 = r1.Er
            r2.<init>(r3, r1)
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
}
