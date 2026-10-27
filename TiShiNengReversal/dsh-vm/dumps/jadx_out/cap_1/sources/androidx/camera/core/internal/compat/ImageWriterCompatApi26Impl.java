package androidx.camera.core.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageWriterCompatApi26Impl {
    private static final java.lang.String TAG = "ImageWriterCompatApi26";
    private static java.lang.reflect.Method sNewInstanceMethod;

    static {
            java.lang.Class<android.media.ImageWriter> r0 = android.media.ImageWriter.class
            java.lang.String r1 = "newInstance"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.Class<android.view.Surface> r3 = android.view.Surface.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L1a
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1a
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl.sNewInstanceMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1a
        L1a:
            return
    }

    private ImageWriterCompatApi26Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static android.media.ImageWriter newInstance(@androidx.annotation.NonNull android.view.Surface r4, @androidx.annotation.IntRange(from = 1) int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L2d
            java.lang.reflect.Method r0 = androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl.sNewInstanceMethod     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2b
            r3 = 0
            r1[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2b
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2b
            r4 = 2
            r1[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2b
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L2b
            java.lang.Object r4 = androidx.core.util.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L2b
            android.media.ImageWriter r4 = (android.media.ImageWriter) r4     // Catch: java.lang.Throwable -> L2b java.lang.Throwable -> L2b
            return r4
        L28:
            r4 = move-exception
        L29:
            r2 = r4
            goto L2d
        L2b:
            r4 = move-exception
            goto L29
        L2d:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Unable to invoke newInstance(Surface, int, int) via reflection."
            r4.<init>(r5, r2)
            throw r4
    }
}
