package androidx.documentfile.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final java.lang.String TAG = "DocumentFile";

    private DocumentsContractApi19() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canRead(android.content.Context r3, android.net.Uri r4) {
            r0 = 1
            int r1 = r3.checkCallingOrSelfUriPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r3 = getRawType(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L14
            return r2
        L14:
            return r0
    }

    public static boolean canWrite(android.content.Context r4, android.net.Uri r5) {
            r0 = 2
            int r1 = r4.checkCallingOrSelfUriPermission(r5, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r1 = getRawType(r4, r5)
            java.lang.String r3 = "flags"
            int r4 = queryForInt(r4, r5, r3, r2)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L1a
            return r2
        L1a:
            r5 = r4 & 4
            r3 = 1
            if (r5 == 0) goto L20
            return r3
        L20:
            java.lang.String r5 = "vnd.android.document/directory"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2e
            r5 = r4 & 8
            if (r5 == 0) goto L2e
            return r3
        L2e:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L38
            r4 = r4 & r0
            if (r4 == 0) goto L38
            return r3
        L38:
            return r2
    }

    private static void closeQuietly(@androidx.annotation.Nullable java.lang.AutoCloseable r0) {
            if (r0 == 0) goto L8
            androidx.core.provider.c.a(r0)     // Catch: java.lang.Exception -> L5 java.lang.RuntimeException -> L6
        L5:
            return
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static boolean exists(android.content.Context r7, android.net.Uri r8) {
            android.content.ContentResolver r0 = r7.getContentResolver()
            r7 = 0
            r6 = 0
            java.lang.String r1 = "document_id"
            java.lang.String[] r2 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r8
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            int r8 = r6.getCount()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r8 <= 0) goto L1b
            r7 = 1
        L1b:
            closeQuietly(r6)
            return r7
        L1f:
            r0 = move-exception
            r7 = r0
            goto L2b
        L22:
            r0 = move-exception
            r8 = r0
            r8.toString()     // Catch: java.lang.Throwable -> L1f
            closeQuietly(r6)
            return r7
        L2b:
            closeQuietly(r6)
            throw r7
    }

    public static long getFlags(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "flags"
            r1 = 0
            long r3 = queryForLong(r3, r4, r0, r1)
            return r3
    }

    @androidx.annotation.Nullable
    public static java.lang.String getName(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "_display_name"
            r1 = 0
            java.lang.String r2 = queryForString(r2, r3, r0, r1)
            return r2
    }

    @androidx.annotation.Nullable
    private static java.lang.String getRawType(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "mime_type"
            r1 = 0
            java.lang.String r2 = queryForString(r2, r3, r0, r1)
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String getType(android.content.Context r0, android.net.Uri r1) {
            java.lang.String r0 = getRawType(r0, r1)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Le
            r0 = 0
        Le:
            return r0
    }

    public static boolean isDirectory(android.content.Context r1, android.net.Uri r2) {
            java.lang.String r0 = "vnd.android.document/directory"
            java.lang.String r1 = getRawType(r1, r2)
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isFile(android.content.Context r0, android.net.Uri r1) {
            java.lang.String r0 = getRawType(r0, r1)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L16
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static boolean isVirtual(android.content.Context r4, android.net.Uri r5) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r4, r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r4 = getFlags(r4, r5)
            r2 = 512(0x200, double:2.53E-321)
            long r4 = r4 & r2
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            r4 = 1
            return r4
        L17:
            return r1
    }

    public static long lastModified(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "last_modified"
            r1 = 0
            long r3 = queryForLong(r3, r4, r0, r1)
            return r3
    }

    public static long length(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "_size"
            r1 = 0
            long r3 = queryForLong(r3, r4, r0, r1)
            return r3
    }

    private static int queryForInt(android.content.Context r2, android.net.Uri r3, java.lang.String r4, int r5) {
            long r0 = (long) r5
            long r2 = queryForLong(r2, r3, r4, r0)
            int r3 = (int) r2
            return r3
    }

    private static long queryForLong(android.content.Context r6, android.net.Uri r7, java.lang.String r8, long r9) {
            android.content.ContentResolver r0 = r6.getContentResolver()
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r7 == 0) goto L2c
            r7 = 0
            boolean r8 = r6.isNull(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r8 != 0) goto L2c
            long r7 = r6.getLong(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            closeQuietly(r6)
            return r7
        L26:
            r0 = move-exception
            r7 = r0
            goto L37
        L29:
            r0 = move-exception
            r7 = r0
            goto L30
        L2c:
            closeQuietly(r6)
            return r9
        L30:
            r7.toString()     // Catch: java.lang.Throwable -> L26
            closeQuietly(r6)
            return r9
        L37:
            closeQuietly(r6)
            throw r7
    }

    @androidx.annotation.Nullable
    private static java.lang.String queryForString(android.content.Context r6, android.net.Uri r7, java.lang.String r8, @androidx.annotation.Nullable java.lang.String r9) {
            android.content.ContentResolver r0 = r6.getContentResolver()
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r7 == 0) goto L2c
            r7 = 0
            boolean r8 = r6.isNull(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r8 != 0) goto L2c
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            closeQuietly(r6)
            return r7
        L26:
            r0 = move-exception
            r7 = r0
            goto L37
        L29:
            r0 = move-exception
            r7 = r0
            goto L30
        L2c:
            closeQuietly(r6)
            return r9
        L30:
            r7.toString()     // Catch: java.lang.Throwable -> L26
            closeQuietly(r6)
            return r9
        L37:
            closeQuietly(r6)
            throw r7
    }
}
