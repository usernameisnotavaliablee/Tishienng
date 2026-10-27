package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Message implements javax.mail.Part {
    protected boolean expunged;
    protected javax.mail.Folder folder;
    protected int msgnum;
    protected javax.mail.Session session;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RecipientType implements java.io.Serializable {
        public static final javax.mail.Message.RecipientType BCC = null;
        public static final javax.mail.Message.RecipientType CC = null;
        public static final javax.mail.Message.RecipientType TO = null;
        private static final long serialVersionUID = -7479791750606340008L;
        protected java.lang.String type;

        static {
                javax.mail.Message$RecipientType r0 = new javax.mail.Message$RecipientType
                java.lang.String r1 = "To"
                r0.<init>(r1)
                javax.mail.Message.RecipientType.TO = r0
                javax.mail.Message$RecipientType r0 = new javax.mail.Message$RecipientType
                java.lang.String r1 = "Cc"
                r0.<init>(r1)
                javax.mail.Message.RecipientType.CC = r0
                javax.mail.Message$RecipientType r0 = new javax.mail.Message$RecipientType
                java.lang.String r1 = "Bcc"
                r0.<init>(r1)
                javax.mail.Message.RecipientType.BCC = r0
                return
        }

        protected RecipientType(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r3 = this;
                java.lang.String r0 = r3.type
                java.lang.String r1 = "To"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Ld
                javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.TO
                return r0
            Ld:
                java.lang.String r0 = r3.type
                java.lang.String r1 = "Cc"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1a
                javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.CC
                return r0
            L1a:
                java.lang.String r0 = r3.type
                java.lang.String r1 = "Bcc"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L27
                javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.BCC
                return r0
            L27:
                java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to resolve unknown RecipientType: "
                r1.<init>(r2)
                java.lang.String r2 = r3.type
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.type
                return r0
        }
    }

    protected Message() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.msgnum = r0
            r1.expunged = r0
            r0 = 0
            r1.folder = r0
            r1.session = r0
            return
    }

    protected Message(javax.mail.Folder r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.expunged = r0
            r0 = 0
            r1.session = r0
            r1.folder = r2
            r1.msgnum = r3
            javax.mail.Store r2 = r2.store
            javax.mail.Session r2 = r2.session
            r1.session = r2
            return
    }

    protected Message(javax.mail.Session r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.msgnum = r0
            r1.expunged = r0
            r0 = 0
            r1.folder = r0
            r1.session = r2
            return
    }

    public abstract void addFrom(javax.mail.Address[] r1) throws javax.mail.MessagingException;

    public void addRecipient(javax.mail.Message.RecipientType r3, javax.mail.Address r4) throws javax.mail.MessagingException {
            r2 = this;
            r0 = 1
            javax.mail.Address[] r0 = new javax.mail.Address[r0]
            r1 = 0
            r0[r1] = r4
            r2.addRecipients(r3, r0)
            return
    }

    public abstract void addRecipients(javax.mail.Message.RecipientType r1, javax.mail.Address[] r2) throws javax.mail.MessagingException;

    public javax.mail.Address[] getAllRecipients() throws javax.mail.MessagingException {
            r6 = this;
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.TO
            javax.mail.Address[] r0 = r6.getRecipients(r0)
            javax.mail.Message$RecipientType r1 = javax.mail.Message.RecipientType.CC
            javax.mail.Address[] r1 = r6.getRecipients(r1)
            javax.mail.Message$RecipientType r2 = javax.mail.Message.RecipientType.BCC
            javax.mail.Address[] r2 = r6.getRecipients(r2)
            if (r1 != 0) goto L17
            if (r2 != 0) goto L17
            return r0
        L17:
            r3 = 0
            if (r0 == 0) goto L1c
            int r4 = r0.length
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r1 == 0) goto L21
            int r5 = r1.length
            goto L22
        L21:
            r5 = 0
        L22:
            int r4 = r4 + r5
            if (r2 == 0) goto L27
            int r5 = r2.length
            goto L28
        L27:
            r5 = 0
        L28:
            int r4 = r4 + r5
            javax.mail.Address[] r4 = new javax.mail.Address[r4]
            if (r0 == 0) goto L33
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r3, r4, r3, r5)
            int r0 = r0.length
            goto L34
        L33:
            r0 = 0
        L34:
            if (r1 == 0) goto L3c
            int r5 = r1.length
            java.lang.System.arraycopy(r1, r3, r4, r0, r5)
            int r1 = r1.length
            int r0 = r0 + r1
        L3c:
            if (r2 == 0) goto L42
            int r1 = r2.length
            java.lang.System.arraycopy(r2, r3, r4, r0, r1)
        L42:
            return r4
    }

    public abstract javax.mail.Flags getFlags() throws javax.mail.MessagingException;

    public javax.mail.Folder getFolder() {
            r1 = this;
            javax.mail.Folder r0 = r1.folder
            return r0
    }

    public abstract javax.mail.Address[] getFrom() throws javax.mail.MessagingException;

    public int getMessageNumber() {
            r1 = this;
            int r0 = r1.msgnum
            return r0
    }

    public abstract java.util.Date getReceivedDate() throws javax.mail.MessagingException;

    public abstract javax.mail.Address[] getRecipients(javax.mail.Message.RecipientType r1) throws javax.mail.MessagingException;

    public javax.mail.Address[] getReplyTo() throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Address[] r0 = r1.getFrom()
            return r0
    }

    public abstract java.util.Date getSentDate() throws javax.mail.MessagingException;

    public abstract java.lang.String getSubject() throws javax.mail.MessagingException;

    public boolean isExpunged() {
            r1 = this;
            boolean r0 = r1.expunged
            return r0
    }

    public boolean isSet(javax.mail.Flags.Flag r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Flags r0 = r1.getFlags()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean match(javax.mail.search.SearchTerm r1) throws javax.mail.MessagingException {
            r0 = this;
            boolean r1 = r1.match(r0)
            return r1
    }

    public abstract javax.mail.Message reply(boolean r1) throws javax.mail.MessagingException;

    public abstract void saveChanges() throws javax.mail.MessagingException;

    protected void setExpunged(boolean r1) {
            r0 = this;
            r0.expunged = r1
            return
    }

    public void setFlag(javax.mail.Flags.Flag r2, boolean r3) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Flags r0 = new javax.mail.Flags
            r0.<init>(r2)
            r1.setFlags(r0, r3)
            return
    }

    public abstract void setFlags(javax.mail.Flags r1, boolean r2) throws javax.mail.MessagingException;

    public abstract void setFrom() throws javax.mail.MessagingException;

    public abstract void setFrom(javax.mail.Address r1) throws javax.mail.MessagingException;

    protected void setMessageNumber(int r1) {
            r0 = this;
            r0.msgnum = r1
            return
    }

    public void setRecipient(javax.mail.Message.RecipientType r3, javax.mail.Address r4) throws javax.mail.MessagingException {
            r2 = this;
            r0 = 1
            javax.mail.Address[] r0 = new javax.mail.Address[r0]
            r1 = 0
            r0[r1] = r4
            r2.setRecipients(r3, r0)
            return
    }

    public abstract void setRecipients(javax.mail.Message.RecipientType r1, javax.mail.Address[] r2) throws javax.mail.MessagingException;

    public void setReplyTo(javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "setReplyTo not supported"
            r2.<init>(r0)
            throw r2
    }

    public abstract void setSentDate(java.util.Date r1) throws javax.mail.MessagingException;

    public abstract void setSubject(java.lang.String r1) throws javax.mail.MessagingException;
}
