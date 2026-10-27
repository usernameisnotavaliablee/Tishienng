package com.bytedance.pangle.util.xt.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private long cw(java.io.RandomAccessFile r8, com.bytedance.pangle.util.xt.xt.r r9) throws java.io.IOException {
            r7 = this;
            long r0 = r8.length()
            r2 = 22
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L24
            long r0 = r0 - r2
            r8.seek(r0)
            com.bytedance.pangle.util.xt.j.cw r2 = r9.r()
            int r2 = r2.j(r8)
            long r2 = (long) r2
            r4 = 101010256(0x6054b50, double:4.99056974E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1f
            return r0
        L1f:
            long r8 = r7.r(r8, r9)
            return r8
        L24:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Zip file size less than size of zip headers. Probably not a zip file."
            r8.<init>(r9)
            throw r8
    }

    private java.lang.String j(byte[] r3) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r3, r1)
            return r0
    }

    private void j(java.io.RandomAccessFile r5, com.bytedance.pangle.util.xt.xt.r r6) throws java.io.IOException {
            r4 = this;
            long r0 = r4.cw(r5, r6)
            r2 = 4
            long r0 = r0 + r2
            r5.seek(r0)
            com.bytedance.pangle.util.xt.xt.xt r0 = new com.bytedance.pangle.util.xt.xt.xt
            r0.<init>()
            r1 = 6
            r5.skipBytes(r1)
            com.bytedance.pangle.util.xt.j.cw r1 = r6.r()
            int r1 = r1.xt(r5)
            r0.j(r1)
            r1 = 4
            r5.skipBytes(r1)
            com.bytedance.pangle.util.xt.j.cw r1 = r6.r()
            int r5 = r1.j(r5)
            long r1 = (long) r5
            r0.j(r1)
            r6.j(r0)
            return
    }

    private long r(java.io.RandomAccessFile r12, com.bytedance.pangle.util.xt.xt.r r13) throws java.io.IOException {
            r11 = this;
            long r0 = r12.length()
            r2 = 22
            long r0 = r0 - r2
            long r2 = r12.length()
            r4 = 65536(0x10000, double:3.2379E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L16
            long r4 = r12.length()
        L16:
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            r2 = 1
            long r0 = r0 - r2
            r12.seek(r0)
            com.bytedance.pangle.util.xt.j.cw r6 = r13.r()
            int r6 = r6.j(r12)
            long r6 = (long) r6
            r8 = 101010256(0x6054b50, double:4.99056974E-316)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L37
            return r0
        L37:
            long r4 = r4 - r2
            goto L16
        L39:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Zip headers not found. Probably not a zip file"
            r12.<init>(r13)
            throw r12
    }

    private void xt(java.io.RandomAccessFile r13, com.bytedance.pangle.util.xt.xt.r r14) throws java.io.IOException {
            r12 = this;
            com.bytedance.pangle.util.xt.xt.j r0 = new com.bytedance.pangle.util.xt.xt.j
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.bytedance.pangle.util.xt.xt.xt r2 = r14.xt()
            long r2 = r2.xt()
            com.bytedance.pangle.util.xt.xt.xt r4 = r14.xt()
            int r4 = r4.j()
            long r4 = (long) r4
            r13.seek(r2)
            r2 = 0
        L1f:
            long r6 = (long) r2
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto Lff
            com.bytedance.pangle.util.xt.xt.cw r3 = new com.bytedance.pangle.util.xt.xt.cw
            r3.<init>()
            com.bytedance.pangle.util.xt.j.cw r6 = r14.r()
            int r6 = r6.j(r13)
            long r6 = (long) r6
            r8 = 33639248(0x2014b50, double:1.6619997E-316)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto Le4
            r6 = 6
            r13.skipBytes(r6)
            com.bytedance.pangle.util.xt.j.cw r6 = r14.r()
            int r6 = r6.xt(r13)
            r3.j(r6)
            r6 = 4
            r13.skipBytes(r6)
            com.bytedance.pangle.util.xt.j.cw r6 = r14.r()
            int r6 = r6.j(r13)
            long r6 = (long) r6
            r3.j(r6)
            com.bytedance.pangle.util.xt.j.cw r6 = r14.r()
            int r6 = r6.j(r13)
            long r6 = (long) r6
            r3.xt(r6)
            com.bytedance.pangle.util.xt.j.cw r6 = r14.r()
            int r6 = r6.j(r13)
            long r6 = (long) r6
            r3.cw(r6)
            com.bytedance.pangle.util.xt.j.cw r6 = r14.r()
            int r6 = r6.xt(r13)
            r3.cw(r6)
            com.bytedance.pangle.util.xt.j.cw r7 = r14.r()
            int r7 = r7.xt(r13)
            r3.r(r7)
            com.bytedance.pangle.util.xt.j.cw r7 = r14.r()
            int r7 = r7.xt(r13)
            r8 = 8
            r13.skipBytes(r8)
            com.bytedance.pangle.util.xt.j.cw r8 = r14.r()
            int r8 = r8.j(r13)
            long r8 = (long) r8
            r3.r(r8)
            if (r6 <= 0) goto Ldc
            byte[] r6 = new byte[r6]
            r13.readFully(r6)
            java.lang.String r6 = r12.j(r6)
            r3.j(r6)
            int r6 = r3.qv()
            r13.skipBytes(r6)
            if (r7 <= 0) goto Lb9
            r13.skipBytes(r7)
        Lb9:
            long r6 = r13.getFilePointer()
            long r8 = r3.jy()
            r10 = 28
            long r8 = r8 + r10
            r13.seek(r8)
            com.bytedance.pangle.util.xt.j.cw r8 = r14.r()
            int r8 = r8.xt(r13)
            r3.xt(r8)
            r13.seek(r6)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1f
        Ldc:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid entry name in file header"
            r13.<init>(r14)
            throw r13
        Le4:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected central directory entry not found (#"
            r14.<init>(r0)
            int r2 = r2 + 1
            r14.append(r2)
            java.lang.String r0 = ")"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lff:
            r0.j(r1)
            r14.j(r0)
            return
    }

    public com.bytedance.pangle.util.xt.xt.r j(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "r"
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L3a
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L2f
            r4 = 22
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L32
            com.bytedance.pangle.util.xt.xt.r r0 = new com.bytedance.pangle.util.xt.xt.r     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r6.j(r1, r0)     // Catch: java.lang.Throwable -> L2f
            com.bytedance.pangle.util.xt.xt.xt r7 = r0.xt()     // Catch: java.lang.Throwable -> L2f
            int r7 = r7.j()     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L28
            r1.close()     // Catch: java.io.IOException -> L27
        L27:
            return r0
        L28:
            r6.xt(r1, r0)     // Catch: java.lang.Throwable -> L2f
            r1.close()     // Catch: java.io.IOException -> L2e
        L2e:
            return r0
        L2f:
            r7 = move-exception
            r0 = r1
            goto L3b
        L32:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2f
        L3a:
            r7 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.io.IOException -> L40
        L40:
            throw r7
    }
}
