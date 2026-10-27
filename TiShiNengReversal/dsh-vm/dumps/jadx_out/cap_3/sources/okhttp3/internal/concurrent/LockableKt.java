package okhttp3.internal.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class LockableKt {
    public LockableKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final void assertLockHeld(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L37:
            return
    }

    public static final void assertLockNotHeld(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L37:
            return
    }

    public static final void awaitNanos(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r8 / r0
            long r0 = r0 * r2
            long r0 = r8 - r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L1a
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L19
            goto L1a
        L19:
            return
        L1a:
            int r8 = (int) r0
            r7.wait(r2, r8)
            return
    }

    public static final void notify(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.notify()
            return
    }

    public static final void notifyAll(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.notifyAll()
            return
    }

    public static final void wait(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.wait()
            return
    }

    public static final <T> T withLock(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Lockable r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L18:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
