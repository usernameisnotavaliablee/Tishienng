package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class d3 {
    private static final java.util.regex.Pattern a = null;
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;
    private static final java.util.regex.Pattern d = null;

    static {
            java.lang.String r0 = "(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})Z"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.d3.a = r0
            java.lang.String r0 = "(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.d3.b = r0
            java.lang.String r0 = "(\\d{4})(\\d{2})(\\d{2})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.d3.c = r0
            java.lang.String r0 = "(\\d{4})(\\d{2})(\\d{2})\\d{6}Z"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.d3.d = r0
            return
    }

    public d3() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.huawei.hms.ml.scan.HmsScan.EventTime r0, int r1, int r2, int r3) {
            r0.year = r1
            r0.month = r2
            r0.day = r3
            return
    }

    static void a(java.lang.String r11, com.huawei.hms.ml.scan.HmsScan.EventTime r12) {
            java.util.regex.Pattern r0 = com.huawei.hms.scankit.p.d3.a
            java.util.regex.Matcher r0 = r0.matcher(r11)
            java.util.regex.Pattern r1 = com.huawei.hms.scankit.p.d3.b
            java.util.regex.Matcher r1 = r1.matcher(r11)
            java.util.regex.Pattern r2 = com.huawei.hms.scankit.p.d3.c
            java.util.regex.Matcher r2 = r2.matcher(r11)
            java.util.regex.Pattern r3 = com.huawei.hms.scankit.p.d3.d
            java.util.regex.Matcher r3 = r3.matcher(r11)
            boolean r4 = r0.matches()     // Catch: java.lang.NullPointerException -> Le4
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L5f
            java.lang.String r1 = r0.group(r10)     // Catch: java.lang.NullPointerException -> Le4
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r2 = r0.group(r9)     // Catch: java.lang.NullPointerException -> Le4
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r3 = r0.group(r8)     // Catch: java.lang.NullPointerException -> Le4
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NullPointerException -> Le4
            a(r12, r1, r2, r3)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r1 = r0.group(r7)     // Catch: java.lang.NullPointerException -> Le4
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r2 = r0.group(r6)     // Catch: java.lang.NullPointerException -> Le4
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r0 = r0.group(r5)     // Catch: java.lang.NullPointerException -> Le4
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NullPointerException -> Le4
            b(r12, r1, r2, r0)     // Catch: java.lang.NullPointerException -> Le4
            r12.isUTCTime = r10     // Catch: java.lang.NullPointerException -> Le4
            r12.originalValue = r11     // Catch: java.lang.NullPointerException -> Le4
            return
        L5f:
            boolean r0 = r1.matches()     // Catch: java.lang.NullPointerException -> Le4
            if (r0 == 0) goto L9e
            java.lang.String r0 = r1.group(r10)     // Catch: java.lang.NullPointerException -> Le4
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r2 = r1.group(r9)     // Catch: java.lang.NullPointerException -> Le4
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r3 = r1.group(r8)     // Catch: java.lang.NullPointerException -> Le4
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NullPointerException -> Le4
            a(r12, r0, r2, r3)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r0 = r1.group(r7)     // Catch: java.lang.NullPointerException -> Le4
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r2 = r1.group(r6)     // Catch: java.lang.NullPointerException -> Le4
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r1 = r1.group(r5)     // Catch: java.lang.NullPointerException -> Le4
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NullPointerException -> Le4
            b(r12, r0, r2, r1)     // Catch: java.lang.NullPointerException -> Le4
            r12.originalValue = r11     // Catch: java.lang.NullPointerException -> Le4
            return
        L9e:
            boolean r0 = r2.matches()     // Catch: java.lang.NullPointerException -> Le4
            if (r0 == 0) goto Lc2
            java.lang.String r0 = r2.group(r10)     // Catch: java.lang.NullPointerException -> Le4
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r1 = r2.group(r9)     // Catch: java.lang.NullPointerException -> Le4
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r2 = r2.group(r8)     // Catch: java.lang.NullPointerException -> Le4
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NullPointerException -> Le4
            a(r12, r0, r1, r2)     // Catch: java.lang.NullPointerException -> Le4
            r12.originalValue = r11     // Catch: java.lang.NullPointerException -> Le4
            return
        Lc2:
            boolean r11 = r3.matches()     // Catch: java.lang.NullPointerException -> Le4
            if (r11 == 0) goto Le3
            java.lang.String r11 = r3.group(r10)     // Catch: java.lang.NullPointerException -> Le4
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r0 = r3.group(r9)     // Catch: java.lang.NullPointerException -> Le4
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NullPointerException -> Le4
            java.lang.String r1 = r3.group(r8)     // Catch: java.lang.NullPointerException -> Le4
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NullPointerException -> Le4
            a(r12, r11, r0, r1)     // Catch: java.lang.NullPointerException -> Le4
        Le3:
            return
        Le4:
            java.lang.String r11 = "exception"
            java.lang.String r12 = "NullPointerException"
            com.huawei.hms.scankit.p.o4.b(r11, r12)
            return
    }

    private static void b(com.huawei.hms.ml.scan.HmsScan.EventTime r0, int r1, int r2, int r3) {
            r0.hours = r1
            r0.minutes = r2
            r0.seconds = r3
            return
    }
}
