package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class f implements cn.jiguang.aj.e {
    private final android.os.Handler a;

    f() {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            return
    }

    f(android.os.Looper r2) {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // cn.jiguang.aj.e
    public java.lang.Thread a() {
            r1 = this;
            android.os.Handler r0 = r1.a
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            return r0
    }

    @Override // cn.jiguang.aj.e
    public void a(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.a
            r0.post(r2)
            return
    }
}
