package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzde implements java.util.Comparator {
    zzde() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zza(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zza(r4)
            if (r0 != r1) goto L3f
            int r0 = r0.ordinal()
            if (r0 == 0) goto L36
            r1 = 1
            if (r0 == r1) goto L2d
            r1 = 2
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 != r1) goto L22
            java.lang.Double r3 = (java.lang.Double) r3
            java.lang.Double r4 = (java.lang.Double) r4
            int r3 = r3.compareTo(r4)
            return r3
        L22:
            r3 = 0
            throw r3
        L24:
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Long r4 = (java.lang.Long) r4
            int r3 = r3.compareTo(r4)
            return r3
        L2d:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r3.compareTo(r4)
            return r3
        L36:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            int r3 = r3.compareTo(r4)
            return r3
        L3f:
            int r3 = r0.compareTo(r1)
            return r3
    }
}
