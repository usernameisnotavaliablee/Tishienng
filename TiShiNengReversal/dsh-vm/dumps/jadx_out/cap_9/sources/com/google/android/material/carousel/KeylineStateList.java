package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final com.google.android.material.carousel.KeylineState defaultState;
    private final float endShiftRange;
    private final java.util.List<com.google.android.material.carousel.KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final java.util.List<com.google.android.material.carousel.KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(com.google.android.material.carousel.KeylineState r4, java.util.List<com.google.android.material.carousel.KeylineState> r5, java.util.List<com.google.android.material.carousel.KeylineState> r6) {
            r3 = this;
            r3.<init>()
            r3.defaultState = r4
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r3.startStateSteps = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            r3.endStateSteps = r0
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r5.get(r0)
            com.google.android.material.carousel.KeylineState r0 = (com.google.android.material.carousel.KeylineState) r0
            com.google.android.material.carousel.KeylineState$Keyline r0 = r0.getFirstKeyline()
            float r0 = r0.loc
            com.google.android.material.carousel.KeylineState$Keyline r2 = r4.getFirstKeyline()
            float r2 = r2.loc
            float r0 = r0 - r2
            r3.startShiftRange = r0
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastKeyline()
            float r4 = r4.loc
            int r2 = r6.size()
            int r2 = r2 - r1
            java.lang.Object r2 = r6.get(r2)
            com.google.android.material.carousel.KeylineState r2 = (com.google.android.material.carousel.KeylineState) r2
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getLastKeyline()
            float r2 = r2.loc
            float r4 = r4 - r2
            r3.endShiftRange = r4
            float[] r5 = getStateStepInterpolationPoints(r0, r5, r1)
            r3.startStateStepsInterpolationPoints = r5
            r5 = 0
            float[] r4 = getStateStepInterpolationPoints(r4, r6, r5)
            r3.endStateStepsInterpolationPoints = r4
            return
    }

    private com.google.android.material.carousel.KeylineState closestStateStepFromInterpolation(java.util.List<com.google.android.material.carousel.KeylineState> r2, float r3, float[] r4) {
            r1 = this;
            float[] r3 = getStateStepsRange(r2, r3, r4)
            r4 = 0
            r4 = r3[r4]
            r0 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L18
            r4 = 2
            r3 = r3[r4]
            int r3 = (int) r3
            java.lang.Object r2 = r2.get(r3)
            com.google.android.material.carousel.KeylineState r2 = (com.google.android.material.carousel.KeylineState) r2
            return r2
        L18:
            r4 = 1
            r3 = r3[r4]
            int r3 = (int) r3
            java.lang.Object r2 = r2.get(r3)
            com.google.android.material.carousel.KeylineState r2 = (com.google.android.material.carousel.KeylineState) r2
            return r2
    }

    private static int findFirstInBoundsKeylineIndex(com.google.android.material.carousel.KeylineState r3) {
            r0 = 0
        L1:
            java.util.List r1 = r3.getKeylines()
            int r1 = r1.size()
            if (r0 >= r1) goto L20
            java.util.List r1 = r3.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r1 = r1.locOffset
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L1d
            return r0
        L1d:
            int r0 = r0 + 1
            goto L1
        L20:
            r3 = -1
            return r3
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(com.google.android.material.carousel.KeylineState r2, float r3) {
            int r0 = r2.getLastFocalKeylineIndex()
        L4:
            java.util.List r1 = r2.getKeylines()
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            java.util.List r1 = r2.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r1 = r1.mask
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1f
            return r0
        L1f:
            int r0 = r0 + 1
            goto L4
        L22:
            java.util.List r2 = r2.getKeylines()
            int r2 = r2.size()
            int r2 = r2 + (-1)
            return r2
    }

    private static int findLastInBoundsKeylineIndex(com.google.android.material.carousel.Carousel r3, com.google.android.material.carousel.KeylineState r4) {
            int r0 = r3.getContainerHeight()
            boolean r1 = r3.isHorizontal()
            if (r1 == 0) goto Le
            int r0 = r3.getContainerWidth()
        Le:
            java.util.List r3 = r4.getKeylines()
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L18:
            if (r3 < 0) goto L2f
            java.util.List r1 = r4.getKeylines()
            java.lang.Object r1 = r1.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r1 = r1.locOffset
            float r2 = (float) r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L2c
            return r3
        L2c:
            int r3 = r3 + (-1)
            goto L18
        L2f:
            r3 = -1
            return r3
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(com.google.android.material.carousel.KeylineState r2, float r3) {
            int r0 = r2.getFirstFocalKeylineIndex()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1c
            java.util.List r1 = r2.getKeylines()
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r1 = r1.mask
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L19
            return r0
        L19:
            int r0 = r0 + (-1)
            goto L6
        L1c:
            r2 = 0
            return r2
    }

    static com.google.android.material.carousel.KeylineStateList from(com.google.android.material.carousel.Carousel r2, com.google.android.material.carousel.KeylineState r3) {
            com.google.android.material.carousel.KeylineStateList r0 = new com.google.android.material.carousel.KeylineStateList
            java.util.List r1 = getStateStepsStart(r3)
            java.util.List r2 = getStateStepsEnd(r2, r3)
            r0.<init>(r3, r1, r2)
            return r0
    }

    private static float[] getStateStepInterpolationPoints(float r6, java.util.List<com.google.android.material.carousel.KeylineState> r7, boolean r8) {
            int r0 = r7.size()
            float[] r1 = new float[r0]
            r2 = 1
        L7:
            if (r2 >= r0) goto L45
            int r3 = r2 + (-1)
            java.lang.Object r4 = r7.get(r3)
            com.google.android.material.carousel.KeylineState r4 = (com.google.android.material.carousel.KeylineState) r4
            java.lang.Object r5 = r7.get(r2)
            com.google.android.material.carousel.KeylineState r5 = (com.google.android.material.carousel.KeylineState) r5
            if (r8 == 0) goto L27
            com.google.android.material.carousel.KeylineState$Keyline r5 = r5.getFirstKeyline()
            float r5 = r5.loc
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getFirstKeyline()
            float r4 = r4.loc
            float r5 = r5 - r4
            goto L35
        L27:
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastKeyline()
            float r4 = r4.loc
            com.google.android.material.carousel.KeylineState$Keyline r5 = r5.getLastKeyline()
            float r5 = r5.loc
            float r5 = r4 - r5
        L35:
            float r5 = r5 / r6
            int r4 = r0 + (-1)
            if (r2 != r4) goto L3d
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L40
        L3d:
            r3 = r1[r3]
            float r3 = r3 + r5
        L40:
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L45:
            return r1
    }

    private static java.util.List<com.google.android.material.carousel.KeylineState> getStateStepsEnd(com.google.android.material.carousel.Carousel r9, com.google.android.material.carousel.KeylineState r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            int r2 = findLastInBoundsKeylineIndex(r9, r10)
            boolean r9 = isLastFocalItemAtRightOfContainer(r9, r10)
            if (r9 != 0) goto L77
            r9 = -1
            if (r2 != r9) goto L16
            goto L77
        L16:
            int r9 = r10.getLastFocalKeylineIndex()
            int r9 = r2 - r9
            com.google.android.material.carousel.KeylineState$Keyline r1 = r10.getFirstKeyline()
            float r1 = r1.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r3 = r10.getFirstKeyline()
            float r3 = r3.maskedItemSize
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r4 = r1 - r3
            r7 = 0
            r8 = 0
        L2f:
            if (r8 >= r9) goto L77
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.material.carousel.KeylineState r1 = (com.google.android.material.carousel.KeylineState) r1
            int r3 = r2 - r8
            int r3 = r3 + 1
            java.util.List r5 = r10.getKeylines()
            int r5 = r5.size()
            if (r3 >= r5) goto L5e
            java.util.List r5 = r10.getKeylines()
            java.lang.Object r3 = r5.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r3 = (com.google.android.material.carousel.KeylineState.Keyline) r3
            float r3 = r3.mask
            int r3 = findLastIndexBeforeFirstFocalKeylineWithMask(r1, r3)
            int r3 = r3 + 1
            goto L5f
        L5e:
            r3 = 0
        L5f:
            int r5 = r10.getFirstFocalKeylineIndex()
            int r5 = r5 + r8
            int r5 = r5 + 1
            int r6 = r10.getLastFocalKeylineIndex()
            int r6 = r6 + r8
            int r6 = r6 + 1
            com.google.android.material.carousel.KeylineState r1 = moveKeylineAndCreateKeylineState(r1, r2, r3, r4, r5, r6)
            r0.add(r1)
            int r8 = r8 + 1
            goto L2f
        L77:
            return r0
    }

    private static float[] getStateStepsRange(java.util.List<com.google.android.material.carousel.KeylineState> r7, float r8, float[] r9) {
            int r7 = r7.size()
            r0 = 0
            r1 = r9[r0]
            r2 = 1
            r3 = 1
        L9:
            r4 = 3
            if (r3 >= r7) goto L2b
            r5 = r9[r3]
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 > 0) goto L27
            int r7 = r3 + (-1)
            r9 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            float r8 = com.google.android.material.animation.AnimationUtils.lerp(r6, r9, r1, r5, r8)
            float r7 = (float) r7
            float r9 = (float) r3
            float[] r1 = new float[r4]
            r1[r0] = r8
            r1[r2] = r7
            r7 = 2
            r1[r7] = r9
            return r1
        L27:
            int r3 = r3 + 1
            r1 = r5
            goto L9
        L2b:
            float[] r7 = new float[r4]
            r7 = {x0032: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            return r7
    }

    private static java.util.List<com.google.android.material.carousel.KeylineState> getStateStepsStart(com.google.android.material.carousel.KeylineState r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            int r2 = findFirstInBoundsKeylineIndex(r9)
            boolean r1 = isFirstFocalItemAtLeftOfContainer(r9)
            if (r1 != 0) goto L7a
            r1 = -1
            if (r2 != r1) goto L16
            goto L7a
        L16:
            int r1 = r9.getFirstFocalKeylineIndex()
            int r1 = r1 + (-1)
            int r7 = r1 - r2
            com.google.android.material.carousel.KeylineState$Keyline r1 = r9.getFirstKeyline()
            float r1 = r1.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r3 = r9.getFirstKeyline()
            float r3 = r3.maskedItemSize
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r4 = r1 - r3
            r1 = 0
            r8 = 0
        L31:
            if (r8 > r7) goto L7a
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.material.carousel.KeylineState r1 = (com.google.android.material.carousel.KeylineState) r1
            int r3 = r2 + r8
            java.util.List r5 = r9.getKeylines()
            int r5 = r5.size()
            int r5 = r5 + (-1)
            int r3 = r3 + (-1)
            if (r3 < 0) goto L61
            java.util.List r5 = r9.getKeylines()
            java.lang.Object r3 = r5.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r3 = (com.google.android.material.carousel.KeylineState.Keyline) r3
            float r3 = r3.mask
            int r3 = findFirstIndexAfterLastFocalKeylineWithMask(r1, r3)
            int r5 = r3 + (-1)
        L61:
            r3 = r5
            int r5 = r9.getFirstFocalKeylineIndex()
            int r5 = r5 - r8
            int r5 = r5 + (-1)
            int r6 = r9.getLastFocalKeylineIndex()
            int r6 = r6 - r8
            int r6 = r6 + (-1)
            com.google.android.material.carousel.KeylineState r1 = moveKeylineAndCreateKeylineState(r1, r2, r3, r4, r5, r6)
            r0.add(r1)
            int r8 = r8 + 1
            goto L31
        L7a:
            return r0
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(com.google.android.material.carousel.KeylineState r3) {
            com.google.android.material.carousel.KeylineState$Keyline r0 = r3.getFirstFocalKeyline()
            float r0 = r0.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r1 = r3.getFirstFocalKeyline()
            float r1 = r1.maskedItemSize
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 - r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L22
            com.google.android.material.carousel.KeylineState$Keyline r0 = r3.getFirstFocalKeyline()
            com.google.android.material.carousel.KeylineState$Keyline r3 = r3.getFirstKeyline()
            if (r0 != r3) goto L20
            goto L22
        L20:
            r3 = 0
            return r3
        L22:
            r3 = 1
            return r3
    }

    private static boolean isLastFocalItemAtRightOfContainer(com.google.android.material.carousel.Carousel r3, com.google.android.material.carousel.KeylineState r4) {
            int r0 = r3.getContainerHeight()
            boolean r1 = r3.isHorizontal()
            if (r1 == 0) goto Le
            int r0 = r3.getContainerWidth()
        Le:
            com.google.android.material.carousel.KeylineState$Keyline r3 = r4.getLastFocalKeyline()
            float r3 = r3.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r1 = r4.getLastFocalKeyline()
            float r1 = r1.maskedItemSize
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r3 + r1
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L30
            com.google.android.material.carousel.KeylineState$Keyline r3 = r4.getLastFocalKeyline()
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastKeyline()
            if (r3 != r4) goto L2e
            goto L30
        L2e:
            r3 = 0
            return r3
        L30:
            r3 = 1
            return r3
    }

    private static com.google.android.material.carousel.KeylineState lerp(java.util.List<com.google.android.material.carousel.KeylineState> r1, float r2, float[] r3) {
            float[] r2 = getStateStepsRange(r1, r2, r3)
            r3 = 1
            r3 = r2[r3]
            int r3 = (int) r3
            java.lang.Object r3 = r1.get(r3)
            com.google.android.material.carousel.KeylineState r3 = (com.google.android.material.carousel.KeylineState) r3
            r0 = 2
            r0 = r2[r0]
            int r0 = (int) r0
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.carousel.KeylineState r1 = (com.google.android.material.carousel.KeylineState) r1
            r0 = 0
            r2 = r2[r0]
            com.google.android.material.carousel.KeylineState r1 = com.google.android.material.carousel.KeylineState.lerp(r3, r1, r2)
            return r1
    }

    private static com.google.android.material.carousel.KeylineState moveKeylineAndCreateKeylineState(com.google.android.material.carousel.KeylineState r6, int r7, int r8, float r9, int r10, int r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r6.getKeylines()
            r0.<init>(r1)
            java.lang.Object r7 = r0.remove(r7)
            com.google.android.material.carousel.KeylineState$Keyline r7 = (com.google.android.material.carousel.KeylineState.Keyline) r7
            r0.add(r8, r7)
            com.google.android.material.carousel.KeylineState$Builder r7 = new com.google.android.material.carousel.KeylineState$Builder
            float r6 = r6.getItemSize()
            r7.<init>(r6)
            r6 = 0
            r8 = 0
        L1d:
            int r1 = r0.size()
            if (r8 >= r1) goto L42
            java.lang.Object r1 = r0.get(r8)
            com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
            float r2 = r1.maskedItemSize
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r2 / r3
            float r3 = r3 + r9
            if (r8 < r10) goto L36
            if (r8 > r11) goto L36
            r4 = 1
            goto L37
        L36:
            r4 = 0
        L37:
            float r5 = r1.mask
            r7.addKeyline(r3, r5, r2, r4)
            float r1 = r1.maskedItemSize
            float r9 = r9 + r1
            int r8 = r8 + 1
            goto L1d
        L42:
            com.google.android.material.carousel.KeylineState r6 = r7.build()
            return r6
    }

    com.google.android.material.carousel.KeylineState getDefaultState() {
            r1 = this;
            com.google.android.material.carousel.KeylineState r0 = r1.defaultState
            return r0
    }

    com.google.android.material.carousel.KeylineState getEndState() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState> r0 = r2.endStateSteps
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState r0 = (com.google.android.material.carousel.KeylineState) r0
            return r0
    }

    java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> getKeylineStateForPositionMap(int r11, int r12, int r13, boolean r14) {
            r10 = this;
            com.google.android.material.carousel.KeylineState r0 = r10.defaultState
            float r0 = r0.getItemSize()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = 0
        Le:
            r5 = -1
            r6 = 1
            if (r3 >= r11) goto L52
            if (r14 == 0) goto L18
            int r7 = r11 - r3
            int r7 = r7 - r6
            goto L19
        L18:
            r7 = r3
        L19:
            float r8 = (float) r7
            float r8 = r8 * r0
            if (r14 == 0) goto L1f
            goto L20
        L1f:
            r5 = 1
        L20:
            float r5 = (float) r5
            float r8 = r8 * r5
            float r5 = (float) r13
            float r9 = r10.endShiftRange
            float r5 = r5 - r9
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L35
            java.util.List<com.google.android.material.carousel.KeylineState> r5 = r10.endStateSteps
            int r5 = r5.size()
            int r5 = r11 - r5
            if (r3 < r5) goto L4f
        L35:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r10.endStateSteps
            int r8 = r7.size()
            int r8 = r8 - r6
            int r6 = androidx.core.math.MathUtils.clamp(r4, r2, r8)
            java.lang.Object r6 = r7.get(r6)
            com.google.android.material.carousel.KeylineState r6 = (com.google.android.material.carousel.KeylineState) r6
            r1.put(r5, r6)
            int r4 = r4 + 1
        L4f:
            int r3 = r3 + 1
            goto Le
        L52:
            int r13 = r11 + (-1)
            r3 = 0
        L55:
            if (r13 < 0) goto L96
            if (r14 == 0) goto L5d
            int r4 = r11 - r13
            int r4 = r4 - r6
            goto L5e
        L5d:
            r4 = r13
        L5e:
            float r7 = (float) r4
            float r7 = r7 * r0
            if (r14 == 0) goto L65
            r8 = -1
            goto L66
        L65:
            r8 = 1
        L66:
            float r8 = (float) r8
            float r7 = r7 * r8
            float r8 = (float) r12
            float r9 = r10.startShiftRange
            float r8 = r8 + r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L79
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r10.startStateSteps
            int r7 = r7.size()
            if (r13 >= r7) goto L93
        L79:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r10.startStateSteps
            int r8 = r7.size()
            int r8 = r8 - r6
            int r8 = androidx.core.math.MathUtils.clamp(r3, r2, r8)
            java.lang.Object r7 = r7.get(r8)
            com.google.android.material.carousel.KeylineState r7 = (com.google.android.material.carousel.KeylineState) r7
            r1.put(r4, r7)
            int r3 = r3 + 1
        L93:
            int r13 = r13 + (-1)
            goto L55
        L96:
            return r1
    }

    public com.google.android.material.carousel.KeylineState getShiftedState(float r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            com.google.android.material.carousel.KeylineState r2 = r1.getShiftedState(r2, r3, r4, r0)
            return r2
    }

    com.google.android.material.carousel.KeylineState getShiftedState(float r6, float r7, float r8, boolean r9) {
            r5 = this;
            float r0 = r5.startShiftRange
            float r0 = r0 + r7
            float r1 = r5.endShiftRange
            float r1 = r8 - r1
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L17
            float r6 = com.google.android.material.animation.AnimationUtils.lerp(r3, r2, r7, r0, r6)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r5.startStateSteps
            float[] r8 = r5.startStateStepsInterpolationPoints
            goto L23
        L17:
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 <= 0) goto L2f
            float r6 = com.google.android.material.animation.AnimationUtils.lerp(r2, r3, r1, r8, r6)
            java.util.List<com.google.android.material.carousel.KeylineState> r7 = r5.endStateSteps
            float[] r8 = r5.endStateStepsInterpolationPoints
        L23:
            if (r9 == 0) goto L2a
            com.google.android.material.carousel.KeylineState r6 = r5.closestStateStepFromInterpolation(r7, r6, r8)
            return r6
        L2a:
            com.google.android.material.carousel.KeylineState r6 = lerp(r7, r6, r8)
            return r6
        L2f:
            com.google.android.material.carousel.KeylineState r6 = r5.defaultState
            return r6
    }

    com.google.android.material.carousel.KeylineState getStartState() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState> r0 = r2.startStateSteps
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState r0 = (com.google.android.material.carousel.KeylineState) r0
            return r0
    }
}
