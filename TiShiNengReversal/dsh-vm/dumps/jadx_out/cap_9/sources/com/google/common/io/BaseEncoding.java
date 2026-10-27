package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class BaseEncoding {
    private static final com.google.common.io.BaseEncoding BASE16 = null;
    private static final com.google.common.io.BaseEncoding BASE32 = null;
    private static final com.google.common.io.BaseEncoding BASE32_HEX = null;
    private static final com.google.common.io.BaseEncoding BASE64 = null;
    private static final com.google.common.io.BaseEncoding BASE64_URL = null;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        final int mask;
        private final java.lang.String name;
        private final boolean[] validPadding;

        Alphabet(java.lang.String r9, char[] r10) {
                r8 = this;
                r8.<init>()
                java.lang.Object r9 = com.google.common.base.Preconditions.checkNotNull(r9)
                java.lang.String r9 = (java.lang.String) r9
                r8.name = r9
                java.lang.Object r9 = com.google.common.base.Preconditions.checkNotNull(r10)
                char[] r9 = (char[]) r9
                r8.chars = r9
                int r9 = r10.length     // Catch: java.lang.ArithmeticException -> L95
                java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L95
                int r9 = com.google.common.math.IntMath.log2(r9, r0)     // Catch: java.lang.ArithmeticException -> L95
                r8.bitsPerChar = r9     // Catch: java.lang.ArithmeticException -> L95
                int r0 = java.lang.Integer.lowestOneBit(r9)
                r1 = 8
                int r0 = java.lang.Math.min(r1, r0)
                int r1 = r1 / r0
                r8.charsPerChunk = r1     // Catch: java.lang.ArithmeticException -> L78
                int r9 = r9 / r0
                r8.bytesPerChunk = r9     // Catch: java.lang.ArithmeticException -> L78
                int r9 = r10.length
                r0 = 1
                int r9 = r9 - r0
                r8.mask = r9
                r9 = 128(0x80, float:1.8E-43)
                byte[] r1 = new byte[r9]
                r2 = -1
                java.util.Arrays.fill(r1, r2)
                r3 = 0
                r4 = 0
            L3b:
                int r5 = r10.length
                if (r4 >= r5) goto L5c
                char r5 = r10[r4]
                if (r5 >= r9) goto L44
                r6 = 1
                goto L45
            L44:
                r6 = 0
            L45:
                java.lang.String r7 = "Non-ASCII character: %s"
                com.google.common.base.Preconditions.checkArgument(r6, r7, r5)
                r6 = r1[r5]
                if (r6 != r2) goto L50
                r6 = 1
                goto L51
            L50:
                r6 = 0
            L51:
                java.lang.String r7 = "Duplicate character: %s"
                com.google.common.base.Preconditions.checkArgument(r6, r7, r5)
                byte r6 = (byte) r4
                r1[r5] = r6
                int r4 = r4 + 1
                goto L3b
            L5c:
                r8.decodabet = r1
                int r9 = r8.charsPerChunk
                boolean[] r9 = new boolean[r9]
            L62:
                int r10 = r8.bytesPerChunk
                if (r3 >= r10) goto L75
                int r10 = r3 * 8
                int r1 = r8.bitsPerChar
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r10 = com.google.common.math.IntMath.divide(r10, r1, r2)
                r9[r10] = r0
                int r3 = r3 + 1
                goto L62
            L75:
                r8.validPadding = r9
                return
            L78:
                r9 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Illegal alphabet "
                r1.append(r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r10)
                r1.append(r2)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10, r9)
                throw r0
            L95:
                r9 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Illegal alphabet length "
                r1.append(r2)
                int r10 = r10.length
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10, r9)
                throw r0
        }

        static /* synthetic */ char[] access$000(com.google.common.io.BaseEncoding.Alphabet r0) {
                char[] r0 = r0.chars
                return r0
        }

        private boolean hasLowerCase() {
                r5 = this;
                char[] r0 = r5.chars
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                char r4 = r0[r3]
                boolean r4 = com.google.common.base.Ascii.isLowerCase(r4)
                if (r4 == 0) goto L11
                r0 = 1
                return r0
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        private boolean hasUpperCase() {
                r5 = this;
                char[] r0 = r5.chars
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                char r4 = r0[r3]
                boolean r4 = com.google.common.base.Ascii.isUpperCase(r4)
                if (r4 == 0) goto L11
                r0 = 1
                return r0
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        boolean canDecode(char r2) {
                r1 = this;
                r0 = 127(0x7f, float:1.78E-43)
                if (r2 > r0) goto Ld
                byte[] r0 = r1.decodabet
                r2 = r0[r2]
                r0 = -1
                if (r2 == r0) goto Ld
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }

        int decode(char r5) throws com.google.common.io.BaseEncoding.DecodingException {
                r4 = this;
                java.lang.String r0 = "Unrecognized character: 0x"
                r1 = 127(0x7f, float:1.78E-43)
                if (r5 > r1) goto L45
                byte[] r2 = r4.decodabet
                r2 = r2[r5]
                r3 = -1
                if (r2 != r3) goto L44
                r2 = 32
                if (r5 <= r2) goto L2b
                if (r5 != r1) goto L14
                goto L2b
            L14:
                com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unrecognized character: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L2b:
                com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            L44:
                return r2
            L45:
                com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }

        char encode(int r2) {
                r1 = this;
                char[] r0 = r1.chars
                char r2 = r0[r2]
                return r2
        }

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.io.BaseEncoding.Alphabet
                if (r0 == 0) goto Lf
                com.google.common.io.BaseEncoding$Alphabet r2 = (com.google.common.io.BaseEncoding.Alphabet) r2
                char[] r0 = r1.chars
                char[] r2 = r2.chars
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                char[] r0 = r1.chars
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        boolean isValidPaddingStartPosition(int r3) {
                r2 = this;
                boolean[] r0 = r2.validPadding
                int r1 = r2.charsPerChunk
                int r3 = r3 % r1
                boolean r3 = r0[r3]
                return r3
        }

        com.google.common.io.BaseEncoding.Alphabet lowerCase() {
                r4 = this;
                boolean r0 = r4.hasUpperCase()
                if (r0 != 0) goto L7
                return r4
            L7:
                boolean r0 = r4.hasLowerCase()
                r0 = r0 ^ 1
                java.lang.String r1 = "Cannot call lowerCase() on a mixed-case alphabet"
                com.google.common.base.Preconditions.checkState(r0, r1)
                char[] r0 = r4.chars
                int r0 = r0.length
                char[] r0 = new char[r0]
                r1 = 0
            L18:
                char[] r2 = r4.chars
                int r3 = r2.length
                if (r1 >= r3) goto L28
                char r2 = r2[r1]
                char r2 = com.google.common.base.Ascii.toLowerCase(r2)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L18
            L28:
                com.google.common.io.BaseEncoding$Alphabet r1 = new com.google.common.io.BaseEncoding$Alphabet
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.name
                r2.append(r3)
                java.lang.String r3 = ".lowerCase()"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                return r1
        }

        public boolean matches(char r3) {
                r2 = this;
                byte[] r0 = r2.decodabet
                int r1 = r0.length
                if (r3 >= r1) goto Lc
                r3 = r0[r3]
                r0 = -1
                if (r3 == r0) goto Lc
                r3 = 1
                return r3
            Lc:
                r3 = 0
                return r3
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        com.google.common.io.BaseEncoding.Alphabet upperCase() {
                r4 = this;
                boolean r0 = r4.hasLowerCase()
                if (r0 != 0) goto L7
                return r4
            L7:
                boolean r0 = r4.hasUpperCase()
                r0 = r0 ^ 1
                java.lang.String r1 = "Cannot call upperCase() on a mixed-case alphabet"
                com.google.common.base.Preconditions.checkState(r0, r1)
                char[] r0 = r4.chars
                int r0 = r0.length
                char[] r0 = new char[r0]
                r1 = 0
            L18:
                char[] r2 = r4.chars
                int r3 = r2.length
                if (r1 >= r3) goto L28
                char r2 = r2[r1]
                char r2 = com.google.common.base.Ascii.toUpperCase(r2)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L18
            L28:
                com.google.common.io.BaseEncoding$Alphabet r1 = new com.google.common.io.BaseEncoding$Alphabet
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.name
                r2.append(r3)
                java.lang.String r3 = ".upperCase()"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Base16Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        final char[] encoding;

        private Base16Encoding(com.google.common.io.BaseEncoding.Alphabet r5) {
                r4 = this;
                r0 = 0
                r4.<init>(r5, r0)
                r0 = 512(0x200, float:7.17E-43)
                char[] r0 = new char[r0]
                r4.encoding = r0
                char[] r0 = com.google.common.io.BaseEncoding.Alphabet.access$000(r5)
                int r0 = r0.length
                r1 = 16
                r2 = 0
                if (r0 != r1) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                com.google.common.base.Preconditions.checkArgument(r0)
            L1a:
                r0 = 256(0x100, float:3.59E-43)
                if (r2 >= r0) goto L37
                char[] r0 = r4.encoding
                int r1 = r2 >>> 4
                char r1 = r5.encode(r1)
                r0[r2] = r1
                char[] r0 = r4.encoding
                r1 = r2 | 256(0x100, float:3.59E-43)
                r3 = r2 & 15
                char r3 = r5.encode(r3)
                r0[r1] = r3
                int r2 = r2 + 1
                goto L1a
            L37:
                return
        }

        Base16Encoding(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] r6, java.lang.CharSequence r7) throws com.google.common.io.BaseEncoding.DecodingException {
                r5 = this;
                com.google.common.base.Preconditions.checkNotNull(r6)
                int r0 = r7.length()
                int r0 = r0 % 2
                r1 = 1
                if (r0 == r1) goto L37
                r0 = 0
                r1 = 0
            Le:
                int r2 = r7.length()
                if (r0 >= r2) goto L36
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                char r3 = r7.charAt(r0)
                int r2 = r2.decode(r3)
                int r2 = r2 << 4
                com.google.common.io.BaseEncoding$Alphabet r3 = r5.alphabet
                int r4 = r0 + 1
                char r4 = r7.charAt(r4)
                int r3 = r3.decode(r4)
                r2 = r2 | r3
                int r3 = r1 + 1
                byte r2 = (byte) r2
                r6[r1] = r2
                int r0 = r0 + 2
                r1 = r3
                goto Le
            L36:
                return r1
            L37:
                com.google.common.io.BaseEncoding$DecodingException r6 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid input length "
                r0.append(r1)
                int r7 = r7.length()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.<init>(r7)
                throw r6
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable r4, byte[] r5, int r6, int r7) throws java.io.IOException {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                int r0 = r6 + r7
                int r1 = r5.length
                com.google.common.base.Preconditions.checkPositionIndexes(r6, r0, r1)
                r0 = 0
            La:
                if (r0 >= r7) goto L25
                int r1 = r6 + r0
                r1 = r5[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                char[] r2 = r3.encoding
                char r2 = r2[r1]
                r4.append(r2)
                char[] r2 = r3.encoding
                r1 = r1 | 256(0x100, float:3.59E-43)
                char r1 = r2[r1]
                r4.append(r1)
                int r0 = r0 + 1
                goto La
            L25:
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r2) {
                r0 = this;
                com.google.common.io.BaseEncoding$Base16Encoding r2 = new com.google.common.io.BaseEncoding$Base16Encoding
                r2.<init>(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Base64Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        private Base64Encoding(com.google.common.io.BaseEncoding.Alphabet r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r2) {
                r0 = this;
                r0.<init>(r1, r2)
                char[] r1 = com.google.common.io.BaseEncoding.Alphabet.access$000(r1)
                int r1 = r1.length
                r2 = 64
                if (r1 != r2) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                com.google.common.base.Preconditions.checkArgument(r1)
                return
        }

        Base64Encoding(java.lang.String r2, java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r4) {
                r1 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] r8, java.lang.CharSequence r9) throws com.google.common.io.BaseEncoding.DecodingException {
                r7 = this;
                com.google.common.base.Preconditions.checkNotNull(r8)
                java.lang.CharSequence r9 = r7.trimTrailingPadding(r9)
                com.google.common.io.BaseEncoding$Alphabet r0 = r7.alphabet
                int r1 = r9.length()
                boolean r0 = r0.isValidPaddingStartPosition(r1)
                if (r0 == 0) goto L7f
                r0 = 0
                r1 = 0
            L15:
                int r2 = r9.length()
                if (r0 >= r2) goto L7e
                com.google.common.io.BaseEncoding$Alphabet r2 = r7.alphabet
                int r3 = r0 + 1
                char r4 = r9.charAt(r0)
                int r2 = r2.decode(r4)
                int r2 = r2 << 18
                com.google.common.io.BaseEncoding$Alphabet r4 = r7.alphabet
                int r5 = r0 + 2
                char r3 = r9.charAt(r3)
                int r3 = r4.decode(r3)
                int r3 = r3 << 12
                r2 = r2 | r3
                int r3 = r1 + 1
                int r4 = r2 >>> 16
                byte r4 = (byte) r4
                r8[r1] = r4
                int r4 = r9.length()
                if (r5 >= r4) goto L7b
                com.google.common.io.BaseEncoding$Alphabet r4 = r7.alphabet
                int r6 = r0 + 3
                char r5 = r9.charAt(r5)
                int r4 = r4.decode(r5)
                int r4 = r4 << 6
                r2 = r2 | r4
                int r4 = r1 + 2
                int r5 = r2 >>> 8
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                r8[r3] = r5
                int r3 = r9.length()
                if (r6 >= r3) goto L78
                com.google.common.io.BaseEncoding$Alphabet r3 = r7.alphabet
                int r0 = r0 + 4
                char r5 = r9.charAt(r6)
                int r3 = r3.decode(r5)
                r2 = r2 | r3
                int r1 = r1 + 3
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r8[r4] = r2
                goto L15
            L78:
                r1 = r4
                r0 = r6
                goto L15
            L7b:
                r1 = r3
                r0 = r5
                goto L15
            L7e:
                return r1
            L7f:
                com.google.common.io.BaseEncoding$DecodingException r8 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid input length "
                r0.append(r1)
                int r9 = r9.length()
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.<init>(r9)
                throw r8
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable r5, byte[] r6, int r7, int r8) throws java.io.IOException {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                int r0 = r7 + r8
                int r1 = r6.length
                com.google.common.base.Preconditions.checkPositionIndexes(r7, r0, r1)
            L9:
                r1 = 3
                if (r8 < r1) goto L57
                int r1 = r7 + 1
                r2 = r6[r7]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 16
                int r3 = r7 + 2
                r1 = r6[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r1 = r1 | r2
                int r7 = r7 + 3
                r2 = r6[r3]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r1 = r1 | r2
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r3 = r1 >>> 18
                char r2 = r2.encode(r3)
                r5.append(r2)
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r3 = r1 >>> 12
                r3 = r3 & 63
                char r2 = r2.encode(r3)
                r5.append(r2)
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r3 = r1 >>> 6
                r3 = r3 & 63
                char r2 = r2.encode(r3)
                r5.append(r2)
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                r1 = r1 & 63
                char r1 = r2.encode(r1)
                r5.append(r1)
                int r8 = r8 + (-3)
                goto L9
            L57:
                if (r7 >= r0) goto L5d
                int r0 = r0 - r7
                r4.encodeChunkTo(r5, r6, r7, r0)
            L5d:
                return
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r3) {
                r1 = this;
                com.google.common.io.BaseEncoding$Base64Encoding r0 = new com.google.common.io.BaseEncoding$Base64Encoding
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class DecodingException extends java.io.IOException {
        DecodingException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        DecodingException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SeparatedBaseEncoding extends com.google.common.io.BaseEncoding {
        private final int afterEveryChars;
        private final com.google.common.io.BaseEncoding delegate;
        private final java.lang.String separator;

        SeparatedBaseEncoding(com.google.common.io.BaseEncoding r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.io.BaseEncoding r1 = (com.google.common.io.BaseEncoding) r1
                r0.delegate = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r1 = (java.lang.String) r1
                r0.separator = r1
                r0.afterEveryChars = r3
                if (r3 <= 0) goto L19
                r1 = 1
                goto L1a
            L19:
                r1 = 0
            L1a:
                java.lang.String r2 = "Cannot add a separator after every %s chars"
                com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
                return
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L6:
                int r2 = r5.length()
                if (r1 >= r2) goto L1e
                char r2 = r5.charAt(r1)
                java.lang.String r3 = r4.separator
                int r3 = r3.indexOf(r2)
                if (r3 >= 0) goto L1b
                r0.append(r2)
            L1b:
                int r1 = r1 + 1
                goto L6
            L1e:
                com.google.common.io.BaseEncoding r5 = r4.delegate
                boolean r5 = r5.canDecode(r0)
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] r5, java.lang.CharSequence r6) throws com.google.common.io.BaseEncoding.DecodingException {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r6.length()
                r0.<init>(r1)
                r1 = 0
            La:
                int r2 = r6.length()
                if (r1 >= r2) goto L22
                char r2 = r6.charAt(r1)
                java.lang.String r3 = r4.separator
                int r3 = r3.indexOf(r2)
                if (r3 >= 0) goto L1f
                r0.append(r2)
            L1f:
                int r1 = r1 + 1
                goto La
            L22:
                com.google.common.io.BaseEncoding r6 = r4.delegate
                int r5 = r6.decodeTo(r5, r0)
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.InputStream decodingStream(java.io.Reader r3) {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.delegate
                java.lang.String r1 = r2.separator
                java.io.Reader r3 = com.google.common.io.BaseEncoding.ignoringReader(r3, r1)
                java.io.InputStream r3 = r0.decodingStream(r3)
                return r3
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable r4, byte[] r5, int r6, int r7) throws java.io.IOException {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                java.lang.Appendable r4 = com.google.common.io.BaseEncoding.separatingAppendable(r4, r1, r2)
                r0.encodeTo(r4, r5, r6, r7)
                return
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.OutputStream encodingStream(java.io.Writer r4) {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                java.io.Writer r4 = com.google.common.io.BaseEncoding.separatingWriter(r4, r1, r2)
                java.io.OutputStream r4 = r0.encodingStream(r4)
                return r4
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                com.google.common.io.BaseEncoding r0 = r0.lowerCase()
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                com.google.common.io.BaseEncoding r0 = r0.withSeparator(r1, r2)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int r2) {
                r1 = this;
                com.google.common.io.BaseEncoding r0 = r1.delegate
                int r2 = r0.maxDecodedSize(r2)
                return r2
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int r5) {
                r4 = this;
                com.google.common.io.BaseEncoding r0 = r4.delegate
                int r5 = r0.maxEncodedSize(r5)
                java.lang.String r0 = r4.separator
                int r0 = r0.length()
                int r1 = r5 + (-1)
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                int r2 = r4.afterEveryChars
                java.math.RoundingMode r3 = java.math.RoundingMode.FLOOR
                int r1 = com.google.common.math.IntMath.divide(r1, r2, r3)
                int r0 = r0 * r1
                int r5 = r5 + r0
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                com.google.common.io.BaseEncoding r0 = r0.omitPadding()
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                com.google.common.io.BaseEncoding r0 = r0.withSeparator(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.io.BaseEncoding r1 = r2.delegate
                r0.append(r1)
                java.lang.String r1 = ".withSeparator(\""
                r0.append(r1)
                java.lang.String r1 = r2.separator
                r0.append(r1)
                java.lang.String r1 = "\", "
                r0.append(r1)
                int r1 = r2.afterEveryChars
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence r2) {
                r1 = this;
                com.google.common.io.BaseEncoding r0 = r1.delegate
                java.lang.CharSequence r2 = r0.trimTrailingPadding(r2)
                return r2
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
                r3 = this;
                com.google.common.io.BaseEncoding r0 = r3.delegate
                com.google.common.io.BaseEncoding r0 = r0.upperCase()
                java.lang.String r1 = r3.separator
                int r2 = r3.afterEveryChars
                com.google.common.io.BaseEncoding r0 = r0.withSeparator(r1, r2)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char r3) {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.delegate
                com.google.common.io.BaseEncoding r3 = r0.withPadChar(r3)
                java.lang.String r0 = r2.separator
                int r1 = r2.afterEveryChars
                com.google.common.io.BaseEncoding r3 = r3.withSeparator(r0, r1)
                return r3
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Already have a separator"
                r1.<init>(r2)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StandardBaseEncoding extends com.google.common.io.BaseEncoding {
        final com.google.common.io.BaseEncoding.Alphabet alphabet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient com.google.common.io.BaseEncoding lowerCase;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final java.lang.Character paddingChar;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient com.google.common.io.BaseEncoding upperCase;



        StandardBaseEncoding(com.google.common.io.BaseEncoding.Alphabet r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r3) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.io.BaseEncoding$Alphabet r0 = (com.google.common.io.BaseEncoding.Alphabet) r0
                r1.alphabet = r0
                if (r3 == 0) goto L1a
                char r0 = r3.charValue()
                boolean r2 = r2.matches(r0)
                if (r2 != 0) goto L18
                goto L1a
            L18:
                r2 = 0
                goto L1b
            L1a:
                r2 = 1
            L1b:
                java.lang.String r0 = "Padding character %s was already in alphabet"
                com.google.common.base.Preconditions.checkArgument(r2, r0, r3)
                r1.paddingChar = r3
                return
        }

        StandardBaseEncoding(java.lang.String r2, java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r4) {
                r1 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                return
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence r5) {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.CharSequence r5 = r4.trimTrailingPadding(r5)
                com.google.common.io.BaseEncoding$Alphabet r0 = r4.alphabet
                int r1 = r5.length()
                boolean r0 = r0.isValidPaddingStartPosition(r1)
                r1 = 0
                if (r0 != 0) goto L15
                return r1
            L15:
                r0 = 0
            L16:
                int r2 = r5.length()
                if (r0 >= r2) goto L2c
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                char r3 = r5.charAt(r0)
                boolean r2 = r2.canDecode(r3)
                if (r2 != 0) goto L29
                return r1
            L29:
                int r0 = r0 + 1
                goto L16
            L2c:
                r5 = 1
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] r14, java.lang.CharSequence r15) throws com.google.common.io.BaseEncoding.DecodingException {
                r13 = this;
                com.google.common.base.Preconditions.checkNotNull(r14)
                java.lang.CharSequence r15 = r13.trimTrailingPadding(r15)
                com.google.common.io.BaseEncoding$Alphabet r0 = r13.alphabet
                int r1 = r15.length()
                boolean r0 = r0.isValidPaddingStartPosition(r1)
                if (r0 == 0) goto L69
                r0 = 0
                r1 = 0
                r2 = 0
            L16:
                int r3 = r15.length()
                if (r1 >= r3) goto L68
                r3 = 0
                r5 = 0
                r6 = 0
            L20:
                com.google.common.io.BaseEncoding$Alphabet r7 = r13.alphabet
                int r8 = r7.charsPerChunk
                if (r5 >= r8) goto L44
                int r7 = r7.bitsPerChar
                long r3 = r3 << r7
                int r7 = r1 + r5
                int r8 = r15.length()
                if (r7 >= r8) goto L41
                com.google.common.io.BaseEncoding$Alphabet r7 = r13.alphabet
                int r8 = r6 + 1
                int r6 = r6 + r1
                char r6 = r15.charAt(r6)
                int r6 = r7.decode(r6)
                long r6 = (long) r6
                long r3 = r3 | r6
                r6 = r8
            L41:
                int r5 = r5 + 1
                goto L20
            L44:
                int r5 = r7.bytesPerChunk
                int r8 = r5 * 8
                int r7 = r7.bitsPerChar
                int r6 = r6 * r7
                int r8 = r8 - r6
                int r5 = r5 + (-1)
                int r5 = r5 * 8
            L51:
                if (r5 < r8) goto L62
                int r6 = r2 + 1
                long r9 = r3 >>> r5
                r11 = 255(0xff, double:1.26E-321)
                long r9 = r9 & r11
                int r7 = (int) r9
                byte r7 = (byte) r7
                r14[r2] = r7
                int r5 = r5 + (-8)
                r2 = r6
                goto L51
            L62:
                com.google.common.io.BaseEncoding$Alphabet r3 = r13.alphabet
                int r3 = r3.charsPerChunk
                int r1 = r1 + r3
                goto L16
            L68:
                return r2
            L69:
                com.google.common.io.BaseEncoding$DecodingException r14 = new com.google.common.io.BaseEncoding$DecodingException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid input length "
                r0.append(r1)
                int r15 = r15.length()
                r0.append(r15)
                java.lang.String r15 = r0.toString()
                r14.<init>(r15)
                throw r14
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.InputStream decodingStream(java.io.Reader r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.io.BaseEncoding$StandardBaseEncoding$2 r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding$2
                r0.<init>(r1, r2)
                return r0
        }

        void encodeChunkTo(java.lang.Appendable r8, byte[] r9, int r10, int r11) throws java.io.IOException {
                r7 = this;
                com.google.common.base.Preconditions.checkNotNull(r8)
                int r0 = r10 + r11
                int r1 = r9.length
                com.google.common.base.Preconditions.checkPositionIndexes(r10, r0, r1)
                com.google.common.io.BaseEncoding$Alphabet r0 = r7.alphabet
                int r0 = r0.bytesPerChunk
                r1 = 0
                if (r11 > r0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                com.google.common.base.Preconditions.checkArgument(r0)
                r2 = 0
                r0 = 0
            L19:
                r4 = 8
                if (r0 >= r11) goto L29
                int r5 = r10 + r0
                r5 = r9[r5]
                r5 = r5 & 255(0xff, float:3.57E-43)
                long r5 = (long) r5
                long r2 = r2 | r5
                long r2 = r2 << r4
                int r0 = r0 + 1
                goto L19
            L29:
                int r9 = r11 + 1
                int r9 = r9 * 8
                com.google.common.io.BaseEncoding$Alphabet r10 = r7.alphabet
                int r10 = r10.bitsPerChar
                int r9 = r9 - r10
            L32:
                int r10 = r11 * 8
                if (r1 >= r10) goto L4d
                int r10 = r9 - r1
                long r5 = r2 >>> r10
                int r10 = (int) r5
                com.google.common.io.BaseEncoding$Alphabet r0 = r7.alphabet
                int r5 = r0.mask
                r10 = r10 & r5
                char r10 = r0.encode(r10)
                r8.append(r10)
                com.google.common.io.BaseEncoding$Alphabet r10 = r7.alphabet
                int r10 = r10.bitsPerChar
                int r1 = r1 + r10
                goto L32
            L4d:
                java.lang.Character r9 = r7.paddingChar
                if (r9 == 0) goto L68
            L51:
                com.google.common.io.BaseEncoding$Alphabet r9 = r7.alphabet
                int r9 = r9.bytesPerChunk
                int r9 = r9 * 8
                if (r1 >= r9) goto L68
                java.lang.Character r9 = r7.paddingChar
                char r9 = r9.charValue()
                r8.append(r9)
                com.google.common.io.BaseEncoding$Alphabet r9 = r7.alphabet
                int r9 = r9.bitsPerChar
                int r1 = r1 + r9
                goto L51
            L68:
                return
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable r5, byte[] r6, int r7, int r8) throws java.io.IOException {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
                int r0 = r7 + r8
                int r1 = r6.length
                com.google.common.base.Preconditions.checkPositionIndexes(r7, r0, r1)
                r0 = 0
            La:
                if (r0 >= r8) goto L21
                int r1 = r7 + r0
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                int r2 = r2.bytesPerChunk
                int r3 = r8 - r0
                int r2 = java.lang.Math.min(r2, r3)
                r4.encodeChunkTo(r5, r6, r1, r2)
                com.google.common.io.BaseEncoding$Alphabet r1 = r4.alphabet
                int r1 = r1.bytesPerChunk
                int r0 = r0 + r1
                goto La
            L21:
                return
        }

        @Override // com.google.common.io.BaseEncoding
        @com.google.common.annotations.GwtIncompatible
        public java.io.OutputStream encodingStream(java.io.Writer r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.io.BaseEncoding$StandardBaseEncoding$1 r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding$1
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.io.BaseEncoding.StandardBaseEncoding
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.io.BaseEncoding$StandardBaseEncoding r4 = (com.google.common.io.BaseEncoding.StandardBaseEncoding) r4
                com.google.common.io.BaseEncoding$Alphabet r0 = r3.alphabet
                com.google.common.io.BaseEncoding$Alphabet r2 = r4.alphabet
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                java.lang.Character r0 = r3.paddingChar
                java.lang.Character r4 = r4.paddingChar
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r4 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r4.alphabet
                int r0 = r0.hashCode()
                java.lang.Character r1 = r4.paddingChar
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                int r1 = com.google.common.base.Objects.hashCode(r2)
                r0 = r0 ^ r1
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.lowerCase
                if (r0 != 0) goto L18
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                com.google.common.io.BaseEncoding$Alphabet r0 = r0.lowerCase()
                com.google.common.io.BaseEncoding$Alphabet r1 = r2.alphabet
                if (r0 != r1) goto L10
                r0 = r2
                goto L16
            L10:
                java.lang.Character r1 = r2.paddingChar
                com.google.common.io.BaseEncoding r0 = r2.newInstance(r0, r1)
            L16:
                r2.lowerCase = r0
            L18:
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int r5) {
                r4 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r4.alphabet
                int r0 = r0.bitsPerChar
                long r0 = (long) r0
                long r2 = (long) r5
                long r0 = r0 * r2
                r2 = 7
                long r0 = r0 + r2
                r2 = 8
                long r0 = r0 / r2
                int r5 = (int) r0
                return r5
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int r4) {
                r3 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r3.alphabet
                int r1 = r0.charsPerChunk
                int r0 = r0.bytesPerChunk
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r4 = com.google.common.math.IntMath.divide(r4, r0, r2)
                int r1 = r1 * r4
                return r1
        }

        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r3) {
                r1 = this;
                com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
                r2 = this;
                java.lang.Character r0 = r2.paddingChar
                if (r0 != 0) goto L5
                return r2
            L5:
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                r1 = 0
                com.google.common.io.BaseEncoding r0 = r2.newInstance(r0, r1)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "BaseEncoding."
                r0.<init>(r1)
                com.google.common.io.BaseEncoding$Alphabet r1 = r3.alphabet
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                com.google.common.io.BaseEncoding$Alphabet r1 = r3.alphabet
                int r1 = r1.bitsPerChar
                r2 = 8
                int r2 = r2 % r1
                if (r2 == 0) goto L32
                java.lang.Character r1 = r3.paddingChar
                if (r1 != 0) goto L23
                java.lang.String r1 = ".omitPadding()"
                r0.append(r1)
                goto L32
            L23:
                java.lang.String r1 = ".withPadChar('"
                r0.append(r1)
                java.lang.Character r1 = r3.paddingChar
                r0.append(r1)
                java.lang.String r1 = "')"
                r0.append(r1)
            L32:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence r4) {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                java.lang.Character r0 = r3.paddingChar
                if (r0 != 0) goto L8
                return r4
            L8:
                char r0 = r0.charValue()
                int r1 = r4.length()
                int r1 = r1 + (-1)
            L12:
                if (r1 < 0) goto L1e
                char r2 = r4.charAt(r1)
                if (r2 == r0) goto L1b
                goto L1e
            L1b:
                int r1 = r1 + (-1)
                goto L12
            L1e:
                r0 = 0
                int r1 = r1 + 1
                java.lang.CharSequence r4 = r4.subSequence(r0, r1)
                return r4
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
                r2 = this;
                com.google.common.io.BaseEncoding r0 = r2.upperCase
                if (r0 != 0) goto L18
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                com.google.common.io.BaseEncoding$Alphabet r0 = r0.upperCase()
                com.google.common.io.BaseEncoding$Alphabet r1 = r2.alphabet
                if (r0 != r1) goto L10
                r0 = r2
                goto L16
            L10:
                java.lang.Character r1 = r2.paddingChar
                com.google.common.io.BaseEncoding r0 = r2.newInstance(r0, r1)
            L16:
                r2.upperCase = r0
            L18:
                return r0
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char r3) {
                r2 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                int r0 = r0.bitsPerChar
                r1 = 8
                int r1 = r1 % r0
                if (r1 == 0) goto L1f
                java.lang.Character r0 = r2.paddingChar
                if (r0 == 0) goto L14
                char r0 = r0.charValue()
                if (r0 != r3) goto L14
                goto L1f
            L14:
                com.google.common.io.BaseEncoding$Alphabet r0 = r2.alphabet
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
                com.google.common.io.BaseEncoding r3 = r2.newInstance(r0, r3)
                return r3
            L1f:
                return r2
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String r6, int r7) {
                r5 = this;
                r0 = 0
                r1 = 0
            L2:
                int r2 = r6.length()
                r3 = 1
                if (r1 >= r2) goto L1c
                com.google.common.io.BaseEncoding$Alphabet r2 = r5.alphabet
                char r4 = r6.charAt(r1)
                boolean r2 = r2.matches(r4)
                r2 = r2 ^ r3
                java.lang.String r3 = "Separator (%s) cannot contain alphabet characters"
                com.google.common.base.Preconditions.checkArgument(r2, r3, r6)
                int r1 = r1 + 1
                goto L2
            L1c:
                java.lang.Character r1 = r5.paddingChar
                if (r1 == 0) goto L30
                char r1 = r1.charValue()
                int r1 = r6.indexOf(r1)
                if (r1 >= 0) goto L2b
                r0 = 1
            L2b:
                java.lang.String r1 = "Separator (%s) cannot contain padding character"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            L30:
                com.google.common.io.BaseEncoding$SeparatedBaseEncoding r0 = new com.google.common.io.BaseEncoding$SeparatedBaseEncoding
                r0.<init>(r5, r6, r7)
                return r0
        }
    }

    static {
            com.google.common.io.BaseEncoding$Base64Encoding r0 = new com.google.common.io.BaseEncoding$Base64Encoding
            r1 = 61
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.String r2 = "base64()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            r0.<init>(r2, r3, r1)
            com.google.common.io.BaseEncoding.BASE64 = r0
            com.google.common.io.BaseEncoding$Base64Encoding r0 = new com.google.common.io.BaseEncoding$Base64Encoding
            java.lang.String r2 = "base64Url()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            r0.<init>(r2, r3, r1)
            com.google.common.io.BaseEncoding.BASE64_URL = r0
            com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding
            java.lang.String r2 = "base32()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
            r0.<init>(r2, r3, r1)
            com.google.common.io.BaseEncoding.BASE32 = r0
            com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = new com.google.common.io.BaseEncoding$StandardBaseEncoding
            java.lang.String r2 = "base32Hex()"
            java.lang.String r3 = "0123456789ABCDEFGHIJKLMNOPQRSTUV"
            r0.<init>(r2, r3, r1)
            com.google.common.io.BaseEncoding.BASE32_HEX = r0
            com.google.common.io.BaseEncoding$Base16Encoding r0 = new com.google.common.io.BaseEncoding$Base16Encoding
            java.lang.String r1 = "base16()"
            java.lang.String r2 = "0123456789ABCDEF"
            r0.<init>(r1, r2)
            com.google.common.io.BaseEncoding.BASE16 = r0
            return
    }

    BaseEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.io.BaseEncoding base16() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE16
            return r0
    }

    public static com.google.common.io.BaseEncoding base32() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE32
            return r0
    }

    public static com.google.common.io.BaseEncoding base32Hex() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE32_HEX
            return r0
    }

    public static com.google.common.io.BaseEncoding base64() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE64
            return r0
    }

    public static com.google.common.io.BaseEncoding base64Url() {
            com.google.common.io.BaseEncoding r0 = com.google.common.io.BaseEncoding.BASE64_URL
            return r0
    }

    private static byte[] extract(byte[] r2, int r3) {
            int r0 = r2.length
            if (r3 != r0) goto L4
            return r2
        L4:
            byte[] r0 = new byte[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.io.Reader ignoringReader(java.io.Reader r1, java.lang.String r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.io.BaseEncoding$3 r0 = new com.google.common.io.BaseEncoding$3
            r0.<init>(r1, r2)
            return r0
    }

    static java.lang.Appendable separatingAppendable(java.lang.Appendable r1, java.lang.String r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            if (r3 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.io.BaseEncoding$4 r0 = new com.google.common.io.BaseEncoding$4
            r0.<init>(r3, r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.io.Writer separatingWriter(java.io.Writer r0, java.lang.String r1, int r2) {
            java.lang.Appendable r1 = separatingAppendable(r0, r1, r2)
            com.google.common.io.BaseEncoding$5 r2 = new com.google.common.io.BaseEncoding$5
            r2.<init>(r1, r0)
            return r2
    }

    public abstract boolean canDecode(java.lang.CharSequence r1);

    public final byte[] decode(java.lang.CharSequence r2) {
            r1 = this;
            byte[] r2 = r1.decodeChecked(r2)     // Catch: com.google.common.io.BaseEncoding.DecodingException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
    }

    final byte[] decodeChecked(java.lang.CharSequence r2) throws com.google.common.io.BaseEncoding.DecodingException {
            r1 = this;
            java.lang.CharSequence r2 = r1.trimTrailingPadding(r2)
            int r0 = r2.length()
            int r0 = r1.maxDecodedSize(r0)
            byte[] r0 = new byte[r0]
            int r2 = r1.decodeTo(r0, r2)
            byte[] r2 = extract(r0, r2)
            return r2
    }

    abstract int decodeTo(byte[] r1, java.lang.CharSequence r2) throws com.google.common.io.BaseEncoding.DecodingException;

    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.io.ByteSource decodingSource(com.google.common.io.CharSource r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.io.BaseEncoding$2 r0 = new com.google.common.io.BaseEncoding$2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public abstract java.io.InputStream decodingStream(java.io.Reader r1);

    public java.lang.String encode(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            java.lang.String r3 = r2.encode(r3, r0, r1)
            return r3
    }

    public final java.lang.String encode(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.maxEncodedSize(r5)
            r0.<init>(r1)
            r2.encodeTo(r0, r3, r4, r5)     // Catch: java.io.IOException -> L17
            java.lang.String r3 = r0.toString()
            return r3
        L17:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
    }

    abstract void encodeTo(java.lang.Appendable r1, byte[] r2, int r3, int r4) throws java.io.IOException;

    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.io.ByteSink encodingSink(com.google.common.io.CharSink r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.io.BaseEncoding$1 r0 = new com.google.common.io.BaseEncoding$1
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public abstract java.io.OutputStream encodingStream(java.io.Writer r1);

    public abstract com.google.common.io.BaseEncoding lowerCase();

    abstract int maxDecodedSize(int r1);

    abstract int maxEncodedSize(int r1);

    public abstract com.google.common.io.BaseEncoding omitPadding();

    java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    public abstract com.google.common.io.BaseEncoding upperCase();

    public abstract com.google.common.io.BaseEncoding withPadChar(char r1);

    public abstract com.google.common.io.BaseEncoding withSeparator(java.lang.String r1, int r2);
}
