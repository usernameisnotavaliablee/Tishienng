package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n42#2,7:365\n52#2:372\n55#2:373\n62#2,4:374\n66#2:379\n68#2:381\n74#2,23:382\n102#2,23:405\n129#2,2:428\n131#2,9:431\n143#2:440\n146#2:441\n149#2:442\n152#2:443\n160#2:444\n170#2,3:445\n169#2:448\n183#2,2:449\n188#2:451\n192#2:452\n196#2:453\n200#2:454\n204#2,7:455\n217#2:462\n221#2,8:463\n233#2,4:471\n242#2,5:475\n251#2,6:480\n257#2,9:487\n301#2,8:496\n129#2,2:504\n131#2,9:507\n312#2,9:516\n67#3:378\n73#3:380\n73#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString EMPTY = null;
    private static final long serialVersionUID = 1;

    @org.jetbrains.annotations.NotNull
    private final byte[] data;
    private transient int hashCode;

    @org.jetbrains.annotations.Nullable
    private transient java.lang.String utf8;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 ByteStringNonJs.kt\nokio/internal/-ByteStringNonJs\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n269#2:365\n273#2,3:366\n280#2,3:369\n287#2,2:372\n25#3:374\n27#3,7:376\n1#4:375\n1#4:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
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

        public static /* synthetic */ okio.ByteString encodeString$default(okio.ByteString.Companion r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L6
                java.nio.charset.Charset r2 = kotlin.text.e.b
            L6:
                okio.ByteString r0 = r0.encodeString(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.ByteString of$default(okio.ByteString.Companion r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L5
                r2 = 0
            L5:
                r4 = r4 & 2
                if (r4 == 0) goto Ld
                int r3 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
            Ld:
                okio.ByteString r0 = r0.of(r1, r2, r3)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @kotlin.jvm.JvmName(name = "-deprecated_decodeBase64")
        @org.jetbrains.annotations.Nullable
        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final okio.ByteString m47deprecated_decodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString r2 = r1.decodeBase64(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @kotlin.jvm.JvmName(name = "-deprecated_decodeHex")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final okio.ByteString m48deprecated_decodeHex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString r2 = r1.decodeHex(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @kotlin.jvm.JvmName(name = "-deprecated_encodeString")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final okio.ByteString m49deprecated_encodeString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.ByteString r2 = r1.encodeString(r2, r3)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @kotlin.jvm.JvmName(name = "-deprecated_encodeUtf8")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final okio.ByteString m50deprecated_encodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString r2 = r1.encodeUtf8(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m51deprecated_of(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "buffer"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString r2 = r1.of(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m52deprecated_of(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString r2 = r1.of(r2, r3, r4)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @kotlin.jvm.JvmName(name = "-deprecated_read")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final okio.ByteString m53deprecated_read(@org.jetbrains.annotations.NotNull java.io.InputStream r2, int r3) {
                r1 = this;
                java.lang.String r0 = "inputstream"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString r2 = r1.read(r2, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public final okio.ByteString decodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                byte[] r2 = okio.Base64.decodeBase64ToArray(r2)
                if (r2 == 0) goto L11
                okio.ByteString r0 = new okio.ByteString
                r0.<init>(r2)
                return r0
            L11:
                r2 = 0
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString decodeHex(@org.jetbrains.annotations.NotNull java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r6.length()
                int r0 = r0 % 2
                if (r0 != 0) goto L3b
                int r0 = r6.length()
                int r0 = r0 / 2
                byte[] r1 = new byte[r0]
                r2 = 0
            L16:
                if (r2 >= r0) goto L35
                int r3 = r2 * 2
                char r4 = r6.charAt(r3)
                int r4 = okio.internal.ByteStringNonJs.access$decodeHexDigit(r4)
                int r4 = r4 << 4
                int r3 = r3 + 1
                char r3 = r6.charAt(r3)
                int r3 = okio.internal.ByteStringNonJs.access$decodeHexDigit(r3)
                int r4 = r4 + r3
                byte r3 = (byte) r4
                r1[r2] = r3
                int r2 = r2 + 1
                goto L16
            L35:
                okio.ByteString r6 = new okio.ByteString
                r6.<init>(r1)
                return r6
            L3b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected hex string: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "encodeString")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString encodeString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.ByteString r0 = new okio.ByteString
                byte[] r2 = r2.getBytes(r3)
                java.lang.String r3 = "getBytes(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                r0.<init>(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString encodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.ByteString r0 = new okio.ByteString
                byte[] r1 = okio._JvmPlatformKt.asUtf8ToByteArray(r3)
                r0.<init>(r1)
                r0.setUtf8$okio(r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString of(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                int r0 = r2.remaining()
                byte[] r0 = new byte[r0]
                r2.get(r0)
                okio.ByteString r2 = new okio.ByteString
                r2.<init>(r0)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString of(@org.jetbrains.annotations.NotNull byte... r3) {
                r2 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.ByteString r0 = new okio.ByteString
                int r1 = r3.length
                byte[] r3 = java.util.Arrays.copyOf(r3, r1)
                java.lang.String r1 = "copyOf(...)"
                kotlin.jvm.internal.g0.o(r3, r1)
                r0.<init>(r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString of(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r8, r0)
                int r10 = okio.SegmentedByteString.resolveDefaultParameter(r8, r10)
                int r0 = r8.length
                long r1 = (long) r0
                long r3 = (long) r9
                long r5 = (long) r10
                okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
                okio.ByteString r0 = new okio.ByteString
                int r10 = r10 + r9
                byte[] r8 = kotlin.collections.n.f1(r8, r9, r10)
                r0.<init>(r8)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "read")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString read(@org.jetbrains.annotations.NotNull java.io.InputStream r5, int r6) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r5, r0)
                if (r6 < 0) goto L23
                byte[] r0 = new byte[r6]
                r1 = 0
            La:
                if (r1 >= r6) goto L1d
                int r2 = r6 - r1
                int r2 = r5.read(r0, r1, r2)
                r3 = -1
                if (r2 == r3) goto L17
                int r1 = r1 + r2
                goto La
            L17:
                java.io.EOFException r5 = new java.io.EOFException
                r5.<init>()
                throw r5
            L1d:
                okio.ByteString r5 = new okio.ByteString
                r5.<init>(r0)
                return r5
            L23:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "byteCount < 0: "
                r5.append(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r6.<init>(r5)
                throw r6
        }
    }

    static {
            okio.ByteString$Companion r0 = new okio.ByteString$Companion
            r1 = 0
            r0.<init>(r1)
            okio.ByteString.Companion = r0
            okio.ByteString r0 = new okio.ByteString
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            okio.ByteString.EMPTY = r0
            return
    }

    public ByteString(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.data = r2
            return
    }

    public static /* synthetic */ void copyInto$default(okio.ByteString r1, int r2, byte[] r3, int r4, int r5, int r6, java.lang.Object r7) {
            if (r7 != 0) goto L11
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L8
            r2 = 0
        L8:
            r6 = r6 & 4
            if (r6 == 0) goto Ld
            r4 = 0
        Ld:
            r1.copyInto(r2, r3, r4, r5)
            return
        L11:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: copyInto"
            r1.<init>(r2)
            throw r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final okio.ByteString decodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.decodeBase64(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString decodeHex(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.decodeHex(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "encodeString")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString encodeString(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.encodeString(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString encodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.encodeUtf8(r1)
            return r1
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString r0, okio.ByteString r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            int r0 = r0.indexOf(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: indexOf"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString r0, byte[] r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            int r0 = r0.indexOf(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: indexOf"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString r0, okio.ByteString r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lf
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
        La:
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
        Lf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString r0, byte[] r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lf
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
        La:
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
        Lf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString of(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString of(@org.jetbrains.annotations.NotNull byte... r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString of(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "read")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString read(@org.jetbrains.annotations.NotNull java.io.InputStream r1, int r2) throws java.io.IOException {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.read(r1, r2)
            return r1
    }

    private final void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.readInt()
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            okio.ByteString r3 = r1.read(r3, r0)
            java.lang.Class<okio.ByteString> r0 = okio.ByteString.class
            java.lang.String r1 = "data"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            byte[] r3 = r3.data
            r0.set(r2, r3)
            return
    }

    public static /* synthetic */ okio.ByteString substring$default(okio.ByteString r0, int r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L14
            r4 = r3 & 1
            if (r4 == 0) goto L7
            r1 = 0
        L7:
            r3 = r3 & 2
            if (r3 == 0) goto Lf
            int r2 = okio.SegmentedByteString.getDEFAULT__ByteString_size()
        Lf:
            okio.ByteString r0 = r0.substring(r1, r2)
            return r0
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: substring"
            r0.<init>(r1)
            throw r0
    }

    private final void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            r2.writeInt(r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m45deprecated_getByte(int r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m46deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.ByteBuffer asByteBuffer() {
            r2 = this;
            byte[] r0 = r2.data
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "asReadOnlyBuffer(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String base64() {
            r3 = this;
            byte[] r0 = r3.getData$okio()
            r1 = 0
            r2 = 1
            java.lang.String r0 = okio.Base64.encodeBase64$default(r0, r1, r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String base64Url() {
            r2 = this;
            byte[] r0 = r2.getData$okio()
            byte[] r1 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r0 = okio.Base64.encodeBase64(r0, r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.ByteString r1) {
            r0 = this;
            okio.ByteString r1 = (okio.ByteString) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2c
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2b
            return r5
        L2b:
            return r6
        L2c:
            if (r0 != r1) goto L2f
            return r3
        L2f:
            if (r0 >= r1) goto L32
            return r5
        L32:
            return r6
    }

    public void copyInto(int r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r3, r0)
            byte[] r0 = r1.getData$okio()
            int r5 = r5 + r2
            kotlin.collections.n.v0(r0, r3, r4, r2, r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString digest$okio(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)
            byte[] r0 = r3.data
            r1 = 0
            int r2 = r3.size()
            r4.update(r0, r1, r2)
            byte[] r4 = r4.digest()
            okio.ByteString r0 = new okio.ByteString
            kotlin.jvm.internal.g0.m(r4)
            r0.<init>(r4)
            return r0
    }

    public final boolean endsWith(@org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r3 = this;
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.size()
            boolean r4 = r3.rangeEquals(r0, r4, r1, r2)
            return r4
    }

    public final boolean endsWith(@org.jetbrains.annotations.NotNull byte[] r4) {
            r3 = this;
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r4 = r3.rangeEquals(r0, r4, r1, r2)
            return r4
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L26
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r1 != r3) goto L26
            byte[] r1 = r4.getData$okio()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            boolean r5 = r5.rangeEquals(r2, r1, r2, r3)
            if (r5 == 0) goto L26
            return r0
        L26:
            return r2
    }

    @kotlin.jvm.JvmName(name = "getByte")
    public final byte getByte(int r1) {
            r0 = this;
            byte r1 = r0.internalGet$okio(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] getData$okio() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    public final int getHashCode$okio() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    public int getSize$okio() {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUtf8$okio() {
            r1 = this;
            java.lang.String r0 = r1.utf8
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto L7
            return r0
        L7:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String hex() {
            r9 = this;
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r1 = r9.getData$okio()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r2) goto L31
            r5 = r1[r3]
            int r6 = r4 + 1
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r8 = r5 >> 4
            r8 = r8 & 15
            char r7 = r7[r8]
            r0[r4] = r7
            int r4 = r4 + 2
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r5 = r5 & 15
            char r5 = r7[r5]
            r0[r6] = r5
            int r3 = r3 + 1
            goto L10
        L31:
            java.lang.String r0 = kotlin.text.u.J1(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmac$okio(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r2 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r4, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r3)     // Catch: java.security.InvalidKeyException -> L2b
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L2b
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L2b
            r1.<init>(r4, r3)     // Catch: java.security.InvalidKeyException -> L2b
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L2b
            okio.ByteString r3 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L2b
            byte[] r4 = r2.data     // Catch: java.security.InvalidKeyException -> L2b
            byte[] r4 = r0.doFinal(r4)     // Catch: java.security.InvalidKeyException -> L2b
            java.lang.String r0 = "doFinal(...)"
            kotlin.jvm.internal.g0.o(r4, r0)     // Catch: java.security.InvalidKeyException -> L2b
            r3.<init>(r4)     // Catch: java.security.InvalidKeyException -> L2b
            return r3
        L2b:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmacSha1(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmacSha256(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmacSha512(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = indexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public final int indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r2 = r1.indexOf(r2, r3)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int indexOf(@org.jetbrains.annotations.NotNull byte[] r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = indexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public int indexOf(@org.jetbrains.annotations.NotNull byte[] r5, int r6) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L24
        L13:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L1f
            return r6
        L1f:
            if (r6 == r0) goto L24
            int r6 = r6 + 1
            goto L13
        L24:
            r5 = -1
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            return r0
    }

    public byte internalGet$okio(int r2) {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            r2 = r0[r2]
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int lastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = lastIndexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public final int lastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r2 = r1.lastIndexOf(r2, r3)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int lastIndexOf(@org.jetbrains.annotations.NotNull byte[] r4) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r4 = lastIndexOf$default(r3, r4, r2, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public int lastIndexOf(@org.jetbrains.annotations.NotNull byte[] r4, int r5) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r5 = okio.SegmentedByteString.resolveDefaultParameter(r3, r5)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L14:
            r0 = -1
            if (r0 >= r5) goto L27
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.SegmentedByteString.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L24
            return r5
        L24:
            int r5 = r5 + (-1)
            goto L14
        L27:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public boolean rangeEquals(int r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            byte[] r0 = r1.getData$okio()
            boolean r2 = r3.rangeEquals(r4, r0, r2, r5)
            return r2
    }

    public boolean rangeEquals(int r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 < 0) goto L21
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L21
            if (r4 < 0) goto L21
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L21
            byte[] r0 = r1.getData$okio()
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r0, r2, r3, r4, r5)
            if (r2 == 0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final void setHashCode$okio(int r1) {
            r0 = this;
            r0.hashCode = r1
            return
    }

    public final void setUtf8$okio(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.utf8 = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            int r0 = r1.getSize$okio()
            return r0
    }

    public final boolean startsWith(@org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.size()
            boolean r3 = r2.rangeEquals(r0, r3, r0, r1)
            return r3
    }

    public final boolean startsWith(@org.jetbrains.annotations.NotNull byte[] r3) {
            r2 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.length
            boolean r3 = r2.rangeEquals(r0, r3, r0, r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String string(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.data
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString substring() {
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            okio.ByteString r0 = substring$default(r3, r2, r2, r0, r1)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString substring(int r4) {
            r3 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            okio.ByteString r4 = substring$default(r3, r4, r2, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public okio.ByteString substring(int r3, int r4) {
            r2 = this;
            int r4 = okio.SegmentedByteString.resolveDefaultParameter(r2, r4)
            if (r3 < 0) goto L56
            byte[] r0 = r2.getData$okio()
            int r0 = r0.length
            if (r4 > r0) goto L31
            int r0 = r4 - r3
            if (r0 < 0) goto L29
            if (r3 != 0) goto L1b
            byte[] r0 = r2.getData$okio()
            int r0 = r0.length
            if (r4 != r0) goto L1b
            return r2
        L1b:
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.getData$okio()
            byte[] r3 = kotlin.collections.n.f1(r1, r3, r4)
            r0.<init>(r3)
            return r0
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "endIndex < beginIndex"
            r3.<init>(r4)
            throw r3
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "endIndex > length("
            r3.append(r4)
            byte[] r4 = r2.getData$okio()
            int r4 = r4.length
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L56:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "beginIndex < 0"
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiLowercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L47
            byte[] r1 = r6.getData$okio()
            r1 = r1[r0]
            r2 = 65
            if (r1 < r2) goto L44
            r3 = 90
            if (r1 <= r3) goto L17
            goto L44
        L17:
            byte[] r4 = r6.getData$okio()
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r5 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            int r5 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r4[r0] = r1
        L2c:
            int r0 = r4.length
            if (r5 >= r0) goto L3e
            r0 = r4[r5]
            if (r0 < r2) goto L3b
            if (r0 <= r3) goto L36
            goto L3b
        L36:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r4[r5] = r0
        L3b:
            int r5 = r5 + 1
            goto L2c
        L3e:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r4)
            return r0
        L44:
            int r0 = r0 + 1
            goto L1
        L47:
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiUppercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L47
            byte[] r1 = r6.getData$okio()
            r1 = r1[r0]
            r2 = 97
            if (r1 < r2) goto L44
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L17
            goto L44
        L17:
            byte[] r4 = r6.getData$okio()
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r5 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            int r5 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r4[r0] = r1
        L2c:
            int r0 = r4.length
            if (r5 >= r0) goto L3e
            r0 = r4[r5]
            if (r0 < r2) goto L3b
            if (r0 <= r3) goto L36
            goto L3b
        L36:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r4[r5] = r0
        L3b:
            int r5 = r5 + 1
            goto L2c
        L3e:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r4)
            return r0
        L44:
            int r0 = r0 + 1
            goto L1
        L47:
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public byte[] toByteArray() {
            r2 = this;
            byte[] r0 = r2.getData$okio()
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r19 = this;
            byte[] r0 = r19.getData$okio()
            int r0 = r0.length
            if (r0 != 0) goto La
            java.lang.String r0 = "[size=0]"
            return r0
        La:
            byte[] r0 = r19.getData$okio()
            r1 = 64
            int r0 = okio.internal.ByteString.access$codePointIndexToCharIndex(r0, r1)
            r2 = -1
            java.lang.String r3 = "…]"
            r4 = 0
            java.lang.String r5 = "[size="
            r6 = 93
            if (r0 != r2) goto Lb4
            byte[] r0 = r19.getData$okio()
            int r0 = r0.length
            if (r0 > r1) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[hex="
            r0.append(r1)
            java.lang.String r1 = r19.hex()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            byte[] r2 = r19.getData$okio()
            int r2 = r2.length
            r0.append(r2)
            java.lang.String r2 = " hex="
            r0.append(r2)
            r2 = r19
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r2, r1)
            byte[] r5 = r2.getData$okio()
            int r5 = r5.length
            if (r1 > r5) goto L8f
            if (r1 < 0) goto L87
            byte[] r5 = r2.getData$okio()
            int r5 = r5.length
            if (r1 != r5) goto L6b
            r5 = r2
            goto L78
        L6b:
            okio.ByteString r5 = new okio.ByteString
            byte[] r6 = r2.getData$okio()
            byte[] r1 = kotlin.collections.n.f1(r6, r4, r1)
            r5.<init>(r1)
        L78:
            java.lang.String r1 = r5.hex()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
        L87:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "endIndex < beginIndex"
            r0.<init>(r1)
            throw r0
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "endIndex > length("
            r0.append(r1)
            byte[] r1 = r2.getData$okio()
            int r1 = r1.length
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb4:
            r2 = r19
            java.lang.String r1 = r2.utf8()
            java.lang.String r7 = r1.substring(r4, r0)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r4)
            r11 = 4
            r12 = 0
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            r10 = 0
            java.lang.String r13 = kotlin.text.u.x2(r7, r8, r9, r10, r11, r12)
            r17 = 4
            r18 = 0
            java.lang.String r14 = "\n"
            java.lang.String r15 = "\\n"
            r16 = 0
            java.lang.String r7 = kotlin.text.u.x2(r13, r14, r15, r16, r17, r18)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r4 = kotlin.text.u.x2(r7, r8, r9, r10, r11, r12)
            int r1 = r1.length()
            if (r0 >= r1) goto L10a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            byte[] r1 = r2.getData$okio()
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " text="
            r0.append(r1)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
        L10a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[text="
            r0.append(r1)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String utf8() {
            r1 = this;
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L11
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio._JvmPlatformKt.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L11:
            return r0
    }

    public void write(@org.jetbrains.annotations.NotNull java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    public void write$okio(@org.jetbrains.annotations.NotNull okio.Buffer r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.internal.ByteString.commonWrite(r1, r2, r3, r4)
            return
    }
}
