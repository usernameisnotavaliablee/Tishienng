package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzr {
    private final java.lang.Object zza;
    private java.util.Queue zzb;
    private boolean zzc;

    zzr() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            return
    }

    public final void zza(@androidx.annotation.NonNull com.google.android.gms.tasks.zzq r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Queue r1 = r2.zzb     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            r2.zzb = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L18
        L11:
            java.util.Queue r1 = r2.zzb     // Catch: java.lang.Throwable -> Lf
            r1.add(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public final void zzb(@androidx.annotation.NonNull com.google.android.gms.tasks.Task r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Queue r1 = r2.zzb     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto Lc
            goto L2d
        Lc:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
        L10:
            java.lang.Object r1 = r2.zza
            monitor-enter(r1)
            java.util.Queue r0 = r2.zzb     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.tasks.zzq r0 = (com.google.android.gms.tasks.zzq) r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            r3 = 0
            r2.zzc = r3     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r3 = move-exception
            goto L29
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            r0.zzd(r3)
            goto L10
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r3
        L2b:
            r3 = move-exception
            goto L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }
}
