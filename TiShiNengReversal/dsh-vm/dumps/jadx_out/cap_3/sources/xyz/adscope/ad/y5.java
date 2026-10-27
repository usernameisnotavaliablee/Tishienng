package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class y5 extends xyz.adscope.ad.x5 implements xyz.adscope.ad.j3 {
    private xyz.adscope.ad.i3 k;

    public y5(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.j3
    public void a(xyz.adscope.ad.i3 r2) {
            r1 = this;
            r1.k = r2
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r2 = r1.h
            if (r2 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r2 = r2.b()
            if (r2 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r2 = r1.h
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r2 = r2.b()
            xyz.adscope.ad.i3 r0 = r1.k
            r0.a(r2)
        L17:
            return
    }

    @Override // xyz.adscope.ad.x5, xyz.adscope.ad.b4
    public void b() {
            r2 = this;
            super.b()
            xyz.adscope.ad.i3 r0 = r2.k
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof xyz.adscope.ad.p6
            if (r1 == 0) goto L10
            xyz.adscope.ad.p6 r0 = (xyz.adscope.ad.p6) r0
            r0.j()
        L10:
            return
    }

    @Override // xyz.adscope.ad.x5, xyz.adscope.ad.b4
    public void c() {
            r2 = this;
            super.c()
            xyz.adscope.ad.i3 r0 = r2.k
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof xyz.adscope.ad.p6
            if (r1 == 0) goto L10
            xyz.adscope.ad.p6 r0 = (xyz.adscope.ad.p6) r0
            r0.i()
        L10:
            return
    }

    @Override // xyz.adscope.ad.j3
    public java.lang.String getActionType() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.h
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.h
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            java.lang.String r0 = r0.e()
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.j3
    public java.lang.String getInteractionType() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.h
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.h
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            java.lang.String r0 = r0.a()
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            xyz.adscope.ad.i3 r0 = r1.k
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            xyz.adscope.ad.i3 r0 = r1.k
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            xyz.adscope.ad.i3 r0 = r2.k
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof xyz.adscope.ad.p1
            if (r1 == 0) goto L12
            xyz.adscope.ad.p1 r0 = (xyz.adscope.ad.p1) r0
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L12
            r3 = 1
            return r3
        L12:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }
}
