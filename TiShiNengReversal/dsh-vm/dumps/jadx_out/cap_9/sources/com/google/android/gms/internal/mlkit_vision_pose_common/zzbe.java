package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbe {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private final java.lang.Object zzc;

    zzbe(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    final java.lang.IllegalArgumentException zza() {
            r7 = this;
            java.lang.Object r0 = r7.zzc
            java.lang.Object r1 = r7.zzb
            java.lang.Object r2 = r7.zza
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Multiple entries with same key: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "="
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " and "
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            return r3
    }
}
