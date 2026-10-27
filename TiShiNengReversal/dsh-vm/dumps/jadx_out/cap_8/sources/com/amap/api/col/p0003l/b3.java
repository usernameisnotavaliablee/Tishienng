package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b3 {
    private static com.autonavi.base.amap.mapcore.FPoint[] a;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.List<java.lang.Float> f3008b;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.List<java.lang.Float> f3009c;

    /* renamed from: d, reason: collision with root package name */
    private static int f3010d;

    static {
            com.autonavi.base.amap.mapcore.FPoint r0 = com.autonavi.base.amap.mapcore.FPoint.obtain()
            com.autonavi.base.amap.mapcore.FPoint r1 = com.autonavi.base.amap.mapcore.FPoint.obtain()
            com.autonavi.base.amap.mapcore.FPoint r2 = com.autonavi.base.amap.mapcore.FPoint.obtain()
            com.autonavi.base.amap.mapcore.FPoint r3 = com.autonavi.base.amap.mapcore.FPoint.obtain()
            r4 = 4
            com.autonavi.base.amap.mapcore.FPoint[] r5 = new com.autonavi.base.amap.mapcore.FPoint[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            com.amap.api.col.p0003l.b3.a = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            com.amap.api.col.p0003l.b3.f3008b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            com.amap.api.col.p0003l.b3.f3009c = r0
            com.amap.api.col.p0003l.b3.f3010d = r6
            return
    }

    public b3() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String A(java.lang.String... r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
            r3 = 0
        L8:
            if (r2 >= r1) goto L1e
            r4 = r5[r2]
            r0.append(r4)
            int r4 = r5.length
            int r4 = r4 + (-1)
            if (r3 == r4) goto L19
            java.lang.String r4 = ","
            r0.append(r4)
        L19:
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L8
        L1e:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static void B(android.graphics.Bitmap r0) {
            return
    }

    public static void C(android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L6
            r0 = 0
            r1.setCallback(r0)
        L6:
            return
    }

    public static void D(java.lang.Throwable r1) {
            com.amap.api.maps.ExceptionLogger r0 = com.amap.api.maps.MapsInitializer.getExceptionLogger()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Ld
            com.amap.api.maps.ExceptionLogger r0 = com.amap.api.maps.MapsInitializer.getExceptionLogger()     // Catch: java.lang.Throwable -> Ld
            r0.onException(r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    private static boolean E(double r16, double r18, double r20, double r22, double r24, double r26, double r28) {
            double r0 = r20 - r16
            double r2 = r28 - r26
            double r4 = r0 * r2
            double r6 = r22 - r18
            r8 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r8 = r8 - r24
            double r10 = r6 * r8
            double r4 = r4 - r10
            r10 = 0
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 == 0) goto L3c
            double r12 = r18 - r26
            double r8 = r8 * r12
            double r14 = r16 - r24
            double r2 = r2 * r14
            double r8 = r8 - r2
            double r8 = r8 / r4
            double r12 = r12 * r0
            double r14 = r14 * r6
            double r12 = r12 - r14
            double r12 = r12 / r4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L3c
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L3c
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 < 0) goto L3c
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L3c
            r0 = 1
            return r0
        L3c:
            r0 = 0
            return r0
    }

    public static boolean F(double r3, com.amap.api.maps.model.LatLng r5, com.amap.api.maps.model.CircleHoleOptions r6) {
            r0 = 1
            com.amap.api.maps.model.LatLng r1 = r6.getCenter()     // Catch: java.lang.Throwable -> L16
            float r5 = com.amap.api.maps.AMapUtils.calculateLineDistance(r1, r5)     // Catch: java.lang.Throwable -> L16
            double r1 = (double) r5     // Catch: java.lang.Throwable -> L16
            double r5 = r6.getRadius()     // Catch: java.lang.Throwable -> L16
            double r3 = r3 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L14
            return r0
        L14:
            r3 = 0
            return r3
        L16:
            r3 = move-exception
            java.lang.String r4 = "CircleDelegateImp"
            java.lang.String r5 = "isCircleInCircle"
            com.amap.api.col.p0003l.w5.p(r3, r4, r5)
            return r0
    }

    private static boolean G(double r2, com.amap.api.maps.model.LatLng r4, java.util.List<com.amap.api.maps.model.BaseHoleOptions> r5, com.amap.api.maps.model.LatLng r6) throws android.os.RemoteException {
            r0 = 0
            if (r5 == 0) goto L20
            int r1 = r5.size()
            if (r1 <= 0) goto L20
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r5.next()
            com.amap.api.maps.model.BaseHoleOptions r1 = (com.amap.api.maps.model.BaseHoleOptions) r1
            boolean r1 = K(r1, r6)
            if (r1 == 0) goto Ld
            return r0
        L20:
            float r4 = com.amap.api.maps.AMapUtils.calculateLineDistance(r4, r6)
            double r4 = (double) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L2b
            r2 = 1
            return r2
        L2b:
            return r0
    }

    public static boolean H(double r3, com.amap.api.maps.model.LatLng r5, java.util.List<com.amap.api.maps.model.BaseHoleOptions> r6, com.amap.api.maps.model.PolygonHoleOptions r7) {
            r0 = 1
            java.util.List r7 = r7.getPoints()     // Catch: java.lang.Throwable -> L1c
            r1 = 0
        L6:
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 >= r2) goto L1e
            java.lang.Object r2 = r7.get(r1)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L1c
            boolean r0 = G(r3, r5, r6, r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1b
            int r1 = r1 + 1
            goto L6
        L1b:
            return r0
        L1c:
            r3 = move-exception
            goto L1f
        L1e:
            return r0
        L1f:
            java.lang.String r4 = "CircleDelegateImp"
            java.lang.String r5 = "isPolygonInCircle"
            com.amap.api.col.p0003l.w5.p(r3, r4, r5)
            return r0
    }

    public static boolean I(int r0, int r1) {
            if (r0 <= 0) goto L6
            if (r1 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static boolean J(android.graphics.Rect r0, int r1, int r2) {
            boolean r0 = r0.contains(r1, r2)
            return r0
    }

    public static boolean K(com.amap.api.maps.model.BaseHoleOptions r4, com.amap.api.maps.model.LatLng r5) {
            boolean r0 = r4 instanceof com.amap.api.maps.model.CircleHoleOptions
            r1 = 0
            if (r0 == 0) goto L1e
            com.amap.api.maps.model.CircleHoleOptions r4 = (com.amap.api.maps.model.CircleHoleOptions) r4
            com.amap.api.maps.model.LatLng r0 = r4.getCenter()
            double r2 = r4.getRadius()
            if (r0 != 0) goto L12
            return r1
        L12:
            float r4 = com.amap.api.maps.AMapUtils.calculateLineDistance(r0, r5)
            double r4 = (double) r4
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
        L1e:
            com.amap.api.maps.model.PolygonHoleOptions r4 = (com.amap.api.maps.model.PolygonHoleOptions) r4
            java.util.List r4 = r4.getPoints()
            if (r4 == 0) goto L32
            int r0 = r4.size()
            if (r0 != 0) goto L2d
            goto L32
        L2d:
            boolean r4 = M(r5, r4)
            return r4
        L32:
            return r1
    }

    private static boolean L(com.amap.api.maps.model.CircleHoleOptions r5, com.amap.api.maps.model.CircleHoleOptions r6) {
            r0 = 0
            com.amap.api.maps.model.LatLng r1 = r6.getCenter()     // Catch: java.lang.Throwable -> L1e
            com.amap.api.maps.model.LatLng r2 = r5.getCenter()     // Catch: java.lang.Throwable -> L1e
            float r1 = com.amap.api.maps.AMapUtils.calculateLineDistance(r1, r2)     // Catch: java.lang.Throwable -> L1e
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L1e
            double r3 = r5.getRadius()     // Catch: java.lang.Throwable -> L1e
            double r5 = r6.getRadius()     // Catch: java.lang.Throwable -> L1e
            double r3 = r3 + r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            r5 = 1
            return r5
        L1d:
            return r0
        L1e:
            r5 = move-exception
            java.lang.String r6 = "Util"
            java.lang.String r1 = "isPolygon2CircleIntersect"
            com.amap.api.col.p0003l.w5.p(r5, r6, r1)
            return r0
    }

    public static boolean M(com.amap.api.maps.model.LatLng r28, java.util.List<com.amap.api.maps.model.LatLng> r29) {
            r0 = r28
            r1 = r29
            r2 = 0
            if (r0 == 0) goto Lff
            if (r1 != 0) goto Lb
            goto Lff
        Lb:
            double r7 = r0.longitude
            double r9 = r0.latitude
            int r0 = r1.size()
            r3 = 3
            if (r0 >= r3) goto L17
            return r2
        L17:
            java.lang.Object r0 = r1.get(r2)
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0
            int r3 = r1.size()
            r17 = 1
            int r3 = r3 + (-1)
            java.lang.Object r3 = r1.get(r3)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L39
            java.lang.Object r0 = r1.get(r2)
            r1.add(r0)
            r18 = 1
            goto L3b
        L39:
            r18 = 0
        L3b:
            r0 = 0
            r19 = 0
        L3e:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Le0
            int r3 = r3 + (-1)
            if (r0 >= r3) goto Le2
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> Le0
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> Le0
            double r3 = r3.longitude     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r5 = r1.get(r0)     // Catch: java.lang.Throwable -> Le0
            com.amap.api.maps.model.LatLng r5 = (com.amap.api.maps.model.LatLng) r5     // Catch: java.lang.Throwable -> Le0
            double r5 = r5.latitude     // Catch: java.lang.Throwable -> Le0
            int r0 = r0 + 1
            java.lang.Object r11 = r1.get(r0)     // Catch: java.lang.Throwable -> Le0
            com.amap.api.maps.model.LatLng r11 = (com.amap.api.maps.model.LatLng) r11     // Catch: java.lang.Throwable -> Le0
            double r11 = r11.longitude     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r13 = r1.get(r0)     // Catch: java.lang.Throwable -> Le0
            com.amap.api.maps.model.LatLng r13 = (com.amap.api.maps.model.LatLng) r13     // Catch: java.lang.Throwable -> Le0
            double r13 = r13.latitude     // Catch: java.lang.Throwable -> Le0
            r26 = r7
            r7 = r3
            r3 = r26
            r26 = r9
            r9 = r5
            r5 = r26
            boolean r15 = Z(r3, r5, r7, r9, r11, r13)     // Catch: java.lang.Throwable -> Le0
            r20 = r7
            r7 = r3
            r3 = r20
            r20 = r9
            r9 = r5
            r5 = r20
            r20 = r11
            r22 = r13
            if (r15 == 0) goto L92
            if (r18 == 0) goto L91
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1.remove(r0)
        L91:
            return r17
        L92:
            double r13 = r22 - r5
            double r11 = java.lang.Math.abs(r13)     // Catch: java.lang.Throwable -> Le0
            r13 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L3e
            r11 = 4640537203540230144(0x4066800000000000, double:180.0)
            r13 = r9
            boolean r11 = Z(r3, r5, r7, r9, r11, r13)     // Catch: java.lang.Throwable -> Le0
            r15 = r3
            r24 = r5
            if (r11 == 0) goto Lb7
            int r3 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r3 <= 0) goto L3e
        Lb4:
            int r19 = r19 + 1
            goto L3e
        Lb7:
            r11 = 4640537203540230144(0x4066800000000000, double:180.0)
            r13 = r9
            r3 = r20
            r5 = r22
            boolean r11 = Z(r3, r5, r7, r9, r11, r13)     // Catch: java.lang.Throwable -> Le0
            if (r11 == 0) goto Lcc
            int r3 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r3 <= 0) goto L3e
            goto Lb4
        Lcc:
            r20 = r3
            r3 = r15
            r15 = r9
            r11 = r7
            r13 = r9
            r7 = r20
            r9 = r5
            r5 = r24
            boolean r3 = E(r3, r5, r7, r9, r11, r13, r15)     // Catch: java.lang.Throwable -> Le0
            r7 = r11
            r9 = r13
            if (r3 == 0) goto L3e
            goto Lb4
        Le0:
            r0 = move-exception
            goto Lf3
        Le2:
            int r19 = r19 % 2
            if (r19 == 0) goto Le7
            r2 = 1
        Le7:
            if (r18 == 0) goto Lf2
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1.remove(r0)
        Lf2:
            return r2
        Lf3:
            if (r18 == 0) goto Lfe
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
        Lfe:
            throw r0
        Lff:
            return r2
    }

    public static boolean N(java.util.List<com.amap.api.maps.model.BaseHoleOptions> r5, com.amap.api.maps.model.CircleHoleOptions r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L30
            java.lang.Object r2 = r5.get(r0)
            com.amap.api.maps.model.BaseHoleOptions r2 = (com.amap.api.maps.model.BaseHoleOptions) r2
            boolean r3 = r2 instanceof com.amap.api.maps.model.PolygonHoleOptions
            r4 = 1
            if (r3 == 0) goto L20
            com.amap.api.maps.model.PolygonHoleOptions r2 = (com.amap.api.maps.model.PolygonHoleOptions) r2
            java.util.List r1 = r2.getPoints()
            boolean r1 = a0(r1, r6)
            if (r1 == 0) goto L2d
            return r4
        L20:
            boolean r3 = r2 instanceof com.amap.api.maps.model.CircleHoleOptions
            if (r3 == 0) goto L2d
            com.amap.api.maps.model.CircleHoleOptions r2 = (com.amap.api.maps.model.CircleHoleOptions) r2
            boolean r1 = L(r6, r2)
            if (r1 == 0) goto L2d
            return r4
        L2d:
            int r0 = r0 + 1
            goto L2
        L30:
            return r1
    }

    public static boolean O(java.util.List<com.amap.api.maps.model.BaseHoleOptions> r5, com.amap.api.maps.model.PolygonHoleOptions r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L38
            java.lang.Object r2 = r5.get(r0)
            com.amap.api.maps.model.BaseHoleOptions r2 = (com.amap.api.maps.model.BaseHoleOptions) r2
            boolean r3 = r2 instanceof com.amap.api.maps.model.PolygonHoleOptions
            r4 = 1
            if (r3 == 0) goto L24
            com.amap.api.maps.model.PolygonHoleOptions r2 = (com.amap.api.maps.model.PolygonHoleOptions) r2
            java.util.List r1 = r2.getPoints()
            java.util.List r2 = r6.getPoints()
            boolean r1 = P(r1, r2)
            if (r1 == 0) goto L35
            return r4
        L24:
            boolean r3 = r2 instanceof com.amap.api.maps.model.CircleHoleOptions
            if (r3 == 0) goto L35
            com.amap.api.maps.model.CircleHoleOptions r2 = (com.amap.api.maps.model.CircleHoleOptions) r2
            java.util.List r1 = r6.getPoints()
            boolean r1 = a0(r1, r2)
            if (r1 == 0) goto L35
            return r4
        L35:
            int r0 = r0 + 1
            goto L2
        L38:
            return r1
    }

    private static boolean P(java.util.List<com.amap.api.maps.model.LatLng> r4, java.util.List<com.amap.api.maps.model.LatLng> r5) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L19
            r3 = 1
            if (r1 >= r2) goto L1b
            java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L19
            boolean r2 = M(r2, r4)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L16
            return r3
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            r4 = move-exception
            goto L37
        L1b:
            r1 = 0
        L1c:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L19
            if (r1 >= r2) goto L32
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L19
            boolean r2 = M(r2, r5)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L2f
            return r3
        L2f:
            int r1 = r1 + 1
            goto L1c
        L32:
            boolean r4 = c0(r4, r5)     // Catch: java.lang.Throwable -> L19
            return r4
        L37:
            java.lang.String r5 = "Util"
            java.lang.String r1 = "isPolygon2PolygonIntersect"
            com.amap.api.col.p0003l.w5.p(r4, r5, r1)
            return r0
    }

    public static boolean Q(java.util.List<com.amap.api.maps.model.LatLng> r1, java.util.List<com.amap.api.maps.model.BaseHoleOptions> r2, com.amap.api.maps.model.CircleHoleOptions r3) {
            boolean r0 = a0(r1, r3)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L1a
            com.amap.api.maps.model.LatLng r3 = r3.getCenter()     // Catch: java.lang.Throwable -> L12
            boolean r1 = R(r1, r2, r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L1a
            r1 = 1
            return r1
        L12:
            r1 = move-exception
            java.lang.String r2 = "PolygonDelegateImp"
            java.lang.String r3 = "isCircleInPolygon"
            com.amap.api.col.p0003l.w5.p(r1, r2, r3)
        L1a:
            r1 = 0
            return r1
    }

    private static boolean R(java.util.List<com.amap.api.maps.model.LatLng> r2, java.util.List<com.amap.api.maps.model.BaseHoleOptions> r3, com.amap.api.maps.model.LatLng r4) throws android.os.RemoteException {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            if (r3 == 0) goto L25
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L23
            if (r1 <= 0) goto L25
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L23
        L10:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L23
            com.amap.api.maps.model.BaseHoleOptions r1 = (com.amap.api.maps.model.BaseHoleOptions) r1     // Catch: java.lang.Throwable -> L23
            boolean r1 = K(r1, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L10
            return r0
        L23:
            r2 = move-exception
            goto L2a
        L25:
            boolean r2 = M(r4, r2)     // Catch: java.lang.Throwable -> L23
            return r2
        L2a:
            java.lang.String r3 = "PolygonDelegateImp"
            java.lang.String r4 = "contains"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
            return r0
    }

    public static byte[] S(byte[] r1, int r2) {
            r0 = 1
            byte[] r1 = T(r1, r2, r2, r0)
            return r1
    }

    public static byte[] T(byte[] r7, int r8, int r9, boolean r10) {
            int r0 = r7.length     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r7, r1, r0)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap$Config r2 = r0.getConfig()     // Catch: java.lang.Throwable -> L3f
            r3 = 1
            android.graphics.Bitmap r2 = r0.copy(r2, r3)     // Catch: java.lang.Throwable -> L3f
            int r3 = r0.getWidth()     // Catch: java.lang.Throwable -> L3f
            int r4 = r0.getHeight()     // Catch: java.lang.Throwable -> L3f
            r5 = 0
        L18:
            if (r5 >= r3) goto L31
            r6 = 0
        L1b:
            if (r6 >= r4) goto L2e
            if (r5 == 0) goto L26
            if (r6 != 0) goto L22
            goto L26
        L22:
            r2.setPixel(r5, r6, r8)     // Catch: java.lang.Throwable -> L3f
            goto L2b
        L26:
            if (r10 != 0) goto L2b
            r2.setPixel(r5, r6, r9)     // Catch: java.lang.Throwable -> L3f
        L2b:
            int r6 = r6 + 1
            goto L1b
        L2e:
            int r5 = r5 + 1
            goto L18
        L31:
            byte[] r8 = d0(r2)     // Catch: java.lang.Throwable -> L3f
            if (r8 != 0) goto L38
            r8 = r7
        L38:
            B(r2)     // Catch: java.lang.Throwable -> L3f
            B(r0)     // Catch: java.lang.Throwable -> L3f
            return r8
        L3f:
            return r7
    }

    public static synchronized int[] U(int r8, int r9, int r10, int r11, com.autonavi.amap.mapcore.interfaces.IMapConfig r12, com.autonavi.amap.api.mapcore.IGLMapState r13, int r14, int r15) {
            java.lang.Class<com.amap.api.col.3l.b3> r0 = com.amap.api.col.p0003l.b3.class
            monitor-enter(r0)
            int r1 = r12.getMapWidth()     // Catch: java.lang.Throwable -> L6b
            int r2 = r12.getMapHeight()     // Catch: java.lang.Throwable -> L6b
            int r3 = r12.getAnchorX()     // Catch: java.lang.Throwable -> L6b
            int r4 = r12.getAnchorY()     // Catch: java.lang.Throwable -> L6b
            float r5 = r12.getMapZoomScale()     // Catch: java.lang.Throwable -> L6b
            float r6 = r13.getMapZoomer()     // Catch: java.lang.Throwable -> L6b
            float r7 = (float) r3     // Catch: java.lang.Throwable -> L6b
            float r5 = d(r5, r6, r7)     // Catch: java.lang.Throwable -> L6b
            float r6 = r12.getMapZoomScale()     // Catch: java.lang.Throwable -> L6b
            float r7 = r13.getMapZoomer()     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 - r3
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L6b
            float r1 = d(r6, r7, r1)     // Catch: java.lang.Throwable -> L6b
            float r3 = r12.getMapZoomScale()     // Catch: java.lang.Throwable -> L6b
            float r6 = r13.getMapZoomer()     // Catch: java.lang.Throwable -> L6b
            float r7 = (float) r4     // Catch: java.lang.Throwable -> L6b
            float r3 = d(r3, r6, r7)     // Catch: java.lang.Throwable -> L6b
            float r12 = r12.getMapZoomScale()     // Catch: java.lang.Throwable -> L6b
            float r13 = r13.getMapZoomer()     // Catch: java.lang.Throwable -> L6b
            int r2 = r2 - r4
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6b
            float r12 = d(r12, r13, r2)     // Catch: java.lang.Throwable -> L6b
            float r10 = (float) r10     // Catch: java.lang.Throwable -> L6b
            float r10 = r10 + r5
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L6b
            float r8 = r8 - r1
            float r9 = (float) r9     // Catch: java.lang.Throwable -> L6b
            float r9 = r9 + r3
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L6b
            float r11 = r11 - r12
            float r12 = (float) r14     // Catch: java.lang.Throwable -> L6b
            float r8 = java.lang.Math.min(r12, r8)     // Catch: java.lang.Throwable -> L6b
            float r8 = java.lang.Math.max(r10, r8)     // Catch: java.lang.Throwable -> L6b
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L6b
            float r10 = (float) r15     // Catch: java.lang.Throwable -> L6b
            float r10 = java.lang.Math.min(r10, r11)     // Catch: java.lang.Throwable -> L6b
            float r9 = java.lang.Math.max(r9, r10)     // Catch: java.lang.Throwable -> L6b
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L6b
            int[] r8 = new int[]{r8, r9}     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)
            return r8
        L6b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r8
    }

    public static synchronized int V() {
            java.lang.Class<com.amap.api.col.3l.b3> r0 = com.amap.api.col.p0003l.b3.class
            monitor-enter(r0)
            int r1 = com.amap.api.col.p0003l.b3.f3010d     // Catch: java.lang.Throwable -> L12
            int r1 = r1 + 1
            com.amap.api.col.p0003l.b3.f3010d = r1     // Catch: java.lang.Throwable -> L12
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L14
            r1 = 0
            com.amap.api.col.p0003l.b3.f3010d = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L18
        L14:
            int r1 = com.amap.api.col.p0003l.b3.f3010d     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    private static android.util.Pair<java.lang.Float, java.lang.Boolean> W(com.autonavi.amap.mapcore.interfaces.IMapConfig r6, int r7, int r8, int r9, int r10, int r11, int r12) {
            r6.getSZ()
            r0 = 1
            if (r7 != r9) goto Ld
            if (r8 != r10) goto Ld
            float r6 = r6.getMaxZoomLevel()
            goto L47
        Ld:
            float r1 = r6.getMapZoomScale()
            double r2 = (double) r12
            int r10 = r10 - r8
            int r8 = java.lang.Math.abs(r10)
            double r4 = (double) r8
            double r1 = b(r1, r2, r4)
            float r8 = (float) r1
            float r10 = r6.getMapZoomScale()
            double r11 = (double) r11
            int r9 = r9 - r7
            int r7 = java.lang.Math.abs(r9)
            double r1 = (double) r7
            double r9 = b(r10, r11, r1)
            float r7 = (float) r9
            float r8 = java.lang.Math.min(r7, r8)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L36
            goto L37
        L36:
            r0 = 0
        L37:
            float r7 = r6.getMaxZoomLevel()
            float r6 = r6.getMinZoomLevel()
            float r6 = java.lang.Math.max(r6, r8)
            float r6 = java.lang.Math.min(r7, r6)
        L47:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r7.<init>(r6, r8)
            return r7
    }

    public static java.lang.String X(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.autonavi.base.amap.mapcore.FileUtil.getMapBaseStorage(r2)
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r1 = "data"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String Y(android.view.View r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 == 0) goto L46
            boolean r1 = r5 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2 = r5
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Throwable -> L46
            java.lang.CharSequence r2 = r2.getText()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L46
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L46
            r0 = r1
        L1c:
            boolean r1 = r5 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L46
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L46
            int r1 = r1.getChildCount()     // Catch: java.lang.Throwable -> L46
            r2 = 0
        L28:
            if (r2 >= r1) goto L46
            r3 = r5
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Throwable -> L46
            android.view.View r3 = r3.getChildAt(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = Y(r3)     // Catch: java.lang.Throwable -> L46
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L43
            java.lang.String r4 = "--"
            r0.append(r4)     // Catch: java.lang.Throwable -> L46
            r0.append(r3)     // Catch: java.lang.Throwable -> L46
        L43:
            int r2 = r2 + 1
            goto L28
        L46:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private static boolean Z(double r5, double r7, double r9, double r11, double r13, double r15) {
            double r0 = a(r5, r7, r9, r11, r13, r15)
            double r0 = java.lang.Math.abs(r0)
            r2 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L27
            double r9 = r5 - r9
            double r5 = r5 - r13
            double r9 = r9 * r5
            r5 = 0
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 > 0) goto L27
            double r9 = r7 - r11
            double r7 = r7 - r15
            double r9 = r9 * r7
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L27
            r5 = 1
            return r5
        L27:
            r5 = 0
            return r5
    }

    private static double a(double r0, double r2, double r4, double r6, double r8, double r10) {
            double r4 = r4 - r0
            double r10 = r10 - r2
            double r4 = r4 * r10
            double r8 = r8 - r0
            double r6 = r6 - r2
            double r8 = r8 * r6
            double r4 = r4 - r8
            return r4
    }

    private static boolean a0(java.util.List<com.amap.api.maps.model.LatLng> r10, com.amap.api.maps.model.CircleHoleOptions r11) {
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            r2 = 0
        L7:
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L17
            if (r2 >= r3) goto L1a
            java.lang.Object r3 = r10.get(r2)     // Catch: java.lang.Throwable -> L17
            r1.add(r3)     // Catch: java.lang.Throwable -> L17
            int r2 = r2 + 1
            goto L7
        L17:
            r10 = move-exception
            goto L97
        L1a:
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Throwable -> L17
            r1.add(r10)     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            r10.<init>()     // Catch: java.lang.Throwable -> L17
            r2 = 0
        L27:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L17
            if (r2 >= r3) goto L9e
            int r3 = r2 + 1
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L17
            if (r3 >= r4) goto L9e
            double r4 = r11.getRadius()     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r6 = r11.getCenter()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = r1.get(r2)     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r7 = (com.amap.api.maps.model.LatLng) r7     // Catch: java.lang.Throwable -> L17
            float r6 = com.amap.api.maps.AMapUtils.calculateLineDistance(r6, r7)     // Catch: java.lang.Throwable -> L17
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L17
            r8 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L96
            double r4 = r11.getRadius()     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r6 = r11.getCenter()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = r1.get(r3)     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r7 = (com.amap.api.maps.model.LatLng) r7     // Catch: java.lang.Throwable -> L17
            float r6 = com.amap.api.maps.AMapUtils.calculateLineDistance(r6, r7)     // Catch: java.lang.Throwable -> L17
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L17
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L65
            goto L96
        L65:
            r10.clear()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L17
            r10.add(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L17
            r10.add(r2)     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r2 = r11.getCenter()     // Catch: java.lang.Throwable -> L17
            android.util.Pair r2 = com.amap.api.maps.utils.SpatialRelationUtil.calShortestDistancePoint(r10, r2)     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r4 = r11.getCenter()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L17
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r4, r2)     // Catch: java.lang.Throwable -> L17
            double r4 = r11.getRadius()     // Catch: java.lang.Throwable -> L17
            double r6 = (double) r2
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L94
            return r8
        L94:
            r2 = r3
            goto L27
        L96:
            return r8
        L97:
            java.lang.String r11 = "Util"
            java.lang.String r1 = "isPolygon2CircleIntersect"
            com.amap.api.col.p0003l.w5.p(r10, r11, r1)
        L9e:
            return r0
    }

    private static double b(float r2, double r3, double r5) {
            double r0 = (double) r2
            double r3 = r3 * r0
            double r5 = r5 / r3
            double r2 = java.lang.Math.log(r5)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.log(r4)
            double r2 = r2 / r4
            r4 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r4 = r4 - r2
            return r4
    }

    public static boolean b0(java.util.List<com.amap.api.maps.model.LatLng> r3, com.amap.api.maps.model.PolygonHoleOptions r4) {
            r0 = 0
            if (r3 == 0) goto L2d
            if (r4 != 0) goto L6
            goto L2d
        L6:
            java.util.List r4 = r4.getPoints()     // Catch: java.lang.Throwable -> L25
            r1 = 0
        Lb:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L21
            if (r0 >= r2) goto L24
            java.lang.Object r2 = r4.get(r0)     // Catch: java.lang.Throwable -> L21
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L21
            boolean r1 = M(r2, r3)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L20
            int r0 = r0 + 1
            goto Lb
        L20:
            return r1
        L21:
            r3 = move-exception
            r0 = r1
            goto L26
        L24:
            return r1
        L25:
            r3 = move-exception
        L26:
            java.lang.String r4 = "PolygonDelegateImp"
            java.lang.String r1 = "isPolygonInPolygon"
            com.amap.api.col.p0003l.w5.p(r3, r4, r1)
        L2d:
            return r0
    }

    private static float c(float r4, float r5, double r6) {
            r0 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 - r5
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = (double) r4
            double r0 = r0 * r4
            double r6 = r6 / r0
            float r4 = (float) r6
            return r4
    }

    private static boolean c0(java.util.List<com.amap.api.maps.model.LatLng> r8, java.util.List<com.amap.api.maps.model.LatLng> r9) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L40
            if (r1 >= r2) goto L4b
            int r2 = r1 + 1
            int r3 = r8.size()     // Catch: java.lang.Throwable -> L40
            if (r2 >= r3) goto L4b
            r3 = 0
        L11:
            int r4 = r9.size()     // Catch: java.lang.Throwable -> L40
            if (r3 >= r4) goto L42
            int r4 = r3 + 1
            int r5 = r9.size()     // Catch: java.lang.Throwable -> L40
            if (r4 >= r5) goto L42
            java.lang.Object r5 = r8.get(r1)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLng r5 = (com.amap.api.maps.model.LatLng) r5     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r8.get(r2)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLng r6 = (com.amap.api.maps.model.LatLng) r6     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r9.get(r3)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r9.get(r4)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLng r7 = (com.amap.api.maps.model.LatLng) r7     // Catch: java.lang.Throwable -> L40
            boolean r3 = com.amap.api.col.p0003l.w2.b(r5, r6, r3, r7)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L3e
            return r3
        L3e:
            r3 = r4
            goto L11
        L40:
            r8 = move-exception
            goto L44
        L42:
            r1 = r2
            goto L2
        L44:
            java.lang.String r9 = "Util"
            java.lang.String r1 = "isSegmentsIntersect"
            com.amap.api.col.p0003l.w5.p(r8, r9, r1)
        L4b:
            return r0
    }

    private static float d(float r4, float r5, float r6) {
            double r0 = (double) r6
            r6 = 1101004800(0x41a00000, float:20.0)
            float r6 = r6 - r5
            double r5 = (double) r6
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r2, r5)
            double r0 = r0 * r5
            double r4 = (double) r4
            double r0 = r0 * r4
            float r4 = (float) r0
            return r4
    }

    private static byte[] d0(android.graphics.Bitmap r4) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L15
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L15
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L15
            r1.close()     // Catch: java.lang.Throwable -> L14
        L14:
            return r4
        L15:
            goto L19
        L17:
            r1 = r0
        L19:
            if (r1 == 0) goto L1e
            r1.close()     // Catch: java.lang.Throwable -> L1e
        L1e:
            return r0
    }

    public static float e(com.autonavi.amap.api.mapcore.IGLMapState r6, int r7, int r8, double r9, double r11, int r13) {
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain()
            r4 = 20
            r0 = r9
            r2 = r11
            com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r0, r2, r4, r5)
            int r9 = r5.x
            int r10 = r5.y
            r11 = r13
            float r6 = f(r6, r7, r8, r9, r10, r11)
            r5.recycle()
            return r6
    }

    private static byte[] e0(java.io.InputStream r6) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r1]
        L9:
            r3 = 0
            int r4 = r6.read(r2, r3, r1)
            r5 = -1
            if (r4 == r5) goto L15
            r0.write(r2, r3, r4)
            goto L9
        L15:
            byte[] r6 = r0.toByteArray()
            return r6
    }

    private static float f(com.autonavi.amap.api.mapcore.IGLMapState r0, int r1, int r2, int r3, int r4, int r5) {
            if (r0 == 0) goto L7
            float r0 = r0.calculateMapZoomer(r1, r2, r3, r4, r5)
            return r0
        L7:
            r0 = 1077936128(0x40400000, float:3.0)
            return r0
    }

    public static java.lang.String f0(android.content.Context r2) {
            java.lang.String r2 = v(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "VMAP2"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L18
            r0.mkdir()
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = java.io.File.separator
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static float g(com.autonavi.amap.mapcore.DPoint r6, com.autonavi.amap.mapcore.DPoint r7) {
            if (r6 == 0) goto L22
            if (r7 != 0) goto L5
            goto L22
        L5:
            double r0 = r6.x
            double r2 = r7.x
            double r4 = r6.y
            double r6 = r7.y
            double r6 = r6 - r4
            double r2 = r2 - r0
            double r6 = java.lang.Math.atan2(r6, r2)
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r0
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r0
            float r6 = (float) r6
            return r6
        L22:
            r6 = 0
            return r6
    }

    private static void g0(android.view.View r3) {
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L18
        L5:
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            if (r1 >= r2) goto L21
            android.view.View r0 = r0.getChildAt(r1)
            g0(r0)
            int r1 = r1 + 1
            goto L5
        L18:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L21
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setHorizontallyScrolling(r1)
        L21:
            return
    }

    public static float h(com.autonavi.amap.mapcore.interfaces.IMapConfig r1, float r2) {
            if (r1 == 0) goto L1c
            float r0 = r1.getMaxZoomLevel()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            float r1 = r1.getMaxZoomLevel()
            return r1
        Lf:
            float r0 = r1.getMinZoomLevel()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2a
            float r1 = r1.getMinZoomLevel()
            return r1
        L1c:
            r1 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L23
            return r1
        L23:
            r1 = 1077936128(0x40400000, float:3.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2a
            return r1
        L2a:
            return r2
    }

    public static boolean h0(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto Lf
            return r0
        Lf:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 != 0) goto L16
            return r0
        L16:
            android.net.NetworkInfo$State r2 = r2.getState()
            if (r2 == 0) goto L27
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.DISCONNECTED
            if (r2 == r1) goto L27
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.DISCONNECTING
            if (r2 != r1) goto L25
            goto L27
        L25:
            r2 = 1
            return r2
        L27:
            return r0
    }

    public static float i(com.autonavi.amap.mapcore.interfaces.IMapConfig r5, float r6, float r7) {
            r0 = 0
            if (r5 == 0) goto L13
            boolean r1 = r5.isAbroadEnable()
            int r2 = r5.getAbroadState()
            r3 = 1
            if (r2 == r3) goto Lf
            r0 = 1
        Lf:
            r4 = r1
            r1 = r0
            r0 = r4
            goto L14
        L13:
            r1 = 0
        L14:
            r2 = 0
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1a
            goto L1b
        L1a:
            r2 = r6
        L1b:
            r3 = 1109393408(0x42200000, float:40.0)
            if (r0 == 0) goto L26
            if (r1 == 0) goto L26
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6a
            return r3
        L26:
            if (r5 == 0) goto L35
            boolean r5 = r5.isTerrainEnable()
            if (r5 == 0) goto L35
            r5 = 1117782016(0x42a00000, float:80.0)
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L6a
            return r5
        L35:
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6a
            r5 = 1097859072(0x41700000, float:15.0)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L42
            r5 = 40
            goto L64
        L42:
            r5 = 1098907648(0x41800000, float:16.0)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L4b
            r5 = 56
            goto L64
        L4b:
            r5 = 1099431936(0x41880000, float:17.0)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L54
            r5 = 66
            goto L64
        L54:
            r5 = 1099956224(0x41900000, float:18.0)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L5d
            r5 = 74
            goto L64
        L5d:
            if (r5 > 0) goto L62
            r5 = 78
            goto L64
        L62:
            r5 = 80
        L64:
            float r5 = (float) r5
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L6a
            return r5
        L6a:
            return r2
    }

    public static boolean i0(android.content.Context r1) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = X(r1)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L11
            r1 = 1
            return r1
        L11:
            boolean r1 = com.autonavi.base.amap.mapcore.FileUtil.deleteFile(r0)
            return r1
    }

    public static float j(com.autonavi.amap.mapcore.interfaces.IMapConfig r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            float r0 = r5.getSZ()
            if (r6 == r8) goto L2d
            if (r7 == r9) goto L2d
            float r0 = r5.getMapZoomScale()
            double r1 = (double) r11
            int r9 = r9 - r7
            int r7 = java.lang.Math.abs(r9)
            double r3 = (double) r7
            double r0 = b(r0, r1, r3)
            float r7 = (float) r0
            float r5 = r5.getMapZoomScale()
            double r9 = (double) r10
            int r8 = r8 - r6
            int r6 = java.lang.Math.abs(r8)
            double r0 = (double) r6
            double r5 = b(r5, r9, r0)
            float r5 = (float) r5
            float r5 = java.lang.Math.max(r5, r7)
            return r5
        L2d:
            return r0
    }

    public static int k(java.lang.Object[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public static android.graphics.Bitmap l(android.content.Context r1, java.lang.String r2) {
            android.content.res.AssetManager r1 = com.amap.api.col.p0003l.v2.b(r1)     // Catch: java.lang.Throwable -> L10
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Throwable -> L10
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L10
            r1.close()     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r1 = move-exception
            java.lang.String r2 = "Util"
            java.lang.String r0 = "fromAsset"
            com.amap.api.col.p0003l.w5.p(r1, r2, r0)
            D(r1)
            r1 = 0
            return r1
    }

    public static android.graphics.Bitmap m(android.graphics.Bitmap r2, float r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            int r1 = r2.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r3
            int r3 = (int) r1
            r1 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r2, r0, r3, r1)
            return r2
    }

    public static android.graphics.Bitmap n(android.view.View r4) {
            r0 = 0
            g0(r4)     // Catch: java.lang.Throwable -> L2b
            r4.destroyDrawingCache()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)     // Catch: java.lang.Throwable -> L2b
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)     // Catch: java.lang.Throwable -> L2b
            r4.measure(r2, r3)     // Catch: java.lang.Throwable -> L2b
            int r2 = r4.getMeasuredWidth()     // Catch: java.lang.Throwable -> L2b
            int r3 = r4.getMeasuredHeight()     // Catch: java.lang.Throwable -> L2b
            r4.layout(r1, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            android.graphics.Bitmap r4 = r4.getDrawingCache()     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2d
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L2b
            android.graphics.Bitmap r4 = r4.copy(r2, r1)     // Catch: java.lang.Throwable -> L2b
            return r4
        L2b:
            r4 = move-exception
            goto L2e
        L2d:
            return r0
        L2e:
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "getBitmapFromView"
            com.amap.api.col.p0003l.w5.p(r4, r1, r2)
            return r0
    }

    public static android.graphics.Bitmap o(int[] r1, int r2, int r3) {
            r0 = 0
            android.graphics.Bitmap r1 = p(r1, r2, r3, r0)
            return r1
    }

    public static android.graphics.Bitmap p(int[] r9, int r10, int r11, boolean r12) {
            int r0 = r9.length     // Catch: java.lang.Throwable -> L42
            int[] r2 = new int[r0]     // Catch: java.lang.Throwable -> L42
            r0 = 0
            r1 = 0
        L5:
            if (r1 >= r11) goto L32
            r3 = 0
        L8:
            if (r3 >= r10) goto L2f
            int r4 = r1 * r10
            int r4 = r4 + r3
            r5 = r9[r4]     // Catch: java.lang.Throwable -> L42
            int r6 = r5 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r5 << 16
            r8 = 16711680(0xff0000, float:2.3418052E-38)
            r7 = r7 & r8
            r8 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r5 = r5 & r8
            r5 = r5 | r7
            r5 = r5 | r6
            if (r12 == 0) goto L2a
            int r4 = r11 - r1
            int r4 = r4 + (-1)
            int r4 = r4 * r10
            int r4 = r4 + r3
            r2[r4] = r5     // Catch: java.lang.Throwable -> L42
            goto L2c
        L2a:
            r2[r4] = r5     // Catch: java.lang.Throwable -> L42
        L2c:
            int r3 = r3 + 1
            goto L8
        L2f:
            int r1 = r1 + 1
            goto L5
        L32:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L42
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r10, r11, r9)     // Catch: java.lang.Throwable -> L42
            r5 = 0
            r6 = 0
            r3 = 0
            r7 = r10
            r4 = r10
            r8 = r11
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L42
            return r1
        L42:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = "Util"
            java.lang.String r11 = "rgbaToArgb"
            com.amap.api.col.p0003l.w5.p(r9, r10, r11)
            r9 = 0
            return r9
    }

    public static android.util.Pair<java.lang.Float, com.autonavi.amap.mapcore.IPoint> q(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r8, com.autonavi.amap.mapcore.interfaces.IMapConfig r9) {
            com.amap.api.maps.model.LatLngBounds r5 = r8.bounds
            int r6 = r8.width
            int r7 = r8.height
            int r0 = r8.paddingLeft
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r8.paddingRight
            int r2 = java.lang.Math.max(r2, r1)
            int r3 = r8.paddingTop
            int r3 = java.lang.Math.max(r3, r1)
            int r8 = r8.paddingBottom
            int r4 = java.lang.Math.max(r8, r1)
            r1 = r0
            r0 = r9
            android.util.Pair r8 = r(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static android.util.Pair<java.lang.Float, com.autonavi.amap.mapcore.IPoint> r(com.autonavi.amap.mapcore.interfaces.IMapConfig r12, int r13, int r14, int r15, int r16, com.amap.api.maps.model.LatLngBounds r17, int r18, int r19) {
            r0 = r17
            r1 = 0
            if (r0 == 0) goto L100
            com.amap.api.maps.model.LatLng r2 = r0.northeast
            if (r2 == 0) goto L100
            com.amap.api.maps.model.LatLng r3 = r0.southwest
            if (r3 != 0) goto Lf
            goto L100
        Lf:
            if (r12 != 0) goto L12
            return r1
        L12:
            double r3 = r2.latitude
            double r5 = r2.longitude
            r2 = 20
            android.graphics.Point r3 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r3, r5, r2)
            com.amap.api.maps.model.LatLng r0 = r0.southwest
            double r4 = r0.latitude
            double r6 = r0.longitude
            android.graphics.Point r0 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r4, r6, r2)
            int r5 = r3.x
            int r7 = r0.x
            int r2 = r5 - r7
            int r8 = r0.y
            int r6 = r3.y
            int r4 = r8 - r6
            int r9 = r13 + r14
            int r9 = r18 - r9
            int r10 = r15 + r16
            int r10 = r19 - r10
            if (r2 >= 0) goto L3f
            if (r4 >= 0) goto L3f
            return r1
        L3f:
            r1 = 1
            if (r2 > 0) goto L43
            r2 = 1
        L43:
            if (r4 > 0) goto L47
            r11 = 1
            goto L48
        L47:
            r11 = r4
        L48:
            if (r9 > 0) goto L4b
            r9 = 1
        L4b:
            if (r10 > 0) goto L4e
            r10 = 1
        L4e:
            r4 = r12
            android.util.Pair r5 = W(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r4 = r5.first
            java.lang.Float r4 = (java.lang.Float) r4
            float r6 = r4.floatValue()
            java.lang.Object r5 = r5.second
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            float r7 = r12.getMapZoomScale()
            double r8 = (double) r2
            float r7 = c(r7, r6, r8)
            float r8 = r12.getMapZoomScale()
            double r9 = (double) r11
            float r8 = c(r8, r6, r9)
            float r9 = r12.getMaxZoomLevel()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L9d
            int r0 = r0.x
            float r0 = (float) r0
            int r14 = r14 - r13
            float r13 = (float) r14
            float r13 = r13 + r7
            float r14 = (float) r2
            float r13 = r13 * r14
            float r7 = r7 * r10
            float r13 = r13 / r7
            float r0 = r0 + r13
            int r13 = (int) r0
            int r14 = r3.y
        L8f:
            float r14 = (float) r14
            int r15 = r16 - r15
            float r15 = (float) r15
            float r15 = r15 + r8
            float r0 = (float) r11
            float r15 = r15 * r0
            float r8 = r8 * r10
            float r15 = r15 / r8
        L9a:
            float r14 = r14 + r15
            int r14 = (int) r14
            goto Lc9
        L9d:
            if (r5 == 0) goto Laf
            int r14 = r0.x
            float r14 = (float) r14
            int r0 = r18 / 2
            int r0 = r0 - r13
            float r13 = (float) r0
            float r13 = r13 / r7
            float r0 = (float) r2
            float r13 = r13 * r0
            float r14 = r14 + r13
            int r13 = (int) r14
            int r14 = r3.y
            goto L8f
        Laf:
            int r0 = r0.x
            float r0 = (float) r0
            int r14 = r14 - r13
            float r13 = (float) r14
            float r13 = r13 + r7
            float r14 = (float) r2
            float r13 = r13 * r14
            float r7 = r7 * r10
            float r13 = r13 / r7
            float r0 = r0 + r13
            int r13 = (int) r0
            int r14 = r3.y
            float r14 = (float) r14
            int r0 = r19 / 2
            int r0 = r0 - r15
            float r15 = (float) r0
            float r15 = r15 / r8
            float r0 = (float) r11
            float r15 = r15 * r0
            goto L9a
        Lc9:
            int r15 = r12.getAnchorX()
            int r0 = r12.getMapWidth()
            int r0 = r0 >> r1
            int r15 = r15 - r0
            float r15 = (float) r15
            int r0 = r12.getAnchorY()
            int r2 = r12.getMapHeight()
            int r1 = r2 >> 1
            int r0 = r0 - r1
            float r0 = (float) r0
            float r13 = (float) r13
            float r1 = r12.getMapZoomScale()
            float r15 = d(r1, r6, r15)
            float r13 = r13 + r15
            int r13 = (int) r13
            float r14 = (float) r14
            float r12 = r12.getMapZoomScale()
            float r12 = d(r12, r6, r0)
            float r14 = r14 + r12
            int r12 = (int) r14
            android.util.Pair r14 = new android.util.Pair
            com.autonavi.amap.mapcore.IPoint r12 = com.autonavi.amap.mapcore.IPoint.obtain(r13, r12)
            r14.<init>(r4, r12)
            return r14
        L100:
            return r1
    }

    public static com.amap.api.col.p0003l.p4 s() {
            java.lang.String r0 = "10.0.600"
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.ha.f3472e     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L35
            com.amap.api.col.3l.p4$a r1 = new com.amap.api.col.3l.p4$a     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "3dmap"
            java.lang.String r3 = com.amap.api.col.p0003l.ha.f3470c     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "com.amap.api.maps"
            java.lang.String r5 = "com.amap.api.mapcore"
            java.lang.String r6 = "com.autonavi.amap.mapcore"
            java.lang.String r7 = "com.autonavi.amap"
            java.lang.String r8 = "com.autonavi.ae"
            java.lang.String r9 = "com.autonavi.base"
            java.lang.String r10 = "com.autonavi.patch"
            java.lang.String r11 = "com.amap.api.3dmap.admic"
            java.lang.String r12 = "com.amap.api.trace"
            java.lang.String r13 = "com.amap.api.trace.core"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.3l.p4$a r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.3l.p4$a r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.3l.p4 r0 = r0.c()     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.ha.f3472e = r0     // Catch: java.lang.Throwable -> L38
        L35:
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.ha.f3472e
            return r0
        L38:
            r0 = 0
            return r0
    }

    public static com.autonavi.amap.mapcore.DPoint t(com.amap.api.maps.model.LatLng r10) {
            double r0 = r10.longitude
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 / r2
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r2
            double r4 = r10.latitude
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.sin(r4)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r4 + r6
            double r4 = r6 - r4
            double r8 = r8 / r4
            double r4 = java.lang.Math.log(r8)
            double r4 = r4 * r2
            r8 = -4604611780675359464(0xc01921fb54442d18, double:-6.283185307179586)
            double r4 = r4 / r8
            double r4 = r4 + r2
            double r0 = r0 * r6
            double r4 = r4 * r6
            com.autonavi.amap.mapcore.DPoint r10 = com.autonavi.amap.mapcore.DPoint.obtain(r0, r4)
            return r10
    }

    public static java.lang.String u(int r2) {
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "m"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r2 / r0
            r1.append(r2)
            java.lang.String r2 = "km"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static java.lang.String v(android.content.Context r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r3 = com.autonavi.base.amap.mapcore.FileUtil.getMapBaseStorage(r3)
            java.lang.String r1 = "data_v6"
            r0.<init>(r3, r1)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L14
            r0.mkdir()
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r0.toString()
            r3.append(r1)
            java.lang.String r1 = java.io.File.separator
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L37
            r2.mkdir()
        L37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.String w(java.io.File r7) {
            java.lang.String r0 = "Util"
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48 java.io.FileNotFoundException -> L4d
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48 java.io.FileNotFoundException -> L4d
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b java.io.FileNotFoundException -> L40
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b java.io.FileNotFoundException -> L40
            java.lang.String r5 = "utf-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b java.io.FileNotFoundException -> L40
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b java.io.FileNotFoundException -> L40
        L19:
            java.lang.String r2 = r7.readLine()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L27 java.io.FileNotFoundException -> L29
            if (r2 == 0) goto L2b
            r1.append(r2)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L27 java.io.FileNotFoundException -> L29
            goto L19
        L23:
            r0 = move-exception
        L24:
            r2 = r3
            goto L87
        L27:
            r2 = move-exception
            goto L52
        L29:
            r2 = move-exception
            goto L6a
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L33
        L2e:
            r7.close()     // Catch: java.io.IOException -> L82
            goto L82
        L33:
            r0 = move-exception
            r7.close()     // Catch: java.io.IOException -> L37
        L37:
            throw r0
        L38:
            r0 = move-exception
            r7 = r2
            goto L24
        L3b:
            r7 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
            goto L52
        L40:
            r7 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
            goto L6a
        L45:
            r0 = move-exception
            r7 = r2
            goto L87
        L48:
            r7 = move-exception
            r3 = r2
            r2 = r7
            r7 = r3
            goto L52
        L4d:
            r7 = move-exception
            r3 = r2
            r2 = r7
            r7 = r3
            goto L6a
        L52:
            java.lang.String r4 = "readFile io"
            com.amap.api.col.p0003l.w5.p(r2, r0, r4)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L64
            goto L67
        L5d:
            r0 = move-exception
            if (r7 == 0) goto L63
            r7.close()     // Catch: java.io.IOException -> L63
        L63:
            throw r0
        L64:
            if (r7 == 0) goto L82
            goto L2e
        L67:
            if (r7 == 0) goto L82
            goto L2e
        L6a:
            java.lang.String r4 = "readFile fileNotFound"
            com.amap.api.col.p0003l.w5.p(r2, r0, r4)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L7f
            r3.close()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L7c
            goto L7f
        L75:
            r0 = move-exception
            if (r7 == 0) goto L7b
            r7.close()     // Catch: java.io.IOException -> L7b
        L7b:
            throw r0
        L7c:
            if (r7 == 0) goto L82
            goto L2e
        L7f:
            if (r7 == 0) goto L82
            goto L2e
        L82:
            java.lang.String r7 = r1.toString()
            return r7
        L87:
            if (r2 == 0) goto L9a
            r2.close()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L94
            goto L9a
        L8d:
            r0 = move-exception
            if (r7 == 0) goto L93
            r7.close()     // Catch: java.io.IOException -> L93
        L93:
            throw r0
        L94:
            if (r7 == 0) goto L9d
        L96:
            r7.close()     // Catch: java.io.IOException -> L9d
            goto L9d
        L9a:
            if (r7 == 0) goto L9d
            goto L96
        L9d:
            throw r0
    }

    public static java.lang.String x(java.io.InputStream r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lc
            byte[] r2 = e0(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "utf-8"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r2 = move-exception
            java.lang.String r0 = "Util"
            java.lang.String r1 = "decodeAssetResData"
            com.amap.api.col.p0003l.w5.p(r2, r0, r1)
            r2 = 0
            return r2
    }

    public static java.lang.String y(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L63
        L7:
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = r0.getAuthority()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "dualstack-"
            if (r1 == 0) goto L1e
            java.lang.String r1 = r0.getAuthority()     // Catch: java.lang.Throwable -> L63
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L1e
            goto L63
        L1e:
            java.lang.String r1 = r0.getAuthority()     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L43
            java.lang.String r1 = r0.getAuthority()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "restsdk.amap.com"
            boolean r1 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L43
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "dualstack-arestapi.amap.com"
            android.net.Uri$Builder r0 = r0.authority(r1)     // Catch: java.lang.Throwable -> L63
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L63
            return r4
        L43:
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.getAuthority()     // Catch: java.lang.Throwable -> L63
            r3.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L63
            android.net.Uri$Builder r0 = r1.authority(r0)     // Catch: java.lang.Throwable -> L63
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L63
        L63:
            return r4
    }

    public static java.lang.String z(java.lang.String r1, java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
