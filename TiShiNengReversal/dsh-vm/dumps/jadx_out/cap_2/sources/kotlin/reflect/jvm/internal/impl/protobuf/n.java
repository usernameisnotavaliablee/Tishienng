package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface n extends kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a extends java.lang.Cloneable, kotlin.reflect.jvm.internal.impl.protobuf.o {
        kotlin.reflect.jvm.internal.impl.protobuf.n build();

        kotlin.reflect.jvm.internal.impl.protobuf.n.a d(kotlin.reflect.jvm.internal.impl.protobuf.e r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws java.io.IOException;
    }

    kotlin.reflect.jvm.internal.impl.protobuf.p<? extends kotlin.reflect.jvm.internal.impl.protobuf.n> getParserForType();

    int getSerializedSize();

    kotlin.reflect.jvm.internal.impl.protobuf.n.a newBuilderForType();

    kotlin.reflect.jvm.internal.impl.protobuf.n.a toBuilder();

    byte[] toByteArray();

    void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1) throws java.io.IOException;
}
