package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class ObjectDataContentHandler implements javax.activation.DataContentHandler {
    private javax.activation.DataContentHandler dch;
    private java.lang.String mimeType;
    private java.lang.Object obj;
    private myjava.awt.datatransfer.DataFlavor[] transferFlavors;

    public ObjectDataContentHandler(javax.activation.DataContentHandler r2, java.lang.Object r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.transferFlavors = r0
            r1.obj = r3
            r1.mimeType = r4
            r1.dch = r2
            return
    }

    @Override // javax.activation.DataContentHandler
    public java.lang.Object getContent(javax.activation.DataSource r1) {
            r0 = this;
            java.lang.Object r1 = r0.obj
            return r1
    }

    public javax.activation.DataContentHandler getDCH() {
            r1 = this;
            javax.activation.DataContentHandler r0 = r1.dch
            return r0
    }

    @Override // javax.activation.DataContentHandler
    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r2, javax.activation.DataSource r3) throws myjava.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r1 = this;
            javax.activation.DataContentHandler r0 = r1.dch
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.getTransferData(r2, r3)
            return r2
        L9:
            myjava.awt.datatransfer.DataFlavor[] r3 = r1.getTransferDataFlavors()
            r0 = 0
            r3 = r3[r0]
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L19
            java.lang.Object r2 = r1.obj
            return r2
        L19:
            myjava.awt.datatransfer.UnsupportedFlavorException r3 = new myjava.awt.datatransfer.UnsupportedFlavorException
            r3.<init>(r2)
            throw r3
    }

    @Override // javax.activation.DataContentHandler
    public synchronized myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r4 = this;
            monitor-enter(r4)
            myjava.awt.datatransfer.DataFlavor[] r0 = r4.transferFlavors     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L27
            javax.activation.DataContentHandler r0 = r4.dch     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            myjava.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()     // Catch: java.lang.Throwable -> L10
            r4.transferFlavors = r0     // Catch: java.lang.Throwable -> L10
            goto L27
        L10:
            r0 = move-exception
            goto L2b
        L12:
            r0 = 1
            myjava.awt.datatransfer.DataFlavor[] r0 = new myjava.awt.datatransfer.DataFlavor[r0]     // Catch: java.lang.Throwable -> L10
            r4.transferFlavors = r0     // Catch: java.lang.Throwable -> L10
            javax.activation.ActivationDataFlavor r1 = new javax.activation.ActivationDataFlavor     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r4.obj     // Catch: java.lang.Throwable -> L10
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r4.mimeType     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r3, r3)     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Throwable -> L10
        L27:
            myjava.awt.datatransfer.DataFlavor[] r0 = r4.transferFlavors     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return r0
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(java.lang.Object r2, java.lang.String r3, java.io.OutputStream r4) throws java.io.IOException {
            r1 = this;
            javax.activation.DataContentHandler r0 = r1.dch
            if (r0 == 0) goto L8
            r0.writeTo(r2, r3, r4)
            return
        L8:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L12
            byte[] r2 = (byte[]) r2
            r4.write(r2)
            return
        L12:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L24
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            r3.<init>(r4)
            java.lang.String r2 = (java.lang.String) r2
            r3.write(r2)
            r3.flush()
            return
        L24:
            javax.activation.UnsupportedDataTypeException r2 = new javax.activation.UnsupportedDataTypeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "no object DCH for MIME type "
            r3.<init>(r4)
            java.lang.String r4 = r1.mimeType
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
