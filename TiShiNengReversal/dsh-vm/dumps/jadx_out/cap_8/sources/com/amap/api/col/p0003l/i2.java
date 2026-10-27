package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i2 {
    static java.lang.String a;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            r2 = 80
            if (r1 >= r2) goto L12
            java.lang.String r2 = "="
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L12:
            java.lang.String r0 = r0.toString()
            com.amap.api.col.p0003l.i2.a = r0
            return
    }

    public i2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a() {
            java.lang.String r0 = com.amap.api.col.p0003l.i2.a
            e(r0)
            java.lang.String r0 = "当前使用的自定义地图样式文件和目前版本不匹配，请到官网(lbs.amap.com)更新新版样式文件"
            e(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.i2.a
            e(r0)
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = com.amap.api.col.p0003l.i2.a
            e(r0)
            if (r2 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "key:"
            r0.<init>(r1)
            java.lang.String r2 = com.amap.api.col.p0003l.f4.j(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            d(r2)
        L1c:
            e(r3)
            java.lang.String r2 = com.amap.api.col.p0003l.i2.a
            e(r2)
            return
    }

    public static void c(java.lang.String r1) {
            java.lang.String r0 = com.amap.api.col.p0003l.i2.a
            e(r0)
            e(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.i2.a
            e(r1)
            return
    }

    private static void d(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            java.lang.String r2 = "|"
            r3 = 78
            if (r0 >= r3) goto L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r5)
        L16:
            int r4 = r5.length()
            int r4 = 78 - r4
            if (r1 >= r4) goto L26
            java.lang.String r4 = " "
            r0.append(r4)
            int r1 = r1 + 1
            goto L16
        L26:
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            e(r5)
            return
        L31:
            java.lang.String r0 = r5.substring(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            e(r0)
            java.lang.String r5 = r5.substring(r3)
            d(r5)
            return
    }

    private static void e(java.lang.String r0) {
            return
    }
}
