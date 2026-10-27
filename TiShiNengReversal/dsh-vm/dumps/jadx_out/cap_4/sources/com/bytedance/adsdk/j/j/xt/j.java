package com.bytedance.adsdk.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.j.j.xt.up {
    private static java.lang.ThreadLocal<byte[]> xt;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.bytedance.adsdk.j.j.xt.j.xt = r0
            return
    }

    public j(com.bytedance.adsdk.j.j.xt.m r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected static byte[] j() {
            java.lang.ThreadLocal<byte[]> r0 = com.bytedance.adsdk.j.j.xt.j.xt
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L12
            r0 = 4
            byte[] r0 = new byte[r0]
            java.lang.ThreadLocal<byte[]> r1 = com.bytedance.adsdk.j.j.xt.j.xt
            r1.set(r0)
        L12:
            return r0
    }

    public short a_() throws java.io.IOException {
            r3 = this;
            byte[] r0 = j()
            r1 = 2
            r2 = 0
            r3.j(r0, r2, r1)
            r1 = 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public int b_() throws java.io.IOException {
            r3 = this;
            byte[] r0 = j()
            r1 = 4
            r2 = 0
            r3.j(r0, r2, r1)
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r2 = 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            r2 = 3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
    }

    public boolean j(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L28
            int r0 = r7.length()
            r2 = 4
            if (r0 == r2) goto Lf
            goto L28
        Lf:
            int r0 = r6.b_()
            r3 = 0
        L14:
            if (r3 >= r2) goto L26
            int r4 = r3 * 8
            int r4 = r0 >> r4
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L23
            return r1
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7 = 1
            return r7
        L28:
            return r1
    }

    public int xt() throws java.io.IOException {
            r4 = this;
            byte[] r0 = j()
            r1 = 4
            r2 = 0
            r4.j(r0, r2, r1)
            r1 = 3
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r1 = r1 | r3
            r3 = 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r1 = r1 | r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
    }
}
