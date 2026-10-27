package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CreateFileUtil {
    private static final java.lang.String a = "CreateFileUtil";
    private static final java.lang.String b = "com.huawei.libcore.io.ExternalStorageFile";
    private static final java.lang.String c = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final java.lang.String d = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final java.lang.String e = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final char[] f = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.huawei.hms.framework.common.CreateFileUtil.f = r0
            return
    }

    public CreateFileUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String byteArrayToHex(byte[] r8) {
            int r0 = r8.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L8:
            if (r2 >= r1) goto L23
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = com.huawei.hms.framework.common.CreateFileUtil.f
            int r7 = r4 >>> 4
            r7 = r7 & 15
            char r7 = r6[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto L8
        L23:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    public static void deleteSecure(java.io.File r1) {
            if (r1 == 0) goto L15
            boolean r0 = r1.exists()
            if (r0 == 0) goto L15
            boolean r1 = r1.delete()
            if (r1 != 0) goto L15
            java.lang.String r1 = "CreateFileUtil"
            java.lang.String r0 = "deleteSecure exception"
            com.huawei.hms.framework.common.Logger.w(r1, r0)
        L15:
            return
    }

    public static void deleteSecure(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Ld
            java.io.File r1 = newFile(r1)
            deleteSecure(r1)
        Ld:
            return
    }

    public static java.lang.String getCacheDirPath(android.content.Context r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            android.content.Context r0 = com.huawei.hms.framework.common.ContextCompat.getProtectedStorageContext(r0)
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public static java.lang.String getCanonicalPath(java.lang.String r3) {
            java.lang.String r0 = "CreateFileUtil"
            java.io.File r1 = newFile(r3)     // Catch: java.lang.Exception -> Lb java.lang.SecurityException -> Ld java.io.IOException -> Lf
            java.lang.String r3 = r1.getCanonicalPath()     // Catch: java.lang.Exception -> Lb java.lang.SecurityException -> Ld java.io.IOException -> Lf
            return r3
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            r1 = move-exception
            goto L17
        Lf:
            r1 = move-exception
            goto L1d
        L11:
            java.lang.String r2 = "the canonicalPath has other Exception"
            com.huawei.hms.framework.common.Logger.w(r0, r2, r1)
            goto L22
        L17:
            java.lang.String r2 = "the canonicalPath has securityException"
            com.huawei.hms.framework.common.Logger.w(r0, r2, r1)
            goto L22
        L1d:
            java.lang.String r2 = "the canonicalPath has IOException"
            com.huawei.hms.framework.common.Logger.w(r0, r2, r1)
        L22:
            return r3
    }

    public static java.lang.String getFileHashData(java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "Close FileInputStream failed!"
            java.lang.String r1 = "CreateFileUtil"
            r2 = 0
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)     // Catch: java.lang.Throwable -> L44 java.lang.IndexOutOfBoundsException -> L46 java.lang.IllegalArgumentException -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f java.security.NoSuchAlgorithmException -> L52
            java.io.FileInputStream r10 = newSafeFileInputStream(r10)     // Catch: java.lang.Throwable -> L44 java.lang.IndexOutOfBoundsException -> L46 java.lang.IllegalArgumentException -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f java.security.NoSuchAlgorithmException -> L52
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L22 java.lang.IndexOutOfBoundsException -> L26 java.lang.IllegalArgumentException -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c java.security.NoSuchAlgorithmException -> L2e
            r4 = 0
            r6 = r4
        L14:
            int r8 = r10.read(r3)     // Catch: java.lang.Throwable -> L22 java.lang.IndexOutOfBoundsException -> L26 java.lang.IllegalArgumentException -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c java.security.NoSuchAlgorithmException -> L2e
            r9 = -1
            if (r8 == r9) goto L30
            r9 = 0
            r11.update(r3, r9, r8)     // Catch: java.lang.Throwable -> L22 java.lang.IndexOutOfBoundsException -> L26 java.lang.IllegalArgumentException -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c java.security.NoSuchAlgorithmException -> L2e
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22 java.lang.IndexOutOfBoundsException -> L26 java.lang.IllegalArgumentException -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c java.security.NoSuchAlgorithmException -> L2e
            long r6 = r6 + r8
            goto L14
        L22:
            r11 = move-exception
            r2 = r10
            goto L7e
        L26:
            r11 = move-exception
            goto L55
        L28:
            r11 = move-exception
            goto L5d
        L2a:
            r11 = move-exception
            goto L65
        L2c:
            r11 = move-exception
            goto L6d
        L2e:
            r11 = move-exception
            goto L75
        L30:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3c
            byte[] r11 = r11.digest()     // Catch: java.lang.Throwable -> L22 java.lang.IndexOutOfBoundsException -> L26 java.lang.IllegalArgumentException -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c java.security.NoSuchAlgorithmException -> L2e
            java.lang.String r2 = byteArrayToHex(r11)     // Catch: java.lang.Throwable -> L22 java.lang.IndexOutOfBoundsException -> L26 java.lang.IllegalArgumentException -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c java.security.NoSuchAlgorithmException -> L2e
        L3c:
            r10.close()     // Catch: java.io.IOException -> L40
            goto L7d
        L40:
            com.huawei.hms.framework.common.Logger.e(r1, r0)
            goto L7d
        L44:
            r11 = move-exception
            goto L7e
        L46:
            r11 = move-exception
            r10 = r2
            goto L55
        L49:
            r11 = move-exception
            r10 = r2
            goto L5d
        L4c:
            r11 = move-exception
            r10 = r2
            goto L65
        L4f:
            r11 = move-exception
            r10 = r2
            goto L6d
        L52:
            r11 = move-exception
            r10 = r2
            goto L75
        L55:
            java.lang.String r3 = "getFileHashData IndexOutOfBoundsException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L7d
            goto L3c
        L5d:
            java.lang.String r3 = "getFileHashData IllegalArgumentException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L7d
            goto L3c
        L65:
            java.lang.String r3 = "getFileHashData IOException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L7d
            goto L3c
        L6d:
            java.lang.String r3 = "getFileHashData FileNotFoundException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L7d
            goto L3c
        L75:
            java.lang.String r3 = "getFileHashData NoSuchAlgorithmException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L7d
            goto L3c
        L7d:
            return r2
        L7e:
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.io.IOException -> L84
            goto L87
        L84:
            com.huawei.hms.framework.common.Logger.e(r1, r0)
        L87:
            throw r11
    }

    @java.lang.Deprecated
    public static boolean isPVersion() {
            boolean r0 = com.huawei.hms.framework.common.EmuiUtil.isUpPVersion()
            return r0
    }

    public static java.io.File newFile(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = com.huawei.hms.framework.common.EmuiUtil.isUpPVersion()
            if (r0 == 0) goto L18
            java.lang.String r0 = "com.huawei.libcore.io.ExternalStorageFile"
            boolean r0 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r0)
            if (r0 == 0) goto L18
            com.huawei.libcore.io.ExternalStorageFile r0 = new com.huawei.libcore.io.ExternalStorageFile
            r0.<init>(r1)
            return r0
        L18:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
    }

    public static java.io.FileInputStream newFileInputStream(java.lang.String r1) throws java.io.FileNotFoundException {
            if (r1 == 0) goto L1c
            boolean r0 = com.huawei.hms.framework.common.EmuiUtil.isUpPVersion()
            if (r0 == 0) goto L16
            java.lang.String r0 = "com.huawei.libcore.io.ExternalStorageFileInputStream"
            boolean r0 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r0)
            if (r0 == 0) goto L16
            com.huawei.libcore.io.ExternalStorageFileInputStream r0 = new com.huawei.libcore.io.ExternalStorageFileInputStream
            r0.<init>(r1)
            return r0
        L16:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            return r0
        L1c:
            java.lang.String r1 = "CreateFileUtil"
            java.lang.String r0 = "newFileInputStream  file is null"
            com.huawei.hms.framework.common.Logger.w(r1, r0)
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r0 = "file is null"
            r1.<init>(r0)
            throw r1
    }

    public static java.io.FileOutputStream newFileOutputStream(java.io.File r1) throws java.io.FileNotFoundException {
            if (r1 == 0) goto L1c
            boolean r0 = com.huawei.hms.framework.common.EmuiUtil.isUpPVersion()
            if (r0 == 0) goto L16
            java.lang.String r0 = "com.huawei.libcore.io.ExternalStorageFileOutputStream"
            boolean r0 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r0)
            if (r0 == 0) goto L16
            com.huawei.libcore.io.ExternalStorageFileOutputStream r0 = new com.huawei.libcore.io.ExternalStorageFileOutputStream
            r0.<init>(r1)
            return r0
        L16:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            return r0
        L1c:
            java.lang.String r1 = "CreateFileUtil"
            java.lang.String r0 = "newFileOutputStream  file is null"
            com.huawei.hms.framework.common.Logger.e(r1, r0)
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r0 = "file is null"
            r1.<init>(r0)
            throw r1
    }

    public static java.io.RandomAccessFile newRandomAccessFile(java.lang.String r1, java.lang.String r2) throws java.io.FileNotFoundException {
            if (r1 == 0) goto L1c
            boolean r0 = com.huawei.hms.framework.common.EmuiUtil.isUpPVersion()
            if (r0 == 0) goto L16
            java.lang.String r0 = "com.huawei.libcore.io.ExternalStorageRandomAccessFile"
            boolean r0 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r0)
            if (r0 == 0) goto L16
            com.huawei.libcore.io.ExternalStorageRandomAccessFile r0 = new com.huawei.libcore.io.ExternalStorageRandomAccessFile
            r0.<init>(r1, r2)
            return r0
        L16:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            r0.<init>(r1, r2)
            return r0
        L1c:
            java.lang.String r1 = "CreateFileUtil"
            java.lang.String r2 = "newFileOutputStream  file is null"
            com.huawei.hms.framework.common.Logger.w(r1, r2)
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = "file is null"
            r1.<init>(r2)
            throw r1
    }

    public static java.io.File newSafeFile(java.lang.String r3) {
            java.lang.String r0 = "CreateFileUtil"
            if (r3 != 0) goto L6
            r3 = 0
            return r3
        L6:
            java.io.File r1 = newFile(r3)     // Catch: java.lang.Throwable -> L16 java.lang.RuntimeException -> L1c
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L16 java.lang.RuntimeException -> L1c
            if (r2 != 0) goto L15
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L16 java.lang.RuntimeException -> L1c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L16 java.lang.RuntimeException -> L1c
        L15:
            return r1
        L16:
            java.lang.String r1 = "newFile is Throwable"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L21
        L1c:
            java.lang.String r1 = "newFile is runtimeException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L21:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            return r0
    }

    public static java.io.FileInputStream newSafeFileInputStream(java.lang.String r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "CreateFileUtil"
            java.io.FileInputStream r2 = newFileInputStream(r2)     // Catch: java.lang.Throwable -> L7 java.lang.RuntimeException -> Ld java.io.FileNotFoundException -> L13
            return r2
        L7:
            java.lang.String r1 = "newFileInputStream is Throwable"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L18
        Ld:
            java.lang.String r1 = "newFileInputStream is runtimeException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L18
        L13:
            java.lang.String r1 = "newFileInputStream is fileNotFoundException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L18:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            return r0
    }

    public static java.io.FileOutputStream newSafeFileOutputStream(java.io.File r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "CreateFileUtil"
            java.io.FileOutputStream r2 = newFileOutputStream(r2)     // Catch: java.lang.Throwable -> L7 java.lang.RuntimeException -> Ld java.io.FileNotFoundException -> L13
            return r2
        L7:
            java.lang.String r1 = "newFileOutputStream is Throwable"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L18
        Ld:
            java.lang.String r1 = "newFileOutputStream is runtimeException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L18
        L13:
            java.lang.String r1 = "newFileOutputStream is fileNotFoundException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L18:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            return r0
    }

    public static java.io.RandomAccessFile newSafeRandomAccessFile(java.lang.String r2, java.lang.String r3) throws java.io.FileNotFoundException {
            java.lang.String r0 = "CreateFileUtil"
            if (r2 == 0) goto L20
            java.io.RandomAccessFile r2 = newRandomAccessFile(r2, r3)     // Catch: java.lang.Throwable -> L9 java.lang.RuntimeException -> Lf java.io.FileNotFoundException -> L15
            return r2
        L9:
            java.lang.String r1 = "newRandomAccessFile is Throwable"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L1a
        Lf:
            java.lang.String r1 = "newRandomAccessFile is runtimeException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L1a
        L15:
            java.lang.String r1 = "newRandomAccessFile is fileNotFoundException"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L1a:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            r0.<init>(r2, r3)
            return r0
        L20:
            java.lang.String r2 = "newRandomAccessFile  file is null"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "file is null"
            r2.<init>(r3)
            throw r2
    }
}
