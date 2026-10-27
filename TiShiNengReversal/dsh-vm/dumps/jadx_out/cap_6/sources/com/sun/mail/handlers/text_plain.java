package com.sun.mail.handlers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class text_plain implements javax.activation.DataContentHandler {
    private static javax.activation.ActivationDataFlavor myDF;

    static {
            javax.activation.ActivationDataFlavor r0 = new javax.activation.ActivationDataFlavor
            java.lang.String r1 = "text/plain"
            java.lang.String r2 = "Text String"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0.<init>(r3, r1, r2)
            com.sun.mail.handlers.text_plain.myDF = r0
            return
    }

    public text_plain() {
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

    public java.lang.Object getContent(javax.activation.DataSource r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.getContentType()     // Catch: java.lang.IllegalArgumentException -> L43
            java.lang.String r0 = r5.getCharset(r1)     // Catch: java.lang.IllegalArgumentException -> L43
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.IllegalArgumentException -> L43
            java.io.InputStream r6 = r6.getInputStream()     // Catch: java.lang.IllegalArgumentException -> L43
            r1.<init>(r6, r0)     // Catch: java.lang.IllegalArgumentException -> L43
            r6 = 1024(0x400, float:1.435E-42)
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            r2 = 0
        L18:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L2a
            int r3 = r3 - r2
            int r3 = r1.read(r6, r2, r3)     // Catch: java.lang.Throwable -> L2a
            r4 = -1
            if (r3 != r4) goto L2c
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r6, r0, r2)     // Catch: java.lang.Throwable -> L2a
            r1.close()     // Catch: java.io.IOException -> L29
        L29:
            return r3
        L2a:
            r6 = move-exception
            goto L3f
        L2c:
            int r2 = r2 + r3
            int r3 = r6.length     // Catch: java.lang.Throwable -> L2a
            if (r2 < r3) goto L18
            int r3 = r6.length     // Catch: java.lang.Throwable -> L2a
            r4 = 262144(0x40000, float:3.67342E-40)
            if (r3 >= r4) goto L37
            int r3 = r3 + r3
            goto L38
        L37:
            int r3 = r3 + r4
        L38:
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L2a
            java.lang.System.arraycopy(r6, r0, r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            r6 = r3
            goto L18
        L3f:
            r1.close()     // Catch: java.io.IOException -> L42
        L42:
            throw r6
        L43:
            java.io.UnsupportedEncodingException r6 = new java.io.UnsupportedEncodingException
            r6.<init>(r0)
            throw r6
    }

    protected javax.activation.ActivationDataFlavor getDF() {
            r1 = this;
            javax.activation.ActivationDataFlavor r0 = com.sun.mail.handlers.text_plain.myDF
            return r0
    }

    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r2, javax.activation.DataSource r3) throws java.io.IOException {
            r1 = this;
            javax.activation.ActivationDataFlavor r0 = r1.getDF()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r1.getContent(r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r3 = this;
            javax.activation.ActivationDataFlavor r0 = r3.getDF()
            r1 = 1
            myjava.awt.datatransfer.DataFlavor[] r1 = new myjava.awt.datatransfer.DataFlavor[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    public void writeTo(java.lang.Object r2, java.lang.String r3, java.io.OutputStream r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r3 = r1.getCharset(r3)     // Catch: java.lang.IllegalArgumentException -> L1b
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.IllegalArgumentException -> L1c
            r0.<init>(r4, r3)     // Catch: java.lang.IllegalArgumentException -> L1c
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r4 = r2.length()
            r0.write(r2, r3, r4)
            r0.flush()
            return
        L1b:
            r3 = 0
        L1c:
            java.io.UnsupportedEncodingException r2 = new java.io.UnsupportedEncodingException
            r2.<init>(r3)
            throw r2
        L22:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "\""
            r4.<init>(r0)
            javax.activation.ActivationDataFlavor r0 = r1.getDF()
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
