package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class p extends com.amap.api.col.s.o {

    /* renamed from: j, reason: collision with root package name */
    private double f4598j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        double f4599b;

        public a(double r3, double r5, double r7) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r0 = 0
                r2.f4599b = r0
                com.amap.api.services.core.LatLonPoint r0 = new com.amap.api.services.core.LatLonPoint
                r0.<init>(r3, r5)
                r2.a = r0
                r2.f4599b = r7
                return
        }

        public final boolean a(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L27
                java.lang.Class<com.amap.api.col.s.p$a> r2 = com.amap.api.col.s.p.a.class
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L10
                goto L27
            L10:
                com.amap.api.services.core.LatLonPoint r2 = r6.a
                com.amap.api.col.s.p$a r7 = (com.amap.api.col.s.p.a) r7
                com.amap.api.services.core.LatLonPoint r3 = r7.a
                if (r2 != r3) goto L19
                return r0
            L19:
                if (r2 == 0) goto L27
                float r2 = com.amap.api.col.s.j4.b(r2, r3)
                double r2 = (double) r2
                double r4 = r7.f4599b
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 > 0) goto L27
                return r0
            L27:
                return r1
        }
    }

    public p(java.lang.String... r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.f4598j = r0
            return
    }

    @Override // com.amap.api.col.s.o
    public final void c(com.amap.api.col.s.n.a r3) {
            r2 = this;
            super.c(r3)
            if (r3 == 0) goto Lb
            double r0 = r3.h()
            r2.f4598j = r0
        Lb:
            return
    }

    @Override // com.amap.api.col.s.o
    protected final boolean f(java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> r5, com.amap.api.col.s.n.b r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L43
            if (r6 != 0) goto L6
            goto L43
        L6:
            java.lang.Object r1 = r6.f4573b
            if (r1 != 0) goto Lf
            boolean r5 = super.f(r5, r6)
            return r5
        Lf:
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()
            com.amap.api.col.s.n$b r1 = (com.amap.api.col.s.n.b) r1
            if (r1 == 0) goto L17
            java.lang.String r2 = r1.a
            if (r2 == 0) goto L17
            java.lang.String r3 = r6.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L17
            java.lang.Object r1 = r1.f4573b
            boolean r2 = r1 instanceof com.amap.api.col.s.p.a
            if (r2 == 0) goto L17
            com.amap.api.col.s.p$a r1 = (com.amap.api.col.s.p.a) r1
            java.lang.Object r2 = r6.f4573b
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L17
            r5 = 1
            return r5
        L43:
            return r0
    }

    @Override // com.amap.api.col.s.o
    protected final java.lang.Object g(java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> r6, com.amap.api.col.s.n.b r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L46
            if (r7 != 0) goto L6
            goto L46
        L6:
            java.lang.Object r1 = r7.f4573b
            if (r1 != 0) goto Lf
            java.lang.Object r6 = super.g(r6, r7)
            return r6
        Lf:
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            com.amap.api.col.s.n$b r2 = (com.amap.api.col.s.n.b) r2
            if (r2 == 0) goto L17
            java.lang.String r3 = r2.a
            if (r3 == 0) goto L17
            java.lang.String r4 = r7.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L17
            java.lang.Object r3 = r2.f4573b
            boolean r4 = r3 instanceof com.amap.api.col.s.p.a
            if (r4 == 0) goto L17
            com.amap.api.col.s.p$a r3 = (com.amap.api.col.s.p.a) r3
            java.lang.Object r4 = r7.f4573b
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L17
            java.lang.Object r6 = r6.get(r2)
            return r6
        L46:
            return r0
    }

    @Override // com.amap.api.col.s.o
    protected final java.lang.Object k(java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> r6, com.amap.api.col.s.n.b r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L4a
            if (r7 != 0) goto L6
            goto L4a
        L6:
            java.lang.Object r1 = r7.f4573b
            if (r1 != 0) goto Lf
            java.lang.Object r6 = super.k(r6, r7)
            return r6
        Lf:
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            com.amap.api.col.s.n$b r2 = (com.amap.api.col.s.n.b) r2
            if (r2 == 0) goto L17
            java.lang.String r3 = r2.a
            if (r3 == 0) goto L17
            java.lang.String r4 = r7.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L17
            java.lang.Object r3 = r2.f4573b
            boolean r4 = r3 instanceof com.amap.api.col.s.p.a
            if (r4 == 0) goto L17
            com.amap.api.col.s.p$a r3 = (com.amap.api.col.s.p.a) r3
            java.lang.Object r4 = r7.f4573b
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L17
            goto L43
        L42:
            r2 = r0
        L43:
            if (r2 == 0) goto L4a
            java.lang.Object r6 = r6.remove(r2)
            return r6
        L4a:
            return r0
    }

    public final double l() {
            r2 = this;
            double r0 = r2.f4598j
            return r0
    }
}
