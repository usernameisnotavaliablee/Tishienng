package com.yxcorp.kuaishou.addfp.android.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "android.os.UserHandle"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "getUserId"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L69
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L69
            r5 = 0
            r4[r5] = r2     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.Throwable -> L69
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L69
            int r1 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L69
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L69
            r4[r5] = r1     // Catch: java.lang.Throwable -> L69
            r1 = 0
            java.lang.Object r0 = r0.invoke(r1, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L69
            r0.intValue()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = "android.provider.Settings$"
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L69
            r4.append(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "getStringForUser"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L69
            java.lang.Class<android.content.ContentResolver> r8 = android.content.ContentResolver.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L69
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch: java.lang.Throwable -> L69
            r8 = 2
            r7[r8] = r2     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L69
            r10.setAccessible(r3)     // Catch: java.lang.Throwable -> L69
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L69
            r2[r5] = r9     // Catch: java.lang.Throwable -> L69
            r2[r3] = r11     // Catch: java.lang.Throwable -> L69
            r2[r8] = r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r9 = r10.invoke(r1, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L69
            return r9
        L69:
            java.lang.String r9 = ""
            return r9
    }
}
