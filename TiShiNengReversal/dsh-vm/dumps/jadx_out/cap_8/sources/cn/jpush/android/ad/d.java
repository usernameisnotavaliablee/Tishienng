package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a(byte[] r7) {
            r0 = 0
            r1 = 6
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L1d
            r2 = {x0020: FILL_ARRAY_DATA , data: [32, 25, 8, 22, 17, 48} // fill-array     // Catch: java.lang.Throwable -> L1d
            int r3 = r7.length     // Catch: java.lang.Throwable -> L1d
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1d
            r4 = 0
        Lb:
            int r5 = r7.length     // Catch: java.lang.Throwable -> L1d
            if (r4 >= r5) goto L1c
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L1d
            int r6 = r7.length     // Catch: java.lang.Throwable -> L1d
            int r6 = r6 + r4
            int r6 = r6 % r1
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L1d
            r5 = r5 ^ r6
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d
            r3[r4] = r5     // Catch: java.lang.Throwable -> L1d
            int r4 = r4 + 1
            goto Lb
        L1c:
            return r3
        L1d:
            byte[] r7 = new byte[r0]
            return r7
    }

    public static java.lang.String b(byte[] r1) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = a(r1)
            r0.<init>(r1)
            return r0
    }
}
