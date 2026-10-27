package com.google.android.gms.dynamite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DynamiteModule {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int LOCAL = -1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int NONE = 0;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int NO_SELECTION = 0;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int REMOTE = 1;

    @androidx.annotation.NonNull
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = null;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static java.lang.Boolean zzb = null;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static java.lang.String zzc = null;

    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static int zze = -1;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static java.lang.Boolean zzf;
    private static final java.lang.ThreadLocal zzg = null;
    private static final java.lang.ThreadLocal zzh = null;
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzi = null;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static com.google.android.gms.dynamite.zzq zzk;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static com.google.android.gms.dynamite.zzr zzl;
    private final android.content.Context zzj;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.util.DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @androidx.annotation.Nullable
        @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteLoaderClassLoader.class")
        public static java.lang.ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String r1, com.google.android.gms.dynamite.zzp r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ LoadingException(java.lang.String r1, java.lang.Throwable r2, com.google.android.gms.dynamite.zzp r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VersionPolicy {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.android.gms.common.annotation.KeepForSdk
        public interface IVersions {
            int zza(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2);

            int zzb(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.android.gms.common.annotation.KeepForSdk
        public static class SelectionResult {

            @com.google.android.gms.common.annotation.KeepForSdk
            public int localVersion;

            @com.google.android.gms.common.annotation.KeepForSdk
            public int remoteVersion;

            @com.google.android.gms.common.annotation.KeepForSdk
            public int selection;

            public SelectionResult() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.localVersion = r0
                    r1.remoteVersion = r0
                    r1.selection = r0
                    return
            }
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzg = r0
            com.google.android.gms.dynamite.zzd r0 = new com.google.android.gms.dynamite.zzd
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzh = r0
            com.google.android.gms.dynamite.zze r0 = new com.google.android.gms.dynamite.zze
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzi = r0
            com.google.android.gms.dynamite.zzf r0 = new com.google.android.gms.dynamite.zzf
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE = r0
            com.google.android.gms.dynamite.zzg r0 = new com.google.android.gms.dynamite.zzg
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL = r0
            com.google.android.gms.dynamite.zzh r0 = new com.google.android.gms.dynamite.zzh
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzi r0 = new com.google.android.gms.dynamite.zzi
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = r0
            com.google.android.gms.dynamite.zzj r0 = new com.google.android.gms.dynamite.zzj
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzk r0 = new com.google.android.gms.dynamite.zzk
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = r0
            com.google.android.gms.dynamite.zzl r0 = new com.google.android.gms.dynamite.zzl
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zza = r0
            return
    }

    private DynamiteModule(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzj = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getLocalVersion(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5) {
            r0 = 0
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            r1.<init>()     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.String r2 = "com.google.android.gms.dynamite.descriptors."
            r1.append(r2)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            r1.append(r5)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.String r2 = ".ModuleDescriptor"
            r1.append(r2)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.Class r4 = r4.loadClass(r1)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.String r1 = "MODULE_ID"
            java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.String r2 = "MODULE_VERSION"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r2)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r3, r5)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            if (r5 != 0) goto L48
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            return r0
        L46:
            r4 = move-exception
            goto L4d
        L48:
            int r4 = r4.getInt(r2)     // Catch: java.lang.Exception -> L46 java.lang.ClassNotFoundException -> L5a
            return r4
        L4d:
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Failed to load module descriptor class: "
            r5.concat(r4)
        L5a:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getRemoteVersion(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = 0
            int r1 = zza(r1, r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.dynamite.DynamiteModule load(@androidx.annotation.NonNull android.content.Context r20, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r21, @androidx.annotation.NonNull java.lang.String r22) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r1 = r20
            r2 = r21
            r3 = r22
            android.content.Context r4 = r1.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r5 = 0
            if (r4 == 0) goto L237
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r6 = r0.get()
            com.google.android.gms.dynamite.zzn r6 = (com.google.android.gms.dynamite.zzn) r6
            com.google.android.gms.dynamite.zzn r7 = new com.google.android.gms.dynamite.zzn
            r7.<init>(r5)
            r0.set(r7)
            java.lang.ThreadLocal r8 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r10 = r9.longValue()
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L53
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L53
            r8.set(r14)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r8 = com.google.android.gms.dynamite.DynamiteModule.zzi     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r8 = r2.selectModule(r1, r3, r8)     // Catch: java.lang.Throwable -> L53
            int r14 = r8.localVersion     // Catch: java.lang.Throwable -> L53
            int r14 = r8.selection     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto L4f
            r15 = -1
            if (r14 != r15) goto L4c
            int r14 = r8.localVersion     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto L4f
            r14 = -1
        L4c:
            r16 = 0
            goto L58
        L4f:
            r16 = 0
            goto L1ea
        L53:
            r0 = move-exception
            r16 = 0
            goto L21b
        L58:
            r12 = 1
            if (r14 != r12) goto L63
            int r13 = r8.remoteVersion     // Catch: java.lang.Throwable -> L60
            if (r13 == 0) goto L1ea
            goto L63
        L60:
            r0 = move-exception
            goto L21b
        L63:
            if (r14 != r15) goto L6b
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r4, r3)     // Catch: java.lang.Throwable -> L60
            goto L1ad
        L6b:
            if (r14 != r12) goto L1d2
            int r14 = r8.remoteVersion     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r18 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r18)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            boolean r19 = zzf(r1)     // Catch: java.lang.Throwable -> L16e
            if (r19 == 0) goto L170
            java.lang.Boolean r19 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L16e
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L16e
            if (r19 == 0) goto L165
            boolean r18 = r19.booleanValue()     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            r12 = 2
            if (r18 == 0) goto L105
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r18 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r18)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamite.zzr r15 = com.google.android.gms.dynamite.DynamiteModule.zzl     // Catch: java.lang.Throwable -> L102
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L102
            if (r15 == 0) goto Lf9
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            if (r0 == 0) goto Lf0
            android.database.Cursor r13 = r0.zza     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            if (r13 == 0) goto Lf0
            android.content.Context r13 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            android.content.Context r13 = com.stub.StubApp.getOrigApplicationContext(r13)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            android.database.Cursor r0 = r0.zza     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r18 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r18)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            int r5 = com.google.android.gms.dynamite.DynamiteModule.zze     // Catch: java.lang.Throwable -> Led
            if (r5 < r12) goto Lae
            r12 = 1
            goto Laf
        Lae:
            r12 = 0
        Laf:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Led
            if (r12 == 0) goto Lc8
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r13)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = r15.zzf(r5, r3, r14, r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            goto Ld4
        Lbf:
            r0 = move-exception
            goto L17b
        Lc2:
            r0 = move-exception
            goto L189
        Lc5:
            r0 = move-exception
            goto L18a
        Lc8:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r13)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = r15.zze(r5, r3, r14, r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        Ld4:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            if (r0 == 0) goto Le4
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        Le1:
            r0 = r5
            goto L1ad
        Le4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "Failed to get module context"
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        Led:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Led
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        Lf0:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "No result cursor"
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        Lf9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "DynamiteLoaderV2 was not cached."
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L102:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L102
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L105:
            com.google.android.gms.dynamite.zzq r5 = zzg(r1)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            if (r5 == 0) goto L15c
            int r13 = r5.zze()     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            r15 = 3
            if (r13 < r15) goto L132
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            if (r0 == 0) goto L129
            com.google.android.gms.dynamic.IObjectWrapper r12 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            android.database.Cursor r0 = r0.zza     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = r5.zzi(r12, r3, r14, r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            goto L145
        L129:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "No cached result cursor holder"
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L132:
            if (r13 != r12) goto L13d
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = r5.zzj(r0, r3, r14)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            goto L145
        L13d:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            com.google.android.gms.dynamic.IObjectWrapper r0 = r5.zzh(r0, r3, r14)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L145:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            if (r0 == 0) goto L153
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            goto Le1
        L153:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "Failed to load remote module."
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L15c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "Failed to create IDynamiteLoader."
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L165:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            java.lang.String r5 = "Failed to determine which loading route to use."
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L16e:
            r0 = move-exception
            goto L179
        L170:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L16e
            java.lang.String r5 = "Remote loading disabled"
            r12 = 0
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> L16e
            throw r0     // Catch: java.lang.Throwable -> L16e
        L179:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L16e
            throw r0     // Catch: java.lang.Throwable -> Lbf com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lc2 android.os.RemoteException -> Lc5
        L17b:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
            java.lang.String r12 = "Failed to load remote module."
            r13 = 0
            r5.<init>(r12, r0, r13)     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
            throw r5     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
        L187:
            r0 = move-exception
            goto L193
        L189:
            throw r0     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
        L18a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
            java.lang.String r12 = "Failed to load remote module."
            r13 = 0
            r5.<init>(r12, r0, r13)     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
            throw r5     // Catch: java.lang.Throwable -> L60 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L187
        L193:
            r0.getMessage()     // Catch: java.lang.Throwable -> L60
            int r5 = r8.localVersion     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L1c9
            com.google.android.gms.dynamite.zzo r8 = new com.google.android.gms.dynamite.zzo     // Catch: java.lang.Throwable -> L60
            r12 = 0
            r8.<init>(r5, r12)     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r1 = r2.selectModule(r1, r3, r8)     // Catch: java.lang.Throwable -> L60
            int r1 = r1.selection     // Catch: java.lang.Throwable -> L60
            r2 = -1
            if (r1 != r2) goto L1c9
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r4, r3)     // Catch: java.lang.Throwable -> L60
        L1ad:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 != 0) goto L1b7
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.remove()
            goto L1bc
        L1b7:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.set(r9)
        L1bc:
            android.database.Cursor r1 = r7.zza
            if (r1 == 0) goto L1c3
            r1.close()
        L1c3:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.set(r6)
            return r0
        L1c9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r12 = 0
            r1.<init>(r2, r0, r12)     // Catch: java.lang.Throwable -> L60
            throw r1     // Catch: java.lang.Throwable -> L60
        L1d2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            r1.append(r14)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L60
            r12 = 0
            r0.<init>(r1, r12)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L1ea:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L60
            int r1 = r8.localVersion     // Catch: java.lang.Throwable -> L60
            int r2 = r8.remoteVersion     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch: java.lang.Throwable -> L60
            r4.append(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch: java.lang.Throwable -> L60
            r4.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch: java.lang.Throwable -> L60
            r4.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "."
            r4.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L60
            r12 = 0
            r0.<init>(r1, r12)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L21b:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 != 0) goto L225
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.remove()
            goto L22a
        L225:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.set(r9)
        L22a:
            android.database.Cursor r1 = r7.zza
            if (r1 == 0) goto L231
            r1.close()
        L231:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.set(r6)
            throw r0
        L237:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r12 = 0
            r0.<init>(r1, r12)
            throw r0
    }

    public static int zza(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.String r11, boolean r12) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Boolean r0 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            r3 = 0
            if (r0 != 0) goto Lcd
            android.content.Context r0 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            java.lang.Class r4 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch: java.lang.Throwable -> L3a
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L3a
            if (r5 != r6) goto L3d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3a
            goto Lbd
        L3a:
            r0 = move-exception
            goto Lbf
        L3d:
            if (r5 == 0) goto L46
            zzd(r5)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3a
            goto Lbd
        L46:
            boolean r5 = zzf(r10)     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            return r3
        L4f:
            r0 = move-exception
            r11 = r0
            goto L183
        L53:
            boolean r5 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto Lb4
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3a
            boolean r6 = r5.equals(r2)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L60
            goto Lb4
        L60:
            r6 = 1
            int r6 = zzb(r10, r11, r12, r6)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            if (r7 == 0) goto La7
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            if (r7 == 0) goto L70
            goto La7
        L70:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.zzb.zza()     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            if (r7 == 0) goto L77
            goto L9c
        L77:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            r8 = 29
            if (r7 < r8) goto L8e
            com.google.android.gms.dynamite.b.a()     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            dalvik.system.DelegateLastClassLoader r7 = com.google.android.gms.dynamite.a.a(r7, r8)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            goto L9c
        L8e:
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            java.lang.String r8 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
        L9c:
            zzd(r7)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            r0.set(r2, r7)     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            com.google.android.gms.dynamite.DynamiteModule.zzb = r5     // Catch: java.lang.Throwable -> L3a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Laa
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            return r6
        La7:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            return r6
        Laa:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L3a
            r0.set(r2, r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3a
            goto Lbd
        Lb4:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L3a
            r0.set(r2, r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3a
        Lbd:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            goto Lcb
        Lbf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L4f java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5
        Lc1:
            r0 = move-exception
            goto Lc6
        Lc3:
            r0 = move-exception
            goto Lc6
        Lc5:
            r0 = move-exception
        Lc6:
            r0.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4f
        Lcb:
            com.google.android.gms.dynamite.DynamiteModule.zzb = r0     // Catch: java.lang.Throwable -> L4f
        Lcd:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto Le3
            int r10 = zzb(r10, r11, r12, r3)     // Catch: java.lang.Throwable -> Ld9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Ldd
            return r10
        Ld9:
            r0 = move-exception
            r11 = r0
            goto L185
        Ldd:
            r0 = move-exception
            r11 = r0
            r11.getMessage()     // Catch: java.lang.Throwable -> Ld9
            return r3
        Le3:
            com.google.android.gms.dynamite.zzq r4 = zzg(r10)     // Catch: java.lang.Throwable -> Ld9
            if (r4 != 0) goto Leb
            goto L17a
        Leb:
            int r0 = r4.zze()     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            r1 = 3
            if (r0 < r1) goto L158
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            if (r0 == 0) goto L10e
            android.database.Cursor r0 = r0.zza     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            if (r0 == 0) goto L10e
            int r3 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            goto L17a
        L106:
            r0 = move-exception
            r11 = r0
            goto L16f
        L10a:
            r0 = move-exception
            r11 = r0
            goto L171
        L10e:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.zzk(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            if (r11 == 0) goto L152
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L140 android.os.RemoteException -> L143
            if (r12 != 0) goto L133
            goto L152
        L133:
            int r12 = r11.getInt(r3)     // Catch: java.lang.Throwable -> L140 android.os.RemoteException -> L143
            if (r12 <= 0) goto L146
            boolean r0 = zze(r11)     // Catch: java.lang.Throwable -> L140 android.os.RemoteException -> L143
            if (r0 == 0) goto L146
            goto L147
        L140:
            r0 = move-exception
            r12 = r0
            goto L14e
        L143:
            r0 = move-exception
            r12 = r0
            goto L150
        L146:
            r2 = r11
        L147:
            if (r2 == 0) goto L14c
            r2.close()     // Catch: java.lang.Throwable -> Ld9
        L14c:
            r3 = r12
            goto L17a
        L14e:
            r2 = r11
            goto L17d
        L150:
            r2 = r11
            goto L172
        L152:
            if (r11 == 0) goto L17a
            r11.close()     // Catch: java.lang.Throwable -> Ld9
            goto L17a
        L158:
            r6 = r11
            r7 = r12
            r11 = 2
            if (r0 != r11) goto L166
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            int r3 = r4.zzg(r11, r6, r7)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            goto L17a
        L166:
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            int r3 = r4.zzf(r11, r6, r7)     // Catch: java.lang.Throwable -> L106 android.os.RemoteException -> L10a
            goto L17a
        L16f:
            r12 = r11
            goto L17d
        L171:
            r12 = r11
        L172:
            r12.getMessage()     // Catch: java.lang.Throwable -> L17b
            if (r2 == 0) goto L17a
            r2.close()     // Catch: java.lang.Throwable -> Ld9
        L17a:
            return r3
        L17b:
            r0 = move-exception
            r12 = r0
        L17d:
            if (r2 == 0) goto L182
            r2.close()     // Catch: java.lang.Throwable -> Ld9
        L182:
            throw r12     // Catch: java.lang.Throwable -> Ld9
        L183:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r11     // Catch: java.lang.Throwable -> Ld9
        L185:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
    }

    private static int zzb(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.ThreadLocal r9 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            long r3 = r9.longValue()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.String r9 = "api_force_staging"
            java.lang.String r0 = "api"
            r8 = 1
            if (r8 == r11) goto L19
            r9 = r0
        L19:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            r11.<init>()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.String r0 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r0)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r0)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            android.net.Uri r3 = r9.build()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb8
            if (r9 == 0) goto Lac
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            if (r10 == 0) goto Lac
            r10 = 0
            int r11 = r9.getInt(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            if (r11 <= 0) goto L91
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r2 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            r0 = 2
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.zzc = r0     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "loaderVersion"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 < 0) goto L73
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.zze = r0     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r0 = move-exception
            r10 = r0
            goto L8f
        L73:
            java.lang.String r0 = "disableStandaloneDynamiteLoader2"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 < 0) goto L86
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L82
            goto L83
        L82:
            r8 = 0
        L83:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r8     // Catch: java.lang.Throwable -> L70
            r10 = r8
        L86:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
            boolean r0 = zze(r9)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            if (r0 == 0) goto L91
            r9 = r1
            goto L91
        L8f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
        L91:
            if (r12 == 0) goto La6
            if (r10 != 0) goto L96
            goto La6
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11, r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
        L9e:
            r0 = move-exception
            r10 = r0
            goto La4
        La1:
            r0 = move-exception
            r10 = r0
            goto Lbc
        La4:
            r1 = r9
            goto Ldc
        La6:
            if (r9 == 0) goto Lab
            r9.close()
        Lab:
            return r11
        Lac:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
        Lb4:
            r0 = move-exception
            r9 = r0
            r10 = r9
            goto Ldc
        Lb8:
            r0 = move-exception
            r9 = r0
            r10 = r9
            r9 = r1
        Lbc:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto Lc1
            throw r10     // Catch: java.lang.Throwable -> L9e
        Lc1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = r10.getMessage()     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r0.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "V2 version check failed: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L9e
            r0.append(r12)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L9e
            r11.<init>(r12, r10, r1)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        Ldc:
            if (r1 == 0) goto Le1
            r1.close()
        Le1:
            throw r10
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "Selected local version of "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.concat(r2)
            com.google.android.gms.dynamite.DynamiteModule r2 = new com.google.android.gms.dynamite.DynamiteModule
            r2.<init>(r1)
            return r2
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static void zzd(java.lang.ClassLoader r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            java.lang.reflect.Constructor r3 = r3.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            if (r3 != 0) goto L15
            r1 = r0
            goto L31
        L15:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.zzr     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            if (r2 == 0) goto L2c
            com.google.android.gms.dynamite.zzr r1 = (com.google.android.gms.dynamite.zzr) r1     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            goto L31
        L22:
            r3 = move-exception
            goto L34
        L24:
            r3 = move-exception
            goto L34
        L26:
            r3 = move-exception
            goto L34
        L28:
            r3 = move-exception
            goto L34
        L2a:
            r3 = move-exception
            goto L34
        L2c:
            com.google.android.gms.dynamite.zzr r1 = new com.google.android.gms.dynamite.zzr     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            r1.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
        L31:
            com.google.android.gms.dynamite.DynamiteModule.zzl = r1     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            return
        L34:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
    }

    private static boolean zze(android.database.Cursor r2) {
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0
            if (r0 == 0) goto L12
            android.database.Cursor r1 = r0.zza
            if (r1 != 0) goto L12
            r0.zza = r2
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("DynamiteModule.class")
    private static boolean zzf(android.content.Context r5) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 0
            boolean r1 = r0.equals(r1)
            r2 = 1
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.zzf
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            return r2
        L14:
            java.lang.Boolean r0 = com.google.android.gms.dynamite.DynamiteModule.zzf
            r1 = 0
            if (r0 != 0) goto L51
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r3 = "com.google.android.gms.chimera"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r3, r1)
            com.google.android.gms.common.GoogleApiAvailabilityLight r3 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r4 = 10000000(0x989680, float:1.4012985E-38)
            int r5 = r3.isGooglePlayServicesAvailable(r5, r4)
            if (r5 != 0) goto L3d
            if (r0 == 0) goto L3d
            java.lang.String r5 = "com.google.android.gms"
            java.lang.String r3 = r0.packageName
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L3d
            r1 = 1
        L3d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.dynamite.DynamiteModule.zzf = r5
            if (r1 == 0) goto L51
            android.content.pm.ApplicationInfo r5 = r0.applicationInfo
            if (r5 == 0) goto L51
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 != 0) goto L51
            com.google.android.gms.dynamite.DynamiteModule.zzd = r2
        L51:
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.gms.dynamite.zzq zzg(android.content.Context r4) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.zzq r1 = com.google.android.gms.dynamite.DynamiteModule.zzk     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r4 = move-exception
            goto L46
        Lb:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r2, r3)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r2)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            if (r4 != 0) goto L27
            r2 = r1
            goto L3b
        L27:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r4.queryLocalInterface(r2)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            boolean r3 = r2 instanceof com.google.android.gms.dynamite.zzq     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            if (r3 == 0) goto L36
            com.google.android.gms.dynamite.zzq r2 = (com.google.android.gms.dynamite.zzq) r2     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            goto L3b
        L34:
            r4 = move-exception
            goto L41
        L36:
            com.google.android.gms.dynamite.zzq r2 = new com.google.android.gms.dynamite.zzq     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
        L3b:
            if (r2 == 0) goto L44
            com.google.android.gms.dynamite.DynamiteModule.zzk = r2     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L41:
            r4.getMessage()     // Catch: java.lang.Throwable -> L9
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r4
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Context getModuleContext() {
            r1 = this;
            android.content.Context r0 = r1.zzj
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder instantiate(@androidx.annotation.NonNull java.lang.String r4) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r3 = this;
            android.content.Context r0 = r3.zzj     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r0
        L11:
            r0 = move-exception
            goto L16
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate module class: "
            java.lang.String r4 = r2.concat(r4)
            r2 = 0
            r1.<init>(r4, r0, r2)
            throw r1
    }
}
