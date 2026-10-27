package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzx implements java.io.Closeable {
    final /* synthetic */ com.google.mlkit.common.sdkinternal.TaskQueue zza;

    /* synthetic */ zzx(com.google.mlkit.common.sdkinternal.TaskQueue r1, com.google.mlkit.common.sdkinternal.zzw r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = com.google.mlkit.common.sdkinternal.TaskQueue.zza(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Object r1 = r1.getAndSet(r2)
            java.lang.Thread r1 = (java.lang.Thread) r1
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = r2.zza
            java.util.concurrent.atomic.AtomicReference r0 = com.google.mlkit.common.sdkinternal.TaskQueue.zza(r0)
            r1 = 0
            r0.set(r1)
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = r2.zza
            com.google.mlkit.common.sdkinternal.TaskQueue.zzb(r0)
            return
    }
}
