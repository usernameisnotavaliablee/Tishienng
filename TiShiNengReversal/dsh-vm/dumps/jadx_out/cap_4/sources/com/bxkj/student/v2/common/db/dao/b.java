package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.db.dao.b r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super l0.a> r1) {
                java.lang.Object r0 = com.bxkj.student.v2.common.db.dao.a.d(r0, r1)
                return r0
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object b(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.db.dao.b r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
                java.lang.Object r0 = com.bxkj.student.v2.common.db.dao.a.e(r0, r1, r2)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                if (r0 != r1) goto Lb
                return r0
            Lb:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object c(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.db.dao.b r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
                java.lang.Object r0 = com.bxkj.student.v2.common.db.dao.a.f(r0, r1, r2)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                if (r0 != r1) goto Lb
                return r0
            Lb:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }
    }

    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("SELECT * FROM environment WHERE deviceId = :deviceId ")
    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.a>> r2);

    @androidx.room.Query("UPDATE environment SET oppo = :oppo WHERE deviceId = :deviceId")
    @org.jetbrains.annotations.Nullable
    java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r3);

    @androidx.room.Query("UPDATE environment SET safe = :safe WHERE deviceId = :deviceId")
    @org.jetbrains.annotations.Nullable
    java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r3);

    @org.jetbrains.annotations.Nullable
    java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @org.jetbrains.annotations.Nullable
    java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super l0.a> r1);

    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    java.lang.Object insert(@org.jetbrains.annotations.NotNull l0.a r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);
}
