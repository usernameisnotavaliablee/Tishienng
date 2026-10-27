package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y3 {
    private static final java.lang.String a = "y3";
    private static volatile android.os.Bundle b = null;
    public static java.lang.String c = "";
    public static java.util.HashSet<java.lang.String> d;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.huawei.hms.scankit.p.y3.d = r0
            return
    }

    public y3() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Bundle a(android.content.Context r3) {
            if (r3 != 0) goto L8
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            return r3
        L8:
            android.os.Bundle r0 = com.huawei.hms.scankit.p.y3.b
            if (r0 != 0) goto L28
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            i1.a r1 = i1.a.d(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "client/app_id"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L21
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L26
        L21:
            java.lang.String r3 = "appid"
            r0.putString(r3, r1)     // Catch: java.lang.Throwable -> L26
        L26:
            com.huawei.hms.scankit.p.y3.b = r0
        L28:
            android.os.Bundle r3 = com.huawei.hms.scankit.p.y3.b
            return r3
    }

    public static java.util.HashSet<java.lang.String> a() {
            java.util.HashSet<java.lang.String> r0 = com.huawei.hms.scankit.p.y3.d
            int r0 = r0.size()
            if (r0 != 0) goto L16
            java.util.HashSet<java.lang.String> r0 = com.huawei.hms.scankit.p.y3.d
            java.lang.String r1 = "com.huawei.scanner"
            r0.add(r1)
            java.util.HashSet<java.lang.String> r0 = com.huawei.hms.scankit.p.y3.d
            java.lang.String r1 = "com.huawei.hitouch"
            r0.add(r1)
        L16:
            java.util.HashSet<java.lang.String> r0 = com.huawei.hms.scankit.p.y3.d
            return r0
    }

    public static boolean a(java.lang.String r1, java.util.HashSet<java.lang.String> r2) {
            int r0 = r1.length()
            if (r0 != 0) goto L7
            goto L1f
        L7:
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.String r0 = com.huawei.hms.scankit.p.y3.c
            int r0 = r0.length()
            if (r0 != 0) goto Le
            java.lang.String r1 = r1.getPackageName()
            com.huawei.hms.scankit.p.y3.c = r1
        Le:
            java.lang.String r1 = com.huawei.hms.scankit.p.y3.c
            return r1
    }
}
