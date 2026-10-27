package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class p1 extends xyz.adscope.ad.g1 {
    private xyz.adscope.ad.p1.b i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface b {
        boolean a(android.view.MotionEvent r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.p1.b {
        private final java.lang.String a;
        private float b;
        private float c;
        private final float d;
        final /* synthetic */ xyz.adscope.ad.p1 e;

        private c(xyz.adscope.ad.p1 r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel r2, java.lang.String r3) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                java.lang.String r1 = r2.a(r3)
                r0.a = r1
                int r1 = r2.b(r3)
                float r1 = (float) r1
                r0.d = r1
                return
        }

        /* synthetic */ c(xyz.adscope.ad.p1 r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel r2, java.lang.String r3, xyz.adscope.ad.p1.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // xyz.adscope.ad.p1.b
        public boolean a(android.view.MotionEvent r5) {
                r4 = this;
                int r0 = r5.getAction()
                if (r0 != 0) goto L12
                float r0 = r5.getX()
                r4.b = r0
                float r0 = r5.getY()
                r4.c = r0
            L12:
                int r0 = r5.getAction()
                r1 = 1
                if (r0 != r1) goto L9a
                xyz.adscope.ad.p1 r0 = r4.e
                android.view.View r0 = xyz.adscope.ad.p1.a(r0)
                android.content.Context r0 = r0.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                float r2 = r5.getX()
                float r5 = r5.getY()
                float r3 = r4.b
                float r3 = r3 - r2
                float r3 = java.lang.Math.abs(r3)
                float r0 = (float) r0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 > 0) goto L4a
                float r3 = r4.c
                float r3 = r3 - r5
                float r3 = java.lang.Math.abs(r3)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 <= 0) goto L9a
            L4a:
                float r0 = r4.b
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                float r3 = r4.d
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 > 0) goto L64
                float r0 = r4.c
                float r0 = r0 - r5
                float r0 = java.lang.Math.abs(r0)
                float r3 = r4.d
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 <= 0) goto L9a
            L64:
                float r0 = r4.b
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                float r3 = r4.c
                float r3 = r3 - r5
                float r3 = java.lang.Math.abs(r3)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 <= 0) goto L82
                float r5 = r4.b
                int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r5 <= 0) goto L7f
                java.lang.String r5 = "LEFT"
                goto L8d
            L7f:
                java.lang.String r5 = "RIGHT"
                goto L8d
            L82:
                float r0 = r4.c
                int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r5 <= 0) goto L8b
                java.lang.String r5 = "UP"
                goto L8d
            L8b:
                java.lang.String r5 = "DOWN"
            L8d:
                java.lang.String r0 = r4.a
                boolean r5 = r5.equalsIgnoreCase(r0)
                if (r5 == 0) goto L9a
                xyz.adscope.ad.p1 r5 = r4.e
                xyz.adscope.ad.p1.b(r5)
            L9a:
                return r1
        }
    }

    public p1(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ android.view.View a(xyz.adscope.ad.p1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ void b(xyz.adscope.ad.p1 r0) {
            r0.e()
            return
    }

    private void e() {
            r1 = this;
            r0 = 0
            r1.i = r0
            xyz.adscope.ad.n3$a r0 = xyz.adscope.ad.n3.a.d
            r1.a(r0)
            return
    }

    public boolean a(android.view.MotionEvent r2) {
            r1 = this;
            xyz.adscope.ad.p1$b r0 = r1.i
            if (r0 == 0) goto L9
            boolean r2 = r0.a(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.ad.g1
    protected void d() {
            r5 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r5.g
            if (r0 == 0) goto L51
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel r0 = r0.k()
            if (r0 == 0) goto L51
            xyz.adscope.ad.e7 r0 = xyz.adscope.ad.e7.a()
            android.content.Context r1 = r5.c
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.x6 r0 = (xyz.adscope.ad.x6) r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1 = r5.g
            long r1 = r1.i()
            boolean r1 = r0.a(r1)
            r2 = 0
            if (r1 != 0) goto L42
            xyz.adscope.ad.c r1 = r5.h
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r3 = r5.g
            long r3 = r3.b()
            boolean r0 = r0.a(r1, r3)
            if (r0 == 0) goto L32
            goto L42
        L32:
            xyz.adscope.ad.p1$c r0 = new xyz.adscope.ad.p1$c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1 = r5.g
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel r1 = r1.k()
            java.lang.String r3 = "Normal"
            r0.<init>(r5, r1, r3, r2)
            r5.i = r0
            return
        L42:
            xyz.adscope.ad.p1$c r0 = new xyz.adscope.ad.p1$c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1 = r5.g
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel r1 = r1.k()
            java.lang.String r3 = "Cooling"
            r0.<init>(r5, r1, r3, r2)
            r5.i = r0
        L51:
            return
    }
}
