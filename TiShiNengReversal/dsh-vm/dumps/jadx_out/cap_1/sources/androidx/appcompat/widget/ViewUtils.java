package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewUtils {

    @androidx.annotation.ChecksSdkIntAtLeast(api = 27)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE = false;
    private static final java.lang.String TAG = "ViewUtils";
    private static java.lang.reflect.Method sComputeFitSystemWindowsMethod;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            r2 = 0
            r3 = 1
            if (r0 < r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE = r0
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "computeFitSystemWindows"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2b
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r4[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L2b
            r4[r3] = r5     // Catch: java.lang.NoSuchMethodException -> L2b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.NoSuchMethodException -> L2b
            androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod = r0     // Catch: java.lang.NoSuchMethodException -> L2b
            boolean r0 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L2b
            if (r0 != 0) goto L2b
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L2b
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L2b
        L2b:
            return
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void computeFitSystemWindows(android.view.View r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod
            if (r0 == 0) goto L10
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L10
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L10
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L10
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L10
        L10:
            return
    }

    public static boolean isLayoutRtl(android.view.View r1) {
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    public static void makeOptionalFitsSystemWindows(android.view.View r3) {
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "makeOptionalFitsSystemWindows"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.isAccessible()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L15
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L18
        L15:
            r0.invoke(r3, r2)     // Catch: java.lang.Throwable -> L18
        L18:
            return
    }
}
