package com.bytedance.adsdk.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class up {
    int ae;

    /* renamed from: m, reason: collision with root package name */
    int f1744m;

    /* renamed from: r, reason: collision with root package name */
    int f1745r;
    int up;

    up() {
            r0 = this;
            r0.<init>()
            return
    }

    static int j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L34
            int r0 = r2.length()
            r1 = 4
            if (r0 == r1) goto Le
            goto L34
        Le:
            r0 = 0
            char r0 = r2.charAt(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            char r1 = r2.charAt(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 2
            char r1 = r2.charAt(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = 3
            char r2 = r2.charAt(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
        L34:
            r2 = -1159790593(0xffffffffbadeffff, float:-0.0017013549)
            return r2
    }

    void j(com.bytedance.adsdk.j.j.xt.j r1) throws java.io.IOException {
            r0 = this;
            return
    }

    void xt(com.bytedance.adsdk.j.j.xt.j r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.r()
            r2.j(r3)
            int r1 = r3.r()
            int r0 = r0 - r1
            int r1 = r2.f1745r
            if (r0 > r1) goto L18
            if (r0 >= r1) goto L17
            int r1 = r1 - r0
            long r0 = (long) r1
            r3.j(r0)
        L17:
            return
        L18:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Out of chunk area"
            r3.<init>(r0)
            throw r3
    }
}
