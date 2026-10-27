package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    private static final byte[] a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.locks.ReentrantLock> f700b = null;

    public static class a implements java.io.FileFilter {
        public static final cn.jiguang.av.i.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final cn.jiguang.av.i.a f701b = null;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f702c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f703d;

        /* renamed from: e, reason: collision with root package name */
        private final java.lang.String f704e;

        /* renamed from: f, reason: collision with root package name */
        private final int f705f;

        static {
                cn.jiguang.av.i$a r0 = new cn.jiguang.av.i$a
                r1 = 1
                r2 = 0
                r0.<init>(r1, r2)
                cn.jiguang.av.i.a.a = r0
                cn.jiguang.av.i$a r0 = new cn.jiguang.av.i$a
                r0.<init>(r2, r1)
                cn.jiguang.av.i.a.f701b = r0
                return
        }

        public a(boolean r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f702c = r1
                r0.f703d = r2
                r1 = 0
                r0.f704e = r1
                r1 = 0
                r0.f705f = r1
                return
        }

        public a(boolean r1, boolean r2, java.lang.String r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f704e = r3
                r0.f705f = r4
                r0.f702c = r1
                r0.f703d = r2
                return
        }

        public static cn.jiguang.av.i.a a(java.lang.String r4) {
                cn.jiguang.av.i$a r0 = new cn.jiguang.av.i$a
                r1 = 1
                r2 = 3
                r3 = 0
                r0.<init>(r3, r1, r4, r2)
                return r0
        }

        @Override // java.io.FileFilter
        public boolean accept(java.io.File r4) {
                r3 = this;
                boolean r0 = r3.f702c
                r1 = 0
                if (r0 == 0) goto Lc
                boolean r0 = r4.isFile()
                if (r0 != 0) goto Lc
                return r1
            Lc:
                boolean r0 = r3.f703d
                if (r0 == 0) goto L17
                boolean r0 = r4.isDirectory()
                if (r0 != 0) goto L17
                return r1
            L17:
                java.lang.String r0 = r3.f704e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r2 = 1
                if (r0 == 0) goto L21
                return r2
            L21:
                int r0 = r3.f705f
                if (r0 == r2) goto L50
                r2 = 2
                if (r0 == r2) goto L45
                r2 = 3
                if (r0 == r2) goto L3a
                r2 = 4
                if (r0 == r2) goto L2f
                return r1
            L2f:
                java.lang.String r4 = r4.getName()
                java.lang.String r0 = r3.f704e
                boolean r4 = r4.contains(r0)
                return r4
            L3a:
                java.lang.String r4 = r4.getName()
                java.lang.String r0 = r3.f704e
                boolean r4 = r4.equals(r0)
                return r4
            L45:
                java.lang.String r4 = r4.getName()
                java.lang.String r0 = r3.f704e
                boolean r4 = r4.endsWith(r0)
                return r4
            L50:
                java.lang.String r4 = r4.getName()
                java.lang.String r0 = r3.f704e
                boolean r4 = r4.startsWith(r0)
                return r4
        }
    }

    static {
            java.lang.String r0 = "j-c-o-r-e-"
            java.lang.String r0 = h(r0)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            cn.jiguang.av.i.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.av.i.f700b = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(java.io.File[] r9) {
            r0 = 0
            if (r9 == 0) goto L22
            int r1 = r9.length
            if (r1 != 0) goto L7
            goto L22
        L7:
            int r1 = r9.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L22
            r3 = r9[r2]
            if (r0 == 0) goto L14
            long r4 = r0.lastModified()
            goto L16
        L14:
            r4 = 0
        L16:
            long r6 = r3.lastModified()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L1f
            r0 = r3
        L1f:
            int r2 = r2 + 1
            goto L9
        L22:
            return r0
    }

    public static org.json.JSONObject a(java.lang.String r5) {
            java.lang.String r0 = "FileUtils"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r2 = "file_name is null , give up read "
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r2 = move-exception
            goto L26
        L11:
            java.lang.String r2 = e(r5)     // Catch: java.lang.Throwable -> Lf
            boolean r3 = cn.jiguang.av.v.a(r2)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L1c
            return r1
        L1c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            return r3
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "can't build "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " into JsonObject, give up read :"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
            cn.jiguang.w.f.i(r0, r5)
            return r1
    }

    private static void a(java.io.BufferedOutputStream r4, java.lang.String r5) {
            int r0 = r5.length()
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r1) goto L16
            java.lang.String r5 = h(r5)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r0)
            r4.write(r5)
            goto L3a
        L16:
            r0 = 0
        L17:
            int r2 = r5.length()
            if (r0 >= r2) goto L3a
            int r2 = r5.length()
            int r3 = r0 + r1
            int r2 = java.lang.Math.min(r2, r3)
            java.lang.String r0 = r5.substring(r0, r2)
            java.lang.String r0 = h(r0)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r2)
            r4.write(r0)
            r0 = r3
            goto L17
        L3a:
            r4.flush()
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
            r2.createNewFile()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    private static boolean a(java.io.File r7, java.io.File r8) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L43
            r0.<init>(r7)     // Catch: java.io.IOException -> L43
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch: java.io.IOException -> L43
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L21
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L21
            java.nio.channels.FileChannel r6 = r7.getChannel()     // Catch: java.lang.Throwable -> L21
            long r4 = r1.size()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r1.transferTo(r2, r4, r6)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L24
            r6.close()     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r0 = move-exception
            r7 = r0
            goto L37
        L24:
            r7 = 1
            r1.close()     // Catch: java.io.IOException -> L43
            return r7
        L29:
            r0 = move-exception
            r7 = r0
            if (r6 == 0) goto L36
            r6.close()     // Catch: java.lang.Throwable -> L31
            goto L36
        L31:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L21
        L36:
            throw r7     // Catch: java.lang.Throwable -> L21
        L37:
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)     // Catch: java.io.IOException -> L43
        L42:
            throw r7     // Catch: java.io.IOException -> L43
        L43:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Copy failed: "
            r8.append(r0)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FileUtils"
            cn.jiguang.w.f.i(r8, r7)
            r7 = 0
            return r7
    }

    public static boolean a(java.io.File r5, java.lang.String r6) {
            r0 = 0
            java.lang.String r1 = "FileUtils"
            if (r5 == 0) goto L5e
            boolean r2 = r5.isDirectory()
            if (r2 == 0) goto Lc
            goto L5e
        Lc:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L18
            java.lang.String r5 = "Append data should not be empty"
        L14:
            cn.jiguang.w.f.i(r1, r5)
            return r0
        L18:
            a(r5)     // Catch: java.io.IOException -> L30
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.io.IOException -> L30
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.io.IOException -> L30
            r4 = 1
            r3.<init>(r5, r4)     // Catch: java.io.IOException -> L30
            r2.<init>(r3)     // Catch: java.io.IOException -> L30
            r2.write(r6)     // Catch: java.lang.Throwable -> L32
            r2.flush()     // Catch: java.lang.Throwable -> L32
            r2.close()     // Catch: java.io.IOException -> L30
            return r4
        L30:
            r6 = move-exception
            goto L3c
        L32:
            r6 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r2 = move-exception
            r6.addSuppressed(r2)     // Catch: java.io.IOException -> L30
        L3b:
            throw r6     // Catch: java.io.IOException -> L30
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to append to file: "
            r2.append(r3)
            java.lang.String r5 = r5.getAbsolutePath()
            r2.append(r5)
            java.lang.String r5 = ". Exception: "
            r2.append(r5)
            java.lang.String r5 = r6.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            goto L14
        L5e:
            java.lang.String r5 = "File should not be null or a directory"
            goto L14
    }

    private static boolean a(java.io.RandomAccessFile r6) {
            long r0 = r6.length()
            byte[] r2 = cn.jiguang.av.i.a
            int r3 = r2.length
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto Le
            r6 = 0
            return r6
        Le:
            int r0 = r2.length
            byte[] r0 = new byte[r0]
            r3 = 0
            r6.seek(r3)
            r6.readFully(r0)
            boolean r6 = java.util.Arrays.equals(r0, r2)
            return r6
    }

    private static boolean a(java.io.RandomAccessFile r4, java.lang.String r5) {
            r0 = 0
            long r1 = r4.length()     // Catch: java.lang.Exception -> L2d
            r4.seek(r1)     // Catch: java.lang.Exception -> L2d
            r1 = 0
        L9:
            int r2 = r5.length()     // Catch: java.lang.Exception -> L2d
            if (r1 >= r2) goto L2f
            int r2 = r5.length()     // Catch: java.lang.Exception -> L2d
            r3 = 65536(0x10000, float:9.1835E-41)
            int r3 = r3 + r1
            int r2 = java.lang.Math.min(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = r5.substring(r1, r2)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = h(r1)     // Catch: java.lang.Exception -> L2d
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L2d
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L2d
            r4.write(r1)     // Catch: java.lang.Exception -> L2d
            r1 = r3
            goto L9
        L2d:
            r4 = move-exception
            goto L31
        L2f:
            r4 = 1
            return r4
        L31:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Append encrypted failed: "
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FileUtils"
            cn.jiguang.w.f.i(r5, r4)
            return r0
    }

    public static boolean a(java.lang.String r0, java.lang.String r1) {
            java.io.File r0 = c(r0)
            boolean r0 = b(r0, r1)
            return r0
    }

    public static boolean a(java.lang.String r0, org.json.JSONArray r1) {
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.toString()
            goto L8
        L7:
            r1 = 0
        L8:
            boolean r0 = a(r0, r1)
            return r0
    }

    public static boolean a(java.lang.String r0, org.json.JSONObject r1) {
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.toString()
            goto L8
        L7:
            r1 = 0
        L8:
            boolean r0 = a(r0, r1)
            return r0
    }

    public static java.io.File[] a(java.io.File r8, java.io.FileFilter... r9) {
            r0 = 0
            if (r8 == 0) goto L7a
            boolean r1 = r8.exists()
            if (r1 == 0) goto L7a
            boolean r1 = r8.isDirectory()
            if (r1 != 0) goto L11
            goto L7a
        L11:
            if (r9 == 0) goto L75
            int r1 = r9.length
            if (r1 == 0) goto L75
            int r1 = r9.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L20
            r1 = r9[r3]
            if (r1 != 0) goto L20
            goto L75
        L20:
            int r1 = r9.length
            if (r1 != r2) goto L2a
            r9 = r9[r3]
            java.io.File[] r8 = r8.listFiles(r9)
            return r8
        L2a:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.add(r8)
            int r8 = r9.length
            r2 = 0
        L34:
            if (r2 >= r8) goto L6c
            r4 = r9[r2]
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r1.next()
            java.io.File r6 = (java.io.File) r6
            if (r4 == 0) goto L54
            java.io.File[] r6 = r6.listFiles(r4)
            goto L58
        L54:
            java.io.File[] r6 = r6.listFiles()
        L58:
            if (r6 == 0) goto L41
            int r7 = r6.length
            if (r7 <= 0) goto L41
            java.util.Collections.addAll(r5, r6)
            goto L41
        L61:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L68
            return r0
        L68:
            int r2 = r2 + 1
            r1 = r5
            goto L34
        L6c:
            java.io.File[] r8 = new java.io.File[r3]
            java.lang.Object[] r8 = r1.toArray(r8)
            java.io.File[] r8 = (java.io.File[]) r8
            return r8
        L75:
            java.io.File[] r8 = r8.listFiles()
            return r8
        L7a:
            return r0
    }

    public static java.io.File[] a(java.lang.String r1, java.io.FileFilter... r2) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            java.io.File[] r1 = a(r0, r2)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = 0
            return r1
    }

    public static org.json.JSONArray b(java.lang.String r5) {
            java.lang.String r0 = "FileUtils"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r2 = "file_name is null , give up read "
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r2 = move-exception
            goto L26
        L11:
            java.lang.String r2 = e(r5)     // Catch: java.lang.Throwable -> Lf
            boolean r3 = cn.jiguang.av.v.a(r2)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L1c
            return r1
        L1c:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            return r3
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "can't build "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " into JSONArray, give up read :"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
            cn.jiguang.w.f.i(r0, r5)
            return r1
    }

    public static boolean b(java.io.File r5) {
            r0 = 0
            if (r5 == 0) goto L35
            boolean r1 = r5.exists()
            if (r1 != 0) goto La
            goto L35
        La:
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L2c
            boolean r1 = d(r5)
            if (r1 != 0) goto L2c
            java.io.File[] r1 = r5.listFiles()
            if (r1 == 0) goto L2c
            int r2 = r1.length
            r3 = 0
        L1e:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]
            boolean r4 = b(r4)
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

    public static boolean b(java.io.File r7, java.lang.String r8) {
            java.lang.String r0 = "FileUtils"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto Ld
            boolean r7 = b(r7)
            return r7
        Ld:
            a(r7)
            java.lang.String r1 = r7.getAbsolutePath()
            java.util.concurrent.locks.ReentrantLock r1 = f(r1)
            r2 = 0
            r3 = 0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            r5 = 10
            boolean r1 = r1.tryLock(r5, r4)     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            if (r1 != 0) goto L33
            java.lang.String r8 = "save Failed to acquire file lock within timeout"
            cn.jiguang.w.f.i(r0, r8)     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.lang.String r7 = r7.getAbsolutePath()
            g(r7)
            return r2
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.lang.String r4 = r7.getParent()     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            r5.<init>()     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.lang.String r6 = r7.getName()     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            r5.append(r6)     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.lang.String r6 = ".tmp"
            r5.append(r6)     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L31 java.lang.InterruptedException -> Lc6
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
            r5 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
            byte[] r4 = cn.jiguang.av.i.a     // Catch: java.lang.Throwable -> L74
            r3.write(r4)     // Catch: java.lang.Throwable -> L74
            a(r3, r8)     // Catch: java.lang.Throwable -> L74
            boolean r8 = r1.renameTo(r7)     // Catch: java.lang.Throwable -> L74
            if (r8 != 0) goto L76
            boolean r8 = a(r1, r7)     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L72
            goto L76
        L72:
            r8 = 0
            goto L77
        L74:
            r8 = move-exception
            goto L90
        L76:
            r8 = 1
        L77:
            r3.close()     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
            java.lang.String r7 = r7.getAbsolutePath()
            g(r7)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L8a
            r1.delete()
        L8a:
            return r8
        L8b:
            r8 = move-exception
            r3 = r1
            goto L99
        L8e:
            r3 = r1
            goto Lc6
        L90:
            r3.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r3 = move-exception
            r8.addSuppressed(r3)     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
        L98:
            throw r8     // Catch: java.lang.Throwable -> L8b java.lang.InterruptedException -> L8e
        L99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = "save fail: "
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> Lc4
            r1.append(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            cn.jiguang.w.f.i(r0, r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r7.getAbsolutePath()
            g(r7)
            if (r3 == 0) goto Lc3
            boolean r7 = r3.exists()
            if (r7 == 0) goto Lc3
            r3.delete()
        Lc3:
            return r2
        Lc4:
            r8 = move-exception
            goto Lde
        Lc6:
            java.lang.String r8 = "save Thread interrupted while waiting for file lock"
            cn.jiguang.w.f.i(r0, r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r7.getAbsolutePath()
            g(r7)
            if (r3 == 0) goto Ldd
            boolean r7 = r3.exists()
            if (r7 == 0) goto Ldd
            r3.delete()
        Ldd:
            return r2
        Lde:
            java.lang.String r7 = r7.getAbsolutePath()
            g(r7)
            if (r3 == 0) goto Lf0
            boolean r7 = r3.exists()
            if (r7 == 0) goto Lf0
            r3.delete()
        Lf0:
            throw r8
    }

    public static boolean b(java.lang.String r0, java.lang.String r1) {
            java.io.File r0 = c(r0)
            boolean r0 = c(r0, r1)
            return r0
    }

    public static java.io.File c(java.lang.String r2) {
            android.content.Context r0 = cn.jiguang.av.c.a()
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L10
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            return r1
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "can't get file :"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "FileUtils"
            cn.jiguang.w.f.i(r0, r2)
            r2 = 0
            return r2
    }

    public static java.lang.String c(java.io.File r15) {
            java.lang.String r0 = "read fail: "
            boolean r1 = e(r15)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            long r3 = r15.length()
            r5 = 10485760(0xa00000, double:5.180654E-317)
            java.lang.String r1 = "FileUtils"
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "File too large to read: "
            r0.append(r3)
            java.lang.String r3 = r15.getAbsolutePath()
            r0.append(r3)
            java.lang.String r3 = ", size: "
            r0.append(r3)
            long r3 = r15.length()
            r0.append(r3)
            java.lang.String r15 = r0.toString()
            cn.jiguang.w.f.i(r1, r15)
            return r2
        L3c:
            java.lang.String r3 = r15.getAbsolutePath()
            java.util.concurrent.locks.ReentrantLock r3 = f(r3)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L5b java.lang.OutOfMemoryError -> L5f
            r5 = 10
            boolean r3 = r3.tryLock(r5, r4)     // Catch: java.lang.Throwable -> L5b java.lang.OutOfMemoryError -> L5f
            if (r3 != 0) goto L62
            java.lang.String r3 = "read2String Failed to acquire file lock within timeout"
            cn.jiguang.w.f.i(r1, r3)     // Catch: java.lang.Throwable -> L5b java.lang.OutOfMemoryError -> L5f
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        L5b:
            r3 = move-exception
            r4 = r2
            goto L180
        L5f:
            r3 = r2
            goto L1c7
        L62:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5b java.lang.OutOfMemoryError -> L5f
            r3.<init>(r15)     // Catch: java.lang.Throwable -> L5b java.lang.OutOfMemoryError -> L5f
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: java.lang.Throwable -> L5b java.lang.OutOfMemoryError -> L5f
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            byte[] r6 = cn.jiguang.av.i.a     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            int r7 = r6.length     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            int r8 = r6.length     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r10 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 < 0) goto L9b
            int r8 = r6.length     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r3.read(r8)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r8.flip()     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r8.get(r7)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            boolean r8 = java.util.Arrays.equals(r7, r6)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            if (r8 == 0) goto L99
            int r6 = r6.length     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            long r12 = (long) r6     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            goto L9d
        L93:
            r4 = move-exception
            r14 = r4
            r4 = r3
            r3 = r14
            goto L180
        L99:
            r12 = r10
            goto L9d
        L9b:
            r8 = 0
            goto L99
        L9d:
            long r4 = r4 - r12
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto Le2
            if (r8 == 0) goto La7
            java.lang.String r2 = ""
            goto Laf
        La7:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r2 = r4
        Laf:
            r3.close()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        Lba:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r4.<init>()     // Catch: java.lang.Throwable -> Ld9
            r4.append(r0)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> Ld9
            r4.append(r0)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Ld9
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        Ld9:
            r0 = move-exception
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            throw r0
        Le2:
            int r5 = (int) r4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r5)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r3.position(r12)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r3.read(r4)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r4.flip()     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            int r5 = r4.remaining()     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r4.get(r5)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            if (r8 == 0) goto L139
            java.lang.String r2 = h(r4)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r3.close()     // Catch: java.lang.Throwable -> L111
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        L111:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L130
            r4.<init>()     // Catch: java.lang.Throwable -> L130
            r4.append(r0)     // Catch: java.lang.Throwable -> L130
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L130
            r4.append(r0)     // Catch: java.lang.Throwable -> L130
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L130
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L130
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        L130:
            r0 = move-exception
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            throw r0
        L139:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r5.<init>()     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r8.<init>(r7, r6)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r5.append(r8)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r5.append(r4)     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L93 java.lang.OutOfMemoryError -> L1c7
            r3.close()     // Catch: java.lang.Throwable -> L158
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        L158:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L177
            r4.<init>()     // Catch: java.lang.Throwable -> L177
            r4.append(r0)     // Catch: java.lang.Throwable -> L177
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L177
            r4.append(r0)     // Catch: java.lang.Throwable -> L177
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L177
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L177
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            return r2
        L177:
            r0 = move-exception
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            throw r0
        L180:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c5
            r5.<init>()     // Catch: java.lang.Throwable -> L1c5
            r5.append(r0)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L1c5
            r5.append(r3)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L1c5
            cn.jiguang.w.f.i(r1, r3)     // Catch: java.lang.Throwable -> L1c5
            if (r4 == 0) goto L1b3
            r4.close()     // Catch: java.lang.Throwable -> L19c
            goto L1b3
        L19c:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bb
            r4.<init>()     // Catch: java.lang.Throwable -> L1bb
            r4.append(r0)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L1bb
            r4.append(r0)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L1bb
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L1bb
        L1b3:
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            goto L1c4
        L1bb:
            r0 = move-exception
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            throw r0
        L1c4:
            return r2
        L1c5:
            r2 = move-exception
            goto L210
        L1c7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20e
            r4.<init>()     // Catch: java.lang.Throwable -> L20e
            java.lang.String r5 = "Out of memory reading file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r5 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> L20e
            r4.append(r5)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L20e
            cn.jiguang.w.f.i(r1, r4)     // Catch: java.lang.Throwable -> L20e
            if (r3 == 0) goto L1fc
            r3.close()     // Catch: java.lang.Throwable -> L1e5
            goto L1fc
        L1e5:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L204
            r4.<init>()     // Catch: java.lang.Throwable -> L204
            r4.append(r0)     // Catch: java.lang.Throwable -> L204
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L204
            r4.append(r0)     // Catch: java.lang.Throwable -> L204
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L204
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L204
        L1fc:
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            goto L20d
        L204:
            r0 = move-exception
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            throw r0
        L20d:
            return r2
        L20e:
            r2 = move-exception
            r4 = r3
        L210:
            if (r4 == 0) goto L22d
            r4.close()     // Catch: java.lang.Throwable -> L216
            goto L22d
        L216:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L235
            r4.<init>()     // Catch: java.lang.Throwable -> L235
            r4.append(r0)     // Catch: java.lang.Throwable -> L235
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L235
            r4.append(r0)     // Catch: java.lang.Throwable -> L235
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L235
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L235
        L22d:
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            goto L23e
        L235:
            r0 = move-exception
            java.lang.String r15 = r15.getAbsolutePath()
            g(r15)
            throw r0
        L23e:
            throw r2
    }

    public static void c(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "FileUtils"
            java.io.File r1 = c(r5)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L98
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L10
            goto L98
        L10:
            java.io.File r5 = c(r6)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L2e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r5.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Cannot create temp file: "
            r5.append(r1)     // Catch: java.lang.Throwable -> L2b
            r5.append(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2b
        L27:
            cn.jiguang.w.f.i(r0, r5)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r5 = move-exception
            goto Lab
        L2e:
            a(r5)     // Catch: java.lang.Throwable -> L2b
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L60
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L60
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L62
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L62
            long r3 = r1.length()     // Catch: java.lang.Throwable -> L54
            int r1 = (int) r3     // Catch: java.lang.Throwable -> L54
            r3 = 65536(0x10000, float:9.1835E-41)
            int r1 = java.lang.Math.min(r3, r1)     // Catch: java.lang.Throwable -> L54
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L54
        L48:
            int r3 = r6.read(r1)     // Catch: java.lang.Throwable -> L54
            r4 = -1
            if (r3 == r4) goto L56
            r4 = 0
            r2.write(r1, r4, r3)     // Catch: java.lang.Throwable -> L54
            goto L48
        L54:
            r1 = move-exception
            goto L64
        L56:
            r2.flush()     // Catch: java.lang.Throwable -> L54
            r2.close()     // Catch: java.lang.Throwable -> L62
            r6.close()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L60
            goto Lc3
        L60:
            r6 = move-exception
            goto L76
        L62:
            r1 = move-exception
            goto L6d
        L64:
            r2.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L62
        L6c:
            throw r1     // Catch: java.lang.Throwable -> L62
        L6d:
            r6.close()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r6 = move-exception
            r1.addSuppressed(r6)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L60
        L75:
            throw r1     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L60
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "Copy file failed: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L2b
            r1.append(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.w.f.i(r0, r6)     // Catch: java.lang.Throwable -> L2b
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto Lc3
            r5.delete()     // Catch: java.lang.Throwable -> L2b
            goto Lc3
        L98:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r6.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Source file does not exist: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L2b
            r6.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L2b
            goto L27
        Lab:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "copyFileToTemp error: "
            r6.append(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.w.f.i(r0, r5)
        Lc3:
            return
    }

    public static boolean c(java.io.File r7, java.lang.String r8) {
            java.lang.String r0 = "FileUtils"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            a(r7)
            java.lang.String r1 = r7.getAbsolutePath()
            java.util.concurrent.locks.ReentrantLock r3 = f(r1)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L28
            r5 = 10
            boolean r3 = r3.tryLock(r5, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L2a
            java.lang.String r7 = "append Failed to acquire file lock within timeout"
            cn.jiguang.w.f.i(r0, r7)     // Catch: java.lang.Throwable -> L28
            g(r1)
            return r2
        L28:
            r7 = move-exception
            goto L58
        L2a:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "rw"
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L28
            boolean r4 = a(r3)     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L44
            boolean r7 = a(r3, r8)     // Catch: java.lang.Throwable -> L42
            r3.close()     // Catch: java.lang.Throwable -> L28
            g(r1)
            return r7
        L42:
            r7 = move-exception
            goto L4f
        L44:
            boolean r7 = d(r7, r8)     // Catch: java.lang.Throwable -> L42
            r3.close()     // Catch: java.lang.Throwable -> L28
            g(r1)
            return r7
        L4f:
            r3.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L28
        L57:
            throw r7     // Catch: java.lang.Throwable -> L28
        L58:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "append fail: "
            r8.append(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L74
            r8.append(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L74
            cn.jiguang.w.f.i(r0, r7)     // Catch: java.lang.Throwable -> L74
            g(r1)
            return r2
        L74:
            r7 = move-exception
            g(r1)
            throw r7
    }

    private static boolean d(java.io.File r3) {
            r0 = 0
            if (r3 == 0) goto L28
            boolean r1 = r3.exists()
            if (r1 != 0) goto La
            goto L28
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r2 = 26
            if (r1 < r2) goto L19
            java.nio.file.Path r3 = cn.jiguang.av.c0.a(r3)     // Catch: java.lang.Throwable -> L28
            boolean r3 = cn.jiguang.av.d0.a(r3)     // Catch: java.lang.Throwable -> L28
            return r3
        L19:
            java.lang.String r1 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L28
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L28
            r3 = r3 ^ 1
            return r3
        L28:
            return r0
    }

    private static boolean d(java.io.File r8, java.lang.String r9) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r8.getParent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r8.getName()
            r2.append(r3)
            java.lang.String r3 = ".tmp"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            byte[] r3 = cn.jiguang.av.i.a     // Catch: java.lang.Throwable -> L70
            r2.write(r3)     // Catch: java.lang.Throwable -> L70
            boolean r3 = r8.exists()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L7b
            long r3 = r8.length()     // Catch: java.lang.Throwable -> L70
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L7b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L70
            long r4 = r8.length()     // Catch: java.lang.Throwable -> L6a
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L6a
            r4 = 65536(0x10000, float:9.1835E-41)
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L6a
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L6a
        L50:
            int r5 = r3.read(r4)     // Catch: java.lang.Throwable -> L6a
            r6 = -1
            if (r5 == r6) goto L6c
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L6a
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r4, r1, r5, r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = h(r6)     // Catch: java.lang.Throwable -> L6a
            byte[] r5 = r5.getBytes(r7)     // Catch: java.lang.Throwable -> L6a
            r2.write(r5)     // Catch: java.lang.Throwable -> L6a
            goto L50
        L6a:
            r8 = move-exception
            goto L72
        L6c:
            r3.close()     // Catch: java.lang.Throwable -> L70
            goto L7b
        L70:
            r8 = move-exception
            goto Laa
        L72:
            r3.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L70
        L7a:
            throw r8     // Catch: java.lang.Throwable -> L70
        L7b:
            java.lang.String r9 = h(r9)     // Catch: java.lang.Throwable -> L70
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L70
            byte[] r9 = r9.getBytes(r3)     // Catch: java.lang.Throwable -> L70
            r2.write(r9)     // Catch: java.lang.Throwable -> L70
            r2.flush()     // Catch: java.lang.Throwable -> L70
            r2.close()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            boolean r9 = r0.renameTo(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r9 != 0) goto L9f
            boolean r8 = a(r0, r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r8 == 0) goto La0
            goto L9f
        L9b:
            r8 = move-exception
            goto Ld7
        L9d:
            r8 = move-exception
            goto Lb3
        L9f:
            r1 = 1
        La0:
            boolean r8 = r0.exists()
            if (r8 == 0) goto La9
            r0.delete()
        La9:
            return r1
        Laa:
            r2.close()     // Catch: java.lang.Throwable -> Lae
            goto Lb2
        Lae:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
        Lb2:
            throw r8     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
        Lb3:
            java.lang.String r9 = "FileUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "Rebuild file failed: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L9b
            r2.append(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.w.f.i(r9, r8)     // Catch: java.lang.Throwable -> L9b
            boolean r8 = r0.exists()
            if (r8 == 0) goto Ld6
            r0.delete()
        Ld6:
            return r1
        Ld7:
            boolean r9 = r0.exists()
            if (r9 == 0) goto Le0
            r0.delete()
        Le0:
            throw r8
    }

    public static boolean d(java.lang.String r0) {
            java.io.File r0 = c(r0)
            boolean r0 = b(r0)
            return r0
    }

    public static java.lang.String e(java.lang.String r0) {
            java.io.File r0 = c(r0)
            java.lang.String r0 = c(r0)
            return r0
    }

    private static boolean e(java.io.File r1) {
            if (r1 == 0) goto L11
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto L11
            boolean r1 = r1.exists()
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    private static java.util.concurrent.locks.ReentrantLock f(java.lang.String r2) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.locks.ReentrantLock> r0 = cn.jiguang.av.i.f700b
            java.lang.Object r1 = r0.get(r2)
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1
            if (r1 != 0) goto L18
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            java.lang.Object r2 = r0.putIfAbsent(r2, r1)
            java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2
            if (r2 == 0) goto L18
            return r2
        L18:
            return r1
    }

    private static void g(java.lang.String r2) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.locks.ReentrantLock> r0 = cn.jiguang.av.i.f700b
            java.lang.Object r0 = r0.get(r2)
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            if (r0 == 0) goto L2b
            boolean r1 = r0.isHeldByCurrentThread()
            if (r1 == 0) goto L1a
        L10:
            int r1 = r0.getHoldCount()
            if (r1 <= 0) goto L1a
            r0.unlock()
            goto L10
        L1a:
            boolean r1 = r0.hasQueuedThreads()
            if (r1 != 0) goto L2b
            int r1 = r0.getHoldCount()
            if (r1 != 0) goto L2b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.locks.ReentrantLock> r1 = cn.jiguang.av.i.f700b
            r1.remove(r2, r0)
        L2b:
            return
    }

    private static java.lang.String h(java.lang.String r2) {
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
}
