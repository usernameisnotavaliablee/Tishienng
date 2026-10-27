package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1475b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1476c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1477d = null;

    static {
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x0032: FILL_ARRAY_DATA , data: [87, 84, 99} // fill-array
            java.lang.String r1 = cn.jiguang.s.a.b(r1)
            cn.jiguang.u.i.a = r1
            r1 = 20
            byte[] r1 = new byte[r1]
            r1 = {x0038: FILL_ARRAY_DATA , data: [73, 83, 66, 31, 99, 91, 75, 57, 65, 123, 99, 74, 61, 70, 112, 84, 68, 112, 102, 113} // fill-array
            java.lang.String r1 = cn.jiguang.s.a.b(r1)
            cn.jiguang.u.i.f1475b = r1
            byte[] r0 = new byte[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [91, 85, 5} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.u.i.f1476c = r0
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [99, 104, 88, 37, 39} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.u.i.f1477d = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    private static <T> T a(java.lang.Class<T> r0, java.lang.Object[] r1, java.lang.Class<?>[] r2) {
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    public static java.lang.String a(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> La
            byte[] r1 = a(r1, r2, r2)     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            java.lang.String r1 = "Unexpected - failed to AES decrypt."
            java.lang.String r2 = ""
            cn.jiguang.t.b.e(r2, r1)
            return r2
    }

    public static java.lang.String a(byte[] r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            byte[] r1 = a(r1, r2, r3, r0)
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            return r1
    }

    private static javax.crypto.spec.IvParameterSpec a(byte[] r4) {
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L15
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L15
            java.lang.Class<byte[]> r1 = byte[].class
            r4[r3] = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r4 = a(r0, r2, r4)     // Catch: java.lang.Throwable -> L15
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4     // Catch: java.lang.Throwable -> L15
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

    public static synchronized byte[] a(byte[] r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            java.lang.Class<cn.jiguang.u.i> r0 = cn.jiguang.u.i.class
            monitor-enter(r0)
            r1 = 0
            if (r5 != 0) goto L8
            monitor-exit(r0)
            return r1
        L8:
            java.lang.String r2 = "UTF-8"
            byte[] r5 = b(r5, r2)     // Catch: java.lang.Throwable -> L33
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = cn.jiguang.u.i.a     // Catch: java.lang.Throwable -> L33
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "UTF-8"
            byte[] r5 = r6.getBytes(r5)     // Catch: java.lang.Throwable -> L33
            javax.crypto.spec.IvParameterSpec r5 = a(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = cn.jiguang.u.i.f1475b     // Catch: java.lang.Throwable -> L33
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L29
            r7 = 1
            goto L2a
        L29:
            r7 = 2
        L2a:
            r6.init(r7, r2, r5)     // Catch: java.lang.Throwable -> L33
            byte[] r4 = r6.doFinal(r4)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            return r4
        L33:
            monitor-exit(r0)
            return r1
    }

    private static byte[] b(java.lang.String r4, java.lang.String r5) {
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
}
