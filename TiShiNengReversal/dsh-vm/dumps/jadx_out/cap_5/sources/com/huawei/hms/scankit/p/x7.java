package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class x7 extends com.huawei.hms.scankit.p.t6 {
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;
    private static final java.util.regex.Pattern d = null;
    private static final java.util.regex.Pattern e = null;
    static final java.lang.String[] f = null;

    static {
            java.lang.String r0 = "\r?\n[ \t]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.x7.b = r0
            java.lang.String r0 = "="
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.x7.c = r0
            java.lang.String r0 = ";"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.x7.d = r0
            java.lang.String r0 = "(?<!\\\\);+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.x7.e = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.huawei.hms.scankit.p.x7.f = r0
            return
    }

    public x7() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static int a(char r2) {
            r0 = 48
            if (r2 < r0) goto La
            r1 = 57
            if (r2 > r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r2 < r0) goto L15
            r0 = 102(0x66, float:1.43E-43)
            if (r2 > r0) goto L15
            int r2 = r2 + (-87)
            return r2
        L15:
            r0 = 65
            if (r2 < r0) goto L20
            r0 = 70
            if (r2 > r0) goto L20
            int r2 = r2 + (-55)
            return r2
        L20:
            r2 = -1
            return r2
    }

    static int a(int r4, java.lang.String r5, boolean r6) {
        L0:
            r0 = 10
            int r4 = r5.indexOf(r0, r4)
            if (r4 < 0) goto L37
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L25
            int r0 = r4 + 1
            char r2 = r5.charAt(r0)
            r3 = 32
            if (r2 == r3) goto L22
            char r0 = r5.charAt(r0)
            r2 = 9
            if (r0 != r2) goto L25
        L22:
            int r4 = r4 + 2
            goto L0
        L25:
            if (r6 == 0) goto L37
            boolean r0 = a(r4, r1, r5)
            if (r0 != 0) goto L34
            r0 = 2
            boolean r0 = a(r4, r0, r5)
            if (r0 == 0) goto L37
        L34:
            int r4 = r4 + 1
            goto L0
        L37:
            return r4
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
            if (r8 == 0) goto L43
            java.lang.String r1 = ";"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            if (r1 <= 0) goto L23
            r1 = 0
            r1 = r8[r1]
            r0.familyName = r1
        L23:
            int r1 = r8.length
            r2 = 1
            if (r1 <= r2) goto L2b
            r1 = r8[r2]
            r0.givenName = r1
        L2b:
            int r1 = r8.length
            r2 = 2
            if (r1 <= r2) goto L33
            r1 = r8[r2]
            r0.middleName = r1
        L33:
            int r1 = r8.length
            r2 = 3
            if (r1 <= r2) goto L3b
            r1 = r8[r2]
            r0.namePrefix = r1
        L3b:
            int r1 = r8.length
            r2 = 4
            if (r1 <= r2) goto L43
            r8 = r8[r2]
            r0.nameSuffix = r8
        L43:
            if (r9 == 0) goto L47
            r0.fullName = r9
        L47:
            return r0
    }

    private static java.lang.String a(java.lang.CharSequence r8, java.lang.String r9) {
            int r0 = r8.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 0
        Lf:
            if (r3 >= r0) goto L51
            char r4 = r8.charAt(r3)
            r5 = 10
            if (r4 == r5) goto L4e
            r6 = 13
            if (r4 == r6) goto L4e
            r7 = 61
            if (r4 == r7) goto L28
            a(r2, r9, r1)
            r1.append(r4)
            goto L4e
        L28:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto L4e
            int r4 = r3 + 1
            char r4 = r8.charAt(r4)
            if (r4 == r6) goto L4e
            if (r4 == r5) goto L4e
            int r3 = r3 + 2
            char r5 = r8.charAt(r3)
            int r4 = a(r4)
            int r5 = a(r5)
            if (r4 < 0) goto L4e
            if (r5 < 0) goto L4e
            int r4 = r4 << 4
            int r4 = r4 + r5
            r2.write(r4)
        L4e:
            int r3 = r3 + 1
            goto Lf
        L51:
            a(r2, r9, r1)
            java.lang.String r8 = r1.toString()
            return r8
    }

    private static java.lang.String a(java.lang.CharSequence r1, java.lang.String r2, boolean r3, boolean r4) {
            java.util.List r1 = b(r1, r2, r3, r4)
            java.lang.String r2 = ""
            if (r1 == 0) goto L38
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L38
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            java.lang.Object r0 = r3.get(r4)
            if (r0 == 0) goto L12
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.lang.Object r2 = r3.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        L38:
            return r2
    }

    private static void a(java.io.ByteArrayOutputStream r2, java.lang.String r3, java.lang.StringBuilder r4) {
            int r0 = r2.size()
            if (r0 <= 0) goto L28
            byte[] r0 = r2.toByteArray()
            if (r3 != 0) goto L14
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r0, r1)
            goto L22
        L14:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L1b
            r1.<init>(r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L1b
            r3 = r1
            goto L22
        L1b:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r0, r1)
        L22:
            r2.reset()
            r4.append(r3)
        L28:
            return
    }

    static void a(java.lang.String r0, boolean r1, boolean r2, java.lang.String r3, boolean r4, java.util.List<java.lang.String> r5, java.util.List<java.util.List<java.lang.String>> r6) {
            if (r1 == 0) goto L6
            java.lang.String r0 = r0.trim()
        L6:
            java.lang.String r1 = " "
            if (r2 == 0) goto L1f
            java.lang.String r0 = a(r0, r3)
            if (r4 == 0) goto L3b
            java.util.regex.Pattern r2 = com.huawei.hms.scankit.p.x7.e
            java.util.regex.Matcher r0 = r2.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r1)
            java.lang.String r0 = r0.trim()
            goto L3b
        L1f:
            if (r4 == 0) goto L2f
            java.util.regex.Pattern r2 = com.huawei.hms.scankit.p.x7.e
            java.util.regex.Matcher r0 = r2.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r1)
            java.lang.String r0 = r0.trim()
        L2f:
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.x7.b
            java.util.regex.Matcher r0 = r1.matcher(r0)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.replaceAll(r1)
        L3b:
            if (r5 != 0) goto L4a
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r1.add(r0)
            r6.add(r1)
            return
        L4a:
            r1 = 0
            r5.add(r1, r0)
            r6.add(r5)
            return
    }

    private static void a(java.lang.String[] r1, int r2, java.lang.StringBuilder r3) {
            r0 = r1[r2]
            if (r0 == 0) goto L1a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1a
            int r0 = r3.length()
            if (r0 <= 0) goto L15
            r0 = 32
            r3.append(r0)
        L15:
            r1 = r1[r2]
            r3.append(r1)
        L1a:
            return
    }

    private static boolean a(int r0, int r1, java.lang.String r2) {
            if (r0 < r1) goto Ld
            int r0 = r0 - r1
            char r0 = r2.charAt(r0)
            r1 = 61
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private static com.huawei.hms.ml.scan.HmsScan.AddressInfo[] a(java.lang.String[] r5, java.lang.String[] r6) {
            int r0 = r5.length
            int r1 = r6.length
            r2 = 0
            if (r0 == r1) goto L8
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r5 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo[r2]
            return r5
        L8:
            int r0 = r5.length
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r0 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo[r0]
        Lb:
            int r1 = r5.length
            if (r2 >= r1) goto L3f
            r1 = r6[r2]
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.huawei.hms.ml.scan.HmsScan$AddressInfo r3 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo
            int r4 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.OTHER_USE_TYPE
            r3.<init>(r1, r4)
            r1 = r5[r2]
            if (r1 == 0) goto L3a
            java.lang.String r4 = "WORK"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L2c
            int r1 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.OFFICE_TYPE
            r3.addressType = r1
            goto L3a
        L2c:
            r1 = r5[r2]
            java.lang.String r4 = "HOME"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L3a
            int r1 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.RESIDENTIAL_USE_TYPE
            r3.addressType = r1
        L3a:
            r0[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L3f:
            return r0
    }

    private static java.lang.String[] a(java.util.Collection<java.util.List<java.lang.String>> r4) {
            r0 = 0
            if (r4 == 0) goto L3e
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L3e
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.size()
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r4.next()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L17
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L17
            r1.add(r2)
            goto L17
        L35:
            java.lang.String[] r4 = com.huawei.hms.scankit.p.x7.f
            java.lang.Object[] r4 = r1.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
        L3e:
            java.lang.String[] r4 = new java.lang.String[r0]
            return r4
    }

    static java.util.List<java.util.List<java.lang.String>> b(java.lang.CharSequence r21, java.lang.String r22, boolean r23, boolean r24) {
            r0 = r22
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "(?:^|\n)"
            r2.append(r3)
            r3 = r21
            r2.append(r3)
            java.lang.String r3 = "(?:;([^:\n(?![ |\t])]*))?:"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r4 = 0
            r5 = 0
            r6 = 0
        L25:
            if (r5 >= r1) goto Lc8
            java.util.regex.Matcher r7 = r2.matcher(r0)
            if (r5 <= 0) goto L2f
            int r5 = r5 + (-1)
        L2f:
            boolean r5 = r7.find(r5)
            if (r5 != 0) goto L37
            goto Lc8
        L37:
            int r5 = r7.end(r4)
            r8 = 1
            java.lang.String r7 = r7.group(r8)
            if (r7 == 0) goto L8f
            java.util.regex.Pattern r9 = com.huawei.hms.scankit.p.x7.d
            java.lang.String[] r7 = r9.split(r7)
            int r9 = r7.length
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L4d:
            if (r10 >= r9) goto L8a
            r14 = r7[r10]
            if (r12 != 0) goto L58
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r8)
        L58:
            r12.add(r14)
            java.util.regex.Pattern r15 = com.huawei.hms.scankit.p.x7.c
            r3 = 2
            java.lang.String[] r3 = r15.split(r14, r3)
            int r14 = r3.length
            if (r14 <= r8) goto L87
            r14 = r3[r4]
            java.lang.String r15 = "ENCODING"
            boolean r14 = r15.equalsIgnoreCase(r14)
            if (r14 == 0) goto L7b
            r14 = r3[r8]
            java.lang.String r15 = "QUOTED-PRINTABLE"
            boolean r14 = r15.equalsIgnoreCase(r14)
            if (r14 == 0) goto L7b
            r11 = 1
            goto L87
        L7b:
            r14 = r3[r4]
            java.lang.String r15 = "CHARSET"
            boolean r14 = r15.equalsIgnoreCase(r14)
            if (r14 == 0) goto L87
            r13 = r3[r8]
        L87:
            int r10 = r10 + 1
            goto L4d
        L8a:
            r19 = r12
            r17 = r13
            goto L94
        L8f:
            r11 = 0
            r17 = 0
            r19 = 0
        L94:
            int r3 = a(r5, r0, r11)
            if (r3 >= 0) goto L9c
            r3 = r1
            goto Lc4
        L9c:
            if (r3 <= r5) goto Lc4
            if (r6 != 0) goto La5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r8)
        La5:
            r20 = r6
            if (r3 < r8) goto Lb5
            int r6 = r3 + (-1)
            char r6 = r0.charAt(r6)
            r7 = 13
            if (r6 != r7) goto Lb5
            int r3 = r3 + (-1)
        Lb5:
            java.lang.String r14 = r0.substring(r5, r3)
            r15 = r23
            r18 = r24
            r16 = r11
            a(r14, r15, r16, r17, r18, r19, r20)
            r6 = r20
        Lc4:
            int r5 = r3 + 1
            goto L25
        Lc8:
            return r6
    }

    private static com.huawei.hms.ml.scan.HmsScan.EmailContent[] b(java.lang.String[] r6, java.lang.String[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            r2 = 0
            if (r0 == r1) goto L8
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r6 = new com.huawei.hms.ml.scan.HmsScan.EmailContent[r2]
            return r6
        L8:
            int r0 = r6.length
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r0 = new com.huawei.hms.ml.scan.HmsScan.EmailContent[r0]
        Lb:
            int r1 = r6.length
            if (r2 >= r1) goto L3d
            com.huawei.hms.ml.scan.HmsScan$EmailContent r1 = new com.huawei.hms.ml.scan.HmsScan$EmailContent
            r3 = r7[r2]
            int r4 = com.huawei.hms.ml.scan.HmsScan.EmailContent.OTHER_USE_TYPE
            java.lang.String r5 = ""
            r1.<init>(r3, r5, r5, r4)
            r3 = r6[r2]
            if (r3 == 0) goto L38
            java.lang.String r4 = "WORK"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2a
            int r3 = com.huawei.hms.ml.scan.HmsScan.EmailContent.OFFICE_USE_TYPE
            r1.addressType = r3
            goto L38
        L2a:
            r3 = r6[r2]
            java.lang.String r4 = "HOME"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L38
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE
            r1.addressType = r3
        L38:
            r0[r2] = r1
            int r2 = r2 + 1
            goto Lb
        L3d:
            return r0
    }

    private static java.lang.String[] b(java.util.Collection<java.util.List<java.lang.String>> r8) {
            r0 = 0
            if (r8 == 0) goto L6b
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto La
            goto L6b
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r8.size()
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r8.next()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r2.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L17
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L17
            r3 = 1
        L32:
            int r4 = r2.size()
            if (r3 >= r4) goto L5d
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 61
            int r5 = r4.indexOf(r5)
            if (r5 >= 0) goto L47
            goto L5e
        L47:
            java.lang.String r6 = r4.substring(r0, r5)
            java.lang.String r7 = "TYPE"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L5a
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            goto L5e
        L5a:
            int r3 = r3 + 1
            goto L32
        L5d:
            r4 = 0
        L5e:
            r1.add(r4)
            goto L17
        L62:
            java.lang.String[] r8 = com.huawei.hms.scankit.p.x7.f
            java.lang.Object[] r8 = r1.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
        L6b:
            java.lang.String[] r8 = new java.lang.String[r0]
            return r8
    }

    private static java.lang.String c(java.lang.String r6) {
            if (r6 == 0) goto L4c
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L4c
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        Le:
            r4 = 4
            if (r2 >= r4) goto L24
            r5 = 59
            int r5 = r6.indexOf(r5, r3)
            if (r5 < 0) goto L24
            java.lang.String r3 = r6.substring(r3, r5)
            r0[r2] = r3
            int r2 = r2 + 1
            int r3 = r5 + 1
            goto Le
        L24:
            java.lang.String r6 = r6.substring(r3)
            r0[r2] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r2 = 100
            r6.<init>(r2)
            r2 = 3
            a(r0, r2, r6)
            r2 = 1
            a(r0, r2, r6)
            r2 = 2
            a(r0, r2, r6)
            a(r0, r1, r6)
            a(r0, r4, r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.trim()
            return r6
        L4c:
            r6 = 0
            return r6
    }

    private static com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[] c(java.lang.String[] r6, java.lang.String[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            r2 = 0
            if (r0 == r1) goto L8
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r6 = new com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[r2]
            return r6
        L8:
            int r0 = r6.length
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r0 = new com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[r0]
        Lb:
            int r1 = r6.length
            if (r2 >= r1) goto L5c
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r1 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OTHER_USE_TYPE
            r4 = r7[r2]
            r1.<init>(r3, r4)
            r4 = r6[r2]
            if (r4 == 0) goto L57
            java.lang.String r5 = "WORK"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L28
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OFFICE_USE_TYPE
            r1.useType = r3
            goto L57
        L28:
            r4 = r6[r2]
            java.lang.String r5 = "HOME"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L37
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE
            r1.useType = r3
            goto L57
        L37:
            r4 = r6[r2]
            java.lang.String r5 = "CELL"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L46
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE
            r1.useType = r3
            goto L57
        L46:
            r4 = r6[r2]
            java.lang.String r5 = "FAX"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L55
            int r3 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.FAX_USE_TYPE
            r1.useType = r3
            goto L57
        L55:
            r1.useType = r3
        L57:
            r0[r2] = r1
            int r2 = r2 + 1
            goto Lb
        L5c:
            return r0
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r19) {
            r18 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r19)
            java.lang.String r1 = "BEGIN:VCARD"
            boolean r1 = r0.startsWith(r1)
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "N"
            r3 = 1
            r4 = 0
            java.lang.String r1 = a(r1, r0, r3, r4)
            if (r1 == 0) goto Lce
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto Lce
            java.lang.String r5 = ";"
            java.lang.String[] r5 = r1.split(r5)
            int r5 = r5.length
            if (r5 != 0) goto L3a
            goto Lce
        L3a:
            java.lang.String r2 = "FN"
            java.lang.String r2 = a(r2, r0, r3, r4)
            if (r2 == 0) goto L4b
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L49
            goto L4b
        L49:
            r8 = r2
            goto L50
        L4b:
            java.lang.String r2 = c(r1)
            goto L49
        L50:
            java.lang.String r2 = "TEL"
            java.util.List r2 = b(r2, r0, r3, r4)
            java.lang.String r5 = "EMAIL"
            java.util.List r5 = b(r5, r0, r3, r4)
            java.lang.String r6 = "ADR"
            java.util.List r6 = b(r6, r0, r3, r3)
            java.lang.String r7 = "ORG"
            java.lang.String r12 = a(r7, r0, r3, r3)
            java.lang.String r7 = "TITLE"
            java.lang.String r11 = a(r7, r0, r3, r4)
            java.lang.String r7 = "URL"
            java.util.List r0 = b(r7, r0, r3, r4)
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r9 = new com.huawei.hms.ml.scan.HmsScan$ContactDetail
            com.huawei.hms.ml.scan.HmsScan$PeopleName r10 = a(r1, r8)
            java.lang.String[] r1 = b(r2)
            java.lang.String[] r2 = a(r2)
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r13 = c(r1, r2)
            java.lang.String[] r1 = b(r5)
            java.lang.String[] r2 = a(r5)
            com.huawei.hms.ml.scan.HmsScan$EmailContent[] r14 = b(r1, r2)
            java.lang.String[] r1 = b(r6)
            java.lang.String[] r2 = a(r6)
            com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r15 = a(r1, r2)
            java.lang.String[] r16 = a(r0)
            r17 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.huawei.hms.ml.scan.HmsScan r5 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r6 = r19.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r19.c()
            int r7 = com.huawei.hms.scankit.p.t6.a(r0)
            int r0 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
            byte[] r10 = r19.i()
            com.huawei.hms.scankit.p.u6[] r1 = r19.j()
            android.graphics.Point[] r11 = com.huawei.hms.scankit.p.t6.a(r1)
            com.huawei.hms.scankit.p.z6 r13 = new com.huawei.hms.scankit.p.z6
            r13.<init>(r9)
            r12 = 0
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        Lce:
            return r2
    }
}
