package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSchemaInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,378:1\n774#2:379\n865#2,2:380\n1863#2,2:382\n1053#2:384\n1557#2:385\n1628#2,3:386\n1053#2:389\n1557#2:390\n1628#2,3:391\n774#2:420\n865#2:421\n866#2:424\n1188#3,2:394\n1190#3:419\n108#4:396\n80#4,22:397\n12567#5,2:422\n*S KotlinDebug\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n*L\n94#1:379\n94#1:380,2\n95#1:382,2\n256#1:384\n256#1:385\n256#1:386,3\n257#1:389\n257#1:390\n257#1:391,3\n360#1:420\n360#1:421\n360#1:424\n328#1:394,2\n328#1:419\n348#1:396\n348#1:397,22\n360#1:422,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SchemaInfoUtilKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] FTS_OPTIONS = null;

    static {
            java.lang.String r7 = "prefix="
            java.lang.String r8 = "uncompress="
            java.lang.String r0 = "tokenize="
            java.lang.String r1 = "compress="
            java.lang.String r2 = "content="
            java.lang.String r3 = "languageid="
            java.lang.String r4 = "matchinfo="
            java.lang.String r5 = "notindexed="
            java.lang.String r6 = "order="
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            androidx.room.util.SchemaInfoUtilKt.FTS_OPTIONS = r0
            return
    }

    @androidx.room.ColumnInfo.SQLiteTypeAffinity
    public static final int findAffinity(@org.jetbrains.annotations.Nullable java.lang.String r5) {
            r0 = 5
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toUpperCase(r1)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r5, r1)
            java.lang.String r1 = "INT"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.u.l3(r5, r1, r2, r3, r4)
            if (r1 == 0) goto L1c
            r5 = 3
            return r5
        L1c:
            java.lang.String r1 = "CHAR"
            boolean r1 = kotlin.text.u.l3(r5, r1, r2, r3, r4)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "CLOB"
            boolean r1 = kotlin.text.u.l3(r5, r1, r2, r3, r4)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "TEXT"
            boolean r1 = kotlin.text.u.l3(r5, r1, r2, r3, r4)
            if (r1 == 0) goto L35
            goto L5b
        L35:
            java.lang.String r1 = "BLOB"
            boolean r1 = kotlin.text.u.l3(r5, r1, r2, r3, r4)
            if (r1 == 0) goto L3e
            return r0
        L3e:
            java.lang.String r0 = "REAL"
            boolean r0 = kotlin.text.u.l3(r5, r0, r2, r3, r4)
            if (r0 != 0) goto L59
            java.lang.String r0 = "FLOA"
            boolean r0 = kotlin.text.u.l3(r5, r0, r2, r3, r4)
            if (r0 != 0) goto L59
            java.lang.String r0 = "DOUB"
            boolean r5 = kotlin.text.u.l3(r5, r0, r2, r3, r4)
            if (r5 == 0) goto L57
            goto L59
        L57:
            r5 = 1
            return r5
        L59:
            r5 = 4
            return r5
        L5b:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<java.lang.String> parseFtsOptions(@org.jetbrains.annotations.NotNull java.lang.String r14) {
            java.lang.String r0 = "createStatement"
            kotlin.jvm.internal.g0.p(r14, r0)
            int r0 = r14.length()
            if (r0 != 0) goto L10
            java.util.Set r14 = kotlin.collections.u1.k()
            return r14
        L10:
            r4 = 6
            r5 = 0
            r1 = 40
            r2 = 0
            r3 = 0
            r0 = r14
            int r14 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            r6 = 1
            int r14 = r14 + r6
            r1 = 41
            int r1 = kotlin.text.u.V3(r0, r1, r2, r3, r4, r5)
            java.lang.String r14 = r0.substring(r14, r1)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r14, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlin.collections.m r2 = new kotlin.collections.m
            r2.<init>()
            r3 = -1
            r4 = 0
            r5 = 0
            r7 = 0
        L3a:
            int r8 = r14.length()
            if (r5 >= r8) goto Lf9
            char r8 = r14.charAt(r5)
            int r9 = r7 + 1
            r10 = 34
            if (r8 == r10) goto Ld4
            r10 = 39
            if (r8 == r10) goto Ld4
            r10 = 44
            if (r8 == r10) goto L8a
            r7 = 91
            if (r8 == r7) goto L7b
            r10 = 93
            if (r8 == r10) goto L60
            r7 = 96
            if (r8 == r7) goto Ld4
            goto Lf4
        L60:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto Lf4
            java.lang.Object r8 = r2.j()
            java.lang.Character r8 = (java.lang.Character) r8
            if (r8 != 0) goto L70
            goto Lf4
        L70:
            char r8 = r8.charValue()
            if (r8 != r7) goto Lf4
            kotlin.collections.f0.Q0(r2)
            goto Lf4
        L7b:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto Lf4
            java.lang.Character r7 = java.lang.Character.valueOf(r8)
            r2.addFirst(r7)
            goto Lf4
        L8a:
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto Lf4
            int r3 = r3 + 1
            java.lang.String r3 = r14.substring(r3, r7)
            kotlin.jvm.internal.g0.o(r3, r0)
            int r8 = r3.length()
            int r8 = r8 - r6
            r10 = 0
            r11 = 0
        La0:
            if (r10 > r8) goto Lc5
            if (r11 != 0) goto La6
            r12 = r10
            goto La7
        La6:
            r12 = r8
        La7:
            char r12 = r3.charAt(r12)
            r13 = 32
            int r12 = kotlin.jvm.internal.g0.t(r12, r13)
            if (r12 > 0) goto Lb5
            r12 = 1
            goto Lb6
        Lb5:
            r12 = 0
        Lb6:
            if (r11 != 0) goto Lbf
            if (r12 != 0) goto Lbc
            r11 = 1
            goto La0
        Lbc:
            int r10 = r10 + 1
            goto La0
        Lbf:
            if (r12 != 0) goto Lc2
            goto Lc5
        Lc2:
            int r8 = r8 + (-1)
            goto La0
        Lc5:
            int r8 = r8 + 1
            java.lang.CharSequence r3 = r3.subSequence(r10, r8)
            java.lang.String r3 = r3.toString()
            r1.add(r3)
            r3 = r7
            goto Lf4
        Ld4:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto Le2
            java.lang.Character r7 = java.lang.Character.valueOf(r8)
            r2.addFirst(r7)
            goto Lf4
        Le2:
            java.lang.Object r7 = r2.j()
            java.lang.Character r7 = (java.lang.Character) r7
            if (r7 != 0) goto Leb
            goto Lf4
        Leb:
            char r7 = r7.charValue()
            if (r7 != r8) goto Lf4
            kotlin.collections.f0.Q0(r2)
        Lf4:
            int r5 = r5 + 1
            r7 = r9
            goto L3a
        Lf9:
            int r3 = r3 + r6
            java.lang.String r14 = r14.substring(r3)
            kotlin.jvm.internal.g0.o(r14, r0)
            java.lang.CharSequence r14 = kotlin.text.u.Z5(r14)
            java.lang.String r14 = r14.toString()
            r1.add(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r0 = r1.iterator()
        L115:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L139
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String[] r3 = androidx.room.util.SchemaInfoUtilKt.FTS_OPTIONS
            int r5 = r3.length
            r6 = 0
        L126:
            if (r6 >= r5) goto L115
            r7 = r3[r6]
            r8 = 2
            r9 = 0
            boolean r7 = kotlin.text.u.H2(r2, r7, r4, r8, r9)
            if (r7 == 0) goto L136
            r14.add(r1)
            goto L115
        L136:
            int r6 = r6 + 1
            goto L126
        L139:
            java.util.Set r14 = kotlin.collections.f0.f6(r14)
            return r14
    }

    private static final java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> readColumns(androidx.sqlite.SQLiteConnection r13, java.lang.String r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA table_info(`"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = "`)"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            androidx.sqlite.SQLiteStatement r13 = r13.prepare(r14)
            boolean r14 = r13.step()     // Catch: java.lang.Throwable -> L29
            r0 = 0
            if (r14 != 0) goto L2c
            java.util.Map r14 = kotlin.collections.i1.z()     // Catch: java.lang.Throwable -> L29
            kotlin.jdk7.a.c(r13, r0)
            return r14
        L29:
            r0 = move-exception
            r14 = r0
            goto L8e
        L2c:
            java.lang.String r14 = "name"
            int r14 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r13, r14)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "type"
            int r1 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r13, r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "notnull"
            int r2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r13, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "pk"
            int r3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r13, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "dflt_value"
            int r4 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r13, r4)     // Catch: java.lang.Throwable -> L29
            java.util.Map r5 = kotlin.collections.i1.g()     // Catch: java.lang.Throwable -> L29
        L4e:
            java.lang.String r7 = r13.getText(r14)     // Catch: java.lang.Throwable -> L29
            java.lang.String r8 = r13.getText(r1)     // Catch: java.lang.Throwable -> L29
            long r9 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L29
            r11 = 0
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L63
            r6 = 1
            r9 = 1
            goto L65
        L63:
            r6 = 0
            r9 = 0
        L65:
            long r10 = r13.getLong(r3)     // Catch: java.lang.Throwable -> L29
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L29
            boolean r6 = r13.isNull(r4)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L72
            r11 = r0
            goto L77
        L72:
            java.lang.String r6 = r13.getText(r4)     // Catch: java.lang.Throwable -> L29
            r11 = r6
        L77:
            androidx.room.util.TableInfo$Column r6 = new androidx.room.util.TableInfo$Column     // Catch: java.lang.Throwable -> L29
            r12 = 2
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L29
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L29
            boolean r6 = r13.step()     // Catch: java.lang.Throwable -> L29
            if (r6 != 0) goto L4e
            java.util.Map r14 = kotlin.collections.i1.d(r5)     // Catch: java.lang.Throwable -> L29
            kotlin.jdk7.a.c(r13, r0)
            return r14
        L8e:
            throw r14     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            kotlin.jdk7.a.c(r13, r14)
            throw r0
    }

    private static final java.util.List<androidx.room.util.ForeignKeyWithSequence> readForeignKeyFieldMappings(androidx.sqlite.SQLiteStatement r10) {
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r10, r0)
            java.lang.String r1 = "seq"
            int r1 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r10, r1)
            java.lang.String r2 = "from"
            int r2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r10, r2)
            java.lang.String r3 = "to"
            int r3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r10, r3)
            java.util.List r4 = kotlin.collections.f0.j()
        L1c:
            boolean r5 = r10.step()
            if (r5 == 0) goto L3d
            androidx.room.util.ForeignKeyWithSequence r5 = new androidx.room.util.ForeignKeyWithSequence
            long r6 = r10.getLong(r0)
            int r7 = (int) r6
            long r8 = r10.getLong(r1)
            int r6 = (int) r8
            java.lang.String r8 = r10.getText(r2)
            java.lang.String r9 = r10.getText(r3)
            r5.<init>(r7, r6, r8, r9)
            r4.add(r5)
            goto L1c
        L3d:
            java.util.List r10 = kotlin.collections.f0.b(r4)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = kotlin.collections.f0.v5(r10)
            return r10
    }

    private static final java.util.Set<androidx.room.util.TableInfo.ForeignKey> readForeignKeys(androidx.sqlite.SQLiteConnection r14, java.lang.String r15) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_list(`"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = "`)"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            androidx.sqlite.SQLiteStatement r14 = r14.prepare(r15)
            java.lang.String r15 = "id"
            int r15 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r14, r15)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "seq"
            int r0 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r14, r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "table"
            int r1 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r14, r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "on_delete"
            int r2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r14, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "on_update"
            int r3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r14, r3)     // Catch: java.lang.Throwable -> L86
            java.util.List r4 = readForeignKeyFieldMappings(r14)     // Catch: java.lang.Throwable -> L86
            r14.reset()     // Catch: java.lang.Throwable -> L86
            java.util.Set r5 = kotlin.collections.u1.d()     // Catch: java.lang.Throwable -> L86
        L43:
            boolean r6 = r14.step()     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto Lbd
            long r6 = r14.getLong(r0)     // Catch: java.lang.Throwable -> L86
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L54
            goto L43
        L54:
            long r6 = r14.getLong(r15)     // Catch: java.lang.Throwable -> L86
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r12.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r13.<init>()     // Catch: java.lang.Throwable -> L86
            r6 = r4
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r8.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L86
        L6f:
            boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto L89
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L86
            r10 = r9
            androidx.room.util.ForeignKeyWithSequence r10 = (androidx.room.util.ForeignKeyWithSequence) r10     // Catch: java.lang.Throwable -> L86
            int r10 = r10.getId()     // Catch: java.lang.Throwable -> L86
            if (r10 != r7) goto L6f
            r8.add(r9)     // Catch: java.lang.Throwable -> L86
            goto L6f
        L86:
            r0 = move-exception
            r15 = r0
            goto Lc6
        L89:
            java.util.Iterator r6 = r8.iterator()     // Catch: java.lang.Throwable -> L86
        L8d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto La8
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L86
            androidx.room.util.ForeignKeyWithSequence r7 = (androidx.room.util.ForeignKeyWithSequence) r7     // Catch: java.lang.Throwable -> L86
            java.lang.String r8 = r7.getFrom()     // Catch: java.lang.Throwable -> L86
            r12.add(r8)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r7.getTo()     // Catch: java.lang.Throwable -> L86
            r13.add(r7)     // Catch: java.lang.Throwable -> L86
            goto L8d
        La8:
            androidx.room.util.TableInfo$ForeignKey r8 = new androidx.room.util.TableInfo$ForeignKey     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = r14.getText(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = r14.getText(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r11 = r14.getText(r3)     // Catch: java.lang.Throwable -> L86
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L86
            r5.add(r8)     // Catch: java.lang.Throwable -> L86
            goto L43
        Lbd:
            java.util.Set r15 = kotlin.collections.u1.a(r5)     // Catch: java.lang.Throwable -> L86
            r0 = 0
            kotlin.jdk7.a.c(r14, r0)
            return r15
        Lc6:
            throw r15     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r0 = move-exception
            kotlin.jdk7.a.c(r14, r15)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<java.lang.String> readFtsColumns(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r0 = kotlin.collections.u1.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PRAGMA table_info(`"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "`)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.sqlite.SQLiteStatement r3 = r3.prepare(r4)
            boolean r4 = r3.step()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L44
            java.lang.String r4 = "name"
            int r4 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r3, r4)     // Catch: java.lang.Throwable -> L42
        L34:
            java.lang.String r1 = r3.getText(r4)     // Catch: java.lang.Throwable -> L42
            r0.add(r1)     // Catch: java.lang.Throwable -> L42
            boolean r1 = r3.step()     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L34
            goto L44
        L42:
            r4 = move-exception
            goto L4f
        L44:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L42
            r4 = 0
            kotlin.jdk7.a.c(r3, r4)
            java.util.Set r3 = kotlin.collections.u1.a(r0)
            return r3
        L4f:
            throw r4     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            kotlin.jdk7.a.c(r3, r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<java.lang.String> readFtsOptions(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM sqlite_master WHERE `name` = '"
            r0.append(r1)
            r0.append(r3)
            r3 = 39
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            androidx.sqlite.SQLiteStatement r2 = r2.prepare(r3)
            boolean r3 = r2.step()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            java.lang.String r3 = "sql"
            int r3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r2, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r2.getText(r3)     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r3 = move-exception
            goto L42
        L37:
            java.lang.String r3 = ""
        L39:
            r0 = 0
            kotlin.jdk7.a.c(r2, r0)
            java.util.Set r2 = parseFtsOptions(r3)
            return r2
        L42:
            throw r3     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = move-exception
            kotlin.jdk7.a.c(r2, r3)
            throw r0
    }

    private static final androidx.room.util.TableInfo.Index readIndex(androidx.sqlite.SQLiteConnection r16, java.lang.String r17, boolean r18) {
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PRAGMA index_xinfo(`"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "`)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r16
            androidx.sqlite.SQLiteStatement r1 = r2.prepare(r1)
            java.lang.String r2 = "seqno"
            int r2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r1, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "cid"
            int r3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r1, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "name"
            int r4 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r1, r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "desc"
            int r5 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r1, r5)     // Catch: java.lang.Throwable -> L70
            r6 = -1
            r7 = 0
            if (r2 == r6) goto Lfe
            if (r3 == r6) goto Lfe
            if (r4 == r6) goto Lfe
            if (r5 != r6) goto L42
            goto Lfe
        L42:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L70
            r6.<init>()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L70
            r8.<init>()     // Catch: java.lang.Throwable -> L70
        L4c:
            boolean r9 = r1.step()     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L85
            long r9 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L70
            int r10 = (int) r9     // Catch: java.lang.Throwable -> L70
            if (r10 >= 0) goto L5a
            goto L4c
        L5a:
            long r9 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L70
            int r10 = (int) r9     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = r1.getText(r4)     // Catch: java.lang.Throwable -> L70
            long r11 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L70
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L74
            java.lang.String r11 = "DESC"
            goto L76
        L70:
            r0 = move-exception
            r2 = r0
            goto L102
        L74:
            java.lang.String r11 = "ASC"
        L76:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L70
            r6.put(r12, r9)     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L70
            r8.put(r9, r11)     // Catch: java.lang.Throwable -> L70
            goto L4c
        L85:
            java.util.Set r2 = r6.entrySet()     // Catch: java.lang.Throwable -> L70
            androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1 r3 = new androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L70
            java.util.List r2 = kotlin.collections.f0.z5(r2, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r4 = 10
            int r5 = kotlin.collections.f0.d0(r2, r4)     // Catch: java.lang.Throwable -> L70
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L70
        La3:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L70
            r3.add(r5)     // Catch: java.lang.Throwable -> L70
            goto La3
        Lb9:
            java.util.List r2 = kotlin.collections.f0.a6(r3)     // Catch: java.lang.Throwable -> L70
            java.util.Set r3 = r8.entrySet()     // Catch: java.lang.Throwable -> L70
            androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2 r5 = new androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            java.util.List r3 = kotlin.collections.f0.z5(r3, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            int r4 = kotlin.collections.f0.d0(r3, r4)     // Catch: java.lang.Throwable -> L70
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L70
        Ld9:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto Lef
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L70
            r5.add(r4)     // Catch: java.lang.Throwable -> L70
            goto Ld9
        Lef:
            java.util.List r3 = kotlin.collections.f0.a6(r5)     // Catch: java.lang.Throwable -> L70
            androidx.room.util.TableInfo$Index r4 = new androidx.room.util.TableInfo$Index     // Catch: java.lang.Throwable -> L70
            r5 = r18
            r4.<init>(r0, r5, r2, r3)     // Catch: java.lang.Throwable -> L70
            kotlin.jdk7.a.c(r1, r7)
            return r4
        Lfe:
            kotlin.jdk7.a.c(r1, r7)
            return r7
        L102:
            throw r2     // Catch: java.lang.Throwable -> L103
        L103:
            r0 = move-exception
            kotlin.jdk7.a.c(r1, r2)
            throw r0
    }

    private static final java.util.Set<androidx.room.util.TableInfo.Index> readIndices(androidx.sqlite.SQLiteConnection r11, java.lang.String r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA index_list(`"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "`)"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            androidx.sqlite.SQLiteStatement r12 = r11.prepare(r12)
            java.lang.String r0 = "name"
            int r0 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r12, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "origin"
            int r1 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r12, r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "unique"
            int r2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r12, r2)     // Catch: java.lang.Throwable -> L6b
            r3 = -1
            r4 = 0
            if (r0 == r3) goto L75
            if (r1 == r3) goto L75
            if (r2 != r3) goto L35
            goto L75
        L35:
            java.util.Set r3 = kotlin.collections.u1.d()     // Catch: java.lang.Throwable -> L6b
        L39:
            boolean r5 = r12.step()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L6d
            java.lang.String r5 = r12.getText(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = "c"
            boolean r5 = kotlin.jvm.internal.g0.g(r6, r5)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L4c
            goto L39
        L4c:
            java.lang.String r5 = r12.getText(r0)     // Catch: java.lang.Throwable -> L6b
            long r6 = r12.getLong(r2)     // Catch: java.lang.Throwable -> L6b
            r8 = 1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L5c
            r6 = 1
            goto L5d
        L5c:
            r6 = 0
        L5d:
            androidx.room.util.TableInfo$Index r5 = readIndex(r11, r5, r6)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L67
            kotlin.jdk7.a.c(r12, r4)
            return r4
        L67:
            r3.add(r5)     // Catch: java.lang.Throwable -> L6b
            goto L39
        L6b:
            r11 = move-exception
            goto L79
        L6d:
            java.util.Set r11 = kotlin.collections.u1.a(r3)     // Catch: java.lang.Throwable -> L6b
            kotlin.jdk7.a.c(r12, r4)
            return r11
        L75:
            kotlin.jdk7.a.c(r12, r4)
            return r4
        L79:
            throw r11     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            kotlin.jdk7.a.c(r12, r11)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.TableInfo readTableInfo(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Map r0 = readColumns(r3, r4)
            java.util.Set r1 = readForeignKeys(r3, r4)
            java.util.Set r3 = readIndices(r3, r4)
            androidx.room.util.TableInfo r2 = new androidx.room.util.TableInfo
            r2.<init>(r4, r0, r1, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.ViewInfo readViewInfo(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "viewName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '"
            r0.append(r1)
            r0.append(r4)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.sqlite.SQLiteStatement r3 = r3.prepare(r0)
            boolean r0 = r3.step()     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r0 == 0) goto L3e
            androidx.room.util.ViewInfo r4 = new androidx.room.util.ViewInfo     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            java.lang.String r0 = r3.getText(r0)     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            java.lang.String r2 = r3.getText(r2)     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3c
            goto L44
        L3c:
            r4 = move-exception
            goto L48
        L3e:
            androidx.room.util.ViewInfo r0 = new androidx.room.util.ViewInfo     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L3c
            r4 = r0
        L44:
            kotlin.jdk7.a.c(r3, r1)
            return r4
        L48:
            throw r4     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            kotlin.jdk7.a.c(r3, r4)
            throw r0
    }
}
