package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SurfaceRequest {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final android.util.Range<java.lang.Integer> FRAME_RATE_RANGE_UNSPECIFIED = null;
    private final androidx.camera.core.impl.CameraInternal mCamera;

    @androidx.annotation.NonNull
    private final androidx.camera.core.DynamicRange mDynamicRange;
    private final android.util.Range<java.lang.Integer> mExpectedFrameRate;
    private final androidx.camera.core.impl.DeferrableSurface mInternalDeferrableSurface;
    private final java.lang.Object mLock;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mRequestCancellationCompleter;
    private final android.util.Size mResolution;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mSessionStatusFuture;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<android.view.Surface> mSurfaceCompleter;
    final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> mSurfaceFuture;

    @androidx.annotation.NonNull
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mSurfaceRecreationCompleter;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.SurfaceRequest.TransformationInfo mTransformationInfo;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private java.util.concurrent.Executor mTransformationInfoExecutor;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.SurfaceRequest.TransformationInfoListener mTransformationInfoListener;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class RequestCancelledException extends java.lang.RuntimeException {
        RequestCancelledException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ResultCode {
        }

        Result() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.SurfaceRequest.Result of(int r1, @androidx.annotation.NonNull android.view.Surface r2) {
                androidx.camera.core.AutoValue_SurfaceRequest_Result r0 = new androidx.camera.core.AutoValue_SurfaceRequest_Result
                r0.<init>(r1, r2)
                return r0
        }

        public abstract int getResultCode();

        @androidx.annotation.NonNull
        public abstract android.view.Surface getSurface();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class TransformationInfo {
        TransformationInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static androidx.camera.core.SurfaceRequest.TransformationInfo of(@androidx.annotation.NonNull android.graphics.Rect r7, int r8, int r9, boolean r10, @androidx.annotation.NonNull android.graphics.Matrix r11, boolean r12) {
                androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo r0 = new androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @androidx.annotation.NonNull
        public abstract android.graphics.Rect getCropRect();

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public abstract android.graphics.Matrix getSensorToBufferTransform();

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public abstract int getTargetRotation();

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public abstract boolean hasCameraTransform();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest.TransformationInfo r1);
    }

    static {
            android.util.Range<java.lang.Integer> r0 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            androidx.camera.core.SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@androidx.annotation.NonNull android.util.Size r5, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r6, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r7, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r8, @androidx.annotation.NonNull java.lang.Runnable r9) {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mLock = r0
            r4.mResolution = r5
            r4.mCamera = r6
            r4.mDynamicRange = r7
            r4.mExpectedFrameRate = r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "SurfaceRequest[size: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", id: "
            r6.append(r7)
            int r7 = r4.hashCode()
            r6.append(r7)
            java.lang.String r7 = "]"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r8 = 0
            r7.<init>(r8)
            androidx.camera.core.w0 r0 = new androidx.camera.core.w0
            r0.<init>(r7, r6)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            java.lang.Object r7 = r7.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r7 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r7
            java.lang.Object r7 = androidx.core.util.Preconditions.checkNotNull(r7)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r7 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r7
            r4.mRequestCancellationCompleter = r7
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r8)
            androidx.camera.core.x0 r2 = new androidx.camera.core.x0
            r2.<init>(r1, r6)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r2)
            r4.mSessionStatusFuture = r2
            androidx.camera.core.SurfaceRequest$1 r3 = new androidx.camera.core.SurfaceRequest$1
            r3.<init>(r4, r7, r0)
            java.util.concurrent.Executor r7 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r2, r3, r7)
            java.lang.Object r7 = r1.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r7 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r7
            java.lang.Object r7 = androidx.core.util.Preconditions.checkNotNull(r7)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r7 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r7
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r8)
            androidx.camera.core.y0 r8 = new androidx.camera.core.y0
            r8.<init>(r0, r6)
            com.google.common.util.concurrent.ListenableFuture r8 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r8)
            r4.mSurfaceFuture = r8
            java.lang.Object r0 = r0.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            r4.mSurfaceCompleter = r0
            androidx.camera.core.SurfaceRequest$2 r0 = new androidx.camera.core.SurfaceRequest$2
            r1 = 34
            r0.<init>(r4, r5, r1)
            r4.mInternalDeferrableSurface = r0
            com.google.common.util.concurrent.ListenableFuture r5 = r0.getTerminationFuture()
            androidx.camera.core.SurfaceRequest$3 r0 = new androidx.camera.core.SurfaceRequest$3
            r0.<init>(r4, r5, r7, r6)
            java.util.concurrent.Executor r6 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r8, r0, r6)
            androidx.camera.core.z0 r6 = new androidx.camera.core.z0
            r6.<init>(r4)
            java.util.concurrent.Executor r7 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r5.addListener(r6, r7)
            java.util.concurrent.Executor r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r5 = r4.initialSurfaceRecreationCompleter(r5, r9)
            r4.mSurfaceRecreationCompleter = r5
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@androidx.annotation.NonNull android.util.Size r7, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r8, @androidx.annotation.NonNull java.lang.Runnable r9) {
            r6 = this;
            androidx.camera.core.DynamicRange r3 = androidx.camera.core.DynamicRange.SDR
            android.util.Range<java.lang.Integer> r4 = androidx.camera.core.SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.SurfaceRequest.TransformationInfoListener r0, androidx.camera.core.SurfaceRequest.TransformationInfo r1) {
            r0.onTransformationInfoUpdate(r1)
            return
    }

    public static /* synthetic */ java.lang.Object b(java.util.concurrent.atomic.AtomicReference r0, java.lang.String r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r0.set(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "-cancellation"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ java.lang.Object c(java.util.concurrent.atomic.AtomicReference r0, java.lang.String r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r0.set(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "-Surface"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ void d(androidx.camera.core.SurfaceRequest r1) {
            com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r1 = r1.mSurfaceFuture
            r0 = 1
            r1.cancel(r0)
            return
    }

    public static /* synthetic */ void e(androidx.core.util.Consumer r1, android.view.Surface r2) {
            r0 = 4
            androidx.camera.core.SurfaceRequest$Result r2 = androidx.camera.core.SurfaceRequest.Result.of(r0, r2)
            r1.accept(r2)
            return
    }

    public static /* synthetic */ void f(androidx.core.util.Consumer r1, android.view.Surface r2) {
            r0 = 3
            androidx.camera.core.SurfaceRequest$Result r2 = androidx.camera.core.SurfaceRequest.Result.of(r0, r2)
            r1.accept(r2)
            return
    }

    public static /* synthetic */ java.lang.Object g(androidx.camera.core.SurfaceRequest r0, java.util.concurrent.atomic.AtomicReference r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r0.getClass()
            r1.set(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SurfaceRequest-surface-recreation("
            r1.append(r2)
            int r0 = r0.hashCode()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static /* synthetic */ java.lang.Object h(java.util.concurrent.atomic.AtomicReference r0, java.lang.String r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r0.set(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "-status"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ void i(androidx.camera.core.SurfaceRequest.TransformationInfoListener r0, androidx.camera.core.SurfaceRequest.TransformationInfo r1) {
            r0.onTransformationInfoUpdate(r1)
            return
    }

    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> initialSurfaceRecreationCompleter(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            androidx.camera.core.a1 r1 = new androidx.camera.core.a1
            r1.<init>(r3, r0)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
            androidx.camera.core.SurfaceRequest$5 r2 = new androidx.camera.core.SurfaceRequest$5
            r2.<init>(r3, r5)
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r1, r2, r4)
            java.lang.Object r4 = r0.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r4 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r4
            java.lang.Object r4 = androidx.core.util.Preconditions.checkNotNull(r4)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r4 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r4
            return r4
    }

    @android.annotation.SuppressLint({"PairedRegistration"})
    public void addRequestCancellationListener(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull java.lang.Runnable r3) {
            r1 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r1.mRequestCancellationCompleter
            r0.addCancellationListener(r3, r2)
            return
    }

    public void clearTransformationInfoListener() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 0
            r2.mTransformationInfoListener = r1     // Catch: java.lang.Throwable -> La
            r2.mTransformationInfoExecutor = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraInternal getCamera() {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.mCamera
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            r1 = this;
            androidx.camera.core.impl.DeferrableSurface r0 = r1.mInternalDeferrableSurface
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.DynamicRange getDynamicRange() {
            r1 = this;
            androidx.camera.core.DynamicRange r0 = r1.mDynamicRange
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.util.Range<java.lang.Integer> getExpectedFrameRate() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.mExpectedFrameRate
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Size getResolution() {
            r1 = this;
            android.util.Size r0 = r1.mResolution
            return r0
    }

    public boolean invalidate() {
            r2 = this;
            r2.willNotProvideSurface()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mSurfaceRecreationCompleter
            r1 = 0
            boolean r0 = r0.set(r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isServiced() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r0 = r1.mSurfaceFuture
            boolean r0 = r0.isDone()
            return r0
    }

    public void provideSurface(@androidx.annotation.NonNull android.view.Surface r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.Result> r5) {
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<android.view.Surface> r0 = r2.mSurfaceCompleter
            boolean r0 = r0.set(r3)
            if (r0 != 0) goto L31
            com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r0 = r2.mSurfaceFuture
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L11
            goto L31
        L11:
            com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r0 = r2.mSurfaceFuture
            boolean r0 = r0.isDone()
            androidx.core.util.Preconditions.checkState(r0)
            com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r0 = r2.mSurfaceFuture     // Catch: java.lang.Throwable -> L28
            r0.get()     // Catch: java.lang.Throwable -> L28
            androidx.camera.core.u0 r0 = new androidx.camera.core.u0     // Catch: java.lang.Throwable -> L28
            r0.<init>(r5, r3)     // Catch: java.lang.Throwable -> L28
            r4.execute(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            androidx.camera.core.v0 r0 = new androidx.camera.core.v0
            r0.<init>(r5, r3)
            r4.execute(r0)
            return
        L31:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mSessionStatusFuture
            androidx.camera.core.SurfaceRequest$4 r1 = new androidx.camera.core.SurfaceRequest$4
            r1.<init>(r2, r5, r3)
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r4)
            return
    }

    public void setTransformationInfoListener(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.SurfaceRequest.TransformationInfoListener r4) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.mTransformationInfoListener = r4     // Catch: java.lang.Throwable -> L15
            r2.mTransformationInfoExecutor = r3     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.SurfaceRequest$TransformationInfo r1 = r2.mTransformationInfo     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L14
            androidx.camera.core.t0 r0 = new androidx.camera.core.t0
            r0.<init>(r4, r1)
            r3.execute(r0)
        L14:
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void updateTransformationInfo(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest.TransformationInfo r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r3.mTransformationInfo = r4     // Catch: java.lang.Throwable -> L17
            androidx.camera.core.SurfaceRequest$TransformationInfoListener r1 = r3.mTransformationInfoListener     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Executor r2 = r3.mTransformationInfoExecutor     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L16
            if (r2 == 0) goto L16
            androidx.camera.core.s0 r0 = new androidx.camera.core.s0
            r0.<init>(r1, r4)
            r2.execute(r0)
        L16:
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    public boolean willNotProvideSurface() {
            r3 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<android.view.Surface> r0 = r3.mSurfaceCompleter
            androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException r1 = new androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException
            java.lang.String r2 = "Surface request will not complete."
            r1.<init>(r2)
            boolean r0 = r0.setException(r1)
            return r0
    }
}
