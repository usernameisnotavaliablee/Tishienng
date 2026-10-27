package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHpack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hpack.kt\nokhttp3/internal/http2/Hpack\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,647:1\n250#2:648\n*S KotlinDebug\n*F\n+ 1 Hpack.kt\nokhttp3/internal/http2/Hpack\n*L\n398#1:648\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Hpack {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Hpack INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX = null;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Reader {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public okhttp3.internal.http2.Header[] dynamicTable;

        @kotlin.jvm.JvmField
        public int dynamicTableByteCount;

        @kotlin.jvm.JvmField
        public int headerCount;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource source;

        @kotlin.jvm.JvmOverloads
        public Reader(@org.jetbrains.annotations.NotNull okio.Source r8, int r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r8, r0)
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Reader(@org.jetbrains.annotations.NotNull okio.Source r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.headerTableSizeSetting = r3
                r1.maxDynamicTableByteCount = r4
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.headerList = r3
                okio.BufferedSource r2 = okio.Okio.buffer(r2)
                r1.source = r2
                r2 = 8
                okhttp3.internal.http2.Header[] r2 = new okhttp3.internal.http2.Header[r2]
                r1.dynamicTable = r2
                int r2 = r2.length
                int r2 = r2 + (-1)
                r1.nextHeaderIndex = r2
                return
        }

        public /* synthetic */ Reader(okio.Source r1, int r2, int r3, int r4, kotlin.jvm.internal.v r5) {
                r0 = this;
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = r2
            L5:
                r0.<init>(r1, r2, r3)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                return
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private final void clearDynamicTable() {
                r6 = this;
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                r4 = 6
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                kotlin.collections.n.V1(r0, r1, r2, r3, r4, r5)
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r6.nextHeaderIndex = r0
                r0 = 0
                r6.headerCount = r0
                r6.dynamicTableByteCount = r0
                return
        }

        private final int dynamicTableIndex(int r2) {
                r1 = this;
                int r0 = r1.nextHeaderIndex
                int r0 = r0 + 1
                int r0 = r0 + r2
                return r0
        }

        private final int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L39
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L28
                if (r5 <= 0) goto L28
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                kotlin.jvm.internal.g0.m(r2)
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r3 = r4.dynamicTableByteCount
                int r3 = r3 - r2
                r4.dynamicTableByteCount = r3
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L28:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L39:
                return r0
        }

        private final okio.ByteString getName(int r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L11
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r4 = r0[r4]
                okio.ByteString r4 = r4.name
                return r4
            L11:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L2d
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L2d
                r4 = r1[r0]
                kotlin.jvm.internal.g0.m(r4)
                okio.ByteString r4 = r4.name
                return r4
            L2d:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Header index too large "
                r1.append(r2)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final void insertIntoDynamicTable(int r6, okhttp3.internal.http2.Header r7) {
                r5 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r5.headerList
                r0.add(r7)
                int r0 = r7.hpackSize
                r1 = -1
                if (r6 == r1) goto L18
                okhttp3.internal.http2.Header[] r2 = r5.dynamicTable
                int r3 = r5.dynamicTableIndex(r6)
                r2 = r2[r3]
                kotlin.jvm.internal.g0.m(r2)
                int r2 = r2.hpackSize
                int r0 = r0 - r2
            L18:
                int r2 = r5.maxDynamicTableByteCount
                if (r0 <= r2) goto L20
                r5.clearDynamicTable()
                return
            L20:
                int r3 = r5.dynamicTableByteCount
                int r3 = r3 + r0
                int r3 = r3 - r2
                int r2 = r5.evictToRecoverBytes(r3)
                if (r6 != r1) goto L58
                int r6 = r5.headerCount
                int r6 = r6 + 1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r2 = r1.length
                if (r6 <= r2) goto L47
                int r6 = r1.length
                int r6 = r6 * 2
                okhttp3.internal.http2.Header[] r6 = new okhttp3.internal.http2.Header[r6]
                int r2 = r1.length
                int r3 = r1.length
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r6, r2, r3)
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
                r5.nextHeaderIndex = r1
                r5.dynamicTable = r6
            L47:
                int r6 = r5.nextHeaderIndex
                int r1 = r6 + (-1)
                r5.nextHeaderIndex = r1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                r1[r6] = r7
                int r6 = r5.headerCount
                int r6 = r6 + 1
                r5.headerCount = r6
                goto L62
            L58:
                int r1 = r5.dynamicTableIndex(r6)
                int r1 = r1 + r2
                int r6 = r6 + r1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                r1[r6] = r7
            L62:
                int r6 = r5.dynamicTableByteCount
                int r6 = r6 + r0
                r5.dynamicTableByteCount = r6
                return
        }

        private final boolean isStaticHeader(int r3) {
                r2 = this;
                if (r3 < 0) goto Le
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                r1 = 1
                int r0 = r0 - r1
                if (r3 > r0) goto Le
                return r1
            Le:
                r3 = 0
                return r3
        }

        private final int readByte() throws java.io.IOException {
                r2 = this;
                okio.BufferedSource r0 = r2.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal._UtilCommonKt.and(r0, r1)
                return r0
        }

        private final void readIndexedHeader(int r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L14
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r4 = r0[r4]
                java.util.List<okhttp3.internal.http2.Header> r0 = r3.headerList
                r0.add(r4)
                return
            L14:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L35
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L35
                java.util.List<okhttp3.internal.http2.Header> r4 = r3.headerList
                java.util.Collection r4 = (java.util.Collection) r4
                r0 = r1[r0]
                kotlin.jvm.internal.g0.m(r0)
                r4.add(r0)
                return
            L35:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Header index too large "
                r1.append(r2)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int r3) throws java.io.IOException {
                r2 = this;
                okio.ByteString r3 = r2.getName(r3)
                okio.ByteString r0 = r2.readByteString()
                okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
                r1.<init>(r3, r0)
                r3 = -1
                r2.insertIntoDynamicTable(r3, r1)
                return
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
                r3 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r3.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r3.readByteString()
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r0, r1)
                r0 = -1
                r3.insertIntoDynamicTable(r0, r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int r4) throws java.io.IOException {
                r3 = this;
                okio.ByteString r4 = r3.getName(r4)
                okio.ByteString r0 = r3.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r1 = r3.headerList
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r4, r0)
                r1.add(r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r4.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r4.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r2 = r4.headerList
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                r3.<init>(r0, r1)
                r2.add(r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
                r2 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r2.headerList
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.f0.a6(r0)
                java.util.List<okhttp3.internal.http2.Header> r1 = r2.headerList
                r1.clear()
                return r0
        }

        public final int maxDynamicTableByteCount() {
                r1 = this;
                int r0 = r1.maxDynamicTableByteCount
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.ByteString readByteString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 128(0x80, float:1.8E-43)
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                r2 = 127(0x7f, float:1.78E-43)
                int r0 = r5.readInt(r0, r2)
                long r2 = (long) r0
                if (r1 == 0) goto L27
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okhttp3.internal.http2.Huffman r1 = okhttp3.internal.http2.Huffman.INSTANCE
                okio.BufferedSource r4 = r5.source
                r1.decode(r4, r2, r0)
                okio.ByteString r0 = r0.readByteString()
                return r0
            L27:
                okio.BufferedSource r0 = r5.source
                okio.ByteString r0 = r0.readByteString(r2)
                return r0
        }

        public final void readHeaders() throws java.io.IOException {
                r3 = this;
            L0:
                okio.BufferedSource r0 = r3.source
                boolean r0 = r0.exhausted()
                if (r0 != 0) goto L92
                okio.BufferedSource r0 = r3.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal._UtilCommonKt.and(r0, r1)
                r1 = 128(0x80, float:1.8E-43)
                if (r0 == r1) goto L8a
                r2 = r0 & 128(0x80, float:1.8E-43)
                if (r2 != r1) goto L28
                r1 = 127(0x7f, float:1.78E-43)
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readIndexedHeader(r0)
                goto L0
            L28:
                r1 = 64
                if (r0 != r1) goto L30
                r3.readLiteralHeaderWithIncrementalIndexingNewName()
                goto L0
            L30:
                r2 = r0 & 64
                if (r2 != r1) goto L40
                r1 = 63
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithIncrementalIndexingIndexedName(r0)
                goto L0
            L40:
                r1 = r0 & 32
                r2 = 32
                if (r1 != r2) goto L71
                r1 = 31
                int r0 = r3.readInt(r0, r1)
                r3.maxDynamicTableByteCount = r0
                if (r0 < 0) goto L58
                int r1 = r3.headerTableSizeSetting
                if (r0 > r1) goto L58
                r3.adjustDynamicTableByteCount()
                goto L0
            L58:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid dynamic table size update "
                r1.append(r2)
                int r2 = r3.maxDynamicTableByteCount
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L71:
                r1 = 16
                if (r0 == r1) goto L85
                if (r0 != 0) goto L78
                goto L85
            L78:
                r1 = 15
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithoutIndexingIndexedName(r0)
                goto L0
            L85:
                r3.readLiteralHeaderWithoutIndexingNewName()
                goto L0
            L8a:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "index == 0"
                r0.<init>(r1)
                throw r0
            L92:
                return
        }

        public final int readInt(int r3, int r4) throws java.io.IOException {
                r2 = this;
                r3 = r3 & r4
                if (r3 >= r4) goto L4
                return r3
            L4:
                r3 = 0
            L5:
                int r0 = r2.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L14
                r0 = r0 & 127(0x7f, float:1.78E-43)
                int r0 = r0 << r3
                int r4 = r4 + r0
                int r3 = r3 + 7
                goto L5
            L14:
                int r3 = r0 << r3
                int r4 = r4 + r3
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Writer {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public okhttp3.internal.http2.Header[] dynamicTable;

        @kotlin.jvm.JvmField
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;

        @kotlin.jvm.JvmField
        public int headerCount;

        @kotlin.jvm.JvmField
        public int headerTableSizeSetting;

        @kotlin.jvm.JvmField
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;

        @org.jetbrains.annotations.NotNull
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        @kotlin.jvm.JvmOverloads
        public Writer(int r8, @org.jetbrains.annotations.NotNull okio.Buffer r9) {
                r7 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.g0.p(r9, r0)
                r5 = 2
                r6 = 0
                r3 = 0
                r1 = r7
                r2 = r8
                r4 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Writer(int r2, boolean r3, @org.jetbrains.annotations.NotNull okio.Buffer r4) {
                r1 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.g0.p(r4, r0)
                r1.<init>()
                r1.headerTableSizeSetting = r2
                r1.useCompression = r3
                r1.out = r4
                r3 = 2147483647(0x7fffffff, float:NaN)
                r1.smallestHeaderTableSizeSetting = r3
                r1.maxDynamicTableByteCount = r2
                r2 = 8
                okhttp3.internal.http2.Header[] r2 = new okhttp3.internal.http2.Header[r2]
                r1.dynamicTable = r2
                int r2 = r2.length
                int r2 = r2 + (-1)
                r1.nextHeaderIndex = r2
                return
        }

        public /* synthetic */ Writer(int r1, boolean r2, okio.Buffer r3, int r4, kotlin.jvm.internal.v r5) {
                r0 = this;
                r5 = r4 & 1
                if (r5 == 0) goto L6
                r1 = 4096(0x1000, float:5.74E-42)
            L6:
                r4 = r4 & 2
                if (r4 == 0) goto Lb
                r2 = 1
            Lb:
                r0.<init>(r1, r2, r3)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Writer(@org.jetbrains.annotations.NotNull okio.Buffer r8) {
                r7 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.g0.p(r8, r0)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                r1 = r7
                r4 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                return
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private final void clearDynamicTable() {
                r6 = this;
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                r4 = 6
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                kotlin.collections.n.V1(r0, r1, r2, r3, r4, r5)
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r6.nextHeaderIndex = r0
                r0 = 0
                r6.headerCount = r0
                r6.dynamicTableByteCount = r0
                return
        }

        private final int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L4f
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L31
                if (r5 <= 0) goto L31
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                kotlin.jvm.internal.g0.m(r2)
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r2 = r4.dynamicTableByteCount
                okhttp3.internal.http2.Header[] r3 = r4.dynamicTable
                r3 = r3[r1]
                kotlin.jvm.internal.g0.m(r3)
                int r3 = r3.hpackSize
                int r2 = r2 - r3
                r4.dynamicTableByteCount = r2
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L31:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r4.nextHeaderIndex
                int r2 = r1 + 1
                int r1 = r1 + 1
                int r1 = r1 + r0
                r3 = 0
                java.util.Arrays.fill(r5, r2, r1, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L4f:
                return r0
        }

        private final void insertIntoDynamicTable(okhttp3.internal.http2.Header r7) {
                r6 = this;
                int r0 = r7.hpackSize
                int r1 = r6.maxDynamicTableByteCount
                if (r0 <= r1) goto La
                r6.clearDynamicTable()
                return
            La:
                int r2 = r6.dynamicTableByteCount
                int r2 = r2 + r0
                int r2 = r2 - r1
                r6.evictToRecoverBytes(r2)
                int r1 = r6.headerCount
                int r1 = r1 + 1
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r3 = r2.length
                if (r1 <= r3) goto L2e
                int r1 = r2.length
                int r1 = r1 * 2
                okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
                int r3 = r2.length
                int r4 = r2.length
                r5 = 0
                java.lang.System.arraycopy(r2, r5, r1, r3, r4)
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r2 = r2.length
                int r2 = r2 + (-1)
                r6.nextHeaderIndex = r2
                r6.dynamicTable = r1
            L2e:
                int r1 = r6.nextHeaderIndex
                int r2 = r1 + (-1)
                r6.nextHeaderIndex = r2
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                r2[r1] = r7
                int r7 = r6.headerCount
                int r7 = r7 + 1
                r6.headerCount = r7
                int r7 = r6.dynamicTableByteCount
                int r7 = r7 + r0
                r6.dynamicTableByteCount = r7
                return
        }

        public final void resizeHeaderTable(int r2) {
                r1 = this;
                r1.headerTableSizeSetting = r2
                r0 = 16384(0x4000, float:2.2959E-41)
                int r2 = java.lang.Math.min(r2, r0)
                int r0 = r1.maxDynamicTableByteCount
                if (r0 != r2) goto Ld
                return
            Ld:
                if (r2 >= r0) goto L17
                int r0 = r1.smallestHeaderTableSizeSetting
                int r0 = java.lang.Math.min(r0, r2)
                r1.smallestHeaderTableSizeSetting = r0
            L17:
                r0 = 1
                r1.emitDynamicTableSizeUpdate = r0
                r1.maxDynamicTableByteCount = r2
                r1.adjustDynamicTableByteCount()
                return
        }

        public final void writeByteString(@org.jetbrains.annotations.NotNull okio.ByteString r5) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r5, r0)
                boolean r0 = r4.useCompression
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L32
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.INSTANCE
                int r2 = r0.encodedLength(r5)
                int r3 = r5.size()
                if (r2 >= r3) goto L32
                okio.Buffer r2 = new okio.Buffer
                r2.<init>()
                r0.encode(r5, r2)
                okio.ByteString r5 = r2.readByteString()
                int r0 = r5.size()
                r2 = 128(0x80, float:1.8E-43)
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
                return
            L32:
                int r0 = r5.size()
                r2 = 0
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
                return
        }

        public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r13) throws java.io.IOException {
                r12 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.g0.p(r13, r0)
                boolean r0 = r12.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L23
                int r0 = r12.smallestHeaderTableSizeSetting
                int r2 = r12.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L17
                r12.writeInt(r0, r4, r3)
            L17:
                r12.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.smallestHeaderTableSizeSetting = r0
                int r0 = r12.maxDynamicTableByteCount
                r12.writeInt(r0, r4, r3)
            L23:
                int r0 = r13.size()
                r2 = 0
            L28:
                if (r2 >= r0) goto L107
                java.lang.Object r3 = r13.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                okio.ByteString r4 = r3.name
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.value
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r7 = r6.getNAME_TO_FIRST_INDEX()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L7a
                int r7 = r7.intValue()
                int r9 = r7 + 1
                r10 = 2
                if (r10 > r9) goto L77
                r10 = 8
                if (r9 >= r10) goto L77
                okhttp3.internal.http2.Header[] r10 = r6.getSTATIC_HEADER_TABLE()
                r10 = r10[r7]
                okio.ByteString r10 = r10.value
                boolean r10 = kotlin.jvm.internal.g0.g(r10, r5)
                if (r10 == 0) goto L64
                r6 = r9
                goto L7c
            L64:
                okhttp3.internal.http2.Header[] r6 = r6.getSTATIC_HEADER_TABLE()
                r6 = r6[r9]
                okio.ByteString r6 = r6.value
                boolean r6 = kotlin.jvm.internal.g0.g(r6, r5)
                if (r6 == 0) goto L77
                int r7 = r7 + 2
                r6 = r9
                r9 = r7
                goto L7c
            L77:
                r6 = r9
            L78:
                r9 = -1
                goto L7c
            L7a:
                r6 = -1
                goto L78
            L7c:
                if (r9 != r8) goto Lc2
                int r7 = r12.nextHeaderIndex
                int r7 = r7 + 1
                okhttp3.internal.http2.Header[] r10 = r12.dynamicTable
                int r10 = r10.length
            L85:
                if (r7 >= r10) goto Lc2
                okhttp3.internal.http2.Header[] r11 = r12.dynamicTable
                r11 = r11[r7]
                kotlin.jvm.internal.g0.m(r11)
                okio.ByteString r11 = r11.name
                boolean r11 = kotlin.jvm.internal.g0.g(r11, r4)
                if (r11 == 0) goto Lbf
                okhttp3.internal.http2.Header[] r11 = r12.dynamicTable
                r11 = r11[r7]
                kotlin.jvm.internal.g0.m(r11)
                okio.ByteString r11 = r11.value
                boolean r11 = kotlin.jvm.internal.g0.g(r11, r5)
                if (r11 == 0) goto Lb1
                int r9 = r12.nextHeaderIndex
                int r7 = r7 - r9
                okhttp3.internal.http2.Hpack r9 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r9 = r9.getSTATIC_HEADER_TABLE()
                int r9 = r9.length
                int r9 = r9 + r7
                goto Lc2
            Lb1:
                if (r6 != r8) goto Lbf
                int r6 = r12.nextHeaderIndex
                int r6 = r7 - r6
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r11 = r11.getSTATIC_HEADER_TABLE()
                int r11 = r11.length
                int r6 = r6 + r11
            Lbf:
                int r7 = r7 + 1
                goto L85
            Lc2:
                if (r9 == r8) goto Lcc
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.8E-43)
                r12.writeInt(r9, r3, r4)
                goto L103
            Lcc:
                r7 = 64
                if (r6 != r8) goto Ldf
                okio.Buffer r6 = r12.out
                r6.writeByte(r7)
                r12.writeByteString(r4)
                r12.writeByteString(r5)
                r12.insertIntoDynamicTable(r3)
                goto L103
            Ldf:
                okio.ByteString r8 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r8 = r4.startsWith(r8)
                if (r8 == 0) goto Lf8
                okio.ByteString r8 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = kotlin.jvm.internal.g0.g(r8, r4)
                if (r4 != 0) goto Lf8
                r3 = 15
                r12.writeInt(r6, r3, r1)
                r12.writeByteString(r5)
                goto L103
            Lf8:
                r4 = 63
                r12.writeInt(r6, r4, r7)
                r12.writeByteString(r5)
                r12.insertIntoDynamicTable(r3)
            L103:
                int r2 = r2 + 1
                goto L28
            L107:
                return
        }

        public final void writeInt(int r2, int r3, int r4) {
                r1 = this;
                if (r2 >= r3) goto L9
                okio.Buffer r3 = r1.out
                r2 = r2 | r4
                r3.writeByte(r2)
                return
            L9:
                okio.Buffer r0 = r1.out
                r4 = r4 | r3
                r0.writeByte(r4)
                int r2 = r2 - r3
            L10:
                r3 = 128(0x80, float:1.8E-43)
                if (r2 < r3) goto L1f
                r4 = r2 & 127(0x7f, float:1.78E-43)
                okio.Buffer r0 = r1.out
                r3 = r3 | r4
                r0.writeByte(r3)
                int r2 = r2 >>> 7
                goto L10
            L1f:
                okio.Buffer r3 = r1.out
                r3.writeByte(r2)
                return
        }
    }

    static {
            okhttp3.internal.http2.Hpack r0 = new okhttp3.internal.http2.Hpack
            r0.<init>()
            okhttp3.internal.http2.Hpack.INSTANCE = r0
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r5 = "GET"
            r2.<init>(r4, r5)
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            java.lang.String r6 = "POST"
            r5.<init>(r4, r6)
            okhttp3.internal.http2.Header r4 = new okhttp3.internal.http2.Header
            okio.ByteString r6 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r7 = "/"
            r4.<init>(r6, r7)
            okhttp3.internal.http2.Header r7 = new okhttp3.internal.http2.Header
            java.lang.String r8 = "/index.html"
            r7.<init>(r6, r8)
            okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
            okio.ByteString r8 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r9 = "http"
            r6.<init>(r8, r9)
            okhttp3.internal.http2.Header r9 = new okhttp3.internal.http2.Header
            java.lang.String r10 = "https"
            r9.<init>(r8, r10)
            okhttp3.internal.http2.Header r8 = new okhttp3.internal.http2.Header
            okio.ByteString r10 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r11 = "200"
            r8.<init>(r10, r11)
            okhttp3.internal.http2.Header r11 = new okhttp3.internal.http2.Header
            java.lang.String r12 = "204"
            r11.<init>(r10, r12)
            okhttp3.internal.http2.Header r12 = new okhttp3.internal.http2.Header
            java.lang.String r13 = "206"
            r12.<init>(r10, r13)
            okhttp3.internal.http2.Header r13 = new okhttp3.internal.http2.Header
            java.lang.String r14 = "304"
            r13.<init>(r10, r14)
            okhttp3.internal.http2.Header r14 = new okhttp3.internal.http2.Header
            java.lang.String r15 = "400"
            r14.<init>(r10, r15)
            okhttp3.internal.http2.Header r15 = new okhttp3.internal.http2.Header
            r16 = r0
            java.lang.String r0 = "404"
            r15.<init>(r10, r0)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r17 = r1
            java.lang.String r1 = "500"
            r0.<init>(r10, r1)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r10 = "accept-charset"
            r1.<init>(r10, r3)
            okhttp3.internal.http2.Header r10 = new okhttp3.internal.http2.Header
            r18 = r0
            java.lang.String r0 = "accept-encoding"
            r19 = r1
            java.lang.String r1 = "gzip, deflate"
            r10.<init>(r0, r1)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            java.lang.String r1 = "accept-language"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r20 = r0
            java.lang.String r0 = "accept-ranges"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r21 = r1
            java.lang.String r1 = "accept"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r22 = r0
            java.lang.String r0 = "access-control-allow-origin"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r23 = r1
            java.lang.String r1 = "age"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r24 = r0
            java.lang.String r0 = "allow"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r25 = r1
            java.lang.String r1 = "authorization"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r26 = r0
            java.lang.String r0 = "cache-control"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r27 = r1
            java.lang.String r1 = "content-disposition"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r28 = r0
            java.lang.String r0 = "content-encoding"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r29 = r1
            java.lang.String r1 = "content-language"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r30 = r0
            java.lang.String r0 = "content-length"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r31 = r1
            java.lang.String r1 = "content-location"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r32 = r0
            java.lang.String r0 = "content-range"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r33 = r1
            java.lang.String r1 = "content-type"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r34 = r0
            java.lang.String r0 = "cookie"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r35 = r1
            java.lang.String r1 = "date"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r36 = r0
            java.lang.String r0 = "etag"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r37 = r1
            java.lang.String r1 = "expect"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r38 = r0
            java.lang.String r0 = "expires"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r39 = r1
            java.lang.String r1 = "from"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r40 = r0
            java.lang.String r0 = "host"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r41 = r1
            java.lang.String r1 = "if-match"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r42 = r0
            java.lang.String r0 = "if-modified-since"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r43 = r1
            java.lang.String r1 = "if-none-match"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r44 = r0
            java.lang.String r0 = "if-range"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r45 = r1
            java.lang.String r1 = "if-unmodified-since"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r46 = r0
            java.lang.String r0 = "last-modified"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r47 = r1
            java.lang.String r1 = "link"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r48 = r0
            java.lang.String r0 = "location"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r49 = r1
            java.lang.String r1 = "max-forwards"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r50 = r0
            java.lang.String r0 = "proxy-authenticate"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r51 = r1
            java.lang.String r1 = "proxy-authorization"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r52 = r0
            java.lang.String r0 = "range"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r53 = r1
            java.lang.String r1 = "referer"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r54 = r0
            java.lang.String r0 = "refresh"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r55 = r1
            java.lang.String r1 = "retry-after"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r56 = r0
            java.lang.String r0 = "server"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r57 = r1
            java.lang.String r1 = "set-cookie"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r58 = r0
            java.lang.String r0 = "strict-transport-security"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r59 = r1
            java.lang.String r1 = "transfer-encoding"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r60 = r0
            java.lang.String r0 = "user-agent"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r61 = r1
            java.lang.String r1 = "vary"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r62 = r0
            java.lang.String r0 = "via"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r63 = r1
            java.lang.String r1 = "www-authenticate"
            r0.<init>(r1, r3)
            r1 = 61
            okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
            r3 = 0
            r1[r3] = r17
            r3 = 1
            r1[r3] = r2
            r2 = 2
            r1[r2] = r5
            r2 = 3
            r1[r2] = r4
            r2 = 4
            r1[r2] = r7
            r2 = 5
            r1[r2] = r6
            r2 = 6
            r1[r2] = r9
            r2 = 7
            r1[r2] = r8
            r2 = 8
            r1[r2] = r11
            r2 = 9
            r1[r2] = r12
            r2 = 10
            r1[r2] = r13
            r2 = 11
            r1[r2] = r14
            r2 = 12
            r1[r2] = r15
            r2 = 13
            r1[r2] = r18
            r2 = 14
            r1[r2] = r19
            r2 = 15
            r1[r2] = r10
            r2 = 16
            r1[r2] = r20
            r2 = 17
            r1[r2] = r21
            r2 = 18
            r1[r2] = r22
            r2 = 19
            r1[r2] = r23
            r2 = 20
            r1[r2] = r24
            r2 = 21
            r1[r2] = r25
            r2 = 22
            r1[r2] = r26
            r2 = 23
            r1[r2] = r27
            r2 = 24
            r1[r2] = r28
            r2 = 25
            r1[r2] = r29
            r2 = 26
            r1[r2] = r30
            r2 = 27
            r1[r2] = r31
            r2 = 28
            r1[r2] = r32
            r2 = 29
            r1[r2] = r33
            r2 = 30
            r1[r2] = r34
            r2 = 31
            r1[r2] = r35
            r2 = 32
            r1[r2] = r36
            r2 = 33
            r1[r2] = r37
            r2 = 34
            r1[r2] = r38
            r2 = 35
            r1[r2] = r39
            r2 = 36
            r1[r2] = r40
            r2 = 37
            r1[r2] = r41
            r2 = 38
            r1[r2] = r42
            r2 = 39
            r1[r2] = r43
            r2 = 40
            r1[r2] = r44
            r2 = 41
            r1[r2] = r45
            r2 = 42
            r1[r2] = r46
            r2 = 43
            r1[r2] = r47
            r2 = 44
            r1[r2] = r48
            r2 = 45
            r1[r2] = r49
            r2 = 46
            r1[r2] = r50
            r2 = 47
            r1[r2] = r51
            r2 = 48
            r1[r2] = r52
            r2 = 49
            r1[r2] = r53
            r2 = 50
            r1[r2] = r54
            r2 = 51
            r1[r2] = r55
            r2 = 52
            r1[r2] = r56
            r2 = 53
            r1[r2] = r57
            r2 = 54
            r1[r2] = r58
            r2 = 55
            r1[r2] = r59
            r2 = 56
            r1[r2] = r60
            r2 = 57
            r1[r2] = r61
            r2 = 58
            r1[r2] = r62
            r2 = 59
            r1[r2] = r63
            r2 = 60
            r1[r2] = r0
            okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE = r1
            java.util.Map r0 = r16.nameToFirstIndex()
            okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX = r0
            return
    }

    private Hpack() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r2 = r1.length
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r3)
            int r1 = r1.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L28
            okhttp3.internal.http2.Header[] r3 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            r4 = r3[r2]
            okio.ByteString r4 = r4.name
            boolean r4 = r0.containsKey(r4)
            if (r4 != 0) goto L25
            r3 = r3[r2]
            okio.ByteString r3 = r3.name
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r4)
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r1 = "unmodifiableMap(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString checkLowercase(@org.jetbrains.annotations.NotNull okio.ByteString r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L37
            byte r2 = r5.getByte(r1)
            r3 = 65
            if (r3 > r2) goto L34
            r3 = 91
            if (r2 < r3) goto L19
            goto L34
        L19:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PROTOCOL_ERROR response malformed: mixed case name: "
            r1.append(r2)
            java.lang.String r5 = r5.utf8()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L34:
            int r1 = r1 + 1
            goto La
        L37:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<okio.ByteString, java.lang.Integer> getNAME_TO_FIRST_INDEX() {
            r1 = this;
            java.util.Map<okio.ByteString, java.lang.Integer> r0 = okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Header[] getSTATIC_HEADER_TABLE() {
            r1 = this;
            okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            return r0
    }
}
