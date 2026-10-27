package com.bytedance.adsdk.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.j.j.xt.r {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.j.j.xt.r
    public void cw(int r2) {
            r1 = this;
            super.cw(r2)
            java.nio.ByteBuffer r2 = r1.j
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.order(r0)
            return
    }

    public void j(int r2) {
            r1 = this;
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.j(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.j(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.j(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r1.j(r2)
            return
    }

    public void xt(int r2) {
            r1 = this;
            int r0 = r2 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.j(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.j(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.j(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r1.j(r2)
            return
    }
}
