package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o {






    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.animation.Animator a(android.view.View r2, @androidx.annotation.Nullable android.view.animation.Interpolator r3, float r4, float r5) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r3 = 1058306785(0x3f147ae1, float:0.58)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            android.view.animation.Interpolator r3 = androidx.core.view.animation.PathInterpolatorCompat.create(r1, r1, r3, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r4 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r0)
            r4 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r4)
            r2.setInterpolator(r3)
            return r2
    }

    public static android.animation.Animator a(android.view.View r18, @androidx.annotation.Nullable android.view.animation.Interpolator r19, long r20, float r22) {
            r0 = r18
            r1 = r20
            r3 = r22
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            if (r19 != 0) goto L1d
            r5 = 1058474557(0x3f170a3d, float:0.59)
            r6 = 1052266988(0x3eb851ec, float:0.36)
            r7 = 1046562734(0x3e6147ae, float:0.22)
            r8 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r5 = androidx.core.view.animation.PathInterpolatorCompat.create(r7, r5, r6, r8)
            goto L1f
        L1d:
            r5 = r19
        L1f:
            r6 = 2
            float[] r7 = new float[r6]
            r7 = {x00a2: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r0, r8, r7)
            r8 = 300(0x12c, double:1.48E-321)
            r7.setDuration(r8)
            float[] r8 = new float[r6]
            r9 = 0
            r10 = 0
            r8[r9] = r10
            r11 = 1
            r8[r11] = r3
            java.lang.String r12 = "rotation"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r0, r12, r8)
            android.animation.ObjectAnimator r8 = r8.setDuration(r1)
            float r13 = -r3
            float[] r14 = new float[r6]
            r14[r9] = r3
            r14[r11] = r13
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r0, r12, r14)
            r15 = 2
            r19 = 0
            r17 = 0
            long r9 = r1 * r15
            android.animation.ObjectAnimator r14 = r14.setDuration(r9)
            r14.setInterpolator(r5)
            float[] r15 = new float[r6]
            r15[r19] = r13
            r15[r11] = r3
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r0, r12, r15)
            android.animation.ObjectAnimator r15 = r15.setDuration(r9)
            r16 = 1
            float[] r11 = new float[r6]
            r11[r19] = r3
            r11[r16] = r13
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r12, r11)
            android.animation.ObjectAnimator r3 = r3.setDuration(r9)
            r3.setInterpolator(r5)
            float[] r5 = new float[r6]
            r5[r19] = r13
            r5[r16] = r17
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r12, r5)
            android.animation.ObjectAnimator r0 = r0.setDuration(r1)
            r1 = 6
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r19] = r7
            r1[r16] = r8
            r1[r6] = r14
            r2 = 3
            r1[r2] = r15
            r2 = 4
            r1[r2] = r3
            r2 = 5
            r1[r2] = r0
            r4.playSequentially(r1)
            return r4
    }

    public static android.animation.ValueAnimator b(android.view.View r1, int r2, int r3) {
            k(r1, r2)
            int[] r2 = new int[]{r2, r3}
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            com.kwad.components.core.t.o$1 r0 = new com.kwad.components.core.t.o$1
            r0.<init>(r1)
            r2.addUpdateListener(r0)
            com.kwad.components.core.t.o$4 r0 = new com.kwad.components.core.t.o$4
            r0.<init>(r1, r3)
            r2.addListener(r0)
            return r2
    }

    public static android.animation.ValueAnimator c(android.view.View r0, int r1, int r2) {
            int[] r1 = new int[]{r1, r2}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            com.kwad.components.core.t.o$5 r2 = new com.kwad.components.core.t.o$5
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            return r1
    }

    public static android.animation.ValueAnimator h(android.view.View r6, boolean r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r7 == 0) goto L7
            r2 = 0
            goto L9
        L7:
            r2 = 1065353216(0x3f800000, float:1.0)
        L9:
            if (r7 == 0) goto Le
            r3 = 1065353216(0x3f800000, float:1.0)
            goto Lf
        Le:
            r3 = 0
        Lf:
            r4 = 2
            float[] r4 = new float[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r4)
            r3 = 1055286886(0x3ee66666, float:0.45)
            r4 = 1058642330(0x3f19999a, float:0.6)
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.create(r3, r1, r4, r0)
            r2.setInterpolator(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            com.kwad.components.core.t.o$2 r0 = new com.kwad.components.core.t.o$2
            r0.<init>(r6)
            r2.addUpdateListener(r0)
            com.kwad.components.core.t.o$3 r0 = new com.kwad.components.core.t.o$3
            r0.<init>(r7, r6)
            r2.addListener(r0)
            return r2
    }

    private static void k(android.view.View r1, int r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            return
    }

    static /* synthetic */ void l(android.view.View r0, int r1) {
            k(r0, r1)
            return
    }
}
