package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewGroupUtilsApi14 {
    private static final int LAYOUT_TRANSITION_CHANGING = 4;
    private static final java.lang.String TAG = "ViewGroupUtilsApi14";
    private static java.lang.reflect.Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static android.animation.LayoutTransition sEmptyLayoutTransition;
    private static java.lang.reflect.Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;


    private ViewGroupUtilsApi14() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void cancelLayoutTransition(android.animation.LayoutTransition r4) {
            boolean r0 = androidx.transition.ViewGroupUtilsApi14.sCancelMethodFetched
            r1 = 0
            if (r0 != 0) goto L15
            r0 = 1
            java.lang.Class<android.animation.LayoutTransition> r2 = android.animation.LayoutTransition.class
            java.lang.String r3 = "cancel"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r1)     // Catch: java.lang.NoSuchMethodException -> L13
            androidx.transition.ViewGroupUtilsApi14.sCancelMethod = r2     // Catch: java.lang.NoSuchMethodException -> L13
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L13
        L13:
            androidx.transition.ViewGroupUtilsApi14.sCancelMethodFetched = r0
        L15:
            java.lang.reflect.Method r0 = androidx.transition.ViewGroupUtilsApi14.sCancelMethod
            if (r0 == 0) goto L1c
            r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    static void suppressLayout(@androidx.annotation.NonNull android.view.ViewGroup r5, boolean r6) {
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            androidx.transition.ViewGroupUtilsApi14$1 r0 = new androidx.transition.ViewGroupUtilsApi14$1
            r0.<init>()
            androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            cancelLayoutTransition(r6)
        L39:
            android.animation.LayoutTransition r0 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            if (r6 == r0) goto L42
            int r0 = androidx.transition.R.id.transition_layout_save
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = androidx.transition.ViewGroupUtilsApi14.sEmptyLayoutTransition
            r5.setLayoutTransition(r6)
            return
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedFieldFetched
            if (r6 != 0) goto L5e
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r0 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L5c
            androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedField = r6     // Catch: java.lang.NoSuchFieldException -> L5c
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5c
        L5c:
            androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedFieldFetched = r1
        L5e:
            java.lang.reflect.Field r6 = androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedField
            if (r6 == 0) goto L72
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L71
            if (r6 == 0) goto L6f
            java.lang.reflect.Field r0 = androidx.transition.ViewGroupUtilsApi14.sLayoutSuppressedField     // Catch: java.lang.IllegalAccessException -> L6e
            r0.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L6e
            goto L6f
        L6e:
        L6f:
            r2 = r6
            goto L72
        L71:
        L72:
            if (r2 == 0) goto L77
            r5.requestLayout()
        L77:
            int r6 = androidx.transition.R.id.transition_layout_save
            java.lang.Object r0 = r5.getTag(r6)
            android.animation.LayoutTransition r0 = (android.animation.LayoutTransition) r0
            if (r0 == 0) goto L87
            r5.setTag(r6, r3)
            r5.setLayoutTransition(r0)
        L87:
            return
    }
}
