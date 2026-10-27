package org.repackage.com.miui.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IdentifierManager {
    private static final java.lang.String a = "IdentifierManager";
    private static java.lang.Object b;
    private static java.lang.Class<?> c;
    private static java.lang.reflect.Method d;
    private static java.lang.reflect.Method e;
    private static java.lang.reflect.Method f;
    private static java.lang.reflect.Method g;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L4a
            org.repackage.com.miui.deviceid.IdentifierManager.c = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L4a
            org.repackage.com.miui.deviceid.IdentifierManager.b = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Class<?> r1 = org.repackage.com.miui.deviceid.IdentifierManager.c     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "getUDID"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4a
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L4a
            org.repackage.com.miui.deviceid.IdentifierManager.d = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Class<?> r1 = org.repackage.com.miui.deviceid.IdentifierManager.c     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "getOAID"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4a
            r4[r5] = r0     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L4a
            org.repackage.com.miui.deviceid.IdentifierManager.e = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Class<?> r1 = org.repackage.com.miui.deviceid.IdentifierManager.c     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "getVAID"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4a
            r4[r5] = r0     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L4a
            org.repackage.com.miui.deviceid.IdentifierManager.f = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Class<?> r1 = org.repackage.com.miui.deviceid.IdentifierManager.c     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "getAAID"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4a
            r3[r5] = r0     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Method r0 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L4a
            org.repackage.com.miui.deviceid.IdentifierManager.g = r0     // Catch: java.lang.Exception -> L4a
        L4a:
            return
    }

    public IdentifierManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.reflect.Method r0 = org.repackage.com.miui.deviceid.IdentifierManager.d
            java.lang.String r1 = a(r1, r0)
            return r1
    }

    private static java.lang.String a(android.content.Context r3, java.lang.reflect.Method r4) {
            java.lang.Object r0 = org.repackage.com.miui.deviceid.IdentifierManager.b
            if (r0 == 0) goto L15
            if (r4 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r4.invoke(r0, r1)     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto L15
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = 0
            return r3
    }

    public static boolean a() {
            java.lang.Class<?> r0 = org.repackage.com.miui.deviceid.IdentifierManager.c
            if (r0 == 0) goto La
            java.lang.Object r0 = org.repackage.com.miui.deviceid.IdentifierManager.b
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.reflect.Method r0 = org.repackage.com.miui.deviceid.IdentifierManager.e
            java.lang.String r1 = a(r1, r0)
            return r1
    }

    public static java.lang.String c(android.content.Context r1) {
            java.lang.reflect.Method r0 = org.repackage.com.miui.deviceid.IdentifierManager.f
            java.lang.String r1 = a(r1, r0)
            return r1
    }

    public static java.lang.String d(android.content.Context r1) {
            java.lang.reflect.Method r0 = org.repackage.com.miui.deviceid.IdentifierManager.g
            java.lang.String r1 = a(r1, r0)
            return r1
    }
}
