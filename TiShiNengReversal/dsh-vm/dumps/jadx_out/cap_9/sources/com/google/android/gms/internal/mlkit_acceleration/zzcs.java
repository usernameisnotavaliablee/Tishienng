package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzcs implements java.lang.Iterable, java.io.Serializable {
    private static final java.util.Comparator zza = null;
    public static final com.google.android.gms.internal.mlkit_acceleration.zzcs zzb = null;
    private static final com.google.android.gms.internal.mlkit_acceleration.zzcr zzd = null;
    private int zzc;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzcp r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcp
            byte[] r1 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcs.zzb = r0
            int r0 = com.google.android.gms.internal.mlkit_acceleration.zzce.zza
            com.google.android.gms.internal.mlkit_acceleration.zzcr r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcr
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcs.zzd = r0
            com.google.android.gms.internal.mlkit_acceleration.zzck r0 = new com.google.android.gms.internal.mlkit_acceleration.zzck
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzcs.zza = r0
            return
    }

    zzcs() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzc = r0
            return
    }

    static int zzj(int r3, int r4, int r5) {
            r0 = r3 | r4
            int r1 = r4 - r3
            r0 = r0 | r1
            int r2 = r5 - r4
            r0 = r0 | r2
            if (r0 >= 0) goto L68
            if (r3 < 0) goto L4c
            if (r4 >= r3) goto L2d
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Beginning index larger than ending index: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L2d:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End index: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " >= "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L4c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Beginning index: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " < 0"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L68:
            return r1
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzcs zzl(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            zzj(r4, r0, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcp r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcp
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzc
            if (r0 != 0) goto L12
            r0 = 0
            int r1 = r2.zzd()
            int r0 = r2.zze(r1, r0, r1)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.zzc = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzcj r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcj
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            int r2 = r6.zzd()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.zzd()
            r4 = 50
            r5 = 0
            if (r3 > r4) goto L20
            java.lang.String r3 = com.google.android.gms.internal.mlkit_acceleration.zzgb.zza(r6)
            goto L30
        L20:
            r3 = 47
            com.google.android.gms.internal.mlkit_acceleration.zzcs r3 = r6.zzf(r5, r3)
            java.lang.String r3 = com.google.android.gms.internal.mlkit_acceleration.zzgb.zza(r3)
            java.lang.String r4 = "..."
            java.lang.String r3 = r3.concat(r4)
        L30:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r1, r4)
            return r0
    }

    public abstract byte zza(int r1);

    abstract byte zzb(int r1);

    public abstract int zzd();

    protected abstract int zze(int r1, int r2, int r3);

    public abstract com.google.android.gms.internal.mlkit_acceleration.zzcs zzf(int r1, int r2);

    protected abstract java.lang.String zzg(java.nio.charset.Charset r1);

    abstract void zzh(com.google.android.gms.internal.mlkit_acceleration.zzci r1) throws java.io.IOException;

    public abstract boolean zzi();

    protected final int zzk() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final java.lang.String zzm(java.nio.charset.Charset r2) {
            r1 = this;
            int r0 = r1.zzd()
            if (r0 != 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r2 = r1.zzg(r2)
            return r2
    }
}
