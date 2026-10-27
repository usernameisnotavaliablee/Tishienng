package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f717b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f718c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f719d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f720e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f721f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.Map<java.lang.String, javax.crypto.Cipher>> f722g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.security.interfaces.RSAPublicKey> f723h = null;


    public static class a {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f724b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f725c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f726d;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static cn.jiguang.av.t.a a(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
                java.lang.String r0 = "SecureKey"
                if (r2 != 0) goto L9
                java.lang.String r2 = ""
                goto L9
            L7:
                r1 = move-exception
                goto L29
            L9:
                if (r5 != 0) goto L10
            Lb:
                cn.jiguang.av.t$a r0 = a(r1, r2)     // Catch: java.lang.Throwable -> L7
                return r0
            L10:
                boolean r5 = cn.jiguang.y.g.a()     // Catch: java.lang.Throwable -> L7
                if (r5 == 0) goto L1d
                cn.jiguang.av.t$a r3 = b(r1, r2, r3)     // Catch: java.lang.Throwable -> L7
                if (r3 == 0) goto L22
                return r3
            L1d:
                java.lang.String r3 = "ECC encryption is not forced"
                cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L7
            L22:
                cn.jiguang.av.t$a r3 = a(r1, r2, r4)     // Catch: java.lang.Throwable -> L7
                if (r3 == 0) goto Lb
                return r3
            L29:
                java.lang.String r2 = "Exception in encryptReportData"
                cn.jiguang.w.f.b(r0, r2, r1)
                r0 = 0
                return r0
        }

        private static cn.jiguang.av.t.a a(java.lang.String r2, java.lang.String r3) {
                r0 = 16
                byte[] r0 = cn.jiguang.av.u.b(r0)     // Catch: java.lang.Throwable -> L37
                java.lang.String r0 = cn.jiguang.av.v.b(r0)     // Catch: java.lang.Throwable -> L37
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
                r1.<init>()     // Catch: java.lang.Throwable -> L37
                r1.append(r0)     // Catch: java.lang.Throwable -> L37
                r1.append(r2)     // Catch: java.lang.Throwable -> L37
                r1.append(r3)     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L37
                byte[] r2 = cn.jiguang.av.v.e(r2)     // Catch: java.lang.Throwable -> L37
                byte[] r2 = a(r2)     // Catch: java.lang.Throwable -> L37
                cn.jiguang.av.t$a r3 = new cn.jiguang.av.t$a     // Catch: java.lang.Throwable -> L37
                r3.<init>()     // Catch: java.lang.Throwable -> L37
                r1 = 1
                r3.a = r1     // Catch: java.lang.Throwable -> L37
                r3.f726d = r0     // Catch: java.lang.Throwable -> L37
                r3.f725c = r2     // Catch: java.lang.Throwable -> L37
                byte[] r2 = r0.getBytes()     // Catch: java.lang.Throwable -> L37
                r3.f724b = r2     // Catch: java.lang.Throwable -> L37
                return r3
            L37:
                r2 = move-exception
                java.lang.String r3 = "SecureKey"
                java.lang.String r0 = "Exception in aesBody"
                cn.jiguang.w.f.b(r3, r0, r2)
                r2 = 0
                return r2
        }

        private static cn.jiguang.av.t.a a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r0 = 0
                if (r5 != 0) goto L4
                return r0
            L4:
                r1 = 16
                byte[] r1 = cn.jiguang.av.u.b(r1)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r1 = cn.jiguang.av.v.b(r1)     // Catch: java.lang.Throwable -> L3d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
                r2.<init>()     // Catch: java.lang.Throwable -> L3d
                r2.append(r1)     // Catch: java.lang.Throwable -> L3d
                r2.append(r3)     // Catch: java.lang.Throwable -> L3d
                r2.append(r4)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L3d
                byte[] r3 = cn.jiguang.av.v.e(r3)     // Catch: java.lang.Throwable -> L3d
                byte[] r3 = a(r3)     // Catch: java.lang.Throwable -> L3d
                cn.jiguang.av.t$a r4 = new cn.jiguang.av.t$a     // Catch: java.lang.Throwable -> L3d
                r4.<init>()     // Catch: java.lang.Throwable -> L3d
                java.lang.String r2 = cn.jiguang.av.t.f721f     // Catch: java.lang.Throwable -> L3d
                byte[] r5 = cn.jiguang.av.t.c(r1, r5, r2)     // Catch: java.lang.Throwable -> L3d
                r4.f725c = r3     // Catch: java.lang.Throwable -> L3d
                r4.f726d = r1     // Catch: java.lang.Throwable -> L3d
                r4.f724b = r5     // Catch: java.lang.Throwable -> L3d
                r3 = 3
                r4.a = r3     // Catch: java.lang.Throwable -> L3d
                return r4
            L3d:
                r3 = move-exception
                java.lang.String r4 = "SecureKey"
                java.lang.String r5 = "Exception in rsaBody"
                cn.jiguang.w.f.b(r4, r5, r3)
                return r0
        }

        private static byte[] a(byte[] r2) {
                java.lang.String r2 = cn.jiguang.av.v.b(r2)
                java.lang.String r2 = r2.toLowerCase()
                r0 = 0
                r1 = 32
                java.lang.String r2 = r2.substring(r0, r1)
                byte[] r2 = r2.getBytes()
                return r2
        }

        private static cn.jiguang.av.t.a b(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                java.lang.String r0 = "SecureKey"
                r1 = 0
                if (r7 != 0) goto L6
                return r1
            L6:
                cn.jiguang.av.h$a r7 = cn.jiguang.av.h.c(r7)     // Catch: java.lang.Throwable -> L12
                if (r7 != 0) goto L14
                java.lang.String r5 = "Failed to generate ECC shared secret, fallback to next encryption method"
                cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> L12
                return r1
            L12:
                r5 = move-exception
                goto L53
            L14:
                byte[] r2 = r7.a     // Catch: java.lang.Throwable -> L12
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
                r3.<init>()     // Catch: java.lang.Throwable -> L12
                r3.append(r5)     // Catch: java.lang.Throwable -> L12
                r3.append(r6)     // Catch: java.lang.Throwable -> L12
                java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L12
                byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L12
                int r6 = r2.length     // Catch: java.lang.Throwable -> L12
                int r3 = r5.length     // Catch: java.lang.Throwable -> L12
                int r6 = r6 + r3
                byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L12
                int r3 = r2.length     // Catch: java.lang.Throwable -> L12
                r4 = 0
                java.lang.System.arraycopy(r2, r4, r6, r4, r3)     // Catch: java.lang.Throwable -> L12
                int r2 = r2.length     // Catch: java.lang.Throwable -> L12
                int r3 = r5.length     // Catch: java.lang.Throwable -> L12
                java.lang.System.arraycopy(r5, r4, r6, r2, r3)     // Catch: java.lang.Throwable -> L12
                byte[] r5 = cn.jiguang.av.v.a(r6)     // Catch: java.lang.Throwable -> L12
                byte[] r5 = a(r5)     // Catch: java.lang.Throwable -> L12
                cn.jiguang.av.t$a r6 = new cn.jiguang.av.t$a     // Catch: java.lang.Throwable -> L12
                r6.<init>()     // Catch: java.lang.Throwable -> L12
                r2 = 2
                r6.a = r2     // Catch: java.lang.Throwable -> L12
                java.lang.String r2 = r7.f699c     // Catch: java.lang.Throwable -> L12
                r6.f726d = r2     // Catch: java.lang.Throwable -> L12
                r6.f725c = r5     // Catch: java.lang.Throwable -> L12
                byte[] r5 = r7.f698b     // Catch: java.lang.Throwable -> L12
                r6.f724b = r5     // Catch: java.lang.Throwable -> L12
                return r6
            L53:
                java.lang.String r6 = "Exception in eccBody"
                cn.jiguang.w.f.b(r0, r6, r5)
                return r1
        }

        public byte[] a() {
                r1 = this;
                byte[] r0 = r1.f724b
                return r0
        }

        public byte[] b() {
                r1 = this;
                byte[] r0 = r1.f725c
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.f726d
                return r0
        }

        public int d() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SecureKey{type="
                r0.append(r1)
                int r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", keyBody="
                r0.append(r1)
                byte[] r1 = r2.f724b
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", sha256Key="
                r0.append(r1)
                byte[] r1 = r2.f725c
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", randomKey='"
                r0.append(r1)
                java.lang.String r1 = r2.f726d
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [91, 85, 5} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.av.t.a = r1
            r1 = 5
            byte[] r1 = new byte[r1]
            r1 = {x005c: FILL_ARRAY_DATA , data: [99, 104, 88, 37, 39} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.av.t.f717b = r1
            r1 = 7
            byte[] r1 = new byte[r1]
            r1 = {x0064: FILL_ARRAY_DATA , data: [74, 64, 87, 60, 2, 21, 47} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.av.t.f718c = r1
            byte[] r0 = new byte[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [87, 84, 99} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.av.t.f719d = r0
            r0 = 20
            byte[] r1 = new byte[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [73, 83, 66, 31, 99, 91, 75, 57, 65, 123, 99, 74, 61, 70, 112, 84, 68, 112, 102, 113} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.av.t.f720e = r1
            byte[] r0 = new byte[r0]
            r0 = {x0080: FILL_ARRAY_DATA , data: [90, 69, 80, 31, 101, 90, 74, 57, 65, 123, 99, 74, 57, 70, 112, 84, 68, 112, 102, 113} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.av.t.f721f = r0
            cn.jiguang.av.t$1 r0 = new cn.jiguang.av.t$1
            r0.<init>()
            cn.jiguang.av.t.f722g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.av.t.f723h = r0
            return
    }

    public t() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            int r0 = r0.nextInt()
            int r0 = java.lang.Math.abs(r0)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    private static <T> T a(java.lang.Class<T> r0, java.lang.Object[] r1, java.lang.Class<?>[] r2) {
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    public static java.lang.String a(long r4) {
            r0 = 10
            long r0 = r4 % r0
            int r1 = (int) r0
            switch(r1) {
                case 1: goto L49;
                case 2: goto L42;
                case 3: goto L3b;
                case 4: goto L34;
                case 5: goto L2d;
                case 6: goto L26;
                case 7: goto L1f;
                case 8: goto L18;
                case 9: goto L11;
                default: goto L8;
            }
        L8:
            r0 = 8
            long r0 = r0 * r4
            r2 = 74
        Le:
            long r4 = r4 % r2
            long r0 = r0 + r4
            goto L50
        L11:
            r0 = 37
            long r0 = r0 * r4
            r2 = 91
            goto Le
        L18:
            r0 = 29
            long r0 = r0 * r4
            r2 = 41
            goto Le
        L1f:
            r0 = 31
            long r0 = r0 * r4
            r2 = 39
            goto Le
        L26:
            r0 = 7
            long r0 = r0 * r4
            r2 = 68
            goto Le
        L2d:
            r0 = 17
            long r0 = r0 * r4
            r2 = 49
            goto Le
        L34:
            r0 = 13
            long r0 = r0 * r4
            r2 = 96
            goto Le
        L3b:
            r0 = 3
            long r0 = r0 * r4
            r2 = 73
            goto Le
        L42:
            r0 = 23
            long r0 = r0 * r4
            r2 = 15
            goto Le
        L49:
            r0 = 5
            long r0 = r0 * r4
            r2 = 88
            goto Le
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "JCKP"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = cn.jiguang.av.v.d(r4)
            return r4
    }

    public static java.lang.String a(java.lang.String r0, java.lang.String r1) {
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = a(r0, r1, r1)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.lang.String r0 = "Unexpected - failed to AES encrypt."
            java.lang.String r1 = ""
            cn.jiguang.w.f.i(r1, r0)
            return r1
    }

    public static java.lang.String a(byte[] r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            byte[] r1 = a(r1, r2, r3, r0)
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            return r1
    }

    private static javax.crypto.Cipher a(java.lang.String r3) {
            java.lang.ThreadLocal<java.util.Map<java.lang.String, javax.crypto.Cipher>> r0 = cn.jiguang.av.t.f722g
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L11
            java.lang.Object r1 = r0.get(r3)
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L37
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L1c
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L1c
            return r1
        L1c:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to create Cipher: "
            r0.append(r2)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "Secure"
            cn.jiguang.w.f.i(r0, r3)
        L37:
            return r1
    }

    private static javax.crypto.spec.IvParameterSpec a(byte[] r4) {
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Exception -> L15
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Class<byte[]> r1 = byte[].class
            r4[r3] = r1     // Catch: java.lang.Exception -> L15
            java.lang.Object r4 = a(r0, r2, r4)     // Catch: java.lang.Exception -> L15
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r4 = 0
            return r4
    }

    public static byte[] a(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)
            r0 = 0
            byte[] r1 = a(r1, r2, r3, r0)
            return r1
    }

    private static synchronized byte[] a(java.lang.String r2, java.security.interfaces.RSAPublicKey r3, java.lang.String r4) {
            java.lang.Class<cn.jiguang.av.t> r0 = cn.jiguang.av.t.class
            monitor-enter(r0)
            javax.crypto.Cipher r1 = a(r4)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r2 = move-exception
            goto L1e
        L10:
            r4 = 1
            r1.init(r4, r3)     // Catch: java.lang.Throwable -> Le
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> Le
            byte[] r2 = r1.doFinal(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r2
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public static synchronized byte[] a(byte[] r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            java.lang.Class<cn.jiguang.av.t> r0 = cn.jiguang.av.t.class
            monitor-enter(r0)
            if (r3 != 0) goto L8
            monitor-exit(r0)
            r2 = 0
            return r2
        L8:
            java.lang.String r1 = "UTF-8"
            byte[] r3 = c(r3, r1)     // Catch: java.lang.Throwable -> L14
            byte[] r2 = a(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r2
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public static synchronized byte[] a(byte[] r3, byte[] r4, java.lang.String r5, boolean r6) {
            java.lang.Class<cn.jiguang.av.t> r0 = cn.jiguang.av.t.class
            monitor-enter(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = cn.jiguang.av.t.f719d     // Catch: java.lang.Throwable -> L21
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r5.getBytes(r4)     // Catch: java.lang.Throwable -> L21
            javax.crypto.spec.IvParameterSpec r4 = a(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = cn.jiguang.av.t.f720e     // Catch: java.lang.Throwable -> L21
            javax.crypto.Cipher r2 = a(r5)     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L23
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L31
        L23:
            if (r6 == 0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 2
        L28:
            r2.init(r5, r1, r4)     // Catch: java.lang.Throwable -> L21
            byte[] r3 = r2.doFinal(r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r3
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public static java.lang.String b(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> La
            byte[] r1 = a(r1, r2, r2)     // Catch: java.lang.Exception -> La
            r0.<init>(r1)     // Catch: java.lang.Exception -> La
            return r0
        La:
            java.lang.String r1 = "Unexpected - failed to AES decrypt."
            java.lang.String r2 = ""
            cn.jiguang.w.f.i(r2, r1)
            return r2
    }

    public static java.lang.String b(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.security.interfaces.RSAPublicKey r1 = b(r1)
            byte[] r0 = a(r0, r1, r2)
            java.lang.String r1 = new java.lang.String
            r2 = 2
            byte[] r0 = android.util.Base64.encode(r0, r2)
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)
            return r1
    }

    private static java.security.interfaces.RSAPublicKey b(java.lang.String r4) {
            java.util.Map<java.lang.String, java.security.interfaces.RSAPublicKey> r0 = cn.jiguang.av.t.f723h
            java.lang.Object r1 = r0.get(r4)
            java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            r1 = 2
            byte[] r1 = android.util.Base64.decode(r4, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "RSA"
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch: java.lang.Throwable -> L25
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L25
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L25
            java.security.PublicKey r1 = r2.generatePublic(r3)     // Catch: java.lang.Throwable -> L25
            java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1     // Catch: java.lang.Throwable -> L25
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r4 = 0
            return r4
    }

    private static byte[] c(java.lang.String r4, java.lang.String r5) {
            int r0 = r4.length()
            byte[] r0 = new byte[r0]
            int r1 = r4.length()
            int r1 = r1 / 2
            r2 = 0
            java.lang.String r1 = r4.substring(r2, r1)
            byte[] r1 = r1.getBytes(r5)
            int r3 = r4.length()
            int r3 = r3 / 2
            java.lang.String r4 = r4.substring(r3)
            byte[] r4 = r4.getBytes(r5)
            int r5 = r1.length
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r5 = r1.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r5, r1)
            return r0
    }

    public static byte[] c(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.security.interfaces.RSAPublicKey r1 = b(r1)
            byte[] r0 = a(r0, r1, r2)
            return r0
    }
}
