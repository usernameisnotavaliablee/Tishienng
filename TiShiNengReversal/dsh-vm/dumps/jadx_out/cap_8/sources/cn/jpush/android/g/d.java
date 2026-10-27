package cn.jpush.android.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d extends cn.jpush.android.g.a {

    /* renamed from: b, reason: collision with root package name */
    private cn.asus.push.IAIDLInvoke f1805b;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1805b = r0
            return
    }

    static /* synthetic */ cn.asus.push.IAIDLInvoke a(cn.jpush.android.g.d r0, cn.asus.push.IAIDLInvoke r1) {
            r1 = 0
            r0.f1805b = r1
            return r1
    }

    @Override // cn.jpush.android.g.a
    public final void a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            cn.asus.push.IAIDLInvoke r0 = r3.f1805b
            java.lang.String r1 = "ServiceConnection"
            if (r0 == 0) goto L33
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "JPUSH_CONTENT"
            r0.putString(r2, r5)     // Catch: java.lang.Throwable -> L20
            cn.asus.push.DataBuffer r5 = new cn.asus.push.DataBuffer     // Catch: java.lang.Throwable -> L20
            r5.<init>(r4, r0)     // Catch: java.lang.Throwable -> L20
            cn.asus.push.IAIDLInvoke r4 = r3.f1805b     // Catch: java.lang.Throwable -> L20
            cn.jpush.android.g.b r0 = new cn.jpush.android.g.b     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r4.d(r5, r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "send data fail:"
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L2f:
            cn.jpush.android.i.b.g(r1, r4)
            return
        L33:
            java.lang.String r4 = "send data fail, please init first."
            goto L2f
    }

    @Override // cn.jpush.android.g.a
    public final boolean a() {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jpush.android.g.a.a
            boolean r0 = r0.get()
            java.lang.String r1 = "ServiceConnection"
            r2 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = "already connecting."
            cn.jpush.android.i.b.b(r1, r0)
            return r2
        L11:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jpush.android.g.a.a
            r3 = 1
            r0.set(r3)
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = cn.jpush.android.f.c.f1791e     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "cn.jpush.android.service.PushManagerService"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4c
            r0.setComponent(r4)     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.g.e r4 = new cn.jpush.android.g.e     // Catch: java.lang.Throwable -> L4c
            r4.<init>(r7, r2)     // Catch: java.lang.Throwable -> L4c
            android.content.Context r5 = cn.jpush.android.f.c.a     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r5.bindService(r0, r4, r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "connect--"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.i.b.b(r1, r3)     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L4e
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jpush.android.g.a.a     // Catch: java.lang.Throwable -> L4c
            r3.set(r2)     // Catch: java.lang.Throwable -> L4c
            return r0
        L4c:
            r0 = move-exception
            goto L5d
        L4e:
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r3 = r4.a     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r3.take()     // Catch: java.lang.Throwable -> L4c
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.Throwable -> L4c
            cn.asus.push.IAIDLInvoke r3 = cn.asus.push.IAIDLInvoke.Stub.e(r3)     // Catch: java.lang.Throwable -> L4c
            r7.f1805b = r3     // Catch: java.lang.Throwable -> L4c
            return r0
        L5d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "init fail:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jpush.android.i.b.g(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jpush.android.g.a.a
            r0.set(r2)
            return r2
    }

    @Override // cn.jpush.android.g.a
    public final boolean b() {
            r1 = this;
            cn.asus.push.IAIDLInvoke r0 = r1.f1805b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.IBinder r0 = r0.asBinder()
            boolean r0 = r0.isBinderAlive()
            return r0
    }
}
