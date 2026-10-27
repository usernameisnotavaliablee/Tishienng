package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class DataHandlerDataSource implements javax.activation.DataSource {
    javax.activation.DataHandler dataHandler;

    public DataHandlerDataSource(javax.activation.DataHandler r1) {
            r0 = this;
            r0.<init>()
            r0.dataHandler = r1
            return
    }

    @Override // javax.activation.DataSource
    public java.lang.String getContentType() {
            r1 = this;
            javax.activation.DataHandler r0 = r1.dataHandler
            java.lang.String r0 = r0.getContentType()
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r1 = this;
            javax.activation.DataHandler r0 = r1.dataHandler
            java.io.InputStream r0 = r0.getInputStream()
            return r0
    }

    @Override // javax.activation.DataSource
    public java.lang.String getName() {
            r1 = this;
            javax.activation.DataHandler r0 = r1.dataHandler
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r1 = this;
            javax.activation.DataHandler r0 = r1.dataHandler
            java.io.OutputStream r0 = r0.getOutputStream()
            return r0
    }
}
