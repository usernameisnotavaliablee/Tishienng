package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DaemonService extends android.app.Service {
    private static final java.lang.String TAG = "DaemonService";

    public DaemonService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r4) {
            r3 = this;
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1 = 0
            if (r4 == 0) goto L10
            android.os.Bundle r4 = r4.getExtras()
            goto L11
        L10:
            r4 = r1
        L11:
            r2 = 2
            cn.jiguang.p.g.a(r0, r4, r2)
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = "DaemonService"
            java.lang.String r1 = "action onCreate"
            cn.jiguang.w.f.c(r0, r1)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            java.lang.String r0 = "DaemonService"
            java.lang.String r1 = "action onDestroy"
            cn.jiguang.w.f.c(r0, r1)
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            android.content.Context r2 = r0.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            if (r1 == 0) goto Lf
            android.os.Bundle r1 = r1.getExtras()
            goto L10
        Lf:
            r1 = 0
        L10:
            r3 = 1
            cn.jiguang.p.g.a(r2, r1, r3)
            r1 = 2
            return r1
    }
}
