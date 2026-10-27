package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {


    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto Le
            java.io.File r1 = r1.getFilesDir()
            if (r1 == 0) goto Le
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            return r0
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "can't get file :"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FileUtils"
            cn.jpush.android.helper.Logger.w(r2, r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object a(java.io.File r3) {
            r0 = 0
            if (r3 == 0) goto L2a
            boolean r1 = r3.exists()
            if (r1 == 0) goto L2a
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L10
            goto L2a
        L10:
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L25
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L25
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r1.readObject()     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.ad.m.a(r1)
            return r3
        L22:
            r3 = move-exception
            r0 = r1
            goto L26
        L25:
            r3 = move-exception
        L26:
            cn.jpush.android.ad.m.a(r0)
            throw r3
        L2a:
            return r0
    }

    public static java.lang.String a(android.content.Context r1, java.lang.String r2, int r3) {
            r0 = 1
            java.lang.String r1 = a(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String a(android.content.Context r4, java.lang.String r5, int r6, boolean r7) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = cn.jpush.android.ad.a.a()     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L3d
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L58
            java.io.File r0 = r4.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            r1.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> L58
            r1.append(r0)     // Catch: java.lang.Throwable -> L58
            r1.append(r5)     // Catch: java.lang.Throwable -> L58
            r1.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L58
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L58
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L39
            r1.mkdirs()     // Catch: java.lang.Throwable -> L58
        L39:
            r3 = r1
            r1 = r0
            r0 = r3
            goto L52
        L3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            r1.append(r5)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L58
            r1.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = b(r4, r1)     // Catch: java.lang.Throwable -> L58
        L52:
            if (r7 == 0) goto L57
            a(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L58
        L57:
            return r1
        L58:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String a(java.lang.String r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "?"
            int r0 = r3.indexOf(r0)
            if (r0 <= 0) goto L1d
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L1d
            return r1
        L1d:
            if (r4 == 0) goto L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "j_in_app_image_"
            r3.append(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L35:
            java.lang.String r4 = "/"
            int r4 = r3.lastIndexOf(r4)
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            return r3
    }

    private static void a(android.content.Context r0, java.lang.String r1, int r2, java.io.File r3) {
            if (r3 != 0) goto L6
            java.io.File r3 = a(r0, r1)
        L6:
            if (r3 != 0) goto L9
            goto L2e
        L9:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L2e
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L2e
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L2e
            int r1 = r0.length
            if (r1 <= r2) goto L2e
            cn.jpush.android.ad.c$1 r1 = new cn.jpush.android.ad.c$1
            r1.<init>()
            java.util.Arrays.sort(r0, r1)
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            e(r0)
        L2e:
            return
    }

    public static boolean a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L12
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L12
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "FileUtils e:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FileUtils"
            cn.jpush.android.helper.Logger.w(r0, r3)
            return r1
    }

    public static boolean a(java.lang.String r1, java.lang.String r2) {
            r0 = 1
            boolean r1 = a(r1, r2, r0)
            return r1
    }

    public static boolean a(java.lang.String r0, java.lang.String r1, boolean r2) {
            if (r2 == 0) goto L6
            java.lang.String r1 = e(r1)     // Catch: java.lang.Exception -> L15
        L6:
            if (r1 == 0) goto Lf
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L15
            goto L10
        Lf:
            r1 = 0
        L10:
            boolean r0 = b(r0, r1)     // Catch: java.lang.Exception -> L15
            return r0
        L15:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getBytes exception:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FileUtils"
            cn.jpush.android.helper.Logger.w(r1, r0)
            r0 = 0
            return r0
    }

    public static boolean a(java.lang.String r1, byte[] r2) {
            if (r2 == 0) goto La
            int r0 = r2.length
            if (r0 <= 0) goto La
            boolean r1 = b(r1, r2)
            return r1
        La:
            r1 = 0
            return r1
    }

    public static java.lang.String b(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = ""
            java.io.File r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L1f
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = " can't be null"
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.helper.Logger.w(r2, r3)     // Catch: java.lang.Throwable -> L47
            return r0
        L1f:
            boolean r3 = r2.isFile()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L28
            r2.delete()     // Catch: java.lang.Throwable -> L47
        L28:
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L47
            if (r3 != 0) goto L31
            r2.mkdirs()     // Catch: java.lang.Throwable -> L47
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            r3.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L47
            r3.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L47
            return r2
        L47:
            return r0
    }

    public static void b(java.io.File r2) {
            if (r2 == 0) goto L1a
            boolean r0 = r2.exists()
            if (r0 != 0) goto L1a
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L17
            boolean r1 = r0.exists()
            if (r1 != 0) goto L17
            r0.mkdirs()
        L17:
            r2.createNewFile()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public static boolean b(java.lang.String r5) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L8
            return r0
        L8:
            char[] r5 = r5.toCharArray()     // Catch: java.lang.Throwable -> L2d
            r1 = 10
            char[] r2 = new char[r1]     // Catch: java.lang.Throwable -> L2d
            int r3 = r5.length     // Catch: java.lang.Throwable -> L2d
            if (r3 > r1) goto L14
            return r0
        L14:
            r3 = 0
        L15:
            if (r3 >= r1) goto L21
            char r4 = r5[r3]     // Catch: java.lang.Throwable -> L2d
            r4 = r4 ^ 2000(0x7d0, float:2.803E-42)
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2d
            r2[r3] = r4     // Catch: java.lang.Throwable -> L2d
            int r3 = r3 + 1
            goto L15
        L21:
            java.lang.String r5 = "j-c-o-r-e-"
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L2d
            return r5
        L2d:
            return r0
    }

    public static boolean b(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:createHtmlFile - filePath:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", content:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FileUtils"
            cn.jpush.android.helper.Logger.v(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L2a
            boolean r2 = a(r2, r3, r1)
            return r2
        L2a:
            return r1
    }

    private static boolean b(java.lang.String r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r6 != 0) goto Lc
            byte[] r6 = new byte[r1]
        Lc:
            r0 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            b(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.write(r6)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            cn.jpush.android.ad.m.a(r3)
            r5 = 1
            return r5
        L22:
            r5 = move-exception
            r0 = r3
            goto L4d
        L25:
            r6 = move-exception
            r0 = r3
            goto L2b
        L28:
            r5 = move-exception
            goto L4d
        L2a:
            r6 = move-exception
        L2b:
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "save to file exception:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            r3.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = " path = "
            r3.append(r6)     // Catch: java.lang.Throwable -> L28
            r3.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L28
            cn.jpush.android.helper.Logger.w(r2, r5)     // Catch: java.lang.Throwable -> L28
            cn.jpush.android.ad.m.a(r0)
            return r1
        L4d:
            cn.jpush.android.ad.m.a(r0)
            throw r5
    }

    public static java.lang.String c(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "rich"
            boolean r1 = cn.jpush.android.ad.a.a()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L38
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L57
            java.io.File r3 = r3.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            r0.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L57
            r0.append(r3)     // Catch: java.lang.Throwable -> L57
            r0.append(r4)     // Catch: java.lang.Throwable -> L57
            r0.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L57
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L57
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L37
            r4.mkdirs()     // Catch: java.lang.Throwable -> L57
        L37:
            return r3
        L38:
            r1 = 10
            r2 = 0
            a(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> L57
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            r1.append(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = b(r3, r4)     // Catch: java.lang.Throwable -> L57
            return r3
        L57:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String c(java.io.File r3) {
            byte[] r3 = d(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L14
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> L14
            java.lang.String r3 = d(r1)     // Catch: java.io.UnsupportedEncodingException -> L14
            return r3
        L14:
            return r0
    }

    public static java.lang.String c(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L7
            goto L1f
        L7:
            char[] r0 = r3.toCharArray()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
        Lc:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1f
            if (r1 >= r2) goto L19
            char r2 = r0[r1]     // Catch: java.lang.Throwable -> L1f
            r2 = r2 ^ 2000(0x7d0, float:2.803E-42)
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L1f
            r0[r1] = r2     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + 1
            goto Lc
        L19:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            return r1
        L1f:
            return r3
    }

    private static java.lang.String d(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L7
            goto L17
        L7:
            boolean r0 = b(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L17
            r0 = 10
            java.lang.String r0 = r1.substring(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = c(r0)     // Catch: java.lang.Throwable -> L17
        L17:
            return r1
    }

    public static void d(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "j_in_app_"
            r0.append(r1)     // Catch: java.lang.Throwable -> L1f
            r0.append(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            java.lang.String r2 = a(r2, r3, r0, r0)     // Catch: java.lang.Throwable -> L1f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            e(r3)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "delete file throwable"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FileUtils"
            cn.jpush.android.helper.Logger.ee(r3, r2)
            return
    }

    public static byte[] d(java.io.File r2) {
            r0 = 0
            if (r2 == 0) goto L21
            boolean r1 = r2.exists()
            if (r1 == 0) goto L21
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L10
            goto L21
        L10:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            byte[] r2 = cn.jpush.android.ad.m.a(r1)     // Catch: java.lang.Throwable -> L1e
            cn.jpush.android.ad.m.a(r1)
            return r2
        L1d:
            r1 = r0
        L1e:
            cn.jpush.android.ad.m.a(r1)
        L21:
            return r0
    }

    public static java.lang.String e(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "FileUtils"
            boolean r2 = cn.jpush.android.ad.a.a()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L15
            java.io.File r3 = r3.getExternalFilesDir(r2)     // Catch: java.lang.Throwable -> L15
        L10:
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r3 = move-exception
            goto L42
        L17:
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L15
            goto L10
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            r2.append(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L15
            r2.append(r3)     // Catch: java.lang.Throwable -> L15
            r2.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L15
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L15
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L15
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L3c
            return r3
        L3c:
            java.lang.String r3 = "Can't find developer picture resource in SDCard."
            cn.jpush.android.helper.Logger.ww(r1, r3)     // Catch: java.lang.Throwable -> L15
            return r0
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "Get developer picture resource failed."
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.ww(r1, r3)
            return r0
    }

    private static java.lang.String e(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "j-c-o-r-e-"
            r2 = 0
            r0.insert(r2, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = c(r0)     // Catch: java.lang.Throwable -> L13
        L13:
            return r3
    }

    public static boolean e(java.io.File r6) {
            r0 = 0
            boolean r1 = r6.exists()     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto L8
            return r0
        L8:
            boolean r1 = r6.isFile()     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L13
        Le:
            boolean r6 = r6.delete()     // Catch: java.lang.Exception -> L34
            return r6
        L13:
            java.lang.String[] r1 = r6.list()     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto Le
            int r2 = r1.length     // Catch: java.lang.Exception -> L34
            r3 = 0
        L1b:
            if (r3 >= r2) goto Le
            r4 = r1[r3]     // Catch: java.lang.Exception -> L34
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L34
            r5.<init>(r6, r4)     // Catch: java.lang.Exception -> L34
            boolean r4 = r5.isDirectory()     // Catch: java.lang.Exception -> L34
            if (r4 == 0) goto L2e
            e(r5)     // Catch: java.lang.Exception -> L34
            goto L31
        L2e:
            r5.delete()     // Catch: java.lang.Exception -> L34
        L31:
            int r3 = r3 + 1
            goto L1b
        L34:
            java.lang.String r6 = "FileUtils"
            java.lang.String r1 = "Delete dir error"
            cn.jpush.android.helper.Logger.e(r6, r1)
            return r0
    }
}
