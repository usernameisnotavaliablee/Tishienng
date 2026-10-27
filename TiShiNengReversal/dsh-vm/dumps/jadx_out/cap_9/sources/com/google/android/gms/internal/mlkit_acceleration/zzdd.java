package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzdd extends com.google.android.gms.internal.mlkit_acceleration.zzci {
    private static final java.util.logging.Logger zzb = null;
    private static final boolean zzc = false;
    com.google.android.gms.internal.mlkit_acceleration.zzde zza;

    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzdd> r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzdd.zzb = r0
            boolean r0 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzx()
            com.google.android.gms.internal.mlkit_acceleration.zzdd.zzc = r0
            return
    }

    private zzdd() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ zzdd(com.google.android.gms.internal.mlkit_acceleration.zzdc r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ boolean zzB() {
            boolean r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzc
            return r0
    }

    @java.lang.Deprecated
    static int zzt(int r0, com.google.android.gms.internal.mlkit_acceleration.zzfa r1, com.google.android.gms.internal.mlkit_acceleration.zzfm r2) {
            int r0 = r0 << 3
            int r0 = zzw(r0)
            int r0 = r0 + r0
            com.google.android.gms.internal.mlkit_acceleration.zzcc r1 = (com.google.android.gms.internal.mlkit_acceleration.zzcc) r1
            int r1 = r1.zzt(r2)
            int r0 = r0 + r1
            return r0
    }

    static int zzu(com.google.android.gms.internal.mlkit_acceleration.zzfa r0, com.google.android.gms.internal.mlkit_acceleration.zzfm r1) {
            com.google.android.gms.internal.mlkit_acceleration.zzcc r0 = (com.google.android.gms.internal.mlkit_acceleration.zzcc) r0
            int r0 = r0.zzt(r1)
            int r1 = zzw(r0)
            int r1 = r1 + r0
            return r1
    }

    public static int zzv(java.lang.String r1) {
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzgs.zzc(r1)     // Catch: com.google.android.gms.internal.mlkit_acceleration.zzgr -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzb
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = zzw(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzw(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 * 9
            int r0 = 352 - r0
            int r0 = r0 >>> 6
            return r0
    }

    public static int zzx(long r0) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r0 = r0 * 9
            int r0 = 640 - r0
            int r0 = r0 >>> 6
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzdd zzy(byte[] r1, int r2, int r3) {
            com.google.android.gms.internal.mlkit_acceleration.zzda r2 = new com.google.android.gms.internal.mlkit_acceleration.zzda
            r0 = 0
            r2.<init>(r1, r0, r3)
            return r2
    }

    final void zzA(java.lang.String r7, com.google.android.gms.internal.mlkit_acceleration.zzgr r8) throws java.io.IOException {
            r6 = this;
            java.util.logging.Logger r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzb
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r3 = "inefficientWriteStringNoTag"
            java.lang.String r4 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            java.lang.String r2 = "com.google.protobuf.CodedOutputStream"
            r5 = r8
            r0.logp(r1, r2, r3, r4, r5)
            java.nio.charset.Charset r8 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzb
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r6.zzq(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r0 = 0
            r6.zzl(r7, r0, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            return
        L1d:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.internal.mlkit_acceleration.zzdb r8 = new com.google.android.gms.internal.mlkit_acceleration.zzdb
            r8.<init>(r7)
            throw r8
    }

    public abstract int zza();

    public abstract void zzb(byte r1) throws java.io.IOException;

    public abstract void zzd(int r1, boolean r2) throws java.io.IOException;

    public abstract void zze(int r1, com.google.android.gms.internal.mlkit_acceleration.zzcs r2) throws java.io.IOException;

    public abstract void zzf(int r1, int r2) throws java.io.IOException;

    public abstract void zzg(int r1) throws java.io.IOException;

    public abstract void zzh(int r1, long r2) throws java.io.IOException;

    public abstract void zzi(long r1) throws java.io.IOException;

    public abstract void zzj(int r1, int r2) throws java.io.IOException;

    public abstract void zzk(int r1) throws java.io.IOException;

    public abstract void zzl(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract void zzm(int r1, java.lang.String r2) throws java.io.IOException;

    public abstract void zzo(int r1, int r2) throws java.io.IOException;

    public abstract void zzp(int r1, int r2) throws java.io.IOException;

    public abstract void zzq(int r1) throws java.io.IOException;

    public abstract void zzr(int r1, long r2) throws java.io.IOException;

    public abstract void zzs(long r1) throws java.io.IOException;

    public final void zzz() {
            r2 = this;
            int r0 = r2.zza()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)
            throw r0
    }
}
