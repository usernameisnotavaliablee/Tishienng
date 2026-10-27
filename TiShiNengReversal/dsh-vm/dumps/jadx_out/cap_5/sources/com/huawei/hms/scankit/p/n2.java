package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n2 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.List<java.lang.String> c = null;
    private java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.util.ArrayList<java.lang.String> {
        a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.add(r0)
                java.lang.String r0 = "DCT"
                r1.add(r0)
                java.lang.String r0 = "DAD"
                r1.add(r0)
                java.lang.String r0 = "DCS"
                r1.add(r0)
                java.lang.String r0 = "DBC"
                r1.add(r0)
                java.lang.String r0 = "DBB"
                r1.add(r0)
                java.lang.String r0 = "DAG"
                r1.add(r0)
                java.lang.String r0 = "DAI"
                r1.add(r0)
                java.lang.String r0 = "DAJ"
                r1.add(r0)
                java.lang.String r0 = "DAK"
                r1.add(r0)
                java.lang.String r0 = "DAQ"
                r1.add(r0)
                java.lang.String r0 = "DCG"
                r1.add(r0)
                java.lang.String r0 = "DBD"
                r1.add(r0)
                java.lang.String r0 = "DBA"
                r1.add(r0)
                return
        }
    }

    static {
            com.huawei.hms.scankit.p.n2$a r0 = new com.huawei.hms.scankit.p.n2$a
            r0.<init>()
            com.huawei.hms.scankit.p.n2.c = r0
            return
    }

    public n2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.b = r0
            return
    }

    public com.huawei.hms.ml.scan.HmsScan.DriverInfo a(java.lang.String[] r43, java.lang.String r44) {
            r42 = this;
            r0 = r43
            r1 = 14
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = ""
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 2
            r1[r5] = r3
            r6 = 3
            r1[r6] = r3
            r7 = 4
            r1[r7] = r3
            r8 = 5
            r1[r8] = r3
            r9 = 6
            r1[r9] = r3
            r10 = 7
            r1[r10] = r3
            r11 = 8
            r1[r11] = r3
            r12 = 9
            r1[r12] = r3
            r13 = 10
            r1[r13] = r3
            r14 = 11
            r1[r14] = r3
            r15 = 12
            r1[r15] = r3
            r16 = 13
            r1[r16] = r3
            r1[r2] = r44
            int r3 = r0.length
            r4 = 0
            r17 = 1
            r18 = 0
        L40:
            r19 = 0
            if (r4 >= r3) goto L72
            r20 = 2
            r5 = r0[r4]
            r21 = 4
            int r7 = r5.length()
            if (r7 > r6) goto L51
            return r19
        L51:
            java.util.List<java.lang.String> r7 = com.huawei.hms.scankit.p.n2.c
            r22 = 5
            java.lang.String r8 = r5.substring(r2, r6)
            int r7 = r7.indexOf(r8)
            r8 = -1
            if (r7 == r8) goto L6c
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r5 = r5.trim()
            r1[r7] = r5
            r18 = 1
        L6c:
            int r4 = r4 + 1
            r5 = 2
            r7 = 4
            r8 = 5
            goto L40
        L72:
            r20 = 2
            r21 = 4
            r22 = 5
            if (r18 == 0) goto Lc8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r1[r2]
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            r4 = r1[r6]
            r0.append(r4)
            r0.append(r3)
            r3 = r1[r17]
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = r42
            r3.b = r0
            com.huawei.hms.ml.scan.HmsScan$DriverInfo r23 = new com.huawei.hms.ml.scan.HmsScan$DriverInfo
            r24 = r1[r2]
            r25 = r1[r17]
            r26 = r1[r20]
            r27 = r1[r6]
            r28 = r1[r21]
            r29 = r1[r22]
            r30 = r1[r9]
            r31 = r1[r10]
            r32 = r1[r11]
            r33 = r1[r12]
            r34 = r1[r13]
            r35 = r1[r14]
            r36 = r1[r15]
            r37 = r1[r16]
            r40 = 0
            r41 = 0
            r38 = 0
            r39 = 0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            return r23
        Lc8:
            r3 = r42
            return r19
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r13) {
            r12 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r13)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.lang.String r1 = "@"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L88
            int r1 = r0.length()
            r3 = 34
            if (r1 <= r3) goto L88
            r1 = 4
            r3 = 8
            java.lang.String r1 = r0.substring(r1, r3)
            java.lang.String r3 = "ANSI"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L88
            r1 = 1
            char r1 = r0.charAt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3 = 3
            char r3 = r0.charAt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 21
            r5 = 23
            java.lang.String r4 = r0.substring(r4, r5)
            int r5 = r0.indexOf(r4, r5)
            int r5 = r5 + 2
            java.lang.String r0 = r0.substring(r5)
            java.lang.String[] r0 = r0.split(r3)
            r3 = 0
            r0 = r0[r3]
            java.lang.String[] r0 = r0.split(r1)
            com.huawei.hms.ml.scan.HmsScan$DriverInfo r0 = r12.a(r0, r4)
            if (r0 == 0) goto L88
            com.huawei.hms.ml.scan.HmsScan r3 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r4 = r13.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = r13.c()
            int r5 = com.huawei.hms.scankit.p.t6.a(r1)
            java.lang.String r6 = r12.b
            int r7 = com.huawei.hms.ml.scan.HmsScan.DRIVER_INFO_FORM
            byte[] r8 = r13.i()
            com.huawei.hms.scankit.p.u6[] r13 = r13.j()
            android.graphics.Point[] r9 = com.huawei.hms.scankit.p.t6.a(r13)
            com.huawei.hms.scankit.p.z6 r11 = new com.huawei.hms.scankit.p.z6
            r11.<init>(r0)
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        L88:
            return r2
    }
}
