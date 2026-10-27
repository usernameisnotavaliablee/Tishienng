package javax.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ByteArrayDataSource implements javax.activation.DataSource {
    private byte[] data;
    private int len;
    private java.lang.String name;
    private java.lang.String type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DSByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        DSByteArrayOutputStream() {
                r0 = this;
                r0.<init>()
                return
        }

        public byte[] getBuf() {
                r1 = this;
                byte[] r0 = r1.buf
                return r0
        }

        public int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }
    }

    public ByteArrayDataSource(java.io.InputStream r5, java.lang.String r6) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.len = r0
            java.lang.String r0 = ""
            r4.name = r0
            javax.mail.util.ByteArrayDataSource$DSByteArrayOutputStream r0 = new javax.mail.util.ByteArrayDataSource$DSByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
        L13:
            int r2 = r5.read(r1)
            if (r2 > 0) goto L39
            byte[] r5 = r0.getBuf()
            r4.data = r5
            int r5 = r0.getCount()
            r4.len = r5
            byte[] r1 = r4.data
            int r1 = r1.length
            int r1 = r1 - r5
            r5 = 262144(0x40000, float:3.67342E-40)
            if (r1 <= r5) goto L36
            byte[] r5 = r0.toByteArray()
            r4.data = r5
            int r5 = r5.length
            r4.len = r5
        L36:
            r4.type = r6
            return
        L39:
            r3 = 0
            r0.write(r1, r3, r2)
            goto L13
    }

    public ByteArrayDataSource(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.len = r0
            java.lang.String r0 = ""
            r2.name = r0
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: javax.mail.internet.ParseException -> L16
            r0.<init>(r4)     // Catch: javax.mail.internet.ParseException -> L16
            java.lang.String r1 = "charset"
            java.lang.String r0 = r0.getParameter(r1)     // Catch: javax.mail.internet.ParseException -> L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1d
            java.lang.String r0 = javax.mail.internet.MimeUtility.getDefaultJavaCharset()
        L1d:
            byte[] r3 = r3.getBytes(r0)
            r2.data = r3
            r2.type = r4
            return
    }

    public ByteArrayDataSource(byte[] r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.len = r0
            java.lang.String r0 = ""
            r1.name = r0
            r1.data = r2
            r1.type = r3
            return
    }

    @Override // javax.activation.DataSource
    public java.lang.String getContentType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r4 = this;
            byte[] r0 = r4.data
            if (r0 == 0) goto L16
            int r1 = r4.len
            if (r1 >= 0) goto Lb
            int r0 = r0.length
            r4.len = r0
        Lb:
            javax.mail.util.SharedByteArrayInputStream r0 = new javax.mail.util.SharedByteArrayInputStream
            byte[] r1 = r4.data
            r2 = 0
            int r3 = r4.len
            r0.<init>(r1, r2, r3)
            return r0
        L16:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "no data"
            r0.<init>(r1)
            throw r0
    }

    @Override // javax.activation.DataSource
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cannot do this"
            r0.<init>(r1)
            throw r0
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }
}
