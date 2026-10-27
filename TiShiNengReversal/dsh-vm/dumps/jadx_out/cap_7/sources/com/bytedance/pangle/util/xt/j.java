package com.bytedance.pangle.util.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private final com.bytedance.pangle.util.xt.xt.r j;
    private final com.bytedance.pangle.util.xt.j.xt xt;

    public j(com.bytedance.pangle.util.xt.xt.r r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            com.bytedance.pangle.util.xt.j.xt r1 = new com.bytedance.pangle.util.xt.j.xt
            r1.<init>()
            r0.xt = r1
            return
    }

    private void j(java.io.File r1, java.io.File r2) throws java.util.zip.ZipException {
            r0 = this;
            boolean r1 = r2.renameTo(r1)
            if (r1 == 0) goto L7
            return
        L7:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.String r2 = "cannot rename modified zip file"
            r1.<init>(r2)
            throw r1
    }

    private boolean j(com.bytedance.pangle.util.xt.xt.cw r4, boolean r5, boolean r6) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L30
            boolean r5 = com.bytedance.pangle.util.g.m()
            if (r5 == 0) goto L17
            java.lang.String r5 = r4.vl()
            java.lang.String r2 = "classes.dex"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L17
            return r1
        L17:
            java.lang.String r5 = r4.vl()
            java.lang.String r2 = "classes"
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L30
            java.lang.String r5 = r4.vl()
            java.lang.String r2 = ".dex"
            boolean r5 = r5.endsWith(r2)
            if (r5 == 0) goto L30
            return r0
        L30:
            if (r6 == 0) goto L4b
            java.lang.String r5 = r4.vl()
            java.lang.String r6 = "lib/"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L4b
            java.lang.String r4 = r4.vl()
            java.lang.String r5 = ".so"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L4b
            return r0
        L4b:
            return r1
    }

    void j(java.io.File r2) throws java.util.zip.ZipException {
            r1 = this;
            boolean r0 = r2.exists()
            if (r0 == 0) goto L15
            boolean r2 = r2.delete()
            if (r2 == 0) goto Ld
            goto L15
        Ld:
            java.util.zip.ZipException r2 = new java.util.zip.ZipException
            java.lang.String r0 = "Could not delete temporary file"
            r2.<init>(r0)
            throw r2
        L15:
            return
    }

    void j(java.io.RandomAccessFile r1, java.io.RandomAccessFile r2, long r3, long r5, java.lang.String r7) throws java.io.IOException {
            r0 = this;
            long r5 = r5 + r3
            com.bytedance.pangle.util.ae.j(r1, r2, r3, r5, r7)
            return
    }

    public void j(boolean r23, boolean r24) throws java.io.IOException, java.lang.InterruptedException {
            r22 = this;
            r1 = r22
            java.io.File r9 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.pangle.util.xt.xt.r r2 = r1.j
            java.io.File r2 = r2.cw()
            java.lang.String r2 = r2.getAbsolutePath()
            r0.append(r2)
            java.lang.String r2 = ".rm_tmp"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L2b
            r9.delete()
        L2b:
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = "rw"
            r3.<init>(r9, r0)     // Catch: java.lang.Throwable -> L158
            r4 = r2
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L155
            com.bytedance.pangle.util.xt.xt.r r0 = r1.j     // Catch: java.lang.Throwable -> L155
            java.io.File r0 = r0.cw()     // Catch: java.lang.Throwable -> L155
            java.lang.String r5 = "r"
            r2.<init>(r0, r5)     // Catch: java.lang.Throwable -> L155
            com.bytedance.pangle.util.xt.xt.r r0 = r1.j     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.util.xt.xt.j r0 = r0.j()     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = r0.j()     // Catch: java.lang.Throwable -> L75
            java.util.HashSet r10 = new java.util.HashSet     // Catch: java.lang.Throwable -> L75
            r10.<init>()     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L75
            r4 = 0
            r11 = 0
        L56:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L132
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L75
            r12 = r4
            com.bytedance.pangle.util.xt.xt.cw r12 = (com.bytedance.pangle.util.xt.xt.cw) r12     // Catch: java.lang.Throwable -> L75
            r13 = r23
            r14 = r24
            boolean r4 = r1.j(r12, r13, r14)     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L78
            java.lang.String r4 = r12.vl()     // Catch: java.lang.Throwable -> L75
            r10.add(r4)     // Catch: java.lang.Throwable -> L75
            goto L56
        L75:
            r0 = move-exception
            goto L15b
        L78:
            long r4 = r12.jy()     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = "resources.arsc"
            java.lang.String r7 = r12.vl()     // Catch: java.lang.Throwable -> L75
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L112
            long r6 = r3.getFilePointer()     // Catch: java.lang.Throwable -> L10b
            long r15 = r12.r()     // Catch: java.lang.Throwable -> L10b
            long r6 = r6 + r15
            r15 = 4096(0x1000, double:2.0237E-320)
            long r17 = r6 % r15
            r19 = 0
            int r8 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r8 != 0) goto La0
            r17 = r0
            r0 = r19
            goto Lab
        La0:
            int r8 = r12.m()     // Catch: java.lang.Throwable -> L10b
            r17 = r0
            long r0 = (long) r8     // Catch: java.lang.Throwable -> L10b
            long r6 = r6 - r0
            long r6 = r6 % r15
            long r15 = r15 - r6
            r0 = r15
        Lab:
            int r6 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r6 == 0) goto L10f
            int r15 = r12.m()     // Catch: java.lang.Throwable -> L10b
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L10b
            r12.xt(r1)     // Catch: java.lang.Throwable -> L10b
            long r6 = r12.up()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = r12.vl()     // Catch: java.lang.Throwable -> L10b
            r0 = r1
            r1 = r22
            r1.j(r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L10b
            r18 = r4
            com.bytedance.pangle.util.xt.xt.r r4 = r1.j     // Catch: java.lang.Throwable -> L10b
            com.bytedance.pangle.util.xt.j.cw r4 = r4.r()     // Catch: java.lang.Throwable -> L10b
            r4.j(r3, r0)     // Catch: java.lang.Throwable -> L10b
            long r4 = r12.up()     // Catch: java.lang.Throwable -> L10b
            long r4 = r18 + r4
            r20 = 2
            long r4 = r4 + r20
            int r6 = r12.oq()     // Catch: java.lang.Throwable -> L10b
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = r12.vl()     // Catch: java.lang.Throwable -> L10b
            r1.j(r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L10b
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L10b
            r3.write(r0)     // Catch: java.lang.Throwable -> L10b
            long r0 = r12.up()     // Catch: java.lang.Throwable -> L10b
            long r4 = r18 + r0
            long r4 = r4 + r20
            int r0 = r12.oq()     // Catch: java.lang.Throwable -> L10b
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L10b
            long r4 = r4 + r0
            long r0 = (long) r15     // Catch: java.lang.Throwable -> L10b
            long r4 = r4 + r0
            long r6 = r12.xt()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = r12.vl()     // Catch: java.lang.Throwable -> L10b
            r1 = r22
            r1.j(r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L10b
            r1 = r22
            goto L124
        L10b:
            r0 = move-exception
            r1 = r22
            goto L15b
        L10f:
            r18 = r4
            goto L115
        L112:
            r17 = r0
            goto L10f
        L115:
            long r6 = r12.cw()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = r12.vl()     // Catch: java.lang.Throwable -> L10b
            r1 = r22
            r4 = r18
            r1.j(r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L75
        L124:
            long r4 = (long) r11     // Catch: java.lang.Throwable -> L75
            r12.r(r4)     // Catch: java.lang.Throwable -> L75
            long r6 = r12.cw()     // Catch: java.lang.Throwable -> L75
            long r4 = r4 + r6
            int r11 = (int) r4     // Catch: java.lang.Throwable -> L75
            r0 = r17
            goto L56
        L132:
            com.bytedance.pangle.util.xt.xt.r r0 = r1.j     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.util.xt.xt.j r0 = r0.j()     // Catch: java.lang.Throwable -> L75
            r0.j(r10)     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.util.xt.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.util.xt.xt.r r4 = r1.j     // Catch: java.lang.Throwable -> L75
            r0.j(r4, r3)     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.util.xt.xt.r r0 = r1.j     // Catch: java.lang.Throwable -> L75
            java.io.File r0 = r0.cw()     // Catch: java.lang.Throwable -> L75
            r1.j(r0, r9)     // Catch: java.lang.Throwable -> L75
            r2.close()
            r3.close()
            r1.j(r9)
            return
        L155:
            r0 = move-exception
            r2 = r4
            goto L15b
        L158:
            r0 = move-exception
            r4 = r2
            r3 = r2
        L15b:
            if (r2 == 0) goto L160
            r2.close()
        L160:
            if (r3 == 0) goto L165
            r3.close()
        L165:
            r1.j(r9)
            throw r0
    }
}
