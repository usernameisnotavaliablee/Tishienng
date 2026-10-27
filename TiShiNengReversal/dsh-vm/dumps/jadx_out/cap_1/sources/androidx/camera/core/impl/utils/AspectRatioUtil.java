package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AspectRatioUtil {
    private static final int ALIGN16 = 16;
    public static final android.util.Rational ASPECT_RATIO_16_9 = null;
    public static final android.util.Rational ASPECT_RATIO_3_4 = null;
    public static final android.util.Rational ASPECT_RATIO_4_3 = null;
    public static final android.util.Rational ASPECT_RATIO_9_16 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements java.util.Comparator<android.util.Rational> {
        private final android.util.Rational mFullFovRatio;
        private final android.util.Rational mTargetRatio;
        private final android.graphics.RectF mTransformedMappingArea;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(@androidx.annotation.NonNull android.util.Rational r3, @androidx.annotation.Nullable android.util.Rational r4) {
                r2 = this;
                r2.<init>()
                r2.mTargetRatio = r3
                if (r4 == 0) goto L8
                goto Lf
            L8:
                android.util.Rational r4 = new android.util.Rational
                r0 = 4
                r1 = 3
                r4.<init>(r0, r1)
            Lf:
                r2.mFullFovRatio = r4
                android.graphics.RectF r3 = r2.getTransformedMappingArea(r3)
                r2.mTransformedMappingArea = r3
                return
        }

        private float getMappingAreaSize(android.graphics.RectF r2) {
                r1 = this;
                float r0 = r2.width()
                float r2 = r2.height()
                float r0 = r0 * r2
                return r0
        }

        private float getOverlappingAreaSize(android.graphics.RectF r4, android.graphics.RectF r5) {
                r3 = this;
                float r0 = r4.width()
                float r1 = r5.width()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L11
                float r0 = r4.width()
                goto L15
            L11:
                float r0 = r5.width()
            L15:
                float r1 = r4.height()
                float r2 = r5.height()
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L26
                float r4 = r4.height()
                goto L2a
            L26:
                float r4 = r5.height()
            L2a:
                float r0 = r0 * r4
                return r0
        }

        private android.graphics.RectF getTransformedMappingArea(android.util.Rational r6) {
                r5 = this;
                float r0 = r6.floatValue()
                android.util.Rational r1 = r5.mFullFovRatio
                float r1 = r1.floatValue()
                r2 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L23
                android.graphics.RectF r6 = new android.graphics.RectF
                android.util.Rational r0 = r5.mFullFovRatio
                int r0 = r0.getNumerator()
                float r0 = (float) r0
                android.util.Rational r1 = r5.mFullFovRatio
                int r1 = r1.getDenominator()
                float r1 = (float) r1
                r6.<init>(r2, r2, r0, r1)
                return r6
            L23:
                float r0 = r6.floatValue()
                android.util.Rational r1 = r5.mFullFovRatio
                float r1 = r1.floatValue()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L52
                android.graphics.RectF r0 = new android.graphics.RectF
                android.util.Rational r1 = r5.mFullFovRatio
                int r1 = r1.getNumerator()
                float r1 = (float) r1
                int r3 = r6.getDenominator()
                float r3 = (float) r3
                android.util.Rational r4 = r5.mFullFovRatio
                int r4 = r4.getNumerator()
                float r4 = (float) r4
                float r3 = r3 * r4
                int r6 = r6.getNumerator()
                float r6 = (float) r6
                float r3 = r3 / r6
                r0.<init>(r2, r2, r1, r3)
                return r0
            L52:
                android.graphics.RectF r0 = new android.graphics.RectF
                int r1 = r6.getNumerator()
                float r1 = (float) r1
                android.util.Rational r3 = r5.mFullFovRatio
                int r3 = r3.getDenominator()
                float r3 = (float) r3
                float r1 = r1 * r3
                int r6 = r6.getDenominator()
                float r6 = (float) r6
                float r1 = r1 / r6
                android.util.Rational r6 = r5.mFullFovRatio
                int r6 = r6.getDenominator()
                float r6 = (float) r6
                r0.<init>(r2, r2, r1, r6)
                return r0
        }

        private boolean isMappingAreaCovered(android.graphics.RectF r3, android.graphics.RectF r4) {
                r2 = this;
                float r0 = r3.width()
                float r1 = r4.width()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L1a
                float r3 = r3.height()
                float r4 = r4.height()
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 < 0) goto L1a
                r3 = 1
                return r3
            L1a:
                r3 = 0
                return r3
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.util.Rational r3, android.util.Rational r4) {
                r2 = this;
                boolean r0 = r3.equals(r4)
                if (r0 == 0) goto L8
                r3 = 0
                return r3
            L8:
                android.graphics.RectF r3 = r2.getTransformedMappingArea(r3)
                android.graphics.RectF r4 = r2.getTransformedMappingArea(r4)
                android.graphics.RectF r0 = r2.mTransformedMappingArea
                boolean r0 = r2.isMappingAreaCovered(r3, r0)
                android.graphics.RectF r1 = r2.mTransformedMappingArea
                boolean r1 = r2.isMappingAreaCovered(r4, r1)
                if (r0 == 0) goto L2f
                if (r1 == 0) goto L2f
                float r3 = r2.getMappingAreaSize(r3)
                float r4 = r2.getMappingAreaSize(r4)
                float r3 = r3 - r4
                float r3 = java.lang.Math.signum(r3)
                int r3 = (int) r3
                return r3
            L2f:
                if (r0 == 0) goto L33
                r3 = -1
                return r3
            L33:
                if (r1 == 0) goto L37
                r3 = 1
                return r3
            L37:
                android.graphics.RectF r0 = r2.mTransformedMappingArea
                float r3 = r2.getOverlappingAreaSize(r3, r0)
                android.graphics.RectF r0 = r2.mTransformedMappingArea
                float r4 = r2.getOverlappingAreaSize(r4, r0)
                float r3 = r3 - r4
                float r3 = java.lang.Math.signum(r3)
                int r3 = (int) r3
                int r3 = -r3
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.util.Rational r1, android.util.Rational r2) {
                r0 = this;
                android.util.Rational r1 = (android.util.Rational) r1
                android.util.Rational r2 = (android.util.Rational) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            android.util.Rational r0 = new android.util.Rational
            r1 = 4
            r2 = 3
            r0.<init>(r1, r2)
            androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3 = r0
            android.util.Rational r0 = new android.util.Rational
            r0.<init>(r2, r1)
            androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_3_4 = r0
            android.util.Rational r0 = new android.util.Rational
            r1 = 16
            r2 = 9
            r0.<init>(r1, r2)
            androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9 = r0
            android.util.Rational r0 = new android.util.Rational
            r0.<init>(r2, r1)
            androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_9_16 = r0
            return
    }

    private AspectRatioUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasMatchingAspectRatio(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.Nullable android.util.Rational r2) {
            android.util.Size r0 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA
            boolean r1 = hasMatchingAspectRatio(r1, r2, r0)
            return r1
    }

    public static boolean hasMatchingAspectRatio(@androidx.annotation.NonNull android.util.Size r4, @androidx.annotation.Nullable android.util.Rational r5, @androidx.annotation.NonNull android.util.Size r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.util.Rational r1 = new android.util.Rational
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L19
            r4 = 1
            return r4
        L19:
            int r1 = androidx.camera.core.internal.utils.SizeUtil.getArea(r4)
            int r6 = androidx.camera.core.internal.utils.SizeUtil.getArea(r6)
            if (r1 < r6) goto L28
            boolean r4 = isPossibleMod16FromAspectRatio(r4, r5)
            return r4
        L28:
            return r0
    }

    private static boolean isPossibleMod16FromAspectRatio(@androidx.annotation.NonNull android.util.Size r5, @androidx.annotation.NonNull android.util.Rational r6) {
            int r0 = r5.getWidth()
            int r5 = r5.getHeight()
            android.util.Rational r1 = new android.util.Rational
            int r2 = r6.getDenominator()
            int r3 = r6.getNumerator()
            r1.<init>(r2, r3)
            int r2 = r0 % 16
            r3 = 0
            if (r2 != 0) goto L3a
            int r4 = r5 % 16
            if (r4 != 0) goto L3a
            int r2 = r5 + (-16)
            int r2 = java.lang.Math.max(r3, r2)
            boolean r6 = ratioIntersectsMod16Segment(r2, r0, r6)
            if (r6 != 0) goto L38
            int r0 = r0 + (-16)
            int r6 = java.lang.Math.max(r3, r0)
            boolean r5 = ratioIntersectsMod16Segment(r6, r5, r1)
            if (r5 == 0) goto L37
            goto L38
        L37:
            return r3
        L38:
            r5 = 1
            return r5
        L3a:
            if (r2 != 0) goto L41
            boolean r5 = ratioIntersectsMod16Segment(r5, r0, r6)
            return r5
        L41:
            int r6 = r5 % 16
            if (r6 != 0) goto L4a
            boolean r5 = ratioIntersectsMod16Segment(r0, r5, r1)
            return r5
        L4a:
            return r3
    }

    private static boolean ratioIntersectsMod16Segment(int r7, int r8, android.util.Rational r9) {
            int r0 = r8 % 16
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.util.Preconditions.checkArgument(r0)
            int r0 = r9.getNumerator()
            int r7 = r7 * r0
            double r3 = (double) r7
            int r7 = r9.getDenominator()
            double r5 = (double) r7
            double r3 = r3 / r5
            int r7 = r8 + (-16)
            int r7 = java.lang.Math.max(r2, r7)
            double r5 = (double) r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2c
            int r8 = r8 + 16
            double r7 = (double) r8
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2c
            return r1
        L2c:
            return r2
    }
}
