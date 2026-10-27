package com.google.android.gms.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.ThreadFactory zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public NamedThreadFactory(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzb = r0
            java.lang.String r0 = "Name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    @androidx.annotation.NonNull
    public final java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r3) {
            r2 = this;
            com.google.android.gms.common.util.concurrent.zza r0 = new com.google.android.gms.common.util.concurrent.zza
            r1 = 0
            r0.<init>(r3, r1)
            java.util.concurrent.ThreadFactory r3 = r2.zzb
            java.lang.Thread r3 = r3.newThread(r0)
            java.lang.String r0 = r2.zza
            r3.setName(r0)
            return r3
    }
}
