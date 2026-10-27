package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ActivationDataFlavor extends myjava.awt.datatransfer.DataFlavor {
    private java.lang.String humanPresentableName;
    private javax.activation.MimeType mimeObject;
    private java.lang.String mimeType;
    private java.lang.Class representationClass;

    public ActivationDataFlavor(java.lang.Class r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.mimeType = r0
            r1.mimeObject = r0
            r1.humanPresentableName = r0
            r1.representationClass = r0
            java.lang.String r0 = super.getMimeType()
            r1.mimeType = r0
            r1.representationClass = r2
            r1.humanPresentableName = r3
            return
    }

    public ActivationDataFlavor(java.lang.Class r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r3, r4)
            r0 = 0
            r1.mimeObject = r0
            r1.mimeType = r3
            r1.humanPresentableName = r4
            r1.representationClass = r2
            return
    }

    public ActivationDataFlavor(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.mimeObject = r0
            r1.humanPresentableName = r0
            r1.representationClass = r0
            r1.mimeType = r2
            java.lang.String r2 = "java.io.InputStream"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L14
            r1.representationClass = r2     // Catch: java.lang.ClassNotFoundException -> L14
        L14:
            r1.humanPresentableName = r3
            return
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    public boolean equals(myjava.awt.datatransfer.DataFlavor r2) {
            r1 = this;
            boolean r0 = r1.isMimeTypeEqual(r2)
            if (r0 == 0) goto L10
            java.lang.Class r2 = r2.getRepresentationClass()
            java.lang.Class r0 = r1.representationClass
            if (r2 != r0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    public java.lang.String getHumanPresentableName() {
            r1 = this;
            java.lang.String r0 = r1.humanPresentableName
            return r0
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    public java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mimeType
            return r0
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    public java.lang.Class getRepresentationClass() {
            r1 = this;
            java.lang.Class r0 = r1.representationClass
            return r0
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    public boolean isMimeTypeEqual(java.lang.String r3) {
            r2 = this;
            javax.activation.MimeType r0 = r2.mimeObject     // Catch: javax.activation.MimeTypeParseException -> L19
            if (r0 != 0) goto Ld
            javax.activation.MimeType r0 = new javax.activation.MimeType     // Catch: javax.activation.MimeTypeParseException -> L19
            java.lang.String r1 = r2.mimeType     // Catch: javax.activation.MimeTypeParseException -> L19
            r0.<init>(r1)     // Catch: javax.activation.MimeTypeParseException -> L19
            r2.mimeObject = r0     // Catch: javax.activation.MimeTypeParseException -> L19
        Ld:
            javax.activation.MimeType r0 = new javax.activation.MimeType     // Catch: javax.activation.MimeTypeParseException -> L19
            r0.<init>(r3)     // Catch: javax.activation.MimeTypeParseException -> L19
            javax.activation.MimeType r3 = r2.mimeObject
            boolean r3 = r3.match(r0)
            return r3
        L19:
            java.lang.String r0 = r2.mimeType
            boolean r3 = r0.equalsIgnoreCase(r3)
            return r3
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    protected java.lang.String normalizeMimeType(java.lang.String r1) {
            r0 = this;
            return r1
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    protected java.lang.String normalizeMimeTypeParameter(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return r2
    }

    @Override // myjava.awt.datatransfer.DataFlavor
    public void setHumanPresentableName(java.lang.String r1) {
            r0 = this;
            r0.humanPresentableName = r1
            return
    }
}
