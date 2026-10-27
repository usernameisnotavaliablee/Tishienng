package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;
    public static final int PREVIEW = 1;
    private static final java.util.List<java.lang.Integer> SURFACE_PROCESSOR_TARGETS = null;
    public static final int VIDEO_CAPTURE = 2;

    @androidx.annotation.NonNull
    private final androidx.core.util.Consumer<java.lang.Throwable> mErrorListener;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.Nullable
    private final androidx.camera.core.ImageProcessor mImageProcessor;

    @androidx.annotation.Nullable
    private final androidx.camera.core.SurfaceProcessor mSurfaceProcessor;
    private final int mTargets;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Formats {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Targets {
    }

    static {
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            java.lang.Integer[] r7 = new java.lang.Integer[r7]
            r8 = 0
            r7[r8] = r1
            r7[r0] = r3
            r7[r2] = r5
            r7[r4] = r6
            java.util.List r0 = java.util.Arrays.asList(r7)
            androidx.camera.core.CameraEffect.SURFACE_PROCESSOR_TARGETS = r0
            return
    }

    protected CameraEffect(int r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.ImageProcessor r5, @androidx.annotation.NonNull androidx.core.util.Consumer<java.lang.Throwable> r6) {
            r2 = this;
            r2.<init>()
            r0 = 4
            if (r3 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "Currently ImageProcessor can only target IMAGE_CAPTURE."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            r2.mTargets = r3
            r2.mExecutor = r4
            r3 = 0
            r2.mSurfaceProcessor = r3
            r2.mImageProcessor = r5
            r2.mErrorListener = r6
            return
    }

    protected CameraEffect(int r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.SurfaceProcessor r4, @androidx.annotation.NonNull androidx.core.util.Consumer<java.lang.Throwable> r5) {
            r1 = this;
            r1.<init>()
            java.util.List<java.lang.Integer> r0 = androidx.camera.core.CameraEffect.SURFACE_PROCESSOR_TARGETS
            androidx.camera.core.processing.TargetUtils.checkSupportedTargets(r0, r2)
            r1.mTargets = r2
            r1.mExecutor = r3
            r1.mSurfaceProcessor = r4
            r2 = 0
            r1.mImageProcessor = r2
            r1.mErrorListener = r5
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.processing.SurfaceProcessorInternal createSurfaceProcessorInternal() {
            r1 = this;
            androidx.camera.core.processing.SurfaceProcessorWithExecutor r0 = new androidx.camera.core.processing.SurfaceProcessorWithExecutor
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.util.Consumer<java.lang.Throwable> getErrorListener() {
            r1 = this;
            androidx.core.util.Consumer<java.lang.Throwable> r0 = r1.mErrorListener
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.ImageProcessor getImageProcessor() {
            r1 = this;
            androidx.camera.core.ImageProcessor r0 = r1.mImageProcessor
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.SurfaceProcessor getSurfaceProcessor() {
            r1 = this;
            androidx.camera.core.SurfaceProcessor r0 = r1.mSurfaceProcessor
            return r0
    }

    public int getTargets() {
            r1 = this;
            int r0 = r1.mTargets
            return r0
    }
}
