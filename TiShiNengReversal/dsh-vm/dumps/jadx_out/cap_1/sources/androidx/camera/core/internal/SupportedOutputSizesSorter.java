package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class SupportedOutputSizesSorter {
    private static final java.lang.String TAG = "SupportedOutputSizesCollector";
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfoInternal;
    private final android.util.Rational mFullFovRatio;
    private final boolean mIsSensorLandscapeResolution;
    private final int mLensFacing;
    private final int mSensorOrientation;
    private final androidx.camera.core.internal.SupportedOutputSizesSorterLegacy mSupportedOutputSizesSorterLegacy;

    SupportedOutputSizesSorter(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r4, @androidx.annotation.Nullable android.util.Size r5) {
            r3 = this;
            r3.<init>()
            r3.mCameraInfoInternal = r4
            int r0 = r4.getSensorRotationDegrees()
            r3.mSensorOrientation = r0
            int r0 = r4.getLensFacing()
            r3.mLensFacing = r0
            if (r5 == 0) goto L18
            android.util.Rational r5 = r3.calculateFullFovRatioFromActiveArraySize(r5)
            goto L1c
        L18:
            android.util.Rational r5 = r3.calculateFullFovRatioFromSupportedOutputSizes(r4)
        L1c:
            r3.mFullFovRatio = r5
            r0 = 1
            if (r5 == 0) goto L2d
            int r1 = r5.getNumerator()
            int r2 = r5.getDenominator()
            if (r1 < r2) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r3.mIsSensorLandscapeResolution = r0
            androidx.camera.core.internal.SupportedOutputSizesSorterLegacy r0 = new androidx.camera.core.internal.SupportedOutputSizesSorterLegacy
            r0.<init>(r4, r5)
            r3.mSupportedOutputSizesSorterLegacy = r0
            return
    }

    @androidx.annotation.NonNull
    private java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> applyAspectRatioStrategy(@androidx.annotation.NonNull java.util.List<android.util.Size> r1, @androidx.annotation.NonNull androidx.camera.core.resolutionselector.AspectRatioStrategy r2) {
            r0 = this;
            java.util.Map r1 = groupSizesByAspectRatio(r1)
            java.util.LinkedHashMap r1 = r0.applyAspectRatioStrategyFallbackRule(r1, r2)
            return r1
    }

    private java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> applyAspectRatioStrategyFallbackRule(@androidx.annotation.NonNull java.util.Map<android.util.Rational, java.util.List<android.util.Size>> r5, @androidx.annotation.NonNull androidx.camera.core.resolutionselector.AspectRatioStrategy r6) {
            r4 = this;
            int r0 = r6.getPreferredAspectRatio()
            boolean r1 = r4.mIsSensorLandscapeResolution
            android.util.Rational r0 = getTargetAspectRatioRationalValue(r0, r1)
            int r1 = r6.getFallbackRule()
            if (r1 != 0) goto L3d
            int r6 = r6.getPreferredAspectRatio()
            boolean r1 = r4.mIsSensorLandscapeResolution
            android.util.Rational r6 = getTargetAspectRatioRationalValue(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r5.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            android.util.Rational r2 = (android.util.Rational) r2
            boolean r3 = r2.equals(r6)
            if (r3 != 0) goto L27
            r5.remove(r2)
            goto L27
        L3d:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Set r1 = r5.keySet()
            r6.<init>(r1)
            androidx.camera.core.impl.utils.AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace r1 = new androidx.camera.core.impl.utils.AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace
            android.util.Rational r2 = r4.mFullFovRatio
            r1.<init>(r0, r2)
            java.util.Collections.sort(r6, r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r2 = r5.get(r1)
            java.util.List r2 = (java.util.List) r2
            r0.put(r1, r2)
            goto L59
        L6f:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> applyHighResolutionSettings(@androidx.annotation.NonNull java.util.List<android.util.Size> r2, @androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r3, int r4) {
            r1 = this;
            int r3 = r3.getAllowedResolutionMode()
            r0 = 1
            if (r3 != r0) goto L21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.addAll(r2)
            androidx.camera.core.impl.CameraInfoInternal r2 = r1.mCameraInfoInternal
            java.util.List r2 = r2.getSupportedHighResolutions(r4)
            r3.addAll(r2)
            androidx.camera.core.impl.utils.CompareSizesByArea r2 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r2.<init>(r0)
            java.util.Collections.sort(r3, r2)
            return r3
        L21:
            return r2
    }

    private static void applyMaxResolutionRestriction(@androidx.annotation.NonNull java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> r6, @androidx.annotation.NonNull android.util.Size r7) {
            int r7 = androidx.camera.core.internal.utils.SizeUtil.getArea(r7)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r6.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()
            android.util.Size r4 = (android.util.Size) r4
            int r5 = androidx.camera.core.internal.utils.SizeUtil.getArea(r4)
            if (r5 > r7) goto L27
            r2.add(r4)
            goto L27
        L3d:
            r1.clear()
            r1.addAll(r2)
            goto Lc
        L44:
            return
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> applyResolutionFilter(@androidx.annotation.NonNull java.util.List<android.util.Size> r4, @androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionFilter r5, int r6) {
            r3 = this;
            if (r5 != 0) goto L3
            return r4
        L3:
            int r6 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r6)
            int r0 = r3.mSensorOrientation
            int r1 = r3.mLensFacing
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            int r6 = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(r6, r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.List r5 = r5.filter(r0, r6)
            boolean r4 = r4.containsAll(r5)
            if (r4 == 0) goto L24
            return r5
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The returned sizes list of the resolution filter must be a subset of the provided sizes list."
            r4.<init>(r5)
            throw r4
    }

    private static void applyResolutionStrategy(@androidx.annotation.NonNull java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> r2, @androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionStrategy r3) {
            if (r3 != 0) goto L3
            goto L21
        L3:
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            applyResolutionStrategyFallbackRule(r1, r3)
            goto Lb
        L21:
            return
    }

    private static void applyResolutionStrategyFallbackRule(@androidx.annotation.NonNull java.util.List<android.util.Size> r4, @androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionStrategy r5) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L27
        L7:
            int r0 = r5.getFallbackRule()
            androidx.camera.core.resolutionselector.ResolutionStrategy r1 = androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L14
            goto L27
        L14:
            android.util.Size r5 = r5.getBoundSize()
            if (r0 == 0) goto L38
            r1 = 1
            if (r0 == r1) goto L34
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L30
            r2 = 3
            if (r0 == r2) goto L2c
            r1 = 4
            if (r0 == r1) goto L28
        L27:
            return
        L28:
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(r4, r5, r3)
            return
        L2c:
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(r4, r5, r1)
            return
        L30:
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(r4, r5, r3)
            return
        L34:
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(r4, r5, r1)
            return
        L38:
            sortSupportedSizesByFallbackRuleNone(r4, r5)
            return
    }

    @androidx.annotation.NonNull
    private android.util.Rational calculateFullFovRatioFromActiveArraySize(@androidx.annotation.NonNull android.util.Size r3) {
            r2 = this;
            android.util.Rational r0 = new android.util.Rational
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            r0.<init>(r1, r3)
            return r0
    }

    @androidx.annotation.Nullable
    private android.util.Rational calculateFullFovRatioFromSupportedOutputSizes(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r3) {
            r2 = this;
            r0 = 256(0x100, float:3.59E-43)
            java.util.List r3 = r3.getSupportedResolutions(r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Le
            r3 = 0
            return r3
        Le:
            androidx.camera.core.impl.utils.CompareSizesByArea r0 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r0.<init>()
            java.lang.Object r3 = java.util.Collections.max(r3, r0)
            android.util.Size r3 = (android.util.Size) r3
            android.util.Rational r0 = new android.util.Rational
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            r0.<init>(r1, r3)
            return r0
    }

    @androidx.annotation.Nullable
    private java.util.List<android.util.Size> getCustomizedSupportedResolutionsFromConfig(int r4, @androidx.annotation.NonNull androidx.camera.core.impl.ImageOutputConfig r5) {
            r3 = this;
            r0 = 0
            java.util.List r5 = r5.getSupportedResolutions(r0)
            if (r5 == 0) goto L26
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto Lb
            java.lang.Object r4 = r1.second
            android.util.Size[] r4 = (android.util.Size[]) r4
            goto L27
        L26:
            r4 = r0
        L27:
            if (r4 != 0) goto L2a
            return r0
        L2a:
            java.util.List r4 = java.util.Arrays.asList(r4)
            return r4
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getResolutionCandidateList(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r4) {
            r3 = this;
            int r0 = r4.getInputFormat()
            androidx.camera.core.impl.ImageOutputConfig r4 = (androidx.camera.core.impl.ImageOutputConfig) r4
            java.util.List r4 = r3.getCustomizedSupportedResolutionsFromConfig(r0, r4)
            if (r4 != 0) goto L12
            androidx.camera.core.impl.CameraInfoInternal r4 = r3.mCameraInfoInternal
            java.util.List r4 = r4.getSupportedResolutions(r0)
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            androidx.camera.core.impl.utils.CompareSizesByArea r4 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r2 = 1
            r4.<init>(r2)
            java.util.Collections.sort(r1, r4)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "The retrieved supported resolutions from camera info internal is empty. Format is "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "SupportedOutputSizesCollector"
            androidx.camera.core.Logger.w(r0, r4)
        L41:
            return r1
    }

    @androidx.annotation.NonNull
    static java.util.List<android.util.Rational> getResolutionListGroupingAspectRatioKeys(@androidx.annotation.NonNull java.util.List<android.util.Size> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.Rational r1 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3
            r0.add(r1)
            android.util.Rational r1 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9
            r0.add(r1)
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r5.next()
            android.util.Size r1 = (android.util.Size) r1
            android.util.Rational r2 = new android.util.Rational
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            r2.<init>(r3, r4)
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L13
            java.util.Iterator r3 = r0.iterator()
        L36:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            android.util.Rational r4 = (android.util.Rational) r4
            boolean r4 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r1, r4)
            if (r4 == 0) goto L36
            goto L13
        L49:
            r0.add(r2)
            goto L13
        L4d:
            return r0
    }

    @androidx.annotation.Nullable
    static android.util.Rational getTargetAspectRatioRationalValue(int r2, boolean r3) {
            r0 = -1
            r1 = 0
            if (r2 == r0) goto L30
            if (r2 == 0) goto L28
            r0 = 1
            if (r2 == r0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Undefined target aspect ratio: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SupportedOutputSizesCollector"
            androidx.camera.core.Logger.e(r3, r2)
            return r1
        L20:
            if (r3 == 0) goto L25
            android.util.Rational r2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9
            return r2
        L25:
            android.util.Rational r2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_9_16
            return r2
        L28:
            if (r3 == 0) goto L2d
            android.util.Rational r2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3
            return r2
        L2d:
            android.util.Rational r2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_3_4
            return r2
        L30:
            return r1
    }

    static java.util.Map<android.util.Rational, java.util.List<android.util.Size>> groupSizesByAspectRatio(@androidx.annotation.NonNull java.util.List<android.util.Size> r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = getResolutionListGroupingAspectRatioKeys(r5)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
            goto Ld
        L22:
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r5.next()
            android.util.Size r1 = (android.util.Size) r1
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L3a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            android.util.Rational r3 = (android.util.Rational) r3
            boolean r4 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r1, r3)
            if (r4 == 0) goto L3a
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L3a
        L56:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> sortSupportedOutputSizesByResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r8) {
            r7 = this;
            r0 = r8
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            androidx.camera.core.resolutionselector.ResolutionSelector r0 = r0.getResolutionSelector()
            java.util.List r1 = r7.getResolutionCandidateList(r8)
            r2 = 0
            boolean r3 = r8.isHigResolutionDisabled(r2)
            if (r3 != 0) goto L1a
            int r3 = r8.getInputFormat()
            java.util.List r1 = r7.applyHighResolutionSettings(r1, r0, r3)
        L1a:
            androidx.camera.core.resolutionselector.AspectRatioStrategy r3 = r0.getAspectRatioStrategy()
            java.util.LinkedHashMap r1 = r7.applyAspectRatioStrategy(r1, r3)
            androidx.camera.core.impl.ImageOutputConfig r8 = (androidx.camera.core.impl.ImageOutputConfig) r8
            r3 = 0
            android.util.Size r3 = r8.getMaxResolution(r3)
            if (r3 == 0) goto L2e
            applyMaxResolutionRestriction(r1, r3)
        L2e:
            androidx.camera.core.resolutionselector.ResolutionStrategy r3 = r0.getResolutionStrategy()
            applyResolutionStrategy(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r1.next()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L52:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r4.next()
            android.util.Size r5 = (android.util.Size) r5
            boolean r6 = r3.contains(r5)
            if (r6 != 0) goto L52
            r3.add(r5)
            goto L52
        L68:
            androidx.camera.core.resolutionselector.ResolutionFilter r0 = r0.getResolutionFilter()
            int r8 = r8.getTargetRotation(r2)
            java.util.List r8 = r7.applyResolutionFilter(r3, r0, r8)
            return r8
    }

    static void sortSupportedSizesByFallbackRuleClosestHigherThenLower(@androidx.annotation.NonNull java.util.List<android.util.Size> r5, @androidx.annotation.NonNull android.util.Size r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        Lb:
            if (r1 < 0) goto L2e
            java.lang.Object r2 = r5.get(r1)
            android.util.Size r2 = (android.util.Size) r2
            int r3 = r2.getWidth()
            int r4 = r6.getWidth()
            if (r3 < r4) goto L27
            int r3 = r2.getHeight()
            int r4 = r6.getHeight()
            if (r3 >= r4) goto L2e
        L27:
            r3 = 0
            r0.add(r3, r2)
            int r1 = r1 + (-1)
            goto Lb
        L2e:
            r5.removeAll(r0)
            java.util.Collections.reverse(r5)
            if (r7 == 0) goto L39
            r5.addAll(r0)
        L39:
            return
    }

    private static void sortSupportedSizesByFallbackRuleClosestLowerThenHigher(@androidx.annotation.NonNull java.util.List<android.util.Size> r6, @androidx.annotation.NonNull android.util.Size r7, boolean r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r6.size()
            if (r2 >= r3) goto L2d
            java.lang.Object r3 = r6.get(r2)
            android.util.Size r3 = (android.util.Size) r3
            int r4 = r3.getWidth()
            int r5 = r7.getWidth()
            if (r4 > r5) goto L27
            int r4 = r3.getHeight()
            int r5 = r7.getHeight()
            if (r4 <= r5) goto L2d
        L27:
            r0.add(r1, r3)
            int r2 = r2 + 1
            goto L7
        L2d:
            r6.removeAll(r0)
            if (r8 == 0) goto L35
            r6.addAll(r0)
        L35:
            return
    }

    private static void sortSupportedSizesByFallbackRuleNone(@androidx.annotation.NonNull java.util.List<android.util.Size> r1, @androidx.annotation.NonNull android.util.Size r2) {
            boolean r0 = r1.contains(r2)
            r1.clear()
            if (r0 == 0) goto Lc
            r1.add(r2)
        Lc:
            return
    }

    @androidx.annotation.NonNull
    java.util.List<android.util.Size> getSortedSupportedOutputSizes(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r4) {
            r3 = this;
            r0 = r4
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = 0
            java.util.List r2 = r0.getCustomOrderedResolutions(r1)
            if (r2 == 0) goto Lb
            return r2
        Lb:
            androidx.camera.core.resolutionselector.ResolutionSelector r0 = r0.getResolutionSelector(r1)
            if (r0 != 0) goto L1c
            androidx.camera.core.internal.SupportedOutputSizesSorterLegacy r0 = r3.mSupportedOutputSizesSorterLegacy
            java.util.List r1 = r3.getResolutionCandidateList(r4)
            java.util.List r4 = r0.sortSupportedOutputSizes(r1, r4)
            return r4
        L1c:
            java.util.List r4 = r3.sortSupportedOutputSizesByResolutionSelector(r4)
            return r4
    }
}
