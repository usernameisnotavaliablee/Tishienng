package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CombinedHttpHeaders extends io.netty.handler.codec.http.DefaultHttpHeaders {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CombinedHttpHeadersImpl extends io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl> {
        private static final int VALUE_LENGTH_ESTIMATE = 10;
        private io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl.CsvValueEscaper<java.lang.CharSequence> charSequenceEscaper;
        private io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl.CsvValueEscaper<java.lang.Object> objectEscaper;



        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private interface CsvValueEscaper<T> {
            java.lang.CharSequence escape(T r1);
        }

        CombinedHttpHeadersImpl(io.netty.util.HashingStrategy<java.lang.CharSequence> r1, io.netty.handler.codec.ValueConverter<java.lang.CharSequence> r2, io.netty.handler.codec.DefaultHeaders.NameValidator<java.lang.CharSequence> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ io.netty.handler.codec.ValueConverter access$000(io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl r0) {
                io.netty.handler.codec.ValueConverter r0 = r0.valueConverter()
                return r0
        }

        private io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl addEscapedValue(java.lang.CharSequence r3, java.lang.CharSequence r4) {
                r2 = this;
                java.lang.Object r0 = super.get(r3)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L17
                boolean r1 = cannotBeCombined(r3)
                if (r1 == 0) goto Lf
                goto L17
            Lf:
                java.lang.CharSequence r4 = commaSeparateEscapedValues(r0, r4)
                super.set(r3, r4)
                return r2
            L17:
                super.add(r3, r4)
                return r2
        }

        private static boolean cannotBeCombined(java.lang.CharSequence r1) {
                io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SET_COOKIE
                boolean r1 = r0.contentEqualsIgnoreCase(r1)
                return r1
        }

        private io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl.CsvValueEscaper<java.lang.CharSequence> charSequenceEscaper() {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper<java.lang.CharSequence> r0 = r1.charSequenceEscaper
                if (r0 != 0) goto Lb
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$2 r0 = new io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$2
                r0.<init>(r1)
                r1.charSequenceEscaper = r0
            Lb:
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper<java.lang.CharSequence> r0 = r1.charSequenceEscaper
                return r0
        }

        private static <T> java.lang.CharSequence commaSeparate(io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl.CsvValueEscaper<T> r3, java.lang.Iterable<? extends T> r4) {
                boolean r0 = r4 instanceof java.util.Collection
                if (r0 == 0) goto L13
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r4
                java.util.Collection r1 = (java.util.Collection) r1
                int r1 = r1.size()
                int r1 = r1 * 10
                r0.<init>(r1)
                goto L18
            L13:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
            L18:
                java.util.Iterator r4 = r4.iterator()
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L44
                java.lang.Object r1 = r4.next()
            L26:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L3d
                java.lang.CharSequence r1 = r3.escape(r1)
                r0.append(r1)
                r1 = 44
                r0.append(r1)
                java.lang.Object r1 = r4.next()
                goto L26
            L3d:
                java.lang.CharSequence r3 = r3.escape(r1)
                r0.append(r3)
            L44:
                return r0
        }

        private static <T> java.lang.CharSequence commaSeparate(io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl.CsvValueEscaper<T> r4, T... r5) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r5.length
                int r1 = r1 * 10
                r0.<init>(r1)
                int r1 = r5.length
                if (r1 <= 0) goto L2b
                int r1 = r5.length
                int r1 = r1 + (-1)
                r2 = 0
            Lf:
                if (r2 >= r1) goto L22
                r3 = r5[r2]
                java.lang.CharSequence r3 = r4.escape(r3)
                r0.append(r3)
                r3 = 44
                r0.append(r3)
                int r2 = r2 + 1
                goto Lf
            L22:
                r5 = r5[r1]
                java.lang.CharSequence r4 = r4.escape(r5)
                r0.append(r4)
            L2b:
                return r0
        }

        private static java.lang.CharSequence commaSeparateEscapedValues(java.lang.CharSequence r3, java.lang.CharSequence r4) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r3.length()
                int r1 = r1 + 1
                int r2 = r4.length()
                int r1 = r1 + r2
                r0.<init>(r1)
                r0.append(r3)
                r3 = 44
                r0.append(r3)
                r0.append(r4)
                return r0
        }

        private io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl.CsvValueEscaper<java.lang.Object> objectEscaper() {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper<java.lang.Object> r0 = r1.objectEscaper
                if (r0 != 0) goto Lb
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$1 r0 = new io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$1
                r0.<init>(r1)
                r1.objectEscaper = r0
            Lb:
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper<java.lang.Object> r0 = r1.objectEscaper
                return r0
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers add(io.netty.handler.codec.Headers r1) {
                r0 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.add(r1)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers add(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.add(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers add(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.add(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers add(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.add(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl add(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r3) {
                r2 = this;
                if (r3 == r2) goto L51
                boolean r0 = r3 instanceof io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl
                if (r0 == 0) goto L30
                boolean r0 = r2.isEmpty()
                if (r0 == 0) goto L10
                r2.addImpl(r3)
                return r2
            L10:
                java.util.Iterator r3 = r3.iterator()
            L14:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L50
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r2.addEscapedValue(r1, r0)
                goto L14
            L30:
                java.util.Iterator r3 = r3.iterator()
            L34:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L50
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r2.add(r1, r0)
                goto L34
            L50:
                return r2
            L51:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "can't add to itself."
                r3.<init>(r0)
                throw r3
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl add(java.lang.CharSequence r2, java.lang.CharSequence r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.charSequenceEscaper()
                java.lang.CharSequence r3 = r0.escape(r3)
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r2 = r1.addEscapedValue(r2, r3)
                return r2
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl add(java.lang.CharSequence r2, java.lang.Iterable<? extends java.lang.CharSequence> r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.charSequenceEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r2 = r1.addEscapedValue(r2, r3)
                return r2
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl add(java.lang.CharSequence r2, java.lang.CharSequence... r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.charSequenceEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r2 = r1.addEscapedValue(r2, r3)
                return r2
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers addObject(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.addObject(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers addObject(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.addObject(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers addObject(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.addObject(r1, r2)
                return r1
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl addObject(java.lang.CharSequence r2, java.lang.Iterable<?> r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.objectEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r2 = r1.addEscapedValue(r2, r3)
                return r2
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl addObject(java.lang.CharSequence r4, java.lang.Object r5) {
                r3 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r3.objectEscaper()
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.CharSequence r5 = commaSeparate(r0, r1)
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r4 = r3.addEscapedValue(r4, r5)
                return r4
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl addObject(java.lang.CharSequence r2, java.lang.Object... r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.objectEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r2 = r1.addEscapedValue(r2, r3)
                return r2
        }

        public java.util.List<java.lang.CharSequence> getAll(java.lang.CharSequence r3) {
                r2 = this;
                java.util.List r0 = super.getAll(r3)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L2c
                boolean r3 = cannotBeCombined(r3)
                if (r3 == 0) goto L11
                goto L2c
            L11:
                int r3 = r0.size()
                r1 = 1
                if (r3 != r1) goto L24
                r3 = 0
                java.lang.Object r3 = r0.get(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.util.List r3 = io.netty.util.internal.StringUtil.unescapeCsvFields(r3)
                return r3
            L24:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "CombinedHttpHeaders should only have one value"
                r3.<init>(r0)
                throw r3
            L2c:
                return r0
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ java.util.List getAll(java.lang.Object r1) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.util.List r1 = r0.getAll(r1)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers set(io.netty.handler.codec.Headers r1) {
                r0 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.set(r1)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers set(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.set(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers set(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.set(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl set(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r1) {
                r0 = this;
                if (r1 != r0) goto L3
                return r0
            L3:
                r0.clear()
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.add(r1)
                return r1
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl set(java.lang.CharSequence r2, java.lang.Iterable<? extends java.lang.CharSequence> r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.charSequenceEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                super.set(r2, r3)
                return r1
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl set(java.lang.CharSequence r2, java.lang.CharSequence... r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.charSequenceEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                super.set(r2, r3)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers setAll(io.netty.handler.codec.Headers r1) {
                r0 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.setAll(r1)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl setAll(io.netty.handler.codec.Headers<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ?> r3) {
                r2 = this;
                if (r3 != r2) goto L3
                return r2
            L3:
                java.util.Set r0 = r3.names()
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2.remove(r1)
                goto Lb
            L1b:
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r3 = r2.add(r3)
                return r3
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers setObject(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.setObject(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers setObject(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.setObject(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.DefaultHeaders, io.netty.handler.codec.Headers
        public /* bridge */ /* synthetic */ io.netty.handler.codec.Headers setObject(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r1 = r0.setObject(r1, r2)
                return r1
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl setObject(java.lang.CharSequence r2, java.lang.Iterable<?> r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.objectEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                super.set(r2, r3)
                return r1
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl setObject(java.lang.CharSequence r4, java.lang.Object r5) {
                r3 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r3.objectEscaper()
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.CharSequence r5 = commaSeparate(r0, r1)
                super.set(r4, r5)
                return r3
        }

        public io.netty.handler.codec.http.CombinedHttpHeaders.CombinedHttpHeadersImpl setObject(java.lang.CharSequence r2, java.lang.Object... r3) {
                r1 = this;
                io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl$CsvValueEscaper r0 = r1.objectEscaper()
                java.lang.CharSequence r3 = commaSeparate(r0, r3)
                super.set(r2, r3)
                return r1
        }

        /* renamed from: valueIterator, reason: avoid collision after fix types in other method */
        public java.util.Iterator<java.lang.CharSequence> valueIterator2(java.lang.CharSequence r3) {
                r2 = this;
                java.util.Iterator r0 = super.valueIterator(r3)
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                boolean r3 = cannotBeCombined(r3)
                if (r3 == 0) goto L11
                goto L2e
            L11:
                java.lang.Object r3 = r0.next()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.util.List r3 = io.netty.util.internal.StringUtil.unescapeCsvFields(r3)
                java.util.Iterator r3 = r3.iterator()
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L26
                return r3
            L26:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "CombinedHttpHeaders should only have one value"
                r3.<init>(r0)
                throw r3
            L2e:
                return r0
        }

        @Override // io.netty.handler.codec.DefaultHeaders
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.CharSequence> valueIterator(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.util.Iterator r1 = r0.valueIterator2(r1)
                return r1
        }
    }

    public CombinedHttpHeaders(boolean r4) {
            r3 = this;
            io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl r0 = new io.netty.handler.codec.http.CombinedHttpHeaders$CombinedHttpHeadersImpl
            io.netty.util.HashingStrategy r1 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
            io.netty.handler.codec.ValueConverter r2 = io.netty.handler.codec.http.DefaultHttpHeaders.valueConverter(r4)
            io.netty.handler.codec.DefaultHeaders$NameValidator r4 = io.netty.handler.codec.http.DefaultHttpHeaders.nameValidator(r4)
            r0.<init>(r1, r2, r4)
            r3.<init>(r0)
            return
    }

    @Override // io.netty.handler.codec.http.HttpHeaders
    public boolean containsValue(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3) {
            r0 = this;
            java.lang.CharSequence r2 = io.netty.util.internal.StringUtil.trimOws(r2)
            boolean r1 = super.containsValue(r1, r2, r3)
            return r1
    }
}
