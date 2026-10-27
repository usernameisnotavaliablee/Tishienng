package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a implements java.io.Serializable {
    public java.util.ArrayList<com.baidu.liantian.core.b> a;

    public a(android.content.pm.ActivityInfo[] r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.a = r0
            if (r6 == 0) goto L64
            int r0 = r6.length
            if (r0 <= 0) goto L64
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r5.a = r1
            r1 = 0
        L13:
            if (r1 >= r0) goto L64
            r2 = r6[r1]
            if (r2 == 0) goto L61
            com.baidu.liantian.core.b r2 = new com.baidu.liantian.core.b
            r2.<init>()
            r3 = r6[r1]
            int r4 = r3.configChanges
            r2.f5942h = r4
            int r4 = r3.flags
            r2.f5940f = r4
            int r4 = r3.labelRes
            r2.l = r4
            int r4 = r3.launchMode
            r2.f5936b = r4
            java.lang.CharSequence r3 = r3.nonLocalizedLabel
            if (r3 == 0) goto L3a
            java.lang.String r3 = r3.toString()
            r2.m = r3
        L3a:
            r3 = r6[r1]
            java.lang.String r4 = r3.name
            r2.f5944j = r4
            java.lang.String r4 = r3.packageName
            r2.f5945k = r4
            java.lang.String r4 = r3.permission
            r2.f5937c = r4
            int r4 = r3.screenOrientation
            r2.f5941g = r4
            int r4 = r3.softInputMode
            r2.f5943i = r4
            java.lang.String r4 = r3.targetActivity
            r2.f5939e = r4
            java.lang.String r4 = r3.taskAffinity
            r2.f5938d = r4
            int r3 = r3.theme
            r2.a = r3
            java.util.ArrayList<com.baidu.liantian.core.b> r3 = r5.a
            r3.add(r2)
        L61:
            int r1 = r1 + 1
            goto L13
        L64:
            return
    }

    public static java.util.ArrayList<com.baidu.liantian.core.b> a(byte[] r3) {
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L21
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r3.readObject()     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1c
            r3.close()     // Catch: java.io.IOException -> L18
            r1.close()     // Catch: java.io.IOException -> L18
            return r2
        L18:
            com.baidu.liantian.b.e.a()
            return r2
        L1c:
            goto L24
        L1e:
            r3 = r0
            goto L24
        L21:
            r3 = r0
            r1 = r3
        L24:
            if (r3 == 0) goto L29
            r3.close()     // Catch: java.io.IOException -> L2f
        L29:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.io.IOException -> L2f
            goto L32
        L2f:
            com.baidu.liantian.b.e.a()
        L32:
            return r0
    }

    public final byte[] a() {
            r5 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            java.util.ArrayList<com.baidu.liantian.core.b> r3 = r5.a     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r2.writeObject(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r2.close()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r1.close()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r2.close()     // Catch: java.io.IOException -> L21
            r1.close()     // Catch: java.io.IOException -> L21
            return r0
        L21:
            com.baidu.liantian.b.e.a()
            return r0
        L25:
            r0 = move-exception
            goto L38
        L27:
            goto L49
        L29:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L38
        L2e:
            r2 = r0
            goto L49
        L31:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L38
        L36:
            goto L47
        L38:
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.io.IOException -> L43
        L3d:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L43
            goto L46
        L43:
            com.baidu.liantian.b.e.a()
        L46:
            throw r0
        L47:
            r1 = r0
            r2 = r1
        L49:
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L54
        L4e:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L54
            goto L57
        L54:
            com.baidu.liantian.b.e.a()
        L57:
            return r0
    }
}
