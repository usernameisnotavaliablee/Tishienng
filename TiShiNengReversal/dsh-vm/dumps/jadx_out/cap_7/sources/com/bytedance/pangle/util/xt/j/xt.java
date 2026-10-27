package com.bytedance.pangle.util.xt.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j(com.bytedance.pangle.util.xt.xt.cw r5, java.io.ByteArrayOutputStream r6, com.bytedance.pangle.util.xt.j.cw r7) throws java.io.IOException {
            r4 = this;
            if (r5 == 0) goto L8f
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0098: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r1 = 33639248(0x2014b50, float:9.499037E-38)
            r7.j(r6, r1)
            r1 = 0
            r7.j(r6, r1)
            r7.j(r6, r1)
            r7.j(r6, r1)
            int r2 = r5.j()
            r7.j(r6, r2)
            r2 = 2081(0x821, float:2.916E-42)
            r7.j(r6, r2)
            r2 = 545(0x221, float:7.64E-43)
            r7.j(r6, r2)
            long r2 = r5.ae()
            int r3 = (int) r2
            r7.j(r6, r3)
            long r2 = r5.tl()
            int r3 = (int) r2
            r7.j(r6, r3)
            long r2 = r5.g()
            int r3 = (int) r2
            r7.j(r6, r3)
            byte[] r2 = new byte[r1]
            java.lang.String r3 = r5.vl()
            if (r3 == 0) goto L5f
            java.lang.String r3 = r5.vl()
            java.lang.String r3 = r3.trim()
            int r3 = r3.length()
            if (r3 <= 0) goto L5f
            java.lang.String r2 = r5.vl()
            byte[] r2 = r4.j(r2)
        L5f:
            int r3 = r2.length
            r7.j(r6, r3)
            int r3 = r5.qv()
            r7.j(r6, r3)
            r7.j(r6, r1)
            r6.write(r0)
            r6.write(r0)
            r6.write(r0)
            r6.write(r0)
            long r0 = r5.jy()
            int r5 = (int) r0
            r7.j(r6, r5)
            int r5 = r2.length
            if (r5 <= 0) goto L87
            r6.write(r2)
        L87:
            if (r3 <= 0) goto L8e
            byte[] r5 = new byte[r3]
            r6.write(r5)
        L8e:
            return
        L8f:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "input parameters is null, cannot write local file header"
            r5.<init>(r6)
            throw r5
    }

    private void j(com.bytedance.pangle.util.xt.xt.r r4, int r5, int r6, java.io.ByteArrayOutputStream r7) throws java.io.IOException {
            r3 = this;
            com.bytedance.pangle.util.xt.j.cw r0 = r4.r()
            r1 = 101010256(0x6054b50, float:2.506985E-35)
            r0.j(r7, r1)
            com.bytedance.pangle.util.xt.j.cw r0 = r4.r()
            r1 = 0
            r0.j(r7, r1)
            com.bytedance.pangle.util.xt.j.cw r0 = r4.r()
            r0.j(r7, r1)
            com.bytedance.pangle.util.xt.xt.j r0 = r4.j()
            java.util.List r0 = r0.j()
            int r0 = r0.size()
            com.bytedance.pangle.util.xt.j.cw r2 = r4.r()
            r2.j(r7, r0)
            com.bytedance.pangle.util.xt.j.cw r2 = r4.r()
            r2.j(r7, r0)
            com.bytedance.pangle.util.xt.j.cw r0 = r4.r()
            r0.j(r7, r5)
            com.bytedance.pangle.util.xt.j.cw r5 = r4.r()
            r5.j(r7, r6)
            com.bytedance.pangle.util.xt.j.cw r4 = r4.r()
            r4.j(r7, r1)
            return
    }

    private void j(com.bytedance.pangle.util.xt.xt.r r4, java.io.ByteArrayOutputStream r5) throws java.io.IOException {
            r3 = this;
            com.bytedance.pangle.util.xt.xt.j r0 = r4.j()
            if (r0 == 0) goto L3f
            com.bytedance.pangle.util.xt.xt.j r0 = r4.j()
            java.util.List r0 = r0.j()
            if (r0 == 0) goto L3f
            com.bytedance.pangle.util.xt.xt.j r0 = r4.j()
            java.util.List r0 = r0.j()
            int r0 = r0.size()
            if (r0 > 0) goto L1f
            goto L3f
        L1f:
            com.bytedance.pangle.util.xt.xt.j r0 = r4.j()
            java.util.List r0 = r0.j()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            com.bytedance.pangle.util.xt.xt.cw r1 = (com.bytedance.pangle.util.xt.xt.cw) r1
            com.bytedance.pangle.util.xt.j.cw r2 = r4.r()
            r3.j(r1, r5, r2)
            goto L2b
        L3f:
            return
    }

    private byte[] j(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r2 = r2.getBytes(r0)
            return r2
    }

    public void j(com.bytedance.pangle.util.xt.xt.r r5, java.io.RandomAccessFile r6) throws java.io.IOException {
            r4 = this;
            if (r5 == 0) goto L2e
            if (r6 == 0) goto L2e
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            long r2 = r6.getFilePointer()     // Catch: java.lang.Throwable -> L24
            r4.j(r5, r1)     // Catch: java.lang.Throwable -> L24
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L24
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L24
            r4.j(r5, r0, r3, r1)     // Catch: java.lang.Throwable -> L24
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L24
            r6.write(r5)     // Catch: java.lang.Throwable -> L24
            r1.close()
            return
        L24:
            r5 = move-exception
            r0 = r1
            goto L28
        L27:
            r5 = move-exception
        L28:
            if (r0 == 0) goto L2d
            r0.close()
        L2d:
            throw r5
        L2e:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "input parameters is null, cannot finalize zip file"
            r5.<init>(r6)
            throw r5
    }
}
