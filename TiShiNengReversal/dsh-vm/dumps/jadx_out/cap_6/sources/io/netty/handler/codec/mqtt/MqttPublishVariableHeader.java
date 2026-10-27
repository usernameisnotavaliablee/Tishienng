package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttPublishVariableHeader {
    private final int packetId;
    private final java.lang.String topicName;

    public MqttPublishVariableHeader(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.topicName = r1
            r0.packetId = r2
            return
    }

    @java.lang.Deprecated
    public int messageId() {
            r1 = this;
            int r0 = r1.packetId
            return r0
    }

    public int packetId() {
            r1 = this;
            int r0 = r1.packetId
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "topicName="
            r0.append(r1)
            java.lang.String r1 = r2.topicName
            r0.append(r1)
            java.lang.String r1 = ", packetId="
            r0.append(r1)
            int r1 = r2.packetId
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String topicName() {
            r1 = this;
            java.lang.String r0 = r1.topicName
            return r0
    }
}
