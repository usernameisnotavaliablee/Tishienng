package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomRawQuery {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<androidx.sqlite.SQLiteStatement, kotlin.n1> bindingFunction;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sql;

    @kotlin.jvm.JvmOverloads
    public RoomRawQuery(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public RoomRawQuery(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteStatement, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "onBindStatement"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.sql = r2
            androidx.room.p r2 = new androidx.room.p
            r2.<init>(r3)
            r1.bindingFunction = r2
            return
    }

    public /* synthetic */ RoomRawQuery(java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L9
            androidx.room.q r2 = new androidx.room.q
            r2.<init>()
        L9:
            r0.<init>(r1, r2)
            return
    }

    private static final kotlin.n1 _init_$lambda$0(androidx.sqlite.SQLiteStatement r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 a(androidx.sqlite.SQLiteStatement r0) {
            kotlin.n1 r0 = _init_$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(kotlin.jvm.functions.Function1 r0, androidx.sqlite.SQLiteStatement r1) {
            kotlin.n1 r0 = bindingFunction$lambda$1(r0, r1)
            return r0
    }

    private static final kotlin.n1 bindingFunction$lambda$1(kotlin.jvm.functions.Function1 r1, androidx.sqlite.SQLiteStatement r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.BindOnlySQLiteStatement r0 = new androidx.room.BindOnlySQLiteStatement
            r0.<init>(r2)
            r1.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<androidx.sqlite.SQLiteStatement, kotlin.n1> getBindingFunction() {
            r1 = this;
            kotlin.jvm.functions.Function1<androidx.sqlite.SQLiteStatement, kotlin.n1> r0 = r1.bindingFunction
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSql() {
            r1 = this;
            java.lang.String r0 = r1.sql
            return r0
    }
}
