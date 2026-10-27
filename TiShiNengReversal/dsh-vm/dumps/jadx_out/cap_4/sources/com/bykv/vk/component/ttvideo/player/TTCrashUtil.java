package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class TTCrashUtil {
    public TTCrashUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addDebugTrackInfo(long r0, java.lang.String r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = getDebugTrackFilePath(r0, r2)
            appendTrackInfo(r0, r4, r3)
            return
    }

    public static void addTrackInfo(long r0, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = getTrackFilePath(r0, r2)
            r1 = 1
            appendTrackInfo(r0, r1, r3)
            return
    }

    public static void addTrackInfo(long r0, java.lang.String r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = getTrackFilePath(r0, r2)
            appendTrackInfo(r0, r4, r3)
            return
    }

    private static void appendTrackInfo(java.lang.String r2, boolean r3, java.lang.String r4) {
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L21
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L21
            r1.write(r4)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            r1.close()     // Catch: java.lang.Exception -> Ld
            return
        Ld:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
        L12:
            r2 = move-exception
            r0 = r1
            goto L18
        L15:
            r0 = r1
            goto L21
        L17:
            r2 = move-exception
        L18:
            r0.close()     // Catch: java.lang.Exception -> L1c
            goto L20
        L1c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L20:
            throw r2
        L21:
            r0.close()     // Catch: java.lang.Exception -> Ld
            return
    }

    public static void checkLogDir(java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "%s/ttplayer_logs"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L3e
            boolean r5 = r0.isDirectory()
            if (r5 == 0) goto L47
            java.io.File[] r5 = r0.listFiles()
            if (r5 == 0) goto L34
            int r1 = r5.length
        L24:
            if (r2 >= r1) goto L34
            r3 = r5[r2]
            boolean r4 = r3.delete()
            if (r4 != 0) goto L31
            r3.getName()
        L31:
            int r2 = r2 + 1
            goto L24
        L34:
            boolean r5 = r0.delete()
            if (r5 != 0) goto L47
            r0.getName()
            return
        L3e:
            boolean r5 = r0.mkdir()
            if (r5 != 0) goto L47
            r0.getName()
        L47:
            return
    }

    public static void checkTrackDir(java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "%s/ttplayer_logs"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L1a
            r0.mkdir()
        L1a:
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
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L81 java.io.FileNotFoundException -> L83
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L81 java.io.FileNotFoundException -> L83
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L79 java.io.FileNotFoundException -> L7b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L79 java.io.FileNotFoundException -> L7b
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
            goto L85
        L5b:
            goto L71
        L5d:
            goto L73
        L5f:
            if (r7 == 0) goto L64
            r0.delete()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
        L64:
            r2.close()     // Catch: java.io.IOException -> L6b
            r6.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L6f:
            r4 = 1
            return r4
        L71:
            r4 = r2
            goto L98
        L73:
            r4 = r2
            goto Lab
        L75:
            r5 = move-exception
            r2 = r4
        L77:
            r4 = r5
            goto L85
        L79:
            goto L98
        L7b:
            goto Lab
        L7d:
            r5 = move-exception
            r6 = r4
            r2 = r6
            goto L77
        L81:
            goto L97
        L83:
            goto Laa
        L85:
            if (r2 == 0) goto L8d
            r2.close()     // Catch: java.io.IOException -> L8b
            goto L8d
        L8b:
            r5 = move-exception
            goto L93
        L8d:
            if (r6 == 0) goto L96
            r6.close()     // Catch: java.io.IOException -> L8b
            goto L96
        L93:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L96:
            throw r4
        L97:
            r6 = r4
        L98:
            if (r4 == 0) goto La0
            r4.close()     // Catch: java.io.IOException -> L9e
            goto La0
        L9e:
            r4 = move-exception
            goto La6
        La0:
            if (r6 == 0) goto La9
            r6.close()     // Catch: java.io.IOException -> L9e
            goto La9
        La6:
            com.bytedance.sdk.component.utils.vl.j(r4)
        La9:
            return r1
        Laa:
            r6 = r4
        Lab:
            if (r4 == 0) goto Lb3
            r4.close()     // Catch: java.io.IOException -> Lb1
            goto Lb3
        Lb1:
            r4 = move-exception
            goto Lb9
        Lb3:
            if (r6 == 0) goto Lbc
            r6.close()     // Catch: java.io.IOException -> Lb1
            goto Lbc
        Lb9:
            com.bytedance.sdk.component.utils.vl.j(r4)
        Lbc:
            return r1
    }

    public static void deleteCrashFile(android.content.Context r0, java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Le
            r0.delete()
        Le:
            return
    }

    public static void deleteDebugTrackFile(long r0, java.lang.String r2) {
            java.lang.String r0 = getDebugTrackFilePath(r0, r2)
            deleteTrackFile(r0)
            return
    }

    public static void deleteTrackFile(long r0, java.lang.String r2) {
            java.lang.String r0 = getTrackFilePath(r0, r2)
            deleteTrackFile(r0)
            return
    }

    private static void deleteTrackFile(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Le
            r0.delete()
        Le:
            return
    }

    public static boolean existLogsFile(long r6, java.lang.String r8) {
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.io.File r7 = new java.io.File
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r8
            java.lang.String r8 = "%s/ttplayer_logs"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            r7.<init>(r8)
            boolean r8 = r7.exists()
            if (r8 == 0) goto L59
            boolean r8 = r7.isDirectory()
            if (r8 == 0) goto L59
            java.io.File[] r7 = r7.listFiles()
            if (r7 != 0) goto L28
            return r2
        L28:
            int r8 = r7.length
            r1 = 0
        L2a:
            if (r1 >= r8) goto L59
            r3 = r7[r1]
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "<TTCrashUtils,existLogsFile,375>file:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r5 = ",pname:"
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ttmp"
            com.bytedance.sdk.component.utils.vl.j(r5, r4)
            if (r3 == 0) goto L56
            boolean r3 = r3.startsWith(r6)
            if (r3 != 0) goto L56
            return r0
        L56:
            int r1 = r1 + 1
            goto L2a
        L59:
            return r2
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

    public static final java.lang.String existsCrashFilePath(android.content.Context r3) {
            r0 = 18
            r1 = 1
            int r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r0, r1)
            r2 = 0
            if (r0 != r1) goto L1d
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getAppCrashFilePath(r3)
            if (r3 == 0) goto L1c
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L1c
            return r3
        L1c:
            return r2
        L1d:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getAppCrashFilePath2(r3)
            if (r0 == 0) goto L2f
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L2f
            return r0
        L2f:
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getPlugerCrashFilePath(r3)
            if (r3 == 0) goto L41
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L41
            return r3
        L41:
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getExternalStorageDirectoryCrashFilePath()
            if (r3 == 0) goto L53
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L53
            return r2
        L53:
            return r3
    }

    public static boolean existsTrackFile(long r1, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getTrackFilePath(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            return r1
    }

    public static java.lang.String getBase64SampleCrash(java.lang.String r1) {
            byte[] r1 = r1.getBytes()
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static java.lang.String getCrashFileContext(android.content.Context r5, java.lang.String r6, java.lang.StringBuilder r7) {
            r0 = 0
            if (r5 != 0) goto Lb
            if (r6 != 0) goto Lb
            java.lang.String r5 = "context or path is null.\r\n"
            r7.append(r5)
            return r0
        Lb:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r1 = r5.exists()
            if (r1 != 0) goto L24
            java.lang.String r5 = "file not exist.path:"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = "\r\n"
            r7.append(r5)
            return r0
        L24:
            long r1 = r5.length()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L34
            java.lang.String r5 = "file size is zore.\r\n"
            r7.append(r5)
            return r0
        L34:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L53
            r1.<init>(r5)     // Catch: java.lang.Exception -> L53
            compress(r1, r6)     // Catch: java.lang.Exception -> L51
            r1.close()     // Catch: java.lang.Exception -> L51
            byte[] r5 = r6.toByteArray()     // Catch: java.lang.Exception -> L51
            r2 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch: java.lang.Exception -> L51
            r6.close()     // Catch: java.lang.Exception -> L51
            return r5
        L51:
            r5 = move-exception
            goto L55
        L53:
            r5 = move-exception
            r1 = r0
        L55:
            com.bytedance.sdk.component.utils.vl.j(r5)
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L62:
            r6.close()     // Catch: java.io.IOException -> L65
        L65:
            java.lang.String r6 = "gzip file is error.error:"
            r7.append(r6)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            return r0
    }

    private static java.lang.String getDebugTrackFilePath(long r2, java.lang.String r4) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r4
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "%s/ttplayer_logs/%d_d.log"
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    private static boolean getTrackFileInfos(java.io.File r5, java.lang.StringBuilder r6) {
            r0 = 0
            boolean r1 = r5.exists()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            if (r1 != 0) goto L9
            return r2
        L9:
            r1 = 1024(0x400, float:1.435E-42)
            char[] r3 = new char[r1]     // Catch: java.lang.Throwable -> L25
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L25
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L25
        L12:
            int r5 = r4.read(r3)     // Catch: java.lang.Throwable -> L1e
            if (r5 <= 0) goto L21
            r6.append(r3, r2, r5)     // Catch: java.lang.Throwable -> L1e
            if (r5 >= r1) goto L12
            goto L21
        L1e:
            r5 = move-exception
            r0 = r4
            goto L26
        L21:
            r4.close()     // Catch: java.lang.Throwable -> L1e
            goto L3c
        L25:
            r5 = move-exception
        L26:
            if (r0 == 0) goto L2b
            r0.close()     // Catch: java.lang.Exception -> L2b
        L2b:
            java.lang.String r0 = "track message:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = "\r\n"
            r6.append(r5)
        L3c:
            r5 = 1
            return r5
    }

    private static boolean getTrackFileInfos(java.lang.String r5, java.lang.StringBuilder r6) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            if (r2 != 0) goto L1d
            java.lang.String r1 = "path"
            r6.append(r1)     // Catch: java.lang.Throwable -> L1b
            r6.append(r5)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = " not exists.\r\n"
            r6.append(r5)     // Catch: java.lang.Throwable -> L1b
            return r3
        L1b:
            r5 = move-exception
            goto L39
        L1d:
            r5 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r5]     // Catch: java.lang.Throwable -> L1b
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1b
        L26:
            int r0 = r4.read(r2)     // Catch: java.lang.Throwable -> L32
            if (r0 <= 0) goto L35
            r6.append(r2, r3, r0)     // Catch: java.lang.Throwable -> L32
            if (r0 >= r5) goto L26
            goto L35
        L32:
            r5 = move-exception
            r0 = r4
            goto L39
        L35:
            r4.close()     // Catch: java.lang.Throwable -> L32
            goto L4f
        L39:
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.lang.Exception -> L3e
        L3e:
            java.lang.String r0 = "track message:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = "\r\n"
            r6.append(r5)
        L4f:
            r5 = 1
            return r5
    }

    public static java.lang.String getTrackFilePath(long r2, java.lang.String r4) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r4
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "%s/ttplayer_logs/%d.log"
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    public static final boolean moveFile(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = 1
            boolean r1 = copyFile(r1, r2, r3, r0)
            return r1
    }

    public static boolean moveTrackFile(long r1, long r3, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getTrackFilePath(r1, r5)
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = getTrackFilePath(r3, r5)
            r1.<init>(r2)
            boolean r1 = r0.renameTo(r1)
            return r1
    }

    public static boolean readDebugTrackInfos(long r0, java.lang.String r2, java.lang.StringBuilder r3) {
            java.lang.String r0 = getDebugTrackFilePath(r0, r2)
            boolean r0 = getTrackFileInfos(r0, r3)
            return r0
    }

    public static boolean readLogsInfo(long r4, java.lang.String r6, java.lang.StringBuilder r7) {
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.io.File r5 = new java.io.File
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r6
            java.lang.String r6 = "%s/ttplayer_logs"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L4d
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L4d
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L28
            return r1
        L28:
            int r6 = r5.length
            r0 = 0
        L2a:
            if (r0 >= r6) goto L4d
            r2 = r5[r0]
            java.lang.String r3 = r2.getName()
            if (r3 == 0) goto L4a
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L4a
            boolean r3 = getTrackFileInfos(r2, r7)
            if (r3 == 0) goto L4a
            boolean r4 = r2.delete()
            if (r4 != 0) goto L49
            r2.getName()
        L49:
            return r4
        L4a:
            int r0 = r0 + 1
            goto L2a
        L4d:
            return r1
    }

    public static boolean readTrackInfos(long r0, java.lang.String r2, java.lang.StringBuilder r3) {
            java.lang.String r0 = getTrackFilePath(r0, r2)
            boolean r0 = getTrackFileInfos(r0, r3)
            return r0
    }

    public static final void saveException(java.lang.Throwable r2, java.lang.String r3) {
            if (r3 != 0) goto L3
            goto L5c
        L3:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto Lf
            goto L5c
        Lf:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.lang.String r3 = "EXCE"
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r0.write(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r2.getClass()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r0.close()
            r1.close()     // Catch: java.lang.Exception -> L2d
            return
        L2d:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
        L32:
            r2 = move-exception
            r3 = r0
            goto L41
        L35:
            r3 = r0
            goto L52
        L38:
            r2 = move-exception
            goto L41
        L3a:
            goto L52
        L3c:
            r2 = move-exception
            r1 = r3
            goto L41
        L3f:
            goto L51
        L41:
            if (r3 == 0) goto L46
            r3.close()
        L46:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.lang.Exception -> L4c
            goto L50
        L4c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L50:
            throw r2
        L51:
            r1 = r3
        L52:
            if (r3 == 0) goto L57
            r3.close()
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L2d
        L5c:
            return
    }

    public static void saveLowMemoryInfo(int r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto Lc
            goto L3d
        Lc:
            r3 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            java.lang.String r0 = "LOWM\r\nrecv low memory warring info.level:"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r3.append(r2)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r1.write(r2)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r1.close()     // Catch: java.io.IOException -> L27
            return
        L27:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
        L2c:
            r2 = move-exception
            r3 = r1
            goto L3e
        L2f:
            r2 = move-exception
            r3 = r1
            goto L35
        L32:
            r2 = move-exception
            goto L3e
        L34:
            r2 = move-exception
        L35:
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.io.IOException -> L27
        L3d:
            return
        L3e:
            if (r3 == 0) goto L48
            r3.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L48:
            throw r2
    }

    public static void saveStopInfo(java.lang.String r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto Lc
            goto L50
        Lc:
            r2 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.lang.String r0 = "STOP recv stop info:"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.lang.String r3 = ".time:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.lang.String r3 = com.bykv.vk.component.ttvideo.utils.AVTime.getFormatNow()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.lang.String r3 = "\r\n"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r1.write(r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r1.close()     // Catch: java.io.IOException -> L38
            return
        L38:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
        L3d:
            r2 = move-exception
            goto L51
        L3f:
            r2 = move-exception
            goto L48
        L41:
            r3 = move-exception
            r1 = r2
            r2 = r3
            goto L51
        L45:
            r3 = move-exception
            r1 = r2
            r2 = r3
        L48:
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.io.IOException -> L38
        L50:
            return
        L51:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L5b:
            throw r2
    }
}
