package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface DataContentHandler {
    java.lang.Object getContent(javax.activation.DataSource r1) throws java.io.IOException;

    java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r1, javax.activation.DataSource r2) throws myjava.awt.datatransfer.UnsupportedFlavorException, java.io.IOException;

    myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors();

    void writeTo(java.lang.Object r1, java.lang.String r2, java.io.OutputStream r3) throws java.io.IOException;
}
