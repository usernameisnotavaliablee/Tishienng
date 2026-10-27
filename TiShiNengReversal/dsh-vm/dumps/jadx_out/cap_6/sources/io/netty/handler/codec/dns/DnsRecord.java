package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsRecord {
    public static final int CLASS_ANY = 255;
    public static final int CLASS_CHAOS = 3;
    public static final int CLASS_CSNET = 2;
    public static final int CLASS_HESIOD = 4;
    public static final int CLASS_IN = 1;
    public static final int CLASS_NONE = 254;

    int dnsClass();

    java.lang.String name();

    long timeToLive();

    io.netty.handler.codec.dns.DnsRecordType type();
}
