package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzb {
    public zzb() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void zza(int r2, int r3, int r4) {
            if (r2 < 0) goto L8
            if (r3 < r2) goto L8
            if (r3 <= r4) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r2 < 0) goto L32
            if (r2 > r4) goto L32
            if (r3 < 0) goto L2b
            if (r3 <= r4) goto L13
            goto L2b
        L13:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            r4[r1] = r3
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzc.zza(r2, r4)
            goto L38
        L2b:
            java.lang.String r2 = "end index"
            java.lang.String r2 = zzd(r3, r4, r2)
            goto L38
        L32:
            java.lang.String r3 = "start index"
            java.lang.String r2 = zzd(r2, r4, r3)
        L38:
            r0.<init>(r2)
            throw r0
    }

    public static void zzb(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public static void zzc(boolean r0, @javax.annotation.CheckForNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String zzd(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzc.zza(r4, r5)
            return r4
        L16:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            r3[r0] = r4
            r3[r2] = r5
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzc.zza(r4, r3)
            return r4
    }
}
