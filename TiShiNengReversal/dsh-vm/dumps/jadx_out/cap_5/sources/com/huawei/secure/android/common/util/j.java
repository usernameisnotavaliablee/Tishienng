package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j {
    private static final java.lang.String a = "ScreenUtil";
    private static final int b = 524288;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.security.PrivilegedAction {
        java.lang.reflect.Method a;

        public a(java.lang.reflect.Method r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.security.PrivilegedAction
        public java.lang.Object run() {
                r3 = this;
                java.lang.reflect.Method r0 = r3.a
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r2 = 1
                r0.setAccessible(r2)
                return r1
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(android.app.Activity r1, int r2) {
            if (r1 == 0) goto L11
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L9
            goto L11
        L9:
            android.view.Window r1 = r1.getWindow()
            r1.addFlags(r2)
            return
        L11:
            java.lang.String r1 = ""
            java.lang.String r2 = "activity is null"
            com.huawei.secure.android.common.util.e.l(r1, r2)
            return
    }

    private static void b(android.app.Activity r1, int r2) {
            if (r1 == 0) goto L11
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L9
            goto L11
        L9:
            android.view.Window r1 = r1.getWindow()
            r1.clearFlags(r2)
            return
        L11:
            java.lang.String r1 = ""
            java.lang.String r2 = "activity is null"
            com.huawei.secure.android.common.util.e.l(r1, r2)
            return
    }

    public static void c(android.app.Activity r1) {
            r0 = 8192(0x2000, float:1.148E-41)
            a(r1, r0)
            return
    }

    public static void d(android.app.Activity r1) {
            r0 = 8192(0x2000, float:1.148E-41)
            b(r1, r0)
            return
    }

    public static void e(android.app.Activity r7) {
            java.lang.String r0 = "ScreenUtil"
            if (r7 == 0) goto L4f
            boolean r1 = r7.isFinishing()
            if (r1 != 0) goto L4f
            android.view.Window r7 = r7.getWindow()     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            java.lang.String r1 = "android.view.Window"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            java.lang.String r2 = "addPrivateFlags"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            com.huawei.secure.android.common.util.j$a r2 = new com.huawei.secure.android.common.util.j$a     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            r2.<init>(r1)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            r3[r6] = r2     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            r1.invoke(r7, r3)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3e java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L4a
            return
        L38:
            java.lang.String r7 = "hideOverlayWindows IllegalAccessException"
            com.huawei.secure.android.common.util.e.l(r0, r7)
            goto L4f
        L3e:
            java.lang.String r7 = "hideOverlayWindows InvocationTargetException"
            com.huawei.secure.android.common.util.e.l(r0, r7)
            goto L4f
        L44:
            java.lang.String r7 = "hideOverlayWindows NoSuchMethodException"
            com.huawei.secure.android.common.util.e.l(r0, r7)
            goto L4f
        L4a:
            java.lang.String r7 = "hideOverlayWindows ClassNotFoundException"
            com.huawei.secure.android.common.util.e.l(r0, r7)
        L4f:
            return
    }
}
