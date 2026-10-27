package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class d {
    private static final java.lang.String[] a = null;

    static {
            java.lang.String r15 = "e"
            java.lang.String r16 = "f"
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            java.lang.String r3 = "2"
            java.lang.String r4 = "3"
            java.lang.String r5 = "4"
            java.lang.String r6 = "5"
            java.lang.String r7 = "6"
            java.lang.String r8 = "7"
            java.lang.String r9 = "8"
            java.lang.String r10 = "9"
            java.lang.String r11 = "a"
            java.lang.String r12 = "b"
            java.lang.String r13 = "c"
            java.lang.String r14 = "d"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            com.qq.e.comm.managers.plugin.d.a = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(byte r3) {
            if (r3 >= 0) goto L4
            int r3 = r3 + 256
        L4:
            int r0 = r3 / 16
            int r3 = r3 % 16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = com.qq.e.comm.managers.plugin.d.a
            r0 = r2[r0]
            r1.append(r0)
            r3 = r2[r3]
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    public static java.lang.String a(java.io.File r5) {
            java.lang.String r0 = ""
            if (r5 == 0) goto L49
            boolean r1 = r5.exists()
            if (r1 != 0) goto Lb
            goto L49
        Lb:
            r1 = 0
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
        L1b:
            int r1 = r3.read(r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r1 <= 0) goto L2a
            r4 = 0
            r2.update(r5, r4, r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            goto L1b
        L26:
            r5 = move-exception
            goto L36
        L28:
            goto L38
        L2a:
            byte[] r5 = r2.digest()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r3.close()     // Catch: java.lang.Exception -> L35
        L35:
            return r5
        L36:
            r1 = r3
            goto L3e
        L38:
            r1 = r3
            goto L44
        L3a:
            r5 = move-exception
            goto L3e
        L3c:
            goto L44
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Exception -> L43
        L43:
            throw r5
        L44:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Exception -> L49
        L49:
            return r0
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L1a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r0.getBytes(r1)     // Catch: java.lang.Exception -> L1b
            byte[] r2 = r2.digest(r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = a(r2)     // Catch: java.lang.Exception -> L1b
            return r2
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public static java.lang.String a(byte[] r3) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.length
            if (r1 >= r2) goto L15
            r2 = r3[r1]
            java.lang.String r2 = a(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L15:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
