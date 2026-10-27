package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttSubAckMessage extends io.netty.handler.codec.mqtt.MqttMessage {
    public MqttSubAckMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r1, io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r2, io.netty.handler.codec.mqtt.MqttSubAckPayload r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public io.netty.handler.codec.mqtt.MqttSubAckPayload payload() {
            r1 = this;
            java.lang.Object r0 = super.payload()
            io.netty.handler.codec.mqtt.MqttSubAckPayload r0 = (io.netty.handler.codec.mqtt.MqttSubAckPayload) r0
            return r0
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public /* bridge */ /* synthetic */ java.lang.Object payload() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttSubAckPayload r0 = r1.payload()
            return r0
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
