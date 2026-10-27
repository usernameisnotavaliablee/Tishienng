package com.bytedance.adsdk.ugeno.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {

    /* renamed from: com.bytedance.adsdk.ugeno.m.j$j, reason: collision with other inner class name */
    public static class C0190j {
        public float[] cw;
        public android.graphics.drawable.GradientDrawable.Orientation j;
        public int[] xt;

        public C0190j() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean cw(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "linear-gradient"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            return r1
    }

    public static int j(int r2, int r3) {
            r0 = 255(0xff, float:3.57E-43)
            if (r3 < 0) goto L6
            if (r3 <= r0) goto Lf
        L6:
            java.lang.String r3 = "ColorUtils"
            java.lang.String r1 = "alpha must be between 0 and 255. "
            com.bytedance.sdk.component.utils.vl.r(r3, r1)
            r3 = 255(0xff, float:3.57E-43)
        Lf:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            int r3 = r3 << 24
            r2 = r2 | r3
            return r2
    }

    public static int j(java.lang.String r1) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = j(r1, r0)
            return r1
    }

    public static int j(java.lang.String r3, char r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
        L9:
            int r2 = r3.length()
            if (r1 >= r2) goto L1a
            char r2 = r3.charAt(r1)
            if (r2 != r4) goto L17
            int r0 = r0 + 1
        L17:
            int r1 = r1 + 1
            goto L9
        L1a:
            return r0
    }

    public static int j(java.lang.String r6, int r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L8
            goto Lc1
        L8:
            java.lang.String r0 = "transparent"
            boolean r0 = r6.equals(r0)
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            char r0 = r6.charAt(r1)
            r2 = 4
            r3 = 35
            r4 = 1
            if (r0 != r3) goto L46
            int r0 = r6.length()
            if (r0 != r2) goto L46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "#"
            r7.<init>(r0)
            char[] r6 = r6.toCharArray()
        L2d:
            int r0 = r6.length
            if (r4 >= r0) goto L3d
            char r0 = r6[r4]
            r7.append(r0)
            char r0 = r6[r4]
            r7.append(r0)
            int r4 = r4 + 1
            goto L2d
        L3d:
            java.lang.String r6 = r7.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            return r6
        L46:
            char r0 = r6.charAt(r1)
            if (r0 != r3) goto L58
            int r0 = r6.length()
            r5 = 7
            if (r0 != r5) goto L58
            int r6 = android.graphics.Color.parseColor(r6)
            return r6
        L58:
            char r0 = r6.charAt(r1)
            if (r0 != r3) goto L6b
            int r0 = r6.length()
            r3 = 9
            if (r0 != r3) goto L6b
            int r6 = android.graphics.Color.parseColor(r6)
            return r6
        L6b:
            java.lang.String r0 = "rgba"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L76
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r6
        L76:
            java.lang.String r0 = "("
            int r0 = r6.indexOf(r0)
            int r0 = r0 + r4
            java.lang.String r3 = ")"
            int r3 = r6.indexOf(r3)
            java.lang.String r6 = r6.substring(r0, r3)
            java.lang.String r0 = ","
            java.lang.String[] r6 = r6.split(r0)
            if (r6 == 0) goto Lc1
            int r0 = r6.length
            if (r0 != r2) goto Lc1
            r7 = r6[r1]
            float r7 = java.lang.Float.parseFloat(r7)
            r0 = r6[r4]
            float r0 = java.lang.Float.parseFloat(r0)
            r1 = 2
            r1 = r6[r1]
            float r1 = java.lang.Float.parseFloat(r1)
            r2 = 3
            r6 = r6[r2]
            float r6 = java.lang.Float.parseFloat(r6)
            r2 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r2
            int r6 = (int) r6
            int r6 = r6 << 24
            int r7 = (int) r7
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = (int) r0
            int r7 = r7 << 8
            r6 = r6 | r7
            int r7 = (int) r1
            r6 = r6 | r7
            return r6
        Lc1:
            return r7
    }

    public static android.graphics.drawable.GradientDrawable.Orientation r(java.lang.String r2) {
            java.lang.String r0 = "deg"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L1c
            int r0 = r2.length()     // Catch: java.lang.Exception -> L46
            int r0 = r0 + (-3)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L46
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L46
            goto L20
        L1c:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L46
        L20:
            r0 = 90
            if (r2 != r0) goto L27
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch: java.lang.Exception -> L46
            return r2
        L27:
            r0 = 180(0xb4, float:2.52E-43)
            if (r2 != r0) goto L2e
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch: java.lang.Exception -> L46
            return r2
        L2e:
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 != r0) goto L35
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT     // Catch: java.lang.Exception -> L46
            return r2
        L35:
            r0 = 135(0x87, float:1.89E-43)
            if (r2 != r0) goto L3c
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch: java.lang.Exception -> L46
            return r2
        L3c:
            r0 = 45
            if (r2 != r0) goto L43
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR     // Catch: java.lang.Exception -> L46
            return r2
        L43:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP     // Catch: java.lang.Exception -> L46
            return r2
        L46:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            return r2
    }

    public static com.bytedance.adsdk.ugeno.m.j.C0190j xt(java.lang.String r13) {
            java.lang.String r0 = "%"
            java.lang.String r1 = ")"
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto Lc
            return r2
        Lc:
            java.lang.String r3 = "("
            int r3 = r13.indexOf(r3)     // Catch: java.lang.Throwable -> Lab
            int r3 = r3 + 1
            int r4 = r13.lastIndexOf(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r13 = r13.substring(r3, r4)     // Catch: java.lang.Throwable -> Lab
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L23
            return r2
        L23:
            r3 = 37
            int r3 = j(r13, r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = ","
            int r4 = r13.indexOf(r4)     // Catch: java.lang.Throwable -> Lab
            r5 = 0
            java.lang.String r6 = r13.substring(r5, r4)     // Catch: java.lang.Throwable -> Lab
            com.bytedance.adsdk.ugeno.m.j$j r7 = new com.bytedance.adsdk.ugeno.m.j$j     // Catch: java.lang.Throwable -> Lab
            r7.<init>()     // Catch: java.lang.Throwable -> Lab
            android.graphics.drawable.GradientDrawable$Orientation r6 = r(r6)     // Catch: java.lang.Throwable -> Lab
            r7.j = r6     // Catch: java.lang.Throwable -> Lab
            int r4 = r4 + 1
            java.lang.String r13 = r13.substring(r4)     // Catch: java.lang.Throwable -> Lab
            int[] r4 = new int[r3]     // Catch: java.lang.Throwable -> Lab
            float[] r6 = new float[r3]     // Catch: java.lang.Throwable -> Lab
            r8 = 0
        L4a:
            if (r8 >= r3) goto La2
            int r9 = r13.indexOf(r0)     // Catch: java.lang.Throwable -> Lab
            int r10 = r9 + 1
            java.lang.String r10 = r13.substring(r5, r10)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = r10.trim()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r11 = "rgba"
            boolean r11 = r10.contains(r11)     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto L67
            int r11 = r10.indexOf(r1)     // Catch: java.lang.Throwable -> Lab
            goto L6d
        L67:
            java.lang.String r11 = " "
            int r11 = r10.indexOf(r11)     // Catch: java.lang.Throwable -> Lab
        L6d:
            int r11 = r11 + 1
            java.lang.String r12 = r10.substring(r5, r11)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> Lab
            int r12 = j(r12)     // Catch: java.lang.Throwable -> Lab
            r4[r8] = r12     // Catch: java.lang.Throwable -> Lab
            int r12 = r10.indexOf(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = r10.substring(r11, r12)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = r10.trim()     // Catch: java.lang.Throwable -> Lab
            r11 = 0
            float r10 = com.bytedance.adsdk.ugeno.m.cw.j(r10, r11)     // Catch: java.lang.Throwable -> Lab
            r11 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r11
            r6[r8] = r10     // Catch: java.lang.Throwable -> Lab
            int r10 = r13.length()     // Catch: java.lang.Throwable -> Lab
            int r9 = r9 + 2
            if (r10 <= r9) goto La2
            java.lang.String r13 = r13.substring(r9)     // Catch: java.lang.Throwable -> Lab
            int r8 = r8 + 1
            goto L4a
        La2:
            r13 = 2
            if (r3 >= r13) goto La6
            return r2
        La6:
            r7.xt = r4     // Catch: java.lang.Throwable -> Lab
            r7.cw = r6     // Catch: java.lang.Throwable -> Lab
            return r7
        Lab:
            return r2
    }
}
