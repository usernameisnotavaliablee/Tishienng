package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"DefaultLocale"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MD5Utils {
    public MD5Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String md5(java.lang.String r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r5.getBytes(r1)     // Catch: java.lang.Exception -> L50
            r0.update(r1)     // Catch: java.lang.Exception -> L50
            char[] r5 = r5.toCharArray()
            int r1 = r5.length
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
        L18:
            int r4 = r5.length
            if (r3 >= r4) goto L23
            char r4 = r5[r3]
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L18
        L23:
            byte[] r5 = r0.digest()
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L2c:
            int r1 = r5.length
            if (r2 >= r1) goto L46
            r1 = r5[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 16
            if (r1 >= r3) goto L3c
            java.lang.String r3 = "0"
            r0.append(r3)
        L3c:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r2 = r2 + 1
            goto L2c
        L46:
            java.lang.String r5 = r0.toString()
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return r5
        L50:
            r5 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r5.toString()
            r0.getClass()
            r5 = 0
            return r5
    }
}
