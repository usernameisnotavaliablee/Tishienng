package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Options extends kotlin.collections.d<okio.ByteString> implements java.util.RandomAccess {

    @org.jetbrains.annotations.NotNull
    public static final okio.Options.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString[] byteStrings;

    @org.jetbrains.annotations.NotNull
    private final int[] trie;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13870#3,3:240\n73#4:243\n73#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
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

        private final void buildTrieRecursive(long r20, okio.Buffer r22, int r23, java.util.List<? extends okio.ByteString> r24, int r25, int r26, java.util.List<java.lang.Integer> r27) {
                r19 = this;
                r0 = r19
                r9 = r22
                r10 = r23
                r5 = r24
                r1 = r25
                r11 = r26
                r8 = r27
                java.lang.String r2 = "Failed requirement."
                if (r1 >= r11) goto L1a3
                r3 = r1
            L13:
                if (r3 >= r11) goto L2a
                java.lang.Object r4 = r5.get(r3)
                okio.ByteString r4 = (okio.ByteString) r4
                int r4 = r4.size()
                if (r4 < r10) goto L24
                int r3 = r3 + 1
                goto L13
            L24:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
            L2a:
                java.lang.Object r2 = r24.get(r25)
                okio.ByteString r2 = (okio.ByteString) r2
                int r3 = r11 + (-1)
                java.lang.Object r3 = r5.get(r3)
                okio.ByteString r3 = (okio.ByteString) r3
                int r4 = r2.size()
                if (r10 != r4) goto L54
                java.lang.Object r2 = r8.get(r1)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                int r1 = r1 + 1
                java.lang.Object r4 = r5.get(r1)
                okio.ByteString r4 = (okio.ByteString) r4
                r6 = r1
                r1 = r2
                r2 = r4
                goto L56
            L54:
                r6 = r1
                r1 = -1
            L56:
                byte r4 = r2.getByte(r10)
                byte r7 = r3.getByte(r10)
                r13 = 2
                if (r4 == r7) goto L11b
                int r2 = r6 + 1
                r3 = 1
            L64:
                if (r2 >= r11) goto L83
                int r4 = r2 + (-1)
                java.lang.Object r4 = r5.get(r4)
                okio.ByteString r4 = (okio.ByteString) r4
                byte r4 = r4.getByte(r10)
                java.lang.Object r7 = r5.get(r2)
                okio.ByteString r7 = (okio.ByteString) r7
                byte r7 = r7.getByte(r10)
                if (r4 == r7) goto L80
                int r3 = r3 + 1
            L80:
                int r2 = r2 + 1
                goto L64
            L83:
                long r14 = r0.getIntCount(r9)
                long r14 = r20 + r14
                r16 = -1
                long r12 = (long) r13
                long r14 = r14 + r12
                int r2 = r3 * 2
                long r12 = (long) r2
                long r14 = r14 + r12
                r9.writeInt(r3)
                r9.writeInt(r1)
                r1 = r6
            L98:
                if (r1 >= r11) goto Lbc
                java.lang.Object r2 = r5.get(r1)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r10)
                if (r1 == r6) goto Lb4
                int r3 = r1 + (-1)
                java.lang.Object r3 = r5.get(r3)
                okio.ByteString r3 = (okio.ByteString) r3
                byte r3 = r3.getByte(r10)
                if (r2 == r3) goto Lb9
            Lb4:
                r2 = r2 & 255(0xff, float:3.57E-43)
                r9.writeInt(r2)
            Lb9:
                int r1 = r1 + 1
                goto L98
            Lbc:
                okio.Buffer r3 = new okio.Buffer
                r3.<init>()
            Lc1:
                if (r6 >= r11) goto L117
                java.lang.Object r1 = r5.get(r6)
                okio.ByteString r1 = (okio.ByteString) r1
                byte r1 = r1.getByte(r10)
                int r2 = r6 + 1
                r4 = r2
            Ld0:
                if (r4 >= r11) goto Le3
                java.lang.Object r7 = r5.get(r4)
                okio.ByteString r7 = (okio.ByteString) r7
                byte r7 = r7.getByte(r10)
                if (r1 == r7) goto Le0
                r7 = r4
                goto Le4
            Le0:
                int r4 = r4 + 1
                goto Ld0
            Le3:
                r7 = r11
            Le4:
                if (r2 != r7) goto L103
                int r1 = r10 + 1
                java.lang.Object r2 = r5.get(r6)
                okio.ByteString r2 = (okio.ByteString) r2
                int r2 = r2.size()
                if (r1 != r2) goto L103
                java.lang.Object r1 = r8.get(r6)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r9.writeInt(r1)
                r1 = r14
                goto L114
            L103:
                long r1 = r0.getIntCount(r3)
                long r1 = r1 + r14
                int r2 = (int) r1
                int r2 = r2 * (-1)
                r9.writeInt(r2)
                int r4 = r10 + 1
                r1 = r14
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
            L114:
                r14 = r1
                r6 = r7
                goto Lc1
            L117:
                r9.writeAll(r3)
                return
            L11b:
                r16 = -1
                int r4 = r2.size()
                int r7 = r3.size()
                int r4 = java.lang.Math.min(r4, r7)
                r7 = 0
                r12 = r10
            L12b:
                if (r12 >= r4) goto L13c
                byte r14 = r2.getByte(r12)
                byte r15 = r3.getByte(r12)
                if (r14 != r15) goto L13c
                int r7 = r7 + 1
                int r12 = r12 + 1
                goto L12b
            L13c:
                long r3 = r0.getIntCount(r9)
                long r3 = r20 + r3
                long r12 = (long) r13
                long r3 = r3 + r12
                long r12 = (long) r7
                long r3 = r3 + r12
                r12 = 1
                long r3 = r3 + r12
                int r12 = -r7
                r9.writeInt(r12)
                r9.writeInt(r1)
                int r1 = r10 + r7
            L152:
                if (r10 >= r1) goto L160
                byte r7 = r2.getByte(r10)
                r7 = r7 & 255(0xff, float:3.57E-43)
                r9.writeInt(r7)
                int r10 = r10 + 1
                goto L152
            L160:
                int r2 = r6 + 1
                if (r2 != r11) goto L186
                java.lang.Object r2 = r5.get(r6)
                okio.ByteString r2 = (okio.ByteString) r2
                int r2 = r2.size()
                if (r1 != r2) goto L17e
                java.lang.Object r1 = r8.get(r6)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r9.writeInt(r1)
                return
            L17e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Check failed."
                r1.<init>(r2)
                throw r1
            L186:
                r17 = r3
                r4 = r1
                r1 = r17
                okio.Buffer r3 = new okio.Buffer
                r3.<init>()
                long r12 = r0.getIntCount(r3)
                long r12 = r12 + r1
                int r7 = (int) r12
                int r7 = r7 * (-1)
                r9.writeInt(r7)
                r7 = r11
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                r9.writeAll(r3)
                return
            L1a3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
        }

        static /* synthetic */ void buildTrieRecursive$default(okio.Options.Companion r9, long r10, okio.Buffer r12, int r13, java.util.List r14, int r15, int r16, java.util.List r17, int r18, java.lang.Object r19) {
                r0 = r18 & 1
                if (r0 == 0) goto L6
                r10 = 0
            L6:
                r1 = r10
                r10 = r18 & 4
                r11 = 0
                if (r10 == 0) goto Le
                r4 = 0
                goto Lf
            Le:
                r4 = r13
            Lf:
                r10 = r18 & 16
                if (r10 == 0) goto L15
                r6 = 0
                goto L16
            L15:
                r6 = r15
            L16:
                r10 = r18 & 32
                if (r10 == 0) goto L25
                int r10 = r14.size()
                r7 = r10
            L1f:
                r0 = r9
                r3 = r12
                r5 = r14
                r8 = r17
                goto L28
            L25:
                r7 = r16
                goto L1f
            L28:
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                return
        }

        private final long getIntCount(okio.Buffer r5) {
                r4 = this;
                long r0 = r5.size()
                r5 = 4
                long r2 = (long) r5
                long r0 = r0 / r2
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) {
                r16 = this;
                r0 = r17
                java.lang.String r1 = "byteStrings"
                kotlin.jvm.internal.g0.p(r0, r1)
                int r1 = r0.length
                r2 = 0
                r3 = -1
                r4 = 0
                if (r1 != 0) goto L19
                okio.Options r0 = new okio.Options
                okio.ByteString[] r1 = new okio.ByteString[r4]
                int[] r3 = new int[]{r4, r3}
                r0.<init>(r1, r3, r2)
                return r0
            L19:
                java.util.List r5 = kotlin.collections.n.nz(r0)
                kotlin.collections.f0.o0(r5)
                int r1 = r5.size()
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>(r1)
                r6 = 0
            L2a:
                if (r6 >= r1) goto L36
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                r13.add(r7)
                int r6 = r6 + 1
                goto L2a
            L36:
                int r1 = r0.length
                r3 = 0
                r11 = 0
            L39:
                if (r3 >= r1) goto L52
                r6 = r0[r3]
                int r12 = r11 + 1
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                int r6 = kotlin.collections.f0.A(r5, r6, r7, r8, r9, r10)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
                r13.set(r6, r7)
                int r3 = r3 + 1
                r11 = r12
                goto L39
            L52:
                java.lang.Object r1 = r5.get(r4)
                okio.ByteString r1 = (okio.ByteString) r1
                int r1 = r1.size()
                if (r1 <= 0) goto L104
                r1 = 0
            L5f:
                int r3 = r5.size()
                if (r1 >= r3) goto Lcd
                java.lang.Object r3 = r5.get(r1)
                okio.ByteString r3 = (okio.ByteString) r3
                int r6 = r1 + 1
                r7 = r6
            L6e:
                int r8 = r5.size()
                if (r7 >= r8) goto Lcb
                java.lang.Object r8 = r5.get(r7)
                okio.ByteString r8 = (okio.ByteString) r8
                boolean r9 = r8.startsWith(r3)
                if (r9 == 0) goto Lcb
                int r9 = r8.size()
                int r10 = r3.size()
                if (r9 == r10) goto Lb0
                java.lang.Object r8 = r13.get(r7)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                java.lang.Object r9 = r13.get(r1)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r8 <= r9) goto Lad
                r5.remove(r7)
                java.lang.Object r8 = r13.remove(r7)
                java.lang.Number r8 = (java.lang.Number) r8
                r8.intValue()
                goto L6e
            Lad:
                int r7 = r7 + 1
                goto L6e
            Lb0:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "duplicate option: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            Lcb:
                r1 = r6
                goto L5f
            Lcd:
                okio.Buffer r8 = new okio.Buffer
                r8.<init>()
                r14 = 53
                r15 = 0
                r6 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r10 = r5
                r5 = r16
                buildTrieRecursive$default(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
                long r6 = r5.getIntCount(r8)
                int r1 = (int) r6
                int[] r3 = new int[r1]
            Le7:
                if (r4 >= r1) goto Lf2
                int r6 = r8.readInt()
                r3[r4] = r6
                int r4 = r4 + 1
                goto Le7
            Lf2:
                okio.Options r1 = new okio.Options
                int r4 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                java.lang.String r4 = "copyOf(...)"
                kotlin.jvm.internal.g0.o(r0, r4)
                okio.ByteString[] r0 = (okio.ByteString[]) r0
                r1.<init>(r0, r3, r2)
                return r1
            L104:
                r5 = r16
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "the empty byte string is not a supported option"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            okio.Options$Companion r0 = new okio.Options$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Options.Companion = r0
            return
    }

    private Options(okio.ByteString[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.byteStrings = r1
            r0.trie = r2
            return
    }

    public /* synthetic */ Options(okio.ByteString[] r1, int[] r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r1) {
            okio.Options$Companion r0 = okio.Options.Companion
            okio.Options r1 = r0.of(r1)
            return r1
    }

    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(okio.ByteString r1) {
            r0 = this;
            boolean r1 = super/*kotlin.collections.b*/.contains(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            okio.ByteString r1 = r0.m63get(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: get, reason: collision with other method in class */
    public okio.ByteString m63get(int r2) {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            r2 = r0[r2]
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString[] getByteStrings$okio() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            return r0
    }

    public int getSize() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            int r0 = r0.length
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getTrie$okio() {
            r1 = this;
            int[] r0 = r1.trie
            return r0
    }

    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }
}
