package cn.jiguang.commons.s;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    private static java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1194c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f1195d;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.Class a(android.content.Context r6, java.lang.String r7) {
            if (r7 == 0) goto L65
            java.lang.String r0 = r7.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L65
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            java.lang.String r3 = "IdProvider"
            if (r2 == 0) goto L3f
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L3f
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L26
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.ClassNotFoundException -> L26
            return r6
        L26:
            r6 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadClass error, "
            r4.append(r5)
            java.lang.String r6 = r6.getMessage()
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            cn.jiguang.commons.w.a.f(r3, r6)
        L3f:
            java.lang.Class r6 = java.lang.Class.forName(r7)     // Catch: java.lang.ClassNotFoundException -> L44
            return r6
        L44:
            r6 = move-exception
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = r6.getLocalizedMessage()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r7
            r4[r1] = r2
            java.lang.String r7 = "loadClass fail hasContext= %s, errMsg = %s"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            cn.jiguang.commons.w.a.f(r3, r7)
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "loadClass fail "
            r7.<init>(r0, r6)
            throw r7
        L65:
            java.lang.ClassNotFoundException r6 = new java.lang.ClassNotFoundException
            java.lang.String r7 = "class is empty"
            r6.<init>(r7)
            throw r6
    }

    public static java.lang.String a(android.content.Context r8) {
            java.lang.String r0 = ""
            java.lang.String r1 = cn.jiguang.commons.s.a.f1194c     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3f
            cn.jiguang.commons.s.a.f1195d = r0     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.commons.s.a.a = r0     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.commons.s.a.f1194c = r0     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "KIHhQylffktk79IAY9r8iabG5YlYSM/WswW6fWtc2r2WbTdKR65l5atPPp2u96wd"
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r1 = a(r8, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "Oi3ZFT8+schQHSyFZbsdUg=="
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Throwable -> L3d
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3d
            r3[r7] = r8     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r8 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.commons.s.a.f1194c = r8     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r8 = move-exception
            goto L42
        L3f:
            java.lang.String r8 = cn.jiguang.commons.s.a.f1194c     // Catch: java.lang.Throwable -> L3d
            return r8
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getIds failed:"
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "IdProvider"
            cn.jiguang.commons.w.a.f(r1, r8)
            return r0
    }
}
