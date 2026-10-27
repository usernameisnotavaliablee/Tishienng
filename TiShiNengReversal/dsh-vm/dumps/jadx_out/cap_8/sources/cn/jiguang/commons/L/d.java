package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class d {
    private static volatile cn.jiguang.commons.c.g a;

    /* renamed from: c, reason: collision with root package name */
    private static volatile long f869c;

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r3) {
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto L13
            r1 = 3
            if (r3 == r1) goto L12
            r2 = 4
            if (r3 == r2) goto L12
            r0 = 5
            if (r3 == r0) goto L11
            r3 = -1
            return r3
        L11:
            return r1
        L12:
            return r0
        L13:
            return r1
        L14:
            r3 = 0
            return r3
    }

    private static cn.jiguang.commons.c.g a() {
            java.lang.String r0 = "BatteryUtils"
            cn.jiguang.commons.c.g r1 = new cn.jiguang.commons.c.g
            r1.<init>()
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L13
            if (r2 != 0) goto L15
            java.lang.String r2 = "Context null, cannot get battery info"
        Lf:
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> L13
            return r1
        L13:
            r2 = move-exception
            goto L2b
        L15:
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L13
            r4 = 0
            r5 = 0
            android.content.Intent r2 = cn.jiguang.commons.L.w.a(r2, r4, r3, r5)     // Catch: java.lang.Exception -> L13
            if (r2 != 0) goto L27
            java.lang.String r2 = "Failed to get battery status intent"
            goto Lf
        L27:
            a(r2, r1)     // Catch: java.lang.Exception -> L13
            return r1
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error fetching battery info: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.c(r0, r2)
            return r1
    }

    private static void a(android.content.Intent r6, cn.jiguang.commons.c.g r7) {
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = "scale"
            int r2 = r6.getIntExtra(r2, r1)
            if (r0 == r1) goto L21
            if (r2 == r1) goto L21
            if (r2 <= 0) goto L21
            float r0 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r3
            float r3 = (float) r2
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            r7.a = r0
            goto L23
        L21:
            r7.a = r1
        L23:
            r7.f1021c = r2
            java.lang.String r0 = "status"
            int r0 = r6.getIntExtra(r0, r1)
            int r2 = a(r0)
            r7.f1022d = r2
            java.lang.String r2 = "temperature"
            int r2 = r6.getIntExtra(r2, r1)
            if (r2 == r1) goto L3a
            goto L3b
        L3a:
            r2 = -1
        L3b:
            r7.f1023e = r2
            java.lang.String r2 = "voltage"
            int r2 = r6.getIntExtra(r2, r1)
            if (r2 == r1) goto L47
            goto L48
        L47:
            r2 = -1
        L48:
            r7.f1024f = r2
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r3) goto L55
            r5 = 5
            if (r0 != r5) goto L53
            goto L55
        L53:
            r0 = 0
            goto L56
        L55:
            r0 = 1
        L56:
            r7.f1025g = r0
            java.lang.String r0 = "plugged"
            int r6 = r6.getIntExtra(r0, r1)
            if (r6 == r4) goto L65
            if (r6 == r3) goto L65
            r0 = 4
            if (r6 != r0) goto L66
        L65:
            r2 = 1
        L66:
            r7.f1026h = r2
            r7.f1027i = r6
            return
    }

    public static cn.jiguang.commons.c.g c() {
            long r0 = java.lang.System.currentTimeMillis()
            cn.jiguang.commons.c.g r2 = cn.jiguang.commons.L.d.a
            if (r2 == 0) goto L15
            long r2 = cn.jiguang.commons.L.d.f869c
            long r2 = r0 - r2
            r4 = 5000(0x1388, double:2.4703E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L15
            cn.jiguang.commons.c.g r0 = cn.jiguang.commons.L.d.a
            return r0
        L15:
            cn.jiguang.commons.c.g r2 = a()
            cn.jiguang.commons.L.d.a = r2
            cn.jiguang.commons.L.d.f869c = r0
            return r2
    }
}
