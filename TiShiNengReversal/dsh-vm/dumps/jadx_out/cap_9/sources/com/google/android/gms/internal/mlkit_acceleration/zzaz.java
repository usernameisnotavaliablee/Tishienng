package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzaz extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable zza = null;
    private static final java.lang.Runnable zzb = null;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzay r0 = new com.google.android.gms.internal.mlkit_acceleration.zzay
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzaz.zza = r0
            com.google.android.gms.internal.mlkit_acceleration.zzay r0 = new com.google.android.gms.internal.mlkit_acceleration.zzay
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzaz.zzb = r0
            return
    }

    zzaz() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void zzg(java.lang.Thread r8) {
            r7 = this;
            java.lang.Object r0 = r7.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            boolean r5 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaw
            if (r5 != 0) goto L19
            java.lang.Runnable r5 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zzb
            if (r0 != r5) goto L13
            goto L1c
        L13:
            if (r3 == 0) goto L18
            r8.interrupt()
        L18:
            return
        L19:
            r1 = r0
            com.google.android.gms.internal.mlkit_acceleration.zzaw r1 = (com.google.android.gms.internal.mlkit_acceleration.zzaw) r1
        L1c:
            r5 = 1
            int r4 = r4 + r5
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 <= r6) goto L3b
            java.lang.Runnable r6 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zzb
            if (r0 == r6) goto L2c
            boolean r0 = r7.compareAndSet(r0, r6)
            if (r0 == 0) goto L3e
        L2c:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L34
            if (r3 == 0) goto L36
        L34:
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            java.util.concurrent.locks.LockSupport.park(r1)
            goto L3e
        L3b:
            java.lang.Thread.yield()
        L3e:
            java.lang.Object r0 = r7.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            goto La
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            boolean r2 = r4.compareAndSet(r1, r0)
            if (r2 != 0) goto Lc
            goto L55
        Lc:
            boolean r2 = r4.zzf()
            if (r2 != 0) goto L45
            java.lang.Object r1 = r4.zza()     // Catch: java.lang.Throwable -> L17
            goto L45
        L17:
            r2 = move-exception
            boolean r3 = r2 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L26
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L24
            r3.interrupt()     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L35
        L26:
            java.lang.Runnable r1 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zza
            boolean r1 = r4.compareAndSet(r0, r1)
            if (r1 != 0) goto L31
            r4.zzg(r0)
        L31:
            r4.zzc(r2)
            return
        L35:
            java.lang.Runnable r3 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zza
            boolean r3 = r4.compareAndSet(r0, r3)
            if (r3 == 0) goto L3e
            goto L41
        L3e:
            r4.zzg(r0)
        L41:
            r4.zzd(r1)
            throw r2
        L45:
            java.lang.Runnable r3 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zza
            boolean r3 = r4.compareAndSet(r0, r3)
            if (r3 != 0) goto L50
            r4.zzg(r0)
        L50:
            if (r2 != 0) goto L55
            r4.zzd(r1)
        L55:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r1 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zza
            if (r0 != r1) goto Ld
            java.lang.String r0 = "running=[DONE]"
            goto L37
        Ld:
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaw
            if (r1 == 0) goto L14
            java.lang.String r0 = "running=[INTERRUPTED]"
            goto L37
        L14:
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L35
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "running=[RUNNING ON "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L37
        L35:
            java.lang.String r0 = "running=[NOT STARTED YET]"
        L37:
            java.lang.String r1 = r3.zzb()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    abstract java.lang.Object zza() throws java.lang.Exception;

    abstract java.lang.String zzb();

    abstract void zzc(java.lang.Throwable r1);

    abstract void zzd(java.lang.Object r1);

    final void zze() {
            r4 = this;
            java.lang.Object r0 = r4.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L47
            com.google.android.gms.internal.mlkit_acceleration.zzaw r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaw
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            com.google.android.gms.internal.mlkit_acceleration.zzaw.zza(r1, r2)
            boolean r1 = r4.compareAndSet(r0, r1)
            if (r1 == 0) goto L47
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L33
            r1.interrupt()     // Catch: java.lang.Throwable -> L33
            java.lang.Runnable r0 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zza
            java.lang.Object r0 = r4.getAndSet(r0)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r2 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zzb
            if (r0 != r2) goto L47
            java.util.concurrent.locks.LockSupport.unpark(r1)
            return
        L33:
            r1 = move-exception
            java.lang.Runnable r2 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zza
            java.lang.Object r2 = r4.getAndSet(r2)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Runnable r3 = com.google.android.gms.internal.mlkit_acceleration.zzaz.zzb
            if (r2 == r3) goto L41
            goto L46
        L41:
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L46:
            throw r1
        L47:
            return
    }

    abstract boolean zzf();
}
