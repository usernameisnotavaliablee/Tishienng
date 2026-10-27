package androidx.profileinstaller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DeviceProfileWriter {

    @androidx.annotation.NonNull
    private final java.lang.String mApkName;

    @androidx.annotation.NonNull
    private final android.content.res.AssetManager mAssetManager;

    @androidx.annotation.NonNull
    private final java.io.File mCurProfile;

    @androidx.annotation.Nullable
    private final byte[] mDesiredVersion;
    private boolean mDeviceSupportsAotProfile;

    @androidx.annotation.NonNull
    private final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback mDiagnostics;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.Nullable
    private androidx.profileinstaller.DexProfileData[] mProfile;

    @androidx.annotation.NonNull
    private final java.lang.String mProfileMetaSourceLocation;

    @androidx.annotation.NonNull
    private final java.lang.String mProfileSourceLocation;

    @androidx.annotation.Nullable
    private byte[] mTranscodedProfile;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@androidx.annotation.NonNull android.content.res.AssetManager r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull java.io.File r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDeviceSupportsAotProfile = r0
            r1.mAssetManager = r2
            r1.mExecutor = r3
            r1.mDiagnostics = r4
            r1.mApkName = r5
            r1.mProfileSourceLocation = r6
            r1.mProfileMetaSourceLocation = r7
            r1.mCurProfile = r8
            byte[] r2 = desiredVersion()
            r1.mDesiredVersion = r2
            return
    }

    public static /* synthetic */ void a(androidx.profileinstaller.DeviceProfileWriter r0, int r1, java.lang.Object r2) {
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r0.mDiagnostics
            r0.onResultReceived(r1, r2)
            return
    }

    @androidx.annotation.Nullable
    private androidx.profileinstaller.DeviceProfileWriter addMetadata(androidx.profileinstaller.DexProfileData[] r4, byte[] r5) {
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r3.mAssetManager     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            java.lang.String r2 = r3.mProfileMetaSourceLocation     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            java.io.InputStream r1 = r3.openStreamFromAssets(r1, r2)     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            if (r1 == 0) goto L2b
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROFM     // Catch: java.lang.Throwable -> L21
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.readHeader(r1, r2)     // Catch: java.lang.Throwable -> L21
            androidx.profileinstaller.DexProfileData[] r4 = androidx.profileinstaller.ProfileTranscoder.readMeta(r1, r2, r5, r4)     // Catch: java.lang.Throwable -> L21
            r3.mProfile = r4     // Catch: java.lang.Throwable -> L21
            r1.close()     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            return r3
        L1b:
            r4 = move-exception
            goto L31
        L1d:
            r4 = move-exception
            goto L3b
        L1f:
            r4 = move-exception
            goto L42
        L21:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
        L2a:
            throw r4     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
        L2b:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            goto L49
        L31:
            r3.mProfile = r0
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r3.mDiagnostics
            r1 = 8
            r5.onResultReceived(r1, r4)
            goto L49
        L3b:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r3.mDiagnostics
            r1 = 7
            r5.onResultReceived(r1, r4)
            goto L49
        L42:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r3.mDiagnostics
            r1 = 9
            r5.onResultReceived(r1, r4)
        L49:
            return r0
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
            r2 = this;
            boolean r0 = r2.mDeviceSupportsAotProfile
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    private static byte[] desiredVersion() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 0
            if (r0 < r1) goto L1f
            r1 = 33
            if (r0 <= r1) goto Lc
            goto L1f
        Lc:
            switch(r0) {
                case 24: goto L1c;
                case 25: goto L1c;
                case 26: goto L19;
                case 27: goto L16;
                case 28: goto L13;
                case 29: goto L13;
                case 30: goto L13;
                case 31: goto L10;
                case 32: goto L10;
                case 33: goto L10;
                default: goto Lf;
            }
        Lf:
            return r2
        L10:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            return r0
        L13:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            return r0
        L16:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            return r0
        L19:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V005_O
            return r0
        L1c:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V001_N
            return r0
        L1f:
            return r2
    }

    @androidx.annotation.Nullable
    private java.io.InputStream getProfileInputStream(android.content.res.AssetManager r3) {
            r2 = this;
            java.lang.String r0 = r2.mProfileSourceLocation     // Catch: java.io.IOException -> L7 java.io.FileNotFoundException -> L9
            java.io.InputStream r3 = r2.openStreamFromAssets(r3, r0)     // Catch: java.io.IOException -> L7 java.io.FileNotFoundException -> L9
            return r3
        L7:
            r3 = move-exception
            goto Lb
        L9:
            r3 = move-exception
            goto L12
        Lb:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r2.mDiagnostics
            r1 = 7
            r0.onResultReceived(r1, r3)
            goto L18
        L12:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r2.mDiagnostics
            r1 = 6
            r0.onResultReceived(r1, r3)
        L18:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private java.io.InputStream openStreamFromAssets(android.content.res.AssetManager r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            android.content.res.AssetFileDescriptor r2 = r2.openFd(r3)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r2 = r2.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 0
            if (r2 == 0) goto L1f
            java.lang.String r0 = "compressed"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1f
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r1.mDiagnostics
            r0 = 5
            r2.onDiagnosticReceived(r0, r3)
        L1f:
            return r3
    }

    @androidx.annotation.Nullable
    private androidx.profileinstaller.DexProfileData[] readProfileInternal(java.io.InputStream r5) {
            r4 = this;
            r0 = 7
            byte[] r1 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            byte[] r1 = androidx.profileinstaller.ProfileTranscoder.readHeader(r5, r1)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            java.lang.String r2 = r4.mApkName     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            androidx.profileinstaller.DexProfileData[] r1 = androidx.profileinstaller.ProfileTranscoder.readProfile(r5, r1, r2)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            r5.close()     // Catch: java.io.IOException -> L11
            goto L37
        L11:
            r5 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r2.onResultReceived(r0, r5)
            goto L37
        L18:
            r1 = move-exception
            goto L38
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r1 = move-exception
            goto L30
        L1e:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics     // Catch: java.lang.Throwable -> L18
            r3 = 8
            r2.onResultReceived(r3, r1)     // Catch: java.lang.Throwable -> L18
        L25:
            r5.close()     // Catch: java.io.IOException -> L29
            goto L36
        L29:
            r5 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = r4.mDiagnostics
            r1.onResultReceived(r0, r5)
            goto L36
        L30:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics     // Catch: java.lang.Throwable -> L18
            r2.onResultReceived(r0, r1)     // Catch: java.lang.Throwable -> L18
            goto L25
        L36:
            r1 = 0
        L37:
            return r1
        L38:
            r5.close()     // Catch: java.io.IOException -> L3c
            goto L42
        L3c:
            r5 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r2.onResultReceived(r0, r5)
        L42:
            throw r1
    }

    private static boolean requiresMetadata() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 < r2) goto L18
            r3 = 33
            if (r0 <= r3) goto Lc
            goto L18
        Lc:
            r3 = 1
            if (r0 == r2) goto L17
            r2 = 25
            if (r0 == r2) goto L17
            switch(r0) {
                case 31: goto L17;
                case 32: goto L17;
                case 33: goto L17;
                default: goto L16;
            }
        L16:
            return r1
        L17:
            return r3
        L18:
            return r1
    }

    private void result(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.profileinstaller.b r1 = new androidx.profileinstaller.b
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
            r3 = this;
            byte[] r0 = r3.mDesiredVersion
            r1 = 0
            if (r0 != 0) goto L10
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r3.result(r2, r0)
            return r1
        L10:
            java.io.File r0 = r3.mCurProfile
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L1e
            r0 = 4
            r2 = 0
            r3.result(r0, r2)
            return r1
        L1e:
            r0 = 1
            r3.mDeviceSupportsAotProfile = r0
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.profileinstaller.DeviceProfileWriter read() {
            r2 = this;
            r2.assertDeviceAllowsProfileInstallerAotWritesCalled()
            byte[] r0 = r2.mDesiredVersion
            if (r0 != 0) goto L8
            goto L29
        L8:
            android.content.res.AssetManager r0 = r2.mAssetManager
            java.io.InputStream r0 = r2.getProfileInputStream(r0)
            if (r0 == 0) goto L16
            androidx.profileinstaller.DexProfileData[] r0 = r2.readProfileInternal(r0)
            r2.mProfile = r0
        L16:
            androidx.profileinstaller.DexProfileData[] r0 = r2.mProfile
            if (r0 == 0) goto L29
            boolean r1 = requiresMetadata()
            if (r1 == 0) goto L29
            byte[] r1 = r2.mDesiredVersion
            androidx.profileinstaller.DeviceProfileWriter r0 = r2.addMetadata(r0, r1)
            if (r0 == 0) goto L29
            return r0
        L29:
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.profileinstaller.DeviceProfileWriter transcodeIfNeeded() {
            r4 = this;
            androidx.profileinstaller.DexProfileData[] r0 = r4.mProfile
            byte[] r1 = r4.mDesiredVersion
            if (r0 == 0) goto L50
            if (r1 != 0) goto L9
            goto L50
        L9:
            r4.assertDeviceAllowsProfileInstallerAotWritesCalled()
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            androidx.profileinstaller.ProfileTranscoder.writeHeader(r3, r1)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = androidx.profileinstaller.ProfileTranscoder.transcodeAndWriteBody(r3, r1, r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2d
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r4.mDiagnostics     // Catch: java.lang.Throwable -> L2b
            r1 = 5
            r0.onResultReceived(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r4.mProfile = r2     // Catch: java.lang.Throwable -> L2b
            r3.close()     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            return r4
        L27:
            r0 = move-exception
            goto L40
        L29:
            r0 = move-exception
            goto L48
        L2b:
            r0 = move-exception
            goto L37
        L2d:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L2b
            r4.mTranscodedProfile = r0     // Catch: java.lang.Throwable -> L2b
            r3.close()     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            goto L4e
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
        L3f:
            throw r0     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
        L40:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = r4.mDiagnostics
            r3 = 8
            r1.onResultReceived(r3, r0)
            goto L4e
        L48:
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = r4.mDiagnostics
            r3 = 7
            r1.onResultReceived(r3, r0)
        L4e:
            r4.mProfile = r2
        L50:
            return r4
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean write() {
            r5 = this;
            byte[] r0 = r5.mTranscodedProfile
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r5.assertDeviceAllowsProfileInstallerAotWritesCalled()
            r2 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
            java.io.File r4 = r5.mCurProfile     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            androidx.profileinstaller.Encoding.writeAll(r3, r0)     // Catch: java.lang.Throwable -> L30
            r4 = 1
            r5.result(r4, r2)     // Catch: java.lang.Throwable -> L30
            r0.close()     // Catch: java.lang.Throwable -> L2e
            r3.close()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
            r5.mTranscodedProfile = r2
            r5.mProfile = r2
            return r4
        L28:
            r0 = move-exception
            goto L52
        L2a:
            r0 = move-exception
            goto L43
        L2c:
            r0 = move-exception
            goto L4c
        L2e:
            r0 = move-exception
            goto L3a
        L30:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2e
        L39:
            throw r4     // Catch: java.lang.Throwable -> L2e
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
        L42:
            throw r0     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
        L43:
            r3 = 7
            r5.result(r3, r0)     // Catch: java.lang.Throwable -> L28
        L47:
            r5.mTranscodedProfile = r2
            r5.mProfile = r2
            goto L51
        L4c:
            r3 = 6
            r5.result(r3, r0)     // Catch: java.lang.Throwable -> L28
            goto L47
        L51:
            return r1
        L52:
            r5.mTranscodedProfile = r2
            r5.mProfile = r2
            throw r0
    }
}
