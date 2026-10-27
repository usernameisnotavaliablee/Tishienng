package xyz.adscope.common.imageloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StorageUtils {
    public StorageUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.File getCacheDirectory(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L16
            boolean r1 = android.os.Environment.isExternalStorageRemovable()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1a
        L16:
            java.io.File r0 = r3.getExternalCacheDir()     // Catch: java.lang.Throwable -> L22
        L1a:
            if (r0 != 0) goto L21
            java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Throwable -> L22
            return r3
        L21:
            return r0
        L22:
            java.io.File r3 = r3.getCacheDir()
            return r3
    }

    public static java.io.File getFilesCacheDirectory(android.content.Context r2, java.lang.String r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Le
            java.io.File r1 = r2.getFilesDir()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            r0.<init>(r2, r3)
            return r0
    }

    public static java.io.File getFilesDirectory(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L16
            boolean r1 = android.os.Environment.isExternalStorageRemovable()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1a
        L16:
            java.io.File r0 = r3.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            if (r0 != 0) goto L21
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L22
            return r3
        L21:
            return r0
        L22:
            java.io.File r3 = r3.getFilesDir()
            return r3
    }
}
