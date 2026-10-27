package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private static long vU = 300;
    private android.widget.ImageView ig;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private android.view.ViewGroup vV;
    private android.widget.TextView vW;
    private boolean vX;
    private float vY;
    private java.lang.ref.WeakReference<android.view.View> vZ;
    private com.kwad.components.ad.reward.presenter.r wa;
    private boolean wb;




    static {
            return
    }

    public o(com.kwad.components.ad.reward.presenter.r r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.wb = r0
            com.kwad.components.ad.reward.presenter.o$1 r0 = new com.kwad.components.ad.reward.presenter.o$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            r1.wa = r2
            return
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.presenter.o r0) {
            android.animation.Animator r0 = r0.iJ()
            return r0
    }

    private void a(android.view.ViewGroup.LayoutParams r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L5c
        L3:
            android.view.ViewGroup r0 = r4.vV
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L5c
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.height
            r2 = -1
            if (r1 != r2) goto L23
            android.view.ViewGroup r5 = r4.vV
            android.content.res.Resources r5 = r5.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_reward_playable_pre_tips_margin_bottom_without_actionbar
            int r5 = r5.getDimensionPixelSize(r1)
            r0.bottomMargin = r5
            goto L57
        L23:
            android.view.ViewGroup r1 = r4.vV
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_playable_pre_tips_margin_bottom
            int r1 = r1.getDimensionPixelSize(r2)
            boolean r2 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L52
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            java.lang.ref.WeakReference<android.view.View> r2 = r4.vZ
            if (r2 == 0) goto L40
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            goto L41
        L40:
            r2 = 0
        L41:
            int r3 = r5.height
            if (r3 > 0) goto L4b
            if (r2 == 0) goto L4b
            int r3 = r2.getHeight()
        L4b:
            int r5 = r5.bottomMargin
            int r3 = r3 + r5
            int r3 = r3 + r1
            r0.bottomMargin = r3
            goto L57
        L52:
            int r5 = r5.height
            int r5 = r5 + r1
            r0.bottomMargin = r5
        L57:
            android.view.ViewGroup r5 = r4.vV
            r5.setLayoutParams(r0)
        L5c:
            return
    }

    private synchronized void iI() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.wb     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            com.kwad.components.ad.reward.g r0 = r4.tm     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            r2 = 192(0xc0, float:2.69E-43)
            com.kwad.sdk.core.adlog.c.b r1 = r1.df(r2)     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.g r2 = r4.tm     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.m.e r2 = r2.rE     // Catch: java.lang.Throwable -> L2b
            long r2 = r2.getPlayDuration()     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.adlog.c.b r1 = r1.aw(r2)     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            com.kwad.sdk.core.adlog.c.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            r4.wb = r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)
            return
        L2b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    private android.animation.Animator iJ() {
            r9 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.content.Context r1 = r9.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_playable_pre_tips_transx
            float r1 = r1.getDimension(r2)
            android.view.ViewGroup r2 = r9.vV
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r1
            java.lang.String r1 = "translationX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r2, r1, r4)
            android.widget.ImageView r2 = r9.ig
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            boolean r4 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r4 == 0) goto L5a
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            android.content.Context r4 = r9.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r6 = com.kwad.sdk.R.color.ksad_playable_pre_tips_icon_bg
            int r4 = r4.getColor(r6)
            android.content.Context r6 = r9.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r7 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r6 = r6.getColor(r7)
            int[] r4 = new int[]{r4, r6}
            android.animation.ValueAnimator r4 = com.kwad.sdk.widget.a.ofArgb(r4)
            com.kwad.components.ad.reward.presenter.o$3 r6 = new com.kwad.components.ad.reward.presenter.o$3
            r6.<init>(r9, r2)
            r4.addUpdateListener(r6)
            goto L5b
        L5a:
            r4 = 0
        L5b:
            android.widget.TextView r2 = r9.vW
            r6 = 2
            float[] r7 = new float[r6]
            r7 = {x007c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r8, r7)
            r7 = 3
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r7[r5] = r1
            r7[r3] = r4
            r7[r6] = r2
            r0.playTogether(r7)
            long r1 = com.kwad.components.ad.reward.presenter.o.vU
            r0.setDuration(r1)
            return r0
    }

    private void initView() {
            r3 = this;
            android.view.ViewGroup r0 = r3.vV
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = com.kwad.sdk.R.id.ksad_playabel_pre_tips_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.ig = r0
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.color.ksad_playable_pre_tips_icon_bg
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            android.view.ViewGroup r0 = r3.vV
            int r1 = com.kwad.sdk.R.id.ksad_playabel_pre_tips_text
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.vW = r0
            android.view.ViewGroup r0 = r3.vV
            r0.setOnClickListener(r3)
            return
    }

    public final void I(boolean r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.vV
            if (r0 != 0) goto L5
            goto L3c
        L5:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lc
            goto L3c
        Lc:
            r3.iI()
            java.lang.ref.WeakReference<android.view.View> r0 = r3.vZ
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L28
            java.lang.ref.WeakReference<android.view.View> r0 = r3.vZ
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r3.a(r0)
        L28:
            android.view.ViewGroup r0 = r3.vV
            r1 = 0
            r0.setVisibility(r1)
            if (r4 == 0) goto L3c
            android.view.ViewGroup r4 = r3.vV
            com.kwad.components.ad.reward.presenter.o$2 r0 = new com.kwad.components.ad.reward.presenter.o$2
            r0.<init>(r3)
            r1 = 2000(0x7d0, double:9.88E-321)
            r4.postDelayed(r0, r1)
        L3c:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult r3, android.view.View r4) {
            r2 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r2.vZ = r0
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onActionBarShown: type: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", params.height: "
            r0.append(r3)
            int r3 = r4.height
            r0.append(r3)
            java.lang.String r3 = ", params.width: "
            r0.append(r3)
            int r3 = r4.width
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "RewardPlayablePreTips"
            com.kwad.sdk.core.d.c.d(r0, r3)
            r2.a(r4)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            android.view.ViewGroup r0 = r3.vV
            if (r0 != 0) goto L27
            int r0 = com.kwad.sdk.R.id.ksad_playable_pre_tips_stub
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L1a
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.vV = r0
            goto L24
        L1a:
            int r0 = com.kwad.sdk.R.id.ksad_playable_pre_tips_root
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.vV = r0
        L24:
            r3.initView()
        L27:
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.gO()
            if (r0 == 0) goto L45
            android.view.ViewGroup r0 = r3.vV
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_reward_js_actionbar_height
            int r0 = r0.getDimensionPixelSize(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r0)
            r3.a(r1)
            goto L4c
        L45:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.a(r3)
        L4c:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.e.g r1 = r3.mPlayEndPageListener
            r0.b(r1)
            return
    }

    public final void hide() {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup r4 = r3.vV
            if (r4 == 0) goto L9
            r0 = 8
            r4.setVisibility(r0)
        L9:
            com.kwad.components.ad.reward.a r4 = com.kwad.components.ad.reward.a.gg()
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.PENDANT_CLICK_NOT_AUTO
            r4.a(r0)
            com.kwad.components.ad.reward.g r4 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r1 = 192(0xc0, float:2.69E-43)
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r1)
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.components.ad.reward.m.e r1 = r1.rE
            long r1 = r1.getPlayDuration()
            com.kwad.sdk.core.adlog.c.b r0 = r0.aw(r1)
            r1 = 0
            com.kwad.sdk.core.adlog.c.e(r4, r1, r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            float r0 = com.kwad.components.ad.reward.a.b.hF()
            r1.vY = r0
            boolean r0 = com.kwad.components.ad.reward.a.b.hH()
            if (r0 != 0) goto L17
            boolean r0 = com.kwad.components.ad.reward.a.b.hG()
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r1.vX = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.b(r2)
            return
    }
}
