package com.bytedance.adsdk.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {

    static class j extends java.io.IOException {
        j() {
                r1 = this;
                java.lang.String r0 = "APNG Format error"
                r1.<init>(r0)
                return
        }
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<com.bytedance.adsdk.j.j.j.up> j(com.bytedance.adsdk.j.j.xt.j r2) throws java.io.IOException {
            java.lang.String r0 = "\u0089PNG"
            boolean r0 = r2.j(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "\r\n\u001a\n"
            boolean r0 = r2.j(r0)
            if (r0 == 0) goto L24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L15:
            int r1 = r2.r()
            if (r1 <= 0) goto L23
            com.bytedance.adsdk.j.j.j.up r1 = xt(r2)
            r0.add(r1)
            goto L15
        L23:
            return r0
        L24:
            com.bytedance.adsdk.j.j.j.r$j r2 = new com.bytedance.adsdk.j.j.j.r$j
            r2.<init>()
            throw r2
    }

    private static com.bytedance.adsdk.j.j.j.up xt(com.bytedance.adsdk.j.j.xt.j r4) throws java.io.IOException {
            int r0 = r4.cw()
            int r1 = r4.xt()
            int r2 = r4.b_()
            int r3 = com.bytedance.adsdk.j.j.j.j.j
            if (r2 != r3) goto L16
            com.bytedance.adsdk.j.j.j.j r3 = new com.bytedance.adsdk.j.j.j.j
            r3.<init>()
            goto L4d
        L16:
            int r3 = com.bytedance.adsdk.j.j.j.m.j
            if (r2 != r3) goto L20
            com.bytedance.adsdk.j.j.j.m r3 = new com.bytedance.adsdk.j.j.j.m
            r3.<init>()
            goto L4d
        L20:
            int r3 = com.bytedance.adsdk.j.j.j.ae.j
            if (r2 != r3) goto L2a
            com.bytedance.adsdk.j.j.j.ae r3 = new com.bytedance.adsdk.j.j.j.ae
            r3.<init>()
            goto L4d
        L2a:
            int r3 = com.bytedance.adsdk.j.j.j.oq.j
            if (r2 != r3) goto L34
            com.bytedance.adsdk.j.j.j.oq r3 = new com.bytedance.adsdk.j.j.j.oq
            r3.<init>()
            goto L4d
        L34:
            int r3 = com.bytedance.adsdk.j.j.j.qv.j
            if (r2 != r3) goto L3e
            com.bytedance.adsdk.j.j.j.qv r3 = new com.bytedance.adsdk.j.j.j.qv
            r3.<init>()
            goto L4d
        L3e:
            int r3 = com.bytedance.adsdk.j.j.j.vl.j
            if (r2 != r3) goto L48
            com.bytedance.adsdk.j.j.j.vl r3 = new com.bytedance.adsdk.j.j.j.vl
            r3.<init>()
            goto L4d
        L48:
            com.bytedance.adsdk.j.j.j.up r3 = new com.bytedance.adsdk.j.j.j.up
            r3.<init>()
        L4d:
            r3.ae = r0
            r3.up = r2
            r3.f1745r = r1
            r3.xt(r4)
            int r4 = r4.xt()
            r3.f1744m = r4
            return r3
    }
}
