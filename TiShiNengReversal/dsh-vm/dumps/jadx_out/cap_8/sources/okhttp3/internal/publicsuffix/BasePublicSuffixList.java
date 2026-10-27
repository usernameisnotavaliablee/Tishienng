package okhttp3.internal.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BasePublicSuffixList implements okhttp3.internal.publicsuffix.PublicSuffixList {
    public okio.ByteString bytes;
    public okio.ByteString exceptionBytes;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean listRead;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.CountDownLatch readCompleteLatch;

    @org.jetbrains.annotations.Nullable
    private java.io.IOException readFailure;

    public BasePublicSuffixList() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.listRead = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.readCompleteLatch = r0
            return
    }

    private final void readTheList() throws java.io.IOException {
            r4 = this;
            okio.Source r0 = r4.listSource()     // Catch: java.lang.Throwable -> L34
            okio.BufferedSource r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L34
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L39
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L39
            okio.ByteString r1 = r0.readByteString(r1)     // Catch: java.lang.Throwable -> L39
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L39
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L39
            okio.ByteString r2 = r0.readByteString(r2)     // Catch: java.lang.Throwable -> L39
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L39
            r3 = 0
            kotlin.io.b.a(r0, r3)     // Catch: java.lang.Throwable -> L34
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L36
            r4.setBytes(r1)     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Throwable -> L36
            r4.setExceptionBytes(r2)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.CountDownLatch r0 = r4.readCompleteLatch
            r0.countDown()
            return
        L34:
            r0 = move-exception
            goto L40
        L36:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L39:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            kotlin.io.b.a(r0, r1)     // Catch: java.lang.Throwable -> L34
            throw r2     // Catch: java.lang.Throwable -> L34
        L40:
            java.util.concurrent.CountDownLatch r1 = r4.readCompleteLatch
            r1.countDown()
            throw r0
    }

    private final void readTheListUninterruptibly() {
            r2 = this;
            r0 = 0
        L1:
            r2.readTheList()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10 java.io.InterruptedIOException -> L17
            if (r0 == 0) goto L16
        L6:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L16
        Le:
            r1 = move-exception
            goto L1c
        L10:
            r1 = move-exception
            r2.readFailure = r1     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L16
            goto L6
        L16:
            return
        L17:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            goto L1
        L1c:
            if (r0 == 0) goto L25
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L25:
            throw r1
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.listRead
            boolean r0 = r0.get()
            if (r0 != 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.listRead
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L16
            r3.readTheListUninterruptibly()
            goto L23
        L16:
            java.util.concurrent.CountDownLatch r0 = r3.readCompleteLatch     // Catch: java.lang.InterruptedException -> L1c
            r0.await()     // Catch: java.lang.InterruptedException -> L1c
            goto L23
        L1c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L23:
            okio.ByteString r0 = r3.bytes
            if (r0 == 0) goto L28
            return
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load "
            r1.append(r2)
            java.lang.Object r2 = r3.getPath()
            r1.append(r2)
            java.lang.String r2 = " resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.IOException r1 = r3.readFailure
            r0.initCause(r1)
            throw r0
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    @org.jetbrains.annotations.NotNull
    public okio.ByteString getBytes() {
            r1 = this;
            okio.ByteString r0 = r1.bytes
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    @org.jetbrains.annotations.NotNull
    public okio.ByteString getExceptionBytes() {
            r1 = this;
            okio.ByteString r0 = r1.exceptionBytes
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "exceptionBytes"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.Object getPath();

    @org.jetbrains.annotations.NotNull
    public abstract okio.Source listSource();

    public void setBytes(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.bytes = r2
            return
    }

    public void setExceptionBytes(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.exceptionBytes = r2
            return
    }
}
