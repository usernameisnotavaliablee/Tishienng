package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzxo {

    @androidx.annotation.VisibleForTesting
    public static final java.util.Random zza = null;
    private static final int[] zzb = null;

    static {
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [0, 0, 1, 2, 4, 8, 16} // fill-array
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zzb = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zza = r0
            return
    }

    public zzxo() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzxn r6) throws java.lang.InterruptedException {
            int[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zzb
            r1 = 0
            r2 = 0
        L4:
            r3 = 7
            if (r2 >= r3) goto L3b
            r3 = r0[r2]
            if (r3 <= 0) goto L1d
            r4 = 60000(0xea60, float:8.4078E-41)
            int r3 = r3 * r4
            java.util.Random r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zza
            int r5 = r3 / 2
            int r3 = r4.nextInt(r3)
            int r5 = r5 + r3
            long r3 = (long) r5
            java.lang.Thread.sleep(r3)
        L1d:
            boolean r3 = r6.zza()     // Catch: java.io.IOException -> L26 com.google.android.gms.internal.mlkit_vision_pose_common.zzxm -> L28 java.lang.InterruptedException -> L39
            if (r3 != 0) goto L24
            goto L36
        L24:
            r6 = 1
            return r6
        L26:
            r3 = move-exception
            goto L29
        L28:
            r3 = move-exception
        L29:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "retryWithRandomizedExponentialBackoff: "
            r4.concat(r3)
        L36:
            int r2 = r2 + 1
            goto L4
        L39:
            r6 = move-exception
            throw r6
        L3b:
            return r1
    }
}
