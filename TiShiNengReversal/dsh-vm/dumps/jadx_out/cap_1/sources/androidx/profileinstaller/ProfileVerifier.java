package androidx.profileinstaller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ProfileVerifier {
    private static final java.lang.String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final java.lang.String PROFILE_FILE_NAME = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final java.lang.String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final java.lang.Object SYNC_OBJ = null;
    private static final java.lang.String TAG = "ProfileVerifier";

    @androidx.annotation.Nullable
    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus sCompilationStatus;
    private static final androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> sFuture = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r2, android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
                java.lang.String r3 = r3.getPackageName()
                r0 = 0
                android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int r1, int r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.mSchema = r1
                r0.mResultCode = r2
                r0.mPackageLastUpdateTime = r3
                r0.mInstalledCurrentProfileSize = r5
                return
        }

        static androidx.profileinstaller.ProfileVerifier.Cache readFromFile(@androidx.annotation.NonNull java.io.File r9) throws java.io.IOException {
                java.io.DataInputStream r1 = new java.io.DataInputStream
                java.io.FileInputStream r0 = new java.io.FileInputStream
                r0.<init>(r9)
                r1.<init>(r0)
                androidx.profileinstaller.ProfileVerifier$Cache r2 = new androidx.profileinstaller.ProfileVerifier$Cache     // Catch: java.lang.Throwable -> L23
                int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                long r5 = r1.readLong()     // Catch: java.lang.Throwable -> L23
                long r7 = r1.readLong()     // Catch: java.lang.Throwable -> L23
                r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L23
                r1.close()
                return r2
            L23:
                r0 = move-exception
                r9 = r0
                r1.close()     // Catch: java.lang.Throwable -> L29
                goto L2d
            L29:
                r0 = move-exception
                r9.addSuppressed(r0)
            L2d:
                throw r9
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L2b
                boolean r2 = r8 instanceof androidx.profileinstaller.ProfileVerifier.Cache
                if (r2 != 0) goto Lc
                goto L2b
            Lc:
                androidx.profileinstaller.ProfileVerifier$Cache r8 = (androidx.profileinstaller.ProfileVerifier.Cache) r8
                int r2 = r7.mResultCode
                int r3 = r8.mResultCode
                if (r2 != r3) goto L2b
                long r2 = r7.mPackageLastUpdateTime
                long r4 = r8.mPackageLastUpdateTime
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L2b
                int r2 = r7.mSchema
                int r3 = r8.mSchema
                if (r2 != r3) goto L2b
                long r2 = r7.mInstalledCurrentProfileSize
                long r4 = r8.mInstalledCurrentProfileSize
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L2b
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r6 = this;
                int r0 = r6.mResultCode
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                long r1 = r6.mPackageLastUpdateTime
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                int r2 = r6.mSchema
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                long r3 = r6.mInstalledCurrentProfileSize
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r0
                r0 = 1
                r4[r0] = r1
                r0 = 2
                r4[r0] = r2
                r0 = 3
                r4[r0] = r3
                int r0 = java.util.Objects.hash(r4)
                return r0
        }

        void writeOnFile(@androidx.annotation.NonNull java.io.File r4) throws java.io.IOException {
                r3 = this;
                r4.delete()
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r1.<init>(r4)
                r0.<init>(r1)
                int r4 = r3.mSchema     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                int r4 = r3.mResultCode     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.mPackageLastUpdateTime     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.mInstalledCurrentProfileSize     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                r0.close()
                return
            L25:
                r4 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L2a
                goto L2e
            L2a:
                r0 = move-exception
                r4.addSuppressed(r0)
            L2e:
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface ResultCode {
        }

        CompilationStatus(int r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.mResultCode = r1
                r0.mHasCurrentProfile = r3
                r0.mHasReferenceProfile = r2
                return
        }

        public int getProfileInstallResultCode() {
                r1 = this;
                int r0 = r1.mResultCode
                return r0
        }

        public boolean hasProfileEnqueuedForCompilation() {
                r1 = this;
                boolean r0 = r1.mHasCurrentProfile
                return r0
        }

        public boolean isCompiledWithProfile() {
                r1 = this;
                boolean r0 = r1.mHasReferenceProfile
                return r0
        }
    }

    static {
            androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
            androidx.profileinstaller.ProfileVerifier.sFuture = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.profileinstaller.ProfileVerifier.SYNC_OBJ = r0
            r0 = 0
            androidx.profileinstaller.ProfileVerifier.sCompilationStatus = r0
            return
    }

    private ProfileVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.common.util.concurrent.ListenableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> getCompilationStatusAsync() {
            androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier$CompilationStatus> r0 = androidx.profileinstaller.ProfileVerifier.sFuture
            return r0
    }

    private static long getPackageLastUpdateTime(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = androidx.profileinstaller.ProfileVerifier.Api33Impl.getPackageInfo(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus setCompilationStatus(int r1, boolean r2, boolean r3) {
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = new androidx.profileinstaller.ProfileVerifier$CompilationStatus
            r0.<init>(r1, r2, r3)
            androidx.profileinstaller.ProfileVerifier.sCompilationStatus = r0
            androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier$CompilationStatus> r1 = androidx.profileinstaller.ProfileVerifier.sFuture
            r1.set(r0)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r1 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = 0
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r1 = writeProfileVerification(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @androidx.annotation.WorkerThread
    static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(@androidx.annotation.NonNull android.content.Context r18, boolean r19) {
            if (r19 != 0) goto L7
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r1 = androidx.profileinstaller.ProfileVerifier.SYNC_OBJ
            monitor-enter(r1)
            if (r19 != 0) goto L15
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = move-exception
            goto Le8
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L12
            r2 = 28
            r3 = 0
            if (r0 < r2) goto Le0
            r2 = 30
            if (r0 != r2) goto L22
            goto Le0
        L22:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "/data/misc/profiles/ref/"
            java.lang.String r5 = r18.getPackageName()     // Catch: java.lang.Throwable -> L12
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "primary.prof"
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L12
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L12
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L47
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch: java.lang.Throwable -> L12
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L12
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L12
            long r16 = r8.length()     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L6a
            int r8 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r8 <= 0) goto L6a
            r6 = 1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            long r14 = getPackageLastUpdateTime(r18)     // Catch: java.lang.Throwable -> L12 android.content.pm.PackageManager.NameNotFoundException -> Ld8
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.io.File r8 = r18.getFilesDir()     // Catch: java.lang.Throwable -> L12
            java.lang.String r9 = "profileInstalled"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L12
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L8d
            androidx.profileinstaller.ProfileVerifier$Cache r8 = androidx.profileinstaller.ProfileVerifier.Cache.readFromFile(r7)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L85
            goto L8e
        L85:
            r2 = 131072(0x20000, float:1.83671E-40)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r2, r0, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        L8d:
            r8 = 0
        L8e:
            r9 = 2
            if (r8 == 0) goto L9e
            long r10 = r8.mPackageLastUpdateTime     // Catch: java.lang.Throwable -> L12
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 != 0) goto L9e
            int r10 = r8.mResultCode     // Catch: java.lang.Throwable -> L12
            if (r10 != r9) goto L9c
            goto L9e
        L9c:
            r3 = r10
            goto La5
        L9e:
            if (r0 == 0) goto La2
            r3 = 1
            goto La5
        La2:
            if (r6 == 0) goto La5
            r3 = 2
        La5:
            if (r19 == 0) goto Lac
            if (r6 == 0) goto Lac
            if (r3 == r2) goto Lac
            r3 = 2
        Lac:
            if (r8 == 0) goto Lbd
            int r10 = r8.mResultCode     // Catch: java.lang.Throwable -> L12
            if (r10 != r9) goto Lbd
            if (r3 != r2) goto Lbd
            long r9 = r8.mInstalledCurrentProfileSize     // Catch: java.lang.Throwable -> L12
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 >= 0) goto Lbd
            r3 = 3
            r13 = 3
            goto Lbe
        Lbd:
            r13 = r3
        Lbe:
            androidx.profileinstaller.ProfileVerifier$Cache r11 = new androidx.profileinstaller.ProfileVerifier$Cache     // Catch: java.lang.Throwable -> L12
            r12 = 1
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto Lcc
            boolean r2 = r8.equals(r11)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto Ld2
        Lcc:
            r11.writeOnFile(r7)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> Ld0
            goto Ld2
        Ld0:
            r13 = 196608(0x30000, float:2.75506E-40)
        Ld2:
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r13, r0, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        Ld8:
            r2 = 65536(0x10000, float:9.1835E-41)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r2, r0, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        Le0:
            r0 = 262144(0x40000, float:3.67342E-40)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r0, r3, r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        Le8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}
