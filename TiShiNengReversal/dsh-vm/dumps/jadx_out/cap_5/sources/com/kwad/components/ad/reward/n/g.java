package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.reward.n.s implements android.view.View.OnClickListener {
    private android.widget.TextView ko;
    private com.kwad.components.ad.reward.g tm;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void iG();
    }

    public g(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.<init>()
            r0.tm = r1
            return
    }

    private static android.animation.Animator s(android.view.View r13) {
            if (r13 != 0) goto L4
            r13 = 0
            return r13
        L4:
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_live_card_tips_animation_y
            int r0 = r0.getDimensionPixelSize(r1)
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r1 = androidx.core.view.animation.PathInterpolatorCompat.create(r2, r2, r1, r3)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            int r0 = -r0
            float r0 = (float) r0
            r4 = 1
            float[] r5 = new float[r4]
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r13, r0, r5)
            r7 = 500(0x1f4, double:2.47E-321)
            android.animation.ObjectAnimator r5 = r5.setDuration(r7)
            r5.setInterpolator(r1)
            r9 = 2
            float[] r10 = new float[r9]
            r10 = {x0066: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r11 = "alpha"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r13, r11, r10)
            r11 = 2500(0x9c4, double:1.235E-320)
            android.animation.ObjectAnimator r10 = r10.setDuration(r11)
            float[] r11 = new float[r4]
            r11[r6] = r2
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r13, r0, r11)
            android.animation.ObjectAnimator r13 = r13.setDuration(r7)
            r13.setInterpolator(r1)
            r0 = 3
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r6] = r5
            r0[r4] = r10
            r0[r9] = r13
            r3.playSequentially(r0)
            return r3
    }

    public final void a(com.kwad.components.ad.reward.n.g.a r3, long r4) {
            r2 = this;
            android.view.ViewGroup r4 = r2.vV
            android.animation.Animator r4 = s(r4)
            if (r4 != 0) goto Lc
            r3.iG()
            return
        Lc:
            com.kwad.components.ad.reward.n.g$1 r5 = new com.kwad.components.ad.reward.n.g$1
            r5.<init>(r2, r3)
            r4.addListener(r5)
            android.view.ViewGroup r3 = r2.vV
            com.kwad.components.ad.reward.n.g$2 r5 = new com.kwad.components.ad.reward.n.g$2
            r5.<init>(r2, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r5, r0)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    protected final void a(com.kwad.components.ad.reward.n.r r2) {
            r1 = this;
            super.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.getAdTemplate()
            if (r2 == 0) goto L18
            com.kwad.sdk.core.response.model.AdMatrixInfo$MerchantLiveReservationInfo r2 = com.kwad.sdk.core.response.b.b.dt(r2)
            java.lang.String r2 = r2.title
            if (r2 == 0) goto L18
            android.widget.TextView r0 = r1.ko
            if (r0 == 0) goto L18
            r0.setText(r2)
        L18:
            return
    }

    public final void f(android.view.ViewGroup r3) {
            r2 = this;
            int r0 = com.kwad.sdk.R.id.ksad_card_tips_view
            int r1 = com.kwad.sdk.R.id.ksad_card_tips_root
            super.a(r3, r0, r1)
            android.widget.TextView r3 = r2.ko
            if (r3 != 0) goto L17
            android.view.ViewGroup r3 = r2.vV
            int r0 = com.kwad.sdk.R.id.ksad_card_tips_title
            android.view.View r3 = r3.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.ko = r3
        L17:
            android.view.ViewGroup r3 = r2.vV
            r3.setOnClickListener(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.n.s, com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L10
            com.kwad.components.ad.reward.g r3 = r2.tm
            android.content.Context r0 = r3.mContext
            r1 = 1
            r3.a(r1, r0, r1, r1)
        L10:
            return
    }
}
