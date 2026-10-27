package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzjj extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn {
    private final int zzc;

    zzjj(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r2 = 0
            int r1 = r1.length
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzh(r2, r3, r1)
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
    public final byte zza(int r5) {
            r4 = this;
            int r0 = r4.zzc
            int r1 = r5 + 1
            int r1 = r0 - r1
            r1 = r1 | r5
            if (r1 >= 0) goto L41
            if (r5 >= 0) goto L22
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index < 0: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L22:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index > length: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L41:
            byte[] r0 = r4.zza
            r5 = r0[r5]
            return r5
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
    final byte zzb(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn
    protected final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }
}
