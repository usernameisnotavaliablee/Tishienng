package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends com.beizi.fusion.c.d {
    private int r;
    private boolean s;
    private boolean t;

    public h(android.content.Context r1, java.lang.String r2, com.beizi.fusion.a r3, long r4, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = r0
            r1.r = r6
            return
    }

    public int A() {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.i()
            if (r0 == 0) goto Lf
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lf
            return r0
        Lf:
            r0 = -1
            return r0
    }

    public void B() {
            r0 = this;
            r0.j()
            return
    }

    public void C() {
            r0 = this;
            r0.k()
            return
    }

    @Override // com.beizi.fusion.c.d
    public com.beizi.fusion.work.a a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r13, java.lang.String r14, com.beizi.fusion.model.AdSpacesBean.BuyerBean r15, java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r16, com.beizi.fusion.work.a r17) {
            r12 = this;
            long r4 = r13.getSleepTime()
            java.lang.String r0 = com.beizi.fusion.tool.ao.b()
            boolean r0 = r0.equalsIgnoreCase(r14)
            if (r0 != 0) goto L18
            java.lang.String r0 = "BEIZI"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L17
            goto L18
        L17:
            return r17
        L18:
            com.beizi.fusion.work.c.b r0 = new com.beizi.fusion.work.c.b
            android.content.Context r1 = r12.f7568b
            long r2 = r12.f7572f
            int r9 = r12.r
            boolean r10 = r12.s
            boolean r11 = r12.t
            r8 = r12
            r7 = r13
            r6 = r15
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public void b(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // com.beizi.fusion.c.d
    protected void c() {
            r2 = this;
            android.content.Context r0 = com.beizi.fusion.c.d.a
            com.beizi.fusion.model.AppEventId r0 = com.beizi.fusion.model.AppEventId.getInstance(r0)
            java.lang.String r1 = r2.m
            r0.setAppNativeRequest(r1)
            com.beizi.fusion.events.EventBean r0 = r2.f7569c
            if (r0 == 0) goto L14
            java.lang.String r1 = "5"
            r0.setAdType(r1)
        L14:
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void y() {
            r1 = this;
            r0 = 0
            r1.a(r0)
            return
    }

    public boolean z() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }
}
