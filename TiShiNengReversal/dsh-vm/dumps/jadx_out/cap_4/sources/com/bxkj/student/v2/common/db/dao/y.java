package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface y {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.db.dao.y r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
                java.lang.Object r0 = com.bxkj.student.v2.common.db.dao.x.b(r0, r1, r2, r3)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                if (r0 != r1) goto Lb
                return r0
            Lb:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }
    }

    @androidx.room.Query("UPDATE sports SET faceOutIndex=:faceOutIndex WHERE identify=:identity")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("SELECT momentIsValid FROM sports WHERE identify=:identity")
    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r2);

    @androidx.room.Query("UPDATE sports SET isValid=:isValid WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("UPDATE sports SET confirmCount=confirmCount+1 WHERE identify=:identity")
    @org.jetbrains.annotations.Nullable
    java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("DELETE FROM sports WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object deleteByIdentify(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("UPDATE sports SET isFaceOut=:isFaceOut WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("SELECT * FROM sports WHERE userNumber = :userNumber AND endTime !='' AND confirmCount==0 AND startTime BETWEEN :startTime And :endTime")
    @org.jetbrains.annotations.Nullable
    java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.String r1, long r2, long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r6);

    @androidx.room.Query("UPDATE sports SET sportsSet=:sportsSet WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("SELECT * FROM sports WHERE userNumber = :userNumber AND endTime ==''")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getExceptionSports(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r2);

    @androidx.room.Query("SELECT * FROM sports WHERE identify = :identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object getLocalRecordById(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r2);

    @androidx.room.Query("SELECT * FROM sports WHERE userNumber = :userNumber AND endTime !='' AND confirmCount==0")
    @org.jetbrains.annotations.Nullable
    java.lang.Object h(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r2);

    @androidx.room.Query("UPDATE sports SET isException=:isException,isValid=:isValid, endTime=:endTime WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object i(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5);

    @androidx.room.Query("UPDATE sports SET confirmCount=1 WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object j(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("UPDATE sports SET momentIsValid=1 WHERE identify=:identity")
    @org.jetbrains.annotations.Nullable
    java.lang.Object k(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("SELECT remarkId FROM sports WHERE identify=:identity")
    @org.jetbrains.annotations.Nullable
    java.lang.Object l(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.String> r2);

    @androidx.room.Query("SELECT faceOutIndex FROM sports WHERE identify=:identity")
    @org.jetbrains.annotations.Nullable
    java.lang.Object m(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.String> r2);

    @androidx.room.Insert(onConflict = 0)
    @org.jetbrains.annotations.Nullable
    java.lang.Object n(@org.jetbrains.annotations.NotNull l0.d[] r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @androidx.room.Query("UPDATE sports SET countTime=:countTime,distance=:distance ,gpsDistance=:gpsDistance,latLngList=:latLngList ,stepList=:stepList,passLatLngList=:passLatLngList,isFaceOut=:isFaceOut ,faceDetectCount=:faceDetectCount ,faceCheckingDistance=:faceCheckingDistance,pauseLatLng=:pauseLatLng ,isOpenDevelop=:isOpenDevelop WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object o(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r13);

    @androidx.room.Query("UPDATE sports SET endTime=:endTime WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object p(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("SELECT * FROM sports WHERE userNumber = :userNumber AND  confirmCount > 0")
    @org.jetbrains.annotations.Nullable
    java.lang.Object q(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.d>> r2);

    @org.jetbrains.annotations.Nullable
    java.lang.Object r(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);

    @androidx.room.Query("SELECT COUNT(identify) as count, sum(distance) AS distance,sum(countTime) AS time FROM sports WHERE userNumber = :userNumber AND endTime !='' AND confirmCount==0 AND startTime BETWEEN :startTime And :endTime")
    @org.jetbrains.annotations.Nullable
    java.lang.Object s(@org.jetbrains.annotations.NotNull java.lang.String r1, long r2, long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<k0.a>> r6);

    @androidx.room.Query("UPDATE sports SET uploadType=:uploadType WHERE identify=:identify")
    @org.jetbrains.annotations.Nullable
    java.lang.Object t(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);
}
