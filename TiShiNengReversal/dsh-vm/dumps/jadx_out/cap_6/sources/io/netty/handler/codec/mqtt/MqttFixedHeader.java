package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttFixedHeader {
    private final boolean isDup;
    private final boolean isRetain;
    private final io.netty.handler.codec.mqtt.MqttMessageType messageType;
    private final io.netty.handler.codec.mqtt.MqttQoS qosLevel;
    private final int remainingLength;

    public MqttFixedHeader(io.netty.handler.codec.mqtt.MqttMessageType r2, boolean r3, io.netty.handler.codec.mqtt.MqttQoS r4, boolean r5, int r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "messageType"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.mqtt.MqttMessageType r2 = (io.netty.handler.codec.mqtt.MqttMessageType) r2
            r1.messageType = r2
            r1.isDup = r3
            java.lang.String r2 = "qosLevel"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.handler.codec.mqtt.MqttQoS r2 = (io.netty.handler.codec.mqtt.MqttQoS) r2
            r1.qosLevel = r2
            r1.isRetain = r5
            r1.remainingLength = r6
            return
    }

    public boolean isDup() {
            r1 = this;
            boolean r0 = r1.isDup
            return r0
    }

    public boolean isRetain() {
            r1 = this;
            boolean r0 = r1.isRetain
            return r0
    }

    public io.netty.handler.codec.mqtt.MqttMessageType messageType() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttMessageType r0 = r1.messageType
            return r0
    }

    public io.netty.handler.codec.mqtt.MqttQoS qosLevel() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttQoS r0 = r1.qosLevel
            return r0
    }

    public int remainingLength() {
            r1 = this;
            int r0 = r1.remainingLength
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "messageType="
            r0.append(r1)
            io.netty.handler.codec.mqtt.MqttMessageType r1 = r2.messageType
            r0.append(r1)
            java.lang.String r1 = ", isDup="
            r0.append(r1)
            boolean r1 = r2.isDup
            r0.append(r1)
            java.lang.String r1 = ", qosLevel="
            r0.append(r1)
            io.netty.handler.codec.mqtt.MqttQoS r1 = r2.qosLevel
            r0.append(r1)
            java.lang.String r1 = ", isRetain="
            r0.append(r1)
            boolean r1 = r2.isRetain
            r0.append(r1)
            java.lang.String r1 = ", remainingLength="
            r0.append(r1)
            int r1 = r2.remainingLength
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
