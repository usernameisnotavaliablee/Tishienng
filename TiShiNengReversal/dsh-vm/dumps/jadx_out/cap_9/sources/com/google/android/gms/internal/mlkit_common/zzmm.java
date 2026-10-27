package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzmm extends java.lang.Enum implements com.google.android.gms.internal.mlkit_common.zzba {
    public static final com.google.android.gms.internal.mlkit_common.zzmm zza = null;
    public static final com.google.android.gms.internal.mlkit_common.zzmm zzb = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_common.zzmm[] zzc = null;
    private final int zzd;

    static {
            com.google.android.gms.internal.mlkit_common.zzmm r0 = new com.google.android.gms.internal.mlkit_common.zzmm
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_common.zzmm.zza = r0
            com.google.android.gms.internal.mlkit_common.zzmm r1 = new com.google.android.gms.internal.mlkit_common.zzmm
            java.lang.String r3 = "TRANSLATE"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_common.zzmm.zzb = r1
            r3 = 2
            com.google.android.gms.internal.mlkit_common.zzmm[] r3 = new com.google.android.gms.internal.mlkit_common.zzmm[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.google.android.gms.internal.mlkit_common.zzmm.zzc = r3
            return
    }

    zzmm(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzd = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzmm[] values() {
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = com.google.android.gms.internal.mlkit_common.zzmm.zzc
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = (com.google.android.gms.internal.mlkit_common.zzmm[]) r0
            return r0
    }

    public static com.google.android.gms.internal.mlkit_common.zzmm zzb(int r5) {
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.zzd
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.internal.mlkit_common.zzmm r5 = com.google.android.gms.internal.mlkit_common.zzmm.zza
            return r5
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }
}
