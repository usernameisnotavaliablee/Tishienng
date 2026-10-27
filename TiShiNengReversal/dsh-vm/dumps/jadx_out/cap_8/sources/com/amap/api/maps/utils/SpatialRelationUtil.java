package com.amap.api.maps.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SpatialRelationUtil {
    public static final int A_CIRCLE_DEGREE = 360;
    public static final int A_HALF_CIRCLE_DEGREE = 180;
    public static final int MIN_OFFSET_DEGREE = 50;
    public static final int MIN_POLYLINE_POINT_SIZE = 2;

    public SpatialRelationUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.util.Pair<java.lang.Integer, com.amap.api.maps.model.LatLng> calShortestDistancePoint(java.util.List<com.amap.api.maps.model.LatLng> r8, com.amap.api.maps.model.LatLng r9) {
            r0 = 0
            if (r8 == 0) goto L66
            if (r9 == 0) goto L66
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto Lc
            goto L66
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L66
            r2 = 0
        L16:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L40
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L66
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> L66
            double r4 = r3.latitude     // Catch: java.lang.Throwable -> L66
            double r6 = r3.longitude     // Catch: java.lang.Throwable -> L66
            com.autonavi.amap.mapcore.DPoint r4 = com.autonavi.amap.mapcore.DPoint.obtain(r4, r6)     // Catch: java.lang.Throwable -> L66
            r1.add(r4)     // Catch: java.lang.Throwable -> L66
            boolean r3 = r3.equals(r9)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L3d
            android.util.Pair r8 = new android.util.Pair     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L66
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L66
            return r8
        L3d:
            int r2 = r2 + 1
            goto L16
        L40:
            double r2 = r9.latitude     // Catch: java.lang.Throwable -> L66
            double r8 = r9.longitude     // Catch: java.lang.Throwable -> L66
            com.autonavi.amap.mapcore.DPoint r8 = com.autonavi.amap.mapcore.DPoint.obtain(r2, r8)     // Catch: java.lang.Throwable -> L66
            android.util.Pair r8 = calShortestDistancePoint(r1, r8)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L66
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r8.first     // Catch: java.lang.Throwable -> L66
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = r8.second     // Catch: java.lang.Throwable -> L66
            r3 = r8
            com.autonavi.amap.mapcore.DPoint r3 = (com.autonavi.amap.mapcore.DPoint) r3     // Catch: java.lang.Throwable -> L66
            double r3 = r3.x     // Catch: java.lang.Throwable -> L66
            com.autonavi.amap.mapcore.DPoint r8 = (com.autonavi.amap.mapcore.DPoint) r8     // Catch: java.lang.Throwable -> L66
            double r5 = r8.y     // Catch: java.lang.Throwable -> L66
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L66
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> L66
            return r9
        L66:
            return r0
    }

    public static android.util.Pair<java.lang.Integer, com.amap.api.maps.model.LatLng> calShortestDistancePoint(java.util.List<com.amap.api.maps.model.LatLng> r8, com.amap.api.maps.model.LatLng r9, float r10, double r11) {
            r0 = 0
            if (r8 == 0) goto L7c
            if (r9 == 0) goto L7c
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto Lc
            goto L7c
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r1.<init>()     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7c
            r2 = 0
        L16:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L40
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> L7c
            double r4 = r3.latitude     // Catch: java.lang.Throwable -> L7c
            double r6 = r3.longitude     // Catch: java.lang.Throwable -> L7c
            com.autonavi.amap.mapcore.DPoint r4 = com.autonavi.amap.mapcore.DPoint.obtain(r4, r6)     // Catch: java.lang.Throwable -> L7c
            r1.add(r4)     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r3.equals(r9)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L3d
            android.util.Pair r8 = new android.util.Pair     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r10, r9)     // Catch: java.lang.Throwable -> L7c
            return r8
        L3d:
            int r2 = r2 + 1
            goto L16
        L40:
            double r2 = r9.latitude     // Catch: java.lang.Throwable -> L7c
            double r4 = r9.longitude     // Catch: java.lang.Throwable -> L7c
            com.autonavi.amap.mapcore.DPoint r8 = com.autonavi.amap.mapcore.DPoint.obtain(r2, r4)     // Catch: java.lang.Throwable -> L7c
            android.util.Pair r8 = calShortestDistancePoint(r1, r8, r10)     // Catch: java.lang.Throwable -> L7c
            if (r8 == 0) goto L7c
            java.lang.Object r10 = r8.second     // Catch: java.lang.Throwable -> L7c
            com.autonavi.amap.mapcore.DPoint r10 = (com.autonavi.amap.mapcore.DPoint) r10     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L7c
            double r2 = r10.x     // Catch: java.lang.Throwable -> L7c
            double r4 = r10.y     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L7c
            float r9 = com.amap.api.maps.AMapUtils.calculateLineDistance(r1, r9)     // Catch: java.lang.Throwable -> L7c
            double r9 = (double) r9     // Catch: java.lang.Throwable -> L7c
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 >= 0) goto L7c
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r10 = r8.first     // Catch: java.lang.Throwable -> L7c
            com.amap.api.maps.model.LatLng r11 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r8.second     // Catch: java.lang.Throwable -> L7c
            r12 = r8
            com.autonavi.amap.mapcore.DPoint r12 = (com.autonavi.amap.mapcore.DPoint) r12     // Catch: java.lang.Throwable -> L7c
            double r1 = r12.x     // Catch: java.lang.Throwable -> L7c
            com.autonavi.amap.mapcore.DPoint r8 = (com.autonavi.amap.mapcore.DPoint) r8     // Catch: java.lang.Throwable -> L7c
            double r3 = r8.y     // Catch: java.lang.Throwable -> L7c
            r11.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7c
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L7c
            return r9
        L7c:
            return r0
    }

    public static android.util.Pair<java.lang.Integer, com.autonavi.amap.mapcore.DPoint> calShortestDistancePoint(java.util.List<com.autonavi.amap.mapcore.DPoint> r1, com.autonavi.amap.mapcore.DPoint r2) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.util.Pair r1 = calShortestDistancePoint(r1, r2, r0)
            return r1
    }

    public static android.util.Pair<java.lang.Integer, com.autonavi.amap.mapcore.DPoint> calShortestDistancePoint(java.util.List<com.autonavi.amap.mapcore.DPoint> r26, com.autonavi.amap.mapcore.DPoint r27, float r28) {
            r0 = r26
            r1 = r27
            r2 = 0
            if (r0 == 0) goto Lc4
            if (r1 == 0) goto Lc4
            int r3 = r0.size()
            if (r3 != 0) goto L11
            goto Lc4
        L11:
            int r3 = r0.size()
            r4 = 2
            if (r3 >= r4) goto L19
            return r2
        L19:
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            com.autonavi.amap.mapcore.DPoint r3 = (com.autonavi.amap.mapcore.DPoint) r3
            int r4 = r0.size()
            r5 = 1
            r6 = 0
            r8 = 1
        L28:
            int r9 = r4 + (-1)
            if (r8 > r9) goto Lc4
            java.lang.Object r10 = r0.get(r8)
            com.autonavi.amap.mapcore.DPoint r10 = (com.autonavi.amap.mapcore.DPoint) r10
            if (r8 != r9) goto L44
            boolean r9 = r10.equals(r1)
            if (r9 == 0) goto L44
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0.<init>(r2, r1)
            return r0
        L44:
            r9 = r28
            boolean r11 = checkRotateIsMatch(r3, r10, r9)
            if (r11 == 0) goto Lb4
            boolean r11 = r3.equals(r1)
            if (r11 == 0) goto L5d
            android.util.Pair r0 = new android.util.Pair
            int r8 = r8 - r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0.<init>(r2, r1)
            return r0
        L5d:
            double r11 = r1.x
            double r13 = r1.y
            r23 = r6
            double r5 = r3.x
            r25 = r8
            double r7 = r3.y
            double r0 = r10.x
            r19 = r0
            double r0 = r10.y
            r21 = r0
            r15 = r5
            r17 = r7
            android.util.Pair r0 = pointToSegDist(r11, r13, r15, r17, r19, r21)
            if (r2 != 0) goto L92
            java.lang.Object r1 = r0.first
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            android.util.Pair r3 = new android.util.Pair
            int r8 = r25 + (-1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.second
            r3.<init>(r5, r0)
        L8f:
            r6 = r1
            r2 = r3
            goto Lba
        L92:
            java.lang.Object r1 = r0.first
            java.lang.Double r1 = (java.lang.Double) r1
            double r5 = r1.doubleValue()
            int r1 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb8
            java.lang.Object r1 = r0.first
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            android.util.Pair r3 = new android.util.Pair
            int r8 = r25 + (-1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.second
            r3.<init>(r5, r0)
            goto L8f
        Lb4:
            r23 = r6
            r25 = r8
        Lb8:
            r6 = r23
        Lba:
            int r8 = r25 + 1
            r0 = r26
            r1 = r27
            r3 = r10
            r5 = 1
            goto L28
        Lc4:
            return r2
    }

    private static boolean checkRotateIsMatch(com.autonavi.amap.mapcore.DPoint r2, com.autonavi.amap.mapcore.DPoint r3, float r4) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            if (r2 == 0) goto L2a
            if (r3 != 0) goto Le
            goto L2a
        Le:
            float r2 = com.amap.api.col.p0003l.b3.g(r2, r3)
            r3 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 + r3
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 % r3
            r4 = 1127481344(0x43340000, float:180.0)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L23
            float r2 = r3 - r2
        L23:
            r3 = 1112014848(0x42480000, float:50.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L2a
            return r1
        L2a:
            return r0
    }

    private static android.util.Pair<java.lang.Double, com.autonavi.amap.mapcore.DPoint> pointToSegDist(double r21, double r23, double r25, double r27, double r29, double r31) {
            r0 = r25
            r2 = r27
            r4 = r29
            r6 = r31
            double r8 = r4 - r0
            double r10 = r21 - r0
            double r12 = r8 * r10
            double r14 = r6 - r2
            double r16 = r23 - r2
            double r18 = r14 * r16
            double r12 = r12 + r18
            r18 = 0
            int r20 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r20 > 0) goto L35
            android.util.Pair r4 = new android.util.Pair
            double r10 = r10 * r10
            double r16 = r16 * r16
            double r10 = r10 + r16
            double r5 = java.lang.Math.sqrt(r10)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            com.autonavi.amap.mapcore.DPoint r6 = new com.autonavi.amap.mapcore.DPoint
            r6.<init>(r0, r2)
            r4.<init>(r5, r6)
            return r4
        L35:
            double r10 = r8 * r8
            double r16 = r14 * r14
            double r10 = r10 + r16
            int r16 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r16 < 0) goto L5b
            android.util.Pair r0 = new android.util.Pair
            double r1 = r21 - r4
            double r1 = r1 * r1
            double r8 = r23 - r6
            double r8 = r8 * r8
            double r1 = r1 + r8
            double r1 = java.lang.Math.sqrt(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.autonavi.amap.mapcore.DPoint r2 = new com.autonavi.amap.mapcore.DPoint
            r2.<init>(r4, r6)
            r0.<init>(r1, r2)
            return r0
        L5b:
            double r12 = r12 / r10
            double r8 = r8 * r12
            double r0 = r0 + r8
            double r14 = r14 * r12
            double r2 = r2 + r14
            double r4 = r21 - r0
            double r4 = r4 * r4
            double r6 = r2 - r23
            double r6 = r6 * r6
            double r4 = r4 + r6
            double r4 = java.lang.Math.sqrt(r4)
            android.util.Pair r6 = new android.util.Pair
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            com.autonavi.amap.mapcore.DPoint r5 = new com.autonavi.amap.mapcore.DPoint
            r5.<init>(r0, r2)
            r6.<init>(r4, r5)
            return r6
    }
}
