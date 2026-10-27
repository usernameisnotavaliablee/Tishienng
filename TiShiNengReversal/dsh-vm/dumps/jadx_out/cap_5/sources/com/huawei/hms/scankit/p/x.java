package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class x extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;

    static {
            java.lang.String r0 = "(?:BIZCARD:)([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.x.b = r0
            return
    }

    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.huawei.hms.ml.scan.HmsScan.PeopleName a(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            com.huawei.hms.ml.scan.HmsScan$PeopleName r0 = new com.huawei.hms.ml.scan.HmsScan$PeopleName
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.givenName = r8
            r0.familyName = r9
            r0.fullName = r10
            return r0
    }

    private static java.lang.String a(java.lang.String[] r4, java.lang.String r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1c
            r2 = r4[r1]
            boolean r3 = r2.startsWith(r5)
            if (r3 == 0) goto L19
            int r4 = r5.length()
            java.lang.String r4 = r2.substring(r4)
            java.lang.String r4 = com.huawei.hms.scankit.p.t6.b(r4)
            return r4
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            java.lang.String r4 = ""
            return r4
    }

    private static com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[] b(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r0 = new com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[r0]
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 3
            r1.<init>(r2)
            if (r4 == 0) goto L1b
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L1b
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r2 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OFFICE_USE_TYPE
            r2.<init>(r3, r4)
            r1.add(r2)
        L1b:
            if (r5 == 0) goto L2d
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L2d
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r4 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber
            int r2 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.FAX_USE_TYPE
            r4.<init>(r2, r5)
            r1.add(r4)
        L2d:
            if (r6 == 0) goto L3f
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L3f
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r4 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber
            int r5 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE
            r4.<init>(r5, r6)
            r1.add(r4)
        L3f:
            java.lang.Object[] r4 = r1.toArray(r0)
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r4 = (com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[]) r4
            return r4
    }

    private static com.huawei.hms.ml.scan.HmsScan.AddressInfo[] c(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1a
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L1a
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.huawei.hms.ml.scan.HmsScan$AddressInfo r1 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo
            int r2 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.OTHER_USE_TYPE
            r1.<init>(r3, r2)
            r3 = 1
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r3 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo[r3]
            r3[r0] = r1
            return r3
        L1a:
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r3 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo[r0]
            return r3
    }

    private static com.huawei.hms.ml.scan.HmsScan.EmailContent[] d(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L18
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L18
            com.huawei.hms.ml.scan.HmsScan$EmailContent r1 = new com.huawei.hms.ml.scan.HmsScan$EmailContent
            int r2 = com.huawei.hms.ml.scan.HmsScan.EmailContent.OTHER_USE_TYPE
            java.lang.String r3 = ""
            r1.<init>(r4, r3, r3, r2)
            r4 = 1
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r4 = new com.huawei.hms.ml.scan.HmsScan.EmailContent[r4]
            r4[r0] = r1
            return r4
        L18:
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r4 = new com.huawei.hms.ml.scan.HmsScan.EmailContent[r0]
            return r4
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r18) {
            r17 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r18)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.x.b
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.matches()
            if (r1 != 0) goto L19
            return r2
        L19:
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.String r1 = "(?<=(?<!\\\\)(?:\\\\\\\\){0,100});"
            java.lang.String[] r0 = r0.split(r1)
            java.lang.String r1 = "N:"
            java.lang.String r1 = a(r0, r1)
            java.lang.String r2 = "X:"
            java.lang.String r2 = a(r0, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = r3.trim()
            java.lang.String r3 = "T:"
            java.lang.String r10 = a(r0, r3)
            java.lang.String r3 = "C:"
            java.lang.String r11 = a(r0, r3)
            java.lang.String r3 = "A:"
            java.lang.String r3 = a(r0, r3)
            java.lang.String r4 = "B:"
            java.lang.String r4 = a(r0, r4)
            java.lang.String r5 = "M:"
            java.lang.String r5 = a(r0, r5)
            java.lang.String r6 = "F:"
            java.lang.String r6 = a(r0, r6)
            java.lang.String r8 = "E:"
            java.lang.String r0 = a(r0, r8)
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r8 = new com.huawei.hms.ml.scan.HmsScan$ContactDetail
            com.huawei.hms.ml.scan.HmsScan$PeopleName r9 = a(r1, r2, r7)
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r12 = b(r4, r6, r5)
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r13 = d(r0)
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r14 = c(r3)
            r0 = 0
            java.lang.String[] r15 = new java.lang.String[r0]
            r16 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.huawei.hms.ml.scan.HmsScan r4 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r5 = r18.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r18.c()
            int r6 = com.huawei.hms.scankit.p.t6.a(r0)
            int r0 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
            byte[] r9 = r18.i()
            com.huawei.hms.scankit.p.u6[] r1 = r18.j()
            android.graphics.Point[] r10 = com.huawei.hms.scankit.p.t6.a(r1)
            com.huawei.hms.scankit.p.z6 r12 = new com.huawei.hms.scankit.p.z6
            r12.<init>(r8)
            r11 = 0
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
    }
}
