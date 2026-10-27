package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
enum zzh extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final com.google.mlkit.common.sdkinternal.zzh zza = null;
    private static final /* synthetic */ com.google.mlkit.common.sdkinternal.zzh[] zzb = null;

    static {
            com.google.mlkit.common.sdkinternal.zzh r0 = new com.google.mlkit.common.sdkinternal.zzh
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.zzh.zza = r0
            r1 = 1
            com.google.mlkit.common.sdkinternal.zzh[] r1 = new com.google.mlkit.common.sdkinternal.zzh[r1]
            r1[r2] = r0
            com.google.mlkit.common.sdkinternal.zzh.zzb = r1
            return
    }

    zzh(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static com.google.mlkit.common.sdkinternal.zzh[] values() {
            com.google.mlkit.common.sdkinternal.zzh[] r0 = com.google.mlkit.common.sdkinternal.zzh.zzb
            java.lang.Object r0 = r0.clone()
            com.google.mlkit.common.sdkinternal.zzh[] r0 = (com.google.mlkit.common.sdkinternal.zzh[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            android.os.Handler r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.zza(r0)
            r0.post(r2)
            return
    }
}
