package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class PreencodedMimeBodyPart extends javax.mail.internet.MimeBodyPart {
    private java.lang.String encoding;

    public PreencodedMimeBodyPart(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.encoding = r1
            return
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public java.lang.String getEncoding() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = r1.encoding
            return r0
    }

    @Override // javax.mail.internet.MimeBodyPart
    protected void updateHeaders() throws javax.mail.MessagingException {
            r1 = this;
            super.updateHeaders()
            java.lang.String r0 = r1.encoding
            javax.mail.internet.MimeBodyPart.setEncoding(r1, r0)
            return
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void writeTo(java.io.OutputStream r4) throws java.io.IOException, javax.mail.MessagingException {
            r3 = this;
            boolean r0 = r4 instanceof com.sun.mail.util.LineOutputStream
            if (r0 == 0) goto L8
            r0 = r4
            com.sun.mail.util.LineOutputStream r0 = (com.sun.mail.util.LineOutputStream) r0
            goto Ld
        L8:
            com.sun.mail.util.LineOutputStream r0 = new com.sun.mail.util.LineOutputStream
            r0.<init>(r4)
        Ld:
            java.util.Enumeration r1 = r3.getAllHeaderLines()
        L11:
            boolean r2 = r1.hasMoreElements()
            if (r2 != 0) goto L25
            r0.writeln()
            javax.activation.DataHandler r0 = r3.getDataHandler()
            r0.writeTo(r4)
            r4.flush()
            return
        L25:
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            r0.writeln(r2)
            goto L11
    }
}
