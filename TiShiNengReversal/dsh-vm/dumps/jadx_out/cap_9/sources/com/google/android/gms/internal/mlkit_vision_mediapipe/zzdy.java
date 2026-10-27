package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdy {
    public zzdy() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object zza(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.String r0 = " must not be null"
            java.lang.String r0 = r1.concat(r0)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String zzb(java.lang.String r3) {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L4b
            r0 = 0
            char r0 = r3.charAt(r0)
            boolean r0 = zzd(r0)
            if (r0 == 0) goto L3f
            r0 = 1
        L12:
            int r1 = r3.length()
            if (r0 >= r1) goto L3e
            char r1 = r3.charAt(r0)
            boolean r2 = zzd(r1)
            if (r2 != 0) goto L3b
            r2 = 48
            if (r1 < r2) goto L2a
            r2 = 57
            if (r1 <= r2) goto L3b
        L2a:
            r2 = 95
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            java.lang.String r0 = "identifier must contain only ASCII letters, digits or underscore: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L3b:
            int r0 = r0 + 1
            goto L12
        L3e:
            return r3
        L3f:
            java.lang.String r0 = "identifier must start with an ASCII letter: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L4b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "identifier must not be empty"
            r3.<init>(r0)
            throw r3
    }

    public static void zzc(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    private static boolean zzd(char r3) {
            r0 = 97
            r1 = 1
            if (r3 < r0) goto Lb
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 <= r0) goto La
            goto Lb
        La:
            return r1
        Lb:
            r0 = 65
            r2 = 0
            if (r3 < r0) goto L15
            r0 = 90
            if (r3 > r0) goto L15
            return r1
        L15:
            return r2
    }
}
