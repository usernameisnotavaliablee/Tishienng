package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvk {
    private final java.lang.String zza;

    zzvk(java.lang.String r7) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "Null FID"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            int r0 = r7.length()
            r1 = 22
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            java.lang.String r4 = "Invalid FID: must be exactly 22 characters: "
            java.lang.String r4 = r4.concat(r7)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r4)
            char r1 = r7.charAt(r2)
            r4 = 99
            if (r1 < r4) goto L2c
            r4 = 102(0x66, float:1.43E-43)
            if (r1 > r4) goto L2c
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            java.lang.String r4 = "Invalid FID: must start with [c-f]: "
            java.lang.String r4 = r4.concat(r7)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r4)
            r1 = 0
        L37:
            if (r1 >= r0) goto L6e
            char r4 = r7.charAt(r1)
            r5 = 48
            if (r4 < r5) goto L48
            r5 = 57
            if (r4 <= r5) goto L46
            goto L48
        L46:
            r4 = 1
            goto L62
        L48:
            r5 = 97
            if (r4 < r5) goto L50
            r5 = 122(0x7a, float:1.71E-43)
            if (r4 <= r5) goto L46
        L50:
            r5 = 65
            if (r4 < r5) goto L58
            r5 = 90
            if (r4 <= r5) goto L46
        L58:
            r5 = 45
            if (r4 == r5) goto L46
            r5 = 95
            if (r4 != r5) goto L61
            goto L46
        L61:
            r4 = 0
        L62:
            java.lang.String r5 = "Invalid FID: must contain only URL-safe base-64 characters: "
            java.lang.String r5 = r5.concat(r7)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r5)
            int r1 = r1 + 1
            goto L37
        L6e:
            r6.zza = r7
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzvk
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzvk) r2
            java.lang.String r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
