package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class StreamUseCaseUtil {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Long> STREAM_USE_CASE_STREAM_SPEC_OPTION = null;
    private static final java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = null;
    private static final java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = null;
    private static final java.lang.String TAG = "Camera2CameraImpl";

    static {
            r0 = 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "camera2.streamSpec.streamUseCase"
            java.lang.Class r3 = java.lang.Long.TYPE
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.core.impl.Config.Option.create(r2, r3)
            androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = r3
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L8c
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r5 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW
            r4.add(r5)
            r2.put(r1, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r4.add(r5)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r6 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS
            r4.add(r6)
            r6 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.put(r6, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r6 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE
            r4.add(r6)
            r7 = 2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.put(r7, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r7 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE
            r4.add(r7)
            r2.put(r0, r4)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2.add(r5)
            r2.add(r6)
            r2.add(r7)
            r3.put(r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r5)
            r1.add(r7)
            r3.put(r0, r1)
        L8c:
            return
    }

    private StreamUseCaseUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areCaptureTypesEligible(@androidx.annotation.NonNull java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> r8, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> r9, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SurfaceConfig> r10) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r10.size()
            r3 = 1
            if (r1 >= r2) goto L84
            java.lang.Object r2 = r10.get(r1)
            androidx.camera.core.impl.SurfaceConfig r2 = (androidx.camera.core.impl.SurfaceConfig) r2
            long r4 = r2.getStreamUseCase()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r8.get(r2)
            androidx.camera.core.impl.AttachedSurfaceInfo r2 = (androidx.camera.core.impl.AttachedSurfaceInfo) r2
            java.util.List r6 = r2.getCaptureTypes()
            int r6 = r6.size()
            if (r6 != r3) goto L3c
            java.util.List r3 = r2.getCaptureTypes()
            java.lang.Object r3 = r3.get(r0)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r3 = (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) r3
            goto L3e
        L3c:
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r3 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING
        L3e:
            java.util.List r2 = r2.getCaptureTypes()
            boolean r2 = isEligibleCaptureType(r3, r4, r2)
            if (r2 != 0) goto L79
            return r0
        L49:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L7c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r9.get(r2)
            androidx.camera.core.impl.UseCaseConfig r2 = (androidx.camera.core.impl.UseCaseConfig) r2
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r3 = r2.getCaptureType()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r6 = r2.getCaptureType()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r7 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING
            if (r6 != r7) goto L70
            androidx.camera.core.streamsharing.StreamSharingConfig r2 = (androidx.camera.core.streamsharing.StreamSharingConfig) r2
            java.util.List r2 = r2.getCaptureTypes()
            goto L72
        L70:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
        L72:
            boolean r2 = isEligibleCaptureType(r3, r4, r2)
            if (r2 != 0) goto L79
            return r0
        L79:
            int r1 = r1 + 1
            goto L2
        L7c:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "SurfaceConfig does not map to any use case"
            r8.<init>(r9)
            throw r8
        L84:
            return r3
    }

    private static boolean areStreamUseCasesAvailable(java.util.Set<java.lang.Long> r1, java.util.Set<java.lang.Long> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.Long r0 = (java.lang.Long) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L18:
            r1 = 1
            return r1
    }

    public static boolean areStreamUseCasesAvailableForSurfaceConfigs(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r6, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SurfaceConfig> r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            android.hardware.camera2.CameraCharacteristics$Key r0 = androidx.camera.camera2.internal.f2.a()
            java.lang.Object r6 = r6.get(r0)
            long[] r6 = (long[]) r6
            if (r6 == 0) goto L4e
            int r0 = r6.length
            if (r0 != 0) goto L18
            goto L4e
        L18:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r6.length
            r3 = 0
        L1f:
            if (r3 >= r1) goto L2d
            r4 = r6[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L1f
        L2d:
            java.util.Iterator r6 = r7.iterator()
        L31:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r6.next()
            androidx.camera.core.impl.SurfaceConfig r7 = (androidx.camera.core.impl.SurfaceConfig) r7
            long r3 = r7.getStreamUseCase()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            boolean r7 = r0.contains(r7)
            if (r7 != 0) goto L31
            return r2
        L4c:
            r6 = 1
            return r6
        L4e:
            return r2
    }

    public static boolean containsZslUseCase(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> r5) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r0 = (androidx.camera.core.impl.AttachedSurfaceInfo) r0
            java.util.List r3 = r0.getCaptureTypes()
            java.lang.Object r2 = r3.get(r2)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) r2
            androidx.camera.core.impl.Config r0 = r0.getImplementationOptions()
            boolean r0 = isZslUseCase(r0, r2)
            if (r0 == 0) goto L4
            return r1
        L27:
            java.util.Iterator r4 = r5.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r4.next()
            androidx.camera.core.impl.UseCaseConfig r5 = (androidx.camera.core.impl.UseCaseConfig) r5
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = r5.getCaptureType()
            boolean r5 = isZslUseCase(r5, r0)
            if (r5 == 0) goto L2b
            return r1
        L42:
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public static androidx.camera.camera2.impl.Camera2ImplConfig getStreamSpecImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r3) {
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r2 = r3.containsOption(r1)
            if (r2 == 0) goto L15
            java.lang.Object r2 = r3.retrieveOption(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.insertOption(r1, r2)
        L15:
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
            boolean r2 = r3.containsOption(r1)
            if (r2 == 0) goto L26
            java.lang.Object r2 = r3.retrieveOption(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r0.insertOption(r1, r2)
        L26:
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE
            boolean r2 = r3.containsOption(r1)
            if (r2 == 0) goto L37
            java.lang.Object r2 = r3.retrieveOption(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.insertOption(r1, r2)
        L37:
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            boolean r2 = r3.containsOption(r1)
            if (r2 == 0) goto L48
            java.lang.Object r3 = r3.retrieveOption(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0.insertOption(r1, r3)
        L48:
            androidx.camera.camera2.impl.Camera2ImplConfig r3 = new androidx.camera.camera2.impl.Camera2ImplConfig
            r3.<init>(r0)
            return r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    private static androidx.camera.core.impl.Config getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(androidx.camera.core.impl.Config r4, long r5) {
            androidx.camera.core.impl.Config$Option<java.lang.Long> r0 = androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION
            boolean r1 = r4.containsOption(r0)
            if (r1 == 0) goto L18
            java.lang.Object r1 = r4.retrieveOption(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L18
            r4 = 0
            return r4
        L18:
            androidx.camera.core.impl.MutableOptionsBundle r4 = androidx.camera.core.impl.MutableOptionsBundle.from(r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.insertOption(r0, r5)
            androidx.camera.camera2.impl.Camera2ImplConfig r5 = new androidx.camera.camera2.impl.Camera2ImplConfig
            r5.<init>(r4)
            return r5
    }

    private static boolean isEligibleCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r3, long r4, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING
            r1 = 1
            if (r3 != r0) goto L47
            java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType>> r3 = androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L1a
            return r2
        L1a:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            int r4 = r6.size()
            int r5 = r3.size()
            if (r4 == r5) goto L2f
            return r2
        L2f:
            java.util.Iterator r4 = r6.iterator()
        L33:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r5 = (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) r5
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L33
            return r2
        L46:
            return r1
        L47:
            java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType>> r6 = androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L64
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L64
            return r1
        L64:
            return r2
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public static boolean isStreamUseCaseSupported(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            android.hardware.camera2.CameraCharacteristics$Key r0 = androidx.camera.camera2.internal.f2.a()
            java.lang.Object r3 = r3.get(r0)
            long[] r3 = (long[]) r3
            if (r3 == 0) goto L1a
            int r3 = r3.length
            if (r3 != 0) goto L18
            goto L1a
        L18:
            r3 = 1
            return r3
        L1a:
            return r2
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    private static boolean isValidCamera2InteropOverride(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r10, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> r11, java.util.Set<java.lang.Long> r12) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
            boolean r1 = r10.hasNext()
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3e
            java.lang.Object r10 = r10.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r10 = (androidx.camera.core.impl.AttachedSurfaceInfo) r10
            androidx.camera.core.impl.Config r1 = r10.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r6 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r1 = r1.containsOption(r6)
            if (r1 != 0) goto L28
        L25:
            r10 = 0
            r1 = 1
            goto L40
        L28:
            androidx.camera.core.impl.Config r10 = r10.getImplementationOptions()
            java.lang.Object r10 = r10.retrieveOption(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r6 = r10.longValue()
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 != 0) goto L3b
            goto L25
        L3b:
            r10 = 1
        L3c:
            r1 = 0
            goto L40
        L3e:
            r10 = 0
            goto L3c
        L40:
            java.util.Iterator r11 = r11.iterator()
        L44:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r11.next()
            androidx.camera.core.impl.UseCaseConfig r6 = (androidx.camera.core.impl.UseCaseConfig) r6
            androidx.camera.core.impl.Config$Option<java.lang.Long> r7 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r8 = r6.containsOption(r7)
            if (r8 != 0) goto L5f
            if (r10 == 0) goto L5d
            throwInvalidCamera2InteropOverrideException()
        L5d:
            r1 = 1
            goto L44
        L5f:
            java.lang.Object r6 = r6.retrieveOption(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r7 = r6.longValue()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto L73
            if (r10 == 0) goto L5d
            throwInvalidCamera2InteropOverrideException()
            goto L5d
        L73:
            if (r1 == 0) goto L78
            throwInvalidCamera2InteropOverrideException()
        L78:
            r0.add(r6)
            r10 = 1
            goto L44
        L7d:
            if (r1 != 0) goto L86
            boolean r10 = areStreamUseCasesAvailable(r12, r0)
            if (r10 == 0) goto L86
            return r4
        L86:
            return r5
    }

    private static boolean isZslUseCase(androidx.camera.core.impl.Config r3, androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r4) {
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r3.retrieveOption(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE
            boolean r2 = r3.containsOption(r0)
            if (r2 != 0) goto L1b
            return r1
        L1b:
            java.lang.Object r3 = r3.retrieveOption(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = androidx.camera.camera2.internal.TemplateTypeUtil.getSessionConfigTemplateType(r4, r3)
            r4 = 5
            if (r3 != r4) goto L2e
            r3 = 1
            return r3
        L2e:
            return r1
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public static boolean populateStreamUseCaseStreamSpecOptionWithInteropOverride(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r7, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r8, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> r9, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set r1 = r9.keySet()
            r0.<init>(r1)
            java.util.Iterator r1 = r8.iterator()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r1.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r3 = (androidx.camera.core.impl.AttachedSurfaceInfo) r3
            androidx.camera.core.impl.Config r3 = r3.getImplementationOptions()
            androidx.core.util.Preconditions.checkNotNull(r3)
            goto L15
        L29:
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r1.next()
            androidx.camera.core.impl.UseCaseConfig r3 = (androidx.camera.core.impl.UseCaseConfig) r3
            java.lang.Object r3 = r9.get(r3)
            androidx.camera.core.impl.StreamSpec r3 = (androidx.camera.core.impl.StreamSpec) r3
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.camera.core.impl.StreamSpec r3 = (androidx.camera.core.impl.StreamSpec) r3
            androidx.camera.core.impl.Config r3 = r3.getImplementationOptions()
            androidx.core.util.Preconditions.checkNotNull(r3)
            goto L2d
        L4d:
            android.hardware.camera2.CameraCharacteristics$Key r1 = androidx.camera.camera2.internal.f2.a()
            java.lang.Object r7 = r7.get(r1)
            long[] r7 = (long[]) r7
            if (r7 == 0) goto Le5
            int r1 = r7.length
            if (r1 != 0) goto L5e
            goto Le5
        L5e:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r3 = r7.length
            r4 = 0
        L65:
            if (r4 >= r3) goto L73
            r5 = r7[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.add(r5)
            int r4 = r4 + 1
            goto L65
        L73:
            boolean r7 = isValidCamera2InteropOverride(r8, r0, r1)
            if (r7 == 0) goto Le5
            java.util.Iterator r7 = r8.iterator()
        L7d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La7
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r8 = (androidx.camera.core.impl.AttachedSurfaceInfo) r8
            androidx.camera.core.impl.Config r1 = r8.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r2 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            java.lang.Object r2 = r1.retrieveOption(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            androidx.camera.core.impl.Config r1 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(r1, r2)
            if (r1 == 0) goto L7d
            androidx.camera.core.impl.StreamSpec r1 = r8.toStreamSpec(r1)
            r10.put(r8, r1)
            goto L7d
        La7:
            java.util.Iterator r7 = r0.iterator()
        Lab:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Le3
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.UseCaseConfig r8 = (androidx.camera.core.impl.UseCaseConfig) r8
            java.lang.Object r10 = r9.get(r8)
            androidx.camera.core.impl.StreamSpec r10 = (androidx.camera.core.impl.StreamSpec) r10
            androidx.camera.core.impl.Config r0 = r10.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            java.lang.Object r1 = r0.retrieveOption(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            androidx.camera.core.impl.Config r0 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(r0, r1)
            if (r0 == 0) goto Lab
            androidx.camera.core.impl.StreamSpec$Builder r10 = r10.toBuilder()
            androidx.camera.core.impl.StreamSpec$Builder r10 = r10.setImplementationOptions(r0)
            androidx.camera.core.impl.StreamSpec r10 = r10.build()
            r9.put(r8, r10)
            goto Lab
        Le3:
            r7 = 1
            return r7
        Le5:
            return r2
    }

    public static void populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> r6, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> r7, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> r8, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> r9, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SurfaceConfig> r10) {
            r0 = 0
        L1:
            int r1 = r10.size()
            if (r0 >= r1) goto L75
            java.lang.Object r1 = r10.get(r0)
            androidx.camera.core.impl.SurfaceConfig r1 = (androidx.camera.core.impl.SurfaceConfig) r1
            long r1 = r1.getStreamUseCase()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L37
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r8.get(r3)
            androidx.camera.core.impl.AttachedSurfaceInfo r3 = (androidx.camera.core.impl.AttachedSurfaceInfo) r3
            androidx.camera.core.impl.Config r4 = r3.getImplementationOptions()
            androidx.camera.core.impl.Config r1 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(r4, r1)
            if (r1 == 0) goto L6a
            androidx.camera.core.impl.StreamSpec r1 = r3.toStreamSpec(r1)
            r7.put(r3, r1)
            goto L6a
        L37:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r9.containsKey(r3)
            if (r3 == 0) goto L6d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r9.get(r3)
            androidx.camera.core.impl.UseCaseConfig r3 = (androidx.camera.core.impl.UseCaseConfig) r3
            java.lang.Object r4 = r6.get(r3)
            androidx.camera.core.impl.StreamSpec r4 = (androidx.camera.core.impl.StreamSpec) r4
            androidx.camera.core.impl.Config r5 = r4.getImplementationOptions()
            androidx.camera.core.impl.Config r1 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(r5, r1)
            if (r1 == 0) goto L6a
            androidx.camera.core.impl.StreamSpec$Builder r2 = r4.toBuilder()
            androidx.camera.core.impl.StreamSpec$Builder r1 = r2.setImplementationOptions(r1)
            androidx.camera.core.impl.StreamSpec r1 = r1.build()
            r6.put(r3, r1)
        L6a:
            int r0 = r0 + 1
            goto L1
        L6d:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "SurfaceConfig does not map to any use case"
            r6.<init>(r7)
            throw r6
        L75:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public static void populateSurfaceToStreamUseCaseMapping(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.impl.SessionConfig> r6, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> r7, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.Iterator r7 = r6.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r7.next()
            androidx.camera.core.impl.SessionConfig r1 = (androidx.camera.core.impl.SessionConfig) r1
            androidx.camera.core.impl.Config r2 = r1.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r3 = androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION
            boolean r2 = r2.containsOption(r3)
            r4 = 0
            if (r2 == 0) goto L49
            java.util.List r2 = r1.getSurfaces()
            int r2 = r2.size()
            r5 = 1
            if (r2 == r5) goto L49
            java.util.List r6 = r1.getSurfaces()
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r6
            java.lang.String r6 = "SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping()."
            java.lang.String r6 = java.lang.String.format(r6, r7)
            java.lang.String r7 = "Camera2CameraImpl"
            androidx.camera.core.Logger.e(r7, r6)
            return
        L49:
            androidx.camera.core.impl.Config r1 = r1.getImplementationOptions()
            boolean r1 = r1.containsOption(r3)
            if (r1 == 0) goto L9
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L58:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r6.next()
            androidx.camera.core.impl.SessionConfig r1 = (androidx.camera.core.impl.SessionConfig) r1
            java.lang.Object r2 = r0.get(r7)
            androidx.camera.core.impl.UseCaseConfig r2 = (androidx.camera.core.impl.UseCaseConfig) r2
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = r2.getCaptureType()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r3 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING
            if (r2 != r3) goto L86
            java.util.List r1 = r1.getSurfaces()
            java.lang.Object r1 = r1.get(r4)
            androidx.camera.core.impl.DeferrableSurface r1 = (androidx.camera.core.impl.DeferrableSurface) r1
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.put(r1, r2)
            goto La9
        L86:
            androidx.camera.core.impl.Config r2 = r1.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r3 = androidx.camera.camera2.internal.StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION
            boolean r2 = r2.containsOption(r3)
            if (r2 == 0) goto La9
            java.util.List r2 = r1.getSurfaces()
            java.lang.Object r2 = r2.get(r4)
            androidx.camera.core.impl.DeferrableSurface r2 = (androidx.camera.core.impl.DeferrableSurface) r2
            androidx.camera.core.impl.Config r1 = r1.getImplementationOptions()
            java.lang.Object r1 = r1.retrieveOption(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r8.put(r2, r1)
        La9:
            int r7 = r7 + 1
            goto L58
        Lac:
            return
    }

    public static boolean shouldUseStreamUseCase(@androidx.annotation.NonNull androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings r1) {
            int r0 = r1.getCameraMode()
            if (r0 != 0) goto L10
            int r1 = r1.getRequiredMaxBitDepth()
            r0 = 8
            if (r1 != r0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static void throwInvalidCamera2InteropOverrideException() {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Either all use cases must have non-default stream use case assigned or none should have it"
            r0.<init>(r1)
            throw r0
    }
}
