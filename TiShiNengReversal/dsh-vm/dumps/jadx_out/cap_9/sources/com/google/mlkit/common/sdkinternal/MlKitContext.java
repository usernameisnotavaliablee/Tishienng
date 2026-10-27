package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MlKitContext {
    private static final java.lang.Object zza = null;

    @androidx.annotation.Nullable
    private static com.google.mlkit.common.sdkinternal.MlKitContext zzb;

    @androidx.annotation.Nullable
    private com.google.firebase.components.ComponentRuntime zzc;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.mlkit.common.sdkinternal.MlKitContext.zza = r0
            return
    }

    private MlKitContext() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.MlKitContext getInstance() {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MlKitContext has not been initialized"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L19
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L19
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = (com.google.mlkit.common.sdkinternal.MlKitContext) r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.MlKitContext initialize(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull java.util.List<com.google.firebase.components.ComponentRegistrar> r9) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L39
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r4 = "MlKitContext is already initialized"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L39
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = new com.google.mlkit.common.sdkinternal.MlKitContext     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            com.google.mlkit.common.sdkinternal.MlKitContext.zzb = r1     // Catch: java.lang.Throwable -> L39
            android.content.Context r8 = zzc(r8)     // Catch: java.lang.Throwable -> L39
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L39
        L25:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L39
            com.google.firebase.components.ComponentRegistrar r5 = (com.google.firebase.components.ComponentRegistrar) r5     // Catch: java.lang.Throwable -> L39
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L39
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L39
            goto L25
        L39:
            r8 = move-exception
            goto L6b
        L3b:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L39
            com.google.firebase.components.ComponentRuntime r4 = new com.google.firebase.components.ComponentRuntime     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.Executor r5 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD     // Catch: java.lang.Throwable -> L39
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            com.google.firebase.components.Component r8 = com.google.firebase.components.Component.of(r8, r6, r7)     // Catch: java.lang.Throwable -> L39
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r6 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            com.google.firebase.components.Component r6 = com.google.firebase.components.Component.of(r1, r6, r7)     // Catch: java.lang.Throwable -> L39
            r7 = 2
            com.google.firebase.components.Component[] r7 = new com.google.firebase.components.Component[r7]     // Catch: java.lang.Throwable -> L39
            r7[r3] = r8     // Catch: java.lang.Throwable -> L39
            r7[r2] = r6     // Catch: java.lang.Throwable -> L39
            r4.<init>(r5, r9, r7)     // Catch: java.lang.Throwable -> L39
            r1.zzc = r4     // Catch: java.lang.Throwable -> L39
            r4.initializeEagerComponents(r2)     // Catch: java.lang.Throwable -> L39
            com.google.mlkit.common.sdkinternal.MlKitContext r8 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r8
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r8
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8
            goto Lc
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = zza(r2)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<com.google.firebase.components.ComponentRegistrar> r3) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8
            goto Lc
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = initialize(r2, r3)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8
            goto Lc
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = zzb(r2, r3)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @androidx.annotation.NonNull
    public static com.google.mlkit.common.sdkinternal.MlKitContext zza(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD     // Catch: java.lang.Throwable -> Lb
            com.google.mlkit.common.sdkinternal.MlKitContext r2 = zzb(r2, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @androidx.annotation.NonNull
    public static com.google.mlkit.common.sdkinternal.MlKitContext zzb(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull java.util.concurrent.Executor r7) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L53
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r4 = "MlKitContext is already initialized"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L53
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = new com.google.mlkit.common.sdkinternal.MlKitContext     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            com.google.mlkit.common.sdkinternal.MlKitContext.zzb = r1     // Catch: java.lang.Throwable -> L53
            android.content.Context r6 = zzc(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.Class<com.google.mlkit.common.internal.MlKitComponentDiscoveryService> r4 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.class
            com.google.firebase.components.ComponentDiscovery r4 = com.google.firebase.components.ComponentDiscovery.forContext(r6, r4)     // Catch: java.lang.Throwable -> L53
            java.util.List r4 = r4.discoverLazy()     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.ComponentRuntime$Builder r7 = com.google.firebase.components.ComponentRuntime.builder(r7)     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.ComponentRuntime$Builder r7 = r7.addLazyComponentRegistrars(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.Component r6 = com.google.firebase.components.Component.of(r6, r4, r5)     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.ComponentRuntime$Builder r6 = r7.addComponent(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r7 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.Component r7 = com.google.firebase.components.Component.of(r1, r7, r3)     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.ComponentRuntime$Builder r6 = r6.addComponent(r7)     // Catch: java.lang.Throwable -> L53
            com.google.firebase.components.ComponentRuntime r6 = r6.build()     // Catch: java.lang.Throwable -> L53
            r1.zzc = r6     // Catch: java.lang.Throwable -> L53
            r6.initializeEagerComponents(r2)     // Catch: java.lang.Throwable -> L53
            com.google.mlkit.common.sdkinternal.MlKitContext r6 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return r6
        L53:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r6
    }

    private static android.content.Context zzc(android.content.Context r1) {
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <T> T get(@androidx.annotation.NonNull java.lang.Class<T> r3) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb
            if (r0 != r2) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "MlKitContext has been deleted"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.firebase.components.ComponentRuntime r0 = r2.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.firebase.components.ComponentRuntime r0 = r2.zzc
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Context getApplicationContext() {
            r1 = this;
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r0 = r1.get(r0)
            android.content.Context r0 = (android.content.Context) r0
            return r0
    }
}
