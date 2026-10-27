package com.bytedance.adsdk.ugeno.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class xt implements com.bytedance.adsdk.ugeno.cw.w {
    protected boolean cw;
    protected com.bytedance.adsdk.ugeno.cw.w j;

    /* renamed from: r, reason: collision with root package name */
    protected org.json.JSONObject f1924r;
    protected boolean up;
    protected java.lang.String xt;

    public xt(com.bytedance.adsdk.ugeno.cw.w r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.cw = r0
            r0 = 0
            r1.up = r0
            r1.j = r2
            return
    }

    public abstract void cw(com.bytedance.adsdk.ugeno.cw.av r1, com.bytedance.adsdk.ugeno.cw.w.xt r2, com.bytedance.adsdk.ugeno.cw.w.j r3);

    @Override // com.bytedance.adsdk.ugeno.cw.w
    public void j(com.bytedance.adsdk.ugeno.cw.av r2, com.bytedance.adsdk.ugeno.cw.w.xt r3, com.bytedance.adsdk.ugeno.cw.w.j r4) {
            r1 = this;
            boolean r0 = r1.j()
            if (r0 == 0) goto La
            r1.cw(r2, r3, r4)
            return
        La:
            r1.xt(r2, r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.cw.w
    public void j(com.bytedance.adsdk.ugeno.xt.cw r2, java.lang.String r3, com.bytedance.adsdk.ugeno.up.m.j r4) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.w r0 = r1.j
            if (r0 != 0) goto L5
            return
        L5:
            r0.j(r2, r3, r4)
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void j(org.json.JSONObject r1) {
            r0 = this;
            r0.f1924r = r1
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public boolean j() {
            r2 = this;
            boolean r0 = r2.cw
            if (r0 == 0) goto L16
            java.lang.String r0 = r2.xt
            if (r0 == 0) goto L16
            java.lang.String r1 = "3"
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L16
            org.json.JSONObject r0 = r2.f1924r
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    protected void xt(com.bytedance.adsdk.ugeno.cw.av r2, com.bytedance.adsdk.ugeno.cw.w.xt r3, com.bytedance.adsdk.ugeno.cw.w.j r4) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.w r0 = r1.j
            if (r0 != 0) goto L5
            return
        L5:
            r0.j(r2, r3, r4)
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.up = r1
            return
    }
}
