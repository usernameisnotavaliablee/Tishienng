package com.google.android.gms.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final java.util.concurrent.ThreadFactory zzc;

    @com.google.android.gms.common.annotation.KeepForSdk
    public NumberedThreadFactory(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzc = r0
            java.lang.String r0 = "Name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    @androidx.annotation.NonNull
    public final java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r4) {
            r3 = this;
            com.google.android.gms.common.util.concurrent.zza r0 = new com.google.android.gms.common.util.concurrent.zza
            r1 = 0
            r0.<init>(r4, r1)
            java.util.concurrent.ThreadFactory r4 = r3.zzc
            java.lang.Thread r4 = r4.newThread(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzb
            int r0 = r0.getAndIncrement()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.setName(r0)
            return r4
    }
}
