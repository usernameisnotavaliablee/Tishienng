package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x {
    static com.amap.api.col.s.g3 a;

    public x() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(com.amap.api.services.core.AMapException r4) {
            if (r4 == 0) goto L3b
            int r0 = r4.getErrorLevel()
            if (r0 != 0) goto L2a
            int r4 = r4.getErrorCode()
            if (r4 != 0) goto L11
            java.lang.String r4 = "4"
            return r4
        L11:
            double r0 = (double) r4
            double r0 = java.lang.Math.log10(r0)
            double r0 = java.lang.Math.floor(r0)
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            int r0 = (int) r0
            int r4 = r4 % r0
            int r0 = r0 * 4
            int r4 = r4 + r0
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = r4.getErrorCode()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L3b:
            r4 = 0
            return r4
    }

    private static java.lang.String b(java.lang.String r3, long r4, boolean r6) {
            java.lang.String r0 = ","
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "{"
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "\"RequestPath\":\""
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "\""
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            r1.append(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "\"ResponseTime\":"
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            r1.append(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "\"Success\":"
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            r1.append(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "}"
            r1.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L39
            return r3
        L39:
            r3 = move-exception
            java.lang.String r4 = "StatisticsUtil"
            java.lang.String r5 = "generateNetWorkResponseStatisticsEntity"
            com.amap.api.col.s.j4.i(r3, r4, r5)
            r3 = 0
            return r3
    }

    private static java.lang.String c(java.lang.String r6, boolean r7) {
            java.lang.String r0 = ","
            java.lang.String r1 = "\""
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            int r2 = r6.indexOf(r2)     // Catch: java.lang.Throwable -> L58
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L58
            if (r2 <= 0) goto L20
            r5 = 0
            java.lang.String r5 = r6.substring(r5, r2)     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + 1
            if (r2 >= r4) goto L1f
            java.lang.String r3 = r6.substring(r2)     // Catch: java.lang.Throwable -> L58
        L1f:
            r6 = r5
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "{"
            r2.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "\"RequestPath\":\""
            r2.append(r4)     // Catch: java.lang.Throwable -> L58
            r2.append(r6)     // Catch: java.lang.Throwable -> L58
            r2.append(r1)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "\"RequestParm\":\""
            r2.append(r6)     // Catch: java.lang.Throwable -> L58
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            r2.append(r1)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "\"IsCacheRequest\":"
            r2.append(r6)     // Catch: java.lang.Throwable -> L58
            r2.append(r7)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "}"
            r2.append(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L58
            return r6
        L58:
            r6 = move-exception
            java.lang.String r7 = "StatisticsUtil"
            java.lang.String r0 = "generateNetWorkResponseStatisticsEntity"
            com.amap.api.col.s.j4.i(r6, r7, r0)
            r6 = 0
            return r6
    }

    public static void d(android.content.Context r1, java.lang.String r2, long r3, boolean r5) {
            java.lang.String r2 = b(r2, r3, r5)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L28
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L29
            if (r3 > 0) goto Ld
            goto L28
        Ld:
            com.amap.api.col.s.g3 r3 = com.amap.api.col.s.x.a     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L1e
            com.amap.api.col.s.g3 r3 = new com.amap.api.col.s.g3     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "sea"
            java.lang.String r5 = "9.7.0"
            java.lang.String r0 = "O002"
            r3.<init>(r1, r4, r5, r0)     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.x.a = r3     // Catch: java.lang.Throwable -> L29
        L1e:
            com.amap.api.col.s.g3 r3 = com.amap.api.col.s.x.a     // Catch: java.lang.Throwable -> L29
            r3.a(r2)     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.g3 r2 = com.amap.api.col.s.x.a     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.h3.d(r2, r1)     // Catch: java.lang.Throwable -> L29
        L28:
            return
        L29:
            r1 = move-exception
            java.lang.String r2 = "StatisticsUtil"
            java.lang.String r3 = "recordResponseAction"
            com.amap.api.col.s.j4.i(r1, r2, r3)
            return
    }

    public static void e(android.content.Context r3, java.lang.String r4, boolean r5) {
            java.lang.String r4 = c(r4, r5)     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L1e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L1f
            if (r5 > 0) goto Ld
            goto L1e
        Ld:
            com.amap.api.col.s.g3 r5 = new com.amap.api.col.s.g3     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "sea"
            java.lang.String r1 = "9.7.0"
            java.lang.String r2 = "O006"
            r5.<init>(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L1f
            r5.a(r4)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.s.h3.d(r5, r3)     // Catch: java.lang.Throwable -> L1f
        L1e:
            return
        L1f:
            r3 = move-exception
            java.lang.String r4 = "StatisticsUtil"
            java.lang.String r5 = "recordResponseAction"
            com.amap.api.col.s.j4.i(r3, r4, r5)
            return
    }

    public static void f(java.lang.String r2, java.lang.String r3, com.amap.api.services.core.AMapException r4) {
            if (r2 == 0) goto L1b
            java.lang.String r0 = r4.getErrorType()
            java.lang.String r4 = a(r4)
            if (r4 == 0) goto L1b
            int r1 = r4.length()
            if (r1 > 0) goto L13
            goto L1b
        L13:
            r1 = 1
            com.amap.api.col.s.i1 r1 = com.amap.api.col.s.i4.a(r1)
            com.amap.api.col.s.g2.i(r1, r2, r0, r3, r4)
        L1b:
            return
    }
}
