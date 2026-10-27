package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TaskQueue {
    private final java.lang.Object zza;

    @androidx.annotation.GuardedBy("lock")
    private boolean zzb;

    @androidx.annotation.GuardedBy("lock")
    private final java.util.Queue zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;

    public TaskQueue() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.zzc = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zzd = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicReference zza(com.google.mlkit.common.sdkinternal.TaskQueue r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.mlkit.common.sdkinternal.TaskQueue r0) {
            r0.zzc()
            return
    }

    private final void zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Queue r1 = r2.zzc     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            r1 = 0
            r2.zzb = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            goto L23
        L12:
            java.util.Queue r1 = r2.zzc     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.remove()     // Catch: java.lang.Throwable -> L10
            com.google.mlkit.common.sdkinternal.zzv r1 = (com.google.mlkit.common.sdkinternal.zzv) r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.Executor r0 = r1.zza
            java.lang.Runnable r1 = r1.zzb
            r2.zzd(r0, r1)
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    private final void zzd(java.util.concurrent.Executor r2, java.lang.Runnable r3) {
            r1 = this;
            com.google.mlkit.common.sdkinternal.zzt r0 = new com.google.mlkit.common.sdkinternal.zzt
            r0.<init>(r1, r3)
            r2.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L9
            return
        L9:
            r1.zzc()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void checkIsRunningOnCurrentThread() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzd
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Object r0 = r0.get()
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void submit(@androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull java.lang.Runnable r6) {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            boolean r1 = r4.zzb     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            java.util.Queue r1 = r4.zzc     // Catch: java.lang.Throwable -> L14
            com.google.mlkit.common.sdkinternal.zzv r2 = new com.google.mlkit.common.sdkinternal.zzv     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r2.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L14
            r1.add(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r5 = move-exception
            goto L1e
        L16:
            r1 = 1
            r4.zzb = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r4.zzd(r5, r6)
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r5
    }
}
