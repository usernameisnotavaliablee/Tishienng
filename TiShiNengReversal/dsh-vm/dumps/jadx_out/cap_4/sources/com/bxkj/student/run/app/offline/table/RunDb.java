package com.bxkj.student.run.app.offline.table;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(tableName = "runDb")
@kotlinx.parcelize.Parcelize
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class RunDb implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.bxkj.student.run.app.offline.table.RunDb> CREATOR = null;

    @androidx.room.ColumnInfo(name = "countTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String countTime;

    @androidx.room.ColumnInfo(name = "distance", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String distance;

    @androidx.room.ColumnInfo(name = "endTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String endTime;

    @androidx.room.ColumnInfo(name = "faceDetectCount", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String faceDetectCount;

    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "identify", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String identify;

    @androidx.room.ColumnInfo(name = "isFaceOut", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String isFaceOut;

    @androidx.room.ColumnInfo(name = "latLngList", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String latLngList;

    @androidx.room.ColumnInfo(name = "passLatLngList", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String passLatLngList;

    @androidx.room.ColumnInfo(name = "sportsSet", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String sportsSet;

    @androidx.room.ColumnInfo(name = "sportsType", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String sportsType;

    @androidx.room.ColumnInfo(name = "startTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String startTime;

    @androidx.room.ColumnInfo(name = "stepList", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String stepList;

    @androidx.room.ColumnInfo(name = "uploadType", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String uploadType;

    @androidx.room.ColumnInfo(name = "userNumber", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String userNumber;

    @androidx.room.ColumnInfo(name = "points", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String userPassPointList;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Creator implements android.os.Parcelable.Creator<com.bxkj.student.run.app.offline.table.RunDb> {
        public Creator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.bxkj.student.run.app.offline.table.RunDb createFromParcel(android.os.Parcel r18) {
                r17 = this;
                java.lang.String r0 = "parcel"
                r1 = r18
                kotlin.jvm.internal.g0.p(r1, r0)
                com.bxkj.student.run.app.offline.table.RunDb r1 = new com.bxkj.student.run.app.offline.table.RunDb
                java.lang.String r2 = r18.readString()
                java.lang.String r3 = r18.readString()
                java.lang.String r4 = r18.readString()
                java.lang.String r5 = r18.readString()
                java.lang.String r6 = r18.readString()
                java.lang.String r7 = r18.readString()
                java.lang.String r8 = r18.readString()
                java.lang.String r9 = r18.readString()
                java.lang.String r10 = r18.readString()
                java.lang.String r11 = r18.readString()
                java.lang.String r12 = r18.readString()
                java.lang.String r13 = r18.readString()
                java.lang.String r14 = r18.readString()
                java.lang.String r15 = r18.readString()
                java.lang.String r16 = r18.readString()
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.bxkj.student.run.app.offline.table.RunDb r1 = r0.createFromParcel(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.bxkj.student.run.app.offline.table.RunDb[] newArray(int r1) {
                r0 = this;
                com.bxkj.student.run.app.offline.table.RunDb[] r1 = new com.bxkj.student.run.app.offline.table.RunDb[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb[] newArray(int r1) {
                r0 = this;
                com.bxkj.student.run.app.offline.table.RunDb[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            com.bxkj.student.run.app.offline.table.RunDb$Creator r0 = new com.bxkj.student.run.app.offline.table.RunDb$Creator
            r0.<init>()
            com.bxkj.student.run.app.offline.table.RunDb.CREATOR = r0
            return
    }

    public RunDb(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31) {
            r16 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "userNumber"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sportsType"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "sportsSet"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "startTime"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "endTime"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "countTime"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "distance"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "latLngList"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "stepList"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "passLatLngList"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "userPassPointList"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "isFaceOut"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "faceDetectCount"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "uploadType"
            kotlin.jvm.internal.g0.p(r15, r0)
            r16.<init>()
            r0 = r16
            r0.identify = r1
            r0.userNumber = r2
            r0.sportsType = r3
            r0.sportsSet = r4
            r0.startTime = r5
            r0.endTime = r6
            r0.countTime = r7
            r0.distance = r8
            r0.latLngList = r9
            r0.stepList = r10
            r0.passLatLngList = r11
            r0.userPassPointList = r12
            r0.isFaceOut = r13
            r0.faceDetectCount = r14
            r0.uploadType = r15
            return
    }

    public /* synthetic */ RunDb(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, kotlin.jvm.internal.v r36) {
            r19 = this;
            r0 = r35
            r1 = r0 & 64
            java.lang.String r2 = "0"
            if (r1 == 0) goto La
            r10 = r2
            goto Lc
        La:
            r10 = r26
        Lc:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2e
            r11 = r2
        L11:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r18 = r34
            goto L31
        L2e:
            r11 = r27
            goto L11
        L31:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
    }

    public static /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb copy$default(com.bxkj.student.run.app.offline.table.RunDb r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.Object r33) {
            r0 = r16
            r1 = r32
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            java.lang.String r2 = r0.identify
            goto Ld
        Lb:
            r2 = r17
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            java.lang.String r3 = r0.userNumber
            goto L16
        L14:
            r3 = r18
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            java.lang.String r4 = r0.sportsType
            goto L1f
        L1d:
            r4 = r19
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            java.lang.String r5 = r0.sportsSet
            goto L28
        L26:
            r5 = r20
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            java.lang.String r6 = r0.startTime
            goto L31
        L2f:
            r6 = r21
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            java.lang.String r7 = r0.endTime
            goto L3a
        L38:
            r7 = r22
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            java.lang.String r8 = r0.countTime
            goto L43
        L41:
            r8 = r23
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            java.lang.String r9 = r0.distance
            goto L4c
        L4a:
            r9 = r24
        L4c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L53
            java.lang.String r10 = r0.latLngList
            goto L55
        L53:
            r10 = r25
        L55:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5c
            java.lang.String r11 = r0.stepList
            goto L5e
        L5c:
            r11 = r26
        L5e:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L65
            java.lang.String r12 = r0.passLatLngList
            goto L67
        L65:
            r12 = r27
        L67:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L6e
            java.lang.String r13 = r0.userPassPointList
            goto L70
        L6e:
            r13 = r28
        L70:
            r14 = r1 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L77
            java.lang.String r14 = r0.isFaceOut
            goto L79
        L77:
            r14 = r29
        L79:
            r15 = r1 & 8192(0x2000, float:1.148E-41)
            if (r15 == 0) goto L80
            java.lang.String r15 = r0.faceDetectCount
            goto L82
        L80:
            r15 = r30
        L82:
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto La9
            java.lang.String r1 = r0.uploadType
            r32 = r1
        L8a:
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            goto Lac
        La9:
            r32 = r31
            goto L8a
        Lac:
            com.bxkj.student.run.app.offline.table.RunDb r0 = r17.copy(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.identify
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
            r1 = this;
            java.lang.String r0 = r1.stepList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
            r1 = this;
            java.lang.String r0 = r1.passLatLngList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
            r1 = this;
            java.lang.String r0 = r1.userPassPointList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
            r1 = this;
            java.lang.String r0 = r1.isFaceOut
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
            r1 = this;
            java.lang.String r0 = r1.faceDetectCount
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
            r1 = this;
            java.lang.String r0 = r1.uploadType
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.userNumber
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.sportsType
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.sportsSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.startTime
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.endTime
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.countTime
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.distance
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.latLngList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.run.app.offline.table.RunDb copy(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32) {
            r17 = this;
            java.lang.String r0 = "identify"
            r2 = r18
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "userNumber"
            r3 = r19
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "sportsType"
            r4 = r20
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "sportsSet"
            r5 = r21
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "startTime"
            r6 = r22
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "endTime"
            r7 = r23
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "countTime"
            r8 = r24
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "distance"
            r9 = r25
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "latLngList"
            r10 = r26
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "stepList"
            r11 = r27
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "passLatLngList"
            r12 = r28
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "userPassPointList"
            r13 = r29
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "isFaceOut"
            r14 = r30
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "faceDetectCount"
            r15 = r31
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "uploadType"
            r1 = r32
            kotlin.jvm.internal.g0.p(r1, r0)
            com.bxkj.student.run.app.offline.table.RunDb r1 = new com.bxkj.student.run.app.offline.table.RunDb
            r16 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.bxkj.student.run.app.offline.table.RunDb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.bxkj.student.run.app.offline.table.RunDb r5 = (com.bxkj.student.run.app.offline.table.RunDb) r5
            java.lang.String r1 = r4.identify
            java.lang.String r3 = r5.identify
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.userNumber
            java.lang.String r3 = r5.userNumber
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.sportsType
            java.lang.String r3 = r5.sportsType
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.sportsSet
            java.lang.String r3 = r5.sportsSet
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.startTime
            java.lang.String r3 = r5.startTime
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.endTime
            java.lang.String r3 = r5.endTime
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.countTime
            java.lang.String r3 = r5.countTime
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.distance
            java.lang.String r3 = r5.distance
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r4.latLngList
            java.lang.String r3 = r5.latLngList
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.stepList
            java.lang.String r3 = r5.stepList
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            java.lang.String r1 = r4.passLatLngList
            java.lang.String r3 = r5.passLatLngList
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L85
            return r2
        L85:
            java.lang.String r1 = r4.userPassPointList
            java.lang.String r3 = r5.userPassPointList
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L90
            return r2
        L90:
            java.lang.String r1 = r4.isFaceOut
            java.lang.String r3 = r5.isFaceOut
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L9b
            return r2
        L9b:
            java.lang.String r1 = r4.faceDetectCount
            java.lang.String r3 = r5.faceDetectCount
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto La6
            return r2
        La6:
            java.lang.String r1 = r4.uploadType
            java.lang.String r5 = r5.uploadType
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto Lb1
            return r2
        Lb1:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountTime() {
            r1 = this;
            java.lang.String r0 = r1.countTime
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistance() {
            r1 = this;
            java.lang.String r0 = r1.distance
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEndTime() {
            r1 = this;
            java.lang.String r0 = r1.endTime
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFaceDetectCount() {
            r1 = this;
            java.lang.String r0 = r1.faceDetectCount
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdentify() {
            r1 = this;
            java.lang.String r0 = r1.identify
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLatLngList() {
            r1 = this;
            java.lang.String r0 = r1.latLngList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassLatLngList() {
            r1 = this;
            java.lang.String r0 = r1.passLatLngList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSportsSet() {
            r1 = this;
            java.lang.String r0 = r1.sportsSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSportsType() {
            r1 = this;
            java.lang.String r0 = r1.sportsType
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartTime() {
            r1 = this;
            java.lang.String r0 = r1.startTime
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStepList() {
            r1 = this;
            java.lang.String r0 = r1.stepList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUploadType() {
            r1 = this;
            java.lang.String r0 = r1.uploadType
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserNumber() {
            r1 = this;
            java.lang.String r0 = r1.userNumber
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserPassPointList() {
            r1 = this;
            java.lang.String r0 = r1.userPassPointList
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.identify
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.userNumber
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.sportsType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.sportsSet
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.startTime
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.endTime
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.countTime
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.distance
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.latLngList
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.stepList
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.passLatLngList
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.userPassPointList
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.isFaceOut
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.faceDetectCount
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.uploadType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String isFaceOut() {
            r1 = this;
            java.lang.String r0 = r1.isFaceOut
            return r0
    }

    public final void setCountTime(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.countTime = r2
            return
    }

    public final void setDistance(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.distance = r2
            return
    }

    public final void setEndTime(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.endTime = r2
            return
    }

    public final void setFaceDetectCount(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.faceDetectCount = r2
            return
    }

    public final void setFaceOut(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.isFaceOut = r2
            return
    }

    public final void setIdentify(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.identify = r2
            return
    }

    public final void setLatLngList(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.latLngList = r2
            return
    }

    public final void setPassLatLngList(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.passLatLngList = r2
            return
    }

    public final void setSportsSet(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.sportsSet = r2
            return
    }

    public final void setSportsType(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.sportsType = r2
            return
    }

    public final void setStartTime(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.startTime = r2
            return
    }

    public final void setStepList(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.stepList = r2
            return
    }

    public final void setUploadType(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.uploadType = r2
            return
    }

    public final void setUserNumber(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.userNumber = r2
            return
    }

    public final void setUserPassPointList(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.userPassPointList = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = r0.identify
            java.lang.String r2 = r0.userNumber
            java.lang.String r3 = r0.sportsType
            java.lang.String r4 = r0.sportsSet
            java.lang.String r5 = r0.startTime
            java.lang.String r6 = r0.endTime
            java.lang.String r7 = r0.countTime
            java.lang.String r8 = r0.distance
            java.lang.String r9 = r0.latLngList
            java.lang.String r10 = r0.stepList
            java.lang.String r11 = r0.passLatLngList
            java.lang.String r12 = r0.userPassPointList
            java.lang.String r13 = r0.isFaceOut
            java.lang.String r14 = r0.faceDetectCount
            java.lang.String r15 = r0.uploadType
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r16 = r15
            java.lang.String r15 = "RunDb(identify="
            r0.append(r15)
            r0.append(r1)
            java.lang.String r1 = ", userNumber="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", sportsType="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", sportsSet="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", startTime="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", endTime="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", countTime="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", distance="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", latLngList="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", stepList="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", passLatLngList="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", userPassPointList="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", isFaceOut="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", faceDetectCount="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", uploadType="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = "dest"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r2 = r0.identify
            r1.writeString(r2)
            java.lang.String r2 = r0.userNumber
            r1.writeString(r2)
            java.lang.String r2 = r0.sportsType
            r1.writeString(r2)
            java.lang.String r2 = r0.sportsSet
            r1.writeString(r2)
            java.lang.String r2 = r0.startTime
            r1.writeString(r2)
            java.lang.String r2 = r0.endTime
            r1.writeString(r2)
            java.lang.String r2 = r0.countTime
            r1.writeString(r2)
            java.lang.String r2 = r0.distance
            r1.writeString(r2)
            java.lang.String r2 = r0.latLngList
            r1.writeString(r2)
            java.lang.String r2 = r0.stepList
            r1.writeString(r2)
            java.lang.String r2 = r0.passLatLngList
            r1.writeString(r2)
            java.lang.String r2 = r0.userPassPointList
            r1.writeString(r2)
            java.lang.String r2 = r0.isFaceOut
            r1.writeString(r2)
            java.lang.String r2 = r0.faceDetectCount
            r1.writeString(r2)
            java.lang.String r2 = r0.uploadType
            r1.writeString(r2)
            return
    }
}
