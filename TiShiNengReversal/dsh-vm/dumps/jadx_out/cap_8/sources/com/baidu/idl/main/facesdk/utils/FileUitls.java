package com.baidu.idl.main.facesdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FileUitls {
    public FileUitls() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean assetOpen(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L13
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L13
        La:
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Exception -> L13
            r2.open(r3)     // Catch: java.lang.Exception -> L13
            r2 = 1
            return r2
        L13:
            return r0
    }

    public static void deleteLicense(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r1 = r1.getParent()
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L2a
            r1.delete()
        L2a:
            r0 = 0
            java.io.File r2 = r2.getDir(r3, r0)
            if (r2 == 0) goto L3a
            boolean r3 = r2.exists()
            if (r3 == 0) goto L3a
            r2.delete()
        L3a:
            return
    }

    public static boolean fileIsExists(java.lang.String r2) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lf
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lf
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> Lf
            if (r2 != 0) goto Ld
            return r0
        Ld:
            r2 = 1
            return r2
        Lf:
            r2 = move-exception
            r2.getMessage()
            return r0
    }

    public static java.io.File getBatchFaceDirectory(java.lang.String r2) {
            java.io.File r0 = getSDRootFile()
            if (r0 == 0) goto L1b
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1b
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L1a
            r1.mkdirs()
        L1a:
            return r1
        L1b:
            r2 = 0
            return r2
    }

    public static android.graphics.Bitmap getBitmap(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            r1.close()     // Catch: java.io.IOException -> L16
        L16:
            return r2
        L17:
            r2 = move-exception
            r0 = r1
            goto L21
        L1a:
            goto L27
        L1c:
            r2 = move-exception
            goto L21
        L1e:
            r1 = r0
            goto L27
        L21:
            if (r0 == 0) goto L26
            r0.close()     // Catch: java.io.IOException -> L26
        L26:
            throw r2
        L27:
            if (r1 == 0) goto L2c
            r1.close()     // Catch: java.io.IOException -> L2c
        L2c:
            return r0
    }

    public static byte[] getByteArrayFromAssets(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.io.IOException -> L16
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.io.IOException -> L16
            int r2 = r1.available()     // Catch: java.io.IOException -> L16
            byte[] r0 = new byte[r2]     // Catch: java.io.IOException -> L16
            r1.read(r0)     // Catch: java.io.IOException -> L16
            r1.close()     // Catch: java.io.IOException -> L16
            return r0
        L16:
            r1 = move-exception
            r1.getMessage()
            return r0
    }

    public static java.io.File getFaceDirectory() {
            java.io.File r0 = getSDRootFile()
            if (r0 == 0) goto L1d
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "faces"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L1c
            r1.mkdirs()
        L1c:
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public static byte[] getModelContent(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            byte[] r0 = new byte[r0]
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 == 0) goto L44
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.io.FileNotFoundException -> L31
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.io.FileNotFoundException -> L31
            int r1 = r2.available()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27 java.io.FileNotFoundException -> L2a
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27 java.io.FileNotFoundException -> L2a
            r2.read(r0)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27 java.io.FileNotFoundException -> L2a
            r2.close()     // Catch: java.io.IOException -> L21
            goto L22
        L21:
        L22:
            r3 = r2
            goto L44
        L24:
            r4 = move-exception
            r3 = r2
            goto L33
        L27:
            r3 = r2
            goto L39
        L2a:
            r3 = r2
            goto L41
        L2d:
            r4 = move-exception
            goto L33
        L2f:
            goto L39
        L31:
            goto L41
        L33:
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.io.IOException -> L38
        L38:
            throw r4
        L39:
            if (r3 == 0) goto L44
        L3b:
            r3.close()     // Catch: java.io.IOException -> L3f
            goto L44
        L3f:
            goto L44
        L41:
            if (r3 == 0) goto L44
            goto L3b
        L44:
            int r1 = r0.length
            if (r1 <= 0) goto L48
            return r0
        L48:
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            java.io.InputStream r3 = r4.open(r5)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r3.read(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
        L5d:
            r3.close()     // Catch: java.io.IOException -> L6e
            goto L6e
        L61:
            r4 = move-exception
            goto L65
        L63:
            goto L6b
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r4
        L6b:
            if (r3 == 0) goto L6e
            goto L5d
        L6e:
            return r0
    }

    public static java.lang.String getSDPath() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L12
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            return r1
    }

    public static java.io.File getSDRootFile() {
            boolean r0 = isSdCardAvailable()
            if (r0 == 0) goto Lb
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean isSdCardAvailable() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.lang.String readFile(java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.isDirectory()
            java.lang.String r1 = ""
            if (r3 == 0) goto Le
            return r1
        Le:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            r3.<init>(r0)     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            r0.<init>(r3)     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            r2.<init>(r0)     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
        L1d:
            java.lang.String r0 = r2.readLine()     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            if (r0 == 0) goto L25
            r1 = r0
            goto L1d
        L25:
            r3.close()     // Catch: java.io.IOException -> L29 java.io.FileNotFoundException -> L2d
            return r1
        L29:
            r3 = move-exception
            r3.getMessage()
        L2d:
            return r1
    }

    public static java.util.ArrayList<java.lang.String> readLicense(java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r3 = r1.isDirectory()
            if (r3 == 0) goto L11
            return r0
        L11:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            r3.<init>(r1)     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            r1.<init>(r3)     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            r2.<init>(r1)     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
        L20:
            java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            if (r1 == 0) goto L2c
            r0.add(r1)     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            goto L20
        L2a:
            r3 = move-exception
            goto L30
        L2c:
            r3.close()     // Catch: java.io.IOException -> L2a java.io.FileNotFoundException -> L33
            return r0
        L30:
            r3.getMessage()
        L33:
            return r0
    }

    public static boolean saveFile(java.io.File r2, android.graphics.Bitmap r3) {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            r0 = 100
            r3.compress(r2, r0, r1)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            r2 = 1
            r1.close()     // Catch: java.lang.Exception -> L11
        L11:
            return r2
        L12:
            r2 = move-exception
            r0 = r1
            goto L1c
        L15:
            r0 = r1
            goto L22
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            goto L22
        L1c:
            if (r0 == 0) goto L21
            r0.close()     // Catch: java.lang.Exception -> L21
        L21:
            throw r2
        L22:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.lang.Exception -> L27
        L27:
            r2 = 0
            return r2
    }
}
