package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.JvmName(name = "CursorUtil")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCursorUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n146#1:178\n13467#2,3:179\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:178\n128#1:179,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CursorUtil {
    @org.jetbrains.annotations.NotNull
    public static final android.database.Cursor copyAndClose(@org.jetbrains.annotations.NotNull android.database.Cursor r9) {
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r9, r0)
            r0 = r9
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L45
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch: java.lang.Throwable -> L45
            java.lang.String[] r3 = r1.getColumnNames()     // Catch: java.lang.Throwable -> L45
            int r4 = r1.getCount()     // Catch: java.lang.Throwable -> L45
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L45
        L18:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L45
            r4 = 0
            if (r3 == 0) goto L73
            int r3 = r1.getColumnCount()     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L45
            int r5 = r9.getColumnCount()     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L2a:
            if (r6 >= r5) goto L6f
            int r7 = r1.getType(r6)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L6a
            r8 = 1
            if (r7 == r8) goto L5f
            r8 = 2
            if (r7 == r8) goto L54
            r8 = 3
            if (r7 == r8) goto L4d
            r8 = 4
            if (r7 != r8) goto L47
            byte[] r7 = r1.getBlob(r6)     // Catch: java.lang.Throwable -> L45
            r3[r6] = r7     // Catch: java.lang.Throwable -> L45
            goto L6c
        L45:
            r9 = move-exception
            goto L77
        L47:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            r9.<init>()     // Catch: java.lang.Throwable -> L45
            throw r9     // Catch: java.lang.Throwable -> L45
        L4d:
            java.lang.String r7 = r1.getString(r6)     // Catch: java.lang.Throwable -> L45
            r3[r6] = r7     // Catch: java.lang.Throwable -> L45
            goto L6c
        L54:
            double r7 = r1.getDouble(r6)     // Catch: java.lang.Throwable -> L45
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Throwable -> L45
            r3[r6] = r7     // Catch: java.lang.Throwable -> L45
            goto L6c
        L5f:
            long r7 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L45
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L45
            r3[r6] = r7     // Catch: java.lang.Throwable -> L45
            goto L6c
        L6a:
            r3[r6] = r4     // Catch: java.lang.Throwable -> L45
        L6c:
            int r6 = r6 + 1
            goto L2a
        L6f:
            r2.addRow(r3)     // Catch: java.lang.Throwable -> L45
            goto L18
        L73:
            kotlin.io.b.a(r0, r4)
            return r2
        L77:
            throw r9     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            kotlin.io.b.a(r0, r9)
            throw r1
    }

    private static final int findColumnIndexBySuffix(android.database.Cursor r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r2 = -1
            if (r0 <= r1) goto L8
            return r2
        L8:
            int r0 = r4.length()
            if (r0 != 0) goto Lf
            return r2
        Lf:
            java.lang.String[] r3 = r3.getColumnNames()
            kotlin.jvm.internal.g0.m(r3)
            int r3 = findColumnIndexBySuffix(r3, r4)
            return r3
    }

    @androidx.annotation.VisibleForTesting
    public static final int findColumnIndexBySuffix(@org.jetbrains.annotations.NotNull java.lang.String[] r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
            java.lang.String r0 = "columnNames"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 46
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r13)
            r1 = 96
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r3 = r12.length
            r4 = 0
            r5 = 0
            r6 = 0
        L33:
            if (r5 >= r3) goto L5e
            r7 = r12[r5]
            int r8 = r6 + 1
            int r9 = r7.length()
            int r10 = r13.length()
            r11 = 2
            int r10 = r10 + r11
            if (r9 < r10) goto L5a
            r9 = 0
            boolean r10 = kotlin.text.u.Z1(r7, r0, r4, r11, r9)
            if (r10 == 0) goto L4d
            goto L59
        L4d:
            char r10 = r7.charAt(r4)
            if (r10 != r1) goto L5a
            boolean r7 = kotlin.text.u.Z1(r7, r2, r4, r11, r9)
            if (r7 == 0) goto L5a
        L59:
            return r6
        L5a:
            int r5 = r5 + 1
            r6 = r8
            goto L33
        L5e:
            r12 = -1
            return r12
    }

    public static final int getColumnIndex(@org.jetbrains.annotations.NotNull android.database.Cursor r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.getColumnIndex(r3)
            if (r0 < 0) goto L11
            return r0
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 96
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r2.getColumnIndex(r0)
            if (r0 < 0) goto L2c
            return r0
        L2c:
            int r2 = findColumnIndexBySuffix(r2, r3)
            return r2
    }

    public static final int getColumnIndexOrThrow(@org.jetbrains.annotations.NotNull android.database.Cursor r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r11, r0)
            int r0 = getColumnIndex(r10, r11)
            if (r0 < 0) goto L11
            return r0
        L11:
            java.lang.String[] r1 = r10.getColumnNames()     // Catch: java.lang.Exception -> L28
            java.lang.String r10 = "getColumnNames(...)"
            kotlin.jvm.internal.g0.o(r1, r10)     // Catch: java.lang.Exception -> L28
            r8 = 63
            r9 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = kotlin.collections.n.Eh(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L28
            goto L2a
        L28:
            java.lang.String r10 = "unknown"
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "column '"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = "' does not exist. Available columns: "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    public static final <R> R useCursor(@org.jetbrains.annotations.NotNull android.database.Cursor r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.database.Cursor, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.d0.d(r0)
            r1 = 0
            kotlin.io.b.a(r2, r1)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L1c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            kotlin.io.b.a(r2, r3)
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.database.Cursor wrapMappedColumns(@org.jetbrains.annotations.NotNull android.database.Cursor r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3, @org.jetbrains.annotations.NotNull int[] r4) {
            java.lang.String r0 = "cursor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "columnNames"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "mapping"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            if (r0 != r1) goto L19
            androidx.room.util.CursorUtil$wrapMappedColumns$2 r0 = new androidx.room.util.CursorUtil$wrapMappedColumns$2
            r0.<init>(r2, r3, r4)
            return r0
        L19:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Expected columnNames.length == mapping.length"
            r2.<init>(r3)
            throw r2
    }
}
