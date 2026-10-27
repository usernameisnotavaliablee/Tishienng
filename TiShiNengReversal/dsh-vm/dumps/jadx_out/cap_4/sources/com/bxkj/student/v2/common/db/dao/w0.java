package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface w0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.db.dao.w0 r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.String> r2) {
                java.lang.Object r0 = com.bxkj.student.v2.common.db.dao.v0.b(r0, r1, r2)
                return r0
        }
    }

    @androidx.room.Query("SELECT * FROM sports_set WHERE userId = :userId AND type =:type")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.e>> r3);

    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.String> r2);

    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    java.lang.Object insert(@org.jetbrains.annotations.NotNull l0.e r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);
}
