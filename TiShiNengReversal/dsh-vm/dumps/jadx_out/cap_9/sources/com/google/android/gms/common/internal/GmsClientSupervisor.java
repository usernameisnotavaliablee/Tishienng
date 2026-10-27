package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class GmsClientSupervisor {

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    static android.os.HandlerThread zza;
    private static final java.lang.Object zzb = null;

    @androidx.annotation.Nullable
    private static com.google.android.gms.common.internal.zzs zzc;

    @androidx.annotation.Nullable
    private static java.util.concurrent.Executor zzd;
    private static boolean zze;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.GmsClientSupervisor.zzb = r0
            return
    }

    public GmsClientSupervisor() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getDefaultBindFlags() {
            r0 = 4225(0x1081, float:5.92E-42)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(@androidx.annotation.NonNull android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L2b
            com.google.android.gms.common.internal.zzs r1 = new com.google.android.gms.common.internal.zzs     // Catch: java.lang.Throwable -> L1e
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            android.os.HandlerThread r4 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L1e
            android.os.Looper r4 = r4.getLooper()     // Catch: java.lang.Throwable -> L1e
            goto L24
        L1e:
            r4 = move-exception
            goto L2f
        L20:
            android.os.Looper r4 = r4.getMainLooper()     // Catch: java.lang.Throwable -> L1e
        L24:
            java.util.concurrent.Executor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.internal.GmsClientSupervisor.zzc = r1     // Catch: java.lang.Throwable -> L1e
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.internal.zzs r4 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc
            return r4
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.HandlerThread getOrStartHandlerThread() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            goto L1d
        Lb:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "GoogleApiHandler"
            r3 = 9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L9
            r1.start()     // Catch: java.lang.Throwable -> L9
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.HandlerThread getOrStartHandlerThread(int r3) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r3 = move-exception
            goto L1b
        Lb:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "GoogleApiHandler"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L9
            r1.start()     // Catch: java.lang.Throwable -> L9
            android.os.HandlerThread r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r3
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void setDefaultBindExecutor(@androidx.annotation.Nullable java.util.concurrent.Executor r2) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.zzi(r2)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto L11
        Ld:
            com.google.android.gms.common.internal.GmsClientSupervisor.zzd = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            boolean r2 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            android.os.HandlerThread r2 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L17
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1e
        L19:
            r1 = 1
            com.google.android.gms.common.internal.GmsClientSupervisor.zze = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean bindService(@androidx.annotation.NonNull android.content.ComponentName r3, @androidx.annotation.NonNull android.content.ServiceConnection r4, @androidx.annotation.NonNull java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            r3 = 0
            boolean r3 = r2.zzc(r0, r4, r5, r3)
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean bindService(@androidx.annotation.NonNull android.content.ComponentName r3, @androidx.annotation.NonNull android.content.ServiceConnection r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.concurrent.Executor r6) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            boolean r3 = r2.zzc(r0, r4, r5, r6)
            return r3
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean bindService(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.content.ServiceConnection r5, @androidx.annotation.NonNull java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r4 = 0
            boolean r4 = r3.zzc(r0, r5, r6, r4)
            return r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unbindService(@androidx.annotation.NonNull android.content.ComponentName r3, @androidx.annotation.NonNull android.content.ServiceConnection r4, @androidx.annotation.NonNull java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            r2.zza(r0, r4, r5)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unbindService(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.content.ServiceConnection r5, @androidx.annotation.NonNull java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r3.zza(r0, r5, r6)
            return
    }

    protected abstract void zza(com.google.android.gms.common.internal.zzo r1, android.content.ServiceConnection r2, java.lang.String r3);

    public final void zzb(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, int r4, @androidx.annotation.NonNull android.content.ServiceConnection r5, @androidx.annotation.NonNull java.lang.String r6, boolean r7) {
            r1 = this;
            com.google.android.gms.common.internal.zzo r4 = new com.google.android.gms.common.internal.zzo
            r0 = 4225(0x1081, float:5.92E-42)
            r4.<init>(r2, r3, r0, r7)
            r1.zza(r4, r5, r6)
            return
    }

    protected abstract boolean zzc(com.google.android.gms.common.internal.zzo r1, android.content.ServiceConnection r2, java.lang.String r3, @androidx.annotation.Nullable java.util.concurrent.Executor r4);
}
