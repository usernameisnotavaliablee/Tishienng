package com.bytedance.msdk.cw.cw.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up implements com.bytedance.msdk.cw.cw.xt.j.j {
    private com.bytedance.msdk.cw.m.j.xt cw;
    private java.util.List<com.bytedance.msdk.cw.cw.xt.j> j;
    private com.bytedance.msdk.cw.m.xt.xt xt;


    public up(java.util.List<com.bytedance.msdk.cw.cw.xt.j> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.j = r0
            boolean r0 = com.bytedance.msdk.tl.p.j(r2)
            if (r0 != 0) goto L15
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r0 = r1.j
            r0.addAll(r2)
        L15:
            return
    }

    static /* synthetic */ java.util.List j(com.bytedance.msdk.cw.cw.xt.up r0) {
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r0 = r0.j
            return r0
    }

    public com.bytedance.msdk.cw.m.xt.xt j() {
            r1 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r1.xt
            return r0
    }

    public void j(com.bytedance.msdk.cw.cw.xt.j r2) {
            r1 = this;
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r0 = r1.j
            boolean r0 = com.bytedance.msdk.tl.p.j(r0)
            if (r0 != 0) goto L2c
            if (r2 != 0) goto Lb
            goto L2c
        Lb:
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r0 = r1.j
            int r2 = r0.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L2c
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r0 = r1.j
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r2 < r0) goto L1f
            goto L2c
        L1f:
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r0 = r1.j
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.cw.cw.xt.j r2 = (com.bytedance.msdk.cw.cw.xt.j) r2
            r2.j(r1)
        L2c:
            return
    }

    public void j(com.bytedance.msdk.cw.m.j.xt r1, com.bytedance.msdk.cw.m.xt.xt r2) {
            r0 = this;
            r0.cw = r1
            r0.xt = r2
            java.util.List<com.bytedance.msdk.cw.cw.xt.j> r1 = r0.j
            boolean r1 = com.bytedance.msdk.tl.p.j(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            com.bytedance.msdk.cw.cw.xt.up$1 r1 = new com.bytedance.msdk.cw.cw.xt.up$1
            r1.<init>(r0)
            com.bytedance.msdk.j.up.m.j(r1)
            return
    }

    public com.bytedance.msdk.cw.m.j.xt xt() {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.cw
            return r0
    }
}
