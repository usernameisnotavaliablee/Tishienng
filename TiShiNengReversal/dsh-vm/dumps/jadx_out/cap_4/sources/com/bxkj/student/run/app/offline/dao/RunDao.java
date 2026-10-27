package com.bxkj.student.run.app.offline.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface RunDao {
    @androidx.room.Query("DELETE FROM runDb WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object deleteByIdentify(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    java.lang.Object deleteSports(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("SELECT * FROM runDb WHERE userNumber = :userNumber AND uploadType =='-1'")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getExceptionSports(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2);

    @androidx.room.Query("SELECT * FROM runDb WHERE identify = :identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getLocalRecordById(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2);

    @androidx.room.Query("SELECT * FROM runDb WHERE userNumber = :userNumber AND uploadType !='-1'")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getUploadFailSports(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2);

    @androidx.room.Query("SELECT * FROM runDb WHERE userNumber = :userNumber AND uploadType !='-1' AND sportsType=:sportsType")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getUploadFailSportsByType(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r3);

    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    java.lang.Object insertRun(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb[] r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("UPDATE runDb SET endTime=:endTime,uploadType=:uploadType WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object updateSports(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4);
}
