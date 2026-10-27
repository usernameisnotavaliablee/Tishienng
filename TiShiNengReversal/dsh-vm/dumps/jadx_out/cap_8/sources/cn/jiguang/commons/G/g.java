package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 4
        L6:
            r2 = 20
            if (r1 >= r2) goto L36
            r2 = r5[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "%02x"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.append(r2)
            r2 = 7
            if (r1 == r2) goto L2e
            r2 = 9
            if (r1 == r2) goto L2e
            r2 = 11
            if (r1 == r2) goto L2e
            r2 = 13
            if (r1 != r2) goto L33
        L2e:
            java.lang.String r2 = "-"
            r0.append(r2)
        L33:
            int r1 = r1 + 1
            goto L6
        L36:
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toUpperCase()
            return r5
    }

    public static boolean a(android.bluetooth.le.ScanResult r11, cn.jiguang.commons.bean.Peripheral r12) {
            java.lang.String r0 = "IBeaconParser"
            r1 = 1
            r2 = 2
            r3 = 0
            r4 = 0
            android.bluetooth.le.ScanRecord r5 = r11.getScanRecord()     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            if (r5 == 0) goto Ld3
            android.bluetooth.le.ScanRecord r11 = r11.getScanRecord()     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r5 = 76
            byte[] r4 = r11.getManufacturerSpecificData(r5)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            if (r4 == 0) goto Ld3
            int r11 = r4.length     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r5 = 23
            if (r11 < r5) goto Ld3
            r11 = r4[r2]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r6 = 3
            r7 = r4[r6]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r7 = r7 & 255(0xff, float:3.57E-43)
            r11 = r11 | r7
            r7 = 533(0x215, float:7.47E-43)
            if (r11 == r7) goto L2e
            return r3
        L2e:
            cn.jiguang.commons.bean.IBeaconData r11 = new cn.jiguang.commons.bean.IBeaconData     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r11.<init>()     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.String r7 = a(r4)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.String r8 = "-"
            java.lang.String r9 = ""
            java.lang.String r8 = r7.replace(r8, r9)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.String r9 = "^0+$"
            boolean r8 = r8.matches(r9)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            if (r8 != 0) goto Ld3
            r11.a(r7)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r8 = 20
            r8 = r4[r8]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r9 = 21
            r9 = r4[r9]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            r11.a(r8)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9 = 22
            r9 = r4[r9]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r10 = r4[r5]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            r11.d(r9)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            int r10 = r4.length     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            if (r10 <= r5) goto L78
            r5 = 24
            r5 = r4[r5]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            goto L79
        L74:
            r11 = move-exception
            goto La0
        L76:
            r11 = move-exception
            goto Lb9
        L78:
            r5 = 0
        L79:
            r11.c(r5)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r12.a(r11)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.String r11 = "iBeacon data parsed: UUID=%s, major=%d, minor=%d, power=%d"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9[r3] = r7     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9[r1] = r12     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9[r2] = r8     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            r9[r6] = r5     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.String r11 = java.lang.String.format(r11, r9)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            cn.jiguang.commons.w.a.a(r0, r11)     // Catch: java.lang.Exception -> L74 java.lang.ArrayIndexOutOfBoundsException -> L76
            return r1
        La0:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "parse ibeacon data failed: "
            r12.append(r1)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
        Lb5:
            cn.jiguang.commons.w.a.f(r0, r11)
            goto Ld3
        Lb9:
            if (r4 == 0) goto Lbd
            int r12 = r4.length
            goto Lbe
        Lbd:
            r12 = 0
        Lbe:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r11 = r11.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r12
            r2[r1] = r11
            java.lang.String r11 = "parse ibeacon data failed: length=%d; error=%s"
            java.lang.String r11 = java.lang.String.format(r11, r2)
            goto Lb5
        Ld3:
            return r3
    }
}
