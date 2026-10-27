package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
/* synthetic */ class RoomDatabase$closeBarrier$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.n1> {
    RoomDatabase$closeBarrier$1(java.lang.Object r8) {
            r7 = this;
            java.lang.String r5 = "onClosed()V"
            r6 = 0
            r1 = 0
            java.lang.Class<androidx.room.RoomDatabase> r3 = androidx.room.RoomDatabase.class
            java.lang.String r4 = "onClosed"
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            r1.m79invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m79invoke() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
            androidx.room.RoomDatabase.access$onClosed(r0)
            return
    }
}
