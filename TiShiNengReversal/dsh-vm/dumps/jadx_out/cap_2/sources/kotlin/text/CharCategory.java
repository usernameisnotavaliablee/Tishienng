package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum CharCategory extends java.lang.Enum<kotlin.text.CharCategory> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.text.CharCategory[] $VALUES = null;
    public static final kotlin.text.CharCategory COMBINING_SPACING_MARK = null;
    public static final kotlin.text.CharCategory CONNECTOR_PUNCTUATION = null;
    public static final kotlin.text.CharCategory CONTROL = null;
    public static final kotlin.text.CharCategory CURRENCY_SYMBOL = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharCategory.a Companion = null;
    public static final kotlin.text.CharCategory DASH_PUNCTUATION = null;
    public static final kotlin.text.CharCategory DECIMAL_DIGIT_NUMBER = null;
    public static final kotlin.text.CharCategory ENCLOSING_MARK = null;
    public static final kotlin.text.CharCategory END_PUNCTUATION = null;
    public static final kotlin.text.CharCategory FINAL_QUOTE_PUNCTUATION = null;
    public static final kotlin.text.CharCategory FORMAT = null;
    public static final kotlin.text.CharCategory INITIAL_QUOTE_PUNCTUATION = null;
    public static final kotlin.text.CharCategory LETTER_NUMBER = null;
    public static final kotlin.text.CharCategory LINE_SEPARATOR = null;
    public static final kotlin.text.CharCategory LOWERCASE_LETTER = null;
    public static final kotlin.text.CharCategory MATH_SYMBOL = null;
    public static final kotlin.text.CharCategory MODIFIER_LETTER = null;
    public static final kotlin.text.CharCategory MODIFIER_SYMBOL = null;
    public static final kotlin.text.CharCategory NON_SPACING_MARK = null;
    public static final kotlin.text.CharCategory OTHER_LETTER = null;
    public static final kotlin.text.CharCategory OTHER_NUMBER = null;
    public static final kotlin.text.CharCategory OTHER_PUNCTUATION = null;
    public static final kotlin.text.CharCategory OTHER_SYMBOL = null;
    public static final kotlin.text.CharCategory PARAGRAPH_SEPARATOR = null;
    public static final kotlin.text.CharCategory PRIVATE_USE = null;
    public static final kotlin.text.CharCategory SPACE_SEPARATOR = null;
    public static final kotlin.text.CharCategory START_PUNCTUATION = null;
    public static final kotlin.text.CharCategory SURROGATE = null;
    public static final kotlin.text.CharCategory TITLECASE_LETTER = null;
    public static final kotlin.text.CharCategory UNASSIGNED = null;
    public static final kotlin.text.CharCategory UPPERCASE_LETTER = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String code;
    private final int value;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.CharCategory a(int r4) {
                r3 = this;
                if (r4 < 0) goto L11
                r0 = 17
                if (r4 >= r0) goto L11
                kotlin.enums.a r0 = kotlin.text.CharCategory.getEntries()
                java.lang.Object r4 = r0.get(r4)
                kotlin.text.CharCategory r4 = (kotlin.text.CharCategory) r4
                return r4
            L11:
                r0 = 18
                if (r0 > r4) goto L26
                r0 = 31
                if (r4 >= r0) goto L26
                kotlin.enums.a r0 = kotlin.text.CharCategory.getEntries()
                int r4 = r4 + (-1)
                java.lang.Object r4 = r0.get(r4)
                kotlin.text.CharCategory r4 = (kotlin.text.CharCategory) r4
                return r4
            L26:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Category #"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " is not defined."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    private static final /* synthetic */ kotlin.text.CharCategory[] $values() {
            r0 = 30
            kotlin.text.CharCategory[] r0 = new kotlin.text.CharCategory[r0]
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.UNASSIGNED
            r2 = 0
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.UPPERCASE_LETTER
            r2 = 1
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.LOWERCASE_LETTER
            r2 = 2
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.TITLECASE_LETTER
            r2 = 3
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.MODIFIER_LETTER
            r2 = 4
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_LETTER
            r2 = 5
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.NON_SPACING_MARK
            r2 = 6
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.ENCLOSING_MARK
            r2 = 7
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.COMBINING_SPACING_MARK
            r2 = 8
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.DECIMAL_DIGIT_NUMBER
            r2 = 9
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.LETTER_NUMBER
            r2 = 10
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_NUMBER
            r2 = 11
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.SPACE_SEPARATOR
            r2 = 12
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.LINE_SEPARATOR
            r2 = 13
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.PARAGRAPH_SEPARATOR
            r2 = 14
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.CONTROL
            r2 = 15
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.FORMAT
            r2 = 16
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.PRIVATE_USE
            r2 = 17
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.SURROGATE
            r2 = 18
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.DASH_PUNCTUATION
            r2 = 19
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.START_PUNCTUATION
            r2 = 20
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.END_PUNCTUATION
            r2 = 21
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.CONNECTOR_PUNCTUATION
            r2 = 22
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_PUNCTUATION
            r2 = 23
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.MATH_SYMBOL
            r2 = 24
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.CURRENCY_SYMBOL
            r2 = 25
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.MODIFIER_SYMBOL
            r2 = 26
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.OTHER_SYMBOL
            r2 = 27
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.INITIAL_QUOTE_PUNCTUATION
            r2 = 28
            r0[r2] = r1
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.FINAL_QUOTE_PUNCTUATION
            r2 = 29
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 0
            java.lang.String r2 = "Cn"
            java.lang.String r3 = "UNASSIGNED"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.UNASSIGNED = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 1
            java.lang.String r2 = "Lu"
            java.lang.String r3 = "UPPERCASE_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.UPPERCASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 2
            java.lang.String r2 = "Ll"
            java.lang.String r3 = "LOWERCASE_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.LOWERCASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 3
            java.lang.String r2 = "Lt"
            java.lang.String r3 = "TITLECASE_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.TITLECASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 4
            java.lang.String r2 = "Lm"
            java.lang.String r3 = "MODIFIER_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.MODIFIER_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 5
            java.lang.String r2 = "Lo"
            java.lang.String r3 = "OTHER_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.OTHER_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 6
            java.lang.String r2 = "Mn"
            java.lang.String r3 = "NON_SPACING_MARK"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.NON_SPACING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 7
            java.lang.String r2 = "Me"
            java.lang.String r3 = "ENCLOSING_MARK"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.ENCLOSING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 8
            java.lang.String r2 = "Mc"
            java.lang.String r3 = "COMBINING_SPACING_MARK"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.COMBINING_SPACING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 9
            java.lang.String r2 = "Nd"
            java.lang.String r3 = "DECIMAL_DIGIT_NUMBER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.DECIMAL_DIGIT_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 10
            java.lang.String r2 = "Nl"
            java.lang.String r3 = "LETTER_NUMBER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.LETTER_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 11
            java.lang.String r2 = "No"
            java.lang.String r3 = "OTHER_NUMBER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.OTHER_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 12
            java.lang.String r2 = "Zs"
            java.lang.String r3 = "SPACE_SEPARATOR"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.SPACE_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 13
            java.lang.String r2 = "Zl"
            java.lang.String r3 = "LINE_SEPARATOR"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.LINE_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 14
            java.lang.String r2 = "Zp"
            java.lang.String r3 = "PARAGRAPH_SEPARATOR"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.PARAGRAPH_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 15
            java.lang.String r2 = "Cc"
            java.lang.String r3 = "CONTROL"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.CONTROL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 16
            java.lang.String r2 = "Cf"
            java.lang.String r3 = "FORMAT"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.FORMAT = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Co"
            java.lang.String r2 = "PRIVATE_USE"
            r3 = 17
            r4 = 18
            r0.<init>(r2, r3, r4, r1)
            kotlin.text.CharCategory.PRIVATE_USE = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Cs"
            java.lang.String r2 = "SURROGATE"
            r3 = 19
            r0.<init>(r2, r4, r3, r1)
            kotlin.text.CharCategory.SURROGATE = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Pd"
            java.lang.String r2 = "DASH_PUNCTUATION"
            r4 = 20
            r0.<init>(r2, r3, r4, r1)
            kotlin.text.CharCategory.DASH_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Ps"
            java.lang.String r2 = "START_PUNCTUATION"
            r3 = 21
            r0.<init>(r2, r4, r3, r1)
            kotlin.text.CharCategory.START_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Pe"
            java.lang.String r2 = "END_PUNCTUATION"
            r4 = 22
            r0.<init>(r2, r3, r4, r1)
            kotlin.text.CharCategory.END_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 23
            java.lang.String r2 = "Pc"
            java.lang.String r3 = "CONNECTOR_PUNCTUATION"
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.CONNECTOR_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 24
            java.lang.String r2 = "Po"
            java.lang.String r3 = "OTHER_PUNCTUATION"
            r4 = 23
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.OTHER_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 25
            java.lang.String r2 = "Sm"
            java.lang.String r3 = "MATH_SYMBOL"
            r4 = 24
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.MATH_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 26
            java.lang.String r2 = "Sc"
            java.lang.String r3 = "CURRENCY_SYMBOL"
            r4 = 25
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.CURRENCY_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 27
            java.lang.String r2 = "Sk"
            java.lang.String r3 = "MODIFIER_SYMBOL"
            r4 = 26
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.MODIFIER_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 28
            java.lang.String r2 = "So"
            java.lang.String r3 = "OTHER_SYMBOL"
            r4 = 27
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.OTHER_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 29
            java.lang.String r2 = "Pi"
            java.lang.String r3 = "INITIAL_QUOTE_PUNCTUATION"
            r4 = 28
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.INITIAL_QUOTE_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 30
            java.lang.String r2 = "Pf"
            java.lang.String r3 = "FINAL_QUOTE_PUNCTUATION"
            r4 = 29
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.FINAL_QUOTE_PUNCTUATION = r0
            kotlin.text.CharCategory[] r0 = $values()
            kotlin.text.CharCategory.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.text.CharCategory.$ENTRIES = r0
            kotlin.text.CharCategory$a r0 = new kotlin.text.CharCategory$a
            r1 = 0
            r0.<init>(r1)
            kotlin.text.CharCategory.Companion = r0
            return
    }

    CharCategory(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            r0.code = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.text.CharCategory> getEntries() {
            kotlin.enums.a r0 = kotlin.text.CharCategory.$ENTRIES
            return r0
    }

    public static kotlin.text.CharCategory valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.text.CharCategory> r0 = kotlin.text.CharCategory.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.text.CharCategory r1 = (kotlin.text.CharCategory) r1
            return r1
    }

    public static kotlin.text.CharCategory[] values() {
            kotlin.text.CharCategory[] r0 = kotlin.text.CharCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.text.CharCategory[] r0 = (kotlin.text.CharCategory[]) r0
            return r0
    }

    public final boolean contains(char r2) {
            r1 = this;
            int r2 = java.lang.Character.getType(r2)
            int r0 = r1.value
            if (r2 != r0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
