package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class OpenSslSessionContext implements javax.net.ssl.SSLSessionContext {
    private static final java.util.Enumeration<byte[]> EMPTY = null;
    final io.netty.handler.ssl.ReferenceCountedOpenSslContext context;
    private final io.netty.handler.ssl.OpenSslKeyMaterialProvider provider;
    private final io.netty.handler.ssl.OpenSslSessionStats stats;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.OpenSslSessionContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class EmptyEnumeration implements java.util.Enumeration<byte[]> {
        private EmptyEnumeration() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ EmptyEnumeration(io.netty.handler.ssl.OpenSslSessionContext.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Enumeration
        public /* bridge */ /* synthetic */ byte[] nextElement() {
                r1 = this;
                byte[] r0 = r1.nextElement2()
                return r0
        }

        @Override // java.util.Enumeration
        /* renamed from: nextElement, reason: avoid collision after fix types in other method */
        public byte[] nextElement2() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            io.netty.handler.ssl.OpenSslSessionContext$EmptyEnumeration r0 = new io.netty.handler.ssl.OpenSslSessionContext$EmptyEnumeration
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.ssl.OpenSslSessionContext.EMPTY = r0
            return
    }

    OpenSslSessionContext(io.netty.handler.ssl.ReferenceCountedOpenSslContext r1, io.netty.handler.ssl.OpenSslKeyMaterialProvider r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.provider = r2
            io.netty.handler.ssl.OpenSslSessionStats r2 = new io.netty.handler.ssl.OpenSslSessionStats
            r2.<init>(r1)
            r0.stats = r2
            return
    }

    final void destroy() {
            r1 = this;
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r0 = r1.provider
            if (r0 == 0) goto L7
            r0.destroy()
        L7:
            return
    }

    @Override // javax.net.ssl.SSLSessionContext
    public java.util.Enumeration<byte[]> getIds() {
            r1 = this;
            java.util.Enumeration<byte[]> r0 = io.netty.handler.ssl.OpenSslSessionContext.EMPTY
            return r0
    }

    @Override // javax.net.ssl.SSLSessionContext
    public javax.net.ssl.SSLSession getSession(byte[] r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "bytes"
            r2.<init>(r0)
            throw r2
    }

    public abstract boolean isSessionCacheEnabled();

    public abstract void setSessionCacheEnabled(boolean r1);

    @java.lang.Deprecated
    public void setTicketKeys(byte[] r10) {
            r9 = this;
            int r0 = r10.length
            int r0 = r0 % 48
            if (r0 != 0) goto L50
            int r0 = r10.length
            int r0 = r0 / 48
            io.netty.internal.tcnative.SessionTicketKey[] r1 = new io.netty.internal.tcnative.SessionTicketKey[r0]
            r2 = 0
            r3 = 0
        Lc:
            if (r2 >= r0) goto L2c
            r4 = 16
            byte[] r5 = java.util.Arrays.copyOfRange(r10, r3, r4)
            int r6 = r3 + 16
            byte[] r7 = java.util.Arrays.copyOfRange(r10, r6, r4)
            int r8 = r2 + 16
            byte[] r4 = java.util.Arrays.copyOfRange(r10, r6, r4)
            int r3 = r3 + 32
            io.netty.internal.tcnative.SessionTicketKey r6 = new io.netty.internal.tcnative.SessionTicketKey
            r6.<init>(r5, r7, r4)
            r1[r8] = r6
            int r2 = r2 + 17
            goto Lc
        L2c:
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r10 = r9.context
            java.util.concurrent.locks.ReadWriteLock r10 = r10.ctxLock
            java.util.concurrent.locks.Lock r10 = r10.writeLock()
            r10.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r9.context     // Catch: java.lang.Throwable -> L4b
            long r2 = r0.ctx     // Catch: java.lang.Throwable -> L4b
            int r0 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TICKET     // Catch: java.lang.Throwable -> L4b
            io.netty.internal.tcnative.SSLContext.clearOptions(r2, r0)     // Catch: java.lang.Throwable -> L4b
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r9.context     // Catch: java.lang.Throwable -> L4b
            long r2 = r0.ctx     // Catch: java.lang.Throwable -> L4b
            io.netty.internal.tcnative.SSLContext.setSessionTicketKeys(r2, r1)     // Catch: java.lang.Throwable -> L4b
            r10.unlock()
            return
        L4b:
            r0 = move-exception
            r10.unlock()
            throw r0
        L50:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "keys.length % 48 != 0"
            r10.<init>(r0)
            throw r10
    }

    public void setTicketKeys(io.netty.handler.ssl.OpenSslSessionTicketKey... r5) {
            r4 = this;
            java.lang.String r0 = "keys"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            int r0 = r5.length
            io.netty.internal.tcnative.SessionTicketKey[] r1 = new io.netty.internal.tcnative.SessionTicketKey[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L14
            r3 = r5[r2]
            io.netty.internal.tcnative.SessionTicketKey r3 = r3.key
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L14:
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r5 = r4.context
            java.util.concurrent.locks.ReadWriteLock r5 = r5.ctxLock
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.lock()
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r4.context     // Catch: java.lang.Throwable -> L33
            long r2 = r0.ctx     // Catch: java.lang.Throwable -> L33
            int r0 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TICKET     // Catch: java.lang.Throwable -> L33
            io.netty.internal.tcnative.SSLContext.clearOptions(r2, r0)     // Catch: java.lang.Throwable -> L33
            io.netty.handler.ssl.ReferenceCountedOpenSslContext r0 = r4.context     // Catch: java.lang.Throwable -> L33
            long r2 = r0.ctx     // Catch: java.lang.Throwable -> L33
            io.netty.internal.tcnative.SSLContext.setSessionTicketKeys(r2, r1)     // Catch: java.lang.Throwable -> L33
            r5.unlock()
            return
        L33:
            r0 = move-exception
            r5.unlock()
            throw r0
    }

    public io.netty.handler.ssl.OpenSslSessionStats stats() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSessionStats r0 = r1.stats
            return r0
    }
}
