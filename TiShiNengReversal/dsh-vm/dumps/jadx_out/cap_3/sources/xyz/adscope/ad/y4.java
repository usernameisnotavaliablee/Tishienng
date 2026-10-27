package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class y4 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements java.util.Comparator<xyz.adscope.ad.o2> {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.y4.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(xyz.adscope.ad.o2 r1, xyz.adscope.ad.o2 r2) {
                r0 = this;
                java.lang.String r1 = r1.e()
                int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
                java.lang.String r2 = r2.e()
                int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
                if (r1 >= r2) goto L14
                r1 = -1
                return r1
            L14:
                if (r1 != r2) goto L18
                r1 = 0
                return r1
            L18:
                r1 = 1
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(xyz.adscope.ad.o2 r1, xyz.adscope.ad.o2 r2) {
                r0 = this;
                xyz.adscope.ad.o2 r1 = (xyz.adscope.ad.o2) r1
                xyz.adscope.ad.o2 r2 = (xyz.adscope.ad.o2) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements java.util.Comparator<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.y4.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r4, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r5) {
                r3 = this;
                int r0 = r4.c()
                int r1 = r5.c()
                r2 = -1
                if (r0 >= r1) goto Lc
                return r2
            Lc:
                int r0 = r4.c()
                int r1 = r5.c()
                if (r0 != r1) goto L2b
                java.lang.String r4 = r4.a()
                int r4 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r4)
                java.lang.String r5 = r5.a()
                int r5 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r5)
                if (r4 >= r5) goto L29
                return r2
            L29:
                r4 = 0
                return r4
            L2b:
                r4 = 1
                return r4
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel) r1
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r2 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public y4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.Comparator<xyz.adscope.ad.o2> a() {
            xyz.adscope.ad.y4$b r0 = new xyz.adscope.ad.y4$b
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static java.util.Comparator<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel> b() {
            xyz.adscope.ad.y4$c r0 = new xyz.adscope.ad.y4$c
            r1 = 0
            r0.<init>(r1)
            return r0
    }
}
