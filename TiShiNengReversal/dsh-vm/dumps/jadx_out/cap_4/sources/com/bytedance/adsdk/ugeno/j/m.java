package com.bytedance.adsdk.ugeno.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    private android.content.Context cw;
    private java.util.List<com.bytedance.adsdk.ugeno.j.cw> j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.xt.cw f1964r;
    private java.util.List<com.bytedance.adsdk.ugeno.j.j> xt;

    public m(android.content.Context r1, com.bytedance.adsdk.ugeno.xt.cw r2, java.util.List<com.bytedance.adsdk.ugeno.j.cw> r3) {
            r0 = this;
            r0.<init>()
            r0.f1964r = r2
            r0.cw = r1
            r0.j = r3
            r0.r()
            return
    }

    private void r() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.xt = r0
            java.util.List<com.bytedance.adsdk.ugeno.j.cw> r0 = r5.j
            if (r0 == 0) goto L36
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            goto L36
        L12:
            r0 = 0
        L13:
            java.util.List<com.bytedance.adsdk.ugeno.j.cw> r1 = r5.j
            int r1 = r1.size()
            if (r0 >= r1) goto L36
            java.util.List<com.bytedance.adsdk.ugeno.j.cw> r1 = r5.j
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.ugeno.j.cw r1 = (com.bytedance.adsdk.ugeno.j.cw) r1
            if (r1 == 0) goto L33
            com.bytedance.adsdk.ugeno.j.j r2 = new com.bytedance.adsdk.ugeno.j.j
            android.content.Context r3 = r5.cw
            com.bytedance.adsdk.ugeno.xt.cw r4 = r5.f1964r
            r2.<init>(r3, r4, r1)
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r1 = r5.xt
            r1.add(r2)
        L33:
            int r0 = r0 + 1
            goto L13
        L36:
            return
    }

    public void cw() {
            r2 = this;
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.j.j r1 = (com.bytedance.adsdk.ugeno.j.j) r1
            if (r1 == 0) goto L11
            r1.cw()
            goto L11
        L23:
            return
    }

    public com.bytedance.adsdk.ugeno.j.j j(java.lang.String r5) {
            r4 = this;
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r4.xt
            r1 = 0
            if (r0 == 0) goto L2b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L2b
        Lc:
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r4.xt
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            com.bytedance.adsdk.ugeno.j.j r2 = (com.bytedance.adsdk.ugeno.j.j) r2
            if (r2 == 0) goto L12
            java.lang.String r3 = r2.up()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L12
            return r2
        L2b:
            return r1
    }

    public void j() {
            r2 = this;
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.j.j r1 = (com.bytedance.adsdk.ugeno.j.j) r1
            if (r1 == 0) goto L11
            r1.r()
            goto L11
        L23:
            return
    }

    public void j(int r3, int r4) {
            r2 = this;
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.j.j r1 = (com.bytedance.adsdk.ugeno.j.j) r1
            if (r1 == 0) goto L11
            r1.j(r3, r4)
            goto L11
        L23:
            return
    }

    public void j(android.graphics.Canvas r3) {
            r2 = this;
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.j.j r1 = (com.bytedance.adsdk.ugeno.j.j) r1
            if (r1 == 0) goto L11
            r1.j(r3)
            goto L11
        L23:
            return
    }

    public void xt() {
            r2 = this;
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.List<com.bytedance.adsdk.ugeno.j.j> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.j.j r1 = (com.bytedance.adsdk.ugeno.j.j) r1
            if (r1 == 0) goto L11
            r1.j()
            goto L11
        L23:
            return
    }
}
