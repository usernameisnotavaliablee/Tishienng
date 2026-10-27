package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FileDataSource implements javax.activation.DataSource {
    private java.io.File _file;
    private javax.activation.FileTypeMap typeMap;

    public FileDataSource(java.io.File r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.typeMap = r0
            r1._file = r2
            return
    }

    public FileDataSource(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // javax.activation.DataSource
    public java.lang.String getContentType() {
            r2 = this;
            javax.activation.FileTypeMap r0 = r2.typeMap
            if (r0 != 0) goto Lf
            javax.activation.FileTypeMap r0 = javax.activation.FileTypeMap.getDefaultFileTypeMap()
            java.io.File r1 = r2._file
            java.lang.String r0 = r0.getContentType(r1)
            return r0
        Lf:
            java.io.File r1 = r2._file
            java.lang.String r0 = r0.getContentType(r1)
            return r0
    }

    public java.io.File getFile() {
            r1 = this;
            java.io.File r0 = r1._file
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r2 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2._file
            r0.<init>(r1)
            return r0
    }

    @Override // javax.activation.DataSource
    public java.lang.String getName() {
            r1 = this;
            java.io.File r0 = r1._file
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r2 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = r2._file
            r0.<init>(r1)
            return r0
    }

    public void setFileTypeMap(javax.activation.FileTypeMap r1) {
            r0 = this;
            r0.typeMap = r1
            return
    }
}
