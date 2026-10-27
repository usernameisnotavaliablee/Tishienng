package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface MultipartDataSource extends javax.activation.DataSource {
    javax.mail.BodyPart getBodyPart(int r1) throws javax.mail.MessagingException;

    int getCount();
}
