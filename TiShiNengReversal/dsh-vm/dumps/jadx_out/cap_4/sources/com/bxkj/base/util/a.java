package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static java.lang.String a = "AES/ECB/PKCS5Padding";
    private static int b = 24;

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r4, @androidx.annotation.NonNull java.lang.String r5) throws java.lang.Exception {
            java.lang.String r0 = "utf-8"
            r1 = 0
            int r2 = r5.length()     // Catch: java.lang.Exception -> L19
            r3 = 16
            if (r2 == r3) goto L1b
            r3 = 24
            if (r2 == r3) goto L1b
            r3 = 32
            if (r2 == r3) goto L1b
            java.lang.String r4 = "长度必须为16/24/32"
            com.orhanobut.logger.j.c(r4)     // Catch: java.lang.Exception -> L19
            return r1
        L19:
            r4 = move-exception
            goto L47
        L1b:
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Exception -> L19
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "AES"
            r2.<init>(r5, r3)     // Catch: java.lang.Exception -> L19
            java.lang.String r5 = com.bxkj.base.util.a.a     // Catch: java.lang.Exception -> L19
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Exception -> L19
            r3 = 2
            r5.init(r3, r2)     // Catch: java.lang.Exception -> L19
            byte[] r4 = cn.bluemobi.dylan.base.utils.b.a(r4)     // Catch: java.lang.Exception -> L19
            byte[] r4 = r5.doFinal(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L3e
            r5.<init>(r4, r0)     // Catch: java.lang.Exception -> L3e
            return r5
        L3e:
            r4 = move-exception
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L19
            com.orhanobut.logger.j.c(r4)     // Catch: java.lang.Exception -> L19
            return r1
        L47:
            java.lang.String r4 = r4.toString()
            com.orhanobut.logger.j.c(r4)
            return r1
    }

    public static java.lang.String b(java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) throws java.lang.Exception {
            int r0 = r4.length()
            r1 = 16
            if (r0 == r1) goto L17
            r1 = 24
            if (r0 == r1) goto L17
            r1 = 32
            if (r0 == r1) goto L17
            java.lang.String r3 = "长度必须为16/24/32"
            com.orhanobut.logger.j.c(r3)
            r3 = 0
            return r3
        L17:
            java.lang.String r0 = "utf-8"
            byte[] r4 = r4.getBytes(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r1.<init>(r4, r2)
            java.lang.String r4 = com.bxkj.base.util.a.a
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)
            r2 = 1
            r4.init(r2, r1)
            byte[] r3 = r3.getBytes(r0)
            byte[] r3 = r4.doFinal(r3)
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.b.b(r3)
            return r3
    }

    public static java.lang.String c(int r5) {
            r0 = 16
            if (r5 == r0) goto L13
            r0 = 24
            if (r5 == r0) goto L13
            r0 = 32
            if (r5 == r0) goto L13
            java.lang.String r5 = "长度必须为16/24/32"
            com.orhanobut.logger.j.c(r5)
            r5 = 0
            return r5
        L13:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L1e:
            if (r2 >= r5) goto L32
            r3 = 62
            int r3 = r0.nextInt(r3)
            java.lang.String r4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            char r3 = r4.charAt(r3)
            r1.append(r3)
            int r2 = r2 + 1
            goto L1e
        L32:
            java.lang.String r5 = r1.toString()
            return r5
    }

    public static void d(java.lang.String[] r3) {
            int r3 = com.bxkj.base.util.a.b
            java.lang.String r3 = c(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "随机生成的key："
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            java.lang.String r0 = "{'fig':1,'message':'登录成功'}"
            java.lang.String r0 = b(r0, r3)     // Catch: java.lang.Exception -> L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4c
            r1.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "加密后的数据："
            r1.append(r2)     // Catch: java.lang.Exception -> L4c
            r1.append(r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L4c
            com.orhanobut.logger.j.c(r1)     // Catch: java.lang.Exception -> L4c
            java.lang.String r3 = a(r0, r3)     // Catch: java.lang.Exception -> L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4c
            r0.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = "解密后的数据："
            r0.append(r1)     // Catch: java.lang.Exception -> L4c
            r0.append(r3)     // Catch: java.lang.Exception -> L4c
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L4c
            com.orhanobut.logger.j.c(r3)     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }
}
