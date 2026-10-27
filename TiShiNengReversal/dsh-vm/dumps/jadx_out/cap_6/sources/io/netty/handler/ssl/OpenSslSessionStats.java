package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslSessionStats {
    private final io.netty.handler.ssl.ReferenceCountedOpenSslContext context;

    OpenSslSessionStats(io.netty.handler.ssl.ReferenceCountedOpenSslContext r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    public long accept() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionAccept(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long acceptGood() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionAcceptGood(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long acceptRenegotiate() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionAcceptRenegotiate(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long cacheFull() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionCacheFull(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long cbHits() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionCbHits(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long connect() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionConnect(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long connectGood() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionConnectGood(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long connectRenegotiate() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionConnectRenegotiate(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long hits() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionHits(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long misses() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionMisses(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long number() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionNumber(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long ticketKeyFail() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionTicketKeyFail(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long ticketKeyNew() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionTicketKeyNew(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long ticketKeyRenew() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionTicketKeyRenew(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long ticketKeyResume() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionTicketKeyResume(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public long timeouts() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            long r1 = io.netty.internal.tcnative.SSLContext.sessionTimeouts(r1)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r1
        L17:
            r1 = move-exception
            r0.unlock()
            throw r1
    }
}
