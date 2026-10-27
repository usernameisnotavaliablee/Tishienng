package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w2 {
    public w2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static double a(com.amap.api.maps.model.LatLng r10, com.amap.api.maps.model.LatLng r11, com.amap.api.maps.model.LatLng r12) {
            double r0 = r10.latitude
            double r2 = r12.latitude
            double r2 = r0 - r2
            double r4 = r10.longitude
            double r6 = r12.longitude
            double r6 = r4 - r6
            double r8 = r11.latitude
            double r0 = r0 - r8
            double r10 = r11.longitude
            double r4 = r4 - r10
            double r6 = r6 * r0
            double r4 = r4 * r2
            double r6 = r6 - r4
            return r6
    }

    public static boolean b(com.amap.api.maps.model.LatLng r17, com.amap.api.maps.model.LatLng r18, com.amap.api.maps.model.LatLng r19, com.amap.api.maps.model.LatLng r20) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            double r4 = a(r2, r3, r0)
            double r6 = a(r2, r3, r1)
            double r8 = a(r17, r18, r19)
            double r10 = a(r0, r1, r3)
            r12 = 1
            r13 = 0
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 <= 0) goto L23
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 < 0) goto L2b
        L23:
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 >= 0) goto L3c
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L3c
        L2b:
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 <= 0) goto L33
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 < 0) goto L3b
        L33:
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 >= 0) goto L3c
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 <= 0) goto L3c
        L3b:
            return r12
        L3c:
            if (r15 != 0) goto L45
            boolean r4 = c(r2, r3, r0)
            if (r4 == 0) goto L45
            return r12
        L45:
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 != 0) goto L50
            boolean r4 = c(r2, r3, r1)
            if (r4 == 0) goto L50
            return r12
        L50:
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 != 0) goto L5b
            boolean r2 = c(r17, r18, r19)
            if (r2 == 0) goto L5b
            return r12
        L5b:
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 != 0) goto L66
            boolean r0 = c(r0, r1, r3)
            if (r0 == 0) goto L66
            return r12
        L66:
            r0 = 0
            return r0
    }

    private static boolean c(com.amap.api.maps.model.LatLng r13, com.amap.api.maps.model.LatLng r14, com.amap.api.maps.model.LatLng r15) {
            double r0 = r13.longitude
            double r2 = r14.longitude
            double r4 = r0 - r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            double r8 = r0 - r2
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L16
            goto L17
        L16:
            r0 = r2
        L17:
            double r2 = r13.latitude
            double r13 = r14.latitude
            double r8 = r2 - r13
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L23
            r8 = r2
            goto L24
        L23:
            r8 = r13
        L24:
            double r10 = r2 - r13
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L2b
            goto L2c
        L2b:
            r2 = r13
        L2c:
            double r13 = r15.longitude
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 > 0) goto L42
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 > 0) goto L42
            double r13 = r15.latitude
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 > 0) goto L42
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 > 0) goto L42
            r13 = 1
            return r13
        L42:
            r13 = 0
            return r13
    }
}
