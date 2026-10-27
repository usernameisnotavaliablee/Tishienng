package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(double r3, double r5) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            r0 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r5 = r5 / r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1f
            double r3 = r3 / r5
            java.text.DecimalFormat r5 = new java.text.DecimalFormat
            java.lang.String r6 = "0.00"
            r5.<init>(r6)
            java.lang.String r3 = r5.format(r3)
            return r3
        L1f:
            java.lang.String r3 = "0.0"
            return r3
    }

    public static java.lang.String b(double r3, int r5) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            double r3 = (double) r3
            double r3 = r3 / r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1e
            double r0 = (double) r5
            double r0 = r0 / r3
            int r3 = (int) r0
            java.lang.String r3 = d(r3)
            return r3
        L1e:
            java.lang.String r3 = "0'0\""
            return r3
    }

    public static java.lang.String c(double r3) {
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            double r3 = (double) r3
            double r3 = r3 / r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        L1b:
            java.lang.String r3 = "0.00"
            return r3
    }

    private static java.lang.String d(int r5) {
            int r5 = r5 % 3600
            int r0 = r5 / 60
            java.lang.String r1 = "0"
            java.lang.String r2 = ""
            r3 = 9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r0 <= r3) goto L1c
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
        L17:
            java.lang.String r0 = r4.toString()
            goto L26
        L1c:
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            goto L17
        L26:
            int r5 = r5 % 60
            if (r5 <= r3) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L49
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
        L49:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = "\""
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    public static java.lang.String e(int r6) {
            int r0 = r6 / 3600
            java.lang.String r1 = "0"
            java.lang.String r2 = ""
            r3 = 9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r0 <= r3) goto L1a
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
        L15:
            java.lang.String r0 = r4.toString()
            goto L24
        L1a:
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            goto L15
        L24:
            int r6 = r6 % 3600
            int r4 = r6 / 60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            if (r4 <= r3) goto L3a
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
        L35:
            java.lang.String r4 = r5.toString()
            goto L44
        L3a:
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            goto L35
        L44:
            int r6 = r6 % 60
            if (r6 <= r3) goto L58
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            goto L67
        L58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
    }

    public static java.lang.String f() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }
}
