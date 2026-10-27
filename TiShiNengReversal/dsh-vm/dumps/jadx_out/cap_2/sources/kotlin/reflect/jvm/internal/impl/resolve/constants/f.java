package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.b a;
    private final int b;

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, int r3) {
            r1 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r5 = (kotlin.reflect.jvm.internal.impl.resolve.constants.f) r5
            kotlin.reflect.jvm.internal.impl.name.b r1 = r4.a
            kotlin.reflect.jvm.internal.impl.name.b r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.b
            int r5 = r5.b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.b
            r2 = 0
            r3 = 0
        L9:
            if (r3 >= r1) goto L13
            java.lang.String r4 = "kotlin/Array<"
            r0.append(r4)
            int r3 = r3 + 1
            goto L9
        L13:
            kotlin.reflect.jvm.internal.impl.name.b r1 = r5.a
            r0.append(r1)
            int r1 = r5.b
        L1a:
            if (r2 >= r1) goto L24
            java.lang.String r3 = ">"
            r0.append(r3)
            int r2 = r2 + 1
            goto L1a
        L24:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
