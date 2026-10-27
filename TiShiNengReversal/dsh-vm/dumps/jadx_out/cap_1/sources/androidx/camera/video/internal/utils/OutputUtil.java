package androidx.camera.video.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OutputUtil {
    private static final java.lang.String TAG = "OutputUtil";

    private OutputUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean createParentFolder(@androidx.annotation.NonNull java.io.File r1) {
            java.io.File r1 = r1.getParentFile()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r1 = r1.isDirectory()
            return r1
        L13:
            boolean r1 = r1.mkdirs()
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r8, @androidx.annotation.NonNull android.net.Uri r9, @androidx.annotation.NonNull java.lang.String r10) {
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L33
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L2f
            if (r8 != 0) goto L16
            if (r8 == 0) goto L15
            r8.close()
        L15:
            return r1
        L16:
            int r9 = r8.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r8.close()
            return r9
        L25:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L58
        L29:
            r0 = move-exception
            r9 = r0
            goto L36
        L2c:
            r0 = move-exception
            r9 = r0
            goto L58
        L2f:
            r0 = move-exception
        L30:
            r9 = r0
            r8 = r1
            goto L36
        L33:
            r0 = move-exception
            r3 = r9
            goto L30
        L36:
            java.lang.String r10 = "OutputUtil"
            java.lang.String r0 = "Failed in getting absolute path for Uri %s with Exception %s"
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L25
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r3[r2] = r9     // Catch: java.lang.Throwable -> L25
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch: java.lang.Throwable -> L25
            androidx.camera.core.Logger.e(r10, r9)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L57
            r8.close()
        L57:
            return r1
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            throw r9
    }
}
