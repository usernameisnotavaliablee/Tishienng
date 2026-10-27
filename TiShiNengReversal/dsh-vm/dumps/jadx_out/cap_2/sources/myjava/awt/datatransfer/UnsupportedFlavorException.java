package myjava.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class UnsupportedFlavorException extends java.lang.Exception {
    private static final long serialVersionUID = 5383814944251665601L;

    public UnsupportedFlavorException(myjava.awt.datatransfer.DataFlavor r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "flavor = "
            r0.<init>(r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
