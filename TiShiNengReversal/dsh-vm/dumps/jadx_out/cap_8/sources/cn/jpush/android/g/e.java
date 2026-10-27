package cn.jpush.android.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class e implements android.content.ServiceConnection {
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cn.jpush.android.g.d f1806b;

    private e(cn.jpush.android.g.d r2) {
            r1 = this;
            r1.f1806b = r2
            r1.<init>()
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 1
            r2.<init>(r0)
            r1.a = r2
            return
    }

    /* synthetic */ e(cn.jpush.android.g.d r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            java.lang.String r0 = "ServiceConnection"
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jpush.android.g.a.a     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r1.set(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "onServiceConnected:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            r1.append(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L26
            cn.jpush.android.i.b.b(r0, r4)     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L21
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r4 = r3.a     // Catch: java.lang.Throwable -> L26
            r4.put(r5)     // Catch: java.lang.Throwable -> L26
            return
        L21:
            java.lang.String r4 = "onServiceConnected, but IBinder is null."
            cn.jpush.android.i.b.g(r0, r4)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jpush.android.g.a.a
            r1 = 0
            r0.set(r1)
            cn.jpush.android.g.d r0 = r2.f1806b
            r1 = 0
            cn.jpush.android.g.d.a(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onServiceDisconnected:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ServiceConnection"
            cn.jpush.android.i.b.g(r0, r3)
            return
    }
}
