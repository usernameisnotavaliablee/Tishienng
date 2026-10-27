package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CanvasUtils {
    private static java.lang.reflect.Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static java.lang.reflect.Method sReorderBarrierMethod;

    private CanvasUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    static void enableZ(@androidx.annotation.NonNull android.graphics.Canvas r4, boolean r5) {
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L12
            if (r5 == 0) goto Le
            androidx.transition.a.a(r4)
            return
        Le:
            androidx.transition.b.a(r4)
            return
        L12:
            r2 = 28
            if (r1 == r2) goto L53
            boolean r1 = androidx.transition.CanvasUtils.sOrderMethodsFetched
            r2 = 0
            if (r1 != 0) goto L34
            r1 = 1
            java.lang.String r3 = "insertReorderBarrier"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r2)     // Catch: java.lang.NoSuchMethodException -> L32
            androidx.transition.CanvasUtils.sReorderBarrierMethod = r3     // Catch: java.lang.NoSuchMethodException -> L32
            r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L32
            java.lang.String r3 = "insertInorderBarrier"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)     // Catch: java.lang.NoSuchMethodException -> L32
            androidx.transition.CanvasUtils.sInorderBarrierMethod = r0     // Catch: java.lang.NoSuchMethodException -> L32
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L32
        L32:
            androidx.transition.CanvasUtils.sOrderMethodsFetched = r1
        L34:
            if (r5 == 0) goto L3d
            java.lang.reflect.Method r0 = androidx.transition.CanvasUtils.sReorderBarrierMethod     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L52
            if (r0 == 0) goto L3d
            r0.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L52
        L3d:
            if (r5 != 0) goto L52
            java.lang.reflect.Method r5 = androidx.transition.CanvasUtils.sInorderBarrierMethod     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L52
            if (r5 == 0) goto L52
            r5.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalAccessException -> L52
            goto L52
        L47:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L52:
            return
        L53:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "This method doesn't work on Pie!"
            r4.<init>(r5)
            throw r4
    }
}
