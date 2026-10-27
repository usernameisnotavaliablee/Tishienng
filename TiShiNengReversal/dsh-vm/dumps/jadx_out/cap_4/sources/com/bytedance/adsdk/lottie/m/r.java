package com.bytedance.adsdk.lottie.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private float j;
    private float xt;

    public r() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r0, r0)
            return
    }

    public r(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    public float j() {
            r1 = this;
            float r0 = r1.j
            return r0
    }

    public void j(float r1, float r2) {
            r0 = this;
            r0.j = r1
            r0.xt = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.j()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            float r1 = r2.xt()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public float xt() {
            r1 = this;
            float r0 = r1.xt
            return r0
    }

    public boolean xt(float r2, float r3) {
            r1 = this;
            float r0 = r1.j
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Le
            float r2 = r1.xt
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }
}
