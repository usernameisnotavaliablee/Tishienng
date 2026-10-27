package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ReadOnlyHttpHeaders extends io.netty.handler.codec.http.HttpHeaders {
    private final java.lang.CharSequence[] nameValuePairs;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.ReadOnlyHttpHeaders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReadOnlyIterator implements java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>, java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> {
        private java.lang.CharSequence key;
        private int nextNameIndex;
        final /* synthetic */ io.netty.handler.codec.http.ReadOnlyHttpHeaders this$0;
        private java.lang.CharSequence value;

        private ReadOnlyIterator(io.netty.handler.codec.http.ReadOnlyHttpHeaders r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ReadOnlyIterator(io.netty.handler.codec.http.ReadOnlyHttpHeaders r1, io.netty.handler.codec.http.ReadOnlyHttpHeaders.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Map.Entry
        public java.lang.CharSequence getKey() {
                r1 = this;
                java.lang.CharSequence r0 = r1.key
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
                java.lang.CharSequence r0 = r1.value
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
                int r0 = r2.nextNameIndex
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r1 = r2.this$0
                java.lang.CharSequence[] r1 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r1)
                int r1 = r1.length
                if (r0 == r1) goto Ld
                r0 = 1
                return r0
            Ld:
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
                if (r0 == 0) goto L25
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r0 = r3.this$0
                java.lang.CharSequence[] r0 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r0)
                int r1 = r3.nextNameIndex
                r0 = r0[r1]
                r3.key = r0
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r0 = r3.this$0
                java.lang.CharSequence[] r0 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r0)
                int r1 = r3.nextNameIndex
                int r2 = r1 + 1
                r0 = r0[r2]
                r3.value = r0
                int r1 = r1 + 2
                r3.nextNameIndex = r1
                return r3
            L25:
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
                java.lang.CharSequence r1 = r2.key
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.CharSequence r1 = r2.value
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReadOnlyStringIterator implements java.util.Map.Entry<java.lang.String, java.lang.String>, java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> {
        private java.lang.String key;
        private int nextNameIndex;
        final /* synthetic */ io.netty.handler.codec.http.ReadOnlyHttpHeaders this$0;
        private java.lang.String value;

        private ReadOnlyStringIterator(io.netty.handler.codec.http.ReadOnlyHttpHeaders r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ReadOnlyStringIterator(io.netty.handler.codec.http.ReadOnlyHttpHeaders r1, io.netty.handler.codec.http.ReadOnlyHttpHeaders.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.getKey2()
                return r0
        }

        @Override // java.util.Map.Entry
        /* renamed from: getKey, reason: avoid collision after fix types in other method */
        public java.lang.String getKey2() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.getValue2()
                return r0
        }

        @Override // java.util.Map.Entry
        /* renamed from: getValue, reason: avoid collision after fix types in other method */
        public java.lang.String getValue2() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.nextNameIndex
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r1 = r2.this$0
                java.lang.CharSequence[] r1 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r1)
                int r1 = r1.length
                if (r0 == r1) goto Ld
                r0 = 1
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.util.Map.Entry<java.lang.String, java.lang.String> next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.util.Map.Entry<java.lang.String, java.lang.String> next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L2f
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r0 = r2.this$0
                java.lang.CharSequence[] r0 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r0)
                int r1 = r2.nextNameIndex
                r0 = r0[r1]
                java.lang.String r0 = r0.toString()
                r2.key = r0
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r0 = r2.this$0
                java.lang.CharSequence[] r0 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r0)
                int r1 = r2.nextNameIndex
                int r1 = r1 + 1
                r0 = r0[r1]
                java.lang.String r0 = r0.toString()
                r2.value = r0
                int r0 = r2.nextNameIndex
                int r0 = r0 + 2
                r2.nextNameIndex = r0
                return r2
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

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.String setValue(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r0.setValue2(r1)
                return r1
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public java.lang.String setValue2(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "read only"
                r2.<init>(r0)
                throw r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.key
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.String r1 = r2.value
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReadOnlyStringValueIterator implements java.util.Iterator<java.lang.String> {
        private final java.lang.CharSequence name;
        private final int nameHash;
        private int nextNameIndex;
        final /* synthetic */ io.netty.handler.codec.http.ReadOnlyHttpHeaders this$0;

        ReadOnlyStringValueIterator(io.netty.handler.codec.http.ReadOnlyHttpHeaders r1, java.lang.CharSequence r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                int r1 = io.netty.util.AsciiString.hashCode(r2)
                r0.nameHash = r1
                int r1 = r0.findNextValue()
                r0.nextNameIndex = r1
                return
        }

        private int findNextValue() {
                r4 = this;
                int r0 = r4.nextNameIndex
            L2:
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r1 = r4.this$0
                java.lang.CharSequence[] r1 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r1)
                int r1 = r1.length
                if (r0 >= r1) goto L27
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r1 = r4.this$0
                java.lang.CharSequence[] r1 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r1)
                r1 = r1[r0]
                int r2 = r4.nameHash
                int r3 = io.netty.util.AsciiString.hashCode(r1)
                if (r2 != r3) goto L24
                java.lang.CharSequence r2 = r4.name
                boolean r1 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r1)
                if (r1 == 0) goto L24
                return r0
            L24:
                int r0 = r0 + 2
                goto L2
            L27:
                r0 = -1
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.nextNameIndex
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.lang.String next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1d
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r0 = r2.this$0
                java.lang.CharSequence[] r0 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r0)
                int r1 = r2.nextNameIndex
                int r1 = r1 + 1
                r0 = r0[r1]
                java.lang.String r0 = r0.toString()
                int r1 = r2.findNextValue()
                r2.nextNameIndex = r1
                return r0
            L1d:
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ReadOnlyValueIterator implements java.util.Iterator<java.lang.CharSequence> {
        private final java.lang.CharSequence name;
        private final int nameHash;
        private int nextNameIndex;
        final /* synthetic */ io.netty.handler.codec.http.ReadOnlyHttpHeaders this$0;

        ReadOnlyValueIterator(io.netty.handler.codec.http.ReadOnlyHttpHeaders r1, java.lang.CharSequence r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                int r1 = io.netty.util.AsciiString.hashCode(r2)
                r0.nameHash = r1
                int r1 = r0.findNextValue()
                r0.nextNameIndex = r1
                return
        }

        private int findNextValue() {
                r4 = this;
                int r0 = r4.nextNameIndex
            L2:
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r1 = r4.this$0
                java.lang.CharSequence[] r1 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r1)
                int r1 = r1.length
                if (r0 >= r1) goto L27
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r1 = r4.this$0
                java.lang.CharSequence[] r1 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r1)
                r1 = r1[r0]
                int r2 = r4.nameHash
                int r3 = io.netty.util.AsciiString.hashCode(r1)
                if (r2 != r3) goto L24
                java.lang.CharSequence r2 = r4.name
                boolean r1 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r1)
                if (r1 == 0) goto L24
                return r0
            L24:
                int r0 = r0 + 2
                goto L2
            L27:
                r0 = -1
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.nextNameIndex
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.CharSequence next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L19
                io.netty.handler.codec.http.ReadOnlyHttpHeaders r0 = r2.this$0
                java.lang.CharSequence[] r0 = io.netty.handler.codec.http.ReadOnlyHttpHeaders.access$200(r0)
                int r1 = r2.nextNameIndex
                int r1 = r1 + 1
                r0 = r0[r1]
                int r1 = r2.findNextValue()
                r2.nextNameIndex = r1
                return r0
            L19:
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

    public ReadOnlyHttpHeaders(boolean r2, java.lang.CharSequence... r3) {
            r1 = this;
            r1.<init>()
            int r0 = r3.length
            r0 = r0 & 1
            if (r0 != 0) goto L10
            if (r2 == 0) goto Ld
            validateHeaders(r3)
        Ld:
            r1.nameValuePairs = r3
            return
        L10:
            java.lang.IllegalArgumentException r2 = newInvalidArraySizeException()
            throw r2
    }

    static /* synthetic */ java.lang.CharSequence[] access$200(io.netty.handler.codec.http.ReadOnlyHttpHeaders r0) {
            java.lang.CharSequence[] r0 = r0.nameValuePairs
            return r0
    }

    private java.lang.CharSequence get0(java.lang.CharSequence r5) {
            r4 = this;
            int r0 = io.netty.util.AsciiString.hashCode(r5)
            r1 = 0
        L5:
            java.lang.CharSequence[] r2 = r4.nameValuePairs
            int r3 = r2.length
            if (r1 >= r3) goto L22
            r2 = r2[r1]
            int r3 = io.netty.util.AsciiString.hashCode(r2)
            if (r3 != r0) goto L1f
            boolean r2 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r5)
            if (r2 == 0) goto L1f
            java.lang.CharSequence[] r5 = r4.nameValuePairs
            int r1 = r1 + 1
            r5 = r5[r1]
            return r5
        L1f:
            int r1 = r1 + 2
            goto L5
        L22:
            r5 = 0
            return r5
    }

    private static java.lang.IllegalArgumentException newInvalidArraySizeException() {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "nameValuePairs must be arrays of [name, value] pairs"
            r0.<init>(r1)
            return r0
    }

    private static void validateHeaders(java.lang.CharSequence... r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto Le
            io.netty.handler.codec.DefaultHeaders$NameValidator<java.lang.CharSequence> r1 = io.netty.handler.codec.http.DefaultHttpHeaders.HttpNameValidator
            r2 = r3[r0]
            r1.validateName(r2)
            int r0 = r0 + 2
            goto L1
        Le:
            return
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.String r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders addInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders addShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "read only"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.String r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get0(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            boolean r1 = r0.containsValue(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean containsValue(java.lang.CharSequence r5, java.lang.CharSequence r6, boolean r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L22
            r7 = 0
        L5:
            java.lang.CharSequence[] r2 = r4.nameValuePairs
            int r3 = r2.length
            if (r7 >= r3) goto L40
            r2 = r2[r7]
            boolean r2 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r5)
            if (r2 == 0) goto L1f
            java.lang.CharSequence[] r2 = r4.nameValuePairs
            int r3 = r7 + 1
            r2 = r2[r3]
            boolean r2 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r6)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r7 = r7 + 2
            goto L5
        L22:
            r7 = 0
        L23:
            java.lang.CharSequence[] r2 = r4.nameValuePairs
            int r3 = r2.length
            if (r7 >= r3) goto L40
            r2 = r2[r7]
            boolean r2 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r5)
            if (r2 == 0) goto L3d
            java.lang.CharSequence[] r2 = r4.nameValuePairs
            int r3 = r7 + 1
            r2 = r2[r3]
            boolean r2 = io.netty.util.AsciiString.contentEquals(r2, r6)
            if (r2 == 0) goto L3d
            return r1
        L3d:
            int r7 = r7 + 2
            goto L23
        L40:
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> entries() {
            r6 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r1 = 0
        L13:
            java.lang.CharSequence[] r2 = r6.nameValuePairs
            int r2 = r2.length
            if (r1 >= r2) goto L35
            java.util.AbstractMap$SimpleImmutableEntry r2 = new java.util.AbstractMap$SimpleImmutableEntry
            java.lang.CharSequence[] r3 = r6.nameValuePairs
            r3 = r3[r1]
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence[] r4 = r6.nameValuePairs
            int r5 = r1 + 1
            r4 = r4[r5]
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            r0.add(r2)
            int r1 = r1 + 2
            goto L13
        L35:
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.String get(java.lang.String r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get0(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.lang.String> getAll(java.lang.String r6) {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            return r6
        L9:
            int r0 = io.netty.util.AsciiString.hashCode(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 4
            r1.<init>(r2)
            r2 = 0
        L14:
            java.lang.CharSequence[] r3 = r5.nameValuePairs
            int r4 = r3.length
            if (r2 >= r4) goto L37
            r3 = r3[r2]
            int r4 = io.netty.util.AsciiString.hashCode(r3)
            if (r4 != r0) goto L34
            boolean r3 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r3, r6)
            if (r3 == 0) goto L34
            java.lang.CharSequence[] r3 = r5.nameValuePairs
            int r4 = r2 + 1
            r3 = r3[r4]
            java.lang.String r3 = r3.toString()
            r1.add(r3)
        L34:
            int r2 = r2 + 2
            goto L14
        L37:
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public int getInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get0(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            io.netty.handler.codec.CharSequenceValueConverter r2 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            int r1 = r2.convertToInt2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Integer getInt(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r2 = r1.get0(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            int r2 = r0.convertToInt2(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Short getShort(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r2 = r1.get0(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            short r2 = r0.convertToShort2(r2)
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public short getShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get0(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            io.netty.handler.codec.CharSequenceValueConverter r2 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            short r1 = r2.convertToShort2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public long getTimeMillis(java.lang.CharSequence r1, long r2) {
            r0 = this;
            java.lang.CharSequence r1 = r0.get0(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            io.netty.handler.codec.CharSequenceValueConverter r2 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            long r1 = r2.convertToTimeMillis2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Long getTimeMillis(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r3 = r2.get0(r3)
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            io.netty.handler.codec.CharSequenceValueConverter r0 = io.netty.handler.codec.CharSequenceValueConverter.INSTANCE
            long r0 = r0.convertToTimeMillis2(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean isEmpty() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.nameValuePairs
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iterator() {
            r2 = this;
            io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyStringIterator r0 = new io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyStringIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iteratorCharSequence() {
            r2 = this;
            io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyIterator r0 = new io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Set<java.lang.String> names() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r4.size()
            r0.<init>(r1)
            r1 = 0
        L13:
            java.lang.CharSequence[] r2 = r4.nameValuePairs
            int r3 = r2.length
            if (r1 >= r3) goto L24
            r2 = r2[r1]
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            int r1 = r1 + 2
            goto L13
        L24:
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders remove(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.String r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders setInt(java.lang.CharSequence r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders setShort(java.lang.CharSequence r1, short r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public int size() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.nameValuePairs
            int r0 = r0.length
            int r0 = r0 >>> 1
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.lang.CharSequence> valueCharSequenceIterator(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyValueIterator r0 = new io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyValueIterator
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.lang.String> valueStringIterator(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyStringValueIterator r0 = new io.netty.handler.codec.http.ReadOnlyHttpHeaders$ReadOnlyStringValueIterator
            r0.<init>(r1, r2)
            return r0
    }
}
