package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L11
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L11
            r0 = -140(0xffffffffffffff74, float:NaN)
            if (r1 < r0) goto L11
            if (r1 <= 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            r1 = 0
            return r1
    }

    private static long a(long r5, boolean r7) {
            r0 = -1
            r2 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L3f
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L3f
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L3f
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L3f
            r0 = -9223372036854775808
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L3f
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2a
            goto L3f
        L2a:
            if (r7 == 0) goto L36
            r0 = 68719476735(0xfffffffff, double:3.3951932655E-313)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 < 0) goto L3e
            return r2
        L36:
            r0 = 268435455(0xfffffff, double:1.326247364E-315)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 < 0) goto L3e
            return r2
        L3e:
            return r5
        L3f:
            return r2
    }

    public static cn.jiguang.commons.c.h a(android.telephony.CellInfo r11) {
            java.lang.String r0 = "CellUtils"
            r1 = 0
            if (r11 == 0) goto L2c0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto Ld
            goto L2c0
        Ld:
            cn.jiguang.commons.c.h r3 = new cn.jiguang.commons.c.h
            r3.<init>()
            boolean r4 = r11 instanceof android.telephony.CellInfoGsm     // Catch: java.lang.Exception -> L52
            java.lang.String r5 = ""
            r6 = 28
            r7 = 0
            if (r4 == 0) goto L82
            android.telephony.CellInfoGsm r11 = (android.telephony.CellInfoGsm) r11     // Catch: java.lang.Exception -> L52
            android.telephony.CellSignalStrengthGsm r4 = r11.getCellSignalStrength()     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentityGsm r11 = r11.getCellIdentity()     // Catch: java.lang.Exception -> L52
            int r4 = r4.getDbm()     // Catch: java.lang.Exception -> L52
            int r4 = a(r4)     // Catch: java.lang.Exception -> L52
            r3.f1035j = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getCid()     // Catch: java.lang.Exception -> L52
            long r8 = (long) r4     // Catch: java.lang.Exception -> L52
            long r7 = a(r8, r7)     // Catch: java.lang.Exception -> L52
            r3.a = r7     // Catch: java.lang.Exception -> L52
            int r4 = r11.getLac()     // Catch: java.lang.Exception -> L52
            int r4 = c(r4)     // Catch: java.lang.Exception -> L52
            r3.f1028c = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto L55
            java.lang.String r4 = cn.jiguang.commons.L.b0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r7 = cn.jiguang.commons.L.d0.a(r11)     // Catch: java.lang.Exception -> L52
            a(r3, r4, r7)     // Catch: java.lang.Exception -> L52
            goto L69
        L52:
            r11 = move-exception
            goto L2a8
        L55:
            int r4 = r11.getMcc()     // Catch: java.lang.Exception -> L52
            int r4 = d(r4)     // Catch: java.lang.Exception -> L52
            r3.f1029d = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getMnc()     // Catch: java.lang.Exception -> L52
            int r4 = e(r4)     // Catch: java.lang.Exception -> L52
            r3.f1030e = r4     // Catch: java.lang.Exception -> L52
        L69:
            java.lang.String r4 = "2G"
            r3.f1033h = r4     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = "gsm"
            r3.f1034i = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto L7d
            java.lang.CharSequence r11 = cn.jiguang.commons.L.o0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r11 = a(r11)     // Catch: java.lang.Exception -> L52
            r3.f1032g = r11     // Catch: java.lang.Exception -> L52
        L7d:
            int r11 = r3.f1029d     // Catch: java.lang.Exception -> L52
        L7f:
            int r2 = r3.f1030e     // Catch: java.lang.Exception -> L52
            goto Le8
        L82:
            boolean r4 = r11 instanceof android.telephony.CellInfoLte     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto Lee
            android.telephony.CellInfoLte r11 = (android.telephony.CellInfoLte) r11     // Catch: java.lang.Exception -> L52
            android.telephony.CellSignalStrengthLte r4 = r11.getCellSignalStrength()     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentityLte r11 = r11.getCellIdentity()     // Catch: java.lang.Exception -> L52
            int r4 = r4.getDbm()     // Catch: java.lang.Exception -> L52
            int r4 = a(r4)     // Catch: java.lang.Exception -> L52
            r3.f1035j = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getCi()     // Catch: java.lang.Exception -> L52
            long r8 = (long) r4     // Catch: java.lang.Exception -> L52
            long r7 = a(r8, r7)     // Catch: java.lang.Exception -> L52
            r3.a = r7     // Catch: java.lang.Exception -> L52
            int r4 = r11.getTac()     // Catch: java.lang.Exception -> L52
            int r4 = c(r4)     // Catch: java.lang.Exception -> L52
            r3.f1028c = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto Lbd
            java.lang.String r4 = cn.jiguang.commons.L.p0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r7 = cn.jiguang.commons.L.q0.a(r11)     // Catch: java.lang.Exception -> L52
            a(r3, r4, r7)     // Catch: java.lang.Exception -> L52
            goto Ld1
        Lbd:
            int r4 = r11.getMcc()     // Catch: java.lang.Exception -> L52
            int r4 = d(r4)     // Catch: java.lang.Exception -> L52
            r3.f1029d = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getMnc()     // Catch: java.lang.Exception -> L52
            int r4 = e(r4)     // Catch: java.lang.Exception -> L52
            r3.f1030e = r4     // Catch: java.lang.Exception -> L52
        Ld1:
            java.lang.String r4 = "4G"
            r3.f1033h = r4     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = "lte"
            r3.f1034i = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto Le5
            java.lang.CharSequence r11 = cn.jiguang.commons.L.r0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r11 = a(r11)     // Catch: java.lang.Exception -> L52
            r3.f1032g = r11     // Catch: java.lang.Exception -> L52
        Le5:
            int r11 = r3.f1029d     // Catch: java.lang.Exception -> L52
            goto L7f
        Le8:
            java.lang.String r11 = a(r11, r2)     // Catch: java.lang.Exception -> L52
            goto L248
        Lee:
            boolean r4 = r11 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Exception -> L52
            java.lang.String r8 = "3G"
            if (r4 == 0) goto L156
            android.telephony.CellInfoWcdma r11 = (android.telephony.CellInfoWcdma) r11     // Catch: java.lang.Exception -> L52
            android.telephony.CellSignalStrengthWcdma r4 = r11.getCellSignalStrength()     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentityWcdma r11 = r11.getCellIdentity()     // Catch: java.lang.Exception -> L52
            int r4 = r4.getDbm()     // Catch: java.lang.Exception -> L52
            int r4 = a(r4)     // Catch: java.lang.Exception -> L52
            r3.f1035j = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getCid()     // Catch: java.lang.Exception -> L52
            long r9 = (long) r4     // Catch: java.lang.Exception -> L52
            long r9 = a(r9, r7)     // Catch: java.lang.Exception -> L52
            r3.a = r9     // Catch: java.lang.Exception -> L52
            int r4 = r11.getLac()     // Catch: java.lang.Exception -> L52
            int r4 = c(r4)     // Catch: java.lang.Exception -> L52
            r3.f1028c = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto L12b
            java.lang.String r4 = cn.jiguang.commons.L.s0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r7 = cn.jiguang.commons.L.t0.a(r11)     // Catch: java.lang.Exception -> L52
            a(r3, r4, r7)     // Catch: java.lang.Exception -> L52
            goto L13f
        L12b:
            int r4 = r11.getMcc()     // Catch: java.lang.Exception -> L52
            int r4 = d(r4)     // Catch: java.lang.Exception -> L52
            r3.f1029d = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getMnc()     // Catch: java.lang.Exception -> L52
            int r4 = e(r4)     // Catch: java.lang.Exception -> L52
            r3.f1030e = r4     // Catch: java.lang.Exception -> L52
        L13f:
            r3.f1033h = r8     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = "wcdma"
            r3.f1034i = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto L152
            java.lang.CharSequence r11 = cn.jiguang.commons.L.u0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r11 = a(r11)     // Catch: java.lang.Exception -> L52
            r3.f1032g = r11     // Catch: java.lang.Exception -> L52
        L152:
            int r11 = r3.f1029d     // Catch: java.lang.Exception -> L52
            goto L7f
        L156:
            boolean r4 = r11 instanceof android.telephony.CellInfoCdma     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto L19c
            android.telephony.CellInfoCdma r11 = (android.telephony.CellInfoCdma) r11     // Catch: java.lang.Exception -> L52
            android.telephony.CellSignalStrengthCdma r4 = r11.getCellSignalStrength()     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentityCdma r11 = r11.getCellIdentity()     // Catch: java.lang.Exception -> L52
            int r4 = r4.getDbm()     // Catch: java.lang.Exception -> L52
            int r4 = a(r4)     // Catch: java.lang.Exception -> L52
            r3.f1035j = r4     // Catch: java.lang.Exception -> L52
            int r4 = r11.getBasestationId()     // Catch: java.lang.Exception -> L52
            long r9 = (long) r4     // Catch: java.lang.Exception -> L52
            long r9 = a(r9, r7)     // Catch: java.lang.Exception -> L52
            r3.a = r9     // Catch: java.lang.Exception -> L52
            int r4 = r11.getNetworkId()     // Catch: java.lang.Exception -> L52
            int r4 = c(r4)     // Catch: java.lang.Exception -> L52
            r3.f1028c = r4     // Catch: java.lang.Exception -> L52
            r3.f1029d = r7     // Catch: java.lang.Exception -> L52
            r3.f1030e = r7     // Catch: java.lang.Exception -> L52
            r3.f1033h = r8     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = "cdma2000"
            r3.f1034i = r4     // Catch: java.lang.Exception -> L52
            if (r2 < r6) goto L199
            java.lang.CharSequence r11 = cn.jiguang.commons.L.v0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r11 = a(r11)     // Catch: java.lang.Exception -> L52
            r3.f1032g = r11     // Catch: java.lang.Exception -> L52
        L199:
            r11 = r5
            goto L248
        L19c:
            r4 = 29
            if (r2 < r4) goto L1f6
            boolean r6 = cn.jiguang.commons.L.m0.a(r11)     // Catch: java.lang.Exception -> L52
            if (r6 == 0) goto L1f6
            android.telephony.CellInfoNr r11 = cn.jiguang.commons.L.w0.a(r11)     // Catch: java.lang.Exception -> L52
            android.telephony.CellSignalStrength r2 = cn.jiguang.commons.L.x0.a(r11)     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentity r11 = cn.jiguang.commons.L.y0.a(r11)     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentityNr r11 = cn.jiguang.commons.L.z0.a(r11)     // Catch: java.lang.Exception -> L52
            int r2 = r2.getDbm()     // Catch: java.lang.Exception -> L52
            int r2 = a(r2)     // Catch: java.lang.Exception -> L52
            r3.f1035j = r2     // Catch: java.lang.Exception -> L52
            long r6 = cn.jiguang.commons.L.a1.a(r11)     // Catch: java.lang.Exception -> L52
            r2 = 1
            long r6 = a(r6, r2)     // Catch: java.lang.Exception -> L52
            r3.a = r6     // Catch: java.lang.Exception -> L52
            int r2 = cn.jiguang.commons.L.b1.a(r11)     // Catch: java.lang.Exception -> L52
            int r2 = c(r2)     // Catch: java.lang.Exception -> L52
            r3.f1028c = r2     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = cn.jiguang.commons.L.c1.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = cn.jiguang.commons.L.d1.a(r11)     // Catch: java.lang.Exception -> L52
            a(r3, r2, r4)     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "5G"
            r3.f1033h = r2     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "nr"
            r3.f1034i = r2     // Catch: java.lang.Exception -> L52
            java.lang.CharSequence r11 = cn.jiguang.commons.L.c0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r11 = a(r11)     // Catch: java.lang.Exception -> L52
            r3.f1032g = r11     // Catch: java.lang.Exception -> L52
            int r11 = r3.f1029d     // Catch: java.lang.Exception -> L52
            goto L7f
        L1f6:
            if (r2 < r4) goto L24a
            boolean r2 = cn.jiguang.commons.L.e0.a(r11)     // Catch: java.lang.Exception -> L52
            if (r2 == 0) goto L24a
            android.telephony.CellInfoTdscdma r11 = cn.jiguang.commons.L.f0.a(r11)     // Catch: java.lang.Exception -> L52
            android.telephony.CellSignalStrengthTdscdma r2 = cn.jiguang.commons.L.g0.a(r11)     // Catch: java.lang.Exception -> L52
            android.telephony.CellIdentityTdscdma r11 = cn.jiguang.commons.L.h0.a(r11)     // Catch: java.lang.Exception -> L52
            int r2 = r2.getDbm()     // Catch: java.lang.Exception -> L52
            int r2 = a(r2)     // Catch: java.lang.Exception -> L52
            r3.f1035j = r2     // Catch: java.lang.Exception -> L52
            int r2 = cn.jiguang.commons.L.i0.a(r11)     // Catch: java.lang.Exception -> L52
            long r9 = (long) r2     // Catch: java.lang.Exception -> L52
            long r6 = a(r9, r7)     // Catch: java.lang.Exception -> L52
            r3.a = r6     // Catch: java.lang.Exception -> L52
            int r2 = cn.jiguang.commons.L.j0.a(r11)     // Catch: java.lang.Exception -> L52
            int r2 = c(r2)     // Catch: java.lang.Exception -> L52
            r3.f1028c = r2     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = cn.jiguang.commons.L.k0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = cn.jiguang.commons.L.l0.a(r11)     // Catch: java.lang.Exception -> L52
            a(r3, r2, r4)     // Catch: java.lang.Exception -> L52
            r3.f1033h = r8     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "tdscdma"
            r3.f1034i = r2     // Catch: java.lang.Exception -> L52
            java.lang.CharSequence r11 = cn.jiguang.commons.L.n0.a(r11)     // Catch: java.lang.Exception -> L52
            java.lang.String r11 = a(r11)     // Catch: java.lang.Exception -> L52
            r3.f1032g = r11     // Catch: java.lang.Exception -> L52
            int r11 = r3.f1029d     // Catch: java.lang.Exception -> L52
            goto L7f
        L248:
            r3.f1031f = r11     // Catch: java.lang.Exception -> L52
        L24a:
            java.lang.String r11 = r3.f1031f     // Catch: java.lang.Exception -> L52
            if (r11 != 0) goto L250
            r3.f1031f = r5     // Catch: java.lang.Exception -> L52
        L250:
            java.lang.String r11 = r3.f1031f
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L262
            int r11 = r3.f1029d
            int r2 = r3.f1030e
            java.lang.String r11 = a(r11, r2)
            r3.f1031f = r11
        L262:
            int r11 = r3.f1029d
            if (r11 != 0) goto L28f
            int r11 = r3.f1030e
            if (r11 != 0) goto L28f
            int r11 = r3.f1028c
            if (r11 != 0) goto L28f
            long r4 = r3.a
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 != 0) goto L28f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "Invalid MCC/MNC: "
            r11.append(r2)
            java.lang.String r2 = r3.toString()
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            cn.jiguang.commons.w.a.f(r0, r11)
            return r1
        L28f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "processSelectedCell: "
            r11.append(r1)
            java.lang.String r1 = r3.toString()
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            cn.jiguang.commons.w.a.a(r0, r11)
            return r3
        L2a8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Process cell info failed: "
            r2.append(r3)
            java.lang.String r11 = r11.getMessage()
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r11)
        L2c0:
            return r1
    }

    private static java.lang.String a(int r3, int r4) {
            if (r3 <= 0) goto L46
            if (r4 >= 0) goto L5
            goto L46
        L5:
            r0 = 460(0x1cc, float:6.45E-43)
            r1 = 1
            r2 = 0
            if (r3 != r0) goto L28
            r0 = 11
            if (r4 != r0) goto L12
            java.lang.String r3 = "46011"
            return r3
        L12:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "%03d%02d"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            java.lang.String r3 = "%03d"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L46:
            java.lang.String r3 = ""
            return r3
    }

    private static java.lang.String a(java.lang.CharSequence r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = r1.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            return r1
        L15:
            java.lang.String r1 = ""
            return r1
    }

    private static void a(cn.jiguang.commons.c.h r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.NumberFormatException -> L20
            if (r1 != 0) goto Le
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L20
            r2.f1029d = r3     // Catch: java.lang.NumberFormatException -> L20
            goto L10
        Le:
            r2.f1029d = r0     // Catch: java.lang.NumberFormatException -> L20
        L10:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NumberFormatException -> L20
            if (r3 != 0) goto L1d
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L20
            r2.f1030e = r3     // Catch: java.lang.NumberFormatException -> L20
            return
        L1d:
            r2.f1030e = r0     // Catch: java.lang.NumberFormatException -> L20
            return
        L20:
            r2.f1029d = r0
            r2.f1030e = r0
            return
    }

    private static int c(int r1) {
            r0 = -1
            if (r1 == r0) goto L15
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L15
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L15
            if (r1 < 0) goto L15
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 < r0) goto L14
            goto L15
        L14:
            return r1
        L15:
            r1 = 0
            return r1
    }

    private static int d(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L11
            r0 = -1
            if (r1 == r0) goto L11
            r0 = 1
            if (r1 < r0) goto L11
            r0 = 999(0x3e7, float:1.4E-42)
            if (r1 <= r0) goto L10
            goto L11
        L10:
            return r1
        L11:
            r1 = 0
            return r1
    }

    private static int e(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L10
            r0 = -1
            if (r1 == r0) goto L10
            if (r1 < 0) goto L10
            r0 = 999(0x3e7, float:1.4E-42)
            if (r1 <= r0) goto Lf
            goto L10
        Lf:
            return r1
        L10:
            r1 = 0
            return r1
    }
}
