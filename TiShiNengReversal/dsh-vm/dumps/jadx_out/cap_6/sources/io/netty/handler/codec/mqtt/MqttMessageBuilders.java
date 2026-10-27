package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttMessageBuilders {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ConnAckBuilder {
        private io.netty.handler.codec.mqtt.MqttConnectReturnCode returnCode;
        private boolean sessionPresent;

        ConnAckBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public io.netty.handler.codec.mqtt.MqttConnAckMessage build() {
                r6 = this;
                io.netty.handler.codec.mqtt.MqttFixedHeader r0 = new io.netty.handler.codec.mqtt.MqttFixedHeader
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNACK
                io.netty.handler.codec.mqtt.MqttQoS r3 = io.netty.handler.codec.mqtt.MqttQoS.AT_MOST_ONCE
                r4 = 0
                r5 = 0
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                io.netty.handler.codec.mqtt.MqttConnAckVariableHeader r1 = new io.netty.handler.codec.mqtt.MqttConnAckVariableHeader
                io.netty.handler.codec.mqtt.MqttConnectReturnCode r2 = r6.returnCode
                boolean r3 = r6.sessionPresent
                r1.<init>(r2, r3)
                io.netty.handler.codec.mqtt.MqttConnAckMessage r2 = new io.netty.handler.codec.mqtt.MqttConnAckMessage
                r2.<init>(r0, r1)
                return r2
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnAckBuilder returnCode(io.netty.handler.codec.mqtt.MqttConnectReturnCode r1) {
                r0 = this;
                r0.returnCode = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnAckBuilder sessionPresent(boolean r1) {
                r0 = this;
                r0.sessionPresent = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ConnectBuilder {
        private boolean cleanSession;
        private java.lang.String clientId;
        private boolean hasPassword;
        private boolean hasUser;
        private int keepAliveSecs;
        private byte[] password;
        private java.lang.String username;
        private io.netty.handler.codec.mqtt.MqttVersion version;
        private boolean willFlag;
        private byte[] willMessage;
        private io.netty.handler.codec.mqtt.MqttQoS willQos;
        private boolean willRetain;
        private java.lang.String willTopic;

        ConnectBuilder() {
                r1 = this;
                r1.<init>()
                io.netty.handler.codec.mqtt.MqttVersion r0 = io.netty.handler.codec.mqtt.MqttVersion.MQTT_3_1_1
                r1.version = r0
                io.netty.handler.codec.mqtt.MqttQoS r0 = io.netty.handler.codec.mqtt.MqttQoS.AT_MOST_ONCE
                r1.willQos = r0
                return
        }

        public io.netty.handler.codec.mqtt.MqttConnectMessage build() {
                r11 = this;
                io.netty.handler.codec.mqtt.MqttFixedHeader r0 = new io.netty.handler.codec.mqtt.MqttFixedHeader
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNECT
                io.netty.handler.codec.mqtt.MqttQoS r3 = io.netty.handler.codec.mqtt.MqttQoS.AT_MOST_ONCE
                r4 = 0
                r5 = 0
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                io.netty.handler.codec.mqtt.MqttConnectVariableHeader r1 = new io.netty.handler.codec.mqtt.MqttConnectVariableHeader
                io.netty.handler.codec.mqtt.MqttVersion r2 = r11.version
                java.lang.String r2 = r2.protocolName()
                io.netty.handler.codec.mqtt.MqttVersion r3 = r11.version
                byte r3 = r3.protocolLevel()
                boolean r4 = r11.hasUser
                boolean r5 = r11.hasPassword
                boolean r6 = r11.willRetain
                io.netty.handler.codec.mqtt.MqttQoS r7 = r11.willQos
                int r7 = r7.value()
                boolean r8 = r11.willFlag
                boolean r9 = r11.cleanSession
                int r10 = r11.keepAliveSecs
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                io.netty.handler.codec.mqtt.MqttConnectPayload r2 = new io.netty.handler.codec.mqtt.MqttConnectPayload
                java.lang.String r3 = r11.clientId
                java.lang.String r4 = r11.willTopic
                byte[] r5 = r11.willMessage
                java.lang.String r6 = r11.username
                byte[] r7 = r11.password
                r2.<init>(r3, r4, r5, r6, r7)
                io.netty.handler.codec.mqtt.MqttConnectMessage r3 = new io.netty.handler.codec.mqtt.MqttConnectMessage
                r3.<init>(r0, r1, r2)
                return r3
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder cleanSession(boolean r1) {
                r0 = this;
                r0.cleanSession = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder clientId(java.lang.String r1) {
                r0 = this;
                r0.clientId = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder hasPassword(boolean r1) {
                r0 = this;
                r0.hasPassword = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder hasUser(boolean r1) {
                r0 = this;
                r0.hasUser = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder keepAlive(int r1) {
                r0 = this;
                r0.keepAliveSecs = r1
                return r0
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder password(java.lang.String r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r2 = 0
                goto La
            L4:
                java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
                byte[] r2 = r2.getBytes(r0)
            La:
                r1.password(r2)
                return r1
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder password(byte[] r2) {
                r1 = this;
                if (r2 == 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                r1.hasPassword = r0
                r1.password = r2
                return r1
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder protocolVersion(io.netty.handler.codec.mqtt.MqttVersion r1) {
                r0 = this;
                r0.version = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder username(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                r1.hasUser = r0
                r1.username = r2
                return r1
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder willFlag(boolean r1) {
                r0 = this;
                r0.willFlag = r1
                return r0
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder willMessage(java.lang.String r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r2 = 0
                goto La
            L4:
                java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
                byte[] r2 = r2.getBytes(r0)
            La:
                r1.willMessage(r2)
                return r1
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder willMessage(byte[] r1) {
                r0 = this;
                r0.willMessage = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder willQoS(io.netty.handler.codec.mqtt.MqttQoS r1) {
                r0 = this;
                r0.willQos = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder willRetain(boolean r1) {
                r0 = this;
                r0.willRetain = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder willTopic(java.lang.String r1) {
                r0 = this;
                r0.willTopic = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class PublishBuilder {
        private int messageId;
        private io.netty.buffer.ByteBuf payload;
        private io.netty.handler.codec.mqtt.MqttQoS qos;
        private boolean retained;
        private java.lang.String topic;

        PublishBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public io.netty.handler.codec.mqtt.MqttPublishMessage build() {
                r6 = this;
                io.netty.handler.codec.mqtt.MqttFixedHeader r0 = new io.netty.handler.codec.mqtt.MqttFixedHeader
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBLISH
                io.netty.handler.codec.mqtt.MqttQoS r3 = r6.qos
                boolean r4 = r6.retained
                r5 = 0
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                io.netty.handler.codec.mqtt.MqttPublishVariableHeader r1 = new io.netty.handler.codec.mqtt.MqttPublishVariableHeader
                java.lang.String r2 = r6.topic
                int r3 = r6.messageId
                r1.<init>(r2, r3)
                io.netty.handler.codec.mqtt.MqttPublishMessage r2 = new io.netty.handler.codec.mqtt.MqttPublishMessage
                io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.buffer()
                io.netty.buffer.ByteBuf r4 = r6.payload
                io.netty.buffer.ByteBuf r3 = r3.writeBytes(r4)
                r2.<init>(r0, r1, r3)
                return r2
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.PublishBuilder messageId(int r1) {
                r0 = this;
                r0.messageId = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.PublishBuilder payload(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                r0.payload = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.PublishBuilder qos(io.netty.handler.codec.mqtt.MqttQoS r1) {
                r0 = this;
                r0.qos = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.PublishBuilder retained(boolean r1) {
                r0 = this;
                r0.retained = r1
                return r0
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.PublishBuilder topicName(java.lang.String r1) {
                r0 = this;
                r0.topic = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SubscribeBuilder {
        private int messageId;
        private java.util.List<io.netty.handler.codec.mqtt.MqttTopicSubscription> subscriptions;

        SubscribeBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.SubscribeBuilder addSubscription(io.netty.handler.codec.mqtt.MqttQoS r3, java.lang.String r4) {
                r2 = this;
                java.util.List<io.netty.handler.codec.mqtt.MqttTopicSubscription> r0 = r2.subscriptions
                if (r0 != 0) goto Lc
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 5
                r0.<init>(r1)
                r2.subscriptions = r0
            Lc:
                java.util.List<io.netty.handler.codec.mqtt.MqttTopicSubscription> r0 = r2.subscriptions
                io.netty.handler.codec.mqtt.MqttTopicSubscription r1 = new io.netty.handler.codec.mqtt.MqttTopicSubscription
                r1.<init>(r4, r3)
                r0.add(r1)
                return r2
        }

        public io.netty.handler.codec.mqtt.MqttSubscribeMessage build() {
                r6 = this;
                io.netty.handler.codec.mqtt.MqttFixedHeader r0 = new io.netty.handler.codec.mqtt.MqttFixedHeader
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBSCRIBE
                io.netty.handler.codec.mqtt.MqttQoS r3 = io.netty.handler.codec.mqtt.MqttQoS.AT_LEAST_ONCE
                r4 = 0
                r5 = 0
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                int r1 = r6.messageId
                io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r1 = io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader.from(r1)
                io.netty.handler.codec.mqtt.MqttSubscribePayload r2 = new io.netty.handler.codec.mqtt.MqttSubscribePayload
                java.util.List<io.netty.handler.codec.mqtt.MqttTopicSubscription> r3 = r6.subscriptions
                r2.<init>(r3)
                io.netty.handler.codec.mqtt.MqttSubscribeMessage r3 = new io.netty.handler.codec.mqtt.MqttSubscribeMessage
                r3.<init>(r0, r1, r2)
                return r3
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.SubscribeBuilder messageId(int r1) {
                r0 = this;
                r0.messageId = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class UnsubscribeBuilder {
        private int messageId;
        private java.util.List<java.lang.String> topicFilters;

        UnsubscribeBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.UnsubscribeBuilder addTopicFilter(java.lang.String r3) {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.topicFilters
                if (r0 != 0) goto Lc
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 5
                r0.<init>(r1)
                r2.topicFilters = r0
            Lc:
                java.util.List<java.lang.String> r0 = r2.topicFilters
                r0.add(r3)
                return r2
        }

        public io.netty.handler.codec.mqtt.MqttUnsubscribeMessage build() {
                r6 = this;
                io.netty.handler.codec.mqtt.MqttFixedHeader r0 = new io.netty.handler.codec.mqtt.MqttFixedHeader
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBSCRIBE
                io.netty.handler.codec.mqtt.MqttQoS r3 = io.netty.handler.codec.mqtt.MqttQoS.AT_LEAST_ONCE
                r4 = 0
                r5 = 0
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                int r1 = r6.messageId
                io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r1 = io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader.from(r1)
                io.netty.handler.codec.mqtt.MqttUnsubscribePayload r2 = new io.netty.handler.codec.mqtt.MqttUnsubscribePayload
                java.util.List<java.lang.String> r3 = r6.topicFilters
                r2.<init>(r3)
                io.netty.handler.codec.mqtt.MqttUnsubscribeMessage r3 = new io.netty.handler.codec.mqtt.MqttUnsubscribeMessage
                r3.<init>(r0, r1, r2)
                return r3
        }

        public io.netty.handler.codec.mqtt.MqttMessageBuilders.UnsubscribeBuilder messageId(int r1) {
                r0 = this;
                r0.messageId = r1
                return r0
        }
    }

    private MqttMessageBuilders() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnAckBuilder connAck() {
            io.netty.handler.codec.mqtt.MqttMessageBuilders$ConnAckBuilder r0 = new io.netty.handler.codec.mqtt.MqttMessageBuilders$ConnAckBuilder
            r0.<init>()
            return r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder connect() {
            io.netty.handler.codec.mqtt.MqttMessageBuilders$ConnectBuilder r0 = new io.netty.handler.codec.mqtt.MqttMessageBuilders$ConnectBuilder
            r0.<init>()
            return r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessageBuilders.PublishBuilder publish() {
            io.netty.handler.codec.mqtt.MqttMessageBuilders$PublishBuilder r0 = new io.netty.handler.codec.mqtt.MqttMessageBuilders$PublishBuilder
            r0.<init>()
            return r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessageBuilders.SubscribeBuilder subscribe() {
            io.netty.handler.codec.mqtt.MqttMessageBuilders$SubscribeBuilder r0 = new io.netty.handler.codec.mqtt.MqttMessageBuilders$SubscribeBuilder
            r0.<init>()
            return r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessageBuilders.UnsubscribeBuilder unsubscribe() {
            io.netty.handler.codec.mqtt.MqttMessageBuilders$UnsubscribeBuilder r0 = new io.netty.handler.codec.mqtt.MqttMessageBuilders$UnsubscribeBuilder
            r0.<init>()
            return r0
    }
}
