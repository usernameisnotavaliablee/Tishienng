package cn.jiguang.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static int a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicBoolean f1599b;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            cn.jiguang.z.b.f1599b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r1) {
            java.lang.String r0 = "cn.jiguang.sdk.user.profile"
            cn.jiguang.e.b.a(r1, r0)
            return
    }

    public static void a(android.content.Context r2, int r3) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.R()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }

    public static void a(android.content.Context r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            cn.jiguang.d.b.b(r3, r4)
        L9:
            return
    }

    public static void a(android.content.Context r2, long r3, java.lang.String r5, java.lang.String r6) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.M()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            cn.jiguang.e.a r4 = cn.jiguang.e.a.P()
            cn.jiguang.e.a r4 = r4.a(r5)
            cn.jiguang.e.a r5 = cn.jiguang.e.a.N()
            cn.jiguang.e.a r5 = r5.a(r6)
            cn.jiguang.e.a r6 = cn.jiguang.e.a.O()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            cn.jiguang.e.a r6 = r6.a(r0)
            r0 = 4
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            cn.jiguang.e.b.b(r2, r0)
            return
    }

    public static void a(android.content.Context r3, android.os.Bundle r4) {
            if (r4 == 0) goto L81
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.z.b.f1599b
            java.lang.String r1 = "foreground"
            boolean r1 = r4.getBoolean(r1)
            r0.set(r1)
            java.lang.String r0 = "user_type"
            int r0 = r4.getInt(r0)
            cn.jiguang.z.b.a = r0
            r1 = -1
            if (r0 != r1) goto L21
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.z.b.f1599b
            boolean r0 = r0.get()
            cn.jiguang.z.b.a = r0
        L21:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit
            boolean r0 = r0.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "changeForeGroundStat:"
            r1.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.z.b.f1599b
            boolean r2 = r2.get()
            r1.append(r2)
            java.lang.String r2 = ", userActiveType:"
            r1.append(r2)
            int r2 = cn.jiguang.z.b.a
            r1.append(r2)
            java.lang.String r2 = " isCallInit="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JCoreManagerInternal"
            cn.jiguang.w.f.c(r2, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.z.b.f1599b
            boolean r1 = r1.get()
            if (r1 == 0) goto L73
            if (r0 != 0) goto L60
            goto L81
        L60:
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            int r0 = r0.f()
            r1 = 120(0x78, float:1.68E-43)
            if (r0 < r1) goto L73
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            r0.i()
        L73:
            java.lang.String r0 = "foreground_state_change"
            cn.jiguang.i.a.a(r3, r0, r4)
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jiguang.z.b.f1599b
            boolean r3 = r3.get()
            cn.jiguang.f.b.a(r3)
        L81:
            return
    }

    public static void a(android.content.Context r0, java.lang.Object r1) {
            cn.jiguang.y.g.a(r0, r1)
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1) {
            cn.jiguang.av.g.a(r0, r1)
            return
    }

    public static void a(android.content.Context r7, org.json.JSONArray r8) {
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            java.lang.String r2 = "JCore"
            r3 = 14
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void a(android.content.Context r0, org.json.JSONObject r1) {
            cn.jiguang.y.g.a(r0, r1)
            return
    }

    public static void a(android.content.Context r0, org.json.JSONObject r1, java.lang.String r2) {
            org.json.JSONObject r1 = cn.jiguang.d.a.a(r0, r1, r2)
            cn.jiguang.y.g.a(r0, r1)
            return
    }

    public static void a(java.lang.Runnable r1) {
            java.lang.String r0 = "SCHEDULE_TASK"
            cn.jiguang.au.d.a(r0, r1)
            return
    }

    public static void a(java.lang.Runnable r1, long r2) {
            java.lang.String r0 = "DELAY_TASK"
            cn.jiguang.au.d.a(r0, r1, r2)
            return
    }

    public static void b(android.content.Context r0) {
            cn.jiguang.y.e.a(r0)
            return
    }

    public static void b(android.content.Context r6, org.json.JSONObject r7, java.lang.String r8) {
            org.json.JSONObject r7 = cn.jiguang.d.a.a(r6, r7, r8)
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r8 = 0
            r5[r8] = r7
            java.lang.String r1 = "JCore"
            r2 = 14
            r3 = 0
            r4 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void b(java.lang.Runnable r1) {
            java.lang.String r0 = "MAJOR_TASK"
            cn.jiguang.au.d.a(r0, r1)
            return
    }

    public static void c(java.lang.Runnable r1) {
            java.lang.String r0 = "NORMAL_TASK"
            cn.jiguang.au.d.a(r0, r1)
            return
    }

    public static void d(java.lang.Runnable r1) {
            java.lang.String r0 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r0, r1)
            return
    }
}
