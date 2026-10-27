package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SafeCollector_commonKt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.i.b, java.lang.Integer> {
        final /* synthetic */ kotlinx.coroutines.flow.internal.SafeCollector<?> a;

        a(kotlinx.coroutines.flow.internal.SafeCollector<?> r1) {
                r0 = this;
                r0.a = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Integer a(int r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r5) {
                r3 = this;
                kotlin.coroutines.i$c r0 = r5.getKey()
                kotlinx.coroutines.flow.internal.SafeCollector<?> r1 = r3.a
                kotlin.coroutines.i r1 = r1.collectContext
                kotlin.coroutines.i$b r1 = r1.get(r0)
                kotlinx.coroutines.e2$b r2 = kotlinx.coroutines.e2.s0
                if (r0 == r2) goto L1c
                if (r5 == r1) goto L15
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L17
            L15:
                int r4 = r4 + 1
            L17:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                return r4
            L1c:
                kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.Job"
                kotlin.jvm.internal.g0.n(r5, r0)
                kotlinx.coroutines.e2 r5 = (kotlinx.coroutines.e2) r5
                kotlinx.coroutines.e2 r5 = kotlinx.coroutines.flow.internal.SafeCollector_commonKt.b(r5, r1)
                if (r5 != r1) goto L35
                if (r1 != 0) goto L2e
                goto L30
            L2e:
                int r4 = r4 + 1
            L30:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                return r4
            L35:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", expected child of "
                r0.append(r5)
                r0.append(r1)
                java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                java.lang.Integer r1 = r0.a(r1, r2)
                return r1
        }
    }

    @kotlin.jvm.JvmName(name = "checkContext")
    public static final void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.internal.SafeCollector<?> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt$a r1 = new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$a
            r1.<init>(r3)
            java.lang.Object r0 = r4.fold(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r3.collectContextSize
            if (r0 != r1) goto L19
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Flow invariant is violated:\n\t\tFlow was collected in "
            r1.append(r2)
            kotlin.coroutines.i r3 = r3.collectContext
            r1.append(r3)
            java.lang.String r3 = ",\n\t\tbut emission happened in "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.e2 b(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r2) {
        L0:
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r1 != r2) goto L7
            goto Lb
        L7:
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.o0
            if (r0 != 0) goto Lc
        Lb:
            return r1
        Lc:
            kotlinx.coroutines.e2 r1 = r1.getParent()
            goto L0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1
            r0.<init>(r1)
            return r0
    }
}
