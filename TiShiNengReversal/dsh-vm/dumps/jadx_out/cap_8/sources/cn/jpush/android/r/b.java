package cn.jpush.android.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> a;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> f1875b;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.r.b.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.r.b.f1875b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a(android.content.Context r9) {
            java.lang.String r0 = "InAppHelper"
            r1 = 0
            java.lang.String r9 = cn.jpush.android.p.a.b(r9)     // Catch: java.lang.Throwable -> L6f
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L6f
            java.lang.String r3 = ","
            java.lang.String[] r9 = r9.split(r3)     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L6f
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L6f
            r5 = 1
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L6f
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "checkUnionTopBannerTime, topBanner exposureTime: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6f
            r5.append(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = ", server exposureTime: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6f
            r5.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L6f
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6f
            r7 = 3000(0xbb8, double:1.482E-320)
            long r3 = r3 + r7
            long r5 = r5 - r3
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L4b
            r5 = r1
        L4b:
            long r3 = (long) r9     // Catch: java.lang.Throwable -> L6f
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 < 0) goto L51
            goto L53
        L51:
            long r1 = r3 - r5
        L53:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r9.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "checkUnionTopBannerTime, should delay time: "
            r9.append(r3)     // Catch: java.lang.Throwable -> L6f
            r9.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = ", leftTime: "
            r9.append(r3)     // Catch: java.lang.Throwable -> L6f
            r9.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jpush.android.helper.Logger.d(r0, r9)     // Catch: java.lang.Throwable -> L6f
        L6f:
            return r1
    }

    public static long a(android.content.Context r10, long r11, boolean r13) {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = cn.jpush.android.s.a.a()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)
            long r11 = java.lang.Math.max(r11, r2)
            long r4 = a(r10)
            if (r13 == 0) goto L22
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 <= 0) goto L20
            long r6 = r11 - r0
            goto L23
        L20:
            r6 = r2
            goto L23
        L22:
            r6 = r11
        L23:
            long r8 = java.lang.Math.max(r4, r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "getDelayDisplayTime - stayForegroundTime: "
            r10.append(r13)
            r10.append(r0)
            java.lang.String r13 = ", delayDisTime: "
            r10.append(r13)
            r10.append(r11)
            java.lang.String r13 = ", unionDelayTime: "
            r10.append(r13)
            r10.append(r4)
            java.lang.String r13 = ", foreDelayTime: "
            r10.append(r13)
            r10.append(r6)
            java.lang.String r13 = ", realDelayTime: "
            r10.append(r13)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.String r13 = "InAppHelper"
            cn.jpush.android.helper.Logger.d(r13, r10)
            java.lang.String r10 = ", server delay time: "
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notify inapp should delay to show, delay time: "
            r0.append(r1)
            r0.append(r8)
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
        L7a:
            cn.jpush.android.helper.Logger.d(r13, r10)
            return r8
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notify inapp display directory, stay foreground time: "
            r2.append(r3)
            r2.append(r0)
            r2.append(r10)
            r2.append(r11)
            java.lang.String r10 = r2.toString()
            goto L7a
    }

    public static cn.jpush.android.t.a a(android.content.Context r6, int r7) {
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "current orientation state: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " type="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "InAppHelper"
            cn.jpush.android.helper.Logger.d(r2, r0)
            r0 = 0
            if (r6 >= 0) goto L40
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "[getLayoutConfig] get screen orientation failed, curOrientation: "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L3c:
            cn.jpush.android.helper.Logger.d(r2, r6)
            return r0
        L40:
            r3 = 2
            if (r6 != r3) goto L50
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> r3 = cn.jpush.android.r.b.f1875b
        L45:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object r3 = r3.get(r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            goto L57
        L50:
            r3 = 1
            if (r6 != r3) goto L56
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> r3 = cn.jpush.android.r.b.a
            goto L45
        L56:
            r3 = r0
        L57:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "current map: "
            r4.append(r5)
            r4.append(r3)
            r4.append(r1)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            cn.jpush.android.helper.Logger.d(r2, r7)
            if (r3 == 0) goto L85
            int r7 = r3.size()
            if (r7 != 0) goto L7a
            goto L85
        L7a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r3.get(r6)
            cn.jpush.android.t.a r6 = (cn.jpush.android.t.a) r6
            return r6
        L85:
            java.lang.String r6 = "current is null "
            goto L3c
    }

    public static void a(android.content.Context r3, long r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            cn.jpush.android.p.a.a(r3, r4)
            return
    }

    public static void a(android.content.Context r3, cn.jpush.android.d.d r4, int r5) {
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> r0 = cn.jpush.android.r.b.a
            r0.clear()
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> r0 = cn.jpush.android.r.b.f1875b
            r0.clear()
            cn.jpush.android.t.a r0 = b(r3, r4, r5)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> r0 = cn.jpush.android.r.b.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0.put(r2, r1)
            cn.jpush.android.t.a r3 = c(r3, r4, r5)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r0, r3)
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, cn.jpush.android.t.a>> r3 = cn.jpush.android.r.b.f1875b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r5, r4)
            return
    }

    public static long b(android.content.Context r8, long r9) {
            java.lang.String r0 = "InAppHelper"
            long r1 = cn.jpush.android.p.a.a(r8)     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "getIntervalTime lastShowMessageTime="
            r8.append(r3)     // Catch: java.lang.Throwable -> L74
            r8.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> L74
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L21
            return r9
        L21:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L74
            long r1 = r5 - r1
            long r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = "getIntervalTime currentTimeMillis="
            r8.append(r7)     // Catch: java.lang.Throwable -> L74
            r8.append(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "getIntervalTime diff="
            r8.append(r5)     // Catch: java.lang.Throwable -> L74
            r8.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> L74
            int r8 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r8 <= 0) goto L5d
            java.lang.String r8 = "getIntervalTime return value= 0"
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> L74
            return r3
        L5d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "getIntervalTime return value= "
            r8.append(r3)     // Catch: java.lang.Throwable -> L74
            long r1 = r9 - r1
            r8.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> L74
            return r1
        L74:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "getIntervalTime return intervalTime= "
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.d(r0, r8)
            return r9
    }

    private static cn.jpush.android.t.a b(android.content.Context r5, cn.jpush.android.d.d r6, int r7) {
            r0 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = cn.jpush.android.u.b.c(r7)
            r3 = 40
            if (r3 == r7) goto L25
            if (r2 == 0) goto L17
            goto L25
        L17:
            cn.jpush.android.t.a r5 = new cn.jpush.android.t.a
            r5.<init>()
            cn.jpush.android.t.a r5 = r5.e(r1)
            cn.jpush.android.t.a r5 = r5.f(r1)
            return r5
        L25:
            android.util.DisplayMetrics r7 = cn.jpush.android.ad.m.a(r5)
            if (r2 == 0) goto L2d
            r5 = -2
            goto L33
        L2d:
            r2 = 94
            int r5 = cn.jpush.android.ad.m.a(r5, r2)
        L33:
            cn.jpush.android.t.a r2 = new cn.jpush.android.t.a
            r2.<init>()
            cn.jpush.android.t.a r2 = r2.a(r0)
            cn.jpush.android.t.a r0 = r2.b(r0)
            int r2 = r7.heightPixels
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            cn.jpush.android.t.a r0 = r0.a(r2)
            int r2 = r7.widthPixels
            float r2 = (float) r2
            r4 = 1063675494(0x3f666666, float:0.9)
            float r2 = r2 * r4
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            cn.jpush.android.t.a r0 = r0.b(r2)
            cn.jpush.android.t.a r0 = r0.e(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            cn.jpush.android.t.a r5 = r0.f(r5)
            int r0 = r6.aH
            if (r0 != 0) goto L74
            r0 = 48
            goto L76
        L74:
            r0 = 80
        L76:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.t.a r5 = r5.c(r0)
            r0 = 65824(0x10120, float:9.2239E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.t.a r5 = r5.d(r0)
            int r0 = r7.heightPixels
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.t.a r5 = r5.a(r0)
            int r7 = r7.widthPixels
            float r7 = (float) r7
            float r7 = r7 * r4
            int r7 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            cn.jpush.android.t.a r5 = r5.b(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0 = 1
            cn.jpush.android.t.a r5 = r5.a(r0)
            cn.jpush.android.t.a r5 = r5.a(r7)
            cn.jpush.android.t.a r5 = r5.b(r7)
            cn.jpush.android.t.a r5 = r5.b(r0)
            int r6 = r6.bb
            int r6 = r6 * 1000
            float r6 = (float) r6
            cn.jpush.android.t.a r5 = r5.a(r6)
            r6 = 1140457472(0x43fa0000, float:500.0)
            cn.jpush.android.t.a r5 = r5.b(r6)
            cn.jpush.android.t.a r5 = r5.c(r6)
            return r5
    }

    private static cn.jpush.android.t.a c(android.content.Context r4, cn.jpush.android.d.d r5, int r6) {
            r0 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = cn.jpush.android.u.b.c(r6)
            r3 = 40
            if (r3 == r6) goto L25
            if (r2 == 0) goto L17
            goto L25
        L17:
            cn.jpush.android.t.a r4 = new cn.jpush.android.t.a
            r4.<init>()
            cn.jpush.android.t.a r4 = r4.e(r1)
            cn.jpush.android.t.a r4 = r4.f(r1)
            return r4
        L25:
            android.util.DisplayMetrics r6 = cn.jpush.android.ad.m.a(r4)
            int r1 = r6.heightPixels
            if (r2 == 0) goto L2f
            r4 = -2
            goto L35
        L2f:
            r2 = 94
            int r4 = cn.jpush.android.ad.m.a(r4, r2)
        L35:
            cn.jpush.android.t.a r2 = new cn.jpush.android.t.a
            r2.<init>()
            cn.jpush.android.t.a r2 = r2.a(r0)
            cn.jpush.android.t.a r0 = r2.b(r0)
            int r2 = r6.heightPixels
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            cn.jpush.android.t.a r0 = r0.a(r2)
            int r6 = r6.widthPixels
            float r6 = (float) r6
            r2 = 1063675494(0x3f666666, float:0.9)
            float r6 = r6 * r2
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            cn.jpush.android.t.a r6 = r0.b(r6)
            int r0 = r5.aH
            if (r0 != 0) goto L6a
            r0 = 48
            goto L6c
        L6a:
            r0 = 80
        L6c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.t.a r6 = r6.c(r0)
            r0 = 65824(0x10120, float:9.2239E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.t.a r6 = r6.d(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            cn.jpush.android.t.a r6 = r6.e(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            cn.jpush.android.t.a r4 = r6.f(r4)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0 = 1
            cn.jpush.android.t.a r4 = r4.a(r0)
            cn.jpush.android.t.a r4 = r4.a(r6)
            cn.jpush.android.t.a r4 = r4.b(r6)
            cn.jpush.android.t.a r4 = r4.b(r0)
            int r5 = r5.bb
            int r5 = r5 * 1000
            float r5 = (float) r5
            cn.jpush.android.t.a r4 = r4.a(r5)
            r5 = 1140457472(0x43fa0000, float:500.0)
            cn.jpush.android.t.a r4 = r4.b(r5)
            cn.jpush.android.t.a r4 = r4.c(r5)
            return r4
    }
}
