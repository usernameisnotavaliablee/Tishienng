package com.google.android.gms.dynamite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzb {

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static java.lang.ClassLoader zza;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static java.lang.Thread zzb;

    static {
            return
    }

    public zzb() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static synchronized java.lang.ClassLoader zza() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto La6
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            if (r1 != 0) goto L92
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L8e
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L8e
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L1d
            r1 = r2
            goto L89
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8e
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r6 = 0
            r7 = 0
        L2b:
            if (r7 >= r4) goto L43
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r9 == 0) goto L3c
            goto L44
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto L90
        L41:
            r1 = move-exception
            goto L82
        L43:
            r8 = r2
        L44:
            if (r8 != 0) goto L4d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L4d:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L56:
            if (r6 >= r1) goto L6a
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r7 == 0) goto L67
            goto L6b
        L67:
            int r6 = r6 + 1
            goto L56
        L6a:
            r5 = r2
        L6b:
            if (r5 != 0) goto L87
            com.google.android.gms.dynamite.zza r1 = new com.google.android.gms.dynamite.zza     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7f
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7f
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r5 = r1
            goto L87
        L7c:
            r4 = move-exception
            r5 = r1
            goto L84
        L7f:
            r1 = move-exception
            r4 = r1
            goto L84
        L82:
            r4 = r1
            r5 = r2
        L84:
            r4.getMessage()     // Catch: java.lang.Throwable -> L3f
        L87:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        L89:
            com.google.android.gms.dynamite.zzb.zzb = r1     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L92
            goto La1
        L8e:
            r1 = move-exception
            goto Laa
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L8e
        L92:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.Thread r3 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L9a java.lang.SecurityException -> L9c
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L9a java.lang.SecurityException -> L9c
            goto La0
        L9a:
            r2 = move-exception
            goto La4
        L9c:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L9a
        La0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
        La1:
            com.google.android.gms.dynamite.zzb.zza = r2     // Catch: java.lang.Throwable -> L8e
            goto La6
        La4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            throw r2     // Catch: java.lang.Throwable -> L8e
        La6:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)
            return r1
        Laa:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r1
    }
}
