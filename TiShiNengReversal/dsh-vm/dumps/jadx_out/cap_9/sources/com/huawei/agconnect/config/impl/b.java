package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class b {
    private static final java.lang.String a = "Utils";
    private static final int b = 4096;
    public static final java.lang.String c = "DEFAULT_INSTANCE";

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void b(java.io.Reader r1, java.io.Writer r2) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r0 = new char[r0]
            c(r1, r2, r0)
            return
    }

    public static void c(java.io.Reader r2, java.io.Writer r3, char[] r4) throws java.io.IOException {
        L0:
            int r0 = r2.read(r4)
            r1 = -1
            if (r1 == r0) goto Lc
            r1 = 0
            r3.write(r4, r1, r0)
            goto L0
        Lc:
            return
    }

    public static java.util.Map<java.lang.String, java.lang.String> d(java.util.Map<java.lang.String, java.lang.String> r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = e(r2)
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto Ld
        L2b:
            return r0
    }

    public static java.lang.String e(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L12
        L7:
            char r0 = r3.charAt(r1)
            r2 = 47
            if (r0 != r2) goto L12
            int r1 = r1 + 1
            goto L7
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "/"
            r0.append(r2)
            java.lang.String r3 = r3.substring(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static com.huawei.agconnect.b f(java.lang.String r1, java.lang.String r2) {
            if (r1 == 0) goto L48
            int r2 = r1.hashCode()
            r0 = -1
            switch(r2) {
                case 2155: goto L2c;
                case 2177: goto L21;
                case 2627: goto L16;
                case 2644: goto Lb;
                default: goto La;
            }
        La:
            goto L36
        Lb:
            java.lang.String r2 = "SG"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L14
            goto L36
        L14:
            r0 = 3
            goto L36
        L16:
            java.lang.String r2 = "RU"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f
            goto L36
        L1f:
            r0 = 2
            goto L36
        L21:
            java.lang.String r2 = "DE"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2a
            goto L36
        L2a:
            r0 = 1
            goto L36
        L2c:
            java.lang.String r2 = "CN"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            switch(r0) {
                case 0: goto L45;
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                default: goto L39;
            }
        L39:
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.b
            return r1
        L3c:
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.f
            return r1
        L3f:
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.e
            return r1
        L42:
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.d
            return r1
        L45:
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.c
            return r1
        L48:
            if (r2 == 0) goto L76
            java.lang.String r1 = "connect-drcn"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L55
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.c
            return r1
        L55:
            java.lang.String r1 = "connect-dre"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L60
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.d
            return r1
        L60:
            java.lang.String r1 = "connect-drru"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L6b
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.e
            return r1
        L6b:
            java.lang.String r1 = "connect-dra"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L76
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.f
            return r1
        L76:
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.b
            return r1
    }

    public static java.lang.String g(java.io.InputStream r2, java.lang.String r3) throws java.io.UnsupportedEncodingException, java.io.IOException {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r2, r3)
            b(r1, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
