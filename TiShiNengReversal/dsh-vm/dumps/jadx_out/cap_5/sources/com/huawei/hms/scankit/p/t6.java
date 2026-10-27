package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class t6 {
    private static final android.util.SparseArray<java.lang.Integer> a = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            com.huawei.hms.scankit.p.t6.a = r0
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.a
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.AZTEC_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.b
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.CODABAR_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.c
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.CODE39_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.d
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.CODE93_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.e
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.f
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.DATAMATRIX_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.EAN8_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.i
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.ITF14_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.PDF417_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_A_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_E_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.q
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.WX_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.p
            int r1 = r1.ordinal()
            int r2 = com.huawei.hms.ml.scan.HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    public t6() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1) {
            if (r1 != 0) goto L5
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.FORMAT_UNKNOWN
            return r1
        L5:
            android.util.SparseArray<java.lang.Integer> r0 = com.huawei.hms.scankit.p.t6.a
            int r1 = r1.ordinal()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L16
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.FORMAT_UNKNOWN
            return r1
        L16:
            int r1 = r1.intValue()
            return r1
    }

    protected static java.lang.String a(com.huawei.hms.scankit.p.s6 r1) {
            java.lang.String r1 = r1.k()
            if (r1 != 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            java.lang.String r0 = "\ufeff"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L16
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
        L16:
            return r1
    }

    protected static java.lang.String a(java.lang.String r3) {
            if (r3 != 0) goto L3
            return r3
        L3:
            int r0 = r3.length()
        L7:
            if (r0 <= 0) goto L16
            int r1 = r0 + (-1)
            char r1 = r3.charAt(r1)
            r2 = 32
            if (r1 > r2) goto L16
            int r0 = r0 + (-1)
            goto L7
        L16:
            int r1 = r3.length()
            if (r0 >= r1) goto L21
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L21:
            return r3
    }

    public static android.graphics.Point[] a(com.huawei.hms.scankit.p.u6[] r5) {
            r0 = 0
            if (r5 == 0) goto L2a
            int r1 = r5.length
            if (r1 > 0) goto L7
            goto L2a
        L7:
            int r1 = r5.length
            android.graphics.Point[] r1 = new android.graphics.Point[r1]
        La:
            int r2 = r5.length
            if (r0 >= r2) goto L29
            r2 = r5[r0]
            if (r2 == 0) goto L26
            android.graphics.Point r2 = new android.graphics.Point
            r3 = r5[r0]
            float r3 = r3.b()
            int r3 = (int) r3
            r4 = r5[r0]
            float r4 = r4.c()
            int r4 = (int) r4
            r2.<init>(r3, r4)
            r1[r0] = r2
        L26:
            int r0 = r0 + 1
            goto La
        L29:
            return r1
        L2a:
            android.graphics.Point[] r5 = new android.graphics.Point[r0]
            return r5
    }

    protected static java.lang.String b(java.lang.String r7) {
            r0 = 92
            int r1 = r7.indexOf(r0)
            if (r1 >= 0) goto L9
            return r7
        L9:
            int r2 = r7.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r2 + (-1)
            r3.<init>(r4)
            char[] r4 = r7.toCharArray()
            r5 = 0
            r3.append(r4, r5, r1)
            r4 = 0
        L1d:
            if (r1 >= r2) goto L31
            char r6 = r7.charAt(r1)
            if (r4 != 0) goto L2a
            if (r6 == r0) goto L28
            goto L2a
        L28:
            r4 = 1
            goto L2e
        L2a:
            r3.append(r6)
            r4 = 0
        L2e:
            int r1 = r1 + 1
            goto L1d
        L31:
            java.lang.String r7 = r3.toString()
            return r7
    }

    public abstract com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r1);
}
