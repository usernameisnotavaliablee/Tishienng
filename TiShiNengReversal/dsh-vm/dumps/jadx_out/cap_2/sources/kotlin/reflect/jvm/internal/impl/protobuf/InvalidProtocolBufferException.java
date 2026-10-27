package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private kotlin.reflect.jvm.internal.impl.protobuf.n unfinishedMessage;

    public InvalidProtocolBufferException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.unfinishedMessage = r1
            return
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidEndTag() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidTag() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidUtf8() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidWireType() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException malformedVarint() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException negativeSize() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException recursionLimitExceeded() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException sizeLimitExceeded() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException truncatedMessage() {
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.n getUnfinishedMessage() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.unfinishedMessage
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException setUnfinishedMessage(kotlin.reflect.jvm.internal.impl.protobuf.n r1) {
            r0 = this;
            r0.unfinishedMessage = r1
            return r0
    }
}
