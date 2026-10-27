package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzct {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzct zza = null;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final boolean zzd;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzct r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzct
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r1, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzct.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzct r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzct
            java.lang.String r1 = "  "
            r2 = 1
            java.lang.String r3 = "\n"
            r0.<init>(r3, r1, r2)
            return
    }

    private zzct(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "newline == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "indent == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "[\r\n]*"
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "[ \t]*"
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L24
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            return
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Only combinations of spaces and tabs are allowed in indent."
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Only combinations of \\n and \\r are allowed in newline."
            r2.<init>(r3)
            throw r2
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
