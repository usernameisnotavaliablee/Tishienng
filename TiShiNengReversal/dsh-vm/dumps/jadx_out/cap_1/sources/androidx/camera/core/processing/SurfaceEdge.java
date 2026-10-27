package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceEdge {

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceOutputImpl mConsumerToNotify;
    private final android.graphics.Rect mCropRect;
    private final int mFormat;
    private final boolean mHasCameraTransform;
    private boolean mHasConsumer;
    private boolean mIsClosed;
    private final boolean mMirroring;

    @androidx.annotation.NonNull
    private final java.util.Set<java.lang.Runnable> mOnInvalidatedListeners;

    @androidx.annotation.Nullable
    private androidx.camera.core.SurfaceRequest mProviderSurfaceRequest;
    private int mRotationDegrees;
    private final android.graphics.Matrix mSensorToBufferTransform;

    @androidx.annotation.NonNull
    private androidx.camera.core.processing.SurfaceEdge.SettableSurface mSettableSurface;
    private final androidx.camera.core.impl.StreamSpec mStreamSpec;
    private int mTargetRotation;
    private final int mTargets;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SettableSurface extends androidx.camera.core.impl.DeferrableSurface {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<android.view.Surface> mCompleter;
        private androidx.camera.core.impl.DeferrableSurface mProvider;
        final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> mSurfaceFuture;

        SettableSurface(@androidx.annotation.NonNull android.util.Size r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                androidx.camera.core.processing.a0 r1 = new androidx.camera.core.processing.a0
                r1.<init>(r0)
                com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
                r0.mSurfaceFuture = r1
                return
        }

        public static /* synthetic */ java.lang.Object d(androidx.camera.core.processing.SurfaceEdge.SettableSurface r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
                r1.mCompleter = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "SettableFuture hashCode: "
                r2.append(r0)
                int r1 = r1.hashCode()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                return r1
        }

        @androidx.annotation.MainThread
        boolean canSetProvider() {
                r1 = this;
                androidx.camera.core.impl.utils.Threads.checkMainThread()
                androidx.camera.core.impl.DeferrableSurface r0 = r1.mProvider
                if (r0 != 0) goto Lf
                boolean r0 = r1.isClosed()
                if (r0 != 0) goto Lf
                r0 = 1
                return r0
            Lf:
                r0 = 0
                return r0
        }

        @androidx.annotation.VisibleForTesting
        boolean hasProvider() {
                r1 = this;
                androidx.camera.core.impl.DeferrableSurface r0 = r1.mProvider
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @androidx.annotation.NonNull
        protected com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r0 = r1.mSurfaceFuture
                return r0
        }

        @androidx.annotation.MainThread
        public boolean setProvider(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r5, @androidx.annotation.NonNull java.lang.Runnable r6) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
                r4 = this;
                androidx.camera.core.impl.utils.Threads.checkMainThread()
                androidx.core.util.Preconditions.checkNotNull(r5)
                androidx.camera.core.impl.DeferrableSurface r0 = r4.mProvider
                r1 = 0
                if (r0 != r5) goto Lc
                return r1
            Lc:
                r2 = 1
                if (r0 != 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                java.lang.String r3 = "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider"
                androidx.core.util.Preconditions.checkState(r0, r3)
                android.util.Size r0 = r4.getPrescribedSize()
                android.util.Size r3 = r5.getPrescribedSize()
                boolean r0 = r0.equals(r3)
                java.lang.String r3 = "The provider's size must match the parent"
                androidx.core.util.Preconditions.checkArgument(r0, r3)
                int r0 = r4.getPrescribedStreamFormat()
                int r3 = r5.getPrescribedStreamFormat()
                if (r0 != r3) goto L33
                r1 = 1
            L33:
                java.lang.String r0 = "The provider's format must match the parent"
                androidx.core.util.Preconditions.checkArgument(r1, r0)
                boolean r0 = r4.isClosed()
                r0 = r0 ^ r2
                java.lang.String r1 = "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider."
                androidx.core.util.Preconditions.checkState(r0, r1)
                r4.mProvider = r5
                com.google.common.util.concurrent.ListenableFuture r0 = r5.getSurface()
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer<android.view.Surface> r1 = r4.mCompleter
                androidx.camera.core.impl.utils.futures.Futures.propagate(r0, r1)
                r5.incrementUseCount()
                com.google.common.util.concurrent.ListenableFuture r0 = r4.getTerminationFuture()
                androidx.camera.core.processing.z r1 = new androidx.camera.core.processing.z
                r1.<init>(r5)
                java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
                r0.addListener(r1, r3)
                com.google.common.util.concurrent.ListenableFuture r5 = r5.getCloseFuture()
                java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
                r5.addListener(r6, r0)
                return r2
        }
    }

    public SurfaceEdge(int r3, int r4, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r5, @androidx.annotation.NonNull android.graphics.Matrix r6, boolean r7, @androidx.annotation.NonNull android.graphics.Rect r8, int r9, int r10, boolean r11) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mHasConsumer = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.mOnInvalidatedListeners = r1
            r2.mIsClosed = r0
            r2.mTargets = r3
            r2.mFormat = r4
            r2.mStreamSpec = r5
            r2.mSensorToBufferTransform = r6
            r2.mHasCameraTransform = r7
            r2.mCropRect = r8
            r2.mRotationDegrees = r9
            r2.mTargetRotation = r10
            r2.mMirroring = r11
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r3 = new androidx.camera.core.processing.SurfaceEdge$SettableSurface
            android.util.Size r5 = r5.getResolution()
            r3.<init>(r5, r4)
            r2.mSettableSurface = r3
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture a(androidx.camera.core.processing.SurfaceEdge r11, androidx.camera.core.processing.SurfaceEdge.SettableSurface r12, int r13, android.util.Size r14, android.graphics.Rect r15, int r16, boolean r17, androidx.camera.core.impl.CameraInternal r18, android.view.Surface r19) {
            r11.getClass()
            androidx.core.util.Preconditions.checkNotNull(r19)
            r12.incrementUseCount()     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L3c
            androidx.camera.core.processing.SurfaceOutputImpl r0 = new androidx.camera.core.processing.SurfaceOutputImpl
            int r2 = r11.getTargets()
            androidx.camera.core.impl.StreamSpec r1 = r11.mStreamSpec
            android.util.Size r4 = r1.getResolution()
            android.graphics.Matrix r10 = r11.mSensorToBufferTransform
            r3 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.google.common.util.concurrent.ListenableFuture r13 = r0.getCloseFuture()
            androidx.camera.core.processing.y r14 = new androidx.camera.core.processing.y
            r14.<init>(r12)
            java.util.concurrent.Executor r12 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r13.addListener(r14, r12)
            r11.mConsumerToNotify = r0
            com.google.common.util.concurrent.ListenableFuture r11 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r11
        L3c:
            r0 = move-exception
            r11 = r0
            com.google.common.util.concurrent.ListenableFuture r11 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r11)
            return r11
    }

    public static /* synthetic */ void b(androidx.camera.core.processing.SurfaceEdge r2) {
            r2.getClass()
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.processing.w r1 = new androidx.camera.core.processing.w
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.processing.SurfaceEdge r1) {
            boolean r0 = r1.mIsClosed
            if (r0 != 0) goto L7
            r1.invalidate()
        L7:
            return
    }

    private void checkAndSetHasConsumer() {
            r3 = this;
            boolean r0 = r3.mHasConsumer
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Consumer can only be linked once."
            androidx.core.util.Preconditions.checkState(r0, r2)
            r3.mHasConsumer = r1
            return
    }

    private void checkNotClosed() {
            r2 = this;
            boolean r0 = r2.mIsClosed
            r0 = r0 ^ 1
            java.lang.String r1 = "Edge is already closed."
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    public static /* synthetic */ void d(androidx.camera.core.processing.SurfaceEdge r2, int r3, int r4) {
            int r0 = r2.mRotationDegrees
            r1 = 1
            if (r0 == r3) goto L9
            r2.mRotationDegrees = r3
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            int r0 = r2.mTargetRotation
            if (r0 == r4) goto L11
            r2.mTargetRotation = r4
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 == 0) goto L17
            r2.notifyTransformationInfoUpdate()
        L17:
            return
    }

    private void disconnectWithoutCheckingClosed() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r1.mSettableSurface
            r0.close()
            androidx.camera.core.processing.SurfaceOutputImpl r0 = r1.mConsumerToNotify
            if (r0 == 0) goto L12
            r0.requestClose()
            r0 = 0
            r1.mConsumerToNotify = r0
        L12:
            return
    }

    public static /* synthetic */ void e(androidx.camera.core.processing.SurfaceEdge r0) {
            r0.disconnectWithoutCheckingClosed()
            return
    }

    @androidx.annotation.MainThread
    private void notifyTransformationInfoUpdate() {
            r7 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.SurfaceRequest r0 = r7.mProviderSurfaceRequest
            if (r0 == 0) goto L1c
            android.graphics.Rect r1 = r7.mCropRect
            int r2 = r7.mRotationDegrees
            int r3 = r7.mTargetRotation
            boolean r4 = r7.hasCameraTransform()
            android.graphics.Matrix r5 = r7.mSensorToBufferTransform
            boolean r6 = r7.mMirroring
            androidx.camera.core.SurfaceRequest$TransformationInfo r1 = androidx.camera.core.SurfaceRequest.TransformationInfo.of(r1, r2, r3, r4, r5, r6)
            r0.updateTransformationInfo(r1)
        L1c:
            return
    }

    @androidx.annotation.MainThread
    public void addOnInvalidatedListener(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r1.checkNotClosed()
            java.util.Set<java.lang.Runnable> r0 = r1.mOnInvalidatedListeners
            r0.add(r2)
            return
    }

    @androidx.annotation.MainThread
    public final void close() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r1.disconnectWithoutCheckingClosed()
            r0 = 1
            r1.mIsClosed = r0
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceOutput> createSurfaceOutputFuture(@androidx.annotation.NonNull android.util.Size r11, int r12, @androidx.annotation.NonNull android.graphics.Rect r13, int r14, boolean r15, @androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal r16) {
            r10 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r10.checkNotClosed()
            r10.checkAndSetHasConsumer()
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r2 = r10.mSettableSurface
            com.google.common.util.concurrent.ListenableFuture r9 = r2.getSurface()
            androidx.camera.core.processing.x r0 = new androidx.camera.core.processing.x
            r1 = r10
            r4 = r11
            r3 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.ScheduledExecutorService r11 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            com.google.common.util.concurrent.ListenableFuture r11 = androidx.camera.core.impl.utils.futures.Futures.transformAsync(r9, r0, r11)
            return r11
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.core.SurfaceRequest createSurfaceRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r8) {
            r7 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r7.checkNotClosed()
            androidx.camera.core.SurfaceRequest r1 = new androidx.camera.core.SurfaceRequest
            androidx.camera.core.impl.StreamSpec r0 = r7.mStreamSpec
            android.util.Size r2 = r0.getResolution()
            androidx.camera.core.impl.StreamSpec r0 = r7.mStreamSpec
            androidx.camera.core.DynamicRange r4 = r0.getDynamicRange()
            androidx.camera.core.impl.StreamSpec r0 = r7.mStreamSpec
            android.util.Range r5 = r0.getExpectedFrameRateRange()
            androidx.camera.core.processing.s r6 = new androidx.camera.core.processing.s
            r6.<init>(r7)
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.camera.core.impl.DeferrableSurface r8 = r1.getDeferrableSurface()     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r7.mSettableSurface     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            androidx.camera.core.processing.t r2 = new androidx.camera.core.processing.t     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            r2.<init>(r7)     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            boolean r0 = r0.setProvider(r8, r2)     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            if (r0 == 0) goto L50
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r7.mSettableSurface     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getTerminationFuture()     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            androidx.camera.core.processing.u r2 = new androidx.camera.core.processing.u     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            r2.<init>(r8)     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            java.util.concurrent.Executor r8 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            r0.addListener(r2, r8)     // Catch: java.lang.RuntimeException -> L4a androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L4d
            goto L50
        L4a:
            r0 = move-exception
            r8 = r0
            goto L56
        L4d:
            r0 = move-exception
            r8 = r0
            goto L5a
        L50:
            r7.mProviderSurfaceRequest = r1
            r7.notifyTransformationInfoUpdate()
            return r1
        L56:
            r1.willNotProvideSurface()
            throw r8
        L5a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Surface is somehow already closed"
            r0.<init>(r1, r8)
            throw r0
    }

    @androidx.annotation.MainThread
    public final void disconnect() {
            r0 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0.checkNotClosed()
            r0.disconnectWithoutCheckingClosed()
            return
    }

    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mCropRect
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r1.checkNotClosed()
            r1.checkAndSetHasConsumer()
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r1.mSettableSurface
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurfaceForTesting() {
            r1 = this;
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r1.mSettableSurface
            return r0
    }

    public int getFormat() {
            r1 = this;
            int r0 = r1.mFormat
            return r0
    }

    public boolean getMirroring() {
            r1 = this;
            boolean r0 = r1.mMirroring
            return r0
    }

    public int getRotationDegrees() {
            r1 = this;
            int r0 = r1.mRotationDegrees
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.Matrix getSensorToBufferTransform() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mSensorToBufferTransform
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.StreamSpec getStreamSpec() {
            r1 = this;
            androidx.camera.core.impl.StreamSpec r0 = r1.mStreamSpec
            return r0
    }

    public int getTargets() {
            r1 = this;
            int r0 = r1.mTargets
            return r0
    }

    public boolean hasCameraTransform() {
            r1 = this;
            boolean r0 = r1.mHasCameraTransform
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public boolean hasProvider() {
            r1 = this;
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r1.mSettableSurface
            boolean r0 = r0.hasProvider()
            return r0
    }

    @androidx.annotation.MainThread
    public void invalidate() {
            r3 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r3.checkNotClosed()
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r3.mSettableSurface
            boolean r0 = r0.canSetProvider()
            if (r0 == 0) goto Lf
            goto L3a
        Lf:
            r3.disconnectWithoutCheckingClosed()
            r0 = 0
            r3.mHasConsumer = r0
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = new androidx.camera.core.processing.SurfaceEdge$SettableSurface
            androidx.camera.core.impl.StreamSpec r1 = r3.mStreamSpec
            android.util.Size r1 = r1.getResolution()
            int r2 = r3.mFormat
            r0.<init>(r1, r2)
            r3.mSettableSurface = r0
            java.util.Set<java.lang.Runnable> r0 = r3.mOnInvalidatedListeners
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L2a
        L3a:
            return
    }

    @androidx.annotation.VisibleForTesting
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.mIsClosed
            return r0
    }

    @androidx.annotation.MainThread
    public void setProvider(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r3) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r2.checkNotClosed()
            androidx.camera.core.processing.SurfaceEdge$SettableSurface r0 = r2.mSettableSurface
            androidx.camera.core.processing.t r1 = new androidx.camera.core.processing.t
            r1.<init>(r2)
            r0.setProvider(r3, r1)
            return
    }

    public void updateTransformation(int r2) {
            r1 = this;
            r0 = -1
            r1.updateTransformation(r2, r0)
            return
    }

    public void updateTransformation(int r2, int r3) {
            r1 = this;
            androidx.camera.core.processing.v r0 = new androidx.camera.core.processing.v
            r0.<init>(r1, r2, r3)
            androidx.camera.core.impl.utils.Threads.runOnMain(r0)
            return
    }
}
