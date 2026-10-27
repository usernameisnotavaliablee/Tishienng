package com.google.thirdparty.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class TrieParser {
    private static final com.google.common.base.Joiner PREFIX_JOINER = null;

    static {
            java.lang.String r0 = ""
            com.google.common.base.Joiner r0 = com.google.common.base.Joiner.on(r0)
            com.google.thirdparty.publicsuffix.TrieParser.PREFIX_JOINER = r0
            return
    }

    TrieParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int doParseTrieToBuilder(java.util.List<java.lang.CharSequence> r9, java.lang.CharSequence r10, int r11, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r12) {
            int r0 = r10.length()
            r1 = 0
            r2 = r11
            r3 = 0
        L7:
            r4 = 58
            r5 = 33
            r6 = 44
            r7 = 63
            if (r2 >= r0) goto L25
            char r3 = r10.charAt(r2)
            r8 = 38
            if (r3 == r8) goto L25
            if (r3 == r7) goto L25
            if (r3 == r5) goto L25
            if (r3 == r4) goto L25
            if (r3 != r6) goto L22
            goto L25
        L22:
            int r2 = r2 + 1
            goto L7
        L25:
            java.lang.CharSequence r8 = r10.subSequence(r11, r2)
            java.lang.CharSequence r8 = reverse(r8)
            r9.add(r1, r8)
            if (r3 == r5) goto L38
            if (r3 == r7) goto L38
            if (r3 == r4) goto L38
            if (r3 != r6) goto L4b
        L38:
            com.google.common.base.Joiner r4 = com.google.thirdparty.publicsuffix.TrieParser.PREFIX_JOINER
            java.lang.String r4 = r4.join(r9)
            int r5 = r4.length()
            if (r5 <= 0) goto L4b
            com.google.thirdparty.publicsuffix.PublicSuffixType r5 = com.google.thirdparty.publicsuffix.PublicSuffixType.fromCode(r3)
            r12.put(r4, r5)
        L4b:
            int r2 = r2 + 1
            if (r3 == r7) goto L66
            if (r3 == r6) goto L66
        L51:
            if (r2 >= r0) goto L66
            int r3 = doParseTrieToBuilder(r9, r10, r2, r12)
            int r2 = r2 + r3
            char r3 = r10.charAt(r2)
            if (r3 == r7) goto L64
            char r3 = r10.charAt(r2)
            if (r3 != r6) goto L51
        L64:
            int r2 = r2 + 1
        L66:
            r9.remove(r1)
            int r2 = r2 - r11
            return r2
    }

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseTrie(java.lang.CharSequence r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            int r1 = r4.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L15
            java.util.LinkedList r3 = com.google.common.collect.Lists.newLinkedList()
            int r3 = doParseTrieToBuilder(r3, r4, r2, r0)
            int r2 = r2 + r3
            goto L9
        L15:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    private static java.lang.CharSequence reverse(java.lang.CharSequence r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r1 = r0.reverse()
            return r1
    }
}
