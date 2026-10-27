package androidx.customview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FocusStrategy {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface BoundsAdapter<T> {
        void obtainBounds(T r1, android.graphics.Rect r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CollectionAdapter<T, V> {
        V get(T r1, int r2);

        int size(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SequentialComparator<T> implements java.util.Comparator<T> {
        private final androidx.customview.widget.FocusStrategy.BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final android.graphics.Rect mTemp1;
        private final android.graphics.Rect mTemp2;

        SequentialComparator(boolean r2, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTemp1 = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTemp2 = r0
                r1.mIsLayoutRtl = r2
                r1.mAdapter = r3
                return
        }

        @Override // java.util.Comparator
        public int compare(T r5, T r6) {
                r4 = this;
                android.graphics.Rect r0 = r4.mTemp1
                android.graphics.Rect r1 = r4.mTemp2
                androidx.customview.widget.FocusStrategy$BoundsAdapter<T> r2 = r4.mAdapter
                r2.obtainBounds(r5, r0)
                androidx.customview.widget.FocusStrategy$BoundsAdapter<T> r5 = r4.mAdapter
                r5.obtainBounds(r6, r1)
                int r5 = r0.top
                int r6 = r1.top
                r2 = -1
                if (r5 >= r6) goto L16
                return r2
            L16:
                r3 = 1
                if (r5 <= r6) goto L1a
                return r3
            L1a:
                int r5 = r0.left
                int r6 = r1.left
                if (r5 >= r6) goto L26
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L25
                return r3
            L25:
                return r2
            L26:
                if (r5 <= r6) goto L2e
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L2d
                return r2
            L2d:
                return r3
            L2e:
                int r5 = r0.bottom
                int r6 = r1.bottom
                if (r5 >= r6) goto L35
                return r2
            L35:
                if (r5 <= r6) goto L38
                return r3
            L38:
                int r5 = r0.right
                int r6 = r1.right
                if (r5 >= r6) goto L44
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L43
                return r3
            L43:
                return r2
            L44:
                if (r5 <= r6) goto L4c
                boolean r5 = r4.mIsLayoutRtl
                if (r5 == 0) goto L4b
                return r2
            L4b:
                return r3
            L4c:
                r5 = 0
                return r5
        }
    }

    private FocusStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean beamBeats(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5, @androidx.annotation.NonNull android.graphics.Rect r6) {
            boolean r0 = beamsOverlap(r3, r4, r5)
            boolean r1 = beamsOverlap(r3, r4, r6)
            r2 = 0
            if (r1 != 0) goto L2c
            if (r0 != 0) goto Le
            goto L2c
        Le:
            boolean r0 = isToDirectionOf(r3, r4, r6)
            r1 = 1
            if (r0 != 0) goto L16
            return r1
        L16:
            r0 = 17
            if (r3 == r0) goto L2b
            r0 = 66
            if (r3 != r0) goto L1f
            goto L2b
        L1f:
            int r5 = majorAxisDistance(r3, r4, r5)
            int r3 = majorAxisDistanceToFarEdge(r3, r4, r6)
            if (r5 >= r3) goto L2a
            return r1
        L2a:
            return r2
        L2b:
            return r1
        L2c:
            return r2
    }

    private static boolean beamsOverlap(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5) {
            r0 = 17
            r1 = 0
            r2 = 1
            if (r3 == r0) goto L29
            r0 = 33
            if (r3 == r0) goto L1b
            r0 = 66
            if (r3 == r0) goto L29
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L1b:
            int r3 = r5.right
            int r0 = r4.left
            if (r3 < r0) goto L28
            int r3 = r5.left
            int r4 = r4.right
            if (r3 > r4) goto L28
            return r2
        L28:
            return r1
        L29:
            int r3 = r5.bottom
            int r0 = r4.top
            if (r3 < r0) goto L36
            int r3 = r5.top
            int r4 = r4.bottom
            if (r3 > r4) goto L36
            return r2
        L36:
            return r1
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@androidx.annotation.NonNull L r7, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r8, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r9, @androidx.annotation.Nullable T r10, @androidx.annotation.NonNull android.graphics.Rect r11, int r12) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L3e
            r1 = 33
            if (r12 == r1) goto L34
            r1 = 66
            if (r12 == r1) goto L29
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L21
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            r0.offset(r2, r1)
            goto L47
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L29:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            r0.offset(r1, r2)
            goto L47
        L34:
            int r1 = r11.height()
            int r1 = r1 + 1
            r0.offset(r2, r1)
            goto L47
        L3e:
            int r1 = r11.width()
            int r1 = r1 + 1
            r0.offset(r1, r2)
        L47:
            int r1 = r8.size(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L51:
            if (r2 >= r1) goto L6a
            java.lang.Object r5 = r8.get(r7, r2)
            if (r5 != r10) goto L5a
            goto L67
        L5a:
            r9.obtainBounds(r5, r3)
            boolean r6 = isBetterCandidate(r12, r11, r3, r0)
            if (r6 == 0) goto L67
            r0.set(r3)
            r4 = r5
        L67:
            int r2 = r2 + 1
            goto L51
        L6a:
            return r4
    }

    public static <L, T> T findNextFocusInRelativeDirection(@androidx.annotation.NonNull L r4, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r5, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r6, @androidx.annotation.Nullable T r7, int r8, boolean r9, boolean r10) {
            int r0 = r5.size(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r5.get(r4, r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L16:
            androidx.customview.widget.FocusStrategy$SequentialComparator r4 = new androidx.customview.widget.FocusStrategy$SequentialComparator
            r4.<init>(r9, r6)
            java.util.Collections.sort(r1, r4)
            r4 = 1
            if (r8 == r4) goto L31
            r4 = 2
            if (r8 != r4) goto L29
            java.lang.Object r4 = getNextFocusable(r7, r1, r10)
            return r4
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r4.<init>(r5)
            throw r4
        L31:
            java.lang.Object r4 = getPreviousFocusable(r7, r1, r10)
            return r4
    }

    private static <T> T getNextFocusable(T r1, java.util.ArrayList<T> r2, boolean r3) {
            int r0 = r2.size()
            if (r1 != 0) goto L8
            r1 = -1
            goto Lc
        L8:
            int r1 = r2.lastIndexOf(r1)
        Lc:
            int r1 = r1 + 1
            if (r1 >= r0) goto L15
            java.lang.Object r1 = r2.get(r1)
            return r1
        L15:
            if (r3 == 0) goto L1f
            if (r0 <= 0) goto L1f
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            return r1
        L1f:
            r1 = 0
            return r1
    }

    private static <T> T getPreviousFocusable(T r1, java.util.ArrayList<T> r2, boolean r3) {
            int r0 = r2.size()
            if (r1 != 0) goto L8
            r1 = r0
            goto Lc
        L8:
            int r1 = r2.indexOf(r1)
        Lc:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L15
            java.lang.Object r1 = r2.get(r1)
            return r1
        L15:
            if (r3 == 0) goto L20
            if (r0 <= 0) goto L20
            int r0 = r0 + (-1)
            java.lang.Object r1 = r2.get(r0)
            return r1
        L20:
            r1 = 0
            return r1
    }

    private static int getWeightedDistanceFor(int r1, int r2) {
            int r0 = r1 * 13
            int r0 = r0 * r1
            int r2 = r2 * r2
            int r0 = r0 + r2
            return r0
    }

    private static boolean isBetterCandidate(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5, @androidx.annotation.NonNull android.graphics.Rect r6) {
            boolean r0 = isCandidate(r4, r5, r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = isCandidate(r4, r6, r3)
            r2 = 1
            if (r0 != 0) goto L10
            return r2
        L10:
            boolean r0 = beamBeats(r3, r4, r5, r6)
            if (r0 == 0) goto L17
            return r2
        L17:
            boolean r0 = beamBeats(r3, r4, r6, r5)
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = majorAxisDistance(r3, r4, r5)
            int r5 = minorAxisDistance(r3, r4, r5)
            int r5 = getWeightedDistanceFor(r0, r5)
            int r0 = majorAxisDistance(r3, r4, r6)
            int r3 = minorAxisDistance(r3, r4, r6)
            int r3 = getWeightedDistanceFor(r0, r3)
            if (r5 >= r3) goto L39
            return r2
        L39:
            return r1
    }

    private static boolean isCandidate(@androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.NonNull android.graphics.Rect r4, int r5) {
            r0 = 17
            r1 = 0
            r2 = 1
            if (r5 == r0) goto L50
            r0 = 33
            if (r5 == r0) goto L3e
            r0 = 66
            if (r5 == r0) goto L2c
            r0 = 130(0x82, float:1.82E-43)
            if (r5 != r0) goto L24
            int r5 = r3.top
            int r0 = r4.top
            if (r5 < r0) goto L1c
            int r5 = r3.bottom
            if (r5 > r0) goto L23
        L1c:
            int r3 = r3.bottom
            int r4 = r4.bottom
            if (r3 >= r4) goto L23
            return r2
        L23:
            return r1
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L2c:
            int r5 = r3.left
            int r0 = r4.left
            if (r5 < r0) goto L36
            int r5 = r3.right
            if (r5 > r0) goto L3d
        L36:
            int r3 = r3.right
            int r4 = r4.right
            if (r3 >= r4) goto L3d
            return r2
        L3d:
            return r1
        L3e:
            int r5 = r3.bottom
            int r0 = r4.bottom
            if (r5 > r0) goto L48
            int r5 = r3.top
            if (r5 < r0) goto L4f
        L48:
            int r3 = r3.top
            int r4 = r4.top
            if (r3 <= r4) goto L4f
            return r2
        L4f:
            return r1
        L50:
            int r5 = r3.right
            int r0 = r4.right
            if (r5 > r0) goto L5a
            int r5 = r3.left
            if (r5 < r0) goto L61
        L5a:
            int r3 = r3.left
            int r4 = r4.left
            if (r3 <= r4) goto L61
            return r2
        L61:
            return r1
    }

    private static boolean isToDirectionOf(int r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.NonNull android.graphics.Rect r5) {
            r0 = 17
            r1 = 0
            r2 = 1
            if (r3 == r0) goto L32
            r0 = 33
            if (r3 == r0) goto L2a
            r0 = 66
            if (r3 == r0) goto L22
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L1a
            int r3 = r4.bottom
            int r4 = r5.top
            if (r3 > r4) goto L19
            return r2
        L19:
            return r1
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L22:
            int r3 = r4.right
            int r4 = r5.left
            if (r3 > r4) goto L29
            return r2
        L29:
            return r1
        L2a:
            int r3 = r4.top
            int r4 = r5.bottom
            if (r3 < r4) goto L31
            return r2
        L31:
            return r1
        L32:
            int r3 = r4.left
            int r4 = r5.right
            if (r3 < r4) goto L39
            return r2
        L39:
            return r1
    }

    private static int majorAxisDistance(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 0
            int r1 = majorAxisDistanceRaw(r1, r2, r3)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static int majorAxisDistanceRaw(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L28
            r0 = 33
            if (r1 == r0) goto L23
            r0 = 66
            if (r1 == r0) goto L1e
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L16
            int r1 = r3.top
            int r2 = r2.bottom
        L14:
            int r1 = r1 - r2
            return r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1e:
            int r1 = r3.left
            int r2 = r2.right
            goto L14
        L23:
            int r1 = r2.top
            int r2 = r3.bottom
            goto L14
        L28:
            int r1 = r2.left
            int r2 = r3.right
            goto L14
    }

    private static int majorAxisDistanceToFarEdge(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 1
            int r1 = majorAxisDistanceToFarEdgeRaw(r1, r2, r3)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static int majorAxisDistanceToFarEdgeRaw(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L28
            r0 = 33
            if (r1 == r0) goto L23
            r0 = 66
            if (r1 == r0) goto L1e
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L16
            int r1 = r3.bottom
            int r2 = r2.bottom
        L14:
            int r1 = r1 - r2
            return r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1e:
            int r1 = r3.right
            int r2 = r2.right
            goto L14
        L23:
            int r1 = r2.top
            int r2 = r3.top
            goto L14
        L28:
            int r1 = r2.left
            int r2 = r3.left
            goto L14
    }

    private static int minorAxisDistance(int r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L31
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L31
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r2.left
            int r2 = r2.width()
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r2 = r3.left
            int r3 = r3.width()
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            return r1
        L31:
            int r1 = r2.top
            int r2 = r2.height()
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r2 = r3.top
            int r3 = r3.height()
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            return r1
    }
}
