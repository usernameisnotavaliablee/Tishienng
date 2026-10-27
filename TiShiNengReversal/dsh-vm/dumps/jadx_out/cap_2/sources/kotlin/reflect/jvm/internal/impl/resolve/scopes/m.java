package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,261:1\n230#2,2:262\n295#2,2:264\n774#2:271\n865#2,2:272\n211#3,5:266\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n*L\n71#1:262,2\n74#1:264,2\n87#1:271\n87#1:272,2\n77#1:266,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m {
    @org.jetbrains.annotations.Nullable
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> a(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r2.next()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r1
            java.util.Set r1 = r1.f()
            if (r1 != 0) goto L22
            r2 = 0
            return r2
        L22:
            kotlin.collections.f0.s0(r0, r1)
            goto Le
        L26:
            return r0
    }
}
