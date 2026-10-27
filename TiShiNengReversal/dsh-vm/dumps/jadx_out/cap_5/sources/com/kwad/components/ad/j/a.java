package com.kwad.components.ad.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private android.view.View Bw;
    private android.widget.Button Bx;
    private android.widget.Button By;
    private android.view.View GD;
    private java.lang.Runnable LD;
    private boolean LE;

    @androidx.annotation.Nullable
    private android.animation.Animator kv;




    public a(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.LE = r0
            r1.GD = r2
            r1.initView()
            return
    }

    private static android.animation.Animator a(android.view.View r3, float r4, float r5, long r6) {
            float r4 = r4 / r5
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r5
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setDuration(r6)
            r6 = 1058306785(0x3f147ae1, float:0.58)
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r6 = androidx.core.view.animation.PathInterpolatorCompat.create(r2, r2, r6, r7)
            r0.setInterpolator(r6)
            android.content.res.Resources r6 = r3.getResources()
            int r7 = com.kwad.sdk.R.dimen.ksad_reward_apk_info_card_actionbar_text_size
            float r6 = r6.getDimension(r7)
            com.kwad.components.ad.j.a$3 r7 = new com.kwad.components.ad.j.a$3
            r7.<init>(r4, r5, r6, r3)
            r0.addUpdateListener(r7)
            return r0
    }

    private static android.animation.Animator a(android.view.View r4, android.view.View r5, int r6, int r7, long r8, long r10) {
            r8 = 200(0xc8, double:9.9E-322)
            android.animation.Animator r10 = d(r4, r8)
            float r6 = (float) r6
            float r7 = (float) r7
            android.animation.Animator r11 = a(r5, r6, r7, r8)
            com.kwad.components.ad.j.a$2 r0 = new com.kwad.components.ad.j.a$2
            r0.<init>(r4)
            r11.addListener(r0)
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0048: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r2 = "scaleX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r2, r1)
            r2 = 1600(0x640, double:7.905E-321)
            r1.setDuration(r2)
            android.animation.Animator r5 = d(r5, r8)
            android.animation.Animator r4 = a(r4, r6, r7, r8)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r7 = 5
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r8 = 0
            r7[r8] = r10
            r8 = 1
            r7[r8] = r11
            r7[r0] = r1
            r8 = 3
            r7[r8] = r5
            r5 = 4
            r7[r5] = r4
            r6.playSequentially(r7)
            return r6
    }

    static /* synthetic */ java.lang.Runnable a(com.kwad.components.ad.j.a r0, java.lang.Runnable r1) {
            r0.LD = r1
            return r1
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.j.a r0) {
            boolean r0 = r0.LE
            return r0
    }

    static /* synthetic */ java.lang.Runnable b(com.kwad.components.ad.j.a r0) {
            java.lang.Runnable r0 = r0.LD
            return r0
    }

    private static android.animation.Animator d(android.view.View r2, long r3) {
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            java.lang.String r1 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r1, r0)
            r2.setDuration(r3)
            r3 = 1058306785(0x3f147ae1, float:0.58)
            r4 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r3 = androidx.core.view.animation.PathInterpolatorCompat.create(r4, r4, r3, r0)
            r2.setInterpolator(r3)
            return r2
    }

    private void initView() {
            r2 = this;
            android.view.View r0 = r2.GD
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_action
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.Bx = r0
            android.view.View r0 = r2.GD
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_start
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.By = r0
            android.view.View r0 = r2.GD
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_container
            android.view.View r0 = r0.findViewById(r1)
            r2.Bw = r0
            return
    }

    public final void je() {
            r10 = this;
            java.lang.String r0 = "startAnimation"
            java.lang.String r1 = "ApkInstallAnimHelper"
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.view.View r0 = r10.Bw
            int r5 = r0.getHeight()
            android.view.View r0 = r10.Bw
            int r4 = r0.getWidth()
            if (r5 == 0) goto L5e
            if (r4 != 0) goto L18
            goto L5e
        L18:
            android.animation.Animator r0 = r10.kv
            if (r0 != 0) goto L32
            android.widget.Button r2 = r10.By
            android.widget.Button r3 = r10.Bx
            r6 = 1600(0x640, double:7.905E-321)
            r8 = 200(0xc8, double:9.9E-322)
            android.animation.Animator r0 = a(r2, r3, r4, r5, r6, r8)
            r10.kv = r0
            com.kwad.components.ad.j.a$1 r2 = new com.kwad.components.ad.j.a$1
            r2.<init>(r10)
            r0.addListener(r2)
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "mAnimator isStarted: "
            r0.<init>(r2)
            android.animation.Animator r2 = r10.kv
            boolean r2 = r2.isStarted()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.animation.Animator r0 = r10.kv
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L5b
            java.lang.String r0 = "mAnimator.start()"
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.animation.Animator r0 = r10.kv
            r0.start()
        L5b:
            r0 = 0
            r10.LE = r0
        L5e:
            return
    }

    public final void kZ() {
            r0 = this;
            r0.nE()
            return
    }

    public final void nE() {
            r1 = this;
            android.animation.Animator r0 = r1.kv
            if (r0 == 0) goto Lf
            r0.cancel()
            android.animation.Animator r0 = r1.kv
            r0.removeAllListeners()
            r0 = 1
            r1.LE = r0
        Lf:
            java.lang.Runnable r0 = r1.LD
            if (r0 == 0) goto L19
            com.kwad.sdk.utils.bw.c(r0)
            r0 = 0
            r1.LD = r0
        L19:
            return
    }

    public final void nF() {
            r1 = this;
            r0 = 1
            r1.LE = r0
            return
    }
}
