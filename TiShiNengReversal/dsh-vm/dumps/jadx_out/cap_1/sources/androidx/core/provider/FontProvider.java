package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface ContentQueryWrapper {
        void close();

        android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, android.os.CancellationSignal r6);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ContentQueryWrapperApi16Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi16Impl(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                android.content.ContentResolver r1 = r1.getContentResolver()
                android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)
                r0.mClient = r1
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.mClient
                if (r0 == 0) goto L7
                r0.release()
            L7:
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, android.os.CancellationSignal r14) {
                r8 = this;
                android.content.ContentProviderClient r0 = r8.mClient
                r7 = 0
                if (r0 != 0) goto L6
                return r7
            L6:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L11
                return r9
            L11:
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class ContentQueryWrapperApi24Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi24Impl(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                android.content.ContentResolver r1 = r1.getContentResolver()
                android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)
                r0.mClient = r1
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.mClient
                if (r0 == 0) goto L7
                androidx.core.provider.c.a(r0)
            L7:
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, android.os.CancellationSignal r14) {
                r8 = this;
                android.content.ContentProviderClient r0 = r8.mClient
                r7 = 0
                if (r0 != 0) goto L6
                return r7
            L6:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L11
                return r9
            L11:
                return r7
        }
    }

    static {
            androidx.core.provider.a r0 = new androidx.core.provider.a
            r0.<init>()
            androidx.core.provider.FontProvider.sByteArrayComparator = r0
            return
    }

    private FontProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int a(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L8
            int r4 = r4.length
            int r5 = r5.length
            int r4 = r4 - r5
            return r4
        L8:
            r0 = 0
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L18
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L15
            int r2 = r2 - r3
            return r2
        L15:
            int r1 = r1 + 1
            goto La
        L18:
            return r0
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            byte[] r3 = r3.toByteArray()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r4 = 1
            return r4
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.getCertificates()
            if (r0 == 0) goto Lb
            java.util.List r1 = r1.getCertificates()
            return r1
        Lb:
            int r1 = r1.getCertificatesArrayResId()
            java.util.List r1 = androidx.core.content.res.FontResourcesParserCompat.readCerts(r2, r1)
            return r1
    }

    @androidx.annotation.NonNull
    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.provider.FontRequest r3, @androidx.annotation.Nullable android.os.CancellationSignal r4) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.res.Resources r1 = r2.getResources()
            android.content.pm.ProviderInfo r0 = getProvider(r0, r3, r1)
            if (r0 != 0) goto L15
            r2 = 1
            r3 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r2, r3)
            return r2
        L15:
            java.lang.String r0 = r0.authority
            androidx.core.provider.FontsContractCompat$FontInfo[] r2 = query(r2, r3, r0, r4)
            r3 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r3, r2)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    static android.content.pm.ProviderInfo getProvider(@androidx.annotation.NonNull android.content.pm.PackageManager r5, @androidx.annotation.NonNull androidx.core.provider.FontRequest r6, @androidx.annotation.Nullable android.content.res.Resources r7) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = r6.getProviderAuthority()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L73
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.getProviderPackage()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L50
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = convertToByteArrayList(r5)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = getCertificates(r6, r7)
        L2e:
            int r7 = r6.size()
            if (r1 >= r7) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r7, r0)
            boolean r7 = equalsByteArrayList(r5, r7)
            if (r7 == 0) goto L4b
            return r2
        L4b:
            int r1 = r1 + 1
            goto L2e
        L4e:
            r5 = 0
            return r5
        L50:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Found content provider "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = ", but package was not "
            r7.append(r0)
            java.lang.String r6 = r6.getProviderPackage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L73:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No package found for authority: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context r16, androidx.core.provider.FontRequest r17, java.lang.String r18, android.os.CancellationSignal r19) {
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r5 = r2.build()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r0 = r2.authority(r0)
            java.lang.String r2 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r2)
            android.net.Uri r0 = r0.build()
            r2 = r16
            androidx.core.provider.FontProvider$ContentQueryWrapper r4 = androidx.core.provider.b.a(r2, r5)
            r2 = 0
            java.lang.String r6 = "_id"
            java.lang.String r7 = "file_id"
            java.lang.String r8 = "font_ttc_index"
            java.lang.String r9 = "font_variation_settings"
            java.lang.String r10 = "font_weight"
            java.lang.String r11 = "font_italic"
            java.lang.String r12 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = "query = ?"
            java.lang.String r3 = r17.getQuery()     // Catch: java.lang.Throwable -> L9a
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L9a
            r9 = 0
            r10 = r19
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto Le2
            int r6 = r2.getCount()     // Catch: java.lang.Throwable -> L9a
            if (r6 <= 0) goto Le2
            java.lang.String r1 = "result_code"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            r6.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = "_id"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = "file_id"
            int r8 = r2.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = "font_ttc_index"
            int r9 = r2.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r10 = "font_weight"
            int r10 = r2.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r11 = "font_italic"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L9a
        L8c:
            boolean r12 = r2.moveToNext()     // Catch: java.lang.Throwable -> L9a
            if (r12 == 0) goto Lde
            r12 = -1
            if (r1 == r12) goto L9e
            int r13 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L9a
            goto L9f
        L9a:
            r0 = move-exception
            r16 = r4
            goto Lf6
        L9e:
            r13 = 0
        L9f:
            if (r9 == r12) goto La6
            int r14 = r2.getInt(r9)     // Catch: java.lang.Throwable -> L9a
            goto La7
        La6:
            r14 = 0
        La7:
            if (r8 != r12) goto Lb6
            r16 = r4
            long r3 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb4
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r5, r3)     // Catch: java.lang.Throwable -> Lb4
            goto Lc0
        Lb4:
            r0 = move-exception
            goto Lf6
        Lb6:
            r16 = r4
            long r3 = r2.getLong(r8)     // Catch: java.lang.Throwable -> Lb4
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r0, r3)     // Catch: java.lang.Throwable -> Lb4
        Lc0:
            if (r10 == r12) goto Lc7
            int r4 = r2.getInt(r10)     // Catch: java.lang.Throwable -> Lb4
            goto Lc9
        Lc7:
            r4 = 400(0x190, float:5.6E-43)
        Lc9:
            if (r11 == r12) goto Ld3
            int r12 = r2.getInt(r11)     // Catch: java.lang.Throwable -> Lb4
            r15 = 1
            if (r12 != r15) goto Ld3
            goto Ld4
        Ld3:
            r15 = 0
        Ld4:
            androidx.core.provider.FontsContractCompat$FontInfo r3 = androidx.core.provider.FontsContractCompat.FontInfo.create(r3, r14, r4, r15, r13)     // Catch: java.lang.Throwable -> Lb4
            r6.add(r3)     // Catch: java.lang.Throwable -> Lb4
            r4 = r16
            goto L8c
        Lde:
            r16 = r4
            r1 = r6
            goto Le4
        Le2:
            r16 = r4
        Le4:
            if (r2 == 0) goto Le9
            r2.close()
        Le9:
            r16.close()
            r0 = 0
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            return r0
        Lf6:
            if (r2 == 0) goto Lfb
            r2.close()
        Lfb:
            r16.close()
            throw r0
    }
}
