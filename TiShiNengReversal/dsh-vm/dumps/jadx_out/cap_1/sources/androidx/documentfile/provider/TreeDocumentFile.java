package androidx.documentfile.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class TreeDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context mContext;
    private android.net.Uri mUri;

    TreeDocumentFile(@androidx.annotation.Nullable androidx.documentfile.provider.DocumentFile r1, android.content.Context r2, android.net.Uri r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mContext = r2
            r0.mUri = r3
            return
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

    @androidx.annotation.Nullable
    private static android.net.Uri createFile(android.content.Context r0, android.net.Uri r1, java.lang.String r2, java.lang.String r3) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L9
            android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canRead(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canWrite(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @androidx.annotation.Nullable
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.net.Uri r1 = r3.mUri
            java.lang.String r2 = "vnd.android.document/directory"
            android.net.Uri r4 = createFile(r0, r1, r2, r4)
            if (r4 == 0) goto L15
            androidx.documentfile.provider.TreeDocumentFile r0 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r1 = r3.mContext
            r0.<init>(r3, r1, r4)
            return r0
        L15:
            r4 = 0
            return r4
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @androidx.annotation.Nullable
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            android.net.Uri r3 = createFile(r0, r1, r3, r4)
            if (r3 == 0) goto L12
            androidx.documentfile.provider.TreeDocumentFile r4 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r0 = r2.mContext
            r4.<init>(r2, r0, r3)
            return r4
        L12:
            r3 = 0
            return r3
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> Ld
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Ld
            android.net.Uri r1 = r2.mUri     // Catch: java.lang.Exception -> Ld
            boolean r0 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.exists(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @androidx.annotation.Nullable
    public java.lang.String getName() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getName(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @androidx.annotation.Nullable
    public java.lang.String getType() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getType(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isDirectory(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isFile(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isVirtual(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.lastModified(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.length(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
            r10 = this;
            android.content.Context r0 = r10.mContext
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r0 = r10.mUri
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r2 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r9 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r5 = 0
            r6 = 0
            r4 = 0
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
        L24:
            boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r0 == 0) goto L3c
            java.lang.String r0 = r9.getString(r8)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            android.net.Uri r1 = r10.mUri     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r7.add(r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            goto L24
        L38:
            r0 = move-exception
            goto L65
        L3a:
            r0 = move-exception
            goto L40
        L3c:
            closeQuietly(r9)
            goto L44
        L40:
            r0.toString()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L44:
            int r0 = r7.size()
            android.net.Uri[] r0 = new android.net.Uri[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            int r1 = r0.length
            androidx.documentfile.provider.DocumentFile[] r1 = new androidx.documentfile.provider.DocumentFile[r1]
        L53:
            int r2 = r0.length
            if (r8 >= r2) goto L64
            androidx.documentfile.provider.TreeDocumentFile r2 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r3 = r10.mContext
            r4 = r0[r8]
            r2.<init>(r10, r3, r4)
            r1[r8] = r2
            int r8 = r8 + 1
            goto L53
        L64:
            return r1
        L65:
            closeQuietly(r9)
            throw r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String r4) {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Exception -> L13
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L13
            android.net.Uri r2 = r3.mUri     // Catch: java.lang.Exception -> L13
            android.net.Uri r4 = android.provider.DocumentsContract.renameDocument(r1, r2, r4)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L13
            r3.mUri = r4     // Catch: java.lang.Exception -> L13
            r4 = 1
            return r4
        L13:
            return r0
    }
}
