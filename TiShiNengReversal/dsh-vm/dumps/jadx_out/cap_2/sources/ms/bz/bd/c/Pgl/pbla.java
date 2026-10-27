package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbla {
    public pbla() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a(java.lang.String r7) {
            int r0 = r7.length()
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            int r3 = r2 / 2
            char r4 = r7.charAt(r2)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r4 = r4 << 4
            int r6 = r2 + 1
            char r6 = r7.charAt(r6)
            int r5 = java.lang.Character.digit(r6, r5)
            int r5 = r5 + r4
            byte r4 = (byte) r5
            r1[r3] = r4
            int r2 = r2 + 2
            goto L9
        L2a:
            return r1
    }
}
