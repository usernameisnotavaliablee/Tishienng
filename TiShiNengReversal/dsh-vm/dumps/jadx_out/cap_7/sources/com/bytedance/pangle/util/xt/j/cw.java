package com.bytedance.pangle.util.xt.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private final byte[] j;
    private final byte[] xt;

    public cw() {
            r1 = this;
            r1.<init>()
            r0 = 2
            byte[] r0 = new byte[r0]
            r1.j = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r1.xt = r0
            return
    }

    private int j(byte[] r3) {
            r2 = this;
            r0 = 0
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r3 = r3[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r3 = r3 | r0
            return r3
    }

    private void j(byte[] r3, int r4) {
            r2 = this;
            int r0 = r4 >>> 8
            byte r0 = (byte) r0
            r1 = 1
            r3[r1] = r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0 = 0
            r3[r0] = r4
            return
    }

    private int xt(byte[] r4) {
            r3 = this;
            r0 = 0
            r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 2
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 3
            r4 = r4[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r1
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
    }

    private void xt(byte[] r3, int r4) {
            r2 = this;
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            r1 = 3
            r3[r1] = r0
            int r0 = r4 >>> 16
            byte r0 = (byte) r0
            r1 = 2
            r3[r1] = r0
            int r0 = r4 >>> 8
            byte r0 = (byte) r0
            r1 = 1
            r3[r1] = r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0 = 0
            r3[r0] = r4
            return
    }

    public int j(java.io.RandomAccessFile r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.xt
            r2.readFully(r0)
            byte[] r2 = r1.xt
            int r2 = r1.xt(r2)
            return r2
    }

    public void j(java.io.ByteArrayOutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.j
            r1.j(r0, r3)
            byte[] r3 = r1.j
            r2.write(r3)
            return
    }

    public void j(java.io.OutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.xt
            r1.xt(r0, r3)
            byte[] r3 = r1.xt
            r2.write(r3)
            return
    }

    public void j(java.io.RandomAccessFile r2, int r3) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.j
            r1.j(r0, r3)
            byte[] r3 = r1.j
            r2.write(r3)
            return
    }

    public int xt(java.io.RandomAccessFile r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.j
            r2.readFully(r0)
            byte[] r2 = r1.j
            int r2 = r1.j(r2)
            return r2
    }
}
