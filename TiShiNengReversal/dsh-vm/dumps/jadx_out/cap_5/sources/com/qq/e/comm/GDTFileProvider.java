package com.qq.e.comm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class GDTFileProvider extends android.content.ContentProvider {
    private static final java.lang.String[] b = null;
    private static final java.io.File c = null;
    private static java.util.HashMap<java.lang.String, com.qq.e.comm.GDTFileProvider.a> d;
    private com.qq.e.comm.GDTFileProvider.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        android.net.Uri a(java.io.File r1);

        java.io.File a(android.net.Uri r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements com.qq.e.comm.GDTFileProvider.a {
        private final java.lang.String a;
        private final java.util.HashMap<java.lang.String, java.io.File> b;

        b(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.b = r0
                r1.a = r2
                return
        }

        @Override // com.qq.e.comm.GDTFileProvider.a
        public android.net.Uri a(java.io.File r6) {
                r5 = this;
                java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.io.IOException -> Lb6
                java.util.HashMap<java.lang.String, java.io.File> r0 = r5.b
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L43
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                java.io.File r3 = (java.io.File) r3
                java.lang.String r3 = r3.getPath()
                boolean r4 = r6.startsWith(r3)
                if (r4 == 0) goto Lf
                if (r1 == 0) goto L41
                int r3 = r3.length()
                java.lang.Object r4 = r1.getValue()
                java.io.File r4 = (java.io.File) r4
                java.lang.String r4 = r4.getPath()
                int r4 = r4.length()
                if (r3 <= r4) goto Lf
            L41:
                r1 = r2
                goto Lf
            L43:
                if (r1 == 0) goto L9f
                java.lang.Object r0 = r1.getValue()
                java.io.File r0 = (java.io.File) r0
                java.lang.String r0 = r0.getPath()
                java.lang.String r2 = "/"
                boolean r3 = r0.endsWith(r2)
                int r0 = r0.length()
                if (r3 == 0) goto L60
            L5b:
                java.lang.String r6 = r6.substring(r0)
                goto L63
            L60:
                int r0 = r0 + 1
                goto L5b
            L63:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r1.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                java.lang.String r6 = android.net.Uri.encode(r6, r2)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "content"
                android.net.Uri$Builder r0 = r0.scheme(r1)
                java.lang.String r1 = r5.a
                android.net.Uri$Builder r0 = r0.authority(r1)
                android.net.Uri$Builder r6 = r0.encodedPath(r6)
                android.net.Uri r6 = r6.build()
                return r6
            L9f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to find configured root that contains "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
            Lb6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // com.qq.e.comm.GDTFileProvider.a
        public java.io.File a(android.net.Uri r5) {
                r4 = this;
                java.lang.String r0 = r5.getEncodedPath()
                r1 = 47
                r2 = 1
                int r1 = r0.indexOf(r1, r2)
                java.lang.String r3 = r0.substring(r2, r1)
                java.lang.String r3 = android.net.Uri.decode(r3)
                int r1 = r1 + r2
                java.lang.String r0 = r0.substring(r1)
                java.lang.String r0 = android.net.Uri.decode(r0)
                java.util.HashMap<java.lang.String, java.io.File> r1 = r4.b
                java.lang.Object r1 = r1.get(r3)
                java.io.File r1 = (java.io.File) r1
                if (r1 == 0) goto L5d
                java.io.File r5 = new java.io.File
                r5.<init>(r1, r0)
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L46
                java.lang.String r0 = r5.getPath()
                java.lang.String r1 = r1.getPath()
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L3e
                return r5
            L3e:
                java.lang.SecurityException r5 = new java.lang.SecurityException
                java.lang.String r0 = "Resolved path jumped beyond configured root"
                r5.<init>(r0)
                throw r5
            L46:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L5d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to find configured root for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        void a(java.lang.String r4, java.io.File r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L28
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L10
                java.util.HashMap<java.lang.String, java.io.File> r0 = r3.b
                r0.put(r4, r5)
                return
            L10:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5, r4)
                throw r0
            L28:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Name must not be empty"
                r4.<init>(r5)
                throw r4
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.qq.e.comm.GDTFileProvider.b = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = java.io.File.separator
            r0.<init>(r1)
            com.qq.e.comm.GDTFileProvider.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.qq.e.comm.GDTFileProvider.d = r0
            return
    }

    public GDTFileProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(java.lang.String r3) {
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            r3 = 268435456(0x10000000, float:2.524355E-29)
            return r3
        Lb:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L54
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            goto L54
        L1c:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L27
            r3 = 704643072(0x2a000000, float:1.1368684E-13)
            return r3
        L27:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L32
            r3 = 939524096(0x38000000, float:3.0517578E-5)
            return r3
        L32:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3d
            r3 = 1006632960(0x3c000000, float:0.0078125)
            return r3
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid mode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L54:
            r3 = 738197504(0x2c000000, float:1.8189894E-12)
            return r3
    }

    private static java.io.File a(java.io.File r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            if (r2 == 0) goto Le
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r2)
            r4 = r3
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            return r4
    }

    private static java.io.File[] a(android.content.Context r0, java.lang.String r1) {
            java.io.File[] r0 = r0.getExternalFilesDirs(r1)
            return r0
    }

    private static java.lang.Object[] a(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.lang.String[] a(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static com.qq.e.comm.GDTFileProvider.a b(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap<java.lang.String, com.qq.e.comm.GDTFileProvider$a> r0 = com.qq.e.comm.GDTFileProvider.d
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, com.qq.e.comm.GDTFileProvider$a> r1 = com.qq.e.comm.GDTFileProvider.d     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L17
            com.qq.e.comm.GDTFileProvider$a r1 = (com.qq.e.comm.GDTFileProvider.a) r1     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            com.qq.e.comm.GDTFileProvider$a r1 = c(r2, r3)     // Catch: java.lang.Throwable -> L17 org.xmlpull.v1.XmlPullParserException -> L19 java.io.IOException -> L22
            java.util.HashMap<java.lang.String, com.qq.e.comm.GDTFileProvider$a> r2 = com.qq.e.comm.GDTFileProvider.d     // Catch: java.lang.Throwable -> L17
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L17
            goto L2b
        L17:
            r2 = move-exception
            goto L2d
        L19:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    private static com.qq.e.comm.GDTFileProvider.a c(android.content.Context r7, java.lang.String r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            com.qq.e.comm.GDTFileProvider$b r0 = new com.qq.e.comm.GDTFileProvider$b
            r0.<init>(r8)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r8 = r1.resolveContentProvider(r8, r2)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            java.lang.String r2 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r8 = r8.loadXmlMetaData(r1, r2)
            if (r8 == 0) goto Lb1
        L1b:
            int r1 = r8.next()
            r2 = 1
            if (r1 == r2) goto Lad
            r2 = 2
            if (r1 != r2) goto L1b
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "name"
            r3 = 0
            java.lang.String r2 = r8.getAttributeValue(r3, r2)
            java.lang.String r4 = "path"
            java.lang.String r4 = r8.getAttributeValue(r3, r4)
            java.lang.String r5 = "root-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L41
            java.io.File r3 = com.qq.e.comm.GDTFileProvider.c
            goto L9e
        L41:
            java.lang.String r5 = "files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L4e
            java.io.File r3 = r7.getFilesDir()
            goto L9e
        L4e:
            java.lang.String r5 = "cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5b
            java.io.File r3 = r7.getCacheDir()
            goto L9e
        L5b:
            java.lang.String r5 = "external-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L68
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            goto L9e
        L68:
            java.lang.String r5 = "external-files-path"
            boolean r5 = r5.equals(r1)
            r6 = 0
            if (r5 == 0) goto L7b
            java.io.File[] r1 = a(r7, r3)
            int r5 = r1.length
            if (r5 <= 0) goto L9e
            r3 = r1[r6]
            goto L9e
        L7b:
            java.lang.String r5 = "external-cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8d
            java.io.File[] r1 = getExternalCacheDirs(r7)
            int r5 = r1.length
            if (r5 <= 0) goto L9e
            r3 = r1[r6]
            goto L9e
        L8d:
            java.lang.String r5 = "external-media-path"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9e
            java.io.File[] r1 = r7.getExternalMediaDirs()
            int r5 = r1.length
            if (r5 <= 0) goto L9e
            r3 = r1[r6]
        L9e:
            if (r3 == 0) goto L1b
            java.lang.String[] r1 = new java.lang.String[]{r4}
            java.io.File r1 = a(r3, r1)
            r0.a(r2, r1)
            goto L1b
        Lad:
            r8.close()
            return r0
        Lb1:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r7.<init>(r8)
            throw r7
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context r0) {
            java.io.File[] r0 = r0.getExternalCacheDirs()
            return r0
    }

    public static android.net.Uri getUriForFile(android.content.Context r1, java.lang.String r2, java.io.File r3) {
            android.net.Uri r0 = android.net.Uri.EMPTY
            com.qq.e.comm.GDTFileProvider$a r1 = b(r1, r2)     // Catch: java.lang.Throwable -> Lb
            android.net.Uri r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            return r0
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r2, android.content.pm.ProviderInfo r3) {
            r1 = this;
            super.attachInfo(r2, r3)
            boolean r0 = r3.exported
            if (r0 != 0) goto L1c
            boolean r0 = r3.grantUriPermissions
            if (r0 == 0) goto L14
            java.lang.String r3 = r3.authority
            com.qq.e.comm.GDTFileProvider$a r2 = b(r2, r3)
            r1.a = r2
            return
        L14:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must grant uri permissions"
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must not be exported"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            com.qq.e.comm.GDTFileProvider$a r2 = r0.a
            java.io.File r1 = r2.a(r1)
            boolean r1 = r1.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r3) {
            r2 = this;
            com.qq.e.comm.GDTFileProvider$a r0 = r2.a
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L27
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L27
            return r3
        L27:
            java.lang.String r3 = "application/octet-stream"
            return r3
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external inserts"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r2, java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            com.qq.e.comm.GDTFileProvider$a r0 = r1.a
            java.io.File r2 = r0.a(r2)
            int r3 = a(r3)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            return r2
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r6, java.lang.String[] r7, java.lang.String r8, java.lang.String[] r9, java.lang.String r10) {
            r5 = this;
            com.qq.e.comm.GDTFileProvider$a r8 = r5.a
            java.io.File r6 = r8.a(r6)
            if (r7 != 0) goto La
            java.lang.String[] r7 = com.qq.e.comm.GDTFileProvider.b
        La:
            int r8 = r7.length
            java.lang.String[] r8 = new java.lang.String[r8]
            int r9 = r7.length
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r10 = r7.length
            r0 = 0
            r1 = 0
        L13:
            if (r0 >= r10) goto L45
            r2 = r7[r0]
            java.lang.String r3 = "_display_name"
            boolean r4 = r3.equals(r2)
            if (r4 == 0) goto L2b
            r8[r1] = r3
            int r2 = r1 + 1
            java.lang.String r3 = r6.getName()
            r9[r1] = r3
        L29:
            r1 = r2
            goto L42
        L2b:
            java.lang.String r3 = "_size"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
            r8[r1] = r3
            int r2 = r1 + 1
            long r3 = r6.length()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r1] = r3
            goto L29
        L42:
            int r0 = r0 + 1
            goto L13
        L45:
            java.lang.String[] r6 = a(r8, r1)
            java.lang.Object[] r7 = a(r9, r1)
            android.database.MatrixCursor r8 = new android.database.MatrixCursor
            r9 = 1
            r8.<init>(r6, r9)
            r8.addRow(r7)
            return r8
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }
}
