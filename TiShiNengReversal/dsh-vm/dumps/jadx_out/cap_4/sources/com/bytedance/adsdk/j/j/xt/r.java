package com.bytedance.adsdk.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r implements com.bytedance.adsdk.j.j.xt.ae {
    protected java.nio.ByteBuffer j;

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 10240(0x2800, float:1.4349E-41)
            r1.cw(r0)
            return
    }

    public void cw(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            if (r0 == 0) goto La
            int r0 = r0.capacity()
            if (r2 <= r0) goto L15
        La:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.j = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
        L15:
            java.nio.ByteBuffer r2 = r1.j
            r2.clear()
            return
    }

    public int j() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            int r0 = r0.position()
            return r0
    }

    public void j(byte r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            r0.put(r2)
            return
    }

    public void j(byte[] r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            r0.put(r2)
            return
    }

    public void r(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.j
            int r1 = r2.j()
            int r3 = r3 + r1
            r0.position(r3)
            return
    }

    public byte[] xt() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            byte[] r0 = r0.array()
            return r0
    }
}
