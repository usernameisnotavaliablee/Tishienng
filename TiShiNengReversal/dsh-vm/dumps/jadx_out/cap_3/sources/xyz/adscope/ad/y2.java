package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class y2 implements xyz.adscope.ad.j2<xyz.adscope.ad.a3, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel, android.view.View>, xyz.adscope.ad.z2 {
    private final android.view.View a;
    private final java.lang.String b;
    private xyz.adscope.ad.a3 c;
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel d;
    private xyz.adscope.ad.y2.d e;
    private xyz.adscope.ad.y2.b f;
    private int g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum b extends java.lang.Enum<xyz.adscope.ad.y2.b> {
        public static final xyz.adscope.ad.y2.b a = null;
        public static final xyz.adscope.ad.y2.b b = null;
        private static final /* synthetic */ xyz.adscope.ad.y2.b[] c = null;

        static {
                xyz.adscope.ad.y2$b r0 = new xyz.adscope.ad.y2$b
                java.lang.String r1 = "VIEW_RESUME"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.ad.y2.b.a = r0
                xyz.adscope.ad.y2$b r0 = new xyz.adscope.ad.y2$b
                java.lang.String r1 = "VIEW_PAUSE"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.ad.y2.b.b = r0
                xyz.adscope.ad.y2$b[] r0 = a()
                xyz.adscope.ad.y2.b.c = r0
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.ad.y2.b[] a() {
                r0 = 2
                xyz.adscope.ad.y2$b[] r0 = new xyz.adscope.ad.y2.b[r0]
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.a
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.b
                r2 = 1
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.y2.b valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.y2$b> r0 = xyz.adscope.ad.y2.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.y2$b r1 = (xyz.adscope.ad.y2.b) r1
                return r1
        }

        public static xyz.adscope.ad.y2.b[] values() {
                xyz.adscope.ad.y2$b[] r0 = xyz.adscope.ad.y2.b.c
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.y2$b[] r0 = (xyz.adscope.ad.y2.b[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.y2 a;

        private c(xyz.adscope.ad.y2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.y2 r1, xyz.adscope.ad.y2.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.ad.y2 r0 = r3.a
                android.view.View r0 = xyz.adscope.ad.y2.a(r0)
                r1 = 10
                boolean r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.checkViewVisibilityCoverage(r0, r1)
                if (r0 == 0) goto L2b
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.y2$b r0 = xyz.adscope.ad.y2.b(r0)
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.b
                if (r0 != r1) goto L23
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.e
                android.view.View r2 = xyz.adscope.ad.y2.a(r0)
                r0.a(r1, r2)
            L23:
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.a
                xyz.adscope.ad.y2.a(r0, r1)
                goto L47
            L2b:
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.y2$b r0 = xyz.adscope.ad.y2.b(r0)
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.a
                if (r0 != r1) goto L40
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.f
                android.view.View r2 = xyz.adscope.ad.y2.a(r0)
                r0.a(r1, r2)
            L40:
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.b
                xyz.adscope.ad.y2.a(r0, r1)
            L47:
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = xyz.adscope.ad.y2.c(r0)
                int r0 = r0.a()
                xyz.adscope.ad.y2 r1 = r3.a
                android.view.View r1 = xyz.adscope.ad.y2.a(r1)
                boolean r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.checkViewVisibilityCoverage(r1, r0)
                if (r0 == 0) goto L7b
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.a
                xyz.adscope.ad.y2.a(r0, r1)
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.d
                android.view.View r2 = xyz.adscope.ad.y2.a(r0)
                r0.a(r1, r2)
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.c
                android.view.View r2 = xyz.adscope.ad.y2.a(r0)
                r0.a(r1, r2)
                return
            L7b:
                xyz.adscope.ad.y2 r0 = r3.a
                xyz.adscope.ad.y2$b r1 = xyz.adscope.ad.y2.b.b
                xyz.adscope.ad.y2.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class d extends xyz.adscope.common.v2.thread.pool.IRemoveAbleScheduledTask {
        public d(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r6 = this;
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1 = 0
                r3 = 100
                r0 = r6
                r0.startScheduled(r1, r3, r5)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.y2.d r0) {
                r0.a()
                return
        }

        private void b() {
                r0 = this;
                r0.stopScheduled()
                return
        }

        static /* synthetic */ void b(xyz.adscope.ad.y2.d r0) {
                r0.b()
                return
        }
    }

    public y2(android.view.View r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            xyz.adscope.ad.y2$b r0 = xyz.adscope.ad.y2.b.b
            r1.f = r0
            r1.a = r2
            r1.b = r3
            return
    }

    static /* synthetic */ android.view.View a(xyz.adscope.ad.y2 r0) {
            android.view.View r0 = r0.a
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.y2.b a(xyz.adscope.ad.y2 r0, xyz.adscope.ad.y2.b r1) {
            r0.f = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.ad.y2.b b(xyz.adscope.ad.y2 r0) {
            xyz.adscope.ad.y2$b r0 = r0.f
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel c(xyz.adscope.ad.y2 r0) {
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = r0.d
            return r0
    }

    @Override // xyz.adscope.ad.j2
    public void a() {
            r3 = this;
            xyz.adscope.ad.y2$d r0 = new xyz.adscope.ad.y2$d
            xyz.adscope.ad.y2$c r1 = new xyz.adscope.ad.y2$c
            r2 = 0
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3.e = r0
            xyz.adscope.ad.y2.d.a(r0)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(xyz.adscope.ad.a3 r1) {
            r0 = this;
            r0.c = r1
            r1.a(r0)
            return
    }

    public void a(xyz.adscope.ad.l2 r3, android.view.View r4) {
            r2 = this;
            xyz.adscope.ad.a3 r0 = r2.c
            if (r0 == 0) goto L26
            xyz.adscope.ad.a3$a r1 = xyz.adscope.ad.a3.a.c
            if (r3 != r1) goto Lb
            r0.a(r3, r4)
        Lb:
            xyz.adscope.ad.a3$a r0 = xyz.adscope.ad.a3.a.d
            if (r3 != r0) goto L14
            xyz.adscope.ad.a3 r0 = r2.c
            r0.b(r4)
        L14:
            xyz.adscope.ad.a3$a r0 = xyz.adscope.ad.a3.a.e
            if (r3 != r0) goto L1d
            xyz.adscope.ad.a3 r0 = r2.c
            r0.b(r3, r4)
        L1d:
            xyz.adscope.ad.a3$a r0 = xyz.adscope.ad.a3.a.f
            if (r3 != r0) goto L26
            xyz.adscope.ad.a3 r3 = r2.c
            r3.a(r4)
        L26:
            return
    }

    @Override // xyz.adscope.ad.j2
    public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.a3 r1) {
            r0 = this;
            xyz.adscope.ad.a3 r1 = (xyz.adscope.ad.a3) r1
            r0.a2(r1)
            return
    }

    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r1) {
            r0 = this;
            r0.d = r1
            int r1 = r1.a()
            r0.g = r1
            return
    }

    @Override // xyz.adscope.ad.z2
    public int b() {
            r2 = this;
            android.view.View r0 = r2.a
            int r1 = r2.g
            boolean r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.checkViewVisibilityCoverage(r0, r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void c() {
            r1 = this;
            xyz.adscope.ad.y2$d r0 = r1.e
            if (r0 == 0) goto L7
            xyz.adscope.ad.y2.d.b(r0)
        L7:
            return
    }
}
