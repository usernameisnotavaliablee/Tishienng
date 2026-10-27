package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface MimePart extends javax.mail.Part {
    void addHeaderLine(java.lang.String r1) throws javax.mail.MessagingException;

    java.util.Enumeration getAllHeaderLines() throws javax.mail.MessagingException;

    java.lang.String getContentID() throws javax.mail.MessagingException;

    java.lang.String[] getContentLanguage() throws javax.mail.MessagingException;

    java.lang.String getContentMD5() throws javax.mail.MessagingException;

    java.lang.String getEncoding() throws javax.mail.MessagingException;

    java.lang.String getHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException;

    java.util.Enumeration getMatchingHeaderLines(java.lang.String[] r1) throws javax.mail.MessagingException;

    java.util.Enumeration getNonMatchingHeaderLines(java.lang.String[] r1) throws javax.mail.MessagingException;

    void setContentLanguage(java.lang.String[] r1) throws javax.mail.MessagingException;

    void setContentMD5(java.lang.String r1) throws javax.mail.MessagingException;

    void setText(java.lang.String r1) throws javax.mail.MessagingException;

    void setText(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException;

    void setText(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException;
}
