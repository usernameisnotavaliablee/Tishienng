package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PopupWindowCompat {
    private static final java.lang.String TAG = "PopupWindowCompatApi21";
    private static java.lang.reflect.Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static java.lang.reflect.Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static java.lang.reflect.Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean getOverlapAnchor(android.widget.PopupWindow r0) {
                boolean r0 = r0.getOverlapAnchor()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getWindowLayoutType(android.widget.PopupWindow r0) {
                int r0 = r0.getWindowLayoutType()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setOverlapAnchor(android.widget.PopupWindow r0, boolean r1) {
                r0.setOverlapAnchor(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setWindowLayoutType(android.widget.PopupWindow r0, int r1) {
                r0.setWindowLayoutType(r1)
                return
        }
    }

    private PopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean getOverlapAnchor(@androidx.annotation.NonNull android.widget.PopupWindow r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r3 = androidx.core.widget.PopupWindowCompat.Api23Impl.getOverlapAnchor(r3)
            return r3
        Lb:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r1 = android.widget.PopupWindow.class
            java.lang.String r2 = "mOverlapAnchor"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L1d
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorField = r1     // Catch: java.lang.NoSuchFieldException -> L1d
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1d
        L1d:
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted = r0
        L1f:
            java.lang.reflect.Field r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorField
            if (r0 == 0) goto L2e
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L2e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.IllegalAccessException -> L2e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.IllegalAccessException -> L2e
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public static int getWindowLayoutType(@androidx.annotation.NonNull android.widget.PopupWindow r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r4 = androidx.core.widget.PopupWindowCompat.Api23Impl.getWindowLayoutType(r4)
            return r4
        Lb:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethodAttempted
            r1 = 0
            if (r0 != 0) goto L20
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "getWindowLayoutType"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r1)     // Catch: java.lang.Exception -> L1e
            androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethod = r2     // Catch: java.lang.Exception -> L1e
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L1e
        L1e:
            androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethodAttempted = r0
        L20:
            java.lang.reflect.Method r0 = androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethod
            if (r0 == 0) goto L2f
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L2f
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L2f
            return r4
        L2f:
            r4 = 0
            return r4
    }

    public static void setOverlapAnchor(@androidx.annotation.NonNull android.widget.PopupWindow r3, boolean r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.widget.PopupWindowCompat.Api23Impl.setOverlapAnchor(r3, r4)
            return
        La:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted
            if (r0 != 0) goto L1e
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r1 = android.widget.PopupWindow.class
            java.lang.String r2 = "mOverlapAnchor"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L1c
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorField = r1     // Catch: java.lang.NoSuchFieldException -> L1c
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1c
        L1c:
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted = r0
        L1e:
            java.lang.reflect.Field r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorField
            if (r0 == 0) goto L29
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.IllegalAccessException -> L29
            r0.set(r3, r4)     // Catch: java.lang.IllegalAccessException -> L29
        L29:
            return
    }

    public static void setWindowLayoutType(@androidx.annotation.NonNull android.widget.PopupWindow r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.widget.PopupWindowCompat.Api23Impl.setWindowLayoutType(r6, r7)
            return
        La:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethodAttempted
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L25
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r3 = "setWindowLayoutType"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L23
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L23
            r4[r1] = r5     // Catch: java.lang.Exception -> L23
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L23
            androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethod = r0     // Catch: java.lang.Exception -> L23
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L23
        L23:
            androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethodAttempted = r2
        L25:
            java.lang.reflect.Method r0 = androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethod
            if (r0 == 0) goto L34
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L34
            r2[r1] = r7     // Catch: java.lang.Exception -> L34
            r0.invoke(r6, r2)     // Catch: java.lang.Exception -> L34
        L34:
            return
    }

    public static void showAsDropDown(@androidx.annotation.NonNull android.widget.PopupWindow r0, @androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4) {
            r0.showAsDropDown(r1, r2, r3, r4)
            return
    }
}
