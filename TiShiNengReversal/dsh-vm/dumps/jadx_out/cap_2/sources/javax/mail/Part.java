package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Part {
    public static final java.lang.String ATTACHMENT = "attachment";
    public static final java.lang.String INLINE = "inline";

    void addHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException;

    java.util.Enumeration getAllHeaders() throws javax.mail.MessagingException;

    java.lang.Object getContent() throws java.io.IOException, javax.mail.MessagingException;

    java.lang.String getContentType() throws javax.mail.MessagingException;

    javax.activation.DataHandler getDataHandler() throws javax.mail.MessagingException;

    java.lang.String getDescription() throws javax.mail.MessagingException;

    java.lang.String getDisposition() throws javax.mail.MessagingException;

    java.lang.String getFileName() throws javax.mail.MessagingException;

    java.lang.String[] getHeader(java.lang.String r1) throws javax.mail.MessagingException;

    java.io.InputStream getInputStream() throws java.io.IOException, javax.mail.MessagingException;

    int getLineCount() throws javax.mail.MessagingException;

    java.util.Enumeration getMatchingHeaders(java.lang.String[] r1) throws javax.mail.MessagingException;

    java.util.Enumeration getNonMatchingHeaders(java.lang.String[] r1) throws javax.mail.MessagingException;

    int getSize() throws javax.mail.MessagingException;

    boolean isMimeType(java.lang.String r1) throws javax.mail.MessagingException;

    void removeHeader(java.lang.String r1) throws javax.mail.MessagingException;

    void setContent(java.lang.Object r1, java.lang.String r2) throws javax.mail.MessagingException;

    void setContent(javax.mail.Multipart r1) throws javax.mail.MessagingException;

    void setDataHandler(javax.activation.DataHandler r1) throws javax.mail.MessagingException;

    void setDescription(java.lang.String r1) throws javax.mail.MessagingException;

    void setDisposition(java.lang.String r1) throws javax.mail.MessagingException;

    void setFileName(java.lang.String r1) throws javax.mail.MessagingException;

    void setHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException;

    void setText(java.lang.String r1) throws javax.mail.MessagingException;

    void writeTo(java.io.OutputStream r1) throws java.io.IOException, javax.mail.MessagingException;
}
