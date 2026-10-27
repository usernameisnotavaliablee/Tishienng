package com.bytedance.msdk.core.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j implements com.bytedance.msdk.core.j.j.j.j {
    public java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> cw;
    public com.bytedance.msdk.api.j.xt j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.core.j.j.j.xt f2211r;
    public com.bytedance.msdk.core.oq.oq xt;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean cw() {
            r6 = this;
            com.bytedance.msdk.ae.j.j r0 = com.bytedance.msdk.ae.j.j.j()
            int r0 = r0.r()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.bytedance.msdk.core.oq.oq r3 = r6.xt
            boolean r3 = r3.la()
            com.bytedance.msdk.ae.j.j r4 = com.bytedance.msdk.ae.j.j.j()
            int r4 = r4.up()
            if (r4 != r2) goto L21
            r4 = 1
            goto L22
        L21:
            r4 = 0
        L22:
            com.bytedance.msdk.core.oq.oq r5 = r6.xt
            int r5 = r5.mi()
            if (r5 != 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            if (r0 == 0) goto L31
            if (r3 != 0) goto L35
        L31:
            if (r4 == 0) goto L36
            if (r5 == 0) goto L36
        L35:
            return r2
        L36:
            return r1
    }

    public final void j(int r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.j.j.j.xt r0 = r1.f2211r
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    protected abstract void j(android.content.Context r1);

    @Override // com.bytedance.msdk.core.j.j.j.j
    public final void j(android.content.Context r1, java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.core.oq.oq r4, com.bytedance.msdk.core.j.j.j.xt r5) {
            r0 = this;
            if (r2 == 0) goto L13
            if (r3 == 0) goto L13
            if (r4 == 0) goto L13
            if (r5 == 0) goto L13
            r0.f2211r = r5
            r0.xt = r4
            r0.j = r3
            r0.cw = r2
            r0.j(r1)
        L13:
            return
    }

    public void j(com.bytedance.msdk.xt.cw r2, com.bytedance.msdk.api.j r3) {
            r1 = this;
            com.bytedance.msdk.core.j.j.j.xt r0 = r1.f2211r
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r2) {
            r1 = this;
            com.bytedance.msdk.core.j.j.j.xt r0 = r1.f2211r
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public boolean j() {
            r4 = this;
            com.bytedance.msdk.core.oq.oq r0 = r4.xt
            r1 = 0
            if (r0 == 0) goto L12
            int r0 = r0.oq()
            r2 = 1
            if (r0 == r2) goto L11
            r3 = 3
            if (r0 != r3) goto L10
            goto L11
        L10:
            return r1
        L11:
            return r2
        L12:
            return r1
    }

    public java.lang.String xt() {
            r2 = this;
            com.bytedance.msdk.core.oq.oq r0 = r2.xt
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            boolean r0 = r0.h()
            if (r0 != 0) goto Le
            return r1
        Le:
            com.bytedance.msdk.core.oq.oq r0 = r2.xt
            com.bytedance.msdk.core.oq.tl r0 = r0.l()
            if (r0 != 0) goto L17
            return r1
        L17:
            com.bytedance.msdk.core.oq.oq r0 = r2.xt
            com.bytedance.msdk.core.oq.tl r0 = r0.l()
            java.lang.String r0 = r0.oq()
            return r0
    }
}
