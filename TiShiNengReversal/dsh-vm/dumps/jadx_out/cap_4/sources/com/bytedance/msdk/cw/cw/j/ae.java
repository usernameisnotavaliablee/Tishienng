package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae implements com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j {
    private int cw;
    private java.util.List<com.bytedance.msdk.cw.cw.j.j> j;

    /* renamed from: r, reason: collision with root package name */
    private int f2306r;
    private com.bytedance.msdk.cw.m.j.xt xt;



    public ae(java.util.List<com.bytedance.msdk.cw.cw.j.j> r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.j = r0
            r1 = 0
            r2.cw = r1
            r2.f2306r = r1
            if (r3 == 0) goto L14
            r0.addAll(r3)
        L14:
            return
    }

    static /* synthetic */ java.util.List cw(com.bytedance.msdk.cw.cw.j.ae r0) {
            java.util.List<com.bytedance.msdk.cw.cw.j.j> r0 = r0.j
            return r0
    }

    static /* synthetic */ int j(com.bytedance.msdk.cw.cw.j.ae r0) {
            int r0 = r0.cw
            return r0
    }

    static /* synthetic */ int m(com.bytedance.msdk.cw.cw.j.ae r2) {
            int r0 = r2.f2306r
            int r1 = r0 + 1
            r2.f2306r = r1
            return r0
    }

    static /* synthetic */ int r(com.bytedance.msdk.cw.cw.j.ae r2) {
            int r0 = r2.cw
            int r1 = r0 + 1
            r2.cw = r1
            return r0
    }

    static /* synthetic */ int up(com.bytedance.msdk.cw.cw.j.ae r0) {
            int r0 = r0.f2306r
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.cw.m.j.xt xt(com.bytedance.msdk.cw.cw.j.ae r0) {
            com.bytedance.msdk.cw.m.j.xt r0 = r0.xt
            return r0
    }

    @Override // com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j
    public com.bytedance.msdk.cw.m.j.xt j() {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j
    public void j(com.bytedance.msdk.cw.m.j.xt r2) {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.xt
            if (r0 == r2) goto L8
            if (r2 == 0) goto L8
            r1.xt = r2
        L8:
            java.util.List<com.bytedance.msdk.cw.cw.j.j> r2 = r1.j
            boolean r2 = com.bytedance.msdk.tl.p.j(r2)
            if (r2 == 0) goto L11
            return
        L11:
            com.bytedance.msdk.cw.cw.j.ae$1 r2 = new com.bytedance.msdk.cw.cw.j.ae$1
            r2.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r2)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j
    public void j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            com.bytedance.msdk.cw.m.j.xt r0 = r1.xt
            if (r0 == 0) goto Ld
            r0.xt(r2)
        Ld:
            com.bytedance.msdk.cw.cw.j.ae$2 r2 = new com.bytedance.msdk.cw.cw.j.ae$2
            r2.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r2)
            return
    }
}
