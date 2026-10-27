package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MMKVContentProvider extends android.content.ContentProvider {
    protected static final java.lang.String FUNCTION_NAME = "mmkvFromAshmemID";
    protected static final java.lang.String KEY = "KEY";
    protected static final java.lang.String KEY_CRYPT = "KEY_CRYPT";
    protected static final java.lang.String KEY_MODE = "KEY_MODE";
    protected static final java.lang.String KEY_SIZE = "KEY_SIZE";
    private static android.net.Uri gUri;

    public MMKVContentProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    protected static android.net.Uri contentUri(android.content.Context r2) {
            android.net.Uri r0 = com.tencent.mmkv.MMKVContentProvider.gUri
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            if (r2 != 0) goto L9
            return r0
        L9:
            java.lang.String r2 = queryAuthority(r2)
            if (r2 != 0) goto L10
            return r0
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "content://"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.tencent.mmkv.MMKVContentProvider.gUri = r2
            return r2
    }

    protected static java.lang.String getProcessNameByPID(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            int r0 = android.os.Process.myPid()
            if (r3 != r0) goto Lb
            java.lang.String r2 = com.tencent.mmkv.MMKVProcessUtil.getCurrentProcessName(r2)
            return r2
        Lb:
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            if (r2 == 0) goto L30
            java.util.List r2 = r2.getRunningAppProcesses()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0
            int r1 = r0.pid
            if (r1 != r3) goto L1d
            java.lang.String r2 = r0.processName
            return r2
        L30:
            java.lang.String r2 = ""
            return r2
    }

    @androidx.annotation.NonNull
    private android.os.Bundle mmkvFromAshmemID(java.lang.String r2, int r3, int r4, java.lang.String r5) throws java.lang.RuntimeException {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.tencent.mmkv.MMKV r2 = com.tencent.mmkv.MMKV.mmkvWithAshmemID(r0, r2, r3, r4, r5)
            com.tencent.mmkv.ParcelableMMKV r3 = new com.tencent.mmkv.ParcelableMMKV
            r3.<init>(r2)
            r2.ashmemFD()
            r2.ashmemMetaFD()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "KEY"
            r2.putParcelable(r4, r3)
            return r2
    }

    @androidx.annotation.Nullable
    private static java.lang.String queryAuthority(android.content.Context r2) {
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Exception -> L1b
            java.lang.Class<com.tencent.mmkv.MMKVContentProvider> r1 = com.tencent.mmkv.MMKVContentProvider.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L1b
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L1b
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L1b
            r1 = 0
            android.content.pm.ProviderInfo r2 = r2.getProviderInfo(r0, r1)     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L1b
            java.lang.String r2 = r2.authority     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            r2 = 0
            return r2
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public android.os.Bundle call(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable android.os.Bundle r6) {
            r3 = this;
            java.lang.String r0 = "mmkvFromAshmemID"
            boolean r4 = r4.equals(r0)
            r0 = 0
            if (r4 == 0) goto L26
            if (r6 == 0) goto L26
            java.lang.String r4 = "KEY_SIZE"
            int r4 = r6.getInt(r4)
            java.lang.String r1 = "KEY_MODE"
            int r1 = r6.getInt(r1)
            java.lang.String r2 = "KEY_CRYPT"
            java.lang.String r6 = r6.getString(r2)
            android.os.Bundle r4 = r3.mmkvFromAshmemID(r5, r4, r1, r6)     // Catch: java.lang.Exception -> L22
            return r4
        L22:
            r4 = move-exception
            r4.getMessage()
        L26:
            return r0
    }

    @Override // android.content.ContentProvider
    public int delete(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String[] r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Not implement in MMKV"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public android.net.Uri insert(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Not implement in MMKV"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String[] r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4, @androidx.annotation.Nullable java.lang.String r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Not implement in MMKV"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public int update(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.content.ContentValues r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Not implement in MMKV"
            r1.<init>(r2)
            throw r1
    }
}
