package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    static final java.lang.String[] c = null;

    static {
            java.lang.String r0 = "(?:MECARD:)([\\s\\S]+)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.huawei.hms.scankit.p.c.b = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.huawei.hms.scankit.p.c.c = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.huawei.hms.ml.scan.HmsScan.PeopleName a(java.lang.String r8, java.lang.String r9) {
            com.huawei.hms.ml.scan.HmsScan$PeopleName r0 = new com.huawei.hms.ml.scan.HmsScan$PeopleName
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.spelling = r9
            java.lang.String r9 = ","
            int r1 = r8.indexOf(r9)
            r2 = 0
            java.lang.String r3 = " "
            r4 = 1
            if (r1 >= 0) goto L36
            r0.fullName = r8
            java.lang.String[] r8 = r8.split(r3)
            int r9 = r8.length
            if (r9 <= 0) goto L2e
            r9 = r8[r2]
            r0.givenName = r9
        L2e:
            int r9 = r8.length
            if (r9 <= r4) goto L35
            r8 = r8[r4]
            r0.familyName = r8
        L35:
            return r0
        L36:
            java.lang.String r2 = r8.substring(r2, r1)
            r0.familyName = r2
            int r1 = r1 + r4
            int r9 = r8.indexOf(r9, r1)
            if (r9 >= 0) goto L4a
            java.lang.String r8 = r8.substring(r1)
            r0.givenName = r8
            goto L50
        L4a:
            java.lang.String r8 = r8.substring(r1, r9)
            r0.givenName = r8
        L50:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.givenName
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = r0.familyName
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.fullName = r8
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

    private static com.huawei.hms.ml.scan.HmsScan.AddressInfo[] a(java.lang.String[] r5) {
            r0 = 0
            if (r5 == 0) goto L1f
            int r1 = r5.length
            if (r1 == 0) goto L1f
            int r1 = r5.length
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r1 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo[r1]
        L9:
            int r2 = r5.length
            if (r0 >= r2) goto L1e
            r2 = r5[r0]
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.huawei.hms.ml.scan.HmsScan$AddressInfo r3 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo
            int r4 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.OTHER_USE_TYPE
            r3.<init>(r2, r4)
            r1[r0] = r3
            int r0 = r0 + 1
            goto L9
        L1e:
            return r1
        L1f:
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r5 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo[r0]
            return r5
    }

    private static com.huawei.hms.ml.scan.HmsScan.EmailContent[] b(java.lang.String[] r6) {
            r0 = 0
            if (r6 == 0) goto L1d
            int r1 = r6.length
            if (r1 == 0) goto L1d
            int r1 = r6.length
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r1 = new com.huawei.hms.ml.scan.HmsScan.EmailContent[r1]
        L9:
            int r2 = r6.length
            if (r0 >= r2) goto L1c
            com.huawei.hms.ml.scan.HmsScan$EmailContent r2 = new com.huawei.hms.ml.scan.HmsScan$EmailContent
            r3 = r6[r0]
            int r4 = com.huawei.hms.ml.scan.HmsScan.EmailContent.OTHER_USE_TYPE
            java.lang.String r5 = ""
            r2.<init>(r3, r5, r5, r4)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L9
        L1c:
            return r1
        L1d:
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r6 = new com.huawei.hms.ml.scan.HmsScan.EmailContent[r0]
            return r6
    }

    private static java.lang.String[] b(java.lang.String[] r5, java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L24
            r3 = r5[r2]
            boolean r4 = r3.startsWith(r6)
            if (r4 == 0) goto L21
            int r4 = r6.length()
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = com.huawei.hms.scankit.p.t6.b(r3)
            r0.add(r3)
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            java.lang.String[] r5 = com.huawei.hms.scankit.p.c.c
            java.lang.Object[] r5 = r0.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            return r5
    }

    private static com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[] c(java.lang.String[] r5) {
            r0 = 0
            if (r5 == 0) goto L1b
            int r1 = r5.length
            if (r1 == 0) goto L1b
            int r1 = r5.length
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r1 = new com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[r1]
        L9:
            int r2 = r5.length
            if (r0 >= r2) goto L1a
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r2 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OTHER_USE_TYPE
            r4 = r5[r0]
            r2.<init>(r3, r4)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L9
        L1a:
            return r1
        L1b:
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r5 = new com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[r0]
            return r5
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r17) {
            r16 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r17)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.c.b
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
            int r3 = r1.length()
            if (r3 != 0) goto L31
            return r2
        L31:
            java.lang.String r2 = "TEL:"
            java.lang.String[] r2 = b(r0, r2)
            java.lang.String r3 = "EMAIL:"
            java.lang.String[] r3 = b(r0, r3)
            java.lang.String r4 = "ADR:"
            java.lang.String[] r4 = b(r0, r4)
            java.lang.String r5 = "URL:"
            java.lang.String[] r13 = b(r0, r5)
            java.lang.String r5 = "SOUND:"
            java.lang.String r5 = a(r0, r5)
            java.lang.String r6 = "ORG:"
            java.lang.String r9 = a(r0, r6)
            java.lang.String r6 = "NOTE:"
            java.lang.String r14 = a(r0, r6)
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r6 = new com.huawei.hms.ml.scan.HmsScan$ContactDetail
            com.huawei.hms.ml.scan.HmsScan$PeopleName r7 = a(r1, r5)
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r10 = c(r2)
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r11 = b(r3)
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r12 = a(r4)
            java.lang.String r8 = ""
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            com.huawei.hms.ml.scan.HmsScan r7 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r8 = r17.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r17.c()
            int r9 = com.huawei.hms.scankit.p.t6.a(r0)
            com.huawei.hms.ml.scan.HmsScan$PeopleName r0 = r6.peopleName
            java.lang.String r10 = r0.fullName
            int r11 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
            byte[] r12 = r17.i()
            com.huawei.hms.scankit.p.u6[] r0 = r17.j()
            android.graphics.Point[] r13 = com.huawei.hms.scankit.p.t6.a(r0)
            com.huawei.hms.scankit.p.z6 r15 = new com.huawei.hms.scankit.p.z6
            r15.<init>(r6)
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
    }
}
