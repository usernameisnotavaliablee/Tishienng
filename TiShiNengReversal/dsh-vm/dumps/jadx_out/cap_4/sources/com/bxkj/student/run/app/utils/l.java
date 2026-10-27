package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> a(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r14) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 0
            r0.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 1
        L12:
            int r6 = r14.size()
            if (r5 >= r6) goto L8d
            int r6 = r5 + (-1)
            java.lang.Object r6 = r14.get(r6)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r6 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r6
            r4.add(r6)
            java.lang.Object r7 = r14.get(r5)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r7 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r7
            com.amap.api.maps.model.LatLng r8 = new com.amap.api.maps.model.LatLng
            double r9 = r6.getLatitude()
            double r11 = r6.getLongitude()
            r8.<init>(r9, r11)
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r9 = r7.getLatitude()
            double r11 = r7.getLongitude()
            r6.<init>(r9, r11)
            float r6 = com.amap.api.maps.AMapUtils.calculateLineDistance(r8, r6)
            double r8 = (double) r6
            java.lang.Double r6 = java.lang.Double.valueOf(r8)
            r3.add(r6)
            r7.getSpeed()
            r6 = 5
            if (r5 <= r6) goto L78
            int r6 = r5 + (-5)
            java.util.List r6 = r3.subList(r6, r5)
            double r10 = b(r6)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 * r12
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 > 0) goto L8a
            r4.add(r7)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r8)
            java.math.BigDecimal r6 = r0.add(r6)
            float r6 = r6.floatValue()
            goto L88
        L78:
            r4.add(r7)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r8)
            java.math.BigDecimal r6 = r0.add(r6)
            float r6 = r6.floatValue()
        L88:
            double r6 = (double) r6
            double r1 = r1 + r6
        L8a:
            int r5 = r5 + 1
            goto L12
        L8d:
            com.bxkj.student.run.app.utils.i.d(r1)
            return r4
    }

    private static double b(java.util.List<java.lang.Double> r5) {
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r0.next()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            double r1 = r1 + r3
            goto L6
        L18:
            int r5 = r5.size()
            double r3 = (double) r5
            double r1 = r1 / r3
            return r1
    }

    public static double c(java.lang.Double[] r10) {
            int r0 = r10.length
            int r1 = r10.length
            r2 = 0
            r4 = 0
            r6 = r2
            r5 = 0
        L7:
            if (r5 >= r1) goto L13
            r8 = r10[r5]
            double r8 = r8.doubleValue()
            double r6 = r6 + r8
            int r5 = r5 + 1
            goto L7
        L13:
            double r0 = (double) r0
            double r6 = r6 / r0
            int r5 = r10.length
        L16:
            if (r4 >= r5) goto L25
            r8 = r10[r4]
            double r8 = r8.doubleValue()
            double r8 = r8 - r6
            double r8 = r8 * r8
            double r2 = r2 + r8
            int r4 = r4 + 1
            goto L16
        L25:
            double r2 = r2 / r0
            double r0 = java.lang.Math.sqrt(r2)
            return r0
    }

    public static double d(double[] r10) {
            int r0 = r10.length
            int r1 = r10.length
            r2 = 0
            r4 = 0
            r6 = r2
            r5 = 0
        L7:
            if (r5 >= r1) goto Lf
            r8 = r10[r5]
            double r6 = r6 + r8
            int r5 = r5 + 1
            goto L7
        Lf:
            double r0 = (double) r0
            double r6 = r6 / r0
            int r5 = r10.length
        L12:
            if (r4 >= r5) goto L1d
            r8 = r10[r4]
            double r8 = r8 - r6
            double r8 = r8 * r8
            double r2 = r2 + r8
            int r4 = r4 + 1
            goto L12
        L1d:
            double r2 = r2 / r0
            return r2
    }
}
