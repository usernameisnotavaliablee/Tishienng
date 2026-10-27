package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzjo implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo zzb = null;
    private int zza;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb = r0
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziz.zza
            return
    }

    zzjo() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    static int zzh(int r3, int r4, int r5) {
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

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo zzj(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            zzh(r4, r0, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            if (r0 != 0) goto L12
            r0 = 0
            int r1 = r2.zzd()
            int r0 = r2.zze(r1, r0, r1)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.zza = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjh r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjh
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
            java.lang.String r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmu.zza(r6)
            goto L30
        L20:
            r3 = 47
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r3 = r6.zzf(r5, r3)
            java.lang.String r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmu.zza(r3)
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

    public abstract com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo zzf(int r1, int r2);

    abstract void zzg(com.google.android.gms.internal.mlkit_vision_mediapipe.zzjg r1) throws java.io.IOException;

    protected final int zzi() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
