package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttpHeaders extends io.netty.handler.codec.http.HttpHeaders {
    private static final io.netty.util.ByteProcessor HEADER_NAME_VALIDATOR = null;
    private static final int HIGHEST_INVALID_VALUE_CHAR_MASK = -16;
    static final io.netty.handler.codec.DefaultHeaders.NameValidator<java.lang.CharSequence> HttpNameValidator = null;
    private final io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> headers;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class HeaderValueConverter extends io.netty.handler.codec.CharSequenceValueConverter {
        static final io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverter INSTANCE = null;

        static {
                io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter r0 = new io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter
                r0.<init>()
                io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverter.INSTANCE = r0
                return
        }

        private HeaderValueConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ HeaderValueConverter(io.netty.handler.codec.http.DefaultHttpHeaders.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.netty.handler.codec.CharSequenceValueConverter, io.netty.handler.codec.ValueConverter
        public java.lang.CharSequence convertObject(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.CharSequence
                if (r0 == 0) goto L7
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                return r2
            L7:
                boolean r0 = r2 instanceof java.util.Date
                if (r0 == 0) goto L12
                java.util.Date r2 = (java.util.Date) r2
                java.lang.String r2 = io.netty.handler.codec.DateFormatter.format(r2)
                return r2
            L12:
                boolean r0 = r2 instanceof java.util.Calendar
                if (r0 == 0) goto L21
                java.util.Calendar r2 = (java.util.Calendar) r2
                java.util.Date r2 = r2.getTime()
                java.lang.String r2 = io.netty.handler.codec.DateFormatter.format(r2)
                return r2
            L21:
                java.lang.String r2 = r2.toString()
                return r2
        }

        @Override // io.netty.handler.codec.CharSequenceValueConverter, io.netty.handler.codec.ValueConverter
        public /* bridge */ /* synthetic */ java.lang.CharSequence convertObject(java.lang.Object r1) {
                r0 = this;
                java.lang.CharSequence r1 = r0.convertObject(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HeaderValueConverterAndValidator extends io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverter {
        static final io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverterAndValidator INSTANCE = null;

        static {
                io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator r0 = new io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator
                r0.<init>()
                io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverterAndValidator.INSTANCE = r0
                return
        }

        private HeaderValueConverterAndValidator() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        private static int validateValueChar(java.lang.CharSequence r3, int r4, char r5) {
                r0 = r5 & (-16)
                if (r0 != 0) goto L54
                if (r5 == 0) goto L3d
                r0 = 11
                if (r5 == r0) goto L26
                r0 = 12
                if (r5 == r0) goto Lf
                goto L54
            Lf:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "a header value contains a prohibited character '\\f': "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            L26:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "a header value contains a prohibited character '\\v': "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            L3d:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "a header value contains a prohibited character '\u0000': "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            L54:
                r0 = 10
                r1 = 1
                r2 = 2
                if (r4 == 0) goto L9b
                if (r4 == r1) goto L81
                if (r4 == r2) goto L5f
                goto La1
            L5f:
                r4 = 9
                if (r5 == r4) goto L7f
                r4 = 32
                if (r5 != r4) goto L68
                goto L7f
            L68:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "only ' ' and '\\t' are allowed after '\\n': "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            L7f:
                r3 = 0
                return r3
            L81:
                if (r5 != r0) goto L84
                return r2
            L84:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "only '\\n' is allowed after '\\r': "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            L9b:
                if (r5 == r0) goto La3
                r3 = 13
                if (r5 == r3) goto La2
            La1:
                return r4
            La2:
                return r1
            La3:
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverter, io.netty.handler.codec.CharSequenceValueConverter, io.netty.handler.codec.ValueConverter
        public java.lang.CharSequence convertObject(java.lang.Object r4) {
                r3 = this;
                java.lang.CharSequence r4 = super.convertObject(r4)
                r0 = 0
                r1 = 0
            L6:
                int r2 = r4.length()
                if (r0 >= r2) goto L17
                char r2 = r4.charAt(r0)
                int r1 = validateValueChar(r4, r1, r2)
                int r0 = r0 + 1
                goto L6
            L17:
                if (r1 != 0) goto L1a
                return r4
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "a header value must not end with '\\r' or '\\n':"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverter, io.netty.handler.codec.CharSequenceValueConverter, io.netty.handler.codec.ValueConverter
        public /* bridge */ /* synthetic */ java.lang.CharSequence convertObject(java.lang.Object r1) {
                r0 = this;
                java.lang.CharSequence r1 = r0.convertObject(r1)
                return r1
        }
    }

    static {
            io.netty.handler.codec.http.DefaultHttpHeaders$1 r0 = new io.netty.handler.codec.http.DefaultHttpHeaders$1
            r0.<init>()
            io.netty.handler.codec.http.DefaultHttpHeaders.HEADER_NAME_VALIDATOR = r0
            io.netty.handler.codec.http.DefaultHttpHeaders$2 r0 = new io.netty.handler.codec.http.DefaultHttpHeaders$2
            r0.<init>()
            io.netty.handler.codec.http.DefaultHttpHeaders.HttpNameValidator = r0
            return
    }

    public DefaultHttpHeaders() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    protected DefaultHttpHeaders(io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r1) {
            r0 = this;
            r0.<init>()
            r0.headers = r1
            return
    }

    public DefaultHttpHeaders(boolean r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator r0 = nameValidator(r2)
            r1.<init>(r2, r0)
            return
    }

    protected DefaultHttpHeaders(boolean r3, io.netty.handler.codec.DefaultHeaders.NameValidator<java.lang.CharSequence> r4) {
            r2 = this;
            io.netty.handler.codec.DefaultHeadersImpl r0 = new io.netty.handler.codec.DefaultHeadersImpl
            io.netty.util.HashingStrategy r1 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
            io.netty.handler.codec.ValueConverter r3 = valueConverter(r3)
            r0.<init>(r1, r3, r4)
            r2.<init>(r0)
            return
    }

    static /* synthetic */ void access$000(byte r0) {
            validateHeaderNameElement(r0)
            return
    }

    static /* synthetic */ io.netty.util.ByteProcessor access$100() {
            io.netty.util.ByteProcessor r0 = io.netty.handler.codec.http.DefaultHttpHeaders.HEADER_NAME_VALIDATOR
            return r0
    }

    static /* synthetic */ void access$200(char r0) {
            validateHeaderNameElement(r0)
            return
    }

    static io.netty.handler.codec.DefaultHeaders.NameValidator<java.lang.CharSequence> nameValidator(boolean r0) {
            if (r0 == 0) goto L5
            io.netty.handler.codec.DefaultHeaders$NameValidator<java.lang.CharSequence> r0 = io.netty.handler.codec.http.DefaultHttpHeaders.HttpNameValidator
            return r0
        L5:
            io.netty.handler.codec.DefaultHeaders$NameValidator r0 = io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL
            return r0
    }

    private static void validateHeaderNameElement(byte r3) {
            if (r3 == 0) goto L33
            r0 = 32
            if (r3 == r0) goto L33
            r0 = 44
            if (r3 == r0) goto L33
            r0 = 61
            if (r3 == r0) goto L33
            r0 = 58
            if (r3 == r0) goto L33
            r0 = 59
            if (r3 == r0) goto L33
            switch(r3) {
                case 9: goto L33;
                case 10: goto L33;
                case 11: goto L33;
                case 12: goto L33;
                case 13: goto L33;
                default: goto L19;
            }
        L19:
            if (r3 < 0) goto L1c
            return
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a header name cannot contain non-ASCII character: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void validateHeaderNameElement(char r3) {
            if (r3 == 0) goto L35
            r0 = 32
            if (r3 == r0) goto L35
            r0 = 44
            if (r3 == r0) goto L35
            r0 = 61
            if (r3 == r0) goto L35
            r0 = 58
            if (r3 == r0) goto L35
            r0 = 59
            if (r3 == r0) goto L35
            switch(r3) {
                case 9: goto L35;
                case 10: goto L35;
                case 11: goto L35;
                case 12: goto L35;
                case 13: goto L35;
                default: goto L19;
            }
        L19:
            r0 = 127(0x7f, float:1.78E-43)
            if (r3 > r0) goto L1e
            return
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a header name cannot contain non-ASCII character: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static io.netty.handler.codec.ValueConverter<java.lang.CharSequence> valueConverter(boolean r0) {
            if (r0 == 0) goto L5
            io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator r0 = io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverterAndValidator.INSTANCE
            return r0
        L5:
            io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter r0 = io.netty.handler.codec.http.DefaultHttpHeaders.HeaderValueConverter.INSTANCE
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(io.netty.handler.codec.http.HttpHeaders r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.DefaultHttpHeaders
            if (r0 == 0) goto Le
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            io.netty.handler.codec.http.DefaultHttpHeaders r2 = (io.netty.handler.codec.http.DefaultHttpHeaders) r2
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r2 = r2.headers
            r0.add(r2)
            return r1
        Le:
            io.netty.handler.codec.http.HttpHeaders r2 = super.add(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.CharSequence r2, java.lang.Iterable<?> r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.addObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.CharSequence r2, java.lang.Object r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.addObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.String r2, java.lang.Iterable<?> r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.addObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders add(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.addObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders addInt(java.lang.CharSequence r2, int r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.addInt(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders addShort(java.lang.CharSequence r2, short r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.addShort(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders clear() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.clear()
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.CharSequence r2, java.lang.CharSequence r3, boolean r4) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            if (r4 == 0) goto L7
            io.netty.util.HashingStrategy r4 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
            goto L9
        L7:
            io.netty.util.HashingStrategy r4 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
        L9:
            boolean r2 = r0.contains(r2, r3, r4)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.contains(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean contains(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            boolean r1 = r0.contains(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders copy() {
            r2 = this;
            io.netty.handler.codec.http.DefaultHttpHeaders r0 = new io.netty.handler.codec.http.DefaultHttpHeaders
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r1 = r2.headers
            io.netty.handler.codec.DefaultHeaders r1 = r1.copy()
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> entries() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r1 = r3.headers
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r0.add(r2)
            goto L18
        L28:
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.DefaultHttpHeaders
            if (r0 == 0) goto L14
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r2.headers
            io.netty.handler.codec.http.DefaultHttpHeaders r3 = (io.netty.handler.codec.http.DefaultHttpHeaders) r3
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r3 = r3.headers
            io.netty.util.HashingStrategy r1 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            boolean r3 = r0.equals(r3, r1)
            if (r3 == 0) goto L14
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.String get(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.lang.String r2 = io.netty.handler.codec.HeadersUtils.getAsString(r0, r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.String get(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.lang.String> getAll(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.util.List r2 = io.netty.handler.codec.HeadersUtils.getAllAsString(r0, r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.List<java.lang.String> getAll(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = r0.getAll(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public int getInt(java.lang.CharSequence r2, int r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Integer getInt(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.lang.Integer r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Short getShort(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.lang.Short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public short getShort(java.lang.CharSequence r2, short r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            short r2 = r0.getShort(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public long getTimeMillis(java.lang.CharSequence r2, long r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            long r2 = r0.getTimeMillis(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.lang.Long getTimeMillis(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.lang.Long r2 = r0.getTimeMillis(r2)
            return r2
    }

    public int hashCode() {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r2.headers
            io.netty.util.HashingStrategy r1 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            int r0 = r0.hashCode(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean isEmpty() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders, java.lang.Iterable
    @java.lang.Deprecated
    public java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iterator() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.util.Iterator r0 = io.netty.handler.codec.HeadersUtils.iteratorAsString(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iteratorCharSequence() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Set<java.lang.String> names() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.util.Set r0 = io.netty.handler.codec.HeadersUtils.namesAsString(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders remove(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.remove(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders remove(java.lang.String r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.remove(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(io.netty.handler.codec.http.HttpHeaders r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.DefaultHttpHeaders
            if (r0 == 0) goto Le
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            io.netty.handler.codec.http.DefaultHttpHeaders r2 = (io.netty.handler.codec.http.DefaultHttpHeaders) r2
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r2 = r2.headers
            r0.set(r2)
            return r1
        Le:
            io.netty.handler.codec.http.HttpHeaders r2 = super.set(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.CharSequence r2, java.lang.Iterable<?> r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.setObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.CharSequence r2, java.lang.Object r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.setObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.String r2, java.lang.Iterable<?> r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.setObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders set(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.setObject(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders setInt(java.lang.CharSequence r2, int r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public io.netty.handler.codec.http.HttpHeaders setShort(java.lang.CharSequence r2, short r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public int size() {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            int r0 = r0.size()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.lang.CharSequence> valueCharSequenceIterator(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, ?> r0 = r1.headers
            java.util.Iterator r2 = r0.valueIterator(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public java.util.Iterator<java.lang.String> valueStringIterator(java.lang.CharSequence r2) {
            r1 = this;
            java.util.Iterator r2 = r1.valueCharSequenceIterator(r2)
            io.netty.handler.codec.http.DefaultHttpHeaders$3 r0 = new io.netty.handler.codec.http.DefaultHttpHeaders$3
            r0.<init>(r1, r2)
            return r0
    }
}
