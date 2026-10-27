package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzn {
    static final com.google.android.gms.common.zzl zza = null;
    static final com.google.android.gms.common.zzl zzb = null;
    static final com.google.android.gms.common.zzl zzc = null;
    static final com.google.android.gms.common.zzl zzd = null;
    private static volatile com.google.android.gms.common.internal.zzag zze;
    private static final java.lang.Object zzf = null;
    private static android.content.Context zzg;

    static {
            com.google.android.gms.common.zzf r0 = new com.google.android.gms.common.zzf
            java.lang.String r1 = "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zza = r0
            com.google.android.gms.common.zzg r0 = new com.google.android.gms.common.zzg
            java.lang.String r1 = "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzb = r0
            com.google.android.gms.common.zzh r0 = new com.google.android.gms.common.zzh
            java.lang.String r1 = "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzc = r0
            com.google.android.gms.common.zzi r0 = new com.google.android.gms.common.zzi
            java.lang.String r1 = "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzd = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.zzn.zzf = r0
            return
    }

    public zzn() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.google.android.gms.common.zzx zza(java.lang.String r1, com.google.android.gms.common.zzj r2, boolean r3, boolean r4) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.zzx r1 = zzh(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        Lc:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    static com.google.android.gms.common.zzx zzb(java.lang.String r0, boolean r1, boolean r2, boolean r3) {
            r2 = 0
            r3 = 1
            com.google.android.gms.common.zzx r0 = zzi(r0, r1, r2, r2, r3)
            return r0
    }

    static com.google.android.gms.common.zzx zzc(java.lang.String r0, boolean r1, boolean r2, boolean r3) {
            r2 = 0
            com.google.android.gms.common.zzx r0 = zzi(r0, r1, r2, r2, r2)
            return r0
    }

    static /* synthetic */ java.lang.String zzd(boolean r4, java.lang.String r5, com.google.android.gms.common.zzj r6) throws java.lang.Exception {
            r0 = 0
            r1 = 1
            if (r4 != 0) goto Lf
            com.google.android.gms.common.zzx r2 = zzh(r5, r6, r1, r0)
            boolean r2 = r2.zza
            if (r2 == 0) goto Lf
            java.lang.String r2 = "debug cert rejected"
            goto L11
        Lf:
            java.lang.String r2 = "not allowed"
        L11:
            java.lang.String r3 = "SHA-256"
            java.security.MessageDigest r3 = com.google.android.gms.common.util.AndroidUtilsLight.zza(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r6 = r6.zzf()
            byte[] r6 = r3.digest(r6)
            java.lang.String r6 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            r3[r1] = r5
            r5 = 2
            r3[r5] = r6
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "12451000.false"
            r5 = 4
            r3[r5] = r4
            java.lang.String r4 = "%s: pkg=%s, sha256=%s, atk=%s, ver=%s"
            java.lang.String r4 = java.lang.String.format(r4, r3)
            return r4
    }

    static synchronized void zze(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.zzn> r0 = com.google.android.gms.common.zzn.class
            monitor-enter(r0)
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            if (r2 == 0) goto L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L15
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.common.zzn.zzg = r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L15:
            r2 = move-exception
            goto L1b
        L17:
            monitor-exit(r0)
            return
        L19:
            monitor-exit(r0)
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    static boolean zzf() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzj()     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L13
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L13
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L13
            goto L14
        Le:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L13:
            r1 = 0
        L14:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
    }

    static boolean zzg() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzj()     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L13
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L13
            boolean r1 = r1.zzi()     // Catch: java.lang.Throwable -> Le java.lang.Throwable -> L13
            goto L14
        Le:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L13:
            r1 = 0
        L14:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
    }

    private static com.google.android.gms.common.zzx zzh(java.lang.String r2, com.google.android.gms.common.zzj r3, boolean r4, boolean r5) {
            zzj()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L38
            android.content.Context r0 = com.google.android.gms.common.zzn.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.zzs r0 = new com.google.android.gms.common.zzs
            r0.<init>(r2, r3, r4, r5)
            com.google.android.gms.common.internal.zzag r5 = com.google.android.gms.common.zzn.zze     // Catch: android.os.RemoteException -> L30
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: android.os.RemoteException -> L30
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.os.RemoteException -> L30
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L30
            boolean r5 = r5.zzh(r0, r1)     // Catch: android.os.RemoteException -> L30
            if (r5 == 0) goto L24
            com.google.android.gms.common.zzx r2 = com.google.android.gms.common.zzx.zzb()
            return r2
        L24:
            com.google.android.gms.common.zze r5 = new com.google.android.gms.common.zze
            r5.<init>(r4, r2, r3)
            com.google.android.gms.common.zzv r2 = new com.google.android.gms.common.zzv
            r3 = 0
            r2.<init>(r5, r3)
            return r2
        L30:
            r2 = move-exception
            java.lang.String r3 = "module call"
            com.google.android.gms.common.zzx r2 = com.google.android.gms.common.zzx.zzd(r3, r2)
            return r2
        L38:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "module init: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.common.zzx r2 = com.google.android.gms.common.zzx.zzd(r3, r2)
            return r2
    }

    private static com.google.android.gms.common.zzx zzi(java.lang.String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            android.os.StrictMode$ThreadPolicy r9 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r10 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch: java.lang.Throwable -> L25
            zzj()     // Catch: java.lang.Throwable -> L25 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L6b
            com.google.android.gms.common.zzo r0 = new com.google.android.gms.common.zzo     // Catch: java.lang.Throwable -> L25
            android.content.Context r10 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: java.lang.Throwable -> L25
            r5 = 0
            r6 = 1
            r3 = 0
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            if (r11 == 0) goto L2b
            com.google.android.gms.common.internal.zzag r7 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L28
            com.google.android.gms.common.zzq r7 = r7.zze(r0)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L28
            goto L31
        L25:
            r0 = move-exception
            r7 = r0
            goto L83
        L28:
            r0 = move-exception
            r7 = r0
            goto L64
        L2b:
            com.google.android.gms.common.internal.zzag r7 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L28
            com.google.android.gms.common.zzq r7 = r7.zzf(r0)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L28
        L31:
            boolean r8 = r7.zzb()     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L40
            int r7 = r7.zzc()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzf(r7)     // Catch: java.lang.Throwable -> L25
            goto L7f
        L40:
            java.lang.String r8 = r7.zza()     // Catch: java.lang.Throwable -> L25
            int r10 = r7.zzd()     // Catch: java.lang.Throwable -> L25
            r11 = 4
            if (r10 != r11) goto L51
            android.content.pm.PackageManager$NameNotFoundException r10 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> L25
            r10.<init>()     // Catch: java.lang.Throwable -> L25
            goto L52
        L51:
            r10 = 0
        L52:
            java.lang.String r11 = "error checking package certificate"
            if (r8 != 0) goto L57
            r8 = r11
        L57:
            int r11 = r7.zzc()     // Catch: java.lang.Throwable -> L25
            int r7 = r7.zzd()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzg(r11, r7, r8, r10)     // Catch: java.lang.Throwable -> L25
            goto L7f
        L64:
            java.lang.String r8 = "module call"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzd(r8, r7)     // Catch: java.lang.Throwable -> L25
            goto L7f
        L6b:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = r7.getMessage()     // Catch: java.lang.Throwable -> L25
            java.lang.String r10 = "module init: "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = r10.concat(r8)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzd(r8, r7)     // Catch: java.lang.Throwable -> L25
        L7f:
            android.os.StrictMode.setThreadPolicy(r9)
            return r7
        L83:
            android.os.StrictMode.setThreadPolicy(r9)
            throw r7
    }

    private static void zzj() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            com.google.android.gms.common.internal.zzag r0 = com.google.android.gms.common.zzn.zze
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.google.android.gms.common.zzn.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = com.google.android.gms.common.zzn.zzf
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.instantiate(r2)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.internal.zzaf.zzb(r1)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.zzn.zze = r1     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r1 = move-exception
            goto L2c
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }
}
