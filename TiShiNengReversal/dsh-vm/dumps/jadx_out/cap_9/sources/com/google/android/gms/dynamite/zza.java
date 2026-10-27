package com.google.android.gms.dynamite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zza extends java.lang.Thread {
    zza(java.lang.ThreadGroup r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = "GmsDynamite"
            r0.<init>(r1, r2)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r1)
        L6:
            r1.wait()     // Catch: java.lang.Throwable -> La java.lang.InterruptedException -> Lc
            goto L6
        La:
            r0 = move-exception
            goto Le
        Lc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }
}
