package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class FileProvider extends android.content.ContentProvider {
    private static com.bytedance.pangle.FileProvider.j cw;
    private static final java.lang.String[] j = null;
    private static final java.io.File xt = null;

    interface j {
        android.net.Uri j(java.io.File r1);

        java.io.File j(android.net.Uri r1);
    }

    static class xt implements com.bytedance.pangle.FileProvider.j {
        private final java.lang.String j;
        private final java.util.HashMap<java.lang.String, java.io.File> xt;

        xt(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.xt = r0
                r1.j = r2
                return
        }

        @Override // com.bytedance.pangle.FileProvider.j
        public android.net.Uri j(java.io.File r6) {
                r5 = this;
                java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.io.IOException -> Lb6
                java.util.HashMap<java.lang.String, java.io.File> r0 = r5.xt
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
                if (r1 == 0) goto La6
                java.lang.Object r0 = r1.getValue()
                java.io.File r0 = (java.io.File) r0
                java.lang.String r0 = r0.getPath()
                java.lang.String r2 = "/"
                boolean r3 = r0.endsWith(r2)
                if (r3 == 0) goto L60
                int r0 = r0.length()
                java.lang.String r6 = r6.substring(r0)
                goto L6a
            L60:
                int r0 = r0.length()
                int r0 = r0 + 1
                java.lang.String r6 = r6.substring(r0)
            L6a:
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
                java.lang.String r1 = r5.j
                android.net.Uri$Builder r0 = r0.authority(r1)
                android.net.Uri$Builder r6 = r0.encodedPath(r6)
                android.net.Uri r6 = r6.build()
                return r6
            La6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed to find configured root that contains "
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r6 = r1.concat(r6)
                r0.<init>(r6)
                throw r0
            Lb6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed to resolve canonical path for "
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r6 = r1.concat(r6)
                r0.<init>(r6)
                throw r0
        }

        @Override // com.bytedance.pangle.FileProvider.j
        public java.io.File j(android.net.Uri r5) {
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
                java.util.HashMap<java.lang.String, java.io.File> r1 = r4.xt
                java.lang.Object r1 = r1.get(r3)
                java.io.File r1 = (java.io.File) r1
                if (r1 == 0) goto L56
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
                java.lang.String r1 = "Failed to resolve canonical path for "
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r5 = r1.concat(r5)
                r0.<init>(r5)
                throw r0
            L56:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unable to find configured root for "
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r5 = r1.concat(r5)
                r0.<init>(r5)
                throw r0
        }

        void j(java.lang.String r3, java.io.File r4) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L21
                java.io.File r4 = r4.getCanonicalFile()     // Catch: java.io.IOException -> L10
                java.util.HashMap<java.lang.String, java.io.File> r0 = r2.xt
                r0.put(r3, r4)
                return
            L10:
                r3 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed to resolve canonical path for "
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r4 = r1.concat(r4)
                r0.<init>(r4, r3)
                throw r0
            L21:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Name must not be empty"
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.bytedance.pangle.FileProvider.j = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            com.bytedance.pangle.FileProvider.xt = r0
            return
    }

    public FileProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Keep
    public static android.net.Uri getUriForFile(@androidx.annotation.NonNull java.io.File r1) {
            com.bytedance.pangle.FileProvider$j r0 = com.bytedance.pangle.FileProvider.cw
            android.net.Uri r1 = r0.j(r1)
            return r1
    }

    private static int j(java.lang.String r2) {
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            r2 = 268435456(0x10000000, float:2.524355E-29)
            return r2
        Lb:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1c
            goto L4d
        L1c:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            r2 = 704643072(0x2a000000, float:1.1368684E-13)
            return r2
        L27:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            r2 = 939524096(0x38000000, float:3.0517578E-5)
            return r2
        L32:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3d
            r2 = 1006632960(0x3c000000, float:0.0078125)
            return r2
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid mode: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L4d:
            r2 = 738197504(0x2c000000, float:1.8189894E-12)
            return r2
    }

    private static java.io.File j(java.io.File r4, java.lang.String... r5) {
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

    public static void j(com.bytedance.pangle.plugin.Plugin r2, android.content.res.XmlResourceParser r3) {
            java.lang.String r0 = r2.mPkgName     // Catch: java.lang.Throwable -> L14
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.mPkgName     // Catch: java.lang.Throwable -> L14
            android.content.Context r2 = com.bytedance.pangle.transform.ZeusTransformUtils.wrapperContext(r1, r2)     // Catch: java.lang.Throwable -> L14
            com.bytedance.pangle.FileProvider$j r1 = com.bytedance.pangle.FileProvider.cw     // Catch: java.lang.Throwable -> L14
            com.bytedance.pangle.FileProvider$xt r1 = (com.bytedance.pangle.FileProvider.xt) r1     // Catch: java.lang.Throwable -> L14
            j(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r2)
            return
    }

    private static void j(java.lang.String r6, android.content.Context r7, com.bytedance.pangle.FileProvider.xt r8, android.content.res.XmlResourceParser r9) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        L0:
            int r0 = r9.next()
            r1 = 1
            if (r0 == r1) goto L99
            r1 = 2
            if (r0 != r1) goto L0
            java.lang.String r0 = r9.getName()
            java.lang.String r1 = "name"
            r2 = 0
            java.lang.String r1 = r9.getAttributeValue(r2, r1)
            java.lang.String r3 = "path"
            java.lang.String r3 = r9.getAttributeValue(r2, r3)
            java.lang.String r4 = "root-path"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L26
            java.io.File r2 = com.bytedance.pangle.FileProvider.xt
            goto L76
        L26:
            java.lang.String r4 = "files-path"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            java.io.File r2 = r7.getFilesDir()
            goto L76
        L33:
            java.lang.String r4 = "cache-path"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L40
            java.io.File r2 = r7.getCacheDir()
            goto L76
        L40:
            java.lang.String r4 = "external-files-path"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L53
            java.io.File[] r0 = j(r7, r2)
            int r4 = r0.length
            if (r4 <= 0) goto L76
            r2 = r0[r5]
            goto L76
        L53:
            java.lang.String r4 = "external-cache-path"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L65
            java.io.File[] r0 = j(r7)
            int r4 = r0.length
            if (r4 <= 0) goto L76
            r2 = r0[r5]
            goto L76
        L65:
            java.lang.String r4 = "external-media-path"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L76
            java.io.File[] r0 = r7.getExternalMediaDirs()
            int r4 = r0.length
            if (r4 <= 0) goto L76
            r2 = r0[r5]
        L76:
            if (r2 == 0) goto L0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r4 = "_"
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r1 = new java.lang.String[]{r3}
            java.io.File r1 = j(r2, r1)
            r8.j(r0, r1)
            goto L0
        L99:
            return
    }

    @androidx.annotation.NonNull
    public static java.io.File[] j(@androidx.annotation.NonNull android.content.Context r0) {
            java.io.File[] r0 = r0.getExternalCacheDirs()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.io.File[] j(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable java.lang.String r1) {
            java.io.File[] r0 = r0.getExternalFilesDirs(r1)
            return r0
    }

    private static java.lang.Object[] j(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.lang.String[] j(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.pm.ProviderInfo r2) {
            r0 = this;
            super.attachInfo(r1, r2)
            boolean r1 = r2.exported
            if (r1 != 0) goto L29
            boolean r1 = r2.grantUriPermissions
            if (r1 == 0) goto L21
            com.bytedance.pangle.FileProvider$j r1 = com.bytedance.pangle.FileProvider.cw
            if (r1 != 0) goto L19
            com.bytedance.pangle.FileProvider$xt r1 = new com.bytedance.pangle.FileProvider$xt
            java.lang.String r2 = r2.authority
            r1.<init>(r2)
            com.bytedance.pangle.FileProvider.cw = r1
            return
        L19:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "仅允许定义一个FileProvider"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Provider must grant uri permissions"
            r1.<init>(r2)
            throw r1
        L29:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Provider must not be exported"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public int delete(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String[] r3) {
            r0 = this;
            com.bytedance.pangle.FileProvider$j r2 = com.bytedance.pangle.FileProvider.cw
            java.io.File r1 = r2.j(r1)
            boolean r1 = r1.delete()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            com.bytedance.pangle.FileProvider$j r0 = com.bytedance.pangle.FileProvider.cw
            java.io.File r3 = r0.j(r3)
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
    public android.net.Uri insert(@androidx.annotation.NonNull android.net.Uri r1, android.content.ContentValues r2) {
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
    public android.os.ParcelFileDescriptor openFile(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            com.bytedance.pangle.FileProvider$j r0 = com.bytedance.pangle.FileProvider.cw
            java.io.File r2 = r0.j(r2)
            int r3 = j(r3)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            return r2
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r6, @androidx.annotation.Nullable java.lang.String[] r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable java.lang.String[] r9, @androidx.annotation.Nullable java.lang.String r10) {
            r5 = this;
            com.bytedance.pangle.FileProvider$j r8 = com.bytedance.pangle.FileProvider.cw
            java.io.File r6 = r8.j(r6)
            if (r7 != 0) goto La
            java.lang.String[] r7 = com.bytedance.pangle.FileProvider.j
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
            java.lang.String[] r6 = j(r8, r1)
            java.lang.Object[] r7 = j(r9, r1)
            android.database.MatrixCursor r8 = new android.database.MatrixCursor
            r9 = 1
            r8.<init>(r6, r9)
            r8.addRow(r7)
            return r8
    }

    @Override // android.content.ContentProvider
    public int update(@androidx.annotation.NonNull android.net.Uri r1, android.content.ContentValues r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }
}
