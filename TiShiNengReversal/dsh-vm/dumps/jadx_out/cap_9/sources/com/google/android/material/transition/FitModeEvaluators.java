package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class FitModeEvaluators {
    private static final com.google.android.material.transition.FitModeEvaluator HEIGHT = null;
    private static final com.google.android.material.transition.FitModeEvaluator WIDTH = null;



    static {
            com.google.android.material.transition.FitModeEvaluators$1 r0 = new com.google.android.material.transition.FitModeEvaluators$1
            r0.<init>()
            com.google.android.material.transition.FitModeEvaluators.WIDTH = r0
            com.google.android.material.transition.FitModeEvaluators$2 r0 = new com.google.android.material.transition.FitModeEvaluators$2
            r0.<init>()
            com.google.android.material.transition.FitModeEvaluators.HEIGHT = r0
            return
    }

    private FitModeEvaluators() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.material.transition.FitModeEvaluator get(int r0, boolean r1, android.graphics.RectF r2, android.graphics.RectF r3) {
            if (r0 == 0) goto L25
            r1 = 1
            if (r0 == r1) goto L22
            r1 = 2
            if (r0 != r1) goto Lb
            com.google.android.material.transition.FitModeEvaluator r0 = com.google.android.material.transition.FitModeEvaluators.HEIGHT
            return r0
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid fit mode: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L22:
            com.google.android.material.transition.FitModeEvaluator r0 = com.google.android.material.transition.FitModeEvaluators.WIDTH
            return r0
        L25:
            boolean r0 = shouldAutoFitToWidth(r1, r2, r3)
            if (r0 == 0) goto L2e
            com.google.android.material.transition.FitModeEvaluator r0 = com.google.android.material.transition.FitModeEvaluators.WIDTH
            return r0
        L2e:
            com.google.android.material.transition.FitModeEvaluator r0 = com.google.android.material.transition.FitModeEvaluators.HEIGHT
            return r0
    }

    private static boolean shouldAutoFitToWidth(boolean r4, android.graphics.RectF r5, android.graphics.RectF r6) {
            float r0 = r5.width()
            float r5 = r5.height()
            float r1 = r6.width()
            float r6 = r6.height()
            float r2 = r6 * r0
            float r2 = r2 / r1
            float r1 = r1 * r5
            float r1 = r1 / r0
            r0 = 0
            r3 = 1
            if (r4 == 0) goto L20
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L1f
            return r3
        L1f:
            return r0
        L20:
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 < 0) goto L25
            return r3
        L25:
            return r0
    }
}
