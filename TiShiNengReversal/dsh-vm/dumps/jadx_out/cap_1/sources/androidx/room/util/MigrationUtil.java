package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.jvm.JvmName(name = "MigrationUtil")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MigrationUtil {
    public static final boolean contains(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r1 = r1.getMigrations()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L2c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L23
            java.util.Map r1 = kotlin.collections.i1.z()
        L23:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.containsKey(r2)
            return r1
        L2c:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.util.List<androidx.room.migration.Migration> findMigrationPath(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != r4) goto Lc
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
        Lc:
            if (r4 <= r3) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = findUpMigrationPath(r2, r1, r0, r3, r4)
            return r2
    }

    private static final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(androidx.room.RoomDatabase.MigrationContainer r5, java.util.List<androidx.room.migration.Migration> r6, boolean r7, int r8, int r9) {
        L0:
            if (r7 == 0) goto L6
            if (r8 >= r9) goto L5
            goto L8
        L5:
            return r6
        L6:
            if (r8 <= r9) goto L5c
        L8:
            if (r7 == 0) goto Lf
            kotlin.Pair r0 = r5.getSortedDescendingNodes$room_runtime_release(r8)
            goto L13
        Lf:
            kotlin.Pair r0 = r5.getSortedNodes$room_runtime_release(r8)
        L13:
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.Object r2 = r0.component1()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r0.component2()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r0.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r7 == 0) goto L40
            int r4 = r8 + 1
            if (r4 > r3) goto L27
            if (r3 > r9) goto L27
            goto L44
        L40:
            if (r9 > r3) goto L27
            if (r3 >= r8) goto L27
        L44:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r8 = r2.get(r8)
            kotlin.jvm.internal.g0.m(r8)
            r6.add(r8)
            r8 = 1
            goto L57
        L54:
            r0 = 0
            r3 = r8
            r8 = 0
        L57:
            if (r8 != 0) goto L5a
            return r1
        L5a:
            r8 = r3
            goto L0
        L5c:
            return r6
    }

    public static final boolean isMigrationRequired(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            if (r2 <= r3) goto Ld
            boolean r3 = r1.allowDestructiveMigrationOnDowngrade
            if (r3 == 0) goto Ld
            return r0
        Ld:
            java.util.Set r3 = r1.getMigrationNotRequiredFrom$room_runtime_release()
            boolean r1 = r1.requireMigration
            if (r1 == 0) goto L23
            if (r3 == 0) goto L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L23
        L21:
            r1 = 1
            return r1
        L23:
            return r0
    }
}
