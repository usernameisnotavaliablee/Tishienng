package androidx.camera.camera2.interop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.camera2.interop.ExperimentalCamera2Interop
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CameraControl {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String TAG_KEY = "Camera2CameraControl";

    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.camera2.impl.Camera2ImplConfig.Builder mBuilder;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mCompleter;
    final java.util.concurrent.Executor mExecutor;
    private boolean mIsActive;
    final java.lang.Object mLock;
    private boolean mPendingUpdate;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public Camera2CameraControl(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsActive = r0
            r1.mPendingUpdate = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            r1.mBuilder = r0
            androidx.camera.camera2.interop.f r0 = new androidx.camera.camera2.interop.f
            r0.<init>(r1)
            r1.mCaptureResultListener = r0
            r1.mCamera2CameraControlImpl = r2
            r1.mExecutor = r3
            return
    }

    public static /* synthetic */ void a(androidx.camera.camera2.interop.Camera2CameraControl r0, boolean r1) {
            r0.setActiveInternal(r1)
            return
    }

    private void addCaptureRequestOptionsInternal(@androidx.annotation.NonNull androidx.camera.camera2.interop.CaptureRequestOptions r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            java.util.Set r1 = r6.listOptions()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        Lb:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2     // Catch: java.lang.Throwable -> L25
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r3 = r5.mBuilder     // Catch: java.lang.Throwable -> L25
            androidx.camera.core.impl.MutableConfig r3 = r3.getMutableConfig()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r6.retrieveOption(r2)     // Catch: java.lang.Throwable -> L25
            r3.insertOption(r2, r4)     // Catch: java.lang.Throwable -> L25
            goto Lb
        L25:
            r6 = move-exception
            goto L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r6
    }

    public static /* synthetic */ void b(androidx.camera.camera2.interop.Camera2CameraControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.updateConfig(r1)
            return
    }

    public static /* synthetic */ java.lang.Object c(androidx.camera.camera2.interop.Camera2CameraControl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.interop.b r1 = new androidx.camera.camera2.interop.b
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.String r2 = "addCaptureRequestOptions"
            return r2
    }

    private void clearCaptureRequestOptionsInternal() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r1 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder     // Catch: java.lang.Throwable -> Lc
            r1.<init>()     // Catch: java.lang.Throwable -> Lc
            r2.mBuilder = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public static /* synthetic */ void d(androidx.camera.camera2.interop.Camera2CameraControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.updateConfig(r1)
            return
    }

    public static /* synthetic */ boolean e(androidx.camera.camera2.interop.Camera2CameraControl r2, android.hardware.camera2.TotalCaptureResult r3) {
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCompleter
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.TagBundle
            if (r0 == 0) goto L32
            androidx.camera.core.impl.TagBundle r3 = (androidx.camera.core.impl.TagBundle) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.getTag(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCompleter
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mCompleter
            r2.mCompleter = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.set(r1)
        L38:
            r2 = 0
            return r2
    }

    public static /* synthetic */ java.lang.Object f(androidx.camera.camera2.interop.Camera2CameraControl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.interop.d r1 = new androidx.camera.camera2.interop.d
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.String r2 = "setCaptureRequestOptions"
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.interop.Camera2CameraControl from(@androidx.annotation.NonNull androidx.camera.core.CameraControl r2) {
            androidx.camera.core.impl.CameraControlInternal r2 = (androidx.camera.core.impl.CameraControlInternal) r2
            androidx.camera.core.impl.CameraControlInternal r2 = r2.getImplementation()
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.Camera2CameraControlImpl
            java.lang.String r1 = "CameraControl doesn't contain Camera2 implementation."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = (androidx.camera.camera2.internal.Camera2CameraControlImpl) r2
            androidx.camera.camera2.interop.Camera2CameraControl r2 = r2.getCamera2CameraControl()
            return r2
    }

    public static /* synthetic */ void g(androidx.camera.camera2.interop.Camera2CameraControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.updateConfig(r1)
            return
    }

    public static /* synthetic */ java.lang.Object h(androidx.camera.camera2.interop.Camera2CameraControl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.interop.h r1 = new androidx.camera.camera2.interop.h
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.String r2 = "clearCaptureRequestOptions"
            return r2
    }

    private void setActiveInternal(boolean r3) {
            r2 = this;
            boolean r0 = r2.mIsActive
            if (r0 != r3) goto L5
            goto L22
        L5:
            r2.mIsActive = r3
            if (r3 == 0) goto L11
            boolean r3 = r2.mPendingUpdate
            if (r3 == 0) goto L22
            r2.updateSession()
            return
        L11:
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mCompleter
            if (r3 == 0) goto L22
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "The camera control has became inactive."
            r0.<init>(r1)
            r3.setException(r0)
            r3 = 0
            r2.mCompleter = r3
        L22:
            return
    }

    private void updateConfig(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r3) {
            r2 = this;
            r0 = 1
            r2.mPendingUpdate = r0
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCompleter
            if (r0 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            r2.mCompleter = r3
            boolean r3 = r2.mIsActive
            if (r3 == 0) goto L12
            r2.updateSession()
        L12:
            if (r0 == 0) goto L1e
            androidx.camera.core.CameraControl$OperationCanceledException r3 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera2CameraControl was updated with new options."
            r3.<init>(r1)
            r0.setException(r3)
        L1e:
            return
    }

    private void updateSession() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r1.mCamera2CameraControlImpl
            r0.updateSessionConfig()
            r0 = 0
            r1.mPendingUpdate = r0
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> addCaptureRequestOptions(@androidx.annotation.NonNull androidx.camera.camera2.interop.CaptureRequestOptions r1) {
            r0 = this;
            r0.addCaptureRequestOptionsInternal(r1)
            androidx.camera.camera2.interop.a r1 = new androidx.camera.camera2.interop.a
            r1.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> clearCaptureRequestOptions() {
            r1 = this;
            r1.clearCaptureRequestOptionsInternal()
            androidx.camera.camera2.interop.g r0 = new androidx.camera.camera2.interop.g
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.camera2.impl.Camera2ImplConfig getCamera2ImplConfig() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r4.mCompleter     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r1 = r4.mBuilder     // Catch: java.lang.Throwable -> L1d
            androidx.camera.core.impl.MutableConfig r1 = r1.getMutableConfig()     // Catch: java.lang.Throwable -> L1d
            androidx.camera.core.impl.Config$Option<java.lang.Object> r2 = androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_TAG_OPTION     // Catch: java.lang.Throwable -> L1d
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r4.mCompleter     // Catch: java.lang.Throwable -> L1d
            int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            r1.insertOption(r2, r3)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L27
        L1f:
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r1 = r4.mBuilder     // Catch: java.lang.Throwable -> L1d
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r1.build()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener getCaptureRequestListener() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r0 = r1.mCaptureResultListener
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r1 = r2.mBuilder     // Catch: java.lang.Throwable -> L13
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r1.build()     // Catch: java.lang.Throwable -> L13
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r1 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r1)     // Catch: java.lang.Throwable -> L13
            androidx.camera.camera2.interop.CaptureRequestOptions r1 = r1.build()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setActive(boolean r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.interop.c r1 = new androidx.camera.camera2.interop.c
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setCaptureRequestOptions(@androidx.annotation.NonNull androidx.camera.camera2.interop.CaptureRequestOptions r1) {
            r0 = this;
            r0.clearCaptureRequestOptionsInternal()
            r0.addCaptureRequestOptionsInternal(r1)
            androidx.camera.camera2.interop.e r1 = new androidx.camera.camera2.interop.e
            r1.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r1)
            return r1
    }
}
