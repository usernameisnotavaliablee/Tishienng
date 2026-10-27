package com.sun.mail.dsn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class text_rfc822headers implements javax.activation.DataContentHandler {
    private static javax.activation.ActivationDataFlavor myDF;
    private static javax.activation.ActivationDataFlavor myDFs;

    static {
            javax.activation.ActivationDataFlavor r0 = new javax.activation.ActivationDataFlavor
            java.lang.Class<com.sun.mail.dsn.MessageHeaders> r1 = com.sun.mail.dsn.MessageHeaders.class
            java.lang.String r2 = "text/rfc822-headers"
            java.lang.String r3 = "RFC822 headers"
            r0.<init>(r1, r2, r3)
            com.sun.mail.dsn.text_rfc822headers.myDF = r0
            javax.activation.ActivationDataFlavor r0 = new javax.activation.ActivationDataFlavor
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0.<init>(r1, r2, r3)
            com.sun.mail.dsn.text_rfc822headers.myDFs = r0
            return
    }

    public text_rfc822headers() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String getCharset(java.lang.String r2) {
            r1 = this;
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: java.lang.Exception -> L14
            r0.<init>(r2)     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = "charset"
            java.lang.String r2 = r0.getParameter(r2)     // Catch: java.lang.Exception -> L14
            if (r2 != 0) goto Lf
            java.lang.String r2 = "us-ascii"
        Lf:
            java.lang.String r2 = javax.mail.internet.MimeUtility.javaCharset(r2)     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = 0
            return r2
    }

    private java.lang.Object getStringContent(javax.activation.DataSource r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.getContentType()     // Catch: java.lang.IllegalArgumentException -> L3a
            java.lang.String r0 = r5.getCharset(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.IllegalArgumentException -> L3a
            java.io.InputStream r6 = r6.getInputStream()     // Catch: java.lang.IllegalArgumentException -> L3a
            r1.<init>(r6, r0)     // Catch: java.lang.IllegalArgumentException -> L3a
            r6 = 1024(0x400, float:1.435E-42)
            char[] r6 = new char[r6]
            r2 = 0
            r0 = 0
        L18:
            int r3 = r6.length
            int r3 = r3 - r0
            int r3 = r1.read(r6, r0, r3)
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6, r2, r0)
            return r1
        L27:
            int r0 = r0 + r3
            int r3 = r6.length
            if (r0 < r3) goto L18
            int r3 = r6.length
            r4 = 262144(0x40000, float:3.67342E-40)
            if (r3 >= r4) goto L32
            int r3 = r3 + r3
            goto L33
        L32:
            int r3 = r3 + r4
        L33:
            char[] r3 = new char[r3]
            java.lang.System.arraycopy(r6, r2, r3, r2, r0)
            r6 = r3
            goto L18
        L3a:
            java.io.UnsupportedEncodingException r6 = new java.io.UnsupportedEncodingException
            r6.<init>(r0)
            throw r6
    }

    public java.lang.Object getContent(javax.activation.DataSource r4) throws java.io.IOException {
            r3 = this;
            com.sun.mail.dsn.MessageHeaders r0 = new com.sun.mail.dsn.MessageHeaders     // Catch: javax.mail.MessagingException -> La
            java.io.InputStream r4 = r4.getInputStream()     // Catch: javax.mail.MessagingException -> La
            r0.<init>(r4)     // Catch: javax.mail.MessagingException -> La
            return r0
        La:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception creating MessageHeaders: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r2, javax.activation.DataSource r3) throws java.io.IOException {
            r1 = this;
            javax.activation.ActivationDataFlavor r0 = com.sun.mail.dsn.text_rfc822headers.myDF
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            java.lang.Object r2 = r1.getContent(r3)
            return r2
        Ld:
            javax.activation.ActivationDataFlavor r0 = com.sun.mail.dsn.text_rfc822headers.myDFs
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.getStringContent(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r3 = this;
            r0 = 2
            myjava.awt.datatransfer.DataFlavor[] r0 = new myjava.awt.datatransfer.DataFlavor[r0]
            javax.activation.ActivationDataFlavor r1 = com.sun.mail.dsn.text_rfc822headers.myDF
            r2 = 0
            r0[r2] = r1
            javax.activation.ActivationDataFlavor r1 = com.sun.mail.dsn.text_rfc822headers.myDFs
            r2 = 1
            r0[r2] = r1
            return r0
    }

    public void writeTo(java.lang.Object r2, java.lang.String r3, java.io.OutputStream r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r2 instanceof com.sun.mail.dsn.MessageHeaders
            if (r0 == 0) goto L2a
            com.sun.mail.dsn.MessageHeaders r2 = (com.sun.mail.dsn.MessageHeaders) r2
            r2.writeTo(r4)     // Catch: javax.mail.MessagingException -> La
            return
        La:
            r2 = move-exception
            java.lang.Exception r3 = r2.getNextException()
            boolean r4 = r3 instanceof java.io.IOException
            if (r4 == 0) goto L16
            java.io.IOException r3 = (java.io.IOException) r3
            throw r3
        L16:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception writing headers: "
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L2a:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L4c
            java.lang.String r3 = r1.getCharset(r3)     // Catch: java.lang.IllegalArgumentException -> L45
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.IllegalArgumentException -> L46
            r0.<init>(r4, r3)     // Catch: java.lang.IllegalArgumentException -> L46
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r4 = r2.length()
            r0.write(r2, r3, r4)
            r0.flush()
            return
        L45:
            r3 = 0
        L46:
            java.io.UnsupportedEncodingException r2 = new java.io.UnsupportedEncodingException
            r2.<init>(r3)
            throw r2
        L4c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "\""
            r4.<init>(r0)
            javax.activation.ActivationDataFlavor r0 = com.sun.mail.dsn.text_rfc822headers.myDFs
            java.lang.String r0 = r0.getMimeType()
            r4.append(r0)
            java.lang.String r0 = "\" DataContentHandler requires String object, "
            r4.append(r0)
            java.lang.String r0 = "was given object of type "
            r4.append(r0)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }
}
