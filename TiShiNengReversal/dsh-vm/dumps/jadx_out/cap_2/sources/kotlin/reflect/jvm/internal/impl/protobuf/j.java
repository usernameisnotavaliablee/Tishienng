package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class j {
    private kotlin.reflect.jvm.internal.impl.protobuf.d a;
    private kotlin.reflect.jvm.internal.impl.protobuf.f b;
    private volatile boolean c;
    protected volatile kotlin.reflect.jvm.internal.impl.protobuf.n d;

    protected void a(kotlin.reflect.jvm.internal.impl.protobuf.n r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r2.d
            if (r0 == 0) goto L5
            goto L26
        L5:
            monitor-enter(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r2.d     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r3 = move-exception
            goto L27
        Le:
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.a     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            if (r0 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.protobuf.p r3 = r3.getParserForType()     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.a     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = r2.b     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            java.lang.Object r3 = r3.c(r0, r1)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            r2.d = r3     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
            goto L25
        L23:
            r2.d = r3     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L25
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
        L26:
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public int b() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.d
            int r0 = r0.getSerializedSize()
            return r0
        Lb:
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.n c(kotlin.reflect.jvm.internal.impl.protobuf.n r1) {
            r0 = this;
            r0.a(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r0.d
            return r1
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.n d(kotlin.reflect.jvm.internal.impl.protobuf.n r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.d
            r1.d = r2
            r2 = 0
            r1.a = r2
            r2 = 1
            r1.c = r2
            return r0
    }
}
