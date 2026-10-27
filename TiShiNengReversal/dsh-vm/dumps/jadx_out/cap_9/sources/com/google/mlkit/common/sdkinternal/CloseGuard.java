package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CloseGuard implements java.io.Closeable {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int API_TRANSLATE = 1;
    private final java.util.concurrent.atomic.AtomicBoolean zza;
    private final java.lang.String zzb;
    private final com.google.mlkit.common.sdkinternal.Cleaner.Cleanable zzc;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Factory {
        private final com.google.mlkit.common.sdkinternal.Cleaner zza;

        public Factory(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.Cleaner r1) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.common.sdkinternal.CloseGuard create(@androidx.annotation.NonNull java.lang.Object r7, int r8, @androidx.annotation.NonNull java.lang.Runnable r9) {
                r6 = this;
                com.google.mlkit.common.sdkinternal.Cleaner r3 = r6.zza
                java.lang.String r0 = "common"
                com.google.android.gms.internal.mlkit_common.zzsh r5 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r0)
                com.google.mlkit.common.sdkinternal.CloseGuard r0 = new com.google.mlkit.common.sdkinternal.CloseGuard
                r1 = r7
                r2 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    CloseGuard(java.lang.Object r2, int r3, com.google.mlkit.common.sdkinternal.Cleaner r4, java.lang.Runnable r5, com.google.android.gms.internal.mlkit_common.zzsh r6) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zza = r0
            java.lang.String r0 = r2.toString()
            r1.zzb = r0
            com.google.mlkit.common.sdkinternal.zze r0 = new com.google.mlkit.common.sdkinternal.zze
            r0.<init>(r1, r3, r6, r5)
            com.google.mlkit.common.sdkinternal.Cleaner$Cleanable r2 = r4.register(r2, r0)
            r1.zzc = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 1
            r0.set(r1)
            com.google.mlkit.common.sdkinternal.Cleaner$Cleanable r0 = r2.zzc
            r0.clean()
            return
    }

    final /* synthetic */ void zza(int r5, com.google.android.gms.internal.mlkit_common.zzsh r6, java.lang.Runnable r7) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zza
            boolean r0 = r0.get()
            if (r0 != 0) goto L38
            java.lang.String r0 = r4.zzb
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "%s has not been closed"
            java.lang.String.format(r1, r0, r2)
            com.google.android.gms.internal.mlkit_common.zzmw r0 = new com.google.android.gms.internal.mlkit_common.zzmw
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzmn r1 = new com.google.android.gms.internal.mlkit_common.zzmn
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzmm r5 = com.google.android.gms.internal.mlkit_common.zzmm.zzb(r5)
            r1.zzb(r5)
            com.google.android.gms.internal.mlkit_common.zzmp r5 = r1.zzc()
            r0.zzh(r5)
            com.google.android.gms.internal.mlkit_common.zzry r5 = com.google.android.gms.internal.mlkit_common.zzsk.zzf(r0)
            com.google.android.gms.internal.mlkit_common.zzmv r0 = com.google.android.gms.internal.mlkit_common.zzmv.zzbH
            r6.zzd(r5, r0)
        L38:
            r7.run()
            return
    }
}
