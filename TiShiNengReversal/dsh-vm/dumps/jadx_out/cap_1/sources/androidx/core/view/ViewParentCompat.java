package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewParentCompat {
    private static final java.lang.String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean onNestedFling(android.view.ViewParent r0, android.view.View r1, float r2, float r3, boolean r4) {
                boolean r0 = r0.onNestedFling(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean onNestedPreFling(android.view.ViewParent r0, android.view.View r1, float r2, float r3) {
                boolean r0 = r0.onNestedPreFling(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void onNestedPreScroll(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int[] r4) {
                r0.onNestedPreScroll(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void onNestedScroll(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int r4, int r5) {
                r0.onNestedScroll(r1, r2, r3, r4, r5)
                return
        }

        @androidx.annotation.DoNotInline
        static void onNestedScrollAccepted(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                r0.onNestedScrollAccepted(r1, r2, r3)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean onStartNestedScroll(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void onStopNestedScroll(android.view.ViewParent r0, android.view.View r1) {
                r0.onStopNestedScroll(r1)
                return
        }
    }

    private ViewParentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[] getTempNestedScrollConsumed() {
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            if (r0 != 0) goto La
            r0 = 2
            int[] r0 = new int[r0]
            androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed = r0
            goto L10
        La:
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
        L10:
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            return r0
    }

    public static void notifySubtreeAccessibilityStateChanged(@androidx.annotation.NonNull android.view.ViewParent r0, @androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
            r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
            return
    }

    public static boolean onNestedFling(@androidx.annotation.NonNull android.view.ViewParent r0, @androidx.annotation.NonNull android.view.View r1, float r2, float r3, boolean r4) {
            boolean r0 = androidx.core.view.ViewParentCompat.Api21Impl.onNestedFling(r0, r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L5
            return r0
        L5:
            java.util.Objects.toString(r0)
            r0 = 0
            return r0
    }

    public static boolean onNestedPreFling(@androidx.annotation.NonNull android.view.ViewParent r0, @androidx.annotation.NonNull android.view.View r1, float r2, float r3) {
            boolean r0 = androidx.core.view.ViewParentCompat.Api21Impl.onNestedPreFling(r0, r1, r2, r3)     // Catch: java.lang.AbstractMethodError -> L5
            return r0
        L5:
            java.util.Objects.toString(r0)
            r0 = 0
            return r0
    }

    public static void onNestedPreScroll(@androidx.annotation.NonNull android.view.ViewParent r6, @androidx.annotation.NonNull android.view.View r7, int r8, int r9, @androidx.annotation.NonNull int[] r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            onNestedPreScroll(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void onNestedPreScroll(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4, @androidx.annotation.NonNull int[] r5, int r6) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r1.onNestedPreScroll(r2, r3, r4, r5, r6)
            return
        La:
            if (r6 != 0) goto L13
            androidx.core.view.ViewParentCompat.Api21Impl.onNestedPreScroll(r1, r2, r3, r4, r5)     // Catch: java.lang.AbstractMethodError -> L10
            return
        L10:
            java.util.Objects.toString(r1)
        L13:
            return
    }

    public static void onNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r8, @androidx.annotation.NonNull android.view.View r9, int r10, int r11, int r12, int r13) {
            r6 = 0
            int[] r7 = getTempNestedScrollConsumed()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            onNestedScroll(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void onNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r8, @androidx.annotation.NonNull android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            int[] r7 = getTempNestedScrollConsumed()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            onNestedScroll(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void onNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6, int r7, int r8, int r9, @androidx.annotation.NonNull int[] r10) {
            boolean r0 = r3 instanceof androidx.core.view.NestedScrollingParent3
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingParent3 r3 = (androidx.core.view.NestedScrollingParent3) r3
            r3.onNestedScroll(r4, r5, r6, r7, r8, r9, r10)
            return
        La:
            r2 = r5
            r5 = r4
            r4 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r2
            r0 = 0
            r1 = r4[r0]
            int r1 = r1 + r8
            r4[r0] = r1
            r0 = 1
            r1 = r4[r0]
            int r1 = r1 + r9
            r4[r0] = r1
            boolean r4 = r3 instanceof androidx.core.view.NestedScrollingParent2
            if (r4 == 0) goto L29
            r4 = r3
            androidx.core.view.NestedScrollingParent2 r4 = (androidx.core.view.NestedScrollingParent2) r4
            r4.onNestedScroll(r5, r6, r7, r8, r9, r10)
            return
        L29:
            if (r10 != 0) goto L33
            r4 = r3
            androidx.core.view.ViewParentCompat.Api21Impl.onNestedScroll(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.AbstractMethodError -> L30
            return
        L30:
            java.util.Objects.toString(r4)
        L33:
            return
    }

    public static void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
            r0 = 0
            onNestedScrollAccepted(r1, r2, r3, r4, r0)
            return
    }

    public static void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r1.onNestedScrollAccepted(r2, r3, r4, r5)
            return
        La:
            if (r5 != 0) goto L13
            androidx.core.view.ViewParentCompat.Api21Impl.onNestedScrollAccepted(r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L10
            return
        L10:
            java.util.Objects.toString(r1)
        L13:
            return
    }

    public static boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
            r0 = 0
            boolean r1 = onStartNestedScroll(r1, r2, r3, r4, r0)
            return r1
    }

    public static boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            boolean r1 = r1.onStartNestedScroll(r2, r3, r4, r5)
            return r1
        Lb:
            if (r5 != 0) goto L15
            boolean r1 = androidx.core.view.ViewParentCompat.Api21Impl.onStartNestedScroll(r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L12
            return r1
        L12:
            java.util.Objects.toString(r1)
        L15:
            r1 = 0
            return r1
    }

    public static void onStopNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2) {
            r0 = 0
            onStopNestedScroll(r1, r2, r0)
            return
    }

    public static void onStopNestedScroll(@androidx.annotation.NonNull android.view.ViewParent r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r1.onStopNestedScroll(r2, r3)
            return
        La:
            if (r3 != 0) goto L13
            androidx.core.view.ViewParentCompat.Api21Impl.onStopNestedScroll(r1, r2)     // Catch: java.lang.AbstractMethodError -> L10
            return
        L10:
            java.util.Objects.toString(r1)
        L13:
            return
    }

    @java.lang.Deprecated
    public static boolean requestSendAccessibilityEvent(android.view.ViewParent r0, android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            boolean r0 = r0.requestSendAccessibilityEvent(r1, r2)
            return r0
    }
}
