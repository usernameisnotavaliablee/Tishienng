package cn.jpush.android.helper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Logger {
    private static java.lang.String a = "[key-step]";

    static {
            return
    }

    public Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(int r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.Throwable r11) {
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r7
            r7 = 1
            r6[r7] = r8
            r7 = 2
            r6[r7] = r10
            r7 = 3
            r6[r7] = r11
            r1 = 0
            java.lang.String r2 = "JPush"
            r3 = 18
            r5 = 0
            r4 = r9
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void d(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 3
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void dd(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = 0
            r2 = 3
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void e(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 6
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void e(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 6
            r1 = 1
            a(r0, r1, r2, r3, r4)
            return
    }

    public static void ee(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = 0
            r2 = 6
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void ee(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 6
            r1 = 0
            a(r0, r1, r2, r3, r4)
            return
    }

    public static void i(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 4
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void ii(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = 0
            r2 = 4
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void kd(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = 3
            r2 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void ke(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = 6
            r2 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void ke(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 6
            r1 = 0
            a(r0, r1, r2, r3, r4)
            return
    }

    public static void ki(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = 4
            r2 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void kv(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = 2
            r2 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void kw(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = 5
            r2 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void kw(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jpush.android.helper.Logger.a
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 5
            r1 = 0
            a(r0, r1, r2, r3, r4)
            return
    }

    public static void v(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 2
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void vv(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = 0
            r2 = 2
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void w(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 5
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void ww(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = 0
            r2 = 5
            a(r2, r0, r3, r4, r1)
            return
    }

    public static void ww(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 5
            r1 = 0
            a(r0, r1, r2, r3, r4)
            return
    }
}
