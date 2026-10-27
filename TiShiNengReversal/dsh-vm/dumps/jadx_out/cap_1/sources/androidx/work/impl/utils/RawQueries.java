package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RawQueries {
    private RawQueries() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void bindings(@androidx.annotation.NonNull java.lang.StringBuilder r3, int r4) {
            if (r4 > 0) goto L3
            goto L16
        L3:
            java.lang.String r0 = "?"
            r3.append(r0)
            r1 = 1
        L9:
            if (r1 >= r4) goto L16
            java.lang.String r2 = ","
            r3.append(r2)
            r3.append(r0)
            int r1 = r1 + 1
            goto L9
        L16:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.sqlite.db.SupportSQLiteQuery workQueryToRawQuery(@androidx.annotation.NonNull androidx.work.WorkQuery r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT * FROM workspec"
            r1.<init>(r2)
            java.util.List r2 = r9.getStates()
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = ")"
            java.lang.String r5 = " AND"
            java.lang.String r6 = " WHERE"
            if (r3 != 0) goto L57
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r2.size()
            r3.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L41
            java.lang.Object r7 = r2.next()
            androidx.work.WorkInfo$State r7 = (androidx.work.WorkInfo.State) r7
            int r7 = androidx.work.impl.model.WorkTypeConverters.stateToInt(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.add(r7)
            goto L29
        L41:
            r1.append(r6)
            java.lang.String r2 = " state IN ("
            r1.append(r2)
            int r2 = r3.size()
            bindings(r1, r2)
            r1.append(r4)
            r0.addAll(r3)
            r6 = r5
        L57:
            java.util.List r2 = r9.getIds()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L98
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r2.size()
            r3.<init>(r7)
            java.util.Iterator r7 = r2.iterator()
        L6e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r7.next()
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.String r8 = r8.toString()
            r3.add(r8)
            goto L6e
        L82:
            r1.append(r6)
            java.lang.String r6 = " id IN ("
            r1.append(r6)
            int r2 = r2.size()
            bindings(r1, r2)
            r1.append(r4)
            r0.addAll(r3)
            r6 = r5
        L98:
            java.util.List r2 = r9.getTags()
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "))"
            if (r3 != 0) goto Lba
            r1.append(r6)
            java.lang.String r3 = " id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("
            r1.append(r3)
            int r3 = r2.size()
            bindings(r1, r3)
            r1.append(r4)
            r0.addAll(r2)
            goto Lbb
        Lba:
            r5 = r6
        Lbb:
            java.util.List r9 = r9.getUniqueWorkNames()
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lda
            r1.append(r5)
            java.lang.String r2 = " id IN (SELECT work_spec_id FROM workname WHERE name IN ("
            r1.append(r2)
            int r2 = r9.size()
            bindings(r1, r2)
            r1.append(r4)
            r0.addAll(r9)
        Lda:
            java.lang.String r9 = ";"
            r1.append(r9)
            androidx.sqlite.db.SimpleSQLiteQuery r9 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r0 = r0.toArray()
            r9.<init>(r1, r0)
            return r9
    }
}
