package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface l {
    @androidx.room.Query("DELETE FROM menu")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r1);

    @androidx.room.Query("UPDATE menu SET iconS=:iconS WHERE mkey=:mkey")
    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("UPDATE menu SET type=:type WHERE mkey=:mkey")
    @org.jetbrains.annotations.Nullable
    java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("DELETE  FROM menu WHERE type=:menuType")
    @org.jetbrains.annotations.Nullable
    java.lang.Object d(int r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r2);

    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    java.lang.Object e(@org.jetbrains.annotations.NotNull l0.c[] r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("SELECT * FROM menu WHERE isShowIndex='1' Order By cast(homeSort as INTEGER)")
    @org.jetbrains.annotations.Nullable
    java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r1);

    @androidx.room.Query("SELECT * FROM menu")
    @org.jetbrains.annotations.Nullable
    java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r1);

    @androidx.room.Query("DELETE FROM menu WHERE mkey=:mkey")
    @org.jetbrains.annotations.Nullable
    java.lang.Object h(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("SELECT * FROM menu WHERE mkey=:mkey")
    @org.jetbrains.annotations.Nullable
    java.lang.Object i(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r2);

    @androidx.room.Query("UPDATE menu SET icon=:icon WHERE mkey=:mkey")
    @org.jetbrains.annotations.Nullable
    java.lang.Object j(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("SELECT * FROM menu WHERE type=:menuType Order By cast(sort as INTEGER)")
    @org.jetbrains.annotations.Nullable
    java.lang.Object k(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r2);
}
