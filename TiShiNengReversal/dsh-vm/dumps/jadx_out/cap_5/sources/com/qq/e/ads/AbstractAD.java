package com.qq.e.ads;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class AbstractAD<T> {
    private static final java.util.concurrent.atomic.AtomicBoolean g = null;
    protected T a;
    private final android.os.Handler b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile long f;



    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            com.qq.e.ads.AbstractAD.g = r0
            return
    }

    public AbstractAD() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r2.d = r0
            r0 = -1
            r2.f = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.b = r0
            return
    }

    private final void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            boolean r0 = com.qq.e.comm.a.a(r8)
            if (r0 != 0) goto L11
            java.lang.String r8 = "Manifest文件中Activity/Service/Permission的声明有问题或者Permission权限未授予"
            com.qq.e.comm.util.GDTLogger.e(r8)
            r8 = 4002(0xfa2, float:5.608E-42)
            r7.a(r8)
            return
        L11:
            r0 = 1
            r7.d = r0
            java.util.concurrent.ExecutorService r0 = com.qq.e.comm.managers.a.g
            com.qq.e.ads.AbstractAD$1 r1 = new com.qq.e.ads.AbstractAD$1
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    static /* synthetic */ void a(com.qq.e.ads.AbstractAD r0) {
            r0.c()
            return
    }

    static /* synthetic */ boolean a(com.qq.e.ads.AbstractAD r0, boolean r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ android.os.Handler b(com.qq.e.ads.AbstractAD r0) {
            android.os.Handler r0 = r0.b
            return r0
    }

    private void b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.e = r0
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            boolean r0 = r0.d()
            if (r0 == 0) goto L19
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            java.lang.String r0 = r0.a()
            r1.a(r2, r0, r3, r4)
            return
        L19:
            r2 = 2003(0x7d3, float:2.807E-42)
            r1.a(r2)
            return
    }

    private void c() {
            r6 = this;
            long r0 = r6.f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            org.json.JSONObject r0 = com.qq.e.comm.managers.setting.GlobalSetting.getSettings()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "gdtwict"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L1c
            long r4 = r6.f     // Catch: java.lang.Throwable -> L1c
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            r0.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    protected abstract T a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5);

    protected final void a(int r3) {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L12
            r2.b(r3)
            return
        L12:
            android.os.Handler r0 = r2.b
            com.qq.e.ads.AbstractAD$2 r1 = new com.qq.e.ads.AbstractAD$2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    protected final void a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            goto Lf
        L9:
            java.lang.String r0 = ""
            r1.b(r2, r3, r0)
            return
        Lf:
            java.lang.String r2 = "初始化错误：参数错误context或posId为空"
            com.qq.e.comm.util.GDTLogger.e(r2)
            r2 = 2001(0x7d1, float:2.804E-42)
            r1.a(r2)
            return
    }

    protected final void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf
            goto L13
        Lf:
            r1.b(r2, r3, r4)
            return
        L13:
            java.lang.String r2 = "初始化错误：参数错误，context、posId、token 不可为空"
            com.qq.e.comm.util.GDTLogger.e(r2)
            r2 = 2001(0x7d1, float:2.804E-42)
            r1.a(r2)
            return
    }

    protected abstract void a(T r1);

    protected final void a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ":调用方法 "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "异常，广告实例还未初始化"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.qq.e.comm.util.GDTLogger.e(r3)
            return
    }

    protected final boolean a() {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto La
            boolean r0 = r1.d
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    protected abstract void b(int r1);

    protected final boolean b() {
            r3 = this;
            boolean r0 = r3.c
            if (r0 != 0) goto L14
            java.util.concurrent.atomic.AtomicBoolean r0 = com.qq.e.ads.AbstractAD.g
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L14
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.f = r0
        L14:
            boolean r0 = r3.c
            return r0
    }
}
