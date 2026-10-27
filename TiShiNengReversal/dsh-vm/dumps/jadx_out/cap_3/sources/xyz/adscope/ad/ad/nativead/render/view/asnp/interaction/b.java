package xyz.adscope.ad.ad.nativead.render.view.asnp.interaction;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b extends xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c implements xyz.adscope.ad.b3 {
    private xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown h;
    private xyz.adscope.ad.l3 i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown {
        final /* synthetic */ xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b a;

        a(xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b r1, long r2, long r4) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2, r4)
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown
        public void onCancel() {
                r1 = this;
                xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b r0 = r1.a
                r0.e()
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown
        public void onFinish() {
                r1 = this;
                xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b r0 = r1.a
                r0.f()
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown
        public void onTick(long r2) {
                r1 = this;
                xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b r0 = r1.a
                r0.a(r2)
                return
        }
    }

    public b(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected void a(long r4) {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r1
            int r5 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r5 = r3.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r5 = r5.f()
            java.lang.String r5 = r5.p()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "%d %s"
            java.lang.String r4 = java.lang.String.format(r0, r4, r1)
            r3.setText(r4)
            return
    }

    @Override // xyz.adscope.ad.b3
    public void a(xyz.adscope.ad.l3 r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c, xyz.adscope.ad.i6, xyz.adscope.ad.b4
    public void b() {
            r0 = this;
            super.b()
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c, xyz.adscope.ad.i6, xyz.adscope.ad.b4
    public void c() {
            r0 = this;
            super.c()
            return
    }

    @Override // xyz.adscope.ad.i6
    protected void d() {
            r7 = this;
            int r0 = r7.getCountDownTime()
            if (r0 <= 0) goto L18
            xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b$a r1 = new xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b$a
            int r0 = r7.getCountDownTime()
            int r0 = r0 + 500
            long r3 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            r2 = r7
            r1.<init>(r2, r3, r5)
            r2.h = r1
            return
        L18:
            r2 = r7
            r7.g()
            return
    }

    protected void e() {
            r0 = this;
            return
    }

    protected void f() {
            r1 = this;
            xyz.adscope.ad.l3 r0 = r1.i
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    protected void g() {
            r0 = this;
            return
    }

    protected int getCountDownTime() {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.d
            if (r0 == 0) goto L23
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            if (r0 == 0) goto L23
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            int r0 = r0.c()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L23
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            int r0 = r0.c()
            return r0
        L23:
            int r0 = r2.getDefaultCountDownTime()
            return r0
    }

    protected int getDefaultCountDownTime() {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            return r0
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0 = r1.h
            if (r0 == 0) goto La
            r0.start()
        La:
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0 = r1.h
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }
}
