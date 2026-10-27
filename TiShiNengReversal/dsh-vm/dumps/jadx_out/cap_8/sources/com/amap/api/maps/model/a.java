package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class a {
    private final com.amap.api.col.p0003l.l2 a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5006b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.model.WeightedLatLng> f5007c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.model.a> f5008d;

    private a(double r10, double r12, double r14, double r16, int r18) {
            r9 = this;
            com.amap.api.col.3l.l2 r0 = new com.amap.api.col.3l.l2
            r1 = r10
            r3 = r12
            r5 = r14
            r7 = r16
            r0.<init>(r1, r3, r5, r7)
            r10 = r18
            r9.<init>(r0, r10)
            return
    }

    protected a(com.amap.api.col.p0003l.l2 r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private a(com.amap.api.col.p0003l.l2 r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5008d = r0
            r1.a = r2
            r1.f5006b = r3
            return
    }

    private void a() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r12.f5008d = r0
            com.amap.api.maps.model.a r2 = new com.amap.api.maps.model.a
            com.amap.api.col.3l.l2 r1 = r12.a
            double r3 = r1.a
            double r5 = r1.f3665e
            double r7 = r1.f3662b
            double r9 = r1.f3666f
            int r1 = r12.f5006b
            int r11 = r1 + 1
            r2.<init>(r3, r5, r7, r9, r11)
            r0.add(r2)
            java.util.List<com.amap.api.maps.model.a> r0 = r12.f5008d
            com.amap.api.maps.model.a r1 = new com.amap.api.maps.model.a
            com.amap.api.col.3l.l2 r2 = r12.a
            r4 = r2
            double r2 = r4.f3665e
            r6 = r4
            double r4 = r6.f3663c
            r8 = r6
            double r6 = r8.f3662b
            double r8 = r8.f3666f
            int r10 = r12.f5006b
            int r10 = r10 + 1
            r1.<init>(r2, r4, r6, r8, r10)
            r0.add(r1)
            java.util.List<com.amap.api.maps.model.a> r0 = r12.f5008d
            com.amap.api.maps.model.a r1 = new com.amap.api.maps.model.a
            com.amap.api.col.3l.l2 r2 = r12.a
            r4 = r2
            double r2 = r4.a
            r6 = r4
            double r4 = r6.f3665e
            r8 = r6
            double r6 = r8.f3666f
            double r8 = r8.f3664d
            int r10 = r12.f5006b
            int r10 = r10 + 1
            r1.<init>(r2, r4, r6, r8, r10)
            r0.add(r1)
            java.util.List<com.amap.api.maps.model.a> r0 = r12.f5008d
            com.amap.api.maps.model.a r1 = new com.amap.api.maps.model.a
            com.amap.api.col.3l.l2 r2 = r12.a
            r4 = r2
            double r2 = r4.f3665e
            r6 = r4
            double r4 = r6.f3663c
            r8 = r6
            double r6 = r8.f3666f
            double r8 = r8.f3664d
            int r10 = r12.f5006b
            int r10 = r10 + 1
            r1.<init>(r2, r4, r6, r8, r10)
            r0.add(r1)
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r0 = r12.f5007c
            r1 = 0
            r12.f5007c = r1
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r0.next()
            r7 = r1
            com.amap.api.maps.model.WeightedLatLng r7 = (com.amap.api.maps.model.WeightedLatLng) r7
            com.autonavi.amap.mapcore.DPoint r1 = r7.getPoint()
            double r3 = r1.x
            com.autonavi.amap.mapcore.DPoint r1 = r7.getPoint()
            double r5 = r1.y
            r2 = r12
            r2.a(r3, r5, r7)
            goto L78
        L96:
            return
    }

    private void a(double r9, double r11, com.amap.api.maps.model.WeightedLatLng r13) {
            r8 = this;
            java.util.List<com.amap.api.maps.model.a> r0 = r8.f5008d
            if (r0 == 0) goto L51
            com.amap.api.col.3l.l2 r1 = r8.a
            double r2 = r1.f3666f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto L30
            double r1 = r1.f3665e
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L21
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            com.amap.api.maps.model.a r1 = (com.amap.api.maps.model.a) r1
            r2 = r9
            r4 = r11
            r6 = r13
            r1.a(r2, r4, r6)
            return
        L21:
            r3 = r9
            r5 = r11
            r7 = r13
            r9 = 1
            java.lang.Object r9 = r0.get(r9)
            r2 = r9
            com.amap.api.maps.model.a r2 = (com.amap.api.maps.model.a) r2
            r2.a(r3, r5, r7)
            return
        L30:
            r3 = r9
            r5 = r11
            r7 = r13
            double r9 = r1.f3665e
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 >= 0) goto L45
            r9 = 2
            java.lang.Object r9 = r0.get(r9)
            r2 = r9
            com.amap.api.maps.model.a r2 = (com.amap.api.maps.model.a) r2
            r2.a(r3, r5, r7)
            return
        L45:
            r9 = 3
            java.lang.Object r9 = r0.get(r9)
            r2 = r9
            com.amap.api.maps.model.a r2 = (com.amap.api.maps.model.a) r2
            r2.a(r3, r5, r7)
            return
        L51:
            r7 = r13
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r9 = r8.f5007c
            if (r9 != 0) goto L5d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f5007c = r9
        L5d:
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r9 = r8.f5007c
            r9.add(r7)
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r9 = r8.f5007c
            int r9 = r9.size()
            r10 = 50
            if (r9 <= r10) goto L75
            int r9 = r8.f5006b
            r10 = 40
            if (r9 >= r10) goto L75
            r8.a()
        L75:
            return
    }

    private void a(com.amap.api.col.p0003l.l2 r4, java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r5) {
            r3 = this;
            com.amap.api.col.3l.l2 r0 = r3.a
            boolean r0 = r0.c(r4)
            if (r0 != 0) goto L9
            goto L53
        L9:
            java.util.List<com.amap.api.maps.model.a> r0 = r3.f5008d
            if (r0 == 0) goto L21
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.model.a r1 = (com.amap.api.maps.model.a) r1
            r1.a(r4, r5)
            goto L11
        L21:
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r0 = r3.f5007c
            if (r0 == 0) goto L53
            com.amap.api.col.3l.l2 r0 = r3.a
            boolean r0 = r4.e(r0)
            if (r0 == 0) goto L33
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r4 = r3.f5007c
            r5.addAll(r4)
            return
        L33:
            java.util.List<com.amap.api.maps.model.WeightedLatLng> r0 = r3.f5007c
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.model.WeightedLatLng r1 = (com.amap.api.maps.model.WeightedLatLng) r1
            com.autonavi.amap.mapcore.DPoint r2 = r1.getPoint()
            boolean r2 = r4.d(r2)
            if (r2 == 0) goto L39
            r5.add(r1)
            goto L39
        L53:
            return
    }

    protected final java.util.Collection<com.amap.api.maps.model.WeightedLatLng> a(com.amap.api.col.p0003l.l2 r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a(r2, r0)
            return r0
    }

    protected final void a(com.amap.api.maps.model.WeightedLatLng r9) {
            r8 = this;
            com.autonavi.amap.mapcore.DPoint r0 = r9.getPoint()
            com.amap.api.col.3l.l2 r1 = r8.a
            double r2 = r0.x
            double r4 = r0.y
            boolean r1 = r1.a(r2, r4)
            if (r1 == 0) goto L19
            double r3 = r0.x
            double r5 = r0.y
            r2 = r8
            r7 = r9
            r2.a(r3, r5, r7)
        L19:
            return
    }
}
