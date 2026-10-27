package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class u {
    private static final java.security.SecureRandom a = null;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            cn.jiguang.av.u.a = r0
            return
    }

    public u() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(int r1) {
            if (r1 <= 0) goto L9
            java.security.SecureRandom r0 = cn.jiguang.av.u.a
            int r1 = r0.nextInt(r1)
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bound must be positive"
            r1.<init>(r0)
            throw r1
    }

    public static byte[] b(int r1) {
            byte[] r1 = new byte[r1]
            java.security.SecureRandom r0 = cn.jiguang.av.u.a
            r0.nextBytes(r1)
            return r1
    }
}
