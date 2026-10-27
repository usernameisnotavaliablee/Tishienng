package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SidePropagation extends androidx.transition.VisibilityPropagation {
    private float mPropagationSpeed;
    private int mSide;

    public SidePropagation() {
            r1 = this;
            r1.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r1.mPropagationSpeed = r0
            r0 = 80
            r1.mSide = r0
            return
    }

    private int distance(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r5 = this;
            int r0 = r5.mSide
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 3
            r4 = 5
            if (r0 != r1) goto L14
            int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            if (r6 != r2) goto L12
        L10:
            r0 = 5
            goto L20
        L12:
            r0 = 3
            goto L20
        L14:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L20
            int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            if (r6 != r2) goto L10
            goto L12
        L20:
            if (r0 == r3) goto L46
            if (r0 == r4) goto L3e
            r6 = 48
            if (r0 == r6) goto L36
            r6 = 80
            if (r0 == r6) goto L2e
            r6 = 0
            return r6
        L2e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r8 = r8 + r6
            return r8
        L36:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r14 = r14 + r6
            return r14
        L3e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r7 = r7 + r6
            return r7
        L46:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r13 = r13 + r6
            return r13
    }

    private int getMaxDistance(android.view.ViewGroup r3) {
            r2 = this;
            int r0 = r2.mSide
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 5
            if (r0 == r1) goto L17
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r1) goto L17
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L17
            int r3 = r3.getHeight()
            return r3
        L17:
            int r3 = r3.getWidth()
            return r3
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup r15, androidx.transition.Transition r16, androidx.transition.TransitionValues r17, androidx.transition.TransitionValues r18) {
            r14 = this;
            r1 = r17
            r10 = 0
            if (r1 != 0) goto L9
            if (r18 != 0) goto L9
            return r10
        L9:
            android.graphics.Rect r2 = r16.getEpicenter()
            r3 = 1
            if (r18 == 0) goto L1c
            int r4 = r14.getViewVisibility(r1)
            if (r4 != 0) goto L17
            goto L1c
        L17:
            r1 = r18
            r12 = 1
        L1a:
            r4 = r2
            goto L1f
        L1c:
            r4 = -1
            r12 = -1
            goto L1a
        L1f:
            int r2 = r14.getViewX(r1)
            int r1 = r14.getViewY(r1)
            r5 = 2
            int[] r6 = new int[r5]
            r7 = r15
            r15.getLocationOnScreen(r6)
            r8 = 0
            r8 = r6[r8]
            float r9 = r15.getTranslationX()
            int r9 = java.lang.Math.round(r9)
            int r8 = r8 + r9
            r3 = r6[r3]
            float r6 = r15.getTranslationY()
            int r6 = java.lang.Math.round(r6)
            int r3 = r3 + r6
            int r6 = r15.getWidth()
            int r6 = r6 + r8
            int r9 = r15.getHeight()
            int r9 = r9 + r3
            if (r4 == 0) goto L65
            int r5 = r4.centerX()
            int r4 = r4.centerY()
            r0 = r3
            r3 = r1
            r1 = r7
            r7 = r0
            r0 = r5
            r5 = r4
            r4 = r0
        L60:
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r14
            goto L71
        L65:
            int r4 = r8 + r6
            int r4 = r4 / r5
            int r13 = r3 + r9
            int r5 = r13 / 2
            r0 = r3
            r3 = r1
            r1 = r7
            r7 = r0
            goto L60
        L71:
            int r2 = r0.distance(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r1 = (float) r2
            int r2 = r14.getMaxDistance(r15)
            float r2 = (float) r2
            float r1 = r1 / r2
            long r2 = r16.getDuration()
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 >= 0) goto L86
            r2 = 300(0x12c, double:1.48E-321)
        L86:
            long r4 = (long) r12
            long r2 = r2 * r4
            float r2 = (float) r2
            float r3 = r14.mPropagationSpeed
            float r2 = r2 / r3
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            long r1 = (long) r1
            return r1
    }

    public void setPropagationSpeed(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L8
            r1.mPropagationSpeed = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "propagationSpeed may not be 0"
            r2.<init>(r0)
            throw r2
    }

    public void setSide(int r1) {
            r0 = this;
            r0.mSide = r1
            return
    }
}
