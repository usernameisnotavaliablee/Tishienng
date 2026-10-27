package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines;
    private final int lastFocalKeylineIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.material.carousel.KeylineState$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private int firstFocalKeylineIndex;
        private final float itemSize;
        private int lastFocalKeylineIndex;
        private float lastKeylineMaskedSize;
        private com.google.android.material.carousel.KeylineState.Keyline tmpFirstFocalKeyline;
        private final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> tmpKeylines;
        private com.google.android.material.carousel.KeylineState.Keyline tmpLastFocalKeyline;

        Builder(float r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.tmpKeylines = r0
                r0 = -1
                r1.firstFocalKeylineIndex = r0
                r1.lastFocalKeylineIndex = r0
                r0 = 0
                r1.lastKeylineMaskedSize = r0
                r1.itemSize = r2
                return
        }

        private static float calculateKeylineLocationForItemPosition(float r0, float r1, int r2, int r3) {
                float r2 = (float) r2
                float r2 = r2 * r1
                float r0 = r0 - r2
                float r2 = (float) r3
                float r2 = r2 * r1
                float r0 = r0 + r2
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, float r4) {
                r1 = this;
                r0 = 0
                com.google.android.material.carousel.KeylineState$Builder r2 = r1.addKeyline(r2, r3, r4, r0)
                return r2
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        com.google.android.material.carousel.KeylineState.Builder addKeyline(float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, float r5, boolean r6) {
                r2 = this;
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 > 0) goto L6
                return r2
            L6:
                com.google.android.material.carousel.KeylineState$Keyline r0 = new com.google.android.material.carousel.KeylineState$Keyline
                r1 = 1
                r0.<init>(r1, r3, r4, r5)
                if (r6 == 0) goto L51
                com.google.android.material.carousel.KeylineState$Keyline r3 = r2.tmpFirstFocalKeyline
                if (r3 != 0) goto L1c
                r2.tmpFirstFocalKeyline = r0
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r3 = r2.tmpKeylines
                int r3 = r3.size()
                r2.firstFocalKeylineIndex = r3
            L1c:
                int r3 = r2.lastFocalKeylineIndex
                r4 = -1
                if (r3 == r4) goto L36
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r3 = r2.tmpKeylines
                int r3 = r3.size()
                int r4 = r2.lastFocalKeylineIndex
                int r3 = r3 - r4
                r4 = 1
                if (r3 > r4) goto L2e
                goto L36
            L2e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines."
                r3.<init>(r4)
                throw r3
            L36:
                com.google.android.material.carousel.KeylineState$Keyline r3 = r2.tmpFirstFocalKeyline
                float r3 = r3.maskedItemSize
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 != 0) goto L49
                r2.tmpLastFocalKeyline = r0
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r3 = r2.tmpKeylines
                int r3 = r3.size()
                r2.lastFocalKeylineIndex = r3
                goto L7b
            L49:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Keylines that are marked as focal must all have the same masked item size."
                r3.<init>(r4)
                throw r3
            L51:
                com.google.android.material.carousel.KeylineState$Keyline r3 = r2.tmpFirstFocalKeyline
                if (r3 != 0) goto L66
                float r3 = r0.maskedItemSize
                float r4 = r2.lastKeylineMaskedSize
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 < 0) goto L5e
                goto L66
            L5e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Keylines before the first focal keyline must be ordered by incrementing masked item size."
                r3.<init>(r4)
                throw r3
            L66:
                com.google.android.material.carousel.KeylineState$Keyline r3 = r2.tmpLastFocalKeyline
                if (r3 == 0) goto L7b
                float r3 = r0.maskedItemSize
                float r4 = r2.lastKeylineMaskedSize
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 > 0) goto L73
                goto L7b
            L73:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Keylines after the last focal keyline must be ordered by decreasing masked item size."
                r3.<init>(r4)
                throw r3
            L7b:
                float r3 = r0.maskedItemSize
                r2.lastKeylineMaskedSize = r3
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r3 = r2.tmpKeylines
                r3.add(r0)
                return r2
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        com.google.android.material.carousel.KeylineState.Builder addKeylineRange(float r7, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r8, float r9, int r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                com.google.android.material.carousel.KeylineState$Builder r7 = r0.addKeylineRange(r1, r2, r3, r4, r5)
                return r7
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        com.google.android.material.carousel.KeylineState.Builder addKeylineRange(float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, float r5, int r6, boolean r7) {
                r2 = this;
                if (r6 <= 0) goto L15
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 > 0) goto L8
                goto L15
            L8:
                r0 = 0
            L9:
                if (r0 >= r6) goto L15
                float r1 = (float) r0
                float r1 = r1 * r5
                float r1 = r1 + r3
                r2.addKeyline(r1, r4, r5, r7)
                int r0 = r0 + 1
                goto L9
            L15:
                return r2
        }

        @androidx.annotation.NonNull
        com.google.android.material.carousel.KeylineState build() {
                r7 = this;
                com.google.android.material.carousel.KeylineState$Keyline r0 = r7.tmpFirstFocalKeyline
                if (r0 == 0) goto L44
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r0 = 0
            La:
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r7.tmpKeylines
                int r1 = r1.size()
                if (r0 >= r1) goto L37
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r7.tmpKeylines
                java.lang.Object r1 = r1.get(r0)
                com.google.android.material.carousel.KeylineState$Keyline r1 = (com.google.android.material.carousel.KeylineState.Keyline) r1
                com.google.android.material.carousel.KeylineState$Keyline r2 = new com.google.android.material.carousel.KeylineState$Keyline
                com.google.android.material.carousel.KeylineState$Keyline r4 = r7.tmpFirstFocalKeyline
                float r4 = r4.locOffset
                float r5 = r7.itemSize
                int r6 = r7.firstFocalKeylineIndex
                float r4 = calculateKeylineLocationForItemPosition(r4, r5, r6, r0)
                float r5 = r1.locOffset
                float r6 = r1.mask
                float r1 = r1.maskedItemSize
                r2.<init>(r4, r5, r6, r1)
                r3.add(r2)
                int r0 = r0 + 1
                goto La
            L37:
                com.google.android.material.carousel.KeylineState r1 = new com.google.android.material.carousel.KeylineState
                float r2 = r7.itemSize
                int r4 = r7.firstFocalKeylineIndex
                int r5 = r7.lastFocalKeylineIndex
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            L44:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "There must be a keyline marked as focal."
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Keyline {
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;

        Keyline(float r1, float r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.loc = r1
                r0.locOffset = r2
                r0.mask = r3
                r0.maskedItemSize = r4
                return
        }

        static com.google.android.material.carousel.KeylineState.Keyline lerp(com.google.android.material.carousel.KeylineState.Keyline r5, com.google.android.material.carousel.KeylineState.Keyline r6, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r7) {
                com.google.android.material.carousel.KeylineState$Keyline r0 = new com.google.android.material.carousel.KeylineState$Keyline
                float r1 = r5.loc
                float r2 = r6.loc
                float r1 = com.google.android.material.animation.AnimationUtils.lerp(r1, r2, r7)
                float r2 = r5.locOffset
                float r3 = r6.locOffset
                float r2 = com.google.android.material.animation.AnimationUtils.lerp(r2, r3, r7)
                float r3 = r5.mask
                float r4 = r6.mask
                float r3 = com.google.android.material.animation.AnimationUtils.lerp(r3, r4, r7)
                float r5 = r5.maskedItemSize
                float r6 = r6.maskedItemSize
                float r5 = com.google.android.material.animation.AnimationUtils.lerp(r5, r6, r7)
                r0.<init>(r1, r2, r3, r5)
                return r0
        }
    }

    private KeylineState(float r1, java.util.List<com.google.android.material.carousel.KeylineState.Keyline> r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.itemSize = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.keylines = r1
            r0.firstFocalKeylineIndex = r3
            r0.lastFocalKeylineIndex = r4
            return
    }

    /* synthetic */ KeylineState(float r1, java.util.List r2, int r3, int r4, com.google.android.material.carousel.KeylineState.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static com.google.android.material.carousel.KeylineState lerp(com.google.android.material.carousel.KeylineState r6, com.google.android.material.carousel.KeylineState r7, float r8) {
            float r0 = r6.getItemSize()
            float r1 = r7.getItemSize()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6e
            java.util.List r0 = r6.getKeylines()
            java.util.List r1 = r7.getKeylines()
            int r2 = r0.size()
            int r3 = r1.size()
            if (r2 != r3) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L24:
            java.util.List r4 = r6.getKeylines()
            int r4 = r4.size()
            if (r3 >= r4) goto L44
            java.lang.Object r4 = r0.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r4 = (com.google.android.material.carousel.KeylineState.Keyline) r4
            java.lang.Object r5 = r1.get(r3)
            com.google.android.material.carousel.KeylineState$Keyline r5 = (com.google.android.material.carousel.KeylineState.Keyline) r5
            com.google.android.material.carousel.KeylineState$Keyline r4 = com.google.android.material.carousel.KeylineState.Keyline.lerp(r4, r5, r8)
            r2.add(r4)
            int r3 = r3 + 1
            goto L24
        L44:
            int r0 = r6.getFirstFocalKeylineIndex()
            int r1 = r7.getFirstFocalKeylineIndex()
            int r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r8)
            int r1 = r6.getLastFocalKeylineIndex()
            int r7 = r7.getLastFocalKeylineIndex()
            int r7 = com.google.android.material.animation.AnimationUtils.lerp(r1, r7, r8)
            com.google.android.material.carousel.KeylineState r8 = new com.google.android.material.carousel.KeylineState
            float r6 = r6.getItemSize()
            r8.<init>(r6, r2, r0, r7)
            return r8
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Keylines being linearly interpolated must have the same number of keylines."
            r6.<init>(r7)
            throw r6
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Keylines being linearly interpolated must have the same item size."
            r6.<init>(r7)
            throw r6
    }

    static com.google.android.material.carousel.KeylineState reverse(com.google.android.material.carousel.KeylineState r10) {
            com.google.android.material.carousel.KeylineState$Builder r0 = new com.google.android.material.carousel.KeylineState$Builder
            float r1 = r10.getItemSize()
            r0.<init>(r1)
            com.google.android.material.carousel.KeylineState$Keyline r1 = r10.getFirstKeyline()
            float r1 = r1.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r2 = r10.getFirstKeyline()
            float r2 = r2.maskedItemSize
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            java.util.List r2 = r10.getKeylines()
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 - r4
        L23:
            if (r2 < 0) goto L4f
            java.util.List r5 = r10.getKeylines()
            java.lang.Object r5 = r5.get(r2)
            com.google.android.material.carousel.KeylineState$Keyline r5 = (com.google.android.material.carousel.KeylineState.Keyline) r5
            float r6 = r5.maskedItemSize
            float r6 = r6 / r3
            float r6 = r6 + r1
            int r7 = r10.getFirstFocalKeylineIndex()
            if (r2 < r7) goto L41
            int r7 = r10.getLastFocalKeylineIndex()
            if (r2 > r7) goto L41
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            float r8 = r5.mask
            float r9 = r5.maskedItemSize
            r0.addKeyline(r6, r8, r9, r7)
            float r5 = r5.maskedItemSize
            float r1 = r1 + r5
            int r2 = r2 + (-1)
            goto L23
        L4f:
            com.google.android.material.carousel.KeylineState r10 = r0.build()
            return r10
    }

    com.google.android.material.carousel.KeylineState.Keyline getFirstFocalKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            int r1 = r2.firstFocalKeylineIndex
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    int getFirstFocalKeylineIndex() {
            r1 = this;
            int r0 = r1.firstFocalKeylineIndex
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getFirstKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    float getItemSize() {
            r1 = this;
            float r0 = r1.itemSize
            return r0
    }

    java.util.List<com.google.android.material.carousel.KeylineState.Keyline> getKeylines() {
            r1 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r1.keylines
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getLastFocalKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            int r1 = r2.lastFocalKeylineIndex
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }

    int getLastFocalKeylineIndex() {
            r1 = this;
            int r0 = r1.lastFocalKeylineIndex
            return r0
    }

    com.google.android.material.carousel.KeylineState.Keyline getLastKeyline() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r0 = r2.keylines
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
            return r0
    }
}
