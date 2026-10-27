package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WaitForRepeatingRequestStart {
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback mCaptureCallback;
    private final boolean mHasCaptureSessionStuckQuirk;
    private boolean mHasSubmittedRepeating;
    private final java.lang.Object mLock;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mStartStreamingCompleter;

    @androidx.annotation.NonNull
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mStartStreamingFuture;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.FunctionalInterface
    public interface OpenCaptureSession {
        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> run(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.FunctionalInterface
    public interface SingleRepeatingRequest {
        int run(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) throws android.hardware.camera2.CameraAccessException;
    }

    public WaitForRepeatingRequestStart(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart$1 r0 = new androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart$1
            r0.<init>(r1)
            r1.mCaptureCallback = r0
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class
            boolean r2 = r2.contains(r0)
            r1.mHasCaptureSessionStuckQuirk = r2
            boolean r2 = r1.shouldWaitRepeatingSubmit()
            if (r2 == 0) goto L2b
            androidx.camera.camera2.internal.compat.workaround.b r2 = new androidx.camera.camera2.internal.compat.workaround.b
            r2.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r2)
            r1.mStartStreamingFuture = r2
            return
        L2b:
            r2 = 0
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r2)
            r1.mStartStreamingFuture = r2
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture a(androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.OpenCaptureSession r0, android.hardware.camera2.CameraDevice r1, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2, java.util.List r3, java.util.List r4) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.run(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r1.mStartStreamingCompleter = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "WaitForRepeatingRequestStart["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getStartStreamFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mStartStreamingFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    public void onSessionEnd() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.shouldWaitRepeatingSubmit()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            boolean r1 = r3.mHasSubmittedRepeating     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mStartStreamingFuture     // Catch: java.lang.Throwable -> L14
            r2 = 1
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> openCaptureSession(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r5, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> r6, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.OpenCaptureSession r7) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r6.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r1
            com.google.common.util.concurrent.ListenableFuture r1 = r1.getOpeningBlocker()
            r0.add(r1)
            goto L9
        L1d:
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(r0)
            androidx.camera.core.impl.utils.futures.FutureChain r6 = androidx.camera.core.impl.utils.futures.FutureChain.from(r6)
            androidx.camera.camera2.internal.compat.workaround.c r0 = new androidx.camera.camera2.internal.compat.workaround.c
            r0.<init>(r7, r3, r4, r5)
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.FutureChain r3 = r6.transformAsync(r0, r3)
            return r3
    }

    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r5, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r6, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.SingleRepeatingRequest r7) throws android.hardware.camera2.CameraAccessException {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r4.shouldWaitRepeatingSubmit()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = r4.mCaptureCallback     // Catch: java.lang.Throwable -> L1b
            r2 = 2
            android.hardware.camera2.CameraCaptureSession$CaptureCallback[] r2 = new android.hardware.camera2.CameraCaptureSession.CaptureCallback[r2]     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            r2[r1] = r6     // Catch: java.lang.Throwable -> L1b
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r6 = androidx.camera.camera2.internal.Camera2CaptureCallbacks.createComboCallback(r2)     // Catch: java.lang.Throwable -> L1b
            r4.mHasSubmittedRepeating = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r5 = move-exception
            goto L23
        L1d:
            int r5 = r7.run(r5, r6)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r5
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r5
    }

    public boolean shouldWaitRepeatingSubmit() {
            r1 = this;
            boolean r0 = r1.mHasCaptureSessionStuckQuirk
            return r0
    }
}
