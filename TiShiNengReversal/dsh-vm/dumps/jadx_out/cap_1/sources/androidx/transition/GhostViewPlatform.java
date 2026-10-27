package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class GhostViewPlatform implements androidx.transition.GhostView {
    private static final java.lang.String TAG = "GhostViewApi21";
    private static java.lang.reflect.Method sAddGhostMethod;
    private static boolean sAddGhostMethodFetched;
    private static java.lang.Class<?> sGhostViewClass;
    private static boolean sGhostViewClassFetched;
    private static java.lang.reflect.Method sRemoveGhostMethod;
    private static boolean sRemoveGhostMethodFetched;
    private final android.view.View mGhostView;

    private GhostViewPlatform(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.mGhostView = r1
            return
    }

    static androidx.transition.GhostView addGhost(android.view.View r5, android.view.ViewGroup r6, android.graphics.Matrix r7) {
            fetchAddGhostMethod()
            java.lang.reflect.Method r0 = androidx.transition.GhostViewPlatform.sAddGhostMethod
            r1 = 0
            if (r0 == 0) goto L2b
            androidx.transition.GhostViewPlatform r2 = new androidx.transition.GhostViewPlatform     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            r5 = 1
            r3[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            r5 = 2
            r3[r5] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            java.lang.Object r5 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            r2.<init>(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L2b
            return r2
        L20:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.Throwable r5 = r5.getCause()
            r6.<init>(r5)
            throw r6
        L2b:
            return r1
    }

    private static void fetchAddGhostMethod() {
            boolean r0 = androidx.transition.GhostViewPlatform.sAddGhostMethodFetched
            if (r0 != 0) goto L28
            r0 = 1
            fetchGhostViewClass()     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class<?> r1 = androidx.transition.GhostViewPlatform.sGhostViewClass     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.String r2 = "addGhost"
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class<android.view.ViewGroup> r4 = android.view.ViewGroup.class
            r3[r0] = r4     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class<android.graphics.Matrix> r4 = android.graphics.Matrix.class
            r5 = 2
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L26
            androidx.transition.GhostViewPlatform.sAddGhostMethod = r1     // Catch: java.lang.NoSuchMethodException -> L26
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L26
        L26:
            androidx.transition.GhostViewPlatform.sAddGhostMethodFetched = r0
        L28:
            return
    }

    private static void fetchGhostViewClass() {
            boolean r0 = androidx.transition.GhostViewPlatform.sGhostViewClassFetched
            if (r0 != 0) goto Lf
            java.lang.String r0 = "android.view.GhostView"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Lc
            androidx.transition.GhostViewPlatform.sGhostViewClass = r0     // Catch: java.lang.ClassNotFoundException -> Lc
        Lc:
            r0 = 1
            androidx.transition.GhostViewPlatform.sGhostViewClassFetched = r0
        Lf:
            return
    }

    private static void fetchRemoveGhostMethod() {
            boolean r0 = androidx.transition.GhostViewPlatform.sRemoveGhostMethodFetched
            if (r0 != 0) goto L1e
            r0 = 1
            fetchGhostViewClass()     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class<?> r1 = androidx.transition.GhostViewPlatform.sGhostViewClass     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.String r2 = "removeGhost"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L1c
            androidx.transition.GhostViewPlatform.sRemoveGhostMethod = r1     // Catch: java.lang.NoSuchMethodException -> L1c
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
        L1c:
            androidx.transition.GhostViewPlatform.sRemoveGhostMethodFetched = r0
        L1e:
            return
    }

    static void removeGhost(android.view.View r3) {
            fetchRemoveGhostMethod()
            java.lang.reflect.Method r0 = androidx.transition.GhostViewPlatform.sRemoveGhostMethod
            if (r0 == 0) goto L1d
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L1d
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L1d
            r3 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L1d
            return
        L12:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r3 = r3.getCause()
            r0.<init>(r3)
            throw r0
        L1d:
            return
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(android.view.ViewGroup r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int r2) {
            r1 = this;
            android.view.View r0 = r1.mGhostView
            r0.setVisibility(r2)
            return
    }
}
