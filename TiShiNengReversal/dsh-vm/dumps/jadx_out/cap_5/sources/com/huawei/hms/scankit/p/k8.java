package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k8 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    static final java.lang.String[] c = null;

    static {
            java.lang.String r0 = "WIFI:[^:]"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.k8.b = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.huawei.hms.scankit.p.k8.c = r0
            return
    }

    public k8() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(java.lang.CharSequence r3, int r4) {
            int r4 = r4 + (-1)
            r0 = 0
        L3:
            if (r4 < 0) goto L12
            char r1 = r3.charAt(r4)
            r2 = 92
            if (r1 != r2) goto L12
            int r0 = r0 + 1
            int r4 = r4 + (-1)
            goto L3
        L12:
            return r0
    }

    static java.lang.String[] a(java.lang.String r8, java.lang.String r9, char r10, boolean r11) {
            int r0 = r9.length()
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
        L8:
            if (r3 >= r0) goto L52
            int r3 = r9.indexOf(r8, r3)
            if (r3 >= 0) goto L11
            goto L52
        L11:
            int r5 = r8.length()
            int r3 = r3 + r5
            r5 = 1
            r5 = r4
            r6 = 1
            r4 = r3
        L1a:
            if (r6 == 0) goto L4f
            int r4 = r9.indexOf(r10, r4)
            if (r4 >= 0) goto L28
            int r4 = r9.length()
        L26:
            r6 = 0
            goto L1a
        L28:
            int r7 = a(r9, r4)
            int r7 = r7 % 2
            if (r7 == 0) goto L33
            int r4 = r4 + 1
            goto L1a
        L33:
            if (r5 != 0) goto L3b
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 3
            r5.<init>(r6)
        L3b:
            java.lang.String r6 = r9.substring(r3, r4)
            java.lang.String r6 = com.huawei.hms.scankit.p.t6.b(r6)
            if (r11 == 0) goto L49
            java.lang.String r6 = r6.trim()
        L49:
            r5.add(r6)
            int r4 = r4 + 1
            goto L26
        L4f:
            r3 = r4
            r4 = r5
            goto L8
        L52:
            if (r4 != 0) goto L55
            return r1
        L55:
            java.lang.String[] r8 = com.huawei.hms.scankit.p.k8.c
            java.lang.Object[] r8 = r4.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    private java.lang.String b(java.lang.String r1, java.lang.String r2, char r3, boolean r4) {
            r0 = this;
            java.lang.String[] r1 = a(r1, r2, r3, r4)
            if (r1 == 0) goto L10
            int r2 = r1.length
            if (r2 == 0) goto L10
            r2 = 0
            r1 = r1[r2]
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            return r1
        L10:
            java.lang.String r1 = ""
            return r1
    }

    private static int c(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "WEP"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto Le
            r3 = 2
            return r3
        Le:
            java.lang.String r1 = "WPA"
            boolean r1 = r3.equalsIgnoreCase(r1)
            java.lang.String r2 = "WPA2"
            boolean r2 = r3.equalsIgnoreCase(r2)
            r1 = r1 | r2
            java.lang.String r2 = "WPA/WPA2"
            boolean r2 = r3.equalsIgnoreCase(r2)
            r1 = r1 | r2
            java.lang.String r2 = "WPA2/WPA"
            boolean r2 = r3.equalsIgnoreCase(r2)
            r1 = r1 | r2
            if (r1 == 0) goto L2d
            r3 = 1
            return r3
        L2d:
            java.lang.String r1 = "SAE"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 == 0) goto L37
            r3 = 3
            return r3
        L37:
            return r0
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r15) {
            r14 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r15)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.k8.b
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r3 = r1.find()
            if (r3 == 0) goto Lb5
            int r1 = r1.start()
            if (r1 == 0) goto L20
            goto Lb5
        L20:
            r1 = 5
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = ";"
            boolean r3 = r0.endsWith(r1)
            if (r3 != 0) goto L3c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
        L3c:
            java.lang.String r1 = "S:"
            r3 = 59
            r4 = 0
            java.lang.String r1 = r14.b(r1, r0, r3, r4)
            if (r1 == 0) goto Lb5
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L4e
            goto Lb5
        L4e:
            java.lang.String r2 = "P:"
            java.lang.String r2 = r14.b(r2, r0, r3, r4)
            java.lang.String r5 = "T:"
            java.lang.String r0 = r14.b(r5, r0, r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            if (r2 == 0) goto L7d
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L6b
            goto L7d
        L6b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            goto L7f
        L7d:
            java.lang.String r4 = ""
        L7f:
            r3.append(r4)
            java.lang.String r8 = r3.toString()
            com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo r3 = new com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo
            int r0 = c(r0)
            r3.<init>(r1, r2, r0)
            com.huawei.hms.ml.scan.HmsScan r5 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r6 = r15.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r15.c()
            int r7 = com.huawei.hms.scankit.p.t6.a(r0)
            int r9 = com.huawei.hms.ml.scan.HmsScan.WIFI_CONNECT_INFO_FORM
            byte[] r10 = r15.i()
            com.huawei.hms.scankit.p.u6[] r15 = r15.j()
            android.graphics.Point[] r11 = com.huawei.hms.scankit.p.t6.a(r15)
            com.huawei.hms.scankit.p.z6 r13 = new com.huawei.hms.scankit.p.z6
            r13.<init>(r3)
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        Lb5:
            return r2
    }
}
