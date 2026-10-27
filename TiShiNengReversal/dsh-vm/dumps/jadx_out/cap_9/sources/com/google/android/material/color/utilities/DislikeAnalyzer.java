package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static com.google.android.material.color.utilities.Hct fixIfDisliked(com.google.android.material.color.utilities.Hct r7) {
            boolean r0 = isDisliked(r7)
            if (r0 == 0) goto L17
            double r1 = r7.getHue()
            double r3 = r7.getChroma()
            r5 = 4634626229029306368(0x4051800000000000, double:70.0)
            com.google.android.material.color.utilities.Hct r7 = com.google.android.material.color.utilities.Hct.from(r1, r3, r5)
        L17:
            return r7
    }

    public static boolean isDisliked(com.google.android.material.color.utilities.Hct r8) {
            double r0 = r8.getHue()
            long r0 = java.lang.Math.round(r0)
            double r0 = (double) r0
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L28
            double r0 = r8.getHue()
            long r0 = java.lang.Math.round(r0)
            double r0 = (double) r0
            r2 = 4637511347540590592(0x405bc00000000000, double:111.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            double r1 = r8.getChroma()
            long r1 = java.lang.Math.round(r1)
            double r1 = (double) r1
            r6 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L3a
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            double r2 = r8.getTone()
            long r2 = java.lang.Math.round(r2)
            double r2 = (double) r2
            r6 = 4634274385308418048(0x4050400000000000, double:65.0)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4f
            r8 = 1
            goto L50
        L4f:
            r8 = 0
        L50:
            if (r0 == 0) goto L57
            if (r1 == 0) goto L57
            if (r8 == 0) goto L57
            return r5
        L57:
            return r4
    }
}
