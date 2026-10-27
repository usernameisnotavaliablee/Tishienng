package l0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"userId", "type"})}, primaryKeys = {"userId", "type"}, tableName = "sports_set")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {

    @androidx.room.ColumnInfo(name = "userId", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String a;

    @androidx.room.ColumnInfo(name = "type", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @androidx.room.ColumnInfo(name = "content", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String c;

    public e(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "userId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "getSetting"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public static /* synthetic */ l0.e e(l0.e r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.c
        L12:
            l0.e r0 = r0.d(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final l0.e d(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "userId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "getSetting"
            kotlin.jvm.internal.g0.p(r4, r0)
            l0.e r0 = new l0.e
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof l0.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l0.e r5 = (l0.e) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r5 = r5.c
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public final void h(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final void i(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.a
            java.lang.String r1 = r5.b
            java.lang.String r2 = r5.c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SportsSetDb(userId="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", type="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", getSetting="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
