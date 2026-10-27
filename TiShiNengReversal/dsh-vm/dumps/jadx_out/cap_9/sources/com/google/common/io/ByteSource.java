package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ByteSource {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class AsCharSource extends com.google.common.io.CharSource {
        final java.nio.charset.Charset charset;
        final /* synthetic */ com.google.common.io.ByteSource this$0;

        AsCharSource(com.google.common.io.ByteSource r1, java.nio.charset.Charset r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
                r0.charset = r1
                return
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.io.ByteSource asByteSource(java.nio.charset.Charset r2) {
                r1 = this;
                java.nio.charset.Charset r0 = r1.charset
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lb
                com.google.common.io.ByteSource r2 = r1.this$0
                return r2
            Lb:
                com.google.common.io.ByteSource r2 = super.asByteSource(r2)
                return r2
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() throws java.io.IOException {
                r3 = this;
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                com.google.common.io.ByteSource r1 = r3.this$0
                java.io.InputStream r1 = r1.openStream()
                java.nio.charset.Charset r2 = r3.charset
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String read() throws java.io.IOException {
                r3 = this;
                java.lang.String r0 = new java.lang.String
                com.google.common.io.ByteSource r1 = r3.this$0
                byte[] r1 = r1.read()
                java.nio.charset.Charset r2 = r3.charset
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.io.ByteSource r1 = r2.this$0
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = ".asCharSource("
                r0.append(r1)
                java.nio.charset.Charset r1 = r2.charset
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteArrayByteSource extends com.google.common.io.ByteSource {
        final byte[] bytes;
        final int length;
        final int offset;

        ByteArrayByteSource(byte[] r3) {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                r2.<init>(r3, r0, r1)
                return
        }

        ByteArrayByteSource(byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.bytes = r1
                r0.offset = r2
                r0.length = r3
                return
        }

        @Override // com.google.common.io.ByteSource
        public long copyTo(java.io.OutputStream r4) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.offset
                int r2 = r3.length
                r4.write(r0, r1, r2)
                int r4 = r3.length
                long r0 = (long) r4
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.hash.HashCode hash(com.google.common.hash.HashFunction r4) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.offset
                int r2 = r3.length
                com.google.common.hash.HashCode r4 = r4.hashBytes(r0, r1, r2)
                return r4
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.length
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openBufferedStream() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.openStream()
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() {
                r4 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                byte[] r1 = r4.bytes
                int r2 = r4.offset
                int r3 = r4.length
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public <T> T read(com.google.common.io.ByteProcessor<T> r4) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.offset
                int r2 = r3.length
                r4.processBytes(r0, r1, r2)
                java.lang.Object r4 = r4.getResult()
                return r4
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.offset
                int r2 = r3.length
                int r2 = r2 + r1
                byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public long size() {
                r2 = this;
                int r0 = r2.length
                long r0 = (long) r0
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
                r2 = this;
                int r0 = r2.length
                long r0 = (long) r0
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.ByteSource slice(long r7, long r9) {
                r6 = this;
                r0 = 0
                r1 = 1
                r2 = 0
                int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r4 < 0) goto La
                r4 = 1
                goto Lb
            La:
                r4 = 0
            Lb:
                java.lang.String r5 = "offset (%s) may not be negative"
                com.google.common.base.Preconditions.checkArgument(r4, r5, r7)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 < 0) goto L15
                r0 = 1
            L15:
                java.lang.String r1 = "length (%s) may not be negative"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r9)
                int r0 = r6.length
                long r0 = (long) r0
                long r7 = java.lang.Math.min(r7, r0)
                int r0 = r6.length
                long r0 = (long) r0
                long r0 = r0 - r7
                long r9 = java.lang.Math.min(r9, r0)
                int r0 = r6.offset
                int r8 = (int) r7
                int r0 = r0 + r8
                com.google.common.io.ByteSource$ByteArrayByteSource r7 = new com.google.common.io.ByteSource$ByteArrayByteSource
                byte[] r8 = r6.bytes
                int r10 = (int) r9
                r7.<init>(r8, r0, r10)
                return r7
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ByteSource.wrap("
                r0.append(r1)
                com.google.common.io.BaseEncoding r1 = com.google.common.io.BaseEncoding.base16()
                byte[] r2 = r5.bytes
                int r3 = r5.offset
                int r4 = r5.length
                java.lang.String r1 = r1.encode(r2, r3, r4)
                r2 = 30
                java.lang.String r3 = "..."
                java.lang.String r1 = com.google.common.base.Ascii.truncate(r1, r2, r3)
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ConcatenatedByteSource extends com.google.common.io.ByteSource {
        final java.lang.Iterable<? extends com.google.common.io.ByteSource> sources;

        ConcatenatedByteSource(java.lang.Iterable<? extends com.google.common.io.ByteSource> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r0.sources = r1
                return
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws java.io.IOException {
                r2 = this;
                java.lang.Iterable<? extends com.google.common.io.ByteSource> r0 = r2.sources
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                com.google.common.io.ByteSource r1 = (com.google.common.io.ByteSource) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L6
                r0 = 0
                return r0
            L1a:
                r0 = 1
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
                r2 = this;
                com.google.common.io.MultiInputStream r0 = new com.google.common.io.MultiInputStream
                java.lang.Iterable<? extends com.google.common.io.ByteSource> r1 = r2.sources
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws java.io.IOException {
                r7 = this;
                java.lang.Iterable<? extends com.google.common.io.ByteSource> r0 = r7.sources
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r3 = r1
            L9:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L24
                java.lang.Object r5 = r0.next()
                com.google.common.io.ByteSource r5 = (com.google.common.io.ByteSource) r5
                long r5 = r5.size()
                long r3 = r3 + r5
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L9
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                return r0
            L24:
                return r3
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
                r7 = this;
                java.lang.Iterable<? extends com.google.common.io.ByteSource> r0 = r7.sources
                boolean r1 = r0 instanceof java.util.Collection
                if (r1 != 0) goto Lb
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                return r0
            Lb:
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r3 = r1
            L12:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L4a
                java.lang.Object r5 = r0.next()
                com.google.common.io.ByteSource r5 = (com.google.common.io.ByteSource) r5
                com.google.common.base.Optional r5 = r5.sizeIfKnown()
                boolean r6 = r5.isPresent()
                if (r6 != 0) goto L2d
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                return r0
            L2d:
                java.lang.Object r5 = r5.get()
                java.lang.Long r5 = (java.lang.Long) r5
                long r5 = r5.longValue()
                long r3 = r3 + r5
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L12
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
            L4a:
                java.lang.Long r0 = java.lang.Long.valueOf(r3)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ByteSource.concat("
                r0.append(r1)
                java.lang.Iterable<? extends com.google.common.io.ByteSource> r1 = r2.sources
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class EmptyByteSource extends com.google.common.io.ByteSource.ByteArrayByteSource {
        static final com.google.common.io.ByteSource.EmptyByteSource INSTANCE = null;

        static {
                com.google.common.io.ByteSource$EmptyByteSource r0 = new com.google.common.io.ByteSource$EmptyByteSource
                r0.<init>()
                com.google.common.io.ByteSource.EmptyByteSource.INSTANCE = r0
                return
        }

        EmptyByteSource() {
                r1 = this;
                r0 = 0
                byte[] r0 = new byte[r0]
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.io.CharSource r1 = com.google.common.io.CharSource.empty()
                return r1
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.io.ByteSource
        public byte[] read() {
                r1 = this;
                byte[] r0 = r1.bytes
                return r0
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "ByteSource.empty()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class SlicedByteSource extends com.google.common.io.ByteSource {
        final long length;
        final long offset;
        final /* synthetic */ com.google.common.io.ByteSource this$0;

        SlicedByteSource(com.google.common.io.ByteSource r6, long r7, long r9) {
                r5 = this;
                r5.this$0 = r6
                r5.<init>()
                r6 = 0
                r0 = 1
                r1 = 0
                int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r3 < 0) goto Lf
                r3 = 1
                goto L10
            Lf:
                r3 = 0
            L10:
                java.lang.String r4 = "offset (%s) may not be negative"
                com.google.common.base.Preconditions.checkArgument(r3, r4, r7)
                int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r3 < 0) goto L1a
                r6 = 1
            L1a:
                java.lang.String r0 = "length (%s) may not be negative"
                com.google.common.base.Preconditions.checkArgument(r6, r0, r9)
                r5.offset = r7
                r5.length = r9
                return
        }

        private java.io.InputStream sliceStream(java.io.InputStream r6) throws java.io.IOException {
                r5 = this;
                long r0 = r5.offset
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L30
                long r0 = com.google.common.io.ByteStreams.skipUpTo(r6, r0)     // Catch: java.lang.Throwable -> L1e
                long r2 = r5.offset
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L30
                r6.close()
                java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
                r0 = 0
                byte[] r0 = new byte[r0]
                r6.<init>(r0)
                return r6
            L1e:
                r0 = move-exception
                com.google.common.io.Closer r1 = com.google.common.io.Closer.create()
                r1.register(r6)
                java.lang.RuntimeException r6 = r1.rethrow(r0)     // Catch: java.lang.Throwable -> L2b
                throw r6     // Catch: java.lang.Throwable -> L2b
            L2b:
                r6 = move-exception
                r1.close()
                throw r6
            L30:
                long r0 = r5.length
                java.io.InputStream r6 = com.google.common.io.ByteStreams.limit(r6, r0)
                return r6
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws java.io.IOException {
                r5 = this;
                long r0 = r5.length
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                boolean r0 = super.isEmpty()
                if (r0 == 0) goto Lf
                goto L11
            Lf:
                r0 = 0
                return r0
            L11:
                r0 = 1
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openBufferedStream() throws java.io.IOException {
                r1 = this;
                com.google.common.io.ByteSource r0 = r1.this$0
                java.io.InputStream r0 = r0.openBufferedStream()
                java.io.InputStream r0 = r1.sliceStream(r0)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
                r1 = this;
                com.google.common.io.ByteSource r0 = r1.this$0
                java.io.InputStream r0 = r0.openStream()
                java.io.InputStream r0 = r1.sliceStream(r0)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
                r6 = this;
                com.google.common.io.ByteSource r0 = r6.this$0
                com.google.common.base.Optional r0 = r0.sizeIfKnown()
                boolean r1 = r0.isPresent()
                if (r1 == 0) goto L2c
                java.lang.Object r0 = r0.get()
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                long r2 = r6.offset
                long r2 = java.lang.Math.min(r2, r0)
                long r4 = r6.length
                long r0 = r0 - r2
                long r0 = java.lang.Math.min(r4, r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
            L2c:
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.ByteSource slice(long r7, long r9) {
                r6 = this;
                r0 = 0
                r1 = 1
                r2 = 0
                int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r4 < 0) goto La
                r4 = 1
                goto Lb
            La:
                r4 = 0
            Lb:
                java.lang.String r5 = "offset (%s) may not be negative"
                com.google.common.base.Preconditions.checkArgument(r4, r5, r7)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 < 0) goto L15
                r0 = 1
            L15:
                java.lang.String r1 = "length (%s) may not be negative"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r9)
                long r0 = r6.length
                long r0 = r0 - r7
                com.google.common.io.ByteSource r2 = r6.this$0
                long r3 = r6.offset
                long r3 = r3 + r7
                long r7 = java.lang.Math.min(r9, r0)
                com.google.common.io.ByteSource r7 = r2.slice(r3, r7)
                return r7
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.io.ByteSource r1 = r3.this$0
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = ".slice("
                r0.append(r1)
                long r1 = r3.offset
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                long r1 = r3.length
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    protected ByteSource() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.io.ByteSource concat(java.lang.Iterable<? extends com.google.common.io.ByteSource> r1) {
            com.google.common.io.ByteSource$ConcatenatedByteSource r0 = new com.google.common.io.ByteSource$ConcatenatedByteSource
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.io.ByteSource concat(java.util.Iterator<? extends com.google.common.io.ByteSource> r0) {
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            com.google.common.io.ByteSource r0 = concat(r0)
            return r0
    }

    public static com.google.common.io.ByteSource concat(com.google.common.io.ByteSource... r0) {
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            com.google.common.io.ByteSource r0 = concat(r0)
            return r0
    }

    private long countBySkipping(java.io.InputStream r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r2 = r0
        L3:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = com.google.common.io.ByteStreams.skipUpTo(r8, r4)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L10
            long r2 = r2 + r4
            goto L3
        L10:
            return r2
    }

    public static com.google.common.io.ByteSource empty() {
            com.google.common.io.ByteSource$EmptyByteSource r0 = com.google.common.io.ByteSource.EmptyByteSource.INSTANCE
            return r0
    }

    public static com.google.common.io.ByteSource wrap(byte[] r1) {
            com.google.common.io.ByteSource$ByteArrayByteSource r0 = new com.google.common.io.ByteSource$ByteArrayByteSource
            r0.<init>(r1)
            return r0
    }

    public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset r2) {
            r1 = this;
            com.google.common.io.ByteSource$AsCharSource r0 = new com.google.common.io.ByteSource$AsCharSource
            r0.<init>(r1, r2)
            return r0
    }

    public boolean contentEquals(com.google.common.io.ByteSource r8) throws java.io.IOException {
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            byte[] r0 = com.google.common.io.ByteStreams.createBuffer()
            byte[] r1 = com.google.common.io.ByteStreams.createBuffer()
            com.google.common.io.Closer r2 = com.google.common.io.Closer.create()
            java.io.InputStream r3 = r7.openStream()     // Catch: java.lang.Throwable -> L3f
            java.io.Closeable r3 = r2.register(r3)     // Catch: java.lang.Throwable -> L3f
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L3f
            java.io.InputStream r8 = r8.openStream()     // Catch: java.lang.Throwable -> L3f
            java.io.Closeable r8 = r2.register(r8)     // Catch: java.lang.Throwable -> L3f
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch: java.lang.Throwable -> L3f
        L23:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            int r4 = com.google.common.io.ByteStreams.read(r3, r0, r5, r4)     // Catch: java.lang.Throwable -> L3f
            int r6 = r1.length     // Catch: java.lang.Throwable -> L3f
            int r6 = com.google.common.io.ByteStreams.read(r8, r1, r5, r6)     // Catch: java.lang.Throwable -> L3f
            if (r4 != r6) goto L41
            boolean r6 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> L3f
            if (r6 != 0) goto L37
            goto L41
        L37:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L3f
            if (r4 == r5) goto L23
            r2.close()
            r8 = 1
            return r8
        L3f:
            r8 = move-exception
            goto L45
        L41:
            r2.close()
            return r5
        L45:
            java.lang.RuntimeException r8 = r2.rethrow(r8)     // Catch: java.lang.Throwable -> L4a
            throw r8     // Catch: java.lang.Throwable -> L4a
        L4a:
            r8 = move-exception
            r2.close()
            throw r8
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long copyTo(com.google.common.io.ByteSink r4) throws java.io.IOException {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r3.openStream()     // Catch: java.lang.Throwable -> L23
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L23
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L23
            java.io.OutputStream r4 = r4.openStream()     // Catch: java.lang.Throwable -> L23
            java.io.Closeable r4 = r0.register(r4)     // Catch: java.lang.Throwable -> L23
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch: java.lang.Throwable -> L23
            long r1 = com.google.common.io.ByteStreams.copy(r1, r4)     // Catch: java.lang.Throwable -> L23
            r0.close()
            return r1
        L23:
            r4 = move-exception
            java.lang.RuntimeException r4 = r0.rethrow(r4)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r4 = move-exception
            r0.close()
            throw r4
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long copyTo(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r3.openStream()     // Catch: java.lang.Throwable -> L19
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L19
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L19
            long r1 = com.google.common.io.ByteStreams.copy(r1, r4)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return r1
        L19:
            r4 = move-exception
            java.lang.RuntimeException r4 = r0.rethrow(r4)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L1f:
            r4 = move-exception
            r0.close()
            throw r4
    }

    public com.google.common.hash.HashCode hash(com.google.common.hash.HashFunction r2) throws java.io.IOException {
            r1 = this;
            com.google.common.hash.Hasher r2 = r2.newHasher()
            java.io.OutputStream r0 = com.google.common.hash.Funnels.asOutputStream(r2)
            r1.copyTo(r0)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    public boolean isEmpty() throws java.io.IOException {
            r7 = this;
            com.google.common.base.Optional r0 = r7.sizeIfKnown()
            boolean r1 = r0.isPresent()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            return r3
        L1d:
            return r2
        L1e:
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r7.openStream()     // Catch: java.lang.Throwable -> L38
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L38
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.read()     // Catch: java.lang.Throwable -> L38
            r4 = -1
            if (r1 != r4) goto L34
            r2 = 1
        L34:
            r0.close()
            return r2
        L38:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        L3e:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public java.io.InputStream openBufferedStream() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.openStream()
            boolean r1 = r0 instanceof java.io.BufferedInputStream
            if (r1 == 0) goto Lb
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0
            return r0
        Lb:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r0)
            return r1
    }

    public abstract java.io.InputStream openStream() throws java.io.IOException;

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public <T> T read(com.google.common.io.ByteProcessor<T> r3) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r2.openStream()     // Catch: java.lang.Throwable -> L19
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L19
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = com.google.common.io.ByteStreams.readBytes(r1, r3)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return r3
        L19:
            r3 = move-exception
            java.lang.RuntimeException r3 = r0.rethrow(r3)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L1f:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public byte[] read() throws java.io.IOException {
            r4 = this;
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r4.openStream()     // Catch: java.lang.Throwable -> L27
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L27
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L27
            com.google.common.base.Optional r2 = r4.sizeIfKnown()     // Catch: java.lang.Throwable -> L27
            boolean r3 = r2.isPresent()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L29
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L27
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L27
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L27
            byte[] r1 = com.google.common.io.ByteStreams.toByteArray(r1, r2)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L27:
            r1 = move-exception
            goto L31
        L29:
            byte[] r1 = com.google.common.io.ByteStreams.toByteArray(r1)     // Catch: java.lang.Throwable -> L27
        L2d:
            r0.close()
            return r1
        L31:
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public long size() throws java.io.IOException {
            r3 = this;
            com.google.common.base.Optional r0 = r3.sizeIfKnown()
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L15
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L15:
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r3.openStream()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            long r1 = r3.countBySkipping(r1)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            r0.close()
            return r1
        L2b:
            r1 = move-exception
            r0.close()
            throw r1
        L30:
            r0.close()
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.InputStream r1 = r3.openStream()     // Catch: java.lang.Throwable -> L49
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L49
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L49
            long r1 = com.google.common.io.ByteStreams.exhaust(r1)     // Catch: java.lang.Throwable -> L49
            r0.close()
            return r1
        L49:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L4f
            throw r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @com.google.common.annotations.Beta
    public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            r1 = this;
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
    }

    public com.google.common.io.ByteSource slice(long r7, long r9) {
            r6 = this;
            com.google.common.io.ByteSource$SlicedByteSource r0 = new com.google.common.io.ByteSource$SlicedByteSource
            r1 = r6
            r2 = r7
            r4 = r9
            r0.<init>(r1, r2, r4)
            return r0
    }
}
