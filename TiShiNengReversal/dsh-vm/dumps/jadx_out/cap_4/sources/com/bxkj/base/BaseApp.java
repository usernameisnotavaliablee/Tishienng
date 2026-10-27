package com.bxkj.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class BaseApp extends android.app.Application {
    private static boolean a = true;
    private static com.bxkj.base.BaseApp b;

    static {
            return
    }

    public BaseApp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(java.lang.String r0) {
            return
    }

    private void b() {
            r3 = this;
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            y.d r1 = new y.d
            r1.<init>()
            r0.addInterceptor(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            com.bxkj.base.intercept.a r1 = new com.bxkj.base.intercept.a
            r1.<init>()
            r0.addInterceptor(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            y.b r1 = new y.b
            r1.<init>()
            r0.addInterceptor(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            g2.b r1 = new g2.b
            com.bxkj.base.BaseApp r2 = c()
            r1.<init>(r2)
            r0.addInterceptor(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            okhttp3.logging.HttpLoggingInterceptor r1 = new okhttp3.logging.HttpLoggingInterceptor
            com.bxkj.base.b r2 = new com.bxkj.base.b
            r2.<init>()
            r1.<init>(r2)
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            okhttp3.logging.HttpLoggingInterceptor r1 = r1.setLevel(r2)
            r0.addInterceptor(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            com.bxkj.base.intercept.e r1 = new com.bxkj.base.intercept.e
            r1.<init>()
            r0.setResponseInterceptor(r1)
            return
    }

    public static com.bxkj.base.BaseApp c() {
            com.bxkj.base.BaseApp r0 = com.bxkj.base.BaseApp.b
            return r0
    }

    private void e() {
            r7 = this;
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r1.getServerUrl()
            java.lang.String r5 = "returnMsg"
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.String r3 = "returnCode"
            java.lang.String r4 = "data"
            r0.init(r1, r2, r3, r4, r5, r6)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            cn.bluemobi.dylan.http.MessageManager$MessageModel r1 = cn.bluemobi.dylan.http.MessageManager.MessageModel.All
            r0.setShowMessageModel(r1)
            return
    }

    public static boolean g() {
            boolean r0 = com.bxkj.base.BaseApp.a
            return r0
    }

    public static void h(boolean r0) {
            com.bxkj.base.BaseApp.a = r0
            return
    }

    public java.lang.String d(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0
            int r1 = r0.pid
            if (r1 != r4) goto L10
            java.lang.String r3 = r0.processName
            return r3
        L23:
            java.lang.String r3 = ""
            return r3
    }

    public boolean f() {
            r3 = this;
            r0 = 1
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L24
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L24
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = r3.d(r2, r1)     // Catch: java.lang.Exception -> L24
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L18
            return r0
        L18:
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Exception -> L24
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L24
            if (r1 == 0) goto L23
            return r0
        L23:
            r0 = 0
        L24:
            return r0
    }

    public abstract void i(android.content.Context r1);

    @Override // android.app.Application
    public void onCreate() {
            r1 = this;
            super.onCreate()
            com.bxkj.base.BaseApp.b = r1
            boolean r0 = r1.f()
            if (r0 == 0) goto L11
            r1.b()
            r1.e()
        L11:
            return
    }
}
