package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class m {
    private static volatile java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f906c = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.commons.L.m.f906c = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = cn.jiguang.commons.L.m.a
            if (r0 == 0) goto L7
            java.lang.String r0 = cn.jiguang.commons.L.m.a
            return r0
        L7:
            java.lang.Object r0 = cn.jiguang.commons.L.m.f906c
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.commons.L.m.a     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.lang.String r1 = c()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.commons.L.m.a = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L1b
        L17:
            java.lang.String r1 = cn.jiguang.commons.L.m.a     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    public static java.lang.String a(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jiguang.commons.a.d.a.a
            r0.append(r1)
            int r2 = r2 + 4567
            r0.append(r2)
            java.lang.String r2 = ".cache"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String a(java.io.RandomAccessFile r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r6.read(r1)
            r3 = -1
            if (r2 == r3) goto L1c
            java.lang.String r3 = new java.lang.String
            r4 = 0
            java.lang.String r5 = "UTF-8"
            r3.<init>(r1, r4, r2, r5)
            r0.append(r3)
            goto L9
        L1c:
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = c(r6)
            return r6
    }

    public static java.lang.String a(java.lang.String r5) {
            boolean r0 = g(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L39
            r0.<init>(r5)     // Catch: java.io.IOException -> L39
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L22
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
        L16:
            int r3 = r0.read(r5)     // Catch: java.lang.Throwable -> L22
            r4 = -1
            if (r3 == r4) goto L24
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: java.lang.Throwable -> L22
            goto L16
        L22:
            r5 = move-exception
            goto L30
        L24:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = cn.jiguang.commons.L.k.d(r5)     // Catch: java.lang.Throwable -> L22
            r0.close()     // Catch: java.io.IOException -> L39
            return r5
        L30:
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.io.IOException -> L39
        L38:
            throw r5     // Catch: java.io.IOException -> L39
        L39:
            return r1
    }

    private static void a(java.io.BufferedOutputStream r3, java.lang.String r4) {
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L24
            int r1 = r4.length()
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r0
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.String r0 = r4.substring(r0, r1)
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)
            r3.write(r0)
            r3.flush()
            r0 = r2
            goto L1
        L24:
            return
    }

    public static void a(java.io.File r2) {
            if (r2 == 0) goto L1a
            boolean r0 = r2.exists()
            if (r0 != 0) goto L1a
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L17
            boolean r1 = r0.exists()
            if (r1 != 0) goto L17
            r0.mkdirs()
        L17:
            r2.createNewFile()     // Catch: java.io.IOException -> L1a
        L1a:
            return
    }

    public static void a(java.lang.String r3, java.lang.String r4) {
            java.io.File r3 = f(r3)     // Catch: java.lang.Throwable -> L49
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto Lb
            goto L49
        Lb:
            java.io.File r4 = f(r4)     // Catch: java.lang.Throwable -> L49
            a(r4)     // Catch: java.lang.Throwable -> L49
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L49
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L35
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2c
        L20:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L2c
            r2 = -1
            if (r1 == r2) goto L2e
            r2 = 0
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L2c
            goto L20
        L2c:
            r4 = move-exception
            goto L37
        L2e:
            r3.close()     // Catch: java.lang.Throwable -> L35
            r0.close()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49
            return
        L35:
            r3 = move-exception
            goto L40
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L35
        L3f:
            throw r4     // Catch: java.lang.Throwable -> L35
        L40:
            r0.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49
        L48:
            throw r3     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49
        L49:
            return
    }

    private static boolean a(java.io.File r9, java.io.File r10) {
            java.lang.String r1 = "FileUtils"
            r2 = 0
            boolean r0 = r9.exists()     // Catch: java.io.IOException -> L22
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L22
            r0.<init>()     // Catch: java.io.IOException -> L22
            java.lang.String r3 = "copy failed: source file not exists: "
            r0.append(r3)     // Catch: java.io.IOException -> L22
            java.lang.String r3 = r9.getAbsolutePath()     // Catch: java.io.IOException -> L22
            r0.append(r3)     // Catch: java.io.IOException -> L22
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L22
            cn.jiguang.commons.w.a.f(r1, r0)     // Catch: java.io.IOException -> L22
            return r2
        L22:
            r0 = move-exception
            goto L91
        L25:
            java.io.File r0 = r10.getParentFile()     // Catch: java.io.IOException -> L22
            if (r0 == 0) goto L50
            boolean r3 = r0.exists()     // Catch: java.io.IOException -> L22
            if (r3 != 0) goto L50
            boolean r3 = r0.mkdirs()     // Catch: java.io.IOException -> L22
            if (r3 != 0) goto L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L22
            r3.<init>()     // Catch: java.io.IOException -> L22
            java.lang.String r4 = "copy failed: cannot create dest directory: "
            r3.append(r4)     // Catch: java.io.IOException -> L22
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L22
            r3.append(r0)     // Catch: java.io.IOException -> L22
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L22
            cn.jiguang.commons.w.a.f(r1, r0)     // Catch: java.io.IOException -> L22
            return r2
        L50:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L22
            r0.<init>(r9)     // Catch: java.io.IOException -> L22
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.io.IOException -> L22
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L71
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L71
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch: java.lang.Throwable -> L71
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r3.transferTo(r4, r6, r8)     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L74
            r8.close()     // Catch: java.lang.Throwable -> L71
            goto L74
        L71:
            r0 = move-exception
            r4 = r0
            goto L86
        L74:
            r0 = 1
            r3.close()     // Catch: java.io.IOException -> L22
            return r0
        L79:
            r0 = move-exception
            r4 = r0
            if (r8 == 0) goto L85
            r8.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L71
        L85:
            throw r4     // Catch: java.lang.Throwable -> L71
        L86:
            if (r3 == 0) goto L90
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L90
        L8c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.io.IOException -> L22
        L90:
            throw r4     // Catch: java.io.IOException -> L22
        L91:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "copy failed: "
            r3.append(r4)
            java.lang.String r9 = r9.getAbsolutePath()
            r3.append(r9)
            java.lang.String r9 = " -> "
            r3.append(r9)
            java.lang.String r9 = r10.getAbsolutePath()
            r3.append(r9)
            java.lang.String r9 = ", error: "
            r3.append(r9)
            java.lang.String r9 = r0.getMessage()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r9)
            return r2
    }

    public static boolean a(java.io.File r6, java.lang.String r7) {
            java.lang.String r0 = "failed to delete temp file: "
            java.lang.String r1 = "FileUtils"
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto Lf
            boolean r6 = c(r6)
            return r6
        Lf:
            a(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getName()
            r2.append(r3)
            java.lang.String r3 = ".tmp"
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            r2.append(r4)
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r6.getParent()
            r3.<init>(r4, r2)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            java.lang.String r7 = e(r7)     // Catch: java.lang.Throwable -> L8d
            a(r2, r7)     // Catch: java.lang.Throwable -> L8d
            r2.flush()     // Catch: java.lang.Throwable -> L8d
            boolean r7 = r3.renameTo(r6)     // Catch: java.lang.Throwable -> L8d
            if (r7 != 0) goto L8f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r7.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "rename failed, trying safe copy: "
            r7.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L8d
            r7.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = " -> "
            r7.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L8d
            r7.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8d
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L8d
            boolean r7 = a(r3, r6)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r7 = move-exception
            goto Lb9
        L8f:
            r2.close()     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
            boolean r6 = r3.exists()
            if (r6 == 0) goto Lb4
            boolean r6 = r3.delete()
            if (r6 != 0) goto Lb4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        Lb4:
            return r7
        Lb5:
            r6 = move-exception
            goto L10a
        Lb7:
            r7 = move-exception
            goto Lc2
        Lb9:
            r2.close()     // Catch: java.lang.Throwable -> Lbd
            goto Lc1
        Lbd:
            r2 = move-exception
            r7.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
        Lc1:
            throw r7     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb7
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r2.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "save failed: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb5
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = ", error: "
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = r7.getMessage()     // Catch: java.lang.Throwable -> Lb5
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> Lb5
            cn.jiguang.commons.w.a.f(r1, r6)     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = r3.exists()
            if (r6 == 0) goto L108
            boolean r6 = r3.delete()
            if (r6 != 0) goto L108
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r7 = r3.getAbsolutePath()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        L108:
            r6 = 0
            return r6
        L10a:
            boolean r7 = r3.exists()
            if (r7 == 0) goto L12c
            boolean r7 = r3.delete()
            if (r7 != 0) goto L12c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            cn.jiguang.commons.w.a.a(r1, r7)
        L12c:
            throw r6
    }

    public static boolean a(java.io.File r5, byte[] r6) {
            r0 = 0
            if (r5 == 0) goto L7c
            if (r6 != 0) goto L7
            goto L7c
        L7:
            java.io.File r1 = r5.getParentFile()
            if (r1 == 0) goto L1a
            boolean r2 = r1.exists()
            if (r2 != 0) goto L1a
            boolean r1 = r1.mkdirs()
            if (r1 != 0) goto L1a
            return r0
        L1a:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r5.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r2.write(r6)     // Catch: java.lang.Throwable -> L5f
            r2.flush()     // Catch: java.lang.Throwable -> L5f
            java.io.FileDescriptor r6 = r2.getFD()     // Catch: java.lang.Throwable -> L5f
            r6.sync()     // Catch: java.lang.Throwable -> L5f
            r2.close()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            boolean r5 = r1.renameTo(r5)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            boolean r6 = r1.exists()
            if (r6 == 0) goto L5a
            r1.delete()
        L5a:
            return r5
        L5b:
            r5 = move-exception
            goto L69
        L5d:
            goto L73
        L5f:
            r5 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
        L68:
            throw r5     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
        L69:
            boolean r6 = r1.exists()
            if (r6 == 0) goto L72
            r1.delete()
        L72:
            throw r5
        L73:
            boolean r5 = r1.exists()
            if (r5 == 0) goto L7c
            r1.delete()
        L7c:
            return r0
    }

    public static boolean a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            monitor-enter(r3)     // Catch: java.lang.Exception -> L38
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L20
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L20
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L20
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L22
            r0.mkdir()     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L36
        L22:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L20
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L20
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L30
            r4.createNewFile()     // Catch: java.lang.Throwable -> L20
        L30:
            boolean r4 = a(r4, r5)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            return r4
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Exception -> L38
        L38:
            return r1
    }

    public static boolean a(java.lang.String r0, org.json.JSONObject r1) {
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.toString()
            goto L8
        L7:
            r1 = 0
        L8:
            boolean r0 = c(r0, r1)
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = d()     // Catch: java.lang.Exception -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L29
            if (r1 != 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r1.<init>()     // Catch: java.lang.Exception -> L29
            r1.append(r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Exception -> L29
            r1.append(r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "Android"
            r1.append(r2)     // Catch: java.lang.Exception -> L29
            r1.append(r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = "data"
            r1.append(r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L29
            return r0
        L29:
            java.lang.String r0 = ""
            return r0
    }

    private static java.lang.String c(java.io.RandomAccessFile r6) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            long r1 = r6.length()
            r3 = 4
            long r1 = r1 / r3
            r3 = 4096(0x1000, double:2.0237E-320)
            long r1 = java.lang.Math.max(r3, r1)
            r3 = 65536(0x10000, double:3.2379E-319)
            long r1 = java.lang.Math.min(r1, r3)
            int r2 = (int) r1
            byte[] r1 = new byte[r2]
        L1c:
            r3 = 0
            int r4 = r6.read(r1, r3, r2)
            r5 = -1
            if (r4 == r5) goto L28
            r0.write(r1, r3, r4)
            goto L1c
        L28:
            java.lang.String r6 = new java.lang.String
            byte[] r0 = r0.toByteArray()
            java.lang.String r1 = "UTF-8"
            r6.<init>(r0, r1)
            java.lang.String r6 = c(r6)
            return r6
    }

    private static java.lang.String c(java.lang.String r0) {
            java.lang.String r0 = h(r0)
            return r0
    }

    public static boolean c(java.io.File r5) {
            r0 = 0
            if (r5 == 0) goto L35
            boolean r1 = r5.exists()
            if (r1 != 0) goto La
            goto L35
        La:
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L2c
            boolean r1 = e(r5)
            if (r1 != 0) goto L2c
            java.io.File[] r1 = r5.listFiles()
            if (r1 == 0) goto L2c
            int r2 = r1.length
            r3 = 0
        L1e:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]
            boolean r4 = c(r4)
            if (r4 != 0) goto L29
            return r0
        L29:
            int r3 = r3 + 1
            goto L1e
        L2c:
            boolean r5 = r5.delete()
            if (r5 != 0) goto L33
            return r0
        L33:
            r5 = 1
            return r5
        L35:
            return r0
    }

    public static boolean c(java.lang.String r0, java.lang.String r1) {
            java.io.File r0 = f(r0)
            boolean r0 = a(r0, r1)
            return r0
    }

    private static java.io.File d(java.io.File r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.File r3 = r3.getParentFile()     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = "0"
            java.lang.String r2 = r3.getName()     // Catch: java.lang.Exception -> L1d
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L18
            return r3
        L18:
            java.io.File r3 = d(r3)     // Catch: java.lang.Exception -> L1d
            return r3
        L1d:
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = "/storage/emulated/0"
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L1b
            if (r1 != 0) goto L9
            return r0
        L9:
            r2 = 0
            java.io.File r1 = r1.getExternalFilesDir(r2)     // Catch: java.lang.Exception -> L1b
            if (r1 != 0) goto L11
            return r0
        L11:
            java.io.File r1 = d(r1)     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L1b
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L1b
        L1b:
            return r0
    }

    public static void d(java.lang.String r0) {
            java.io.File r0 = f(r0)
            c(r0)
            return
    }

    private static java.lang.String e(java.lang.String r0) {
            java.lang.String r0 = h(r0)
            return r0
    }

    private static boolean e(java.io.File r7) {
            r0 = 0
            if (r7 == 0) goto L53
            boolean r1 = r7.exists()
            if (r1 != 0) goto La
            goto L53
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L53
            r2 = 26
            r3 = 1
            if (r1 < r2) goto L45
            java.lang.String r1 = "java.nio.file.Files"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = "java.nio.file.Path"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L53
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Exception -> L53
            java.lang.String r5 = "toPath"
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.Exception -> L53
            java.lang.Object r7 = r4.invoke(r7, r6)     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = "isSymbolicLink"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L53
            r5[r0] = r2     // Catch: java.lang.Exception -> L53
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.Exception -> L53
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L53
            r2[r0] = r7     // Catch: java.lang.Exception -> L53
            java.lang.Object r7 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L53
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L53
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L53
            return r7
        L45:
            java.lang.String r1 = r7.getCanonicalPath()     // Catch: java.lang.Exception -> L53
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Exception -> L53
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Exception -> L53
            r7 = r7 ^ r3
            return r7
        L53:
            return r0
    }

    public static java.io.File f(java.lang.String r2) {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L10
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            return r1
        L10:
            r2 = 0
            return r2
    }

    private static boolean f(java.io.File r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.exists()
            if (r0 == 0) goto L10
            boolean r1 = r1.isDirectory()
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.lang.String g(java.io.File r6) {
            boolean r0 = f(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = "r"
            r0.<init>(r6, r2)     // Catch: java.io.IOException -> L1f
            long r2 = r0.length()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            java.lang.String r6 = ""
        L1b:
            r0.close()     // Catch: java.io.IOException -> L1f
            return r6
        L1f:
            r6 = move-exception
            goto L3d
        L21:
            r6 = move-exception
            goto L34
        L23:
            r4 = 655360(0xa0000, double:3.23791E-318)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2f
            java.lang.String r6 = a(r0)     // Catch: java.lang.Throwable -> L21
            goto L1b
        L2f:
            java.lang.String r6 = c(r0)     // Catch: java.lang.Throwable -> L21
            goto L1b
        L34:
            r0.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.io.IOException -> L1f
        L3c:
            throw r6     // Catch: java.io.IOException -> L1f
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Read failed: "
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "FileUtils"
            cn.jiguang.commons.w.a.f(r0, r6)
            return r1
    }

    public static boolean g(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.exists()
            if (r6 == 0) goto L1f
            long r2 = r0.length()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1f
            r6 = 1
            return r6
        L1f:
            return r1
    }

    public static java.lang.String h(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            char[] r2 = r2.toCharArray()
            r0 = 0
        Lc:
            int r1 = r2.length
            if (r0 >= r1) goto L19
            char r1 = r2[r0]
            r1 = r1 ^ 2000(0x7d0, float:2.803E-42)
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L19:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    public static org.json.JSONObject i(java.lang.String r4) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = j(r4)     // Catch: java.lang.Exception -> L1d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L1d
            if (r2 == 0) goto L13
            return r0
        L13:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Exception -> L1d
            r2.<init>(r1)     // Catch: java.lang.Exception -> L1d
            return r2
        L1d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot build "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " into JSONObject, give up read: "
            r2.append(r4)
            java.lang.String r4 = r1.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r1 = "FileUtils"
            cn.jiguang.commons.w.a.a(r1, r4)
            return r0
    }

    public static java.lang.String j(java.lang.String r0) {
            java.io.File r0 = f(r0)
            java.lang.String r0 = g(r0)
            return r0
    }
}
