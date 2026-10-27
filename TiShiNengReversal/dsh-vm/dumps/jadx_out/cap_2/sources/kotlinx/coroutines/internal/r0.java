package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1735#2,6:217\n12744#2,2:225\n1627#2,6:229\n12744#2,2:235\n1627#2,6:238\n37#3,2:223\n26#4:227\n26#4:228\n1#5:237\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:217,6\n131#1:225,2\n141#1:229,6\n173#1:235,2\n194#1:238,6\n106#1:223,2\n133#1:227\n135#1:228\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r0 {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.StackTraceElement c = null;
    private static final java.lang.String d = null;
    private static final java.lang.String e = null;

    static {
            _COROUTINE.a r0 = new _COROUTINE.a
            r0.<init>()
            java.lang.StackTraceElement r0 = r0.a()
            kotlinx.coroutines.internal.r0.c = r0
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L18
            java.lang.Class<kotlin.coroutines.jvm.internal.BaseContinuationImpl> r0 = kotlin.coroutines.jvm.internal.BaseContinuationImpl.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> L18
            goto L23
        L18:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
        L23:
            java.lang.Throwable r1 = kotlin.Result.m14exceptionOrNullimpl(r0)
            if (r1 != 0) goto L2a
            goto L2c
        L2a:
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
        L2c:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.r0.d = r0
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<kotlinx.coroutines.internal.r0> r0 = kotlinx.coroutines.internal.r0.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> L3d
            goto L48
        L3d:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
        L48:
            java.lang.Throwable r1 = kotlin.Result.m14exceptionOrNullimpl(r0)
            if (r1 != 0) goto L4f
            goto L51
        L4f:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L51:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.r0.e = r0
            return
    }

    public static /* synthetic */ void a() {
            return
    }

    public static /* synthetic */ void b() {
            return
    }

    public static final /* synthetic */ java.lang.Throwable c(java.lang.Throwable r0, kotlin.coroutines.jvm.internal.c r1) {
            java.lang.Throwable r0 = n(r0, r1)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.Pair<E, java.lang.StackTraceElement[]> d(E r6) {
            java.lang.Throwable r0 = r6.getCause()
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r6.getClass()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L34
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()
            int r3 = r2.length
            r4 = 0
        L1b:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]
            boolean r5 = j(r5)
            if (r5 == 0) goto L2a
            kotlin.Pair r6 = kotlin.o0.a(r0, r2)
            return r6
        L2a:
            int r4 = r4 + 1
            goto L1b
        L2d:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r6 = kotlin.o0.a(r6, r0)
            return r6
        L34:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r6 = kotlin.o0.a(r6, r0)
            return r6
    }

    private static final <E extends java.lang.Throwable> E e(E r5, E r6, java.util.ArrayDeque<java.lang.StackTraceElement> r7) {
            java.lang.StackTraceElement r0 = kotlinx.coroutines.internal.r0.c
            r7.addFirst(r0)
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            java.lang.String r0 = kotlinx.coroutines.internal.r0.d
            int r0 = h(r5, r0)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L1f
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r2]
            java.lang.Object[] r5 = r7.toArray(r5)
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            r6.setStackTrace(r5)
            return r6
        L1f:
            int r1 = r7.size()
            int r1 = r1 + r0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r3 = 0
        L27:
            if (r3 >= r0) goto L30
            r4 = r5[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L27
        L30:
            java.util.Iterator r5 = r7.iterator()
        L34:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L47
            int r7 = r2 + 1
            java.lang.Object r3 = r5.next()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            int r2 = r2 + r0
            r1[r2] = r3
            r2 = r7
            goto L34
        L47:
            r6.setStackTrace(r1)
            return r6
    }

    private static final java.util.ArrayDeque<java.lang.StackTraceElement> f(kotlin.coroutines.jvm.internal.c r2) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto Le
            r0.add(r1)
        Le:
            kotlin.coroutines.jvm.internal.c r2 = r2.getCallerFrame()
            if (r2 != 0) goto L15
            return r0
        L15:
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto Le
            r0.add(r1)
            goto Le
    }

    private static final boolean g(java.lang.StackTraceElement r2, java.lang.StackTraceElement r3) {
            int r0 = r2.getLineNumber()
            int r1 = r3.getLineNumber()
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.getMethodName()
            java.lang.String r1 = r3.getMethodName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getFileName()
            java.lang.String r1 = r3.getFileName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r2 = r2.getClassName()
            java.lang.String r3 = r3.getClassName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L36
            r2 = 1
            return r2
        L36:
            r2 = 0
            return r2
    }

    private static final int h(java.lang.StackTraceElement[] r3, java.lang.String r4) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r3[r1]
            java.lang.String r2 = r2.getClassName()
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r2 == 0) goto L11
            return r1
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            r3 = -1
            return r3
    }

    public static final void i(@org.jetbrains.annotations.NotNull java.lang.Throwable r0, @org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0.initCause(r1)
            return
    }

    public static final boolean j(@org.jetbrains.annotations.NotNull java.lang.StackTraceElement r4) {
            java.lang.String r4 = r4.getClassName()
            java.lang.String r0 = _COROUTINE.b.c()
            r1 = 2
            r2 = 0
            r3 = 0
            boolean r4 = kotlin.text.u.H2(r4, r0, r3, r1, r2)
            return r4
    }

    private static final void k(java.lang.StackTraceElement[] r4, java.util.ArrayDeque<java.lang.StackTraceElement> r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r2 = j(r2)
            if (r2 == 0) goto Ld
            goto L11
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r1 = -1
        L11:
            int r1 = r1 + 1
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r1 > r0) goto L33
        L18:
            r2 = r4[r0]
            java.lang.Object r3 = r5.getLast()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            boolean r2 = g(r2, r3)
            if (r2 == 0) goto L29
            r5.removeLast()
        L29:
            r2 = r4[r0]
            r5.addFirst(r2)
            if (r0 == r1) goto L33
            int r0 = r0 + (-1)
            goto L18
        L33:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object l(@org.jetbrains.annotations.NotNull java.lang.Throwable r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r1) {
            throw r0
    }

    private static final java.lang.Object m(java.lang.Throwable r0, kotlin.coroutines.e<?> r1) {
            throw r0
    }

    private static final <E extends java.lang.Throwable> E n(E r4, kotlin.coroutines.jvm.internal.c r5) {
            kotlin.Pair r0 = d(r4)
            java.lang.Object r1 = r0.component1()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.component2()
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            java.lang.Throwable r2 = kotlinx.coroutines.internal.n.g(r1)
            if (r2 != 0) goto L17
            goto L21
        L17:
            java.util.ArrayDeque r5 = f(r5)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L22
        L21:
            return r4
        L22:
            if (r1 == r4) goto L27
            k(r0, r5)
        L27:
            java.lang.Throwable r4 = e(r1, r2, r5)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E o(@org.jetbrains.annotations.NotNull E r0) {
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E p(@org.jetbrains.annotations.NotNull E r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r1) {
            return r0
    }

    private static final <E extends java.lang.Throwable> E q(E r7) {
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            int r1 = r0.length
            int r2 = r0.length
            r3 = -1
            int r2 = r2 + r3
            if (r2 < 0) goto L20
        La:
            int r4 = r2 + (-1)
            r5 = r0[r2]
            java.lang.String r6 = kotlinx.coroutines.internal.r0.e
            java.lang.String r5 = r5.getClassName()
            boolean r5 = kotlin.jvm.internal.g0.g(r6, r5)
            if (r5 == 0) goto L1b
            goto L21
        L1b:
            if (r4 >= 0) goto L1e
            goto L20
        L1e:
            r2 = r4
            goto La
        L20:
            r2 = -1
        L21:
            int r4 = r2 + 1
            java.lang.String r5 = kotlinx.coroutines.internal.r0.d
            int r5 = h(r0, r5)
            r6 = 0
            if (r5 != r3) goto L2e
            r3 = 0
            goto L30
        L2e:
            int r3 = r1 - r5
        L30:
            int r1 = r1 - r2
            int r1 = r1 - r3
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r1]
        L34:
            if (r6 >= r1) goto L46
            if (r6 != 0) goto L3b
            java.lang.StackTraceElement r3 = kotlinx.coroutines.internal.r0.c
            goto L41
        L3b:
            int r3 = r4 + r6
            int r3 = r3 + (-1)
            r3 = r0[r3]
        L41:
            r2[r6] = r3
            int r6 = r6 + 1
            goto L34
        L46:
            r7.setStackTrace(r2)
            return r7
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E r(@org.jetbrains.annotations.NotNull E r0) {
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E s(@org.jetbrains.annotations.NotNull E r5) {
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L29
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = r5.getClass()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L15
            goto L29
        L15:
            java.lang.StackTraceElement[] r1 = r5.getStackTrace()
            int r2 = r1.length
            r3 = 0
        L1b:
            if (r3 >= r2) goto L29
            r4 = r1[r3]
            boolean r4 = j(r4)
            if (r4 == 0) goto L26
            return r0
        L26:
            int r3 = r3 + 1
            goto L1b
        L29:
            return r5
    }
}
