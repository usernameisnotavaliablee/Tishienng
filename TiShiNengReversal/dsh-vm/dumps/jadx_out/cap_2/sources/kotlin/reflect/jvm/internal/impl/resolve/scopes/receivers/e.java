package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.g, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d c;

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e r3) {
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            if (r3 != 0) goto Ld
            r3 = r1
        Ld:
            r1.b = r3
            r1.c = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.a
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e
            r2 = 0
            if (r1 == 0) goto La
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e r4 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e) r4
            goto Lb
        La:
            r4 = r2
        Lb:
            if (r4 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r4.a
        Lf:
            boolean r4 = kotlin.jvm.internal.g0.g(r0, r2)
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            java.lang.String r1 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.getType()
            return r0
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j
    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.d m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class{"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.getType()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
