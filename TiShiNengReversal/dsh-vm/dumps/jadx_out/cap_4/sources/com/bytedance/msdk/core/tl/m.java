package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long j(long r12) {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            int r1 = r0.getMinutes()
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto L46
            r2 = 30
            if (r1 > r2) goto L2c
            java.util.Date r3 = new java.util.Date
            int r4 = r0.getYear()
            int r5 = r0.getMonth()
            int r6 = r0.getDate()
            int r7 = r0.getHours()
            r8 = 0
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L5e
        L2c:
            java.util.Date r4 = new java.util.Date
            int r5 = r0.getYear()
            int r6 = r0.getMonth()
            int r7 = r0.getDate()
            int r8 = r0.getHours()
            r9 = 30
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = r4
            goto L5e
        L46:
            java.util.Date r5 = new java.util.Date
            int r6 = r0.getYear()
            int r7 = r0.getMonth()
            int r8 = r0.getDate()
            int r9 = r0.getHours()
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3 = r5
        L5e:
            long r0 = r3.getTime()
            long r12 = j(r0, r12)
            return r12
    }

    private static long j(long r4, long r6) {
            java.util.Date r0 = new java.util.Date
            long r6 = r6 + r4
            r0.<init>(r6)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r7 = "yyyy-MM-dd HH:mm:ss"
            r6.<init>(r7)
            long r1 = r0.getTime()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "old time "
            r7.<init>(r3)
            r7.append(r4)
            java.lang.String r4 = " new time = "
            r7.append(r4)
            java.lang.String r4 = r6.format(r0)
            r7.append(r4)
            java.lang.String r4 = " 毫秒 = "
            r7.append(r4)
            r7.append(r1)
            java.lang.String r4 = r7.toString()
            java.lang.String r5 = "TTMediationSDK_IntervalEffectiveTime"
            com.bytedance.msdk.j.up.cw.j(r5, r4)
            return r1
    }

    public static java.lang.String xt(long r1) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r2)
            java.lang.String r1 = r1.format(r0)
            return r1
    }
}
