package com.sun.mail.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SMTPTransport extends javax.mail.Transport {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] CRLF = null;
    private static final java.lang.String UNKNOWN = "UNKNOWN";
    private static char[] hexchar;
    private static final java.lang.String[] ignoreList = null;
    private javax.mail.Address[] addresses;
    private com.sun.mail.smtp.SMTPOutputStream dataStream;
    private int defaultPort;
    private javax.mail.MessagingException exception;
    private java.util.Hashtable extMap;
    private javax.mail.Address[] invalidAddr;
    private boolean isSSL;
    private int lastReturnCode;
    private java.lang.String lastServerResponse;
    private com.sun.mail.util.LineInputStream lineInputStream;
    private java.lang.String localHostName;
    private com.sun.mail.smtp.DigestMD5 md5support;
    private javax.mail.internet.MimeMessage message;
    private java.lang.String name;
    private java.io.PrintStream out;
    private boolean quitWait;
    private boolean reportSuccess;
    private java.lang.String saslRealm;
    private boolean sendPartiallyFailed;
    private java.io.BufferedInputStream serverInput;
    private java.io.OutputStream serverOutput;
    private java.net.Socket serverSocket;
    private boolean useRset;
    private boolean useStartTLS;
    private javax.mail.Address[] validSentAddr;
    private javax.mail.Address[] validUnsentAddr;

    static {
            java.lang.String r0 = "Bcc"
            java.lang.String r1 = "Content-Length"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.sun.mail.smtp.SMTPTransport.ignoreList = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.sun.mail.smtp.SMTPTransport.CRLF = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.sun.mail.smtp.SMTPTransport.hexchar = r0
            return
    }

    public SMTPTransport(javax.mail.Session r7, javax.mail.URLName r8) {
            r6 = this;
            r4 = 25
            r5 = 0
            java.lang.String r3 = "smtp"
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected SMTPTransport(javax.mail.Session r4, javax.mail.URLName r5, java.lang.String r6, int r7, boolean r8) {
            r3 = this;
            r3.<init>(r4, r5)
            java.lang.String r0 = "smtp"
            r3.name = r0
            r0 = 25
            r3.defaultPort = r0
            r0 = 0
            r3.isSSL = r0
            r3.sendPartiallyFailed = r0
            r3.quitWait = r0
            java.lang.String r1 = "UNKNOWN"
            r3.saslRealm = r1
            if (r5 == 0) goto L1c
            java.lang.String r6 = r5.getProtocol()
        L1c:
            r3.name = r6
            r3.defaultPort = r7
            r3.isSSL = r8
            java.io.PrintStream r5 = r4.getDebugOut()
            r3.out = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mail."
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r8 = ".quitwait"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            r8 = 1
            java.lang.String r1 = "true"
            if (r5 == 0) goto L4c
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 != 0) goto L4c
            r5 = 0
            goto L4d
        L4c:
            r5 = 1
        L4d:
            r3.quitWait = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r2 = ".reportsuccess"
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            if (r5 == 0) goto L6e
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L6e
            r5 = 1
            goto L6f
        L6e:
            r5 = 0
        L6f:
            r3.reportSuccess = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r2 = ".starttls.enable"
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r4.getProperty(r5)
            if (r5 == 0) goto L90
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L90
            r5 = 1
            goto L91
        L90:
            r5 = 0
        L91:
            r3.useStartTLS = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r6 = ".userset"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = r4.getProperty(r5)
            if (r4 == 0) goto Lb1
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto Lb1
            r0 = 1
        Lb1:
            r3.useRset = r0
            return
    }

    private void closeConnection() throws javax.mail.MessagingException {
            r4 = this;
            r0 = 0
            java.net.Socket r1 = r4.serverSocket     // Catch: java.lang.Throwable -> L9 java.io.IOException -> Lb
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.lang.Throwable -> L9 java.io.IOException -> Lb
            goto Ld
        L9:
            r1 = move-exception
            goto L27
        Lb:
            r1 = move-exception
            goto L1f
        Ld:
            r4.serverSocket = r0
            r4.serverOutput = r0
            r4.serverInput = r0
            r4.lineInputStream = r0
            boolean r0 = super/*javax.mail.Service*/.isConnected()
            if (r0 == 0) goto L1e
            super/*javax.mail.Service*/.close()
        L1e:
            return
        L1f:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = "Server Close Failed"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L9
            throw r2     // Catch: java.lang.Throwable -> L9
        L27:
            r4.serverSocket = r0
            r4.serverOutput = r0
            r4.serverInput = r0
            r4.lineInputStream = r0
            boolean r0 = super/*javax.mail.Service*/.isConnected()
            if (r0 == 0) goto L38
            super/*javax.mail.Service*/.close()
        L38:
            throw r1
    }

    private boolean convertTo8Bit(javax.mail.internet.MimePart r6) {
            r5 = this;
            r0 = 0
            java.lang.String r1 = "text/*"
            boolean r1 = r6.isMimeType(r1)     // Catch: java.lang.Throwable -> L65
            r2 = 1
            if (r1 == 0) goto L3d
            java.lang.String r1 = r6.getEncoding()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L65
            java.lang.String r3 = "quoted-printable"
            boolean r3 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L20
            java.lang.String r3 = "base64"
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L65
        L20:
            java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> L65
            boolean r1 = r5.is8Bit(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.getContent()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = r6.getContentType()     // Catch: java.lang.Throwable -> L65
            r6.setContent(r1, r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = "Content-Transfer-Encoding"
            java.lang.String r3 = "8bit"
            r6.setHeader(r1, r3)     // Catch: java.lang.Throwable -> L65
            return r2
        L3d:
            java.lang.String r1 = "multipart/*"
            boolean r1 = r6.isMimeType(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L65
            java.lang.Object r6 = r6.getContent()     // Catch: java.lang.Throwable -> L65
            javax.mail.internet.MimeMultipart r6 = (javax.mail.internet.MimeMultipart) r6     // Catch: java.lang.Throwable -> L65
            int r1 = r6.getCount()     // Catch: java.lang.Throwable -> L65
            r3 = 0
        L50:
            if (r0 < r1) goto L53
            return r3
        L53:
            javax.mail.BodyPart r4 = r6.getBodyPart(r0)     // Catch: java.lang.Throwable -> L63
            javax.mail.internet.MimePart r4 = (javax.mail.internet.MimePart) r4     // Catch: java.lang.Throwable -> L63
            boolean r4 = r5.convertTo8Bit(r4)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L60
            r3 = 1
        L60:
            int r0 = r0 + 1
            goto L50
        L63:
            r0 = r3
        L65:
            return r0
    }

    private void expandGroups() {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            javax.mail.Address[] r3 = r7.addresses
            int r4 = r3.length
            if (r2 < r4) goto L16
            if (r0 == 0) goto L15
            int r1 = r0.size()
            javax.mail.internet.InternetAddress[] r1 = new javax.mail.internet.InternetAddress[r1]
            r0.copyInto(r1)
            r7.addresses = r1
        L15:
            return
        L16:
            r3 = r3[r2]
            javax.mail.internet.InternetAddress r3 = (javax.mail.internet.InternetAddress) r3
            boolean r4 = r3.isGroup()
            if (r4 == 0) goto L52
            if (r0 != 0) goto L36
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r0 = 0
        L28:
            if (r0 < r2) goto L2c
            r0 = r4
            goto L36
        L2c:
            javax.mail.Address[] r5 = r7.addresses
            r5 = r5[r0]
            r4.addElement(r5)
            int r0 = r0 + 1
            goto L28
        L36:
            r4 = 1
            javax.mail.internet.InternetAddress[] r4 = r3.getGroup(r4)     // Catch: javax.mail.internet.ParseException -> L4e
            if (r4 == 0) goto L4a
            r5 = 0
        L3e:
            int r6 = r4.length     // Catch: javax.mail.internet.ParseException -> L4e
            if (r5 < r6) goto L42
            goto L57
        L42:
            r6 = r4[r5]     // Catch: javax.mail.internet.ParseException -> L4e
            r0.addElement(r6)     // Catch: javax.mail.internet.ParseException -> L4e
            int r5 = r5 + 1
            goto L3e
        L4a:
            r0.addElement(r3)     // Catch: javax.mail.internet.ParseException -> L4e
            goto L57
        L4e:
            r0.addElement(r3)
            goto L57
        L52:
            if (r0 == 0) goto L57
            r0.addElement(r3)
        L57:
            int r2 = r2 + 1
            goto L3
    }

    private synchronized com.sun.mail.smtp.DigestMD5 getMD5() {
            r2 = this;
            monitor-enter(r2)
            com.sun.mail.smtp.DigestMD5 r0 = r2.md5support     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L16
            com.sun.mail.smtp.DigestMD5 r0 = new com.sun.mail.smtp.DigestMD5     // Catch: java.lang.Throwable -> Le
            boolean r1 = r2.debug     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            java.io.PrintStream r1 = r2.out     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r0 = move-exception
            goto L1a
        L10:
            r1 = 0
        L11:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            r2.md5support = r0     // Catch: java.lang.Throwable -> Le
        L16:
            com.sun.mail.smtp.DigestMD5 r0 = r2.md5support     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    private void initStreams() throws java.io.IOException {
            r6 = this;
            javax.mail.Session r0 = r6.session
            java.util.Properties r0 = r0.getProperties()
            javax.mail.Session r1 = r6.session
            java.io.PrintStream r1 = r1.getDebugOut()
            javax.mail.Session r2 = r6.session
            boolean r2 = r2.getDebug()
            java.lang.String r3 = "mail.debug.quote"
            java.lang.String r0 = r0.getProperty(r3)
            if (r0 == 0) goto L24
            java.lang.String r3 = "true"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.sun.mail.util.TraceInputStream r3 = new com.sun.mail.util.TraceInputStream
            java.net.Socket r4 = r6.serverSocket
            java.io.InputStream r4 = r4.getInputStream()
            r3.<init>(r4, r1)
            r3.setTrace(r2)
            r3.setQuote(r0)
            com.sun.mail.util.TraceOutputStream r4 = new com.sun.mail.util.TraceOutputStream
            java.net.Socket r5 = r6.serverSocket
            java.io.OutputStream r5 = r5.getOutputStream()
            r4.<init>(r5, r1)
            r4.setTrace(r2)
            r4.setQuote(r0)
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r4)
            r6.serverOutput = r0
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r3)
            r6.serverInput = r0
            com.sun.mail.util.LineInputStream r0 = new com.sun.mail.util.LineInputStream
            java.io.BufferedInputStream r1 = r6.serverInput
            r0.<init>(r1)
            r6.lineInputStream = r0
            return
    }

    private boolean is8Bit(java.io.InputStream r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r7.read()     // Catch: java.io.IOException -> L31
            if (r3 >= 0) goto L15
            boolean r7 = r6.debug
            if (r7 == 0) goto L14
            if (r1 == 0) goto L14
            java.io.PrintStream r7 = r6.out
            r7.getClass()
        L14:
            return r1
        L15:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 13
            r5 = 1
            if (r3 == r4) goto L2a
            r4 = 10
            if (r3 != r4) goto L21
            goto L2a
        L21:
            if (r3 != 0) goto L24
            return r0
        L24:
            int r2 = r2 + r5
            r4 = 998(0x3e6, float:1.398E-42)
            if (r2 <= r4) goto L2b
            return r0
        L2a:
            r2 = 0
        L2b:
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L3
            r1 = 1
            goto L3
        L31:
            return r0
    }

    private boolean isNotLastLine(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L14
            int r0 = r3.length()
            r1 = 4
            if (r0 < r1) goto L14
            r0 = 3
            char r3 = r3.charAt(r0)
            r0 = 45
            if (r3 != r0) goto L14
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    private void issueSendCommand(java.lang.String r9, int r10) throws javax.mail.MessagingException {
            r8 = this;
            r8.sendCommand(r9)
            int r2 = r8.readServerResponse()
            if (r2 == r10) goto L5a
            javax.mail.Address[] r10 = r8.validSentAddr
            r0 = 0
            if (r10 != 0) goto L10
            r1 = 0
            goto L11
        L10:
            int r1 = r10.length
        L11:
            javax.mail.Address[] r3 = r8.validUnsentAddr
            if (r3 != 0) goto L17
            r3 = 0
            goto L18
        L17:
            int r3 = r3.length
        L18:
            int r4 = r1 + r3
            javax.mail.Address[] r4 = new javax.mail.Address[r4]
            if (r1 <= 0) goto L21
            java.lang.System.arraycopy(r10, r0, r4, r0, r1)
        L21:
            if (r3 <= 0) goto L28
            javax.mail.Address[] r10 = r8.validUnsentAddr
            java.lang.System.arraycopy(r10, r0, r4, r1, r3)
        L28:
            r10 = 0
            r8.validSentAddr = r10
            r8.validUnsentAddr = r4
            boolean r10 = r8.debug
            if (r10 == 0) goto L36
            java.io.PrintStream r10 = r8.out
            r10.getClass()
        L36:
            java.lang.String r10 = r8.lastServerResponse
            int r0 = r8.lastReturnCode
            java.net.Socket r1 = r8.serverSocket
            if (r1 == 0) goto L45
            java.lang.String r1 = "RSET"
            r3 = 250(0xfa, float:3.5E-43)
            r8.issueCommand(r1, r3)
        L45:
            r8.lastServerResponse = r10
            r8.lastReturnCode = r0
            com.sun.mail.smtp.SMTPSendFailedException r0 = new com.sun.mail.smtp.SMTPSendFailedException
            java.lang.String r3 = r8.lastServerResponse
            javax.mail.MessagingException r4 = r8.exception
            javax.mail.Address[] r5 = r8.validSentAddr
            javax.mail.Address[] r6 = r8.validUnsentAddr
            javax.mail.Address[] r7 = r8.invalidAddr
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            throw r0
        L5a:
            return
    }

    private java.lang.String normalizeAddress(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "<"
            boolean r1 = r4.startsWith(r0)
            if (r1 != 0) goto L1f
            java.lang.String r1 = ">"
            boolean r2 = r4.endsWith(r1)
            if (r2 != 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
        L1f:
            return r4
    }

    private void openServer() throws javax.mail.MessagingException {
            r7 = this;
            java.lang.String r0 = ", port: "
            java.lang.String r1 = "UNKNOWN"
            r2 = -1
            java.net.Socket r3 = r7.serverSocket     // Catch: java.io.IOException -> L1f
            int r2 = r3.getPort()     // Catch: java.io.IOException -> L1f
            java.net.Socket r3 = r7.serverSocket     // Catch: java.io.IOException -> L1f
            java.net.InetAddress r3 = r3.getInetAddress()     // Catch: java.io.IOException -> L1f
            java.lang.String r1 = r3.getHostName()     // Catch: java.io.IOException -> L1f
            boolean r3 = r7.debug     // Catch: java.io.IOException -> L1f
            if (r3 == 0) goto L21
            java.io.PrintStream r3 = r7.out     // Catch: java.io.IOException -> L1f
            r3.getClass()     // Catch: java.io.IOException -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L6f
        L21:
            r7.initStreams()     // Catch: java.io.IOException -> L1f
            int r3 = r7.readServerResponse()     // Catch: java.io.IOException -> L1f
            r4 = 220(0xdc, float:3.08E-43)
            if (r3 == r4) goto L65
            java.net.Socket r4 = r7.serverSocket     // Catch: java.io.IOException -> L1f
            r4.close()     // Catch: java.io.IOException -> L1f
            r4 = 0
            r7.serverSocket = r4     // Catch: java.io.IOException -> L1f
            r7.serverOutput = r4     // Catch: java.io.IOException -> L1f
            r7.serverInput = r4     // Catch: java.io.IOException -> L1f
            r7.lineInputStream = r4     // Catch: java.io.IOException -> L1f
            boolean r4 = r7.debug     // Catch: java.io.IOException -> L1f
            if (r4 == 0) goto L43
            java.io.PrintStream r4 = r7.out     // Catch: java.io.IOException -> L1f
            r4.getClass()     // Catch: java.io.IOException -> L1f
        L43:
            javax.mail.MessagingException r4 = new javax.mail.MessagingException     // Catch: java.io.IOException -> L1f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            java.lang.String r6 = "Got bad greeting from SMTP host: "
            r5.<init>(r6)     // Catch: java.io.IOException -> L1f
            r5.append(r1)     // Catch: java.io.IOException -> L1f
            r5.append(r0)     // Catch: java.io.IOException -> L1f
            r5.append(r2)     // Catch: java.io.IOException -> L1f
            java.lang.String r6 = ", response: "
            r5.append(r6)     // Catch: java.io.IOException -> L1f
            r5.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> L1f
            r4.<init>(r3)     // Catch: java.io.IOException -> L1f
            throw r4     // Catch: java.io.IOException -> L1f
        L65:
            boolean r3 = r7.debug     // Catch: java.io.IOException -> L1f
            if (r3 == 0) goto L6e
            java.io.PrintStream r3 = r7.out     // Catch: java.io.IOException -> L1f
            r3.getClass()     // Catch: java.io.IOException -> L1f
        L6e:
            return
        L6f:
            javax.mail.MessagingException r4 = new javax.mail.MessagingException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Could not start protocol to SMTP host: "
            r5.<init>(r6)
            r5.append(r1)
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0, r3)
            throw r4
    }

    private void openServer(java.lang.String r7, int r8) throws javax.mail.MessagingException {
            r6 = this;
            java.lang.String r0 = ", port: "
            java.lang.String r1 = "Could not connect to SMTP host: "
            boolean r2 = r6.debug
            if (r2 == 0) goto Ld
            java.io.PrintStream r2 = r6.out
            r2.getClass()
        Ld:
            javax.mail.Session r2 = r6.session     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.util.Properties r2 = r2.getProperties()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.String r4 = "mail."
            r3.<init>(r4)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.String r4 = r6.name     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r3.append(r4)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            boolean r4 = r6.isSSL     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.net.Socket r2 = com.sun.mail.util.SocketFetcher.getSocket(r7, r8, r2, r3, r4)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r6.serverSocket = r2     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            int r8 = r2.getPort()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r6.initStreams()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            int r2 = r6.readServerResponse()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r3 = 220(0xdc, float:3.08E-43)
            if (r2 == r3) goto L76
            java.net.Socket r3 = r6.serverSocket     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r3.close()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r3 = 0
            r6.serverSocket = r3     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r6.serverOutput = r3     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r6.serverInput = r3     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r6.lineInputStream = r3     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            boolean r3 = r6.debug     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            if (r3 == 0) goto L56
            java.io.PrintStream r3 = r6.out     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r3.getClass()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            goto L56
        L52:
            r2 = move-exception
            goto L80
        L54:
            r8 = move-exception
            goto L98
        L56:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r4.<init>(r1)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r4.append(r7)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r4.append(r0)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r4.append(r8)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.String r5 = ", response: "
            r4.append(r5)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r4.append(r2)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            java.lang.String r2 = r4.toString()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r3.<init>(r2)     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            throw r3     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
        L76:
            boolean r2 = r6.debug     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            if (r2 == 0) goto L7f
            java.io.PrintStream r2 = r6.out     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
            r2.getClass()     // Catch: java.io.IOException -> L52 java.net.UnknownHostException -> L54
        L7f:
            return
        L80:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r7)
            r4.append(r0)
            r4.append(r8)
            java.lang.String r7 = r4.toString()
            r3.<init>(r7, r2)
            throw r3
        L98:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown SMTP host: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            throw r0
    }

    private void sendCommand(byte[] r3) throws javax.mail.MessagingException {
            r2 = this;
            java.io.OutputStream r0 = r2.serverOutput     // Catch: java.io.IOException -> L12
            r0.write(r3)     // Catch: java.io.IOException -> L12
            java.io.OutputStream r3 = r2.serverOutput     // Catch: java.io.IOException -> L12
            byte[] r0 = com.sun.mail.smtp.SMTPTransport.CRLF     // Catch: java.io.IOException -> L12
            r3.write(r0)     // Catch: java.io.IOException -> L12
            java.io.OutputStream r3 = r2.serverOutput     // Catch: java.io.IOException -> L12
            r3.flush()     // Catch: java.io.IOException -> L12
            return
        L12:
            r3 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "Can't send command to SMTP host"
            r0.<init>(r1, r3)
            throw r0
    }

    protected static java.lang.String xtext(java.lang.String r6) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.length()
            if (r2 < r3) goto L10
            if (r0 == 0) goto Lf
            java.lang.String r6 = r0.toString()
        Lf:
            return r6
        L10:
            char r3 = r6.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L5d
            r4 = 33
            r5 = 43
            if (r3 < r4) goto L2f
            r4 = 126(0x7e, float:1.77E-43)
            if (r3 > r4) goto L2f
            if (r3 == r5) goto L2f
            r4 = 61
            if (r3 != r4) goto L29
            goto L2f
        L29:
            if (r0 == 0) goto L5a
            r0.append(r3)
            goto L5a
        L2f:
            if (r0 != 0) goto L43
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r4 = r6.length()
            int r4 = r4 + 4
            r0.<init>(r4)
            java.lang.String r4 = r6.substring(r1, r2)
            r0.append(r4)
        L43:
            r0.append(r5)
            char[] r4 = com.sun.mail.smtp.SMTPTransport.hexchar
            r5 = r3 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> 4
            char r4 = r4[r5]
            r0.append(r4)
            char[] r4 = com.sun.mail.smtp.SMTPTransport.hexchar
            r3 = r3 & 15
            char r3 = r4[r3]
            r0.append(r3)
        L5a:
            int r2 = r2 + 1
            goto L3
        L5d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-ASCII character in SMTP submitter: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    protected void checkConnected() {
            r2 = this;
            boolean r0 = super/*javax.mail.Service*/.isConnected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not connected"
            r0.<init>(r1)
            throw r0
    }

    public synchronized void close() throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = super/*javax.mail.Service*/.isConnected()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.net.Socket r0 = r2.serverSocket     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            java.lang.String r0 = "QUIT"
            r2.sendCommand(r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r2.quitWait     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            int r0 = r2.readServerResponse()     // Catch: java.lang.Throwable -> L27
            r1 = 221(0xdd, float:3.1E-43)
            if (r0 == r1) goto L29
            r1 = -1
            if (r0 == r1) goto L29
            java.io.PrintStream r0 = r2.out     // Catch: java.lang.Throwable -> L27
            r0.getClass()     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L30
        L29:
            r2.closeConnection()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)
            return
        L2e:
            r0 = move-exception
            goto L34
        L30:
            r2.closeConnection()     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }

    public synchronized void connect(java.net.Socket r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.serverSocket = r1     // Catch: java.lang.Throwable -> L8
            super/*javax.mail.Service*/.connect()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    protected java.io.OutputStream data() throws javax.mail.MessagingException {
            r2 = this;
            java.lang.String r0 = "DATA"
            r1 = 354(0x162, float:4.96E-43)
            r2.issueSendCommand(r0, r1)
            com.sun.mail.smtp.SMTPOutputStream r0 = new com.sun.mail.smtp.SMTPOutputStream
            java.io.OutputStream r1 = r2.serverOutput
            r0.<init>(r1)
            r2.dataStream = r0
            return r0
    }

    protected boolean ehlo(java.lang.String r10) throws javax.mail.MessagingException {
            r9 = this;
            if (r10 == 0) goto L11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EHLO "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            goto L13
        L11:
            java.lang.String r10 = "EHLO"
        L13:
            r9.sendCommand(r10)
            int r10 = r9.readServerResponse()
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2 = 1
            if (r10 != r0) goto L78
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.StringReader r4 = new java.io.StringReader
            java.lang.String r5 = r9.lastServerResponse
            r4.<init>(r5)
            r3.<init>(r4)
            java.util.Hashtable r4 = new java.util.Hashtable
            r4.<init>()
            r9.extMap = r4
            r4 = 1
        L34:
            java.lang.String r5 = r3.readLine()     // Catch: java.io.IOException -> L61
            if (r5 != 0) goto L3b
            goto L78
        L3b:
            if (r4 == 0) goto L3f
            r4 = 0
            goto L34
        L3f:
            int r6 = r5.length()     // Catch: java.io.IOException -> L61
            r7 = 5
            if (r6 >= r7) goto L47
            goto L34
        L47:
            r6 = 4
            java.lang.String r5 = r5.substring(r6)     // Catch: java.io.IOException -> L61
            r6 = 32
            int r6 = r5.indexOf(r6)     // Catch: java.io.IOException -> L61
            java.lang.String r7 = ""
            if (r6 <= 0) goto L63
            int r7 = r6 + 1
            java.lang.String r7 = r5.substring(r7)     // Catch: java.io.IOException -> L61
            java.lang.String r5 = r5.substring(r1, r6)     // Catch: java.io.IOException -> L61
            goto L63
        L61:
            goto L78
        L63:
            boolean r6 = r9.debug     // Catch: java.io.IOException -> L61
            if (r6 == 0) goto L6c
            java.io.PrintStream r6 = r9.out     // Catch: java.io.IOException -> L61
            r6.getClass()     // Catch: java.io.IOException -> L61
        L6c:
            java.util.Hashtable r6 = r9.extMap     // Catch: java.io.IOException -> L61
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch: java.io.IOException -> L61
            java.lang.String r5 = r5.toUpperCase(r8)     // Catch: java.io.IOException -> L61
            r6.put(r5, r7)     // Catch: java.io.IOException -> L61
            goto L34
        L78:
            if (r10 != r0) goto L7b
            return r2
        L7b:
            return r1
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super/*javax.mail.Service*/.finalize()
            r0.closeConnection()     // Catch: javax.mail.MessagingException -> L6
        L6:
            return
    }

    protected void finishData() throws java.io.IOException, javax.mail.MessagingException {
            r2 = this;
            com.sun.mail.smtp.SMTPOutputStream r0 = r2.dataStream
            r0.ensureAtBOL()
            java.lang.String r0 = "."
            r1 = 250(0xfa, float:3.5E-43)
            r2.issueSendCommand(r0, r1)
            return
    }

    public java.lang.String getExtensionParameter(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.extMap
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toUpperCase(r1)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public synchronized int getLastReturnCode() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.lastReturnCode     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized java.lang.String getLastServerResponse() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.lastServerResponse     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized java.lang.String getLocalHost() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.localHostName     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r0 == 0) goto Le
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r0 > 0) goto L2b
            goto Le
        Lc:
            r0 = move-exception
            goto L85
        Le:
            javax.mail.Session r0 = r3.session     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = r3.name     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = ".localhost"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r0 = r0.getProperty(r1)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r3.localHostName = r0     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
        L2b:
            java.lang.String r0 = r3.localHostName     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r0 == 0) goto L35
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r0 > 0) goto L52
        L35:
            javax.mail.Session r0 = r3.session     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = r3.name     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = ".localaddress"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r0 = r0.getProperty(r1)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r3.localHostName = r0     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
        L52:
            java.lang.String r0 = r3.localHostName     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r0 == 0) goto L5c
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r0 > 0) goto L81
        L5c:
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r1 = r0.getHostName()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r3.localHostName = r1     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            if (r1 != 0) goto L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r2 = "["
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r0 = r0.getHostAddress()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
            r3.localHostName = r0     // Catch: java.lang.Throwable -> Lc java.net.UnknownHostException -> L81
        L81:
            java.lang.String r0 = r3.localHostName     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return r0
        L85:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public synchronized boolean getReportSuccess() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.reportSuccess     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized java.lang.String getSASLRealm() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.saslRealm     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "UNKNOWN"
            if (r0 != r1) goto L46
            javax.mail.Session r0 = r3.session     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r3.name     // Catch: java.lang.Throwable -> L44
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = ".sasl.realm"
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.getProperty(r1)     // Catch: java.lang.Throwable -> L44
            r3.saslRealm = r0     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L46
            javax.mail.Session r0 = r3.session     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r3.name     // Catch: java.lang.Throwable -> L44
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = ".saslrealm"
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.getProperty(r1)     // Catch: java.lang.Throwable -> L44
            r3.saslRealm = r0     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r0 = move-exception
            goto L4a
        L46:
            java.lang.String r0 = r3.saslRealm     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return r0
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r0
    }

    public synchronized boolean getStartTLS() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.useStartTLS     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized boolean getUseRset() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.useRset     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    protected void helo(java.lang.String r4) throws javax.mail.MessagingException {
            r3 = this;
            r0 = 250(0xfa, float:3.5E-43)
            if (r4 == 0) goto L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HELO "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.issueCommand(r4, r0)
            return
        L16:
            java.lang.String r4 = "HELO"
            r3.issueCommand(r4, r0)
            return
    }

    public synchronized boolean isConnected() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = super/*javax.mail.Service*/.isConnected()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            boolean r0 = r3.useRset     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L2d
            if (r0 == 0) goto L16
            java.lang.String r0 = "RSET"
            r3.sendCommand(r0)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L2d
            goto L1b
        L14:
            r0 = move-exception
            goto L32
        L16:
            java.lang.String r0 = "NOOP"
            r3.sendCommand(r0)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L2d
        L1b:
            int r0 = r3.readServerResponse()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L2d
            if (r0 < 0) goto L28
            r2 = 421(0x1a5, float:5.9E-43)
            if (r0 == r2) goto L28
            monitor-exit(r3)
            r0 = 1
            return r0
        L28:
            r3.closeConnection()     // Catch: java.lang.Throwable -> L14 javax.mail.MessagingException -> L2b java.lang.Exception -> L2d
        L2b:
            monitor-exit(r3)
            return r1
        L2d:
            r3.closeConnection()     // Catch: java.lang.Throwable -> L14 javax.mail.MessagingException -> L30
        L30:
            monitor-exit(r3)
            return r1
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public synchronized void issueCommand(java.lang.String r1, int r2) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.sendCommand(r1)     // Catch: java.lang.Throwable -> L14
            int r1 = r0.readServerResponse()     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto Lc
            monitor-exit(r0)
            return
        Lc:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r0.lastServerResponse     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    protected void mailFrom() throws javax.mail.MessagingException {
            r6 = this;
            javax.mail.internet.MimeMessage r0 = r6.message
            boolean r1 = r0 instanceof com.sun.mail.smtp.SMTPMessage
            r2 = 0
            if (r1 == 0) goto Le
            com.sun.mail.smtp.SMTPMessage r0 = (com.sun.mail.smtp.SMTPMessage) r0
            java.lang.String r0 = r0.getEnvelopeFrom()
            goto Lf
        Le:
            r0 = r2
        Lf:
            java.lang.String r1 = "mail."
            if (r0 == 0) goto L19
            int r3 = r0.length()
            if (r3 > 0) goto L32
        L19:
            javax.mail.Session r0 = r6.session
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r4 = r6.name
            r3.append(r4)
            java.lang.String r4 = ".from"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.getProperty(r3)
        L32:
            if (r0 == 0) goto L3a
            int r3 = r0.length()
            if (r3 > 0) goto L59
        L3a:
            javax.mail.internet.MimeMessage r0 = r6.message
            if (r0 == 0) goto L4b
            javax.mail.Address[] r0 = r0.getFrom()
            if (r0 == 0) goto L4b
            int r3 = r0.length
            if (r3 <= 0) goto L4b
            r3 = 0
            r0 = r0[r3]
            goto L51
        L4b:
            javax.mail.Session r0 = r6.session
            javax.mail.internet.InternetAddress r0 = javax.mail.internet.InternetAddress.getLocalAddress(r0)
        L51:
            if (r0 == 0) goto L157
            javax.mail.internet.InternetAddress r0 = (javax.mail.internet.InternetAddress) r0
            java.lang.String r0 = r0.getAddress()
        L59:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "MAIL FROM:"
            r3.<init>(r4)
            java.lang.String r0 = r6.normalizeAddress(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "DSN"
            boolean r3 = r6.supportsExtension(r3)
            if (r3 == 0) goto Lb3
            javax.mail.internet.MimeMessage r3 = r6.message
            boolean r4 = r3 instanceof com.sun.mail.smtp.SMTPMessage
            if (r4 == 0) goto L80
            com.sun.mail.smtp.SMTPMessage r3 = (com.sun.mail.smtp.SMTPMessage) r3
            java.lang.String r3 = r3.getDSNRet()
            goto L81
        L80:
            r3 = r2
        L81:
            if (r3 != 0) goto L9c
            javax.mail.Session r3 = r6.session
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = r6.name
            r4.append(r5)
            java.lang.String r5 = ".dsn.ret"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = r3.getProperty(r4)
        L9c:
            if (r3 == 0) goto Lb3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.<init>(r0)
            java.lang.String r0 = " RET="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
        Lb3:
            java.lang.String r3 = "AUTH"
            boolean r3 = r6.supportsExtension(r3)
            if (r3 == 0) goto L10d
            javax.mail.internet.MimeMessage r3 = r6.message
            boolean r4 = r3 instanceof com.sun.mail.smtp.SMTPMessage
            if (r4 == 0) goto Lc8
            com.sun.mail.smtp.SMTPMessage r3 = (com.sun.mail.smtp.SMTPMessage) r3
            java.lang.String r3 = r3.getSubmitter()
            goto Lc9
        Lc8:
            r3 = r2
        Lc9:
            if (r3 != 0) goto Le4
            javax.mail.Session r3 = r6.session
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = r6.name
            r4.append(r5)
            java.lang.String r5 = ".submitter"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = r3.getProperty(r4)
        Le4:
            if (r3 == 0) goto L10d
            java.lang.String r3 = xtext(r3)     // Catch: java.lang.IllegalArgumentException -> L100
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L100
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L100
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L100
            java.lang.String r5 = " AUTH="
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L100
            r4.append(r3)     // Catch: java.lang.IllegalArgumentException -> L100
            java.lang.String r0 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L100
            goto L10d
        L100:
            r3 = move-exception
            boolean r4 = r6.debug
            if (r4 == 0) goto L10d
            java.io.PrintStream r4 = r6.out
            r3.toString()
            r4.getClass()
        L10d:
            javax.mail.internet.MimeMessage r3 = r6.message
            boolean r4 = r3 instanceof com.sun.mail.smtp.SMTPMessage
            if (r4 == 0) goto L119
            com.sun.mail.smtp.SMTPMessage r3 = (com.sun.mail.smtp.SMTPMessage) r3
            java.lang.String r2 = r3.getMailExtension()
        L119:
            if (r2 != 0) goto L134
            javax.mail.Session r2 = r6.session
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = r6.name
            r3.append(r1)
            java.lang.String r1 = ".mailextension"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = r2.getProperty(r1)
        L134:
            if (r2 == 0) goto L151
            int r1 = r2.length()
            if (r1 <= 0) goto L151
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L151:
            r1 = 250(0xfa, float:3.5E-43)
            r6.issueSendCommand(r0, r1)
            return
        L157:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "can't determine local email address"
            r0.<init>(r1)
            throw r0
    }

    protected boolean protocolConnect(java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17) throws javax.mail.MessagingException {
            r13 = this;
            javax.mail.Session r0 = r13.session
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mail."
            r1.<init>(r2)
            java.lang.String r3 = r13.name
            r1.append(r3)
            java.lang.String r3 = ".ehlo"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.getProperty(r1)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L29
            java.lang.String r4 = "false"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L29
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            javax.mail.Session r4 = r13.session
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r6 = r13.name
            r5.append(r6)
            java.lang.String r6 = ".auth"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = r4.getProperty(r5)
            if (r4 == 0) goto L4f
            java.lang.String r5 = "true"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r13.debug
            if (r5 == 0) goto L59
            java.io.PrintStream r5 = r13.out
            r5.getClass()
        L59:
            if (r4 == 0) goto L60
            if (r16 == 0) goto L5f
            if (r17 != 0) goto L60
        L5f:
            return r3
        L60:
            r5 = -1
            if (r15 != r5) goto L86
            javax.mail.Session r6 = r13.session
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            java.lang.String r2 = r13.name
            r7.append(r2)
            java.lang.String r2 = ".port"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r2 = r6.getProperty(r2)
            if (r2 == 0) goto L83
            int r2 = java.lang.Integer.parseInt(r2)
            goto L87
        L83:
            int r2 = r13.defaultPort
            goto L87
        L86:
            r2 = r15
        L87:
            if (r14 == 0) goto L92
            int r6 = r14.length()
            if (r6 != 0) goto L90
            goto L92
        L90:
            r7 = r14
            goto L95
        L92:
            java.lang.String r14 = "localhost"
            goto L90
        L95:
            java.net.Socket r14 = r13.serverSocket
            if (r14 == 0) goto L9d
            r13.openServer()
            goto La0
        L9d:
            r13.openServer(r7, r2)
        La0:
            if (r0 == 0) goto Lab
            java.lang.String r14 = r13.getLocalHost()
            boolean r14 = r13.ehlo(r14)
            goto Lac
        Lab:
            r14 = 0
        Lac:
            if (r14 != 0) goto Lb5
            java.lang.String r14 = r13.getLocalHost()
            r13.helo(r14)
        Lb5:
            boolean r14 = r13.useStartTLS
            if (r14 == 0) goto Lcb
            java.lang.String r14 = "STARTTLS"
            boolean r14 = r13.supportsExtension(r14)
            if (r14 == 0) goto Lcb
            r13.startTLS()
            java.lang.String r14 = r13.getLocalHost()
            r13.ehlo(r14)
        Lcb:
            if (r4 != 0) goto Ld1
            if (r16 == 0) goto L224
            if (r17 == 0) goto L224
        Ld1:
            java.lang.String r14 = "AUTH"
            boolean r14 = r13.supportsExtension(r14)
            java.lang.String r0 = "AUTH=LOGIN"
            if (r14 != 0) goto Le1
            boolean r14 = r13.supportsExtension(r0)
            if (r14 == 0) goto L224
        Le1:
            boolean r14 = r13.debug
            java.lang.String r2 = "LOGIN"
            if (r14 == 0) goto Lfd
            java.io.PrintStream r14 = r13.out
            r14.getClass()
            boolean r14 = r13.supportsAuthentication(r2)
            if (r14 != 0) goto Lfd
            boolean r14 = r13.supportsExtension(r0)
            if (r14 == 0) goto Lfd
            java.io.PrintStream r14 = r13.out
            r14.getClass()
        Lfd:
            boolean r14 = r13.supportsAuthentication(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 334(0x14e, float:4.68E-43)
            r12 = 235(0xeb, float:3.3E-43)
            if (r14 != 0) goto L1c2
            boolean r14 = r13.supportsExtension(r0)
            if (r14 == 0) goto L112
            goto L1c2
        L112:
            java.lang.String r14 = "PLAIN"
            boolean r14 = r13.supportsAuthentication(r14)
            if (r14 == 0) goto L163
            java.lang.String r14 = "AUTH PLAIN"
            int r14 = r13.simpleCommand(r14)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            r0.<init>()     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            com.sun.mail.util.BASE64EncoderStream r5 = new com.sun.mail.util.BASE64EncoderStream     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            if (r14 != r4) goto L150
            r5.write(r3)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            byte[] r2 = com.sun.mail.util.ASCIIUtility.getBytes(r16)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            r5.write(r2)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            r5.write(r3)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            byte[] r2 = com.sun.mail.util.ASCIIUtility.getBytes(r17)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            r5.write(r2)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            r5.flush()     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            int r14 = r13.simpleCommand(r0)     // Catch: java.lang.Throwable -> L14c java.io.IOException -> L14e
            goto L150
        L14c:
            r0 = move-exception
            goto L156
        L14e:
            goto L15d
        L150:
            if (r14 == r12) goto L224
            r13.closeConnection()
            return r3
        L156:
            if (r14 == r12) goto L15c
            r13.closeConnection()
            return r3
        L15c:
            throw r0
        L15d:
            if (r14 == r12) goto L224
            r13.closeConnection()
            return r3
        L163:
            java.lang.String r14 = "DIGEST-MD5"
            boolean r14 = r13.supportsAuthentication(r14)
            if (r14 == 0) goto L224
            com.sun.mail.smtp.DigestMD5 r6 = r13.getMD5()
            if (r6 == 0) goto L224
            java.lang.String r14 = "AUTH DIGEST-MD5"
            int r14 = r13.simpleCommand(r14)
            if (r14 != r4) goto L1a1
            java.lang.String r10 = r13.getSASLRealm()     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            java.lang.String r11 = r13.lastServerResponse     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            r8 = r16
            r9 = r17
            byte[] r0 = r6.authClient(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            int r14 = r13.simpleCommand(r0)     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            if (r14 != r4) goto L1a1
            java.lang.String r0 = r13.lastServerResponse     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            boolean r0 = r6.authServer(r0)     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            if (r0 != 0) goto L196
            goto L1bc
        L196:
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            int r5 = r13.simpleCommand(r0)     // Catch: java.lang.Throwable -> L19d java.lang.Exception -> L19f
            goto L1bc
        L19d:
            r0 = move-exception
            goto L1b5
        L19f:
            r0 = move-exception
            goto L1a3
        L1a1:
            r5 = r14
            goto L1bc
        L1a3:
            boolean r2 = r13.debug     // Catch: java.lang.Throwable -> L19d
            if (r2 == 0) goto L1af
            java.io.PrintStream r2 = r13.out     // Catch: java.lang.Throwable -> L19d
            r0.toString()     // Catch: java.lang.Throwable -> L19d
            r2.getClass()     // Catch: java.lang.Throwable -> L19d
        L1af:
            if (r14 == r12) goto L224
            r13.closeConnection()
            return r3
        L1b5:
            if (r14 == r12) goto L1bb
            r13.closeConnection()
            return r3
        L1bb:
            throw r0
        L1bc:
            if (r5 == r12) goto L224
            r13.closeConnection()
            return r3
        L1c2:
            java.lang.String r14 = "AUTH LOGIN"
            int r0 = r13.simpleCommand(r14)
            r5 = 530(0x212, float:7.43E-43)
            if (r0 != r5) goto L1d3
            r13.startTLS()
            int r0 = r13.simpleCommand(r14)
        L1d3:
            r14 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r0.<init>()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            com.sun.mail.util.BASE64EncoderStream r5 = new com.sun.mail.util.BASE64EncoderStream     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            if (r14 != r4) goto L1fa
            byte[] r2 = com.sun.mail.util.ASCIIUtility.getBytes(r16)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r5.write(r2)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r5.flush()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            int r14 = r13.simpleCommand(r2)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r0.reset()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            goto L1fa
        L1f6:
            r0 = move-exception
            goto L217
        L1f8:
            goto L21e
        L1fa:
            if (r14 != r4) goto L211
            byte[] r2 = com.sun.mail.util.ASCIIUtility.getBytes(r17)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r5.write(r2)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r5.flush()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            int r14 = r13.simpleCommand(r2)     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
            r0.reset()     // Catch: java.lang.Throwable -> L1f6 java.io.IOException -> L1f8
        L211:
            if (r14 == r12) goto L224
            r13.closeConnection()
            return r3
        L217:
            if (r14 == r12) goto L21d
            r13.closeConnection()
            return r3
        L21d:
            throw r0
        L21e:
            if (r14 == r12) goto L224
            r13.closeConnection()
            return r3
        L224:
            return r1
    }

    protected void rcptTo() throws javax.mail.MessagingException {
            r16 = this;
            r1 = r16
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            r4 = 0
            r1.invalidAddr = r4
            r1.validUnsentAddr = r4
            r1.validSentAddr = r4
            javax.mail.internet.MimeMessage r5 = r1.message
            boolean r6 = r5 instanceof com.sun.mail.smtp.SMTPMessage
            if (r6 == 0) goto L25
            com.sun.mail.smtp.SMTPMessage r5 = (com.sun.mail.smtp.SMTPMessage) r5
            boolean r5 = r5.getSendPartial()
            goto L26
        L25:
            r5 = 0
        L26:
            java.lang.String r6 = "mail."
            r8 = 1
            if (r5 != 0) goto L51
            javax.mail.Session r5 = r1.session
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r10 = r1.name
            r9.append(r10)
            java.lang.String r10 = ".sendpartial"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r5 = r5.getProperty(r9)
            if (r5 == 0) goto L50
            java.lang.String r9 = "true"
            boolean r5 = r5.equalsIgnoreCase(r9)
            if (r5 == 0) goto L50
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            boolean r9 = r1.debug
            if (r9 == 0) goto L5c
            if (r5 == 0) goto L5c
            java.io.PrintStream r9 = r1.out
            r9.getClass()
        L5c:
            java.lang.String r9 = "DSN"
            boolean r9 = r1.supportsExtension(r9)
            if (r9 == 0) goto L93
            javax.mail.internet.MimeMessage r9 = r1.message
            boolean r10 = r9 instanceof com.sun.mail.smtp.SMTPMessage
            if (r10 == 0) goto L71
            com.sun.mail.smtp.SMTPMessage r9 = (com.sun.mail.smtp.SMTPMessage) r9
            java.lang.String r9 = r9.getDSNNotify()
            goto L72
        L71:
            r9 = r4
        L72:
            if (r9 != 0) goto L8d
            javax.mail.Session r9 = r1.session
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.String r6 = r1.name
            r10.append(r6)
            java.lang.String r6 = ".dsn.notify"
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r9 = r9.getProperty(r6)
        L8d:
            if (r9 == 0) goto L91
            r6 = 1
            goto L95
        L91:
            r6 = 0
            goto L95
        L93:
            r9 = r4
            goto L91
        L95:
            r12 = r4
            r4 = 0
            r10 = 0
        L98:
            javax.mail.Address[] r11 = r1.addresses
            int r13 = r11.length
            java.lang.String r14 = "RSET"
            r15 = 250(0xfa, float:3.5E-43)
            if (r4 < r13) goto L1dd
            if (r5 == 0) goto Laa
            int r4 = r0.size()
            if (r4 != 0) goto Laa
            r10 = 1
        Laa:
            if (r10 == 0) goto Lf4
            int r4 = r3.size()
            javax.mail.Address[] r4 = new javax.mail.Address[r4]
            r1.invalidAddr = r4
            r3.copyInto(r4)
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = r3 + r4
            javax.mail.Address[] r3 = new javax.mail.Address[r3]
            r1.validUnsentAddr = r3
            r3 = 0
            r4 = 0
        Lc6:
            int r5 = r0.size()
            if (r3 < r5) goto Le4
            r0 = 0
        Lcd:
            int r3 = r2.size()
            if (r0 < r3) goto Ld4
            goto L131
        Ld4:
            javax.mail.Address[] r3 = r1.validUnsentAddr
            int r5 = r4 + 1
            java.lang.Object r6 = r2.elementAt(r0)
            javax.mail.Address r6 = (javax.mail.Address) r6
            r3[r4] = r6
            int r0 = r0 + 1
            r4 = r5
            goto Lcd
        Le4:
            javax.mail.Address[] r5 = r1.validUnsentAddr
            int r6 = r4 + 1
            java.lang.Object r8 = r0.elementAt(r3)
            javax.mail.Address r8 = (javax.mail.Address) r8
            r5[r4] = r8
            int r3 = r3 + 1
            r4 = r6
            goto Lc6
        Lf4:
            boolean r4 = r1.reportSuccess
            if (r4 != 0) goto L10c
            if (r5 == 0) goto L107
            int r4 = r3.size()
            if (r4 > 0) goto L10c
            int r4 = r2.size()
            if (r4 <= 0) goto L107
            goto L10c
        L107:
            javax.mail.Address[] r0 = r1.addresses
            r1.validSentAddr = r0
            goto L131
        L10c:
            r1.sendPartiallyFailed = r8
            r1.exception = r12
            int r4 = r3.size()
            javax.mail.Address[] r4 = new javax.mail.Address[r4]
            r1.invalidAddr = r4
            r3.copyInto(r4)
            int r3 = r2.size()
            javax.mail.Address[] r3 = new javax.mail.Address[r3]
            r1.validUnsentAddr = r3
            r2.copyInto(r3)
            int r2 = r0.size()
            javax.mail.Address[] r2 = new javax.mail.Address[r2]
            r1.validSentAddr = r2
            r0.copyInto(r2)
        L131:
            boolean r0 = r1.debug
            if (r0 == 0) goto L19b
            javax.mail.Address[] r0 = r1.validSentAddr
            if (r0 == 0) goto L157
            int r0 = r0.length
            if (r0 <= 0) goto L157
            java.io.PrintStream r0 = r1.out
            r0.getClass()
            r0 = 0
        L142:
            javax.mail.Address[] r2 = r1.validSentAddr
            int r2 = r2.length
            if (r0 < r2) goto L148
            goto L157
        L148:
            java.io.PrintStream r2 = r1.out
            javax.mail.Address[] r3 = r1.validSentAddr
            r3 = r3[r0]
            java.util.Objects.toString(r3)
            r2.getClass()
            int r0 = r0 + 1
            goto L142
        L157:
            javax.mail.Address[] r0 = r1.validUnsentAddr
            if (r0 == 0) goto L179
            int r0 = r0.length
            if (r0 <= 0) goto L179
            java.io.PrintStream r0 = r1.out
            r0.getClass()
            r0 = 0
        L164:
            javax.mail.Address[] r2 = r1.validUnsentAddr
            int r2 = r2.length
            if (r0 < r2) goto L16a
            goto L179
        L16a:
            java.io.PrintStream r2 = r1.out
            javax.mail.Address[] r3 = r1.validUnsentAddr
            r3 = r3[r0]
            java.util.Objects.toString(r3)
            r2.getClass()
            int r0 = r0 + 1
            goto L164
        L179:
            javax.mail.Address[] r0 = r1.invalidAddr
            if (r0 == 0) goto L19b
            int r0 = r0.length
            if (r0 <= 0) goto L19b
            java.io.PrintStream r0 = r1.out
            r0.getClass()
            r7 = 0
        L186:
            javax.mail.Address[] r0 = r1.invalidAddr
            int r0 = r0.length
            if (r7 < r0) goto L18c
            goto L19b
        L18c:
            java.io.PrintStream r0 = r1.out
            javax.mail.Address[] r2 = r1.invalidAddr
            r2 = r2[r7]
            java.util.Objects.toString(r2)
            r0.getClass()
            int r7 = r7 + 1
            goto L186
        L19b:
            if (r10 == 0) goto L1dc
            boolean r0 = r1.debug
            if (r0 == 0) goto L1a6
            java.io.PrintStream r0 = r1.out
            r0.getClass()
        L1a6:
            javax.mail.Address[] r3 = r1.validSentAddr
            javax.mail.Address[] r4 = r1.validUnsentAddr
            javax.mail.Address[] r5 = r1.invalidAddr
            javax.mail.internet.MimeMessage r6 = r1.message
            r2 = 2
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)
            java.lang.String r2 = r1.lastServerResponse
            int r3 = r1.lastReturnCode
            java.net.Socket r0 = r1.serverSocket     // Catch: java.lang.Throwable -> L1be javax.mail.MessagingException -> L1c5
            if (r0 == 0) goto L1c0
            r1.issueCommand(r14, r15)     // Catch: java.lang.Throwable -> L1be javax.mail.MessagingException -> L1c5
            goto L1c0
        L1be:
            r0 = move-exception
            goto L1c9
        L1c0:
            r1.lastServerResponse = r2
            r1.lastReturnCode = r3
            goto L1ce
        L1c5:
            r1.close()     // Catch: java.lang.Throwable -> L1be javax.mail.MessagingException -> L1c0
            goto L1c0
        L1c9:
            r1.lastServerResponse = r2
            r1.lastReturnCode = r3
            throw r0
        L1ce:
            javax.mail.SendFailedException r10 = new javax.mail.SendFailedException
            javax.mail.Address[] r13 = r1.validSentAddr
            javax.mail.Address[] r14 = r1.validUnsentAddr
            javax.mail.Address[] r15 = r1.invalidAddr
            java.lang.String r11 = "Invalid Addresses"
            r10.<init>(r11, r12, r13, r14, r15)
            throw r10
        L1dc:
            return
        L1dd:
            r11 = r11[r4]
            javax.mail.internet.InternetAddress r11 = (javax.mail.internet.InternetAddress) r11
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r7 = "RCPT TO:"
            r13.<init>(r7)
            java.lang.String r7 = r11.getAddress()
            java.lang.String r7 = r1.normalizeAddress(r7)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            if (r6 == 0) goto L20e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r13.<init>(r7)
            java.lang.String r7 = " NOTIFY="
            r13.append(r7)
            r13.append(r9)
            java.lang.String r7 = r13.toString()
        L20e:
            r1.sendCommand(r7)
            int r13 = r1.readServerResponse()
            if (r13 == r15) goto L298
            r8 = 251(0xfb, float:3.52E-43)
            if (r13 == r8) goto L298
            r8 = 501(0x1f5, float:7.02E-43)
            if (r13 == r8) goto L284
            r8 = 503(0x1f7, float:7.05E-43)
            if (r13 == r8) goto L284
            switch(r13) {
                case 450: goto L270;
                case 451: goto L270;
                case 452: goto L270;
                default: goto L226;
            }
        L226:
            switch(r13) {
                case 550: goto L284;
                case 551: goto L284;
                case 552: goto L270;
                case 553: goto L284;
                default: goto L229;
            }
        L229:
            r8 = 400(0x190, float:5.6E-43)
            if (r13 < r8) goto L235
            r8 = 499(0x1f3, float:6.99E-43)
            if (r13 > r8) goto L235
            r2.addElement(r11)
            goto L240
        L235:
            r8 = 500(0x1f4, float:7.0E-43)
            if (r13 < r8) goto L252
            r8 = 599(0x257, float:8.4E-43)
            if (r13 > r8) goto L252
            r3.addElement(r11)
        L240:
            if (r5 != 0) goto L243
            r10 = 1
        L243:
            com.sun.mail.smtp.SMTPAddressFailedException r8 = new com.sun.mail.smtp.SMTPAddressFailedException
            java.lang.String r14 = r1.lastServerResponse
            r8.<init>(r11, r7, r13, r14)
            if (r12 != 0) goto L24e
        L24c:
            r12 = r8
            goto L2ad
        L24e:
            r12.setNextException(r8)
            goto L2ad
        L252:
            boolean r0 = r1.debug
            if (r0 == 0) goto L25b
            java.io.PrintStream r0 = r1.out
            r0.getClass()
        L25b:
            java.lang.String r0 = r1.lastServerResponse
            int r2 = r1.lastReturnCode
            java.net.Socket r3 = r1.serverSocket
            if (r3 == 0) goto L266
            r1.issueCommand(r14, r15)
        L266:
            r1.lastServerResponse = r0
            r1.lastReturnCode = r2
            com.sun.mail.smtp.SMTPAddressFailedException r2 = new com.sun.mail.smtp.SMTPAddressFailedException
            r2.<init>(r11, r7, r13, r0)
            throw r2
        L270:
            if (r5 != 0) goto L273
            r10 = 1
        L273:
            r2.addElement(r11)
            com.sun.mail.smtp.SMTPAddressFailedException r8 = new com.sun.mail.smtp.SMTPAddressFailedException
            java.lang.String r14 = r1.lastServerResponse
            r8.<init>(r11, r7, r13, r14)
            if (r12 != 0) goto L280
            goto L24c
        L280:
            r12.setNextException(r8)
            goto L2ad
        L284:
            if (r5 != 0) goto L287
            r10 = 1
        L287:
            r3.addElement(r11)
            com.sun.mail.smtp.SMTPAddressFailedException r8 = new com.sun.mail.smtp.SMTPAddressFailedException
            java.lang.String r14 = r1.lastServerResponse
            r8.<init>(r11, r7, r13, r14)
            if (r12 != 0) goto L294
            goto L24c
        L294:
            r12.setNextException(r8)
            goto L2ad
        L298:
            r0.addElement(r11)
            boolean r8 = r1.reportSuccess
            if (r8 != 0) goto L2a0
            goto L2ad
        L2a0:
            com.sun.mail.smtp.SMTPAddressSucceededException r8 = new com.sun.mail.smtp.SMTPAddressSucceededException
            java.lang.String r14 = r1.lastServerResponse
            r8.<init>(r11, r7, r13, r14)
            if (r12 != 0) goto L2aa
            goto L24c
        L2aa:
            r12.setNextException(r8)
        L2ad:
            int r4 = r4 + 1
            r8 = 1
            goto L98
    }

    protected int readServerResponse() throws javax.mail.MessagingException {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 100
            r0.<init>(r1)
        L7:
            r1 = 0
            com.sun.mail.util.LineInputStream r2 = r5.lineInputStream     // Catch: java.io.IOException -> L1e
            java.lang.String r2 = r2.readLine()     // Catch: java.io.IOException -> L1e
            r3 = -1
            if (r2 != 0) goto L2e
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L1e
            int r2 = r0.length()     // Catch: java.io.IOException -> L1e
            if (r2 != 0) goto L20
            java.lang.String r0 = "[EOF]"
            goto L20
        L1e:
            r0 = move-exception
            goto L6d
        L20:
            r5.lastServerResponse = r0     // Catch: java.io.IOException -> L1e
            r5.lastReturnCode = r3     // Catch: java.io.IOException -> L1e
            boolean r0 = r5.debug     // Catch: java.io.IOException -> L1e
            if (r0 == 0) goto L2d
            java.io.PrintStream r0 = r5.out     // Catch: java.io.IOException -> L1e
            r0.getClass()     // Catch: java.io.IOException -> L1e
        L2d:
            return r3
        L2e:
            r0.append(r2)     // Catch: java.io.IOException -> L1e
            java.lang.String r4 = "\n"
            r0.append(r4)     // Catch: java.io.IOException -> L1e
            boolean r2 = r5.isNotLastLine(r2)     // Catch: java.io.IOException -> L1e
            if (r2 != 0) goto L7
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L1e
            if (r0 == 0) goto L57
            int r2 = r0.length()
            r4 = 3
            if (r2 < r4) goto L57
            java.lang.String r1 = r0.substring(r1, r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L52 java.lang.NumberFormatException -> L59
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L52 java.lang.NumberFormatException -> L59
            goto L5d
        L52:
            r5.close()     // Catch: javax.mail.MessagingException -> L56
            goto L57
        L56:
        L57:
            r1 = -1
            goto L5d
        L59:
            r5.close()     // Catch: javax.mail.MessagingException -> L56
            goto L57
        L5d:
            if (r1 != r3) goto L68
            boolean r2 = r5.debug
            if (r2 == 0) goto L68
            java.io.PrintStream r2 = r5.out
            r2.getClass()
        L68:
            r5.lastServerResponse = r0
            r5.lastReturnCode = r1
            return r1
        L6d:
            boolean r2 = r5.debug
            if (r2 == 0) goto L79
            java.io.PrintStream r2 = r5.out
            r0.toString()
            r2.getClass()
        L79:
            java.lang.String r2 = ""
            r5.lastServerResponse = r2
            r5.lastReturnCode = r1
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "Exception reading response"
            r1.<init>(r2, r0)
            throw r1
    }

    protected void sendCommand(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            byte[] r1 = com.sun.mail.util.ASCIIUtility.getBytes(r1)
            r0.sendCommand(r1)
            return
    }

    public synchronized void sendMessage(javax.mail.Message r18, javax.mail.Address[] r19) throws javax.mail.MessagingException, javax.mail.SendFailedException {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            monitor-enter(r17)
            r1.checkConnected()     // Catch: java.lang.Throwable -> L18
            boolean r3 = r0 instanceof javax.mail.internet.MimeMessage     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L23
            boolean r0 = r1.debug     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1b
            java.io.PrintStream r0 = r1.out     // Catch: java.lang.Throwable -> L18
            r0.getClass()     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            goto L147
        L1b:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "SMTP can only send RFC822 messages"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L23:
            r7 = 0
            r3 = 0
        L25:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L18
            if (r3 < r4) goto L124
            r3 = r0
            javax.mail.internet.MimeMessage r3 = (javax.mail.internet.MimeMessage) r3     // Catch: java.lang.Throwable -> L18
            r1.message = r3     // Catch: java.lang.Throwable -> L18
            r1.addresses = r2     // Catch: java.lang.Throwable -> L18
            r1.validUnsentAddr = r2     // Catch: java.lang.Throwable -> L18
            r1.expandGroups()     // Catch: java.lang.Throwable -> L18
            boolean r2 = r0 instanceof com.sun.mail.smtp.SMTPMessage     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L3f
            com.sun.mail.smtp.SMTPMessage r0 = (com.sun.mail.smtp.SMTPMessage) r0     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.getAllow8bitMIME()     // Catch: java.lang.Throwable -> L18
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 != 0) goto L6a
            javax.mail.Session r0 = r1.session     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "mail."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r1.name     // Catch: java.lang.Throwable -> L18
            r2.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = ".allow8bitmime"
            r2.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L69
            java.lang.String r2 = "true"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L69
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            boolean r2 = r1.debug     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L73
            java.io.PrintStream r2 = r1.out     // Catch: java.lang.Throwable -> L18
            r2.getClass()     // Catch: java.lang.Throwable -> L18
        L73:
            if (r0 == 0) goto L8a
            java.lang.String r0 = "8BITMIME"
            boolean r0 = r1.supportsExtension(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L8a
            javax.mail.internet.MimeMessage r0 = r1.message     // Catch: java.lang.Throwable -> L18
            boolean r0 = r1.convertTo8Bit(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L8a
            javax.mail.internet.MimeMessage r0 = r1.message     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L8a
            r0.saveChanges()     // Catch: java.lang.Throwable -> L18 javax.mail.MessagingException -> L8a
        L8a:
            r8 = 0
            r1.mailFrom()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r1.rcptTo()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.internet.MimeMessage r0 = r1.message     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            java.io.OutputStream r2 = r1.data()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            java.lang.String[] r3 = com.sun.mail.smtp.SMTPTransport.ignoreList     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r0.writeTo(r2, r3)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r1.finishData()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            boolean r0 = r1.sendPartiallyFailed     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            if (r0 == 0) goto Ld5
            boolean r0 = r1.debug     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            if (r0 == 0) goto Lb3
            java.io.PrintStream r0 = r1.out     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r0.getClass()     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            goto Lb3
        Lad:
            r0 = move-exception
            goto L115
        Laf:
            r0 = move-exception
            goto Lf1
        Lb1:
            r0 = move-exception
            goto L108
        Lb3:
            javax.mail.Address[] r3 = r1.validSentAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r4 = r1.validUnsentAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r5 = r1.invalidAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.internet.MimeMessage r6 = r1.message     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r2 = 3
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            com.sun.mail.smtp.SMTPSendFailedException r9 = new com.sun.mail.smtp.SMTPSendFailedException     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            java.lang.String r10 = "."
            int r11 = r1.lastReturnCode     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            java.lang.String r12 = r1.lastServerResponse     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.MessagingException r13 = r1.exception     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r14 = r1.validSentAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r15 = r1.validUnsentAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r0 = r1.invalidAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            throw r9     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
        Ld5:
            javax.mail.Address[] r3 = r1.validSentAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r4 = r1.validUnsentAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.Address[] r5 = r1.invalidAddr     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            javax.mail.internet.MimeMessage r6 = r1.message     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r2 = 1
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lad java.io.IOException -> Laf javax.mail.MessagingException -> Lb1
            r1.invalidAddr = r8     // Catch: java.lang.Throwable -> L18
            r1.validUnsentAddr = r8     // Catch: java.lang.Throwable -> L18
            r1.validSentAddr = r8     // Catch: java.lang.Throwable -> L18
            r1.addresses = r8     // Catch: java.lang.Throwable -> L18
            r1.message = r8     // Catch: java.lang.Throwable -> L18
            r1.exception = r8     // Catch: java.lang.Throwable -> L18
            r1.sendPartiallyFailed = r7     // Catch: java.lang.Throwable -> L18
            monitor-exit(r17)
            return
        Lf1:
            r1.closeConnection()     // Catch: java.lang.Throwable -> Lad javax.mail.MessagingException -> Lf4
        Lf4:
            javax.mail.Address[] r3 = r1.validSentAddr     // Catch: java.lang.Throwable -> Lad
            javax.mail.Address[] r4 = r1.validUnsentAddr     // Catch: java.lang.Throwable -> Lad
            javax.mail.Address[] r5 = r1.invalidAddr     // Catch: java.lang.Throwable -> Lad
            javax.mail.internet.MimeMessage r6 = r1.message     // Catch: java.lang.Throwable -> Lad
            r2 = 2
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lad
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = "IOException while sending message"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lad
            throw r2     // Catch: java.lang.Throwable -> Lad
        L108:
            javax.mail.Address[] r3 = r1.validSentAddr     // Catch: java.lang.Throwable -> Lad
            javax.mail.Address[] r4 = r1.validUnsentAddr     // Catch: java.lang.Throwable -> Lad
            javax.mail.Address[] r5 = r1.invalidAddr     // Catch: java.lang.Throwable -> Lad
            javax.mail.internet.MimeMessage r6 = r1.message     // Catch: java.lang.Throwable -> Lad
            r2 = 2
            r1.notifyTransportListeners(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lad
            throw r0     // Catch: java.lang.Throwable -> Lad
        L115:
            r1.invalidAddr = r8     // Catch: java.lang.Throwable -> L18
            r1.validUnsentAddr = r8     // Catch: java.lang.Throwable -> L18
            r1.validSentAddr = r8     // Catch: java.lang.Throwable -> L18
            r1.addresses = r8     // Catch: java.lang.Throwable -> L18
            r1.message = r8     // Catch: java.lang.Throwable -> L18
            r1.exception = r8     // Catch: java.lang.Throwable -> L18
            r1.sendPartiallyFailed = r7     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L124:
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L18
            boolean r4 = r4 instanceof javax.mail.internet.InternetAddress     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L12e
            int r3 = r3 + 1
            goto L25
        L12e:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r4.<init>()     // Catch: java.lang.Throwable -> L18
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L18
            r4.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = " is not an InternetAddress"
            r4.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L147:
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public synchronized void setLocalHost(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.localHostName = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void setReportSuccess(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.reportSuccess = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void setSASLRealm(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.saslRealm = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void setStartTLS(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.useStartTLS = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void setUseRset(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.useRset = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized int simpleCommand(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.sendCommand(r1)     // Catch: java.lang.Throwable -> La
            int r1 = r0.readServerResponse()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    protected int simpleCommand(byte[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.sendCommand(r1)
            int r1 = r0.readServerResponse()
            return r1
    }

    protected void startTLS() throws javax.mail.MessagingException {
            r4 = this;
            java.lang.String r0 = "STARTTLS"
            r1 = 220(0xdc, float:3.08E-43)
            r4.issueCommand(r0, r1)
            java.net.Socket r0 = r4.serverSocket     // Catch: java.io.IOException -> L29
            javax.mail.Session r1 = r4.session     // Catch: java.io.IOException -> L29
            java.util.Properties r1 = r1.getProperties()     // Catch: java.io.IOException -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L29
            java.lang.String r3 = "mail."
            r2.<init>(r3)     // Catch: java.io.IOException -> L29
            java.lang.String r3 = r4.name     // Catch: java.io.IOException -> L29
            r2.append(r3)     // Catch: java.io.IOException -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L29
            java.net.Socket r0 = com.sun.mail.util.SocketFetcher.startTLS(r0, r1, r2)     // Catch: java.io.IOException -> L29
            r4.serverSocket = r0     // Catch: java.io.IOException -> L29
            r4.initStreams()     // Catch: java.io.IOException -> L29
            return
        L29:
            r0 = move-exception
            r4.closeConnection()
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "Could not convert socket to TLS"
            r1.<init>(r2, r0)
            throw r1
    }

    protected boolean supportsAuthentication(java.lang.String r4) {
            r3 = this;
            java.util.Hashtable r0 = r3.extMap
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "AUTH"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.util.StringTokenizer r2 = new java.util.StringTokenizer
            r2.<init>(r0)
        L16:
            boolean r0 = r2.hasMoreTokens()
            if (r0 != 0) goto L1d
            return r1
        L1d:
            java.lang.String r0 = r2.nextToken()
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L16
            r4 = 1
            return r4
    }

    public boolean supportsExtension(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.extMap
            if (r0 == 0) goto L12
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toUpperCase(r1)
            java.lang.Object r3 = r0.get(r3)
            if (r3 == 0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }
}
