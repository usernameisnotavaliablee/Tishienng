package kotlin.reflect.jvm.internal.impl.protobuf;

import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.n> implements kotlin.reflect.jvm.internal.impl.protobuf.p<MessageType> {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f a = null;

    static {
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = kotlin.reflect.jvm.internal.impl.protobuf.f.c()
            kotlin.reflect.jvm.internal.impl.protobuf.b.a = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private MessageType e(MessageType r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r1 = this;
            if (r2 == 0) goto L16
            boolean r0 = r2.isInitialized()
            if (r0 == 0) goto L9
            goto L16
        L9:
            kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r0 = r1.f(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r0.setUnfinishedMessage(r2)
            throw r2
        L16:
            return r2
    }

    private kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException f(MessageType r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.a
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.protobuf.a r2 = (kotlin.reflect.jvm.internal.impl.protobuf.a) r2
            kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r2 = r2.newUninitializedMessageException()
            return r2
        Lb:
            kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException
            r0.<init>(r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public /* bridge */ /* synthetic */ java.lang.Object a(java.io.InputStream r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.g(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public /* bridge */ /* synthetic */ java.lang.Object b(java.io.InputStream r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.h(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public /* bridge */ /* synthetic */ java.lang.Object c(kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.i(r1, r2)
            return r1
    }

    public MessageType g(java.io.InputStream r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.j(r1, r2)
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.e(r1)
            return r1
    }

    public MessageType h(java.io.InputStream r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.k(r1, r2)
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.e(r1)
            return r1
    }

    public MessageType i(kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.l(r1, r2)
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.e(r1)
            return r1
    }

    public MessageType j(java.io.InputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r2 = this;
            int r0 = r3.read()     // Catch: java.io.IOException -> L17
            r1 = -1
            if (r0 != r1) goto L9
            r3 = 0
            return r3
        L9:
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.e.B(r0, r3)     // Catch: java.io.IOException -> L17
            kotlin.reflect.jvm.internal.impl.protobuf.a$a$a r1 = new kotlin.reflect.jvm.internal.impl.protobuf.a$a$a
            r1.<init>(r3, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = r2.k(r1, r4)
            return r3
        L17:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r4 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r3 = r3.getMessage()
            r4.<init>(r3)
            throw r4
    }

    public MessageType k(java.io.InputStream r2, kotlin.reflect.jvm.internal.impl.protobuf.f r3) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.e r2 = kotlin.reflect.jvm.internal.impl.protobuf.e.g(r2)
            java.lang.Object r3 = r1.d(r2, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
            r0 = 0
            r2.a(r0)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            return r3
        Lf:
            r2 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r3)
            throw r2
    }

    public MessageType l(kotlin.reflect.jvm.internal.impl.protobuf.d r2, kotlin.reflect.jvm.internal.impl.protobuf.f r3) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.e r2 = r2.s()
            java.lang.Object r3 = r1.d(r2, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
            r0 = 0
            r2.a(r0)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            return r3
        Lf:
            r2 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r3)
            throw r2
    }
}
