package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = androidx.room.util.SQLiteStatementUtil.columnIndexOfCommon(r2, r3)
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
            int r0 = androidx.room.util.SQLiteStatementUtil.columnIndexOfCommon(r2, r0)
            if (r0 < 0) goto L2c
            return r0
        L2c:
            int r2 = findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(r2, r3)
            return r2
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(androidx.sqlite.SQLiteStatement r11, java.lang.String r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r2 = -1
            if (r0 > r1) goto L63
            int r0 = r12.length()
            if (r0 != 0) goto Le
            goto L63
        Le:
            int r0 = r11.getColumnCount()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 46
            r1.append(r3)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r12)
            r3 = 96
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r5 = 0
            r6 = 0
        L39:
            if (r6 >= r0) goto L63
            java.lang.String r7 = r11.getColumnName(r6)
            int r8 = r7.length()
            int r9 = r12.length()
            r10 = 2
            int r9 = r9 + r10
            if (r8 < r9) goto L60
            r8 = 0
            boolean r9 = kotlin.text.u.Z1(r7, r1, r5, r10, r8)
            if (r9 == 0) goto L53
            goto L5f
        L53:
            char r9 = r7.charAt(r5)
            if (r9 != r3) goto L60
            boolean r7 = kotlin.text.u.Z1(r7, r4, r5, r10, r8)
            if (r7 == 0) goto L60
        L5f:
            return r6
        L60:
            int r6 = r6 + 1
            goto L39
        L63:
            return r2
    }
}
