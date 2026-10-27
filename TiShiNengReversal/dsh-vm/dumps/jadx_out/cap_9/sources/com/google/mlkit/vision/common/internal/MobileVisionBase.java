package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MobileVisionBase<DetectionResultT> implements java.io.Closeable, androidx.lifecycle.LifecycleObserver {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.internal.GmsLogger zzb = null;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;
    private final com.google.mlkit.common.sdkinternal.MLTask zzd;
    private final com.google.android.gms.tasks.CancellationTokenSource zze;
    private final java.util.concurrent.Executor zzf;
    private final com.google.android.gms.tasks.Task zzg;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "MobileVisionBase"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.vision.common.internal.MobileVisionBase.zzb = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public MobileVisionBase(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MLTask<DetectionResultT, com.google.mlkit.vision.common.InputImage> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzc = r0
            r2.zzd = r3
            com.google.android.gms.tasks.CancellationTokenSource r0 = new com.google.android.gms.tasks.CancellationTokenSource
            r0.<init>()
            r2.zze = r0
            r2.zzf = r4
            r3.pin()
            com.google.mlkit.vision.common.internal.zzb r1 = com.google.mlkit.vision.common.internal.zzb.zza
            com.google.android.gms.tasks.CancellationToken r0 = r0.getToken()
            com.google.android.gms.tasks.Task r3 = r3.callAfterLoad(r4, r1, r0)
            com.google.mlkit.vision.common.internal.zzc r4 = com.google.mlkit.vision.common.internal.zzc.zza
            com.google.android.gms.tasks.Task r3 = r3.addOnFailureListener(r4)
            r2.zzg = r3
            return
    }

    static /* synthetic */ void zzc(java.lang.Exception r3) {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.vision.common.internal.MobileVisionBase.zzb
            java.lang.String r1 = "MobileVisionBase"
            java.lang.String r2 = "Error preloading model resource"
            r0.e(r1, r2, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc     // Catch: java.lang.Throwable -> L18
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            com.google.android.gms.tasks.CancellationTokenSource r0 = r2.zze     // Catch: java.lang.Throwable -> L18
            r0.cancel()     // Catch: java.lang.Throwable -> L18
            com.google.mlkit.common.sdkinternal.MLTask r0 = r2.zzd     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.Executor r1 = r2.zzf     // Catch: java.lang.Throwable -> L18
            r0.unpin(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L18:
            r0 = move-exception
            goto L1c
        L1a:
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized com.google.android.gms.tasks.Task<java.lang.Void> closeWithTask() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc     // Catch: java.lang.Throwable -> L19
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            com.google.android.gms.tasks.CancellationTokenSource r0 = r2.zze     // Catch: java.lang.Throwable -> L19
            r0.cancel()     // Catch: java.lang.Throwable -> L19
            com.google.mlkit.common.sdkinternal.MLTask r0 = r2.zzd     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.Executor r1 = r2.zzf     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.tasks.Task r0 = r0.unpinWithTask(r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r0
        L19:
            r0 = move-exception
            goto L22
        L1b:
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized com.google.android.gms.tasks.Task<java.lang.Void> getInitTaskBase() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.tasks.Task r0 = r1.zzg     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull android.graphics.Bitmap r1, int r2) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromBitmap(r1, r2)
            com.google.android.gms.tasks.Task r1 = r0.processBase(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull android.media.Image r1, int r2) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromMediaImage(r1, r2)
            com.google.android.gms.tasks.Task r1 = r0.processBase(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull android.media.Image r1, int r2, @androidx.annotation.NonNull android.graphics.Matrix r3) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromMediaImage(r1, r2, r3)
            com.google.android.gms.tasks.Task r1 = r0.processBase(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromByteBuffer(r1, r2, r3, r4, r5)
            com.google.android.gms.tasks.Task r1 = r0.processBase(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized com.google.android.gms.tasks.Task<DetectionResultT> processBase(@androidx.annotation.NonNull com.google.android.odml.image.MlImage r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "MlImage can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzc     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.google.mlkit.common.MlKitException r5 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "This detector is already closed!"
            r1 = 14
            r5.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forException(r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r5
        L1d:
            r5 = move-exception
            goto L60
        L1f:
            int r0 = r5.getWidth()     // Catch: java.lang.Throwable -> L1d
            r1 = 32
            if (r0 < r1) goto L52
            int r0 = r5.getHeight()     // Catch: java.lang.Throwable -> L1d
            if (r0 < r1) goto L52
            com.google.android.odml.image.MlImage$Internal r0 = r5.getInternal()     // Catch: java.lang.Throwable -> L1d
            r0.acquire()     // Catch: java.lang.Throwable -> L1d
            com.google.mlkit.common.sdkinternal.MLTask r0 = r4.zzd     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.Executor r1 = r4.zzf     // Catch: java.lang.Throwable -> L1d
            com.google.mlkit.vision.common.internal.zzd r2 = new com.google.mlkit.vision.common.internal.zzd     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.CancellationTokenSource r3 = r4.zze     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.CancellationToken r3 = r3.getToken()     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r0 = r0.callAfterLoad(r1, r2, r3)     // Catch: java.lang.Throwable -> L1d
            com.google.mlkit.vision.common.internal.zze r1 = new com.google.mlkit.vision.common.internal.zze     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r5 = r0.addOnCompleteListener(r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r5
        L52:
            com.google.mlkit.common.MlKitException r5 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "MlImage width and height should be at least 32!"
            r1 = 3
            r5.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forException(r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r5
        L60:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r5
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized com.google.android.gms.tasks.Task<DetectionResultT> processBase(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "InputImage can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzc     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "This detector is already closed!"
            r1 = 14
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forException(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L1d:
            r4 = move-exception
            goto L50
        L1f:
            int r0 = r4.getWidth()     // Catch: java.lang.Throwable -> L1d
            r1 = 32
            if (r0 < r1) goto L42
            int r0 = r4.getHeight()     // Catch: java.lang.Throwable -> L1d
            if (r0 < r1) goto L42
            com.google.mlkit.common.sdkinternal.MLTask r0 = r3.zzd     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.Executor r1 = r3.zzf     // Catch: java.lang.Throwable -> L1d
            com.google.mlkit.vision.common.internal.zza r2 = new com.google.mlkit.vision.common.internal.zza     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.CancellationTokenSource r4 = r3.zze     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.CancellationToken r4 = r4.getToken()     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r4 = r0.callAfterLoad(r1, r2, r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L42:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "InputImage width and height should be at least 32!"
            r1 = 3
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forException(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    final /* synthetic */ java.lang.Object zza(com.google.mlkit.vision.common.InputImage r7) throws java.lang.Exception {
            r6 = this;
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "detectorTaskWithResource#run"
            com.google.android.gms.internal.mlkit_vision_common.zzlx r1 = com.google.android.gms.internal.mlkit_vision_common.zzlx.zze(r1)
            r1.zzb()
            com.google.mlkit.common.sdkinternal.MLTask r2 = r6.zzd     // Catch: java.lang.Throwable -> L15
            java.lang.Object r7 = r2.run(r7)     // Catch: java.lang.Throwable -> L15
            r1.close()
            return r7
        L15:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1a
            goto L2e
        L1a:
            r1 = move-exception
            java.lang.String r2 = "addSuppressed"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2e
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Exception -> L2e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L2e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2e
            r2[r5] = r1     // Catch: java.lang.Exception -> L2e
            r0.invoke(r7, r2)     // Catch: java.lang.Exception -> L2e
        L2e:
            throw r7
    }

    final /* synthetic */ java.lang.Object zzb(com.google.android.odml.image.MlImage r3) throws java.lang.Exception {
            r2 = this;
            com.google.mlkit.vision.common.InputImage r3 = com.google.mlkit.vision.common.internal.CommonConvertUtils.convertMlImagetoInputImage(r3)
            if (r3 == 0) goto Ld
            com.google.mlkit.common.sdkinternal.MLTask r0 = r2.zzd
            java.lang.Object r3 = r0.run(r3)
            return r3
        Ld:
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Current type of MlImage is not supported."
            r1 = 13
            r3.<init>(r0, r1)
            throw r3
    }
}
