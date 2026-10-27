package com.google.android.gms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ProcessUtils {

    @javax.annotation.Nullable
    private static java.lang.String zza;
    private static int zzb;

    static {
            return
    }

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getMyProcessName() {
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            if (r0 != 0) goto L67
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            java.lang.String r0 = androidx.work.impl.utils.d.a()
            com.google.android.gms.common.util.ProcessUtils.zza = r0
            goto L67
        L11:
            int r0 = com.google.android.gms.common.util.ProcessUtils.zzb
            if (r0 != 0) goto L1b
            int r0 = android.os.Process.myPid()
            com.google.android.gms.common.util.ProcessUtils.zzb = r0
        L1b:
            r1 = 0
            if (r0 > 0) goto L1f
            goto L65
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            r2.append(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5a
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5a
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            java.lang.String r0 = r3.readLine()     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L55
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L55
            java.lang.String r1 = r0.trim()     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L55
        L51:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r3)
            goto L65
        L55:
            r0 = move-exception
            r1 = r3
            goto L5f
        L58:
            r0 = move-exception
            goto L5f
        L5a:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
            throw r0     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L63
        L5f:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L63:
            r3 = r1
            goto L51
        L65:
            com.google.android.gms.common.util.ProcessUtils.zza = r1
        L67:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            return r0
    }
}
