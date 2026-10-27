package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraRepository {
    private static final java.lang.String TAG = "CameraRepository";

    @androidx.annotation.GuardedBy("mCamerasLock")
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> mCameras;
    private final java.lang.Object mCamerasLock;

    @androidx.annotation.GuardedBy("mCamerasLock")
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mDeinitCompleter;

    @androidx.annotation.GuardedBy("mCamerasLock")
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mDeinitFuture;

    @androidx.annotation.GuardedBy("mCamerasLock")
    private final java.util.Set<androidx.camera.core.impl.CameraInternal> mReleasingCameras;

    public CameraRepository() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mCamerasLock = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.mCameras = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mReleasingCameras = r0
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.impl.CameraRepository r2, androidx.camera.core.impl.CameraInternal r3) {
            java.lang.Object r0 = r2.mCamerasLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.core.impl.CameraInternal> r1 = r2.mReleasingCameras     // Catch: java.lang.Throwable -> L20
            r1.remove(r3)     // Catch: java.lang.Throwable -> L20
            java.util.Set<androidx.camera.core.impl.CameraInternal> r3 = r2.mReleasingCameras     // Catch: java.lang.Throwable -> L20
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mDeinitCompleter     // Catch: java.lang.Throwable -> L20
            androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L20
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mDeinitCompleter     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r3.set(r1)     // Catch: java.lang.Throwable -> L20
            r2.mDeinitCompleter = r1     // Catch: java.lang.Throwable -> L20
            r2.mDeinitFuture = r1     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.core.impl.CameraRepository r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            java.lang.Object r0 = r1.mCamerasLock
            monitor-enter(r0)
            r1.mDeinitCompleter = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "CameraRepository-deinit"
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> deinit() {
            r6 = this;
            java.lang.Object r0 = r6.mCamerasLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r1 = r6.mCameras     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L19
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r6.mDeinitFuture     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L61
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L19:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r6.mDeinitFuture     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L28
            androidx.camera.core.impl.k r1 = new androidx.camera.core.impl.k     // Catch: java.lang.Throwable -> L15
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)     // Catch: java.lang.Throwable -> L15
            r6.mDeinitFuture = r1     // Catch: java.lang.Throwable -> L15
        L28:
            java.util.Set<androidx.camera.core.impl.CameraInternal> r2 = r6.mReleasingCameras     // Catch: java.lang.Throwable -> L15
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r3 = r6.mCameras     // Catch: java.lang.Throwable -> L15
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L15
            r2.addAll(r3)     // Catch: java.lang.Throwable -> L15
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r6.mCameras     // Catch: java.lang.Throwable -> L15
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L15
        L3d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.CameraInternal r3 = (androidx.camera.core.impl.CameraInternal) r3     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.ListenableFuture r4 = r3.release()     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.l r5 = new androidx.camera.core.impl.l     // Catch: java.lang.Throwable -> L15
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> L15
            r4.addListener(r5, r3)     // Catch: java.lang.Throwable -> L15
            goto L3d
        L5a:
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r6.mCameras     // Catch: java.lang.Throwable -> L15
            r2.clear()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraInternal getCamera(@androidx.annotation.NonNull java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.mCamerasLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r1 = r4.mCameras     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.impl.CameraInternal r1 = (androidx.camera.core.impl.CameraInternal) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r5 = move-exception
            goto L28
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Invalid camera: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }

    @androidx.annotation.NonNull
    java.util.Set<java.lang.String> getCameraIds() {
            r3 = this;
            java.lang.Object r0 = r3.mCamerasLock
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L10
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r3.mCameras     // Catch: java.lang.Throwable -> L10
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @androidx.annotation.NonNull
    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameras() {
            r3 = this;
            java.lang.Object r0 = r3.mCamerasLock
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L10
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r3.mCameras     // Catch: java.lang.Throwable -> L10
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public void init(@androidx.annotation.NonNull androidx.camera.core.impl.CameraFactory r7) throws androidx.camera.core.InitializationException {
            r6 = this;
            java.lang.Object r0 = r6.mCamerasLock
            monitor-enter(r0)
            java.util.Set r1 = r7.getAvailableCameraIds()     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
        Lb:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            java.lang.String r3 = "CameraRepository"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            java.lang.String r5 = "Added camera: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            r4.append(r2)     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            androidx.camera.core.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r3 = r6.mCameras     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            androidx.camera.core.impl.CameraInternal r4 = r7.getCamera(r2)     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L37 androidx.camera.core.CameraUnavailableException -> L39
            goto Lb
        L37:
            r7 = move-exception
            goto L43
        L39:
            r7 = move-exception
            goto L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L3d:
            androidx.camera.core.InitializationException r1 = new androidx.camera.core.InitializationException     // Catch: java.lang.Throwable -> L37
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r7
    }
}
