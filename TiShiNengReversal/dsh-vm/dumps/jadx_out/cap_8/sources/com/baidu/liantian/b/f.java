package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static java.util.concurrent.locks.Lock f5917b;

    /* renamed from: c, reason: collision with root package name */
    private static com.baidu.liantian.b.f f5918c;
    public com.baidu.liantian.rp.f.a a;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            com.baidu.liantian.b.f.f5917b = r0
            r0 = 0
            com.baidu.liantian.b.f.f5918c = r0
            return
    }

    private f(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.baidu.liantian.rp.f.a r0 = new com.baidu.liantian.rp.f.a
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public static com.baidu.liantian.b.f a(android.content.Context r1) {
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.f5918c
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.concurrent.locks.Lock r0 = com.baidu.liantian.b.f.f5917b     // Catch: java.lang.Throwable -> L1d
            r0.lock()     // Catch: java.lang.Throwable -> L1d
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.f5918c     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L15
            com.baidu.liantian.b.f r0 = new com.baidu.liantian.b.f     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.baidu.liantian.b.f.f5918c = r0     // Catch: java.lang.Throwable -> L1d
        L15:
            com.baidu.liantian.b.f r1 = com.baidu.liantian.b.f.f5918c     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.locks.Lock r0 = com.baidu.liantian.b.f.f5917b
            r0.unlock()
            return r1
        L1d:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = com.baidu.liantian.b.f.f5917b
            r0.unlock()
            throw r1
    }

    public final void a() {
            r4 = this;
            com.baidu.liantian.rp.f.a r0 = r4.a
            com.baidu.liantian.rp.e.a r1 = r0.f6019d
            if (r1 != 0) goto Ld
            com.baidu.liantian.rp.e.a r1 = new com.baidu.liantian.rp.e.a
            r1.<init>()
            r0.f6019d = r1
        Ld:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "com.b.r.p"
            r1.addAction(r2)
            android.content.Context r2 = r0.f6017b
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.baidu.liantian.rp.e.a r3 = r0.f6019d
            r2.registerReceiver(r3, r1)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r2 = 5
            r1.what = r2
            r0.a(r1)
            return
    }

    public final void b() {
            r3 = this;
            com.baidu.liantian.rp.f.a r0 = r3.a
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r2 = 7
            r1.what = r2
            r0.a(r1)
            return
    }

    public final void c() {
            r2 = this;
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r1 = 2
            r0.what = r1
            com.baidu.liantian.rp.f.a r1 = r2.a
            r1.a(r0)
            return
    }
}
