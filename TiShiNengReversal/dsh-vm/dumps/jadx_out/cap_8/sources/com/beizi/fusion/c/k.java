package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k extends com.beizi.fusion.c.d {
    private int r;

    public k(android.content.Context r1, java.lang.String r2, com.beizi.fusion.a r3, long r4, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = r0
            r1.r = r6
            return
    }

    public void A() {
            r0 = this;
            r0.j()
            return
    }

    public void B() {
            r0 = this;
            r0.k()
            return
    }

    @Override // com.beizi.fusion.c.d
    public com.beizi.fusion.work.a a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r9, java.lang.String r10, com.beizi.fusion.model.AdSpacesBean.BuyerBean r11, java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r12, com.beizi.fusion.work.a r13) {
            r8 = this;
            long r2 = r9.getSleepTime()
            java.lang.String r12 = com.beizi.fusion.tool.ao.b()
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 != 0) goto L18
            java.lang.String r12 = "BEIZI"
            boolean r10 = r12.equalsIgnoreCase(r10)
            if (r10 == 0) goto L17
            goto L18
        L17:
            return r13
        L18:
            com.beizi.fusion.work.e.b r0 = new com.beizi.fusion.work.e.b
            android.content.Context r1 = r8.f7568b
            int r7 = r8.r
            r6 = r8
            r5 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r5, r6, r7)
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
