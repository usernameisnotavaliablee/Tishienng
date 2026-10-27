package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i {
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
            com.beizi.ad.lance.a.i.a = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r4) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4d
            java.security.DigestInputStream r4 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L34
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L34
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L36
        L19:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L36
            r3 = -1
            if (r2 == r3) goto L21
            goto L19
        L21:
            java.security.MessageDigest r1 = r4.getMessageDigest()     // Catch: java.lang.Throwable -> L36
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L36
            r4.close()     // Catch: java.lang.Throwable -> L34
            r0.close()     // Catch: java.lang.Throwable -> L4d
            return r1
        L34:
            r4 = move-exception
            goto L42
        L36:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r2 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L34
        L41:
            throw r2     // Catch: java.lang.Throwable -> L34
        L42:
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L4d
        L4c:
            throw r1     // Catch: java.lang.Throwable -> L4d
        L4d:
            r4 = 0
            return r4
    }

    private static java.lang.String a(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L21
            r4 = r6[r3]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.append(r4)
            int r3 = r3 + 1
            goto L8
        L21:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
