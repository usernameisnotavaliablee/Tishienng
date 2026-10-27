package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    public static final java.lang.String a = null;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [33, 1, 18, 42, 60, 35, 39, 7, 24, 32, 73, 84, 82, 116, 101, 95} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.u.j.a = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r2.getBytes()
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static java.lang.String a(byte[] r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            a(r0, r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void a(java.lang.StringBuffer r2, byte r3) {
            java.lang.String r0 = cn.jiguang.u.j.a
            int r1 = r3 >> 4
            r1 = r1 & 15
            char r1 = r0.charAt(r1)
            r2.append(r1)
            r3 = r3 & 15
            char r3 = r0.charAt(r3)
            r2.append(r3)
            return
    }

    public static java.lang.String b(java.lang.String r2) {
            boolean r0 = c(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "[^\\w#$@\\-一-龥]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            return r2
    }

    public static boolean c(java.lang.String r2) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.length()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 != 0) goto L16
            return r0
        L16:
            r2 = 0
            return r2
    }

    public static java.lang.String d(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L22
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
            goto L22
        Lc:
            java.lang.String r1 = cn.jiguang.u.i.f1476c     // Catch: java.lang.Throwable -> L22
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L22
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L22
            r1.update(r2)     // Catch: java.lang.Throwable -> L22
            byte[] r2 = r1.digest()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L22
            return r2
        L22:
            return r0
    }
}
