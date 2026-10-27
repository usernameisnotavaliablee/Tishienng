package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttTopicSubscription {
    private final io.netty.handler.codec.mqtt.MqttQoS qualityOfService;
    private final java.lang.String topicFilter;

    public MqttTopicSubscription(java.lang.String r1, io.netty.handler.codec.mqtt.MqttQoS r2) {
            r0 = this;
            r0.<init>()
            r0.topicFilter = r1
            r0.qualityOfService = r2
            return
    }

    public io.netty.handler.codec.mqtt.MqttQoS qualityOfService() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttQoS r0 = r1.qualityOfService
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "topicFilter="
            r0.append(r1)
            java.lang.String r1 = r2.topicFilter
            r0.append(r1)
            java.lang.String r1 = ", qualityOfService="
            r0.append(r1)
            io.netty.handler.codec.mqtt.MqttQoS r1 = r2.qualityOfService
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String topicName() {
            r1 = this;
            java.lang.String r0 = r1.topicFilter
            return r0
    }
}
