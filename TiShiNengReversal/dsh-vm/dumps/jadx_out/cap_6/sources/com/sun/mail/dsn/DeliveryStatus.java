package com.sun.mail.dsn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DeliveryStatus {
    private static boolean debug;
    protected javax.mail.internet.InternetHeaders messageDSN;
    protected javax.mail.internet.InternetHeaders[] recipientDSN;

    static {
            java.lang.String r0 = "mail.dsn.debug"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L15
            if (r0 == 0) goto L12
            java.lang.String r1 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.SecurityException -> L15
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.sun.mail.dsn.DeliveryStatus.debug = r0     // Catch: java.lang.SecurityException -> L15
        L15:
            return
    }

    public DeliveryStatus() throws javax.mail.MessagingException {
            r1 = this;
            r1.<init>()
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>()
            r1.messageDSN = r0
            r0 = 0
            javax.mail.internet.InternetHeaders[] r0 = new javax.mail.internet.InternetHeaders[r0]
            r1.recipientDSN = r0
            return
    }

    public DeliveryStatus(java.io.InputStream r4) throws javax.mail.MessagingException, java.io.IOException {
            r3 = this;
            r3.<init>()
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>(r4)
            r3.messageDSN = r0
            boolean r0 = com.sun.mail.dsn.DeliveryStatus.debug
            if (r0 == 0) goto L13
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L13:
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
        L18:
            int r1 = r4.available()     // Catch: java.io.EOFException -> L2e
            if (r1 > 0) goto L1f
            goto L3d
        L1f:
            javax.mail.internet.InternetHeaders r1 = new javax.mail.internet.InternetHeaders     // Catch: java.io.EOFException -> L2e
            r1.<init>(r4)     // Catch: java.io.EOFException -> L2e
            boolean r2 = com.sun.mail.dsn.DeliveryStatus.debug     // Catch: java.io.EOFException -> L2e
            if (r2 == 0) goto L30
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.io.EOFException -> L2e
            r2.getClass()     // Catch: java.io.EOFException -> L2e
            goto L30
        L2e:
            goto L34
        L30:
            r0.addElement(r1)     // Catch: java.io.EOFException -> L2e
            goto L18
        L34:
            boolean r4 = com.sun.mail.dsn.DeliveryStatus.debug
            if (r4 == 0) goto L3d
            java.io.PrintStream r4 = java.lang.System.out
            r4.getClass()
        L3d:
            boolean r4 = com.sun.mail.dsn.DeliveryStatus.debug
            if (r4 == 0) goto L49
            java.io.PrintStream r4 = java.lang.System.out
            r0.size()
            r4.getClass()
        L49:
            int r4 = r0.size()
            javax.mail.internet.InternetHeaders[] r4 = new javax.mail.internet.InternetHeaders[r4]
            r3.recipientDSN = r4
            r0.copyInto(r4)
            return
    }

    private static void writeInternetHeaders(javax.mail.internet.InternetHeaders r2, com.sun.mail.util.LineOutputStream r3) throws java.io.IOException {
            java.util.Enumeration r2 = r2.getAllHeaderLines()
        L4:
            boolean r0 = r2.hasMoreElements()     // Catch: javax.mail.MessagingException -> L15
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Object r0 = r2.nextElement()     // Catch: javax.mail.MessagingException -> L15
            java.lang.String r0 = (java.lang.String) r0     // Catch: javax.mail.MessagingException -> L15
            r3.writeln(r0)     // Catch: javax.mail.MessagingException -> L15
            goto L4
        L15:
            r2 = move-exception
            java.lang.Exception r3 = r2.getNextException()
            boolean r0 = r3 instanceof java.io.IOException
            if (r0 == 0) goto L21
            java.io.IOException r3 = (java.io.IOException) r3
            throw r3
        L21:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception writing headers: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public void addRecipientDSN(javax.mail.internet.InternetHeaders r5) {
            r4 = this;
            javax.mail.internet.InternetHeaders[] r0 = r4.recipientDSN
            int r1 = r0.length
            int r1 = r1 + 1
            javax.mail.internet.InternetHeaders[] r1 = new javax.mail.internet.InternetHeaders[r1]
            r2 = 0
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            r4.recipientDSN = r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r5
            return
    }

    public javax.mail.internet.InternetHeaders getMessageDSN() {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = r1.messageDSN
            return r0
    }

    public javax.mail.internet.InternetHeaders getRecipientDSN(int r2) {
            r1 = this;
            javax.mail.internet.InternetHeaders[] r0 = r1.recipientDSN
            r2 = r0[r2]
            return r2
    }

    public int getRecipientDSNCount() {
            r1 = this;
            javax.mail.internet.InternetHeaders[] r0 = r1.recipientDSN
            int r0 = r0.length
            return r0
    }

    public void setMessageDSN(javax.mail.internet.InternetHeaders r1) {
            r0 = this;
            r0.messageDSN = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeliveryStatus: Reporting-MTA="
            r0.<init>(r1)
            javax.mail.internet.InternetHeaders r1 = r4.messageDSN
            java.lang.String r2 = "Reporting-MTA"
            r3 = 0
            java.lang.String r1 = r1.getHeader(r2, r3)
            r0.append(r1)
            java.lang.String r1 = ", #Recipients="
            r0.append(r1)
            javax.mail.internet.InternetHeaders[] r1 = r4.recipientDSN
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(java.io.OutputStream r4) throws java.io.IOException, javax.mail.MessagingException {
            r3 = this;
            boolean r0 = r4 instanceof com.sun.mail.util.LineOutputStream
            if (r0 == 0) goto L7
            com.sun.mail.util.LineOutputStream r4 = (com.sun.mail.util.LineOutputStream) r4
            goto Ld
        L7:
            com.sun.mail.util.LineOutputStream r0 = new com.sun.mail.util.LineOutputStream
            r0.<init>(r4)
            r4 = r0
        Ld:
            javax.mail.internet.InternetHeaders r0 = r3.messageDSN
            writeInternetHeaders(r0, r4)
            r4.writeln()
            r0 = 0
        L16:
            javax.mail.internet.InternetHeaders[] r1 = r3.recipientDSN
            int r2 = r1.length
            if (r0 < r2) goto L1c
            return
        L1c:
            r1 = r1[r0]
            writeInternetHeaders(r1, r4)
            r4.writeln()
            int r0 = r0 + 1
            goto L16
    }
}
