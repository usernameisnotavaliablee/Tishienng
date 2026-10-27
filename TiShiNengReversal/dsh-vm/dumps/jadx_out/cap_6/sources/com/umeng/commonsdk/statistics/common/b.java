package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public static int a;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(byte[] r1, java.lang.String r2) throws java.io.UnsupportedEncodingException, java.util.zip.DataFormatException {
            byte[] r1 = b(r1)
            if (r1 == 0) goto Lc
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
        Lc:
            r1 = 0
            return r1
    }

    public static byte[] a(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            byte[] r1 = r1.getBytes(r2)
            byte[] r1 = a(r1)
            return r1
    }

    public static byte[] a(byte[] r5) throws java.io.IOException {
            r0 = 0
            if (r5 == 0) goto L46
            int r1 = r5.length
            if (r1 > 0) goto L7
            goto L46
        L7:
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r5)
            r1.finish()
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]
            r2 = 0
            com.umeng.commonsdk.statistics.common.b.a = r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
        L1e:
            boolean r0 = r1.finished()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L34
            int r0 = r1.deflate(r5)     // Catch: java.lang.Throwable -> L31
            int r4 = com.umeng.commonsdk.statistics.common.b.a     // Catch: java.lang.Throwable -> L31
            int r4 = r4 + r0
            com.umeng.commonsdk.statistics.common.b.a = r4     // Catch: java.lang.Throwable -> L31
            r3.write(r5, r2, r0)     // Catch: java.lang.Throwable -> L31
            goto L1e
        L31:
            r5 = move-exception
            r0 = r3
            goto L40
        L34:
            r1.end()     // Catch: java.lang.Throwable -> L31
            r3.close()
            byte[] r5 = r3.toByteArray()
            return r5
        L3f:
            r5 = move-exception
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            throw r5
        L46:
            return r0
    }

    public static byte[] b(byte[] r4) throws java.io.UnsupportedEncodingException, java.util.zip.DataFormatException {
            if (r4 == 0) goto L30
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L30
        L6:
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            int r1 = r4.length
            r2 = 0
            r0.setInput(r4, r2, r1)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L19:
            boolean r3 = r0.needsInput()
            if (r3 != 0) goto L28
            int r3 = r0.inflate(r1)
            r4.write(r1, r2, r3)
            int r2 = r2 + r3
            goto L19
        L28:
            r0.end()
            byte[] r4 = r4.toByteArray()
            return r4
        L30:
            r4 = 0
            return r4
    }
}
