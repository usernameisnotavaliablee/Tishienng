package cn.jiguang.at;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static android.content.SharedPreferences a;

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a(long r7) {
            r0 = 2
            long r2 = r7 % r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lc
            r0 = 1
        Lc:
            long r7 = r7 + r0
            r0 = 32767(0x7fff, double:1.6189E-319)
            long r7 = r7 % r0
            return r7
    }

    private static long a(android.content.Context r4, long r5) {
            android.content.SharedPreferences r0 = c(r4)
            java.lang.String r1 = "next_rid"
            long r2 = r0.getLong(r1, r5)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L22
            long r5 = a(r2)
            android.content.SharedPreferences r4 = c(r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            android.content.SharedPreferences$Editor r4 = r4.putLong(r1, r5)
            r4.apply()
            return r5
        L22:
            return r2
    }

    public static void a(android.content.Context r2) {
            java.lang.String r0 = "cn.jpush.preferences.support.rid"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jiguang.at.e.a = r2
            return
    }

    public static synchronized long b(android.content.Context r6) {
            java.lang.Class<cn.jiguang.at.e> r0 = cn.jiguang.at.e.class
            monitor-enter(r0)
            r1 = -1
            long r3 = a(r6, r1)     // Catch: java.lang.Throwable -> L33
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L35
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            r2 = 32767(0x7fff, float:4.5916E-41)
            int r1 = r1.nextInt(r2)     // Catch: java.lang.Throwable -> L33
            int r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L33
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L33
            long r3 = a(r1)     // Catch: java.lang.Throwable -> L33
            android.content.SharedPreferences r6 = c(r6)     // Catch: java.lang.Throwable -> L33
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "next_rid"
            android.content.SharedPreferences$Editor r6 = r6.putLong(r1, r3)     // Catch: java.lang.Throwable -> L33
            r6.apply()     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r6 = move-exception
            goto L37
        L35:
            monitor-exit(r0)
            return r3
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r6
    }

    private static android.content.SharedPreferences c(android.content.Context r1) {
            android.content.SharedPreferences r0 = cn.jiguang.at.e.a
            if (r0 != 0) goto L7
            a(r1)
        L7:
            android.content.SharedPreferences r1 = cn.jiguang.at.e.a
            return r1
    }
}
