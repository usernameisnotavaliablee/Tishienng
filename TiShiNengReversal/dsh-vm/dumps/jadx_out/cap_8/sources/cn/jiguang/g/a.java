package cn.jiguang.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static long a;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r8, int r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sendStartAPP:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JAnalytics"
            cn.jiguang.w.f.c(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = cn.jiguang.g.a.a
            long r4 = r2 - r4
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L39
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "sendStartAPP return:"
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            cn.jiguang.w.f.c(r1, r8)
            return
        L39:
            cn.jiguang.g.a.a = r2
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "type"
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L45
        L45:
            r9 = 2021(0x7e5, float:2.832E-42)
            java.lang.String r1 = "Start the APP"
            a(r8, r9, r1, r0)
            return
    }

    public static void a(android.content.Context r0, int r1, java.lang.String r2, org.json.JSONObject r3) {
            b(r0, r1, r2, r3)
            return
    }

    public static void b(android.content.Context r1, int r2, java.lang.String r3, org.json.JSONObject r4) {
            if (r1 != 0) goto La
            java.lang.String r1 = "JAnalytics"
            java.lang.String r2 = "reportPushAnylysis NULL context"
            cn.jiguang.w.f.l(r1, r2)
            return
        La:
            boolean r3 = cn.jiguang.a.a.a()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = ""
            if (r3 == 0) goto L1c
            cn.jiguang.ad.b r3 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L25
            r0 = 2008(0x7d8, float:2.814E-42)
            r3.a(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L25
            return
        L1c:
            cn.jiguang.ad.b r3 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L25
            r0 = 2009(0x7d9, float:2.815E-42)
            r3.a(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L25
        L25:
            return
    }
}
