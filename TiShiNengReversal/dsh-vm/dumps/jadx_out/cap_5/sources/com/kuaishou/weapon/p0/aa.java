package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class aa {
    private static volatile com.kuaishou.weapon.p0.aa a;

    static {
            return
    }

    private aa() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.kuaishou.weapon.p0.aa a() {
            java.lang.Class<com.kuaishou.weapon.p0.aa> r0 = com.kuaishou.weapon.p0.aa.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.aa r1 = com.kuaishou.weapon.p0.aa.a     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.lang.Class<com.kuaishou.weapon.p0.aa> r1 = com.kuaishou.weapon.p0.aa.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1c
            com.kuaishou.weapon.p0.aa r2 = com.kuaishou.weapon.p0.aa.a     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            com.kuaishou.weapon.p0.aa r2 = new com.kuaishou.weapon.p0.aa     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            com.kuaishou.weapon.p0.aa.a = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            goto L22
        L1e:
            com.kuaishou.weapon.p0.aa r1 = com.kuaishou.weapon.p0.aa.a     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    private static java.lang.String a(java.io.BufferedInputStream r6) {
            if (r6 != 0) goto L5
            java.lang.String r6 = ""
            return r6
        L5:
            r0 = 512(0x200, float:7.17E-43)
            byte[] r1 = new byte[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        Le:
            int r3 = r6.read(r1)     // Catch: java.lang.Exception -> L20
            if (r3 <= 0) goto L1d
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L20
            r5 = 0
            r4.<init>(r1, r5, r3)     // Catch: java.lang.Exception -> L20
            r2.append(r4)     // Catch: java.lang.Exception -> L20
        L1d:
            if (r3 < r0) goto L20
            goto Le
        L20:
            java.lang.String r6 = r2.toString()
            return r6
    }

    public java.lang.String a(java.lang.String r8) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            r2[r6] = r8     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            if (r8 == 0) goto L24
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L26
            return r8
        L22:
            r8 = move-exception
            goto L25
        L24:
            return r0
        L25:
            throw r8
        L26:
            return r0
    }

    public java.lang.String b(java.lang.String r6) {
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.write(r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r6 = 10
            r2.write(r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.flush()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.close()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r1.waitFor()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.String r6 = a(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            r3.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r1.destroy()
            return r6
        L40:
            r6 = move-exception
        L41:
            r0 = r2
            goto L58
        L43:
            goto L6f
        L45:
            r6 = move-exception
            r3 = r0
            goto L41
        L48:
            r3 = r0
            goto L6f
        L4b:
            r6 = move-exception
            r3 = r0
            goto L58
        L4e:
            r2 = r0
        L50:
            r3 = r2
            goto L6f
        L52:
            r6 = move-exception
            r1 = r0
            r3 = r1
            goto L58
        L56:
            goto L6c
        L58:
            if (r0 == 0) goto L5f
            r0.close()     // Catch: java.io.IOException -> L5e
            goto L5f
        L5e:
        L5f:
            if (r3 == 0) goto L66
            r3.close()     // Catch: java.io.IOException -> L65
            goto L66
        L65:
        L66:
            if (r1 == 0) goto L6b
            r1.destroy()
        L6b:
            throw r6
        L6c:
            r1 = r0
            r2 = r1
            goto L50
        L6f:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L75
            goto L76
        L75:
        L76:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.io.IOException -> L7c
            goto L7d
        L7c:
        L7d:
            if (r1 == 0) goto L82
            r1.destroy()
        L82:
            return r0
    }
}
