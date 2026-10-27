package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g extends com.beizi.fusion.c.d {
    private float r;
    private float s;
    private int t;

    public g(android.content.Context r1, java.lang.String r2, com.beizi.fusion.a r3, long r4, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = r0
            r1.t = r6
            return
    }

    public void A() {
            r0 = this;
            r0.k()
            return
    }

    public void B() {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 == 0) goto L7
            r0.n()
        L7:
            return
    }

    @Override // com.beizi.fusion.c.d
    public com.beizi.fusion.work.a a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r13, java.lang.String r14, com.beizi.fusion.model.AdSpacesBean.BuyerBean r15, java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r16, com.beizi.fusion.work.a r17) {
            r12 = this;
            long r5 = r13.getSleepTime()
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
            int r14 = r12.t
            r0 = 4
            if (r14 != r0) goto L30
            com.beizi.fusion.work.b.b r0 = new com.beizi.fusion.work.b.b
            android.content.Context r1 = r12.f7568b
            java.lang.String r2 = r12.f7571e
            long r3 = r12.f7572f
            float r10 = r12.r
            float r11 = r12.s
            r9 = r12
            r8 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r0
        L30:
            r0 = 5
            if (r14 != r0) goto L46
            com.beizi.fusion.work.b.c r0 = new com.beizi.fusion.work.b.c
            android.content.Context r1 = r12.f7568b
            java.lang.String r2 = r12.f7571e
            long r3 = r12.f7572f
            float r10 = r12.r
            float r11 = r12.s
            r9 = r12
            r8 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r0
        L46:
            com.beizi.fusion.work.b.d r0 = new com.beizi.fusion.work.b.d
            android.content.Context r1 = r12.f7568b
            java.lang.String r2 = r12.f7571e
            long r3 = r12.f7572f
            float r10 = r12.r
            float r11 = r12.s
            r9 = r12
            r8 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r0
    }

    public void a(float r1, float r2) {
            r0 = this;
            r0.r = r1
            r0.s = r2
            r1 = 0
            r0.a(r1)
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

    public int y() {
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

    public void z() {
            r0 = this;
            r0.j()
            return
    }
}
