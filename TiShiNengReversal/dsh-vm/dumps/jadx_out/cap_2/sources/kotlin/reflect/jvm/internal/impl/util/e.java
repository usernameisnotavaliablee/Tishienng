package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAttributeArrayOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeArrayOwner.kt\norg/jetbrains/kotlin/util/AttributeArrayOwner\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1573#2:104\n1604#2,3:105\n295#2,2:108\n1607#2:110\n*S KotlinDebug\n*F\n+ 1 AttributeArrayOwner.kt\norg/jetbrains/kotlin/util/AttributeArrayOwner\n*L\n76#1:104\n76#1:105,3\n77#1:108,2\n76#1:110\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e<K, T> extends kotlin.reflect.jvm.internal.impl.util.a<K, T> {

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.util.c<T> a;

    public e() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.util.i r0 = kotlin.reflect.jvm.internal.impl.util.i.a
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.g0.n(r0, r1)
            r2.<init>(r0)
            return
    }

    protected e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.c<T> r2) {
            r1 = this;
            java.lang.String r0 = "arrayMap"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    private final java.lang.String g(kotlin.reflect.jvm.internal.impl.util.c<T> r10, int r11, java.lang.String r12) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Race condition happened, the size of ArrayMap is "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but it isn't an `"
            r1.append(r11)
            r1.append(r12)
            r11 = 96
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.append(r11)
            r11 = 10
            r0.append(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Type: "
            r12.append(r1)
            java.lang.Class r1 = r10.getClass()
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            r0.append(r12)
            r0.append(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            kotlin.reflect.jvm.internal.impl.util.z r1 = r9.d()
            java.util.Map r1 = r1.b()
            java.lang.String r2 = "["
            r12.append(r2)
            r12.append(r11)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.f0.d0(r10, r11)
            r2.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
            r3 = 0
        L69:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r10.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L7a
            kotlin.collections.f0.b0()
        L7a:
            java.util.Set r6 = r1.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L82:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9c
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r3) goto L82
            goto L9d
        L9c:
            r7 = 0
        L9d:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "  "
            r6.append(r8)
            r6.append(r7)
            r7 = 91
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = "]: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r12.append(r3)
            r12.append(r11)
            r2.add(r12)
            r3 = r5
            goto L69
        Lcb:
            java.lang.String r10 = "]"
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Content: "
            r12.append(r1)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.util.c<T> a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.c<T> r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    protected final void e(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull T r5) {
            r3 = this;
            java.lang.String r0 = "keyQualifiedName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.util.z r0 = r3.d()
            int r4 = r0.e(r4)
            kotlin.reflect.jvm.internal.impl.util.c<T> r0 = r3.a
            int r0 = r0.a()
            if (r0 == 0) goto L5a
            r1 = 1
            if (r0 == r1) goto L1e
            goto L47
        L1e:
            kotlin.reflect.jvm.internal.impl.util.c<T> r0 = r3.a
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.g0.n(r0, r2)     // Catch: java.lang.ClassCastException -> L4d
            kotlin.reflect.jvm.internal.impl.util.o r0 = (kotlin.reflect.jvm.internal.impl.util.o) r0     // Catch: java.lang.ClassCastException -> L4d
            int r1 = r0.e()
            if (r1 != r4) goto L35
            kotlin.reflect.jvm.internal.impl.util.o r0 = new kotlin.reflect.jvm.internal.impl.util.o
            r0.<init>(r5, r4)
            r3.a = r0
            return
        L35:
            kotlin.reflect.jvm.internal.impl.util.d r1 = new kotlin.reflect.jvm.internal.impl.util.d
            r1.<init>()
            int r2 = r0.e()
            java.lang.Object r0 = r0.f()
            r1.d(r2, r0)
            r3.a = r1
        L47:
            kotlin.reflect.jvm.internal.impl.util.c<T> r0 = r3.a
            r0.d(r4, r5)
            return
        L4d:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r2 = "OneElementArrayMap"
            java.lang.String r0 = r3.g(r0, r1, r2)
            r5.<init>(r0, r4)
            throw r5
        L5a:
            kotlin.reflect.jvm.internal.impl.util.c<T> r0 = r3.a
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.util.i
            if (r1 == 0) goto L68
            kotlin.reflect.jvm.internal.impl.util.o r0 = new kotlin.reflect.jvm.internal.impl.util.o
            r0.<init>(r5, r4)
            r3.a = r0
            return
        L68:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 0
            java.lang.String r1 = "EmptyArrayMap"
            java.lang.String r5 = r3.g(r0, r5, r1)
            r4.<init>(r5)
            throw r4
    }
}
