package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1208#2,2:125\n1236#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum CharDirectionality extends java.lang.Enum<kotlin.text.CharDirectionality> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.text.CharDirectionality[] $VALUES = null;
    public static final kotlin.text.CharDirectionality ARABIC_NUMBER = null;
    public static final kotlin.text.CharDirectionality BOUNDARY_NEUTRAL = null;
    public static final kotlin.text.CharDirectionality COMMON_NUMBER_SEPARATOR = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharDirectionality.a Companion = null;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER = null;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_SEPARATOR = null;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_TERMINATOR = null;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT = null;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_EMBEDDING = null;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_OVERRIDE = null;
    public static final kotlin.text.CharDirectionality NONSPACING_MARK = null;
    public static final kotlin.text.CharDirectionality OTHER_NEUTRALS = null;
    public static final kotlin.text.CharDirectionality PARAGRAPH_SEPARATOR = null;
    public static final kotlin.text.CharDirectionality POP_DIRECTIONAL_FORMAT = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_ARABIC = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_EMBEDDING = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_OVERRIDE = null;
    public static final kotlin.text.CharDirectionality SEGMENT_SEPARATOR = null;
    public static final kotlin.text.CharDirectionality UNDEFINED = null;
    public static final kotlin.text.CharDirectionality WHITESPACE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.s<java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>> directionalityMap$delegate = null;
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

        private final java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality> a() {
                r1 = this;
                kotlin.s r0 = kotlin.text.CharDirectionality.access$getDirectionalityMap$delegate$cp()
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.CharDirectionality b(int r4) {
                r3 = this;
                java.util.Map r0 = r3.a()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r1)
                kotlin.text.CharDirectionality r0 = (kotlin.text.CharDirectionality) r0
                if (r0 == 0) goto L11
                return r0
            L11:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Directionality #"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " is not defined."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    private static final /* synthetic */ kotlin.text.CharDirectionality[] $values() {
            r0 = 20
            kotlin.text.CharDirectionality[] r0 = new kotlin.text.CharDirectionality[r0]
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.UNDEFINED
            r2 = 0
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.LEFT_TO_RIGHT
            r2 = 1
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT
            r2 = 2
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT_ARABIC
            r2 = 3
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.EUROPEAN_NUMBER
            r2 = 4
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.EUROPEAN_NUMBER_SEPARATOR
            r2 = 5
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.EUROPEAN_NUMBER_TERMINATOR
            r2 = 6
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.ARABIC_NUMBER
            r2 = 7
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.COMMON_NUMBER_SEPARATOR
            r2 = 8
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.NONSPACING_MARK
            r2 = 9
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.BOUNDARY_NEUTRAL
            r2 = 10
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.PARAGRAPH_SEPARATOR
            r2 = 11
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.SEGMENT_SEPARATOR
            r2 = 12
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.WHITESPACE
            r2 = 13
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.OTHER_NEUTRALS
            r2 = 14
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.LEFT_TO_RIGHT_EMBEDDING
            r2 = 15
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.LEFT_TO_RIGHT_OVERRIDE
            r2 = 16
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT_EMBEDDING
            r2 = 17
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT_OVERRIDE
            r2 = 18
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.POP_DIRECTIONAL_FORMAT
            r2 = 19
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            r1 = -1
            java.lang.String r2 = "UNDEFINED"
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.text.CharDirectionality.UNDEFINED = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "LEFT_TO_RIGHT"
            r2 = 1
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.LEFT_TO_RIGHT = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT"
            r3 = 2
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT_ARABIC"
            r2 = 3
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT_ARABIC = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "EUROPEAN_NUMBER"
            r3 = 4
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.EUROPEAN_NUMBER = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "EUROPEAN_NUMBER_SEPARATOR"
            r2 = 5
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.EUROPEAN_NUMBER_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "EUROPEAN_NUMBER_TERMINATOR"
            r3 = 6
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.EUROPEAN_NUMBER_TERMINATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "ARABIC_NUMBER"
            r2 = 7
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.ARABIC_NUMBER = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "COMMON_NUMBER_SEPARATOR"
            r3 = 8
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.COMMON_NUMBER_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "NONSPACING_MARK"
            r2 = 9
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.NONSPACING_MARK = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "BOUNDARY_NEUTRAL"
            r3 = 10
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.BOUNDARY_NEUTRAL = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "PARAGRAPH_SEPARATOR"
            r2 = 11
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.PARAGRAPH_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "SEGMENT_SEPARATOR"
            r3 = 12
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.SEGMENT_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "WHITESPACE"
            r2 = 13
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.WHITESPACE = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "OTHER_NEUTRALS"
            r3 = 14
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.OTHER_NEUTRALS = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "LEFT_TO_RIGHT_EMBEDDING"
            r2 = 15
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.LEFT_TO_RIGHT_EMBEDDING = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "LEFT_TO_RIGHT_OVERRIDE"
            r3 = 16
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.LEFT_TO_RIGHT_OVERRIDE = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT_EMBEDDING"
            r2 = 17
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT_EMBEDDING = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT_OVERRIDE"
            r3 = 18
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT_OVERRIDE = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "POP_DIRECTIONAL_FORMAT"
            r2 = 19
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.POP_DIRECTIONAL_FORMAT = r0
            kotlin.text.CharDirectionality[] r0 = $values()
            kotlin.text.CharDirectionality.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.text.CharDirectionality.$ENTRIES = r0
            kotlin.text.CharDirectionality$a r0 = new kotlin.text.CharDirectionality$a
            r1 = 0
            r0.<init>(r1)
            kotlin.text.CharDirectionality.Companion = r0
            kotlin.text.a r0 = new kotlin.text.a
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            kotlin.text.CharDirectionality.directionalityMap$delegate = r0
            return
    }

    CharDirectionality(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static /* synthetic */ java.util.Map a() {
            java.util.Map r0 = directionalityMap_delegate$lambda$0()
            return r0
    }

    public static final /* synthetic */ kotlin.s access$getDirectionalityMap$delegate$cp() {
            kotlin.s<java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>> r0 = kotlin.text.CharDirectionality.directionalityMap$delegate
            return r0
    }

    private static final java.util.Map directionalityMap_delegate$lambda$0() {
            kotlin.enums.a r0 = getEntries()
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r0, r1)
            int r1 = kotlin.collections.i1.j(r1)
            r2 = 16
            int r1 = kotlin.ranges.t.u(r1, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.text.CharDirectionality r3 = (kotlin.text.CharDirectionality) r3
            int r3 = r3.value
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r1)
            goto L1d
        L34:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.text.CharDirectionality> getEntries() {
            kotlin.enums.a r0 = kotlin.text.CharDirectionality.$ENTRIES
            return r0
    }

    public static kotlin.text.CharDirectionality valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.text.CharDirectionality> r0 = kotlin.text.CharDirectionality.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.text.CharDirectionality r1 = (kotlin.text.CharDirectionality) r1
            return r1
    }

    public static kotlin.text.CharDirectionality[] values() {
            kotlin.text.CharDirectionality[] r0 = kotlin.text.CharDirectionality.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.text.CharDirectionality[] r0 = (kotlin.text.CharDirectionality[]) r0
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
