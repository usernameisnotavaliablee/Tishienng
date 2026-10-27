package xyz.adscope.ad.download.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.ad.download.service.a$a, reason: collision with other inner class name */
    public static class C0060a {
        private final java.lang.String a;
        private final java.lang.String b;
        private final java.lang.String c;
        private final xyz.adscope.ad.b1 d;
        private final java.lang.String e;
        private final java.lang.String f;
        private final java.lang.String g;
        private xyz.adscope.ad.download.service.a.b h;
        private long i;
        private int j;

        public C0060a(java.lang.String r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r2, java.lang.String r3, java.lang.String r4, xyz.adscope.ad.b1 r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.String r1 = r0.b(r2)
                r0.f = r1
                r0.b = r3
                r0.c = r4
                r0.d = r5
                java.lang.String r1 = r0.c(r2)
                r0.e = r1
                java.lang.String r1 = r0.a(r2)
                r0.g = r1
                return
        }

        private java.lang.String a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1) {
                r0 = this;
                if (r1 == 0) goto L7
                java.lang.String r1 = r1.a()
                return r1
            L7:
                java.lang.String r1 = ""
                return r1
        }

        private java.lang.String b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1) {
                r0 = this;
                if (r1 == 0) goto L7
                java.lang.String r1 = r1.c()
                return r1
            L7:
                java.lang.String r1 = ""
                return r1
        }

        private java.lang.String c(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1) {
                r0 = this;
                if (r1 == 0) goto L7
                java.lang.String r1 = r1.f()
                return r1
            L7:
                java.lang.String r1 = ""
                return r1
        }

        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.g
                return r0
        }

        public void a(int r4) {
                r3 = this;
                int r0 = r3.j
                r1 = 16
                if (r0 != r1) goto Ld
                xyz.adscope.ad.download.service.a$b r0 = r3.h
                if (r0 == 0) goto Ld
                r0.a(r3)
            Ld:
                int r0 = r3.j
                r1 = 2
                r2 = 4
                if (r0 != r2) goto L1c
                if (r4 != r1) goto L1c
                xyz.adscope.ad.download.service.a$b r0 = r3.h
                if (r0 == 0) goto L1c
                r0.b(r3)
            L1c:
                int r0 = r3.j
                if (r0 != r1) goto L29
                if (r4 != r2) goto L29
                xyz.adscope.ad.download.service.a$b r0 = r3.h
                if (r0 == 0) goto L29
                r0.c(r3)
            L29:
                r3.j = r4
                return
        }

        public void a(long r1) {
                r0 = this;
                r0.i = r1
                return
        }

        public void a(xyz.adscope.ad.download.service.a.b r1) {
                r0 = this;
                r0.h = r1
                return
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.e
                return r0
        }

        public xyz.adscope.ad.b1 d() {
                r1 = this;
                xyz.adscope.ad.b1 r0 = r1.d
                return r0
        }

        public java.lang.String e() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(xyz.adscope.ad.download.service.a.C0060a r1);

        void b(xyz.adscope.ad.download.service.a.C0060a r1);

        void c(xyz.adscope.ad.download.service.a.C0060a r1);
    }

    void a(xyz.adscope.ad.download.service.a.C0060a r1);
}
