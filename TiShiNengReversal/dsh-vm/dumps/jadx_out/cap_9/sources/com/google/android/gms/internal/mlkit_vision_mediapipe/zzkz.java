package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzkz {
    static final java.nio.charset.Charset zza = null;
    public static final byte[] zzb = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r2 = new byte[r0]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb = r2
            java.nio.ByteBuffer.wrap(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjq r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjq
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r1.zza(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L29
            return
        L29:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public zzkz() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int zza(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    static int zzb(int r1, byte[] r2, int r3, int r4) {
            r3 = 0
        L1:
            if (r3 >= r4) goto Lb
            int r1 = r1 * 31
            r0 = r2[r3]
            int r1 = r1 + r0
            int r3 = r3 + 1
            goto L1
        Lb:
            return r1
    }

    static java.lang.Object zzc(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "messageType"
            r0.<init>(r1)
            throw r0
    }
}
