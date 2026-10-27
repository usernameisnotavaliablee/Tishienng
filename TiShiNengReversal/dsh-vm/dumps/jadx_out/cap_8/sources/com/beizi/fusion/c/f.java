package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f extends com.beizi.fusion.c.d {
    private int r;
    private int s;

    public f(android.content.Context r1, java.lang.String r2, com.beizi.fusion.a r3, long r4, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = r0
            r1.s = r6
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

    @Override // com.beizi.fusion.c.d
    public com.beizi.fusion.work.a a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r11, java.lang.String r12, com.beizi.fusion.model.AdSpacesBean.BuyerBean r13, java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r14, com.beizi.fusion.work.a r15) {
            r10 = this;
            r13.getAdType()
            long r5 = r11.getSleepTime()
            java.lang.String r14 = com.beizi.fusion.tool.ao.b()
            boolean r14 = r14.equalsIgnoreCase(r12)
            if (r14 != 0) goto L1b
            java.lang.String r14 = "BEIZI"
            boolean r12 = r14.equalsIgnoreCase(r12)
            if (r12 == 0) goto L1a
            goto L1b
        L1a:
            return r15
        L1b:
            com.beizi.fusion.work.a.a r0 = new com.beizi.fusion.work.a.a
            android.content.Context r1 = r10.f7568b
            java.lang.String r2 = r10.f7571e
            long r3 = r10.f7572f
            r9 = r10
            r8 = r11
            r7 = r13
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            return r0
    }

    public void a(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L9
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 == 0) goto L9
            r0.a(r2)
        L9:
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.r = r1
            return
    }

    @Override // com.beizi.fusion.c.d
    protected void c() {
            r2 = this;
            com.beizi.fusion.events.EventBean r0 = r2.f7569c
            if (r0 == 0) goto L9
            java.lang.String r1 = "3"
            r0.setAdType(r1)
        L9:
            return
    }

    public boolean y() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public void z() {
            r1 = this;
            r0 = 0
            r1.a(r0)
            return
    }
}
