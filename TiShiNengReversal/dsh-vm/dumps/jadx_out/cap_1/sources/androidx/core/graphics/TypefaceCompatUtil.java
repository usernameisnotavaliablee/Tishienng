package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TypefaceCompatUtil {
    private static final java.lang.String CACHE_FILE_PREFIX = ".font";
    private static final java.lang.String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(@androidx.annotation.Nullable java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    @androidx.annotation.Nullable
    public static java.nio.ByteBuffer copyToDirectBuffer(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.res.Resources r2, int r3) {
            java.io.File r1 = getTempFile(r1)
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            boolean r2 = copyToFile(r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L12
            r1.delete()
            return r0
        L12:
            java.nio.ByteBuffer r2 = mmap(r1)     // Catch: java.lang.Throwable -> L1a
            r1.delete()
            return r2
        L1a:
            r2 = move-exception
            r1.delete()
            throw r2
    }

    public static boolean copyToFile(@androidx.annotation.NonNull java.io.File r0, @androidx.annotation.NonNull android.content.res.Resources r1, int r2) {
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Throwable -> Le
            boolean r0 = copyToFile(r0, r1)     // Catch: java.lang.Throwable -> Lc
            closeQuietly(r1)
            return r0
        Lc:
            r0 = move-exception
            goto L10
        Le:
            r0 = move-exception
            r1 = 0
        L10:
            closeQuietly(r1)
            throw r0
    }

    public static boolean copyToFile(@androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull java.io.InputStream r6) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
        Lf:
            int r2 = r6.read(r5)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            r4 = -1
            if (r2 == r4) goto L20
            r3.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            goto Lf
        L1a:
            r5 = move-exception
            r2 = r3
            goto L35
        L1d:
            r5 = move-exception
            r2 = r3
            goto L2b
        L20:
            closeQuietly(r3)
            android.os.StrictMode.setThreadPolicy(r0)
            r5 = 1
            return r5
        L28:
            r5 = move-exception
            goto L35
        L2a:
            r5 = move-exception
        L2b:
            r5.getMessage()     // Catch: java.lang.Throwable -> L28
            closeQuietly(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L35:
            closeQuietly(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
    }

    @androidx.annotation.Nullable
    public static java.io.File getTempFile(@androidx.annotation.NonNull android.content.Context r5) {
            java.io.File r5 = r5.getCacheDir()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".font"
            r1.append(r2)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            int r3 = android.os.Process.myTid()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L2d:
            r3 = 100
            if (r2 >= r3) goto L4f
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r5, r4)
            boolean r4 = r3.createNewFile()     // Catch: java.io.IOException -> L4c
            if (r4 == 0) goto L4c
            return r3
        L4c:
            int r2 = r2 + 1
            goto L2d
        L4f:
            return r0
    }

    @androidx.annotation.Nullable
    public static java.nio.ByteBuffer mmap(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.os.CancellationSignal r9, @androidx.annotation.NonNull android.net.Uri r10) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r10, r0, r9)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L12
            r8.close()     // Catch: java.io.IOException -> L4c
        L12:
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r10 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r10 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r10
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r10     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }

    @androidx.annotation.Nullable
    private static java.nio.ByteBuffer mmap(java.io.File r8) {
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r8)     // Catch: java.io.IOException -> L24
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L19
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L19
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L19
            r4 = 0
            java.nio.MappedByteBuffer r8 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L19
            r1.close()     // Catch: java.io.IOException -> L24
            return r8
        L19:
            r0 = move-exception
            r8 = r0
            r1.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.io.IOException -> L24
        L23:
            throw r8     // Catch: java.io.IOException -> L24
        L24:
            r8 = 0
            return r8
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> readFontInfoIntoByteBuffer(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r6, @androidx.annotation.Nullable android.os.CancellationSignal r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            int r4 = r3.getResultCode()
            if (r4 == 0) goto L12
            goto L24
        L12:
            android.net.Uri r3 = r3.getUri()
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L1d
            goto L24
        L1d:
            java.nio.ByteBuffer r4 = mmap(r5, r7, r3)
            r0.put(r3, r4)
        L24:
            int r2 = r2 + 1
            goto L7
        L27:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            return r5
    }
}
