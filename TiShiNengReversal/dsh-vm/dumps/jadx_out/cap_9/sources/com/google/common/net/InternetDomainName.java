package com.google.common.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class InternetDomainName {
    private static final com.google.common.base.CharMatcher DASH_MATCHER = null;
    private static final com.google.common.base.CharMatcher DOTS_MATCHER = null;
    private static final com.google.common.base.Joiner DOT_JOINER = null;
    private static final com.google.common.base.Splitter DOT_SPLITTER = null;
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_SUFFIX_FOUND = -1;
    private static final com.google.common.base.CharMatcher PART_CHAR_MATCHER = null;
    private final java.lang.String name;
    private final com.google.common.collect.ImmutableList<java.lang.String> parts;
    private final int publicSuffixIndex;
    private final int registrySuffixIndex;

    static {
            java.lang.String r0 = ".。．｡"
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.anyOf(r0)
            com.google.common.net.InternetDomainName.DOTS_MATCHER = r0
            r0 = 46
            com.google.common.base.Splitter r1 = com.google.common.base.Splitter.on(r0)
            com.google.common.net.InternetDomainName.DOT_SPLITTER = r1
            com.google.common.base.Joiner r0 = com.google.common.base.Joiner.on(r0)
            com.google.common.net.InternetDomainName.DOT_JOINER = r0
            java.lang.String r0 = "-_"
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.anyOf(r0)
            com.google.common.net.InternetDomainName.DASH_MATCHER = r0
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.javaLetterOrDigit()
            com.google.common.base.CharMatcher r0 = r1.or(r0)
            com.google.common.net.InternetDomainName.PART_CHAR_MATCHER = r0
            return
    }

    InternetDomainName(java.lang.String r6) {
            r5 = this;
            r5.<init>()
            com.google.common.base.CharMatcher r0 = com.google.common.net.InternetDomainName.DOTS_MATCHER
            r1 = 46
            java.lang.String r6 = r0.replaceFrom(r6, r1)
            java.lang.String r6 = com.google.common.base.Ascii.toLowerCase(r6)
            java.lang.String r0 = "."
            boolean r0 = r6.endsWith(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            int r0 = r6.length()
            int r0 = r0 - r1
            java.lang.String r6 = r6.substring(r2, r0)
        L22:
            int r0 = r6.length()
            r3 = 253(0xfd, float:3.55E-43)
            if (r0 > r3) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            java.lang.String r3 = "Domain name too long: '%s':"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r6)
            r5.name = r6
            com.google.common.base.Splitter r0 = com.google.common.net.InternetDomainName.DOT_SPLITTER
            java.lang.Iterable r0 = r0.split(r6)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r5.parts = r0
            int r3 = r0.size()
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L49
            goto L4a
        L49:
            r1 = 0
        L4a:
            java.lang.String r2 = "Domain has too many parts: '%s'"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r6)
            boolean r0 = validateSyntax(r0)
            java.lang.String r1 = "Not a valid domain name: '%s'"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            com.google.common.base.Optional r6 = com.google.common.base.Optional.absent()
            int r6 = r5.findSuffixOfType(r6)
            r5.publicSuffixIndex = r6
            com.google.thirdparty.publicsuffix.PublicSuffixType r6 = com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY
            com.google.common.base.Optional r6 = com.google.common.base.Optional.of(r6)
            int r6 = r5.findSuffixOfType(r6)
            r5.registrySuffixIndex = r6
            return
    }

    private com.google.common.net.InternetDomainName ancestor(int r4) {
            r3 = this;
            com.google.common.base.Joiner r0 = com.google.common.net.InternetDomainName.DOT_JOINER
            com.google.common.collect.ImmutableList<java.lang.String> r1 = r3.parts
            int r2 = r1.size()
            com.google.common.collect.ImmutableList r4 = r1.subList(r4, r2)
            java.lang.String r4 = r0.join(r4)
            com.google.common.net.InternetDomainName r4 = from(r4)
            return r4
    }

    private int findSuffixOfType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> r5) {
            r4 = this;
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r4.parts
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L3b
            com.google.common.base.Joiner r2 = com.google.common.net.InternetDomainName.DOT_JOINER
            com.google.common.collect.ImmutableList<java.lang.String> r3 = r4.parts
            com.google.common.collect.ImmutableList r3 = r3.subList(r1, r0)
            java.lang.String r2 = r2.join(r3)
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r3 = com.google.thirdparty.publicsuffix.PublicSuffixPatterns.EXACT
            java.lang.Object r3 = r3.get(r2)
            com.google.common.base.Optional r3 = com.google.common.base.Optional.fromNullable(r3)
            boolean r3 = matchesType(r5, r3)
            if (r3 == 0) goto L26
            goto L37
        L26:
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r3 = com.google.thirdparty.publicsuffix.PublicSuffixPatterns.EXCLUDED
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L31
            int r1 = r1 + 1
            return r1
        L31:
            boolean r2 = matchesWildcardSuffixType(r5, r2)
            if (r2 == 0) goto L38
        L37:
            return r1
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r5 = -1
            return r5
    }

    public static com.google.common.net.InternetDomainName from(java.lang.String r1) {
            com.google.common.net.InternetDomainName r0 = new com.google.common.net.InternetDomainName
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
    }

    public static boolean isValid(java.lang.String r0) {
            from(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static boolean matchesType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> r1, com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> r2) {
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto Lb
            boolean r1 = r1.equals(r2)
            return r1
        Lb:
            boolean r1 = r2.isPresent()
            return r1
    }

    private static boolean matchesWildcardSuffixType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> r2, java.lang.String r3) {
            com.google.common.base.Splitter r0 = com.google.common.net.InternetDomainName.DOT_SPLITTER
            r1 = 2
            com.google.common.base.Splitter r0 = r0.limit(r1)
            java.util.List r3 = r0.splitToList(r3)
            int r0 = r3.size()
            if (r0 != r1) goto L27
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r0 = com.google.thirdparty.publicsuffix.PublicSuffixPatterns.UNDER
            r1 = 1
            java.lang.Object r3 = r3.get(r1)
            java.lang.Object r3 = r0.get(r3)
            com.google.common.base.Optional r3 = com.google.common.base.Optional.fromNullable(r3)
            boolean r2 = matchesType(r2, r3)
            if (r2 == 0) goto L27
            return r1
        L27:
            r2 = 0
            return r2
    }

    private static boolean validatePart(java.lang.String r4, boolean r5) {
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L50
            int r0 = r4.length()
            r3 = 63
            if (r0 <= r3) goto L11
            goto L50
        L11:
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.ascii()
            java.lang.String r0 = r0.retainFrom(r4)
            com.google.common.base.CharMatcher r3 = com.google.common.net.InternetDomainName.PART_CHAR_MATCHER
            boolean r0 = r3.matchesAllOf(r0)
            if (r0 != 0) goto L22
            return r1
        L22:
            com.google.common.base.CharMatcher r0 = com.google.common.net.InternetDomainName.DASH_MATCHER
            char r3 = r4.charAt(r1)
            boolean r3 = r0.matches(r3)
            if (r3 != 0) goto L50
            int r3 = r4.length()
            int r3 = r3 - r2
            char r3 = r4.charAt(r3)
            boolean r0 = r0.matches(r3)
            if (r0 == 0) goto L3e
            goto L50
        L3e:
            if (r5 == 0) goto L4f
            com.google.common.base.CharMatcher r5 = com.google.common.base.CharMatcher.digit()
            char r4 = r4.charAt(r1)
            boolean r4 = r5.matches(r4)
            if (r4 == 0) goto L4f
            return r1
        L4f:
            return r2
        L50:
            return r1
    }

    private static boolean validateSyntax(java.util.List<java.lang.String> r5) {
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = validatePart(r2, r1)
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r2 = 0
        L15:
            if (r2 >= r0) goto L27
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = validatePart(r4, r3)
            if (r4 != 0) goto L24
            return r3
        L24:
            int r2 = r2 + 1
            goto L15
        L27:
            return r1
    }

    public com.google.common.net.InternetDomainName child(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "."
            r0.append(r2)
            java.lang.String r2 = r1.name
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.google.common.net.InternetDomainName r2 = from(r2)
            return r2
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.net.InternetDomainName
            if (r0 == 0) goto L13
            com.google.common.net.InternetDomainName r2 = (com.google.common.net.InternetDomainName) r2
            java.lang.String r0 = r1.name
            java.lang.String r2 = r2.name
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public boolean hasParent() {
            r2 = this;
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r2.parts
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    public boolean hasPublicSuffix() {
            r2 = this;
            int r0 = r2.publicSuffixIndex
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean hasRegistrySuffix() {
            r2 = this;
            int r0 = r2.registrySuffixIndex
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isPublicSuffix() {
            r1 = this;
            int r0 = r1.publicSuffixIndex
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isRegistrySuffix() {
            r1 = this;
            int r0 = r1.registrySuffixIndex
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isTopDomainUnderRegistrySuffix() {
            r2 = this;
            int r0 = r2.registrySuffixIndex
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean isTopPrivateDomain() {
            r2 = this;
            int r0 = r2.publicSuffixIndex
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean isUnderPublicSuffix() {
            r1 = this;
            int r0 = r1.publicSuffixIndex
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isUnderRegistrySuffix() {
            r1 = this;
            int r0 = r1.registrySuffixIndex
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public com.google.common.net.InternetDomainName parent() {
            r3 = this;
            boolean r0 = r3.hasParent()
            java.lang.String r1 = "Domain '%s' has no parent"
            java.lang.String r2 = r3.name
            com.google.common.base.Preconditions.checkState(r0, r1, r2)
            r0 = 1
            com.google.common.net.InternetDomainName r0 = r3.ancestor(r0)
            return r0
    }

    public com.google.common.collect.ImmutableList<java.lang.String> parts() {
            r1 = this;
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r1.parts
            return r0
    }

    public com.google.common.net.InternetDomainName publicSuffix() {
            r1 = this;
            boolean r0 = r1.hasPublicSuffix()
            if (r0 == 0) goto Ld
            int r0 = r1.publicSuffixIndex
            com.google.common.net.InternetDomainName r0 = r1.ancestor(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public com.google.common.net.InternetDomainName registrySuffix() {
            r1 = this;
            boolean r0 = r1.hasRegistrySuffix()
            if (r0 == 0) goto Ld
            int r0 = r1.registrySuffixIndex
            com.google.common.net.InternetDomainName r0 = r1.ancestor(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public com.google.common.net.InternetDomainName topDomainUnderRegistrySuffix() {
            r3 = this;
            boolean r0 = r3.isTopDomainUnderRegistrySuffix()
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = r3.isUnderRegistrySuffix()
            java.lang.String r1 = "Not under a registry suffix: %s"
            java.lang.String r2 = r3.name
            com.google.common.base.Preconditions.checkState(r0, r1, r2)
            int r0 = r3.registrySuffixIndex
            int r0 = r0 + (-1)
            com.google.common.net.InternetDomainName r0 = r3.ancestor(r0)
            return r0
    }

    public com.google.common.net.InternetDomainName topPrivateDomain() {
            r3 = this;
            boolean r0 = r3.isTopPrivateDomain()
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = r3.isUnderPublicSuffix()
            java.lang.String r1 = "Not under a public suffix: %s"
            java.lang.String r2 = r3.name
            com.google.common.base.Preconditions.checkState(r0, r1, r2)
            int r0 = r3.publicSuffixIndex
            int r0 = r0 + (-1)
            com.google.common.net.InternetDomainName r0 = r3.ancestor(r0)
            return r0
    }
}
