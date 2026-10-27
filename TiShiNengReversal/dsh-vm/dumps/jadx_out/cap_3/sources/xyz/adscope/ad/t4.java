package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class t4 {
    private final xyz.adscope.common.v2.conn.IBaseSimpleRequest a;
    private android.content.Context b;
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel c;
    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> d;
    private boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel, xyz.adscope.ad.l2> {
        final /* synthetic */ xyz.adscope.ad.t4 a;

        a(xyz.adscope.ad.t4 r1) {
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
                int r3 = r3.getEventCode()
                int r2 = r2.e()
                if (r3 != r2) goto L11
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel, xyz.adscope.ad.l2> {
        final /* synthetic */ xyz.adscope.ad.t4 a;

        b(xyz.adscope.ad.t4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel r2, xyz.adscope.ad.l2 r3) {
                r1 = this;
                r0 = 0
                if (r2 == 0) goto L11
                if (r3 == 0) goto L11
                int r2 = r2.b()
                int r3 = r3.getEventCode()
                if (r2 != r3) goto L11
                r2 = 1
                return r2
            L11:
                return r0
        }

        @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
        public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel r1, xyz.adscope.ad.l2 r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel) r1
                xyz.adscope.ad.l2 r2 = (xyz.adscope.ad.l2) r2
                boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c {
        private final xyz.adscope.ad.b1 a;

        private c(xyz.adscope.ad.b1 r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ c(xyz.adscope.ad.b1 r1, xyz.adscope.ad.t4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r2 = this;
                xyz.adscope.ad.b1 r0 = r2.a
                if (r0 == 0) goto L8
                r1 = -1
                r0.a(r1)
            L8:
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.t4.c r0) {
                r0.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d implements java.lang.Runnable {
        private final xyz.adscope.ad.s4 a;
        private final java.lang.String b;
        private final xyz.adscope.ad.w1 c;
        private final xyz.adscope.common.v2.conn.http.RequestMethod d;
        private xyz.adscope.ad.t4.c e;

        private d(android.content.Context r1, java.lang.String r2, int r3, xyz.adscope.ad.l2 r4, xyz.adscope.ad.b1 r5) {
                r0 = this;
                r0.<init>()
                xyz.adscope.ad.s4 r4 = xyz.adscope.ad.a0.a(r1, r4, r5)
                r0.a = r4
                r0.b = r2
                if (r3 != 0) goto L10
                xyz.adscope.common.v2.conn.http.RequestMethod r2 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
                goto L12
            L10:
                xyz.adscope.common.v2.conn.http.RequestMethod r2 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            L12:
                r0.d = r2
                xyz.adscope.ad.h0 r2 = xyz.adscope.ad.h0.a()
                java.lang.Object r1 = r2.getOrCreateImplement(r1)
                xyz.adscope.ad.w1 r1 = (xyz.adscope.ad.w1) r1
                r0.c = r1
                return
        }

        /* synthetic */ d(android.content.Context r1, java.lang.String r2, int r3, xyz.adscope.ad.l2 r4, xyz.adscope.ad.b1 r5, xyz.adscope.ad.t4.a r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private void a(xyz.adscope.ad.t4.c r1) {
                r0 = this;
                r0.e = r1
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.t4.d r0, xyz.adscope.ad.t4.c r1) {
                r0.a(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.String r0 = r5.b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3b
                java.lang.String r0 = r5.b
                xyz.adscope.ad.s4 r1 = r5.a
                java.util.Map r1 = r1.getMacrosReplaceMap()
                java.lang.String r0 = xyz.adscope.common.v2.tool.str.RegexUtil.replaceMacros(r0, r1)
                xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
                xyz.adscope.common.v2.conn.http.RequestMethod r2 = r5.d
                r3 = 0
                if (r1 != r2) goto L36
                java.lang.String r1 = "?"
                int r2 = r0.indexOf(r1)
                r4 = 0
                java.lang.String r2 = r0.substring(r4, r2)
                int r1 = r0.indexOf(r1)
                int r1 = r1 + 1
                java.lang.String r0 = r0.substring(r1)
                xyz.adscope.ad.w1 r1 = r5.c
                r1.a(r2, r0, r3)
                goto L3b
            L36:
                xyz.adscope.ad.w1 r1 = r5.c
                r1.a(r0, r3)
            L3b:
                xyz.adscope.ad.t4$c r0 = r5.e
                if (r0 == 0) goto L42
                xyz.adscope.ad.t4.c.a(r0)
            L42:
                return
        }
    }

    t4(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.e = r0
            r2.b = r3
            xyz.adscope.common.v2.conn.IBaseSimpleRequest r0 = new xyz.adscope.common.v2.conn.IBaseSimpleRequest
            r1 = 1
            r0.<init>(r3, r1)
            r2.a = r0
            return
    }

    private int a(xyz.adscope.ad.l2 r7) {
            r6 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = r6.c
            r1 = 0
            if (r0 == 0) goto L41
            java.util.List r0 = r0.b()
            if (r0 == 0) goto L41
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = r6.c
            java.util.List r0 = r0.b()
            xyz.adscope.ad.t4$a r2 = new xyz.adscope.ad.t4$a
            r2.<init>(r6)
            java.lang.Object r7 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r0, r7, r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel r7 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule.RuleModel) r7
            if (r7 == 0) goto L41
            java.lang.String r0 = r7.c()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2c
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
        L2c:
            int r0 = r7.d()
            if (r0 <= 0) goto L41
            double r2 = java.lang.Math.random()
            int r7 = r7.d()
            double r4 = (double) r7
            double r2 = r2 * r4
            int r7 = (int) r2
            int r7 = r7 + 1
            int r1 = r1 + r7
        L41:
            return r1
    }

    private void a(xyz.adscope.ad.b1 r1, int r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.a(r2)
        L5:
            return
    }

    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> b(xyz.adscope.ad.l2 r3) {
            r2 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> r0 = r2.d
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> r0 = r2.d
            xyz.adscope.ad.t4$b r1 = new xyz.adscope.ad.t4$b
            r1.<init>(r2)
            java.util.List r3 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchAllFromList(r0, r3, r1)
            return r3
        L16:
            r3 = 0
            return r3
    }

    public void a(xyz.adscope.ad.l2 r12, xyz.adscope.ad.b1 r13) {
            r11 = this;
            java.util.List r0 = r11.b(r12)
            if (r0 == 0) goto L72
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L72
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r1 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r2 = r11.b
            java.lang.Object r1 = r1.getOrCreateImplement(r2)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r1 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r1
            int r2 = r11.a(r12)
            xyz.adscope.ad.y1$a r3 = xyz.adscope.ad.y1.a.c
            if (r12 != r3) goto L23
            r11.a(r13, r2)
        L23:
            int r4 = r12.getEventCode()
            int r3 = r3.getEventCode()
            if (r4 <= r3) goto L38
            if (r13 == 0) goto L38
            int r3 = r13.d()
            if (r3 <= 0) goto L38
            if (r2 >= r3) goto L38
            r2 = r3
        L38:
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r0.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel) r3
            xyz.adscope.ad.t4$d r4 = new xyz.adscope.ad.t4$d
            android.content.Context r5 = r11.b
            java.lang.String r6 = r3.c()
            int r7 = r3.a()
            xyz.adscope.ad.b1 r9 = r13.a()
            r10 = 0
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            xyz.adscope.ad.y1$a r12 = xyz.adscope.ad.y1.a.c
            if (r8 != r12) goto L6a
            xyz.adscope.ad.t4$c r12 = new xyz.adscope.ad.t4$c
            r3 = 0
            r12.<init>(r13, r3)
            xyz.adscope.ad.t4.d.a(r4, r12)
        L6a:
            long r5 = (long) r2
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.scheduleAsyncTask(r4, r5, r12)
            r12 = r8
            goto L3c
        L72:
            return
    }

    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2) {
            r1 = this;
            if (r2 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = r2.e()
            r1.c = r0
            java.util.List r2 = r2.a()
            r1.d = r2
            r2 = 1
            r1.e = r2
        L11:
            return
    }

    boolean a() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }
}
