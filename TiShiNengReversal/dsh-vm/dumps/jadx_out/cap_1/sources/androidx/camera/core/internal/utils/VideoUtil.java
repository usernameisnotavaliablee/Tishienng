package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class VideoUtil {
    private static final java.lang.String TAG = "VideoUtil";

    private VideoUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r8, @androidx.annotation.NonNull android.net.Uri r9) {
            java.lang.String r0 = "_data"
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L33
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            java.lang.Object r8 = androidx.core.util.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L30
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r8.close()
            return r9
        L25:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L5f
        L29:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L36
        L2d:
            r0 = move-exception
            r9 = r0
            goto L5f
        L30:
            r0 = move-exception
        L31:
            r9 = r0
            goto L36
        L33:
            r0 = move-exception
            r3 = r9
            goto L31
        L36:
            java.lang.String r8 = "VideoUtil"
            java.lang.String r0 = "Failed in getting absolute path for Uri %s with Exception %s"
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2d
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> L5c
            r2 = 1
            r3[r2] = r9     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch: java.lang.Throwable -> L2d
            androidx.camera.core.Logger.e(r8, r9)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = ""
            if (r1 == 0) goto L59
            r1.close()
        L59:
            return r8
        L5a:
            r9 = r8
            goto L5f
        L5c:
            r0 = move-exception
            r8 = r0
            goto L5a
        L5f:
            if (r1 == 0) goto L64
            r1.close()
        L64:
            throw r9
    }
}
