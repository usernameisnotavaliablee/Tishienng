package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzaf {
    private final com.google.android.gms.internal.mlkit_acceleration.zzp zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.mlkit_acceleration.zzae zzc;

    private zzaf(com.google.android.gms.internal.mlkit_acceleration.zzae r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzp r0 = com.google.android.gms.internal.mlkit_acceleration.zzn.zza
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    private zzaf(com.google.android.gms.internal.mlkit_acceleration.zzae r1, boolean r2, com.google.android.gms.internal.mlkit_acceleration.zzp r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzp zza(com.google.android.gms.internal.mlkit_acceleration.zzaf r0) {
            com.google.android.gms.internal.mlkit_acceleration.zzp r0 = r0.zza
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzaf zzd(java.lang.String r2) {
            int r0 = r2.length()
            if (r0 == 0) goto L2d
            int r0 = r2.length()
            r1 = 1
            if (r0 != r1) goto L22
            r0 = 0
            char r2 = r2.charAt(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzl r0 = new com.google.android.gms.internal.mlkit_acceleration.zzl
            r0.<init>(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzaf r2 = new com.google.android.gms.internal.mlkit_acceleration.zzaf
            com.google.android.gms.internal.mlkit_acceleration.zzx r1 = new com.google.android.gms.internal.mlkit_acceleration.zzx
            r1.<init>(r0)
            r2.<init>(r1)
            return r2
        L22:
            com.google.android.gms.internal.mlkit_acceleration.zzaf r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaf
            com.google.android.gms.internal.mlkit_acceleration.zzz r1 = new com.google.android.gms.internal.mlkit_acceleration.zzz
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        L2d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The separator may not be the empty string."
            r2.<init>(r0)
            throw r2
    }

    static /* bridge */ /* synthetic */ java.util.Iterator zzg(com.google.android.gms.internal.mlkit_acceleration.zzaf r1, java.lang.CharSequence r2) {
            com.google.android.gms.internal.mlkit_acceleration.zzae r0 = r1.zzc
            java.util.Iterator r1 = r0.zza(r1, r2)
            return r1
    }

    static /* bridge */ /* synthetic */ boolean zzh(com.google.android.gms.internal.mlkit_acceleration.zzaf r0) {
            boolean r0 = r0.zzb
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzac zzb(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = " == "
            com.google.android.gms.internal.mlkit_acceleration.zzaf r3 = zzd(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzac r0 = new com.google.android.gms.internal.mlkit_acceleration.zzac
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzaf zzc() {
            r5 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzp r0 = r5.zza
            com.google.android.gms.internal.mlkit_acceleration.zzaf r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaf
            com.google.android.gms.internal.mlkit_acceleration.zzae r2 = r5.zzc
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzaf zze(com.google.android.gms.internal.mlkit_acceleration.zzp r5) {
            r4 = this;
            r5.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzae r0 = r4.zzc
            boolean r1 = r4.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzaf r2 = new com.google.android.gms.internal.mlkit_acceleration.zzaf
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r0, r1, r5, r3)
            return r2
    }

    public final java.lang.Iterable zzf(java.lang.CharSequence r2) {
            r1 = this;
            r2.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzaa r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaa
            r0.<init>(r1, r2)
            return r0
    }
}
