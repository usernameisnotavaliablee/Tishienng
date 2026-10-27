package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JCommonService extends android.app.Service {
    private static final java.lang.String TAG = "JCommonService";
    private static cn.jiguang.android.IDataShare.Stub mBinder;

    static {
            return
    }

    public JCommonService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            cn.jiguang.android.IDataShare$Stub r1 = cn.jpush.android.service.JCommonService.mBinder
            return r1
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            return
    }

    @Override // android.app.Service
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            cn.jiguang.api.JCoreManager.setStartId(r0)
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            cn.jiguang.internal.JConstants.getAppContext(r0)
            cn.jiguang.android.IDataShare$Stub r0 = cn.jpush.android.service.JCommonService.mBinder
            if (r0 != 0) goto L24
            cn.jpush.android.service.DataShare r0 = new cn.jpush.android.service.DataShare
            r0.<init>()
            cn.jpush.android.service.JCommonService.mBinder = r0
        L24:
            return
    }

    @Override // android.app.Service
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            super.onLowMemory()
            return
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent r1) {
            r0 = this;
            super.onRebind(r1)
            return
    }

    @Override // android.app.Service
    public final void onStart(android.content.Intent r1, int r2) {
            r0 = this;
            super.onStart(r1, r2)
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r9, int r10, int r11) {
            r8 = this;
            if (r9 == 0) goto L24
            java.lang.String r10 = r9.getAction()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L24
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            java.lang.String r5 = r9.getAction()
            android.os.Bundle r6 = r9.getExtras()
            r9 = 0
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r2 = "JCore"
            r3 = 2
            r4 = 1
            r1 = r8
            r0.onEvent(r1, r2, r3, r4, r5, r6, r7)
            goto L2b
        L24:
            java.lang.String r9 = "JCommonService"
            java.lang.String r10 = "onStartCommand intent is empty or action is empty"
            cn.jiguang.w.f.i(r9, r10)
        L2b:
            r9 = 2
            return r9
    }

    @Override // android.app.Service
    public final void onTaskRemoved(android.content.Intent r1) {
            r0 = this;
            super.onTaskRemoved(r1)
            return
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
            r0 = this;
            super.onTrimMemory(r1)
            return
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent r1) {
            r0 = this;
            boolean r1 = super.onUnbind(r1)
            return r1
    }
}
