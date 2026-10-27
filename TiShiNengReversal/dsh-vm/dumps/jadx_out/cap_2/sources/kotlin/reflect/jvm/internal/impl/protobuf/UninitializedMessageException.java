package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private final java.util.List<java.lang.String> missingFields;

    public UninitializedMessageException(kotlin.reflect.jvm.internal.impl.protobuf.n r1) {
            r0 = this;
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            r1 = 0
            r0.missingFields = r1
            return
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            return r0
    }
}
