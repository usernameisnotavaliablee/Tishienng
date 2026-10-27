package cn.jpush.android.local;

@android.annotation.TargetApi(14)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ActivityLifeCallBack implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.lang.String TAG = "ActivityLifeCallBack";
    public static int activityTaskCount;
    private java.lang.String lastActivity;

    static {
            return
    }

    public ActivityLifeCallBack() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.lastActivity = r0
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r3) {
            r2 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "destroyed"
            r0.onActivityLifeCallback(r3, r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "paused"
            r0.onActivityLifeCallback(r3, r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r3) {
            r2 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "resumed"
            r0.onActivityLifeCallback(r3, r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r4) {
            r3 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "started"
            r0.onActivityLifeCallback(r4, r1)
            int r0 = cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount
            r1 = 1
            if (r0 != 0) goto L22
            java.lang.String r0 = "ActivityLifeCallBack"
            java.lang.String r2 = "is Foreground"
            cn.jpush.android.helper.Logger.d(r0, r2)
            if (r4 == 0) goto L22
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            cn.jpush.android.local.JPushConstants.changeForegroudStat(r0, r1)
        L22:
            int r0 = cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount
            int r0 = r0 + r1
            cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount = r0
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            r3.lastActivity = r4
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "stopped"
            r0.onActivityLifeCallback(r3, r1)
            int r0 = cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount
            if (r0 <= 0) goto L11
            int r0 = r0 + (-1)
            cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount = r0
        L11:
            int r0 = cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount
            if (r0 != 0) goto L41
            if (r3 == 0) goto L41
            java.lang.String r0 = r2.lastActivity
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "ActivityLifeCallBack"
            java.lang.String r1 = "is not Foreground"
            cn.jpush.android.helper.Logger.d(r0, r1)
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r0 = 0
            cn.jpush.android.local.JPushConstants.changeForegroudStat(r3, r0)
            return
        L3b:
            int r3 = cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount
            int r3 = r3 + 1
            cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount = r3
        L41:
            return
    }
}
