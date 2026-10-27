package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.a.C0056a a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = null;
    private static final int c = 0;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String e = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAESUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AESUtils.kt\ncom/bxkj/base/v2/common/utils/AESUtils$Companion\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,146:1\n106#2:147\n78#2,22:148\n*S KotlinDebug\n*F\n+ 1 AESUtils.kt\ncom/bxkj/base/v2/common/utils/AESUtils$Companion\n*L\n138#1:147\n138#1:148,22\n*E\n"})
    /* renamed from: com.bxkj.base.v2.common.utils.a$a, reason: collision with other inner class name */
    public static final class C0056a {
        private C0056a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0056a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String a(@org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) throws java.lang.Exception {
                r4 = this;
                java.lang.String r0 = "forName(...)"
                java.lang.String r1 = "key"
                kotlin.jvm.internal.g0.p(r6, r1)
                r1 = 0
                int r2 = r6.length()     // Catch: java.lang.Exception -> L1e
                r3 = 16
                if (r2 == r3) goto L20
                r3 = 24
                if (r2 == r3) goto L20
                r3 = 32
                if (r2 == r3) goto L20
                java.io.PrintStream r5 = java.lang.System.out     // Catch: java.lang.Exception -> L1e
                r5.getClass()     // Catch: java.lang.Exception -> L1e
                return r1
            L1e:
                r5 = move-exception
                goto L6a
            L20:
                java.lang.String r2 = "utf-8"
                java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch: java.lang.Exception -> L1e
                kotlin.jvm.internal.g0.o(r2, r0)     // Catch: java.lang.Exception -> L1e
                byte[] r6 = r6.getBytes(r2)     // Catch: java.lang.Exception -> L1e
                java.lang.String r2 = "getBytes(...)"
                kotlin.jvm.internal.g0.o(r6, r2)     // Catch: java.lang.Exception -> L1e
                javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L1e
                java.lang.String r3 = "AES"
                r2.<init>(r6, r3)     // Catch: java.lang.Exception -> L1e
                java.lang.String r6 = com.bxkj.base.v2.common.utils.a.a()     // Catch: java.lang.Exception -> L1e
                javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6)     // Catch: java.lang.Exception -> L1e
                r3 = 2
                r6.init(r3, r2)     // Catch: java.lang.Exception -> L1e
                byte[] r5 = cn.bluemobi.dylan.base.utils.b.a(r5)     // Catch: java.lang.Exception -> L1e
                byte[] r5 = r6.doFinal(r5)     // Catch: java.lang.Exception -> L60
                kotlin.jvm.internal.g0.m(r5)     // Catch: java.lang.Exception -> L60
                java.lang.String r6 = "UTF-8"
                java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Exception -> L60
                kotlin.jvm.internal.g0.o(r6, r0)     // Catch: java.lang.Exception -> L60
                java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L60
                r0.<init>(r5, r6)     // Catch: java.lang.Exception -> L60
                r1 = r0
                goto L72
            L60:
                r5 = move-exception
                r5.toString()     // Catch: java.lang.Exception -> L1e
                java.io.PrintStream r5 = java.lang.System.out     // Catch: java.lang.Exception -> L1e
                r5.getClass()     // Catch: java.lang.Exception -> L1e
                goto L72
            L6a:
                r5.toString()
                java.io.PrintStream r5 = java.lang.System.out
                r5.getClass()
            L72:
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7) throws java.lang.Exception {
                r5 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r7, r0)
                int r0 = r7.length()
                r1 = 16
                if (r0 == r1) goto L21
                r1 = 24
                if (r0 == r1) goto L21
                r1 = 32
                if (r0 == r1) goto L21
                java.io.PrintStream r6 = java.lang.System.out
                r6.getClass()
                r6 = 0
                return r6
            L21:
                java.lang.String r0 = "utf-8"
                java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
                java.lang.String r2 = "forName(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                byte[] r7 = r7.getBytes(r1)
                java.lang.String r1 = "getBytes(...)"
                kotlin.jvm.internal.g0.o(r7, r1)
                javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
                java.lang.String r4 = "AES"
                r3.<init>(r7, r4)
                java.lang.String r7 = com.bxkj.base.v2.common.utils.a.a()
                javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r7)
                r4 = 1
                r7.init(r4, r3)
                java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
                kotlin.jvm.internal.g0.o(r0, r2)
                byte[] r6 = r6.getBytes(r0)
                kotlin.jvm.internal.g0.o(r6, r1)
                byte[] r6 = r7.doFinal(r6)
                java.lang.String r6 = cn.bluemobi.dylan.base.utils.b.b(r6)
                return r6
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String c(@org.jetbrains.annotations.NotNull java.lang.String r8) throws java.lang.Exception {
                r7 = this;
                java.lang.String r0 = "getBytes(...)"
                java.lang.String r1 = "data"
                kotlin.jvm.internal.g0.p(r8, r1)
                java.lang.String r1 = "AES/CBC/NoPadding"
                javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Exception -> L93
                int r2 = r1.getBlockSize()     // Catch: java.lang.Exception -> L93
                java.nio.charset.Charset r3 = kotlin.text.e.b     // Catch: java.lang.Exception -> L93
                byte[] r8 = r8.getBytes(r3)     // Catch: java.lang.Exception -> L93
                kotlin.jvm.internal.g0.o(r8, r0)     // Catch: java.lang.Exception -> L93
                int r4 = r8.length     // Catch: java.lang.Exception -> L93
                int r5 = r4 % r2
                if (r5 == 0) goto L23
                int r5 = r4 % r2
                int r2 = r2 - r5
                int r4 = r4 + r2
            L23:
                byte[] r2 = new byte[r4]     // Catch: java.lang.Exception -> L93
                int r4 = r8.length     // Catch: java.lang.Exception -> L93
                r5 = 0
                java.lang.System.arraycopy(r8, r5, r2, r5, r4)     // Catch: java.lang.Exception -> L93
                javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L93
                java.lang.String r4 = com.bxkj.base.v2.common.utils.a.c()     // Catch: java.lang.Exception -> L93
                byte[] r4 = r4.getBytes(r3)     // Catch: java.lang.Exception -> L93
                kotlin.jvm.internal.g0.o(r4, r0)     // Catch: java.lang.Exception -> L93
                java.lang.String r6 = "AES"
                r8.<init>(r4, r6)     // Catch: java.lang.Exception -> L93
                javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L93
                java.lang.String r6 = com.bxkj.base.v2.common.utils.a.b()     // Catch: java.lang.Exception -> L93
                byte[] r3 = r6.getBytes(r3)     // Catch: java.lang.Exception -> L93
                kotlin.jvm.internal.g0.o(r3, r0)     // Catch: java.lang.Exception -> L93
                r4.<init>(r3)     // Catch: java.lang.Exception -> L93
                r0 = 1
                r1.init(r0, r8, r4)     // Catch: java.lang.Exception -> L93
                byte[] r8 = r1.doFinal(r2)     // Catch: java.lang.Exception -> L93
                java.lang.String r8 = cn.bluemobi.dylan.base.utils.b.b(r8)     // Catch: java.lang.Exception -> L93
                java.lang.String r1 = "encode(...)"
                kotlin.jvm.internal.g0.o(r8, r1)     // Catch: java.lang.Exception -> L93
                int r1 = r8.length()     // Catch: java.lang.Exception -> L93
                int r1 = r1 - r0
                r2 = 0
                r3 = 0
            L64:
                if (r2 > r1) goto L89
                if (r3 != 0) goto L6a
                r4 = r2
                goto L6b
            L6a:
                r4 = r1
            L6b:
                char r4 = r8.charAt(r4)     // Catch: java.lang.Exception -> L93
                r6 = 32
                int r4 = kotlin.jvm.internal.g0.t(r4, r6)     // Catch: java.lang.Exception -> L93
                if (r4 > 0) goto L79
                r4 = 1
                goto L7a
            L79:
                r4 = 0
            L7a:
                if (r3 != 0) goto L83
                if (r4 != 0) goto L80
                r3 = 1
                goto L64
            L80:
                int r2 = r2 + 1
                goto L64
            L83:
                if (r4 != 0) goto L86
                goto L89
            L86:
                int r1 = r1 + (-1)
                goto L64
            L89:
                int r1 = r1 + r0
                java.lang.CharSequence r8 = r8.subSequence(r2, r1)     // Catch: java.lang.Exception -> L93
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L93
                return r8
            L93:
                r8 = 0
                return r8
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String d(int r6) {
                r5 = this;
                r0 = 16
                if (r6 == r0) goto L13
                r0 = 24
                if (r6 == r0) goto L13
                r0 = 32
                if (r6 == r0) goto L13
                java.io.PrintStream r6 = java.lang.System.out
                r6.getClass()
                r6 = 0
                return r6
            L13:
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 0
            L1e:
                if (r2 >= r6) goto L32
                r3 = 62
                int r3 = r0.nextInt(r3)
                java.lang.String r4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
                char r3 = r4.charAt(r3)
                r1.append(r3)
                int r2 = r2 + 1
                goto L1e
            L32:
                java.lang.String r6 = r1.toString()
                return r6
        }
    }

    static {
            com.bxkj.base.v2.common.utils.a$a r0 = new com.bxkj.base.v2.common.utils.a$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.base.v2.common.utils.a.a = r0
            java.lang.String r0 = "AES/ECB/PKCS5Padding"
            com.bxkj.base.v2.common.utils.a.b = r0
            r0 = 24
            com.bxkj.base.v2.common.utils.a.c = r0
            java.lang.String r0 = "thanks,pig4cloud"
            com.bxkj.base.v2.common.utils.a.d = r0
            com.bxkj.base.v2.common.utils.a.e = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.bxkj.base.v2.common.utils.a.b
            return r0
    }

    public static final /* synthetic */ java.lang.String b() {
            java.lang.String r0 = com.bxkj.base.v2.common.utils.a.e
            return r0
    }

    public static final /* synthetic */ java.lang.String c() {
            java.lang.String r0 = com.bxkj.base.v2.common.utils.a.d
            return r0
    }
}
