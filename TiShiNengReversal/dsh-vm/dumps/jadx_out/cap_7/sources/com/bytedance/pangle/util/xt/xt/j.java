package com.bytedance.pangle.util.xt.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private java.util.List<com.bytedance.pangle.util.xt.xt.cw> j;

    public j() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
            return
    }

    public java.util.List<com.bytedance.pangle.util.xt.xt.cw> j() {
            r1 = this;
            java.util.List<com.bytedance.pangle.util.xt.xt.cw> r0 = r1.j
            return r0
    }

    public void j(java.util.List<com.bytedance.pangle.util.xt.xt.cw> r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(java.util.Set<java.lang.String> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.bytedance.pangle.util.xt.xt.cw> r1 = r4.j
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.bytedance.pangle.util.xt.xt.cw r2 = (com.bytedance.pangle.util.xt.xt.cw) r2
            java.lang.String r3 = r2.vl()
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto Lb
            r0.add(r2)
            goto Lb
        L25:
            r4.j = r0
            return
    }
}
