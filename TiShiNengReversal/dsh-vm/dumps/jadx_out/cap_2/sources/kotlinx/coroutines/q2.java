package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1364#1:1455,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q2 extends kotlinx.coroutines.internal.w implements kotlinx.coroutines.y1 {
    public q2() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String D(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "List{"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "}["
            r0.append(r5)
            java.lang.Object r5 = r4.n()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r5, r1)
            kotlinx.coroutines.internal.y r5 = (kotlinx.coroutines.internal.y) r5
            r1 = 1
        L1e:
            boolean r2 = kotlin.jvm.internal.g0.g(r5, r4)
            if (r2 != 0) goto L3c
            boolean r2 = r5 instanceof kotlinx.coroutines.k2
            if (r2 == 0) goto L37
            r2 = r5
            kotlinx.coroutines.k2 r2 = (kotlinx.coroutines.k2) r2
            if (r1 == 0) goto L2f
            r1 = 0
            goto L34
        L2f:
            java.lang.String r3 = ", "
            r0.append(r3)
        L34:
            r0.append(r2)
        L37:
            kotlinx.coroutines.internal.y r5 = r5.o()
            goto L1e
        L3c:
            java.lang.String r5 = "]"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r5, r0)
            return r5
    }

    @Override // kotlinx.coroutines.y1
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.q2 a() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.y1
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.internal.y
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
