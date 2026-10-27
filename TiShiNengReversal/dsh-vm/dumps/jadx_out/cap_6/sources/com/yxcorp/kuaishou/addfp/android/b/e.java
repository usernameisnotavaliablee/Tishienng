package com.yxcorp.kuaishou.addfp.android.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private static java.lang.Object a;
    private static java.lang.reflect.Method b;
    public static final /* synthetic */ int c = 0;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L5c
            java.lang.String r2 = "forName"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5c
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "getDeclaredMethod"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L5c
            r7[r5] = r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            r7[r3] = r0     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "dalvik.system.VMRuntime"
            r1[r5] = r4     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            java.lang.Object r1 = r2.invoke(r4, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "getRuntime"
            r2[r5] = r7     // Catch: java.lang.Throwable -> L5c
            r2[r3] = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "setHiddenApiExemptions"
            r6[r5] = r8     // Catch: java.lang.Throwable -> L5c
            r6[r3] = r7     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.invoke(r1, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L5c
            com.yxcorp.kuaishou.addfp.android.b.e.b = r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r2.invoke(r4, r4)     // Catch: java.lang.Throwable -> L5c
            com.yxcorp.kuaishou.addfp.android.b.e.a = r0     // Catch: java.lang.Throwable -> L5c
        L5c:
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = "L"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r1 = com.yxcorp.kuaishou.addfp.android.b.e.a
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.reflect.Method r3 = com.yxcorp.kuaishou.addfp.android.b.e.b
            if (r3 == 0) goto L18
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L18
            r5[r2] = r0     // Catch: java.lang.Throwable -> L18
            r3.invoke(r1, r5)     // Catch: java.lang.Throwable -> L18
            return r4
        L18:
            return r2
    }
}
