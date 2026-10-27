package com.bytedance.msdk.cw.cw.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class xt extends com.bytedance.sdk.openadsdk.core.wq.r implements com.bytedance.msdk.cw.j.j, com.bytedance.msdk.cw.j.xt {
    private boolean cw;
    protected com.bytedance.msdk.cw.j.xt j;
    private boolean xt;


    public xt(com.bytedance.msdk.cw.j.xt r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.xt = r0
            r1.cw = r0
            r1.j = r2
            return
    }

    private void cw(android.content.Context r2, com.bytedance.msdk.cw.m.xt.xt r3, com.bytedance.msdk.api.j.xt r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r1 = this;
            r0 = 0
            r1.xt = r0
            r1.cw = r0
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            if (r0 == 0) goto L16
            r1.xt(r2, r3, r4, r5)
            r1.j(r3)
            return
        L16:
            r1.xt(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            r1.j(r3)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r2 = move-exception
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            java.lang.String r4 = com.bytedance.msdk.core.ws.xt.j(r2)
            r3.<init>(r4)
            r1.j(r3)
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.xt.j.xt r0, android.content.Context r1, com.bytedance.msdk.cw.m.xt.xt r2, com.bytedance.msdk.api.j.xt r3, java.util.Map r4) {
            r0.cw(r1, r2, r3, r4)
            return
    }

    private void j(com.bytedance.msdk.cw.m.xt.xt r3) {
            r2 = this;
            if (r3 == 0) goto L11
            java.lang.String r0 = r3.jy()
            java.lang.String r1 = r3.xt()
            java.lang.String r3 = r3.vl()
            com.bytedance.msdk.core.cw.cw.xt(r0, r1, r3)
        L11:
            return
    }

    public <T> T applyFunction(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String j(android.content.Context r1, com.bytedance.msdk.cw.m.xt.xt r2, com.bytedance.msdk.api.j.xt r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final void j(android.content.Context r8, com.bytedance.msdk.cw.m.xt.xt r9, com.bytedance.msdk.api.j.xt r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
            r7 = this;
            if (r9 == 0) goto L27
            java.lang.String r0 = "mintegral"
            java.lang.String r1 = r9.jy()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "baidu"
            java.lang.String r1 = r9.jy()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "admob"
            java.lang.String r1 = r9.jy()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L27
            goto L2c
        L27:
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            goto L3a
        L2c:
            com.bytedance.msdk.cw.cw.xt.j.xt$1 r1 = new com.bytedance.msdk.cw.cw.xt.j.xt$1
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.bytedance.msdk.j.up.m.cw(r1)
            return
        L3a:
            r7.cw(r3, r4, r5, r6)
            return
    }

    public void j(com.bytedance.msdk.api.j r3) {
            r2 = this;
            r0 = 1
            r2.cw = r0
            boolean r1 = r2.xt
            if (r1 == 0) goto L8
            goto L11
        L8:
            r2.xt = r0
            com.bytedance.msdk.cw.j.xt r0 = r2.j
            if (r0 == 0) goto L11
            r0.j(r3)
        L11:
            return
    }

    public void j(com.bytedance.msdk.xt.cw r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r0.add(r3)
            r2.j(r0)
            return
    }

    public void j(com.bytedance.msdk.xt.cw r3, com.bytedance.msdk.api.j r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r0.add(r3)
            r2.j(r0, r4)
            return
    }

    public void j(com.bytedance.msdk.xt.cw r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.cw.j.xt r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r2) {
            r1 = this;
            boolean r0 = r1.xt
            if (r0 == 0) goto L5
            goto Lf
        L5:
            r0 = 1
            r1.xt = r0
            com.bytedance.msdk.cw.j.xt r0 = r1.j
            if (r0 == 0) goto Lf
            r0.j(r2)
        Lf:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r2, com.bytedance.msdk.api.j r3) {
            r1 = this;
            boolean r0 = r1.cw
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.bytedance.msdk.cw.j.xt r0 = r1.j
            if (r0 == 0) goto Lc
            r0.j(r2, r3)
        Lc:
            return
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    public abstract void xt(android.content.Context r1, com.bytedance.msdk.cw.m.xt.xt r2, com.bytedance.msdk.api.j.xt r3, java.util.Map<java.lang.String, java.lang.Object> r4);

    public boolean xt() {
            r1 = this;
            boolean r0 = r1.xt
            return r0
    }
}
