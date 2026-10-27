package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Cleaner {
    private final java.lang.ref.ReferenceQueue zza;
    private final java.util.Set zzb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Cleanable {
        @com.google.android.gms.common.annotation.KeepForSdk
        void clean();
    }

    private Cleaner() {
            r1 = this;
            r1.<init>()
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r1.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r1.zzb = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.Cleaner create() {
            com.google.mlkit.common.sdkinternal.Cleaner r0 = new com.google.mlkit.common.sdkinternal.Cleaner
            r0.<init>()
            com.google.mlkit.common.sdkinternal.zza r1 = new com.google.mlkit.common.sdkinternal.zza
            r1.<init>()
            r0.register(r0, r1)
            java.lang.ref.ReferenceQueue r1 = r0.zza
            java.util.Set r2 = r0.zzb
            com.google.mlkit.common.sdkinternal.zzb r3 = new com.google.mlkit.common.sdkinternal.zzb
            r3.<init>(r1, r2)
            java.lang.Thread r1 = new java.lang.Thread
            java.lang.String r2 = "MlKitCleaner"
            r1.<init>(r3, r2)
            r2 = 1
            r1.setDaemon(r2)
            r1.start()
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.mlkit.common.sdkinternal.Cleaner.Cleanable register(@androidx.annotation.NonNull java.lang.Object r7, @androidx.annotation.NonNull java.lang.Runnable r8) {
            r6 = this;
            java.lang.ref.ReferenceQueue r2 = r6.zza
            java.util.Set r3 = r6.zzb
            com.google.mlkit.common.sdkinternal.zzd r0 = new com.google.mlkit.common.sdkinternal.zzd
            r5 = 0
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.Set r7 = r6.zzb
            r7.add(r0)
            return r0
    }
}
