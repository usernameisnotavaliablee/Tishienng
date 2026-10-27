package com.bxkj.student.v2.ai.fitness.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.parcelize.Parcelize
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FitnessModel implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.bxkj.student.v2.ai.fitness.data.FitnessModel> CREATOR = null;

    @org.jetbrains.annotations.NotNull
    private java.lang.String a;
    private final int b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String c;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String d;
    private final boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements android.os.Parcelable.Creator<com.bxkj.student.v2.ai.fitness.data.FitnessModel> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.bxkj.student.v2.ai.fitness.data.FitnessModel a(android.os.Parcel r8) {
                r7 = this;
                java.lang.String r0 = "parcel"
                kotlin.jvm.internal.g0.p(r8, r0)
                com.bxkj.student.v2.ai.fitness.data.FitnessModel r1 = new com.bxkj.student.v2.ai.fitness.data.FitnessModel
                java.lang.String r2 = r8.readString()
                int r3 = r8.readInt()
                java.lang.String r4 = r8.readString()
                java.lang.String r5 = r8.readString()
                int r8 = r8.readInt()
                if (r8 == 0) goto L20
                r8 = 1
                r6 = 1
                goto L22
            L20:
                r8 = 0
                r6 = 0
            L22:
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
        }

        public final com.bxkj.student.v2.ai.fitness.data.FitnessModel[] b(int r1) {
                r0 = this;
                com.bxkj.student.v2.ai.fitness.data.FitnessModel[] r1 = new com.bxkj.student.v2.ai.fitness.data.FitnessModel[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.student.v2.ai.fitness.data.FitnessModel createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.bxkj.student.v2.ai.fitness.data.FitnessModel r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.student.v2.ai.fitness.data.FitnessModel[] newArray(int r1) {
                r0 = this;
                com.bxkj.student.v2.ai.fitness.data.FitnessModel[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            com.bxkj.student.v2.ai.fitness.data.FitnessModel$a r0 = new com.bxkj.student.v2.ai.fitness.data.FitnessModel$a
            r0.<init>()
            com.bxkj.student.v2.ai.fitness.data.FitnessModel.CREATOR = r0
            return
    }

    public FitnessModel(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "poseClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "poseFile"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    public /* synthetic */ FitnessModel(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto Lc
            r11 = 1
            r5 = 1
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto Le
        Lc:
            r5 = r11
            goto L6
        Le:
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean e() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public final void f(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = "dest"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            java.lang.String r2 = r0.c
            r1.writeString(r2)
            java.lang.String r2 = r0.d
            r1.writeString(r2)
            boolean r2 = r0.e
            r1.writeInt(r2)
            return
    }
}
