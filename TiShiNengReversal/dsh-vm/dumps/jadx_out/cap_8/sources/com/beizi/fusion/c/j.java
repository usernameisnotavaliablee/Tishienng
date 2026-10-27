package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j extends com.beizi.fusion.c.d {
    private int r;
    private int s;


    public j(android.content.Context r7, java.lang.String r8, android.view.View r9, com.beizi.fusion.a r10, long r11) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4)
            r0.f7573g = r9
            return
    }

    public void A() {
            r2 = this;
            boolean r0 = r2.o
            if (r0 == 0) goto L5
            goto L18
        L5:
            com.beizi.fusion.work.a r0 = r2.f7575i
            if (r0 == 0) goto L18
            boolean r1 = r2.n
            if (r1 != 0) goto L18
            r0.au()
            com.beizi.fusion.work.a r0 = r2.f7575i
            r0.e()
            r0 = 1
            r2.n = r0
        L18:
            return
    }

    public int B() {
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

    public void C() {
            r2 = this;
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b()
            java.util.concurrent.ExecutorService r0 = r0.c()
            com.beizi.fusion.c.j$1 r1 = new com.beizi.fusion.c.j$1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public java.util.Map D() {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.av()
            return r0
    }

    @Override // com.beizi.fusion.c.d
    public com.beizi.fusion.work.a a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r14, java.lang.String r15, com.beizi.fusion.model.AdSpacesBean.BuyerBean r16, java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r17, com.beizi.fusion.work.a r18) {
            r13 = this;
            java.lang.String r0 = com.beizi.fusion.tool.ao.b()
            boolean r0 = r0.equalsIgnoreCase(r15)
            if (r0 != 0) goto L14
            java.lang.String r0 = "BEIZI"
            boolean r15 = r0.equalsIgnoreCase(r15)
            if (r15 == 0) goto L13
            goto L14
        L13:
            return r18
        L14:
            com.beizi.fusion.work.splash.a r0 = new com.beizi.fusion.work.splash.a
            android.content.Context r1 = r13.f7568b
            java.lang.String r2 = r13.f7571e
            long r3 = r13.f7572f
            android.view.View r5 = r13.f7573g
            android.view.ViewGroup r6 = r13.f7570d
            int r10 = r13.y()
            int r11 = r13.z()
            r12 = r13
            r8 = r14
            r7 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public void a(android.content.Context r2) {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.a(r2)     // Catch: java.lang.Exception -> L7
        L7:
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
            android.content.Context r0 = com.beizi.fusion.c.d.a
            com.beizi.fusion.model.AppEventId r0 = com.beizi.fusion.model.AppEventId.getInstance(r0)
            java.lang.String r1 = r2.m
            r0.setAppSplashRequest(r1)
            com.beizi.fusion.events.EventBean r0 = r2.f7569c
            if (r0 == 0) goto L14
            java.lang.String r1 = "2"
            r0.setAdType(r1)
        L14:
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public int y() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public int z() {
            r1 = this;
            int r0 = r1.s
            return r0
    }
}
