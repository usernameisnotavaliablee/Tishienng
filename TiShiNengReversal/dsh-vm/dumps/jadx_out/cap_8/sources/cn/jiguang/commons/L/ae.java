package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ae {
    private static android.telephony.TelephonyManager a;

    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.telephony.TelephonyManager a() {
            android.telephony.TelephonyManager r0 = n()
            r1 = 0
            java.lang.String r2 = "TelephonyUtils"
            if (r0 != 0) goto L1c
            java.lang.String r0 = "tm:null"
            cn.jiguang.commons.w.a.f(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 3020(0xbcc, float:4.232E-42)
        L14:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.f(r2)
            return r1
        L1c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L34
            boolean r3 = cn.jiguang.commons.L.u.k()
            if (r3 != 0) goto L34
            java.lang.String r0 = "perm:denied:location"
            cn.jiguang.commons.w.a.f(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 3018(0xbca, float:4.229E-42)
            goto L14
        L34:
            return r0
    }

    private static android.telephony.TelephonyManager a(java.lang.String r4, boolean r5) {
            android.telephony.TelephonyManager r0 = n()
            r1 = 0
            java.lang.String r2 = "TelephonyUtils"
            if (r0 != 0) goto Lf
            java.lang.String r4 = "tm:null"
        Lb:
            cn.jiguang.commons.w.a.f(r2, r4)
            return r1
        Lf:
            if (r5 == 0) goto L2e
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r5 < r3) goto L2e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ":"
            r5.append(r4)
            java.lang.String r4 = "restricted:api29+"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto Lb
        L2e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L3d
            boolean r4 = cn.jiguang.commons.L.u.n()
            if (r4 != 0) goto L3d
            java.lang.String r4 = "perm:denied:read_phone"
            goto Lb
        L3d:
            return r0
    }

    public static java.lang.String a(int r7) {
            java.lang.String r0 = "TelephonyUtils"
            java.lang.String r1 = "imei"
            r2 = 1
            android.telephony.TelephonyManager r1 = a(r1, r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto Le
            return r2
        Le:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L37
            r4 = 26
            java.lang.String r5 = "imei:empty:slot"
            java.lang.String r6 = "imei:success:slot"
            if (r3 < r4) goto L49
            java.lang.String r1 = cn.jiguang.commons.L.b.a(r1, r7)     // Catch: java.lang.Exception -> L37
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = ":api26_getImei"
            if (r3 != 0) goto L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r3.append(r6)     // Catch: java.lang.Exception -> L37
            r3.append(r7)     // Catch: java.lang.Exception -> L37
        L2f:
            r3.append(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L37
            goto L8b
        L37:
            r1 = move-exception
            goto Lbe
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r3.append(r5)     // Catch: java.lang.Exception -> L37
            r3.append(r7)     // Catch: java.lang.Exception -> L37
        L45:
            r3.append(r4)     // Catch: java.lang.Exception -> L37
            goto L9b
        L49:
            r4 = 23
            if (r3 < r4) goto L71
            java.lang.String r1 = cn.jiguang.commons.L.a0.a(r1, r7)     // Catch: java.lang.Exception -> L37
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = ":api23_getDeviceId_slot"
            if (r3 != 0) goto L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r3.append(r6)     // Catch: java.lang.Exception -> L37
            r3.append(r7)     // Catch: java.lang.Exception -> L37
            goto L2f
        L65:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r3.append(r5)     // Catch: java.lang.Exception -> L37
            r3.append(r7)     // Catch: java.lang.Exception -> L37
            goto L45
        L71:
            if (r7 != 0) goto La0
            java.lang.String r1 = r1.getDeviceId()     // Catch: java.lang.Exception -> L37
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = ":api_legacy_getDeviceId"
            if (r3 != 0) goto L8f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r3.append(r6)     // Catch: java.lang.Exception -> L37
            r3.append(r7)     // Catch: java.lang.Exception -> L37
            goto L2f
        L8b:
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Exception -> L37
            goto Lba
        L8f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r3.append(r5)     // Catch: java.lang.Exception -> L37
            r3.append(r7)     // Catch: java.lang.Exception -> L37
            goto L45
        L9b:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L37
            goto Lb7
        La0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = "imei:unsupported:slot"
            r1.append(r3)     // Catch: java.lang.Exception -> L37
            r1.append(r7)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = ":api_legacy_single_slot_only"
            r1.append(r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L37
            r1 = r2
        Lb7:
            cn.jiguang.commons.w.a.f(r0, r3)     // Catch: java.lang.Exception -> L37
        Lba:
            if (r1 == 0) goto Lbd
            return r1
        Lbd:
            return r2
        Lbe:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "imei:err:slot"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ":"
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            cn.jiguang.commons.w.a.c(r0, r7)
            return r2
    }

    private static boolean a(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L14
            java.lang.String r1 = r1.trim()
            int r1 = r1.length()
            r0 = 14
            if (r1 != r0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static java.lang.String c(int r11) {
            java.lang.String r0 = ":"
            java.lang.String r1 = "TelephonyUtils"
            java.lang.String r2 = "imsi"
            r3 = 1
            android.telephony.TelephonyManager r2 = a(r2, r3)
            java.lang.String r4 = ""
            if (r2 != 0) goto L10
            return r4
        L10:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r6 = 22
            java.lang.String r7 = "imsi:empty:slot"
            java.lang.String r8 = "imsi:success:slot"
            if (r5 < r6) goto Lb5
            if (r11 != 0) goto L53
            java.lang.String r2 = r2.getSubscriberId()     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            java.lang.String r5 = ":api22_telephonyManager_getSubscriberId"
            if (r3 != 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r8)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r11)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
        L33:
            r3.append(r5)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            goto L86
        L37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r7)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r11)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
        L42:
            r3.append(r5)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            goto Lf0
        L4b:
            r3 = move-exception
        L4c:
            r2 = r4
            goto Lf4
        L4f:
            r3 = move-exception
        L50:
            r2 = r4
            goto L112
        L53:
            java.lang.String r5 = "getSubscriberId"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lb1 java.lang.SecurityException -> Lb3
            r10 = 0
            r9[r10] = r6     // Catch: java.lang.Exception -> Lb1 java.lang.SecurityException -> Lb3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lad java.lang.SecurityException -> Laf
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lad java.lang.SecurityException -> Laf
            r3[r10] = r6     // Catch: java.lang.Exception -> Lad java.lang.SecurityException -> Laf
            java.lang.Object r2 = cn.jiguang.commons.L.x.a(r2, r5, r9, r3)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            if (r3 == 0) goto L6f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            goto L70
        L6f:
            r2 = r4
        L70:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            java.lang.String r5 = ":api22_telephonyManager_getSubscriberId_slot"
            if (r3 != 0) goto L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r8)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r11)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r5)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
        L86:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            goto L12a
        L8f:
            r3 = move-exception
            goto Lf4
        L92:
            r3 = move-exception
            goto L112
        L95:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2.append(r7)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2.append(r11)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2.append(r5)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
        La3:
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2 = r4
            goto Lf0
        La9:
            r3 = r2
            goto L4c
        Lab:
            r3 = r2
            goto L50
        Lad:
            r2 = move-exception
            goto La9
        Laf:
            r2 = move-exception
            goto Lab
        Lb1:
            r2 = move-exception
            goto La9
        Lb3:
            r2 = move-exception
            goto Lab
        Lb5:
            if (r11 != 0) goto Ldd
            java.lang.String r2 = r2.getSubscriberId()     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            java.lang.String r5 = ":api_legacy_telephonyManager_getSubscriberId"
            if (r3 != 0) goto Ld0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r8)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r11)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            goto L33
        Ld0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r7)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            r3.append(r11)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            goto L42
        Ldd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            java.lang.String r3 = "imsi:unsupported:slot"
            r2.append(r3)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            r2.append(r11)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            java.lang.String r3 = ":api_legacy_single_slot_only"
            r2.append(r3)     // Catch: java.lang.Exception -> L4b java.lang.SecurityException -> L4f
            goto La3
        Lf0:
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Exception -> L8f java.lang.SecurityException -> L92
            goto L12a
        Lf4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L110
            r5.<init>()     // Catch: java.lang.Exception -> L110
            java.lang.String r6 = "imsi:telephonyManager:err:slot"
            r5.append(r6)     // Catch: java.lang.Exception -> L110
            r5.append(r11)     // Catch: java.lang.Exception -> L110
            r5.append(r0)     // Catch: java.lang.Exception -> L110
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> L110
        L108:
            r5.append(r3)     // Catch: java.lang.Exception -> L110
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L110
            goto L127
        L110:
            r2 = move-exception
            goto L16a
        L112:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L110
            r5.<init>()     // Catch: java.lang.Exception -> L110
            java.lang.String r6 = "imsi:telephonyManager:security:err:slot"
            r5.append(r6)     // Catch: java.lang.Exception -> L110
            r5.append(r11)     // Catch: java.lang.Exception -> L110
            r5.append(r0)     // Catch: java.lang.Exception -> L110
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> L110
            goto L108
        L127:
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Exception -> L110
        L12a:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L110
            if (r3 != 0) goto L155
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L110
            r3.<init>()     // Catch: java.lang.Exception -> L110
            java.lang.String r5 = "imsi:final:success:slot"
            r3.append(r5)     // Catch: java.lang.Exception -> L110
            r3.append(r11)     // Catch: java.lang.Exception -> L110
            java.lang.String r5 = ":length:"
            r3.append(r5)     // Catch: java.lang.Exception -> L110
            java.lang.String r5 = r2.trim()     // Catch: java.lang.Exception -> L110
            int r5 = r5.length()     // Catch: java.lang.Exception -> L110
            r3.append(r5)     // Catch: java.lang.Exception -> L110
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L110
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Exception -> L110
            return r2
        L155:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L110
            r2.<init>()     // Catch: java.lang.Exception -> L110
            java.lang.String r3 = "imsi:final:empty:slot"
            r2.append(r3)     // Catch: java.lang.Exception -> L110
            r2.append(r11)     // Catch: java.lang.Exception -> L110
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L110
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L110
            return r4
        L16a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "imsi:err:slot"
            r3.append(r5)
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r2.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            cn.jiguang.commons.w.a.c(r1, r11)
            return r4
    }

    public static java.util.List c() {
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "TelephonyUtils"
            r2 = 0
            android.telephony.TelephonyManager r3 = a()     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            if (r3 != 0) goto L10
            return r2
        L10:
            java.util.List r3 = r3.getAllCellInfo()     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            r4.<init>()     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            java.lang.String r5 = "cell:count:"
            r4.append(r5)     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            if (r3 == 0) goto L29
            int r5 = r3.size()     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            goto L2a
        L25:
            r3 = move-exception
            goto L35
        L27:
            r3 = move-exception
            goto L55
        L29:
            r5 = 0
        L2a:
            r4.append(r5)     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Exception -> L25 java.lang.SecurityException -> L27
            return r3
        L35:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "cell:err:"
        L3c:
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.commons.w.a.f(r1, r3)
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r1.f(r0)
            return r2
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "cell:err:security:"
            goto L3c
    }

    public static java.lang.String d() {
            r0 = 0
            java.lang.String r0 = a(r0)
            return r0
    }

    private static java.lang.String d(int r0) {
            switch(r0) {
                case 1: goto Lf;
                case 2: goto Lf;
                case 3: goto Lc;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lc;
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto L9;
                case 14: goto Lc;
                case 15: goto Lc;
                case 16: goto Lf;
                case 17: goto Lc;
                case 18: goto L9;
                case 19: goto L3;
                case 20: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Unknown"
            return r0
        L6:
            java.lang.String r0 = "5G"
            return r0
        L9:
            java.lang.String r0 = "4G"
            return r0
        Lc:
            java.lang.String r0 = "3G"
            return r0
        Lf:
            java.lang.String r0 = "2G"
            return r0
    }

    public static java.lang.String e() {
            r0 = 0
            java.lang.String r0 = c(r0)
            return r0
    }

    private static java.lang.String e(int r2) {
            switch(r2) {
                case 0: goto L27;
                case 1: goto L24;
                case 2: goto L24;
                case 3: goto L21;
                case 4: goto L1e;
                case 5: goto L1e;
                case 6: goto L1e;
                case 7: goto L1e;
                case 8: goto L21;
                case 9: goto L21;
                case 10: goto L21;
                case 11: goto L1b;
                case 12: goto L1e;
                case 13: goto L18;
                case 14: goto L1e;
                case 15: goto L21;
                case 16: goto L24;
                case 17: goto L21;
                case 18: goto L18;
                case 19: goto L3;
                case 20: goto L15;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UNKNOWN_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L15:
            java.lang.String r2 = "5G"
            return r2
        L18:
            java.lang.String r2 = "LTE"
            return r2
        L1b:
            java.lang.String r2 = "IDEN"
            return r2
        L1e:
            java.lang.String r2 = "CDMA"
            return r2
        L21:
            java.lang.String r2 = "WCDMA"
            return r2
        L24:
            java.lang.String r2 = "GSM"
            return r2
        L27:
            java.lang.String r2 = "UNKNOWN"
            return r2
    }

    public static java.lang.String f() {
            java.lang.String r0 = ""
            java.lang.String r1 = "TelephonyUtils"
            java.lang.String r2 = d()     // Catch: java.lang.Exception -> L15
            boolean r3 = a(r2)     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto Lf
            return r2
        Lf:
            java.lang.String r2 = "meid:invalid"
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L15
            return r0
        L15:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "meid:err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r2)
            return r0
    }

    public static java.lang.String g() {
            java.lang.String r0 = "Unknown"
            java.lang.String r1 = "TelephonyUtils"
            android.telephony.TelephonyManager r2 = n()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            if (r2 != 0) goto L14
            java.lang.String r2 = "tm:null"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            return r0
        L10:
            r2 = move-exception
            goto L2f
        L12:
            r2 = move-exception
            goto L48
        L14:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            r4 = 23
            if (r3 < r4) goto L26
            boolean r3 = cn.jiguang.commons.L.u.n()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            if (r3 != 0) goto L26
            java.lang.String r2 = "perm:denied:read_phone"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            return r0
        L26:
            int r2 = r2.getNetworkType()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            java.lang.String r0 = d(r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            return r0
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "net:err:"
        L36:
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r2)
            return r0
        L48:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "net:err:security:"
            goto L36
    }

    public static java.util.List h() {
            java.lang.String r0 = "TelephonyUtils"
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            r3 = 31
            if (r2 < r3) goto La
            return r1
        La:
            java.lang.String r2 = "ncell"
            r3 = 0
            android.telephony.TelephonyManager r2 = a(r2, r3)     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            if (r2 != 0) goto L14
            return r1
        L14:
            java.lang.String r3 = "getNeighboringCellInfo"
            java.lang.Object r2 = cn.jiguang.commons.L.x.a(r2, r3, r1, r1)     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            return r2
        L1d:
            r2 = move-exception
            goto L21
        L1f:
            r2 = move-exception
            goto L3a
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ncell:err:"
        L28:
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ncell:err:security:"
            goto L28
    }

    public static java.lang.String i() {
            java.lang.String r0 = "TelephonyUtils"
            java.lang.String r1 = ""
            android.telephony.TelephonyManager r2 = n()     // Catch: java.lang.Exception -> L10
            if (r2 != 0) goto L12
            java.lang.String r2 = "tm:null"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L10
            return r1
        L10:
            r2 = move-exception
            goto L1a
        L12:
            java.lang.String r0 = r2.getNetworkOperator()     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L19
            return r0
        L19:
            return r1
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "op:err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    public static java.lang.String j() {
            java.lang.String r0 = "TelephonyUtils"
            java.lang.String r1 = ""
            android.telephony.TelephonyManager r2 = n()     // Catch: java.lang.Exception -> L10
            if (r2 != 0) goto L12
            java.lang.String r2 = "tm:null"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L10
            return r1
        L10:
            r2 = move-exception
            goto L1a
        L12:
            java.lang.String r0 = r2.getNetworkOperatorName()     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L19
            return r0
        L19:
            return r1
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "op:name:err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    public static java.lang.String k() {
            java.lang.String r0 = ""
            java.lang.String r1 = "TelephonyUtils"
            android.telephony.TelephonyManager r2 = n()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            if (r2 != 0) goto L14
            java.lang.String r2 = "tm:null"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            return r0
        L10:
            r2 = move-exception
            goto L43
        L12:
            r2 = move-exception
            goto L5c
        L14:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            r4 = 23
            if (r3 < r4) goto L26
            boolean r3 = cn.jiguang.commons.L.u.n()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            if (r3 != 0) goto L26
            java.lang.String r2 = "perm:denied:read_phone"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            return r0
        L26:
            int r2 = r2.getNetworkType()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            r3.<init>()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            java.lang.String r4 = "radio:type:"
            r3.append(r4)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            r3.append(r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            java.lang.String r0 = e(r2)     // Catch: java.lang.Exception -> L10 java.lang.SecurityException -> L12
            return r0
        L43:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "radio:err:"
        L4a:
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r2)
            return r0
        L5c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "radio:err:security:"
            goto L4a
    }

    public static org.json.JSONArray l() {
            java.lang.String r0 = "TelephonyUtils"
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L2c
            r3 = 2004(0x7d4, float:2.808E-42)
            boolean r2 = r2.a(r3)     // Catch: java.lang.Exception -> L2c
            cn.jiguang.commons.g.l r3 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L2c
            r4 = 2005(0x7d5, float:2.81E-42)
            boolean r3 = r3.a(r4)     // Catch: java.lang.Exception -> L2c
            if (r2 != 0) goto L20
            if (r3 != 0) goto L20
            goto L63
        L20:
            int r4 = m()     // Catch: java.lang.Exception -> L2c
            if (r4 > 0) goto L2e
            java.lang.String r2 = "sl count <= 0 "
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L2c
            return r1
        L2c:
            r2 = move-exception
            goto L64
        L2e:
            r5 = 0
        L2f:
            if (r5 >= r4) goto L63
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
            r6.<init>()     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = ""
            if (r2 == 0) goto L3f
            java.lang.String r8 = a(r5)     // Catch: java.lang.Exception -> L2c
            goto L40
        L3f:
            r8 = r7
        L40:
            if (r3 == 0) goto L46
            java.lang.String r7 = c(r5)     // Catch: java.lang.Exception -> L2c
        L46:
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L2c
            if (r9 == 0) goto L53
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L2c
            if (r9 == 0) goto L53
            goto L60
        L53:
            java.lang.String r9 = "imei"
            r6.put(r9, r8)     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = "imsi"
            r6.put(r8, r7)     // Catch: java.lang.Exception -> L2c
            r1.put(r6)     // Catch: java.lang.Exception -> L2c
        L60:
            int r5 = r5 + 1
            goto L2f
        L63:
            return r1
        L64:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "siminfo:err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    public static int m() {
            java.lang.String r0 = "TelephonyUtils"
            r1 = 0
            java.lang.String r2 = ""
            android.telephony.TelephonyManager r2 = a(r2, r1)     // Catch: java.lang.Exception -> L52
            if (r2 != 0) goto Lc
            return r1
        Lc:
            r3 = 0
            java.lang.String r4 = "getPhoneCount"
            java.lang.Object r4 = cn.jiguang.commons.L.x.a(r2, r4, r3, r3)     // Catch: java.lang.Exception -> L1e
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L1e
            if (r5 == 0) goto L20
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L1e
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L1e
            goto L3b
        L1e:
            r4 = move-exception
            goto L22
        L20:
            r4 = 0
            goto L3b
        L22:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L52
            r5.<init>()     // Catch: java.lang.Exception -> L52
            java.lang.String r6 = "sim:slot:reflection:err:"
            r5.append(r6)     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> L52
            r5.append(r4)     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L52
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L52
            goto L20
        L3b:
            if (r4 <= 0) goto L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "sim:slot:reflection:"
            r2.append(r3)     // Catch: java.lang.Exception -> L52
            r2.append(r4)     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L52
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L52
            return r4
        L52:
            r2 = move-exception
            goto L9f
        L54:
            java.lang.String r5 = "getSimCount"
            java.lang.Object r2 = cn.jiguang.commons.L.x.a(r2, r5, r3, r3)     // Catch: java.lang.Exception -> L65
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L65
            if (r3 == 0) goto L67
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L65
            int r4 = r2.intValue()     // Catch: java.lang.Exception -> L65
            goto L81
        L65:
            r2 = move-exception
            goto L69
        L67:
            r4 = 0
            goto L81
        L69:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L52
            r3.<init>()     // Catch: java.lang.Exception -> L52
            java.lang.String r5 = "sim:slot:simcount:err:"
            r3.append(r5)     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Exception -> L52
            r3.append(r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L52
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L52
        L81:
            if (r4 <= 0) goto L98
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "sim:slot:simcount:"
            r2.append(r3)     // Catch: java.lang.Exception -> L52
            r2.append(r4)     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L52
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L52
            return r4
        L98:
            java.lang.String r2 = "sim:slot:default:1"
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L52
            r0 = 1
            return r0
        L9f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "sim:slot:err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    public static android.telephony.TelephonyManager n() {
            android.telephony.TelephonyManager r0 = cn.jiguang.commons.L.ae.a     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L12
            android.content.Context r0 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L15
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L15
            cn.jiguang.commons.L.ae.a = r0     // Catch: java.lang.Exception -> L15
        L12:
            android.telephony.TelephonyManager r0 = cn.jiguang.commons.L.ae.a     // Catch: java.lang.Exception -> L15
            return r0
        L15:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "tm:err:init:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TelephonyUtils"
            cn.jiguang.commons.w.a.f(r1, r0)
            r0 = 0
            return r0
    }
}
