package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class s1 implements ms.bz.bd.c.Pgl.e1.pblb {
    s1() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String[] a() {
            r2 = this;
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            int r1 = r0.length
            if (r1 <= 0) goto L6
            return r0
        L6:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            if (r0 == 0) goto L17
            int r1 = r0.length()
            if (r1 == 0) goto L17
            java.lang.String r1 = android.os.Build.CPU_ABI
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            return r0
        L17:
            java.lang.String r0 = android.os.Build.CPU_ABI
            java.lang.String[] r0 = new java.lang.String[]{r0}
            return r0
    }
}
