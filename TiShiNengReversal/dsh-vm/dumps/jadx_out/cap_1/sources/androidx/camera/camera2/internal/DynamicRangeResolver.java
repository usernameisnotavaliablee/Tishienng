package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class DynamicRangeResolver {
    private static final java.lang.String TAG = "DynamicRangeResolver";
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCharacteristics;
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat mDynamicRangesInfo;
    private final boolean mIs10BitSupported;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    static final class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        static androidx.camera.core.DynamicRange getRecommended10BitDynamicRange(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
                android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE
                java.lang.Object r2 = r2.get(r0)
                java.lang.Long r2 = (java.lang.Long) r2
                if (r2 == 0) goto L13
                long r0 = r2.longValue()
                androidx.camera.core.DynamicRange r2 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.profileToDynamicRange(r0)
                return r2
            L13:
                r2 = 0
                return r2
        }
    }

    DynamicRangeResolver(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r6) {
            r5 = this;
            r5.<init>()
            r5.mCharacteristics = r6
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r0 = androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.fromCameraCharacteristics(r6)
            r5.mDynamicRangesInfo = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r6 = r6.get(r0)
            int[] r6 = (int[]) r6
            r0 = 0
            if (r6 == 0) goto L25
            int r1 = r6.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L25
            r3 = r6[r2]
            r4 = 18
            if (r3 != r4) goto L22
            r0 = 1
            goto L25
        L22:
            int r2 = r2 + 1
            goto L18
        L25:
            r5.mIs10BitSupported = r0
            return
    }

    private static boolean canResolve(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r4, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r5) {
            boolean r0 = r5.isFullySpecified()
            java.lang.String r1 = "Fully specified range is not actually fully specified."
            androidx.core.util.Preconditions.checkState(r0, r1)
            int r0 = r4.getEncoding()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != r3) goto L19
            int r0 = r5.getEncoding()
            if (r0 != r1) goto L19
            return r2
        L19:
            int r0 = r4.getEncoding()
            if (r0 == r3) goto L30
            int r0 = r4.getEncoding()
            if (r0 == 0) goto L30
            int r0 = r4.getEncoding()
            int r3 = r5.getEncoding()
            if (r0 == r3) goto L30
            return r2
        L30:
            int r0 = r4.getBitDepth()
            if (r0 == 0) goto L42
            int r4 = r4.getBitDepth()
            int r5 = r5.getBitDepth()
            if (r4 != r5) goto L41
            goto L42
        L41:
            return r2
        L42:
            return r1
    }

    private static boolean canResolveWithinConstraints(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r3) {
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L1b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.lang.String r2 = "DynamicRangeResolver"
            androidx.camera.core.Logger.d(r2, r1)
            return r0
        L1b:
            boolean r1 = canResolve(r1, r2)
            return r1
    }

    @androidx.annotation.Nullable
    private static androidx.camera.core.DynamicRange findSupportedHdrMatch(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r6, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.DynamicRange> r7, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r8) {
            int r0 = r6.getEncoding()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            return r1
        L9:
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r7.next()
            androidx.camera.core.DynamicRange r0 = (androidx.camera.core.DynamicRange) r0
            java.lang.String r3 = "Fully specified DynamicRange cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r0, r3)
            int r3 = r0.getEncoding()
            boolean r4 = r0.isFullySpecified()
            java.lang.String r5 = "Fully specified DynamicRange must have fully defined encoding."
            androidx.core.util.Preconditions.checkState(r4, r5)
            if (r3 != r2) goto L2e
            goto Ld
        L2e:
            boolean r3 = canResolveWithinConstraints(r6, r0, r8)
            if (r3 == 0) goto Ld
            return r0
        L35:
            return r1
    }

    private static boolean isFullyUnspecified(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.UNSPECIFIED
            boolean r1 = java.util.Objects.equals(r1, r0)
            return r1
    }

    private static boolean isPartiallySpecified(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            int r0 = r2.getEncoding()
            r1 = 2
            if (r0 == r1) goto L22
            int r0 = r2.getEncoding()
            if (r0 == 0) goto L13
            int r0 = r2.getBitDepth()
            if (r0 == 0) goto L22
        L13:
            int r0 = r2.getEncoding()
            if (r0 != 0) goto L20
            int r2 = r2.getBitDepth()
            if (r2 == 0) goto L20
            goto L22
        L20:
            r2 = 0
            return r2
        L22:
            r2 = 1
            return r2
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.DynamicRange resolveDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r9, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r10, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r11, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r12, @androidx.annotation.NonNull java.lang.String r13) {
            r8 = this;
            boolean r0 = r9.isFullySpecified()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto Le
            return r9
        Le:
            return r1
        Lf:
            int r0 = r9.getEncoding()
            int r2 = r9.getBitDepth()
            r3 = 1
            if (r0 != r3) goto L26
            if (r2 != 0) goto L26
            androidx.camera.core.DynamicRange r9 = androidx.camera.core.DynamicRange.SDR
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L25
            return r9
        L25:
            return r1
        L26:
            androidx.camera.core.DynamicRange r11 = findSupportedHdrMatch(r9, r11, r10)
            r4 = 0
            r5 = 3
            r6 = 2
            java.lang.String r7 = "DynamicRangeResolver"
            if (r11 == 0) goto L43
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r13
            r10[r3] = r9
            r10[r6] = r11
            java.lang.String r9 = "Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s"
            java.lang.String r9 = java.lang.String.format(r9, r10)
            androidx.camera.core.Logger.d(r7, r9)
            return r11
        L43:
            androidx.camera.core.DynamicRange r11 = findSupportedHdrMatch(r9, r12, r10)
            if (r11 == 0) goto L5b
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r13
            r10[r3] = r9
            r10[r6] = r11
            java.lang.String r9 = "Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s"
            java.lang.String r9 = java.lang.String.format(r9, r10)
            androidx.camera.core.Logger.d(r7, r9)
            return r11
        L5b:
            androidx.camera.core.DynamicRange r11 = androidx.camera.core.DynamicRange.SDR
            boolean r12 = canResolveWithinConstraints(r9, r11, r10)
            if (r12 == 0) goto L75
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r13
            r10[r3] = r9
            r10[r6] = r11
            java.lang.String r9 = "Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s"
            java.lang.String r9 = java.lang.String.format(r9, r10)
            androidx.camera.core.Logger.d(r7, r9)
            return r11
        L75:
            if (r0 != r6) goto Lc0
            r11 = 10
            if (r2 == r11) goto L7d
            if (r2 != 0) goto Lc0
        L7d:
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r12 < r0) goto L94
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r12 = r8.mCharacteristics
            androidx.camera.core.DynamicRange r12 = androidx.camera.camera2.internal.DynamicRangeResolver.Api33Impl.getRecommended10BitDynamicRange(r12)
            if (r12 == 0) goto L95
            r11.add(r12)
            goto L95
        L94:
            r12 = r1
        L95:
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.HLG_10_BIT
            r11.add(r0)
            androidx.camera.core.DynamicRange r11 = findSupportedHdrMatch(r9, r11, r10)
            if (r11 == 0) goto Lc0
            boolean r10 = r11.equals(r12)
            if (r10 == 0) goto La9
            java.lang.String r10 = "recommended"
            goto Lab
        La9:
            java.lang.String r10 = "required"
        Lab:
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r4] = r13
            r12[r3] = r10
            r12[r6] = r9
            r12[r5] = r11
            java.lang.String r9 = "Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s"
            java.lang.String r9 = java.lang.String.format(r9, r12)
            androidx.camera.core.Logger.d(r7, r9)
            return r11
        Lc0:
            java.util.Iterator r10 = r10.iterator()
        Lc4:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lfa
            java.lang.Object r11 = r10.next()
            androidx.camera.core.DynamicRange r11 = (androidx.camera.core.DynamicRange) r11
            boolean r12 = r11.isFullySpecified()
            java.lang.String r0 = "Candidate dynamic range must be fully specified."
            androidx.core.util.Preconditions.checkState(r12, r0)
            androidx.camera.core.DynamicRange r12 = androidx.camera.core.DynamicRange.SDR
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto Le2
            goto Lc4
        Le2:
            boolean r12 = canResolve(r9, r11)
            if (r12 == 0) goto Lc4
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r13
            r10[r3] = r9
            r10[r6] = r11
            java.lang.String r9 = "Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s"
            java.lang.String r9 = java.lang.String.format(r9, r10)
            androidx.camera.core.Logger.d(r7, r9)
            return r11
        Lfa:
            return r1
    }

    private androidx.camera.core.DynamicRange resolveDynamicRangeAndUpdateConstraints(@androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r7, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r8, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r9, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r10, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r11) {
            r6 = this;
            androidx.camera.core.DynamicRange r1 = r10.getDynamicRange()
            java.lang.String r5 = r10.getTargetName()
            r0 = r6
            r3 = r8
            r4 = r9
            r2 = r11
            androidx.camera.core.DynamicRange r8 = r0.resolveDynamicRange(r1, r2, r3, r4, r5)
            if (r8 == 0) goto L18
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r7 = r0.mDynamicRangesInfo
            updateConstraints(r2, r8, r7)
            return r8
        L18:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r10.getTargetName()
            java.lang.String r10 = "\n  "
            java.lang.String r7 = android.text.TextUtils.join(r10, r7)
            java.lang.String r10 = android.text.TextUtils.join(r10, r2)
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r2 = 0
            r11[r2] = r9
            r9 = 1
            r11[r9] = r1
            r9 = 2
            r11[r9] = r7
            r7 = 3
            r11[r7] = r10
            java.lang.String r7 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s"
            java.lang.String r7 = java.lang.String.format(r7, r11)
            r8.<init>(r7)
            throw r8
    }

    private static void updateConstraints(@androidx.annotation.NonNull java.util.Set<androidx.camera.core.DynamicRange> r4, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r5, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r6) {
            boolean r0 = r4.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Cannot update already-empty constraints."
            androidx.core.util.Preconditions.checkState(r0, r2)
            java.util.Set r6 = r6.getDynamicRangeCaptureRequestConstraints(r5)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L45
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r4)
            r4.retainAll(r6)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L24
            goto L45
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "\n  "
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r2[r1] = r6
            r5 = 2
            r2[r5] = r0
            java.lang.String r5 = "Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r4.<init>(r5)
            throw r4
        L45:
            return
    }

    boolean is10BitDynamicRangeSupported() {
            r1 = this;
            boolean r0 = r1.mIs10BitSupported
            return r0
    }

    java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> resolveAndValidateDynamicRanges(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r9, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> r10, @androidx.annotation.NonNull java.util.List<java.lang.Integer> r11) {
            r8 = this;
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r9.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r0 = (androidx.camera.core.impl.AttachedSurfaceInfo) r0
            androidx.camera.core.DynamicRange r0 = r0.getDynamicRange()
            r2.add(r0)
            goto L9
        L1d:
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r9 = r8.mDynamicRangesInfo
            java.util.Set r1 = r9.getSupportedDynamicRanges()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r1)
            java.util.Iterator r9 = r2.iterator()
        L2c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r9.next()
            androidx.camera.core.DynamicRange r0 = (androidx.camera.core.DynamicRange) r0
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r3 = r8.mDynamicRangesInfo
            updateConstraints(r5, r0, r3)
            goto L2c
        L3e:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        L51:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r11.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r10.get(r4)
            androidx.camera.core.impl.UseCaseConfig r4 = (androidx.camera.core.impl.UseCaseConfig) r4
            androidx.camera.core.DynamicRange r6 = r4.getDynamicRange()
            boolean r7 = isFullyUnspecified(r6)
            if (r7 == 0) goto L75
            r3.add(r4)
            goto L51
        L75:
            boolean r6 = isPartiallySpecified(r6)
            if (r6 == 0) goto L7f
            r0.add(r4)
            goto L51
        L7f:
            r9.add(r4)
            goto L51
        L83:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r11 = r3
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.addAll(r9)
            r4.addAll(r0)
            r4.addAll(r11)
            java.util.Iterator r9 = r4.iterator()
        La0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lbf
            java.lang.Object r11 = r9.next()
            r4 = r11
            androidx.camera.core.impl.UseCaseConfig r4 = (androidx.camera.core.impl.UseCaseConfig) r4
            r0 = r8
            androidx.camera.core.DynamicRange r11 = r0.resolveDynamicRangeAndUpdateConstraints(r1, r2, r3, r4, r5)
            r10.put(r4, r11)
            boolean r0 = r2.contains(r11)
            if (r0 != 0) goto La0
            r3.add(r11)
            goto La0
        Lbf:
            return r10
    }
}
