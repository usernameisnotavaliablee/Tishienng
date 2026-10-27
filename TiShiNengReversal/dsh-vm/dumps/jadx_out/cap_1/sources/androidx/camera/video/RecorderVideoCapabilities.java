package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RecorderVideoCapabilities implements androidx.camera.video.VideoCapabilities {
    private static final java.lang.String TAG = "RecorderVideoCapabilities";
    private final java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities.CapabilitiesByQuality> mCapabilitiesMapForFullySpecifiedDynamicRange;
    private final java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities.CapabilitiesByQuality> mCapabilitiesMapForNonFullySpecifiedDynamicRange;
    private final androidx.camera.core.impl.EncoderProfilesProvider mProfilesProvider;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class CapabilitiesByQuality {
        private final java.util.TreeMap<android.util.Size, androidx.camera.video.Quality> mAreaSortedSizeToQualityMap;
        private final androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy mHighestProfiles;
        private final androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy mLowestProfiles;
        private final java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> mSupportedProfilesMap;

        CapabilitiesByQuality(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProvider r7) {
                r6 = this;
                r6.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r6.mSupportedProfilesMap = r0
                java.util.TreeMap r0 = new java.util.TreeMap
                androidx.camera.core.impl.utils.CompareSizesByArea r1 = new androidx.camera.core.impl.utils.CompareSizesByArea
                r1.<init>()
                r0.<init>(r1)
                r6.mAreaSortedSizeToQualityMap = r0
                java.util.List r0 = androidx.camera.video.Quality.getSortedQualities()
                java.util.Iterator r0 = r0.iterator()
            L1e:
                boolean r1 = r0.hasNext()
                java.lang.String r2 = "RecorderVideoCapabilities"
                if (r1 == 0) goto L83
                java.lang.Object r1 = r0.next()
                androidx.camera.video.Quality r1 = (androidx.camera.video.Quality) r1
                androidx.camera.core.impl.EncoderProfilesProxy r3 = r6.getEncoderProfiles(r1, r7)
                if (r3 != 0) goto L33
                goto L1e
            L33:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "profiles = "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                androidx.camera.core.Logger.d(r2, r4)
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r3 = r6.toValidatedProfiles(r3)
                if (r3 != 0) goto L67
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "EncoderProfiles of quality "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " has no video validated profiles."
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                androidx.camera.core.Logger.w(r2, r1)
                goto L1e
            L67:
                androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r2 = r3.getDefaultVideoProfile()
                android.util.Size r4 = new android.util.Size
                int r5 = r2.getWidth()
                int r2 = r2.getHeight()
                r4.<init>(r5, r2)
                java.util.TreeMap<android.util.Size, androidx.camera.video.Quality> r2 = r6.mAreaSortedSizeToQualityMap
                r2.put(r4, r1)
                java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> r2 = r6.mSupportedProfilesMap
                r2.put(r1, r3)
                goto L1e
            L83:
                java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> r7 = r6.mSupportedProfilesMap
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L96
                java.lang.String r7 = "No supported EncoderProfiles"
                androidx.camera.core.Logger.e(r2, r7)
                r7 = 0
                r6.mLowestProfiles = r7
                r6.mHighestProfiles = r7
                return
            L96:
                java.util.ArrayDeque r7 = new java.util.ArrayDeque
                java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> r0 = r6.mSupportedProfilesMap
                java.util.Collection r0 = r0.values()
                r7.<init>(r0)
                java.lang.Object r0 = r7.peekFirst()
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r0 = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) r0
                r6.mHighestProfiles = r0
                java.lang.Object r7 = r7.peekLast()
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r7 = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) r7
                r6.mLowestProfiles = r7
                return
        }

        private static void checkQualityConstantsOrThrow(@androidx.annotation.NonNull androidx.camera.video.Quality r3) {
                boolean r0 = androidx.camera.video.Quality.containsQuality(r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown quality: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                androidx.core.util.Preconditions.checkArgument(r0, r3)
                return
        }

        @androidx.annotation.Nullable
        private androidx.camera.core.impl.EncoderProfilesProxy getEncoderProfiles(@androidx.annotation.NonNull androidx.camera.video.Quality r3, @androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProvider r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.camera.video.Quality.ConstantQuality
                java.lang.String r1 = "Currently only support ConstantQuality"
                androidx.core.util.Preconditions.checkState(r0, r1)
                androidx.camera.video.Quality$ConstantQuality r3 = (androidx.camera.video.Quality.ConstantQuality) r3
                int r3 = r3.getValue()
                androidx.camera.core.impl.EncoderProfilesProxy r3 = r4.getAll(r3)
                return r3
        }

        @androidx.annotation.Nullable
        private androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy toValidatedProfiles(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy r2) {
                r1 = this;
                java.util.List r0 = r2.getVideoProfiles()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lc
                r2 = 0
                return r2
            Lc:
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r2 = androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy.from(r2)
                return r2
        }

        @androidx.annotation.Nullable
        public androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(@androidx.annotation.NonNull android.util.Size r4) {
                r3 = this;
                androidx.camera.video.Quality r0 = r3.findHighestSupportedQualityFor(r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Using supported quality of "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = " for size "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                java.lang.String r1 = "RecorderVideoCapabilities"
                androidx.camera.core.Logger.d(r1, r4)
                androidx.camera.video.Quality r4 = androidx.camera.video.Quality.NONE
                if (r0 == r4) goto L35
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r4 = r3.getProfiles(r0)
                if (r4 == 0) goto L2d
                return r4
            L2d:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                java.lang.String r0 = "Camera advertised available quality but did not produce EncoderProfiles for advertised quality."
                r4.<init>(r0)
                throw r4
            L35:
                r4 = 0
                return r4
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.Quality findHighestSupportedQualityFor(@androidx.annotation.NonNull android.util.Size r2) {
                r1 = this;
                java.util.TreeMap<android.util.Size, androidx.camera.video.Quality> r0 = r1.mAreaSortedSizeToQualityMap
                java.util.Map$Entry r0 = r0.ceilingEntry(r2)
                if (r0 == 0) goto Lf
                java.lang.Object r2 = r0.getValue()
                androidx.camera.video.Quality r2 = (androidx.camera.video.Quality) r2
                return r2
            Lf:
                java.util.TreeMap<android.util.Size, androidx.camera.video.Quality> r0 = r1.mAreaSortedSizeToQualityMap
                java.util.Map$Entry r2 = r0.floorEntry(r2)
                if (r2 == 0) goto L1e
                java.lang.Object r2 = r2.getValue()
                androidx.camera.video.Quality r2 = (androidx.camera.video.Quality) r2
                return r2
            L1e:
                androidx.camera.video.Quality r2 = androidx.camera.video.Quality.NONE
                return r2
        }

        @androidx.annotation.Nullable
        public androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy getProfiles(@androidx.annotation.NonNull androidx.camera.video.Quality r2) {
                r1 = this;
                checkQualityConstantsOrThrow(r2)
                androidx.camera.video.Quality r0 = androidx.camera.video.Quality.HIGHEST
                if (r2 != r0) goto La
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r2 = r1.mHighestProfiles
                return r2
            La:
                androidx.camera.video.Quality r0 = androidx.camera.video.Quality.LOWEST
                if (r2 != r0) goto L11
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r2 = r1.mLowestProfiles
                return r2
            L11:
                java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> r0 = r1.mSupportedProfilesMap
                java.lang.Object r2 = r0.get(r2)
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r2 = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) r2
                return r2
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.video.Quality> getSupportedQualities() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> r1 = r2.mSupportedProfilesMap
                java.util.Set r1 = r1.keySet()
                r0.<init>(r1)
                return r0
        }

        public boolean isQualitySupported(@androidx.annotation.NonNull androidx.camera.video.Quality r1) {
                r0 = this;
                checkQualityConstantsOrThrow(r1)
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r1 = r0.getProfiles(r1)
                if (r1 == 0) goto Lb
                r1 = 1
                return r1
            Lb:
                r1 = 0
                return r1
        }
    }

    @androidx.annotation.VisibleForTesting
    RecorderVideoCapabilities(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r3, @androidx.annotation.NonNull androidx.arch.core.util.Function<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> r4) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCapabilitiesMapForFullySpecifiedDynamicRange = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCapabilitiesMapForNonFullySpecifiedDynamicRange = r0
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r3.getEncoderProfilesProvider()
            boolean r1 = isHlg10SupportedByCamera(r3)
            if (r1 == 0) goto L21
            androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider r1 = new androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider
            r1.<init>(r0, r4)
            r0 = r1
        L21:
            androidx.camera.core.impl.Quirks r4 = r3.getCameraQuirks()
            androidx.camera.core.impl.ResolutionValidatedEncoderProfilesProvider r1 = new androidx.camera.core.impl.ResolutionValidatedEncoderProfilesProvider
            r1.<init>(r0, r4)
            androidx.camera.core.impl.Quirks r4 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.getAll()
            androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider r0 = new androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider
            r0.<init>(r1, r3, r4)
            r2.mProfilesProvider = r0
            java.util.Set r3 = r3.getSupportedDynamicRanges()
            java.util.Iterator r3 = r3.iterator()
        L3d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r3.next()
            androidx.camera.core.DynamicRange r4 = (androidx.camera.core.DynamicRange) r4
            androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider r0 = new androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider
            androidx.camera.core.impl.EncoderProfilesProvider r1 = r2.mProfilesProvider
            r0.<init>(r1, r4)
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r1 = new androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality
            r1.<init>(r0)
            java.util.List r0 = r1.getSupportedQualities()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality> r0 = r2.mCapabilitiesMapForFullySpecifiedDynamicRange
            r0.put(r4, r1)
            goto L3d
        L65:
            return
    }

    private static boolean canMatchBitDepth(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
            boolean r0 = isFullySpecified(r3)
            java.lang.String r1 = "Fully specified range is not actually fully specified."
            androidx.core.util.Preconditions.checkState(r0, r1)
            int r0 = r2.getBitDepth()
            r1 = 1
            if (r0 != 0) goto L11
            return r1
        L11:
            int r2 = r2.getBitDepth()
            int r3 = r3.getBitDepth()
            if (r2 != r3) goto L1c
            return r1
        L1c:
            r2 = 0
            return r2
    }

    private static boolean canMatchEncoding(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
            boolean r0 = isFullySpecified(r3)
            java.lang.String r1 = "Fully specified range is not actually fully specified."
            androidx.core.util.Preconditions.checkState(r0, r1)
            int r2 = r2.getEncoding()
            r0 = 1
            if (r2 != 0) goto L11
            return r0
        L11:
            int r3 = r3.getEncoding()
            r1 = 2
            if (r2 != r1) goto L1b
            if (r3 == r0) goto L1b
            return r0
        L1b:
            if (r2 != r3) goto L1e
            return r0
        L1e:
            r2 = 0
            return r2
    }

    private static boolean canResolve(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r3) {
            boolean r0 = isFullySpecified(r2)
            if (r0 == 0) goto Lb
            boolean r2 = r3.contains(r2)
            return r2
        Lb:
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            androidx.camera.core.DynamicRange r0 = (androidx.camera.core.DynamicRange) r0
            boolean r1 = canMatchBitDepth(r2, r0)
            if (r1 == 0) goto Lf
            boolean r0 = canMatchEncoding(r2, r0)
            if (r0 == 0) goto Lf
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.RecorderVideoCapabilities from(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r2) {
            androidx.camera.video.RecorderVideoCapabilities r0 = new androidx.camera.video.RecorderVideoCapabilities
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2
            androidx.arch.core.util.Function<androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy> r1 = androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider.DEFAULT_VALIDATOR
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.camera.video.RecorderVideoCapabilities.CapabilitiesByQuality generateCapabilitiesForNonFullySpecifiedDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
            r2 = this;
            java.util.Set r0 = r2.getSupportedDynamicRanges()
            boolean r0 = canResolve(r3, r0)
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider r0 = new androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider
            androidx.camera.core.impl.EncoderProfilesProvider r1 = r2.mProfilesProvider
            r0.<init>(r1, r3)
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r3 = new androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality
            r3.<init>(r0)
            return r3
    }

    @androidx.annotation.Nullable
    private androidx.camera.video.RecorderVideoCapabilities.CapabilitiesByQuality getCapabilities(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
            r2 = this;
            boolean r0 = isFullySpecified(r3)
            if (r0 == 0) goto Lf
            java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality> r0 = r2.mCapabilitiesMapForFullySpecifiedDynamicRange
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r3 = (androidx.camera.video.RecorderVideoCapabilities.CapabilitiesByQuality) r3
            return r3
        Lf:
            java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality> r0 = r2.mCapabilitiesMapForNonFullySpecifiedDynamicRange
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L20
            java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality> r0 = r2.mCapabilitiesMapForNonFullySpecifiedDynamicRange
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r3 = (androidx.camera.video.RecorderVideoCapabilities.CapabilitiesByQuality) r3
            return r3
        L20:
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r0 = r2.generateCapabilitiesForNonFullySpecifiedDynamicRange(r3)
            java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality> r1 = r2.mCapabilitiesMapForNonFullySpecifiedDynamicRange
            r1.put(r3, r0)
            return r0
    }

    private static boolean isFullySpecified(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            int r0 = r2.getEncoding()
            if (r0 == 0) goto L15
            int r0 = r2.getEncoding()
            r1 = 2
            if (r0 == r1) goto L15
            int r2 = r2.getBitDepth()
            if (r2 == 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    private static boolean isHlg10SupportedByCamera(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r3) {
            java.util.Set r3 = r3.getSupportedDynamicRanges()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.camera.core.DynamicRange r0 = (androidx.camera.core.DynamicRange) r0
            int r1 = r0.getEncoding()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.getBitDepth()
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8
            r1 = 10
            if (r0 != r1) goto L8
            r3 = 1
            return r3
        L31:
            r3 = 0
            return r3
    }

    @Override // androidx.camera.video.VideoCapabilities
    @androidx.annotation.Nullable
    public androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r0 = this;
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r2 = r0.getCapabilities(r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r1 = r2.findHighestSupportedEncoderProfilesFor(r1)
            return r1
    }

    @Override // androidx.camera.video.VideoCapabilities
    @androidx.annotation.NonNull
    public androidx.camera.video.Quality findHighestSupportedQualityFor(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r0 = this;
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r2 = r0.getCapabilities(r2)
            if (r2 != 0) goto L9
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.NONE
            return r1
        L9:
            androidx.camera.video.Quality r1 = r2.findHighestSupportedQualityFor(r1)
            return r1
    }

    @Override // androidx.camera.video.VideoCapabilities
    @androidx.annotation.Nullable
    public androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy getProfiles(@androidx.annotation.NonNull androidx.camera.video.Quality r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r0 = this;
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r2 = r0.getCapabilities(r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r1 = r2.getProfiles(r1)
            return r1
    }

    @Override // androidx.camera.video.VideoCapabilities
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            r1 = this;
            java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality> r0 = r1.mCapabilitiesMapForFullySpecifiedDynamicRange
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // androidx.camera.video.VideoCapabilities
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.video.Quality> getSupportedQualities(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
            r0 = this;
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r1 = r0.getCapabilities(r1)
            if (r1 != 0) goto Lc
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        Lc:
            java.util.List r1 = r1.getSupportedQualities()
            return r1
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(@androidx.annotation.NonNull androidx.camera.video.Quality r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r0 = this;
            androidx.camera.video.RecorderVideoCapabilities$CapabilitiesByQuality r2 = r0.getCapabilities(r2)
            if (r2 == 0) goto Le
            boolean r1 = r2.isQualitySupported(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }
}
