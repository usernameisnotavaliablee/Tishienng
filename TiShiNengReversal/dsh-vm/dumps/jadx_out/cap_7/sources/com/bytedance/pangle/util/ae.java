package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae {
    static int cw = 8192;
    static java.lang.String j;
    static java.lang.String xt;

    static {
            return
    }

    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(android.content.Context r1) {
            java.lang.String r0 = com.bytedance.pangle.util.ae.j
            if (r0 != 0) goto L14
            java.io.File r1 = r1.getCacheDir()
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto L14
            java.lang.String r1 = r1.getAbsolutePath()
            com.bytedance.pangle.util.ae.j = r1
        L14:
            java.lang.String r1 = com.bytedance.pangle.util.ae.j
            return r1
    }

    public static void j(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void j(java.io.File r4) {
            if (r4 == 0) goto L24
            boolean r0 = r4.exists()
            if (r0 != 0) goto L9
            goto L24
        L9:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L21
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L21
            int r1 = r0.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            j(r3)
            int r2 = r2 + 1
            goto L17
        L21:
            r4.delete()
        L24:
            return
    }

    public static void j(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
            r0 = 0
            r2 = 1048576(0x100000, float:1.469368E-39)
            j(r3, r4, r0, r2)
            return
    }

    private static void j(java.io.InputStream r4, java.io.OutputStream r5, long r6, int r8) throws java.io.IOException {
            if (r4 == 0) goto L46
            if (r5 != 0) goto L5
            goto L46
        L5:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r4)
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream
            r4.<init>(r5)
            byte[] r5 = new byte[r8]     // Catch: java.lang.Throwable -> L1f
            r8 = 0
            r1 = 0
        L13:
            int r2 = r0.read(r5)     // Catch: java.lang.Throwable -> L1f
            r3 = -1
            if (r2 == r3) goto L21
            r4.write(r5, r8, r2)     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + r2
            goto L13
        L1f:
            r5 = move-exception
            goto L3f
        L21:
            r4.flush()     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L38
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L1f
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 != 0) goto L30
            goto L38
        L30:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = "copy is not completed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1f
            throw r5     // Catch: java.lang.Throwable -> L1f
        L38:
            r0.close()
            r4.close()
            return
        L3f:
            r0.close()
            r4.close()
            throw r5
        L46:
            return
    }

    public static void j(java.io.RandomAccessFile r4, java.io.RandomAccessFile r5, long r6, long r8, java.lang.String r10) throws java.io.IOException {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L41
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L41
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 > 0) goto L41
            if (r2 != 0) goto L11
            goto L40
        L11:
            r4.seek(r6)
            long r8 = r8 - r6
            int r6 = com.bytedance.pangle.util.ae.cw
            long r2 = (long) r6
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 >= 0) goto L20
            int r6 = (int) r8
            byte[] r6 = new byte[r6]
            goto L22
        L20:
            byte[] r6 = new byte[r6]
        L22:
            int r7 = r4.read(r6)
            r10 = -1
            if (r7 == r10) goto L40
            r10 = 0
            r5.write(r6, r10, r7)
            long r2 = (long) r7
            long r0 = r0 + r2
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L40
            int r7 = r6.length
            long r2 = (long) r7
            long r2 = r2 + r0
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 <= 0) goto L22
            long r6 = r8 - r0
            int r7 = (int) r6
            byte[] r6 = new byte[r7]
            goto L22
        L40:
            return
        L41:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "invalid offsets  "
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r5 = r5.concat(r6)
            r4.<init>(r5)
            throw r4
    }

    public static void j(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            j(r0)
            return
    }

    public static void j(java.lang.String r8, java.lang.String r9) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            java.io.File r8 = new java.io.File
            r8.<init>(r9)
            boolean r9 = r0.exists()
            if (r9 == 0) goto La4
            boolean r9 = r0.isDirectory()
            if (r9 == 0) goto L9c
            boolean r9 = r8.exists()
            if (r9 != 0) goto L1f
            r8.mkdirs()
        L1f:
            boolean r9 = r8.isDirectory()
            if (r9 == 0) goto L94
            java.io.File[] r9 = r0.listFiles()
            if (r9 == 0) goto L93
            int r0 = r9.length
            if (r0 != 0) goto L2f
            goto L93
        L2f:
            int r0 = r9.length
            r1 = 0
            r2 = 0
        L32:
            if (r2 >= r0) goto L93
            r3 = r9[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r5 = java.io.File.separator
            r4.append(r5)
            java.lang.String r5 = r3.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r5 = r3.isDirectory()
            if (r5 == 0) goto L5c
            java.lang.String r3 = r3.getAbsolutePath()
            j(r3, r4)
            goto L90
        L5c:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r5 = r5.exists()
            if (r5 != 0) goto L90
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r6.<init>(r3)
            r5.<init>(r6)
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r6.<init>(r4)
            r3.<init>(r6)
            int r4 = com.bytedance.pangle.util.ae.cw
            byte[] r4 = new byte[r4]
        L7f:
            int r6 = r5.read(r4)
            r7 = -1
            if (r6 == r7) goto L8a
            r3.write(r4, r1, r6)
            goto L7f
        L8a:
            r3.close()
            r5.close()
        L90:
            int r2 = r2 + 1
            goto L32
        L93:
            return
        L94:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "目标文件夹不是目录"
            r8.<init>(r9)
            throw r8
        L9c:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "源文件夹不是目录"
            r8.<init>(r9)
            throw r8
        La4:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "文件夹不存在"
            r8.<init>(r9)
            throw r8
    }

    public static void j(java.util.zip.ZipFile r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static java.lang.String xt(android.content.Context r1) {
            java.lang.String r0 = com.bytedance.pangle.util.ae.xt
            if (r0 != 0) goto L19
            java.io.File r1 = r1.getCacheDir()
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto L19
            java.lang.String r1 = r1.getCanonicalPath()     // Catch: java.io.IOException -> L15
            com.bytedance.pangle.util.ae.xt = r1     // Catch: java.io.IOException -> L15
            goto L19
        L15:
            r1 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r1)
        L19:
            java.lang.String r1 = com.bytedance.pangle.util.ae.xt
            return r1
    }

    public static void xt(java.lang.String r5, java.lang.String r6) throws java.lang.Exception {
            r0 = 0
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch: java.lang.Exception -> L9e
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L9e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L9e
            r3.<init>(r5)     // Catch: java.lang.Exception -> L9e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L9e
            r1.<init>(r2)     // Catch: java.lang.Exception -> L9e
        L10:
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch: java.lang.Exception -> L45
            if (r5 == 0) goto L9a
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = ".."
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L45
            if (r3 != 0) goto L10
            boolean r5 = r5.isDirectory()     // Catch: java.lang.Exception -> L45
            if (r5 == 0) goto L47
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r3.<init>()     // Catch: java.lang.Exception -> L45
            r3.append(r6)     // Catch: java.lang.Exception -> L45
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Exception -> L45
            r3.append(r4)     // Catch: java.lang.Exception -> L45
            r3.append(r2)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L45
            r5.<init>(r2)     // Catch: java.lang.Exception -> L45
            r5.mkdirs()     // Catch: java.lang.Exception -> L45
            goto L10
        L45:
            r5 = move-exception
            goto La0
        L47:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r3.<init>()     // Catch: java.lang.Exception -> L45
            r3.append(r6)     // Catch: java.lang.Exception -> L45
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Exception -> L45
            r3.append(r4)     // Catch: java.lang.Exception -> L45
            r3.append(r2)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L45
            r5.<init>(r2)     // Catch: java.lang.Exception -> L45
            boolean r2 = r5.exists()     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L6a
            r5.delete()     // Catch: java.lang.Exception -> L45
            goto L71
        L6a:
            java.io.File r2 = r5.getParentFile()     // Catch: java.lang.Exception -> L45
            r2.mkdirs()     // Catch: java.lang.Exception -> L45
        L71:
            r5.createNewFile()     // Catch: java.lang.Exception -> L45
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L45
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L45
            r3.<init>(r5)     // Catch: java.lang.Exception -> L45
            r2.<init>(r3)     // Catch: java.lang.Exception -> L45
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L8e
        L82:
            int r0 = r1.read(r5)     // Catch: java.lang.Exception -> L8e
            r3 = -1
            if (r0 == r3) goto L91
            r3 = 0
            r2.write(r5, r3, r0)     // Catch: java.lang.Exception -> L8e
            goto L82
        L8e:
            r5 = move-exception
            r0 = r2
            goto La0
        L91:
            r2.flush()     // Catch: java.lang.Exception -> L8e
            r2.close()     // Catch: java.lang.Exception -> L8e
            r0 = r2
            goto L10
        L9a:
            r1.close()     // Catch: java.lang.Exception -> L45
            return
        L9e:
            r5 = move-exception
            r1 = r0
        La0:
            j(r0)
            j(r1)
            throw r5
    }

    public static boolean xt(java.io.File r7) {
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L8
            j(r1)
            return r0
        L8:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L50
            r7 = 6
            byte[] r1 = new byte[r7]     // Catch: java.lang.Throwable -> L4f
            int r3 = r2.read(r1)     // Catch: java.lang.Throwable -> L4f
            if (r3 == r7) goto L1a
            j(r2)
            return r0
        L1a:
            r7 = 4
            byte[] r3 = new byte[r7]     // Catch: java.lang.Throwable -> L4f
            r3 = {x0054: FILL_ARRAY_DATA , data: [80, 75, 3, 4} // fill-array     // Catch: java.lang.Throwable -> L4f
            r4 = 0
        L21:
            if (r4 >= r7) goto L30
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L4f
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L4f
            if (r5 == r6) goto L2d
            j(r2)
            return r0
        L2d:
            int r4 = r4 + 1
            goto L21
        L30:
            r7 = r1[r7]     // Catch: java.lang.Throwable -> L4f
            r3 = 5
            if (r7 != 0) goto L3d
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L3d
            j(r2)
            return r0
        L3d:
            r4 = 20
            if (r7 != r4) goto L4b
            r7 = r1[r3]     // Catch: java.lang.Throwable -> L4f
            r1 = 3
            if (r7 != r1) goto L4b
            j(r2)
            r7 = 1
            return r7
        L4b:
            j(r2)
            return r0
        L4f:
            r1 = r2
        L50:
            j(r1)
            return r0
    }
}
