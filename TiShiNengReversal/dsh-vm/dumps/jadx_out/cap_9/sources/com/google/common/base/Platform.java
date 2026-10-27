package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Platform {
    private static final java.util.logging.Logger logger = null;
    private static final com.google.common.base.PatternCompiler patternCompiler = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.base.Platform$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class JdkPatternCompiler implements com.google.common.base.PatternCompiler {
        private JdkPatternCompiler() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ JdkPatternCompiler(com.google.common.base.Platform.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.PatternCompiler
        public com.google.common.base.CommonPattern compile(java.lang.String r2) {
                r1 = this;
                com.google.common.base.JdkPattern r0 = new com.google.common.base.JdkPattern
                java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.base.Platform> r0 = com.google.common.base.Platform.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.base.Platform.logger = r0
            com.google.common.base.PatternCompiler r0 = loadPatternCompiler()
            com.google.common.base.Platform.patternCompiler = r0
            return
    }

    private Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.common.base.CommonPattern compilePattern(java.lang.String r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.PatternCompiler r0 = com.google.common.base.Platform.patternCompiler
            com.google.common.base.CommonPattern r1 = r0.compile(r1)
            return r1
    }

    static java.lang.String emptyToNull(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r1) {
            boolean r0 = stringIsNullOrEmpty(r1)
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    static java.lang.String formatCompact4Digits(double r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r2
            java.lang.String r2 = "%.4g"
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getEnumIfPresent(java.lang.Class<T> r1, java.lang.String r2) {
            java.util.Map r0 = com.google.common.base.Enums.getEnumConstants(r1)
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 != 0) goto L11
            com.google.common.base.Optional r1 = com.google.common.base.Optional.absent()
            return r1
        L11:
            java.lang.Object r2 = r2.get()
            java.lang.Object r1 = r1.cast(r2)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
            return r1
    }

    private static com.google.common.base.PatternCompiler loadPatternCompiler() {
            com.google.common.base.Platform$JdkPatternCompiler r0 = new com.google.common.base.Platform$JdkPatternCompiler
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private static void logPatternCompilerError(java.util.ServiceConfigurationError r3) {
            java.util.logging.Logger r0 = com.google.common.base.Platform.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Error loading regex compiler, falling back to next option"
            r0.log(r1, r2, r3)
            return
    }

    static java.lang.String nullToEmpty(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    static boolean patternCompilerIsPcreLike() {
            com.google.common.base.PatternCompiler r0 = com.google.common.base.Platform.patternCompiler
            boolean r0 = r0.isPcreLike()
            return r0
    }

    static com.google.common.base.CharMatcher precomputeCharMatcher(com.google.common.base.CharMatcher r0) {
            com.google.common.base.CharMatcher r0 = r0.precomputedInternal()
            return r0
    }

    static boolean stringIsNullOrEmpty(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    static long systemNanoTime() {
            long r0 = java.lang.System.nanoTime()
            return r0
    }
}
