package com.kwad.components.ad.widget.tailframe.appbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends android.widget.LinearLayout {
    protected com.kwad.components.ad.widget.KsAppTagsView BE;
    protected com.kwad.components.ad.j.a BH;
    private java.lang.Runnable BI;
    protected android.view.View Bw;
    protected android.widget.Button Bx;
    protected android.widget.Button By;
    protected com.kwad.components.core.page.widget.TextProgressBar EG;
    protected com.kwad.components.ad.widget.AppScoreView Ep;
    protected android.view.View GD;
    protected android.widget.TextView MU;
    protected android.widget.TextView gy;
    protected android.animation.ValueAnimator lJ;
    protected android.widget.ImageView nq;
    protected android.widget.TextView nr;



    public a(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public a(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public a(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            r0.<init>(r1, r2, r3)
            r0.initView()
            return
    }

    private void initView() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = r3.getLayoutId()
            android.view.View r0 = com.kwad.sdk.o.m.inflate(r0, r1, r3)
            r3.GD = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.nq = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_name
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.nr = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_score
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.widget.AppScoreView r0 = (com.kwad.components.ad.widget.AppScoreView) r0
            r3.Ep = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_count
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.gy = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_introduce
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.MU = r0
            int r0 = com.kwad.sdk.R.id.ksad_download_bar
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.page.widget.TextProgressBar r0 = (com.kwad.components.core.page.widget.TextProgressBar) r0
            r3.EG = r0
            android.content.Context r1 = r3.getContext()
            r2 = 1098907648(0x41800000, float:16.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            float r1 = (float) r1
            r0.setTextDimen(r1)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.EG
            r1 = -1
            r0.setTextColor(r1)
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_tags
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.widget.KsAppTagsView r0 = (com.kwad.components.ad.widget.KsAppTagsView) r0
            r3.BE = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_action
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.Bx = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_start
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.By = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_container
            android.view.View r0 = r3.findViewById(r0)
            r3.Bw = r0
            com.kwad.components.ad.j.a r0 = new com.kwad.components.ad.j.a
            android.view.View r1 = r3.GD
            r0.<init>(r1)
            r3.BH = r0
            return
    }

    private void nW() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.lJ
            if (r0 == 0) goto Lb
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lb
            return
        Lb:
            r0 = 3
            float[] r0 = new float[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [1065353216, 1067030938, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.lJ = r0
            r1 = 1200(0x4b0, double:5.93E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.lJ
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.lJ
            r1 = 1
            r0.setRepeatMode(r1)
            android.animation.ValueAnimator r0 = r3.lJ
            com.kwad.components.ad.widget.tailframe.appbar.a$2 r1 = new com.kwad.components.ad.widget.tailframe.appbar.a$2
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.lJ
            r0.start()
            return
    }

    public final void D(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdInfo r2) {
            r1 = this;
            int r2 = r2.status
            r0 = 1
            if (r2 == r0) goto Lf
            r0 = 2
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 == r0) goto Lf
            r1.nW()
            return
        Lf:
            r1.lv()
            return
    }

    public android.view.View getBtnInstallContainer() {
            r1 = this;
            android.view.View r0 = r1.Bw
            return r0
    }

    @androidx.annotation.LayoutRes
    public abstract int getLayoutId();

    public com.kwad.components.core.page.widget.TextProgressBar getTextProgressBar() {
            r1 = this;
            com.kwad.components.core.page.widget.TextProgressBar r0 = r1.EG
            return r0
    }

    public void j(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r7) {
            r6 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r7)
            boolean r1 = com.kwad.sdk.core.response.b.e.O(r7)
            r2 = 12
            if (r1 == 0) goto L16
            android.widget.ImageView r1 = r6.nq
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.cO(r0)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r3, r7, r2)
            goto L1f
        L16:
            android.widget.ImageView r1 = r6.nq
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.co(r0)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r3, r7, r2)
        L1f:
            android.widget.TextView r1 = r6.nr
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r0)
            r1.setText(r2)
            boolean r1 = com.kwad.sdk.core.response.b.e.O(r7)
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L65
            float r1 = com.kwad.sdk.core.response.b.a.aA(r0)
            r4 = 1077936128(0x40400000, float:3.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 < 0) goto L46
            com.kwad.components.ad.widget.AppScoreView r4 = r6.Ep
            r4.setScore(r1)
            com.kwad.components.ad.widget.AppScoreView r1 = r6.Ep
            r1.setVisibility(r3)
            goto L4b
        L46:
            com.kwad.components.ad.widget.AppScoreView r1 = r6.Ep
            r1.setVisibility(r2)
        L4b:
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.az(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L60
            android.widget.TextView r4 = r6.gy
            r4.setText(r1)
            android.widget.TextView r1 = r6.gy
            r1.setVisibility(r3)
            goto L65
        L60:
            android.widget.TextView r1 = r6.gy
            r1.setVisibility(r2)
        L65:
            android.widget.TextView r1 = r6.MU
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r0)
            r1.setText(r0)
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r7)
            if (r0 == 0) goto Lbe
            com.kwad.components.core.page.widget.TextProgressBar r0 = r6.EG
            r0.setVisibility(r2)
            android.view.View r0 = r6.Bw
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.By
            java.lang.String r1 = "查看详情"
            r0.setText(r1)
            android.widget.Button r0 = r6.Bx
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = com.kwad.sdk.core.config.e.FC()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r1
            java.lang.String r1 = "浏览详情页%s秒，领取奖励"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.setText(r1)
            boolean r0 = r7.mRewardVerifyCalled
            if (r0 != 0) goto Ldb
            java.lang.Runnable r0 = r6.BI
            if (r0 != 0) goto Lb4
            com.kwad.components.ad.widget.tailframe.appbar.a$1 r0 = new com.kwad.components.ad.widget.tailframe.appbar.a$1
            r0.<init>(r6)
            r6.BI = r0
        Lb4:
            android.view.View r0 = r6.Bw
            java.lang.Runnable r1 = r6.BI
            r4 = 1600(0x640, double:7.905E-321)
            r0.postDelayed(r1, r4)
            goto Ldb
        Lbe:
            com.kwad.components.core.page.widget.TextProgressBar r0 = r6.EG
            r0.setVisibility(r3)
            android.view.View r0 = r6.Bw
            r0.setVisibility(r2)
            java.lang.Runnable r0 = r6.BI
            if (r0 == 0) goto Ld4
            android.view.View r1 = r6.Bw
            r1.removeCallbacks(r0)
            r0 = 0
            r6.BI = r0
        Ld4:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r7)
            r6.D(r0)
        Ldb:
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r7)
            if (r0 == 0) goto Lfb
            java.util.List r7 = com.kwad.sdk.core.response.b.d.ec(r7)
            int r0 = r7.size()
            if (r0 <= 0) goto Lf1
            com.kwad.components.ad.widget.KsAppTagsView r0 = r6.BE
            r0.setVisibility(r3)
            goto Lf6
        Lf1:
            com.kwad.components.ad.widget.KsAppTagsView r0 = r6.BE
            r0.setVisibility(r2)
        Lf6:
            com.kwad.components.ad.widget.KsAppTagsView r0 = r6.BE
            r0.setAppTags(r7)
        Lfb:
            return
    }

    public final void lv() {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.lJ
            if (r0 == 0) goto L14
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L14
            android.animation.ValueAnimator r0 = r2.lJ
            r0.cancel()
            android.animation.ValueAnimator r0 = r2.lJ
            r0.end()
        L14:
            java.lang.Runnable r0 = r2.BI
            if (r0 == 0) goto L20
            android.view.View r1 = r2.Bw
            r1.removeCallbacks(r0)
            r0 = 0
            r2.BI = r0
        L20:
            com.kwad.components.ad.j.a r0 = r2.BH
            r0.nE()
            return
    }
}
