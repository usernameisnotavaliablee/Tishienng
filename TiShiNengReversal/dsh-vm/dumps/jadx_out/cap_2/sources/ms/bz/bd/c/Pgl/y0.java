package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y0 extends java.lang.RuntimeException {
    public y0(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find '"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "'. Looked for: "
            r0.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r4)
            r0.append(r3)
            java.lang.String r3 = ", but only found: "
            r0.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r5)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
