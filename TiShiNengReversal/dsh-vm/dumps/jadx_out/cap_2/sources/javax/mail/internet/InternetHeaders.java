package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class InternetHeaders {
    protected java.util.List headers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static final class InternetHeader extends javax.mail.Header {
        java.lang.String line;

        public InternetHeader(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = ""
                r2.<init>(r0, r0)
                r0 = 58
                int r0 = r3.indexOf(r0)
                if (r0 >= 0) goto L14
                java.lang.String r0 = r3.trim()
                r2.name = r0
                goto L1f
            L14:
                r1 = 0
                java.lang.String r0 = r3.substring(r1, r0)
                java.lang.String r0 = r0.trim()
                r2.name = r0
            L1f:
                r2.line = r3
                return
        }

        public InternetHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r2, r0)
                if (r3 == 0) goto L1f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.<init>(r2)
                java.lang.String r2 = ": "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                r1.line = r2
                return
            L1f:
                r2 = 0
                r1.line = r2
                return
        }

        @Override // javax.mail.Header
        public java.lang.String getValue() {
                r3 = this;
                java.lang.String r0 = r3.line
                r1 = 58
                int r0 = r0.indexOf(r1)
                if (r0 >= 0) goto Ld
                java.lang.String r0 = r3.line
                return r0
            Ld:
                int r0 = r0 + 1
                java.lang.String r1 = r3.line
                int r1 = r1.length()
                if (r0 < r1) goto L18
                goto L2e
            L18:
                java.lang.String r1 = r3.line
                char r1 = r1.charAt(r0)
                r2 = 32
                if (r1 == r2) goto Ld
                r2 = 9
                if (r1 == r2) goto Ld
                r2 = 13
                if (r1 == r2) goto Ld
                r2 = 10
                if (r1 == r2) goto Ld
            L2e:
                java.lang.String r1 = r3.line
                java.lang.String r0 = r1.substring(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class matchEnum implements java.util.Enumeration {
        private java.util.Iterator e;
        private boolean match;
        private java.lang.String[] names;
        private javax.mail.internet.InternetHeaders.InternetHeader next_header;
        private boolean want_line;

        matchEnum(java.util.List r1, java.lang.String[] r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>()
                java.util.Iterator r1 = r1.iterator()
                r0.e = r1
                r0.names = r2
                r0.match = r3
                r0.want_line = r4
                r1 = 0
                r0.next_header = r1
                return
        }

        private javax.mail.internet.InternetHeaders.InternetHeader nextMatch() {
                r4 = this;
            L0:
                java.util.Iterator r0 = r4.e
                boolean r0 = r0.hasNext()
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Iterator r0 = r4.e
                java.lang.Object r0 = r0.next()
                javax.mail.internet.InternetHeaders$InternetHeader r0 = (javax.mail.internet.InternetHeaders.InternetHeader) r0
                java.lang.String r2 = r0.line
                if (r2 != 0) goto L17
                goto L0
            L17:
                java.lang.String[] r2 = r4.names
                if (r2 != 0) goto L20
                boolean r2 = r4.match
                if (r2 == 0) goto L3b
                return r1
            L20:
                r1 = 0
            L21:
                java.lang.String[] r2 = r4.names
                int r3 = r2.length
                if (r1 < r3) goto L2b
                boolean r1 = r4.match
                if (r1 != 0) goto L0
                goto L3b
            L2b:
                r2 = r2[r1]
                java.lang.String r3 = r0.getName()
                boolean r2 = r2.equalsIgnoreCase(r3)
                if (r2 == 0) goto L3c
                boolean r1 = r4.match
                if (r1 == 0) goto L0
            L3b:
                return r0
            L3c:
                int r1 = r1 + 1
                goto L21
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r1 = this;
                javax.mail.internet.InternetHeaders$InternetHeader r0 = r1.next_header
                if (r0 != 0) goto La
                javax.mail.internet.InternetHeaders$InternetHeader r0 = r1.nextMatch()
                r1.next_header = r0
            La:
                javax.mail.internet.InternetHeaders$InternetHeader r0 = r1.next_header
                if (r0 == 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        @Override // java.util.Enumeration
        public java.lang.Object nextElement() {
                r3 = this;
                javax.mail.internet.InternetHeaders$InternetHeader r0 = r3.next_header
                if (r0 != 0) goto La
                javax.mail.internet.InternetHeaders$InternetHeader r0 = r3.nextMatch()
                r3.next_header = r0
            La:
                javax.mail.internet.InternetHeaders$InternetHeader r0 = r3.next_header
                if (r0 == 0) goto L26
                r1 = 0
                r3.next_header = r1
                boolean r1 = r3.want_line
                if (r1 == 0) goto L18
                java.lang.String r0 = r0.line
                return r0
            L18:
                javax.mail.Header r1 = new javax.mail.Header
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = r0.getValue()
                r1.<init>(r2, r0)
                return r1
            L26:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "No more headers"
                r0.<init>(r1)
                throw r0
        }
    }

    public InternetHeaders() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 40
            r0.<init>(r1)
            r4.headers = r0
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Return-Path"
            r3 = 0
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Received"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-Date"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-From"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-Sender"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-To"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-Cc"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-Bcc"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Resent-Message-Id"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Date"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "From"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Sender"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Reply-To"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "To"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Cc"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Bcc"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Message-Id"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "In-Reply-To"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "References"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Subject"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Comments"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Keywords"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Errors-To"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "MIME-Version"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Content-Type"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Content-Transfer-Encoding"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Content-MD5"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = ":"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Content-Length"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List r0 = r4.headers
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            java.lang.String r2 = "Status"
            r1.<init>(r2, r3)
            r0.add(r1)
            return
    }

    public InternetHeaders(java.io.InputStream r3) throws javax.mail.MessagingException {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 40
            r0.<init>(r1)
            r2.headers = r0
            r2.load(r3)
            return
    }

    public void addHeader(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.util.List r0 = r6.headers
            int r0 = r0.size()
            java.lang.String r1 = "Received"
            boolean r1 = r7.equalsIgnoreCase(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            java.lang.String r1 = "Return-Path"
            boolean r1 = r7.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1a
            r1 = 0
            goto L1b
        L1a:
            r1 = 1
        L1b:
            if (r1 == 0) goto L1e
            r0 = 0
        L1e:
            java.util.List r2 = r6.headers
            int r2 = r2.size()
            int r2 = r2 - r3
        L25:
            if (r2 >= 0) goto L32
            java.util.List r1 = r6.headers
            javax.mail.internet.InternetHeaders$InternetHeader r2 = new javax.mail.internet.InternetHeaders$InternetHeader
            r2.<init>(r7, r8)
            r1.add(r0, r2)
            return
        L32:
            java.util.List r4 = r6.headers
            java.lang.Object r4 = r4.get(r2)
            javax.mail.internet.InternetHeaders$InternetHeader r4 = (javax.mail.internet.InternetHeaders.InternetHeader) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = r7.equalsIgnoreCase(r5)
            if (r5 == 0) goto L54
            if (r1 == 0) goto L48
            r0 = r2
            goto L54
        L48:
            java.util.List r0 = r6.headers
            int r2 = r2 + r3
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader
            r1.<init>(r7, r8)
            r0.add(r2, r1)
            return
        L54:
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ":"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r0 = r2
        L61:
            int r2 = r2 + (-1)
            goto L25
    }

    public void addHeaderLine(java.lang.String r4) {
            r3 = this;
            r0 = 0
            char r0 = r4.charAt(r0)     // Catch: java.lang.Throwable -> L40
            r1 = 32
            if (r0 == r1) goto L19
            r1 = 9
            if (r0 != r1) goto Le
            goto L19
        Le:
            java.util.List r0 = r3.headers     // Catch: java.lang.Throwable -> L40
            javax.mail.internet.InternetHeaders$InternetHeader r1 = new javax.mail.internet.InternetHeaders$InternetHeader     // Catch: java.lang.Throwable -> L40
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L40
            r0.add(r1)     // Catch: java.lang.Throwable -> L40
            return
        L19:
            java.util.List r0 = r3.headers     // Catch: java.lang.Throwable -> L40
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L40
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L40
            javax.mail.internet.InternetHeaders$InternetHeader r0 = (javax.mail.internet.InternetHeaders.InternetHeader) r0     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r0.line     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "\r\n"
            r2.append(r1)     // Catch: java.lang.Throwable -> L40
            r2.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L40
            r0.line = r4     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }

    public java.util.Enumeration getAllHeaderLines() {
            r1 = this;
            r0 = 0
            java.util.Enumeration r0 = r1.getNonMatchingHeaderLines(r0)
            return r0
    }

    public java.util.Enumeration getAllHeaders() {
            r4 = this;
            javax.mail.internet.InternetHeaders$matchEnum r0 = new javax.mail.internet.InternetHeaders$matchEnum
            java.util.List r1 = r4.headers
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            return r0
    }

    public java.lang.String getHeader(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.String[] r4 = r3.getHeader(r4)
            if (r4 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L2a
            if (r5 != 0) goto L10
            goto L2a
        L10:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r4[r1]
            r0.<init>(r1)
        L17:
            int r1 = r4.length
            if (r2 < r1) goto L1f
            java.lang.String r4 = r0.toString()
            return r4
        L1f:
            r0.append(r5)
            r1 = r4[r2]
            r0.append(r1)
            int r2 = r2 + 1
            goto L17
        L2a:
            r4 = r4[r1]
            return r4
    }

    public java.lang.String[] getHeader(java.lang.String r5) {
            r4 = this;
            java.util.List r0 = r4.headers
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L26
            int r5 = r1.size()
            if (r5 != 0) goto L19
            r5 = 0
            return r5
        L19:
            int r5 = r1.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r1.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            return r5
        L26:
            java.lang.Object r2 = r0.next()
            javax.mail.internet.InternetHeaders$InternetHeader r2 = (javax.mail.internet.InternetHeaders.InternetHeader) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto Lb
            java.lang.String r3 = r2.line
            if (r3 == 0) goto Lb
            java.lang.String r2 = r2.getValue()
            r1.add(r2)
            goto Lb
    }

    public java.util.Enumeration getMatchingHeaderLines(java.lang.String[] r4) {
            r3 = this;
            javax.mail.internet.InternetHeaders$matchEnum r0 = new javax.mail.internet.InternetHeaders$matchEnum
            java.util.List r1 = r3.headers
            r2 = 1
            r0.<init>(r1, r4, r2, r2)
            return r0
    }

    public java.util.Enumeration getMatchingHeaders(java.lang.String[] r5) {
            r4 = this;
            javax.mail.internet.InternetHeaders$matchEnum r0 = new javax.mail.internet.InternetHeaders$matchEnum
            java.util.List r1 = r4.headers
            r2 = 1
            r3 = 0
            r0.<init>(r1, r5, r2, r3)
            return r0
    }

    public java.util.Enumeration getNonMatchingHeaderLines(java.lang.String[] r5) {
            r4 = this;
            javax.mail.internet.InternetHeaders$matchEnum r0 = new javax.mail.internet.InternetHeaders$matchEnum
            java.util.List r1 = r4.headers
            r2 = 0
            r3 = 1
            r0.<init>(r1, r5, r2, r3)
            return r0
    }

    public java.util.Enumeration getNonMatchingHeaders(java.lang.String[] r4) {
            r3 = this;
            javax.mail.internet.InternetHeaders$matchEnum r0 = new javax.mail.internet.InternetHeaders$matchEnum
            java.util.List r1 = r3.headers
            r2 = 0
            r0.<init>(r1, r4, r2, r2)
            return r0
    }

    public void load(java.io.InputStream r6) throws javax.mail.MessagingException {
            r5 = this;
            com.sun.mail.util.LineInputStream r0 = new com.sun.mail.util.LineInputStream
            r0.<init>(r6)
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            r1 = 0
            r2 = r1
        Lc:
            java.lang.String r3 = r0.readLine()     // Catch: java.io.IOException -> L23
            if (r3 == 0) goto L34
            java.lang.String r4 = " "
            boolean r4 = r3.startsWith(r4)     // Catch: java.io.IOException -> L23
            if (r4 != 0) goto L25
            java.lang.String r4 = "\t"
            boolean r4 = r3.startsWith(r4)     // Catch: java.io.IOException -> L23
            if (r4 == 0) goto L34
            goto L25
        L23:
            r6 = move-exception
            goto L55
        L25:
            if (r2 == 0) goto L2b
            r6.append(r2)     // Catch: java.io.IOException -> L23
            r2 = r1
        L2b:
            java.lang.String r4 = "\r\n"
            r6.append(r4)     // Catch: java.io.IOException -> L23
            r6.append(r3)     // Catch: java.io.IOException -> L23
            goto L4c
        L34:
            if (r2 == 0) goto L3a
            r5.addHeaderLine(r2)     // Catch: java.io.IOException -> L23
            goto L4b
        L3a:
            int r2 = r6.length()     // Catch: java.io.IOException -> L23
            if (r2 <= 0) goto L4b
            java.lang.String r2 = r6.toString()     // Catch: java.io.IOException -> L23
            r5.addHeaderLine(r2)     // Catch: java.io.IOException -> L23
            r2 = 0
            r6.setLength(r2)     // Catch: java.io.IOException -> L23
        L4b:
            r2 = r3
        L4c:
            if (r3 == 0) goto L54
            int r3 = r3.length()     // Catch: java.io.IOException -> L23
            if (r3 > 0) goto Lc
        L54:
            return
        L55:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "Error in input stream"
            r0.<init>(r1, r6)
            throw r0
    }

    public void removeHeader(java.lang.String r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.List r1 = r3.headers
            int r1 = r1.size()
            if (r0 < r1) goto La
            return
        La:
            java.util.List r1 = r3.headers
            java.lang.Object r1 = r1.get(r0)
            javax.mail.internet.InternetHeaders$InternetHeader r1 = (javax.mail.internet.InternetHeaders.InternetHeader) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1f
            r2 = 0
            r1.line = r2
        L1f:
            int r0 = r0 + 1
            goto L1
    }

    public void setHeader(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            java.util.List r3 = r7.headers
            int r3 = r3.size()
            if (r1 < r3) goto L11
            if (r2 != 0) goto L10
            r7.addHeader(r8, r9)
        L10:
            return
        L11:
            java.util.List r3 = r7.headers
            java.lang.Object r3 = r3.get(r1)
            javax.mail.internet.InternetHeaders$InternetHeader r3 = (javax.mail.internet.InternetHeaders.InternetHeader) r3
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equalsIgnoreCase(r4)
            r5 = 1
            if (r4 == 0) goto L6e
            if (r2 != 0) goto L67
            java.lang.String r2 = r3.line
            if (r2 == 0) goto L52
            r4 = 58
            int r2 = r2.indexOf(r4)
            if (r2 < 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = r3.line
            int r2 = r2 + 1
            java.lang.String r2 = r6.substring(r0, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.<init>(r2)
            java.lang.String r2 = " "
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = r4.toString()
            r3.line = r2
            goto L65
        L52:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r3.line = r2
        L65:
            r2 = 1
            goto L6e
        L67:
            java.util.List r3 = r7.headers
            r3.remove(r1)
            int r1 = r1 + (-1)
        L6e:
            int r1 = r1 + r5
            goto L3
    }
}
