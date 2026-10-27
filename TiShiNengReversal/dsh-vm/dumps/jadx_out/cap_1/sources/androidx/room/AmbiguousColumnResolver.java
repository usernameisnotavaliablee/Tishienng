package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n37#2:274\n36#2,3:275\n37#2:300\n36#2,3:301\n1#3:278\n13402#4,2:279\n13467#4,3:281\n13467#4,2:284\n11158#4:286\n11493#4,2:287\n11495#4:291\n13469#4:292\n11158#4:306\n11493#4,2:307\n11495#4:311\n1863#5,2:289\n1734#5,3:293\n1557#5:296\n1628#5,3:297\n1863#5,2:304\n295#5,2:309\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n65#1:274\n65#1:275,3\n171#1:300\n171#1:301,3\n102#1:279,2\n104#1:281,3\n113#1:284,2\n138#1:286\n138#1:287,2\n138#1:291\n113#1:292\n120#1:306\n120#1:307,2\n120#1:311\n140#1:289,2\n161#1:293,3\n171#1:296\n171#1:297,3\n208#1:304,2\n122#1:309,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AmbiguousColumnResolver {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.AmbiguousColumnResolver INSTANCE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Match {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Integer> resultIndices;

        @org.jetbrains.annotations.NotNull
        private final kotlin.ranges.m resultRange;

        public Match(@org.jetbrains.annotations.NotNull kotlin.ranges.m r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r3) {
                r1 = this;
                java.lang.String r0 = "resultRange"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "resultIndices"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.resultRange = r2
                r1.resultIndices = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Integer> getResultIndices() {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.resultIndices
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.ranges.m getResultRange() {
                r1 = this;
                kotlin.ranges.m r0 = r1.resultRange
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ResultColumn {
        private final int index;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String name;

        public ResultColumn(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.name = r2
                r1.index = r3
                return
        }

        public static /* synthetic */ androidx.room.AmbiguousColumnResolver.ResultColumn copy$default(androidx.room.AmbiguousColumnResolver.ResultColumn r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                int r2 = r0.index
            Lc:
                androidx.room.AmbiguousColumnResolver$ResultColumn r0 = r0.copy(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public final int component2() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.AmbiguousColumnResolver.ResultColumn copy(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.room.AmbiguousColumnResolver$ResultColumn r0 = new androidx.room.AmbiguousColumnResolver$ResultColumn
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.room.AmbiguousColumnResolver.ResultColumn
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.room.AmbiguousColumnResolver$ResultColumn r5 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                int r1 = r4.index
                int r5 = r5.index
                if (r1 == r5) goto L1e
                return r2
            L1e:
                return r0
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.index
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ResultColumn(name="
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                java.lang.String r1 = ", index="
                r0.append(r1)
                int r1 = r2.index
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Solution implements java.lang.Comparable<androidx.room.AmbiguousColumnResolver.Solution> {

        @org.jetbrains.annotations.NotNull
        public static final androidx.room.AmbiguousColumnResolver.Solution.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private static final androidx.room.AmbiguousColumnResolver.Solution NO_SOLUTION = null;
        private final int coverageOffset;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<androidx.room.AmbiguousColumnResolver.Match> matches;
        private final int overlaps;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1#2:274\n1782#3,3:275\n1863#3,2:278\n1785#3:280\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n252#1:275,3\n254#1:278,2\n252#1:280\n*E\n"})
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final androidx.room.AmbiguousColumnResolver.Solution build(@org.jetbrains.annotations.NotNull java.util.List<androidx.room.AmbiguousColumnResolver.Match> r11) {
                    r10 = this;
                    java.lang.String r0 = "matches"
                    kotlin.jvm.internal.g0.p(r11, r0)
                    r0 = r11
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r1 = r0.iterator()
                    r2 = 0
                    r3 = 0
                Le:
                    boolean r4 = r1.hasNext()
                    r5 = 1
                    if (r4 == 0) goto L38
                    java.lang.Object r4 = r1.next()
                    androidx.room.AmbiguousColumnResolver$Match r4 = (androidx.room.AmbiguousColumnResolver.Match) r4
                    kotlin.ranges.m r6 = r4.getResultRange()
                    int r6 = r6.f()
                    kotlin.ranges.m r7 = r4.getResultRange()
                    int r7 = r7.e()
                    int r6 = r6 - r7
                    int r6 = r6 + r5
                    java.util.List r4 = r4.getResultIndices()
                    int r4 = r4.size()
                    int r6 = r6 - r4
                    int r3 = r3 + r6
                    goto Le
                L38:
                    java.util.Iterator r1 = r0.iterator()
                    boolean r4 = r1.hasNext()
                    if (r4 == 0) goto Lf1
                    java.lang.Object r4 = r1.next()
                    androidx.room.AmbiguousColumnResolver$Match r4 = (androidx.room.AmbiguousColumnResolver.Match) r4
                    kotlin.ranges.m r4 = r4.getResultRange()
                    int r4 = r4.e()
                L50:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L68
                    java.lang.Object r6 = r1.next()
                    androidx.room.AmbiguousColumnResolver$Match r6 = (androidx.room.AmbiguousColumnResolver.Match) r6
                    kotlin.ranges.m r6 = r6.getResultRange()
                    int r6 = r6.e()
                    if (r4 <= r6) goto L50
                    r4 = r6
                    goto L50
                L68:
                    java.util.Iterator r1 = r0.iterator()
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto Leb
                    java.lang.Object r6 = r1.next()
                    androidx.room.AmbiguousColumnResolver$Match r6 = (androidx.room.AmbiguousColumnResolver.Match) r6
                    kotlin.ranges.m r6 = r6.getResultRange()
                    int r6 = r6.f()
                L80:
                    boolean r7 = r1.hasNext()
                    if (r7 == 0) goto L98
                    java.lang.Object r7 = r1.next()
                    androidx.room.AmbiguousColumnResolver$Match r7 = (androidx.room.AmbiguousColumnResolver.Match) r7
                    kotlin.ranges.m r7 = r7.getResultRange()
                    int r7 = r7.f()
                    if (r6 >= r7) goto L80
                    r6 = r7
                    goto L80
                L98:
                    kotlin.ranges.m r1 = new kotlin.ranges.m
                    r1.<init>(r4, r6)
                    boolean r4 = r1 instanceof java.util.Collection
                    if (r4 == 0) goto Lab
                    r4 = r1
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto Lab
                    goto Le5
                Lab:
                    java.util.Iterator r1 = r1.iterator()
                    r4 = 0
                Lb0:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto Le4
                    r6 = r1
                    kotlin.collections.d1 r6 = (kotlin.collections.d1) r6
                    int r6 = r6.nextInt()
                    java.util.Iterator r7 = r0.iterator()
                    r8 = 0
                Lc2:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto Lb0
                    java.lang.Object r9 = r7.next()
                    androidx.room.AmbiguousColumnResolver$Match r9 = (androidx.room.AmbiguousColumnResolver.Match) r9
                    kotlin.ranges.m r9 = r9.getResultRange()
                    boolean r9 = r9.n(r6)
                    if (r9 == 0) goto Lda
                    int r8 = r8 + 1
                Lda:
                    if (r8 <= r5) goto Lc2
                    int r4 = r4 + 1
                    if (r4 >= 0) goto Lb0
                    kotlin.collections.f0.a0()
                    goto Lb0
                Le4:
                    r2 = r4
                Le5:
                    androidx.room.AmbiguousColumnResolver$Solution r0 = new androidx.room.AmbiguousColumnResolver$Solution
                    r0.<init>(r11, r3, r2)
                    return r0
                Leb:
                    java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
                    r11.<init>()
                    throw r11
                Lf1:
                    java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
                    r11.<init>()
                    throw r11
            }

            @org.jetbrains.annotations.NotNull
            public final androidx.room.AmbiguousColumnResolver.Solution getNO_SOLUTION() {
                    r1 = this;
                    androidx.room.AmbiguousColumnResolver$Solution r0 = androidx.room.AmbiguousColumnResolver.Solution.access$getNO_SOLUTION$cp()
                    return r0
            }
        }

        static {
                androidx.room.AmbiguousColumnResolver$Solution$Companion r0 = new androidx.room.AmbiguousColumnResolver$Solution$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.room.AmbiguousColumnResolver.Solution.Companion = r0
                androidx.room.AmbiguousColumnResolver$Solution r0 = new androidx.room.AmbiguousColumnResolver$Solution
                java.util.List r1 = kotlin.collections.f0.J()
                r2 = 2147483647(0x7fffffff, float:NaN)
                r0.<init>(r1, r2, r2)
                androidx.room.AmbiguousColumnResolver.Solution.NO_SOLUTION = r0
                return
        }

        public Solution(@org.jetbrains.annotations.NotNull java.util.List<androidx.room.AmbiguousColumnResolver.Match> r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "matches"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.matches = r2
                r1.coverageOffset = r3
                r1.overlaps = r4
                return
        }

        public static final /* synthetic */ androidx.room.AmbiguousColumnResolver.Solution access$getNO_SOLUTION$cp() {
                androidx.room.AmbiguousColumnResolver$Solution r0 = androidx.room.AmbiguousColumnResolver.Solution.NO_SOLUTION
                return r0
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(@org.jetbrains.annotations.NotNull androidx.room.AmbiguousColumnResolver.Solution r3) {
                r2 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r2.overlaps
                int r1 = r3.overlaps
                int r0 = kotlin.jvm.internal.g0.t(r0, r1)
                if (r0 == 0) goto L10
                return r0
            L10:
                int r0 = r2.coverageOffset
                int r3 = r3.coverageOffset
                int r3 = kotlin.jvm.internal.g0.t(r0, r3)
                return r3
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.room.AmbiguousColumnResolver.Solution r1) {
                r0 = this;
                androidx.room.AmbiguousColumnResolver$Solution r1 = (androidx.room.AmbiguousColumnResolver.Solution) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public final int getCoverageOffset() {
                r1 = this;
                int r0 = r1.coverageOffset
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<androidx.room.AmbiguousColumnResolver.Match> getMatches() {
                r1 = this;
                java.util.List<androidx.room.AmbiguousColumnResolver$Match> r0 = r1.matches
                return r0
        }

        public final int getOverlaps() {
                r1 = this;
                int r0 = r1.overlaps
                return r0
        }
    }

    static {
            androidx.room.AmbiguousColumnResolver r0 = new androidx.room.AmbiguousColumnResolver
            r0.<init>()
            androidx.room.AmbiguousColumnResolver.INSTANCE = r0
            return
    }

    private AmbiguousColumnResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 a(java.util.List r0, int r1, java.util.List r2) {
            kotlin.n1 r0 = resolve$lambda$16$lambda$15(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(java.lang.String[] r0, java.util.List r1, int r2, int r3, int r4, java.util.List r5) {
            kotlin.n1 r0 = resolve$lambda$16$lambda$7(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(kotlin.jvm.internal.Ref.ObjectRef r0, java.util.List r1) {
            kotlin.n1 r0 = resolve$lambda$19(r0, r1)
            return r0
    }

    private final <T> void dfs(java.util.List<? extends java.util.List<? extends T>> r4, java.util.List<T> r5, int r6, kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, kotlin.n1> r7) {
            r3 = this;
            int r0 = r4.size()
            if (r6 != r0) goto L10
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r4 = kotlin.collections.f0.a6(r5)
            r7.invoke(r4)
            return
        L10:
            java.lang.Object r0 = r4.get(r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            r5.add(r1)
            androidx.room.AmbiguousColumnResolver r1 = androidx.room.AmbiguousColumnResolver.INSTANCE
            int r2 = r6 + 1
            r1.dfs(r4, r5, r2, r7)
            int r1 = kotlin.collections.f0.L(r5)
            r5.remove(r1)
            goto L1a
        L36:
            return
    }

    static /* synthetic */ void dfs$default(androidx.room.AmbiguousColumnResolver r0, java.util.List r1, java.util.List r2, int r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L9:
            r5 = r5 & 4
            if (r5 == 0) goto Le
            r3 = 0
        Le:
            r0.dfs(r1, r2, r3, r4)
            return
    }

    private final void rabinKarpSearch(java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn> r7, java.lang.String[] r8, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn>, kotlin.n1> r9) {
            r6 = this;
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L10
            r4 = r8[r2]
            int r4 = r4.hashCode()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L10:
            int r8 = r8.length
            java.util.List r0 = r7.subList(r1, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L1c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r0.next()
            androidx.room.AmbiguousColumnResolver$ResultColumn r4 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r4
            java.lang.String r4 = r4.getName()
            int r4 = r4.hashCode()
            int r2 = r2 + r4
            goto L1c
        L32:
            if (r3 != r2) goto L43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.util.List r5 = r7.subList(r1, r8)
            r9.invoke(r0, r4, r5)
        L43:
            int r0 = r1 + 1
            int r4 = r8 + 1
            int r5 = r7.size()
            if (r4 <= r5) goto L4e
            return
        L4e:
            java.lang.Object r1 = r7.get(r1)
            androidx.room.AmbiguousColumnResolver$ResultColumn r1 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r1
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r2 = r2 - r1
            java.lang.Object r8 = r7.get(r8)
            androidx.room.AmbiguousColumnResolver$ResultColumn r8 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r8
            java.lang.String r8 = r8.getName()
            int r8 = r8.hashCode()
            int r2 = r2 + r8
            r1 = r0
            r8 = r4
            goto L32
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final int[][] resolve(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r1, @org.jetbrains.annotations.NotNull java.lang.String[][] r2) {
            java.lang.String r0 = "resultColumns"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "mappings"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int[][] r1 = resolve(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final int[][] resolve(@org.jetbrains.annotations.NotNull java.lang.String[] r17, @org.jetbrains.annotations.NotNull java.lang.String[][] r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "resultColumns"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "mappings"
            kotlin.jvm.internal.g0.p(r1, r2)
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L11:
            java.lang.String r5 = "toLowerCase(...)"
            if (r4 >= r2) goto L47
            r6 = r0[r4]
            char r7 = r6.charAt(r3)
            r8 = 96
            if (r7 != r8) goto L39
            int r7 = r6.length()
            r9 = 1
            int r7 = r7 - r9
            char r7 = r6.charAt(r7)
            if (r7 != r8) goto L39
            int r7 = r6.length()
            int r7 = r7 - r9
            java.lang.String r6 = r6.substring(r9, r7)
            java.lang.String r7 = "substring(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
        L39:
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            kotlin.jvm.internal.g0.o(r6, r5)
            r0[r4] = r6
            int r4 = r4 + 1
            goto L11
        L47:
            int r2 = r1.length
            r4 = 0
        L49:
            if (r4 >= r2) goto L66
            r6 = r1[r4]
            int r6 = r6.length
            r7 = 0
        L4f:
            if (r7 >= r6) goto L63
            r8 = r1[r4]
            r9 = r8[r7]
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            kotlin.jvm.internal.g0.o(r9, r5)
            r8[r7] = r9
            int r7 = r7 + 1
            goto L4f
        L63:
            int r4 = r4 + 1
            goto L49
        L66:
            java.util.Set r2 = kotlin.collections.u1.d()
            int r4 = r1.length
            r5 = 0
        L6c:
            if (r5 >= r4) goto L76
            r6 = r1[r5]
            kotlin.collections.f0.u0(r2, r6)
            int r5 = r5 + 1
            goto L6c
        L76:
            java.util.Set r2 = kotlin.collections.u1.a(r2)
            java.util.List r4 = kotlin.collections.f0.j()
            int r5 = r0.length
            r6 = 0
            r7 = 0
        L81:
            if (r6 >= r5) goto L99
            r8 = r0[r6]
            int r9 = r7 + 1
            boolean r10 = r2.contains(r8)
            if (r10 == 0) goto L95
            androidx.room.AmbiguousColumnResolver$ResultColumn r10 = new androidx.room.AmbiguousColumnResolver$ResultColumn
            r10.<init>(r8, r7)
            r4.add(r10)
        L95:
            int r6 = r6 + 1
            r7 = r9
            goto L81
        L99:
            java.util.List r0 = kotlin.collections.f0.b(r4)
            int r2 = r1.length
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r4 = 0
        La4:
            if (r4 >= r2) goto Lb1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.add(r6)
            int r4 = r4 + 1
            goto La4
        Lb1:
            int r2 = r1.length
            r4 = 0
            r6 = 0
        Lb4:
            if (r4 >= r2) goto L153
            r7 = r1[r4]
            int r8 = r6 + 1
            androidx.room.AmbiguousColumnResolver r9 = androidx.room.AmbiguousColumnResolver.INSTANCE
            androidx.room.a r10 = new androidx.room.a
            r10.<init>(r7, r5, r6)
            r9.rabinKarpSearch(r0, r7, r10)
            java.lang.Object r9 = r5.get(r6)
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L14d
            java.util.ArrayList r11 = new java.util.ArrayList
            int r9 = r7.length
            r11.<init>(r9)
            int r9 = r7.length
            r10 = 0
        Ld8:
            if (r10 >= r9) goto L13e
            r12 = r7[r10]
            java.util.List r13 = kotlin.collections.f0.j()
            r14 = r0
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        Le7:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L10a
            java.lang.Object r15 = r14.next()
            androidx.room.AmbiguousColumnResolver$ResultColumn r15 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r15
            java.lang.String r3 = r15.getName()
            boolean r3 = kotlin.jvm.internal.g0.g(r12, r3)
            if (r3 == 0) goto L108
            int r3 = r15.getIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.add(r3)
        L108:
            r3 = 0
            goto Le7
        L10a:
            java.util.List r3 = kotlin.collections.f0.b(r13)
            r13 = r3
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L11e
            r11.add(r3)
            int r10 = r10 + 1
            r3 = 0
            goto Ld8
        L11e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Column "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " not found in result"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L13e:
            androidx.room.AmbiguousColumnResolver r10 = androidx.room.AmbiguousColumnResolver.INSTANCE
            androidx.room.b r14 = new androidx.room.b
            r14.<init>(r5, r6)
            r15 = 6
            r16 = 0
            r12 = 0
            r13 = 0
            dfs$default(r10, r11, r12, r13, r14, r15, r16)
        L14d:
            int r4 = r4 + 1
            r6 = r8
            r3 = 0
            goto Lb4
        L153:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15a
            goto L17b
        L15a:
            java.util.Iterator r0 = r5.iterator()
        L15e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17b
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L173
            goto L15e
        L173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to find matches for all mappings"
            r0.<init>(r1)
            throw r0
        L17b:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            androidx.room.AmbiguousColumnResolver$Solution$Companion r1 = androidx.room.AmbiguousColumnResolver.Solution.Companion
            androidx.room.AmbiguousColumnResolver$Solution r1 = r1.getNO_SOLUTION()
            r0.element = r1
            androidx.room.AmbiguousColumnResolver r4 = androidx.room.AmbiguousColumnResolver.INSTANCE
            androidx.room.c r8 = new androidx.room.c
            r8.<init>(r0)
            r9 = 6
            r10 = 0
            r6 = 0
            r7 = 0
            dfs$default(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.element
            androidx.room.AmbiguousColumnResolver$Solution r0 = (androidx.room.AmbiguousColumnResolver.Solution) r0
            java.util.List r0 = r0.getMatches()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1af:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c9
            java.lang.Object r2 = r0.next()
            androidx.room.AmbiguousColumnResolver$Match r2 = (androidx.room.AmbiguousColumnResolver.Match) r2
            java.util.List r2 = r2.getResultIndices()
            java.util.Collection r2 = (java.util.Collection) r2
            int[] r2 = kotlin.collections.f0.Z5(r2)
            r1.add(r2)
            goto L1af
        L1c9:
            r2 = 0
            int[][] r0 = new int[r2][]
            java.lang.Object[] r0 = r1.toArray(r0)
            int[][] r0 = (int[][]) r0
            return r0
    }

    private static final kotlin.n1 resolve$lambda$16$lambda$15(java.util.List r4, int r5, java.util.List r6) {
            java.lang.String r0 = "indices"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L1c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r2 <= r3) goto L1c
            r2 = r3
            goto L1c
        L30:
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L44:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r0.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r1 >= r3) goto L44
            r1 = r3
            goto L44
        L58:
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            androidx.room.AmbiguousColumnResolver$Match r5 = new androidx.room.AmbiguousColumnResolver$Match
            kotlin.ranges.m r0 = new kotlin.ranges.m
            r0.<init>(r2, r1)
            r5.<init>(r0, r6)
            r4.add(r5)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L6e:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
        L74:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    private static final kotlin.n1 resolve$lambda$16$lambda$7(java.lang.String[] r7, java.util.List r8, int r9, int r10, int r11, java.util.List r12) {
            java.lang.String r0 = "resultColumnsSublist"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L46
            r3 = r7[r2]
            r4 = r12
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.room.AmbiguousColumnResolver$ResultColumn r6 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r6
            java.lang.String r6 = r6.component1()
            boolean r6 = kotlin.jvm.internal.g0.g(r3, r6)
            if (r6 == 0) goto L18
            goto L31
        L30:
            r5 = 0
        L31:
            androidx.room.AmbiguousColumnResolver$ResultColumn r5 = (androidx.room.AmbiguousColumnResolver.ResultColumn) r5
            if (r5 == 0) goto L43
            int r3 = r5.getIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L43:
            kotlin.n1 r7 = kotlin.n1.a
            return r7
        L46:
            java.lang.Object r7 = r8.get(r9)
            java.util.List r7 = (java.util.List) r7
            androidx.room.AmbiguousColumnResolver$Match r8 = new androidx.room.AmbiguousColumnResolver$Match
            kotlin.ranges.m r9 = new kotlin.ranges.m
            int r11 = r11 + (-1)
            r9.<init>(r10, r11)
            r8.<init>(r9, r0)
            r7.add(r8)
            kotlin.n1 r7 = kotlin.n1.a
            return r7
    }

    private static final kotlin.n1 resolve$lambda$19(kotlin.jvm.internal.Ref.ObjectRef r1, java.util.List r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.AmbiguousColumnResolver$Solution$Companion r0 = androidx.room.AmbiguousColumnResolver.Solution.Companion
            androidx.room.AmbiguousColumnResolver$Solution r2 = r0.build(r2)
            java.lang.Object r0 = r1.element
            androidx.room.AmbiguousColumnResolver$Solution r0 = (androidx.room.AmbiguousColumnResolver.Solution) r0
            int r0 = r2.compareTo2(r0)
            if (r0 >= 0) goto L17
            r1.element = r2
        L17:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
