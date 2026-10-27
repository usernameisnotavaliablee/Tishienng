package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhy {
    public zzhy() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2) {
            long r0 = r2.zza()
            int r2 = zzf(r0)
            return r2
    }

    public static int zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2) {
            long r0 = r2.zza()
            int r2 = zzg(r0)
            return r2
    }

    public static java.util.List zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzme r5) {
            long r0 = r4.zza()
            byte[][] r4 = zzj(r0)
            if (r4 == 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L20
            r0.<init>()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L20
            int r1 = r4.length     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L20
            r2 = 0
        L11:
            if (r2 >= r1) goto L1f
            r3 = r4[r2]     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L20
            java.lang.Object r3 = r5.zzb(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L20
            r0.add(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L20
            int r2 = r2 + 1
            goto L11
        L1f:
            return r0
        L20:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
        L27:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "Vector of protocol buffer objects should not be null!"
            r4.<init>(r5)
            throw r4
    }

    public static boolean zzd(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2, java.nio.ByteBuffer r3) {
            long r0 = r2.zza()
            boolean r2 = zzh(r0, r3)
            return r2
    }

    public static byte[] zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2) {
            long r0 = r2.zza()
            byte[] r2 = zzi(r0)
            return r2
    }

    private static native int zzf(long r0);

    private static native int zzg(long r0);

    private static native boolean zzh(long r0, java.nio.ByteBuffer r2);

    private static native byte[] zzi(long r0);

    private static native byte[][] zzj(long r0);
}
