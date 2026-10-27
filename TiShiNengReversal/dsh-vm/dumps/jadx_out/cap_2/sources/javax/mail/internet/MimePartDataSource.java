package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimePartDataSource implements javax.activation.DataSource, javax.mail.MessageAware {
    private static boolean ignoreMultipartEncoding = true;
    private javax.mail.MessageContext context;
    protected javax.mail.internet.MimePart part;

    static {
            java.lang.String r0 = "mail.mime.ignoremultipartencoding"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L15
            if (r0 == 0) goto L12
            java.lang.String r1 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.SecurityException -> L15
            if (r0 == 0) goto L12
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            javax.mail.internet.MimePartDataSource.ignoreMultipartEncoding = r0     // Catch: java.lang.SecurityException -> L15
        L15:
            return
    }

    public MimePartDataSource(javax.mail.internet.MimePart r1) {
            r0 = this;
            r0.<init>()
            r0.part = r1
            return
    }

    private static java.lang.String restrictEncoding(java.lang.String r1, javax.mail.internet.MimePart r2) throws javax.mail.MessagingException {
            boolean r0 = javax.mail.internet.MimePartDataSource.ignoreMultipartEncoding
            if (r0 == 0) goto L3d
            if (r1 != 0) goto L7
            goto L3d
        L7:
            java.lang.String r0 = "7bit"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "8bit"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "binary"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L20
            goto L3d
        L20:
            java.lang.String r2 = r2.getContentType()
            if (r2 != 0) goto L27
            goto L3d
        L27:
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: javax.mail.internet.ParseException -> L3d
            r0.<init>(r2)     // Catch: javax.mail.internet.ParseException -> L3d
            java.lang.String r2 = "multipart/*"
            boolean r2 = r0.match(r2)     // Catch: javax.mail.internet.ParseException -> L3d
            if (r2 != 0) goto L3c
            java.lang.String r2 = "message/*"
            boolean r2 = r0.match(r2)     // Catch: javax.mail.internet.ParseException -> L3d
            if (r2 == 0) goto L3d
        L3c:
            r1 = 0
        L3d:
            return r1
    }

    @Override // javax.activation.DataSource
    public java.lang.String getContentType() {
            r1 = this;
            javax.mail.internet.MimePart r0 = r1.part     // Catch: javax.mail.MessagingException -> L7
            java.lang.String r0 = r0.getContentType()     // Catch: javax.mail.MessagingException -> L7
            return r0
        L7:
            java.lang.String r0 = "application/octet-stream"
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r3 = this;
            javax.mail.internet.MimePart r0 = r3.part     // Catch: javax.mail.MessagingException -> Ld
            boolean r1 = r0 instanceof javax.mail.internet.MimeBodyPart     // Catch: javax.mail.MessagingException -> Ld
            if (r1 == 0) goto Lf
            javax.mail.internet.MimeBodyPart r0 = (javax.mail.internet.MimeBodyPart) r0     // Catch: javax.mail.MessagingException -> Ld
            java.io.InputStream r0 = r0.getContentStream()     // Catch: javax.mail.MessagingException -> Ld
            goto L19
        Ld:
            r0 = move-exception
            goto L34
        Lf:
            boolean r1 = r0 instanceof javax.mail.internet.MimeMessage     // Catch: javax.mail.MessagingException -> Ld
            if (r1 == 0) goto L2c
            javax.mail.internet.MimeMessage r0 = (javax.mail.internet.MimeMessage) r0     // Catch: javax.mail.MessagingException -> Ld
            java.io.InputStream r0 = r0.getContentStream()     // Catch: javax.mail.MessagingException -> Ld
        L19:
            javax.mail.internet.MimePart r1 = r3.part     // Catch: javax.mail.MessagingException -> Ld
            java.lang.String r1 = r1.getEncoding()     // Catch: javax.mail.MessagingException -> Ld
            javax.mail.internet.MimePart r2 = r3.part     // Catch: javax.mail.MessagingException -> Ld
            java.lang.String r1 = restrictEncoding(r1, r2)     // Catch: javax.mail.MessagingException -> Ld
            if (r1 == 0) goto L2b
            java.io.InputStream r0 = javax.mail.internet.MimeUtility.decode(r0, r1)     // Catch: javax.mail.MessagingException -> Ld
        L2b:
            return r0
        L2c:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: javax.mail.MessagingException -> Ld
            java.lang.String r1 = "Unknown part"
            r0.<init>(r1)     // Catch: javax.mail.MessagingException -> Ld
            throw r0     // Catch: javax.mail.MessagingException -> Ld
        L34:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // javax.mail.MessageAware
    public synchronized javax.mail.MessageContext getMessageContext() {
            r2 = this;
            monitor-enter(r2)
            javax.mail.MessageContext r0 = r2.context     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            javax.mail.MessageContext r0 = new javax.mail.MessageContext     // Catch: java.lang.Throwable -> Lf
            javax.mail.internet.MimePart r1 = r2.part     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            r2.context = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L15
        L11:
            javax.mail.MessageContext r0 = r2.context     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // javax.activation.DataSource
    public java.lang.String getName() {
            r2 = this;
            javax.mail.internet.MimePart r0 = r2.part     // Catch: javax.mail.MessagingException -> Ld
            boolean r1 = r0 instanceof javax.mail.internet.MimeBodyPart     // Catch: javax.mail.MessagingException -> Ld
            if (r1 == 0) goto Ld
            javax.mail.internet.MimeBodyPart r0 = (javax.mail.internet.MimeBodyPart) r0     // Catch: javax.mail.MessagingException -> Ld
            java.lang.String r0 = r0.getFileName()     // Catch: javax.mail.MessagingException -> Ld
            return r0
        Ld:
            java.lang.String r0 = ""
            return r0
    }

    @Override // javax.activation.DataSource
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r1 = this;
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            r0.<init>()
            throw r0
    }
}
