package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f1 extends kotlinx.coroutines.internal.k {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.f1 a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.locks.ReentrantReadWriteLock b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> c = null;

    static {
            kotlinx.coroutines.internal.f1 r0 = new kotlinx.coroutines.internal.f1
            r0.<init>()
            kotlinx.coroutines.internal.f1.a = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            kotlinx.coroutines.internal.f1.b = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            kotlinx.coroutines.internal.f1.c = r0
            return
    }

    private f1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.k
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> a(@org.jetbrains.annotations.NotNull java.lang.Class<? extends java.lang.Throwable> r7) {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.internal.f1.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r2 = kotlinx.coroutines.internal.f1.c     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L6e
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L6e
            r1.unlock()
            if (r2 == 0) goto L17
            return r2
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L27
            int r2 = r0.getReadHoldCount()
            goto L28
        L27:
            r2 = 0
        L28:
            r4 = 0
        L29:
            if (r4 >= r2) goto L31
            r1.unlock()
            int r4 = r4 + 1
            goto L29
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r4 = kotlinx.coroutines.internal.f1.c     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r4.get(r7)     // Catch: java.lang.Throwable -> L61
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L4e
        L42:
            if (r3 >= r2) goto L4a
            r1.lock()
            int r3 = r3 + 1
            goto L42
        L4a:
            r0.unlock()
            return r5
        L4e:
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.internal.n.a(r7)     // Catch: java.lang.Throwable -> L61
            r4.put(r7, r5)     // Catch: java.lang.Throwable -> L61
        L55:
            if (r3 >= r2) goto L5d
            r1.lock()
            int r3 = r3 + 1
            goto L55
        L5d:
            r0.unlock()
            return r5
        L61:
            r7 = move-exception
        L62:
            if (r3 >= r2) goto L6a
            r1.lock()
            int r3 = r3 + 1
            goto L62
        L6a:
            r0.unlock()
            throw r7
        L6e:
            r7 = move-exception
            r1.unlock()
            throw r7
    }
}
