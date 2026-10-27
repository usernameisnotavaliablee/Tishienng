package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L2b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L27
            r8.close()
            return r9
        L27:
            r0 = move-exception
            r9 = r0
            r7 = r8
            goto L33
        L2b:
            if (r8 == 0) goto L30
            r8.close()
        L30:
            return r7
        L31:
            r0 = move-exception
            r9 = r0
        L33:
            if (r7 == 0) goto L38
            r7.close()
        L38:
            throw r9
    }

    public static java.lang.String b(android.content.Context r6, android.net.Uri r7) {
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch: java.lang.Exception -> L56
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = "_display_name"
            int r0 = r7.getColumnIndex(r0)     // Catch: java.lang.Exception -> L56
            r7.moveToFirst()     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Exception -> L56
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L56
            java.io.File r3 = r6.getFilesDir()     // Catch: java.lang.Exception -> L56
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L56
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.Exception -> L56
            java.io.InputStream r6 = r6.openInputStream(r1)     // Catch: java.lang.Exception -> L56
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L56
            r0.<init>(r2)     // Catch: java.lang.Exception -> L56
            int r1 = r6.available()     // Catch: java.lang.Exception -> L56
            r3 = 1048576(0x100000, float:1.469368E-39)
            int r1 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Exception -> L56
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L56
        L3c:
            int r3 = r6.read(r1)     // Catch: java.lang.Exception -> L56
            r4 = -1
            if (r3 == r4) goto L48
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.lang.Exception -> L56
            goto L3c
        L48:
            r7.close()     // Catch: java.lang.Exception -> L56
            r6.close()     // Catch: java.lang.Exception -> L56
            r0.close()     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = r2.getPath()     // Catch: java.lang.Exception -> L56
            return r6
        L56:
            r6 = 0
            return r6
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static java.lang.String c(android.content.Context r5, android.net.Uri r6) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r5, r6)
            r1 = 0
            if (r0 == 0) goto Lbd
            boolean r0 = f(r6)
            r2 = 0
            java.lang.String r3 = ":"
            r4 = 1
            if (r0 == 0) goto L5f
            java.lang.String r5 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String[] r5 = r5.split(r3)
            r6 = r5[r2]
            java.lang.String r0 = "primary"
            boolean r0 = r0.equalsIgnoreCase(r6)
            java.lang.String r2 = "/"
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r6.append(r0)
            r6.append(r2)
            r5 = r5[r4]
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            return r5
        L3e:
            java.lang.String r0 = "5D68-9217"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto Ldf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r6.append(r0)
            r6.append(r2)
            r5 = r5[r4]
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            return r5
        L5f:
            boolean r0 = e(r6)
            if (r0 == 0) goto L80
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r2 = r6.longValue()
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r0, r2)
            java.lang.String r5 = a(r5, r6, r1, r1)
            return r5
        L80:
            boolean r0 = h(r6)
            if (r0 == 0) goto Ldf
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String[] r6 = r6.split(r3)
            r0 = r6[r2]
            java.lang.String r2 = "image"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L9b
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto Lb0
        L9b:
            java.lang.String r2 = "video"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto La6
            android.net.Uri r1 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto Lb0
        La6:
            java.lang.String r2 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb0
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        Lb0:
            r6 = r6[r4]
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r0 = "_id=?"
            java.lang.String r5 = a(r5, r1, r0, r6)
            return r5
        Lbd:
            java.lang.String r0 = "content"
            java.lang.String r2 = r6.getScheme()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lce
            java.lang.String r5 = a(r5, r6, r1, r1)
            return r5
        Lce:
            java.lang.String r5 = "file"
            java.lang.String r0 = r6.getScheme()
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto Ldf
            java.lang.String r5 = r6.getPath()
            return r5
        Ldf:
            return r1
    }

    public static java.lang.String d() {
            java.util.Date r0 = new java.util.Date
            long r1 = java.lang.System.currentTimeMillis()
            r0.<init>(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMddHHmmss"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "android_"
            r2.append(r3)
            java.lang.String r0 = r1.format(r0)
            r2.append(r0)
            double r0 = java.lang.Math.random()
            r3 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r0 = r0 * r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r3
            r3 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r0 = r0 * r3
            int r0 = (int) r0
            r2.append(r0)
            java.lang.String r0 = ".mp4"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static boolean e(android.net.Uri r1) {
            java.lang.String r0 = "com.android.providers.downloads.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean f(android.net.Uri r1) {
            java.lang.String r0 = "com.android.externalstorage.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean g(android.net.Uri r1) {
            java.lang.String r0 = "com.google.android.apps.photos.content"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean h(android.net.Uri r1) {
            java.lang.String r0 = "com.android.providers.media.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean i(android.net.Uri r1) {
            java.lang.String r0 = "com.tencent.mtt.fileprovider"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }
}
