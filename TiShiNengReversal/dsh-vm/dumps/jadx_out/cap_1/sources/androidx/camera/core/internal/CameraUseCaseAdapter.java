package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraUseCaseAdapter implements androidx.camera.core.Camera {
    private static final java.lang.String TAG = "CameraUseCaseAdapter";

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.List<androidx.camera.core.UseCase> mAppUseCases;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mAttached;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.impl.CameraConfig mCameraConfig;

    @androidx.annotation.GuardedBy("mLock")
    private final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    private final androidx.camera.core.impl.CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.CameraInternal mCameraInternal;
    private final java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> mCameraInternals;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.List<androidx.camera.core.UseCase> mCameraUseCases;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mLock")
    private java.util.List<androidx.camera.core.CameraEffect> mEffects;
    private final androidx.camera.core.internal.CameraUseCaseAdapter.CameraId mId;

    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.impl.Config mInteropConfig;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.UseCase mPlaceholderForExtensions;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.RestrictedCameraControl mRestrictedCameraControl;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.RestrictedCameraInfo mRestrictedCameraInfo;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.streamsharing.StreamSharing mStreamSharing;
    private final androidx.camera.core.impl.UseCaseConfigFactory mUseCaseConfigFactory;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.ViewPort mViewPort;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CameraException extends java.lang.Exception {
        public CameraException() {
                r0 = this;
                r0.<init>()
                return
        }

        public CameraException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public CameraException(@androidx.annotation.NonNull java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CameraId {
        private final java.util.List<java.lang.String> mIds;

        CameraId(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mIds = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L28
                java.lang.Object r0 = r3.next()
                androidx.camera.core.impl.CameraInternal r0 = (androidx.camera.core.impl.CameraInternal) r0
                java.util.List<java.lang.String> r1 = r2.mIds
                androidx.camera.core.impl.CameraInfoInternal r0 = r0.getCameraInfoInternal()
                java.lang.String r0 = r0.getCameraId()
                r1.add(r0)
                goto Le
            L28:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
                if (r0 == 0) goto Lf
                java.util.List<java.lang.String> r0 = r1.mIds
                androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r2 = (androidx.camera.core.internal.CameraUseCaseAdapter.CameraId) r2
                java.util.List<java.lang.String> r2 = r2.mIds
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.mIds
                int r0 = r0.hashCode()
                int r0 = r0 * 53
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ConfigPair {
        androidx.camera.core.impl.UseCaseConfig<?> mCameraConfig;
        androidx.camera.core.impl.UseCaseConfig<?> mExtendedConfig;

        ConfigPair(androidx.camera.core.impl.UseCaseConfig<?> r1, androidx.camera.core.impl.UseCaseConfig<?> r2) {
                r0 = this;
                r0.<init>()
                r0.mExtendedConfig = r1
                r0.mCameraConfig = r2
                return
        }
    }

    public CameraUseCaseAdapter(@androidx.annotation.NonNull java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> r3, @androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator r4, @androidx.annotation.NonNull androidx.camera.core.impl.CameraDeviceSurfaceManager r5, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r6) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mAppUseCases = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mCameraUseCases = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r2.mEffects = r0
            androidx.camera.core.impl.CameraConfig r0 = androidx.camera.core.impl.CameraConfigs.emptyConfig()
            r2.mCameraConfig = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            r0 = 1
            r2.mAttached = r0
            r0 = 0
            r2.mInteropConfig = r0
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            androidx.camera.core.impl.CameraInternal r0 = (androidx.camera.core.impl.CameraInternal) r0
            r2.mCameraInternal = r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r3)
            r2.mCameraInternals = r1
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r3 = new androidx.camera.core.internal.CameraUseCaseAdapter$CameraId
            r3.<init>(r1)
            r2.mId = r3
            r2.mCameraCoordinator = r4
            r2.mCameraDeviceSurfaceManager = r5
            r2.mUseCaseConfigFactory = r6
            androidx.camera.core.impl.RestrictedCameraControl r3 = new androidx.camera.core.impl.RestrictedCameraControl
            androidx.camera.core.impl.CameraControlInternal r4 = r0.getCameraControlInternal()
            r3.<init>(r4)
            r2.mRestrictedCameraControl = r3
            androidx.camera.core.impl.RestrictedCameraInfo r4 = new androidx.camera.core.impl.RestrictedCameraInfo
            androidx.camera.core.impl.CameraInfoInternal r5 = r0.getCameraInfoInternal()
            r4.<init>(r5, r3)
            r2.mRestrictedCameraInfo = r4
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.SurfaceRequest r4) {
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r1 = 0
            r0.<init>(r1)
            android.util.Size r1 = r4.getResolution()
            int r1 = r1.getWidth()
            android.util.Size r2 = r4.getResolution()
            int r2 = r2.getHeight()
            r0.setDefaultBufferSize(r1, r2)
            r0.detachFromGLContext()
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r0)
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.internal.a r3 = new androidx.camera.core.internal.a
            r3.<init>(r1, r0)
            r4.provideSurface(r1, r2, r3)
            return
    }

    public static /* synthetic */ void b(android.view.Surface r0, android.graphics.SurfaceTexture r1, androidx.camera.core.SurfaceRequest.Result r2) {
            r0.release()
            r1.release()
            return
    }

    private void cacheInteropConfig() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraInternal r1 = r3.mCameraInternal     // Catch: java.lang.Throwable -> L14
            androidx.camera.core.impl.CameraControlInternal r1 = r1.getCameraControlInternal()     // Catch: java.lang.Throwable -> L14
            androidx.camera.core.impl.Config r2 = r1.getInteropConfig()     // Catch: java.lang.Throwable -> L14
            r3.mInteropConfig = r2     // Catch: java.lang.Throwable -> L14
            r1.clearInteropConfig()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    static java.util.Collection<androidx.camera.core.UseCase> calculateCameraUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r1, @androidx.annotation.Nullable androidx.camera.core.UseCase r2, @androidx.annotation.Nullable androidx.camera.core.streamsharing.StreamSharing r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            if (r2 == 0) goto La
            r0.add(r2)
        La:
            if (r3 == 0) goto L16
            r0.add(r3)
            java.util.Set r1 = r3.getChildren()
            r0.removeAll(r1)
        L16:
            return r0
    }

    @androidx.annotation.NonNull
    private static android.graphics.Matrix calculateSensorToBufferTransformMatrix(@androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.util.Size r5) {
            int r0 = r4.width()
            if (r0 <= 0) goto Le
            int r0 = r4.height()
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "Cannot compute viewport crop rects zero sized sensor rect."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r5 = r5.getHeight()
            float r5 = (float) r5
            r3 = 0
            r1.<init>(r3, r3, r2, r5)
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            r4.setRectToRect(r1, r0, r5)
            r4.invert(r4)
            return r4
    }

    private java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> calculateSuggestedStreamSpecs(int r21, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r22, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r23, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r24, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> r25) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = r2.getCameraId()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r7 = r24.iterator()
        L1d:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto L74
            java.lang.Object r8 = r7.next()
            androidx.camera.core.UseCase r8 = (androidx.camera.core.UseCase) r8
            androidx.camera.core.impl.CameraDeviceSurfaceManager r10 = r0.mCameraDeviceSurfaceManager
            int r11 = r8.getImageFormat()
            android.util.Size r12 = r8.getAttachedSurfaceResolution()
            androidx.camera.core.impl.SurfaceConfig r13 = r10.transformSurfaceConfig(r1, r4, r11, r12)
            int r14 = r8.getImageFormat()
            android.util.Size r15 = r8.getAttachedSurfaceResolution()
            androidx.camera.core.impl.StreamSpec r10 = r8.getAttachedStreamSpec()
            java.lang.Object r10 = androidx.core.util.Preconditions.checkNotNull(r10)
            androidx.camera.core.impl.StreamSpec r10 = (androidx.camera.core.impl.StreamSpec) r10
            androidx.camera.core.DynamicRange r16 = r10.getDynamicRange()
            java.util.List r17 = getCaptureTypes(r8)
            androidx.camera.core.impl.StreamSpec r10 = r8.getAttachedStreamSpec()
            androidx.camera.core.impl.Config r18 = r10.getImplementationOptions()
            androidx.camera.core.impl.UseCaseConfig r10 = r8.getCurrentConfig()
            android.util.Range r19 = r10.getTargetFrameRate(r9)
            androidx.camera.core.impl.AttachedSurfaceInfo r9 = androidx.camera.core.impl.AttachedSurfaceInfo.create(r13, r14, r15, r16, r17, r18, r19)
            r3.add(r9)
            r6.put(r9, r8)
            androidx.camera.core.impl.StreamSpec r9 = r8.getAttachedStreamSpec()
            r5.put(r8, r9)
            goto L1d
        L74:
            boolean r7 = r23.isEmpty()
            if (r7 != 0) goto L12f
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            androidx.camera.core.impl.CameraInternal r10 = r0.mCameraInternal     // Catch: java.lang.NullPointerException -> L8f
            androidx.camera.core.impl.CameraControlInternal r10 = r10.getCameraControlInternal()     // Catch: java.lang.NullPointerException -> L8f
            android.graphics.Rect r10 = r10.getSensorRect()     // Catch: java.lang.NullPointerException -> L8f
            goto L91
        L8f:
            r10 = r9
        L91:
            androidx.camera.core.internal.SupportedOutputSizesSorter r11 = new androidx.camera.core.internal.SupportedOutputSizesSorter
            if (r10 == 0) goto L99
            android.util.Size r9 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(r10)
        L99:
            r11.<init>(r2, r9)
            java.util.Iterator r9 = r23.iterator()
        La0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc7
            java.lang.Object r10 = r9.next()
            androidx.camera.core.UseCase r10 = (androidx.camera.core.UseCase) r10
            r12 = r25
            java.lang.Object r13 = r12.get(r10)
            androidx.camera.core.internal.CameraUseCaseAdapter$ConfigPair r13 = (androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair) r13
            androidx.camera.core.impl.UseCaseConfig<?> r14 = r13.mExtendedConfig
            androidx.camera.core.impl.UseCaseConfig<?> r13 = r13.mCameraConfig
            androidx.camera.core.impl.UseCaseConfig r13 = r10.mergeConfigs(r2, r14, r13)
            r7.put(r13, r10)
            java.util.List r10 = r11.getSortedSupportedOutputSizes(r13)
            r8.put(r13, r10)
            goto La0
        Lc7:
            androidx.camera.core.impl.CameraDeviceSurfaceManager r2 = r0.mCameraDeviceSurfaceManager
            android.util.Pair r1 = r2.getSuggestedStreamSpecs(r1, r4, r3, r8)
            java.util.Set r2 = r7.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Ld5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf9
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.camera.core.UseCase r4 = (androidx.camera.core.UseCase) r4
            java.lang.Object r7 = r1.first
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            androidx.camera.core.impl.StreamSpec r3 = (androidx.camera.core.impl.StreamSpec) r3
            r5.put(r4, r3)
            goto Ld5
        Lf9:
            java.lang.Object r1 = r1.second
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L105:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L12f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L105
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r6.get(r3)
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            java.lang.Object r2 = r2.getValue()
            androidx.camera.core.impl.StreamSpec r2 = (androidx.camera.core.impl.StreamSpec) r2
            r5.put(r3, r2)
            goto L105
        L12f:
            return r5
    }

    private androidx.camera.core.ImageCapture createExtraImageCapture() {
            r2 = this;
            androidx.camera.core.ImageCapture$Builder r0 = new androidx.camera.core.ImageCapture$Builder
            r0.<init>()
            java.lang.String r1 = "ImageCapture-Extra"
            androidx.camera.core.ImageCapture$Builder r0 = r0.setTargetName(r1)
            androidx.camera.core.ImageCapture r0 = r0.build()
            return r0
    }

    private androidx.camera.core.Preview createExtraPreview() {
            r2 = this;
            androidx.camera.core.Preview$Builder r0 = new androidx.camera.core.Preview$Builder
            r0.<init>()
            java.lang.String r1 = "Preview-Extra"
            androidx.camera.core.Preview$Builder r0 = r0.setTargetName(r1)
            androidx.camera.core.Preview r0 = r0.build()
            androidx.camera.core.internal.b r1 = new androidx.camera.core.internal.b
            r1.<init>()
            r0.setSurfaceProvider(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.streamsharing.StreamSharing createOrReuseStreamSharing(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r4, boolean r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.Set r4 = r3.getStreamSharingChildren(r4, r5)     // Catch: java.lang.Throwable -> L11
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L11
            r1 = 2
            r2 = 0
            if (r5 >= r1) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r4 = move-exception
            goto L3b
        L13:
            androidx.camera.core.streamsharing.StreamSharing r5 = r3.mStreamSharing     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L28
            java.util.Set r5 = r5.getChildren()     // Catch: java.lang.Throwable -> L11
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L28
            androidx.camera.core.streamsharing.StreamSharing r4 = r3.mStreamSharing     // Catch: java.lang.Throwable -> L11
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L28:
            boolean r5 = isStreamSharingChildrenCombinationValid(r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != 0) goto L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r2
        L30:
            androidx.camera.core.streamsharing.StreamSharing r5 = new androidx.camera.core.streamsharing.StreamSharing     // Catch: java.lang.Throwable -> L11
            androidx.camera.core.impl.CameraInternal r1 = r3.mCameraInternal     // Catch: java.lang.Throwable -> L11
            androidx.camera.core.impl.UseCaseConfigFactory r2 = r3.mUseCaseConfigFactory     // Catch: java.lang.Throwable -> L11
            r5.<init>(r1, r4, r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.internal.CameraUseCaseAdapter.CameraId generateCameraId(@androidx.annotation.NonNull java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> r1) {
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r0 = new androidx.camera.core.internal.CameraUseCaseAdapter$CameraId
            r0.<init>(r1)
            return r0
    }

    private int getCameraMode() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r3.mCameraCoordinator     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            if (r1 != r2) goto L11
            r1 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L14
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            return r0
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes(androidx.camera.core.UseCase r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = isStreamSharing(r2)
            if (r1 == 0) goto L2e
            androidx.camera.core.streamsharing.StreamSharing r2 = (androidx.camera.core.streamsharing.StreamSharing) r2
            java.util.Set r2 = r2.getChildren()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            androidx.camera.core.impl.UseCaseConfig r1 = r1.getCurrentConfig()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = r1.getCaptureType()
            r0.add(r1)
            goto L15
        L2d:
            return r0
        L2e:
            androidx.camera.core.impl.UseCaseConfig r2 = r2.getCurrentConfig()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = r2.getCaptureType()
            r0.add(r2)
            return r0
    }

    private java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> getConfigs(java.util.Collection<androidx.camera.core.UseCase> r6, androidx.camera.core.impl.UseCaseConfigFactory r7, androidx.camera.core.impl.UseCaseConfigFactory r8) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r6.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            androidx.camera.core.internal.CameraUseCaseAdapter$ConfigPair r2 = new androidx.camera.core.internal.CameraUseCaseAdapter$ConfigPair
            r3 = 0
            androidx.camera.core.impl.UseCaseConfig r3 = r1.getDefaultConfig(r3, r7)
            r4 = 1
            androidx.camera.core.impl.UseCaseConfig r4 = r1.getDefaultConfig(r4, r8)
            r2.<init>(r3, r4)
            r0.put(r1, r2)
            goto L9
        L28:
            return r0
    }

    private int getSharingTargets(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.CameraEffect> r1 = r7.mEffects     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
            r2 = 0
        La:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2c
            androidx.camera.core.CameraEffect r3 = (androidx.camera.core.CameraEffect) r3     // Catch: java.lang.Throwable -> L2c
            int r5 = r3.getTargets()     // Catch: java.lang.Throwable -> L2c
            int r5 = androidx.camera.core.processing.TargetUtils.getNumberOfTargets(r5)     // Catch: java.lang.Throwable -> L2c
            r6 = 1
            if (r5 <= r6) goto La
            if (r2 != 0) goto L25
            r4 = 1
        L25:
            java.lang.String r2 = "Can only have one sharing effect."
            androidx.core.util.Preconditions.checkState(r4, r2)     // Catch: java.lang.Throwable -> L2c
            r2 = r3
            goto La
        L2c:
            r8 = move-exception
            goto L3b
        L2e:
            if (r2 != 0) goto L31
            goto L35
        L31:
            int r4 = r2.getTargets()     // Catch: java.lang.Throwable -> L2c
        L35:
            if (r8 == 0) goto L39
            r4 = r4 | 3
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return r4
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r8
    }

    @androidx.annotation.NonNull
    private java.util.Set<androidx.camera.core.UseCase> getStreamSharingChildren(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r5, boolean r6) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r6 = r4.getSharingTargets(r6)
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            boolean r2 = isStreamSharing(r1)
            r2 = r2 ^ 1
            java.lang.String r3 = "Only support one level of sharing for now."
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            boolean r2 = r1.isEffectTargetsSupported(r6)
            if (r2 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L2e:
            return r0
    }

    private static boolean hasImplementationOptionChanged(androidx.camera.core.impl.StreamSpec r4, androidx.camera.core.impl.SessionConfig r5) {
            androidx.camera.core.impl.Config r4 = r4.getImplementationOptions()
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            java.util.Set r1 = r4.listOptions()
            int r1 = r1.size()
            androidx.camera.core.impl.Config r5 = r5.getImplementationOptions()
            java.util.Set r5 = r5.listOptions()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L20
            return r2
        L20:
            java.util.Set r5 = r4.listOptions()
            java.util.Iterator r5 = r5.iterator()
        L28:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
            boolean r3 = r0.containsOption(r1)
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.retrieveOption(r1)
            java.lang.Object r1 = r4.retrieveOption(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L28
        L48:
            return r2
        L49:
            r4 = 0
            return r4
    }

    private boolean hasNoExtension() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraConfig r1 = r3.mCameraConfig     // Catch: java.lang.Throwable -> L10
            androidx.camera.core.impl.CameraConfig r2 = androidx.camera.core.impl.CameraConfigs.emptyConfig()     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    private boolean isCoexistingPreviewImageCaptureRequired() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraConfig r1 = r3.mCameraConfig     // Catch: java.lang.Throwable -> L10
            int r1 = r1.getUseCaseCombinationRequiredRule()     // Catch: java.lang.Throwable -> L10
            r2 = 1
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    private boolean isExtraImageCaptureRequired(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r7) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = 0
            r2 = 0
        L7:
            boolean r3 = r7.hasNext()
            r4 = 1
            if (r3 == 0) goto L24
            java.lang.Object r3 = r7.next()
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            boolean r5 = isPreview(r3)
            if (r5 == 0) goto L1c
            r1 = 1
            goto L7
        L1c:
            boolean r3 = isImageCapture(r3)
            if (r3 == 0) goto L7
            r2 = 1
            goto L7
        L24:
            if (r1 == 0) goto L29
            if (r2 != 0) goto L29
            return r4
        L29:
            return r0
    }

    private boolean isExtraPreviewRequired(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r7) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = 0
            r2 = 0
        L7:
            boolean r3 = r7.hasNext()
            r4 = 1
            if (r3 == 0) goto L24
            java.lang.Object r3 = r7.next()
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            boolean r5 = isPreview(r3)
            if (r5 == 0) goto L1c
            r2 = 1
            goto L7
        L1c:
            boolean r3 = isImageCapture(r3)
            if (r3 == 0) goto L7
            r1 = 1
            goto L7
        L24:
            if (r1 == 0) goto L29
            if (r2 != 0) goto L29
            return r4
        L29:
            return r0
    }

    private static boolean isImageCapture(@androidx.annotation.Nullable androidx.camera.core.UseCase r0) {
            boolean r0 = r0 instanceof androidx.camera.core.ImageCapture
            return r0
    }

    private static boolean isPreview(@androidx.annotation.Nullable androidx.camera.core.UseCase r0) {
            boolean r0 = r0 instanceof androidx.camera.core.Preview
            return r0
    }

    private static boolean isStreamSharing(@androidx.annotation.Nullable androidx.camera.core.UseCase r0) {
            boolean r0 = r0 instanceof androidx.camera.core.streamsharing.StreamSharing
            return r0
    }

    static boolean isStreamSharingChildrenCombinationValid(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r8) {
            r0 = 2
            r1 = 4
            r2 = 1
            int[] r0 = new int[]{r2, r0, r1}
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L10:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r8.next()
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            r4 = 0
            r5 = 0
        L1e:
            r6 = 3
            if (r5 >= r6) goto L10
            r6 = r0[r5]
            boolean r7 = r3.isEffectTargetsSupported(r6)
            if (r7 == 0) goto L3b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r7 = r1.contains(r7)
            if (r7 == 0) goto L34
            return r4
        L34:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.add(r6)
        L3b:
            int r5 = r5 + 1
            goto L1e
        L3e:
            return r2
    }

    private void restoreInteropConfig() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.Config r1 = r3.mInteropConfig     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            androidx.camera.core.impl.CameraInternal r1 = r3.mCameraInternal     // Catch: java.lang.Throwable -> L13
            androidx.camera.core.impl.CameraControlInternal r1 = r1.getCameraControlInternal()     // Catch: java.lang.Throwable -> L13
            androidx.camera.core.impl.Config r2 = r3.mInteropConfig     // Catch: java.lang.Throwable -> L13
            r1.addInteropConfig(r2)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.camera.core.CameraEffect> setEffectsOnUseCases(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraEffect> r7, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r8.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            r2 = 0
            r1.setEffect(r2)
            java.util.Iterator r2 = r7.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            androidx.camera.core.CameraEffect r3 = (androidx.camera.core.CameraEffect) r3
            int r4 = r3.getTargets()
            boolean r4 = r1.isEffectTargetsSupported(r4)
            if (r4 == 0) goto L1d
            androidx.camera.core.CameraEffect r4 = r1.getEffect()
            if (r4 != 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r6 = " already has effect"
            r5.append(r6)
            androidx.camera.core.CameraEffect r6 = r1.getEffect()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            androidx.core.util.Preconditions.checkState(r4, r5)
            r1.setEffect(r3)
            r0.remove(r3)
            goto L1d
        L5e:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    static void updateEffects(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraEffect> r1, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r2, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r3) {
            java.util.List r1 = setEffectsOnUseCases(r1, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r0.removeAll(r2)
            java.util.List r1 = setEffectsOnUseCases(r1, r0)
            int r2 = r1.size()
            if (r2 <= 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unused effects: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "CameraUseCaseAdapter"
            androidx.camera.core.Logger.w(r2, r1)
        L2c:
            return
    }

    private void updateViewPort(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> r10, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r11) {
            r9 = this;
            java.lang.Object r1 = r9.mLock
            monitor-enter(r1)
            androidx.camera.core.ViewPort r0 = r9.mViewPort     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L8d
            androidx.camera.core.impl.CameraInternal r0 = r9.mCameraInternal     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.CameraInfoInternal r0 = r0.getCameraInfoInternal()     // Catch: java.lang.Throwable -> L8a
            int r0 = r0.getLensFacing()     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L16
            r0 = 1
            r3 = 1
            goto L18
        L16:
            r0 = 0
            r3 = 0
        L18:
            androidx.camera.core.impl.CameraInternal r0 = r9.mCameraInternal     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.CameraControlInternal r0 = r0.getCameraControlInternal()     // Catch: java.lang.Throwable -> L8a
            android.graphics.Rect r2 = r0.getSensorRect()     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.ViewPort r0 = r9.mViewPort     // Catch: java.lang.Throwable -> L8a
            android.util.Rational r4 = r0.getAspectRatio()     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.CameraInternal r0 = r9.mCameraInternal     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.CameraInfoInternal r0 = r0.getCameraInfoInternal()     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.ViewPort r5 = r9.mViewPort     // Catch: java.lang.Throwable -> L8a
            int r5 = r5.getRotation()     // Catch: java.lang.Throwable -> L8a
            int r5 = r0.getSensorRotationDegrees(r5)     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.ViewPort r0 = r9.mViewPort     // Catch: java.lang.Throwable -> L8a
            int r6 = r0.getScaleType()     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.ViewPort r0 = r9.mViewPort     // Catch: java.lang.Throwable -> L8a
            int r7 = r0.getLayoutDirection()     // Catch: java.lang.Throwable -> L8a
            r8 = r10
            java.util.Map r10 = androidx.camera.core.internal.ViewPorts.calculateViewPortRects(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L8a
        L4d:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.UseCase r0 = (androidx.camera.core.UseCase) r0     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r10.get(r0)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.Throwable -> L8a
            r0.setViewPortCropRect(r2)     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.CameraInternal r2 = r9.mCameraInternal     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.CameraControlInternal r2 = r2.getCameraControlInternal()     // Catch: java.lang.Throwable -> L8a
            android.graphics.Rect r2 = r2.getSensorRect()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r3 = r8.get(r0)     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.StreamSpec r3 = (androidx.camera.core.impl.StreamSpec) r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L8a
            androidx.camera.core.impl.StreamSpec r3 = (androidx.camera.core.impl.StreamSpec) r3     // Catch: java.lang.Throwable -> L8a
            android.util.Size r3 = r3.getResolution()     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r2 = calculateSensorToBufferTransformMatrix(r2, r3)     // Catch: java.lang.Throwable -> L8a
            r0.setSensorToBufferTransformMatrix(r2)     // Catch: java.lang.Throwable -> L8a
            goto L4d
        L8a:
            r0 = move-exception
            r10 = r0
            goto L8f
        L8d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            return
        L8f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r10
    }

    public void addUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r4) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L12
            java.util.List<androidx.camera.core.UseCase> r2 = r3.mAppUseCases     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            r1.addAll(r4)     // Catch: java.lang.Throwable -> L12
            r3.updateUseCases(r1)     // Catch: java.lang.Throwable -> L12 java.lang.IllegalArgumentException -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            goto L1f
        L14:
            r4 = move-exception
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraException r1 = new androidx.camera.core.internal.CameraUseCaseAdapter$CameraException     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L12
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    public void attachUseCases() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mAttached     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2c
            androidx.camera.core.impl.CameraInternal r1 = r3.mCameraInternal     // Catch: java.lang.Throwable -> L27
            java.util.List<androidx.camera.core.UseCase> r2 = r3.mCameraUseCases     // Catch: java.lang.Throwable -> L27
            r1.attachUseCases(r2)     // Catch: java.lang.Throwable -> L27
            r3.restoreInteropConfig()     // Catch: java.lang.Throwable -> L27
            java.util.List<androidx.camera.core.UseCase> r1 = r3.mCameraUseCases     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2     // Catch: java.lang.Throwable -> L27
            r2.notifyState()     // Catch: java.lang.Throwable -> L27
            goto L17
        L27:
            r1 = move-exception
            goto L2e
        L29:
            r1 = 1
            r3.mAttached = r1     // Catch: java.lang.Throwable -> L27
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    @androidx.annotation.Nullable
    androidx.camera.core.UseCase calculatePlaceholderForExtensions(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.isCoexistingPreviewImageCaptureRequired()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L37
            boolean r1 = r2.isExtraPreviewRequired(r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L21
            androidx.camera.core.UseCase r3 = r2.mPlaceholderForExtensions     // Catch: java.lang.Throwable -> L1a
            boolean r3 = isPreview(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            androidx.camera.core.UseCase r3 = r2.mPlaceholderForExtensions     // Catch: java.lang.Throwable -> L1a
            goto L38
        L1a:
            r3 = move-exception
            goto L3a
        L1c:
            androidx.camera.core.Preview r3 = r2.createExtraPreview()     // Catch: java.lang.Throwable -> L1a
            goto L38
        L21:
            boolean r3 = r2.isExtraImageCaptureRequired(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L37
            androidx.camera.core.UseCase r3 = r2.mPlaceholderForExtensions     // Catch: java.lang.Throwable -> L1a
            boolean r3 = isImageCapture(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L32
            androidx.camera.core.UseCase r3 = r2.mPlaceholderForExtensions     // Catch: java.lang.Throwable -> L1a
            goto L38
        L32:
            androidx.camera.core.ImageCapture r3 = r2.createExtraImageCapture()     // Catch: java.lang.Throwable -> L1a
            goto L38
        L37:
            r3 = 0
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public void detachUseCases() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r4.mAttached     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            androidx.camera.core.impl.CameraInternal r1 = r4.mCameraInternal     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            java.util.List<androidx.camera.core.UseCase> r3 = r4.mCameraUseCases     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            r1.detachUseCases(r2)     // Catch: java.lang.Throwable -> L1a
            r4.cacheInteropConfig()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r4.mAttached = r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.CameraControl getCameraControl() {
            r1 = this;
            androidx.camera.core.impl.RestrictedCameraControl r0 = r1.mRestrictedCameraControl
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r0 = r1.mId
            return r0
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.CameraInfo getCameraInfo() {
            r1 = this;
            androidx.camera.core.impl.RestrictedCameraInfo r0 = r1.mRestrictedCameraInfo
            return r0
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals() {
            r1 = this;
            java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> r0 = r1.mCameraInternals
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    java.util.Collection<androidx.camera.core.UseCase> getCameraUseCases() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            java.util.List<androidx.camera.core.UseCase> r2 = r3.mCameraUseCases     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.CameraConfig r1 = r2.mCameraConfig     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            java.util.List<androidx.camera.core.UseCase> r2 = r3.mAppUseCases     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public boolean isEquivalent(@androidx.annotation.NonNull androidx.camera.core.internal.CameraUseCaseAdapter r2) {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r0 = r1.mId
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r2 = r2.getCameraId()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(@androidx.annotation.NonNull androidx.camera.core.UseCase... r11) {
            r10 = this;
            java.lang.Object r1 = r10.mLock
            monitor-enter(r1)
            java.util.List r0 = java.util.Arrays.asList(r11)     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            androidx.camera.core.impl.CameraConfig r2 = r10.mCameraConfig     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            androidx.camera.core.impl.UseCaseConfigFactory r2 = r2.getUseCaseConfigFactory()     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            androidx.camera.core.impl.UseCaseConfigFactory r3 = r10.mUseCaseConfigFactory     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            java.util.Map r9 = r10.getConfigs(r0, r2, r3)     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            int r5 = r10.getCameraMode()     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            androidx.camera.core.impl.CameraInternal r0 = r10.mCameraInternal     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            androidx.camera.core.impl.CameraInfoInternal r6 = r0.getCameraInfoInternal()     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            java.util.List r7 = java.util.Arrays.asList(r11)     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            r4 = r10
            r4.calculateSuggestedStreamSpecs(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2d
            r11 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r11
        L2a:
            r0 = move-exception
            r11 = r0
            goto L30
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            r11 = 0
            return r11
        L30:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r11
    }

    public void removeUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L12
            java.util.List<androidx.camera.core.UseCase> r2 = r3.mAppUseCases     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            r1.removeAll(r4)     // Catch: java.lang.Throwable -> L12
            r3.updateUseCases(r1)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    public void setActiveResumingMode(boolean r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.mCameraInternal
            r0.setActiveResumingMode(r2)
            return
    }

    public void setEffects(@androidx.annotation.Nullable java.util.List<androidx.camera.core.CameraEffect> r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mEffects = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(@androidx.annotation.Nullable androidx.camera.core.impl.CameraConfig r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            if (r4 != 0) goto Lc
            androidx.camera.core.impl.CameraConfig r4 = androidx.camera.core.impl.CameraConfigs.emptyConfig()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r4 = move-exception
            goto L50
        Lc:
            java.util.List<androidx.camera.core.UseCase> r1 = r3.mAppUseCases     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L2d
            androidx.camera.core.impl.CameraConfig r1 = r3.mCameraConfig     // Catch: java.lang.Throwable -> La
            androidx.camera.core.impl.Identifier r1 = r1.getCompatibilityId()     // Catch: java.lang.Throwable -> La
            androidx.camera.core.impl.Identifier r2 = r4.getCompatibilityId()     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L25
            goto L2d
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = "Need to unbind all use cases before binding with extension enabled"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La
            throw r4     // Catch: java.lang.Throwable -> La
        L2d:
            r3.mCameraConfig = r4     // Catch: java.lang.Throwable -> La
            r1 = 0
            androidx.camera.core.impl.SessionProcessor r4 = r4.getSessionProcessor(r1)     // Catch: java.lang.Throwable -> La
            if (r4 == 0) goto L41
            java.util.Set r4 = r4.getSupportedCameraOperations()     // Catch: java.lang.Throwable -> La
            androidx.camera.core.impl.RestrictedCameraControl r1 = r3.mRestrictedCameraControl     // Catch: java.lang.Throwable -> La
            r2 = 1
            r1.enableRestrictedOperations(r2, r4)     // Catch: java.lang.Throwable -> La
            goto L47
        L41:
            androidx.camera.core.impl.RestrictedCameraControl r4 = r3.mRestrictedCameraControl     // Catch: java.lang.Throwable -> La
            r2 = 0
            r4.enableRestrictedOperations(r2, r1)     // Catch: java.lang.Throwable -> La
        L47:
            androidx.camera.core.impl.CameraInternal r4 = r3.mCameraInternal     // Catch: java.lang.Throwable -> La
            androidx.camera.core.impl.CameraConfig r1 = r3.mCameraConfig     // Catch: java.lang.Throwable -> La
            r4.setExtendedConfig(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r4
    }

    public void setViewPort(@androidx.annotation.Nullable androidx.camera.core.ViewPort r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mViewPort = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    void updateUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r2) {
            r1 = this;
            r0 = 0
            r1.updateUseCases(r2, r0)
            return
    }

    void updateUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r13, boolean r14) {
            r12 = this;
            java.lang.Object r1 = r12.mLock
            monitor-enter(r1)
            androidx.camera.core.UseCase r0 = r12.calculatePlaceholderForExtensions(r13)     // Catch: java.lang.Throwable -> L110
            androidx.camera.core.streamsharing.StreamSharing r2 = r12.createOrReuseStreamSharing(r13, r14)     // Catch: java.lang.Throwable -> L110
            java.util.Collection r3 = calculateCameraUseCases(r13, r0, r2)     // Catch: java.lang.Throwable -> L110
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L110
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L110
            java.util.List<androidx.camera.core.UseCase> r4 = r12.mCameraUseCases     // Catch: java.lang.Throwable -> L110
            r7.removeAll(r4)     // Catch: java.lang.Throwable -> L110
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L110
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L110
            java.util.List<androidx.camera.core.UseCase> r4 = r12.mCameraUseCases     // Catch: java.lang.Throwable -> L110
            r8.retainAll(r4)     // Catch: java.lang.Throwable -> L110
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L110
            java.util.List<androidx.camera.core.UseCase> r4 = r12.mCameraUseCases     // Catch: java.lang.Throwable -> L110
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L110
            r10.removeAll(r3)     // Catch: java.lang.Throwable -> L110
            androidx.camera.core.impl.CameraConfig r4 = r12.mCameraConfig     // Catch: java.lang.Throwable -> L110
            androidx.camera.core.impl.UseCaseConfigFactory r4 = r4.getUseCaseConfigFactory()     // Catch: java.lang.Throwable -> L110
            androidx.camera.core.impl.UseCaseConfigFactory r5 = r12.mUseCaseConfigFactory     // Catch: java.lang.Throwable -> L110
            java.util.Map r9 = r12.getConfigs(r7, r4, r5)     // Catch: java.lang.Throwable -> L110
            int r5 = r12.getCameraMode()     // Catch: java.lang.Throwable -> L110 java.lang.IllegalArgumentException -> L114
            androidx.camera.core.impl.CameraInternal r4 = r12.mCameraInternal     // Catch: java.lang.Throwable -> L110 java.lang.IllegalArgumentException -> L114
            androidx.camera.core.impl.CameraInfoInternal r6 = r4.getCameraInfoInternal()     // Catch: java.lang.Throwable -> L110 java.lang.IllegalArgumentException -> L114
            r4 = r12
            java.util.Map r14 = r4.calculateSuggestedStreamSpecs(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L10e
            r12.updateViewPort(r14, r3)     // Catch: java.lang.Throwable -> L66
            java.util.List<androidx.camera.core.CameraEffect> r5 = r4.mEffects     // Catch: java.lang.Throwable -> L66
            updateEffects(r5, r3, r13)     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> L66
        L54:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.UseCase r6 = (androidx.camera.core.UseCase) r6     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.CameraInternal r11 = r4.mCameraInternal     // Catch: java.lang.Throwable -> L66
            r6.unbindFromCamera(r11)     // Catch: java.lang.Throwable -> L66
            goto L54
        L66:
            r0 = move-exception
        L67:
            r13 = r0
            goto L12e
        L6a:
            androidx.camera.core.impl.CameraInternal r5 = r4.mCameraInternal     // Catch: java.lang.Throwable -> L66
            r5.detachUseCases(r10)     // Catch: java.lang.Throwable -> L66
            boolean r5 = r10.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto La5
            java.util.Iterator r5 = r8.iterator()     // Catch: java.lang.Throwable -> L66
        L79:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto La5
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.UseCase r6 = (androidx.camera.core.UseCase) r6     // Catch: java.lang.Throwable -> L66
            boolean r8 = r14.containsKey(r6)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L79
            java.lang.Object r8 = r14.get(r6)     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.StreamSpec r8 = (androidx.camera.core.impl.StreamSpec) r8     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.Config r10 = r8.getImplementationOptions()     // Catch: java.lang.Throwable -> L66
            if (r10 == 0) goto L79
            androidx.camera.core.impl.SessionConfig r11 = r6.getSessionConfig()     // Catch: java.lang.Throwable -> L66
            boolean r8 = hasImplementationOptionChanged(r8, r11)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L79
            r6.updateSuggestedStreamSpecImplementationOptions(r10)     // Catch: java.lang.Throwable -> L66
            goto L79
        La5:
            java.util.Iterator r5 = r7.iterator()     // Catch: java.lang.Throwable -> L66
        La9:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto Ld7
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.UseCase r6 = (androidx.camera.core.UseCase) r6     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = r9.get(r6)     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.internal.CameraUseCaseAdapter$ConfigPair r8 = (androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair) r8     // Catch: java.lang.Throwable -> L66
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.CameraInternal r10 = r4.mCameraInternal     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.UseCaseConfig<?> r11 = r8.mExtendedConfig     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.UseCaseConfig<?> r8 = r8.mCameraConfig     // Catch: java.lang.Throwable -> L66
            r6.bindToCamera(r10, r11, r8)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = r14.get(r6)     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.StreamSpec r8 = (androidx.camera.core.impl.StreamSpec) r8     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = androidx.core.util.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.impl.StreamSpec r8 = (androidx.camera.core.impl.StreamSpec) r8     // Catch: java.lang.Throwable -> L66
            r6.updateSuggestedStreamSpec(r8)     // Catch: java.lang.Throwable -> L66
            goto La9
        Ld7:
            boolean r14 = r4.mAttached     // Catch: java.lang.Throwable -> L66
            if (r14 == 0) goto Le0
            androidx.camera.core.impl.CameraInternal r14 = r4.mCameraInternal     // Catch: java.lang.Throwable -> L66
            r14.attachUseCases(r7)     // Catch: java.lang.Throwable -> L66
        Le0:
            java.util.Iterator r14 = r7.iterator()     // Catch: java.lang.Throwable -> L66
        Le4:
            boolean r5 = r14.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto Lf4
            java.lang.Object r5 = r14.next()     // Catch: java.lang.Throwable -> L66
            androidx.camera.core.UseCase r5 = (androidx.camera.core.UseCase) r5     // Catch: java.lang.Throwable -> L66
            r5.notifyState()     // Catch: java.lang.Throwable -> L66
            goto Le4
        Lf4:
            java.util.List<androidx.camera.core.UseCase> r14 = r4.mAppUseCases     // Catch: java.lang.Throwable -> L66
            r14.clear()     // Catch: java.lang.Throwable -> L66
            java.util.List<androidx.camera.core.UseCase> r14 = r4.mAppUseCases     // Catch: java.lang.Throwable -> L66
            r14.addAll(r13)     // Catch: java.lang.Throwable -> L66
            java.util.List<androidx.camera.core.UseCase> r13 = r4.mCameraUseCases     // Catch: java.lang.Throwable -> L66
            r13.clear()     // Catch: java.lang.Throwable -> L66
            java.util.List<androidx.camera.core.UseCase> r13 = r4.mCameraUseCases     // Catch: java.lang.Throwable -> L66
            r13.addAll(r3)     // Catch: java.lang.Throwable -> L66
            r4.mPlaceholderForExtensions = r0     // Catch: java.lang.Throwable -> L66
            r4.mStreamSharing = r2     // Catch: java.lang.Throwable -> L66
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            return
        L10e:
            r0 = move-exception
            goto L116
        L110:
            r0 = move-exception
            r4 = r12
            goto L67
        L114:
            r0 = move-exception
            r4 = r12
        L116:
            if (r14 != 0) goto L12d
            boolean r14 = r12.hasNoExtension()     // Catch: java.lang.Throwable -> L66
            if (r14 == 0) goto L12d
            androidx.camera.core.concurrent.CameraCoordinator r14 = r4.mCameraCoordinator     // Catch: java.lang.Throwable -> L66
            int r14 = r14.getCameraOperatingMode()     // Catch: java.lang.Throwable -> L66
            r2 = 2
            if (r14 == r2) goto L12d
            r14 = 1
            r12.updateUseCases(r13, r14)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            return
        L12d:
            throw r0     // Catch: java.lang.Throwable -> L66
        L12e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            throw r13
    }
}
