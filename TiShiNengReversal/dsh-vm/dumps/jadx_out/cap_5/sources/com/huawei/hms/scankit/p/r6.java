package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r6 {
    private static volatile com.huawei.hms.scankit.p.r6 a;

    public r6() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.scankit.p.r6 a() {
            com.huawei.hms.scankit.p.r6 r0 = com.huawei.hms.scankit.p.r6.a
            if (r0 != 0) goto L19
            java.lang.Class<com.huawei.hms.scankit.p.r6> r0 = com.huawei.hms.scankit.p.r6.class
            monitor-enter(r0)
            com.huawei.hms.scankit.p.r6 r1 = com.huawei.hms.scankit.p.r6.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.huawei.hms.scankit.p.r6 r1 = new com.huawei.hms.scankit.p.r6     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.huawei.hms.scankit.p.r6.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.huawei.hms.scankit.p.r6 r0 = com.huawei.hms.scankit.p.r6.a
            return r0
    }

    public static com.huawei.hms.ml.scan.HmsScan b() {
            android.graphics.Point r0 = new android.graphics.Point
            r1 = -2
            r0.<init>(r1, r1)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r1)
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r1, r1)
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r1, r1)
            r1 = 4
            android.graphics.Point[] r11 = new android.graphics.Point[r1]
            r1 = 0
            r11[r1] = r0
            r0 = 1
            r11[r0] = r2
            r0 = 2
            r11[r0] = r3
            r0 = 3
            r11[r0] = r4
            com.huawei.hms.ml.scan.HmsScan r5 = new com.huawei.hms.ml.scan.HmsScan
            int r7 = com.huawei.hms.ml.scan.HmsScanBase.FORMAT_UNKNOWN
            int r9 = com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM
            r12 = 0
            r13 = 0
            java.lang.String r6 = ""
            java.lang.String r8 = ""
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.huawei.hms.ml.scan.HmsScan r0 = r5.setZoomValue(r0)
            return r0
    }

    public static com.huawei.hms.scankit.p.s6 c() {
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r0.<init>(r1, r1)
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            r2.<init>(r1, r1)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            r3.<init>(r1, r1)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            r4.<init>(r1, r1)
            r1 = 4
            com.huawei.hms.scankit.p.u6[] r1 = new com.huawei.hms.scankit.p.u6[r1]
            r5 = 0
            r1[r5] = r0
            r0 = 1
            r1[r0] = r2
            r0 = 2
            r1[r0] = r3
            r0 = 3
            r1[r0] = r4
            com.huawei.hms.scankit.p.s6 r0 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.o
            java.lang.String r3 = ""
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScanResult a(byte[] r10, int r11, int r12, int r13, boolean r14, boolean r15, com.huawei.hms.scankit.p.w3 r16) {
            r9 = this;
            r6 = r16
            if (r6 == 0) goto L1c
            java.lang.String r0 = "single"
            r6.a(r0)
            int r0 = r12 * r11
            com.huawei.hms.scankit.p.w3$c r0 = r6.a(r14, r0)
            r3 = 30
            if (r12 < r3) goto L15
            if (r11 >= r3) goto L1a
        L15:
            r3 = -1005(0xfffffffffffffc13, float:NaN)
            r0.a(r3)
        L1a:
            r7 = r0
            goto L1e
        L1c:
            r0 = 0
            goto L1a
        L1e:
            java.lang.String r0 = "start decodeSingleCode"
            java.lang.String r8 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r8, r0)
            com.huawei.hms.scankit.p.x6 r0 = new com.huawei.hms.scankit.p.x6
            r4 = 1
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            com.huawei.hms.scankit.p.s6[] r0 = com.huawei.hms.scankit.p.m1.c(r10, r1)
            java.lang.String r1 = "start totalParseResult"
            com.huawei.hms.scankit.p.o4.d(r8, r1)
            com.huawei.hms.ml.scan.HmsScan[] r0 = com.huawei.hms.scankit.p.y6.a(r0)
            java.lang.String r1 = "end totalParseResult"
            com.huawei.hms.scankit.p.o4.d(r8, r1)
            if (r6 == 0) goto L47
            r6.a(r0, r7)
        L47:
            if (r15 != 0) goto L57
            java.lang.String r1 = "start hmsResultTrans"
            com.huawei.hms.scankit.p.o4.d(r8, r1)
            com.huawei.hms.ml.scan.HmsScan[] r0 = com.huawei.hms.scankit.p.w7.a(r0)
            java.lang.String r1 = "end hmsResultTrans"
            com.huawei.hms.scankit.p.o4.d(r8, r1)
        L57:
            if (r13 != 0) goto L5c
            r1 = 8191(0x1fff, float:1.1478E-41)
            goto L5d
        L5c:
            r1 = r13
        L5d:
            boolean r2 = com.huawei.hms.scankit.p.r3.d
            if (r2 == 0) goto L69
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            r2 = 4099(0x1003, float:5.744E-42)
            r1.<init>(r2, r0)
            return r1
        L69:
            boolean r2 = com.huawei.hms.scankit.p.r3.e
            if (r2 == 0) goto L75
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            r2 = 4100(0x1004, float:5.745E-42)
            r1.<init>(r2, r0)
            return r1
        L75:
            boolean r2 = com.huawei.hms.scankit.p.r3.h
            if (r2 == 0) goto L89
            int r2 = r0.length
            if (r2 != 0) goto L89
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE
            r1 = r1 & r2
            if (r1 != r2) goto L89
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            r2 = 4097(0x1001, float:5.741E-42)
            r1.<init>(r2, r0)
            return r1
        L89:
            int r1 = r0.length
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L94
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            r1.<init>(r2, r0)
            return r1
        L94:
            int r1 = r0.length
            r3 = 0
            if (r1 <= 0) goto Laa
            r1 = r0[r3]
            java.lang.String r1 = r1.getOriginalValue()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Laa
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            r1.<init>(r3, r0)
            return r1
        Laa:
            int r1 = r0.length
            if (r1 <= 0) goto Lc1
            r1 = r0[r3]
            double r4 = r1.getZoomValue()
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto Lc1
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            r2 = 4098(0x1002, float:5.743E-42)
            r1.<init>(r2, r0)
            return r1
        Lc1:
            com.huawei.hms.ml.scan.HmsScanResult r0 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r1 = new com.huawei.hms.ml.scan.HmsScan[r3]
            r0.<init>(r2, r1)
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan[] a(android.graphics.Bitmap r5, int r6, boolean r7, com.huawei.hms.scankit.p.w3 r8) {
            r4 = this;
            java.lang.String r0 = "start decodeWithBitmapWorkMulti"
            java.lang.String r1 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            if (r8 == 0) goto L30
            java.lang.String r0 = "multi"
            r8.a(r0)
            int r0 = r5.getHeight()
            int r2 = r5.getWidth()
            int r0 = r0 * r2
            com.huawei.hms.scankit.p.w3$c r0 = r8.a(r7, r0)
            int r2 = r5.getHeight()
            r3 = 30
            if (r2 < r3) goto L2a
            int r2 = r5.getWidth()
            if (r2 >= r3) goto L31
        L2a:
            r2 = -1005(0xfffffffffffffc13, float:NaN)
            r0.a(r2)
            goto L31
        L30:
            r0 = 0
        L31:
            java.lang.String r2 = "end decodeWithBitmapWorkMulti"
            com.huawei.hms.scankit.p.o4.d(r1, r2)
            com.huawei.hms.scankit.p.x6 r2 = new com.huawei.hms.scankit.p.x6
            r2.<init>(r6, r7)
            com.huawei.hms.scankit.p.s6[] r5 = com.huawei.hms.scankit.p.m1.a(r5, r2)
            java.lang.String r6 = "start totalParseResult"
            com.huawei.hms.scankit.p.o4.d(r1, r6)
            com.huawei.hms.ml.scan.HmsScan[] r5 = com.huawei.hms.scankit.p.y6.a(r5)
            java.lang.String r6 = "end totalParseResult"
            com.huawei.hms.scankit.p.o4.d(r1, r6)
            if (r8 == 0) goto L52
            r8.a(r5, r0)
        L52:
            return r5
    }

    public com.huawei.hms.ml.scan.HmsScan[] a(java.nio.ByteBuffer r9, int r10, int r11, int r12, boolean r13, com.huawei.hms.scankit.p.w3 r14) {
            r8 = this;
            if (r14 == 0) goto L27
            java.lang.String r0 = "multi"
            r14.a(r0)
            int r0 = r11 * r10
            com.huawei.hms.scankit.p.w3$c r1 = r14.a(r13, r0)
            r2 = 30
            if (r10 < r2) goto L21
            if (r11 >= r2) goto L14
            goto L21
        L14:
            byte[] r2 = r9.array()
            int r2 = r2.length
            if (r2 >= r0) goto L28
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            r1.a(r0)
            goto L28
        L21:
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            r1.a(r0)
            goto L28
        L27:
            r1 = 0
        L28:
            com.huawei.hms.scankit.p.x6 r2 = new com.huawei.hms.scankit.p.x6
            r6 = 1
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            com.huawei.hms.scankit.p.s6[] r9 = com.huawei.hms.scankit.p.m1.a(r9, r2)
            com.huawei.hms.ml.scan.HmsScan[] r9 = com.huawei.hms.scankit.p.y6.a(r9)
            if (r14 == 0) goto L3f
            r14.a(r9, r1)
        L3f:
            return r9
    }

    public com.huawei.hms.ml.scan.HmsScan[] b(android.graphics.Bitmap r4, int r5, boolean r6, com.huawei.hms.scankit.p.w3 r7) {
            r3 = this;
            if (r7 == 0) goto L29
            java.lang.String r0 = "single"
            r7.a(r0)
            int r0 = r4.getHeight()
            int r1 = r4.getWidth()
            int r0 = r0 * r1
            com.huawei.hms.scankit.p.w3$c r0 = r7.a(r6, r0)
            int r1 = r4.getHeight()
            r2 = 30
            if (r1 < r2) goto L23
            int r1 = r4.getWidth()
            if (r1 >= r2) goto L2a
        L23:
            r1 = -1005(0xfffffffffffffc13, float:NaN)
            r0.a(r1)
            goto L2a
        L29:
            r0 = 0
        L2a:
            com.huawei.hms.scankit.p.x6 r1 = new com.huawei.hms.scankit.p.x6
            r1.<init>(r5, r6)
            com.huawei.hms.scankit.p.s6[] r4 = com.huawei.hms.scankit.p.m1.b(r4, r1)
            java.lang.String r5 = "Scankit"
            java.lang.String r6 = "start totalParseResult"
            com.huawei.hms.scankit.p.o4.d(r5, r6)
            com.huawei.hms.ml.scan.HmsScan[] r4 = com.huawei.hms.scankit.p.y6.a(r4)
            if (r7 == 0) goto L43
            r7.a(r4, r0)
        L43:
            return r4
    }
}
