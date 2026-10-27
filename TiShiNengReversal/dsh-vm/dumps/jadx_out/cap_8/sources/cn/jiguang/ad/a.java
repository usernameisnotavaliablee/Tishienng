package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r4) {
            android.content.Context r4 = cn.jiguang.av.c.a(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            java.lang.String r2 = "AlarmHelper"
            if (r0 < r1) goto L12
            java.lang.String r4 = "sdk is android 12, return"
            cn.jiguang.w.f.c(r2, r4)
            return
        L12:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<cn.jpush.android.service.AlarmReceiver> r1 = cn.jpush.android.service.AlarmReceiver.class
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r4, r1, r0, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "alarm"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L2c
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4     // Catch: java.lang.Throwable -> L2c
            r4.cancel(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            java.lang.String r4 = "Cancel heartbeat alarm failed."
            cn.jiguang.w.f.i(r2, r4)
            return
    }

    public static void b(android.content.Context r12) {
            android.content.Context r12 = cn.jiguang.av.c.a(r12)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            java.lang.String r2 = "AlarmHelper"
            if (r0 < r1) goto L12
            java.lang.String r12 = "sdk is android 12, return"
            cn.jiguang.w.f.c(r2, r12)
            return
        L12:
            boolean r0 = cn.jiguang.av.b.b(r12)
            if (r0 != 0) goto L1e
            java.lang.String r12 = "auto wakeup is closed"
            cn.jiguang.w.f.c(r2, r12)
            return
        L1e:
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            r0.e()
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            int r0 = r0.h()
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r3 + r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reset heartbeat alarm, wait "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "ms."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.w.f.f(r2, r0)
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L6d
            java.lang.Class<cn.jpush.android.service.AlarmReceiver> r1 = cn.jpush.android.service.AlarmReceiver.class
            r0.<init>(r12, r1)     // Catch: java.lang.Throwable -> L6d
            r1 = 0
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r11 = android.app.PendingIntent.getBroadcast(r12, r1, r0, r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "alarm"
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch: java.lang.Throwable -> L6d
            r5 = r12
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5     // Catch: java.lang.Throwable -> L6d
            r6 = 0
            r9 = 0
            r5.setWindow(r6, r7, r9, r11)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "can't trigger alarm cause by exception:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            cn.jiguang.w.f.j(r2, r12)
            return
    }
}
