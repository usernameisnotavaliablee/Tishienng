package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class n implements java.lang.Thread.UncaughtExceptionHandler {
    private static com.beizi.fusion.tool.n a;
    private java.lang.Thread.UncaughtExceptionHandler b;
    private android.content.Context c;


    static {
            com.beizi.fusion.tool.n r0 = new com.beizi.fusion.tool.n
            r0.<init>()
            com.beizi.fusion.tool.n.a = r0
            return
    }

    private n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.fusion.tool.n a() {
            com.beizi.fusion.tool.n r0 = com.beizi.fusion.tool.n.a
            return r0
    }

    static /* synthetic */ void a(com.beizi.fusion.tool.n r0, java.lang.Throwable r1) {
            r0.b(r1)
            return
    }

    private void a(java.lang.String r6) {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le5
            r0.<init>()     // Catch: java.lang.Exception -> Le5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le5
            r1.<init>()     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "appId"
            com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> Le5
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> Le5
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "packageName"
            android.content.Context r3 = r5.c     // Catch: java.lang.Exception -> Le5
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> Le5
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "versionName"
            android.content.Context r3 = r5.c     // Catch: java.lang.Exception -> Le5
            java.lang.String r3 = com.beizi.fusion.tool.ap.d(r3)     // Catch: java.lang.Exception -> Le5
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "versionCode"
            android.content.Context r3 = r5.c     // Catch: java.lang.Exception -> Le5
            int r3 = com.beizi.fusion.tool.ap.e(r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Le5
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "sdkVersion"
            java.lang.String r3 = "5.2.1.20"
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "osVersion"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le5
            r3.<init>()     // Catch: java.lang.Exception -> Le5
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Exception -> Le5
            r3.append(r4)     // Catch: java.lang.Exception -> Le5
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch: java.lang.Exception -> Le5
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Le5
            r3.append(r4)     // Catch: java.lang.Exception -> Le5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Le5
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "vendor"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> Le5
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "model"
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Exception -> Le5
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "device"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Le5
            java.lang.String r1 = "crashMessage"
            r0.put(r1, r6)     // Catch: java.lang.Exception -> Le5
            android.content.Context r6 = r5.c     // Catch: java.lang.Exception -> Le5
            com.beizi.fusion.model.ResponseInfo r6 = com.beizi.fusion.model.ResponseInfo.getInstance(r6)     // Catch: java.lang.Exception -> Le5
            java.lang.String r6 = r6.getCrashUrl()     // Catch: java.lang.Exception -> Le5
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Le5
            if (r6 != 0) goto La5
            android.content.Context r6 = r5.c     // Catch: java.lang.Exception -> Le5
            com.beizi.fusion.model.ResponseInfo r6 = com.beizi.fusion.model.ResponseInfo.getInstance(r6)     // Catch: java.lang.Exception -> Le5
            java.lang.String r6 = r6.getCrashUrl()     // Catch: java.lang.Exception -> Le5
            java.lang.String r1 = "http"
            boolean r6 = r6.startsWith(r1)     // Catch: java.lang.Exception -> Le5
            if (r6 == 0) goto La5
            android.content.Context r6 = r5.c     // Catch: java.lang.Exception -> Le5
            com.beizi.fusion.model.ResponseInfo r6 = com.beizi.fusion.model.ResponseInfo.getInstance(r6)     // Catch: java.lang.Exception -> Le5
            java.lang.String r6 = r6.getCrashUrl()     // Catch: java.lang.Exception -> Le5
            goto Lbb
        La5:
            boolean r6 = com.beizi.fusion.BeiZis.getTransferProtocol()     // Catch: java.lang.Exception -> Le5
            if (r6 == 0) goto Lae
            java.lang.String r6 = "aHR0cHM6Ly9hcGktaHRwLmJlaXppLmJpei9tYi9zZGsvY3Jhc2gvdjE="
            goto Lb0
        Lae:
            java.lang.String r6 = "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAwL21iL3Nkay9jcmFzaC92MQ=="
        Lb0:
            java.lang.String r6 = com.beizi.fusion.tool.d.a(r6)     // Catch: java.lang.Exception -> Le5
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Le5
            if (r1 == 0) goto Lbb
            goto Le5
        Lbb:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Le5
            if (r1 != 0) goto Le5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Le5
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> Le5
            java.lang.String r6 = com.beizi.fusion.tool.v.a(r6, r0)     // Catch: java.lang.Exception -> Le5
            if (r6 == 0) goto Le5
            java.lang.String r0 = "lance"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le5
            r1.<init>()     // Catch: java.lang.Exception -> Le5
            java.lang.String r2 = "post:"
            r1.append(r2)     // Catch: java.lang.Exception -> Le5
            r1.append(r6)     // Catch: java.lang.Exception -> Le5
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> Le5
            com.beizi.fusion.tool.aa.a(r0, r6)     // Catch: java.lang.Exception -> Le5
        Le5:
            return
    }

    private boolean a(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.Thread r0 = new java.lang.Thread
            com.beizi.fusion.tool.n$1 r1 = new com.beizi.fusion.tool.n$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L16
        L16:
            r3 = 1
            return r3
    }

    private void b(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "\r\n"
            android.content.Context r1 = r6.c     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L7
            return
        L7:
            java.io.File r1 = com.beizi.fusion.tool.g.a(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "BeiZis"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r3.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = "CrashHandler storagePath == "
            r3.append(r4)     // Catch: java.lang.Throwable -> La8
            r3.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La8
            com.beizi.fusion.tool.aa.a(r2, r3)     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r2.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> La8
            r2.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "/Beizi/log/"
            r2.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> La8
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> La8
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La8
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> La8
            if (r3 != 0) goto L46
            r2.mkdirs()     // Catch: java.lang.Throwable -> La8
        L46:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La8
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "yyyy-MM-dd HH:MM:SS"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> La8
            r5.<init>(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = r4.format(r5)     // Catch: java.lang.Throwable -> La8
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r4.<init>()     // Catch: java.lang.Throwable -> La8
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "crash_"
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            r4.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = ".trace"
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> La8
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La8
            r3.createNewFile()     // Catch: java.lang.Throwable -> La8
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> La8
            r4 = 1
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> La8
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> La8
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La8
            r3.write(r2)     // Catch: java.lang.Throwable -> La8
            r3.write(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "------------------crash----------------------"
            r3.write(r2)     // Catch: java.lang.Throwable -> La8
            r3.write(r0)     // Catch: java.lang.Throwable -> La8
            r3.write(r7)     // Catch: java.lang.Throwable -> La8
            r3.write(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = "-------------------end-----------------------"
            r3.write(r7)     // Catch: java.lang.Throwable -> La8
            r3.newLine()     // Catch: java.lang.Throwable -> La8
            r3.close()     // Catch: java.lang.Throwable -> La8
            r1.close()     // Catch: java.lang.Throwable -> La8
        La8:
            java.lang.String r7 = "lance"
            java.lang.String r0 = "writeLog ok"
            com.beizi.fusion.tool.aa.a(r7, r0)
            return
    }

    private void b(java.lang.Throwable r3) {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r3.getClass()
            java.lang.Throwable r3 = r3.getCause()
        L11:
            if (r3 == 0) goto L18
            java.lang.Throwable r3 = r3.getCause()
            goto L11
        L18:
            r1.close()
            java.lang.String r3 = r0.toString()
            r2.a(r3)
            r2.b(r3)
            return
    }

    public void a(android.content.Context r2) {
            r1 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.b = r0
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.c = r2
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r2, java.lang.Throwable r3) {
            r1 = this;
            r1.a(r3)     // Catch: java.lang.Throwable -> L4
            goto L5
        L4:
        L5:
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.b
            if (r0 == 0) goto Ld
            r0.uncaughtException(r2, r3)
            goto L14
        Ld:
            int r2 = android.os.Process.myPid()
            android.os.Process.killProcess(r2)
        L14:
            return
    }
}
