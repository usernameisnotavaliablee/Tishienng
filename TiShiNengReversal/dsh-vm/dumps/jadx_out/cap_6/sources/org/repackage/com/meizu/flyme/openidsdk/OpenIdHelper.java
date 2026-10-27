package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OpenIdHelper {
    private static final java.lang.String a = "OpenIdHelper";
    private static java.lang.reflect.Method b;

    public OpenIdHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            org.repackage.com.meizu.flyme.openidsdk.b r0 = org.repackage.com.meizu.flyme.openidsdk.b.a()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            org.repackage.com.meizu.flyme.openidsdk.OpenId r1 = r0.a
            java.lang.String r2 = r0.a(r2, r1)
            return r2
    }

    public static void a(boolean r0) {
            org.repackage.com.meizu.flyme.openidsdk.b.a()
            org.repackage.com.meizu.flyme.openidsdk.b.a(r0)
            return
    }

    public static final boolean a() {
            r0 = 0
            java.lang.reflect.Method r1 = org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper.b     // Catch: java.lang.Exception -> L18
            if (r1 != 0) goto L1a
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L18
            org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper.b = r1     // Catch: java.lang.Exception -> L18
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L24
        L1a:
            java.lang.reflect.Method r1 = org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper.b     // Catch: java.lang.Exception -> L18
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Exception -> L18
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L18
            r0 = r1
            goto L27
        L24:
            r1.toString()
        L27:
            r1 = 0
            if (r0 != 0) goto L2b
            return r1
        L2b:
            org.repackage.com.meizu.flyme.openidsdk.b r2 = org.repackage.com.meizu.flyme.openidsdk.b.a()
            boolean r0 = r2.a(r0, r1)
            return r0
    }

    public static java.lang.String b(android.content.Context r2) {
            org.repackage.com.meizu.flyme.openidsdk.b r0 = org.repackage.com.meizu.flyme.openidsdk.b.a()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            org.repackage.com.meizu.flyme.openidsdk.OpenId r1 = r0.b
            java.lang.String r2 = r0.a(r2, r1)
            return r2
    }

    public static java.lang.String c(android.content.Context r2) {
            org.repackage.com.meizu.flyme.openidsdk.b r0 = org.repackage.com.meizu.flyme.openidsdk.b.a()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            org.repackage.com.meizu.flyme.openidsdk.OpenId r1 = r0.d
            java.lang.String r2 = r0.a(r2, r1)
            return r2
    }

    public static java.lang.String d(android.content.Context r2) {
            org.repackage.com.meizu.flyme.openidsdk.b r0 = org.repackage.com.meizu.flyme.openidsdk.b.a()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            org.repackage.com.meizu.flyme.openidsdk.OpenId r1 = r0.c
            java.lang.String r2 = r0.a(r2, r1)
            return r2
    }
}
