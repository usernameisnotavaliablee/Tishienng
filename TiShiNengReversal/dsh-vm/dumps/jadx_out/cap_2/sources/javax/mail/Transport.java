package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Transport extends javax.mail.Service {
    private java.util.Vector transportListeners;

    public Transport(javax.mail.Session r1, javax.mail.URLName r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.transportListeners = r1
            return
    }

    public static void send(javax.mail.Message r1) throws javax.mail.MessagingException {
            r1.saveChanges()
            javax.mail.Address[] r0 = r1.getAllRecipients()
            send0(r1, r0)
            return
    }

    public static void send(javax.mail.Message r0, javax.mail.Address[] r1) throws javax.mail.MessagingException {
            r0.saveChanges()
            send0(r0, r1)
            return
    }

    private static void send0(javax.mail.Message r17, javax.mail.Address[] r18) throws javax.mail.MessagingException {
            r1 = r17
            r0 = r18
            java.lang.String r2 = "No recipient addresses"
            if (r0 == 0) goto L168
            int r3 = r0.length
            if (r3 == 0) goto L168
            java.util.Hashtable r3 = new java.util.Hashtable
            r3.<init>()
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            java.util.Vector r5 = new java.util.Vector
            r5.<init>()
            java.util.Vector r6 = new java.util.Vector
            r6.<init>()
            r7 = 0
            r8 = 0
        L21:
            int r9 = r0.length
            if (r8 < r9) goto L133
            int r8 = r3.size()
            if (r8 == 0) goto L12d
            javax.mail.Session r2 = r1.session
            r9 = 0
            if (r2 == 0) goto L30
            goto L38
        L30:
            java.util.Properties r2 = java.lang.System.getProperties()
            javax.mail.Session r2 = javax.mail.Session.getDefaultInstance(r2, r9)
        L38:
            r10 = 1
            if (r8 != r10) goto L50
            r3 = r0[r7]
            javax.mail.Transport r2 = r2.getTransport(r3)
            r2.connect()     // Catch: java.lang.Throwable -> L4b
            r2.sendMessage(r1, r0)     // Catch: java.lang.Throwable -> L4b
            r2.close()
            return
        L4b:
            r0 = move-exception
            r2.close()
            throw r0
        L50:
            java.util.Enumeration r3 = r3.elements()
            r13 = r9
            r0 = 0
        L56:
            boolean r8 = r3.hasMoreElements()
            if (r8 != 0) goto La9
            if (r0 != 0) goto L6c
            int r0 = r4.size()
            if (r0 != 0) goto L6c
            int r0 = r6.size()
            if (r0 == 0) goto L6b
            goto L6c
        L6b:
            return
        L6c:
            int r0 = r5.size()
            if (r0 <= 0) goto L7d
            int r0 = r5.size()
            javax.mail.Address[] r0 = new javax.mail.Address[r0]
            r5.copyInto(r0)
            r14 = r0
            goto L7e
        L7d:
            r14 = r9
        L7e:
            int r0 = r6.size()
            if (r0 <= 0) goto L8f
            int r0 = r6.size()
            javax.mail.Address[] r0 = new javax.mail.Address[r0]
            r6.copyInto(r0)
            r15 = r0
            goto L90
        L8f:
            r15 = r9
        L90:
            int r0 = r4.size()
            if (r0 <= 0) goto L9f
            int r0 = r4.size()
            javax.mail.Address[] r9 = new javax.mail.Address[r0]
            r4.copyInto(r9)
        L9f:
            r16 = r9
            javax.mail.SendFailedException r11 = new javax.mail.SendFailedException
            java.lang.String r12 = "Sending failed"
            r11.<init>(r12, r13, r14, r15, r16)
            throw r11
        La9:
            java.lang.Object r8 = r3.nextElement()
            java.util.Vector r8 = (java.util.Vector) r8
            int r11 = r8.size()
            javax.mail.Address[] r12 = new javax.mail.Address[r11]
            r8.copyInto(r12)
            r8 = r12[r7]
            javax.mail.Transport r8 = r2.getTransport(r8)
            if (r8 != 0) goto Lcc
            r8 = 0
        Lc1:
            if (r8 < r11) goto Lc4
            goto L56
        Lc4:
            r14 = r12[r8]
            r4.addElement(r14)
            int r8 = r8 + 1
            goto Lc1
        Lcc:
            r8.connect()     // Catch: java.lang.Throwable -> Ld6 javax.mail.MessagingException -> Ld8 javax.mail.SendFailedException -> Lda
            r8.sendMessage(r1, r12)     // Catch: java.lang.Throwable -> Ld6 javax.mail.MessagingException -> Ld8 javax.mail.SendFailedException -> Lda
            r8.close()
            goto L56
        Ld6:
            r0 = move-exception
            goto L129
        Ld8:
            r0 = move-exception
            goto Ldc
        Lda:
            r0 = move-exception
            goto Le9
        Ldc:
            if (r13 != 0) goto Le0
            r13 = r0
            goto Le3
        Le0:
            r13.setNextException(r0)     // Catch: java.lang.Throwable -> Ld6
        Le3:
            r8.close()
            r0 = 1
            goto L56
        Le9:
            if (r13 != 0) goto Led
            r13 = r0
            goto Lf0
        Led:
            r13.setNextException(r0)     // Catch: java.lang.Throwable -> Ld6
        Lf0:
            javax.mail.Address[] r11 = r0.getInvalidAddresses()     // Catch: java.lang.Throwable -> Ld6
            if (r11 == 0) goto L103
            r12 = 0
        Lf7:
            int r14 = r11.length     // Catch: java.lang.Throwable -> Ld6
            if (r12 < r14) goto Lfb
            goto L103
        Lfb:
            r14 = r11[r12]     // Catch: java.lang.Throwable -> Ld6
            r4.addElement(r14)     // Catch: java.lang.Throwable -> Ld6
            int r12 = r12 + 1
            goto Lf7
        L103:
            javax.mail.Address[] r11 = r0.getValidSentAddresses()     // Catch: java.lang.Throwable -> Ld6
            if (r11 == 0) goto L116
            r12 = 0
        L10a:
            int r14 = r11.length     // Catch: java.lang.Throwable -> Ld6
            if (r12 < r14) goto L10e
            goto L116
        L10e:
            r14 = r11[r12]     // Catch: java.lang.Throwable -> Ld6
            r5.addElement(r14)     // Catch: java.lang.Throwable -> Ld6
            int r12 = r12 + 1
            goto L10a
        L116:
            javax.mail.Address[] r0 = r0.getValidUnsentAddresses()     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Le3
            r11 = 0
        L11d:
            int r12 = r0.length     // Catch: java.lang.Throwable -> Ld6
            if (r11 < r12) goto L121
            goto Le3
        L121:
            r12 = r0[r11]     // Catch: java.lang.Throwable -> Ld6
            r6.addElement(r12)     // Catch: java.lang.Throwable -> Ld6
            int r11 = r11 + 1
            goto L11d
        L129:
            r8.close()
            throw r0
        L12d:
            javax.mail.SendFailedException r0 = new javax.mail.SendFailedException
            r0.<init>(r2)
            throw r0
        L133:
            r9 = r0[r8]
            java.lang.String r9 = r9.getType()
            boolean r9 = r3.containsKey(r9)
            if (r9 == 0) goto L151
            r9 = r0[r8]
            java.lang.String r9 = r9.getType()
            java.lang.Object r9 = r3.get(r9)
            java.util.Vector r9 = (java.util.Vector) r9
            r10 = r0[r8]
            r9.addElement(r10)
            goto L164
        L151:
            java.util.Vector r9 = new java.util.Vector
            r9.<init>()
            r10 = r0[r8]
            r9.addElement(r10)
            r10 = r0[r8]
            java.lang.String r10 = r10.getType()
            r3.put(r10, r9)
        L164:
            int r8 = r8 + 1
            goto L21
        L168:
            javax.mail.SendFailedException r0 = new javax.mail.SendFailedException
            r0.<init>(r2)
            throw r0
    }

    public synchronized void addTransportListener(javax.mail.event.TransportListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.transportListeners     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.transportListeners = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.util.Vector r0 = r1.transportListeners     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    protected void notifyTransportListeners(int r9, javax.mail.Address[] r10, javax.mail.Address[] r11, javax.mail.Address[] r12, javax.mail.Message r13) {
            r8 = this;
            java.util.Vector r0 = r8.transportListeners
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.event.TransportEvent r1 = new javax.mail.event.TransportEvent
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.Vector r9 = r2.transportListeners
            r8.queueEvent(r1, r9)
            return
    }

    public synchronized void removeTransportListener(javax.mail.event.TransportListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.transportListeners     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.removeElement(r2)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r2 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public abstract void sendMessage(javax.mail.Message r1, javax.mail.Address[] r2) throws javax.mail.MessagingException;
}
