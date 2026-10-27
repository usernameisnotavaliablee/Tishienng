package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzda {
    public zzda() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzcv zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzdu r7) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzcw, com.google.android.gms.internal.mlkit_vision_pose_common.zzdc {
            java.lang.String r0 = " to Json"
            java.lang.String r1 = "Failed parsing JSON source: "
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r2 = r7.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zzb
            if (r2 != r3) goto L11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zza
            r7.zzk(r3)
        L11:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdq.zza(r7)     // Catch: java.lang.Throwable -> L19 java.lang.OutOfMemoryError -> L1b java.lang.StackOverflowError -> L38
            r7.zzk(r2)
            return r0
        L19:
            r0 = move-exception
            goto L55
        L1b:
            r3 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcz r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzcz     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r6.<init>()     // Catch: java.lang.Throwable -> L19
            r6.append(r1)     // Catch: java.lang.Throwable -> L19
            r6.append(r5)     // Catch: java.lang.Throwable -> L19
            r6.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L19
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L38:
            r3 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcz r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzcz     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r6.<init>()     // Catch: java.lang.Throwable -> L19
            r6.append(r1)     // Catch: java.lang.Throwable -> L19
            r6.append(r5)     // Catch: java.lang.Throwable -> L19
            r6.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L19
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L55:
            r7.zzk(r2)
            throw r0
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzcv zzb(java.lang.String r2) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzdc {
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdu r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdu     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r0 = zza(r2)     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcx     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            if (r1 != 0) goto L23
            int r2 = r2.zzn()     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            r1 = 10
            if (r2 != r1) goto L1b
            goto L23
        L1b:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdc r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdc     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            java.lang.String r0 = "Did not consume the entire document."
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
            throw r2     // Catch: java.lang.NumberFormatException -> L24 java.io.IOException -> L2b com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L32
        L23:
            return r0
        L24:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdc r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdc
            r0.<init>(r2)
            throw r0
        L2b:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcw r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzcw
            r0.<init>(r2)
            throw r0
        L32:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdc r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdc
            r0.<init>(r2)
            throw r0
    }
}
