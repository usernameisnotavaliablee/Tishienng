package com.bytedance.msdk.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(int r1) {
            r0 = 3
            if (r1 != r0) goto L6
            java.lang.String r1 = "gdt"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "admob"
            return r1
        Lc:
            r0 = 1
            if (r1 != r0) goto L12
            java.lang.String r1 = "pangle"
            return r1
        L12:
            r0 = 4
            if (r1 != r0) goto L18
            java.lang.String r1 = "mintegral"
            return r1
        L18:
            r0 = 5
            if (r1 != r0) goto L1e
            java.lang.String r1 = "unity"
            return r1
        L1e:
            r0 = 6
            if (r1 != r0) goto L24
            java.lang.String r1 = "baidu"
            return r1
        L24:
            r0 = 7
            if (r1 != r0) goto L2a
            java.lang.String r1 = "ks"
            return r1
        L2a:
            r0 = 8
            if (r1 != r0) goto L31
            java.lang.String r1 = "sigmob"
            return r1
        L31:
            r0 = 9
            if (r1 != r0) goto L38
            java.lang.String r1 = "klevin"
            return r1
        L38:
            r0 = 10
            if (r1 != r0) goto L3f
            java.lang.String r1 = "xiaomi"
            return r1
        L3f:
            r0 = -1
            if (r1 != r0) goto L45
            java.lang.String r1 = "custom"
            return r1
        L45:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String j(int r4, int r5) {
            java.lang.String r0 = "Banner"
            java.lang.String r1 = "Draw"
            java.lang.String r2 = "Interstitial"
            java.lang.String r3 = "FullVideo"
            switch(r4) {
                case 1: goto L36;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L32;
                case 5: goto L23;
                case 6: goto Lb;
                case 7: goto L18;
                case 8: goto L17;
                case 9: goto L16;
                case 10: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L14
        Lc:
            r4 = 1
            if (r5 != r4) goto L10
            return r2
        L10:
            r4 = 2
            if (r5 != r4) goto L14
            return r3
        L14:
            r4 = 0
            return r4
        L16:
            return r1
        L17:
            return r3
        L18:
            r4 = 6
            java.lang.String r0 = "RewardVideo"
            if (r5 != r4) goto L1e
            return r0
        L1e:
            r4 = 7
            if (r5 != r4) goto L22
            return r3
        L22:
            return r0
        L23:
            r4 = 4
            java.lang.String r2 = "Native"
            if (r5 != r4) goto L29
            return r2
        L29:
            r4 = 5
            if (r5 != r4) goto L2d
            return r1
        L2d:
            r4 = 3
            if (r5 != r4) goto L31
            return r0
        L31:
            return r2
        L32:
            java.lang.String r4 = "Splash"
            return r4
        L35:
            return r2
        L36:
            return r0
    }

    public static java.lang.String j(int r4, int r5, com.bytedance.msdk.core.oq.oq r6) {
            java.lang.String r0 = "Banner"
            java.lang.String r1 = "NativeDraw"
            r2 = 1
            switch(r4) {
                case 1: goto L47;
                case 2: goto L44;
                case 3: goto L41;
                case 4: goto L41;
                case 5: goto L27;
                case 6: goto L8;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L16;
                case 10: goto L9;
                default: goto L8;
            }
        L8:
            goto L14
        L9:
            if (r5 != r2) goto Le
            java.lang.String r4 = "InterstitialFull—Interstitial"
            return r4
        Le:
            r4 = 2
            if (r5 != r4) goto L14
            java.lang.String r4 = "InterstitialFull—FullVideo"
            return r4
        L14:
            r4 = 0
            return r4
        L16:
            return r1
        L17:
            java.lang.String r4 = "FullVideo"
            return r4
        L1a:
            r4 = 6
            java.lang.String r6 = "Reward_RewardVideo"
            if (r5 != r4) goto L20
            return r6
        L20:
            r4 = 7
            if (r5 != r4) goto L26
            java.lang.String r4 = "Reward_FullVideo"
            return r4
        L26:
            return r6
        L27:
            r4 = 4
            java.lang.String r3 = "Native-自渲染"
            if (r5 != r4) goto L38
            if (r6 == 0) goto L37
            int r4 = r6.oq()
            if (r4 != r2) goto L37
            java.lang.String r4 = "Native-模板渲染"
            return r4
        L37:
            return r3
        L38:
            r4 = 5
            if (r5 != r4) goto L3c
            return r1
        L3c:
            r4 = 3
            if (r5 != r4) goto L40
            return r0
        L40:
            return r3
        L41:
            java.lang.String r4 = "Splash"
            return r4
        L44:
            java.lang.String r4 = "Interstitial"
            return r4
        L47:
            return r0
    }

    public static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r0 = "gdt"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.String r0 = "admob"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L19
            return r0
        L19:
            java.lang.String r0 = "pangle"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = "mintegral"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L2b
            return r0
        L2b:
            java.lang.String r0 = "unity"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L34
            return r0
        L34:
            java.lang.String r0 = "baidu"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L3d
            return r0
        L3d:
            java.lang.String r0 = "ks"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L46
            return r0
        L46:
            java.lang.String r0 = "sigmob"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L4f
            return r0
        L4f:
            java.lang.String r0 = "klevin"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L58
            return r0
        L58:
            java.lang.String r0 = "xiaomi"
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 == 0) goto L61
            return r0
        L61:
            return r2
    }

    public static int xt(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "gdt"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L12
            r1 = 3
            return r1
        L12:
            java.lang.String r0 = "admob"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1c
            r1 = 2
            return r1
        L1c:
            java.lang.String r0 = "pangle"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L26
            r1 = 1
            return r1
        L26:
            java.lang.String r0 = "mintegral"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L30
            r1 = 4
            return r1
        L30:
            java.lang.String r0 = "unity"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L3a
            r1 = 5
            return r1
        L3a:
            java.lang.String r0 = "baidu"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L44
            r1 = 6
            return r1
        L44:
            java.lang.String r0 = "ks"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L4e
            r1 = 7
            return r1
        L4e:
            java.lang.String r0 = "sigmob"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L59
            r1 = 8
            return r1
        L59:
            java.lang.String r0 = "klevin"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L64
            r1 = 9
            return r1
        L64:
            java.lang.String r0 = "xiaomi"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L6f
            r1 = 10
            return r1
        L6f:
            r1 = -1
            return r1
    }

    public static java.lang.String xt(int r0) {
            switch(r0) {
                case 1: goto L1b;
                case 2: goto L18;
                case 3: goto L15;
                case 4: goto L15;
                case 5: goto L12;
                case 6: goto L3;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L9;
                case 10: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UnKnow"
            return r0
        L6:
            java.lang.String r0 = "InterstitialFull"
            return r0
        L9:
            java.lang.String r0 = "Draw"
            return r0
        Lc:
            java.lang.String r0 = "FullVideo"
            return r0
        Lf:
            java.lang.String r0 = "RewardVideo"
            return r0
        L12:
            java.lang.String r0 = "Native"
            return r0
        L15:
            java.lang.String r0 = "Splash"
            return r0
        L18:
            java.lang.String r0 = "Interstitial"
            return r0
        L1b:
            java.lang.String r0 = "Banner"
            return r0
    }
}
