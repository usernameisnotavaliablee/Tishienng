package okhttp3.internal.idn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIdnaMappingTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdnaMappingTable.kt\nokhttp3/internal/idn/IdnaMappingTable\n+ 2 IdnaMappingTable.kt\nokhttp3/internal/idn/IdnaMappingTableKt\n*L\n1#1,286:1\n272#2,13:287\n272#2,13:300\n*S KotlinDebug\n*F\n+ 1 IdnaMappingTable.kt\nokhttp3/internal/idn/IdnaMappingTable\n*L\n209#1:287,13\n237#1:300,13\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class IdnaMappingTable {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mappings;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String ranges;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sections;

    public IdnaMappingTable(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "sections"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "ranges"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "mappings"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.sections = r2
            r1.ranges = r3
            r1.mappings = r4
            return
    }

    private final int findRangesOffset(int r4, int r5, int r6) {
            r3 = this;
            r4 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r6 + (-1)
        L4:
            if (r5 > r6) goto L20
            int r0 = r5 + r6
            int r0 = r0 / 2
            int r1 = r0 * 4
            java.lang.String r2 = r3.ranges
            char r1 = r2.charAt(r1)
            int r1 = kotlin.jvm.internal.g0.t(r4, r1)
            if (r1 >= 0) goto L1b
            int r6 = r0 + (-1)
            goto L4
        L1b:
            if (r1 <= 0) goto L23
            int r5 = r0 + 1
            goto L4
        L20:
            int r4 = -r5
            int r0 = r4 + (-1)
        L23:
            if (r0 < 0) goto L28
            int r0 = r0 * 4
            return r0
        L28:
            int r4 = -r0
            int r4 = r4 + (-2)
            int r4 = r4 * 4
            return r4
    }

    private final int findSectionsIndex(int r6) {
            r5 = this;
            r0 = 2097024(0x1fff80, float:2.938557E-39)
            r6 = r6 & r0
            int r6 = r6 >> 7
            java.lang.String r0 = r5.sections
            int r0 = r0.length()
            int r0 = r0 / 4
            int r0 = r0 + (-1)
            r1 = 0
        L11:
            if (r1 > r0) goto L2d
            int r2 = r1 + r0
            int r2 = r2 / 2
            int r3 = r2 * 4
            java.lang.String r4 = r5.sections
            int r3 = okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(r4, r3)
            int r3 = kotlin.jvm.internal.g0.t(r6, r3)
            if (r3 >= 0) goto L28
            int r0 = r2 + (-1)
            goto L11
        L28:
            if (r3 <= 0) goto L30
            int r1 = r2 + 1
            goto L11
        L2d:
            int r6 = -r1
            int r2 = r6 + (-1)
        L30:
            if (r2 < 0) goto L35
            int r2 = r2 * 4
            return r2
        L35:
            int r6 = -r2
            int r6 = r6 + (-2)
            int r6 = r6 * 4
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMappings() {
            r1 = this;
            java.lang.String r0 = r1.mappings
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRanges() {
            r1 = this;
            java.lang.String r0 = r1.ranges
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSections() {
            r1 = this;
            java.lang.String r0 = r1.sections
            return r0
    }

    public final boolean map(int r5, @org.jetbrains.annotations.NotNull okio.BufferedSink r6) {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r4.findSectionsIndex(r5)
            java.lang.String r1 = r4.sections
            int r2 = r0 + 2
            int r1 = okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(r1, r2)
            int r2 = r0 + 4
            java.lang.String r3 = r4.sections
            int r3 = r3.length()
            if (r2 >= r3) goto L24
            java.lang.String r2 = r4.sections
            int r0 = r0 + 6
            int r0 = okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(r2, r0)
            goto L2c
        L24:
            java.lang.String r0 = r4.ranges
            int r0 = r0.length()
            int r0 = r0 / 4
        L2c:
            int r0 = r4.findRangesOffset(r5, r1, r0)
            java.lang.String r1 = r4.ranges
            int r2 = r0 + 1
            char r1 = r1.charAt(r2)
            r2 = 64
            if (r1 < 0) goto L4e
            if (r1 >= r2) goto L4e
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 2
            int r5 = okhttp3.internal.idn.IdnaMappingTableKt.read14BitInt(r5, r0)
            java.lang.String r0 = r4.mappings
            int r1 = r1 + r5
            r6.writeUtf8(r0, r5, r1)
            goto L147
        L4e:
            r3 = 80
            if (r2 > r1) goto L72
            if (r1 >= r3) goto L72
            java.lang.String r2 = r4.ranges
            int r3 = r0 + 2
            char r2 = r2.charAt(r3)
            java.lang.String r3 = r4.ranges
            int r0 = r0 + 3
            char r0 = r3.charAt(r0)
            r1 = r1 & 15
            int r1 = r1 << 14
            int r2 = r2 << 7
            r1 = r1 | r2
            r0 = r0 | r1
            int r5 = r5 - r0
            r6.writeUtf8CodePoint(r5)
            goto L147
        L72:
            if (r3 > r1) goto L96
            r2 = 96
            if (r1 >= r2) goto L96
            java.lang.String r2 = r4.ranges
            int r3 = r0 + 2
            char r2 = r2.charAt(r3)
            java.lang.String r3 = r4.ranges
            int r0 = r0 + 3
            char r0 = r3.charAt(r0)
            r1 = r1 & 15
            int r1 = r1 << 14
            int r2 = r2 << 7
            r1 = r1 | r2
            r0 = r0 | r1
            int r5 = r5 + r0
            r6.writeUtf8CodePoint(r5)
            goto L147
        L96:
            r2 = 119(0x77, float:1.67E-43)
            if (r1 != r2) goto L9e
            kotlin.n1 r5 = kotlin.n1.a
            goto L147
        L9e:
            r2 = 120(0x78, float:1.68E-43)
            if (r1 != r2) goto La7
            r6.writeUtf8CodePoint(r5)
            goto L147
        La7:
            r2 = 121(0x79, float:1.7E-43)
            if (r1 != r2) goto Lb0
            r6.writeUtf8CodePoint(r5)
            r5 = 0
            return r5
        Lb0:
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 != r2) goto Lc1
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 2
            char r5 = r5.charAt(r0)
            r6.writeByte(r5)
            goto L147
        Lc1:
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 != r2) goto Ld4
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 2
            char r5 = r5.charAt(r0)
            r5 = r5 | 128(0x80, float:1.8E-43)
            r6.writeByte(r5)
            goto L147
        Ld4:
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 != r2) goto Lef
            java.lang.String r5 = r4.ranges
            int r1 = r0 + 2
            char r5 = r5.charAt(r1)
            r6.writeByte(r5)
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 3
            char r5 = r5.charAt(r0)
            r6.writeByte(r5)
            goto L147
        Lef:
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L10c
            java.lang.String r5 = r4.ranges
            int r1 = r0 + 2
            char r5 = r5.charAt(r1)
            r5 = r5 | 128(0x80, float:1.8E-43)
            r6.writeByte(r5)
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 3
            char r5 = r5.charAt(r0)
            r6.writeByte(r5)
            goto L147
        L10c:
            r2 = 126(0x7e, float:1.77E-43)
            if (r1 != r2) goto L129
            java.lang.String r5 = r4.ranges
            int r1 = r0 + 2
            char r5 = r5.charAt(r1)
            r6.writeByte(r5)
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 3
            char r5 = r5.charAt(r0)
            r5 = r5 | 128(0x80, float:1.8E-43)
            r6.writeByte(r5)
            goto L147
        L129:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L149
            java.lang.String r5 = r4.ranges
            int r1 = r0 + 2
            char r5 = r5.charAt(r1)
            r5 = r5 | 128(0x80, float:1.8E-43)
            r6.writeByte(r5)
            java.lang.String r5 = r4.ranges
            int r0 = r0 + 3
            char r5 = r5.charAt(r0)
            r5 = r5 | 128(0x80, float:1.8E-43)
            r6.writeByte(r5)
        L147:
            r5 = 1
            return r5
        L149:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected rangesIndex for "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }
}
