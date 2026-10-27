package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzly extends com.google.android.gms.internal.mlkit_vision_common.zzmd {
    private java.lang.String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    zzly() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final com.google.android.gms.internal.mlkit_vision_common.zzmd zza(boolean r2) {
            r1 = this;
            r2 = 1
            r1.zzb = r2
            byte r0 = r1.zzd
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.zzd = r2
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final com.google.android.gms.internal.mlkit_vision_common.zzmd zzb(int r1) {
            r0 = this;
            r1 = 1
            r0.zzc = r1
            byte r1 = r0.zzd
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_common.zzmd zzc(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "vision-common"
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final com.google.android.gms.internal.mlkit_vision_common.zzme zzd() {
            r5 = this;
            byte r0 = r5.zzd
            r1 = 3
            if (r0 != r1) goto L15
            java.lang.String r0 = r5.zza
            if (r0 != 0) goto La
            goto L15
        La:
            com.google.android.gms.internal.mlkit_vision_common.zzma r1 = new com.google.android.gms.internal.mlkit_vision_common.zzma
            boolean r2 = r5.zzb
            int r3 = r5.zzc
            r4 = 0
            r1.<init>(r0, r2, r3, r4)
            return r1
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.zza
            if (r1 != 0) goto L23
            java.lang.String r1 = " libraryName"
            r0.append(r1)
        L23:
            byte r1 = r5.zzd
            r1 = r1 & 1
            if (r1 != 0) goto L2e
            java.lang.String r1 = " enableFirelog"
            r0.append(r1)
        L2e:
            byte r1 = r5.zzd
            r1 = r1 & 2
            if (r1 != 0) goto L39
            java.lang.String r1 = " firelogEventType"
            r0.append(r1)
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
