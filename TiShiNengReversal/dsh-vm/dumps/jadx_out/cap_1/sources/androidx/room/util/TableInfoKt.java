package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,397:1\n1053#2:398\n1053#2:399\n1188#3,3:400\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n192#1:398\n194#1:399\n261#1:400,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TableInfoKt {
    private static final boolean containsSurroundingParenthesis(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r8.length()
            r5 = 1
            if (r0 >= r4) goto L38
            char r4 = r8.charAt(r0)
            int r6 = r3 + 1
            r7 = 40
            if (r3 != 0) goto L1f
            if (r4 == r7) goto L1f
            return r1
        L1f:
            if (r4 == r7) goto L32
            r7 = 41
            if (r4 == r7) goto L26
            goto L34
        L26:
            int r2 = r2 + (-1)
            if (r2 != 0) goto L34
            int r4 = r8.length()
            int r4 = r4 - r5
            if (r3 == r4) goto L34
            return r1
        L32:
            int r2 = r2 + 1
        L34:
            int r0 = r0 + 1
            r3 = r6
            goto Lb
        L38:
            if (r2 != 0) goto L3b
            return r5
        L3b:
            return r1
    }

    public static final boolean defaultValueEqualsCommon(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            java.lang.String r0 = "current"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r3)
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = containsSurroundingParenthesis(r2)
            if (r0 == 0) goto L2e
            int r0 = r2.length()
            int r0 = r0 - r1
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.CharSequence r2 = kotlin.text.u.Z5(r2)
            java.lang.String r2 = r2.toString()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            return r2
        L2e:
            r2 = 0
            return r2
    }

    public static final boolean equalsCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.Column r6, @org.jetbrains.annotations.Nullable java.lang.Object r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 1
            if (r6 != r7) goto L9
            return r0
        L9:
            boolean r1 = r7 instanceof androidx.room.util.TableInfo.Column
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            boolean r1 = r6.isPrimaryKey()
            androidx.room.util.TableInfo$Column r7 = (androidx.room.util.TableInfo.Column) r7
            boolean r3 = r7.isPrimaryKey()
            if (r1 == r3) goto L1c
            return r2
        L1c:
            java.lang.String r1 = r6.name
            java.lang.String r3 = r7.name
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L27
            return r2
        L27:
            boolean r1 = r6.notNull
            boolean r3 = r7.notNull
            if (r1 == r3) goto L2e
            return r2
        L2e:
            java.lang.String r1 = r6.defaultValue
            java.lang.String r3 = r7.defaultValue
            int r4 = r6.createdFrom
            r5 = 2
            if (r4 != r0) goto L44
            int r4 = r7.createdFrom
            if (r4 != r5) goto L44
            if (r1 == 0) goto L44
            boolean r4 = defaultValueEqualsCommon(r1, r3)
            if (r4 != 0) goto L44
            return r2
        L44:
            int r4 = r6.createdFrom
            if (r4 != r5) goto L55
            int r4 = r7.createdFrom
            if (r4 != r0) goto L55
            if (r3 == 0) goto L55
            boolean r4 = defaultValueEqualsCommon(r3, r1)
            if (r4 != 0) goto L55
            return r2
        L55:
            int r4 = r6.createdFrom
            if (r4 == 0) goto L69
            int r5 = r7.createdFrom
            if (r4 != r5) goto L69
            if (r1 == 0) goto L66
            boolean r1 = defaultValueEqualsCommon(r1, r3)
            if (r1 != 0) goto L69
            goto L68
        L66:
            if (r3 == 0) goto L69
        L68:
            return r2
        L69:
            int r6 = r6.affinity
            int r7 = r7.affinity
            if (r6 != r7) goto L70
            return r0
        L70:
            return r2
    }

    public static final boolean equalsCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.ForeignKey r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r3 != r4) goto L9
            r3 = 1
            return r3
        L9:
            boolean r0 = r4 instanceof androidx.room.util.TableInfo.ForeignKey
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = r3.referenceTable
            androidx.room.util.TableInfo$ForeignKey r4 = (androidx.room.util.TableInfo.ForeignKey) r4
            java.lang.String r2 = r4.referenceTable
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            java.lang.String r0 = r3.onDelete
            java.lang.String r2 = r4.onDelete
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L27
            return r1
        L27:
            java.lang.String r0 = r3.onUpdate
            java.lang.String r2 = r4.onUpdate
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L32
            return r1
        L32:
            java.util.List<java.lang.String> r0 = r3.columnNames
            java.util.List<java.lang.String> r2 = r4.columnNames
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L3d
            return r1
        L3d:
            java.util.List<java.lang.String> r3 = r3.referenceColumnNames
            java.util.List<java.lang.String> r4 = r4.referenceColumnNames
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            return r3
    }

    public static final boolean equalsCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.Index r5, @org.jetbrains.annotations.Nullable java.lang.Object r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r5 != r6) goto L9
            r5 = 1
            return r5
        L9:
            boolean r0 = r6 instanceof androidx.room.util.TableInfo.Index
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            boolean r0 = r5.unique
            androidx.room.util.TableInfo$Index r6 = (androidx.room.util.TableInfo.Index) r6
            boolean r2 = r6.unique
            if (r0 == r2) goto L18
            return r1
        L18:
            java.util.List<java.lang.String> r0 = r5.columns
            java.util.List<java.lang.String> r2 = r6.columns
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L23
            return r1
        L23:
            java.util.List<java.lang.String> r0 = r5.orders
            java.util.List<java.lang.String> r2 = r6.orders
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L2e
            return r1
        L2e:
            java.lang.String r0 = r5.name
            java.lang.String r2 = "index_"
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.u.H2(r0, r2, r1, r3, r4)
            if (r0 == 0) goto L41
            java.lang.String r5 = r6.name
            boolean r5 = kotlin.text.u.H2(r5, r2, r1, r3, r4)
            return r5
        L41:
            java.lang.String r5 = r5.name
            java.lang.String r6 = r6.name
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            return r5
    }

    public static final boolean equalsCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            if (r4 != r5) goto L9
            return r0
        L9:
            boolean r1 = r5 instanceof androidx.room.util.TableInfo
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            java.lang.String r1 = r4.name
            androidx.room.util.TableInfo r5 = (androidx.room.util.TableInfo) r5
            java.lang.String r3 = r5.name
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L1c
            return r2
        L1c:
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r1 = r4.columns
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r3 = r5.columns
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L27
            return r2
        L27:
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r1 = r4.foreignKeys
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r3 = r5.foreignKeys
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L32
            return r2
        L32:
            java.util.Set<androidx.room.util.TableInfo$Index> r4 = r4.indices
            if (r4 == 0) goto L40
            java.util.Set<androidx.room.util.TableInfo$Index> r5 = r5.indices
            if (r5 != 0) goto L3b
            goto L40
        L3b:
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            return r4
        L40:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String formatString(@org.jetbrains.annotations.NotNull java.util.Collection<?> r10) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r8 = 56
            r9 = 0
            java.lang.String r2 = ",\n"
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\n"
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            r2 = 0
            java.lang.String r10 = kotlin.text.u.o(r10, r2, r1, r2)
            r0.append(r10)
            java.lang.String r10 = "},"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L37:
            java.lang.String r10 = " }"
            return r10
    }

    public static final int hashCodeCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.Column r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.affinity
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.notNull
            if (r1 == 0) goto L19
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L1b
        L19:
            r1 = 1237(0x4d5, float:1.733E-42)
        L1b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.primaryKeyPosition
            int r0 = r0 + r2
            return r0
    }

    public static final int hashCodeCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.ForeignKey r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r2.referenceTable
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.onDelete
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.onUpdate
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r2.columnNames
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r2 = r2.referenceColumnNames
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public static final int hashCodeCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.Index r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = r5.name
            r1 = 2
            r2 = 0
            java.lang.String r3 = "index_"
            r4 = 0
            boolean r0 = kotlin.text.u.H2(r0, r3, r4, r1, r2)
            if (r0 == 0) goto L16
            r0 = -1184239155(0xffffffffb969f1cd, float:-2.231069E-4)
            goto L1c
        L16:
            java.lang.String r0 = r5.name
            int r0 = r0.hashCode()
        L1c:
            int r0 = r0 * 31
            boolean r1 = r5.unique
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r5.columns
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r5 = r5.orders
            int r5 = r5.hashCode()
            int r0 = r0 + r5
            return r0
    }

    public static final int hashCodeCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r1 = r2.columns
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r2 = r2.foreignKeys
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            return r0
    }

    private static final void joinToStringEndWithIndent(java.util.Collection<?> r9) {
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 1
            kotlin.text.u.o(r9, r0, r1, r0)
            java.lang.String r9 = " }"
            kotlin.text.u.o(r9, r0, r1, r0)
            return
    }

    private static final void joinToStringMiddleWithIndent(java.util.Collection<?> r9) {
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 1
            kotlin.text.u.o(r9, r0, r1, r0)
            java.lang.String r9 = "},"
            kotlin.text.u.o(r9, r0, r1, r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toStringCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.Column r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            |Column {\n            |   name = '"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "',\n            |   type = '"
            r0.append(r1)
            java.lang.String r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = "',\n            |   affinity = '"
            r0.append(r1)
            int r1 = r2.affinity
            r0.append(r1)
            java.lang.String r1 = "',\n            |   notNull = '"
            r0.append(r1)
            boolean r1 = r2.notNull
            r0.append(r1)
            java.lang.String r1 = "',\n            |   primaryKeyPosition = '"
            r0.append(r1)
            int r1 = r2.primaryKeyPosition
            r0.append(r1)
            java.lang.String r1 = "',\n            |   defaultValue = '"
            r0.append(r1)
            java.lang.String r2 = r2.defaultValue
            if (r2 != 0) goto L47
            java.lang.String r2 = "undefined"
        L47:
            r0.append(r2)
            java.lang.String r2 = "'\n            |}\n        "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            r1 = 1
            java.lang.String r2 = kotlin.text.u.x(r2, r0, r1, r0)
            java.lang.String r2 = kotlin.text.u.o(r2, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toStringCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.ForeignKey r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            |ForeignKey {\n            |   referenceTable = '"
            r0.append(r1)
            java.lang.String r1 = r3.referenceTable
            r0.append(r1)
            java.lang.String r1 = "',\n            |   onDelete = '"
            r0.append(r1)
            java.lang.String r1 = r3.onDelete
            r0.append(r1)
            java.lang.String r1 = "',\n            |   onUpdate = '"
            r0.append(r1)
            java.lang.String r1 = r3.onUpdate
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columnNames = {"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.columnNames
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.f0.v5(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            joinToStringMiddleWithIndent(r1)
            kotlin.n1 r1 = kotlin.n1.a
            r0.append(r1)
            java.lang.String r2 = "\n            |   referenceColumnNames = {"
            r0.append(r2)
            java.util.List<java.lang.String> r3 = r3.referenceColumnNames
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.f0.v5(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            joinToStringEndWithIndent(r3)
            r0.append(r1)
            java.lang.String r3 = "\n            |}\n        "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r1 = 1
            java.lang.String r3 = kotlin.text.u.x(r3, r0, r1, r0)
            java.lang.String r3 = kotlin.text.u.o(r3, r0, r1, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toStringCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo.Index r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            |Index {\n            |   name = '"
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = "',\n            |   unique = '"
            r0.append(r1)
            boolean r1 = r3.unique
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columns = {"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.columns
            java.util.Collection r1 = (java.util.Collection) r1
            joinToStringMiddleWithIndent(r1)
            kotlin.n1 r1 = kotlin.n1.a
            r0.append(r1)
            java.lang.String r2 = "\n            |   orders = {"
            r0.append(r2)
            java.util.List<java.lang.String> r3 = r3.orders
            java.util.Collection r3 = (java.util.Collection) r3
            joinToStringEndWithIndent(r3)
            r0.append(r1)
            java.lang.String r3 = "\n            |}\n        "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r1 = 1
            java.lang.String r3 = kotlin.text.u.x(r3, r0, r1, r0)
            java.lang.String r3 = kotlin.text.u.o(r3, r0, r1, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toStringCommon(@org.jetbrains.annotations.NotNull androidx.room.util.TableInfo r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            |TableInfo {\n            |    name = '"
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = "',\n            |    columns = {"
            r0.append(r1)
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r1 = r3.columns
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1 r2 = new androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            r2.<init>()
            java.util.List r1 = kotlin.collections.f0.z5(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r1 = formatString(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |    foreignKeys = {"
            r0.append(r1)
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r1 = r3.foreignKeys
            java.lang.String r1 = formatString(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |    indices = {"
            r0.append(r1)
            java.util.Set<androidx.room.util.TableInfo$Index> r3 = r3.indices
            if (r3 == 0) goto L55
            androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2 r1 = new androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            r1.<init>()
            java.util.List r3 = kotlin.collections.f0.z5(r3, r1)
            if (r3 != 0) goto L59
        L55:
            java.util.List r3 = kotlin.collections.f0.J()
        L59:
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String r3 = formatString(r3)
            r0.append(r3)
            java.lang.String r3 = "\n            |}\n        "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 1
            r1 = 0
            java.lang.String r3 = kotlin.text.u.x(r3, r1, r0, r1)
            return r3
    }
}
