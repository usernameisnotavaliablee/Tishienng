package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i {
    private static java.text.SimpleDateFormat a;
    private static java.util.List<com.amap.api.maps.model.LatLng> b;
    private static com.amap.api.maps.model.LatLng c;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.run.app.utils.i.b = r0
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            r1 = 0
            r0.<init>(r1, r1)
            com.bxkj.student.run.app.utils.i.c = r0
            return
    }

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(double r3, long r5) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            double r5 = (double) r5
            r0 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r5 = r5 / r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L20
            double r3 = r3 / r5
            java.text.DecimalFormat r5 = new java.text.DecimalFormat
            java.lang.String r6 = "0.00"
            r5.<init>(r6)
            java.lang.String r3 = r5.format(r3)
            return r3
        L20:
            java.lang.String r3 = "0.0"
            return r3
    }

    public static java.lang.String b(double r3, long r5) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            double r3 = (double) r3
            double r3 = r3 / r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1e
            double r5 = (double) r5
            double r5 = r5 / r3
            int r3 = (int) r5
            java.lang.String r3 = f(r3)
            return r3
        L1e:
            java.lang.String r3 = "0'0\""
            return r3
    }

    public static java.lang.String c(double r2) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            com.bxkj.base.v2.common.utils.h r0 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r2 = r0.a(r2)
            return r2
    }

    public static java.lang.String d(double r2) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            com.bxkj.base.v2.common.utils.h r0 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r2 = r0.b(r2)
            return r2
    }

    public static double e(double r2) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r3 = 1000(0x3e8, float:1.401E-42)
            r2.<init>(r3)
            r3 = 2
            java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR
            java.math.BigDecimal r2 = r0.divide(r2, r3, r1)
            double r2 = r2.doubleValue()
            return r2
    }

    private static java.lang.String f(int r5) {
            int r5 = r5 % 3600
            int r0 = r5 / 60
            java.lang.String r1 = "0"
            java.lang.String r2 = ""
            r3 = 9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r0 <= r3) goto L1c
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
        L17:
            java.lang.String r0 = r4.toString()
            goto L26
        L1c:
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            goto L17
        L26:
            int r5 = r5 % 60
            if (r5 <= r3) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L49
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
        L49:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = "\""
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    public static java.lang.String g(long r10) {
            r0 = 3600(0xe10, double:1.7786E-320)
            long r2 = r10 / r0
            java.lang.String r4 = "0"
            java.lang.String r5 = ""
            r6 = 9
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r5)
        L19:
            java.lang.String r2 = r8.toString()
            goto L2a
        L1e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r2)
            goto L19
        L2a:
            long r10 = r10 % r0
            r0 = 60
            long r8 = r10 / r0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 <= 0) goto L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r5)
        L3e:
            java.lang.String r3 = r3.toString()
            goto L4f
        L43:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r8)
            goto L3e
        L4f:
            long r10 = r10 % r0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r5)
        L5f:
            java.lang.String r10 = r0.toString()
            goto L70
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            goto L5f
        L70:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r0 = ":"
            r11.append(r0)
            r11.append(r3)
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
    }

    public static java.lang.String h(long r2, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L8
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
        L8:
            java.text.SimpleDateFormat r0 = com.bxkj.student.run.app.utils.i.a
            if (r0 != 0) goto L18
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L16
            java.util.Locale r1 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L16
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L16
            com.bxkj.student.run.app.utils.i.a = r0     // Catch: java.lang.Throwable -> L16
            goto L1b
        L16:
            goto L1b
        L18:
            r0.applyPattern(r4)
        L1b:
            java.text.SimpleDateFormat r4 = com.bxkj.student.run.app.utils.i.a
            if (r4 != 0) goto L22
            java.lang.String r2 = "NULL"
            goto L2a
        L22:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = r4.format(r2)
        L2a:
            return r2
    }

    public static java.lang.String i(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            com.bxkj.student.run.app.utils.i.a = r0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r0.format(r3)
            return r3
    }

    public static java.lang.String j(int r1, int r2) {
            r0 = 1
            if (r1 == 0) goto L1d
            if (r1 == r0) goto L1a
            r2 = 2
            if (r1 == r2) goto L17
            r2 = 3
            if (r1 == r2) goto L14
            r2 = 4
            if (r1 == r2) goto L11
            java.lang.String r1 = "GPS状态未知"
            return r1
        L11:
            java.lang.String r1 = "没有GPS定位权限，建议开启gps定位权限"
            return r1
        L14:
            java.lang.String r1 = "选择的定位模式中不包含GPS定位，建议选择包含GPS定位的模式，提高定位质量"
            return r1
        L17:
            java.lang.String r1 = "GPS关闭，建议开启GPS，提高定位质量"
            return r1
        L1a:
            java.lang.String r1 = "手机中没有GPS Provider，无法进行GPS定位"
            return r1
        L1d:
            r1 = -1
            if (r2 == r1) goto L2d
            if (r2 == 0) goto L2a
            if (r2 == r0) goto L27
            java.lang.String r1 = "GPS状态正常"
            return r1
        L27:
            java.lang.String r1 = "GPS信号良好，请尽情跑步"
            return r1
        L2a:
            java.lang.String r1 = "GPS信号弱，请在空旷的地方跑步"
            return r1
        L2d:
            java.lang.String r1 = "GPS信号未知，正在搜寻···"
            return r1
    }

    public static int k(int r1) {
            if (r1 == 0) goto Ld
            r0 = 1
            if (r1 == r0) goto L9
            r1 = 2131689678(0x7f0f00ce, float:1.9008378E38)
            return r1
        L9:
            r1 = 2131689675(0x7f0f00cb, float:1.9008372E38)
            return r1
        Ld:
            r1 = 2131689674(0x7f0f00ca, float:1.900837E38)
            return r1
    }

    public static int l(int r1, int r2) {
            r0 = 2131689678(0x7f0f00ce, float:1.9008378E38)
            if (r1 == 0) goto L6
            return r0
        L6:
            r1 = -1
            if (r2 == r1) goto L17
            if (r2 == 0) goto L13
            r1 = 1
            if (r2 == r1) goto Lf
            return r0
        Lf:
            r1 = 2131689675(0x7f0f00cb, float:1.9008372E38)
            return r1
        L13:
            r1 = 2131689674(0x7f0f00ca, float:1.900837E38)
            return r1
        L17:
            return r0
    }

    public static java.lang.String m(int r1) {
            if (r1 == 0) goto L1d
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 == r0) goto L14
            r0 = 4
            if (r1 == r0) goto L11
            java.lang.String r1 = ""
            return r1
        L11:
            java.lang.String r1 = "没有GPS定位权限，建议开启gps定位权限"
            return r1
        L14:
            java.lang.String r1 = "选择的定位模式中不包含GPS定位，建议选择包含GPS定位的模式，提高定位质量"
            return r1
        L17:
            java.lang.String r1 = "GPS关闭，建议开启GPS，提高定位质量"
            return r1
        L1a:
            java.lang.String r1 = "手机中没有GPS Provider，无法进行GPS定位"
            return r1
        L1d:
            java.lang.String r1 = "GPS状态正常"
            return r1
    }

    public static java.lang.String n(int r1, int r2) {
            r0 = 1
            if (r1 == 0) goto L1d
            if (r1 == r0) goto L1a
            r2 = 2
            if (r1 == r2) goto L17
            r2 = 3
            if (r1 == r2) goto L14
            r2 = 4
            if (r1 == r2) goto L11
            java.lang.String r1 = ""
            return r1
        L11:
            java.lang.String r1 = "没有GPS定位权限，建议开启gps定位权限"
            return r1
        L14:
            java.lang.String r1 = "选择的定位模式中不包含GPS定位，建议选择包含GPS定位的模式，提高定位质量"
            return r1
        L17:
            java.lang.String r1 = "GPS关闭，建议开启GPS，提高定位质量"
            return r1
        L1a:
            java.lang.String r1 = "手机中没有GPS Provider，无法进行GPS定位"
            return r1
        L1d:
            r1 = -1
            if (r2 == r1) goto L2d
            if (r2 == 0) goto L2a
            if (r2 == r0) goto L27
            java.lang.String r1 = "GPS状态正常"
            return r1
        L27:
            java.lang.String r1 = "GPS信号良好，请尽情跑步"
            return r1
        L2a:
            java.lang.String r1 = "GPS信号弱，请在空旷的地方跑步"
            return r1
        L2d:
            java.lang.String r1 = "GPS信号未知，正在搜寻···"
            return r1
    }

    public static java.lang.String o(int r0) {
            switch(r0) {
                case 1: goto L18;
                case 2: goto L15;
                case 3: goto L15;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Lc;
                case 7: goto L9;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "未知"
            return r0
        L6:
            java.lang.String r0 = "离线定位结果"
            return r0
        L9:
            java.lang.String r0 = "LBS定位结果"
            return r0
        Lc:
            java.lang.String r0 = "基站定位结果"
            return r0
        Lf:
            java.lang.String r0 = "WIFI定位结果"
            return r0
        L12:
            java.lang.String r0 = "缓存定位结果"
            return r0
        L15:
            java.lang.String r0 = "前次定位结果"
            return r0
        L18:
            java.lang.String r0 = "GPS"
            return r0
    }

    public static com.amap.api.maps.model.LatLng p(com.amap.api.location.AMapLocation r7) {
            int r0 = r7.getTrustedLevel()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            double r3 = r7.getLatitude()
            double r5 = r7.getLongitude()
            r0.<init>(r3, r5)
            com.amap.api.maps.model.LatLng r7 = com.bxkj.student.run.app.utils.i.c
            float r7 = com.amap.api.maps.AMapUtils.calculateLineDistance(r7, r0)
            r1 = 1092616192(0x41200000, float:10.0)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L2a
            com.bxkj.student.run.app.utils.i.c = r0
            java.util.List<com.amap.api.maps.model.LatLng> r7 = com.bxkj.student.run.app.utils.i.b
            r7.clear()
            return r2
        L2a:
            java.util.List<com.amap.api.maps.model.LatLng> r7 = com.bxkj.student.run.app.utils.i.b
            r7.add(r0)
            com.bxkj.student.run.app.utils.i.c = r0
            java.util.List<com.amap.api.maps.model.LatLng> r7 = com.bxkj.student.run.app.utils.i.b
            int r7 = r7.size()
            r1 = 5
            if (r7 < r1) goto L40
            java.util.List<com.amap.api.maps.model.LatLng> r7 = com.bxkj.student.run.app.utils.i.b
            r7.clear()
            return r0
        L40:
            return r2
    }

    public static java.lang.String q(@com.bxkj.student.run.app.ready.RunType int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "早操跑步"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "阳光跑步"
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.String r1 = "自由跑步"
            return r1
        L12:
            r0 = 4
            if (r1 != r0) goto L18
            java.lang.String r1 = "健康跑步"
            return r1
        L18:
            if (r1 != 0) goto L1d
            java.lang.String r1 = "室内跑步"
            return r1
        L1d:
            java.lang.String r1 = "跑步"
            return r1
    }

    public static int r(android.content.Context r1, float r2) {
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le
            r2 = 2131100546(0x7f060382, float:1.7813477E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            return r1
        Le:
            if (r0 > 0) goto L1e
            r0 = 1088421888(0x40e00000, float:7.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L1e
            r2 = 2131100547(0x7f060383, float:1.7813479E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            return r1
        L1e:
            r2 = 2131100548(0x7f060384, float:1.781348E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            return r1
    }

    public static int s(android.content.Context r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            r3 = 2131100573(0x7f06039d, float:1.7813531E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        Le:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L20
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L20
            r3 = 2131100574(0x7f06039e, float:1.7813533E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L20:
            r0 = 1077936128(0x40400000, float:3.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L32
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L32
            r3 = 2131100576(0x7f0603a0, float:1.7813537E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L32:
            r1 = 1082130432(0x40800000, float:4.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L44
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L44
            r3 = 2131100577(0x7f0603a1, float:1.781354E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L44:
            r0 = 1084227584(0x40a00000, float:5.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L56
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r3 = 2131100578(0x7f0603a2, float:1.7813541E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L56:
            r1 = 1086324736(0x40c00000, float:6.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L68
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L68
            r3 = 2131100579(0x7f0603a3, float:1.7813543E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L68:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L7a
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7a
            r3 = 2131100580(0x7f0603a4, float:1.7813545E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L7a:
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L8c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8c
            r3 = 2131100581(0x7f0603a5, float:1.7813547E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L8c:
            r0 = 1091567616(0x41100000, float:9.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L9e
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L9e
            r3 = 2131100582(0x7f0603a6, float:1.781355E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        L9e:
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb0
            r0 = 1092616192(0x41200000, float:10.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto Lb0
            r3 = 2131100583(0x7f0603a7, float:1.7813552E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
        Lb0:
            r3 = 2131100575(0x7f06039f, float:1.7813535E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            return r2
    }

    public static int t(java.lang.String r7) {
            java.lang.String r0 = ","
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r3 = com.alibaba.fastjson.JSON.parse(r7)     // Catch: java.lang.Exception -> L1e
            boolean r3 = r3 instanceof com.alibaba.fastjson.JSONArray     // Catch: java.lang.Exception -> L1e
            if (r3 == 0) goto L20
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.util.List r1 = com.alibaba.fastjson.JSON.parseArray(r7, r3)     // Catch: java.lang.Exception -> L1e
            goto L68
        L1e:
            goto L3b
        L20:
            java.lang.String[] r3 = r7.split(r0)     // Catch: java.lang.Exception -> L1e
            int r4 = r3.length     // Catch: java.lang.Exception -> L1e
            if (r4 <= 0) goto L68
            int r4 = r3.length     // Catch: java.lang.Exception -> L1e
            r5 = 0
        L29:
            if (r5 >= r4) goto L68
            r6 = r3[r5]     // Catch: java.lang.Exception -> L1e
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1e
            r1.add(r6)     // Catch: java.lang.Exception -> L1e
            int r5 = r5 + 1
            goto L29
        L3b:
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            if (r0 <= 0) goto L68
            int r0 = r7.length
            r3 = 0
        L44:
            if (r3 >= r0) goto L68
            r4 = r7[r3]
            if (r4 == 0) goto L5e
            java.lang.String r5 = "null"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 != 0) goto L5e
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L65
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L65
            r1.add(r4)     // Catch: java.lang.NumberFormatException -> L65
            goto L65
        L5e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.add(r4)
        L65:
            int r3 = r3 + 1
            goto L44
        L68:
            if (r1 == 0) goto L87
            int r7 = r1.size()
            if (r7 != 0) goto L71
            goto L87
        L71:
            r7 = 0
        L72:
            int r0 = r1.size()
            if (r2 >= r0) goto L86
            java.lang.Object r0 = r1.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r7 = r7 + r0
            int r2 = r2 + 1
            goto L72
        L86:
            return r7
        L87:
            return r2
    }

    public static int u(int r3, int r4) {
            r0 = 2
            r1 = 2131690189(0x7f0f02cd, float:1.9009415E38)
            r2 = 1
            if (r4 != r0) goto L14
            if (r3 == 0) goto L10
            if (r3 == r2) goto Lc
            return r1
        Lc:
            r3 = 2131690186(0x7f0f02ca, float:1.9009409E38)
            return r3
        L10:
            r3 = 2131690183(0x7f0f02c7, float:1.9009402E38)
            return r3
        L14:
            if (r4 != 0) goto L23
            if (r3 == 0) goto L1f
            if (r3 == r2) goto L1b
            return r1
        L1b:
            r3 = 2131690188(0x7f0f02cc, float:1.9009413E38)
            return r3
        L1f:
            r3 = 2131690185(0x7f0f02c9, float:1.9009406E38)
            return r3
        L23:
            if (r3 == 0) goto L2c
            if (r3 == r2) goto L28
            return r1
        L28:
            r3 = 2131690187(0x7f0f02cb, float:1.900941E38)
            return r3
        L2c:
            r3 = 2131690184(0x7f0f02c8, float:1.9009404E38)
            return r3
    }

    public static float v(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L2e
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L2e
        La:
            java.lang.String r1 = "'"
            java.lang.String[] r4 = r4.split(r1)     // Catch: java.lang.Exception -> L2e
            r1 = 0
            r1 = r4[r1]     // Catch: java.lang.Exception -> L2e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L2e
            r2 = 1
            r4 = r4[r2]     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "\""
            java.lang.String r3 = ""
            java.lang.String r4 = r4.replace(r2, r3)     // Catch: java.lang.Exception -> L2e
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L2e
            int r1 = r1 * 60
            int r1 = r1 + r4
            float r4 = (float) r1
            r0 = 1114636288(0x42700000, float:60.0)
            float r4 = r4 / r0
            return r4
        L2e:
            return r0
    }
}
