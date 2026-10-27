package com.bytedance.msdk.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int cw(java.lang.String r7, java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Le
            return r1
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r2 = -1
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r3 = 1
            if (r0 == 0) goto L1e
            return r3
        L1e:
            java.lang.String r0 = "v"
            boolean r4 = r7.startsWith(r0)
            java.lang.String r5 = "V"
            if (r4 != 0) goto L2e
            boolean r4 = r7.startsWith(r5)
            if (r4 == 0) goto L32
        L2e:
            java.lang.String r7 = r7.substring(r3)
        L32:
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L3e
            boolean r0 = r8.startsWith(r5)
            if (r0 == 0) goto L42
        L3e:
            java.lang.String r8 = r8.substring(r3)
        L42:
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r7.length
            int r4 = r8.length
            int r0 = java.lang.Math.min(r0, r4)
            r4 = 0
        L53:
            if (r4 >= r0) goto L81
            r5 = r7[r4]
            int r5 = r5.length()
            r6 = r8[r4]
            int r6 = r6.length()
            if (r5 != r6) goto L71
            r5 = r7[r4]
            r6 = r8[r4]
            int r5 = r5.compareTo(r6)
            if (r5 == 0) goto L6e
            return r5
        L6e:
            int r4 = r4 + 1
            goto L53
        L71:
            r7 = r7[r4]
            int r7 = r7.length()
            r8 = r8[r4]
            int r8 = r8.length()
            if (r7 <= r8) goto L80
            return r3
        L80:
            return r2
        L81:
            int r0 = r7.length
            int r4 = r8.length
            if (r0 != r4) goto L86
            return r1
        L86:
            int r7 = r7.length
            int r8 = r8.length
            if (r7 <= r8) goto L8b
            return r3
        L8b:
            return r2
    }

    public static void j() {
            boolean r0 = com.bytedance.msdk.j.up.cw.xt()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L7
            goto L10
        L7:
            boolean r0 = com.bytedance.msdk.api.r.oq.j()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L10
            xt()     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    private static void j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "接入版本正常, 要求版为："
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "，当前版本为："
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "TTMediationSDK_InitChecker"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            return
    }

    public static boolean j(java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L215
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lf
            goto L215
        Lf:
            java.lang.String r0 = "baidu"
            boolean r0 = r5.equals(r0)
            r2 = 1
            if (r0 != 0) goto L214
            java.lang.String r0 = "admob"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L214
            java.lang.String r0 = "pangle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L214
        L2a:
            int r0 = r5.hashCode()
            r3 = -1
            switch(r0) {
                case -1128782217: goto L75;
                case -902468465: goto L6a;
                case -759499589: goto L5f;
                case 3432: goto L54;
                case 102199: goto L49;
                case 111433589: goto L3e;
                case 1126045977: goto L33;
                default: goto L32;
            }
        L32:
            goto L7f
        L33:
            java.lang.String r0 = "mintegral"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3c
            goto L7f
        L3c:
            r3 = 6
            goto L7f
        L3e:
            java.lang.String r0 = "unity"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L47
            goto L7f
        L47:
            r3 = 5
            goto L7f
        L49:
            java.lang.String r0 = "gdt"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L52
            goto L7f
        L52:
            r3 = 4
            goto L7f
        L54:
            java.lang.String r0 = "ks"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5d
            goto L7f
        L5d:
            r3 = 3
            goto L7f
        L5f:
            java.lang.String r0 = "xiaomi"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L68
            goto L7f
        L68:
            r3 = 2
            goto L7f
        L6a:
            java.lang.String r0 = "sigmob"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L73
            goto L7f
        L73:
            r3 = 1
            goto L7f
        L75:
            java.lang.String r0 = "klevin"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L7e
            goto L7f
        L7e:
            r3 = 0
        L7f:
            java.lang.String r5 = "，当前是"
            java.lang.String r0 = "TTMediationSDK_InitChecker"
            switch(r3) {
                case 0: goto L1dd;
                case 1: goto L1a5;
                case 2: goto L16d;
                case 3: goto L135;
                case 4: goto Lfd;
                case 5: goto Lc5;
                case 6: goto L87;
                default: goto L86;
            }
        L86:
            return r1
        L87:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r4 = "16.6.57"
            if (r3 != 0) goto Lad
            boolean r3 = r6.contains(r4)
            if (r3 == 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Mintegral版本正常, 要求版本等于"
            r1.<init>(r3)
            r1.append(r4)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            return r2
        Lad:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Mintegral版本不符合, 要求版本等于"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        Lc5:
            java.lang.String r3 = "4.3.0"
            int r4 = cw(r6, r3)
            if (r4 == 0) goto Le5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "unity版本不符合，要求等于"
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        Le5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "unity版本正常，要求等于"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            return r2
        Lfd:
            java.lang.String r3 = "4.640.1510"
            int r4 = cw(r6, r3)
            if (r4 == 0) goto L11d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "gdt版本不符合，要求等于"
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        L11d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "gdt版本正常，要求等于"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            return r2
        L135:
            java.lang.String r3 = "3.3.76.5"
            int r4 = cw(r6, r3)
            if (r4 == 0) goto L155
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "快手版本不符合, 要求版本等于"
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        L155:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "快手版本正常, 要求版本等于"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            return r2
        L16d:
            java.lang.String r3 = "2.11.0.3.31"
            int r4 = cw(r6, r3)
            if (r4 == 0) goto L18d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "xiaomi版本不符合, 要求版本等于"
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        L18d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "xiaomi版本正常, 要求版本等于"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            return r2
        L1a5:
            java.lang.String r3 = "4.22.2"
            int r4 = cw(r6, r3)
            if (r4 == 0) goto L1c5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "sigmob版本不符合, 要求版本等于"
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        L1c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "sigmob版本正常, 要求版本等于"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            return r2
        L1dd:
            java.lang.String r3 = "2.11.0.3"
            int r4 = cw(r6, r3)
            if (r4 == 0) goto L1fd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "klevin版本不符合, 要求版本等于"
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            return r1
        L1fd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "klevin版本正常, 要求版本等于"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r5)
        L214:
            return r2
        L215:
            return r1
    }

    private static boolean r(java.lang.String r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L6f
            if (r6 != 0) goto L6
            goto L6f
        L6:
            int r1 = r5.length()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            int r1 = r6.length()
            if (r1 != 0) goto L14
            return r0
        L14:
            int r1 = r5.length()
            int r2 = r6.length()
            if (r1 <= r2) goto L1f
            return r0
        L1f:
            java.lang.String r1 = "v"
            boolean r2 = r5.startsWith(r1)
            java.lang.String r3 = "V"
            r4 = 1
            if (r2 != 0) goto L30
            boolean r2 = r5.startsWith(r3)
            if (r2 == 0) goto L34
        L30:
            java.lang.String r5 = r5.substring(r4)
        L34:
            boolean r1 = r6.startsWith(r1)
            if (r1 != 0) goto L40
            boolean r1 = r6.startsWith(r3)
            if (r1 == 0) goto L44
        L40:
            java.lang.String r6 = r6.substring(r4)
        L44:
            java.lang.String r1 = "\\."
            java.lang.String[] r5 = r5.split(r1)
            java.lang.String[] r6 = r6.split(r1)
            r1 = 0
        L4f:
            int r2 = r5.length
            if (r1 >= r2) goto L6e
            r2 = r5[r1]
            int r2 = r2.length()
            r3 = r5[r1]
            int r3 = r3.length()
            if (r2 != r3) goto L6b
            r2 = r5[r1]
            r3 = r6[r1]
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L6b
            return r0
        L6b:
            int r1 = r1 + 1
            goto L4f
        L6e:
            return r4
        L6f:
            return r0
    }

    private static synchronized void xt() {
            java.lang.Class<com.bytedance.msdk.m.j> r0 = com.bytedance.msdk.m.j.class
            monitor-enter(r0)
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            com.bytedance.msdk.ae.j.xt r1 = com.bytedance.msdk.ae.j.xt.j()     // Catch: java.lang.Throwable -> L14
            r1.r()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    private static void xt(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "接入版本不符合, 要求版为："
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ".x，当前版本为："
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "TTMediationSDK_InitChecker"
            com.bytedance.msdk.j.up.cw.r(r2, r1)
            return
    }

    public static boolean xt(java.lang.String r6, java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L139
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Lf
            goto L139
        Lf:
            java.lang.String r0 = "pangle"
            boolean r0 = r6.equals(r0)
            r2 = 1
            if (r0 == 0) goto L19
            return r2
        L19:
            int r0 = r6.hashCode()
            java.lang.String r3 = "gdt"
            java.lang.String r4 = "ks"
            r5 = -1
            switch(r0) {
                case -1128782217: goto L7d;
                case -902468465: goto L72;
                case -759499589: goto L67;
                case 3432: goto L5e;
                case 102199: goto L55;
                case 92668925: goto L4a;
                case 93498907: goto L3f;
                case 111433589: goto L34;
                case 1126045977: goto L27;
                default: goto L25;
            }
        L25:
            goto L87
        L27:
            java.lang.String r0 = "mintegral"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L31
            goto L87
        L31:
            r5 = 8
            goto L87
        L34:
            java.lang.String r0 = "unity"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3d
            goto L87
        L3d:
            r5 = 7
            goto L87
        L3f:
            java.lang.String r0 = "baidu"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L48
            goto L87
        L48:
            r5 = 6
            goto L87
        L4a:
            java.lang.String r0 = "admob"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L53
            goto L87
        L53:
            r5 = 5
            goto L87
        L55:
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L5c
            goto L87
        L5c:
            r5 = 4
            goto L87
        L5e:
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L65
            goto L87
        L65:
            r5 = 3
            goto L87
        L67:
            java.lang.String r0 = "xiaomi"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L70
            goto L87
        L70:
            r5 = 2
            goto L87
        L72:
            java.lang.String r0 = "sigmob"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L7b
            goto L87
        L7b:
            r5 = 1
            goto L87
        L7d:
            java.lang.String r0 = "klevin"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L86
            goto L87
        L86:
            r5 = 0
        L87:
            switch(r5) {
                case 0: goto L128;
                case 1: goto L116;
                case 2: goto L104;
                case 3: goto Lec;
                case 4: goto Ld4;
                case 5: goto Lc2;
                case 6: goto Lb0;
                case 7: goto L9e;
                case 8: goto L8c;
                default: goto L8a;
            }
        L8a:
            goto L103
        L8c:
            java.lang.String r6 = "16.6.57"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "mtgAdapter"
            if (r0 == 0) goto L9a
            j(r3, r6, r7)
            return r2
        L9a:
            xt(r3, r6, r7)
            return r1
        L9e:
            java.lang.String r6 = "4.3.0"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "unityAdapter"
            if (r0 == 0) goto Lac
            j(r3, r6, r7)
            return r2
        Lac:
            xt(r3, r6, r7)
            return r1
        Lb0:
            java.lang.String r6 = "9.3905"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "baiduAdapter"
            if (r0 == 0) goto Lbe
            j(r3, r6, r7)
            return r2
        Lbe:
            xt(r3, r6, r7)
            return r1
        Lc2:
            java.lang.String r6 = "17.2.0"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "admobAdapter"
            if (r0 == 0) goto Ld0
            j(r3, r6, r7)
            return r2
        Ld0:
            xt(r3, r6, r7)
            return r1
        Ld4:
            java.util.function.Function r6 = com.bytedance.msdk.core.j.j.up.cw(r3)
            if (r6 != 0) goto L103
            java.lang.String r6 = "4.640.1510"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "gdtAdapter"
            if (r0 == 0) goto Le8
            j(r3, r6, r7)
            return r2
        Le8:
            xt(r3, r6, r7)
            return r1
        Lec:
            java.util.function.Function r6 = com.bytedance.msdk.core.j.j.up.cw(r4)
            if (r6 != 0) goto L103
            java.lang.String r6 = "3.3.76.5"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "ksAdapter"
            if (r0 == 0) goto L100
            j(r3, r6, r7)
            return r2
        L100:
            xt(r3, r6, r7)
        L103:
            return r1
        L104:
            java.lang.String r6 = "2.11.0.3.31"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "xiaomiAdapter"
            if (r0 == 0) goto L112
            j(r3, r6, r7)
            return r2
        L112:
            xt(r3, r6, r7)
            return r1
        L116:
            java.lang.String r6 = "4.22.2"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "sigmobAdapter"
            if (r0 == 0) goto L124
            j(r3, r6, r7)
            return r2
        L124:
            xt(r3, r6, r7)
            return r1
        L128:
            java.lang.String r6 = "2.11.0.3"
            boolean r0 = r(r6, r7)
            java.lang.String r3 = "klevinAdapter"
            if (r0 == 0) goto L136
            j(r3, r6, r7)
            return r2
        L136:
            xt(r3, r6, r7)
        L139:
            return r1
    }
}
