package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface l<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {589}, m = "next", n = {"$this"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.channels.l$a$a, reason: collision with other inner class name */
        static final class C0083a<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            /* synthetic */ java.lang.Object b;
            int c;

            C0083a(kotlin.coroutines.e<? super kotlinx.coroutines.channels.l.a.C0083a> r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.b = r2
                    int r2 = r1.c
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.c = r2
                    r2 = 0
                    java.lang.Object r2 = kotlinx.coroutines.channels.l.a.a(r2, r1)
                    return r2
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @kotlin.jvm.JvmName(name = "next")
        public static /* synthetic */ java.lang.Object a(kotlinx.coroutines.channels.l r4, kotlin.coroutines.e r5) {
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.l.a.C0083a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.l$a$a r0 = (kotlinx.coroutines.channels.l.a.C0083a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.l$a$a r0 = new kotlinx.coroutines.channels.l$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.a
                kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.l) r4
                kotlin.g0.n(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.g0.n(r5)
                r0.a = r4
                r0.c = r3
                java.lang.Object r5 = r4.c(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                kotlinx.coroutines.channels.ClosedReceiveChannelException r4 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @kotlin.jvm.JvmName(name = "next")
    /* synthetic */ java.lang.Object a(kotlin.coroutines.e r1);

    @org.jetbrains.annotations.Nullable
    java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r1);

    E next();
}
