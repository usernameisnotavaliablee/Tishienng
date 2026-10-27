package cn.jiguang.q;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1412b = null;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [87, 84, 99} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.q.b.a = r0
            r0 = 20
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [73, 83, 66, 31, 99, 91, 75, 57, 65, 123, 99, 74, 61, 70, 112, 84, 68, 112, 102, 113} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.q.b.f1412b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(android.content.Context r10, java.io.File r11, int r12, int r13, java.lang.String r14) {
            java.lang.String r0 = "PIU"
            r1 = 0
            java.lang.String r2 = cn.jiguang.u.g.a(r10)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = cn.jiguang.u.j.d(r2)     // Catch: java.lang.Exception -> L17
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L1a
            java.lang.String r11 = "process name to md5 failed"
            a(r10, r12, r13, r11)     // Catch: java.lang.Exception -> L17
            return r1
        L17:
            r11 = move-exception
            goto L14f
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17
            r3.<init>()     // Catch: java.lang.Exception -> L17
            r3.append(r2)     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = r11.getName()     // Catch: java.lang.Exception -> L17
            r3.append(r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L17
            java.lang.String r3 = cn.jiguang.u.j.d(r3)     // Catch: java.lang.Exception -> L17
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L17
            if (r4 == 0) goto L3d
            java.lang.String r11 = "process + fileName to md5 failed"
            a(r10, r12, r13, r11)     // Catch: java.lang.Exception -> L17
            return r1
        L3d:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L17
            java.io.File r5 = r11.getParentFile()     // Catch: java.lang.Exception -> L17
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17
            r6.<init>()     // Catch: java.lang.Exception -> L17
            r6.append(r2)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Exception -> L17
            r6.append(r2)     // Catch: java.lang.Exception -> L17
            r6.append(r3)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = ".d"
            r6.append(r2)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Exception -> L17
            r4.<init>(r5, r2)     // Catch: java.lang.Exception -> L17
            boolean r2 = r4.exists()     // Catch: java.lang.Exception -> L17
            if (r2 == 0) goto L68
            r4.delete()     // Catch: java.lang.Exception -> L17
        L68:
            java.io.File r2 = r4.getParentFile()     // Catch: java.lang.Exception -> L17
            r2.mkdirs()     // Catch: java.lang.Exception -> L17
            r4.createNewFile()     // Catch: java.lang.Exception -> L17
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L17
            r2.<init>(r4)     // Catch: java.lang.Exception -> L17
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L92
            r11 = 32
            byte[] r5 = new byte[r11]     // Catch: java.lang.Throwable -> L95
            int r6 = r3.read(r5)     // Catch: java.lang.Throwable -> L95
            if (r6 == r11) goto L98
            java.lang.String r11 = "failed to read MD5 bytes"
            a(r10, r12, r13, r11)     // Catch: java.lang.Throwable -> L95
        L8b:
            r3.close()     // Catch: java.lang.Throwable -> L92
            r2.close()     // Catch: java.lang.Exception -> L17
            return r1
        L92:
            r11 = move-exception
            goto L146
        L95:
            r11 = move-exception
            goto L13d
        L98:
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L95
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L95
            r11.<init>(r5, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r5.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = "Read MD5: "
            r5.append(r7)     // Catch: java.lang.Throwable -> L95
            r5.append(r11)     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L95
            cn.jiguang.t.b.b(r0, r5)     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = cn.jiguang.q.b.f1412b     // Catch: java.lang.Throwable -> L95
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Throwable -> L95
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L95
            byte[] r8 = r11.getBytes(r6)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = cn.jiguang.q.b.a     // Catch: java.lang.Throwable -> L95
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L95
            javax.crypto.spec.IvParameterSpec r8 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L95
            byte[] r14 = r14.getBytes(r6)     // Catch: java.lang.Throwable -> L95
            r8.<init>(r14)     // Catch: java.lang.Throwable -> L95
            r14 = 2
            r5.init(r14, r7, r8)     // Catch: java.lang.Throwable -> L95
            javax.crypto.CipherOutputStream r14 = new javax.crypto.CipherOutputStream     // Catch: java.lang.Throwable -> L95
            r14.<init>(r2, r5)     // Catch: java.lang.Throwable -> L95
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> Le6
        Lda:
            int r6 = r3.read(r5)     // Catch: java.lang.Throwable -> Le6
            r7 = -1
            if (r6 == r7) goto Le8
            r7 = 0
            r14.write(r5, r7, r6)     // Catch: java.lang.Throwable -> Le6
            goto Lda
        Le6:
            r11 = move-exception
            goto L134
        Le8:
            r14.flush()     // Catch: java.lang.Throwable -> Le6
            r14.close()     // Catch: java.lang.Throwable -> L95
            java.lang.String r14 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L95
            java.lang.String r14 = cn.jiguang.u.c.a(r14)     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r5.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = "Calculated file hash: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L95
            r5.append(r14)     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L95
            cn.jiguang.t.b.b(r0, r5)     // Catch: java.lang.Throwable -> L95
            boolean r11 = r11.equals(r14)     // Catch: java.lang.Throwable -> L95
            if (r11 != 0) goto L117
            java.lang.String r11 = "file MD5 not match"
            a(r10, r12, r13, r11)     // Catch: java.lang.Throwable -> L95
            goto L8b
        L117:
            java.lang.String r11 = "Decryption successful"
            cn.jiguang.t.b.b(r0, r11)     // Catch: java.lang.Throwable -> L95
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L95
            r14 = 34
            if (r11 < r14) goto L12d
            android.content.pm.ApplicationInfo r11 = r10.getApplicationInfo()     // Catch: java.lang.Throwable -> L95
            int r11 = r11.targetSdkVersion     // Catch: java.lang.Throwable -> L95
            if (r11 < r14) goto L12d
            r4.setReadOnly()     // Catch: java.lang.Throwable -> L95
        L12d:
            r3.close()     // Catch: java.lang.Throwable -> L92
            r2.close()     // Catch: java.lang.Exception -> L17
            return r4
        L134:
            r14.close()     // Catch: java.lang.Throwable -> L138
            goto L13c
        L138:
            r14 = move-exception
            r11.addSuppressed(r14)     // Catch: java.lang.Throwable -> L95
        L13c:
            throw r11     // Catch: java.lang.Throwable -> L95
        L13d:
            r3.close()     // Catch: java.lang.Throwable -> L141
            goto L145
        L141:
            r14 = move-exception
            r11.addSuppressed(r14)     // Catch: java.lang.Throwable -> L92
        L145:
            throw r11     // Catch: java.lang.Throwable -> L92
        L146:
            r2.close()     // Catch: java.lang.Throwable -> L14a
            goto L14e
        L14a:
            r14 = move-exception
            r11.addSuppressed(r14)     // Catch: java.lang.Exception -> L17
        L14e:
            throw r11     // Catch: java.lang.Exception -> L17
        L14f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "Decode failed: "
            r14.append(r2)
            java.lang.String r2 = r11.getMessage()
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            cn.jiguang.t.b.e(r0, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "decode failed "
            r14.append(r0)
            java.lang.String r11 = r11.getMessage()
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            a(r10, r12, r13, r11)
            return r1
    }

    public static java.io.File a(android.content.Context r1, java.lang.String r2, int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ""
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = a(r2, r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r1 = r1.getFilesDir()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = ".p"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r2)
            return r3
    }

    private static java.lang.String a(java.lang.String r1, java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "."
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    private static void a(android.content.Context r8, int r9, int r10, java.lang.String r11) {
            java.lang.String r0 = "PIU"
            cn.jiguang.t.b.g(r0, r11)
            cn.jiguang.dy.c r1 = cn.jiguang.dy.c.a()
            cn.jiguang.r.a r5 = cn.jiguang.r.a.f1428d
            r6 = 2
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r11
            r1.a(r2, r3, r4, r5, r6, r7)
            return
    }

    public static boolean a(java.io.File r3, cn.jiguang.r.c r4, boolean r5) {
            boolean r0 = r3.exists()
            r1 = 0
            java.lang.String r2 = "PIU"
            if (r0 == 0) goto L60
            boolean r0 = r3.canRead()
            if (r0 != 0) goto L10
            goto L60
        L10:
            if (r5 == 0) goto L5e
            java.lang.String r5 = r4.s
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L20
            java.lang.String r3 = "p M error."
            cn.jiguang.t.b.g(r2, r3)
            return r1
        L20:
            java.lang.String r5 = r3.getAbsolutePath()
            java.lang.String r5 = cn.jiguang.u.c.a(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L34
            java.lang.String r3 = "g p M f."
            cn.jiguang.t.b.g(r2, r3)
            return r1
        L34:
            java.lang.String r0 = r4.s
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L5e
            r3.delete()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "p M not m, c m: "
            r3.append(r0)
            java.lang.String r4 = r4.s
            r3.append(r4)
            java.lang.String r4 = ", b f m:"
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            cn.jiguang.t.b.g(r2, r3)
            return r1
        L5e:
            r3 = 1
            return r3
        L60:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "p :"
            r4.append(r5)
            java.lang.String r3 = r3.getAbsolutePath()
            r4.append(r3)
            java.lang.String r3 = " not."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.t.b.b(r2, r3)
            return r1
    }

    public static java.io.File b(android.content.Context r1, java.lang.String r2, int r3, int r4) {
            if (r1 == 0) goto L62
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ""
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = a(r2, r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r1 = r1.getFilesDir()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = ".p"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "o"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r1, r2)
            boolean r1 = r3.mkdirs()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "getLibPath mkdirs:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "PIU"
            cn.jiguang.t.b.b(r2, r1)
            return r3
        L62:
            r1 = 0
            return r1
    }

    public static java.io.File c(android.content.Context r1, java.lang.String r2, int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ""
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = a(r2, r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r1 = r1.getFilesDir()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = ".p"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "ox"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r1, r2)
            boolean r1 = r3.mkdirs()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "getOptimizedDexPath mkdirs:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "PIU"
            cn.jiguang.t.b.b(r2, r1)
            return r3
    }
}
