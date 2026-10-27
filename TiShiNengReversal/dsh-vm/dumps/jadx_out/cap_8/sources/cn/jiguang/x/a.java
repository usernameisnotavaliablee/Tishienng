package cn.jiguang.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1547b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f1548c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> f1549d = null;


    static {
            java.lang.String r0 = cn.jiguang.av.t.f719d
            cn.jiguang.x.a.a = r0
            java.lang.String r1 = cn.jiguang.av.t.f720e
            cn.jiguang.x.a.f1547b = r1
            cn.jiguang.x.a.f1548c = r0
            cn.jiguang.x.a$1 r0 = new cn.jiguang.x.a$1
            r0.<init>()
            cn.jiguang.x.a.f1549d = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static javax.crypto.Cipher a() {
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = cn.jiguang.x.a.f1549d
            java.lang.Object r1 = r0.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            if (r1 != 0) goto L2f
            java.lang.String r2 = cn.jiguang.x.a.f1547b     // Catch: java.lang.Exception -> L14
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Exception -> L14
            r0.set(r1)     // Catch: java.lang.Exception -> L14
            return r1
        L14:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to recreate Cipher: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "CryptoUtils"
            cn.jiguang.w.f.i(r2, r0)
        L2f:
            return r1
    }

    private static void a(int r6, java.lang.String r7, java.io.File r8, java.io.File r9) {
            r0 = 16
            r1 = 0
            java.lang.String r0 = r7.substring(r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "doCrypto cipherMode is "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", key is "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", IvParameterSpec is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", inputFile is "
            r2.append(r3)
            java.lang.String r3 = r8.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = ", outputFile is "
            r2.append(r3)
            java.lang.String r3 = r9.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CryptoUtils"
            cn.jiguang.w.f.c(r3, r2)
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L68
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L68
            byte[] r7 = r7.getBytes(r4)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = cn.jiguang.x.a.f1548c     // Catch: java.lang.Exception -> L68
            r2.<init>(r7, r5)     // Catch: java.lang.Exception -> L68
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L68
            byte[] r0 = r0.getBytes(r4)     // Catch: java.lang.Exception -> L68
            r7.<init>(r0)     // Catch: java.lang.Exception -> L68
            javax.crypto.Cipher r0 = a()     // Catch: java.lang.Exception -> L68
            if (r0 != 0) goto L6a
            java.lang.String r0 = cn.jiguang.x.a.f1547b     // Catch: java.lang.Exception -> L68
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Exception -> L68
            goto L6a
        L68:
            r6 = move-exception
            goto Lc7
        L6a:
            r0.init(r6, r2, r7)     // Catch: java.lang.Exception -> L68
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L68
            r6.<init>(r8)     // Catch: java.lang.Exception -> L68
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La9
            r7.<init>()     // Catch: java.lang.Throwable -> La9
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L8c
        L7b:
            int r2 = r6.read(r8)     // Catch: java.lang.Throwable -> L8c
            r4 = -1
            if (r2 == r4) goto L8e
            byte[] r2 = r0.update(r8, r1, r2)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L7b
            r7.write(r2)     // Catch: java.lang.Throwable -> L8c
            goto L7b
        L8c:
            r8 = move-exception
            goto Lb5
        L8e:
            byte[] r8 = r0.doFinal()     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L97
            r7.write(r8)     // Catch: java.lang.Throwable -> L8c
        L97:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L8c
            r7.writeTo(r8)     // Catch: java.lang.Throwable -> Lab
            r8.close()     // Catch: java.lang.Throwable -> L8c
            r7.close()     // Catch: java.lang.Throwable -> La9
            r6.close()     // Catch: java.lang.Exception -> L68
            return
        La9:
            r7 = move-exception
            goto Lbe
        Lab:
            r9 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L8c
        Lb4:
            throw r9     // Catch: java.lang.Throwable -> L8c
        Lb5:
            r7.close()     // Catch: java.lang.Throwable -> Lb9
            goto Lbd
        Lb9:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> La9
        Lbd:
            throw r8     // Catch: java.lang.Throwable -> La9
        Lbe:
            r6.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.lang.Exception -> L68
        Lc6:
            throw r7     // Catch: java.lang.Exception -> L68
        Lc7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Error encrypting/decrypting file, error message is "
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.b(r3, r7, r6)
            return
    }

    public static void a(java.lang.String r1, java.io.File r2, java.io.File r3) {
            r0 = 1
            a(r0, r1, r2, r3)
            return
    }
}
