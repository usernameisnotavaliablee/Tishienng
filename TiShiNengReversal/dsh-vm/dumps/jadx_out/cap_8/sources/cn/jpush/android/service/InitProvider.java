package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InitProvider extends android.content.ContentProvider {
    private static final java.lang.String TAG = "InitProvider";
    private java.lang.Class<?> actionHelperClass;
    private java.lang.Object actionHelperInstance;
    private java.lang.reflect.Method onJPushMessageReceiveMethod;

    public InitProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String getProviderProcessName(android.content.Context r5) {
            r4 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L1c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<cn.jpush.android.service.InitProvider> r3 = cn.jpush.android.service.InitProvider.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L1c
            r5 = 0
            android.content.pm.ProviderInfo r5 = r1.getProviderInfo(r2, r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r5.processName     // Catch: java.lang.Throwable -> L1c
            return r5
        L1c:
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String r12, java.lang.String r13, android.os.Bundle r14) {
            r11 = this;
            r0 = 0
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L97
            if (r1 == 0) goto L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r2.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r1.getPackageName()     // Catch: java.lang.Throwable -> L97
            r2.append(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = ".permission.JPUSH_MESSAGE"
            r2.append(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L97
            int r2 = r1.checkCallingPermission(r2)     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L97
            java.lang.Class<?> r2 = r11.actionHelperClass     // Catch: java.lang.Throwable -> L97
            r3 = 2
            if (r2 != 0) goto L40
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "Y24uanB1c2guYW5kcm9pZC5sb2NhbC5BY3Rpb25IZWxwZXI="
            byte[] r4 = android.util.Base64.decode(r4, r3)     // Catch: java.lang.Throwable -> L97
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L97
            r11.actionHelperClass = r2     // Catch: java.lang.Throwable -> L97
        L40:
            java.lang.Object r2 = r11.actionHelperInstance     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L5b
            java.lang.Class<?> r2 = r11.actionHelperClass     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "Z2V0SW5zdGFuY2U="
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch: java.lang.Throwable -> L97
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r2 = r2.getMethod(r4, r0)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Throwable -> L97
            r11.actionHelperInstance = r2     // Catch: java.lang.Throwable -> L97
        L5b:
            java.lang.reflect.Method r2 = r11.onJPushMessageReceiveMethod     // Catch: java.lang.Throwable -> L97
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 4
            if (r2 != 0) goto L86
            java.lang.Class<?> r2 = r11.actionHelperClass     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = "b25KUHVzaE1lc3NhZ2VSZWNlaXZl"
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch: java.lang.Throwable -> L97
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L97
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L97
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r6] = r10     // Catch: java.lang.Throwable -> L97
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r5] = r10     // Catch: java.lang.Throwable -> L97
            r9[r3] = r10     // Catch: java.lang.Throwable -> L97
            java.lang.Class<android.os.Bundle> r10 = android.os.Bundle.class
            r9[r4] = r10     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r2 = r2.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L97
            r11.onJPushMessageReceiveMethod = r2     // Catch: java.lang.Throwable -> L97
        L86:
            java.lang.reflect.Method r2 = r11.onJPushMessageReceiveMethod     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r11.actionHelperInstance     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L97
            r7[r6] = r1     // Catch: java.lang.Throwable -> L97
            r7[r5] = r12     // Catch: java.lang.Throwable -> L97
            r7[r3] = r13     // Catch: java.lang.Throwable -> L97
            r7[r4] = r14     // Catch: java.lang.Throwable -> L97
            r2.invoke(r8, r7)     // Catch: java.lang.Throwable -> L97
        L97:
            return r0
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L20
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L20
            cn.jiguang.api.JCoreManager.setStartId(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r4.getProviderProcessName(r1)     // Catch: java.lang.Throwable -> L20
            cn.jiguang.internal.JConstants.getAppContext(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            java.lang.String r3 = r1.getPackageName()     // Catch: java.lang.Throwable -> L20
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L20
            cn.jiguang.d.a.a(r1, r0)     // Catch: java.lang.Throwable -> L20
        L20:
            return r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
