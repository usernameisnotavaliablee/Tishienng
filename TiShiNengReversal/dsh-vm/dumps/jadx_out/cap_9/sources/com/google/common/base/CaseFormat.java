package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum CaseFormat extends java.lang.Enum<com.google.common.base.CaseFormat> {
    private static final /* synthetic */ com.google.common.base.CaseFormat[] $VALUES = null;
    public static final com.google.common.base.CaseFormat LOWER_CAMEL = null;
    public static final com.google.common.base.CaseFormat LOWER_HYPHEN = null;
    public static final com.google.common.base.CaseFormat LOWER_UNDERSCORE = null;
    public static final com.google.common.base.CaseFormat UPPER_CAMEL = null;
    public static final com.google.common.base.CaseFormat UPPER_UNDERSCORE = null;
    private final com.google.common.base.CharMatcher wordBoundary;
    private final java.lang.String wordSeparator;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StringConverter extends com.google.common.base.Converter<java.lang.String, java.lang.String> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.CaseFormat sourceFormat;
        private final com.google.common.base.CaseFormat targetFormat;

        StringConverter(com.google.common.base.CaseFormat r1, com.google.common.base.CaseFormat r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CaseFormat r1 = (com.google.common.base.CaseFormat) r1
                r0.sourceFormat = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.CaseFormat r1 = (com.google.common.base.CaseFormat) r1
                r0.targetFormat = r1
                return
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ java.lang.String doBackward(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r0.doBackward2(r1)
                return r1
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected java.lang.String doBackward2(java.lang.String r3) {
                r2 = this;
                com.google.common.base.CaseFormat r0 = r2.targetFormat
                com.google.common.base.CaseFormat r1 = r2.sourceFormat
                java.lang.String r3 = r0.to(r1, r3)
                return r3
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ java.lang.String doForward(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r0.doForward2(r1)
                return r1
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected java.lang.String doForward2(java.lang.String r3) {
                r2 = this;
                com.google.common.base.CaseFormat r0 = r2.sourceFormat
                com.google.common.base.CaseFormat r1 = r2.targetFormat
                java.lang.String r3 = r0.to(r1, r3)
                return r3
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.CaseFormat.StringConverter
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.base.CaseFormat$StringConverter r4 = (com.google.common.base.CaseFormat.StringConverter) r4
                com.google.common.base.CaseFormat r0 = r3.sourceFormat
                com.google.common.base.CaseFormat r2 = r4.sourceFormat
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                com.google.common.base.CaseFormat r0 = r3.targetFormat
                com.google.common.base.CaseFormat r4 = r4.targetFormat
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.CaseFormat r0 = r2.sourceFormat
                int r0 = r0.hashCode()
                com.google.common.base.CaseFormat r1 = r2.targetFormat
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.base.CaseFormat r1 = r2.sourceFormat
                r0.append(r1)
                java.lang.String r1 = ".converterTo("
                r0.append(r1)
                com.google.common.base.CaseFormat r1 = r2.targetFormat
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.common.base.CaseFormat$1 r0 = new com.google.common.base.CaseFormat$1
            r1 = 45
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.is(r1)
            java.lang.String r2 = "-"
            java.lang.String r3 = "LOWER_HYPHEN"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            com.google.common.base.CaseFormat.LOWER_HYPHEN = r0
            com.google.common.base.CaseFormat$2 r1 = new com.google.common.base.CaseFormat$2
            r2 = 95
            com.google.common.base.CharMatcher r3 = com.google.common.base.CharMatcher.is(r2)
            java.lang.String r5 = "LOWER_UNDERSCORE"
            r6 = 1
            java.lang.String r7 = "_"
            r1.<init>(r5, r6, r3, r7)
            com.google.common.base.CaseFormat.LOWER_UNDERSCORE = r1
            com.google.common.base.CaseFormat$3 r3 = new com.google.common.base.CaseFormat$3
            r5 = 65
            r8 = 90
            com.google.common.base.CharMatcher r9 = com.google.common.base.CharMatcher.inRange(r5, r8)
            java.lang.String r10 = "LOWER_CAMEL"
            r11 = 2
            java.lang.String r12 = ""
            r3.<init>(r10, r11, r9, r12)
            com.google.common.base.CaseFormat.LOWER_CAMEL = r3
            com.google.common.base.CaseFormat$4 r9 = new com.google.common.base.CaseFormat$4
            com.google.common.base.CharMatcher r5 = com.google.common.base.CharMatcher.inRange(r5, r8)
            java.lang.String r8 = "UPPER_CAMEL"
            r10 = 3
            r9.<init>(r8, r10, r5, r12)
            com.google.common.base.CaseFormat.UPPER_CAMEL = r9
            com.google.common.base.CaseFormat$5 r5 = new com.google.common.base.CaseFormat$5
            com.google.common.base.CharMatcher r2 = com.google.common.base.CharMatcher.is(r2)
            java.lang.String r8 = "UPPER_UNDERSCORE"
            r12 = 4
            r5.<init>(r8, r12, r2, r7)
            com.google.common.base.CaseFormat.UPPER_UNDERSCORE = r5
            r2 = 5
            com.google.common.base.CaseFormat[] r2 = new com.google.common.base.CaseFormat[r2]
            r2[r4] = r0
            r2[r6] = r1
            r2[r11] = r3
            r2[r10] = r9
            r2[r12] = r5
            com.google.common.base.CaseFormat.$VALUES = r2
            return
    }

    CaseFormat(java.lang.String r1, int r2, com.google.common.base.CharMatcher r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.wordBoundary = r3
            r0.wordSeparator = r4
            return
    }

    /* synthetic */ CaseFormat(java.lang.String r1, int r2, com.google.common.base.CharMatcher r3, java.lang.String r4, com.google.common.base.CaseFormat.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ java.lang.String access$100(java.lang.String r0) {
            java.lang.String r0 = firstCharOnlyToUpper(r0)
            return r0
    }

    private static java.lang.String firstCharOnlyToUpper(java.lang.String r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r1 = r2.charAt(r1)
            char r1 = com.google.common.base.Ascii.toUpperCase(r1)
            r0.append(r1)
            r1 = 1
            java.lang.String r2 = r2.substring(r1)
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private java.lang.String normalizeFirstWord(java.lang.String r2) {
            r1 = this;
            com.google.common.base.CaseFormat r0 = com.google.common.base.CaseFormat.LOWER_CAMEL
            if (r1 != r0) goto L9
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            return r2
        L9:
            java.lang.String r2 = r1.normalizeWord(r2)
            return r2
    }

    public static com.google.common.base.CaseFormat valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.base.CaseFormat> r0 = com.google.common.base.CaseFormat.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.base.CaseFormat r1 = (com.google.common.base.CaseFormat) r1
            return r1
    }

    public static com.google.common.base.CaseFormat[] values() {
            com.google.common.base.CaseFormat[] r0 = com.google.common.base.CaseFormat.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.base.CaseFormat[] r0 = (com.google.common.base.CaseFormat[]) r0
            return r0
    }

    java.lang.String convert(com.google.common.base.CaseFormat r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = -1
        L4:
            com.google.common.base.CharMatcher r4 = r6.wordBoundary
            int r3 = r3 + 1
            int r3 = r4.indexIn(r8, r3)
            if (r3 == r2) goto L46
            if (r1 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r4 = r8.length()
            java.lang.String r5 = r6.wordSeparator
            int r5 = r5.length()
            int r5 = r5 * 4
            int r4 = r4 + r5
            r0.<init>(r4)
            java.lang.String r1 = r8.substring(r1, r3)
            java.lang.String r1 = r7.normalizeFirstWord(r1)
            r0.append(r1)
            goto L39
        L2e:
            java.lang.String r1 = r8.substring(r1, r3)
            java.lang.String r1 = r7.normalizeWord(r1)
            r0.append(r1)
        L39:
            java.lang.String r1 = r7.wordSeparator
            r0.append(r1)
            java.lang.String r1 = r6.wordSeparator
            int r1 = r1.length()
            int r1 = r1 + r3
            goto L4
        L46:
            if (r1 != 0) goto L4d
            java.lang.String r7 = r7.normalizeFirstWord(r8)
            return r7
        L4d:
            java.lang.String r8 = r8.substring(r1)
            java.lang.String r7 = r7.normalizeWord(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    public com.google.common.base.Converter<java.lang.String, java.lang.String> converterTo(com.google.common.base.CaseFormat r2) {
            r1 = this;
            com.google.common.base.CaseFormat$StringConverter r0 = new com.google.common.base.CaseFormat$StringConverter
            r0.<init>(r1, r2)
            return r0
    }

    abstract java.lang.String normalizeWord(java.lang.String r1);

    public final java.lang.String to(com.google.common.base.CaseFormat r1, java.lang.String r2) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            if (r1 != r0) goto L9
            return r2
        L9:
            java.lang.String r1 = r0.convert(r1, r2)
            return r1
    }
}
