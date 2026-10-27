package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzcv {
    @java.lang.Deprecated
    public zzcv() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L19
            r0.<init>()     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdw r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdw     // Catch: java.io.IOException -> L19
            r1.<init>(r0)     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zza     // Catch: java.io.IOException -> L19
            r1.zzj(r2)     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.mlkit_vision_pose_common.zzde r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzds.zza     // Catch: java.io.IOException -> L19
            r2.zzb(r1, r3)     // Catch: java.io.IOException -> L19
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L19
            return r0
        L19:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzcy zzb() {
            r3 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcy
            if (r0 == 0) goto L8
            r0 = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcy) r0
            return r0
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "Not a JSON Object: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
    }
}
