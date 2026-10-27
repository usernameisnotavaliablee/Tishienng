package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SurfaceOutputImpl implements androidx.camera.core.SurfaceOutput {
    private static final java.lang.String TAG = "SurfaceOutputImpl";

    @androidx.annotation.NonNull
    private final float[] mAdditionalTransform;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.CameraInternal mCameraInternal;

    @androidx.annotation.NonNull
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCloseFuture;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mCloseFutureCompleter;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> mEventListener;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private java.util.concurrent.Executor mExecutor;
    private final int mFormat;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mHasPendingCloseRequest;
    private final android.graphics.Rect mInputCropRect;
    private final android.util.Size mInputSize;

    @androidx.annotation.NonNull
    private final float[] mInvertedTextureTransform;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mIsClosed;
    private final java.lang.Object mLock;
    private final boolean mMirroring;
    private final int mRotationDegrees;

    @androidx.annotation.NonNull
    private android.graphics.Matrix mSensorToBufferTransform;

    @androidx.annotation.NonNull
    private final android.util.Size mSize;

    @androidx.annotation.NonNull
    private final android.view.Surface mSurface;
    private final int mTargets;

    SurfaceOutputImpl(@androidx.annotation.NonNull android.view.Surface r3, int r4, int r5, @androidx.annotation.NonNull android.util.Size r6, @androidx.annotation.NonNull android.util.Size r7, @androidx.annotation.NonNull android.graphics.Rect r8, int r9, boolean r10, @androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal r11, @androidx.annotation.NonNull android.graphics.Matrix r12) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            r0 = 16
            float[] r1 = new float[r0]
            r2.mAdditionalTransform = r1
            float[] r0 = new float[r0]
            r2.mInvertedTextureTransform = r0
            r0 = 0
            r2.mHasPendingCloseRequest = r0
            r2.mIsClosed = r0
            r2.mSurface = r3
            r2.mTargets = r4
            r2.mFormat = r5
            r2.mSize = r6
            r2.mInputSize = r7
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r8)
            r2.mInputCropRect = r3
            r2.mMirroring = r10
            r2.mRotationDegrees = r9
            r2.mCameraInternal = r11
            r2.mSensorToBufferTransform = r12
            r2.calculateAdditionalTransform()
            androidx.camera.core.processing.b0 r3 = new androidx.camera.core.processing.b0
            r3.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r3)
            r2.mCloseFuture = r3
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.core.processing.SurfaceOutputImpl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.mCloseFutureCompleter = r1
            java.lang.String r0 = "SurfaceOutputImpl close future complete"
            return r0
    }

    public static /* synthetic */ void b(androidx.camera.core.processing.SurfaceOutputImpl r1, java.util.concurrent.atomic.AtomicReference r2) {
            r1.getClass()
            java.lang.Object r2 = r2.get()
            androidx.core.util.Consumer r2 = (androidx.core.util.Consumer) r2
            r0 = 0
            androidx.camera.core.SurfaceOutput$Event r1 = androidx.camera.core.SurfaceOutput.Event.of(r0, r1)
            r2.accept(r1)
            return
    }

    private void calculateAdditionalTransform() {
            r14 = this;
            float[] r0 = r14.mAdditionalTransform
            r1 = 0
            android.opengl.Matrix.setIdentityM(r0, r1)
            float[] r0 = r14.mAdditionalTransform
            r2 = 1056964608(0x3f000000, float:0.5)
            androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(r0, r2)
            float[] r0 = r14.mAdditionalTransform
            int r3 = r14.mRotationDegrees
            float r3 = (float) r3
            androidx.camera.core.impl.utils.MatrixExt.preRotate(r0, r3, r2, r2)
            boolean r0 = r14.mMirroring
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L28
            float[] r0 = r14.mAdditionalTransform
            android.opengl.Matrix.translateM(r0, r1, r3, r2, r2)
            float[] r0 = r14.mAdditionalTransform
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.opengl.Matrix.scaleM(r0, r1, r4, r3, r3)
        L28:
            android.util.Size r0 = r14.mInputSize
            int r4 = r14.mRotationDegrees
            android.util.Size r0 = androidx.camera.core.impl.utils.TransformUtils.rotateSize(r0, r4)
            android.util.Size r4 = r14.mInputSize
            android.graphics.RectF r4 = androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(r4)
            android.graphics.RectF r5 = androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(r0)
            int r6 = r14.mRotationDegrees
            boolean r7 = r14.mMirroring
            android.graphics.Matrix r4 = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(r4, r5, r6, r7)
            android.graphics.RectF r5 = new android.graphics.RectF
            android.graphics.Rect r6 = r14.mInputCropRect
            r5.<init>(r6)
            r4.mapRect(r5)
            float r4 = r5.left
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r4 = r4 / r6
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r7 = r5.height()
            float r6 = r6 - r7
            float r7 = r5.top
            float r6 = r6 - r7
            int r7 = r0.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            float r7 = r5.width()
            int r8 = r0.getWidth()
            float r8 = (float) r8
            float r7 = r7 / r8
            float r5 = r5.height()
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float[] r0 = r14.mAdditionalTransform
            android.opengl.Matrix.translateM(r0, r1, r4, r6, r2)
            float[] r0 = r14.mAdditionalTransform
            android.opengl.Matrix.scaleM(r0, r1, r7, r5, r3)
            r14.calculateInvertedTextureTransform()
            float[] r8 = r14.mAdditionalTransform
            float[] r10 = r14.mInvertedTextureTransform
            r11 = 0
            r13 = 0
            r9 = 0
            r12 = r8
            android.opengl.Matrix.multiplyMM(r8, r9, r10, r11, r12, r13)
            return
    }

    private void calculateInvertedTextureTransform() {
            r4 = this;
            float[] r0 = r4.mInvertedTextureTransform
            r1 = 0
            android.opengl.Matrix.setIdentityM(r0, r1)
            float[] r0 = r4.mInvertedTextureTransform
            r2 = 1056964608(0x3f000000, float:0.5)
            androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(r0, r2)
            androidx.camera.core.impl.CameraInternal r0 = r4.mCameraInternal
            if (r0 == 0) goto L41
            boolean r0 = r0.getHasTransform()
            java.lang.String r3 = "Camera has no transform."
            androidx.core.util.Preconditions.checkState(r0, r3)
            float[] r0 = r4.mInvertedTextureTransform
            androidx.camera.core.impl.CameraInternal r3 = r4.mCameraInternal
            androidx.camera.core.CameraInfo r3 = r3.getCameraInfo()
            int r3 = r3.getSensorRotationDegrees()
            float r3 = (float) r3
            androidx.camera.core.impl.utils.MatrixExt.preRotate(r0, r3, r2, r2)
            androidx.camera.core.impl.CameraInternal r0 = r4.mCameraInternal
            boolean r0 = r0.isFrontFacing()
            if (r0 == 0) goto L41
            float[] r0 = r4.mInvertedTextureTransform
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.opengl.Matrix.translateM(r0, r1, r2, r3, r3)
            float[] r0 = r4.mInvertedTextureTransform
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.opengl.Matrix.scaleM(r0, r1, r3, r2, r2)
        L41:
            float[] r0 = r4.mInvertedTextureTransform
            android.opengl.Matrix.invertM(r0, r1, r0, r1)
            return
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    @androidx.annotation.AnyThread
    public void close() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mIsClosed     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            r1 = 1
            r2.mIsClosed = r1     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L15
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCloseFutureCompleter
            r1 = 0
            r0.set(r1)
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.impl.CameraInternal getCamera() {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.mCameraInternal
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getCloseFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mCloseFuture
            return r0
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
            r1 = this;
            int r0 = r1.mFormat
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public android.graphics.Rect getInputCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mInputCropRect
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public android.util.Size getInputSize() {
            r1 = this;
            android.util.Size r0 = r1.mInputSize
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public boolean getMirroring() {
            r1 = this;
            boolean r0 = r1.mMirroring
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public int getRotationDegrees() {
            r1 = this;
            int r0 = r1.mRotationDegrees
            return r0
    }

    @Override // androidx.camera.core.SurfaceOutput
    @androidx.annotation.NonNull
    public android.graphics.Matrix getSensorToBufferTransform() {
            r2 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r1 = r2.mSensorToBufferTransform
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.core.SurfaceOutput
    @androidx.annotation.NonNull
    public android.util.Size getSize() {
            r1 = this;
            android.util.Size r0 = r1.mSize
            return r0
    }

    @Override // androidx.camera.core.SurfaceOutput
    @androidx.annotation.NonNull
    public android.view.Surface getSurface(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> r3) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mExecutor = r2     // Catch: java.lang.Throwable -> L12
            r1.mEventListener = r3     // Catch: java.lang.Throwable -> L12
            boolean r2 = r1.mHasPendingCloseRequest     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lf
            r1.requestClose()
        Lf:
            android.view.Surface r2 = r1.mSurface
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
            r1 = this;
            int r0 = r1.mTargets
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public boolean isClosed() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mIsClosed     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void requestClose() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.lang.Object r1 = r4.mLock
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = r4.mExecutor     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput$Event> r2 = r4.mEventListener     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L11
            goto L20
        L11:
            boolean r3 = r4.mIsClosed     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L23
            r0.set(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.Executor r2 = r4.mExecutor     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r4.mHasPendingCloseRequest = r3     // Catch: java.lang.Throwable -> L1e
            goto L24
        L1e:
            r0 = move-exception
            goto L39
        L20:
            r2 = 1
            r4.mHasPendingCloseRequest = r2     // Catch: java.lang.Throwable -> L1e
        L23:
            r2 = 0
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L38
            androidx.camera.core.processing.c0 r1 = new androidx.camera.core.processing.c0     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            r1.<init>(r4, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            r2.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L30
            return
        L30:
            r0 = move-exception
            java.lang.String r1 = "SurfaceOutputImpl"
            java.lang.String r2 = "Processor executor closed. Close request not posted."
            androidx.camera.core.Logger.d(r1, r2, r0)
        L38:
            return
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    @Override // androidx.camera.core.SurfaceOutput
    @androidx.annotation.AnyThread
    public void updateTransformMatrix(@androidx.annotation.NonNull float[] r7, @androidx.annotation.NonNull float[] r8) {
            r6 = this;
            float[] r4 = r6.mAdditionalTransform
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r7
            r2 = r8
            android.opengl.Matrix.multiplyMM(r0, r1, r2, r3, r4, r5)
            return
    }
}
