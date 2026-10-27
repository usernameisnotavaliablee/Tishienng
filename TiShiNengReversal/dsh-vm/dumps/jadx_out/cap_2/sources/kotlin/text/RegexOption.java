package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum RegexOption extends java.lang.Enum<kotlin.text.RegexOption> implements kotlin.text.h {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.text.RegexOption[] $VALUES = null;
    public static final kotlin.text.RegexOption CANON_EQ = null;
    public static final kotlin.text.RegexOption COMMENTS = null;
    public static final kotlin.text.RegexOption DOT_MATCHES_ALL = null;
    public static final kotlin.text.RegexOption IGNORE_CASE = null;
    public static final kotlin.text.RegexOption LITERAL = null;
    public static final kotlin.text.RegexOption MULTILINE = null;
    public static final kotlin.text.RegexOption UNIX_LINES = null;
    private final int mask;
    private final int value;

    private static final /* synthetic */ kotlin.text.RegexOption[] $values() {
            r0 = 7
            kotlin.text.RegexOption[] r0 = new kotlin.text.RegexOption[r0]
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.IGNORE_CASE
            r2 = 0
            r0[r2] = r1
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.MULTILINE
            r2 = 1
            r0[r2] = r1
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.LITERAL
            r2 = 2
            r0[r2] = r1
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.UNIX_LINES
            r2 = 3
            r0[r2] = r1
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.COMMENTS
            r2 = 4
            r0[r2] = r1
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.DOT_MATCHES_ALL
            r2 = 5
            r0[r2] = r1
            kotlin.text.RegexOption r1 = kotlin.text.RegexOption.CANON_EQ
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.text.RegexOption r0 = new kotlin.text.RegexOption
            r5 = 2
            r6 = 0
            java.lang.String r1 = "IGNORE_CASE"
            r2 = 0
            r3 = 2
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.text.RegexOption.IGNORE_CASE = r0
            kotlin.text.RegexOption r1 = new kotlin.text.RegexOption
            r6 = 2
            r7 = 0
            java.lang.String r2 = "MULTILINE"
            r3 = 1
            r4 = 8
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlin.text.RegexOption.MULTILINE = r1
            kotlin.text.RegexOption r2 = new kotlin.text.RegexOption
            r7 = 2
            r8 = 0
            java.lang.String r3 = "LITERAL"
            r4 = 2
            r5 = 16
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlin.text.RegexOption.LITERAL = r2
            kotlin.text.RegexOption r3 = new kotlin.text.RegexOption
            r8 = 2
            r9 = 0
            java.lang.String r4 = "UNIX_LINES"
            r5 = 3
            r6 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            kotlin.text.RegexOption.UNIX_LINES = r3
            kotlin.text.RegexOption r4 = new kotlin.text.RegexOption
            r9 = 2
            r10 = 0
            java.lang.String r5 = "COMMENTS"
            r6 = 4
            r7 = 4
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            kotlin.text.RegexOption.COMMENTS = r4
            kotlin.text.RegexOption r5 = new kotlin.text.RegexOption
            r10 = 2
            r11 = 0
            java.lang.String r6 = "DOT_MATCHES_ALL"
            r7 = 5
            r8 = 32
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlin.text.RegexOption.DOT_MATCHES_ALL = r5
            kotlin.text.RegexOption r6 = new kotlin.text.RegexOption
            r11 = 2
            r12 = 0
            java.lang.String r7 = "CANON_EQ"
            r8 = 6
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            kotlin.text.RegexOption.CANON_EQ = r6
            kotlin.text.RegexOption[] r0 = $values()
            kotlin.text.RegexOption.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.text.RegexOption.$ENTRIES = r0
            return
    }

    RegexOption(java.lang.String r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            r0.mask = r4
            return
    }

    /* synthetic */ RegexOption(java.lang.String r1, int r2, int r3, int r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r4 = r3
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.text.RegexOption> getEntries() {
            kotlin.enums.a r0 = kotlin.text.RegexOption.$ENTRIES
            return r0
    }

    public static kotlin.text.RegexOption valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.text.RegexOption> r0 = kotlin.text.RegexOption.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.text.RegexOption r1 = (kotlin.text.RegexOption) r1
            return r1
    }

    public static kotlin.text.RegexOption[] values() {
            kotlin.text.RegexOption[] r0 = kotlin.text.RegexOption.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.text.RegexOption[] r0 = (kotlin.text.RegexOption[]) r0
            return r0
    }

    @Override // kotlin.text.h
    public int getMask() {
            r1 = this;
            int r0 = r1.mask
            return r0
    }

    @Override // kotlin.text.h
    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
