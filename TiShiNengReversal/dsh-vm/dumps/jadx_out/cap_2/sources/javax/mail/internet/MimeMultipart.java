package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimeMultipart extends javax.mail.Multipart {
    private static boolean bmparse = true;
    private static boolean ignoreMissingBoundaryParameter = true;
    private static boolean ignoreMissingEndBoundary = true;
    private boolean complete;
    protected javax.activation.DataSource ds;
    protected boolean parsed;
    private java.lang.String preamble;

    static {
            java.lang.String r0 = "mail.mime.multipart.ignoremissingendboundary"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L3b
            r1 = 1
            r2 = 0
            java.lang.String r3 = "false"
            if (r0 == 0) goto L14
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L3b
            if (r0 == 0) goto L14
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            javax.mail.internet.MimeMultipart.ignoreMissingEndBoundary = r0     // Catch: java.lang.SecurityException -> L3b
            java.lang.String r0 = "mail.mime.multipart.ignoremissingboundaryparameter"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L3b
            if (r0 == 0) goto L27
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L3b
            if (r0 == 0) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            javax.mail.internet.MimeMultipart.ignoreMissingBoundaryParameter = r0     // Catch: java.lang.SecurityException -> L3b
            java.lang.String r0 = "mail.mime.multipart.bmparse"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L3b
            if (r0 == 0) goto L39
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L3b
            if (r0 == 0) goto L39
            r1 = 0
        L39:
            javax.mail.internet.MimeMultipart.bmparse = r1     // Catch: java.lang.SecurityException -> L3b
        L3b:
            return
    }

    public MimeMultipart() {
            r1 = this;
            java.lang.String r0 = "mixed"
            r1.<init>(r0)
            return
    }

    public MimeMultipart(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.ds = r0
            r1 = 1
            r4.parsed = r1
            r4.complete = r1
            r4.preamble = r0
            java.lang.String r1 = javax.mail.internet.UniqueValue.getUniqueBoundaryValue()
            javax.mail.internet.ContentType r2 = new javax.mail.internet.ContentType
            java.lang.String r3 = "multipart"
            r2.<init>(r3, r5, r0)
            java.lang.String r5 = "boundary"
            r2.setParameter(r5, r1)
            java.lang.String r5 = r2.toString()
            r4.contentType = r5
            return
    }

    public MimeMultipart(javax.activation.DataSource r3) throws javax.mail.MessagingException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.ds = r0
            r1 = 1
            r2.parsed = r1
            r2.complete = r1
            r2.preamble = r0
            boolean r0 = r3 instanceof javax.mail.MessageAware
            if (r0 == 0) goto L1f
            r0 = r3
            javax.mail.MessageAware r0 = (javax.mail.MessageAware) r0
            javax.mail.MessageContext r0 = r0.getMessageContext()
            javax.mail.Part r0 = r0.getPart()
            r2.setParent(r0)
        L1f:
            boolean r0 = r3 instanceof javax.mail.MultipartDataSource
            if (r0 == 0) goto L29
            javax.mail.MultipartDataSource r3 = (javax.mail.MultipartDataSource) r3
            r2.setMultipartDataSource(r3)
            return
        L29:
            r0 = 0
            r2.parsed = r0
            r2.ds = r3
            java.lang.String r3 = r3.getContentType()
            r2.contentType = r3
            return
    }

    private synchronized void parsebm() throws javax.mail.MessagingException {
            r32 = this;
            r1 = r32
            monitor-enter(r32)
            boolean r0 = r1.parsed     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L9
            monitor-exit(r32)
            return
        L9:
            javax.activation.DataSource r0 = r1.ds     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            boolean r2 = r0 instanceof java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            if (r2 != 0) goto L27
            boolean r2 = r0 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            if (r2 != 0) goto L27
            boolean r2 = r0 instanceof javax.mail.internet.SharedInputStream     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            if (r2 != 0) goto L27
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            goto L28
        L21:
            r0 = move-exception
            goto L37f
        L24:
            r0 = move-exception
            goto L377
        L27:
            r2 = r0
        L28:
            boolean r0 = r2 instanceof javax.mail.internet.SharedInputStream     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L31
            r0 = r2
            javax.mail.internet.SharedInputStream r0 = (javax.mail.internet.SharedInputStream) r0     // Catch: java.lang.Throwable -> L21
            goto L32
        L31:
            r0 = 0
        L32:
            javax.mail.internet.ContentType r4 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r1.contentType     // Catch: java.lang.Throwable -> L21
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = "boundary"
            java.lang.String r4 = r4.getParameter(r5)     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "--"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L21
            r5.append(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L21
            goto L55
        L50:
            boolean r4 = javax.mail.internet.MimeMultipart.ignoreMissingBoundaryParameter     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L36f
            r4 = 0
        L55:
            com.sun.mail.util.LineInputStream r5 = new com.sun.mail.util.LineInputStream     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r6 = 0
            r7 = 0
        L5c:
            java.lang.String r8 = r5.readLine()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r9 = 9
            r10 = 32
            r12 = 0
            r13 = 1
            if (r8 != 0) goto L69
            goto L9d
        L69:
            int r14 = r8.length()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r14 = r14 - r13
        L6e:
            if (r14 >= 0) goto L71
            goto L79
        L71:
            char r15 = r8.charAt(r14)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r15 == r10) goto L349
            if (r15 == r9) goto L349
        L79:
            int r14 = r14 + 1
            java.lang.String r8 = r8.substring(r12, r14)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r4 == 0) goto L94
            boolean r14 = r8.equals(r4)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r14 == 0) goto L88
            goto L9d
        L88:
            r23 = r0
            r29 = r5
            goto L318
        L8e:
            r0 = move-exception
            goto L36b
        L91:
            r0 = move-exception
            goto L363
        L94:
            java.lang.String r14 = "--"
            boolean r14 = r8.startsWith(r14)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r14 == 0) goto L88
            r4 = r8
        L9d:
            if (r8 == 0) goto L310
            if (r6 == 0) goto La7
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r1.preamble = r6     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        La7:
            byte[] r4 = com.sun.mail.util.ASCIIUtility.getBytes(r4)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r6 = r4.length     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = 256(0x100, float:3.59E-43)
            int[] r7 = new int[r7]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r8 = 0
        Lb1:
            if (r8 < r6) goto L2f0
            int[] r8 = new int[r6]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r14 = r6
        Lb6:
            if (r14 > 0) goto L2b9
            int r14 = r6 + (-1)
            r8[r14] = r13     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r15 = 0
            r17 = r15
            r19 = 0
        Lc2:
            if (r19 == 0) goto Lc5
            goto Ldf
        Lc5:
            if (r0 == 0) goto Lf3
            long r15 = r0.getPosition()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        Lcb:
            java.lang.String r20 = r5.readLine()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r20 == 0) goto Ld7
            int r21 = r20.length()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r21 > 0) goto Lcb
        Ld7:
            if (r20 != 0) goto Lee
            boolean r0 = javax.mail.internet.MimeMultipart.ignoreMissingEndBoundary     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r0 == 0) goto Le6
            r1.complete = r12     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        Ldf:
            r2.close()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> Le2
        Le2:
            r1.parsed = r13     // Catch: java.lang.Throwable -> L21
            monitor-exit(r32)
            return
        Le6:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            java.lang.String r3 = "missing multipart end boundary"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            throw r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        Lee:
            r22 = r4
            r3 = r15
            r15 = 0
            goto Lfc
        Lf3:
            javax.mail.internet.InternetHeaders r20 = r1.createInternetHeaders(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r22 = r4
            r3 = r15
            r15 = r20
        Lfc:
            boolean r16 = r2.markSupported()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r16 == 0) goto L2b1
            if (r0 != 0) goto L10c
            java.io.ByteArrayOutputStream r16 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r16.<init>()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r23 = r16
            goto L112
        L10c:
            long r17 = r0.getPosition()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r23 = 0
        L112:
            byte[] r9 = new byte[r6]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            byte[] r10 = new byte[r6]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r13 = 0
            r25 = 1
        L119:
            int r11 = r6 + 1004
            r2.mark(r11)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r11 = readFully(r2, r9, r12, r6)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r11 >= r6) goto L145
            boolean r19 = javax.mail.internet.MimeMultipart.ignoreMissingEndBoundary     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r19 == 0) goto L13d
            if (r0 == 0) goto L12e
            long r17 = r0.getPosition()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L12e:
            r1.complete = r12     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r29 = r5
            r12 = r7
            r30 = r8
            r7 = r17
            r19 = 1
            r31 = 0
            goto L1d4
        L13d:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            java.lang.String r3 = "missing multipart end boundary"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            throw r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L145:
            r27 = r14
        L147:
            if (r27 >= 0) goto L14c
            r29 = r5
            goto L154
        L14c:
            r12 = r9[r27]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r29 = r5
            r5 = r22[r27]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r12 == r5) goto L29d
        L154:
            if (r27 >= 0) goto L232
            r5 = 13
            if (r25 != 0) goto L178
            int r27 = r13 + (-1)
            r12 = r10[r27]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r12 == r5) goto L165
            r5 = 10
            if (r12 != r5) goto L178
            goto L167
        L165:
            r5 = 10
        L167:
            if (r12 != r5) goto L176
            r5 = 2
            if (r13 < r5) goto L176
            int r5 = r13 + (-2)
            r5 = r10[r5]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r12 = 13
            if (r5 != r12) goto L176
            r5 = 2
            goto L179
        L176:
            r5 = 1
            goto L179
        L178:
            r5 = 0
        L179:
            if (r25 != 0) goto L187
            if (r5 <= 0) goto L17e
            goto L187
        L17e:
            r12 = r7
            r30 = r8
        L181:
            r5 = r23
            r23 = r0
            goto L21b
        L187:
            if (r0 == 0) goto L197
            long r17 = r0.getPosition()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r12 = r7
            r30 = r8
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            long r17 = r17 - r7
            long r7 = (long) r5     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            long r17 = r17 - r7
            goto L19a
        L197:
            r12 = r7
            r30 = r8
        L19a:
            int r7 = r2.read()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r8 = 45
            if (r7 != r8) goto L1b2
            r31 = r5
            int r5 = r2.read()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r5 != r8) goto L1b4
            r5 = 1
            r1.complete = r5     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = r17
            r19 = 1
            goto L1d4
        L1b2:
            r31 = r5
        L1b4:
            r5 = 32
            if (r7 == r5) goto L21f
            r8 = 9
            if (r7 == r8) goto L21f
            r5 = 10
            if (r7 != r5) goto L1c1
            goto L1d2
        L1c1:
            r8 = 13
            if (r7 != r8) goto L181
            r7 = 1
            r2.mark(r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r7 = r2.read()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r7 == r5) goto L1d2
            r2.reset()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L1d2:
            r7 = r17
        L1d4:
            if (r0 == 0) goto L1e1
            java.io.InputStream r5 = r0.newStream(r3, r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            javax.mail.internet.MimeBodyPart r5 = r1.createMimeBodyPart(r5)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r23 = r0
            goto L204
        L1e1:
            int r13 = r13 - r31
            if (r13 <= 0) goto L1ee
            r5 = r23
            r23 = r0
            r0 = 0
            r5.write(r10, r0, r13)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            goto L1f2
        L1ee:
            r5 = r23
            r23 = r0
        L1f2:
            boolean r0 = r1.complete     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r0 != 0) goto L1fc
            if (r11 <= 0) goto L1fc
            r0 = 0
            r5.write(r9, r0, r11)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L1fc:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            javax.mail.internet.MimeBodyPart r5 = r1.createMimeBodyPart(r15, r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L204:
            super.addBodyPart(r5)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r15 = r3
            r17 = r7
            r7 = r12
            r4 = r22
            r0 = r23
            r5 = r29
            r8 = r30
            r9 = 9
            r10 = 32
            r12 = 0
            r13 = 1
            goto Lc2
        L21b:
            r0 = r5
            r27 = 0
            goto L23a
        L21f:
            r5 = r23
            r23 = r0
            r0 = r5
            r5 = 10
            r8 = 13
            int r7 = r2.read()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r5 = r23
            r23 = r0
            r0 = r5
            goto L1b4
        L232:
            r12 = r23
            r23 = r0
            r0 = r12
            r12 = r7
            r30 = r8
        L23a:
            int r5 = r27 + 1
            r7 = r9[r27]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r12[r7]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r5 = r5 - r7
            r7 = r30[r27]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r5 = java.lang.Math.max(r5, r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = 2
            if (r5 >= r7) goto L278
            if (r23 != 0) goto L257
            r5 = 1
            if (r13 <= r5) goto L257
            int r5 = r13 + (-1)
            r7 = 0
            r0.write(r10, r7, r5)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L257:
            r2.reset()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = 1
            r1.skipFully(r2, r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = 1
            if (r13 < r7) goto L270
            int r13 = r13 + (-1)
            r5 = r10[r13]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r28 = 0
            r10[r28] = r5     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r5 = r9[r28]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r10[r7] = r5     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r13 = 2
            goto L28e
        L270:
            r28 = 0
            r5 = r9[r28]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r10[r28] = r5     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r13 = 1
            goto L28e
        L278:
            r7 = 1
            if (r13 <= 0) goto L282
            if (r23 != 0) goto L282
            r8 = 0
            r0.write(r10, r8, r13)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            goto L283
        L282:
            r8 = 0
        L283:
            r2.reset()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            long r7 = (long) r5     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r1.skipFully(r2, r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r13 = r10
            r10 = r9
            r9 = r13
            r13 = r5
        L28e:
            r5 = r23
            r23 = r0
            r0 = r5
            r7 = r12
            r5 = r29
            r8 = r30
            r12 = 0
            r25 = 0
            goto L119
        L29d:
            r12 = r23
            r23 = r0
            r0 = r12
            r12 = r7
            r30 = r8
            int r27 = r27 + (-1)
            r5 = r23
            r23 = r0
            r0 = r5
            r5 = r29
            r12 = 0
            goto L147
        L2b1:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            java.lang.String r3 = "Stream doesn't support mark"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            throw r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L2b9:
            r23 = r0
            r22 = r4
            r29 = r5
            r12 = r7
            r30 = r8
            int r0 = r6 + (-1)
        L2c4:
            if (r0 >= r14) goto L2ce
        L2c6:
            if (r0 > 0) goto L2c9
            goto L2dd
        L2c9:
            int r0 = r0 + (-1)
            r30[r0] = r14     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            goto L2c6
        L2ce:
            r3 = r22[r0]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r4 = r0 - r14
            r4 = r22[r4]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r3 != r4) goto L2dd
            int r3 = r0 + (-1)
            r30[r3] = r14     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r0 = r0 + (-1)
            goto L2c4
        L2dd:
            int r14 = r14 + (-1)
            r7 = r12
            r4 = r22
            r0 = r23
            r5 = r29
            r8 = r30
            r9 = 9
            r10 = 32
            r12 = 0
            r13 = 1
            goto Lb6
        L2f0:
            r23 = r0
            r22 = r4
            r29 = r5
            r12 = r7
            r16 = 9
            r28 = 0
            r0 = r22[r8]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r8 = r8 + 1
            r12[r0] = r8     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r7 = r12
            r4 = r22
            r0 = r23
            r5 = r29
            r9 = 9
            r10 = 32
            r12 = 0
            r13 = 1
            goto Lb1
        L310:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            java.lang.String r3 = "Missing start boundary"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            throw r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L318:
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            if (r0 <= 0) goto L343
            if (r7 != 0) goto L32d
            java.lang.String r0 = "line.separator"
            java.lang.String r3 = "\n"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91 java.lang.SecurityException -> L32a
        L328:
            r7 = r0
            goto L32d
        L32a:
            java.lang.String r0 = "\n"
            goto L328
        L32d:
            if (r6 != 0) goto L33d
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r26 = 2
            int r3 = r3 + 2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r6 = r0
        L33d:
            r6.append(r8)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r6.append(r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
        L343:
            r0 = r23
            r5 = r29
            goto L5c
        L349:
            r23 = r0
            r29 = r5
            r16 = 9
            r24 = 1
            r26 = 2
            r28 = 0
            int r14 = r14 + (-1)
            r0 = r23
            r5 = r29
            r9 = 9
            r10 = 32
            r12 = 0
            r13 = 1
            goto L6e
        L363:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "IO Error"
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L8e
            throw r3     // Catch: java.lang.Throwable -> L8e
        L36b:
            r2.close()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L36e
        L36e:
            throw r0     // Catch: java.lang.Throwable -> L21
        L36f:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "Missing boundary parameter"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L377:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "No inputstream from datasource"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L21
            throw r2     // Catch: java.lang.Throwable -> L21
        L37f:
            monitor-exit(r32)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    private static int readFully(java.io.InputStream r2, byte[] r3, int r4, int r5) throws java.io.IOException {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            if (r5 > 0) goto L7
            goto Ld
        L7:
            int r1 = r2.read(r3, r4, r5)
            if (r1 > 0) goto L12
        Ld:
            if (r0 <= 0) goto L10
            return r0
        L10:
            r2 = -1
            return r2
        L12:
            int r4 = r4 + r1
            int r0 = r0 + r1
            int r5 = r5 - r1
            goto L4
    }

    private void skipFully(java.io.InputStream r6, long r7) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return
        L7:
            long r2 = r6.skip(r7)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L11
            long r7 = r7 - r2
            goto L0
        L11:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "can't skip"
            r6.<init>(r7)
            throw r6
    }

    @Override // javax.mail.Multipart
    public synchronized void addBodyPart(javax.mail.BodyPart r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.parse()     // Catch: java.lang.Throwable -> L9
            super.addBodyPart(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // javax.mail.Multipart
    public synchronized void addBodyPart(javax.mail.BodyPart r1, int r2) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.parse()     // Catch: java.lang.Throwable -> L9
            super.addBodyPart(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    protected javax.mail.internet.InternetHeaders createInternetHeaders(java.io.InputStream r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>(r2)
            return r0
    }

    protected javax.mail.internet.MimeBodyPart createMimeBodyPart(java.io.InputStream r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>(r2)
            return r0
    }

    protected javax.mail.internet.MimeBodyPart createMimeBodyPart(javax.mail.internet.InternetHeaders r2, byte[] r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>(r2, r3)
            return r0
    }

    @Override // javax.mail.Multipart
    public synchronized javax.mail.BodyPart getBodyPart(int r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.parse()     // Catch: java.lang.Throwable -> La
            javax.mail.BodyPart r1 = super.getBodyPart(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public synchronized javax.mail.BodyPart getBodyPart(java.lang.String r5) throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            r4.parse()     // Catch: java.lang.Throwable -> L22
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L22
            r1 = 0
        L9:
            if (r1 < r0) goto Le
            monitor-exit(r4)
            r5 = 0
            return r5
        Le:
            javax.mail.BodyPart r2 = r4.getBodyPart(r1)     // Catch: java.lang.Throwable -> L22
            javax.mail.internet.MimeBodyPart r2 = (javax.mail.internet.MimeBodyPart) r2     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r2.getContentID()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L24
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L24
            monitor-exit(r4)
            return r2
        L22:
            r5 = move-exception
            goto L27
        L24:
            int r1 = r1 + 1
            goto L9
        L27:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            throw r5
    }

    @Override // javax.mail.Multipart
    public synchronized int getCount() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.parse()     // Catch: java.lang.Throwable -> La
            int r0 = super.getCount()     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public synchronized java.lang.String getPreamble() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.parse()     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = r1.preamble     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized boolean isComplete() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.parse()     // Catch: java.lang.Throwable -> L8
            boolean r0 = r1.complete     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    protected synchronized void parse() throws javax.mail.MessagingException {
            r23 = this;
            r1 = r23
            monitor-enter(r23)
            boolean r0 = r1.parsed     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L9
            monitor-exit(r23)
            return
        L9:
            boolean r0 = javax.mail.internet.MimeMultipart.bmparse     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L15
            r1.parsebm()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r23)
            return
        L12:
            r0 = move-exception
            goto L25a
        L15:
            javax.activation.DataSource r0 = r1.ds     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            boolean r2 = r0 instanceof java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            if (r2 != 0) goto L30
            boolean r2 = r0 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            if (r2 != 0) goto L30
            boolean r2 = r0 instanceof javax.mail.internet.SharedInputStream     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            if (r2 != 0) goto L30
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L2d
            goto L31
        L2d:
            r0 = move-exception
            goto L252
        L30:
            r2 = r0
        L31:
            boolean r0 = r2 instanceof javax.mail.internet.SharedInputStream     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L3a
            r0 = r2
            javax.mail.internet.SharedInputStream r0 = (javax.mail.internet.SharedInputStream) r0     // Catch: java.lang.Throwable -> L12
            goto L3b
        L3a:
            r0 = 0
        L3b:
            javax.mail.internet.ContentType r4 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = r1.contentType     // Catch: java.lang.Throwable -> L12
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = "boundary"
            java.lang.String r4 = r4.getParameter(r5)     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            java.lang.String r6 = "--"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L12
            r5.append(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L12
            goto L5e
        L59:
            boolean r4 = javax.mail.internet.MimeMultipart.ignoreMissingBoundaryParameter     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L24a
            r4 = 0
        L5e:
            com.sun.mail.util.LineInputStream r5 = new com.sun.mail.util.LineInputStream     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r6 = 0
            r7 = 0
        L65:
            java.lang.String r8 = r5.readLine()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r9 = 9
            r10 = 32
            r11 = 0
            r12 = 1
            if (r8 != 0) goto L72
            goto La0
        L72:
            int r13 = r8.length()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            int r13 = r13 - r12
        L77:
            if (r13 >= 0) goto L7a
            goto L82
        L7a:
            char r14 = r8.charAt(r13)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r14 == r10) goto L234
            if (r14 == r9) goto L234
        L82:
            int r13 = r13 + 1
            java.lang.String r8 = r8.substring(r11, r13)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r4 == 0) goto L97
            boolean r13 = r8.equals(r4)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r13 == 0) goto L209
            goto La0
        L91:
            r0 = move-exception
            goto L246
        L94:
            r0 = move-exception
            goto L23e
        L97:
            java.lang.String r13 = "--"
            boolean r13 = r8.startsWith(r13)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r13 == 0) goto L209
            r4 = r8
        La0:
            if (r8 == 0) goto L201
            if (r6 == 0) goto Laa
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r1.preamble = r6     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        Laa:
            byte[] r4 = com.sun.mail.util.ASCIIUtility.getBytes(r4)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            int r6 = r4.length     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r7 = 0
            r13 = r7
            r15 = 0
        Lb3:
            if (r15 == 0) goto Lb6
            goto Ld0
        Lb6:
            if (r0 == 0) goto Le1
            long r7 = r0.getPosition()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        Lbc:
            java.lang.String r16 = r5.readLine()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r16 == 0) goto Lc8
            int r17 = r16.length()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r17 > 0) goto Lbc
        Lc8:
            if (r16 != 0) goto Ldf
            boolean r0 = javax.mail.internet.MimeMultipart.ignoreMissingEndBoundary     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r0 == 0) goto Ld7
            r1.complete = r11     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        Ld0:
            r2.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> Ld3
        Ld3:
            r1.parsed = r12     // Catch: java.lang.Throwable -> L12
            monitor-exit(r23)
            return
        Ld7:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            java.lang.String r3 = "missing multipart end boundary"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            throw r0     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        Ldf:
            r3 = 0
            goto Le7
        Le1:
            javax.mail.internet.InternetHeaders r16 = r1.createInternetHeaders(r2)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r3 = r16
        Le7:
            boolean r17 = r2.markSupported()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r17 == 0) goto L1f9
            if (r0 != 0) goto Lf7
            java.io.ByteArrayOutputStream r17 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r17.<init>()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r11 = r17
            goto Lfc
        Lf7:
            long r13 = r0.getPosition()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r11 = 0
        Lfc:
            r18 = 1
            r19 = -1
            r20 = -1
        L102:
            if (r18 == 0) goto L17c
            int r9 = r6 + 1004
            r2.mark(r9)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r9 = 0
        L10a:
            if (r9 < r6) goto L10d
            goto L117
        L10d:
            int r10 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r12 = r4[r9]     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r10 == r12) goto L16f
        L117:
            if (r9 != r6) goto L153
            int r9 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r10 = 45
            if (r9 != r10) goto L12e
            int r12 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r12 != r10) goto L12e
            r10 = 1
            r1.complete = r10     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r10 = 0
        L12b:
            r15 = 1
            goto L193
        L12e:
            r10 = 32
            if (r9 == r10) goto L14e
            r12 = 9
            if (r9 == r12) goto L14e
            r10 = 10
            if (r9 != r10) goto L13b
            goto L14c
        L13b:
            r12 = 13
            if (r9 != r12) goto L153
            r9 = 1
            r2.mark(r9)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            int r9 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r9 == r10) goto L14c
            r2.reset()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L14c:
            r10 = 0
            goto L193
        L14e:
            int r9 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            goto L12e
        L153:
            r2.reset()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r10 = r19
            r12 = -1
            if (r11 == 0) goto L16c
            if (r10 == r12) goto L16c
            r11.write(r10)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r9 = r20
            if (r9 == r12) goto L167
            r11.write(r9)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L167:
            r19 = -1
            r20 = -1
            goto L185
        L16c:
            r19 = r20
            goto L181
        L16f:
            r10 = r19
            r19 = r20
            r12 = -1
            int r9 = r9 + 1
            r12 = 1
            r19 = r10
            r10 = 32
            goto L10a
        L17c:
            r10 = r19
            r19 = r20
            r12 = -1
        L181:
            r20 = r19
            r19 = r10
        L185:
            int r9 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r9 >= 0) goto L1b9
            boolean r9 = javax.mail.internet.MimeMultipart.ignoreMissingEndBoundary     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r9 == 0) goto L1b1
            r10 = 0
            r1.complete = r10     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            goto L12b
        L193:
            if (r0 == 0) goto L19e
            java.io.InputStream r3 = r0.newStream(r7, r13)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            javax.mail.internet.MimeBodyPart r3 = r1.createMimeBodyPart(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            goto L1a6
        L19e:
            byte[] r9 = r11.toByteArray()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            javax.mail.internet.MimeBodyPart r3 = r1.createMimeBodyPart(r3, r9)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L1a6:
            super.addBodyPart(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r9 = 9
            r10 = 32
            r11 = 0
            r12 = 1
            goto Lb3
        L1b1:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            java.lang.String r3 = "missing multipart end boundary"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            throw r0     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L1b9:
            r10 = 13
            if (r9 == r10) goto L1ce
            r10 = 10
            if (r9 != r10) goto L1c2
            goto L1ce
        L1c2:
            if (r11 == 0) goto L1c7
            r11.write(r9)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L1c7:
            r10 = 32
            r12 = 1
            r18 = 0
            goto L102
        L1ce:
            if (r0 == 0) goto L1d8
            long r13 = r0.getPosition()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r21 = 1
            long r13 = r13 - r21
        L1d8:
            r10 = 13
            if (r9 != r10) goto L1f6
            r10 = 1
            r2.mark(r10)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            int r10 = r2.read()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r12 = 10
            if (r10 != r12) goto L1f3
            r19 = r9
            r20 = r10
        L1ec:
            r10 = 32
            r12 = 1
            r18 = 1
            goto L102
        L1f3:
            r2.reset()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L1f6:
            r19 = r9
            goto L1ec
        L1f9:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            java.lang.String r3 = "Stream doesn't support mark"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            throw r0     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L201:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            java.lang.String r3 = "Missing start boundary"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            throw r0     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
        L209:
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            if (r3 <= 0) goto L65
            if (r7 != 0) goto L21e
            java.lang.String r3 = "line.separator"
            java.lang.String r7 = "\n"
            java.lang.String r3 = java.lang.System.getProperty(r3, r7)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94 java.lang.SecurityException -> L21b
        L219:
            r7 = r3
            goto L21e
        L21b:
            java.lang.String r3 = "\n"
            goto L219
        L21e:
            if (r6 != 0) goto L22c
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            int r6 = r6 + 2
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r6 = r3
        L22c:
            r6.append(r8)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            r6.append(r7)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L94
            goto L65
        L234:
            int r13 = r13 + (-1)
            r9 = 9
            r10 = 32
            r11 = 0
            r12 = 1
            goto L77
        L23e:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "IO Error"
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L91
            throw r3     // Catch: java.lang.Throwable -> L91
        L246:
            r2.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L249
        L249:
            throw r0     // Catch: java.lang.Throwable -> L12
        L24a:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "Missing boundary parameter"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L252:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "No inputstream from datasource"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L25a:
            monitor-exit(r23)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // javax.mail.Multipart
    public void removeBodyPart(int r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.parse()
            super.removeBodyPart(r1)
            return
    }

    @Override // javax.mail.Multipart
    public boolean removeBodyPart(javax.mail.BodyPart r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.parse()
            boolean r1 = super.removeBodyPart(r1)
            return r1
    }

    public synchronized void setPreamble(java.lang.String r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.preamble = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void setSubType(java.lang.String r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r2.contentType     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            r0.setSubType(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L13
            r2.contentType = r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    protected void updateHeaders() throws javax.mail.MessagingException {
            r2 = this;
            r0 = 0
        L1:
            java.util.Vector r1 = r2.parts
            int r1 = r1.size()
            if (r0 < r1) goto La
            return
        La:
            java.util.Vector r1 = r2.parts
            java.lang.Object r1 = r1.elementAt(r0)
            javax.mail.internet.MimeBodyPart r1 = (javax.mail.internet.MimeBodyPart) r1
            r1.updateHeaders()
            int r0 = r0 + 1
            goto L1
    }

    @Override // javax.mail.Multipart
    public synchronized void writeTo(java.io.OutputStream r6) throws java.io.IOException, javax.mail.MessagingException {
            r5 = this;
            monitor-enter(r5)
            r5.parse()     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "--"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L48
            javax.mail.internet.ContentType r1 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r5.contentType     // Catch: java.lang.Throwable -> L48
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "boundary"
            java.lang.String r1 = r1.getParameter(r2)     // Catch: java.lang.Throwable -> L48
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            com.sun.mail.util.LineOutputStream r1 = new com.sun.mail.util.LineOutputStream     // Catch: java.lang.Throwable -> L48
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r5.preamble     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            byte[] r2 = com.sun.mail.util.ASCIIUtility.getBytes(r2)     // Catch: java.lang.Throwable -> L48
            r1.write(r2)     // Catch: java.lang.Throwable -> L48
            int r3 = r2.length     // Catch: java.lang.Throwable -> L48
            if (r3 <= 0) goto L4a
            int r3 = r2.length     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + (-1)
            r3 = r2[r3]     // Catch: java.lang.Throwable -> L48
            r4 = 13
            if (r3 == r4) goto L4a
            int r3 = r2.length     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + (-1)
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L48
            r3 = 10
            if (r2 == r3) goto L4a
            r1.writeln()     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r6 = move-exception
            goto L7e
        L4a:
            r2 = 0
        L4b:
            java.util.Vector r3 = r5.parts     // Catch: java.lang.Throwable -> L48
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L48
            if (r2 < r3) goto L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L48
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = "--"
            r6.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L48
            r1.writeln(r6)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r5)
            return
        L6a:
            r1.writeln(r0)     // Catch: java.lang.Throwable -> L48
            java.util.Vector r3 = r5.parts     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.elementAt(r2)     // Catch: java.lang.Throwable -> L48
            javax.mail.internet.MimeBodyPart r3 = (javax.mail.internet.MimeBodyPart) r3     // Catch: java.lang.Throwable -> L48
            r3.writeTo(r6)     // Catch: java.lang.Throwable -> L48
            r1.writeln()     // Catch: java.lang.Throwable -> L48
            int r2 = r2 + 1
            goto L4b
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            throw r6
    }
}
