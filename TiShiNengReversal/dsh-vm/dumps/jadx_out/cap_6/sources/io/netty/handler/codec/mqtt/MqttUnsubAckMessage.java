package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttUnsubAckMessage extends io.netty.handler.codec.mqtt.MqttMessage {
    public MqttUnsubAckMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r2, io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader variableHeader() {
            r1 = this;
            java.lang.Object r0 = super.variableHeader()
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r0 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r0
            return r0
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public /* bridge */ /* synthetic */ java.lang.Object variableHeader() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r0 = r1.variableHeader()
            return r0
    }
}
