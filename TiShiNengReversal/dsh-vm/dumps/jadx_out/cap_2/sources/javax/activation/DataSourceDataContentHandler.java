package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class DataSourceDataContentHandler implements javax.activation.DataContentHandler {
    private javax.activation.DataContentHandler dch;
    private javax.activation.DataSource ds;
    private myjava.awt.datatransfer.DataFlavor[] transferFlavors;

    public DataSourceDataContentHandler(javax.activation.DataContentHandler r2, javax.activation.DataSource r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.transferFlavors = r0
            r1.ds = r3
            r1.dch = r2
            return
    }

    @Override // javax.activation.DataContentHandler
    public java.lang.Object getContent(javax.activation.DataSource r2) throws java.io.IOException {
            r1 = this;
            javax.activation.DataContentHandler r0 = r1.dch
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.getContent(r2)
            return r2
        L9:
            java.io.InputStream r2 = r2.getInputStream()
            return r2
    }

    @Override // javax.activation.DataContentHandler
    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r3, javax.activation.DataSource r4) throws myjava.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r2 = this;
            javax.activation.DataContentHandler r0 = r2.dch
            if (r0 == 0) goto L9
            java.lang.Object r3 = r0.getTransferData(r3, r4)
            return r3
        L9:
            myjava.awt.datatransfer.DataFlavor[] r0 = r2.getTransferDataFlavors()
            r1 = 0
            r0 = r0[r1]
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            java.io.InputStream r3 = r4.getInputStream()
            return r3
        L1b:
            myjava.awt.datatransfer.UnsupportedFlavorException r4 = new myjava.awt.datatransfer.UnsupportedFlavorException
            r4.<init>(r3)
            throw r4
    }

    @Override // javax.activation.DataContentHandler
    public myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r4 = this;
            myjava.awt.datatransfer.DataFlavor[] r0 = r4.transferFlavors
            if (r0 != 0) goto L28
            javax.activation.DataContentHandler r0 = r4.dch
            if (r0 == 0) goto Lf
            myjava.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()
            r4.transferFlavors = r0
            goto L28
        Lf:
            r0 = 1
            myjava.awt.datatransfer.DataFlavor[] r0 = new myjava.awt.datatransfer.DataFlavor[r0]
            r4.transferFlavors = r0
            javax.activation.ActivationDataFlavor r1 = new javax.activation.ActivationDataFlavor
            javax.activation.DataSource r2 = r4.ds
            java.lang.String r2 = r2.getContentType()
            javax.activation.DataSource r3 = r4.ds
            java.lang.String r3 = r3.getContentType()
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
        L28:
            myjava.awt.datatransfer.DataFlavor[] r0 = r4.transferFlavors
            return r0
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(java.lang.Object r2, java.lang.String r3, java.io.OutputStream r4) throws java.io.IOException {
            r1 = this;
            javax.activation.DataContentHandler r0 = r1.dch
            if (r0 == 0) goto L8
            r0.writeTo(r2, r3, r4)
            return
        L8:
            javax.activation.UnsupportedDataTypeException r2 = new javax.activation.UnsupportedDataTypeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "no DCH for content type "
            r3.<init>(r4)
            javax.activation.DataSource r4 = r1.ds
            java.lang.String r4 = r4.getContentType()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
