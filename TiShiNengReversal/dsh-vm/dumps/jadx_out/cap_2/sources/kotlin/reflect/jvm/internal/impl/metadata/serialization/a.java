package kotlin.reflect.jvm.internal.impl.metadata.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInterner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/metadata/serialization/Interner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1#2:31\n1056#3:32\n*S KotlinDebug\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/metadata/serialization/Interner\n*L\n13#1:32\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a<T> {

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.metadata.serialization.a<T> a;
    private final int b;

    @org.jetbrains.annotations.NotNull
    private final java.util.HashMap<T, java.lang.Integer> c;

    private final java.lang.Integer a(T r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.serialization.a<T> r0 = r2.a
            if (r0 == 0) goto L11
            java.util.HashMap<T, java.lang.Integer> r0 = r0.c
            int r0 = r0.size()
            kotlin.reflect.jvm.internal.impl.metadata.serialization.a<T> r1 = r2.a
            int r1 = r1.b
            int r0 = r0 + r1
            int r1 = r2.b
        L11:
            kotlin.reflect.jvm.internal.impl.metadata.serialization.a<T> r0 = r2.a
            if (r0 == 0) goto L1d
            java.lang.Integer r0 = r0.a(r3)
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            java.util.HashMap<T, java.lang.Integer> r0 = r2.c
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
    }

    public final int b(T r4) {
            r3 = this;
            java.lang.Integer r0 = r3.a(r4)
            if (r0 == 0) goto Lb
            int r4 = r0.intValue()
            return r4
        Lb:
            int r0 = r3.b
            java.util.HashMap<T, java.lang.Integer> r1 = r3.c
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.HashMap<T, java.lang.Integer> r1 = r3.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r4, r2)
            return r0
    }
}
