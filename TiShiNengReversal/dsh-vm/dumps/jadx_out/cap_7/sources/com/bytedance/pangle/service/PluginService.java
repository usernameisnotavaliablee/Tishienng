package com.bytedance.pangle.service;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class PluginService extends android.app.Service implements com.bytedance.pangle.service.j {
    private static final java.lang.String TAG = "PluginService";


    public PluginService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.pangle.service.j
    public void attach(com.bytedance.pangle.plugin.Plugin r3) {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r3 = r3.mPkgName
            android.app.Application r3 = com.bytedance.pangle.transform.ZeusTransformUtils.wrapperContext2Application(r0, r3)
            r2.attachBaseContext(r3)
            java.lang.String r3 = "mActivityManager"
            java.lang.Object r0 = r2.createActivityManagerProxy()     // Catch: java.lang.Exception -> L42
            com.bytedance.pangle.util.FieldUtils.writeField(r2, r3, r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "mClassName"
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L42
            com.bytedance.pangle.util.FieldUtils.writeField(r2, r3, r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "mApplication"
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L42
            com.bytedance.pangle.util.FieldUtils.writeField(r2, r3, r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "mStartCompatibility"
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()     // Catch: java.lang.Exception -> L42
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Exception -> L42
            r1 = 5
            if (r0 >= r1) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L42
            com.bytedance.pangle.util.FieldUtils.writeField(r2, r3, r0)     // Catch: java.lang.Exception -> L42
            return
        L42:
            r3 = move-exception
            java.lang.String r0 = "Zeus/service_pangle"
            java.lang.String r1 = "hook activityManager failed!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r1, r3)
            return
    }

    protected java.lang.Object createActivityManagerProxy() throws java.lang.ClassNotFoundException {
            r4 = this;
            java.lang.ClassLoader r0 = r4.getClassLoader()
            java.lang.String r1 = "android.app.IActivityManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            r2[r3] = r1
            com.bytedance.pangle.service.PluginService$1 r1 = new com.bytedance.pangle.service.PluginService$1
            r1.<init>(r4)
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r2, r1)
            return r0
    }
}
