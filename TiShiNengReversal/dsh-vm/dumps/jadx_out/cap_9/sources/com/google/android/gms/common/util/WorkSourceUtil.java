package com.google.android.gms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class WorkSourceUtil {
    private static final int zza = 0;
    private static final java.lang.reflect.Method zzb = null;
    private static final java.lang.reflect.Method zzc = null;
    private static final java.lang.reflect.Method zzd = null;
    private static final java.lang.reflect.Method zze = null;
    private static final java.lang.reflect.Method zzf = null;
    private static final java.lang.reflect.Method zzg = null;
    private static final java.lang.reflect.Method zzh = null;
    private static final java.lang.reflect.Method zzi = null;

    @androidx.annotation.GuardedBy("WorkSourceUtil.class")
    private static java.lang.Boolean zzj;

    static {
            java.lang.String r0 = "add"
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            int r3 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r3
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L18
            r6[r3] = r1     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r6 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L18
            goto L1a
        L18:
            r6 = r5
        L1a:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r6
            boolean r6 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r7 = 2
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r6 == 0) goto L30
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L30
            r6[r3] = r1     // Catch: java.lang.Exception -> L30
            r6[r4] = r8     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Method r0 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L30
            goto L31
        L30:
            r0 = r5
        L31:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "size"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3a
            goto L3b
        L3a:
            r0 = r5
        L3b:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.String r0 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L48
            r6[r3] = r1     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r0 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L48
            goto L4a
        L48:
            r0 = r5
        L4a:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L5e
            java.lang.String r0 = "getName"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L5d
            r6[r3] = r1     // Catch: java.lang.Exception -> L5d
            java.lang.reflect.Method r0 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L5d
            goto L5f
        L5d:
        L5e:
            r0 = r5
        L5f:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L6f
            java.lang.String r0 = "createWorkChain"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r5)     // Catch: java.lang.Exception -> L6e
            goto L70
        L6e:
        L6f:
            r0 = r5
        L70:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L8c
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = "addNode"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L8b
            r7[r3] = r1     // Catch: java.lang.Exception -> L8b
            r7[r4] = r8     // Catch: java.lang.Exception -> L8b
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L8b
            goto L8d
        L8b:
        L8c:
            r0 = r5
        L8d:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L9f
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r5)     // Catch: java.lang.Exception -> L9f
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> La0
            goto La0
        L9f:
            r0 = r5
        La0:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r5
            return
    }

    private WorkSourceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void add(@androidx.annotation.NonNull android.os.WorkSource r4, int r5, @androidx.annotation.NonNull java.lang.String r6) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            if (r6 != 0) goto La
            java.lang.String r6 = ""
        La:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L18
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L18
            r3[r2] = r5     // Catch: java.lang.Exception -> L18
            r3[r1] = r6     // Catch: java.lang.Exception -> L18
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L18
        L18:
            return
        L19:
            java.lang.reflect.Method r6 = com.google.android.gms.common.util.WorkSourceUtil.zzb
            if (r6 == 0) goto L28
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L28
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L28
            r0[r2] = r5     // Catch: java.lang.Exception -> L28
            r6.invoke(r4, r0)     // Catch: java.lang.Exception -> L28
        L28:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.WorkSource fromPackage(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L2c
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            if (r1 == 0) goto L2c
            if (r3 == 0) goto L2c
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            if (r2 != 0) goto L1c
            java.lang.String r2 = "Could not get applicationInfo from package: "
            r2.concat(r3)
            return r0
        L1c:
            int r2 = r2.uid
            android.os.WorkSource r0 = new android.os.WorkSource
            r0.<init>()
            add(r0, r2, r3)
            return r0
        L27:
            java.lang.String r2 = "Could not find package: "
            r2.concat(r3)
        L2c:
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull java.lang.String r10) {
            r0 = 0
            if (r8 == 0) goto L62
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            if (r1 == 0) goto L62
            if (r10 == 0) goto L62
            if (r9 != 0) goto Le
            goto L62
        Le:
            r1 = 0
            r2 = -1
            com.google.android.gms.common.wrappers.PackageManagerWrapper r8 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r9, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r8 != 0) goto L20
            java.lang.String r8 = "Could not get applicationInfo from package: "
            r8.concat(r9)
            goto L28
        L20:
            int r2 = r8.uid
            goto L28
        L23:
            java.lang.String r8 = "Could not find package: "
            r8.concat(r9)
        L28:
            if (r2 >= 0) goto L2b
            return r0
        L2b:
            android.os.WorkSource r8 = new android.os.WorkSource
            r8.<init>()
            java.lang.reflect.Method r3 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r3 == 0) goto L5e
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r4 != 0) goto L39
            goto L5e
        L39:
            java.lang.Object r0 = r3.invoke(r8, r0)     // Catch: java.lang.Exception -> L61
            int r3 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L61
            r5 = 1
            r6 = 2
            if (r2 == r3) goto L50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L61
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L61
            r7[r1] = r2     // Catch: java.lang.Exception -> L61
            r7[r5] = r9     // Catch: java.lang.Exception -> L61
            r4.invoke(r0, r7)     // Catch: java.lang.Exception -> L61
        L50:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L61
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L61
            r2[r1] = r9     // Catch: java.lang.Exception -> L61
            r2[r5] = r10     // Catch: java.lang.Exception -> L61
            r4.invoke(r0, r2)     // Catch: java.lang.Exception -> L61
            goto L61
        L5e:
            add(r8, r2, r9)
        L61:
            return r8
        L62:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int get(@androidx.annotation.NonNull android.os.WorkSource r3, int r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zze
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1c
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1c
            r2[r1] = r4     // Catch: java.lang.Exception -> L1c
            java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L1c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L1c
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L1c
            return r3
        L1c:
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getName(@androidx.annotation.NonNull android.os.WorkSource r3, int r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzf
            if (r0 == 0) goto L15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L15
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.util.List<java.lang.String> getNames(@androidx.annotation.NonNull android.os.WorkSource r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto La
            r2 = 0
            goto Le
        La:
            int r2 = size(r5)
        Le:
            if (r2 == 0) goto L25
        L10:
            if (r1 >= r2) goto L25
            java.lang.String r3 = getName(r5, r1)
            boolean r4 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r3)
            if (r4 != 0) goto L22
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r0.add(r3)
        L22:
            int r1 = r1 + 1
            goto L10
        L25:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@androidx.annotation.NonNull android.content.Context r3) {
            java.lang.Class<com.google.android.gms.common.util.WorkSourceUtil> r0 = com.google.android.gms.common.util.WorkSourceUtil.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.google.android.gms.common.util.WorkSourceUtil.zzj     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r3
        Ld:
            r3 = move-exception
            goto L25
        Lf:
            r1 = 0
            if (r3 != 0) goto L14
            monitor-exit(r0)
            return r1
        L14:
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L1d
            r1 = 1
        L1d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isEmpty(@androidx.annotation.NonNull android.os.WorkSource r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzi
            if (r0 == 0) goto L14
            r1 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L13
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Exception -> L13
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L13
            boolean r2 = r0.booleanValue()     // Catch: java.lang.Exception -> L13
            return r2
        L13:
        L14:
            int r2 = size(r2)
            if (r2 != 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int size(@androidx.annotation.NonNull android.os.WorkSource r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzd
            if (r0 == 0) goto L13
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L13
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Exception -> L13
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L13
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            r2 = 0
            return r2
    }
}
