package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ReadOnlyHttp2Headers implements io.netty.handler.codec.http2.Http2Headers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte PSEUDO_HEADER_TOKEN = 58;
    private final io.netty.util.AsciiString[] otherHeaders;
    private final io.netty.util.AsciiString[] pseudoHeaders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.ReadOnlyHttp2Headers$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReadOnlyIterator implements java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>, java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> {
        private io.netty.util.AsciiString[] current;
        private int i;
        private io.netty.util.AsciiString key;
        final /* synthetic */ io.netty.handler.codec.http2.ReadOnlyHttp2Headers this$0;
        private io.netty.util.AsciiString value;

        private ReadOnlyIterator(io.netty.handler.codec.http2.ReadOnlyHttp2Headers r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                io.netty.util.AsciiString[] r0 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$100(r2)
                int r0 = r0.length
                if (r0 == 0) goto L11
                io.netty.util.AsciiString[] r2 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$100(r2)
                goto L15
            L11:
                io.netty.util.AsciiString[] r2 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$200(r2)
            L15:
                r1.current = r2
                return
        }

        /* synthetic */ ReadOnlyIterator(io.netty.handler.codec.http2.ReadOnlyHttp2Headers r1, io.netty.handler.codec.http2.ReadOnlyHttp2Headers.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Map.Entry
        public java.lang.CharSequence getKey() {
                r1 = this;
                io.netty.util.AsciiString r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.CharSequence getKey() {
                r1 = this;
                java.lang.CharSequence r0 = r1.getKey()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Map.Entry
        public java.lang.CharSequence getValue() {
                r1 = this;
                io.netty.util.AsciiString r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.CharSequence getValue() {
                r1 = this;
                java.lang.CharSequence r0 = r1.getValue()
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.i
                io.netty.util.AsciiString[] r1 = r2.current
                int r1 = r1.length
                if (r0 == r1) goto L9
                r0 = 1
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> next2() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L2f
                io.netty.util.AsciiString[] r0 = r3.current
                int r1 = r3.i
                r2 = r0[r1]
                r3.key = r2
                int r2 = r1 + 1
                r2 = r0[r2]
                r3.value = r2
                int r1 = r1 + 2
                r3.i = r1
                int r2 = r0.length
                if (r1 != r2) goto L2e
                io.netty.handler.codec.http2.ReadOnlyHttp2Headers r1 = r3.this$0
                io.netty.util.AsciiString[] r1 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$100(r1)
                if (r0 != r1) goto L2e
                io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = r3.this$0
                io.netty.util.AsciiString[] r0 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$200(r0)
                r3.current = r0
                r0 = 0
                r3.i = r0
            L2e:
                return r3
            L2f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "read only"
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public java.lang.CharSequence setValue2(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "read only"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.CharSequence setValue(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.CharSequence r1 = r0.setValue2(r1)
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                io.netty.util.AsciiString r1 = r2.key
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                io.netty.util.AsciiString r1 = r2.value
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReadOnlyValueIterator implements java.util.Iterator<java.lang.CharSequence> {
        private io.netty.util.AsciiString[] current;
        private int i;
        private final java.lang.CharSequence name;
        private final int nameHash;
        private io.netty.util.AsciiString next;
        final /* synthetic */ io.netty.handler.codec.http2.ReadOnlyHttp2Headers this$0;

        ReadOnlyValueIterator(io.netty.handler.codec.http2.ReadOnlyHttp2Headers r2, java.lang.CharSequence r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                io.netty.util.AsciiString[] r0 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$100(r2)
                int r0 = r0.length
                if (r0 == 0) goto L11
                io.netty.util.AsciiString[] r2 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$100(r2)
                goto L15
            L11:
                io.netty.util.AsciiString[] r2 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$200(r2)
            L15:
                r1.current = r2
                int r2 = io.netty.util.AsciiString.hashCode(r3)
                r1.nameHash = r2
                r1.name = r3
                r1.calculateNext()
                return
        }

        private void calculateNext() {
                r3 = this;
            L0:
                int r0 = r3.i
                io.netty.util.AsciiString[] r1 = r3.current
                int r2 = r1.length
                if (r0 >= r2) goto L2f
                r0 = r1[r0]
                int r1 = r0.hashCode()
                int r2 = r3.nameHash
                if (r1 != r2) goto L28
                java.lang.CharSequence r1 = r3.name
                boolean r0 = r0.contentEqualsIgnoreCase(r1)
                if (r0 == 0) goto L28
                io.netty.util.AsciiString[] r0 = r3.current
                int r1 = r3.i
                int r2 = r1 + 1
                r0 = r0[r2]
                r3.next = r0
                int r1 = r1 + 2
                r3.i = r1
                return
            L28:
                int r0 = r3.i
                int r0 = r0 + 2
                r3.i = r0
                goto L0
            L2f:
                int r2 = r1.length
                if (r0 < r2) goto L49
                io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = r3.this$0
                io.netty.util.AsciiString[] r0 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$100(r0)
                if (r1 != r0) goto L49
                r0 = 0
                r3.i = r0
                io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = r3.this$0
                io.netty.util.AsciiString[] r0 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.access$200(r0)
                r3.current = r0
                r3.calculateNext()
                return
            L49:
                r0 = 0
                r3.next = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                io.netty.util.AsciiString r0 = r1.next
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.CharSequence next() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto Lc
                io.netty.util.AsciiString r0 = r1.next
                r1.calculateNext()
                return r0
            Lc:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.CharSequence next() {
                r1 = this;
                java.lang.CharSequence r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "read only"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            return
    }

    private ReadOnlyHttp2Headers(boolean r2, io.netty.util.AsciiString[] r3, io.netty.util.AsciiString... r4) {
            r1 = this;
            r1.<init>()
            int r0 = r4.length
            r0 = r0 & 1
            if (r0 != 0) goto L12
            if (r2 == 0) goto Ld
            validateHeaders(r3, r4)
        Ld:
            r1.pseudoHeaders = r3
            r1.otherHeaders = r4
            return
        L12:
            java.lang.IllegalArgumentException r2 = newInvalidArraySizeException()
            throw r2
    }

    static /* synthetic */ io.netty.util.AsciiString[] access$100(io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0) {
            io.netty.util.AsciiString[] r0 = r0.pseudoHeaders
            return r0
    }

    static /* synthetic */ io.netty.util.AsciiString[] access$200(io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0) {
            io.netty.util.AsciiString[] r0 = r0.otherHeaders
            return r0
    }

    public static io.netty.handler.codec.http2.ReadOnlyHttp2Headers clientHeaders(boolean r7, io.netty.util.AsciiString r8, io.netty.util.AsciiString r9, io.netty.util.AsciiString r10, io.netty.util.AsciiString r11, io.netty.util.AsciiString... r12) {
            io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = new io.netty.handler.codec.http2.ReadOnlyHttp2Headers
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r1 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.METHOD
            io.netty.util.AsciiString r1 = r1.value()
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r2 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PATH
            io.netty.util.AsciiString r2 = r2.value()
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r3 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.SCHEME
            io.netty.util.AsciiString r3 = r3.value()
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r4 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.AUTHORITY
            io.netty.util.AsciiString r4 = r4.value()
            r5 = 8
            io.netty.util.AsciiString[] r5 = new io.netty.util.AsciiString[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r8
            r8 = 2
            r5[r8] = r2
            r8 = 3
            r5[r8] = r9
            r8 = 4
            r5[r8] = r3
            r8 = 5
            r5[r8] = r10
            r8 = 6
            r5[r8] = r4
            r8 = 7
            r5[r8] = r11
            r0.<init>(r7, r5, r12)
            return r0
    }

    private static boolean contains(java.lang.CharSequence r7, int r8, java.lang.CharSequence r9, int r10, io.netty.util.HashingStrategy<java.lang.CharSequence> r11, io.netty.util.AsciiString[] r12) {
            int r0 = r12.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r0) goto L29
            r4 = r12[r3]
            int r5 = r3 + 1
            r5 = r12[r5]
            int r6 = r4.hashCode()
            if (r6 != r8) goto L26
            int r6 = r5.hashCode()
            if (r6 != r10) goto L26
            boolean r4 = r4.contentEqualsIgnoreCase(r7)
            if (r4 == 0) goto L26
            boolean r4 = r11.equals(r5, r9)
            if (r4 == 0) goto L26
            return r1
        L26:
            int r3 = r3 + 2
            goto L5
        L29:
            return r2
    }

    private io.netty.util.AsciiString get0(java.lang.CharSequence r7) {
            r6 = this;
            int r0 = io.netty.util.AsciiString.hashCode(r7)
            io.netty.util.AsciiString[] r1 = r6.pseudoHeaders
            int r1 = r1.length
            int r1 = r1 + (-1)
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L27
            io.netty.util.AsciiString[] r4 = r6.pseudoHeaders
            r4 = r4[r3]
            int r5 = r4.hashCode()
            if (r5 != r0) goto L24
            boolean r4 = r4.contentEqualsIgnoreCase(r7)
            if (r4 == 0) goto L24
            io.netty.util.AsciiString[] r7 = r6.pseudoHeaders
            int r3 = r3 + 1
            r7 = r7[r3]
            return r7
        L24:
            int r3 = r3 + 2
            goto Lb
        L27:
            io.netty.util.AsciiString[] r1 = r6.otherHeaders
            int r1 = r1.length
            int r1 = r1 + (-1)
        L2c:
            if (r2 >= r1) goto L48
            io.netty.util.AsciiString[] r3 = r6.otherHeaders
            r3 = r3[r2]
            int r4 = r3.hashCode()
            if (r4 != r0) goto L45
            boolean r3 = r3.contentEqualsIgnoreCase(r7)
            if (r3 == 0) goto L45
            io.netty.util.AsciiString[] r7 = r6.otherHeaders
            int r2 = r2 + 1
            r7 = r7[r2]
            return r7
        L45:
            int r2 = r2 + 2
            goto L2c
        L48:
            r7 = 0
            return r7
    }

    private static java.lang.IllegalArgumentException newInvalidArraySizeException() {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "pseudoHeaders and otherHeaders must be arrays of [name, value] pairs"
            r0.<init>(r1)
            return r0
    }

    public static io.netty.handler.codec.http2.ReadOnlyHttp2Headers serverHeaders(boolean r4, io.netty.util.AsciiString r5, io.netty.util.AsciiString... r6) {
            io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = new io.netty.handler.codec.http2.ReadOnlyHttp2Headers
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r1 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.STATUS
            io.netty.util.AsciiString r1 = r1.value()
            r2 = 2
            io.netty.util.AsciiString[] r2 = new io.netty.util.AsciiString[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r5
            r0.<init>(r4, r2, r6)
            return r0
    }

    public static io.netty.handler.codec.http2.ReadOnlyHttp2Headers trailers(boolean r2, io.netty.util.AsciiString... r3) {
            io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = new io.netty.handler.codec.http2.ReadOnlyHttp2Headers
            io.netty.util.AsciiString[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_ASCII_STRINGS
            r0.<init>(r2, r1, r3)
            return r0
    }

    private static void validateHeaders(io.netty.util.AsciiString[] r8, io.netty.util.AsciiString... r9) {
            r0 = 1
            r1 = 1
        L2:
            int r2 = r8.length
            java.lang.String r3 = " is null"
            if (r1 >= r2) goto L28
            r2 = r8[r1]
            if (r2 == 0) goto Le
            int r1 = r1 + 2
            goto L2
        Le:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "pseudoHeaders value at index "
            r9.append(r0)
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L28:
            int r8 = r9.length
            int r8 = r8 - r0
            r1 = 0
            r2 = 0
            r4 = 0
        L2d:
            if (r2 >= r8) goto L96
            r5 = r9[r2]
            io.netty.handler.codec.DefaultHeaders$NameValidator<java.lang.CharSequence> r6 = io.netty.handler.codec.http2.DefaultHttp2Headers.HTTP2_NAME_VALIDATOR
            r6.validateName(r5)
            r6 = 58
            if (r4 != 0) goto L48
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L48
            byte r7 = r5.byteAt(r1)
            if (r7 == r6) goto L48
            r4 = 1
            goto L73
        L48:
            if (r4 == 0) goto L73
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L73
            byte r5 = r5.byteAt(r1)
            if (r5 == r6) goto L57
            goto L73
        L57:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "otherHeaders name at index "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = " is a pseudo header that appears after non-pseudo headers."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L73:
            int r5 = r2 + 1
            r6 = r9[r5]
            if (r6 == 0) goto L7c
            int r2 = r2 + 2
            goto L2d
        L7c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "otherHeaders value at index "
            r9.append(r0)
            r9.append(r5)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L96:
            return
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers add(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2Headers r1 = r0.add2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers add(java.lang.CharSequence r1, java.lang.Iterable<? extends java.lang.CharSequence> r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.add2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers add(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            io.netty.handler.codec.http2.Http2Headers r1 = r0.add2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers add(java.lang.CharSequence r1, java.lang.CharSequence[] r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            io.netty.handler.codec.http2.Http2Headers r1 = r0.add2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    /* renamed from: add, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers add2(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers add2(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers add2(java.lang.CharSequence r1, java.lang.Iterable<? extends java.lang.CharSequence> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers add2(java.lang.CharSequence r1, java.lang.CharSequence... r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addBoolean(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addBoolean2(r1, r2)
            return r1
    }

    /* renamed from: addBoolean, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addBoolean2(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addByte(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addByte2(r1, r2)
            return r1
    }

    /* renamed from: addByte, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addByte2(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addChar(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addChar2(r1, r2)
            return r1
    }

    /* renamed from: addChar, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addChar2(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addDouble(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addDouble2(r1, r2)
            return r1
    }

    /* renamed from: addDouble, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addDouble2(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addFloat(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addFloat2(r1, r2)
            return r1
    }

    /* renamed from: addFloat, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addFloat2(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addInt2(r1, r2)
            return r1
    }

    /* renamed from: addInt, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addInt2(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addLong(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addLong2(r1, r2)
            return r1
    }

    /* renamed from: addLong, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addLong2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addObject(java.lang.CharSequence r1, java.lang.Iterable r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addObject2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addObject(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addObject2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addObject(java.lang.CharSequence r1, java.lang.Object[] r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addObject2(r1, r2)
            return r1
    }

    /* renamed from: addObject, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addObject2(java.lang.CharSequence r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: addObject, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addObject2(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: addObject, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addObject2(java.lang.CharSequence r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addShort2(r1, r2)
            return r1
    }

    /* renamed from: addShort, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addShort2(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers addTimeMillis(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.addTimeMillis2(r1, r2)
            return r1
    }

    /* renamed from: addTimeMillis, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers addTimeMillis2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers authority(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence authority() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.AUTHORITY
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.CharSequence r0 = r1.get2(r0)
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers clear() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers r0 = r1.clear2()
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    /* renamed from: clear, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers clear2() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "read only"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: contains, reason: avoid collision after fix types in other method */
    public boolean contains2(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get2(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    /* renamed from: contains, reason: avoid collision after fix types in other method */
    public boolean contains2(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.contains(r2, r3, r0)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public boolean contains(java.lang.CharSequence r7, java.lang.CharSequence r8, boolean r9) {
            r6 = this;
            int r1 = io.netty.util.AsciiString.hashCode(r7)
            if (r9 == 0) goto La
            io.netty.util.HashingStrategy r9 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
        L8:
            r4 = r9
            goto Ld
        La:
            io.netty.util.HashingStrategy r9 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            goto L8
        Ld:
            int r3 = r4.hashCode(r8)
            io.netty.util.AsciiString[] r5 = r6.otherHeaders
            r0 = r7
            r2 = r8
            boolean r7 = contains(r0, r1, r2, r3, r4, r5)
            if (r7 != 0) goto L26
            io.netty.util.AsciiString[] r5 = r6.pseudoHeaders
            boolean r7 = contains(r0, r1, r2, r3, r4, r5)
            if (r7 == 0) goto L24
            goto L26
        L24:
            r7 = 0
            return r7
        L26:
            r7 = 1
            return r7
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean contains(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.contains2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    /* renamed from: containsBoolean, reason: avoid collision after fix types in other method */
    public boolean containsBoolean2(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsBoolean(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsBoolean2(r1, r2)
            return r1
    }

    /* renamed from: containsByte, reason: avoid collision after fix types in other method */
    public boolean containsByte2(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsByte(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsByte2(r1, r2)
            return r1
    }

    /* renamed from: containsChar, reason: avoid collision after fix types in other method */
    public boolean containsChar2(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsChar(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsChar2(r1, r2)
            return r1
    }

    /* renamed from: containsDouble, reason: avoid collision after fix types in other method */
    public boolean containsDouble2(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsDouble(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsDouble2(r1, r2)
            return r1
    }

    /* renamed from: containsFloat, reason: avoid collision after fix types in other method */
    public boolean containsFloat2(java.lang.CharSequence r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsFloat(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsFloat2(r1, r2)
            return r1
    }

    /* renamed from: containsInt, reason: avoid collision after fix types in other method */
    public boolean containsInt2(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsInt2(r1, r2)
            return r1
    }

    /* renamed from: containsLong, reason: avoid collision after fix types in other method */
    public boolean containsLong2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsLong(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsLong2(r1, r2)
            return r1
    }

    /* renamed from: containsObject, reason: avoid collision after fix types in other method */
    public boolean containsObject2(java.lang.CharSequence r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.CharSequence
            if (r0 == 0) goto Lb
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = r1.contains2(r2, r3)
            return r2
        Lb:
            java.lang.String r3 = r3.toString()
            boolean r2 = r1.contains2(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsObject(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsObject2(r1, r2)
            return r1
    }

    /* renamed from: containsShort, reason: avoid collision after fix types in other method */
    public boolean containsShort2(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsShort2(r1, r2)
            return r1
    }

    /* renamed from: containsTimeMillis, reason: avoid collision after fix types in other method */
    public boolean containsTimeMillis2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r0.contains2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean containsTimeMillis(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.containsTimeMillis2(r1, r2)
            return r1
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public java.lang.CharSequence get2(java.lang.CharSequence r1) {
            r0 = this;
            io.netty.util.AsciiString r1 = r0.get0(r1)
            return r1
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public java.lang.CharSequence get2(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get2(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.CharSequence get(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = r0.get2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.CharSequence get(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = r0.get2(r1, r2)
            return r1
    }

    /* renamed from: getAll, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.CharSequence> getAll2(java.lang.CharSequence r8) {
            r7 = this;
            int r0 = io.netty.util.AsciiString.hashCode(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            io.netty.util.AsciiString[] r2 = r7.pseudoHeaders
            int r2 = r2.length
            int r2 = r2 + (-1)
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto L2e
            io.netty.util.AsciiString[] r5 = r7.pseudoHeaders
            r5 = r5[r4]
            int r6 = r5.hashCode()
            if (r6 != r0) goto L2b
            boolean r5 = r5.contentEqualsIgnoreCase(r8)
            if (r5 == 0) goto L2b
            io.netty.util.AsciiString[] r5 = r7.pseudoHeaders
            int r6 = r4 + 1
            r5 = r5[r6]
            r1.add(r5)
        L2b:
            int r4 = r4 + 2
            goto L10
        L2e:
            io.netty.util.AsciiString[] r2 = r7.otherHeaders
            int r2 = r2.length
            int r2 = r2 + (-1)
        L33:
            if (r3 >= r2) goto L51
            io.netty.util.AsciiString[] r4 = r7.otherHeaders
            r4 = r4[r3]
            int r5 = r4.hashCode()
            if (r5 != r0) goto L4e
            boolean r4 = r4.contentEqualsIgnoreCase(r8)
            if (r4 == 0) goto L4e
            io.netty.util.AsciiString[] r4 = r7.otherHeaders
            int r5 = r3 + 1
            r4 = r4[r5]
            r1.add(r4)
        L4e:
            int r3 = r3 + 2
            goto L33
        L51:
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.util.List<java.lang.CharSequence> getAll(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.List r1 = r0.getAll2(r1)
            return r1
    }

    /* renamed from: getAllAndRemove, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.CharSequence> getAllAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.util.List<java.lang.CharSequence> getAllAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.List r1 = r0.getAllAndRemove2(r1)
            return r1
    }

    /* renamed from: getAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.CharSequence getAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: getAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.CharSequence getAndRemove2(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.CharSequence getAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = r0.getAndRemove2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.CharSequence getAndRemove(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = r0.getAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getBoolean, reason: avoid collision after fix types in other method */
    public java.lang.Boolean getBoolean2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r2 = r1.get0(r2)
            if (r2 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            boolean r2 = r0.convertToBoolean2(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Boolean getBoolean(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Boolean r1 = r0.getBoolean2(r1)
            return r1
    }

    /* renamed from: getBoolean, reason: avoid collision after fix types in other method */
    public boolean getBoolean2(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.getBoolean2(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r1.booleanValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean getBoolean(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.getBoolean2(r1, r2)
            return r1
    }

    /* renamed from: getBooleanAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Boolean getBooleanAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Boolean getBooleanAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Boolean r1 = r0.getBooleanAndRemove2(r1)
            return r1
    }

    /* renamed from: getBooleanAndRemove, reason: avoid collision after fix types in other method */
    public boolean getBooleanAndRemove2(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean getBooleanAndRemove(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.getBooleanAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getByte, reason: avoid collision after fix types in other method */
    public byte getByte2(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.Byte r1 = r0.getByte2(r1)
            if (r1 == 0) goto Lb
            byte r1 = r1.byteValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ byte getByte(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            byte r1 = r0.getByte2(r1, r2)
            return r1
    }

    /* renamed from: getByte, reason: avoid collision after fix types in other method */
    public java.lang.Byte getByte2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r2 = r1.get0(r2)
            if (r2 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            byte r2 = r0.convertToByte2(r2)
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Byte getByte(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Byte r1 = r0.getByte2(r1)
            return r1
    }

    /* renamed from: getByteAndRemove, reason: avoid collision after fix types in other method */
    public byte getByteAndRemove2(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ byte getByteAndRemove(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            byte r1 = r0.getByteAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getByteAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Byte getByteAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Byte getByteAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Byte r1 = r0.getByteAndRemove2(r1)
            return r1
    }

    /* renamed from: getChar, reason: avoid collision after fix types in other method */
    public char getChar2(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.Character r1 = r0.getChar2(r1)
            if (r1 == 0) goto Lb
            char r1 = r1.charValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ char getChar(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r1 = r0.getChar2(r1, r2)
            return r1
    }

    /* renamed from: getChar, reason: avoid collision after fix types in other method */
    public java.lang.Character getChar2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r2 = r1.get0(r2)
            if (r2 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            char r2 = r0.convertToChar2(r2)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Character getChar(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Character r1 = r0.getChar2(r1)
            return r1
    }

    /* renamed from: getCharAndRemove, reason: avoid collision after fix types in other method */
    public char getCharAndRemove2(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ char getCharAndRemove(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r1 = r0.getCharAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getCharAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Character getCharAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Character getCharAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Character r1 = r0.getCharAndRemove2(r1)
            return r1
    }

    /* renamed from: getDouble, reason: avoid collision after fix types in other method */
    public double getDouble2(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.Double r1 = r0.getDouble2(r1)
            if (r1 == 0) goto Lb
            double r1 = r1.doubleValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ double getDouble(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            double r1 = r0.getDouble2(r1, r2)
            return r1
    }

    /* renamed from: getDouble, reason: avoid collision after fix types in other method */
    public java.lang.Double getDouble2(java.lang.CharSequence r3) {
            r2 = this;
            io.netty.util.AsciiString r3 = r2.get0(r3)
            if (r3 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            double r0 = r0.convertToDouble2(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L11:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Double getDouble(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Double r1 = r0.getDouble2(r1)
            return r1
    }

    /* renamed from: getDoubleAndRemove, reason: avoid collision after fix types in other method */
    public double getDoubleAndRemove2(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ double getDoubleAndRemove(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            double r1 = r0.getDoubleAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getDoubleAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Double getDoubleAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Double getDoubleAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Double r1 = r0.getDoubleAndRemove2(r1)
            return r1
    }

    /* renamed from: getFloat, reason: avoid collision after fix types in other method */
    public float getFloat2(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.Float r1 = r0.getFloat2(r1)
            if (r1 == 0) goto Lb
            float r1 = r1.floatValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ float getFloat(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            float r1 = r0.getFloat2(r1, r2)
            return r1
    }

    /* renamed from: getFloat, reason: avoid collision after fix types in other method */
    public java.lang.Float getFloat2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r2 = r1.get0(r2)
            if (r2 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            float r2 = r0.convertToFloat2(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Float getFloat(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Float r1 = r0.getFloat2(r1)
            return r1
    }

    /* renamed from: getFloatAndRemove, reason: avoid collision after fix types in other method */
    public float getFloatAndRemove2(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ float getFloatAndRemove(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            float r1 = r0.getFloatAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getFloatAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Float getFloatAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Float getFloatAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Float r1 = r0.getFloatAndRemove2(r1)
            return r1
    }

    /* renamed from: getInt, reason: avoid collision after fix types in other method */
    public int getInt2(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.Integer r1 = r0.getInt2(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.intValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ int getInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r0.getInt2(r1, r2)
            return r1
    }

    /* renamed from: getInt, reason: avoid collision after fix types in other method */
    public java.lang.Integer getInt2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r2 = r1.get0(r2)
            if (r2 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            int r2 = r0.convertToInt2(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Integer getInt(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Integer r1 = r0.getInt2(r1)
            return r1
    }

    /* renamed from: getIntAndRemove, reason: avoid collision after fix types in other method */
    public int getIntAndRemove2(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ int getIntAndRemove(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r0.getIntAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getIntAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Integer getIntAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Integer getIntAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Integer r1 = r0.getIntAndRemove2(r1)
            return r1
    }

    /* renamed from: getLong, reason: avoid collision after fix types in other method */
    public long getLong2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.Long r1 = r0.getLong2(r1)
            if (r1 == 0) goto Lb
            long r1 = r1.longValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ long getLong(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            long r1 = r0.getLong2(r1, r2)
            return r1
    }

    /* renamed from: getLong, reason: avoid collision after fix types in other method */
    public java.lang.Long getLong2(java.lang.CharSequence r3) {
            r2 = this;
            io.netty.util.AsciiString r3 = r2.get0(r3)
            if (r3 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            long r0 = r0.convertToLong2(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L11:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Long getLong(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Long r1 = r0.getLong2(r1)
            return r1
    }

    /* renamed from: getLongAndRemove, reason: avoid collision after fix types in other method */
    public long getLongAndRemove2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ long getLongAndRemove(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            long r1 = r0.getLongAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getLongAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Long getLongAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Long getLongAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Long r1 = r0.getLongAndRemove2(r1)
            return r1
    }

    /* renamed from: getShort, reason: avoid collision after fix types in other method */
    public java.lang.Short getShort2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r2 = r1.get0(r2)
            if (r2 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            short r2 = r0.convertToShort2(r2)
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Short getShort(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Short r1 = r0.getShort2(r1)
            return r1
    }

    /* renamed from: getShort, reason: avoid collision after fix types in other method */
    public short getShort2(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.Short r1 = r0.getShort2(r1)
            if (r1 == 0) goto Lb
            short r1 = r1.shortValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ short getShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            short r1 = r0.getShort2(r1, r2)
            return r1
    }

    /* renamed from: getShortAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Short getShortAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Short getShortAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Short r1 = r0.getShortAndRemove2(r1)
            return r1
    }

    /* renamed from: getShortAndRemove, reason: avoid collision after fix types in other method */
    public short getShortAndRemove2(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ short getShortAndRemove(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            short r1 = r0.getShortAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getTimeMillis, reason: avoid collision after fix types in other method */
    public long getTimeMillis2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.Long r1 = r0.getTimeMillis2(r1)
            if (r1 == 0) goto Lb
            long r1 = r1.longValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ long getTimeMillis(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            long r1 = r0.getTimeMillis2(r1, r2)
            return r1
    }

    /* renamed from: getTimeMillis, reason: avoid collision after fix types in other method */
    public java.lang.Long getTimeMillis2(java.lang.CharSequence r3) {
            r2 = this;
            io.netty.util.AsciiString r3 = r2.get0(r3)
            if (r3 == 0) goto L11
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            long r0 = r0.convertToTimeMillis2(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L11:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Long getTimeMillis(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Long r1 = r0.getTimeMillis2(r1)
            return r1
    }

    /* renamed from: getTimeMillisAndRemove, reason: avoid collision after fix types in other method */
    public long getTimeMillisAndRemove2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ long getTimeMillisAndRemove(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            long r1 = r0.getTimeMillisAndRemove2(r1, r2)
            return r1
    }

    /* renamed from: getTimeMillisAndRemove, reason: avoid collision after fix types in other method */
    public java.lang.Long getTimeMillisAndRemove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ java.lang.Long getTimeMillisAndRemove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Long r1 = r0.getTimeMillisAndRemove2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public boolean isEmpty() {
            r1 = this;
            io.netty.util.AsciiString[] r0 = r1.pseudoHeaders
            int r0 = r0.length
            if (r0 != 0) goto Lc
            io.netty.util.AsciiString[] r0 = r1.otherHeaders
            int r0 = r0.length
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers, io.netty.handler.codec.Headers, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iterator() {
            r2 = this;
            io.netty.handler.codec.http2.ReadOnlyHttp2Headers$ReadOnlyIterator r0 = new io.netty.handler.codec.http2.ReadOnlyHttp2Headers$ReadOnlyIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers method(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence method() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.METHOD
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.CharSequence r0 = r1.get2(r0)
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public java.util.Set<java.lang.CharSequence> names() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r5.size()
            r0.<init>(r1)
            io.netty.util.AsciiString[] r1 = r5.pseudoHeaders
            int r1 = r1.length
            int r1 = r1 + (-1)
            r2 = 0
            r3 = 0
        L19:
            if (r3 >= r1) goto L25
            io.netty.util.AsciiString[] r4 = r5.pseudoHeaders
            r4 = r4[r3]
            r0.add(r4)
            int r3 = r3 + 2
            goto L19
        L25:
            io.netty.util.AsciiString[] r1 = r5.otherHeaders
            int r1 = r1.length
            int r1 = r1 + (-1)
        L2a:
            if (r2 >= r1) goto L36
            io.netty.util.AsciiString[] r3 = r5.otherHeaders
            r3 = r3[r2]
            r0.add(r3)
            int r2 = r2 + 2
            goto L2a
        L36:
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers path(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence path() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PATH
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.CharSequence r0 = r1.get2(r0)
            return r0
    }

    /* renamed from: remove, reason: avoid collision after fix types in other method */
    public boolean remove2(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ boolean remove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.remove2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers scheme(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence scheme() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.SCHEME
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.CharSequence r0 = r1.get2(r0)
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers set(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2Headers r1 = r0.set2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers set(java.lang.CharSequence r1, java.lang.Iterable<? extends java.lang.CharSequence> r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.set2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers set(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            io.netty.handler.codec.http2.Http2Headers r1 = r0.set2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers set(java.lang.CharSequence r1, java.lang.CharSequence[] r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            io.netty.handler.codec.http2.Http2Headers r1 = r0.set2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    /* renamed from: set, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers set2(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers set2(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers set2(java.lang.CharSequence r1, java.lang.Iterable<? extends java.lang.CharSequence> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers set2(java.lang.CharSequence r1, java.lang.CharSequence... r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setAll(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setAll2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    /* renamed from: setAll, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setAll2(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setBoolean(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setBoolean2(r1, r2)
            return r1
    }

    /* renamed from: setBoolean, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setBoolean2(java.lang.CharSequence r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setByte(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setByte2(r1, r2)
            return r1
    }

    /* renamed from: setByte, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setByte2(java.lang.CharSequence r1, byte r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setChar(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setChar2(r1, r2)
            return r1
    }

    /* renamed from: setChar, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setChar2(java.lang.CharSequence r1, char r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setDouble(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setDouble2(r1, r2)
            return r1
    }

    /* renamed from: setDouble, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setDouble2(java.lang.CharSequence r1, double r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setFloat(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setFloat2(r1, r2)
            return r1
    }

    /* renamed from: setFloat, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setFloat2(java.lang.CharSequence r1, float r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setInt2(r1, r2)
            return r1
    }

    /* renamed from: setInt, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setInt2(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setLong(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setLong2(r1, r2)
            return r1
    }

    /* renamed from: setLong, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setLong2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setObject(java.lang.CharSequence r1, java.lang.Iterable r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setObject2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setObject(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setObject2(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setObject(java.lang.CharSequence r1, java.lang.Object[] r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setObject2(r1, r2)
            return r1
    }

    /* renamed from: setObject, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setObject2(java.lang.CharSequence r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: setObject, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setObject2(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: setObject, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setObject2(java.lang.CharSequence r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setShort2(r1, r2)
            return r1
    }

    /* renamed from: setShort, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setShort2(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Headers setTimeMillis(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http2.Http2Headers r1 = r0.setTimeMillis2(r1, r2)
            return r1
    }

    /* renamed from: setTimeMillis, reason: avoid collision after fix types in other method */
    public io.netty.handler.codec.http2.Http2Headers setTimeMillis2(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.Headers
    public int size() {
            r2 = this;
            io.netty.util.AsciiString[] r0 = r2.pseudoHeaders
            int r0 = r0.length
            io.netty.util.AsciiString[] r1 = r2.otherHeaders
            int r1 = r1.length
            int r0 = r0 + r1
            int r0 = r0 >>> 1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public io.netty.handler.codec.http2.Http2Headers status(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.lang.CharSequence status() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.STATUS
            io.netty.util.AsciiString r0 = r0.value()
            java.lang.CharSequence r0 = r1.get2(r0)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<io.netty.handler.codec.http2.ReadOnlyHttp2Headers> r1 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.util.Iterator r1 = r4.iterator()
            java.lang.String r2 = ""
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r0.append(r2)
            java.lang.Object r2 = r3.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            java.lang.Object r2 = r3.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.append(r2)
            java.lang.String r2 = ", "
            goto L16
        L3f:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Headers
    public java.util.Iterator<java.lang.CharSequence> valueIterator(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http2.ReadOnlyHttp2Headers$ReadOnlyValueIterator r0 = new io.netty.handler.codec.http2.ReadOnlyHttp2Headers$ReadOnlyValueIterator
            r0.<init>(r1, r2)
            return r0
    }
}
