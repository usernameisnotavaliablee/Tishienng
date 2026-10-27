package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ah {
    private static final java.lang.String a = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=";
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;

    public ah() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy"
            r1.b = r0
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl"
            r1.c = r0
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg=="
            r1.d = r0
            java.lang.String r0 = "SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24="
            r1.e = r0
            return
    }

    private void a(org.json.JSONObject r5, int r6) {
            r4 = this;
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L44
            r1 = 2
            byte[] r0 = com.kuaishou.weapon.p0.c.a(r0, r1)     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L44
            r2.<init>(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L44
            byte[] r0 = com.kuaishou.weapon.p0.c.a(r0, r1)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L44
            r1.<init>(r0)     // Catch: java.lang.Exception -> L44
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L44
            r3 = 26
            if (r0 < r3) goto L2c
            java.lang.String r0 = "IActivityManagerSingleton"
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r2, r0)     // Catch: java.lang.Exception -> L44
            goto L32
        L2c:
            java.lang.String r0 = "gDefault"
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r1, r0)     // Catch: java.lang.Exception -> L44
        L32:
            if (r0 == 0) goto L44
            java.lang.String r1 = "android.util.Singleton"
            java.lang.String r2 = "get"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L44
            r4.a(r0, r5, r6)     // Catch: java.lang.Exception -> L44
        L44:
            return
    }

    private boolean a(java.lang.Object r4, org.json.JSONObject r5, int r6) {
            r3 = this;
            if (r5 == 0) goto L65
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Exception -> L65
            boolean r0 = java.lang.reflect.Proxy.isProxyClass(r0)     // Catch: java.lang.Exception -> L65
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Exception -> L65
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = "-c"
            if (r0 == 0) goto L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Exception -> L65
            r2.append(r6)     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L65
            r5.put(r2, r0)     // Catch: java.lang.Exception -> L65
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Exception -> L65
            r2.append(r6)     // Catch: java.lang.Exception -> L65
            r2.append(r1)     // Catch: java.lang.Exception -> L65
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L65
            r5.put(r6, r4)     // Catch: java.lang.Exception -> L65
            return r0
        L38:
            r2 = 3
            if (r6 != r2) goto L64
            java.lang.String r2 = "Instrumentation"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Exception -> L65
            if (r2 != 0) goto L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Exception -> L65
            r2.append(r6)     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L65
            r5.put(r2, r0)     // Catch: java.lang.Exception -> L65
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Exception -> L65
            r2.append(r6)     // Catch: java.lang.Exception -> L65
            r2.append(r1)     // Catch: java.lang.Exception -> L65
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L65
            r5.put(r6, r4)     // Catch: java.lang.Exception -> L65
        L64:
            return r0
        L65:
            r4 = 0
            return r4
    }

    private void b(org.json.JSONObject r5, int r6) {
            r4 = this;
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ="
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L1f
            r1 = 2
            byte[] r0 = com.kuaishou.weapon.p0.c.a(r0, r1)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L1f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = "getPackageManager"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r3 = 0
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r1, r3, r0, r2)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1f
            r4.a(r0, r5, r6)     // Catch: java.lang.Exception -> L1f
        L1f:
            return
    }

    private void c(org.json.JSONObject r5, int r6) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L3c
            r1 = 29
            if (r0 >= r1) goto L7
            goto L3c
        L7:
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg=="
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L3c
            r1 = 2
            byte[] r0 = com.kuaishou.weapon.p0.c.a(r0, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            r2.<init>(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24="
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L3c
            byte[] r0 = com.kuaishou.weapon.p0.c.a(r0, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r2, r1)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L3c
            java.lang.String r1 = "android.util.Singleton"
            java.lang.String r2 = "get"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L3c
            r4.a(r0, r5, r6)     // Catch: java.lang.Exception -> L3c
        L3c:
            return
    }

    private void d(org.json.JSONObject r5, int r6) {
            r4 = this;
            java.lang.String r0 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ="
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L2b
            r1 = 2
            byte[] r0 = com.kuaishou.weapon.p0.c.a(r0, r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L2b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "currentActivityThread"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2b
            r3 = 0
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r1, r3, r0, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "mInstrumentation"
            java.lang.Object r0 = com.kuaishou.weapon.p0.dh.a(r1, r0, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            r4.a(r0, r5, r6)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    public org.json.JSONObject a() {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c
            r0.<init>()     // Catch: java.lang.Exception -> L1c
            r1 = 0
            r2.b(r0, r1)     // Catch: java.lang.Exception -> L1c
            r1 = 1
            r2.a(r0, r1)     // Catch: java.lang.Exception -> L1c
            r1 = 2
            r2.c(r0, r1)     // Catch: java.lang.Exception -> L1c
            r1 = 3
            r2.d(r0, r1)     // Catch: java.lang.Exception -> L1c
            int r1 = r0.length()     // Catch: java.lang.Exception -> L1c
            if (r1 <= 0) goto L1c
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public org.json.JSONObject a(android.content.Context r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            r0.<init>()     // Catch: java.lang.Exception -> L1d
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L1d
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = "mPM"
            java.lang.Object r4 = com.kuaishou.weapon.p0.dh.a(r1, r4, r2)     // Catch: java.lang.Exception -> L1d
            if (r4 == 0) goto L1d
            r1 = 0
            boolean r4 = r3.a(r4, r0, r1)     // Catch: java.lang.Exception -> L1d
            if (r4 == 0) goto L1d
            return r0
        L1d:
            r4 = 0
            return r4
    }
}
