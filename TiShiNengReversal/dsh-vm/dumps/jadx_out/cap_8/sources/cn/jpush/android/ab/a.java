package cn.jpush.android.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static java.lang.String a = "JPushStatusUtils";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1607b;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r5) {
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.PushStatusSyncTime()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = cn.jpush.android.cache.Sp.get(r5, r2)     // Catch: java.lang.Throwable -> L55
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L55
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L55
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L55
            r2 = -1702967296(0xffffffff9a7ec800, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L54
            boolean r0 = cn.jpush.android.cache.a.e(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = cn.jpush.android.ab.a.a     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "push current status  ="
            r2.append(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "resume"
            if (r0 == 0) goto L35
            java.lang.String r4 = "stop "
            goto L36
        L35:
            r4 = r3
        L36:
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L55
            cn.jpush.android.helper.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L54
            r0 = 1
            cn.jpush.android.ab.a.f1607b = r0     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "JPUSH"
            r1 = 0
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r5, r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L55
            r1 = 4
            r2 = 0
            r0.setPushStatusWithCallBack(r5, r1, r2)     // Catch: java.lang.Throwable -> L55
        L54:
            return
        L55:
            r5 = move-exception
            java.lang.String r0 = cn.jpush.android.ab.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "syncCurrentStatus throwable="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r5)
            return
    }

    public static void a(android.content.Context r9, int r10, int r11) {
            r0 = 2006(0x7d6, float:2.811E-42)
            r1 = 2007(0x7d7, float:2.812E-42)
            r2 = 1
            if (r10 != 0) goto L4c
            java.lang.String r3 = "set success"
            if (r11 != 0) goto L46
            boolean r11 = cn.jpush.android.ab.a.f1607b
            r0 = 0
            if (r11 == 0) goto L2a
            cn.jpush.android.ab.a.f1607b = r0
            cn.jpush.android.cache.Key r10 = cn.jpush.android.cache.Key.PushStatusSyncTime()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            cn.jpush.android.cache.Key r10 = r10.set(r11)
            cn.jpush.android.cache.Key[] r11 = new cn.jpush.android.cache.Key[r2]
            r11[r0] = r10
            cn.jpush.android.cache.Sp.set(r9, r11)
            goto L2d
        L2a:
            cn.jpush.android.x.b.a(r9, r1, r10, r3)
        L2d:
            cn.jpush.android.cache.a.a(r9, r2)
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r4 = "JPUSH"
            r5 = 0
            r6 = 0
            r3 = r9
            cn.jiguang.api.JCoreManager.onEvent(r3, r4, r5, r6, r7, r8)
            cn.jpush.android.local.ActionHelper r10 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r11 = "third_stop"
            r0 = 0
            r10.doSingleAction(r9, r11, r0)
            return
        L46:
            if (r2 != r11) goto L59
            cn.jpush.android.x.b.a(r9, r0, r10, r3)
            return
        L4c:
            java.lang.String r3 = "set fail"
            if (r11 != 0) goto L54
            cn.jpush.android.x.b.a(r9, r1, r10, r3)
            return
        L54:
            if (r2 != r11) goto L59
            cn.jpush.android.x.b.a(r9, r0, r10, r3)
        L59:
            return
    }

    public static void a(android.content.Context r3, long r4, int r6) {
            java.lang.String r0 = cn.jpush.android.ab.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dealCallBack code="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r1)
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()
            cn.jpush.android.ab.c$a r4 = r0.a(r3, r4, r6)
            if (r4 == 0) goto L23
            int r4 = r4.f1610b
            goto L24
        L23:
            r4 = -1
        L24:
            a(r3, r6, r4)
            return
    }
}
