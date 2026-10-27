package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttMessageIdVariableHeader {
    private final int messageId;

    private MqttMessageIdVariableHeader(int r1) {
            r0 = this;
            r0.<init>()
            r0.messageId = r1
            return
    }

    public static io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader from(int r3) {
            r0 = 1
            if (r3 < r0) goto Le
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto Le
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r0 = new io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader
            r0.<init>(r3)
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "messageId: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " (expected: 1 ~ 65535)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public int messageId() {
            r1 = this;
            int r0 = r1.messageId
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "messageId="
            r0.append(r1)
            int r1 = r2.messageId
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
