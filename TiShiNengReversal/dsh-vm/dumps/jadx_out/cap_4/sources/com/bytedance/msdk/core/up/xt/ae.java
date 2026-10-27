package com.bytedance.msdk.core.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae implements java.lang.Comparable<com.bytedance.msdk.core.up.xt.ae> {
    private boolean cw;
    public com.bytedance.msdk.xt.cw j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.api.j.xt f2271r;
    private long xt;

    public ae(com.bytedance.msdk.xt.cw r2, long r3, com.bytedance.msdk.api.j.xt r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cw = r0
            r1.j = r2
            r1.xt = r3
            r1.f2271r = r5
            return
    }

    public boolean ae() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.f()
            return r0
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.bytedance.msdk.core.up.xt.ae r1) {
            r0 = this;
            com.bytedance.msdk.core.up.xt.ae r1 = (com.bytedance.msdk.core.up.xt.ae) r1
            int r1 = r0.j(r1)
            return r1
    }

    public boolean cw() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    public int j(com.bytedance.msdk.core.up.xt.ae r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.j
            com.bytedance.msdk.xt.cw r2 = r2.j
            int r2 = r0.j(r2)
            return r2
    }

    public long j() {
            r2 = this;
            long r0 = r2.xt
            return r0
    }

    public void j(boolean r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public java.lang.String m() {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.f2271r
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.v()
            return r0
    }

    public com.bytedance.msdk.api.j.xt r() {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.f2271r
            return r0
    }

    public boolean up() {
            r3 = this;
            com.bytedance.msdk.xt.cw r0 = r3.j
            r1 = 0
            if (r0 == 0) goto L20
            com.bytedance.msdk.api.j.xt r2 = r3.f2271r
            if (r2 != 0) goto La
            goto L20
        La:
            boolean r0 = r0.qb()
            if (r0 != 0) goto L20
            com.bytedance.msdk.xt.cw r0 = r3.j
            com.bytedance.msdk.api.j.xt r2 = r3.f2271r
            java.lang.String r2 = r2.v()
            boolean r0 = r0.wq(r2)
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            return r1
    }

    public java.lang.String xt() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.qa()
            return r0
    }

    public void xt(boolean r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.j
            if (r0 != 0) goto L5
            return
        L5:
            r0.j(r2)
            return
    }
}
