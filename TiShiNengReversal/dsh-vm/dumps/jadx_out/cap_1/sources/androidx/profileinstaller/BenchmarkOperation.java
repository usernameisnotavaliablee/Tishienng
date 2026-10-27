package androidx.profileinstaller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class BenchmarkOperation {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(api = 21)
    private static class Api21ContextHelper {
        private Api21ContextHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File getCodeCacheDir(android.content.Context r0) {
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(api = 24)
    private static class Api24ContextHelper {
        private Api24ContextHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File getDeviceProtectedCodeCacheDir(android.content.Context r0) {
                android.content.Context r0 = androidx.profileinstaller.a.a(r0)
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }
    }

    private BenchmarkOperation() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean deleteFilesRecursively(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = 0
            r4 = 1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = deleteFilesRecursively(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    static void dropShaderCache(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.io.File r2 = androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.getDeviceProtectedCodeCacheDir(r2)
            goto L18
        Lb:
            r1 = 23
            if (r0 < r1) goto L14
            java.io.File r2 = androidx.profileinstaller.BenchmarkOperation.Api21ContextHelper.getCodeCacheDir(r2)
            goto L18
        L14:
            java.io.File r2 = r2.getCacheDir()
        L18:
            boolean r2 = deleteFilesRecursively(r2)
            r0 = 0
            if (r2 == 0) goto L25
            r2 = 14
            r3.onResultReceived(r2, r0)
            return
        L25:
            r2 = 15
            r3.onResultReceived(r2, r0)
            return
    }
}
