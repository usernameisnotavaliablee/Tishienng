package org.repackage.a.a.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements android.content.ServiceConnection {
    public final /* synthetic */ org.repackage.a.a.a.a.c a;

    public b(org.repackage.a.a.a.a.c r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            org.repackage.a.a.a.a.c r1 = r0.a
            org.repackage.a.a.a.a r2 = org.repackage.a.a.a.a.AbstractBinderC0086a.a(r2)
            r1.a = r2
            org.repackage.a.a.a.a.c r1 = r0.a
            java.lang.Object r1 = r1.d
            monitor-enter(r1)
            org.repackage.a.a.a.a.c r2 = r0.a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r2.d     // Catch: java.lang.Throwable -> L16
            r2.notify()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            org.repackage.a.a.a.a.c r2 = r1.a
            r0 = 0
            r2.a = r0
            return
    }
}
