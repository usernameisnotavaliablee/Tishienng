package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzhu extends java.lang.RuntimeException {
    public zzhu(int r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzht[] r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzht.values()
            r0 = r0[r3]
            java.lang.String r0 = r0.zza()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r2.<init>(r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzht[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzht.values()
            r3 = r4[r3]
            return
    }

    zzhu(int r3, byte[] r4) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zza.zza
            r0.<init>(r4, r1)
            r2.<init>(r3, r0)
            return
    }
}
