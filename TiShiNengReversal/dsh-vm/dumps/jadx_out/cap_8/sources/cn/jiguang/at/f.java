package cn.jiguang.at;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
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
            if (r2 >= r1) goto L1e
            r3 = r4[r2]
            a(r0, r3)
            r3 = 32
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L1e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void a(java.lang.StringBuffer r2, byte r3) {
            int r0 = r3 >> 4
            r0 = r0 & 15
            java.lang.String r1 = "0123456789ABCDEF"
            char r0 = r1.charAt(r0)
            r2.append(r0)
            r3 = r3 & 15
            char r3 = r1.charAt(r3)
            r2.append(r3)
            return
    }
}
