package com.google.android.gms.common.wrappers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class InstantApps {
    private static android.content.Context zza;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzb;

    public InstantApps() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized boolean isInstantApp(@androidx.annotation.NonNull android.content.Context r4) {
            java.lang.Class<com.google.android.gms.common.wrappers.InstantApps> r0 = com.google.android.gms.common.wrappers.InstantApps.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L1c
            android.content.Context r2 = com.google.android.gms.common.wrappers.InstantApps.zza     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.Boolean r3 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            if (r2 == r1) goto L16
            goto L1e
        L16:
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r4
        L1c:
            r4 = move-exception
            goto L52
        L1e:
            r2 = 0
            com.google.android.gms.common.wrappers.InstantApps.zzb = r2     // Catch: java.lang.Throwable -> L1c
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L36
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L1c
            boolean r4 = com.google.android.gms.common.wrappers.a.a(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L1c
            goto L48
        L36:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L1c java.lang.ClassNotFoundException -> L44
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch: java.lang.Throwable -> L1c java.lang.ClassNotFoundException -> L44
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c java.lang.ClassNotFoundException -> L44
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L1c java.lang.ClassNotFoundException -> L44
            goto L48
        L44:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L1c
        L48:
            com.google.android.gms.common.wrappers.InstantApps.zza = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L1c
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r4
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }
}
