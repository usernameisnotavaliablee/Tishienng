package cn.jiguang.ar;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean a(long r3) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            long r0 = r0.getId()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    public static boolean a(java.lang.Thread r2) {
            long r0 = r2.getId()
            boolean r2 = a(r0)
            return r2
    }
}
