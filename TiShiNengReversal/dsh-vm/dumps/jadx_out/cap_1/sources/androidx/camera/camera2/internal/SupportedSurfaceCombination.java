package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SupportedSurfaceCombination {
    private static final java.lang.String TAG = "SupportedSurfaceCombination";
    private final androidx.camera.camera2.internal.CamcorderProfileHelper mCamcorderProfileHelper;
    private final java.lang.String mCameraId;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCharacteristics;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mConcurrentSurfaceCombinations;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;
    private final androidx.camera.camera2.internal.DynamicRangeResolver mDynamicRangeResolver;
    private final androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final java.util.Map<androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings, java.util.List<androidx.camera.core.impl.SurfaceCombination>> mFeatureSettingsToSupportedCombinationsMap;
    private final int mHardwareLevel;
    private boolean mIsBurstCaptureSupported;
    private boolean mIsConcurrentCameraModeSupported;
    private boolean mIsRawSupported;
    private boolean mIsStreamUseCaseSupported;
    private boolean mIsUltraHighResolutionSensorSupported;
    private final androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector mResolutionCorrector;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinations;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinations10Bit;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinationsStreamUseCase;

    @androidx.annotation.VisibleForTesting
    androidx.camera.core.impl.SurfaceSizeDefinition mSurfaceSizeDefinition;
    java.util.List<java.lang.Integer> mSurfaceSizeDefinitionFormats;
    private final androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio mTargetAspectRatio;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mUltraHighSurfaceCombinations;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.util.Size[] getHighResolutionOutputSizes(android.hardware.camera2.params.StreamConfigurationMap r0, int r1) {
                android.util.Size[] r0 = r0.getHighResolutionOutputSizes(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class FeatureSettings {
        FeatureSettings() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings of(int r1, int r2) {
                androidx.camera.camera2.internal.AutoValue_SupportedSurfaceCombination_FeatureSettings r0 = new androidx.camera.camera2.internal.AutoValue_SupportedSurfaceCombination_FeatureSettings
                r0.<init>(r1, r2)
                return r0
        }

        abstract int getCameraMode();

        abstract int getRequiredMaxBitDepth();
    }

    SupportedSurfaceCombination(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r7, @androidx.annotation.NonNull androidx.camera.camera2.internal.CamcorderProfileHelper r8) throws androidx.camera.core.CameraUnavailableException {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mSurfaceCombinations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mUltraHighSurfaceCombinations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mConcurrentSurfaceCombinations = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.mFeatureSettingsToSupportedCombinationsMap = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mSurfaceCombinations10Bit = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mSurfaceCombinationsStreamUseCase = r0
            r0 = 0
            r4.mIsRawSupported = r0
            r4.mIsBurstCaptureSupported = r0
            r4.mIsConcurrentCameraModeSupported = r0
            r4.mIsStreamUseCaseSupported = r0
            r4.mIsUltraHighResolutionSensorSupported = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.mSurfaceSizeDefinitionFormats = r1
            androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio r1 = new androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio
            r1.<init>()
            r4.mTargetAspectRatio = r1
            androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector r1 = new androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector
            r1.<init>()
            r4.mResolutionCorrector = r1
            java.lang.Object r6 = androidx.core.util.Preconditions.checkNotNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            r4.mCameraId = r6
            java.lang.Object r8 = androidx.core.util.Preconditions.checkNotNull(r8)
            androidx.camera.camera2.internal.CamcorderProfileHelper r8 = (androidx.camera.camera2.internal.CamcorderProfileHelper) r8
            r4.mCamcorderProfileHelper = r8
            androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer r8 = new androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer
            r8.<init>()
            r4.mExtraSupportedSurfaceCombinationsContainer = r8
            androidx.camera.camera2.internal.DisplayInfoManager r8 = androidx.camera.camera2.internal.DisplayInfoManager.getInstance(r5)
            r4.mDisplayInfoManager = r8
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r6 = r7.getCameraCharacteristicsCompat(r6)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            r4.mCharacteristics = r6     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.Object r7 = r6.get(r7)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            if (r7 == 0) goto L82
            int r7 = r7.intValue()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            goto L83
        L7f:
            r5 = move-exception
            goto Lf1
        L82:
            r7 = 2
        L83:
            r4.mHardwareLevel = r7     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r6 = r6.get(r7)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto Lb0
            int r7 = r6.length
        L90:
            if (r0 >= r7) goto Lb0
            r8 = r6[r0]
            r1 = 3
            r2 = 1
            if (r8 != r1) goto L9b
            r4.mIsRawSupported = r2
            goto Lad
        L9b:
            r1 = 6
            if (r8 != r1) goto La1
            r4.mIsBurstCaptureSupported = r2
            goto Lad
        La1:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r1 < r3) goto Lad
            r1 = 16
            if (r8 != r1) goto Lad
            r4.mIsUltraHighResolutionSensorSupported = r2
        Lad:
            int r0 = r0 + 1
            goto L90
        Lb0:
            androidx.camera.camera2.internal.DynamicRangeResolver r6 = new androidx.camera.camera2.internal.DynamicRangeResolver
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r7 = r4.mCharacteristics
            r6.<init>(r7)
            r4.mDynamicRangeResolver = r6
            r4.generateSupportedCombinationList()
            boolean r7 = r4.mIsUltraHighResolutionSensorSupported
            if (r7 == 0) goto Lc3
            r4.generateUltraHighSupportedCombinationList()
        Lc3:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r7 = "android.hardware.camera.concurrent"
            boolean r5 = r5.hasSystemFeature(r7)
            r4.mIsConcurrentCameraModeSupported = r5
            if (r5 == 0) goto Ld4
            r4.generateConcurrentSupportedCombinationList()
        Ld4:
            boolean r5 = r6.is10BitDynamicRangeSupported()
            if (r5 == 0) goto Ldd
            r4.generate10BitSupportedCombinationList()
        Ldd:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r5 = r4.mCharacteristics
            boolean r5 = androidx.camera.camera2.internal.StreamUseCaseUtil.isStreamUseCaseSupported(r5)
            r4.mIsStreamUseCaseSupported = r5
            if (r5 == 0) goto Lea
            r4.generateStreamUseCaseSupportedCombinationList()
        Lea:
            r4.generateSurfaceSizeDefinition()
            r4.checkCustomization()
            return
        Lf1:
            androidx.camera.core.CameraUnavailableException r5 = androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(r5)
            throw r5
    }

    private void checkCustomization() {
            r0 = this;
            return
    }

    private static android.util.Range<java.lang.Integer> compareIntersectingRanges(android.util.Range<java.lang.Integer> r10, android.util.Range<java.lang.Integer> r11, android.util.Range<java.lang.Integer> r12) {
            android.util.Range r0 = r11.intersect(r10)
            int r0 = getRangeLength(r0)
            double r0 = (double) r0
            android.util.Range r10 = r12.intersect(r10)
            int r10 = getRangeLength(r10)
            double r2 = (double) r10
            int r10 = getRangeLength(r12)
            double r4 = (double) r10
            double r4 = r2 / r4
            int r10 = getRangeLength(r11)
            double r6 = (double) r10
            double r6 = r0 / r6
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L2f
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L57
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L58
            goto L57
        L2f:
            if (r10 != 0) goto L4f
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L36
            goto L57
        L36:
            if (r10 != 0) goto L58
            java.lang.Comparable r10 = r12.getLower()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Comparable r0 = r11.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r10 <= r0) goto L58
            goto L57
        L4f:
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L58
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L58
        L57:
            return r12
        L58:
            return r11
    }

    @androidx.annotation.NonNull
    private androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings createFeatureSettings(int r4, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> r5) {
            r3 = this;
            int r5 = getRequiredMaxBitDepth(r5)
            if (r4 == 0) goto L26
            r0 = 10
            if (r5 == r0) goto Lb
            goto L26
        Lb:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r3.mCameraId
            java.lang.String r4 = androidx.camera.core.impl.CameraMode.toLabelString(r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = "Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r5.<init>(r4)
            throw r5
        L26:
            androidx.camera.camera2.internal.SupportedSurfaceCombination$FeatureSettings r4 = androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings.of(r4, r5)
            return r4
    }

    @androidx.annotation.NonNull
    private java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> filterSupportedSizes(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> r11, @androidx.annotation.NonNull androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings r12, @androidx.annotation.Nullable android.util.Range<java.lang.Integer> r13) {
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.UseCaseConfig r2 = (androidx.camera.core.impl.UseCaseConfig) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.Object r5 = r11.get(r2)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r5.next()
            android.util.Size r6 = (android.util.Size) r6
            int r7 = r2.getInputFormat()
            int r8 = r12.getCameraMode()
            androidx.camera.core.impl.SurfaceSizeDefinition r9 = r10.getUpdatedSurfaceSizeDefinitionByFormat(r7)
            androidx.camera.core.impl.SurfaceConfig r8 = androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(r8, r7, r6, r9)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r8 = r8.getConfigSize()
            if (r13 == 0) goto L56
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r9 = r10.mCharacteristics
            int r7 = getMaxFrameRate(r9, r7, r6)
            goto L59
        L56:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L59:
            java.lang.Object r9 = r4.get(r8)
            java.util.Set r9 = (java.util.Set) r9
            if (r9 != 0) goto L69
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r4.put(r8, r9)
        L69:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L2d
            r3.add(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r9.add(r6)
            goto L2d
        L7e:
            r0.put(r2, r3)
            goto Ld
        L82:
            return r0
    }

    private void generate10BitSupportedCombinationList() {
            r2 = this;
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r2.mSurfaceCombinations10Bit
            java.util.List r1 = androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.get10BitSupportedCombinationList()
            r0.addAll(r1)
            return
    }

    private void generateConcurrentSupportedCombinationList() {
            r2 = this;
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r2.mConcurrentSurfaceCombinations
            java.util.List r1 = androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList()
            r0.addAll(r1)
            return
    }

    private void generateStreamUseCaseSupportedCombinationList() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lf
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r2.mSurfaceCombinationsStreamUseCase
            java.util.List r1 = androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList()
            r0.addAll(r1)
        Lf:
            return
    }

    private void generateSupportedCombinationList() {
            r4 = this;
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r4.mSurfaceCombinations
            int r1 = r4.mHardwareLevel
            boolean r2 = r4.mIsRawSupported
            boolean r3 = r4.mIsBurstCaptureSupported
            java.util.List r1 = androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.generateSupportedCombinationList(r1, r2, r3)
            r0.addAll(r1)
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r4.mSurfaceCombinations
            androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer r1 = r4.mExtraSupportedSurfaceCombinationsContainer
            java.lang.String r2 = r4.mCameraId
            int r3 = r4.mHardwareLevel
            java.util.List r1 = r1.get(r2, r3)
            r0.addAll(r1)
            return
    }

    private void generateSurfaceSizeDefinition() {
            r8 = this;
            androidx.camera.camera2.internal.DisplayInfoManager r0 = r8.mDisplayInfoManager
            android.util.Size r3 = r0.getPreviewSize()
            android.util.Size r5 = r8.getRecordSize()
            android.util.Size r1 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = androidx.camera.core.impl.SurfaceSizeDefinition.create(r1, r2, r3, r4, r5, r6, r7)
            r8.mSurfaceSizeDefinition = r0
            return
    }

    private void generateUltraHighSupportedCombinationList() {
            r2 = this;
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r2.mUltraHighSurfaceCombinations
            java.util.List r1 = androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList()
            r0.addAll(r1)
            return
    }

    private java.util.List<java.util.List<android.util.Size>> getAllPossibleSizeArrangements(java.util.List<java.util.List<android.util.Size>> r13) {
            r12 = this;
            java.util.Iterator r0 = r13.iterator()
            r1 = 1
            r2 = 1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r2 = r2 * r3
            goto L6
        L19:
            if (r2 == 0) goto L7d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
            r4 = 0
        L22:
            if (r4 >= r2) goto L2f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.add(r5)
            int r4 = r4 + 1
            goto L22
        L2f:
            java.lang.Object r4 = r13.get(r3)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r4 = r2 / r4
            r6 = r2
            r5 = 0
        L3d:
            int r7 = r13.size()
            if (r5 >= r7) goto L7c
            java.lang.Object r7 = r13.get(r5)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
        L4a:
            if (r8 >= r2) goto L61
            java.lang.Object r9 = r0.get(r8)
            java.util.List r9 = (java.util.List) r9
            int r10 = r8 % r6
            int r10 = r10 / r4
            java.lang.Object r10 = r7.get(r10)
            android.util.Size r10 = (android.util.Size) r10
            r9.add(r10)
            int r8 = r8 + 1
            goto L4a
        L61:
            int r7 = r13.size()
            int r7 = r7 - r1
            if (r5 >= r7) goto L79
            int r6 = r5 + 1
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int r6 = r4 / r6
            r11 = r6
            r6 = r4
            r4 = r11
        L79:
            int r5 = r5 + 1
            goto L3d
        L7c:
            return r0
        L7d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed to find supported resolutions."
            r13.<init>(r0)
            throw r13
    }

    @androidx.annotation.NonNull
    private android.util.Range<java.lang.Integer> getClosestSupportedDeviceFrameRate(@androidx.annotation.Nullable android.util.Range<java.lang.Integer> r9, int r10) {
            r8 = this;
            if (r9 == 0) goto Lc3
            android.util.Range<java.lang.Integer> r0 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r1 = r9.equals(r0)
            if (r1 == 0) goto Lc
            goto Lc3
        Lc:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = r8.mCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r1 = r1.get(r2)
            android.util.Range[] r1 = (android.util.Range[]) r1
            if (r1 != 0) goto L19
            return r0
        L19:
            android.util.Range r2 = new android.util.Range
            java.lang.Comparable r3 = r9.getLower()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = java.lang.Math.min(r3, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Comparable r9 = r9.getUpper()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = java.lang.Math.min(r9, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2.<init>(r3, r9)
            int r9 = r1.length
            r3 = 0
            r4 = 0
        L45:
            if (r3 >= r9) goto Lc2
            r5 = r1[r3]
            java.lang.Comparable r6 = r5.getLower()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r10 < r6) goto Lbf
            android.util.Range<java.lang.Integer> r6 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L5e
            r0 = r5
        L5e:
            boolean r6 = r5.equals(r2)
            if (r6 == 0) goto L66
            r0 = r5
            goto Lc2
        L66:
            android.util.Range r6 = r5.intersect(r2)     // Catch: java.lang.IllegalArgumentException -> L82
            int r6 = getRangeLength(r6)     // Catch: java.lang.IllegalArgumentException -> L82
            if (r4 != 0) goto L72
            r4 = r6
            goto L84
        L72:
            if (r6 < r4) goto L80
            android.util.Range r0 = compareIntersectingRanges(r2, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L82
            android.util.Range r6 = r2.intersect(r0)     // Catch: java.lang.IllegalArgumentException -> L82
            int r4 = getRangeLength(r6)     // Catch: java.lang.IllegalArgumentException -> L82
        L80:
            r5 = r0
            goto L84
        L82:
            goto L86
        L84:
            r0 = r5
            goto Lbf
        L86:
            if (r4 != 0) goto Lbf
            int r6 = getRangeDistance(r5, r2)
            int r7 = getRangeDistance(r0, r2)
            if (r6 >= r7) goto L93
            goto Lbe
        L93:
            int r6 = getRangeDistance(r5, r2)
            int r7 = getRangeDistance(r0, r2)
            if (r6 != r7) goto Lbf
            java.lang.Comparable r6 = r5.getLower()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Comparable r7 = r0.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 <= r7) goto Lb4
            goto Lbe
        Lb4:
            int r6 = getRangeLength(r5)
            int r7 = getRangeLength(r0)
            if (r6 >= r7) goto Lbf
        Lbe:
            goto L84
        Lbf:
            int r3 = r3 + 1
            goto L45
        Lc2:
            return r0
        Lc3:
            android.util.Range<java.lang.Integer> r9 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            return r9
    }

    static int getMaxFrameRate(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2, int r3, android.util.Size r4) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: java.lang.Exception -> L15
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L15
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch: java.lang.Exception -> L15
            long r2 = r2.getOutputMinFrameDuration(r3, r4)     // Catch: java.lang.Exception -> L15
            double r2 = (double) r2
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r2
            int r2 = (int) r0
            return r2
        L15:
            r2 = 0
            return r2
    }

    private android.util.Size getMaxOutputSizeByFormat(android.hardware.camera2.params.StreamConfigurationMap r6, int r7, boolean r8) {
            r5 = this;
            r0 = 34
            if (r7 != r0) goto Lb
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r6.getOutputSizes(r0)
            goto Lf
        Lb:
            android.util.Size[] r0 = r6.getOutputSizes(r7)
        Lf:
            if (r0 == 0) goto L56
            int r1 = r0.length
            if (r1 != 0) goto L15
            goto L56
        L15:
            androidx.camera.core.impl.utils.CompareSizesByArea r1 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r1.<init>()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L42
            if (r8 == 0) goto L42
            android.util.Size[] r6 = androidx.camera.camera2.internal.SupportedSurfaceCombination.Api23Impl.getHighResolutionOutputSizes(r6, r7)
            if (r6 == 0) goto L42
            int r7 = r6.length
            if (r7 <= 0) goto L42
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.Object r6 = java.util.Collections.max(r6, r1)
            r2 = r6
            android.util.Size r2 = (android.util.Size) r2
        L42:
            r6 = 2
            android.util.Size[] r6 = new android.util.Size[r6]
            r7 = 0
            r6[r7] = r0
            r7 = 1
            r6[r7] = r2
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.Object r6 = java.util.Collections.max(r6, r1)
            android.util.Size r6 = (android.util.Size) r6
            return r6
        L56:
            r6 = 0
            return r6
    }

    private int getMaxSupportedFpsFromAttachedSurfaces(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 2147483647(0x7fffffff, float:NaN)
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r4.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r1 = (androidx.camera.core.impl.AttachedSurfaceInfo) r1
            int r2 = r1.getImageFormat()
            android.util.Size r1 = r1.getSize()
            int r0 = r3.getUpdatedMaximumFps(r0, r2, r1)
            goto L7
        L20:
            return r0
    }

    private static int getRangeDistance(android.util.Range<java.lang.Integer> r2, android.util.Range<java.lang.Integer> r3) {
            java.lang.Comparable r0 = r3.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.Comparable r0 = r3.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.String r1 = "Ranges must not intersect"
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.lang.Comparable r0 = r2.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Comparable r1 = r3.getUpper()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 <= r1) goto L4c
            java.lang.Comparable r2 = r2.getLower()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = r2 - r3
            return r2
        L4c:
            java.lang.Comparable r3 = r3.getLower()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Comparable r2 = r2.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r3 - r2
            return r3
    }

    private static int getRangeLength(android.util.Range<java.lang.Integer> r1) {
            java.lang.Comparable r0 = r1.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r0 = r0 - r1
            int r0 = r0 + 1
            return r0
    }

    @androidx.annotation.NonNull
    private android.util.Size getRecordSize() {
            r3 = this;
            java.lang.String r0 = r3.mCameraId     // Catch: java.lang.NumberFormatException -> L28
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L28
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 1
            boolean r1 = r1.hasProfile(r0, r2)
            if (r1 == 0) goto L16
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r1 = r1.get(r0, r2)
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L23
            android.util.Size r0 = new android.util.Size
            int r2 = r1.videoFrameWidth
            int r1 = r1.videoFrameHeight
            r0.<init>(r2, r1)
            return r0
        L23:
            android.util.Size r0 = r3.getRecordSizeByHasProfile(r0)
            return r0
        L28:
            android.util.Size r0 = r3.getRecordSizeFromStreamConfigurationMap()
            return r0
    }

    @androidx.annotation.NonNull
    private android.util.Size getRecordSizeByHasProfile(int r4) {
            r3 = this;
            android.util.Size r0 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 10
            boolean r1 = r1.hasProfile(r4, r2)
            if (r1 == 0) goto L13
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r4 = r1.get(r4, r2)
            goto L66
        L13:
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 8
            boolean r1 = r1.hasProfile(r4, r2)
            if (r1 == 0) goto L24
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r4 = r1.get(r4, r2)
            goto L66
        L24:
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 12
            boolean r1 = r1.hasProfile(r4, r2)
            if (r1 == 0) goto L35
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r4 = r1.get(r4, r2)
            goto L66
        L35:
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 6
            boolean r1 = r1.hasProfile(r4, r2)
            if (r1 == 0) goto L45
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r4 = r1.get(r4, r2)
            goto L66
        L45:
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 5
            boolean r1 = r1.hasProfile(r4, r2)
            if (r1 == 0) goto L55
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r4 = r1.get(r4, r2)
            goto L66
        L55:
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            r2 = 4
            boolean r1 = r1.hasProfile(r4, r2)
            if (r1 == 0) goto L65
            androidx.camera.camera2.internal.CamcorderProfileHelper r1 = r3.mCamcorderProfileHelper
            android.media.CamcorderProfile r4 = r1.get(r4, r2)
            goto L66
        L65:
            r4 = 0
        L66:
            if (r4 == 0) goto L71
            android.util.Size r0 = new android.util.Size
            int r1 = r4.videoFrameWidth
            int r4 = r4.videoFrameHeight
            r0.<init>(r1, r4)
        L71:
            return r0
    }

    @androidx.annotation.NonNull
    private android.util.Size getRecordSizeFromStreamConfigurationMap() {
            r7 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r7.mCharacteristics
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r0.getStreamConfigurationMapCompat()
            android.hardware.camera2.params.StreamConfigurationMap r0 = r0.toStreamConfigurationMap()
            java.lang.Class<android.media.MediaRecorder> r1 = android.media.MediaRecorder.class
            android.util.Size[] r0 = r0.getOutputSizes(r1)
            if (r0 != 0) goto L15
            android.util.Size r0 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P
            return r0
        L15:
            androidx.camera.core.impl.utils.CompareSizesByArea r1 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r2 = 1
            r1.<init>(r2)
            java.util.Arrays.sort(r0, r1)
            int r1 = r0.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L3e
            r3 = r0[r2]
            int r4 = r3.getWidth()
            android.util.Size r5 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1080P
            int r6 = r5.getWidth()
            if (r4 > r6) goto L3b
            int r4 = r3.getHeight()
            int r5 = r5.getHeight()
            if (r4 > r5) goto L3b
            return r3
        L3b:
            int r2 = r2 + 1
            goto L20
        L3e:
            android.util.Size r0 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P
            return r0
    }

    private static int getRequiredMaxBitDepth(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> r2) {
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            androidx.camera.core.DynamicRange r0 = (androidx.camera.core.DynamicRange) r0
            int r0 = r0.getBitDepth()
            r1 = 10
            if (r0 != r1) goto L8
            return r1
        L1d:
            r2 = 8
            return r2
    }

    private java.util.List<androidx.camera.core.impl.SurfaceCombination> getSurfaceCombinationsByFeatureSettings(@androidx.annotation.NonNull androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings r4) {
            r3 = this;
            java.util.Map<androidx.camera.camera2.internal.SupportedSurfaceCombination$FeatureSettings, java.util.List<androidx.camera.core.impl.SurfaceCombination>> r0 = r3.mFeatureSettingsToSupportedCombinationsMap
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L11
            java.util.Map<androidx.camera.camera2.internal.SupportedSurfaceCombination$FeatureSettings, java.util.List<androidx.camera.core.impl.SurfaceCombination>> r0 = r3.mFeatureSettingsToSupportedCombinationsMap
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            return r4
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.getRequiredMaxBitDepth()
            r2 = 8
            if (r1 != r2) goto L3c
            int r1 = r4.getCameraMode()
            r2 = 1
            if (r1 == r2) goto L39
            r2 = 2
            if (r1 == r2) goto L2e
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r1 = r3.mSurfaceCombinations
            r0.addAll(r1)
            goto L4f
        L2e:
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r1 = r3.mUltraHighSurfaceCombinations
            r0.addAll(r1)
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r1 = r3.mSurfaceCombinations
            r0.addAll(r1)
            goto L4f
        L39:
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r0 = r3.mConcurrentSurfaceCombinations
            goto L4f
        L3c:
            int r1 = r4.getRequiredMaxBitDepth()
            r2 = 10
            if (r1 != r2) goto L4f
            int r1 = r4.getCameraMode()
            if (r1 != 0) goto L4f
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r1 = r3.mSurfaceCombinations10Bit
            r0.addAll(r1)
        L4f:
            java.util.Map<androidx.camera.camera2.internal.SupportedSurfaceCombination$FeatureSettings, java.util.List<androidx.camera.core.impl.SurfaceCombination>> r1 = r3.mFeatureSettingsToSupportedCombinationsMap
            r1.put(r4, r0)
            return r0
    }

    private android.util.Pair<java.util.List<androidx.camera.core.impl.SurfaceConfig>, java.lang.Integer> getSurfaceConfigListAndFpsCeiling(int r5, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r6, java.util.List<android.util.Size> r7, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> r8, java.util.List<java.lang.Integer> r9, int r10, @androidx.annotation.Nullable java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> r11, @androidx.annotation.Nullable java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> r12) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r6.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r1 = (androidx.camera.core.impl.AttachedSurfaceInfo) r1
            androidx.camera.core.impl.SurfaceConfig r2 = r1.getSurfaceConfig()
            r0.add(r2)
            if (r11 == 0) goto L9
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.put(r2, r1)
            goto L9
        L2c:
            r6 = 0
        L2d:
            int r11 = r7.size()
            if (r6 >= r11) goto L72
            java.lang.Object r11 = r7.get(r6)
            android.util.Size r11 = (android.util.Size) r11
            java.lang.Object r1 = r9.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r1 = r8.get(r1)
            androidx.camera.core.impl.UseCaseConfig r1 = (androidx.camera.core.impl.UseCaseConfig) r1
            int r2 = r1.getInputFormat()
            androidx.camera.core.impl.SurfaceSizeDefinition r3 = r4.getUpdatedSurfaceSizeDefinitionByFormat(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(r5, r2, r11, r3)
            r0.add(r2)
            if (r12 == 0) goto L67
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.put(r2, r1)
        L67:
            int r1 = r1.getInputFormat()
            int r10 = r4.getUpdatedMaximumFps(r10, r1, r11)
            int r6 = r6 + 1
            goto L2d
        L72:
            android.util.Pair r5 = new android.util.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r5.<init>(r0, r6)
            return r5
    }

    @androidx.annotation.Nullable
    private android.util.Range<java.lang.Integer> getTargetFpsRange(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> r5, @androidx.annotation.NonNull java.util.List<java.lang.Integer> r6) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r4.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r2 = (androidx.camera.core.impl.AttachedSurfaceInfo) r2
            android.util.Range r2 = r2.getTargetFrameRate()
            android.util.Range r1 = r3.getUpdatedTargetFramerate(r2, r1)
            goto L6
        L1b:
            java.util.Iterator r4 = r6.iterator()
        L1f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r6 = r5.get(r6)
            androidx.camera.core.impl.UseCaseConfig r6 = (androidx.camera.core.impl.UseCaseConfig) r6
            android.util.Range r6 = r6.getTargetFrameRate(r0)
            android.util.Range r1 = r3.getUpdatedTargetFramerate(r6, r1)
            goto L1f
        L3e:
            return r1
    }

    private int getUpdatedMaximumFps(int r2, int r3, android.util.Size r4) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r1.mCharacteristics
            int r3 = getMaxFrameRate(r0, r3, r4)
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    private android.util.Range<java.lang.Integer> getUpdatedTargetFramerate(android.util.Range<java.lang.Integer> r1, android.util.Range<java.lang.Integer> r2) {
            r0 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            if (r1 == 0) goto La
            android.util.Range r1 = r2.intersect(r1)     // Catch: java.lang.IllegalArgumentException -> La
            return r1
        La:
            return r2
    }

    private java.util.List<java.lang.Integer> getUseCasesPriorityOrder(java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        Le:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.UseCaseConfig r3 = (androidx.camera.core.impl.UseCaseConfig) r3
            int r3 = r3.getSurfaceOccupancyPriority(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto Le
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto Le
        L31:
            java.util.Collections.sort(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Iterator r3 = r8.iterator()
        L4f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r3.next()
            androidx.camera.core.impl.UseCaseConfig r5 = (androidx.camera.core.impl.UseCaseConfig) r5
            int r6 = r5.getSurfaceOccupancyPriority(r4)
            if (r2 != r6) goto L4f
            int r5 = r8.indexOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L4f
        L6d:
            return r0
    }

    private boolean isUseCasesCombinationSupported(@androidx.annotation.NonNull androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings r8, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r9, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> r10) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L9:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r9.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r1 = (androidx.camera.core.impl.AttachedSurfaceInfo) r1
            androidx.camera.core.impl.SurfaceConfig r1 = r1.getSurfaceConfig()
            r0.add(r1)
            goto L9
        L1d:
            androidx.camera.core.impl.utils.CompareSizesByArea r9 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r9.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.UseCaseConfig r2 = (androidx.camera.core.impl.UseCaseConfig) r2
            java.lang.Object r3 = r10.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L46
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "No available output size is found for "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            androidx.core.util.Preconditions.checkArgument(r4, r5)
            java.lang.Object r3 = java.util.Collections.min(r3, r9)
            android.util.Size r3 = (android.util.Size) r3
            int r2 = r2.getInputFormat()
            int r4 = r8.getCameraMode()
            androidx.camera.core.impl.SurfaceSizeDefinition r5 = r7.getUpdatedSurfaceSizeDefinitionByFormat(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(r4, r2, r3, r5)
            r0.add(r2)
            goto L2a
        L7a:
            boolean r8 = r7.checkSupported(r8, r0)
            return r8
    }

    private void refreshPreviewSize() {
            r8 = this;
            androidx.camera.camera2.internal.DisplayInfoManager r0 = r8.mDisplayInfoManager
            r0.refresh()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            if (r0 != 0) goto Ld
            r8.generateSurfaceSizeDefinition()
            return
        Ld:
            androidx.camera.camera2.internal.DisplayInfoManager r0 = r8.mDisplayInfoManager
            android.util.Size r3 = r0.getPreviewSize()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            android.util.Size r1 = r0.getAnalysisSize()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            java.util.Map r2 = r0.getS720pSizeMap()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            java.util.Map r4 = r0.getS1440pSizeMap()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            android.util.Size r5 = r0.getRecordSize()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            java.util.Map r6 = r0.getMaximumSizeMap()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r8.mSurfaceSizeDefinition
            java.util.Map r7 = r0.getUltraMaximumSizeMap()
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = androidx.camera.core.impl.SurfaceSizeDefinition.create(r1, r2, r3, r4, r5, r6, r7)
            r8.mSurfaceSizeDefinition = r0
            return
    }

    private void updateMaximumSizeByFormat(@androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r3, int r4) {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCharacteristics
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r0.getStreamConfigurationMapCompat()
            android.hardware.camera2.params.StreamConfigurationMap r0 = r0.toStreamConfigurationMap()
            r1 = 1
            android.util.Size r0 = r2.getMaxOutputSizeByFormat(r0, r4, r1)
            if (r0 == 0) goto L18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r0)
        L18:
            return
    }

    private void updateS720pOrS1440pSizeByFormat(@androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r4, @androidx.annotation.NonNull android.util.Size r5, int r6) {
            r3 = this;
            boolean r0 = r3.mIsConcurrentCameraModeSupported
            if (r0 != 0) goto L5
            return
        L5:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCharacteristics
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r0.getStreamConfigurationMapCompat()
            android.hardware.camera2.params.StreamConfigurationMap r0 = r0.toStreamConfigurationMap()
            r1 = 0
            android.util.Size r0 = r3.getMaxOutputSizeByFormat(r0, r6, r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            if (r0 != 0) goto L1b
            goto L32
        L1b:
            r2 = 2
            android.util.Size[] r2 = new android.util.Size[r2]
            r2[r1] = r5
            r5 = 1
            r2[r5] = r0
            java.util.List r5 = java.util.Arrays.asList(r2)
            androidx.camera.core.impl.utils.CompareSizesByArea r0 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r0.<init>()
            java.lang.Object r5 = java.util.Collections.min(r5, r0)
            android.util.Size r5 = (android.util.Size) r5
        L32:
            r4.put(r6, r5)
            return
    }

    private void updateUltraMaximumSizeByFormat(@androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r4, int r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L26
            boolean r0 = r3.mIsUltraHighResolutionSensorSupported
            if (r0 != 0) goto Lb
            goto L26
        Lb:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = androidx.camera.camera2.internal.g2.a()
            java.lang.Object r0 = r0.get(r1)
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2 = 1
            android.util.Size r5 = r3.getMaxOutputSizeByFormat(r0, r5, r2)
            r4.put(r1, r5)
        L26:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    java.util.List<android.util.Size> applyResolutionSelectionOrderRelatedWorkarounds(@androidx.annotation.NonNull java.util.List<android.util.Size> r6, int r7) {
            r5 = this;
            androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio r0 = r5.mTargetAspectRatio
            java.lang.String r1 = r5.mCameraId
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r5.mCharacteristics
            int r0 = r0.get(r1, r2)
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L2d
            r1 = 2
            if (r0 == r1) goto L14
            r0 = 0
            goto L32
        L14:
            r0 = 256(0x100, float:3.59E-43)
            androidx.camera.core.impl.SurfaceSizeDefinition r1 = r5.getUpdatedSurfaceSizeDefinitionByFormat(r0)
            android.util.Size r0 = r1.getMaximumSize(r0)
            android.util.Rational r1 = new android.util.Rational
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            r1.<init>(r2, r0)
            r0 = r1
            goto L32
        L2d:
            android.util.Rational r0 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9
            goto L32
        L30:
            android.util.Rational r0 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3
        L32:
            if (r0 != 0) goto L35
            goto L62
        L35:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L43:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r6.next()
            android.util.Size r3 = (android.util.Size) r3
            boolean r4 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r3, r0)
            if (r4 == 0) goto L59
            r1.add(r3)
            goto L43
        L59:
            r2.add(r3)
            goto L43
        L5d:
            r6 = 0
            r2.addAll(r6, r1)
            r6 = r2
        L62:
            androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector r0 = r5.mResolutionCorrector
            androidx.camera.core.impl.SurfaceConfig$ConfigType r7 = androidx.camera.core.impl.SurfaceConfig.getConfigType(r7)
            java.util.List r6 = r0.insertOrPrioritize(r7, r6)
            return r6
    }

    boolean checkSupported(@androidx.annotation.NonNull androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings r4, java.util.List<androidx.camera.core.impl.SurfaceConfig> r5) {
            r3 = this;
            java.util.List r4 = r3.getSurfaceCombinationsByFeatureSettings(r4)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        La:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r1 = r4.next()
            androidx.camera.core.impl.SurfaceCombination r1 = (androidx.camera.core.impl.SurfaceCombination) r1
            java.util.List r1 = r1.getOrderedSupportedSurfaceConfigList(r5)
            if (r1 == 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto La
        L21:
            return r1
    }

    java.lang.String getCameraId() {
            r1 = this;
            java.lang.String r0 = r1.mCameraId
            return r0
    }

    @androidx.annotation.Nullable
    java.util.List<androidx.camera.core.impl.SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(@androidx.annotation.NonNull androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings r3, java.util.List<androidx.camera.core.impl.SurfaceConfig> r4) {
            r2 = this;
            boolean r3 = androidx.camera.camera2.internal.StreamUseCaseUtil.shouldUseStreamUseCase(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.List<androidx.camera.core.impl.SurfaceCombination> r3 = r2.mSurfaceCombinationsStreamUseCase
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            androidx.camera.core.impl.SurfaceCombination r1 = (androidx.camera.core.impl.SurfaceCombination) r1
            java.util.List r1 = r1.getOrderedSupportedSurfaceConfigList(r4)
            if (r1 == 0) goto Le
            return r1
        L21:
            return r0
    }

    @androidx.annotation.NonNull
    android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecifications(int r31, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r32, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> r33) {
            r30 = this;
            r0 = r30
            r2 = r32
            r1 = r33
            r0.refreshPreviewSize()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Set r3 = r1.keySet()
            r4.<init>(r3)
            java.util.List r5 = r0.getUseCasesPriorityOrder(r4)
            androidx.camera.camera2.internal.DynamicRangeResolver r3 = r0.mDynamicRangeResolver
            java.util.Map r9 = r3.resolveAndValidateDynamicRanges(r2, r4, r5)
            r3 = r31
            androidx.camera.camera2.internal.SupportedSurfaceCombination$FeatureSettings r10 = r0.createFeatureSettings(r3, r9)
            boolean r11 = r0.isUseCasesCombinationSupported(r10, r2, r1)
            java.lang.String r12 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            java.lang.String r13 = " New configs: "
            java.lang.String r14 = "No supported surface combination is found for camera device - Id : "
            if (r11 == 0) goto L2c0
            android.util.Range r15 = r0.getTargetFpsRange(r2, r4, r5)
            java.util.Map r1 = r0.filterSupportedSizes(r1, r10, r15)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r5.iterator()
        L3f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r8 = r4.get(r8)
            androidx.camera.core.impl.UseCaseConfig r8 = (androidx.camera.core.impl.UseCaseConfig) r8
            java.lang.Object r16 = r1.get(r8)
            r33 = r1
            r1 = r16
            java.util.List r1 = (java.util.List) r1
            int r8 = r8.getInputFormat()
            java.util.List r1 = r0.applyResolutionSelectionOrderRelatedWorkarounds(r1, r8)
            r6.add(r1)
            r1 = r33
            goto L3f
        L6d:
            java.util.List r16 = r0.getAllPossibleSizeArrangements(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            boolean r17 = androidx.camera.camera2.internal.StreamUseCaseUtil.containsZslUseCase(r2, r4)
            r18 = r6
            int r6 = r0.getMaxSupportedFpsFromAttachedSurfaces(r2)
            r33 = r1
            boolean r1 = r0.mIsStreamUseCaseSupported
            r19 = 0
            if (r1 == 0) goto L122
            if (r17 != 0) goto L122
            java.util.Iterator r17 = r16.iterator()
            r1 = r19
        L9f:
            boolean r20 = r17.hasNext()
            if (r20 == 0) goto Lee
            java.lang.Object r1 = r17.next()
            java.util.List r1 = (java.util.List) r1
            r20 = r3
            r3 = r1
            r1 = r20
            r20 = r11
            r11 = r18
            android.util.Pair r3 = r0.getSurfaceConfigListAndFpsCeiling(r1, r2, r3, r4, r5, r6, r7, r8)
            r29 = r8
            r8 = r6
            r6 = r7
            r7 = r29
            java.lang.Object r1 = r3.first
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = r0.getOrderedSupportedStreamUseCaseSurfaceConfigList(r10, r1)
            if (r1 == 0) goto Ld0
            boolean r3 = androidx.camera.camera2.internal.StreamUseCaseUtil.areCaptureTypesEligible(r6, r7, r1)
            if (r3 != 0) goto Ld0
            r1 = r19
        Ld0:
            if (r1 == 0) goto Ldd
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r0.mCharacteristics
            boolean r3 = androidx.camera.camera2.internal.StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(r3, r1)
            if (r3 == 0) goto Ldb
            goto Lf8
        Ldb:
            r1 = r19
        Ldd:
            r6.clear()
            r7.clear()
            r3 = r7
            r7 = r6
            r6 = r8
            r8 = r3
            r3 = r31
            r18 = r11
            r11 = r20
            goto L9f
        Lee:
            r20 = r8
            r8 = r6
            r6 = r7
            r7 = r20
            r20 = r11
            r11 = r18
        Lf8:
            if (r1 != 0) goto L120
            if (r20 == 0) goto Lfd
            goto L120
        Lfd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            java.lang.String r5 = r0.mCameraId
            r3.append(r5)
            r3.append(r12)
            r3.append(r2)
            r3.append(r13)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L120:
            r12 = r1
            goto L12a
        L122:
            r11 = r8
            r8 = r6
            r6 = r7
            r7 = r11
            r11 = r18
            r12 = r19
        L12a:
            java.util.Iterator r16 = r16.iterator()
            r17 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r22 = r19
            r23 = r22
            r3 = 2147483647(0x7fffffff, float:NaN)
            r18 = 0
            r20 = 0
            r21 = 2147483647(0x7fffffff, float:NaN)
        L141:
            boolean r24 = r16.hasNext()
            if (r24 == 0) goto L1e7
            java.lang.Object r24 = r16.next()
            java.util.List r24 = (java.util.List) r24
            r25 = r7
            r7 = 0
            r26 = r6
            r6 = r8
            r8 = 0
            r1 = r31
            r27 = r13
            r28 = r25
            r13 = r3
            r25 = r12
            r3 = r24
            r12 = 2147483647(0x7fffffff, float:NaN)
            r24 = r14
            r14 = r26
            android.util.Pair r7 = r0.getSurfaceConfigListAndFpsCeiling(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r7.first
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r15 == 0) goto L188
            if (r6 <= r7) goto L188
            java.lang.Comparable r26 = r15.getLower()
            java.lang.Integer r26 = (java.lang.Integer) r26
            int r8 = r26.intValue()
            if (r7 >= r8) goto L188
            r8 = 0
            goto L189
        L188:
            r8 = 1
        L189:
            if (r18 != 0) goto L1aa
            boolean r26 = r0.checkSupported(r10, r1)
            if (r26 == 0) goto L1aa
            if (r13 != r12) goto L194
            goto L196
        L194:
            if (r13 >= r7) goto L199
        L196:
            r22 = r3
            r13 = r7
        L199:
            if (r8 == 0) goto L1aa
            if (r20 == 0) goto L1a5
            r6 = r3
            r3 = r7
            r1 = r21
        L1a1:
            r7 = r23
            goto L1f6
        L1a5:
            r22 = r3
            r13 = r7
            r18 = 1
        L1aa:
            if (r25 == 0) goto L1d3
            if (r20 != 0) goto L1d3
            java.util.List r1 = r0.getOrderedSupportedStreamUseCaseSurfaceConfigList(r10, r1)
            if (r1 == 0) goto L1d3
            r1 = r21
            if (r1 != r12) goto L1b9
            goto L1bb
        L1b9:
            if (r1 >= r7) goto L1c0
        L1bb:
            r23 = r3
            r21 = r7
            goto L1c2
        L1c0:
            r21 = r1
        L1c2:
            if (r8 == 0) goto L1d7
            if (r18 == 0) goto L1cc
            r1 = r7
            r6 = r22
            r7 = r3
            r3 = r13
            goto L1f6
        L1cc:
            r23 = r3
            r21 = r7
            r20 = 1
            goto L1d7
        L1d3:
            r1 = r21
            r21 = r1
        L1d7:
            r8 = r6
            r3 = r13
            r6 = r14
            r14 = r24
            r12 = r25
            r13 = r27
            r7 = r28
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L141
        L1e7:
            r28 = r7
            r25 = r12
            r27 = r13
            r24 = r14
            r1 = r21
            r13 = r3
            r14 = r6
            r6 = r22
            goto L1a1
        L1f6:
            if (r6 == 0) goto L28d
            if (r15 == 0) goto L1fe
            android.util.Range r19 = r0.getClosestSupportedDeviceFrameRate(r15, r3)
        L1fe:
            r8 = r19
            java.util.Iterator r10 = r4.iterator()
        L204:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L24b
            java.lang.Object r12 = r10.next()
            androidx.camera.core.impl.UseCaseConfig r12 = (androidx.camera.core.impl.UseCaseConfig) r12
            int r13 = r4.indexOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            int r13 = r5.indexOf(r13)
            java.lang.Object r13 = r6.get(r13)
            android.util.Size r13 = (android.util.Size) r13
            androidx.camera.core.impl.StreamSpec$Builder r13 = androidx.camera.core.impl.StreamSpec.builder(r13)
            java.lang.Object r15 = r9.get(r12)
            androidx.camera.core.DynamicRange r15 = (androidx.camera.core.DynamicRange) r15
            java.lang.Object r15 = androidx.core.util.Preconditions.checkNotNull(r15)
            androidx.camera.core.DynamicRange r15 = (androidx.camera.core.DynamicRange) r15
            androidx.camera.core.impl.StreamSpec$Builder r13 = r13.setDynamicRange(r15)
            androidx.camera.camera2.impl.Camera2ImplConfig r15 = androidx.camera.camera2.internal.StreamUseCaseUtil.getStreamSpecImplementationOptions(r12)
            androidx.camera.core.impl.StreamSpec$Builder r13 = r13.setImplementationOptions(r15)
            if (r8 == 0) goto L243
            r13.setExpectedFrameRateRange(r8)
        L243:
            androidx.camera.core.impl.StreamSpec r13 = r13.build()
            r11.put(r12, r13)
            goto L204
        L24b:
            if (r25 == 0) goto L270
            if (r3 != r1) goto L270
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 != r3) goto L270
            r1 = 0
        L25a:
            int r3 = r6.size()
            if (r1 >= r3) goto L276
            java.lang.Object r3 = r6.get(r1)
            android.util.Size r3 = (android.util.Size) r3
            java.lang.Object r4 = r7.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L273
        L270:
            r3 = r33
            goto L287
        L273:
            int r1 = r1 + 1
            goto L25a
        L276:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = r0.mCharacteristics
            r3 = r33
            boolean r1 = androidx.camera.camera2.internal.StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(r1, r2, r11, r3)
            if (r1 != 0) goto L287
            r1 = r25
            r7 = r28
            androidx.camera.camera2.internal.StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(r11, r3, r14, r7, r1)
        L287:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r11, r3)
            return r1
        L28d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = r24
            r3.append(r5)
            java.lang.String r5 = r0.mCameraId
            r3.append(r5)
            java.lang.String r5 = " and Hardware level: "
            r3.append(r5)
            int r5 = r0.mHardwareLevel
            r3.append(r5)
            java.lang.String r5 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r3.append(r5)
            r3.append(r2)
            r6 = r27
            r3.append(r6)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L2c0:
            r6 = r13
            r5 = r14
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r5 = r0.mCameraId
            r3.append(r5)
            r3.append(r12)
            r3.append(r2)
            r3.append(r6)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.impl.SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.mSurfaceSizeDefinitionFormats
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3d
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r2.mSurfaceSizeDefinition
            java.util.Map r0 = r0.getS720pSizeMap()
            android.util.Size r1 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_720P
            r2.updateS720pOrS1440pSizeByFormat(r0, r1, r3)
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r2.mSurfaceSizeDefinition
            java.util.Map r0 = r0.getS1440pSizeMap()
            android.util.Size r1 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1440P
            r2.updateS720pOrS1440pSizeByFormat(r0, r1, r3)
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r2.mSurfaceSizeDefinition
            java.util.Map r0 = r0.getMaximumSizeMap()
            r2.updateMaximumSizeByFormat(r0, r3)
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r2.mSurfaceSizeDefinition
            java.util.Map r0 = r0.getUltraMaximumSizeMap()
            r2.updateUltraMaximumSizeByFormat(r0, r3)
            java.util.List<java.lang.Integer> r0 = r2.mSurfaceSizeDefinitionFormats
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L3d:
            androidx.camera.core.impl.SurfaceSizeDefinition r3 = r2.mSurfaceSizeDefinition
            return r3
    }

    boolean isBurstCaptureSupported() {
            r1 = this;
            boolean r0 = r1.mIsBurstCaptureSupported
            return r0
    }

    boolean isRawSupported() {
            r1 = this;
            boolean r0 = r1.mIsRawSupported
            return r0
    }

    androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int r2, int r3, android.util.Size r4) {
            r1 = this;
            androidx.camera.core.impl.SurfaceSizeDefinition r0 = r1.getUpdatedSurfaceSizeDefinitionByFormat(r3)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(r2, r3, r4, r0)
            return r2
    }
}
