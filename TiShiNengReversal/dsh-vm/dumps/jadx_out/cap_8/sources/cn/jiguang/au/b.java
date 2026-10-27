package cn.jiguang.au;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b implements java.lang.Runnable {
    private java.lang.Thread.UncaughtExceptionHandler a;

    /* renamed from: h, reason: collision with root package name */
    protected java.lang.String f668h;



    protected b() {
            r1 = this;
            r1.<init>()
            cn.jiguang.au.b$1 r0 = new cn.jiguang.au.b$1
            r0.<init>(r1)
            r1.a = r0
            return
    }

    protected b(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f668h = r1
            cn.jiguang.au.b$2 r1 = new cn.jiguang.au.b$2
            r1.<init>(r0)
            r0.a = r1
            return
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.a
            r0.setUncaughtExceptionHandler(r1)
            r2.a()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            r0.setUncaughtExceptionHandler(r1)
            return
    }
}
