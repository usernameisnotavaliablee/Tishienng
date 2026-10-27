package com.bykv.vk.component.ttvideo.utils;

@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AVCrashUtil {
    public AVCrashUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void compress(java.io.InputStream r5, java.io.OutputStream r6) throws java.lang.Exception {
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r6)
            r6 = 10240(0x2800, float:1.4349E-41)
            byte[] r1 = new byte[r6]
        L9:
            r2 = 0
            int r3 = r5.read(r1, r2, r6)
            r4 = -1
            if (r3 == r4) goto L15
            r0.write(r1, r2, r3)
            goto L9
        L15:
            r0.flush()
            r0.finish()
            r0.close()
            return
    }

    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            r1 = 0
            if (r5 != 0) goto Ld
            return r1
        Ld:
            boolean r5 = r0.isFile()
            if (r5 != 0) goto L14
            return r1
        L14:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L2a
            if (r6 == 0) goto L3f
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
            r6.delete()
            goto L3f
        L2a:
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L3f
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L3f
            return r1
        L3f:
            r4 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L87 java.io.FileNotFoundException -> L89
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L87 java.io.FileNotFoundException -> L89
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f java.io.FileNotFoundException -> L81
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f java.io.FileNotFoundException -> L81
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
        L4e:
            int r5 = r6.read(r4)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            r3 = -1
            if (r5 == r3) goto L5f
            r2.write(r4, r1, r5)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            goto L4e
        L59:
            r4 = move-exception
            goto L8b
        L5b:
            goto L77
        L5d:
            goto L79
        L5f:
            r2.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            r6.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            if (r7 == 0) goto L6a
            r0.delete()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
        L6a:
            r2.close()     // Catch: java.io.IOException -> L71
            r6.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L75:
            r4 = 1
            return r4
        L77:
            r4 = r2
            goto L9e
        L79:
            r4 = r2
            goto Lb1
        L7b:
            r5 = move-exception
            r2 = r4
        L7d:
            r4 = r5
            goto L8b
        L7f:
            goto L9e
        L81:
            goto Lb1
        L83:
            r5 = move-exception
            r6 = r4
            r2 = r6
            goto L7d
        L87:
            goto L9d
        L89:
            goto Lb0
        L8b:
            if (r2 == 0) goto L93
            r2.close()     // Catch: java.io.IOException -> L91
            goto L93
        L91:
            r5 = move-exception
            goto L99
        L93:
            if (r6 == 0) goto L9c
            r6.close()     // Catch: java.io.IOException -> L91
            goto L9c
        L99:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L9c:
            throw r4
        L9d:
            r6 = r4
        L9e:
            if (r4 == 0) goto La6
            r4.close()     // Catch: java.io.IOException -> La4
            goto La6
        La4:
            r4 = move-exception
            goto Lac
        La6:
            if (r6 == 0) goto Laf
            r6.close()     // Catch: java.io.IOException -> La4
            goto Laf
        Lac:
            com.bytedance.sdk.component.utils.vl.j(r4)
        Laf:
            return r1
        Lb0:
            r6 = r4
        Lb1:
            if (r4 == 0) goto Lb9
            r4.close()     // Catch: java.io.IOException -> Lb7
            goto Lb9
        Lb7:
            r4 = move-exception
            goto Lbf
        Lb9:
            if (r6 == 0) goto Lc2
            r6.close()     // Catch: java.io.IOException -> Lb7
            goto Lc2
        Lbf:
            com.bytedance.sdk.component.utils.vl.j(r4)
        Lc2:
            return r1
    }

    public static void deleteCrashFile(android.content.Context r0, java.lang.String r1) {
            if (r1 != 0) goto L3
            goto L11
        L3:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L11
            r0.delete()
        L11:
            return
    }

    public static boolean existsCrashFile(android.content.Context r0, java.lang.String r1) {
            if (r0 != 0) goto L6
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            return r0
    }

    public static java.lang.String getBase64SampleCrash(java.lang.String r1) {
            byte[] r1 = r1.getBytes()
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static java.lang.String getCrashFileContext(android.content.Context r5, java.lang.String r6, java.lang.StringBuilder r7) {
            r0 = 0
            if (r5 == 0) goto L6d
            if (r6 != 0) goto L6
            goto L6d
        L6:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r1 = r5.exists()
            if (r1 != 0) goto L1f
            java.lang.String r5 = "file not exist.path:"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = "\r\n"
            r7.append(r5)
            return r0
        L1f:
            long r1 = r5.length()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L2f
            java.lang.String r5 = "file size is zore.\r\n"
            r7.append(r5)
            return r0
        L2f:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L4e
            r1.<init>(r5)     // Catch: java.lang.Exception -> L4e
            compress(r1, r6)     // Catch: java.lang.Exception -> L4c
            r1.close()     // Catch: java.lang.Exception -> L4c
            byte[] r5 = r6.toByteArray()     // Catch: java.lang.Exception -> L4c
            r2 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch: java.lang.Exception -> L4c
            r6.close()     // Catch: java.lang.Exception -> L4c
            return r5
        L4c:
            r5 = move-exception
            goto L50
        L4e:
            r5 = move-exception
            r1 = r0
        L50:
            com.bytedance.sdk.component.utils.vl.j(r5)
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L5d:
            r6.close()     // Catch: java.io.IOException -> L60
        L60:
            java.lang.String r6 = "gzip file is error.error:"
            r7.append(r6)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            return r0
        L6d:
            java.lang.String r5 = "context or path is null.\r\n"
            r7.append(r5)
            return r0
    }

    public static final boolean moveFile(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = 1
            boolean r1 = copyFile(r1, r2, r3, r0)
            return r1
    }
}
