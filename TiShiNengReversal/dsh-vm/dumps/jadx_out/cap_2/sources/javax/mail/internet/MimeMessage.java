package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimeMessage extends javax.mail.Message implements javax.mail.internet.MimePart {
    private static final javax.mail.Flags answeredFlag = null;
    private static javax.mail.internet.MailDateFormat mailDateFormat;
    java.lang.Object cachedContent;
    protected byte[] content;
    protected java.io.InputStream contentStream;
    protected javax.activation.DataHandler dh;
    protected javax.mail.Flags flags;
    protected javax.mail.internet.InternetHeaders headers;
    protected boolean modified;
    protected boolean saved;
    private boolean strict;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RecipientType extends javax.mail.Message.RecipientType {
        public static final javax.mail.internet.MimeMessage.RecipientType NEWSGROUPS = null;
        private static final long serialVersionUID = -5468290701714395543L;

        static {
                javax.mail.internet.MimeMessage$RecipientType r0 = new javax.mail.internet.MimeMessage$RecipientType
                java.lang.String r1 = "Newsgroups"
                r0.<init>(r1)
                javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS = r0
                return
        }

        protected RecipientType(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // javax.mail.Message.RecipientType
        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r2 = this;
                java.lang.String r0 = r2.type
                java.lang.String r1 = "Newsgroups"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Ld
                javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
                return r0
            Ld:
                java.lang.Object r0 = super.readResolve()
                return r0
        }
    }

    static {
            javax.mail.internet.MailDateFormat r0 = new javax.mail.internet.MailDateFormat
            r0.<init>()
            javax.mail.internet.MimeMessage.mailDateFormat = r0
            javax.mail.Flags r0 = new javax.mail.Flags
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.ANSWERED
            r0.<init>(r1)
            javax.mail.internet.MimeMessage.answeredFlag = r0
            return
    }

    protected MimeMessage(javax.mail.Folder r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.modified = r1
            r0.saved = r1
            r1 = 1
            r0.strict = r1
            javax.mail.Flags r2 = new javax.mail.Flags
            r2.<init>()
            r0.flags = r2
            r0.saved = r1
            r0.initStrict()
            return
    }

    protected MimeMessage(javax.mail.Folder r1, java.io.InputStream r2, int r3) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1, r3)
            r0.initStrict()
            r0.parse(r2)
            return
    }

    protected MimeMessage(javax.mail.Folder r1, javax.mail.internet.InternetHeaders r2, byte[] r3, int r4) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1, r4)
            r0.headers = r2
            r0.content = r3
            r0.initStrict()
            return
    }

    public MimeMessage(javax.mail.Session r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.saved = r1
            r1 = 1
            r0.strict = r1
            r0.modified = r1
            javax.mail.internet.InternetHeaders r1 = new javax.mail.internet.InternetHeaders
            r1.<init>()
            r0.headers = r1
            javax.mail.Flags r1 = new javax.mail.Flags
            r1.<init>()
            r0.flags = r1
            r0.initStrict()
            return
    }

    public MimeMessage(javax.mail.Session r2, java.io.InputStream r3) throws javax.mail.MessagingException {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.modified = r2
            r1.saved = r2
            r2 = 1
            r1.strict = r2
            javax.mail.Flags r0 = new javax.mail.Flags
            r0.<init>()
            r1.flags = r0
            r1.initStrict()
            r1.parse(r3)
            r1.saved = r2
            return
    }

    public MimeMessage(javax.mail.internet.MimeMessage r4) throws javax.mail.MessagingException {
            r3 = this;
            javax.mail.Session r0 = r4.session
            r3.<init>(r0)
            r0 = 0
            r3.modified = r0
            r3.saved = r0
            r0 = 1
            r3.strict = r0
            javax.mail.Flags r1 = r4.getFlags()
            r3.flags = r1
            int r1 = r4.getSize()
            if (r1 <= 0) goto L1f
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
            goto L24
        L1f:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
        L24:
            boolean r1 = r4.strict     // Catch: java.io.IOException -> L40
            r3.strict = r1     // Catch: java.io.IOException -> L40
            r4.writeTo(r2)     // Catch: java.io.IOException -> L40
            r2.close()     // Catch: java.io.IOException -> L40
            javax.mail.util.SharedByteArrayInputStream r4 = new javax.mail.util.SharedByteArrayInputStream     // Catch: java.io.IOException -> L40
            byte[] r1 = r2.toByteArray()     // Catch: java.io.IOException -> L40
            r4.<init>(r1)     // Catch: java.io.IOException -> L40
            r3.parse(r4)     // Catch: java.io.IOException -> L40
            r4.close()     // Catch: java.io.IOException -> L40
            r3.saved = r0     // Catch: java.io.IOException -> L40
            return
        L40:
            r4 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "IOException while copying message"
            r0.<init>(r1, r4)
            throw r0
    }

    private void addAddressHeader(java.lang.String r1, javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r0 = this;
            java.lang.String r2 = javax.mail.internet.InternetAddress.toString(r2)
            if (r2 != 0) goto L7
            return
        L7:
            r0.addHeader(r1, r2)
            return
    }

    private javax.mail.Address[] eliminateDuplicates(java.util.Vector r8, javax.mail.Address[] r9) {
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            int r4 = r9.length
            if (r2 < r4) goto L2b
            if (r3 == 0) goto L2a
            boolean r8 = r9 instanceof javax.mail.internet.InternetAddress[]
            if (r8 == 0) goto L15
            int r8 = r9.length
            int r8 = r8 - r3
            javax.mail.internet.InternetAddress[] r8 = new javax.mail.internet.InternetAddress[r8]
            goto L19
        L15:
            int r8 = r9.length
            int r8 = r8 - r3
            javax.mail.Address[] r8 = new javax.mail.Address[r8]
        L19:
            r0 = 0
        L1a:
            int r2 = r9.length
            if (r1 < r2) goto L1e
            return r8
        L1e:
            r2 = r9[r1]
            if (r2 == 0) goto L27
            int r3 = r0 + 1
            r8[r0] = r2
            r0 = r3
        L27:
            int r1 = r1 + 1
            goto L1a
        L2a:
            return r9
        L2b:
            r4 = 0
        L2c:
            int r5 = r8.size()
            if (r4 < r5) goto L34
            r4 = 0
            goto L47
        L34:
            java.lang.Object r5 = r8.elementAt(r4)
            javax.mail.internet.InternetAddress r5 = (javax.mail.internet.InternetAddress) r5
            r6 = r9[r2]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L51
            int r3 = r3 + 1
            r9[r2] = r0
            r4 = 1
        L47:
            if (r4 != 0) goto L4e
            r4 = r9[r2]
            r8.addElement(r4)
        L4e:
            int r2 = r2 + 1
            goto L7
        L51:
            int r4 = r4 + 1
            goto L2c
    }

    private javax.mail.Address[] getAddressHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = ","
            java.lang.String r2 = r1.getHeader(r2, r0)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            boolean r0 = r1.strict
            javax.mail.internet.InternetAddress[] r2 = javax.mail.internet.InternetAddress.parseHeader(r2, r0)
            return r2
    }

    private java.lang.String getHeaderName(javax.mail.Message.RecipientType r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.TO
            if (r2 != r0) goto L7
            java.lang.String r2 = "To"
            return r2
        L7:
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.CC
            if (r2 != r0) goto Le
            java.lang.String r2 = "Cc"
            return r2
        Le:
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.BCC
            if (r2 != r0) goto L15
            java.lang.String r2 = "Bcc"
            return r2
        L15:
            javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            if (r2 != r0) goto L1c
            java.lang.String r2 = "Newsgroups"
            return r2
        L1c:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.String r0 = "Invalid Recipient Type"
            r2.<init>(r0)
            throw r2
    }

    private void initStrict() {
            r2 = this;
            javax.mail.Session r0 = r2.session
            if (r0 == 0) goto L19
            java.lang.String r1 = "mail.mime.address.strict"
            java.lang.String r0 = r0.getProperty(r1)
            if (r0 == 0) goto L16
            java.lang.String r1 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            r2.strict = r0
        L19:
            return
    }

    private void setAddressHeader(java.lang.String r1, javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r0 = this;
            java.lang.String r2 = javax.mail.internet.InternetAddress.toString(r2)
            if (r2 != 0) goto La
            r0.removeHeader(r1)
            return
        La:
            r0.setHeader(r1, r2)
            return
    }

    @Override // javax.mail.Message
    public void addFrom(javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "From"
            r1.addAddressHeader(r0, r2)
            return
    }

    @Override // javax.mail.Part
    public void addHeader(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            r0.addHeader(r2, r3)
            return
    }

    @Override // javax.mail.internet.MimePart
    public void addHeaderLine(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            r0.addHeaderLine(r2)
            return
    }

    public void addRecipients(javax.mail.Message.RecipientType r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            if (r2 != r0) goto L12
            if (r3 == 0) goto L11
            int r2 = r3.length()
            if (r2 == 0) goto L11
            java.lang.String r2 = "Newsgroups"
            r1.addHeader(r2, r3)
        L11:
            return
        L12:
            java.lang.String r2 = r1.getHeaderName(r2)
            javax.mail.internet.InternetAddress[] r3 = javax.mail.internet.InternetAddress.parse(r3)
            r1.addAddressHeader(r2, r3)
            return
    }

    @Override // javax.mail.Message
    public void addRecipients(javax.mail.Message.RecipientType r2, javax.mail.Address[] r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            if (r2 != r0) goto L10
            java.lang.String r2 = javax.mail.internet.NewsAddress.toString(r3)
            if (r2 == 0) goto Lf
            java.lang.String r3 = "Newsgroups"
            r1.addHeader(r3, r2)
        Lf:
            return
        L10:
            java.lang.String r2 = r1.getHeaderName(r2)
            r1.addAddressHeader(r2, r3)
            return
    }

    protected javax.mail.internet.InternetHeaders createInternetHeaders(java.io.InputStream r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>(r2)
            return r0
    }

    protected javax.mail.internet.MimeMessage createMimeMessage(javax.mail.Session r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeMessage r0 = new javax.mail.internet.MimeMessage
            r0.<init>(r2)
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.util.Enumeration getAllHeaderLines() throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r0 = r0.getAllHeaderLines()
            return r0
    }

    @Override // javax.mail.Part
    public java.util.Enumeration getAllHeaders() throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r0 = r0.getAllHeaders()
            return r0
    }

    @Override // javax.mail.Message
    public javax.mail.Address[] getAllRecipients() throws javax.mail.MessagingException {
            r5 = this;
            javax.mail.Address[] r0 = super.getAllRecipients()
            javax.mail.internet.MimeMessage$RecipientType r1 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            javax.mail.Address[] r1 = r5.getRecipients(r1)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            if (r0 != 0) goto L10
            return r1
        L10:
            int r2 = r0.length
            int r3 = r1.length
            int r2 = r2 + r3
            javax.mail.Address[] r2 = new javax.mail.Address[r2]
            int r3 = r0.length
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r2, r4, r3)
            int r0 = r0.length
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r4, r2, r0, r3)
            return r2
    }

    @Override // javax.mail.Part
    public java.lang.Object getContent() throws java.io.IOException, javax.mail.MessagingException {
            r3 = this;
            java.lang.Object r0 = r3.cachedContent
            if (r0 == 0) goto L5
            return r0
        L5:
            javax.activation.DataHandler r0 = r3.getDataHandler()     // Catch: com.sun.mail.util.MessageRemovedIOException -> L24 com.sun.mail.util.FolderClosedIOException -> L26
            java.lang.Object r0 = r0.getContent()     // Catch: com.sun.mail.util.MessageRemovedIOException -> L24 com.sun.mail.util.FolderClosedIOException -> L26
            boolean r1 = javax.mail.internet.MimeBodyPart.cacheMultipart
            if (r1 == 0) goto L23
            boolean r1 = r0 instanceof javax.mail.Multipart
            if (r1 != 0) goto L19
            boolean r1 = r0 instanceof javax.mail.Message
            if (r1 == 0) goto L23
        L19:
            byte[] r1 = r3.content
            if (r1 != 0) goto L21
            java.io.InputStream r1 = r3.contentStream
            if (r1 == 0) goto L23
        L21:
            r3.cachedContent = r0
        L23:
            return r0
        L24:
            r0 = move-exception
            goto L28
        L26:
            r0 = move-exception
            goto L32
        L28:
            javax.mail.MessageRemovedException r1 = new javax.mail.MessageRemovedException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L32:
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException
            javax.mail.Folder r2 = r0.getFolder()
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // javax.mail.internet.MimePart
    public java.lang.String getContentID() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Content-Id"
            r1 = 0
            java.lang.String r0 = r2.getHeader(r0, r1)
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.lang.String[] getContentLanguage() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String[] r0 = javax.mail.internet.MimeBodyPart.getContentLanguage(r1)
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.lang.String getContentMD5() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Content-MD5"
            r1 = 0
            java.lang.String r0 = r2.getHeader(r0, r1)
            return r0
    }

    protected java.io.InputStream getContentStream() throws javax.mail.MessagingException {
            r5 = this;
            java.io.InputStream r0 = r5.contentStream
            if (r0 == 0) goto Lf
            javax.mail.internet.SharedInputStream r0 = (javax.mail.internet.SharedInputStream) r0
            r1 = 0
            r3 = -1
            java.io.InputStream r0 = r0.newStream(r1, r3)
            return r0
        Lf:
            byte[] r0 = r5.content
            if (r0 == 0) goto L1b
            javax.mail.util.SharedByteArrayInputStream r0 = new javax.mail.util.SharedByteArrayInputStream
            byte[] r1 = r5.content
            r0.<init>(r1)
            return r0
        L1b:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "No content"
            r0.<init>(r1)
            throw r0
    }

    @Override // javax.mail.Part
    public java.lang.String getContentType() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Content-Type"
            r1 = 0
            java.lang.String r0 = r2.getHeader(r0, r1)
            if (r0 != 0) goto Lb
            java.lang.String r0 = "text/plain"
        Lb:
            return r0
    }

    @Override // javax.mail.Part
    public synchronized javax.activation.DataHandler getDataHandler() throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            javax.activation.DataHandler r0 = r2.dh     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            javax.activation.DataHandler r0 = new javax.activation.DataHandler     // Catch: java.lang.Throwable -> L12
            javax.mail.internet.MimePartDataSource r1 = new javax.mail.internet.MimePartDataSource     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            r2.dh = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L18
        L14:
            javax.activation.DataHandler r0 = r2.dh     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r0
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // javax.mail.Part
    public java.lang.String getDescription() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = javax.mail.internet.MimeBodyPart.getDescription(r1)
            return r0
    }

    @Override // javax.mail.Part
    public java.lang.String getDisposition() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = javax.mail.internet.MimeBodyPart.getDisposition(r1)
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.lang.String getEncoding() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = javax.mail.internet.MimeBodyPart.getEncoding(r1)
            return r0
    }

    @Override // javax.mail.Part
    public java.lang.String getFileName() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = javax.mail.internet.MimeBodyPart.getFileName(r1)
            return r0
    }

    @Override // javax.mail.Message
    public synchronized javax.mail.Flags getFlags() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            javax.mail.Flags r0 = r1.flags     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> Lb
            javax.mail.Flags r0 = (javax.mail.Flags) r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // javax.mail.Message
    public javax.mail.Address[] getFrom() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "From"
            javax.mail.Address[] r0 = r1.getAddressHeader(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = "Sender"
            javax.mail.Address[] r0 = r1.getAddressHeader(r0)
        Le:
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.lang.String getHeader(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.lang.String r2 = r0.getHeader(r2, r3)
            return r2
    }

    @Override // javax.mail.Part
    public java.lang.String[] getHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.lang.String[] r2 = r0.getHeader(r2)
            return r2
    }

    @Override // javax.mail.Part
    public java.io.InputStream getInputStream() throws java.io.IOException, javax.mail.MessagingException {
            r1 = this;
            javax.activation.DataHandler r0 = r1.getDataHandler()
            java.io.InputStream r0 = r0.getInputStream()
            return r0
    }

    @Override // javax.mail.Part
    public int getLineCount() throws javax.mail.MessagingException {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.util.Enumeration getMatchingHeaderLines(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getMatchingHeaderLines(r2)
            return r2
    }

    @Override // javax.mail.Part
    public java.util.Enumeration getMatchingHeaders(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getMatchingHeaders(r2)
            return r2
    }

    public java.lang.String getMessageID() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Message-ID"
            r1 = 0
            java.lang.String r0 = r2.getHeader(r0, r1)
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.util.Enumeration getNonMatchingHeaderLines(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getNonMatchingHeaderLines(r2)
            return r2
    }

    @Override // javax.mail.Part
    public java.util.Enumeration getNonMatchingHeaders(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.util.Enumeration r2 = r0.getNonMatchingHeaders(r2)
            return r2
    }

    public java.io.InputStream getRawInputStream() throws javax.mail.MessagingException {
            r1 = this;
            java.io.InputStream r0 = r1.getContentStream()
            return r0
    }

    @Override // javax.mail.Message
    public java.util.Date getReceivedDate() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // javax.mail.Message
    public javax.mail.Address[] getRecipients(javax.mail.Message.RecipientType r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            if (r2 != r0) goto L15
            java.lang.String r2 = "Newsgroups"
            java.lang.String r0 = ","
            java.lang.String r2 = r1.getHeader(r2, r0)
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            javax.mail.internet.NewsAddress[] r2 = javax.mail.internet.NewsAddress.parse(r2)
            return r2
        L15:
            java.lang.String r2 = r1.getHeaderName(r2)
            javax.mail.Address[] r2 = r1.getAddressHeader(r2)
            return r2
    }

    @Override // javax.mail.Message
    public javax.mail.Address[] getReplyTo() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "Reply-To"
            javax.mail.Address[] r0 = r1.getAddressHeader(r0)
            if (r0 != 0) goto Lc
            javax.mail.Address[] r0 = r1.getFrom()
        Lc:
            return r0
    }

    public javax.mail.Address getSender() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Sender"
            javax.mail.Address[] r0 = r2.getAddressHeader(r0)
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto Lc
            goto L10
        Lc:
            r1 = 0
            r0 = r0[r1]
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // javax.mail.Message
    public java.util.Date getSentDate() throws javax.mail.MessagingException {
            r4 = this;
            java.lang.String r0 = "Date"
            r1 = 0
            java.lang.String r0 = r4.getHeader(r0, r1)
            if (r0 == 0) goto L17
            javax.mail.internet.MailDateFormat r2 = javax.mail.internet.MimeMessage.mailDateFormat     // Catch: java.text.ParseException -> L17
            monitor-enter(r2)     // Catch: java.text.ParseException -> L17
            javax.mail.internet.MailDateFormat r3 = javax.mail.internet.MimeMessage.mailDateFormat     // Catch: java.lang.Throwable -> L14
            java.util.Date r0 = r3.parse(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.text.ParseException -> L17
        L17:
            return r1
    }

    @Override // javax.mail.Part
    public int getSize() throws javax.mail.MessagingException {
            r1 = this;
            byte[] r0 = r1.content
            if (r0 == 0) goto L6
            int r0 = r0.length
            return r0
        L6:
            java.io.InputStream r0 = r1.contentStream
            if (r0 == 0) goto L11
            int r0 = r0.available()     // Catch: java.io.IOException -> L11
            if (r0 <= 0) goto L11
            return r0
        L11:
            r0 = -1
            return r0
    }

    @Override // javax.mail.Message
    public java.lang.String getSubject() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Subject"
            r1 = 0
            java.lang.String r0 = r2.getHeader(r0, r1)
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r1 = javax.mail.internet.MimeUtility.unfold(r0)     // Catch: java.io.UnsupportedEncodingException -> L12
            java.lang.String r0 = javax.mail.internet.MimeUtility.decodeText(r1)     // Catch: java.io.UnsupportedEncodingException -> L12
        L12:
            return r0
    }

    @Override // javax.mail.Part
    public boolean isMimeType(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            boolean r1 = javax.mail.internet.MimeBodyPart.isMimeType(r0, r1)
            return r1
    }

    @Override // javax.mail.Message
    public synchronized boolean isSet(javax.mail.Flags.Flag r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            javax.mail.Flags r0 = r1.flags     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    protected void parse(java.io.InputStream r5) throws javax.mail.MessagingException {
            r4 = this;
            boolean r0 = r5 instanceof java.io.ByteArrayInputStream
            if (r0 != 0) goto L12
            boolean r0 = r5 instanceof java.io.BufferedInputStream
            if (r0 != 0) goto L12
            boolean r0 = r5 instanceof javax.mail.internet.SharedInputStream
            if (r0 != 0) goto L12
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r5)
            r5 = r0
        L12:
            javax.mail.internet.InternetHeaders r0 = r4.createInternetHeaders(r5)
            r4.headers = r0
            boolean r0 = r5 instanceof javax.mail.internet.SharedInputStream
            if (r0 == 0) goto L2b
            javax.mail.internet.SharedInputStream r5 = (javax.mail.internet.SharedInputStream) r5
            long r0 = r5.getPosition()
            r2 = -1
            java.io.InputStream r5 = r5.newStream(r0, r2)
            r4.contentStream = r5
            goto L31
        L2b:
            byte[] r5 = com.sun.mail.util.ASCIIUtility.getBytes(r5)     // Catch: java.io.IOException -> L35
            r4.content = r5     // Catch: java.io.IOException -> L35
        L31:
            r5 = 0
            r4.modified = r5
            return
        L35:
            r5 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "IOException"
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // javax.mail.Part
    public void removeHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            r0.removeHeader(r2)
            return
    }

    @Override // javax.mail.Message
    public javax.mail.Message reply(boolean r10) throws javax.mail.MessagingException {
            r9 = this;
            javax.mail.Session r0 = r9.session
            javax.mail.internet.MimeMessage r0 = r9.createMimeMessage(r0)
            java.lang.String r1 = "Subject"
            r2 = 0
            java.lang.String r3 = r9.getHeader(r1, r2)
            if (r3 == 0) goto L2c
            r7 = 0
            r8 = 4
            r4 = 1
            r5 = 0
            java.lang.String r6 = "Re: "
            boolean r4 = r3.regionMatches(r4, r5, r6, r7, r8)
            if (r4 != 0) goto L29
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Re: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L29:
            r0.setHeader(r1, r3)
        L2c:
            javax.mail.Address[] r1 = r9.getReplyTo()
            javax.mail.Message$RecipientType r3 = javax.mail.Message.RecipientType.TO
            r0.setRecipients(r3, r1)
            r4 = 1
            if (r10 == 0) goto Lb0
            java.util.Vector r10 = new java.util.Vector
            r10.<init>()
            javax.mail.Session r5 = r9.session
            javax.mail.internet.InternetAddress r5 = javax.mail.internet.InternetAddress.getLocalAddress(r5)
            if (r5 == 0) goto L48
            r10.addElement(r5)
        L48:
            javax.mail.Session r5 = r9.session
            if (r5 == 0) goto L53
            java.lang.String r6 = "mail.alternates"
            java.lang.String r5 = r5.getProperty(r6)
            goto L54
        L53:
            r5 = r2
        L54:
            r6 = 0
            if (r5 == 0) goto L5e
            javax.mail.internet.InternetAddress[] r5 = javax.mail.internet.InternetAddress.parse(r5, r6)
            r9.eliminateDuplicates(r10, r5)
        L5e:
            javax.mail.Session r5 = r9.session
            if (r5 == 0) goto L69
            java.lang.String r7 = "mail.replyallcc"
            java.lang.String r5 = r5.getProperty(r7)
            goto L6a
        L69:
            r5 = r2
        L6a:
            if (r5 == 0) goto L75
            java.lang.String r7 = "true"
            boolean r5 = r5.equalsIgnoreCase(r7)
            if (r5 == 0) goto L75
            r6 = 1
        L75:
            r9.eliminateDuplicates(r10, r1)
            javax.mail.Address[] r1 = r9.getRecipients(r3)
            javax.mail.Address[] r1 = r9.eliminateDuplicates(r10, r1)
            if (r1 == 0) goto L90
            int r5 = r1.length
            if (r5 <= 0) goto L90
            if (r6 == 0) goto L8d
            javax.mail.Message$RecipientType r3 = javax.mail.Message.RecipientType.CC
            r0.addRecipients(r3, r1)
            goto L90
        L8d:
            r0.addRecipients(r3, r1)
        L90:
            javax.mail.Message$RecipientType r1 = javax.mail.Message.RecipientType.CC
            javax.mail.Address[] r3 = r9.getRecipients(r1)
            javax.mail.Address[] r10 = r9.eliminateDuplicates(r10, r3)
            if (r10 == 0) goto La2
            int r3 = r10.length
            if (r3 <= 0) goto La2
            r0.addRecipients(r1, r10)
        La2:
            javax.mail.internet.MimeMessage$RecipientType r10 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            javax.mail.Address[] r1 = r9.getRecipients(r10)
            if (r1 == 0) goto Lb0
            int r3 = r1.length
            if (r3 <= 0) goto Lb0
            r0.setRecipients(r10, r1)
        Lb0:
            java.lang.String r10 = "Message-Id"
            java.lang.String r10 = r9.getHeader(r10, r2)
            java.lang.String r1 = "In-Reply-To"
            if (r10 == 0) goto Lbd
            r0.setHeader(r1, r10)
        Lbd:
            java.lang.String r2 = "References"
            java.lang.String r3 = " "
            java.lang.String r5 = r9.getHeader(r2, r3)
            if (r5 != 0) goto Lcb
            java.lang.String r5 = r9.getHeader(r1, r3)
        Lcb:
            if (r10 == 0) goto Le7
            if (r5 == 0) goto Le8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = javax.mail.internet.MimeUtility.unfold(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.<init>(r5)
            r1.append(r3)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            goto Le8
        Le7:
            r10 = r5
        Le8:
            if (r10 == 0) goto Lf3
            r1 = 12
            java.lang.String r10 = javax.mail.internet.MimeUtility.fold(r1, r10)
            r0.setHeader(r2, r10)
        Lf3:
            javax.mail.Flags r10 = javax.mail.internet.MimeMessage.answeredFlag     // Catch: javax.mail.MessagingException -> Lf8
            r9.setFlags(r10, r4)     // Catch: javax.mail.MessagingException -> Lf8
        Lf8:
            return r0
    }

    @Override // javax.mail.Message
    public void saveChanges() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 1
            r1.modified = r0
            r1.saved = r0
            r1.updateHeaders()
            return
    }

    @Override // javax.mail.Part
    public void setContent(java.lang.Object r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            boolean r0 = r2 instanceof javax.mail.Multipart
            if (r0 == 0) goto La
            javax.mail.Multipart r2 = (javax.mail.Multipart) r2
            r1.setContent(r2)
            return
        La:
            javax.activation.DataHandler r0 = new javax.activation.DataHandler
            r0.<init>(r2, r3)
            r1.setDataHandler(r0)
            return
    }

    @Override // javax.mail.Part
    public void setContent(javax.mail.Multipart r3) throws javax.mail.MessagingException {
            r2 = this;
            javax.activation.DataHandler r0 = new javax.activation.DataHandler
            java.lang.String r1 = r3.getContentType()
            r0.<init>(r3, r1)
            r2.setDataHandler(r0)
            r3.setParent(r2)
            return
    }

    public void setContentID(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "Content-ID"
            if (r2 != 0) goto L8
            r1.removeHeader(r0)
            return
        L8:
            r1.setHeader(r0, r2)
            return
    }

    @Override // javax.mail.internet.MimePart
    public void setContentLanguage(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.internet.MimeBodyPart.setContentLanguage(r0, r1)
            return
    }

    @Override // javax.mail.internet.MimePart
    public void setContentMD5(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "Content-MD5"
            r1.setHeader(r0, r2)
            return
    }

    @Override // javax.mail.Part
    public synchronized void setDataHandler(javax.activation.DataHandler r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.dh = r1     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r0.cachedContent = r1     // Catch: java.lang.Throwable -> Lb
            javax.mail.internet.MimeBodyPart.invalidateContentHeaders(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // javax.mail.Part
    public void setDescription(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.setDescription(r2, r0)
            return
    }

    public void setDescription(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.internet.MimeBodyPart.setDescription(r0, r1, r2)
            return
    }

    @Override // javax.mail.Part
    public void setDisposition(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.internet.MimeBodyPart.setDisposition(r0, r1)
            return
    }

    @Override // javax.mail.Part
    public void setFileName(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.internet.MimeBodyPart.setFileName(r0, r1)
            return
    }

    @Override // javax.mail.Message
    public synchronized void setFlags(javax.mail.Flags r1, boolean r2) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            if (r2 == 0) goto Lb
            javax.mail.Flags r2 = r0.flags     // Catch: java.lang.Throwable -> L9
            r2.add(r1)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r1 = move-exception
            goto L12
        Lb:
            javax.mail.Flags r2 = r0.flags     // Catch: java.lang.Throwable -> L9
            r2.remove(r1)     // Catch: java.lang.Throwable -> L9
        L10:
            monitor-exit(r0)
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // javax.mail.Message
    public void setFrom() throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.Session r0 = r2.session
            javax.mail.internet.InternetAddress r0 = javax.mail.internet.InternetAddress.getLocalAddress(r0)
            if (r0 == 0) goto Lc
            r2.setFrom(r0)
            return
        Lc:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "No From address"
            r0.<init>(r1)
            throw r0
    }

    @Override // javax.mail.Message
    public void setFrom(javax.mail.Address r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "From"
            if (r2 != 0) goto L8
            r1.removeHeader(r0)
            return
        L8:
            java.lang.String r2 = r2.toString()
            r1.setHeader(r0, r2)
            return
    }

    @Override // javax.mail.Part
    public void setHeader(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            r0.setHeader(r2, r3)
            return
    }

    public void setRecipients(javax.mail.Message.RecipientType r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            if (r2 != r0) goto L17
            java.lang.String r2 = "Newsgroups"
            if (r3 == 0) goto L13
            int r0 = r3.length()
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            r1.setHeader(r2, r3)
            return
        L13:
            r1.removeHeader(r2)
            return
        L17:
            java.lang.String r2 = r1.getHeaderName(r2)
            javax.mail.internet.InternetAddress[] r3 = javax.mail.internet.InternetAddress.parse(r3)
            r1.setAddressHeader(r2, r3)
            return
    }

    @Override // javax.mail.Message
    public void setRecipients(javax.mail.Message.RecipientType r2, javax.mail.Address[] r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeMessage$RecipientType r0 = javax.mail.internet.MimeMessage.RecipientType.NEWSGROUPS
            if (r2 != r0) goto L18
            java.lang.String r2 = "Newsgroups"
            if (r3 == 0) goto L14
            int r0 = r3.length
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            java.lang.String r3 = javax.mail.internet.NewsAddress.toString(r3)
            r1.setHeader(r2, r3)
            return
        L14:
            r1.removeHeader(r2)
            return
        L18:
            java.lang.String r2 = r1.getHeaderName(r2)
            r1.setAddressHeader(r2, r3)
            return
    }

    @Override // javax.mail.Message
    public void setReplyTo(javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "Reply-To"
            r1.setAddressHeader(r0, r2)
            return
    }

    public void setSender(javax.mail.Address r2) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "Sender"
            if (r2 != 0) goto L8
            r1.removeHeader(r0)
            return
        L8:
            java.lang.String r2 = r2.toString()
            r1.setHeader(r0, r2)
            return
    }

    @Override // javax.mail.Message
    public void setSentDate(java.util.Date r4) throws javax.mail.MessagingException {
            r3 = this;
            if (r4 != 0) goto L8
            java.lang.String r4 = "Date"
            r3.removeHeader(r4)
            return
        L8:
            javax.mail.internet.MailDateFormat r0 = javax.mail.internet.MimeMessage.mailDateFormat
            monitor-enter(r0)
            java.lang.String r1 = "Date"
            javax.mail.internet.MailDateFormat r2 = javax.mail.internet.MimeMessage.mailDateFormat     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = r2.format(r4)     // Catch: java.lang.Throwable -> L18
            r3.setHeader(r1, r4)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    @Override // javax.mail.Message
    public void setSubject(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.setSubject(r2, r0)
            return
    }

    public void setSubject(java.lang.String r3, java.lang.String r4) throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "Subject"
            if (r3 != 0) goto L8
            r2.removeHeader(r0)
            return
        L8:
            r1 = 0
            java.lang.String r3 = javax.mail.internet.MimeUtility.encodeText(r3, r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L17
            r4 = 9
            java.lang.String r3 = javax.mail.internet.MimeUtility.fold(r4, r3)     // Catch: java.io.UnsupportedEncodingException -> L17
            r2.setHeader(r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L17
            return
        L17:
            r3 = move-exception
            javax.mail.MessagingException r4 = new javax.mail.MessagingException
            java.lang.String r0 = "Encoding error"
            r4.<init>(r0, r3)
            throw r4
    }

    @Override // javax.mail.Part, javax.mail.internet.MimePart
    public void setText(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.setText(r2, r0)
            return
    }

    @Override // javax.mail.internet.MimePart
    public void setText(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = "plain"
            javax.mail.internet.MimeBodyPart.setText(r1, r2, r3, r0)
            return
    }

    @Override // javax.mail.internet.MimePart
    public void setText(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.internet.MimeBodyPart.setText(r0, r1, r2, r3)
            return
    }

    protected void updateHeaders() throws javax.mail.MessagingException {
            r3 = this;
            javax.mail.internet.MimeBodyPart.updateHeaders(r3)
            java.lang.String r0 = "MIME-Version"
            java.lang.String r1 = "1.0"
            r3.setHeader(r0, r1)
            r3.updateMessageID()
            java.lang.Object r0 = r3.cachedContent
            if (r0 == 0) goto L2c
            javax.activation.DataHandler r0 = new javax.activation.DataHandler
            java.lang.Object r1 = r3.cachedContent
            java.lang.String r2 = r3.getContentType()
            r0.<init>(r1, r2)
            r3.dh = r0
            r0 = 0
            r3.cachedContent = r0
            r3.content = r0
            java.io.InputStream r1 = r3.contentStream
            if (r1 == 0) goto L2a
            r1.close()     // Catch: java.io.IOException -> L2a
        L2a:
            r3.contentStream = r0
        L2c:
            return
    }

    protected void updateMessageID() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            javax.mail.Session r1 = r2.session
            java.lang.String r1 = javax.mail.internet.UniqueValue.getUniqueMessageIDValue(r1)
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Message-ID"
            r2.setHeader(r1, r0)
            return
    }

    @Override // javax.mail.Part
    public void writeTo(java.io.OutputStream r2) throws java.io.IOException, javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            r1.writeTo(r2, r0)
            return
    }

    public void writeTo(java.io.OutputStream r4, java.lang.String[] r5) throws java.io.IOException, javax.mail.MessagingException {
            r3 = this;
            boolean r0 = r3.saved
            if (r0 != 0) goto L7
            r3.saveChanges()
        L7:
            boolean r0 = r3.modified
            if (r0 == 0) goto Lf
            javax.mail.internet.MimeBodyPart.writeTo(r3, r4, r5)
            return
        Lf:
            java.util.Enumeration r5 = r3.getNonMatchingHeaderLines(r5)
            com.sun.mail.util.LineOutputStream r0 = new com.sun.mail.util.LineOutputStream
            r0.<init>(r4)
        L18:
            boolean r1 = r5.hasMoreElements()
            if (r1 != 0) goto L43
            r0.writeln()
            byte[] r5 = r3.content
            if (r5 != 0) goto L3c
            java.io.InputStream r0 = r3.getContentStream()
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r5]
        L2d:
            int r5 = r0.read(r1)
            if (r5 > 0) goto L37
            r0.close()
            goto L3f
        L37:
            r2 = 0
            r4.write(r1, r2, r5)
            goto L2d
        L3c:
            r4.write(r5)
        L3f:
            r4.flush()
            return
        L43:
            java.lang.Object r1 = r5.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            r0.writeln(r1)
            goto L18
    }
}
