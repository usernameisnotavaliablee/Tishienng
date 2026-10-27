package cn.jiguang.commons.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements android.content.ServiceConnection {
    public final java.util.concurrent.LinkedBlockingQueue a;

    public c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue r2 = r1.a     // Catch: java.lang.Throwable -> L6
            r2.put(r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "service connect error: "
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "OppoSericeConnection"
            cn.jiguang.commons.w.a.f(r3, r2)
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            return
    }
}
