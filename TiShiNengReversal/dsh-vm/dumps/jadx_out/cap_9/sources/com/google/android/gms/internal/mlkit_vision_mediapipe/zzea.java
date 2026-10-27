package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzea implements java.io.Closeable {
    private static final java.lang.ThreadLocal zza = null;
    private int zzb;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdz r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdz
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzea.zza = r0
            return
    }

    public zzea() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    public static int zza() {
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzea.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzea r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzea) r0
            int r0 = r0.zzb
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzea zzc() {
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzea.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzea r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzea) r0
            int r1 = r0.zzb
            int r1 = r1 + 1
            r0.zzb = r1
            if (r1 == 0) goto L11
            return r0
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Overflow of RecursionDepth (possible error in core library)"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            int r0 = r2.zzb
            if (r0 <= 0) goto L9
            int r0 = r0 + (-1)
            r2.zzb = r0
            return
        L9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Mismatched calls to RecursionDepth (possible error in core library)"
            r0.<init>(r1)
            throw r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
