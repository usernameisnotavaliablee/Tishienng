package com.autonavi.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MapProjection {
    public MapProjection() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void geo2LonLat(int r3, int r4, com.autonavi.amap.mapcore.DPoint r5) {
            long r0 = (long) r3
            long r3 = (long) r4
            r2 = 20
            com.autonavi.amap.mapcore.DPoint r3 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r0, r3, r2)
            double r0 = r3.x
            r5.x = r0
            double r0 = r3.y
            r5.y = r0
            r3.recycle()
            return
    }

    public static void lonlat2Geo(double r1, double r3, com.autonavi.amap.mapcore.IPoint r5) {
            r0 = 20
            android.graphics.Point r1 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r3, r1, r0)
            int r2 = r1.x
            r5.x = r2
            int r1 = r1.y
            r5.y = r1
            return
    }
}
