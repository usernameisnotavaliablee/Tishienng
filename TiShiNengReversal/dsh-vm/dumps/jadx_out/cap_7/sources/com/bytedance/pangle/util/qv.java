package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class qv {
    static volatile java.util.ArrayList<java.lang.String> j;
    private static java.lang.String xt;

    static {
            return
    }

    public qv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String j(java.util.List<java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            if (r3 == 0) goto L33
            int r1 = r3.size()
            if (r1 <= 0) goto L33
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            java.lang.String r2 = " , "
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r0.append(r2)
            goto L13
        L28:
            int r3 = r0.lastIndexOf(r2)
            int r1 = r0.length()
            r0.delete(r3, r1)
        L33:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.util.List<java.lang.String> j() {
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L9
            android.content.res.AssetManager r0 = (android.content.res.AssetManager) r0     // Catch: java.lang.Exception -> L9
            goto L12
        L9:
            r0 = move-exception
            java.lang.String r1 = "Zeus/resources_pangle"
            java.lang.String r2 = "Execute 'AssetManager.class.newInstance()' failed. "
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)
            r0 = 0
        L12:
            java.util.List r0 = j(r0)
            return r0
    }

    public static java.util.List<java.lang.String> j(android.content.res.AssetManager r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 != 0) goto L8
            goto L6d
        L8:
            boolean r1 = com.bytedance.pangle.util.g.az()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            if (r1 == 0) goto L36
            java.lang.String r1 = "getApkAssets"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r1, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L6d
            int r1 = r7.length     // Catch: java.lang.Throwable -> L34
            if (r1 <= 0) goto L6d
            int r1 = r7.length     // Catch: java.lang.Throwable -> L34
            r3 = 0
        L20:
            if (r3 >= r1) goto L6d
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "getAssetPath"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r4, r5, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L34
            r0.add(r4)     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 1
            goto L20
        L34:
            r7 = move-exception
            goto L66
        L36:
            java.lang.String r1 = "getStringBlockCount"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r1, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L34
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L34
            r3 = 0
        L45:
            if (r3 >= r1) goto L6d
            java.lang.String r4 = "getCookieName"
            int r5 = r3 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
            r6[r2] = r5     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r4, r6)     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
            if (r5 != 0) goto L63
            r0.add(r4)     // Catch: java.lang.Throwable -> L34 java.lang.IndexOutOfBoundsException -> L63
        L63:
            int r3 = r3 + 1
            goto L45
        L66:
            java.lang.String r1 = "Zeus/resources_pangle"
            java.lang.String r2 = "ResUtils GetAssetsPaths error. "
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r7)
        L6d:
            return r0
    }

    public static boolean j(android.content.res.AssetManager r7, java.lang.String r8) {
            r0 = 0
            boolean r1 = com.bytedance.pangle.util.g.az()     // Catch: java.lang.Throwable -> L31
            r2 = 1
            if (r1 == 0) goto L33
            java.lang.String r1 = "getApkAssets"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r1, r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L64
            int r1 = r7.length     // Catch: java.lang.Throwable -> L31
            if (r1 <= 0) goto L64
            int r1 = r7.length     // Catch: java.lang.Throwable -> L31
            r3 = 0
        L19:
            if (r3 >= r1) goto L64
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "getAssetPath"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            boolean r4 = android.text.TextUtils.equals(r4, r8)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L2e
            return r2
        L2e:
            int r3 = r3 + 1
            goto L19
        L31:
            r7 = move-exception
            goto L5d
        L33:
            java.lang.String r1 = "getStringBlockCount"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r1, r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L31
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L31
            r3 = 0
        L42:
            if (r3 >= r1) goto L64
            java.lang.String r4 = "getCookieName"
            int r3 = r3 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L31
            r6[r0] = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r4, r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            boolean r4 = android.text.TextUtils.equals(r4, r8)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L42
            return r2
        L5d:
            java.lang.String r8 = "Zeus/resources_pangle"
            java.lang.String r1 = "containsPath error. "
            com.bytedance.pangle.log.ZeusLogger.errReport(r8, r1, r7)
        L64:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 21)
    private static java.lang.String[] j(android.content.pm.ApplicationInfo r6) {
            r0 = 0
            java.lang.Class<android.content.pm.ApplicationInfo> r1 = android.content.pm.ApplicationInfo.class
            java.lang.String r2 = "resourceDirs"
            java.lang.reflect.Field r1 = com.bytedance.pangle.xt.xt.j.j(r1, r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L10
            goto L1a
        L10:
            r1 = move-exception
            java.lang.String r2 = "Zeus/load_pangle"
            java.lang.String r3 = "get resourceDirs failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r3, r1)
            java.lang.String[] r1 = new java.lang.String[r0]
        L1a:
            java.lang.String[] r2 = r6.splitSourceDirs
            java.lang.String[] r3 = r6.sharedLibraryFiles
            r4 = 3
            java.lang.String[][] r5 = new java.lang.String[r4][]
            r5[r0] = r2
            r2 = 1
            r5[r2] = r3
            r2 = 2
            r5[r2] = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            r1.<init>(r2)
            java.lang.String r6 = r6.sourceDir
            if (r6 == 0) goto L37
            r1.add(r6)
        L37:
            r6 = 0
        L38:
            if (r6 >= r4) goto L48
            r2 = r5[r6]
            if (r2 == 0) goto L45
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.addAll(r2)
        L45:
            int r6 = r6 + 1
            goto L38
        L48:
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.Object[] r6 = r1.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
    }

    public static java.lang.String xt(android.content.res.AssetManager r0) {
            java.util.List r0 = j(r0)
            java.lang.String r0 = j(r0)
            return r0
    }

    public static synchronized java.util.List<java.lang.String> xt() {
            java.lang.Class<com.bytedance.pangle.util.qv> r0 = com.bytedance.pangle.util.qv.class
            monitor-enter(r0)
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Throwable -> La5
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "zeus_stage_web"
            java.lang.String r3 = "start"
            r1.saveRecord(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList<java.lang.String> r1 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> La5
            if (r1 != 0) goto La7
            java.lang.Class<com.bytedance.pangle.util.qv> r1 = com.bytedance.pangle.util.qv.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList<java.lang.String> r2 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto La1
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            com.bytedance.pangle.util.qv.j = r2     // Catch: java.lang.Throwable -> L55
            boolean r2 = com.bytedance.pangle.util.g.up()     // Catch: java.lang.Throwable -> L55
            r3 = 0
            if (r2 == 0) goto L60
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r4 = "android:string/config_webViewPackageName"
            java.lang.String r5 = "string"
            java.lang.String r6 = "android"
            int r4 = r2.getIdentifier(r4, r5, r6)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.util.ArrayList<java.lang.String> r5 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.app.Application r6 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r2 = r2.getString(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.Context r2 = r6.createPackageContext(r2, r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r2 = r2.sourceDir     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r5.add(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            goto La1
        L55:
            r2 = move-exception
            goto La3
        L57:
            r2 = move-exception
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.String r4 = "getWebViewPaths1 failed."
            com.bytedance.pangle.log.ZeusLogger.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L55
            goto La1
        L60:
            boolean r2 = com.bytedance.pangle.util.g.qv()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto La1
            java.lang.String r2 = "android.webkit.WebViewFactory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            java.lang.String r4 = "getWebViewContextAndSetProvider"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeStaticMethod(r2, r4, r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            boolean r3 = com.bytedance.pangle.util.g.av()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            if (r3 == 0) goto L8c
            java.util.ArrayList<java.lang.String> r3 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            java.lang.String[] r2 = j(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            java.util.Collections.addAll(r3, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            goto La1
        L8a:
            r2 = move-exception
            goto L9a
        L8c:
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            java.lang.String r2 = r2.sourceDir     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            java.util.ArrayList<java.lang.String> r3 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            r3.add(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L8a
            goto La1
        L9a:
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.String r4 = "getWebViewPaths2 failed."
            com.bytedance.pangle.log.ZeusLogger.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L55
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            goto La7
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            throw r2     // Catch: java.lang.Throwable -> La5
        La5:
            r1 = move-exception
            goto Lc8
        La7:
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Throwable -> La5
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "zeus_stage_web"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "finish :"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList<java.lang.String> r4 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> La5
            r3.append(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La5
            r1.saveRecord(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList<java.lang.String> r1 = com.bytedance.pangle.util.qv.j     // Catch: java.lang.Throwable -> La5
            monitor-exit(r0)
            return r1
        Lc8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            throw r1
    }
}
