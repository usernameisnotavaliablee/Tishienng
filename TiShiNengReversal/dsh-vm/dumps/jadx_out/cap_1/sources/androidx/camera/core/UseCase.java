package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class UseCase {

    @androidx.annotation.NonNull
    private androidx.camera.core.impl.SessionConfig mAttachedSessionConfig;
    private androidx.camera.core.impl.StreamSpec mAttachedStreamSpec;

    @androidx.annotation.GuardedBy("mCameraLock")
    private androidx.camera.core.impl.CameraInternal mCamera;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.UseCaseConfig<?> mCameraConfig;
    private final java.lang.Object mCameraLock;

    @androidx.annotation.NonNull
    private androidx.camera.core.impl.UseCaseConfig<?> mCurrentConfig;

    @androidx.annotation.Nullable
    private androidx.camera.core.CameraEffect mEffect;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.UseCaseConfig<?> mExtendedConfig;

    @androidx.annotation.NonNull
    private android.graphics.Matrix mSensorToBufferTransformMatrix;
    private androidx.camera.core.UseCase.State mState;
    private final java.util.Set<androidx.camera.core.UseCase.StateChangeCallback> mStateChangeCallbacks;

    @androidx.annotation.NonNull
    private androidx.camera.core.impl.UseCaseConfig<?> mUseCaseConfig;

    @androidx.annotation.Nullable
    private android.graphics.Rect mViewPortCropRect;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.UseCase$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$UseCase$State = null;

        static {
                androidx.camera.core.UseCase$State[] r0 = androidx.camera.core.UseCase.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.core.UseCase.AnonymousClass1.$SwitchMap$androidx$camera$core$UseCase$State = r0
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.INACTIVE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.core.UseCase.AnonymousClass1.$SwitchMap$androidx$camera$core$UseCase$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.ACTIVE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface EventCallback {
        void onBind(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1);

        void onUnbind();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<androidx.camera.core.UseCase.State> {
        private static final /* synthetic */ androidx.camera.core.UseCase.State[] $VALUES = null;
        public static final androidx.camera.core.UseCase.State ACTIVE = null;
        public static final androidx.camera.core.UseCase.State INACTIVE = null;

        private static /* synthetic */ androidx.camera.core.UseCase.State[] $values() {
                r0 = 2
                androidx.camera.core.UseCase$State[] r0 = new androidx.camera.core.UseCase.State[r0]
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.ACTIVE
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.INACTIVE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.UseCase$State r0 = new androidx.camera.core.UseCase$State
                java.lang.String r1 = "ACTIVE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.UseCase.State.ACTIVE = r0
                androidx.camera.core.UseCase$State r0 = new androidx.camera.core.UseCase$State
                java.lang.String r1 = "INACTIVE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.UseCase.State.INACTIVE = r0
                androidx.camera.core.UseCase$State[] r0 = $values()
                androidx.camera.core.UseCase.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.UseCase.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.UseCase$State> r0 = androidx.camera.core.UseCase.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.UseCase$State r1 = (androidx.camera.core.UseCase.State) r1
                return r1
        }

        public static androidx.camera.core.UseCase.State[] values() {
                androidx.camera.core.UseCase$State[] r0 = androidx.camera.core.UseCase.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.UseCase$State[] r0 = (androidx.camera.core.UseCase.State[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface StateChangeCallback {
        void onUseCaseActive(@androidx.annotation.NonNull androidx.camera.core.UseCase r1);

        void onUseCaseInactive(@androidx.annotation.NonNull androidx.camera.core.UseCase r1);

        void onUseCaseReset(@androidx.annotation.NonNull androidx.camera.core.UseCase r1);

        void onUseCaseUpdated(@androidx.annotation.NonNull androidx.camera.core.UseCase r1);
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected UseCase(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mStateChangeCallbacks = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mCameraLock = r0
            androidx.camera.core.UseCase$State r0 = androidx.camera.core.UseCase.State.INACTIVE
            r1.mState = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mSensorToBufferTransformMatrix = r0
            androidx.camera.core.impl.SessionConfig r0 = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig()
            r1.mAttachedSessionConfig = r0
            r1.mUseCaseConfig = r2
            r1.mCurrentConfig = r2
            return
    }

    private void addStateChangeCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.StateChangeCallback r2) {
            r1 = this;
            java.util.Set<androidx.camera.core.UseCase$StateChangeCallback> r0 = r1.mStateChangeCallbacks
            r0.add(r2)
            return
    }

    private void removeStateChangeCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.StateChangeCallback r2) {
            r1 = this;
            java.util.Set<androidx.camera.core.UseCase$StateChangeCallback> r0 = r1.mStateChangeCallbacks
            r0.remove(r2)
            return
    }

    public static int snapToSurfaceRotation(@androidx.annotation.IntRange(from = 0, to = 359) int r3) {
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r1 = "orientation"
            r2 = 0
            androidx.core.util.Preconditions.checkArgumentInRange(r3, r2, r0, r1)
            r0 = 315(0x13b, float:4.41E-43)
            if (r3 >= r0) goto L1f
            r0 = 45
            if (r3 >= r0) goto L11
            goto L1f
        L11:
            r0 = 225(0xe1, float:3.15E-43)
            if (r3 < r0) goto L17
            r3 = 1
            return r3
        L17:
            r0 = 135(0x87, float:1.89E-43)
            if (r3 < r0) goto L1d
            r3 = 2
            return r3
        L1d:
            r3 = 3
            return r3
        L1f:
            return r2
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void bindToCamera(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r2, @androidx.annotation.Nullable androidx.camera.core.impl.UseCaseConfig<?> r3, @androidx.annotation.Nullable androidx.camera.core.impl.UseCaseConfig<?> r4) {
            r1 = this;
            java.lang.Object r0 = r1.mCameraLock
            monitor-enter(r0)
            r1.mCamera = r2     // Catch: java.lang.Throwable -> L2d
            r1.addStateChangeCallback(r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            r1.mExtendedConfig = r3
            r1.mCameraConfig = r4
            androidx.camera.core.impl.CameraInfoInternal r3 = r2.getCameraInfoInternal()
            androidx.camera.core.impl.UseCaseConfig<?> r4 = r1.mExtendedConfig
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r1.mCameraConfig
            androidx.camera.core.impl.UseCaseConfig r3 = r1.mergeConfigs(r3, r4, r0)
            r1.mCurrentConfig = r3
            r4 = 0
            androidx.camera.core.UseCase$EventCallback r3 = r3.getUseCaseEventCallback(r4)
            if (r3 == 0) goto L29
            androidx.camera.core.impl.CameraInfoInternal r2 = r2.getCameraInfoInternal()
            r3.onBind(r2)
        L29:
            r1.onBind()
            return
        L2d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.UseCaseConfig<?> getAppConfig() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r1.mUseCaseConfig
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getAppTargetRotation() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r2.mCurrentConfig
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = -1
            int r0 = r0.getAppTargetRotation(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.StreamSpec getAttachedStreamSpec() {
            r1 = this;
            androidx.camera.core.impl.StreamSpec r0 = r1.mAttachedStreamSpec
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.util.Size getAttachedSurfaceResolution() {
            r1 = this;
            androidx.camera.core.impl.StreamSpec r0 = r1.mAttachedStreamSpec
            if (r0 == 0) goto L9
            android.util.Size r0 = r0.getResolution()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraInternal getCamera() {
            r2 = this;
            java.lang.Object r0 = r2.mCameraLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraInternal r1 = r2.mCamera     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.CameraControlInternal getCameraControl() {
            r2 = this;
            java.lang.Object r0 = r2.mCameraLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraInternal r1 = r2.mCamera     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            androidx.camera.core.impl.CameraControlInternal r1 = androidx.camera.core.impl.CameraControlInternal.DEFAULT_EMPTY_INSTANCE     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L13
        Ld:
            androidx.camera.core.impl.CameraControlInternal r1 = r1.getCameraControlInternal()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected java.lang.String getCameraId() {
            r3 = this;
            androidx.camera.core.impl.CameraInternal r0 = r3.getCamera()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No camera attached to use case: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.core.impl.CameraInternal r0 = (androidx.camera.core.impl.CameraInternal) r0
            androidx.camera.core.impl.CameraInfoInternal r0 = r0.getCameraInfoInternal()
            java.lang.String r0 = r0.getCameraId()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig<?> getCurrentConfig() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r1.mCurrentConfig
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean r1, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r2);

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.CameraEffect getEffect() {
            r1 = this;
            androidx.camera.core.CameraEffect r0 = r1.mEffect
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getImageFormat() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r1.mCurrentConfig
            int r0 = r0.getInputFormat()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getMirrorModeInternal() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r2.mCurrentConfig
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = 0
            int r0 = r0.getMirrorMode(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.String getName() {
            r3 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r3.mCurrentConfig
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "<UnknownUseCase-"
            r1.append(r2)
            int r2 = r3.hashCode()
            r1.append(r2)
            java.lang.String r2 = ">"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.getTargetName(r1)
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @androidx.annotation.IntRange(from = 0, to = 359)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getRelativeRotation(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.getRelativeRotation(r2, r0)
            return r2
    }

    @androidx.annotation.IntRange(from = 0, to = 359)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getRelativeRotation(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r3, boolean r4) {
            r2 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r3.getCameraInfoInternal()
            int r1 = r2.getTargetRotationInternal()
            int r0 = r0.getSensorRotationDegrees(r1)
            boolean r3 = r3.getHasTransform()
            if (r3 != 0) goto L1a
            if (r4 == 0) goto L1a
            int r3 = -r0
            int r3 = androidx.camera.core.impl.utils.TransformUtils.within360(r3)
            return r3
        L1a:
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
            r6 = this;
            androidx.camera.core.impl.CameraInternal r0 = r6.getCamera()
            android.util.Size r1 = r6.getAttachedSurfaceResolution()
            if (r0 == 0) goto L2b
            if (r1 != 0) goto Ld
            goto L2b
        Ld:
            android.graphics.Rect r2 = r6.getViewPortCropRect()
            if (r2 != 0) goto L21
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            r5 = 0
            r2.<init>(r5, r5, r3, r4)
        L21:
            int r0 = r6.getRelativeRotation(r0)
            androidx.camera.core.ResolutionInfo r3 = new androidx.camera.core.ResolutionInfo
            r3.<init>(r1, r2, r0)
            return r3
        L2b:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mSensorToBufferTransformMatrix
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r1 = this;
            androidx.camera.core.impl.SessionConfig r0 = r1.mAttachedSessionConfig
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected android.util.Range<java.lang.Integer> getTargetFrameRateInternal() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r2.mCurrentConfig
            android.util.Range<java.lang.Integer> r1 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            android.util.Range r0 = r0.getTargetFrameRate(r1)
            return r0
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getTargetRotationInternal() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r2.mCurrentConfig
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = 0
            int r0 = r0.getTargetRotation(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1);

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.graphics.Rect getViewPortCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mViewPortCropRect
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean isCurrentCamera(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.getCamera()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = r1.getCameraId()
            boolean r2 = java.util.Objects.equals(r2, r0)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isEffectTargetsSupported(int r3) {
            r2 = this;
            java.util.Set r0 = r2.getSupportedEffectTargets()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = androidx.camera.core.processing.TargetUtils.isSuperset(r3, r1)
            if (r1 == 0) goto L8
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isMirroringRequired(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r4) {
            r3 = this;
            int r0 = r3.getMirrorModeInternal()
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 != r1) goto L11
            boolean r4 = r4.isFrontFacing()
            return r4
        L11:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown mirrorMode: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L28:
            return r1
        L29:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r5, @androidx.annotation.Nullable androidx.camera.core.impl.UseCaseConfig<?> r6, @androidx.annotation.Nullable androidx.camera.core.impl.UseCaseConfig<?> r7) {
            r4 = this;
            if (r7 == 0) goto Lc
            androidx.camera.core.impl.MutableOptionsBundle r7 = androidx.camera.core.impl.MutableOptionsBundle.from(r7)
            androidx.camera.core.impl.Config$Option<java.lang.String> r0 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
            r7.removeOption(r0)
            goto L10
        Lc:
            androidx.camera.core.impl.MutableOptionsBundle r7 = androidx.camera.core.impl.MutableOptionsBundle.create()
        L10:
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r4.mUseCaseConfig
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO
            boolean r0 = r0.containsOption(r1)
            if (r0 != 0) goto L24
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r4.mUseCaseConfig
            androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
            boolean r0 = r0.containsOption(r1)
            if (r0 == 0) goto L2f
        L24:
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            boolean r1 = r7.containsOption(r0)
            if (r1 == 0) goto L2f
            r7.removeOption(r0)
        L2f:
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r4.mUseCaseConfig
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            boolean r0 = r0.containsOption(r1)
            if (r0 == 0) goto L52
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
            boolean r2 = r7.containsOption(r0)
            if (r2 == 0) goto L52
            androidx.camera.core.impl.UseCaseConfig<?> r2 = r4.mUseCaseConfig
            java.lang.Object r1 = r2.retrieveOption(r1)
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = (androidx.camera.core.resolutionselector.ResolutionSelector) r1
            androidx.camera.core.resolutionselector.ResolutionStrategy r1 = r1.getResolutionStrategy()
            if (r1 == 0) goto L52
            r7.removeOption(r0)
        L52:
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r4.mUseCaseConfig
            java.util.Set r0 = r0.listOptions()
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
            androidx.camera.core.impl.UseCaseConfig<?> r2 = r4.mUseCaseConfig
            androidx.camera.core.impl.o.c(r7, r7, r2, r1)
            goto L5c
        L6e:
            if (r6 == 0) goto L99
            java.util.Set r0 = r6.listOptions()
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
            java.lang.String r2 = r1.getId()
            androidx.camera.core.impl.Config$Option<java.lang.String> r3 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
            java.lang.String r3 = r3.getId()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            goto L78
        L95:
            androidx.camera.core.impl.o.c(r7, r7, r6, r1)
            goto L78
        L99:
            androidx.camera.core.impl.Config$Option<android.util.Size> r6 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
            boolean r6 = r7.containsOption(r6)
            if (r6 == 0) goto Lac
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r6 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO
            boolean r0 = r7.containsOption(r6)
            if (r0 == 0) goto Lac
            r7.removeOption(r6)
        Lac:
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r6 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            boolean r0 = r7.containsOption(r6)
            if (r0 == 0) goto Lc7
            java.lang.Object r6 = r7.retrieveOption(r6)
            androidx.camera.core.resolutionselector.ResolutionSelector r6 = (androidx.camera.core.resolutionselector.ResolutionSelector) r6
            int r6 = r6.getAllowedResolutionMode()
            if (r6 == 0) goto Lc7
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r6 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.insertOption(r6, r0)
        Lc7:
            androidx.camera.core.impl.UseCaseConfig$Builder r6 = r4.getUseCaseConfigBuilder(r7)
            androidx.camera.core.impl.UseCaseConfig r5 = r4.onMergeConfig(r5, r6)
            return r5
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected final void notifyActive() {
            r1 = this;
            androidx.camera.core.UseCase$State r0 = androidx.camera.core.UseCase.State.ACTIVE
            r1.mState = r0
            r1.notifyState()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected final void notifyInactive() {
            r1 = this;
            androidx.camera.core.UseCase$State r0 = androidx.camera.core.UseCase.State.INACTIVE
            r1.mState = r0
            r1.notifyState()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected final void notifyReset() {
            r2 = this;
            java.util.Set<androidx.camera.core.UseCase$StateChangeCallback> r0 = r2.mStateChangeCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase$StateChangeCallback r1 = (androidx.camera.core.UseCase.StateChangeCallback) r1
            r1.onUseCaseReset(r2)
            goto L6
        L16:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void notifyState() {
            r2 = this;
            int[] r0 = androidx.camera.core.UseCase.AnonymousClass1.$SwitchMap$androidx$camera$core$UseCase$State
            androidx.camera.core.UseCase$State r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L27
            r1 = 2
            if (r0 == r1) goto L11
            goto L3d
        L11:
            java.util.Set<androidx.camera.core.UseCase$StateChangeCallback> r0 = r2.mStateChangeCallbacks
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase$StateChangeCallback r1 = (androidx.camera.core.UseCase.StateChangeCallback) r1
            r1.onUseCaseActive(r2)
            goto L17
        L27:
            java.util.Set<androidx.camera.core.UseCase$StateChangeCallback> r0 = r2.mStateChangeCallbacks
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase$StateChangeCallback r1 = (androidx.camera.core.UseCase.StateChangeCallback) r1
            r1.onUseCaseInactive(r2)
            goto L2d
        L3d:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected final void notifyUpdated() {
            r2 = this;
            java.util.Set<androidx.camera.core.UseCase$StateChangeCallback> r0 = r2.mStateChangeCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase$StateChangeCallback r1 = (androidx.camera.core.UseCase.StateChangeCallback) r1
            r1.onUseCaseUpdated(r2)
            goto L6
        L16:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onBind() {
            r0 = this;
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onCameraControlReady() {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r1, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r2) {
            r0 = this;
            androidx.camera.core.impl.UseCaseConfig r1 = r2.getUseCaseConfig()
            return r1
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateAttached() {
            r0 = this;
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateDetached() {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
            r1 = this;
            androidx.camera.core.impl.StreamSpec r0 = r1.mAttachedStreamSpec
            if (r0 == 0) goto L11
            androidx.camera.core.impl.StreamSpec$Builder r0 = r0.toBuilder()
            androidx.camera.core.impl.StreamSpec$Builder r2 = r0.setImplementationOptions(r2)
            androidx.camera.core.impl.StreamSpec r2 = r2.build()
            return r2
        L11:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Attempt to update the implementation options for a use case without attached stream specifications."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r1) {
            r0 = this;
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
            r0 = this;
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setEffect(@androidx.annotation.Nullable androidx.camera.core.CameraEffect r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            int r0 = r2.getTargets()
            boolean r0 = r1.isEffectTargetsSupported(r0)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            androidx.core.util.Preconditions.checkArgument(r0)
            r1.mEffect = r2
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSensorToBufferTransformMatrix(@androidx.annotation.NonNull android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r2)
            r1.mSensorToBufferTransformMatrix = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean setTargetRotationInternal(int r3) {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = -1
            int r0 = r0.getTargetRotation(r1)
            if (r0 == r1) goto L12
            if (r0 == r3) goto L10
            goto L12
        L10:
            r3 = 0
            return r3
        L12:
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r2.mUseCaseConfig
            androidx.camera.core.impl.UseCaseConfig$Builder r0 = r2.getUseCaseConfigBuilder(r0)
            androidx.camera.core.internal.utils.UseCaseConfigUtil.updateTargetRotationAndRelatedConfigs(r0, r3)
            androidx.camera.core.impl.UseCaseConfig r3 = r0.getUseCaseConfig()
            r2.mUseCaseConfig = r3
            androidx.camera.core.impl.CameraInternal r3 = r2.getCamera()
            if (r3 != 0) goto L2c
            androidx.camera.core.impl.UseCaseConfig<?> r3 = r2.mUseCaseConfig
            r2.mCurrentConfig = r3
            goto L3a
        L2c:
            androidx.camera.core.impl.CameraInfoInternal r3 = r3.getCameraInfoInternal()
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r2.mExtendedConfig
            androidx.camera.core.impl.UseCaseConfig<?> r1 = r2.mCameraConfig
            androidx.camera.core.impl.UseCaseConfig r3 = r2.mergeConfigs(r3, r0, r1)
            r2.mCurrentConfig = r3
        L3a:
            r3 = 1
            return r3
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r0 = this;
            r0.mViewPortCropRect = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final void unbindFromCamera(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r4) {
            r3 = this;
            r3.onUnbind()
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r3.mCurrentConfig
            r1 = 0
            androidx.camera.core.UseCase$EventCallback r0 = r0.getUseCaseEventCallback(r1)
            if (r0 == 0) goto Lf
            r0.onUnbind()
        Lf:
            java.lang.Object r0 = r3.mCameraLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraInternal r2 = r3.mCamera     // Catch: java.lang.Throwable -> L31
            if (r4 != r2) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            androidx.core.util.Preconditions.checkArgument(r4)     // Catch: java.lang.Throwable -> L31
            androidx.camera.core.impl.CameraInternal r4 = r3.mCamera     // Catch: java.lang.Throwable -> L31
            r3.removeStateChangeCallback(r4)     // Catch: java.lang.Throwable -> L31
            r3.mCamera = r1     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            r3.mAttachedStreamSpec = r1
            r3.mViewPortCropRect = r1
            androidx.camera.core.impl.UseCaseConfig<?> r4 = r3.mUseCaseConfig
            r3.mCurrentConfig = r4
            r3.mExtendedConfig = r1
            r3.mCameraConfig = r1
            return
        L31:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected void updateSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3) {
            r2 = this;
            r2.mAttachedSessionConfig = r3
            java.util.List r3 = r3.getSurfaces()
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            java.lang.Class r1 = r0.getContainerClass()
            if (r1 != 0) goto La
            java.lang.Class r1 = r2.getClass()
            r0.setContainerClass(r1)
            goto La
        L24:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void updateSuggestedStreamSpec(@androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r1) {
            r0 = this;
            androidx.camera.core.impl.StreamSpec r1 = r0.onSuggestedStreamSpecUpdated(r1)
            r0.mAttachedStreamSpec = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void updateSuggestedStreamSpecImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
            r0 = this;
            androidx.camera.core.impl.StreamSpec r1 = r0.onSuggestedStreamSpecImplementationOptionsUpdated(r1)
            r0.mAttachedStreamSpec = r1
            return
    }
}
