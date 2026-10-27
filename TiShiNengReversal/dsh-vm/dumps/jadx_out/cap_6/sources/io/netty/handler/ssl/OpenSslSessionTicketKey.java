package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslSessionTicketKey {
    public static final int AES_KEY_SIZE = 16;
    public static final int HMAC_KEY_SIZE = 16;
    public static final int NAME_SIZE = 16;
    public static final int TICKET_KEY_SIZE = 48;
    final io.netty.internal.tcnative.SessionTicketKey key;

    public OpenSslSessionTicketKey(byte[] r2, byte[] r3, byte[] r4) {
            r1 = this;
            r1.<init>()
            io.netty.internal.tcnative.SessionTicketKey r0 = new io.netty.internal.tcnative.SessionTicketKey
            java.lang.Object r2 = r2.clone()
            byte[] r2 = (byte[]) r2
            java.lang.Object r3 = r3.clone()
            byte[] r3 = (byte[]) r3
            java.lang.Object r4 = r4.clone()
            byte[] r4 = (byte[]) r4
            r0.<init>(r2, r3, r4)
            r1.key = r0
            return
    }

    public byte[] aesKey() {
            r1 = this;
            io.netty.internal.tcnative.SessionTicketKey r0 = r1.key
            byte[] r0 = r0.getAesKey()
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    public byte[] hmacKey() {
            r1 = this;
            io.netty.internal.tcnative.SessionTicketKey r0 = r1.key
            byte[] r0 = r0.getHmacKey()
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    public byte[] name() {
            r1 = this;
            io.netty.internal.tcnative.SessionTicketKey r0 = r1.key
            byte[] r0 = r0.getName()
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }
}
