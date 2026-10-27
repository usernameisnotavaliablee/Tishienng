package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private static final java.lang.String a = "FileUtils";

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(@androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull java.lang.String r10) throws java.io.IOException {
            boolean r0 = r9.equalsIgnoreCase(r10)
            if (r0 == 0) goto L7
            goto L38
        L7:
            r1 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L41
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L41
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L41
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L41
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3d
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L3d
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            java.nio.channels.FileChannel r8 = r9.getChannel()     // Catch: java.lang.Throwable -> L3d
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r3.transferTo(r4, r6, r8)     // Catch: java.lang.Throwable -> L39
            r3.close()     // Catch: java.lang.Throwable -> L39
            r3.close()
            if (r8 == 0) goto L38
            r8.close()
        L38:
            return
        L39:
            r0 = move-exception
            r9 = r0
        L3b:
            r1 = r3
            goto L44
        L3d:
            r0 = move-exception
            r9 = r0
            r8 = r1
            goto L3b
        L41:
            r0 = move-exception
            r9 = r0
            r8 = r1
        L44:
            if (r1 == 0) goto L49
            r1.close()
        L49:
            if (r8 == 0) goto L4e
            r8.close()
        L4e:
            throw r9
    }

    public static java.lang.String b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.IllegalArgumentException -> L37
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.IllegalArgumentException -> L37
            if (r8 == 0) goto L2e
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L2b
            if (r9 == 0) goto L2e
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L2b
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L2b
            r8.close()
            return r9
        L27:
            r0 = move-exception
            r9 = r0
            r7 = r8
            goto L51
        L2b:
            r0 = move-exception
            r9 = r0
            goto L3a
        L2e:
            if (r8 == 0) goto L50
        L30:
            r8.close()
            goto L50
        L34:
            r0 = move-exception
            r9 = r0
            goto L51
        L37:
            r0 = move-exception
            r9 = r0
            r8 = r7
        L3a:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L27
            java.lang.String r11 = "getDataColumn: _data - [%s]"
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L27
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L27
            r1 = 0
            r0[r1] = r9     // Catch: java.lang.Throwable -> L27
            java.lang.String.format(r10, r11, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L50
            goto L30
        L50:
            return r7
        L51:
            if (r7 == 0) goto L56
            r7.close()
        L56:
            throw r9
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static java.lang.String c(android.content.Context r5, android.net.Uri r6) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r5, r6)
            r1 = 0
            if (r0 == 0) goto La7
            boolean r0 = e(r6)
            r2 = 1
            r3 = 0
            java.lang.String r4 = ":"
            if (r0 == 0) goto L3e
            java.lang.String r5 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String[] r5 = r5.split(r4)
            r6 = r5[r3]
            java.lang.String r0 = "primary"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto Ld4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r6.append(r0)
            java.lang.String r0 = "/"
            r6.append(r0)
            r5 = r5[r2]
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            return r5
        L3e:
            boolean r0 = d(r6)
            if (r0 == 0) goto L6a
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.NumberFormatException -> L65
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L65
            long r2 = r6.longValue()     // Catch: java.lang.NumberFormatException -> L65
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r5 = b(r5, r6, r1, r1)     // Catch: java.lang.NumberFormatException -> L65
            return r5
        L65:
            r5 = move-exception
            r5.getMessage()
            return r1
        L6a:
            boolean r0 = g(r6)
            if (r0 == 0) goto Ld4
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String[] r6 = r6.split(r4)
            r0 = r6[r3]
            java.lang.String r3 = "image"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L85
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L9a
        L85:
            java.lang.String r3 = "video"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L90
            android.net.Uri r1 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L9a
        L90:
            java.lang.String r3 = "audio"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9a
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L9a:
            r6 = r6[r2]
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r0 = "_id=?"
            java.lang.String r5 = b(r5, r1, r0, r6)
            return r5
        La7:
            java.lang.String r0 = "content"
            java.lang.String r2 = r6.getScheme()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lc3
            boolean r0 = f(r6)
            if (r0 == 0) goto Lbe
            java.lang.String r5 = r6.getLastPathSegment()
            return r5
        Lbe:
            java.lang.String r5 = b(r5, r6, r1, r1)
            return r5
        Lc3:
            java.lang.String r5 = "file"
            java.lang.String r0 = r6.getScheme()
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto Ld4
            java.lang.String r5 = r6.getPath()
            return r5
        Ld4:
            return r1
    }

    public static boolean d(android.net.Uri r1) {
            java.lang.String r0 = "com.android.providers.downloads.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean e(android.net.Uri r1) {
            java.lang.String r0 = "com.android.externalstorage.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean f(android.net.Uri r1) {
            java.lang.String r0 = "com.google.android.apps.photos.content"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean g(android.net.Uri r1) {
            java.lang.String r0 = "com.android.providers.media.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }
}
