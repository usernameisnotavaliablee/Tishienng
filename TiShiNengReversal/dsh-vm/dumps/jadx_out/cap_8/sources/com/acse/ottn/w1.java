package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class w1 {
    public static com.acse.ottn.w1 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2846b = "InstallUtils";

    static {
            return
    }

    public w1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.w1 a() {
            com.acse.ottn.w1 r0 = com.acse.ottn.w1.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.w1> r0 = com.acse.ottn.w1.class
            monitor-enter(r0)
            com.acse.ottn.w1 r1 = com.acse.ottn.w1.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.w1 r1 = new com.acse.ottn.w1     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.w1.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.w1 r0 = com.acse.ottn.w1.a
            return r0
    }

    public com.acse.ottn.model.PlunInstallModel a(android.content.Context r4) {
            r3 = this;
            com.acse.ottn.model.PlunInstallModel r0 = new com.acse.ottn.model.PlunInstallModel
            r0.<init>()
            if (r4 != 0) goto L8
            return r0
        L8:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Exception -> L3c
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L3c
            r2 = 0
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: java.lang.Exception -> L3c
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo     // Catch: java.lang.Exception -> L3c
            java.lang.CharSequence r1 = r1.getApplicationLabel(r2)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3c
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L3c
            if (r1 != 0) goto L3e
            int r4 = r4.versionCode     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
            r1.append(r4)     // Catch: java.lang.Exception -> L3c
            java.lang.String r4 = ""
            r1.append(r4)     // Catch: java.lang.Exception -> L3c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L3c
            r0.setVersion(r4)     // Catch: java.lang.Exception -> L3c
            return r0
        L3c:
            r4 = move-exception
            goto L3f
        L3e:
            return r0
        L3f:
            java.lang.String r1 = "0"
            r0.setVersion(r1)
            r4.getMessage()
            return r0
    }

    public com.acse.ottn.model.PlunInstallModel a(java.lang.String r4) {
            r3 = this;
            com.acse.ottn.model.PlunInstallModel r0 = new com.acse.ottn.model.PlunInstallModel
            r0.<init>()
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L40
            if (r1 != 0) goto Lc
            return r0
        Lc:
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L40
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L40
            r2 = 0
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: java.lang.Exception -> L40
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo     // Catch: java.lang.Exception -> L40
            java.lang.CharSequence r1 = r1.getApplicationLabel(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L40
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L40
            if (r1 != 0) goto L42
            int r4 = r4.versionCode     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r1.<init>()     // Catch: java.lang.Exception -> L40
            r1.append(r4)     // Catch: java.lang.Exception -> L40
            java.lang.String r4 = ""
            r1.append(r4)     // Catch: java.lang.Exception -> L40
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L40
            r0.setVersion(r4)     // Catch: java.lang.Exception -> L40
            return r0
        L40:
            r4 = move-exception
            goto L43
        L42:
            return r0
        L43:
            java.lang.String r1 = "0"
            r0.setVersion(r1)
            r4.getMessage()
            return r0
    }

    @androidx.annotation.RequiresApi(api = 17)
    public void a(java.io.File r5, android.app.Activity r6) {
            r4 = this;
            boolean r0 = r5.exists()
            if (r0 != 0) goto L7
            goto L62
        L7:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.INSTALL_PACKAGE"
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L40
            r2 = 24
            java.lang.String r3 = "application/vnd.android.package-archive"
            if (r1 < r2) goto L42
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r0.addCategory(r1)     // Catch: java.lang.Exception -> L40
            r1 = 1
            r0.addFlags(r1)     // Catch: java.lang.Exception -> L40
            r1 = 2
            r0.addFlags(r1)     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r1.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r6.getPackageName()     // Catch: java.lang.Exception -> L40
            r1.append(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = ".provider"
            r1.append(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L40
            android.net.Uri r5 = androidx.core.content.FileProvider.getUriForFile(r6, r1, r5)     // Catch: java.lang.Exception -> L40
            r0.setDataAndType(r5, r3)     // Catch: java.lang.Exception -> L40
            goto L4e
        L40:
            r5 = move-exception
            goto L63
        L42:
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch: java.lang.Exception -> L40
            r0.setDataAndType(r5, r3)     // Catch: java.lang.Exception -> L40
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r5)     // Catch: java.lang.Exception -> L40
        L4e:
            android.content.pm.PackageManager r5 = r6.getPackageManager()     // Catch: java.lang.Exception -> L40
            r1 = 0
            java.util.List r5 = r5.queryIntentActivities(r0, r1)     // Catch: java.lang.Exception -> L40
            int r5 = r5.size()     // Catch: java.lang.Exception -> L40
            if (r5 <= 0) goto L62
            r5 = 10010(0x271a, float:1.4027E-41)
            r6.startActivityForResult(r0, r5)     // Catch: java.lang.Exception -> L40
        L62:
            return
        L63:
            r5.getMessage()
            return
    }

    public final void a(java.io.InputStream r4, java.io.File r5) {
            r3 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6 java.io.FileNotFoundException -> L8
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L6 java.io.FileNotFoundException -> L8
            goto L9
        L6:
            r5 = move-exception
            goto L26
        L8:
            r0 = 0
        L9:
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L19
        Ld:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L19
            r2 = -1
            if (r1 == r2) goto L1b
            r2 = 0
            r0.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L19
            goto Ld
        L19:
            r5 = move-exception
            goto L22
        L1b:
            r0.flush()     // Catch: java.lang.Throwable -> L19
            r0.close()     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L2a
            goto L2a
        L22:
            r0.close()     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L2a
            throw r5     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L2a
        L26:
            r4.close()     // Catch: java.io.IOException -> L29
        L29:
            throw r5
        L2a:
            r4.close()     // Catch: java.io.IOException -> L2d
        L2d:
            return
    }

    public boolean a(android.app.Activity r2) {
            r1 = this;
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.AssetManager r2 = r2.getAssets()
            java.lang.String r0 = "detn.mp3"
            java.io.InputStream r2 = r2.open(r0)     // Catch: java.io.IOException -> Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            r2 = 1
            return r2
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.w1 r0 = com.acse.ottn.w1.a
            return r0
    }

    public void b(android.app.Activity r5) {
            r4 = this;
            java.lang.String r0 = "apk"
            android.content.res.Resources r1 = r5.getResources()
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r2 = "detn.mp3"
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.io.IOException -> L25
            if (r1 != 0) goto L13
            return
        L13:
            java.io.File r2 = r5.getExternalFilesDir(r0)     // Catch: java.io.IOException -> L25
            java.io.File r2 = r2.getAbsoluteFile()     // Catch: java.io.IOException -> L25
            boolean r3 = r2.exists()     // Catch: java.io.IOException -> L25
            if (r3 != 0) goto L27
            r2.mkdir()     // Catch: java.io.IOException -> L25
            goto L27
        L25:
            r5 = move-exception
            goto L53
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L25
            r2.<init>()     // Catch: java.io.IOException -> L25
            java.io.File r0 = r5.getExternalFilesDir(r0)     // Catch: java.io.IOException -> L25
            java.io.File r0 = r0.getAbsoluteFile()     // Catch: java.io.IOException -> L25
            java.lang.String r0 = r0.getPath()     // Catch: java.io.IOException -> L25
            r2.append(r0)     // Catch: java.io.IOException -> L25
            java.lang.String r0 = "/text.apk"
            r2.append(r0)     // Catch: java.io.IOException -> L25
            java.lang.String r0 = r2.toString()     // Catch: java.io.IOException -> L25
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L25
            r2.<init>(r0)     // Catch: java.io.IOException -> L25
            r2.createNewFile()     // Catch: java.io.IOException -> L25
            r4.a(r1, r2)     // Catch: java.io.IOException -> L25
            r4.a(r2, r5)     // Catch: java.io.IOException -> L25
            return
        L53:
            r5.getMessage()
            return
    }
}
