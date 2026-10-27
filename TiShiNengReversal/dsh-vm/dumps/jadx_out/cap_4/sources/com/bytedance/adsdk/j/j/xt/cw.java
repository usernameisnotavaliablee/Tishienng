package com.bytedance.adsdk.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.adsdk.j.j.xt.m {
    private final java.nio.ByteBuffer j;

    public cw(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r1.j = r2
            r0 = 0
            r2.position(r0)
            return
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public byte c_() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            byte r0 = r0.get()
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public int cw() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            int r0 = r0.position()
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public void d_() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.j
            r1 = 0
            r0.position(r1)
            return
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public int j(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.j
            r0.get(r2, r3, r4)
            return r4
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public long j(long r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.j
            int r1 = r0.position()
            long r1 = (long) r1
            long r1 = r1 + r4
            int r2 = (int) r1
            r0.position(r2)
            return r4
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public int r() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.j
            int r0 = r0.limit()
            java.nio.ByteBuffer r1 = r2.j
            int r1 = r1.position()
            int r0 = r0 - r1
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.xt.m
    public java.io.InputStream up() throws java.io.IOException {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            java.nio.ByteBuffer r1 = r2.j
            byte[] r1 = r1.array()
            r0.<init>(r1)
            return r0
    }
}
