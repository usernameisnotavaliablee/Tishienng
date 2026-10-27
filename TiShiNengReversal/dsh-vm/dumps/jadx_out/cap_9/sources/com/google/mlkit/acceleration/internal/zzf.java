package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzf {
    private static final java.util.concurrent.locks.Lock zza = null;
    private final android.content.Context zzb;
    private final java.lang.String zzc;

    @androidx.annotation.Nullable
    private java.io.File zzd;

    @androidx.annotation.Nullable
    private java.io.File zze;
    private boolean zzf;

    @androidx.annotation.Nullable
    private java.io.FileOutputStream zzg;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            com.google.mlkit.acceleration.internal.zzf.zza = r0
            return
    }

    zzf(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    @androidx.annotation.Nullable
    final java.io.File zza() {
            r5 = this;
            boolean r0 = r5.zzf
            if (r0 == 0) goto L6
            goto L80
        L6:
            android.content.Context r0 = r5.zzb
            java.io.File r0 = androidx.core.content.ContextCompat.getNoBackupFilesDir(r0)
            java.lang.String r1 = "LockableAtomicFile"
            r2 = 0
            if (r0 == 0) goto L17
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L48
        L17:
            android.content.Context r0 = r5.zzb
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L48
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L48
            r3 = 5
            boolean r4 = r0.mkdirs()     // Catch: java.lang.SecurityException -> L37
            if (r4 != 0) goto L48
            boolean r4 = android.util.Log.isLoggable(r1, r3)     // Catch: java.lang.SecurityException -> L37
            if (r4 == 0) goto L35
            r0.toString()     // Catch: java.lang.SecurityException -> L37
        L35:
            r0 = r2
            goto L48
        L37:
            boolean r3 = android.util.Log.isLoggable(r1, r3)
            if (r3 == 0) goto L35
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "mkdirs threw an exception: "
            r3.concat(r0)
            goto L35
        L48:
            if (r0 != 0) goto L4f
            r5.zzd = r2
            r5.zze = r2
            goto L6b
        L4f:
            java.lang.String r2 = r5.zzc
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            r5.zzd = r3
            java.lang.String r2 = r5.zzc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = ".lock"
            java.lang.String r2 = r2.concat(r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            r5.zze = r3
        L6b:
            r0 = 1
            r5.zzf = r0
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L80
            java.io.File r0 = r5.zzd
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "file initialized: "
            r1.concat(r0)
        L80:
            java.io.File r0 = r5.zzd
            return r0
    }

    final void zzb() {
            r2 = this;
            java.io.File r0 = r2.zza()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.locks.Lock r0 = com.google.mlkit.acceleration.internal.zzf.zza
            r0.lock()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L1f
            java.io.File r1 = r2.zze     // Catch: java.io.IOException -> L1f
            if (r1 == 0) goto L21
            r0.<init>(r1)     // Catch: java.io.IOException -> L1f
            r2.zzg = r0     // Catch: java.io.IOException -> L1f
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.io.IOException -> L1f
            r0.lock()     // Catch: java.io.IOException -> L1f
            return
        L1f:
            r0 = move-exception
            goto L23
        L21:
            r0 = 0
            throw r0     // Catch: java.io.IOException -> L1f
        L23:
            r2.zzd()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    final void zzc(byte[] r3) {
            r2 = this;
            java.io.File r0 = r2.zza()
            if (r0 != 0) goto L7
            goto L2b
        L7:
            androidx.core.util.AtomicFile r0 = new androidx.core.util.AtomicFile
            java.io.File r1 = r2.zza()
            r1.getClass()
            r0.<init>(r1)
            java.io.FileOutputStream r1 = r0.startWrite()     // Catch: java.io.IOException -> L36
            r1.write(r3)     // Catch: java.lang.Throwable -> L2c
            r0.finishWrite(r1)     // Catch: java.io.IOException -> L36
            java.lang.String r3 = "LockableAtomicFile"
            r0 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r0)     // Catch: java.io.IOException -> L36
            if (r3 == 0) goto L2b
            java.io.File r3 = r2.zzd     // Catch: java.io.IOException -> L36
            java.lang.String.valueOf(r3)     // Catch: java.io.IOException -> L36
        L2b:
            return
        L2c:
            r3 = move-exception
            r0.failWrite(r1)     // Catch: java.io.IOException -> L36
            java.io.File r0 = r2.zzd     // Catch: java.io.IOException -> L36
            java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L36
            throw r3     // Catch: java.io.IOException -> L36
        L36:
            java.io.File r3 = r2.zzd
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Failed to save to "
            r0.concat(r3)
            return
    }

    final void zzd() {
            r3 = this;
            java.io.File r0 = r3.zza()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            java.io.FileOutputStream r1 = r3.zzg     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L12
            if (r1 == 0) goto L14
            r1.close()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L12
            goto L14
        L10:
            r1 = move-exception
            goto L22
        L12:
            r1 = move-exception
            goto L1c
        L14:
            r3.zzg = r0
            java.util.concurrent.locks.Lock r0 = com.google.mlkit.acceleration.internal.zzf.zza
            r0.unlock()
            return
        L1c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L10
            throw r2     // Catch: java.lang.Throwable -> L10
        L22:
            r3.zzg = r0
            java.util.concurrent.locks.Lock r0 = com.google.mlkit.acceleration.internal.zzf.zza
            r0.unlock()
            throw r1
    }

    @androidx.annotation.Nullable
    final byte[] zze() {
            r7 = this;
            java.io.File r0 = r7.zza()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L43
            java.io.File r2 = r7.zza()     // Catch: java.io.IOException -> L43
            if (r2 == 0) goto L42
            r0.<init>(r2)     // Catch: java.io.IOException -> L43
            int r2 = r0.available()     // Catch: java.lang.Throwable -> L38
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L38
            r3 = 0
            r4 = 0
        L1b:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L38
            int r6 = r5 - r4
            int r6 = r0.read(r2, r4, r6)     // Catch: java.lang.Throwable -> L38
            if (r6 > 0) goto L28
            r0.close()     // Catch: java.io.IOException -> L43
            return r2
        L28:
            int r4 = r4 + r6
            int r6 = r0.available()     // Catch: java.lang.Throwable -> L38
            int r5 = r5 - r4
            if (r6 <= r5) goto L1b
            int r6 = r6 + r4
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r2, r3, r5, r3, r4)     // Catch: java.lang.Throwable -> L38
            r2 = r5
            goto L1b
        L38:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L43
        L41:
            throw r2     // Catch: java.io.IOException -> L43
        L42:
            throw r1     // Catch: java.io.IOException -> L43
        L43:
            java.io.File r0 = r7.zzd
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Failed to read from file: "
            r2.concat(r0)
            return r1
    }
}
