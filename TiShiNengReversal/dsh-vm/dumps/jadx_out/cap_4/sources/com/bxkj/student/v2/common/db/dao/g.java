package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface g {
    @androidx.room.Query("DELETE FROM face")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r1);

    @androidx.room.Query("SELECT * FROM face WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.b>> r2);

    @androidx.room.Query("DELETE FROM face WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object deleteByIdentify(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    java.lang.Object insert(@org.jetbrains.annotations.NotNull l0.b r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);
}
