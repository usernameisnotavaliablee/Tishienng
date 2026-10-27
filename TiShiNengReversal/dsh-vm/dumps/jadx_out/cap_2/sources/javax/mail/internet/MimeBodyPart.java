package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimeBodyPart extends javax.mail.BodyPart implements javax.mail.internet.MimePart {
    static boolean cacheMultipart = true;
    private static boolean decodeFileName = false;
    private static boolean encodeFileName = false;
    private static boolean setContentTypeFileName = true;
    private static boolean setDefaultTextCharset = true;
    private java.lang.Object cachedContent;
    protected byte[] content;
    protected java.io.InputStream contentStream;
    protected javax.activation.DataHandler dh;
    protected javax.mail.internet.InternetHeaders headers;

    static {
            java.lang.String r0 = "mail.mime.setdefaulttextcharset"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L61
            r1 = 1
            r2 = 0
            java.lang.String r3 = "false"
            if (r0 == 0) goto L14
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L14
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            javax.mail.internet.MimeBodyPart.setDefaultTextCharset = r0     // Catch: java.lang.SecurityException -> L61
            java.lang.String r0 = "mail.mime.setcontenttypefilename"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L27
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            javax.mail.internet.MimeBodyPart.setContentTypeFileName = r0     // Catch: java.lang.SecurityException -> L61
            java.lang.String r0 = "mail.mime.encodefilename"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L3a
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L61
            if (r0 != 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            javax.mail.internet.MimeBodyPart.encodeFileName = r0     // Catch: java.lang.SecurityException -> L61
            java.lang.String r0 = "mail.mime.decodefilename"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L4d
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L61
            if (r0 != 0) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            javax.mail.internet.MimeBodyPart.decodeFileName = r0     // Catch: java.lang.SecurityException -> L61
            java.lang.String r0 = "mail.mime.cachemultipart"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L5f
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L61
            if (r0 == 0) goto L5f
            r1 = 0
        L5f:
            javax.mail.internet.MimeBodyPart.cacheMultipart = r1     // Catch: java.lang.SecurityException -> L61
        L61:
            return
    }

    public MimeBodyPart() {
            r1 = this;
            r1.<init>()
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>()
            r1.headers = r0
            return
    }

    public MimeBodyPart(java.io.InputStream r5) throws javax.mail.MessagingException {
            r4 = this;
            r4.<init>()
            boolean r0 = r5 instanceof java.io.ByteArrayInputStream
            if (r0 != 0) goto L15
            boolean r0 = r5 instanceof java.io.BufferedInputStream
            if (r0 != 0) goto L15
            boolean r0 = r5 instanceof javax.mail.internet.SharedInputStream
            if (r0 != 0) goto L15
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r5)
            r5 = r0
        L15:
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>(r5)
            r4.headers = r0
            boolean r0 = r5 instanceof javax.mail.internet.SharedInputStream
            if (r0 == 0) goto L2f
            javax.mail.internet.SharedInputStream r5 = (javax.mail.internet.SharedInputStream) r5
            long r0 = r5.getPosition()
            r2 = -1
            java.io.InputStream r5 = r5.newStream(r0, r2)
            r4.contentStream = r5
            return
        L2f:
            byte[] r5 = com.sun.mail.util.ASCIIUtility.getBytes(r5)     // Catch: java.io.IOException -> L36
            r4.content = r5     // Catch: java.io.IOException -> L36
            return
        L36:
            r5 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "Error reading input stream"
            r0.<init>(r1, r5)
            throw r0
    }

    public MimeBodyPart(javax.mail.internet.InternetHeaders r1, byte[] r2) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>()
            r0.headers = r1
            r0.content = r2
            return
    }

    static java.lang.String[] getContentLanguage(javax.mail.internet.MimePart r5) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Language"
            r1 = 0
            java.lang.String r5 = r5.getHeader(r0, r1)
            if (r5 != 0) goto La
            return r1
        La:
            javax.mail.internet.HeaderTokenizer r0 = new javax.mail.internet.HeaderTokenizer
            java.lang.String r2 = "()<>@,;:\\\"\t []/?="
            r0.<init>(r5, r2)
            java.util.Vector r5 = new java.util.Vector
            r5.<init>()
        L16:
            javax.mail.internet.HeaderTokenizer$Token r2 = r0.next()
            int r3 = r2.getType()
            r4 = -4
            if (r3 != r4) goto L32
            int r0 = r5.size()
            if (r0 != 0) goto L28
            return r1
        L28:
            int r0 = r5.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r5.copyInto(r0)
            return r0
        L32:
            r4 = -1
            if (r3 != r4) goto L16
            java.lang.String r2 = r2.getValue()
            r5.addElement(r2)
            goto L16
    }

    static java.lang.String getDescription(javax.mail.internet.MimePart r2) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Description"
            r1 = 0
            java.lang.String r2 = r2.getHeader(r0, r1)
            if (r2 != 0) goto La
            return r1
        La:
            java.lang.String r0 = javax.mail.internet.MimeUtility.unfold(r2)     // Catch: java.io.UnsupportedEncodingException -> L12
            java.lang.String r2 = javax.mail.internet.MimeUtility.decodeText(r0)     // Catch: java.io.UnsupportedEncodingException -> L12
        L12:
            return r2
    }

    static java.lang.String getDisposition(javax.mail.internet.MimePart r2) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Disposition"
            r1 = 0
            java.lang.String r2 = r2.getHeader(r0, r1)
            if (r2 != 0) goto La
            return r1
        La:
            javax.mail.internet.ContentDisposition r0 = new javax.mail.internet.ContentDisposition
            r0.<init>(r2)
            java.lang.String r2 = r0.getDisposition()
            return r2
    }

    static java.lang.String getEncoding(javax.mail.internet.MimePart r4) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1 = 0
            java.lang.String r4 = r4.getHeader(r0, r1)
            if (r4 != 0) goto La
            return r1
        La:
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "7bit"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "8bit"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "quoted-printable"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "binary"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "base64"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L37
            goto L51
        L37:
            javax.mail.internet.HeaderTokenizer r0 = new javax.mail.internet.HeaderTokenizer
            java.lang.String r1 = "()<>@,;:\\\"\t []/?="
            r0.<init>(r4, r1)
        L3e:
            javax.mail.internet.HeaderTokenizer$Token r1 = r0.next()
            int r2 = r1.getType()
            r3 = -4
            if (r2 != r3) goto L4a
            goto L51
        L4a:
            r3 = -1
            if (r2 != r3) goto L3e
            java.lang.String r4 = r1.getValue()
        L51:
            return r4
    }

    static java.lang.String getFileName(javax.mail.internet.MimePart r3) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Disposition"
            r1 = 0
            java.lang.String r0 = r3.getHeader(r0, r1)
            if (r0 == 0) goto L15
            javax.mail.internet.ContentDisposition r2 = new javax.mail.internet.ContentDisposition
            r2.<init>(r0)
            java.lang.String r0 = "filename"
            java.lang.String r0 = r2.getParameter(r0)
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L2d
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = r3.getHeader(r2, r1)
            if (r3 == 0) goto L2d
            javax.mail.internet.ContentType r1 = new javax.mail.internet.ContentType     // Catch: javax.mail.internet.ParseException -> L2c
            r1.<init>(r3)     // Catch: javax.mail.internet.ParseException -> L2c
            java.lang.String r3 = "name"
            java.lang.String r0 = r1.getParameter(r3)     // Catch: javax.mail.internet.ParseException -> L2c
            goto L2d
        L2c:
        L2d:
            boolean r3 = javax.mail.internet.MimeBodyPart.decodeFileName
            if (r3 == 0) goto L41
            if (r0 == 0) goto L41
            java.lang.String r0 = javax.mail.internet.MimeUtility.decodeText(r0)     // Catch: java.io.UnsupportedEncodingException -> L38
            goto L41
        L38:
            r3 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "Can't decode filename"
            r0.<init>(r1, r3)
            throw r0
        L41:
            return r0
    }

    static void invalidateContentHeaders(javax.mail.internet.MimePart r1) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Type"
            r1.removeHeader(r0)
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1.removeHeader(r0)
            return
    }

    static boolean isMimeType(javax.mail.internet.MimePart r2, java.lang.String r3) throws javax.mail.MessagingException {
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: javax.mail.internet.ParseException -> Le
            java.lang.String r1 = r2.getContentType()     // Catch: javax.mail.internet.ParseException -> Le
            r0.<init>(r1)     // Catch: javax.mail.internet.ParseException -> Le
            boolean r2 = r0.match(r3)     // Catch: javax.mail.internet.ParseException -> Le
            return r2
        Le:
            java.lang.String r2 = r2.getContentType()
            boolean r2 = r2.equalsIgnoreCase(r3)
            return r2
    }

    static void setContentLanguage(javax.mail.internet.MimePart r3, java.lang.String[] r4) throws javax.mail.MessagingException {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 0
            r1 = r4[r1]
            r0.<init>(r1)
            r1 = 1
        L9:
            int r2 = r4.length
            if (r1 < r2) goto L16
            java.lang.String r4 = "Content-Language"
            java.lang.String r0 = r0.toString()
            r3.setHeader(r4, r0)
            return
        L16:
            r2 = 44
            r0.append(r2)
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
    }

    static void setDescription(javax.mail.internet.MimePart r2, java.lang.String r3, java.lang.String r4) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Description"
            if (r3 != 0) goto L8
            r2.removeHeader(r0)
            return
        L8:
            r1 = 0
            java.lang.String r3 = javax.mail.internet.MimeUtility.encodeText(r3, r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L17
            r4 = 21
            java.lang.String r3 = javax.mail.internet.MimeUtility.fold(r4, r3)     // Catch: java.io.UnsupportedEncodingException -> L17
            r2.setHeader(r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L17
            return
        L17:
            r2 = move-exception
            javax.mail.MessagingException r3 = new javax.mail.MessagingException
            java.lang.String r4 = "Encoding error"
            r3.<init>(r4, r2)
            throw r3
    }

    static void setDisposition(javax.mail.internet.MimePart r3, java.lang.String r4) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Disposition"
            if (r4 != 0) goto L8
            r3.removeHeader(r0)
            return
        L8:
            r1 = 0
            java.lang.String r1 = r3.getHeader(r0, r1)
            if (r1 == 0) goto L1b
            javax.mail.internet.ContentDisposition r2 = new javax.mail.internet.ContentDisposition
            r2.<init>(r1)
            r2.setDisposition(r4)
            java.lang.String r4 = r2.toString()
        L1b:
            r3.setHeader(r0, r4)
            return
    }

    static void setEncoding(javax.mail.internet.MimePart r1, java.lang.String r2) throws javax.mail.MessagingException {
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1.setHeader(r0, r2)
            return
    }

    static void setFileName(javax.mail.internet.MimePart r4, java.lang.String r5) throws javax.mail.MessagingException {
            boolean r0 = javax.mail.internet.MimeBodyPart.encodeFileName
            if (r0 == 0) goto L14
            if (r5 == 0) goto L14
            java.lang.String r5 = javax.mail.internet.MimeUtility.encodeText(r5)     // Catch: java.io.UnsupportedEncodingException -> Lb
            goto L14
        Lb:
            r4 = move-exception
            javax.mail.MessagingException r5 = new javax.mail.MessagingException
            java.lang.String r0 = "Can't encode filename"
            r5.<init>(r0, r4)
            throw r5
        L14:
            java.lang.String r0 = "Content-Disposition"
            r1 = 0
            java.lang.String r2 = r4.getHeader(r0, r1)
            javax.mail.internet.ContentDisposition r3 = new javax.mail.internet.ContentDisposition
            if (r2 != 0) goto L21
            java.lang.String r2 = "attachment"
        L21:
            r3.<init>(r2)
            java.lang.String r2 = "filename"
            r3.setParameter(r2, r5)
            java.lang.String r2 = r3.toString()
            r4.setHeader(r0, r2)
            boolean r0 = javax.mail.internet.MimeBodyPart.setContentTypeFileName
            if (r0 == 0) goto L4d
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = r4.getHeader(r0, r1)
            if (r1 == 0) goto L4d
            javax.mail.internet.ContentType r2 = new javax.mail.internet.ContentType     // Catch: javax.mail.internet.ParseException -> L4d
            r2.<init>(r1)     // Catch: javax.mail.internet.ParseException -> L4d
            java.lang.String r1 = "name"
            r2.setParameter(r1, r5)     // Catch: javax.mail.internet.ParseException -> L4d
            java.lang.String r5 = r2.toString()     // Catch: javax.mail.internet.ParseException -> L4d
            r4.setHeader(r0, r5)     // Catch: javax.mail.internet.ParseException -> L4d
        L4d:
            return
    }

    static void setText(javax.mail.internet.MimePart r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) throws javax.mail.MessagingException {
            if (r4 != 0) goto L10
            int r4 = javax.mail.internet.MimeUtility.checkAscii(r3)
            r0 = 1
            if (r4 == r0) goto Le
            java.lang.String r4 = javax.mail.internet.MimeUtility.getDefaultMIMECharset()
            goto L10
        Le:
            java.lang.String r4 = "us-ascii"
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "text/"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = "; charset="
            r0.append(r5)
            java.lang.String r5 = "()<>@,;:\\\"\t []/?="
            java.lang.String r4 = javax.mail.internet.MimeUtility.quote(r4, r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.setContent(r3, r4)
            return
    }

    static void updateHeaders(javax.mail.internet.MimePart r7) throws javax.mail.MessagingException {
            java.lang.String r0 = "charset"
            java.lang.String r1 = "Content-Type"
            javax.activation.DataHandler r2 = r7.getDataHandler()
            if (r2 != 0) goto Lc
            goto Lec
        Lc:
            java.lang.String r3 = r2.getContentType()     // Catch: java.io.IOException -> Led
            java.lang.String[] r4 = r7.getHeader(r1)     // Catch: java.io.IOException -> Led
            if (r4 != 0) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            javax.mail.internet.ContentType r5 = new javax.mail.internet.ContentType     // Catch: java.io.IOException -> Led
            r5.<init>(r3)     // Catch: java.io.IOException -> Led
            java.lang.String r6 = "multipart/*"
            boolean r6 = r5.match(r6)     // Catch: java.io.IOException -> Led
            if (r6 == 0) goto L80
            boolean r0 = r7 instanceof javax.mail.internet.MimeBodyPart     // Catch: java.io.IOException -> Led
            if (r0 == 0) goto L37
            r0 = r7
            javax.mail.internet.MimeBodyPart r0 = (javax.mail.internet.MimeBodyPart) r0     // Catch: java.io.IOException -> Led
            java.lang.Object r0 = r0.cachedContent     // Catch: java.io.IOException -> Led
            if (r0 == 0) goto L32
            goto L4c
        L32:
            java.lang.Object r0 = r2.getContent()     // Catch: java.io.IOException -> Led
            goto L4c
        L37:
            boolean r0 = r7 instanceof javax.mail.internet.MimeMessage     // Catch: java.io.IOException -> Led
            if (r0 == 0) goto L48
            r0 = r7
            javax.mail.internet.MimeMessage r0 = (javax.mail.internet.MimeMessage) r0     // Catch: java.io.IOException -> Led
            java.lang.Object r0 = r0.cachedContent     // Catch: java.io.IOException -> Led
            if (r0 == 0) goto L43
            goto L4c
        L43:
            java.lang.Object r0 = r2.getContent()     // Catch: java.io.IOException -> Led
            goto L4c
        L48:
            java.lang.Object r0 = r2.getContent()     // Catch: java.io.IOException -> Led
        L4c:
            boolean r2 = r0 instanceof javax.mail.internet.MimeMultipart     // Catch: java.io.IOException -> Led
            if (r2 == 0) goto L57
            javax.mail.internet.MimeMultipart r0 = (javax.mail.internet.MimeMultipart) r0     // Catch: java.io.IOException -> Led
            r0.updateHeaders()     // Catch: java.io.IOException -> Led
            goto Lc8
        L57:
            javax.mail.MessagingException r7 = new javax.mail.MessagingException     // Catch: java.io.IOException -> Led
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Led
            java.lang.String r2 = "MIME part of type \""
            r1.<init>(r2)     // Catch: java.io.IOException -> Led
            r1.append(r3)     // Catch: java.io.IOException -> Led
            java.lang.String r2 = "\" contains object of type "
            r1.append(r2)     // Catch: java.io.IOException -> Led
            java.lang.Class r0 = r0.getClass()     // Catch: java.io.IOException -> Led
            java.lang.String r0 = r0.getName()     // Catch: java.io.IOException -> Led
            r1.append(r0)     // Catch: java.io.IOException -> Led
            java.lang.String r0 = " instead of MimeMultipart"
            r1.append(r0)     // Catch: java.io.IOException -> Led
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> Led
            r7.<init>(r0)     // Catch: java.io.IOException -> Led
            throw r7     // Catch: java.io.IOException -> Led
        L80:
            java.lang.String r6 = "message/rfc822"
            boolean r6 = r5.match(r6)     // Catch: java.io.IOException -> Led
            if (r6 == 0) goto L89
            goto Lc8
        L89:
            java.lang.String r6 = "Content-Transfer-Encoding"
            java.lang.String[] r6 = r7.getHeader(r6)     // Catch: java.io.IOException -> Led
            if (r6 != 0) goto L98
            java.lang.String r2 = javax.mail.internet.MimeUtility.getEncoding(r2)     // Catch: java.io.IOException -> Led
            setEncoding(r7, r2)     // Catch: java.io.IOException -> Led
        L98:
            if (r4 == 0) goto Lc8
            boolean r2 = javax.mail.internet.MimeBodyPart.setDefaultTextCharset     // Catch: java.io.IOException -> Led
            if (r2 == 0) goto Lc8
            java.lang.String r2 = "text/*"
            boolean r2 = r5.match(r2)     // Catch: java.io.IOException -> Led
            if (r2 == 0) goto Lc8
            java.lang.String r2 = r5.getParameter(r0)     // Catch: java.io.IOException -> Led
            if (r2 != 0) goto Lc8
            java.lang.String r2 = r7.getEncoding()     // Catch: java.io.IOException -> Led
            if (r2 == 0) goto Lbd
            java.lang.String r3 = "7bit"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Led
            if (r2 == 0) goto Lbd
            java.lang.String r2 = "us-ascii"
            goto Lc1
        Lbd:
            java.lang.String r2 = javax.mail.internet.MimeUtility.getDefaultMIMECharset()     // Catch: java.io.IOException -> Led
        Lc1:
            r5.setParameter(r0, r2)     // Catch: java.io.IOException -> Led
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> Led
        Lc8:
            if (r4 == 0) goto Lec
            java.lang.String r0 = "Content-Disposition"
            r2 = 0
            java.lang.String r0 = r7.getHeader(r0, r2)     // Catch: java.io.IOException -> Led
            if (r0 == 0) goto Le9
            javax.mail.internet.ContentDisposition r2 = new javax.mail.internet.ContentDisposition     // Catch: java.io.IOException -> Led
            r2.<init>(r0)     // Catch: java.io.IOException -> Led
            java.lang.String r0 = "filename"
            java.lang.String r0 = r2.getParameter(r0)     // Catch: java.io.IOException -> Led
            if (r0 == 0) goto Le9
            java.lang.String r2 = "name"
            r5.setParameter(r2, r0)     // Catch: java.io.IOException -> Led
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> Led
        Le9:
            r7.setHeader(r1, r3)     // Catch: java.io.IOException -> Led
        Lec:
            return
        Led:
            r7 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "IOException updating headers"
            r0.<init>(r1, r7)
            throw r0
    }

    static void writeTo(javax.mail.internet.MimePart r2, java.io.OutputStream r3, java.lang.String[] r4) throws java.io.IOException, javax.mail.MessagingException {
            boolean r0 = r3 instanceof com.sun.mail.util.LineOutputStream
            if (r0 == 0) goto L8
            r0 = r3
            com.sun.mail.util.LineOutputStream r0 = (com.sun.mail.util.LineOutputStream) r0
            goto Ld
        L8:
            com.sun.mail.util.LineOutputStream r0 = new com.sun.mail.util.LineOutputStream
            r0.<init>(r3)
        Ld:
            java.util.Enumeration r4 = r2.getNonMatchingHeaderLines(r4)
        L11:
            boolean r1 = r4.hasMoreElements()
            if (r1 != 0) goto L2d
            r0.writeln()
            java.lang.String r4 = r2.getEncoding()
            java.io.OutputStream r3 = javax.mail.internet.MimeUtility.encode(r3, r4)
            javax.activation.DataHandler r2 = r2.getDataHandler()
            r2.writeTo(r3)
            r3.flush()
            return
        L2d:
            java.lang.Object r1 = r4.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            r0.writeln(r1)
            goto L11
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

    public void attachFile(java.io.File r2) throws java.io.IOException, javax.mail.MessagingException {
            r1 = this;
            javax.activation.FileDataSource r0 = new javax.activation.FileDataSource
            r0.<init>(r2)
            javax.activation.DataHandler r2 = new javax.activation.DataHandler
            r2.<init>(r0)
            r1.setDataHandler(r2)
            java.lang.String r2 = r0.getName()
            r1.setFileName(r2)
            return
    }

    public void attachFile(java.lang.String r2) throws java.io.IOException, javax.mail.MessagingException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.attachFile(r0)
            return
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
            java.lang.String[] r0 = getContentLanguage(r1)
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
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
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
    public javax.activation.DataHandler getDataHandler() throws javax.mail.MessagingException {
            r2 = this;
            javax.activation.DataHandler r0 = r2.dh
            if (r0 != 0) goto L10
            javax.activation.DataHandler r0 = new javax.activation.DataHandler
            javax.mail.internet.MimePartDataSource r1 = new javax.mail.internet.MimePartDataSource
            r1.<init>(r2)
            r0.<init>(r1)
            r2.dh = r0
        L10:
            javax.activation.DataHandler r0 = r2.dh
            return r0
    }

    @Override // javax.mail.Part
    public java.lang.String getDescription() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = getDescription(r1)
            return r0
    }

    @Override // javax.mail.Part
    public java.lang.String getDisposition() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = getDisposition(r1)
            return r0
    }

    @Override // javax.mail.internet.MimePart
    public java.lang.String getEncoding() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = getEncoding(r1)
            return r0
    }

    @Override // javax.mail.Part
    public java.lang.String getFileName() throws javax.mail.MessagingException {
            r1 = this;
            java.lang.String r0 = getFileName(r1)
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

    @Override // javax.mail.Part
    public boolean isMimeType(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            boolean r1 = isMimeType(r0, r1)
            return r1
    }

    @Override // javax.mail.Part
    public void removeHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            r0.removeHeader(r2)
            return
    }

    public void saveFile(java.io.File r5) throws java.io.IOException, javax.mail.MessagingException {
            r4 = this;
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L27
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L27
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.lang.Throwable -> L25
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L25
        L13:
            int r2 = r0.read(r5)     // Catch: java.lang.Throwable -> L25
            if (r2 > 0) goto L20
            r0.close()     // Catch: java.io.IOException -> L1c
        L1c:
            r1.close()     // Catch: java.io.IOException -> L1f
        L1f:
            return
        L20:
            r3 = 0
            r1.write(r5, r3, r2)     // Catch: java.lang.Throwable -> L25
            goto L13
        L25:
            r5 = move-exception
            goto L29
        L27:
            r5 = move-exception
            r1 = r0
        L29:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.io.IOException -> L2f
            goto L30
        L2f:
        L30:
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.io.IOException -> L35
        L35:
            throw r5
    }

    public void saveFile(java.lang.String r2) throws java.io.IOException, javax.mail.MessagingException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.saveFile(r0)
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
            setContentLanguage(r0, r1)
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
    public void setDataHandler(javax.activation.DataHandler r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.dh = r1
            r1 = 0
            r0.cachedContent = r1
            invalidateContentHeaders(r0)
            return
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
            setDescription(r0, r1, r2)
            return
    }

    @Override // javax.mail.Part
    public void setDisposition(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            setDisposition(r0, r1)
            return
    }

    @Override // javax.mail.Part
    public void setFileName(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            setFileName(r0, r1)
            return
    }

    @Override // javax.mail.Part
    public void setHeader(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.headers
            r0.setHeader(r2, r3)
            return
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
            setText(r1, r2, r3, r0)
            return
    }

    @Override // javax.mail.internet.MimePart
    public void setText(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r0 = this;
            setText(r0, r1, r2, r3)
            return
    }

    protected void updateHeaders() throws javax.mail.MessagingException {
            r3 = this;
            updateHeaders(r3)
            java.lang.Object r0 = r3.cachedContent
            if (r0 == 0) goto L22
            javax.activation.DataHandler r0 = new javax.activation.DataHandler
            java.lang.Object r1 = r3.cachedContent
            java.lang.String r2 = r3.getContentType()
            r0.<init>(r1, r2)
            r3.dh = r0
            r0 = 0
            r3.cachedContent = r0
            r3.content = r0
            java.io.InputStream r1 = r3.contentStream
            if (r1 == 0) goto L20
            r1.close()     // Catch: java.io.IOException -> L20
        L20:
            r3.contentStream = r0
        L22:
            return
    }

    @Override // javax.mail.Part
    public void writeTo(java.io.OutputStream r2) throws java.io.IOException, javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            writeTo(r1, r2, r0)
            return
    }
}
