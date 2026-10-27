package com.sun.mail.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SMTPMessage extends javax.mail.internet.MimeMessage {
    public static final int NOTIFY_DELAY = 4;
    public static final int NOTIFY_FAILURE = 2;
    public static final int NOTIFY_NEVER = -1;
    public static final int NOTIFY_SUCCESS = 1;
    public static final int RETURN_FULL = 1;
    public static final int RETURN_HDRS = 2;
    private static final java.lang.String[] returnOptionString = null;
    private boolean allow8bitMIME;
    private java.lang.String envelopeFrom;
    private java.lang.String extension;
    private int notifyOptions;
    private int returnOption;
    private boolean sendPartial;
    private java.lang.String submitter;

    static {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 1
            java.lang.String r2 = "FULL"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "HDRS"
            r0[r1] = r2
            com.sun.mail.smtp.SMTPMessage.returnOptionString = r0
            return
    }

    public SMTPMessage(javax.mail.Session r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.notifyOptions = r1
            r0.returnOption = r1
            r0.sendPartial = r1
            r0.allow8bitMIME = r1
            r1 = 0
            r0.submitter = r1
            r0.extension = r1
            return
    }

    public SMTPMessage(javax.mail.Session r1, java.io.InputStream r2) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.notifyOptions = r1
            r0.returnOption = r1
            r0.sendPartial = r1
            r0.allow8bitMIME = r1
            r1 = 0
            r0.submitter = r1
            r0.extension = r1
            return
    }

    public SMTPMessage(javax.mail.internet.MimeMessage r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.notifyOptions = r1
            r0.returnOption = r1
            r0.sendPartial = r1
            r0.allow8bitMIME = r1
            r1 = 0
            r0.submitter = r1
            r0.extension = r1
            return
    }

    public boolean getAllow8bitMIME() {
            r1 = this;
            boolean r0 = r1.allow8bitMIME
            return r0
    }

    java.lang.String getDSNNotify() {
            r3 = this;
            int r0 = r3.notifyOptions
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.String r0 = "NEVER"
            return r0
        Lc:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r3.notifyOptions
            r1 = r1 & 1
            if (r1 == 0) goto L1c
            java.lang.String r1 = "SUCCESS"
            r0.append(r1)
        L1c:
            int r1 = r3.notifyOptions
            r1 = r1 & 2
            r2 = 44
            if (r1 == 0) goto L32
            int r1 = r0.length()
            if (r1 == 0) goto L2d
            r0.append(r2)
        L2d:
            java.lang.String r1 = "FAILURE"
            r0.append(r1)
        L32:
            int r1 = r3.notifyOptions
            r1 = r1 & 4
            if (r1 == 0) goto L46
            int r1 = r0.length()
            if (r1 == 0) goto L41
            r0.append(r2)
        L41:
            java.lang.String r1 = "DELAY"
            r0.append(r1)
        L46:
            java.lang.String r0 = r0.toString()
            return r0
    }

    java.lang.String getDSNRet() {
            r2 = this;
            java.lang.String[] r0 = com.sun.mail.smtp.SMTPMessage.returnOptionString
            int r1 = r2.returnOption
            r0 = r0[r1]
            return r0
    }

    public java.lang.String getEnvelopeFrom() {
            r1 = this;
            java.lang.String r0 = r1.envelopeFrom
            return r0
    }

    public java.lang.String getMailExtension() {
            r1 = this;
            java.lang.String r0 = r1.extension
            return r0
    }

    public int getNotifyOptions() {
            r1 = this;
            int r0 = r1.notifyOptions
            return r0
    }

    public int getReturnOption() {
            r1 = this;
            int r0 = r1.returnOption
            return r0
    }

    public boolean getSendPartial() {
            r1 = this;
            boolean r0 = r1.sendPartial
            return r0
    }

    public java.lang.String getSubmitter() {
            r1 = this;
            java.lang.String r0 = r1.submitter
            return r0
    }

    public void setAllow8bitMIME(boolean r1) {
            r0 = this;
            r0.allow8bitMIME = r1
            return
    }

    public void setEnvelopeFrom(java.lang.String r1) {
            r0 = this;
            r0.envelopeFrom = r1
            return
    }

    public void setMailExtension(java.lang.String r1) {
            r0 = this;
            r0.extension = r1
            return
    }

    public void setNotifyOptions(int r2) {
            r1 = this;
            r0 = -1
            if (r2 < r0) goto La
            r0 = 8
            if (r2 >= r0) goto La
            r1.notifyOptions = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad return option"
            r2.<init>(r0)
            throw r2
    }

    public void setReturnOption(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            r0 = 2
            if (r2 > r0) goto L8
            r1.returnOption = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad return option"
            r2.<init>(r0)
            throw r2
    }

    public void setSendPartial(boolean r1) {
            r0 = this;
            r0.sendPartial = r1
            return
    }

    public void setSubmitter(java.lang.String r1) {
            r0 = this;
            r0.submitter = r1
            return
    }
}
