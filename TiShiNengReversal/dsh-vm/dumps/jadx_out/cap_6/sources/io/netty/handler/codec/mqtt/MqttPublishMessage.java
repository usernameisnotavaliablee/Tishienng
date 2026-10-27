package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MqttPublishMessage extends io.netty.handler.codec.mqtt.MqttMessage implements io.netty.buffer.ByteBufHolder {
    public MqttPublishMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r1, io.netty.handler.codec.mqtt.MqttPublishVariableHeader r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            java.lang.Object r0 = super.payload()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            int r1 = r0.refCnt()
            if (r1 <= 0) goto Ld
            return r0
        Ld:
            io.netty.util.IllegalReferenceCountException r1 = new io.netty.util.IllegalReferenceCountException
            int r0 = r0.refCnt()
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.mqtt.MqttPublishMessage copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.mqtt.MqttPublishMessage duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public io.netty.buffer.ByteBuf payload() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            return r0
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public /* bridge */ /* synthetic */ java.lang.Object payload() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.payload()
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.mqtt.MqttPublishMessage replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = new io.netty.handler.codec.mqtt.MqttPublishMessage
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = r3.fixedHeader()
            io.netty.handler.codec.mqtt.MqttPublishVariableHeader r2 = r3.variableHeader()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.mqtt.MqttPublishMessage mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.retain()
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.mqtt.MqttPublishMessage mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.retain(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.mqtt.MqttPublishMessage retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.mqtt.MqttPublishMessage mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.touch()
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.mqtt.MqttPublishMessage mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.mqtt.MqttPublishMessage r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public io.netty.handler.codec.mqtt.MqttPublishVariableHeader variableHeader() {
            r1 = this;
            java.lang.Object r0 = super.variableHeader()
            io.netty.handler.codec.mqtt.MqttPublishVariableHeader r0 = (io.netty.handler.codec.mqtt.MqttPublishVariableHeader) r0
            return r0
    }

    @Override // io.netty.handler.codec.mqtt.MqttMessage
    public /* bridge */ /* synthetic */ java.lang.Object variableHeader() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttPublishVariableHeader r0 = r1.variableHeader()
            return r0
    }
}
