package com.autonavi.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class VirtualEarthProjection {
    public static final double EARTH_CIRCUMFERENCE_IN_METERS = 4.007501668557849E7d;
    public static final int EARTH_RADIUS_IN_METERS = 6378137;
    private static final int KMA_MAX_MAP_SIZE = 268435456;
    private static final double K_EARTH_CIRCLE = 4.0075016E7d;
    private static final double K_EARTH_CIRCLE_2 = 2.0037508E7d;
    public static final int MAXZOOMLEVEL = 20;
    public static final double MAX_LATITUDE = 85.0511287798d;
    public static final double MAX_LONGITUDE = 360.0d;
    public static final double MIN_LATITUDE = -85.0511287798d;
    public static final double MIN_LONGITUDE = -360.0d;
    public static final int PIXELS_PER_TILE = 256;
    public static final int TILE_SPLIT_LEVEL = 0;

    public VirtualEarthProjection() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double clip(double r0, double r2, double r4) {
            double r0 = java.lang.Math.max(r0, r2)
            double r0 = java.lang.Math.min(r0, r4)
            return r0
    }

    private static double degToRad(double r2) {
            r0 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r2 = r2 * r0
            return r2
    }

    public static android.graphics.Point latLongToPixels(double r6, double r8, int r10) {
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            r0 = r6
            r2 = r8
            r4 = r10
            latLongToPixels(r0, r2, r4, r5)
            return r5
    }

    public static android.graphics.Point latLongToPixels(int r4, int r5, int r6) {
            double r0 = (double) r5
            r2 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r0 = r0 / r2
            double r4 = (double) r4
            double r4 = r4 / r2
            android.graphics.Point r4 = latLongToPixels(r0, r4, r6)
            return r4
    }

    public static void latLongToPixels(double r6, double r8, int r10, android.graphics.Point r11) {
            r2 = -4587686678794778618(0xc0554345b1a54806, double:-85.0511287798)
            r4 = 4635685358059997190(0x40554345b1a54806, double:85.0511287798)
            r0 = r6
            double r6 = clip(r0, r2, r4)
            r2 = -4578331233687175168(0xc076800000000000, double:-360.0)
            r4 = 4645040803167600640(0x4076800000000000, double:360.0)
            r0 = r8
            double r8 = clip(r0, r2, r4)
            double r8 = degToRad(r8)
            r0 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r8 = r8 * r0
            double r6 = degToRad(r6)
            double r6 = java.lang.Math.sin(r6)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r6 + r2
            double r2 = r2 - r6
            double r4 = r4 / r2
            double r6 = java.lang.Math.log(r4)
            double r6 = r6 * r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r0
            r0 = 4716143987826622464(0x41731bf840000000, double:2.0037508E7)
            double r8 = r8 + r0
            r2 = 4594546797887619072(0x3fc31bf840000000, double:0.14929106831550598)
            double r8 = r8 / r2
            double r0 = r0 - r6
            double r0 = r0 / r2
            int r6 = (int) r8
            r11.x = r6
            int r6 = (int) r0
            r11.y = r6
            return
    }

    public static com.autonavi.amap.mapcore.DPoint latLongToPixelsDouble(double r6, double r8, int r10) {
            com.autonavi.amap.mapcore.DPoint r10 = new com.autonavi.amap.mapcore.DPoint
            r10.<init>()
            r2 = -4587686678794778618(0xc0554345b1a54806, double:-85.0511287798)
            r4 = 4635685358059997190(0x40554345b1a54806, double:85.0511287798)
            r0 = r6
            double r6 = clip(r0, r2, r4)
            r2 = -4578331233687175168(0xc076800000000000, double:-360.0)
            r4 = 4645040803167600640(0x4076800000000000, double:360.0)
            r0 = r8
            double r8 = clip(r0, r2, r4)
            double r8 = degToRad(r8)
            r0 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r8 = r8 * r0
            double r6 = degToRad(r6)
            double r6 = java.lang.Math.sin(r6)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r6 + r2
            double r2 = r2 - r6
            double r4 = r4 / r2
            double r6 = java.lang.Math.log(r4)
            double r6 = r6 * r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r0
            r0 = 4716143987826622464(0x41731bf840000000, double:2.0037508E7)
            double r8 = r8 + r0
            r2 = 4594546797887619072(0x3fc31bf840000000, double:0.14929106831550598)
            double r8 = r8 / r2
            double r0 = r0 - r6
            double r0 = r0 / r2
            r10.x = r8
            r10.y = r0
            return r10
    }

    public static com.autonavi.amap.mapcore.DPoint pixelsToLatLong(double r4, double r6, int r8) {
            com.autonavi.amap.mapcore.DPoint r8 = com.autonavi.amap.mapcore.DPoint.obtain()
            r0 = 4594546797887619072(0x3fc31bf840000000, double:0.14929106831550598)
            double r4 = r4 * r0
            r2 = 4716143987826622464(0x41731bf840000000, double:2.0037508E7)
            double r4 = r4 - r2
            double r6 = r6 * r0
            double r2 = r2 - r6
            r6 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r4 = r4 / r6
            double r4 = radToDeg(r4)
            r8.x = r4
            double r2 = r2 / r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r4
            double r4 = java.lang.Math.exp(r2)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r4 - r6
            double r4 = r4 + r6
            double r0 = r0 / r4
            double r4 = java.lang.Math.asin(r0)
            double r4 = radToDeg(r4)
            r8.y = r4
            return r8
    }

    public static com.autonavi.amap.mapcore.DPoint pixelsToLatLong(long r4, long r6, int r8) {
            com.autonavi.amap.mapcore.DPoint r8 = com.autonavi.amap.mapcore.DPoint.obtain()
            double r4 = (double) r4
            r0 = 4594546797887619072(0x3fc31bf840000000, double:0.14929106831550598)
            double r4 = r4 * r0
            r2 = 4716143987826622464(0x41731bf840000000, double:2.0037508E7)
            double r4 = r4 - r2
            double r6 = (double) r6
            double r6 = r6 * r0
            double r2 = r2 - r6
            r6 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r4 = r4 / r6
            double r4 = radToDeg(r4)
            r8.x = r4
            double r2 = r2 / r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r4
            double r4 = java.lang.Math.exp(r2)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r4 - r6
            double r4 = r4 + r6
            double r0 = r0 / r4
            double r4 = java.lang.Math.asin(r0)
            double r4 = radToDeg(r4)
            r8.y = r4
            return r8
    }

    private static double radToDeg(double r2) {
            r0 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r2 = r2 * r0
            return r2
    }
}
