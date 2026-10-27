package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzcy {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb;
    com.google.android.gms.internal.mlkit_acceleration.zzcz zzc;

    static {
            return
    }

    /* synthetic */ zzcy(com.google.android.gms.internal.mlkit_acceleration.zzcx r1) {
            r0 = this;
            r0.<init>()
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzcy.zze
            r0.zzb = r1
            return
    }

    public static int zzF(int r1) {
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
            return r1
    }

    public static long zzG(long r3) {
            r0 = 1
            long r0 = r0 & r3
            r2 = 1
            long r3 = r3 >>> r2
            long r0 = -r0
            long r3 = r3 ^ r0
            return r3
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzcy zzH(byte[] r6, int r7, int r8, boolean r9) {
            com.google.android.gms.internal.mlkit_acceleration.zzcu r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcu
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = 0
            r0.zze(r6)     // Catch: com.google.android.gms.internal.mlkit_acceleration.zzed -> Lf
            return r0
        Lf:
            r0 = move-exception
            r6 = r0
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    public abstract void zzA(int r1);

    public abstract boolean zzC() throws java.io.IOException;

    public abstract boolean zzD() throws java.io.IOException;

    public abstract boolean zzE(int r1) throws java.io.IOException;

    public abstract double zzb() throws java.io.IOException;

    public abstract float zzc() throws java.io.IOException;

    public abstract int zzd();

    public abstract int zze(int r1) throws com.google.android.gms.internal.mlkit_acceleration.zzed;

    public abstract int zzf() throws java.io.IOException;

    public abstract int zzg() throws java.io.IOException;

    public abstract int zzh() throws java.io.IOException;

    public abstract int zzk() throws java.io.IOException;

    public abstract int zzl() throws java.io.IOException;

    public abstract int zzm() throws java.io.IOException;

    public abstract int zzn() throws java.io.IOException;

    public abstract long zzo() throws java.io.IOException;

    public abstract long zzp() throws java.io.IOException;

    public abstract long zzt() throws java.io.IOException;

    public abstract long zzu() throws java.io.IOException;

    public abstract long zzv() throws java.io.IOException;

    public abstract com.google.android.gms.internal.mlkit_acceleration.zzcs zzw() throws java.io.IOException;

    public abstract java.lang.String zzx() throws java.io.IOException;

    public abstract java.lang.String zzy() throws java.io.IOException;

    public abstract void zzz(int r1) throws com.google.android.gms.internal.mlkit_acceleration.zzed;
}
