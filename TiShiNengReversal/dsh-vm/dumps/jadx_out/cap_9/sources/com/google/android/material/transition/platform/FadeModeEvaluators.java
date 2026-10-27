package com.google.android.material.transition.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class FadeModeEvaluators {
    private static final com.google.android.material.transition.platform.FadeModeEvaluator CROSS = null;
    private static final com.google.android.material.transition.platform.FadeModeEvaluator IN = null;
    private static final com.google.android.material.transition.platform.FadeModeEvaluator OUT = null;
    private static final com.google.android.material.transition.platform.FadeModeEvaluator THROUGH = null;





    static {
            com.google.android.material.transition.platform.FadeModeEvaluators$1 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$1
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.IN = r0
            com.google.android.material.transition.platform.FadeModeEvaluators$2 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$2
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.OUT = r0
            com.google.android.material.transition.platform.FadeModeEvaluators$3 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$3
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.CROSS = r0
            com.google.android.material.transition.platform.FadeModeEvaluators$4 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$4
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.THROUGH = r0
            return
    }

    private FadeModeEvaluators() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.material.transition.platform.FadeModeEvaluator get(int r2, boolean r3) {
            if (r2 == 0) goto L30
            r0 = 1
            if (r2 == r0) goto L28
            r3 = 2
            if (r2 == r3) goto L25
            r3 = 3
            if (r2 != r3) goto Le
            com.google.android.material.transition.platform.FadeModeEvaluator r2 = com.google.android.material.transition.platform.FadeModeEvaluators.THROUGH
            return r2
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid fade mode: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L25:
            com.google.android.material.transition.platform.FadeModeEvaluator r2 = com.google.android.material.transition.platform.FadeModeEvaluators.CROSS
            return r2
        L28:
            if (r3 == 0) goto L2d
            com.google.android.material.transition.platform.FadeModeEvaluator r2 = com.google.android.material.transition.platform.FadeModeEvaluators.OUT
            return r2
        L2d:
            com.google.android.material.transition.platform.FadeModeEvaluator r2 = com.google.android.material.transition.platform.FadeModeEvaluators.IN
            return r2
        L30:
            if (r3 == 0) goto L35
            com.google.android.material.transition.platform.FadeModeEvaluator r2 = com.google.android.material.transition.platform.FadeModeEvaluators.IN
            return r2
        L35:
            com.google.android.material.transition.platform.FadeModeEvaluator r2 = com.google.android.material.transition.platform.FadeModeEvaluators.OUT
            return r2
    }
}
