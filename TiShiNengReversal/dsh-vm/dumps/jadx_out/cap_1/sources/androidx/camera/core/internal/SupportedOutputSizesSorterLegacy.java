package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class SupportedOutputSizesSorterLegacy {
    private static final java.lang.String TAG = "SupportedOutputSizesCollector";
    private final android.util.Rational mFullFovRatio;
    private final boolean mIsSensorLandscapeResolution;
    private final int mLensFacing;
    private final int mSensorOrientation;

    SupportedOutputSizesSorterLegacy(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r2, @androidx.annotation.Nullable android.util.Rational r3) {
            r1 = this;
            r1.<init>()
            int r0 = r2.getSensorRotationDegrees()
            r1.mSensorOrientation = r0
            int r2 = r2.getLensFacing()
            r1.mLensFacing = r2
            r1.mFullFovRatio = r3
            r2 = 1
            if (r3 == 0) goto L20
            int r0 = r3.getNumerator()
            int r3 = r3.getDenominator()
            if (r0 < r3) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            r1.mIsSensorLandscapeResolution = r2
            return
    }

    @androidx.annotation.Nullable
    private static android.util.Size flipSizeByRotation(@androidx.annotation.Nullable android.util.Size r0, int r1, int r2, int r3) {
            if (r0 == 0) goto L16
            boolean r1 = isRotationNeeded(r1, r2, r3)
            if (r1 == 0) goto L16
            android.util.Size r1 = new android.util.Size
            int r2 = r0.getHeight()
            int r0 = r0.getWidth()
            r1.<init>(r2, r0)
            return r1
        L16:
            return r0
    }

    @androidx.annotation.Nullable
    private static android.util.Rational getAspectRatioGroupKeyOfTargetSize(@androidx.annotation.Nullable android.util.Size r2, @androidx.annotation.NonNull java.util.List<android.util.Size> r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.List r3 = androidx.camera.core.internal.SupportedOutputSizesSorter.getResolutionListGroupingAspectRatioKeys(r3)
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            android.util.Rational r0 = (android.util.Rational) r0
            boolean r1 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r2, r0)
            if (r1 == 0) goto Lc
            return r0
        L1f:
            android.util.Rational r3 = new android.util.Rational
            int r0 = r2.getWidth()
            int r2 = r2.getHeight()
            r3.<init>(r0, r2)
            return r3
    }

    private android.util.Rational getTargetAspectRatioByLegacyApi(@androidx.annotation.NonNull androidx.camera.core.impl.ImageOutputConfig r2, @androidx.annotation.NonNull java.util.List<android.util.Size> r3) {
            r1 = this;
            boolean r0 = r2.hasTargetAspectRatio()
            if (r0 == 0) goto L11
            int r2 = r2.getTargetAspectRatio()
            boolean r3 = r1.mIsSensorLandscapeResolution
            android.util.Rational r2 = androidx.camera.core.internal.SupportedOutputSizesSorter.getTargetAspectRatioRationalValue(r2, r3)
            return r2
        L11:
            android.util.Size r2 = r1.getTargetSize(r2)
            if (r2 == 0) goto L1c
            android.util.Rational r2 = getAspectRatioGroupKeyOfTargetSize(r2, r3)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    private android.util.Size getTargetSize(@androidx.annotation.NonNull androidx.camera.core.impl.ImageOutputConfig r4) {
            r3 = this;
            r0 = 0
            int r0 = r4.getTargetRotation(r0)
            r1 = 0
            android.util.Size r4 = r4.getTargetResolution(r1)
            int r1 = r3.mLensFacing
            int r2 = r3.mSensorOrientation
            android.util.Size r4 = flipSizeByRotation(r4, r0, r1, r2)
            return r4
    }

    private static boolean isRotationNeeded(int r2, int r3, int r4) {
            int r2 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r2)
            r0 = 0
            r1 = 1
            if (r1 != r3) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            int r2 = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(r2, r4, r3)
            r3 = 90
            if (r2 == r3) goto L19
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L18
            goto L19
        L18:
            return r0
        L19:
            return r1
    }

    @androidx.annotation.NonNull
    java.util.List<android.util.Size> sortSupportedOutputSizes(@androidx.annotation.NonNull java.util.List<android.util.Size> r11, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r12) {
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L7
            return r11
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            androidx.camera.core.impl.utils.CompareSizesByArea r11 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r1 = 1
            r11.<init>(r1)
            java.util.Collections.sort(r0, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.camera.core.impl.ImageOutputConfig r12 = (androidx.camera.core.impl.ImageOutputConfig) r12
            r2 = 0
            android.util.Size r3 = r12.getMaxResolution(r2)
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            if (r3 == 0) goto L34
            int r5 = androidx.camera.core.internal.utils.SizeUtil.getArea(r4)
            int r6 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 >= r6) goto L35
        L34:
            r3 = r4
        L35:
            android.util.Size r4 = r10.getTargetSize(r12)
            android.util.Size r5 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA
            int r6 = androidx.camera.core.internal.utils.SizeUtil.getArea(r5)
            int r7 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r7 >= r6) goto L48
            android.util.Size r5 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO
            goto L51
        L48:
            if (r4 == 0) goto L51
            int r7 = androidx.camera.core.internal.utils.SizeUtil.getArea(r4)
            if (r7 >= r6) goto L51
            r5 = r4
        L51:
            java.util.Iterator r6 = r0.iterator()
        L55:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7f
            java.lang.Object r7 = r6.next()
            android.util.Size r7 = (android.util.Size) r7
            int r8 = androidx.camera.core.internal.utils.SizeUtil.getArea(r7)
            int r9 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r8 > r9) goto L55
            int r8 = androidx.camera.core.internal.utils.SizeUtil.getArea(r7)
            int r9 = androidx.camera.core.internal.utils.SizeUtil.getArea(r5)
            if (r8 < r9) goto L55
            boolean r8 = r11.contains(r7)
            if (r8 != 0) goto L55
            r11.add(r7)
            goto L55
        L7f:
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L10c
            android.util.Rational r0 = r10.getTargetAspectRatioByLegacyApi(r12, r11)
            if (r4 != 0) goto L8f
            android.util.Size r4 = r12.getDefaultResolution(r2)
        L8f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r0 != 0) goto La4
            r12.addAll(r11)
            if (r4 == 0) goto L10b
            androidx.camera.core.internal.SupportedOutputSizesSorter.sortSupportedSizesByFallbackRuleClosestHigherThenLower(r12, r4, r1)
            return r12
        La4:
            java.util.Map r11 = androidx.camera.core.internal.SupportedOutputSizesSorter.groupSizesByAspectRatio(r11)
            if (r4 == 0) goto Lc8
            java.util.Set r2 = r11.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lb2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r2.next()
            android.util.Rational r3 = (android.util.Rational) r3
            java.lang.Object r3 = r11.get(r3)
            java.util.List r3 = (java.util.List) r3
            androidx.camera.core.internal.SupportedOutputSizesSorter.sortSupportedSizesByFallbackRuleClosestHigherThenLower(r3, r4, r1)
            goto Lb2
        Lc8:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r11.keySet()
            r1.<init>(r2)
            androidx.camera.core.impl.utils.AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace r2 = new androidx.camera.core.impl.utils.AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace
            android.util.Rational r3 = r10.mFullFovRatio
            r2.<init>(r0, r3)
            java.util.Collections.sort(r1, r2)
            java.util.Iterator r0 = r1.iterator()
        Ldf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10b
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        Lf5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r1.next()
            android.util.Size r2 = (android.util.Size) r2
            boolean r3 = r12.contains(r2)
            if (r3 != 0) goto Lf5
            r12.add(r2)
            goto Lf5
        L10b:
            return r12
        L10c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r12.append(r1)
            r12.append(r5)
            java.lang.String r1 = "\nmaxSize = "
            r12.append(r1)
            r12.append(r3)
            java.lang.String r1 = "\ninitial size list: "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }
}
