package kotlin.reflect.jvm.internal.impl.metadata.serialization;

import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e<Element extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<?, Element>> {

    @org.jetbrains.annotations.NotNull
    private final Element a;

    @org.jetbrains.annotations.NotNull
    private final byte[] b;
    private final int c;

    public e(@org.jetbrains.annotations.NotNull Element r2) {
            r1 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r2.build()
            byte[] r2 = r2.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.b = r2
            int r2 = java.util.Arrays.hashCode(r2)
            r1.c = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.serialization.e
            if (r0 == 0) goto L12
            byte[] r0 = r1.b
            kotlin.reflect.jvm.internal.impl.metadata.serialization.e r2 = (kotlin.reflect.jvm.internal.impl.metadata.serialization.e) r2
            byte[] r2 = r2.b
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.c
            return r0
    }
}
