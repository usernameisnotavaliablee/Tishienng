package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class y implements xyz.adscope.ad.u1 {
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel, xyz.adscope.ad.l2> {
        final /* synthetic */ xyz.adscope.ad.y a;

        a(xyz.adscope.ad.y r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r2, xyz.adscope.ad.l2 r3) {
                r1 = this;
                r0 = 0
                if (r2 == 0) goto L11
                if (r3 == 0) goto L11
                int r2 = r2.e()
                int r3 = r3.getEventCode()
                if (r2 != r3) goto L11
                r2 = 1
                return r2
            L11:
                return r0
        }

        @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
        public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r1, xyz.adscope.ad.l2 r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel) r1
                xyz.adscope.ad.l2 r2 = (xyz.adscope.ad.l2) r2
                boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    y() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r2) {
            r1 = this;
            int r0 = r2.b()
            if (r0 == 0) goto L13
            int r2 = r2.b()
            boolean r2 = xyz.adscope.common.v2.tool.roll.RandomProbability.roll(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r5, xyz.adscope.ad.b1 r6) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.l()
            long r0 = r0 - r2
            int r5 = r5.a()
            long r5 = (long) r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L14
            r5 = 1
            return r5
        L14:
            r5 = 0
            return r5
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r1) {
            r0 = this;
            if (r1 == 0) goto L7
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r1 = r1.e()
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // xyz.adscope.ad.u1
    public void a(xyz.adscope.ad.l2 r3, xyz.adscope.ad.b1 r4, xyz.adscope.ad.u1.a r5) {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = r2.a
            if (r0 == 0) goto L2f
            if (r4 == 0) goto L2f
            java.util.List r0 = r0.b()
            if (r0 == 0) goto L2f
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2f
            xyz.adscope.ad.y$a r1 = new xyz.adscope.ad.y$a
            r1.<init>(r2)
            java.lang.Object r3 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r0, r3, r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel) r3
            if (r3 == 0) goto L2f
            boolean r4 = r2.a(r3, r4)
            if (r4 == 0) goto L2e
            r5.b()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L2f
        L2e:
            return
        L2f:
            r5.b()
            r5.a()
            return
    }

    @Override // xyz.adscope.ad.u1
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r1) {
            r0 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r1 = r0.b(r1)
            r0.a = r1
            return
    }
}
