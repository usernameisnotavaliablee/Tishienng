package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbi extends com.google.android.gms.internal.mlkit_acceleration.zzap implements java.util.concurrent.RunnableFuture {

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.mlkit_acceleration.zzaz zzc;

    zzbi(java.util.concurrent.Callable r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzbh r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbh
            r0.<init>(r1, r2)
            r1.zzc = r0
            return
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzbi zzn(java.lang.Runnable r1, java.lang.Object r2) {
            com.google.android.gms.internal.mlkit_acceleration.zzbi r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbi
            java.util.concurrent.Callable r1 = java.util.concurrent.Executors.callable(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzaz r0 = r1.zzc
            if (r0 == 0) goto L7
            r0.run()
        L7:
            r0 = 0
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj
    @javax.annotation.CheckForNull
    protected final java.lang.String zze() {
            r3 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzaz r0 = r3.zzc
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "task=["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L1f:
            java.lang.String r0 = super.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj
    protected final void zzj() {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_acceleration.zzaz r0 = r1.zzc
            if (r0 == 0) goto Ld
            r0.zze()
        Ld:
            r0 = 0
            r1.zzc = r0
            return
    }
}
