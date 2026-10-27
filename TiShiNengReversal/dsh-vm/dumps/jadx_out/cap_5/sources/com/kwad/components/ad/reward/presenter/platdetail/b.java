package com.kwad.components.ad.reward.presenter.platdetail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.core.video.m jE;
    private boolean xA;
    private boolean xB;
    private android.animation.Animator xC;
    private android.animation.Animator xD;
    private android.animation.Animator xE;
    private android.animation.Animator xF;
    private long xG;
    private com.kwad.sdk.utils.bm xH;
    private com.kwad.sdk.utils.bm xI;
    private android.view.animation.Interpolator xJ;
    private final long xt;
    private final long xu;
    private final long xv;
    private android.view.View xw;
    private android.view.View xx;
    private android.view.View xy;
    private android.view.View xz;





    public b() {
            r4 = this;
            r4.<init>()
            r0 = 1600(0x640, double:7.905E-321)
            r4.xt = r0
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.xu = r0
            r2 = 5000(0x1388, double:2.4703E-320)
            r4.xv = r2
            r2 = 0
            r4.xA = r2
            r4.xB = r2
            r2 = 0
            r4.xF = r2
            r4.xG = r0
            r0 = 1058306785(0x3f147ae1, float:0.58)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.create(r2, r2, r0, r1)
            r4.xJ = r0
            com.kwad.components.ad.reward.presenter.platdetail.b$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.b$1
            r0.<init>(r4)
            r4.jE = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.platdetail.b r2) {
            long r0 = r2.xG
            return r0
    }

    private android.animation.Animator a(android.view.View r7, android.view.View r8) {
            r6 = this;
            android.animation.Animator r7 = r6.q(r7)
            android.animation.Animator r0 = r6.q(r8)
            r1 = 1
            float[] r2 = new float[r1]
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r2[r3] = r4
            java.lang.String r4 = "scaleX"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r4, r2)
            r4 = 300(0x12c, double:1.48E-321)
            r8.setDuration(r4)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r4 = 2
            android.animation.Animator[] r5 = new android.animation.Animator[r4]
            r5[r3] = r8
            r5[r1] = r0
            r2.playSequentially(r5)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r4]
            r0[r3] = r7
            r0[r1] = r2
            r8.playTogether(r0)
            return r8
    }

    static /* synthetic */ android.animation.Animator a(com.kwad.components.ad.reward.presenter.platdetail.b r0, android.animation.Animator r1) {
            r1 = 0
            r0.xF = r1
            return r1
    }

    private android.view.View a(@androidx.annotation.DrawableRes int r4, android.view.ViewGroup r5) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.kwad.sdk.R.layout.ksad_image_player_sweep
            r2 = 0
            android.view.View r5 = r0.inflate(r1, r5, r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            r5.setImageDrawable(r4)
            return r5
    }

    private void a(@androidx.annotation.NonNull android.animation.Animator r2) {
            r1 = this;
            boolean r0 = r1.xA
            if (r0 != 0) goto L8
            r2.start()
            return
        L8:
            r1.xF = r2
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.platdetail.b r0, android.view.View r1) {
            r(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.b r0, boolean r1) {
            r0.xA = r1
            return r1
    }

    private android.animation.Animator b(android.view.View r9, long r10) {
            r8 = this;
            r0 = 5
            float[] r0 = new float[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [1065353216, 1066242408, 1065353216, 1066242408, 1065353216} // fill-array
            java.lang.String r1 = "scaleX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r9, r1, r0)
            java.lang.String r2 = "scaleY"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r2, r0)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.view.View r2 = r8.xx
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L36
            float[] r6 = new float[r5]
            r6 = {x0056: FILL_ARRAY_DATA , data: [1045220557, 0} // fill-array
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r7, r6)
            r6 = 3
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r4] = r1
            r6[r3] = r9
            r6[r5] = r2
            r0.playTogether(r6)
            goto L3f
        L36:
            android.animation.Animator[] r2 = new android.animation.Animator[r5]
            r2[r4] = r1
            r2[r3] = r9
            r0.playTogether(r2)
        L3f:
            r0.setDuration(r10)
            android.view.animation.Interpolator r9 = r8.xJ
            r0.setInterpolator(r9)
            return r0
    }

    static /* synthetic */ android.view.View b(com.kwad.components.ad.reward.presenter.platdetail.b r0, android.view.View r1) {
            r1 = 0
            r0.xx = r1
            return r1
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            r0.je()
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.platdetail.b r0, android.animation.Animator r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.platdetail.b r0, boolean r1) {
            r1 = 1
            r0.xB = r1
            return r1
    }

    private android.animation.Animator c(android.view.View r7, long r8) {
            r6 = this;
            r8 = 1600(0x640, double:7.905E-321)
            android.animation.Animator r0 = r6.b(r7, r8)
            r1 = 1
            float[] r2 = new float[r1]
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r2[r3] = r4
            java.lang.String r4 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r4, r2)
            r4 = 5000(0x1388, double:2.4703E-320)
            r7.setDuration(r4)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r3] = r0
            r4[r1] = r7
            r2.playSequentially(r4)
            r2.setDuration(r8)
            return r2
    }

    static /* synthetic */ android.animation.Animator c(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            android.animation.Animator r0 = r0.xF
            return r0
    }

    static /* synthetic */ android.view.View c(com.kwad.components.ad.reward.presenter.platdetail.b r0, android.view.View r1) {
            r1 = 0
            r0.xy = r1
            return r1
    }

    static /* synthetic */ android.view.View d(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            android.view.View r0 = r0.xx
            return r0
    }

    static /* synthetic */ android.view.View d(com.kwad.components.ad.reward.presenter.platdetail.b r0, android.view.View r1) {
            r1 = 0
            r0.xz = r1
            return r1
    }

    static /* synthetic */ boolean e(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            boolean r0 = r0.xB
            return r0
    }

    static /* synthetic */ android.animation.Animator f(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            android.animation.Animator r0 = r0.xD
            return r0
    }

    static /* synthetic */ android.animation.Animator g(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            android.animation.Animator r0 = r0.xE
            return r0
    }

    static /* synthetic */ android.view.View h(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            android.view.View r0 = r0.xy
            return r0
    }

    static /* synthetic */ android.view.View i(com.kwad.components.ad.reward.presenter.platdetail.b r0) {
            android.view.View r0 = r0.xz
            return r0
    }

    private void jc() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_image_player_sweep_wave_width_start
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_image_player_sweep_wave_height_start
            int r1 = r1.getDimensionPixelSize(r2)
            com.kwad.sdk.utils.bm r2 = new com.kwad.sdk.utils.bm
            r2.<init>(r0, r1)
            r3.xH = r2
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_image_player_sweep_wave_width_end
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_image_player_sweep_wave_height_end
            int r1 = r1.getDimensionPixelSize(r2)
            com.kwad.sdk.utils.bm r2 = new com.kwad.sdk.utils.bm
            r2.<init>(r0, r1)
            r3.xI = r2
            return
    }

    private android.view.View jd() {
            r2 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r1 = 0
            r0.setClickable(r1)
            r0.setFocusable(r1)
            r0.setFocusableInTouchMode(r1)
            r0.setLongClickable(r1)
            java.lang.String r1 = "#222222"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r0.setAlpha(r1)
            return r0
    }

    private void je() {
            r4 = this;
            android.view.View r0 = r4.xw
            r1 = 1600(0x640, double:7.905E-321)
            android.animation.Animator r0 = r4.b(r0, r1)
            r4.xC = r0
            android.view.View r0 = r4.xy
            android.view.View r3 = r4.xz
            android.animation.Animator r0 = r4.a(r0, r3)
            r4.xD = r0
            android.view.View r0 = r4.xw
            android.animation.Animator r0 = r4.c(r0, r1)
            r4.xE = r0
            android.animation.Animator r0 = r4.xC
            com.kwad.components.ad.reward.presenter.platdetail.b$2 r1 = new com.kwad.components.ad.reward.presenter.platdetail.b$2
            r1.<init>(r4)
            r0.addListener(r1)
            android.animation.Animator r0 = r4.xD
            com.kwad.components.ad.reward.presenter.platdetail.b$3 r1 = new com.kwad.components.ad.reward.presenter.platdetail.b$3
            r1.<init>(r4)
            r0.addListener(r1)
            android.animation.Animator r0 = r4.xE
            com.kwad.components.ad.reward.presenter.platdetail.b$4 r1 = new com.kwad.components.ad.reward.presenter.platdetail.b$4
            r1.<init>(r4)
            r0.addListener(r1)
            android.animation.Animator r0 = r4.xC
            r4.a(r0)
            return
    }

    private android.animation.Animator q(android.view.View r10) {
            r9 = this;
            com.kwad.sdk.utils.bm r0 = r9.xH
            if (r0 == 0) goto L8
            com.kwad.sdk.utils.bm r0 = r9.xI
            if (r0 != 0) goto Lb
        L8:
            r9.jc()
        Lb:
            android.content.Context r0 = r9.getContext()
            int r0 = com.kwad.sdk.c.a.a.getScreenHeight(r0)
            com.kwad.sdk.utils.bm r1 = r9.xI
            int r1 = r1.getHeight()
            com.kwad.sdk.utils.bm r2 = r9.xH
            int r2 = r2.getHeight()
            int r1 = r1 + r2
            r2 = 2
            int r1 = r1 / r2
            int r0 = r0 + r1
            int r0 = -r0
            float r0 = (float) r0
            r1 = 1
            float[] r3 = new float[r1]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r0, r3)
            com.kwad.sdk.utils.bm r3 = r9.xI
            float r3 = r3.RF()
            com.kwad.sdk.utils.bm r5 = r9.xH
            float r5 = r5.RF()
            float r3 = r3 / r5
            com.kwad.sdk.utils.bm r5 = r9.xI
            float r5 = r5.RG()
            com.kwad.sdk.utils.bm r6 = r9.xH
            float r6 = r6.RG()
            float r5 = r5 / r6
            float[] r6 = new float[r2]
            r7 = 1065353216(0x3f800000, float:1.0)
            r6[r4] = r7
            r6[r1] = r3
            java.lang.String r3 = "scaleX"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r10, r3, r6)
            float[] r6 = new float[r2]
            r6[r4] = r7
            r6[r1] = r5
            java.lang.String r5 = "scaleY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r10, r5, r6)
            float[] r6 = new float[r2]
            r6 = {x0090: FILL_ARRAY_DATA , data: [1065353216, 1061997773} // fill-array
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r7, r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r7 = 3000(0xbb8, double:1.482E-320)
            r6.setDuration(r7)
            r7 = 4
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r7[r4] = r3
            r7[r1] = r5
            r7[r2] = r0
            r0 = 3
            r7[r0] = r10
            r6.playTogether(r7)
            android.view.animation.Interpolator r10 = r9.xJ
            r6.setInterpolator(r10)
            return r6
    }

    private static void r(android.view.View r1) {
            if (r1 == 0) goto L16
            android.view.ViewParent r0 = r1.getParent()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L16
            android.view.ViewParent r0 = r1.getParent()     // Catch: java.lang.Throwable -> L12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L12
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
        L16:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r4.jE
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.ad.reward.m.b r0 = r0.kY()
            android.content.Context r1 = r4.getContext()
            android.widget.FrameLayout r0 = r0.T(r1)
            r4.xw = r0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L25
            return
        L25:
            int r0 = com.kwad.sdk.R.id.ksad_reward_play_layout
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.View r1 = r4.xw
            r2 = -1
            r0.addView(r1, r2, r2)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r2, r1)
            r1 = 81
            r0.gravity = r1
            com.kwad.sdk.utils.bm r1 = r4.xH
            int r1 = r1.getHeight()
            int r1 = -r1
            r0.bottomMargin = r1
            int r1 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r1 = r4.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.View r3 = r4.jd()
            r4.xx = r3
            r1.addView(r3, r2, r2)
            int r2 = com.kwad.sdk.R.drawable.ksad_image_player_sweep1
            android.view.View r2 = r4.a(r2, r1)
            r4.xy = r2
            r1.addView(r2, r0)
            int r2 = com.kwad.sdk.R.drawable.ksad_image_player_sweep2
            android.view.View r2 = r4.a(r2, r1)
            r4.xz = r2
            r1.addView(r2, r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            r0.jc()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            r1.xw = r0
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.ad.reward.m.b r0 = r0.kY()
            if (r0 == 0) goto L13
            r0.release()
        L13:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            r0 = 1
            r2.xA = r0
            android.animation.Animator r0 = r2.xD
            if (r0 == 0) goto Ld
            r0.cancel()
        Ld:
            android.animation.Animator r0 = r2.xC
            if (r0 == 0) goto L14
            r0.cancel()
        L14:
            android.animation.Animator r0 = r2.xE
            if (r0 == 0) goto L1b
            r0.cancel()
        L1b:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            return
    }
}
