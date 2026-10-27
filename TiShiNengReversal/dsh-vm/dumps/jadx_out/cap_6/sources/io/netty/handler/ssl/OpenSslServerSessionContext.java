package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslServerSessionContext extends io.netty.handler.ssl.OpenSslSessionContext {
    OpenSslServerSessionContext(io.netty.handler.ssl.ReferenceCountedOpenSslContext r1, io.netty.handler.ssl.OpenSslKeyMaterialProvider r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionCacheSize() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L18
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L18
            long r1 = io.netty.internal.tcnative.SSLContext.getSessionCacheSize(r1)     // Catch: java.lang.Throwable -> L18
            int r2 = (int) r1
            r0.unlock()
            return r2
        L18:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionTimeout() {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L18
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L18
            long r1 = io.netty.internal.tcnative.SSLContext.getSessionCacheTimeout(r1)     // Catch: java.lang.Throwable -> L18
            int r2 = (int) r1
            r0.unlock()
            return r2
        L18:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // io.netty.handler.ssl.OpenSslSessionContext
    public boolean isSessionCacheEnabled() {
            r6 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r6.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r6.context     // Catch: java.lang.Throwable -> L20
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L20
            long r1 = io.netty.internal.tcnative.SSLContext.getSessionCacheMode(r1)     // Catch: java.lang.Throwable -> L20
            long r3 = io.netty.internal.tcnative.SSL.SSL_SESS_CACHE_SERVER     // Catch: java.lang.Throwable -> L20
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.unlock()
            return r1
        L20:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // io.netty.handler.ssl.OpenSslSessionContext
    public void setSessionCacheEnabled(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            long r0 = io.netty.internal.tcnative.SSL.SSL_SESS_CACHE_SERVER
            goto L7
        L5:
            long r0 = io.netty.internal.tcnative.SSL.SSL_SESS_CACHE_OFF
        L7:
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r5 = r4.context
            java.util.concurrent.locks.ReadWriteLock r5 = r5.ctxLock
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r2 = r4.context     // Catch: java.lang.Throwable -> L1d
            long r2 = r2.ctx     // Catch: java.lang.Throwable -> L1d
            io.netty.internal.tcnative.SSLContext.setSessionCacheMode(r2, r0)     // Catch: java.lang.Throwable -> L1d
            r5.unlock()
            return
        L1d:
            r0 = move-exception
            r5.unlock()
            throw r0
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionCacheSize(int r6) {
            r5 = this;
            if (r6 < 0) goto L1e
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r5.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r5.context     // Catch: java.lang.Throwable -> L19
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L19
            long r3 = (long) r6     // Catch: java.lang.Throwable -> L19
            io.netty.internal.tcnative.SSLContext.setSessionCacheSize(r1, r3)     // Catch: java.lang.Throwable -> L19
            r0.unlock()
            return
        L19:
            r6 = move-exception
            r0.unlock()
            throw r6
        L1e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
    }

    public boolean setSessionIdContext(byte[] r4) {
            r3 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r3.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r3.context     // Catch: java.lang.Throwable -> L17
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L17
            boolean r4 = io.netty.internal.tcnative.SSLContext.setSessionIdContext(r1, r4)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return r4
        L17:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionTimeout(int r6) {
            r5 = this;
            if (r6 < 0) goto L1e
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r5.context
            java.util.concurrent.locks.ReadWriteLock r0 = r0.ctxLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r1 = r5.context     // Catch: java.lang.Throwable -> L19
            long r1 = r1.ctx     // Catch: java.lang.Throwable -> L19
            long r3 = (long) r6     // Catch: java.lang.Throwable -> L19
            io.netty.internal.tcnative.SSLContext.setSessionCacheTimeout(r1, r3)     // Catch: java.lang.Throwable -> L19
            r0.unlock()
            return
        L19:
            r6 = move-exception
            r0.unlock()
            throw r6
        L1e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
    }
}
