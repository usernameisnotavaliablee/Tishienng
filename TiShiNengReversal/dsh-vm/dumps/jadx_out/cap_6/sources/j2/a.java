package j2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static final long b = 129600000;
    private static final int c = 5242880;
    private com.oplus.omes.stdsco.urlcheck.LurCache.a a;

    public a(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.io.File r5 = r3.g(r4, r5)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L10
            r5.mkdirs()
        L10:
            int r4 = r3.e(r4)
            r0 = 1
            r1 = 5242880(0x500000, double:2.590327E-317)
            com.oplus.omes.stdsco.urlcheck.LurCache.a r4 = com.oplus.omes.stdsco.urlcheck.LurCache.a.w(r5, r4, r0, r1)     // Catch: java.io.IOException -> L1e
            r3.a = r4     // Catch: java.io.IOException -> L1e
        L1e:
            return
    }

    private byte[] a(java.io.InputStream r5) throws java.lang.Exception {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r5.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            r0.close()
            r5.close()
            byte[] r5 = r0.toByteArray()
            return r5
    }

    private void b(java.lang.String r6, j2.c r7) {
            r5 = this;
            r0 = 0
            com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r5.a     // Catch: java.lang.Throwable -> L51
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r0 = r1.o(r6)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L53
            r6 = 0
            java.io.OutputStream r6 = r0.i(r6)     // Catch: java.lang.Throwable -> L51
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L51
            r1.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "id"
            int r3 = r7.b()     // Catch: java.lang.Throwable -> L51
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "url"
            java.lang.String r3 = r7.d()     // Catch: java.lang.Throwable -> L51
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "urlType"
            int r3 = r7.e()     // Catch: java.lang.Throwable -> L51
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "evilClass"
            int r3 = r7.a()     // Catch: java.lang.Throwable -> L51
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "timestamp"
            long r3 = r7.c()     // Catch: java.lang.Throwable -> L51
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "UTF-8"
            byte[] r7 = r7.getBytes(r1)     // Catch: java.lang.Throwable -> L51
            r6.write(r7)     // Catch: java.lang.Throwable -> L51
            r0.f()     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            goto L59
        L53:
            com.oplus.omes.stdsco.urlcheck.LurCache.a r6 = r5.a     // Catch: java.lang.Throwable -> L51
            r6.flush()     // Catch: java.lang.Throwable -> L51
            return
        L59:
            if (r0 == 0) goto L5e
            r0.a()     // Catch: java.io.IOException -> L5e
        L5e:
            return
    }

    private static java.lang.String c(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L1d
            r4 = 48
            r0.append(r4)
        L1d:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L23:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private int e(android.content.Context r3) {
            r2 = this;
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            return r3
        L10:
            r3 = 1
            return r3
    }

    private j2.c f(java.lang.String r11) {
            r10 = this;
            r0 = 0
            com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r10.a     // Catch: java.lang.Exception -> L6c
            com.oplus.omes.stdsco.urlcheck.LurCache.a$e r1 = r1.q(r11)     // Catch: java.lang.Exception -> L6c
            if (r1 == 0) goto L73
            r2 = 0
            java.io.InputStream r2 = r1.b(r2)     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L6a
            byte[] r2 = r10.a(r2)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L6a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6a
            r2.<init>(r3)     // Catch: java.lang.Exception -> L6a
            j2.c r3 = new j2.c     // Catch: java.lang.Exception -> L6a
            r3.<init>()     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "id"
            int r4 = r2.getInt(r4)     // Catch: java.lang.Exception -> L6a
            r3.g(r4)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "url"
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Exception -> L6a
            r3.i(r4)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "urlType"
            int r4 = r2.getInt(r4)     // Catch: java.lang.Exception -> L6a
            r3.j(r4)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "evilClass"
            int r4 = r2.getInt(r4)     // Catch: java.lang.Exception -> L6a
            r3.f(r4)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "timestamp"
            long r4 = r2.getLong(r4)     // Catch: java.lang.Exception -> L6a
            r3.h(r4)     // Catch: java.lang.Exception -> L6a
            r1.close()     // Catch: java.lang.Exception -> L6a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6a
            long r6 = r3.c()     // Catch: java.lang.Exception -> L6a
            r8 = 129600000(0x7b98a00, double:6.40309077E-316)
            long r6 = r6 + r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L64
            return r3
        L64:
            com.oplus.omes.stdsco.urlcheck.LurCache.a r2 = r10.a     // Catch: java.lang.Exception -> L6a
            r2.B(r11)     // Catch: java.lang.Exception -> L6a
            goto L73
        L6a:
            goto L6e
        L6c:
            r1 = r0
        L6e:
            if (r1 == 0) goto L73
            r1.close()
        L73:
            return r0
    }

    private java.io.File g(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            boolean r0 = android.os.Environment.isExternalStorageRemovable()
            if (r0 != 0) goto L13
            goto L1c
        L13:
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getPath()
            goto L24
        L1c:
            java.io.File r3 = r3.getExternalCacheDir()
            java.lang.String r3 = r3.getPath()
        L24:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = java.io.File.separator
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    public static java.lang.String h(java.lang.String r2) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            byte[] r1 = r2.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L16
            r0.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L16
            byte[] r0 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = c(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            return r2
        L16:
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
    }

    public j2.c d(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = h(r1)
            j2.c r1 = r0.f(r1)
            return r1
    }

    public void i(j2.c r2) {
            r1 = this;
            java.lang.String r0 = r2.d()
            java.lang.String r0 = h(r0)
            r1.b(r0, r2)
            return
    }
}
