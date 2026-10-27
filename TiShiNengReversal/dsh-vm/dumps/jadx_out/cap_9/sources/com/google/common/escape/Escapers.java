package com.google.common.escape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Escapers {
    private static final com.google.common.escape.Escaper NULL_ESCAPER = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static final class Builder {
        private final java.util.Map<java.lang.Character, java.lang.String> replacementMap;
        private char safeMax;
        private char safeMin;
        private java.lang.String unsafeReplacement;


        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.replacementMap = r0
                r0 = 0
                r1.safeMin = r0
                r0 = 65535(0xffff, float:9.1834E-41)
                r1.safeMax = r0
                r0 = 0
                r1.unsafeReplacement = r0
                return
        }

        /* synthetic */ Builder(com.google.common.escape.Escapers.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String access$100(com.google.common.escape.Escapers.Builder r0) {
                java.lang.String r0 = r0.unsafeReplacement
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.escape.Escapers.Builder addEscape(char r2, java.lang.String r3) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                java.util.Map<java.lang.Character, java.lang.String> r0 = r1.replacementMap
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                r0.put(r2, r3)
                return r1
        }

        public com.google.common.escape.Escaper build() {
                r4 = this;
                com.google.common.escape.Escapers$Builder$1 r0 = new com.google.common.escape.Escapers$Builder$1
                java.util.Map<java.lang.Character, java.lang.String> r1 = r4.replacementMap
                char r2 = r4.safeMin
                char r3 = r4.safeMax
                r0.<init>(r4, r1, r2, r3)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.escape.Escapers.Builder setSafeRange(char r1, char r2) {
                r0 = this;
                r0.safeMin = r1
                r0.safeMax = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.escape.Escapers.Builder setUnsafeReplacement(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r1) {
                r0 = this;
                r0.unsafeReplacement = r1
                return r0
        }
    }

    static {
            com.google.common.escape.Escapers$1 r0 = new com.google.common.escape.Escapers$1
            r0.<init>()
            com.google.common.escape.Escapers.NULL_ESCAPER = r0
            return
    }

    private Escapers() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.common.escape.UnicodeEscaper asUnicodeEscaper(com.google.common.escape.Escaper r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r3 instanceof com.google.common.escape.UnicodeEscaper
            if (r0 == 0) goto La
            com.google.common.escape.UnicodeEscaper r3 = (com.google.common.escape.UnicodeEscaper) r3
            return r3
        La:
            boolean r0 = r3 instanceof com.google.common.escape.CharEscaper
            if (r0 == 0) goto L15
            com.google.common.escape.CharEscaper r3 = (com.google.common.escape.CharEscaper) r3
            com.google.common.escape.UnicodeEscaper r3 = wrap(r3)
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create a UnicodeEscaper from: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static com.google.common.escape.Escapers.Builder builder() {
            com.google.common.escape.Escapers$Builder r0 = new com.google.common.escape.Escapers$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String computeReplacement(com.google.common.escape.CharEscaper r0, char r1) {
            char[] r0 = r0.escape(r1)
            java.lang.String r0 = stringOrNull(r0)
            return r0
    }

    public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper r0, int r1) {
            char[] r0 = r0.escape(r1)
            java.lang.String r0 = stringOrNull(r0)
            return r0
    }

    public static com.google.common.escape.Escaper nullEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.escape.Escapers.NULL_ESCAPER
            return r0
    }

    private static java.lang.String stringOrNull(char[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    private static com.google.common.escape.UnicodeEscaper wrap(com.google.common.escape.CharEscaper r1) {
            com.google.common.escape.Escapers$2 r0 = new com.google.common.escape.Escapers$2
            r0.<init>(r1)
            return r0
    }
}
