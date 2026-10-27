package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class z {
    private static final java.lang.ThreadLocal a = null;

    class a extends java.lang.ThreadLocal {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.ref.WeakReference a() {
                r3 = this;
                java.lang.String r0 = cn.jiguang.commons.a.d.f948k     // Catch: java.lang.Exception -> L11
                javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Exception -> L11
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L11
                cn.jiguang.commons.L.z$b r2 = new cn.jiguang.commons.L.z$b     // Catch: java.lang.Exception -> L11
                r2.<init>(r0)     // Catch: java.lang.Exception -> L11
                r1.<init>(r2)     // Catch: java.lang.Exception -> L11
                return r1
            L11:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "failed to init thread local cipher: "
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "SECURE"
                cn.jiguang.commons.w.a.f(r1, r0)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.a()
                return r0
        }
    }

    private static final class b {
        final javax.crypto.Cipher a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f932b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f933c;

        /* renamed from: d, reason: collision with root package name */
        java.lang.Boolean f934d;

        b(javax.crypto.Cipher r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }
    }

    static {
            cn.jiguang.commons.L.z$a r0 = new cn.jiguang.commons.L.z$a
            r0.<init>()
            cn.jiguang.commons.L.z.a = r0
            return
    }

    public z() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L2e
            if (r3 != 0) goto L7
            goto L2e
        L7:
            byte[] r2 = a(r2, r3, r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "UTF-8"
            r3.<init>(r2, r1)     // Catch: java.lang.Exception -> L13
            return r3
        L13:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "failed to aes decrypt: "
            r3.append(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SECURE"
            cn.jiguang.commons.w.a.f(r3, r2)
        L2e:
            return r0
    }

    public static java.lang.String a(byte[] r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto L12
            if (r3 != 0) goto L7
            goto L12
        L7:
            r0 = 1
            byte[] r1 = a(r1, r2, r3, r0)
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static byte[] a(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto L12
            if (r3 != 0) goto L7
            goto L12
        L7:
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)
            r0 = 0
            byte[] r1 = a(r1, r2, r3, r0)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static byte[] a(byte[] r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            java.lang.String r0 = "UTF-8"
            r1 = 0
            if (r6 == 0) goto L87
            if (r7 == 0) goto L87
            if (r5 != 0) goto Lb
            goto L87
        Lb:
            java.lang.ThreadLocal r2 = cn.jiguang.commons.L.z.a
            java.lang.Object r3 = r2.get()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L1b
            java.lang.Object r1 = r3.get()
            cn.jiguang.commons.L.z$b r1 = (cn.jiguang.commons.L.z.b) r1
        L1b:
            if (r1 == 0) goto L21
            javax.crypto.Cipher r3 = r1.a
            if (r3 != 0) goto L35
        L21:
            java.lang.String r1 = cn.jiguang.commons.a.d.f948k
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            cn.jiguang.commons.L.z$b r3 = new cn.jiguang.commons.L.z$b
            r3.<init>(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r2.set(r1)
            r1 = r3
        L35:
            java.lang.String r2 = r1.f932b     // Catch: java.lang.Exception -> L80
            boolean r2 = android.text.TextUtils.equals(r2, r6)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L51
            java.lang.String r2 = r1.f933c     // Catch: java.lang.Exception -> L80
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L51
            java.lang.Boolean r2 = r1.f934d     // Catch: java.lang.Exception -> L80
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L80
            boolean r2 = java.util.Objects.equals(r2, r3)     // Catch: java.lang.Exception -> L80
            if (r2 != 0) goto L79
        L51:
            byte[] r2 = d(r6, r0)     // Catch: java.lang.Exception -> L80
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L80
            java.lang.String r4 = cn.jiguang.commons.a.d.f947j     // Catch: java.lang.Exception -> L80
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L80
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L80
            byte[] r0 = r7.getBytes(r0)     // Catch: java.lang.Exception -> L80
            r2.<init>(r0)     // Catch: java.lang.Exception -> L80
            javax.crypto.Cipher r0 = r1.a     // Catch: java.lang.Exception -> L80
            if (r8 == 0) goto L6b
            r4 = 1
            goto L6c
        L6b:
            r4 = 2
        L6c:
            r0.init(r4, r3, r2)     // Catch: java.lang.Exception -> L80
            r1.f932b = r6     // Catch: java.lang.Exception -> L80
            r1.f933c = r7     // Catch: java.lang.Exception -> L80
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L80
            r1.f934d = r6     // Catch: java.lang.Exception -> L80
        L79:
            javax.crypto.Cipher r6 = r1.a     // Catch: java.lang.Exception -> L80
            byte[] r5 = r6.doFinal(r5)     // Catch: java.lang.Exception -> L80
            return r5
        L80:
            r5 = move-exception
            java.lang.ThreadLocal r6 = cn.jiguang.commons.L.z.a
            r6.remove()
            throw r5
        L87:
            return r1
    }

    public static java.lang.String c(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L2d
            if (r3 != 0) goto L7
            goto L2d
        L7:
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = a(r2, r3, r3)     // Catch: java.lang.Exception -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "failed to aes encrypt: "
            r3.append(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SECURE"
            cn.jiguang.commons.w.a.f(r3, r2)
        L2d:
            return r0
    }

    private static byte[] d(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto La
            byte[] r3 = new byte[r1]
            return r3
        La:
            int r0 = r3.length()
            int r0 = r0 / 2
            java.lang.String r2 = r3.substring(r1, r0)
            byte[] r2 = r2.getBytes(r4)
            java.lang.String r3 = r3.substring(r0)
            byte[] r3 = r3.getBytes(r4)
            int r4 = r2.length
            int r0 = r3.length
            int r4 = r4 + r0
            byte[] r4 = new byte[r4]
            int r0 = r2.length
            java.lang.System.arraycopy(r2, r1, r4, r1, r0)
            int r0 = r2.length
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return r4
    }
}
