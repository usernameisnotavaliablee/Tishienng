package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static final char[] a = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            cn.jiguang.u.c.a = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r1.getFilesDir()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "p_an"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String a(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "p_an"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            r1.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = a(r4)     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "[readFromFileDir] error:"
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "FU"
            cn.jiguang.t.b.g(r4, r3)
            return r0
    }

    public static java.lang.String a(java.io.File r4) {
            boolean r0 = r4.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L36
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.io.IOException -> L36
            r3.<init>(r4)     // Catch: java.io.IOException -> L36
            r2.<init>(r3)     // Catch: java.io.IOException -> L36
        L17:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L2a
            r0.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = java.lang.System.lineSeparator()     // Catch: java.lang.Throwable -> L28
            r0.append(r4)     // Catch: java.lang.Throwable -> L28
            goto L17
        L28:
            r4 = move-exception
            goto L38
        L2a:
            r2.close()     // Catch: java.io.IOException -> L36
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.trim()
            return r4
        L36:
            r4 = move-exception
            goto L41
        L38:
            r2.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.io.IOException -> L36
        L40:
            throw r4     // Catch: java.io.IOException -> L36
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[readFile] error: "
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FU"
            cn.jiguang.t.b.g(r0, r4)
            return r1
    }

    public static java.lang.String a(java.lang.String r7) {
            java.lang.String r0 = "FU"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L6f
            r2.<init>(r7)     // Catch: java.lang.Exception -> L6f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L30
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L30
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r4.<init>()     // Catch: java.lang.Throwable -> L30
            r4.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "---- f exists = true, length = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L30
            long r5 = r3.length()     // Catch: java.lang.Throwable -> L30
            r4.append(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L30
        L2c:
            cn.jiguang.t.b.b(r0, r3)     // Catch: java.lang.Throwable -> L30
            goto L44
        L30:
            r3 = move-exception
            goto L66
        L32:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r3.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "---- f exists = false"
            r3.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30
            goto L2c
        L44:
            java.lang.String r3 = cn.jiguang.u.i.f1476c     // Catch: java.lang.Throwable -> L30
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L30
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L30
        L4e:
            int r5 = r2.read(r4)     // Catch: java.lang.Throwable -> L30
            r6 = -1
            if (r5 == r6) goto L5a
            r6 = 0
            r3.update(r4, r6, r5)     // Catch: java.lang.Throwable -> L30
            goto L4e
        L5a:
            byte[] r3 = r3.digest()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = a(r3)     // Catch: java.lang.Throwable -> L30
            r2.close()     // Catch: java.lang.Exception -> L6f
            goto L6f
        L66:
            r2.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Exception -> L6f
        L6e:
            throw r3     // Catch: java.lang.Exception -> L6f
        L6f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "---- MD5 = "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = r2.toString()
            cn.jiguang.t.b.b(r0, r7)
            return r1
    }

    public static java.lang.String a(byte[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        L9:
            int r2 = r4.length
            if (r1 >= r2) goto L25
            char[] r2 = cn.jiguang.u.c.a
            r3 = r4[r1]
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >>> 4
            char r3 = r2[r3]
            r0.append(r3)
            r3 = r4[r1]
            r3 = r3 & 15
            char r2 = r2[r3]
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
        L25:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L2c
            r0.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L2c
            r0.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "p_an"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            r0.append(r2)     // Catch: java.lang.Throwable -> L2c
            r0.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L2c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            a(r3, r4)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveToFileDir error:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FU"
            cn.jiguang.t.b.g(r3, r2)
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void a(java.io.File r3, java.lang.String r4) {
            r0 = 0
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r3.delete()     // Catch: java.lang.Throwable -> L14
            a(r0)
            return
        L14:
            r3 = move-exception
            goto L42
        L16:
            java.io.File r1 = r3.getParentFile()     // Catch: java.lang.Throwable -> L14
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L23
            r1.mkdirs()     // Catch: java.lang.Throwable -> L14
        L23:
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L2c
            r3.createNewFile()     // Catch: java.lang.Throwable -> L14
        L2c:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L14
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            r1.write(r4)     // Catch: java.lang.Throwable -> L40
            r1.flush()     // Catch: java.lang.Throwable -> L40
            a(r1)
            return
        L40:
            r3 = move-exception
            r0 = r1
        L42:
            java.lang.String r4 = "FU"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "[saveToFile] error:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L60
            r1.append(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L60
            cn.jiguang.t.b.g(r4, r3)     // Catch: java.lang.Throwable -> L60
            a(r0)
            return
        L60:
            r3 = move-exception
            a(r0)
            throw r3
    }
}
