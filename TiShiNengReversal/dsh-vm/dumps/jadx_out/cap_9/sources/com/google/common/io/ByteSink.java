package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ByteSink {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.io.ByteSink$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AsCharSink extends com.google.common.io.CharSink {
        private final java.nio.charset.Charset charset;
        final /* synthetic */ com.google.common.io.ByteSink this$0;

        private AsCharSink(com.google.common.io.ByteSink r1, java.nio.charset.Charset r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
                r0.charset = r1
                return
        }

        /* synthetic */ AsCharSink(com.google.common.io.ByteSink r1, java.nio.charset.Charset r2, com.google.common.io.ByteSink.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.io.CharSink
        public java.io.Writer openStream() throws java.io.IOException {
                r3 = this;
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
                com.google.common.io.ByteSink r1 = r3.this$0
                java.io.OutputStream r1 = r1.openStream()
                java.nio.charset.Charset r2 = r3.charset
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.io.ByteSink r1 = r2.this$0
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = ".asCharSink("
                r0.append(r1)
                java.nio.charset.Charset r1 = r2.charset
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    protected ByteSink() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.common.io.CharSink asCharSink(java.nio.charset.Charset r3) {
            r2 = this;
            com.google.common.io.ByteSink$AsCharSink r0 = new com.google.common.io.ByteSink$AsCharSink
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public java.io.OutputStream openBufferedStream() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.openStream()
            boolean r1 = r0 instanceof java.io.BufferedOutputStream
            if (r1 == 0) goto Lb
            java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
            return r0
        Lb:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            r1.<init>(r0)
            return r1
    }

    public abstract java.io.OutputStream openStream() throws java.io.IOException;

    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.OutputStream r1 = r2.openStream()     // Catch: java.lang.Throwable -> L1b
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1b
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch: java.lang.Throwable -> L1b
            r1.write(r3)     // Catch: java.lang.Throwable -> L1b
            r1.flush()     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r3 = move-exception
            java.lang.RuntimeException r3 = r0.rethrow(r3)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L21
        L21:
            r3 = move-exception
            r0.close()
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long writeFrom(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.OutputStream r1 = r4.openStream()     // Catch: java.lang.Throwable -> L1c
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1c
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch: java.lang.Throwable -> L1c
            long r2 = com.google.common.io.ByteStreams.copy(r5, r1)     // Catch: java.lang.Throwable -> L1c
            r1.flush()     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return r2
        L1c:
            r5 = move-exception
            java.lang.RuntimeException r5 = r0.rethrow(r5)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L22:
            r5 = move-exception
            r0.close()
            throw r5
    }
}
