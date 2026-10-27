package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"DefaultLocale"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L47
            char[] r5 = r5.toCharArray()
            int r1 = r5.length
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
        Lf:
            int r4 = r5.length
            if (r3 >= r4) goto L1a
            char r4 = r5[r3]
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L1a:
            byte[] r5 = r0.digest(r1)
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L23:
            int r1 = r5.length
            if (r2 >= r1) goto L3d
            r1 = r5[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 16
            if (r1 >= r3) goto L33
            java.lang.String r3 = "0"
            r0.append(r3)
        L33:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r2 = r2 + 1
            goto L23
        L3d:
            java.lang.String r5 = r0.toString()
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return r5
        L47:
            r5 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r5.toString()
            r0.getClass()
            r5 = 0
            return r5
    }
}
