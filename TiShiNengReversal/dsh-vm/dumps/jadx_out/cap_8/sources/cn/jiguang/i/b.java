package cn.jiguang.i;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static long a = 1;

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a() {
            long r0 = cn.jiguang.i.b.a
            r2 = 1
            long r0 = r0 + r2
            cn.jiguang.i.b.a = r0
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L10
            cn.jiguang.i.b.a = r2
        L10:
            long r0 = cn.jiguang.i.b.a
            return r0
    }

    public static byte[] a(long r2, java.lang.String r4) {
            cn.jiguang.j.a r0 = new cn.jiguang.j.a
            r1 = 20480(0x5000, float:2.8699E-41)
            r0.<init>(r1)
            r1 = 0
            r0.a(r1)
            r0.a(r2)
            if (r4 == 0) goto L1d
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L1d
            byte[] r2 = cn.jiguang.av.v.j(r4)
            r0.a(r2)
        L1d:
            byte[] r2 = r0.a()
            return r2
    }
}
